package com.tencent.matrix.trace.core;

/* loaded from: classes12.dex */
public class AppMethodBeat {
    public static final int METHOD_ID_DISPATCH = 1048574;
    private static final int METHOD_ID_MAX = 1048575;
    private static final int STATUS_DEFAULT = Integer.MAX_VALUE;
    private static final int STATUS_EXPIRED_START = -2;
    private static final int STATUS_OUT_RELEASE = -3;
    private static final int STATUS_READY = 1;
    private static final int STATUS_STARTED = 2;
    private static final int STATUS_STOPPED = -1;
    private static final java.lang.String TAG = "Matrix.AppMethodBeat";
    public static boolean isDev;
    private static gj.e sIndexRecordHead;
    public static gj.f sMethodEnterListener;
    private static java.lang.Runnable sUpdateDiffTimeRunnable;
    private static com.tencent.matrix.trace.core.AppMethodBeat sInstance = new com.tencent.matrix.trace.core.AppMethodBeat();
    private static volatile int status = Integer.MAX_VALUE;
    private static final java.lang.Object statusLock = new java.lang.Object();
    private static long[] sBuffer = new long[1000000];
    private static int sIndex = 0;
    private static int sLastIndex = -1;
    private static boolean assertIn = false;
    private static volatile long sCurrentDiffTime = android.os.SystemClock.uptimeMillis();
    private static volatile long sDiffTime = sCurrentDiffTime;
    private static long sMainThreadId = android.os.Looper.getMainLooper().getThread().getId();
    private static android.os.HandlerThread sTimerUpdateThread = oj.g.c("matrix_time_update_thread", 3);
    private static android.os.Handler sHandler = new android.os.Handler(sTimerUpdateThread.getLooper());
    private static java.util.Set<java.lang.String> sFocusActivitySet = new java.util.HashSet();
    private static final java.util.HashSet<jj.a> listeners = new java.util.HashSet<>();
    private static final java.lang.Object updateTimeLock = new java.lang.Object();
    private static volatile boolean isPauseUpdateTime = false;
    private static java.lang.Runnable checkStartExpiredRunnable = null;
    private static jj.d looperMonitorListener = new gj.a();
    private static java.lang.Runnable realReleaseRunnable = new gj.b();

