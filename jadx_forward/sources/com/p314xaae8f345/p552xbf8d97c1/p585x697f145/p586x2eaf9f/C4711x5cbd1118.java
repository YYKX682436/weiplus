package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f;

/* renamed from: com.tencent.matrix.trace.core.AppMethodBeat */
/* loaded from: classes12.dex */
public class C4711x5cbd1118 {

    /* renamed from: METHOD_ID_DISPATCH */
    public static final int f20021xae2544c0 = 1048574;

    /* renamed from: METHOD_ID_MAX */
    private static final int f20022xdad7853e = 1048575;

    /* renamed from: STATUS_DEFAULT */
    private static final int f20023x8f0dbad4 = Integer.MAX_VALUE;

    /* renamed from: STATUS_EXPIRED_START */
    private static final int f20024x1f6c10fb = -2;

    /* renamed from: STATUS_OUT_RELEASE */
    private static final int f20025xd0e34709 = -3;

    /* renamed from: STATUS_READY */
    private static final int f20026x51e6caf6 = 1;

    /* renamed from: STATUS_STARTED */
    private static final int f20027xc1e52514 = 2;

    /* renamed from: STATUS_STOPPED */
    private static final int f20028xc2a97660 = -1;
    private static final java.lang.String TAG = "Matrix.AppMethodBeat";

    /* renamed from: isDev */
    public static boolean f20031x5fcf68b;

    /* renamed from: sIndexRecordHead */
    private static gj.e f20042xa3772750;

    /* renamed from: sMethodEnterListener */
    public static gj.f f20046xa35280d8;

    /* renamed from: sUpdateDiffTimeRunnable */
    private static java.lang.Runnable f20048xeb773ceb;

    /* renamed from: sInstance */
    private static com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118 f20043xbfaed628 = new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118();

    /* renamed from: status */
    private static volatile int f20049xcacdcff2 = Integer.MAX_VALUE;

    /* renamed from: statusLock */
    private static final java.lang.Object f20050xec4c03d = new java.lang.Object();

    /* renamed from: sBuffer */
    private static long[] f20036x3aad1e93 = new long[1000000];

    /* renamed from: sIndex */
    private static int f20041xc875881f = 0;

    /* renamed from: sLastIndex */
    private static int f20044xab37c4a9 = -1;

    /* renamed from: assertIn */
    private static boolean f20029xe9c0c30b = false;

    /* renamed from: sCurrentDiffTime */
    private static volatile long f20037x99a24418 = android.os.SystemClock.uptimeMillis();

    /* renamed from: sDiffTime */
    private static volatile long f20038x98cf8a05 = f20037x99a24418;

    /* renamed from: sMainThreadId */
    private static long f20045x23299db1 = android.os.Looper.getMainLooper().getThread().getId();

    /* renamed from: sTimerUpdateThread */
    private static android.os.HandlerThread f20047xb22b27e5 = oj.g.c("matrix_time_update_thread", 3);

    /* renamed from: sHandler */
    private static android.os.Handler f20040x36ab1757 = new android.os.Handler(f20047xb22b27e5.getLooper());

    /* renamed from: sFocusActivitySet */
    private static java.util.Set<java.lang.String> f20039xdc859d6e = new java.util.HashSet();

    /* renamed from: listeners */
    private static final java.util.HashSet<jj.a> f20033xb75bd23f = new java.util.HashSet<>();

    /* renamed from: updateTimeLock */
    private static final java.lang.Object f20051xb8082181 = new java.lang.Object();

    /* renamed from: isPauseUpdateTime */
    private static volatile boolean f20032xade56b42 = false;

    /* renamed from: checkStartExpiredRunnable */
    private static java.lang.Runnable f20030x5e5891c8 = null;

    /* renamed from: looperMonitorListener */
    private static jj.d f20034x8abcdd9d = new gj.a();

    /* renamed from: realReleaseRunnable */
    private static java.lang.Runnable f20035x466996c6 = new gj.b();

