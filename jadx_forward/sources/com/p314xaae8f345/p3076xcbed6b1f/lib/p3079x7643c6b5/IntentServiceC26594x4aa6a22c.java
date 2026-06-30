package com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5;

/* renamed from: com.tencent.tinker.lib.service.TinkerPatchService */
/* loaded from: classes13.dex */
public class IntentServiceC26594x4aa6a22c extends android.app.IntentService {

    /* renamed from: d, reason: collision with root package name */
    public static qv5.a f297079d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Class f297080e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f297081f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: com.tencent.tinker.lib.service.TinkerPatchService$InnerService */
    /* loaded from: classes11.dex */
    public static class InnerService extends android.app.Service {
        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                qv5.a aVar = com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.f297079d;
                startForeground(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55736x7ee19b2c, new android.app.Notification());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.TinkerPatchService", "InnerService set service for push exception:%s.", th6);
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }

        @Override // android.app.Service
        public int onStartCommand(android.content.Intent intent, int i17, int i18) {
            super.onStartCommand(intent, i17, i18);
            return 2;
        }
    }

    public IntentServiceC26594x4aa6a22c() {
        super("TinkerPatchService");
        setIntentRedelivery(true);
    }

    public static boolean a(android.content.Context context) {
        android.app.ActivityManager activityManager;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i17;
        try {
            java.lang.String a17 = uv5.a.a(context);
            if (a17 != null && (activityManager = (android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i17 = 0;
                        break;
                    }
                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.processName.equals(a17)) {
                        i17 = next.pid;
                        break;
                    }
                }
                if (i17 == 0) {
                    return false;
                }
                return new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(context), "patch_service_status/running_" + i17).exists();
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public static void b(android.content.Context context) {
        java.io.File file = new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(context), "patch_service_status/running_" + android.os.Process.myPid());
        if (file.exists()) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            java.io.File[] listFiles = parentFile.listFiles();
            if (listFiles != null) {
                for (java.io.File file2 : listFiles) {
                    file2.delete();
                }
            }
        } else {
            parentFile.mkdirs();
        }
        try {
            if (!file.createNewFile()) {
                throw new java.lang.IllegalStateException();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35("Tinker.TinkerPatchService", th6, "Fail to create running marker file.", new java.lang.Object[0]);
        }
    }

    public static void c(android.content.Context context) {
        java.io.File file = new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(context), "patch_service_status/running_" + android.os.Process.myPid());
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        java.lang.Throwable th6;
        boolean z17;
        qv5.a aVar;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.TinkerPatchService", "for system version >= Android O, we just ignore increasingPriority job to avoid crash or toasts.", new java.lang.Object[0]);
        } else if ("ZUK".equals(android.os.Build.MANUFACTURER)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.TinkerPatchService", "for ZUK device, we just ignore increasingPriority job to avoid crash.", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.TinkerPatchService", "try to increase patch process priority", new java.lang.Object[0]);
            try {
                startForeground(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55736x7ee19b2c, new android.app.Notification());
                startService(new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.InnerService.class));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.TinkerPatchService", "try to increase patch process priority error:" + th7, new java.lang.Object[0]);
            }
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f297081f;
        if (!atomicBoolean.compareAndSet(false, true)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.TinkerPatchService", "TinkerPatchService doApplyPatch is running by another runner.", new java.lang.Object[0]);
            return;
        }
        try {
            b(this);
            tv5.b b17 = tv5.b.b(this);
            rv5.d dVar = b17.f503905e;
            dVar.g(intent);
            if (intent == null) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.TinkerPatchService", "TinkerPatchService received a null intent, ignoring.", new java.lang.Object[0]);
            } else {
                java.lang.String m104654x7e63ed49 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104654x7e63ed49(intent, "patch_path_extra");
                if (m104654x7e63ed49 == null) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.TinkerPatchService", "TinkerPatchService can't get the path extra, ignoring.", new java.lang.Object[0]);
                } else {
                    java.io.File file = new java.io.File(m104654x7e63ed49);
                    boolean m104642x21a1233e = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104642x21a1233e(intent, "patch_use_emergency_mode", false);
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665 c26592x819d2665 = new com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.C26592x819d2665();
                    try {
                        aVar = f297079d;
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        dVar.e(file, th6);
                        z17 = false;
                    }
                    if (aVar == null) {
                        throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6("upgradePatchProcessor is null.");
                    }
                    z17 = aVar.a(this, m104654x7e63ed49, m104642x21a1233e, c26592x819d2665);
                    th6 = null;
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                    dVar.f(file, z17, elapsedRealtime2);
                    c26592x819d2665.f55413x6e268779 = z17;
                    c26592x819d2665.f55415xf44864e1 = m104654x7e63ed49;
                    c26592x819d2665.f55420xb6a9208d = m104642x21a1233e;
                    c26592x819d2665.f55418xe843839e = elapsedRealtime2;
                    c26592x819d2665.f55419x368f3a = b17.f503907g == null ? 0 : 1;
                    c26592x819d2665.f297078e = th6;
                    c(this);
                    atomicBoolean.set(false);
                    com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.AbstractIntentServiceC26590x407102b6.b(this, c26592x819d2665, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104654x7e63ed49(intent, "patch_result_class"));
                }
            }
        } finally {
            c(this);
        }
    }
}
