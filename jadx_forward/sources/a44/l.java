package a44;

/* loaded from: classes4.dex */
public final class l implements za4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f82826a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f82827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82828c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82829d;

    public l(java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        this.f82826a = str;
        this.f82827b = str2;
        this.f82828c = i17;
        this.f82829d = i18;
    }

    @Override // za4.h
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPkgRemoved", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledCallback", "pkg %s removed", str);
        java.lang.String str2 = this.f82826a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.util.concurrent.ConcurrentHashMap callbackIds = za4.k.g().f552673g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(callbackIds, "callbackIds");
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(callbackIds).remove(str2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f82827b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69792xee395170(str);
        }
        if (str2 != null) {
            i64.t.f370849d.a(str2, new i64.r(str2, 0, 0, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPkgRemoved", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
    }

    @Override // za4.h
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPkgInstalled", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledCallback", "pkg %s installed", str);
        za4.k g17 = za4.k.g();
        java.lang.String str2 = this.f82826a;
        g17.s(5, str2);
        za4.k.g().q(4001011, str2, new za4.g(this.f82828c));
        a44.m.a(this.f82829d, 106);
        if (str2 != null) {
            i64.t.f370849d.a(str2, new i64.r(str2, 5, 0, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPkgInstalled", "com.tencent.mm.plugin.sns.ad.download.ApkInstalledCallback");
    }
}
