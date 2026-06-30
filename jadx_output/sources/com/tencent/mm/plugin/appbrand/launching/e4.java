package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.z6 f84587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.me3[] f84588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.f4 f84589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.q4 f84590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84591h;

    public e4(com.tencent.mm.plugin.appbrand.launching.z6 z6Var, r45.me3[] me3VarArr, com.tencent.mm.plugin.appbrand.launching.f4 f4Var, com.tencent.mm.plugin.appbrand.launching.q4 q4Var, java.lang.String str) {
        this.f84587d = z6Var;
        this.f84588e = me3VarArr;
        this.f84589f = f4Var;
        this.f84590g = q4Var;
        this.f84591h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.appbrand.launching.z6 z6Var = this.f84587d;
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(z6Var.f85464g) && z6Var.f85469o) {
            java.lang.Integer a17 = com.tencent.mm.plugin.appbrand.launching.y6.a(this.f84588e);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.start, get invalid app_version using needLatestVersion, request=" + z6Var);
                ((com.tencent.mm.plugin.appbrand.launching.j4) this.f84590g.f85065h).invoke(com.tencent.mm.plugin.appbrand.launching.a6.f84487e, "invalid cgi response");
                return;
            }
            i17 = a17.intValue();
        } else {
            i17 = z6Var.f85465h;
        }
        m81.c[] cVarArr = {m81.c.OK, m81.c.ENV_ERR, m81.c.DISK_FULL};
        int i18 = i17;
        ((km5.q) km5.u.d()).n(new com.tencent.mm.plugin.appbrand.launching.x3(this.f84588e, this.f84587d, this.f84590g, i18, this.f84589f, cVarArr)).n(new com.tencent.mm.plugin.appbrand.launching.z3(this.f84588e, this.f84587d, this.f84590g, i18, this.f84589f, cVarArr)).n(new com.tencent.mm.plugin.appbrand.launching.c4(this.f84588e, this.f84590g, this.f84587d, i18, this.f84589f, this.f84591h)).a(com.tencent.mm.plugin.appbrand.launching.d4.f84565a);
    }
}
