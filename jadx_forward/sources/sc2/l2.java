package sc2;

/* loaded from: classes2.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m2 f487572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487576h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487577i;

    public l2(sc2.m2 m2Var, xc2.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f487572d = m2Var;
        this.f487573e = p0Var;
        this.f487574f = abstractC14490x69736cb5;
        this.f487575g = s0Var;
        this.f487576h = view;
        this.f487577i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.m2 m2Var = this.f487572d;
        xc2.p0 p0Var = m2Var.f84680h;
        xc2.p0 p0Var2 = this.f487573e;
        xc2.p0 p0Var3 = p0Var == null ? p0Var2 : p0Var;
        m2Var.K(this.f487574f, this.f487575g, this.f487576h, p0Var3, this.f487577i, m2Var.P(p0Var3), true);
        sc2.q8 q8Var = p0Var2.f534766J;
        if (q8Var != null) {
            q8Var.f487712c = 2;
        }
        sc2.m2 m2Var2 = this.f487572d;
        r45.su N = m2Var2.N(p0Var3);
        r45.su P = m2Var2.P(p0Var3);
        android.view.View view = this.f487576h;
        m2Var2.I(view, N, P);
        m2Var2.W(this.f487575g, view, p0Var3, "tryDelayExpand");
        xc2.z2 z2Var = m2Var2.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || p0Var3.f534794w != 0 || bVar.f534602m <= 0) {
            return;
        }
        p0Var3.f534794w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
    }
}
