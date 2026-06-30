package cj;

/* loaded from: classes12.dex */
public class b0 extends cj.c {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.BroadcastReceiver f123354e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f123355f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123356g;

    public b0(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar) {
        super(fVar);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        cj.a0 a0Var = new cj.a0(this);
        this.f123354e = a0Var;
        try {
            if (android.os.Build.VERSION.SDK_INT < 33 || fVar.f477391d.getApplicationInfo().targetSdkVersion < 34) {
                fVar.f134513e.f444986e.registerReceiver(a0Var, intentFilter);
            } else {
                fVar.f134513e.f444986e.registerReceiver(a0Var, intentFilter, 4);
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.LeakProcessor.SilenceAnalyse", th6, "", new java.lang.Object[0]);
        }
    }

    @Override // cj.c
    public boolean b(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p581xc2f04ca6.p582x633fb29.C4706x164388f6 c4706x164388f6) {
        c(0, wi.b.NO_DUMP, c4706x164388f6.f20017xf8a7db47, c4706x164388f6.f20020x32b2b2, "no dump", "0");
        java.lang.String str = c4706x164388f6.f20017xf8a7db47;
        java.lang.String str2 = c4706x164388f6.f20020x32b2b2;
        oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "[onLeak] activity=%s isScreenOff=%s isProcessing=%s", str, java.lang.Boolean.valueOf(this.f123355f), java.lang.Boolean.valueOf(this.f123356g));
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.p584x431cd9bc.f fVar = this.f123358a;
        if (fVar.a(str)) {
            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", "this activity has been dumped! %s", str);
        } else {
            if (this.f123356g || !this.f123355f) {
                return false;
            }
            this.f123356g = true;
            fVar.d();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (this.f123359b == null) {
                this.f123359b = new xi.e(fVar.f477391d);
            }
            java.io.File a17 = this.f123359b.a(false);
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
                        java.lang.String m166611x9616526c = a18.m166611x9616526c();
                        if (a18.f501018d) {
                            c(0, bVar, str, str2, m166611x9616526c, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                            oj.j.c("Matrix.LeakProcessor.SilenceAnalyse", m166611x9616526c, new java.lang.Object[0]);
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
            this.f123356g = false;
        }
        return true;
    }
}
