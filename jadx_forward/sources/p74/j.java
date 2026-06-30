package p74;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final float f434097a;

    /* renamed from: b, reason: collision with root package name */
    public final float f434098b;

    public j(float f17, float f18, float f19, float f27) {
        this.f434097a = f17;
        this.f434098b = f18;
    }

    /* renamed from: equals */
    public boolean m157937xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return true;
        }
        if (!(obj instanceof p74.j)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        p74.j jVar = (p74.j) obj;
        if (java.lang.Float.compare(this.f434097a, jVar.f434097a) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        if (java.lang.Float.compare(this.f434098b, jVar.f434098b) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        if (java.lang.Float.compare(28.0f, 28.0f) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            return false;
        }
        int compare = java.lang.Float.compare(24.0f, 24.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        return compare == 0;
    }

    /* renamed from: hashCode */
    public int m157938x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        int hashCode = (((((java.lang.Float.hashCode(this.f434097a) * 31) + java.lang.Float.hashCode(this.f434098b)) * 31) + java.lang.Float.hashCode(28.0f)) * 31) + java.lang.Float.hashCode(24.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m157939x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        java.lang.String str = "CardSizeInfo(widthDp=" + this.f434097a + ", heightDp=" + this.f434098b + ", exposeDistance2Dp=28.0, exposeDistance3Dp=24.0)";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
        return str;
    }
}
