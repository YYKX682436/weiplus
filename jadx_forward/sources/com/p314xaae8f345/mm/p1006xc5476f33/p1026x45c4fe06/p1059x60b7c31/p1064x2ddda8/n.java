package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 f161174d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff f161175e;

    /* renamed from: f, reason: collision with root package name */
    public final long f161176f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a f161177g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f161178h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f161179i;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 api, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff invokeContext, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        this.f161174d = api;
        this.f161175e = invokeContext;
        this.f161176f = j17;
        if (j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthWithTimeoutListener", "start timeout timer:" + j17 + " ms");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.m(this), false);
            b4Var.c(j17, j17);
            this.f161179i = b4Var;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAuthResult queueListener null:");
        sb6.append(this.f161177g == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthWithTimeoutListener", sb6.toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f161179i;
        if (b4Var != null) {
            b4Var.d();
            this.f161179i = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.a aVar = this.f161177g;
        if (aVar != null) {
            aVar.a();
        }
    }
}
