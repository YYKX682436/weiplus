package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class o1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f182568a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 f182569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f182570c;

    /* renamed from: d, reason: collision with root package name */
    public final long f182571d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f182572e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f182573f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.n1 f182574g;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var) {
        java.lang.String a17;
        this.f182570c = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.n1(this);
        this.f182574g = n1Var;
        this.f182569b = b1Var;
        if (b1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
            a17 = "";
        } else {
            a17 = b1Var.a();
        }
        this.f182568a = a17;
        this.f182571d = b1Var.f182430a.f67659xa783a79b;
        if (b1Var.d() || b1Var.c()) {
            this.f182572e = true;
            n1Var.f182551a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(b1Var.f182431b.f456981y);
        }
        if (b1Var.b()) {
            this.f182573f = true;
        }
    }

    /* renamed from: equals */
    public boolean m55348xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = this.f182569b;
        return (b1Var == null || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) || obj == null) ? super.equals(obj) : b1Var.f182431b.T.equals(((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) obj).f182431b.T);
    }

    public o1(long j17) {
        this.f182570c = 0;
        this.f182574g = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.n1(this);
        this.f182571d = j17;
        this.f182570c = Integer.MAX_VALUE;
    }
}