    static {
        oj.g.a().postDelayed(f20035x466996c6, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        f20048xeb773ceb = new gj.c();
        f20042xa3772750 = null;
    }

    public static void at(android.app.Activity activity, boolean z17) {
        java.lang.String name = activity.getClass().getName();
        if (!z17) {
            if (f20039xdc859d6e.remove(name)) {
                oj.j.c(TAG, "[at] visibleScene[%s] has %s focus!", m41265x521f41b0(), "detach");
            }
        } else if (f20039xdc859d6e.add(name)) {
            java.util.HashSet<jj.a> hashSet = f20033xb75bd23f;
            synchronized (hashSet) {
                java.util.Iterator<jj.a> it = hashSet.iterator();
                while (it.hasNext()) {
                    ((kj.e0) it.next()).i(activity);
                }
            }
            oj.j.c(TAG, "[at] visibleScene[%s] has %s focus!", m41265x521f41b0(), "attach");
        }
    }

    /* renamed from: checkPileup */
    private static void m41259x2813f675(int i17) {
        gj.e eVar = f20042xa3772750;
        while (eVar != null) {
            int i18 = eVar.f353873a;
            if (i18 != i17 && (i18 != -1 || f20044xab37c4a9 != 999999)) {
                return;
            }
            eVar.f353875c = false;
            oj.j.f(TAG, "[checkPileup] %s", eVar.m131662x9616526c());
            eVar = eVar.f353874b;
            f20042xa3772750 = eVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchBegin */
    public static void m41261x8032004f() {
        f20037x99a24418 = android.os.SystemClock.uptimeMillis() - f20038x98cf8a05;
        f20032xade56b42 = false;
        java.lang.Object obj = f20051xb8082181;
        synchronized (obj) {
            obj.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchEnd */
    public static void m41262x3f88c201() {
        f20032xade56b42 = true;
    }

    /* renamed from: getDiffTime */
    public static long m41263x761185e8() {
        return f20038x98cf8a05;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118 m41264x9cf0d20b() {
        return f20043xbfaed628;
    }

    /* renamed from: getVisibleScene */
    public static java.lang.String m41265x521f41b0() {
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        return com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v;
    }

    public static void i(int i17) {
        if (f20049xcacdcff2 > -1 && i17 < f20022xdad7853e) {
            if (f20049xcacdcff2 == Integer.MAX_VALUE) {
                synchronized (f20050xec4c03d) {
                    if (f20049xcacdcff2 == Integer.MAX_VALUE) {
                        m41268xc44fc7f7();
                        f20049xcacdcff2 = 1;
                    }
                }
            }
            if (java.lang.Thread.currentThread().getId() != f20045x23299db1 || f20029xe9c0c30b) {
                return;
            }
            f20029xe9c0c30b = true;
            int i18 = f20041xc875881f;
            if (i18 < 1000000) {
                m41267x60f32c02(i17, i18, true);
            } else {
                f20041xc875881f = 0;
                m41267x60f32c02(i17, 0, true);
            }
            f20041xc875881f++;
            f20029xe9c0c30b = false;
        }
    }

    /* renamed from: isRealTrace */
    public static boolean m41266x10ea3c3d() {
        return f20049xcacdcff2 >= 1;
    }

    /* renamed from: mergeData */
    private static void m41267x60f32c02(int i17, int i18, boolean z17) {
        if (i17 == 1048574) {
            f20037x99a24418 = android.os.SystemClock.uptimeMillis() - f20038x98cf8a05;
        }
        try {
            f20036x3aad1e93[i18] = (z17 ? Long.MIN_VALUE : 0L) | (i17 << 43) | (f20037x99a24418 & 8796093022207L);
            m41259x2813f675(i18);
            f20044xab37c4a9 = i18;
        } catch (java.lang.Throwable th6) {
            oj.j.b(TAG, th6.getMessage(), new java.lang.Object[0]);
        }
    }

    public static void o(int i17) {
        if (f20049xcacdcff2 > -1 && i17 < f20022xdad7853e && java.lang.Thread.currentThread().getId() == f20045x23299db1) {
            int i18 = f20041xc875881f;
            if (i18 < 1000000) {
                m41267x60f32c02(i17, i18, false);
            } else {
                f20041xc875881f = 0;
                m41267x60f32c02(i17, 0, false);
            }
            f20041xc875881f++;
        }
    }

    /* renamed from: realExecute */
    private static void m41268xc44fc7f7() {
        oj.j.c(TAG, "[realExecute] timestamp:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        f20037x99a24418 = android.os.SystemClock.uptimeMillis() - f20038x98cf8a05;
        f20040x36ab1757.removeCallbacksAndMessages(null);
        f20040x36ab1757.postDelayed(f20048xeb773ceb, 5L);
        android.os.Handler handler = f20040x36ab1757;
        gj.d dVar = new gj.d();
        f20030x5e5891c8 = dVar;
        handler.postDelayed(dVar, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        gj.e eVar = hj.c.f363103c;
        try {
            hj.c.f363101a = android.os.SystemClock.uptimeMillis();
            hj.c.f363104d = m41264x9cf0d20b().m41274xfbb0a546("ApplicationCreateBeginMethodIndex");
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
            oj.j.c("Matrix.ActivityThreadHacker", "hook system handler completed. start:%s SDK_INT:%s", java.lang.Long.valueOf(hj.c.f363101a), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        } catch (java.lang.Exception e17) {
            oj.j.b("Matrix.ActivityThreadHacker", "hook system handler err! %s", e17.getCause().toString());
        }
        jj.d dVar2 = f20034x8abcdd9d;
        gj.k kVar = gj.k.f353887q;
        synchronized (kVar.f353894i) {
            ((java.util.HashMap) kVar.f353894i).put(dVar2, new gj.g(dVar2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: realRelease */
    public static void m41269x53f7f889() {
        synchronized (f20050xec4c03d) {
            if (f20049xcacdcff2 == Integer.MAX_VALUE || f20049xcacdcff2 <= 1) {
                oj.j.c(TAG, "[realRelease] timestamp:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                f20040x36ab1757.removeCallbacksAndMessages(null);
                gj.k.d(f20034x8abcdd9d);
                f20047xb22b27e5.quit();
                f20036x3aad1e93 = null;
                f20049xcacdcff2 = -3;
            }
        }
    }

    /* renamed from: addListener */
    public void m41270x162a7075(jj.a aVar) {
        java.util.HashSet<jj.a> hashSet = f20033xb75bd23f;
        synchronized (hashSet) {
            hashSet.add(aVar);
        }
    }

    /* renamed from: copyData */
    public long[] m41271xe1d050bf(gj.e eVar) {
        return m41260xe1d050bf(eVar, new gj.e(f20041xc875881f - 1));
    }

    /* renamed from: forceStop */
    public void m41272x5b13998d() {
        synchronized (f20050xec4c03d) {
            f20049xcacdcff2 = -1;
        }
    }

    /* renamed from: isAlive */
    public boolean m41273x7a7245c3() {
        return f20049xcacdcff2 >= 2;
    }

    /* renamed from: maskIndex */
    public gj.e m41274xfbb0a546(java.lang.String str) {
        gj.e eVar = f20042xa3772750;
        if (eVar == null) {
            gj.e eVar2 = new gj.e(f20041xc875881f - 1);
            f20042xa3772750 = eVar2;
            eVar2.f353876d = str;
            return eVar2;
        }
        gj.e eVar3 = new gj.e(f20041xc875881f - 1);
        eVar3.f353876d = str;
        gj.e eVar4 = null;
        while (eVar != null) {
            if (eVar3.f353873a <= eVar.f353873a) {
                if (eVar4 == null) {
                    gj.e eVar5 = f20042xa3772750;
                    f20042xa3772750 = eVar3;
                    eVar3.f353874b = eVar5;
                } else {
                    gj.e eVar6 = eVar4.f353874b;
                    eVar4.f353874b = eVar3;
                    eVar3.f353874b = eVar6;
                }
                return eVar3;
            }
            gj.e eVar7 = eVar;
            eVar = eVar.f353874b;
            eVar4 = eVar7;
        }
        eVar4.f353874b = eVar3;
        return eVar3;
    }

    /* renamed from: onStart */
    public void m41275xb05099c3() {
        synchronized (f20050xec4c03d) {
            if (f20049xcacdcff2 >= 2 || f20049xcacdcff2 < -2) {
                oj.j.f(TAG, "[onStart] current status:%s", java.lang.Integer.valueOf(f20049xcacdcff2));
            } else {
                f20040x36ab1757.removeCallbacks(f20030x5e5891c8);
                oj.g.a().removeCallbacks(f20035x466996c6);
                if (f20036x3aad1e93 == null) {
                    throw new java.lang.RuntimeException("Matrix.AppMethodBeat sBuffer == null");
                }
                oj.j.c(TAG, "[onStart] preStatus:%s", java.lang.Integer.valueOf(f20049xcacdcff2), lj.f.c());
                f20049xcacdcff2 = 2;
            }
        }
    }

    /* renamed from: onStop */
    public void m41276xc39f8281() {
        synchronized (f20050xec4c03d) {
            if (f20049xcacdcff2 == 2) {
                oj.j.c(TAG, "[onStop] %s", lj.f.c());
                f20049xcacdcff2 = -1;
            } else {
                oj.j.f(TAG, "[onStop] current status:%s", java.lang.Integer.valueOf(f20049xcacdcff2));
            }
        }
    }

    /* renamed from: printIndexRecord */
    public void m41277x13892d6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" \n");
        for (gj.e eVar = f20042xa3772750; eVar != null; eVar = eVar.f353874b) {
            sb6.append(eVar);
            sb6.append("\n");
        }
        oj.j.c(TAG, "[printIndexRecord] %s", sb6.toString());
    }

    /* renamed from: removeListener */
    public void m41278xf1335d58(jj.a aVar) {
        java.util.HashSet<jj.a> hashSet = f20033xb75bd23f;
        synchronized (hashSet) {
            hashSet.remove(aVar);
        }
    }

    /* renamed from: copyData */
    private long[] m41260xe1d050bf(gj.e eVar, gj.e eVar2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long[] jArr = new long[0];
        try {
            boolean z17 = eVar.f353875c;
            int i17 = eVar.f353873a;
            if (z17) {
                boolean z18 = eVar2.f353875c;
                int i18 = eVar2.f353873a;
                if (z18) {
                    int max = java.lang.Math.max(0, i17);
                    int max2 = java.lang.Math.max(0, i18);
                    if (max2 > max) {
                        int i19 = (max2 - max) + 1;
                        jArr = new long[i19];
                        java.lang.System.arraycopy(f20036x3aad1e93, max, jArr, 0, i19);
                    } else if (max2 < max) {
                        int i27 = max2 + 1;
                        long[] jArr2 = f20036x3aad1e93;
                        jArr = new long[(jArr2.length - max) + i27];
                        java.lang.System.arraycopy(jArr2, max, jArr, 0, jArr2.length - max);
                        long[] jArr3 = f20036x3aad1e93;
                        java.lang.System.arraycopy(jArr3, 0, jArr, jArr3.length - max, i27);
                    }
                    oj.j.c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", java.lang.Integer.valueOf(java.lang.Math.max(0, i17)), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(jArr.length), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return jArr;
                }
            }
            oj.j.c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", java.lang.Integer.valueOf(java.lang.Math.max(0, i17)), java.lang.Integer.valueOf(eVar2.f353873a), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            return jArr;
        } catch (java.lang.Throwable th6) {
            try {
                oj.j.b(TAG, th6.toString(), new java.lang.Object[0]);
                return jArr;
            } finally {
                oj.j.c(TAG, "[copyData] [%s:%s] length:%s cost:%sms", java.lang.Integer.valueOf(java.lang.Math.max(0, eVar.f353873a)), java.lang.Integer.valueOf(eVar2.f353873a), java.lang.Integer.valueOf(jArr.length), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }
}
