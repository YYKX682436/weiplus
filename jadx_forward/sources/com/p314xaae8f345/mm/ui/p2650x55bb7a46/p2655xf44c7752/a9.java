package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class a9 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f282323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f282324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282326g;

    public a9(t21.v2 v2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f282323d = v2Var;
        this.f282324e = jaVar;
        this.f282325f = f9Var;
        this.f282326g = i17;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        if (r1Var != null) {
            t21.v2 v2Var = this.f282323d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f282324e;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282325f;
            int i17 = this.f282326g;
            if (v2Var.d().equals(r1Var.f527062a)) {
                t21.i3 i3Var = t21.j3.f496333h;
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String str = r1Var.f527062a;
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(str);
                t21.j3 d17 = i3Var.d(h17 != null ? h17.g() : null);
                if (d17 == null || d17.f496337b) {
                    return;
                }
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.o2.Ui().A(this);
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.z8(jaVar, f9Var, i17));
            }
        }
    }
}
