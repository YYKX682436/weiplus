package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class o implements za4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f246050a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f246051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f246052c;

    /* renamed from: d, reason: collision with root package name */
    public final int f246053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f246054e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e, java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        this.f246054e = binderC17870x451d307e;
        this.f246051b = str2;
        this.f246050a = str;
        this.f246052c = i17;
        this.f246053d = i18;
    }

    @Override // za4.h
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPkgRemoved", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "pkg %s removed", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(this.f246051b)) {
            this.f246054e.m69792xee395170(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPkgRemoved", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
    }

    @Override // za4.h
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "pkg %s installed", str);
        za4.k g17 = za4.k.g();
        java.lang.String str2 = this.f246050a;
        g17.s(5, str2);
        za4.k.g().q(4001011, str2, new za4.g(this.f246052c));
        a44.m.a(this.f246053d, 106);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
    }
}
