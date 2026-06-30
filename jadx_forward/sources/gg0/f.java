package gg0;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg0.j f353040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f353041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w21.w0 f353042f;

    public f(gg0.j jVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, w21.w0 w0Var) {
        this.f353040d = jVar;
        this.f353041e = f9Var;
        this.f353042f = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90();
            am.p00 p00Var = c6220x84bdfe90.f136469g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f353041e;
            w21.w0 w0Var = this.f353042f;
            if (p00Var != null) {
                p00Var.f89123a = f9Var.m124847x74d37ac6();
            }
            if (p00Var != null) {
                p00Var.f89124b = false;
            }
            if (p00Var != null) {
                p00Var.f89125c = w0Var.c();
            }
            c6220x84bdfe90.b(android.os.Looper.getMainLooper());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadError[" + this.f353040d.f353046t.f353021b + "] event publish error: " + e17);
        }
    }
}
