package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class rv extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 f190478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xv f190479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 c5539x720c286, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xv xvVar) {
        super(0);
        this.f190478d = c5539x720c286;
        this.f190479e = xvVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 c5539x720c286 = this.f190478d;
        java.util.Objects.toString(c5539x720c286.f135863g.f88559a);
        am.jd jdVar = c5539x720c286.f135863g;
        jdVar.getClass();
        r45.r03 r03Var = jdVar.f88559a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xv xvVar = this.f190479e;
        if (r03Var != null) {
            if (xvVar.f192646o == null) {
                ey2.t0 t0Var = xvVar.f192639e;
                int i17 = xvVar.f192643i;
                java.lang.Object clone = xvVar.f192647p.m56388xcaeb60d0().clone();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed>");
                ey2.t0.V6(t0Var, "Finder.TimelineMachinePresenter_click", 4, 0, i17, (java.util.ArrayList) clone, null, null, false, false, 480, null);
            }
            xvVar.f192646o = jdVar.f88559a;
            xvVar.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pv(xvVar));
        } else {
            xvVar.f192646o = r03Var;
            xvVar.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qv(xvVar));
        }
        return jz5.f0.f384359a;
    }
}
