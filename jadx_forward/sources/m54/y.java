package m54;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f405848a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f405849b;

    /* renamed from: c, reason: collision with root package name */
    public final long f405850c;

    public y(java.lang.String dynamicCanvas, java.lang.String onetimeCanvas, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicCanvas, "dynamicCanvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onetimeCanvas, "onetimeCanvas");
        this.f405848a = dynamicCanvas;
        this.f405849b = onetimeCanvas;
        this.f405850c = j17;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return this.f405848a;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return this.f405849b;
    }

    /* renamed from: equals */
    public boolean m146852xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return true;
        }
        if (!(obj instanceof m54.y)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return false;
        }
        m54.y yVar = (m54.y) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f405848a, yVar.f405848a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f405849b, yVar.f405849b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
            return false;
        }
        long j17 = this.f405850c;
        long j18 = yVar.f405850c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return j17 == j18;
    }

    /* renamed from: hashCode */
    public int m146853x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        int hashCode = (((this.f405848a.hashCode() * 31) + this.f405849b.hashCode()) * 31) + java.lang.Long.hashCode(this.f405850c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m146854x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        java.lang.String str = "PageElement(dynamicCanvas=" + this.f405848a + ", onetimeCanvas=" + this.f405849b + ", localCacheTime=" + this.f405850c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.PageElement");
        return str;
    }
}
