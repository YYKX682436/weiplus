package uy3;

/* loaded from: classes8.dex */
public final class h0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f513476a;

    public h0(uy3.j0 j0Var) {
        this.f513476a = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        m();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        m();
    }

    public final void m() {
        uy3.j0 j0Var = this.f513476a;
        if (j0Var.C) {
            return;
        }
        j0Var.C = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxDialog", "webViewReady showAfterWebViewReady: %b, pendingShow: %b", java.lang.Boolean.valueOf(j0Var.B), java.lang.Boolean.valueOf(j0Var.D));
        if (j0Var.B && j0Var.D) {
            j0Var.D = false;
            j0Var.show();
        }
    }
}
