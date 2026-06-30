package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160) {
        super(1);
        this.f207387d = activityC14945x8c20f160;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207387d;
            if (intValue < activityC14945x8c20f160.C.size()) {
                so2.j5 j5Var = (so2.j5) activityC14945x8c20f160.C.get(intValue);
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                }
            }
        }
        return null;
    }
}
