package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public final class o extends com.tencent.mm.modelbase.i {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.j f75870y = new com.tencent.mm.plugin.appbrand.appcache.predownload.j(null);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f75871m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f75872n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f75873o;

    /* renamed from: p, reason: collision with root package name */
    public final int f75874p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f75875q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f75876r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f75877s;

    /* renamed from: t, reason: collision with root package name */
    public final int f75878t;

    /* renamed from: u, reason: collision with root package name */
    public int f75879u;

    /* renamed from: v, reason: collision with root package name */
    public final long f75880v;

    /* renamed from: w, reason: collision with root package name */
    public long f75881w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f75882x;

    public /* synthetic */ o(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? null : str, (i18 & 2) != 0 ? null : str2, (i18 & 4) != 0 ? null : str3, (i18 & 8) != 0 ? 0 : i17, (i18 & 16) != 0 ? null : str4);
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        k91.m4 ij6;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w07;
        k91.m4 ij7;
        int i17 = 0;
        java.lang.String str = this.f75871m;
        boolean z17 = str == null || str.length() == 0;
        java.lang.String str2 = this.f75872n;
        if (z17) {
            if (str2 == null || str2.length() == 0) {
                t();
                return pq5.h.d(new com.tencent.mm.plugin.appbrand.appcache.predownload.m(this));
            }
        }
        if (com.tencent.mm.plugin.appbrand.app.r9.ij() == null) {
            t();
            return pq5.h.d(new com.tencent.mm.plugin.appbrand.appcache.predownload.n(this));
        }
        com.tencent.mars.xlog.Log.i(this.f75876r, "do cgi with username[" + str + "] appId:[" + str2 + ']');
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b17 = com.tencent.mm.plugin.appbrand.appcache.e8.b();
        k91.v5 v5Var = null;
        java.lang.String W0 = b17 != null ? b17.W0() : null;
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        r45.ib5 ib5Var = new r45.ib5();
        r45.kj6 kj6Var = new r45.kj6();
        if (str2 == null || str2.length() == 0) {
            kj6Var.f378767d = str;
            if (!(str == null || str.length() == 0) && (ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij()) != null) {
                v5Var = ij6.n1(str, new java.lang.String[0]);
            }
        } else {
            kj6Var.f378771h = str2;
            if (!(str2 == null || str2.length() == 0) && (ij7 = com.tencent.mm.plugin.appbrand.app.r9.ij()) != null) {
                v5Var = ij7.k1(str2, new java.lang.String[0]);
            }
        }
        if (v5Var != null && (w07 = v5Var.w0()) != null) {
            i17 = w07.f77444d;
        }
        kj6Var.f378768e = i17;
        kj6Var.f378770g = this.f75873o;
        ib5Var.f376902d = kj6Var;
        ib5Var.f376903e = true;
        ib5Var.f376904f = this.f75874p;
        ib5Var.f376906h = this.f75875q;
        ib5Var.f376907i = str3;
        ib5Var.f376908m = W0;
        lVar.f70664a = ib5Var;
        lVar.f70665b = new r45.jb5();
        lVar.f70666c = this.f75877s;
        lVar.f70667d = this.f75878t;
        p(lVar.a());
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.d(l17);
        return l17;
    }

    public final void s(boolean z17) {
        if (!com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            l().b(lm5.d.f319601b, new com.tencent.mm.plugin.appbrand.appcache.predownload.l(this, z17));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.appcache.predownload.k(this, z17));
    }

    public final void t() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ib5();
        lVar.f70665b = new r45.jb5();
        lVar.f70666c = this.f75877s;
        lVar.f70667d = this.f75878t;
        p(lVar.a());
    }

    public o(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        this.f75871m = str;
        this.f75872n = str2;
        this.f75873o = str3;
        this.f75874p = i17;
        this.f75875q = str4;
        this.f75876r = "MicroMsg.AppBrand.CgiPreDownloadCode(" + hashCode() + ')';
        this.f75877s = "/cgi-bin/mmbiz-bin/wxasync/wxaapp_predownloadcode";
        this.f75878t = 1479;
        this.f75880v = java.lang.System.currentTimeMillis();
    }
}
