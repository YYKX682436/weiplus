package v74;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f515419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f515420b;

    /* renamed from: c, reason: collision with root package name */
    public final int f515421c;

    /* renamed from: d, reason: collision with root package name */
    public final int f515422d;

    public s(int i17, int i18, int i19, int i27) {
        this.f515419a = i17;
        this.f515420b = i18;
        this.f515421c = i19;
        this.f515422d = i27;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return this.f515421c;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSplashCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSplashCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return this.f515419a;
    }

    /* renamed from: equals */
    public boolean m171252xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return true;
        }
        if (!(obj instanceof v74.s)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        v74.s sVar = (v74.s) obj;
        if (this.f515419a != sVar.f515419a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        if (this.f515420b != sVar.f515420b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        if (this.f515421c != sVar.f515421c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
            return false;
        }
        int i17 = this.f515422d;
        int i18 = sVar.f515422d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m171253x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        int hashCode = (((((java.lang.Integer.hashCode(this.f515419a) * 31) + java.lang.Integer.hashCode(this.f515420b)) * 31) + java.lang.Integer.hashCode(this.f515421c)) * 31) + java.lang.Integer.hashCode(this.f515422d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m171254x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        java.lang.String str = "ItemSize(splashCardWidth=" + this.f515419a + ", splashCardHeight=" + this.f515420b + ", itemCardWidth=" + this.f515421c + ", itemCardHeight=" + this.f515422d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize");
        return str;
    }
}
