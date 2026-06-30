package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f172476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f172477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f172478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f172479g;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Object obj, java.lang.Runnable runnable) {
        this.f172479g = c11527x5889d9af;
        this.f172476d = c11510xdd90c2f2;
        this.f172477e = obj;
        this.f172478f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!(this.f172479g.f156372r.peekFirst() == this.f172476d) && !this.f172479g.M(this.f172476d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeContainer", "close with appId(%s), not top of stack, ignore", this.f172476d.f156336n);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 i17 = this.f172479g.i(this.f172476d);
        if (i17 != null) {
            i17.n1(this.f172476d.u0(), this.f172477e);
        } else {
            this.f172476d.k0(this.f172477e);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f172476d.f156336n;
        objArr[1] = i17 == null ? "null" : i17.f156336n;
        objArr[2] = java.lang.Boolean.valueOf(this.f172479g.f156376v);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainer", "close before run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", objArr);
        this.f172479g.R(i17, this.f172476d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v4(this, i17));
    }
}
