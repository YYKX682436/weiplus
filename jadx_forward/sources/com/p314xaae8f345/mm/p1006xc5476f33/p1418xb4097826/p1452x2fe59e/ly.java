package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ly extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct f188867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ct ctVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar) {
        super(1);
        this.f188867d = ctVar;
        this.f188868e = pzVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        so2.j5 j5Var;
        int intValue = ((java.lang.Number) obj).intValue();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00) this.f188867d).m56655x4905e9fa().mo7946xf939df19();
        int a07 = mo7946xf939df19 != null ? intValue - ((in5.n0) mo7946xf939df19).a0() : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188868e;
        int size = pzVar.C.m56388xcaeb60d0().size();
        if (size > 0) {
            if ((a07 >= 0 && a07 < size) && (j5Var = (so2.j5) pzVar.C.m56395x6ebf1089(a07)) != null && (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            }
        }
        return null;
    }
}
