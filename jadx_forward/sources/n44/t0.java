package n44;

/* loaded from: classes4.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f416581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n44.u0 f416583g;

    public t0(java.lang.String str, boolean z17, java.lang.String str2, n44.u0 u0Var) {
        this.f416580d = str;
        this.f416581e = z17;
        this.f416582f = str2;
        this.f416583g = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.jj4 e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$setThumb$1");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f416580d, options);
        ((ku5.t0) ku5.t0.f394148d).B(new n44.s0(this.f416583g, J2));
        java.lang.String str = this.f416581e ? "halfScreenVideoThumbDownload" : "halfScreenVideoThumbCache";
        m44.a.c(this.f416582f, J2, options);
        m44.d.b(J2 != null);
        boolean z17 = J2 != null;
        n44.u0 u0Var = this.f416583g;
        u0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageParam", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper");
        i64.z zVar = u0Var.f416595e;
        m44.d.c(z17, (zVar == null || (e17 = zVar.e()) == null) ? null : e17.f459393i, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenVideoHelper$setThumb$1");
    }
}
