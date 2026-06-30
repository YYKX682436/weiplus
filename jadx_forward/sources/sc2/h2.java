package sc2;

/* loaded from: classes2.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.i2 f487470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487474h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487475i;

    public h2(sc2.i2 i2Var, xc2.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f487470d = i2Var;
        this.f487471e = p0Var;
        this.f487472f = abstractC14490x69736cb5;
        this.f487473g = s0Var;
        this.f487474h = view;
        this.f487475i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.i2 i2Var = this.f487470d;
        xc2.p0 p0Var = i2Var.f84680h;
        if (p0Var == null) {
            p0Var = this.f487471e;
        }
        xc2.p0 p0Var2 = p0Var;
        i2Var.J(this.f487472f, this.f487473g, this.f487474h, p0Var2, this.f487475i, i2Var.M(p0Var2), true);
        sc2.i2 i2Var2 = this.f487470d;
        r45.su Q = i2Var2.Q(p0Var2);
        r45.su M = i2Var2.M(p0Var2);
        android.view.View view = this.f487474h;
        i2Var2.H(view, Q, M);
        i2Var2.W(this.f487473g, view, p0Var2, "tryDelayExpand");
        xc2.z2 z2Var = i2Var2.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || p0Var2.f534794w != 0 || bVar.f534602m <= 0) {
            return;
        }
        p0Var2.f534794w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
    }
}
