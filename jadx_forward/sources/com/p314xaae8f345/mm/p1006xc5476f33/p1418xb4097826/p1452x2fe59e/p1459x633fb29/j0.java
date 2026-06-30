package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 f189611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f189612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var, fc2.a aVar) {
        super(1);
        this.f189611d = l0Var;
        this.f189612e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.qq2 qq2Var;
        r45.qq2 qq2Var2;
        so2.j5 j5Var = (so2.j5) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
        if (abstractC14490x69736cb5 != null) {
            ec2.f fVar = (ec2.f) this.f189612e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.f189611d;
            int i17 = l0Var.f189663o;
            r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            boolean m75933x41a8a7f2 = (m76806xdef68064 == null || (qq2Var2 = (r45.qq2) m76806xdef68064.m75936x14adae67(3)) == null) ? false : qq2Var2.m75933x41a8a7f2(2);
            r45.dm2 m76806xdef680642 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
            int m75939xb282bd08 = (m76806xdef680642 == null || (qq2Var = (r45.qq2) m76806xdef680642.m75936x14adae67(3)) == null) ? -1 : qq2Var.m75939xb282bd08(3);
            r45.mb4 mb4Var = fVar.f332494f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f189659h, "[handlePreloadOnProgress] pos:" + i17 + " userPageIsPreload:" + m75933x41a8a7f2 + ", commentWaitTime:" + m75939xb282bd08 + ", offset:" + fVar.f332496h + " duration:" + (mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0));
            if (m75933x41a8a7f2) {
                boolean z17 = fVar.f332496h >= m75939xb282bd08;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = l0Var.f189667s;
                if (!copyOnWriteArrayList.contains(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84())) && z17) {
                    l0Var.O0(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.w(), abstractC14490x69736cb5.getFeedObject().m59276x6c285d75(), l0Var.f189662n, abstractC14490x69736cb5.getFeedObject().m59326x645197b(), abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c(), i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.z.f190031f);
                    copyOnWriteArrayList.add(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
