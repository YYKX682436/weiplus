package gg0;

/* loaded from: classes12.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg0.j f353043d;

    public g(gg0.j jVar) {
        this.f353043d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg0.j jVar = this.f353043d;
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe90 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90();
            am.p00 p00Var = c6220x84bdfe90.f136469g;
            if (p00Var != null) {
                p00Var.f89123a = jVar.f353046t.f353023d;
            }
            if (p00Var != null) {
                p00Var.f89124b = true;
            }
            if (p00Var != null) {
                w21.w0 w0Var = jVar.f353047u;
                p00Var.f89125c = w0Var != null ? w0Var.c() : false;
            }
            c6220x84bdfe90.b(android.os.Looper.getMainLooper());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadSuccess[" + jVar.f353046t.f353021b + "] event publish error: " + e17);
        }
    }
}
