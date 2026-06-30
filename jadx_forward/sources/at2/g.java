package at2;

/* loaded from: classes3.dex */
public final class g implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.z0 f95191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z12 f95192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.a f95193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ at2.i f95194g;

    public g(xs2.z0 z0Var, r45.z12 z12Var, wp.a aVar, at2.i iVar) {
        this.f95191d = z0Var;
        this.f95192e = z12Var;
        this.f95193f = aVar;
        this.f95194g = iVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        xs2.z0 z0Var = this.f95191d;
        r45.t12 t12Var = (r45.t12) this.f95192e.m75936x14adae67(0);
        if (t12Var != null) {
            t12Var.m75945x2fec8307(6);
        }
        z0Var.getClass();
        z0Var.f537930d.setBackground(null);
        this.f95193f.f529886x = true;
        xs2.o oVar = this.f95194g.f95219s;
        if (oVar != null) {
            vp.x i17 = ((xs2.q0) oVar).i();
            at2.y1 y1Var = (at2.y1) this.f95194g.X0(at2.y1.class);
            if (y1Var != null) {
                y1Var.f95315r.performClick();
            }
            i17.f520385d.mo172413xc84dc82d();
            i17.f520385d.mo172410x31e85dfb();
        }
    }
}
