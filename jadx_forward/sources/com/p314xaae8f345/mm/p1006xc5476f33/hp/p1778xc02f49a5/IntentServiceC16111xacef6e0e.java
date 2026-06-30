package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService */
/* loaded from: classes11.dex */
public class IntentServiceC16111xacef6e0e extends android.app.IntentService {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f223934d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.hp.mmdiff.MergeHdiffApkService$InnerService */
    /* loaded from: classes7.dex */
    public static class InnerService extends android.app.Service {
        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                startForeground(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55736x7ee19b2c, new android.app.Notification());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "InnerService set service for push exception:%s.", th6);
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
            return 2;
        }
    }

    public IntentServiceC16111xacef6e0e() {
        super("MergeHdiffApkService");
        setIntentRedelivery(true);
    }

    public static java.lang.String a(android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.RuntimeException("getPatchPathExtra, but intent is null");
        }
        android.os.Bundle bundleExtra = intent.getBundleExtra("result_bundle_extra");
        return bundleExtra == null ? "" : bundleExtra.getString("patch_path_extra", "");
    }

    public static void b(android.content.Context context) {
        java.io.File file = new java.io.File(new java.io.File(context.getFilesDir(), "legacy_mmdiff"), "mmdiff_patch_service_status/running_" + android.os.Process.myPid());
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Tinker.MergeHdiffApkService.HdiffApk", th6, "Fail to create running marker file.", new java.lang.Object[0]);
        }
    }

    public static void c(android.content.Context context) {
        java.io.File file = new java.io.File(new java.io.File(context.getFilesDir(), "legacy_mmdiff"), "mmdiff_patch_service_status/running_" + android.os.Process.myPid());
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        int f17;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "MergeHdiffApkService received null result!!!!");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "for system version >= Android O, we just ignore increasingPriority job to avoid crash or toasts.");
        } else if ("ZUK".equals(android.os.Build.MANUFACTURER)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "for ZUK device, we just ignore increasingPriority job to avoid crash.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "try to increase patch process priority");
            try {
                startForeground(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55736x7ee19b2c, new android.app.Notification());
                startService(new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16111xacef6e0e.InnerService.class));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "try to increase patch process priority error:" + th6);
            }
        }
        if (intent.getBooleanExtra("is_preload_patch_process", false)) {
            return;
        }
        try {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_bundle_extra");
            if (bundleExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch, bundle is null.");
            } else if (bundleExtra.getParcelable("patch_syncresponse_extra") instanceof com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f223934d;
                try {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        b(this);
                        java.lang.String a17 = a(intent);
                        if (a17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "MergeHdiffApkService can't get the path extra, ignoring.");
                        } else {
                            java.io.File file = new java.io.File(a17);
                            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) intent.getBundleExtra("result_bundle_extra").getParcelable("patch_syncresponse_extra");
                            if (c16114x800e8cdb.f223956v) {
                                c83.e.f121216f = 1;
                                f17 = w73.a.c(this, file.getAbsolutePath(), c16114x800e8cdb);
                            } else {
                                c83.e.f121216f = 2;
                                f17 = w73.a.f(file.getAbsolutePath(), c16114x800e8cdb);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "code = %s, syncResponse = %s", java.lang.Integer.valueOf(f17), c16114x800e8cdb);
                            x73.a aVar = new x73.a();
                            aVar.f533970d = f17 == 0;
                            aVar.f533971e = f17;
                            aVar.f533972f = c16114x800e8cdb.f223956v;
                            c(this);
                            atomicBoolean.set(false);
                            com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16110x65c2df15.b(this, aVar, true);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Tinker.MergeHdiffApkService.HdiffApk", "MergeHdiffApkService doApplyPatch is running by another runner.");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch, e2 = %s", e17);
                } finally {
                    c(this);
                    atomicBoolean.set(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MergeHdiffApkService.HdiffApk", "sIsPatchApplying = %s.", atomicBoolean);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch, respone is null.");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MergeHdiffApkService.HdiffApk", "doApplyPatch e = %s", e18);
        }
    }
}
