package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.v1 f192754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 f192755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ir2.v1 v1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var) {
        super(0);
        this.f192754d = v1Var;
        this.f192755e = c2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ir2.u1 u1Var = (ir2.u1) this.f192754d;
        ir2.e1 e1Var = u1Var.f375760a;
        ba2.b bVar = e1Var instanceof ba2.b ? (ba2.b) e1Var : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2 c2Var = this.f192755e;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 s1Var = c2Var.f188147f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(s1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderCampaignFeedUIContract.TopicFeedViewCallback");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2) s1Var;
            r45.r03 r03Var = bVar.f100226k;
            int i17 = bVar.f375618g;
            java.lang.String str = bVar.f375619h;
            long j17 = h2Var.f188414p;
            if (j17 == 0) {
                if (r03Var != null) {
                    j17 = r03Var.m75942xfb822ef2(1);
                }
                h2Var.f188414p = j17;
            }
            if (h2Var.f188411m == 7 && h2Var.f188415q <= 2) {
                if (h2Var.g() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2) h2Var.g()).f187980n.f192753a = r03Var;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 c5544x5bf4bb91 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91();
                int i18 = h2Var.f188411m;
                am.od odVar = c5544x5bf4bb91.f135868g;
                odVar.f89056a = i18;
                odVar.f89057b = i17;
                odVar.f89058c = str;
                c5544x5bf4bb91.e();
            }
        }
        ir2.e1 e1Var2 = u1Var.f375760a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(e1Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.CgiLoaderData<com.tencent.mm.plugin.finder.model.RVFeed>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c2.c(c2Var, (ir2.a) e1Var2);
        return jz5.f0.f384359a;
    }
}
