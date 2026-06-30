package j94;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f380074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f380075b;

    /* renamed from: c, reason: collision with root package name */
    public final int f380076c;

    public a(java.lang.String iconUrl, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        this.f380074a = iconUrl;
        this.f380075b = i17;
        this.f380076c = i18;
    }

    /* renamed from: equals */
    public boolean m140504xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return true;
        }
        if (!(obj instanceof j94.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return false;
        }
        j94.a aVar = (j94.a) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380074a, aVar.f380074a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return false;
        }
        if (this.f380075b != aVar.f380075b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
            return false;
        }
        int i17 = this.f380076c;
        int i18 = aVar.f380076c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m140505x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        int hashCode = (((this.f380074a.hashCode() * 31) + java.lang.Integer.hashCode(this.f380075b)) * 31) + java.lang.Integer.hashCode(this.f380076c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m140506x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        java.lang.String str = "BrandIconRenderInfo(iconUrl=" + this.f380074a + ", widthDp=" + this.f380075b + ", heightDp=" + this.f380076c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        return str;
    }
}
