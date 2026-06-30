package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        super(2);
        this.f202250d = t0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String giftId = (java.lang.String) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202250d;
        t0Var.w();
        java.util.LinkedHashMap linkedHashMap = t0Var.f202318v;
        ln2.f fVar = (ln2.f) linkedHashMap.get(giftId);
        if (fVar != null) {
            fVar.f401424b = longValue;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y) t0Var.f202319w.get(giftId);
        if (yVar != null) {
            yVar.a((ln2.f) linkedHashMap.get(giftId));
        }
        t0Var.B();
        return jz5.f0.f384359a;
    }
}
