package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class k extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 f285819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.c f285820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285822d;

    public k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 c21904x129eb5b3, zy2.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar) {
        this.f285819a = c21904x129eb5b3;
        this.f285820b = cVar;
        this.f285821c = f9Var;
        this.f285822d = dVar;
    }

    @Override // in5.v
    public long c(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f285821c.m124847x74d37ac6() + view.hashCode();
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 c21904x129eb5b3 = this.f285819a;
        yz5.p onViewExposedListener = c21904x129eb5b3.getOnViewExposedListener();
        if (onViewExposedListener != null) {
            onViewExposedListener.mo149xb9724478(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j19));
        }
        if (z17) {
            ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
            zy2.c cVar = this.f285820b;
            java.lang.String m75945x2fec8307 = cVar.f558892b.m75945x2fec8307(1);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f4x);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x xVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a;
            boolean Zi = ((vd2.d5) i0Var).Zi(m75945x2fec8307, findViewById, xVar.i(view), c21904x129eb5b3.getLiveId());
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285821c;
            if (Zi) {
                xVar.m(cVar.f558892b, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()));
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x.b(xVar, f9Var, this.f285822d, cVar.f558892b, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x.a(xVar, c21904x129eb5b3));
        }
    }
}
