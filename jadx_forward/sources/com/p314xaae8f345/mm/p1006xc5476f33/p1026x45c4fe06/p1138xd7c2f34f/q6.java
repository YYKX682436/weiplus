package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class q6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166611a;

    public q6(int i17) {
        super(null);
        this.f166611a = i17;
    }

    /* renamed from: toString */
    public java.lang.String m51796x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CACHED(");
        int i17 = this.f166611a;
        sb6.append(i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "SHARED_TEMPLATE" : "SHARED_MODULE" : "SELF");
        sb6.append(')');
        return sb6.toString();
    }
}
