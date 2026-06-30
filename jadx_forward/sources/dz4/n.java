package dz4;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326887d;

    public n(dz4.j0 j0Var) {
        this.f326887d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.j0 j0Var = this.f326887d;
        ih0.p pVar = j0Var.f326842a;
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "closeVoiceInputPanel: holder null");
            return;
        }
        ((dz4.k1) ((jz5.n) ((ez4.u) pVar).f339488n).mo141623x754a37bb()).b(j0Var.f326845d, r1.f326853d);
    }
}
