package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class z3 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {

    /* renamed from: s, reason: collision with root package name */
    public final f54.f0 f244528s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f244529t;

    public z3(android.content.Context context, f54.f0 f0Var, android.view.ViewGroup viewGroup) {
        super(context, f0Var, viewGroup);
        this.f244528s = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        if (this.f246589n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "setPadding but contentView is null");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f246589n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ab4.d0 d0Var = this.f246583e;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) d0Var.f84354h, (int) d0Var.f84352f, (int) d0Var.f84355i, (int) d0Var.f84353g);
        }
        this.f246589n.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public android.view.View j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f246582d);
        this.f244529t = frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("customLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        return frameLayout;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
        if (this.f244529t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but layout is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
            return;
        }
        f54.f0 f0Var = this.f244528s;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but info is null");
        }
        try {
            this.f244529t.setBackgroundColor(android.graphics.Color.parseColor(f0Var.F));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingSeparatorComponent", "fillItem but exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSeparatorComponent");
    }
}
