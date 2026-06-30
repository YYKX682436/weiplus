package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class x9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y9 f192581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y9 y9Var) {
        super(2);
        this.f192581d = y9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        java.util.List m56388xcaeb60d0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d02;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        if (intValue >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y9 y9Var = this.f192581d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = y9Var.f188103t;
            if (intValue2 < ((abstractC13919x46aff1222 == null || (m56388xcaeb60d02 = abstractC13919x46aff1222.m56388xcaeb60d0()) == 0) ? 0 : m56388xcaeb60d02.size()) && (abstractC13919x46aff122 = y9Var.f188103t) != null && (m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0()) != null) {
                return new java.util.LinkedList(kz5.n0.C0(m56388xcaeb60d0, new e06.k(intValue, intValue2)));
            }
        }
        return null;
    }
}
