package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class l9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n9 f188817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n9 n9Var) {
        super(1);
        this.f188817d = n9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0;
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.n9 n9Var = this.f188817d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = n9Var.f188103t;
        if (intValue >= ((abstractC13919x46aff122 == null || (m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0()) == 0) ? 0 : m56388xcaeb60d0.size())) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222 = n9Var.f188103t;
        so2.j5 j5Var = abstractC13919x46aff1222 != null ? (so2.j5) abstractC13919x46aff1222.get(intValue) : null;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        }
        return null;
    }
}
