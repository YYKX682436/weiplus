package cj;

/* loaded from: classes12.dex */
public class b0 extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.BroadcastReceiver f41821e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41822f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41823g;

    public b0(com.tencent.matrix.resource.watcher.f fVar) {
        super(fVar);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        cj.a0 a0Var = new cj.a0(this);
        this.f41821e = a0Var;
        try {
            if (android.os.Build.VERSION.SDK_INT < 33 || fVar.f395858d.getApplicationInfo().targetSdkVersion < 34) {
                fVar.f52980e.f363453e.registerReceiver(a0Var, intentFilter);
            } else {
                fVar.f52980e.f363453e.registerReceiver(a0Var, intentFilter, 4);
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.LeakProcessor.SilenceAnalyse", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // cj.c
    public boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo) {
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        java.lang.String str = destroyedActivityInfo.mActivityName;
        java.lang.String str2 = destroyedActivityInfo.mKey;
        oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "[onLeak] activity=%s isScreenOff=%s isProcessing=%s", str, java.lang.Boolean.valueOf(this.f41822f), java.lang.Boolean.valueOf(this.f41823g));
        com.tencent.matrix.resource.watcher.f fVar = this.f41825a;
        if (fVar.a(str)) {
            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "this activity has been dumped! %s", str);
        } else {
            if (this.f41823g || !this.f41822f) {
                return false;
            }
            this.f41823g = true;
            fVar.d();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (this.f41826b == null) {
                this.f41826b = new xi.e(fVar.f395858d);
            }
            java.io.File a17 = this.f41826b.a(false);
            wi.b bVar = wi.b.SILENCE_ANALYSE;
            if (a17 == null || a17.length() <= 0) {
                c(2, bVar, str, str2, "file is null", "0");
                oj.j.b("Matrix.LeakProcessor.SilenceAnalyse", "file is null!", new java.lang.Object[0]);
            } else {
                oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", java.lang.String.format("dump cost=%sms refString=%s path=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), str2, a17.getAbsolutePath()), new java.lang.Object[0]);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                try {
                    try {
                        ti.a a18 = a(a17, str2);
                        oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", java.lang.String.format("analyze cost=%sms refString=%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), str2), new java.lang.Object[0]);
                        java.lang.String aVar = a18.toString();
                        if (a18.f419485d) {
                            c(0, bVar, str, str2, aVar, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", aVar, new java.lang.Object[0]);
                        } else {
                            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "leak not found", new java.lang.Object[0]);
                        }
                    } catch (java.lang.OutOfMemoryError e17) {
                        c(3, bVar, str, str2, "OutOfMemoryError", "0");
                        oj.j.d("Matrix.LeakProcessor.SilenceAnalyse", e17.getCause(), "", new java.lang.Object[0]);
                    }
                    a17.delete();
                } catch (java.lang.Throwable th6) {
                    a17.delete();
                    throw th6;
                }
            }
            fVar.b(str, false);
            this.f41823g = false;
        }
        return true;
    }
}
