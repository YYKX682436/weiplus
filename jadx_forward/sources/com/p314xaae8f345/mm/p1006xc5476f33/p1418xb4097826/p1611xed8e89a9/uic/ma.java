package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class ma extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        super(4);
        this.f205510d = obVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        r45.h32 h32Var;
        ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        zy2.jc jcVar = (zy2.jc) obj4;
        kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205510d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(obVar.m58741x6c03c64c());
        if (l2Var == null) {
            l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        if (jcVar != null) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((db2.f5) jcVar).f309505h;
            if (oVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
                throw null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCreateLiveNoticeResponse");
            h32Var = (r45.h32) ((r45.h01) fVar).m75936x14adae67(2);
        } else {
            h32Var = null;
        }
        if (h32Var != null) {
            r45.h32 h32Var2 = l2Var.f205449e;
            if ((h32Var2 != null ? h32Var2.m75939xb282bd08(0) : Integer.MAX_VALUE) > h32Var.m75939xb282bd08(0)) {
                l2Var.f205449e = h32Var;
            }
        }
        lVar.put(obVar.m58741x6c03c64c(), l2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.G7(obVar, "onSceneEnd:[NetSceneCreateLiveNotice]", null, 2, null);
        return jz5.f0.f384359a;
    }
}