    static {
        oj.g.a().postDelayed(realReleaseRunnable, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        sUpdateDiffTimeRunnable = new gj.c();
        sIndexRecordHead = null;
    }

    public static void at(android.app.Activity activity, boolean z17) {
        java.lang.String name = activity.getClass().getName();
        if (!z17) {
            if (sFocusActivitySet.remove(name)) {
                oj.j.c(TAG, "[at] visibleScene[%s] has %s focus!", getVisibleScene(), "detach");
            }
        } else if (sFocusActivitySet.add(name)) {
            java.util.HashSet<jj.a> hashSet = listeners;
            synchronized (hashSet) {
                java.util.Iterator<jj.a> it = hashSet.iterator();
                while (it.hasNext()) {
                    ((kj.e0) it.next()).i(activity);
                }
            }
            oj.j.c(TAG, "[at] visibleScene[%s] has %s focus!", getVisibleScene(), "attach");
        }
    }

    private static void checkPileup(int i17) {
        gj.e eVar = sIndexRecordHead;
        while (eVar != null) {
            int i18 = eVar.f272340a;
            if (i18 != i17 && (i18 != -1 || sLastIndex != 999999)) {
                return;
            }
            eVar.f272342c = false;
            oj.j.f(TAG, "[checkPileup] %s", eVar.toString());
            eVar = eVar.f272341b;
            sIndexRecordHead = eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispatchBegin() {
        sCurrentDiffTime = android.os.SystemClock.uptimeMillis() - sDiffTime;
        isPauseUpdateTime = false;
        java.lang.Object obj = updateTimeLock;
        synchronized (obj) {
            obj.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispatchEnd() {
        isPauseUpdateTime = true;
    }

    public static long getDiffTime() {
        return sDiffTime;
    }

    public static com.tencent.matrix.trace.core.AppMethodBeat getInstance() {
        return sInstance;
    }

    public static java.lang.String getVisibleScene() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        return com.tencent.matrix.lifecycle.owners.f0.f52740v;
    }

    public static void i(int i17) {
        if (status > -1 && i17 < METHOD_ID_MAX) {
            if (status == Integer.MAX_VALUE) {
                synchronized (statusLock) {
                    if (status == Integer.MAX_VALUE) {
                        realExecute();
                        status = 1;
                    }
                }
            }
            if (java.lang.Thread.currentThread().getId() != sMainThreadId || assertIn) {
                return;
            }
            assertIn = true;
            int i18 = sIndex;
            if (i18 < 1000000) {
                mergeData(i17, i18, true);
            } else {
                sIndex = 0;
                mergeData(i17, 0, true);
            }
            sIndex++;
            assertIn = false;
        }
    }

    public static boolean isRealTrace() {
        return status >= 1;
    }

    private static void mergeData(int i17, int i18, boolean z17) {
        if (i17 == 1048574) {
            sCurrentDiffTime = android.os.SystemClock.uptimeMillis() - sDiffTime;
        }
        try {
            sBuffer[i18] = (z17 ? Long.MIN_VALUE : 0L) | (i17 << 43) | (sCurrentDiffTime & 8796093022207L);
            checkPileup(i18);
            sLastIndex = i18;
        } catch (java.lang.Throwable th6) {
            oj.j.b(TAG, th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public static void o(int i17) {
        if (status > -1 && i17 < METHOD_ID_MAX && java.lang.Thread.currentThread().getId() == sMainThreadId) {
            int i18 = sIndex;
            if (i18 < 1000000) {
                mergeData(i17, i18, false);
            } else {
                sIndex = 0;
                mergeData(i17, 0, false);
            }
            sIndex++;
        }
    }

    private static void realExecute() {
        oj.j.c(TAG, "[realExecute] timestamp:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        sCurrentDiffTime = android.os.SystemClock.uptimeMillis() - sDiffTime;
        sHandler.removeCallbacksAndMessages(null);
        sHandler.postDelayed(sUpdateDiffTimeRunnable, 5L);
        android.os.Handler handler = sHandler;
        gj.d dVar = new gj.d();
        checkStartExpiredRunnable = dVar;
        handler.postDelayed(dVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        gj.e eVar = hj.c.f281570c;
        try {
            hj.c.f281568a = android.os.SystemClock.uptimeMillis();
            hj.c.f281571d = getInstance().maskIndex("ApplicationCreateBeginMethodIndex");
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityThread");
            java.lang.reflect.Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(cls);
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mH");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.Class<? super java.lang.Object> superclass = obj2.getClass().getSuperclass();
            if (superclass != null) {
                java.lang.reflect.Field declaredField3 = superclass.getDeclaredField("mCallback");
                declaredField3.setAccessible(true);
                declaredField3.set(obj2, new hj.a((android.os.Handler.Callback) declaredField3.get(obj2)));
            }
            oj.j.c("Matrix.ActivityThreadHacker", "hook system handler completed. start:%s SDK_INT:%s", java.lang.Long.valueOf(hj.c.f281568a), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        } catch (java.lang.Exception e17) {
            oj.j.b("Matrix.ActivityThreadHacker", "hook system handler err! %s", e17.getCause().toString());
        }
        jj.d dVar2 = looperMonitorListener;
        gj.k kVar = gj.k.f272354q;
        synchronized (kVar.f272361i) {
            ((java.util.HashMap) kVar.f272361i).put(dVar2, new gj.g(dVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void realRelease() {
        synchronized (statusLock) {
            if (status == Integer.MAX_VALUE || status <= 1) {
                oj.j.c(TAG, "[realRelease] timestamp:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                sHandler.removeCallbacksAndMessages(null);
                gj.k.d(looperMonitorListener);
                sTimerUpdateThread.quit();
                sBuffer = null;
                status = -3;
            }
        }
    }

    public void addListener(jj.a aVar) {
        java.util.HashSet<jj.a> hashSet = listeners;
        synchronized (hashSet) {
            hashSet.add(aVar);
        }
    }

    public long[] copyData(gj.e eVar) {
        return copyData(eVar, new gj.e(sIndex - 1));
    }

    public void forceStop() {
        synchronized (statusLock) {
            status = -1;
        }
    }

    public boolean isAlive() {
        return status >= 2;
    }

    public gj.e maskIndex(java.lang.String str) {
        gj.e eVar = sIndexRecordHead;
        if (eVar == null) {
            gj.e eVar2 = new gj.e(sIndex - 1);
            sIndexRecordHead = eVar2;
            eVar2.f272343d = str;
            return eVar2;
        }
        gj.e eVar3 = new gj.e(sIndex - 1);
        eVar3.f272343d = str;
        gj.e eVar4 = null;
        while (eVar != null) {
            if (eVar3.f272340a <= eVar.f272340a) {
                if (eVar4 == null) {
                    gj.e eVar5 = sIndexRecordHead;
                    sIndexRecordHead = eVar3;
                    eVar3.f272341b = eVar5;
                } else {
                    gj.e eVar6 = eVar4.f272341b;
                    eVar4.f272341b = eVar3;
                    eVar3.f272341b = eVar6;
                }
                return eVar3;
            }
            gj.e eVar7 = eVar;
            eVar = eVar.f272341b;
            eVar4 = eVar7;
        }
        eVar4.f272341b = eVar3;
        return eVar3;
    }

    public void onStart() {
        synchronized (statusLock) {
            if (status >= 2 || status < -2) {
                oj.j.f(TAG, "[onStart] current status:%s", java.lang.Integer.valueOf(status));
            } else {
                sHandler.removeCallbacks(checkStartExpiredRunnable);
                oj.g.a().removeCallbacks(realReleaseRunnable);
                if (sBuffer == null) {
                    throw new java.lang.RuntimeException("Matrix.AppMethodBeat sBuffer == null");
                }
                oj.j.c(TAG, "[onStart] preStatus:%s", java.lang.Integer.valueOf(status), lj.f.c());
                status = 2;
            }
        }
    }

    public void onStop() {
        synchronized (statusLock) {
            if (status == 2) {
                oj.j.c(TAG, "[onStop] %s", lj.f.c());
                status = -1;
            } else {
                oj.j.f(TAG, "[onStop] current status:%s", java.lang.Integer.valueOf(status));
            }
        }
    }

    public void printIndexRecord() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" \n");
        for (gj.e eVar = sIndexRecordHead; eVar != null; eVar = eVar.f272341b) {
            sb6.append(eVar);
            sb6.append("\n");
        }
        oj.j.c(TAG, "[printIndexRecord] %s", sb6.toString());
    }

    public void removeListener(jj.a aVar) {
        java.util.HashSet<jj.a> hashSet = listeners;
        synchronized (hashSet) {
            hashSet.remove(aVar);
        }
    }

    private long[] copyData(gj.e eVar, gj.e eVar2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long[] jArr = new long[0];
        try {
            boolean z17 = eVar.f272342c;
            int i17 = eVar.f272340a;
            if (z17) {
                boolean z18 = eVar2.f272342c;
                int i18 = eVar2.f272340a;
                if (z18) {
                    int max = java.lang.Math.max(0, i17);
                    int max2 = java.lang.Math.max(0, i18);
                    if (max2 > max) {
                        int i19 = (max2 - max) + 1;
                        jArr = new long[i19];
                        java.lang.System.arraycopy(sBuffer, max, jArr, 0, i19);
                    } else if (max2 < max) {
                        int i27 = max2 + 1;
                        long[] jArr2 = sBuffer;
                        jArr = new long[(jArr2.length - max) + i27];
                        java.lang.System.arraycopy(jArr2, max, jArr, 0, jArr2.length - max);
                        long[] jArr3 = sBuffer;
                        java.lang.System.arraycopy(jArr3, 0, jArr, jArr3.length - max, i27);
                    }
                    oj.j.c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", java.lang.Integer.valueOf(java.lang.Math.max(0, i17)), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(jArr.length), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return jArr;
                }
            }
            oj.j.c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", java.lang.Integer.valueOf(java.lang.Math.max(0, i17)), java.lang.Integer.valueOf(eVar2.f272340a), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return jArr;
        } catch (java.lang.Throwable th6) {
            try {
                oj.j.b(TAG, th6.toString(), new java.lang.Object[0]);
                return jArr;
            } finally {
                oj.j.c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", java.lang.Integer.valueOf(java.lang.Math.max(0, eVar.f272340a)), java.lang.Integer.valueOf(eVar2.f272340a), java.lang.Integer.valueOf(jArr.length), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }
}
