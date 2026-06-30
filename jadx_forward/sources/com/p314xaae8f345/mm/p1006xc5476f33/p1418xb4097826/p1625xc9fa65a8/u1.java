package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        super(2);
        this.f207407d = activityC14945x8c20f160;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207407d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2 = activityC14945x8c20f160.C;
        int size = c13920xa5f564aa2 != null ? c13920xa5f564aa2.size() : 0;
        if (intValue2 >= size) {
            intValue2 = size - 1;
        } else if (intValue2 < intValue) {
            intValue2 = intValue;
        }
        if (intValue < 0 || (c13920xa5f564aa = activityC14945x8c20f160.C) == null) {
            return null;
        }
        return new java.util.LinkedList(kz5.n0.C0(c13920xa5f564aa, new e06.k(intValue, intValue2)));
    }
}
