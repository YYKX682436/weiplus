package sc2;

/* loaded from: classes2.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.k2 f487517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487521h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487522i;

    public j2(sc2.k2 k2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, java.lang.String str) {
        this.f487517d = k2Var;
        this.f487518e = abstractC14490x69736cb5;
        this.f487519f = s0Var;
        this.f487520g = view;
        this.f487521h = p0Var;
        this.f487522i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.k2 k2Var = this.f487517d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487518e;
        in5.s0 s0Var = this.f487519f;
        android.view.View view = this.f487520g;
        xc2.p0 p0Var = this.f487521h;
        k2Var.I(abstractC14490x69736cb5, s0Var, view, p0Var, this.f487522i, k2Var.M(p0Var), true);
        sc2.k2 k2Var2 = this.f487517d;
        xc2.p0 p0Var2 = this.f487521h;
        r45.i55 P = k2Var2.P(p0Var2);
        r45.i55 M = k2Var2.M(p0Var2);
        android.view.View view2 = this.f487520g;
        k2Var2.G(view2, P, M);
        k2Var2.Y(this.f487519f, view2, "tryDelayExpand");
        xc2.z2 z2Var = k2Var2.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || p0Var2.f534794w != 0 || bVar.f534602m <= 0) {
            return;
        }
        p0Var2.f534794w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
    }
}
