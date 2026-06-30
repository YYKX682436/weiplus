package au3;

/* loaded from: classes10.dex */
public final class n implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f95665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f f95666e;

    public n(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f c16999x1ee3168f) {
        this.f95665d = view;
        this.f95666e = c16999x1ee3168f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f95665d.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f95666e.getRecyclerThumbSeekBar().b() > 0.001f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1991x4e5f73eb.C16999x1ee3168f c16999x1ee3168f = this.f95666e;
            c16999x1ee3168f.c(c16999x1ee3168f.recyclerThumbSeekBar.c(), c16999x1ee3168f.recyclerThumbSeekBar.b());
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSeekBarEditorView", "run delay branch");
        ku5.u0 u0Var = ku5.t0.f394148d;
        au3.m mVar = new au3.m(this.f95666e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(mVar, 100L, false);
        return true;
    }
}
