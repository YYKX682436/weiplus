package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class f9 implements android.text.Html.ImageGetter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.h9 f246722a;

    public f9(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.h9 h9Var) {
        this.f246722a = h9Var;
    }

    @Override // android.text.Html.ImageGetter
    public android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        android.graphics.drawable.Drawable drawable;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1");
        java.lang.String l17 = za4.t0.l("adId", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17) || !com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            za4.t0.b("adId", str, false, 0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e9(this));
            drawable = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.h9 h9Var = this.f246722a;
            drawable = a84.z.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.i9.O(h9Var.f246774f).getResources(), l17);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicHeight() != 0 ? (drawable.getIntrinsicWidth() * ((int) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.i9.P(h9Var.f246774f).G)) / drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() != 0 ? (int) com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.i9.P(h9Var.f246774f).G : drawable.getIntrinsicHeight());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1");
        return drawable;
    }
}
