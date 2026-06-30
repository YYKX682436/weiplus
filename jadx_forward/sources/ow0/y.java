package ow0;

/* loaded from: classes5.dex */
public final class y implements vu0.y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f430890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ow0.a0 f430891b;

    public y(ow0.a0 a0Var) {
        this.f430891b = a0Var;
    }

    @Override // vu0.y
    public void a() {
        ow0.a0 a0Var = this.f430891b;
        yy0.m7 m7Var = (yy0.m7) a0Var.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.u4(m7Var, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingTextPanelUIC", "videoSubtitleService onError: ");
        a0Var.P7(vw0.g.f522310f);
        ym5.a1.f(new ow0.v(a0Var));
    }

    @Override // vu0.y
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingTextPanelUIC", "videoSubtitleService onStartAutomatic: ");
        vw0.g gVar = vw0.g.f522309e;
        ow0.a0 a0Var = this.f430891b;
        a0Var.P7(gVar);
        ym5.a1.f(new ow0.x(a0Var));
    }

    @Override // vu0.y
    public void c(java.util.List list) {
        ow0.a0 a0Var = this.f430891b;
        yy0.m7 m7Var = (yy0.m7) a0Var.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.t4(m7Var, null), 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoSubtitleService onResult: size: ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingTextPanelUIC", sb6.toString());
        this.f430890a = true;
        a0Var.H7(list);
    }

    @Override // vu0.y
    /* renamed from: onCancel */
    public void mo132434x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ComposingTextPanelUIC", "videoSubtitleService onCancel: " + this.f430890a);
        boolean z17 = this.f430890a;
        ow0.a0 a0Var = this.f430891b;
        if (z17) {
            a0Var.P7(vw0.g.f522310f);
        } else {
            a0Var.P7(vw0.g.f522308d);
        }
    }

    @Override // vu0.y
    /* renamed from: onProgress */
    public void mo132435x696ee52c(float f17) {
        ym5.a1.f(new ow0.w(this.f430891b, f17));
    }
}
