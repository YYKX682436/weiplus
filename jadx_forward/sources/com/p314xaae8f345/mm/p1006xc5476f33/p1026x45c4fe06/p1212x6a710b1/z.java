package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 f172161e;

    public z(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 c0Var) {
        this.f172160d = str;
        this.f172161e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.f171936b;
        java.lang.String str = this.f172160d;
        if (!((java.util.HashMap) map).containsKey(str)) {
            ((java.util.HashMap) map).put(str, new java.util.ArrayList());
        }
        ((java.util.List) ((java.util.HashMap) map).get(str)).add(this.f172161e);
    }
}
