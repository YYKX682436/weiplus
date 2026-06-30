package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderTagClickEvent f108945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f108946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent, com.tencent.mm.plugin.finder.feed.xv xvVar) {
        super(0);
        this.f108945d = finderTagClickEvent;
        this.f108946e = xvVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent = this.f108945d;
        java.util.Objects.toString(finderTagClickEvent.f54330g.f7026a);
        am.jd jdVar = finderTagClickEvent.f54330g;
        jdVar.getClass();
        r45.r03 r03Var = jdVar.f7026a;
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f108946e;
        if (r03Var != null) {
            if (xvVar.f111113o == null) {
                ey2.t0 t0Var = xvVar.f111106e;
                int i17 = xvVar.f111110i;
                java.lang.Object clone = xvVar.f111114p.getDataListJustForAdapter().clone();
                kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.model.RVFeed>");
                ey2.t0.V6(t0Var, "Finder.TimelineMachinePresenter_click", 4, 0, i17, (java.util.ArrayList) clone, null, null, false, false, 480, null);
            }
            xvVar.f111113o = jdVar.f7026a;
            xvVar.g(new com.tencent.mm.plugin.finder.feed.pv(xvVar));
        } else {
            xvVar.f111113o = r03Var;
            xvVar.g(new com.tencent.mm.plugin.finder.feed.qv(xvVar));
        }
        return jz5.f0.f302826a;
    }
}
