package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class xd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f229219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f229220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f229221g;

    public xd(java.lang.String str, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, r45.wv3 wv3Var, long j17) {
        this.f229218d = str;
        this.f229219e = c22789xd23e9a9b;
        this.f229220f = wv3Var;
        this.f229221g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.h(1, this.f229218d, this.f229219e);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        r45.xv3 xv3Var = this.f229220f.f471034g;
        objArr[0] = xv3Var != null ? xv3Var.f472027x : null;
        objArr[1] = 1;
        objArr[2] = 2;
        objArr[3] = java.lang.Long.valueOf(this.f229221g);
        g0Var.d(28153, objArr);
    }
}
