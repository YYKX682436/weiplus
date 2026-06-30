package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.v1 f111221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.c2 f111222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ir2.v1 v1Var, com.tencent.mm.plugin.finder.feed.c2 c2Var) {
        super(0);
        this.f111221d = v1Var;
        this.f111222e = c2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ir2.u1 u1Var = (ir2.u1) this.f111221d;
        ir2.e1 e1Var = u1Var.f294227a;
        ba2.b bVar = e1Var instanceof ba2.b ? (ba2.b) e1Var : null;
        com.tencent.mm.plugin.finder.feed.c2 c2Var = this.f111222e;
        if (bVar != null) {
            com.tencent.mm.plugin.finder.feed.s1 s1Var = c2Var.f106614f;
            kotlin.jvm.internal.o.e(s1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract.TopicFeedViewCallback");
            com.tencent.mm.plugin.finder.feed.h2 h2Var = (com.tencent.mm.plugin.finder.feed.h2) s1Var;
            r45.r03 r03Var = bVar.f18693k;
            int i17 = bVar.f294085g;
            java.lang.String str = bVar.f294086h;
            long j17 = h2Var.f106881p;
            if (j17 == 0) {
                if (r03Var != null) {
                    j17 = r03Var.getLong(1);
                }
                h2Var.f106881p = j17;
            }
            if (h2Var.f106878m == 7 && h2Var.f106882q <= 2) {
                if (h2Var.g() instanceof com.tencent.mm.plugin.finder.feed.c2) {
                    ((com.tencent.mm.plugin.finder.feed.c2) h2Var.g()).f106447n.f111220a = r03Var;
                }
                com.tencent.mm.autogen.events.FinderTopicEvent finderTopicEvent = new com.tencent.mm.autogen.events.FinderTopicEvent();
                int i18 = h2Var.f106878m;
                am.od odVar = finderTopicEvent.f54335g;
                odVar.f7523a = i18;
                odVar.f7524b = i17;
                odVar.f7525c = str;
                finderTopicEvent.e();
            }
        }
        ir2.e1 e1Var2 = u1Var.f294227a;
        kotlin.jvm.internal.o.e(e1Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.CgiLoaderData<com.tencent.mm.plugin.finder.model.RVFeed>");
        com.tencent.mm.plugin.finder.feed.c2.c(c2Var, (ir2.a) e1Var2);
        return jz5.f0.f302826a;
    }
}
