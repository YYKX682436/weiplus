package j84;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f379700a;

    /* renamed from: b, reason: collision with root package name */
    public final float f379701b;

    /* renamed from: c, reason: collision with root package name */
    public final float f379702c;

    /* renamed from: d, reason: collision with root package name */
    public float f379703d;

    public a(float f17, float f18, float f19, float f27) {
        this.f379700a = f17;
        this.f379701b = f18;
        this.f379702c = f19;
        this.f379703d = f27;
    }

    /* renamed from: equals */
    public boolean m140461xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return true;
        }
        if (!(obj instanceof j84.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        j84.a aVar = (j84.a) obj;
        if (java.lang.Float.compare(this.f379700a, aVar.f379700a) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        if (java.lang.Float.compare(this.f379701b, aVar.f379701b) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        if (java.lang.Float.compare(this.f379702c, aVar.f379702c) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
            return false;
        }
        int compare = java.lang.Float.compare(this.f379703d, aVar.f379703d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        return compare == 0;
    }

    /* renamed from: hashCode */
    public int m140462x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        int hashCode = (((((java.lang.Float.hashCode(this.f379700a) * 31) + java.lang.Float.hashCode(this.f379701b)) * 31) + java.lang.Float.hashCode(this.f379702c)) * 31) + java.lang.Float.hashCode(this.f379703d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m140463x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        java.lang.String str = "PeekCircle(x=" + this.f379700a + ", y=" + this.f379701b + ", radius=" + this.f379702c + ", scale=" + this.f379703d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardAnimationManager$PeekCircle");
        return str;
    }
}
