package at2;

/* loaded from: classes3.dex */
public final class g implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.z0 f13658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z12 f13659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp.a f13660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ at2.i f13661g;

    public g(xs2.z0 z0Var, r45.z12 z12Var, wp.a aVar, at2.i iVar) {
        this.f13658d = z0Var;
        this.f13659e = z12Var;
        this.f13660f = aVar;
        this.f13661g = iVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        xs2.z0 z0Var = this.f13658d;
        r45.t12 t12Var = (r45.t12) this.f13659e.getCustom(0);
        if (t12Var != null) {
            t12Var.getString(6);
        }
        z0Var.getClass();
        z0Var.f456397d.setBackground(null);
        this.f13660f.f448353x = true;
        xs2.o oVar = this.f13661g.f13686s;
        if (oVar != null) {
            vp.x i17 = ((xs2.q0) oVar).i();
            at2.y1 y1Var = (at2.y1) this.f13661g.X0(at2.y1.class);
            if (y1Var != null) {
                y1Var.f13782r.performClick();
            }
            i17.f438852d.resume();
            i17.f438852d.postInvalidate();
        }
    }
}
