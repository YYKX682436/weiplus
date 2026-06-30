package y54;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f541049a;

    /* renamed from: b, reason: collision with root package name */
    public int f541050b;

    /* renamed from: c, reason: collision with root package name */
    public int f541051c;

    public a(int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        this.f541049a = i17;
        this.f541050b = i18;
        this.f541051c = i19;
    }

    /* renamed from: equals */
    public boolean m176534xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return true;
        }
        if (!(obj instanceof y54.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return false;
        }
        y54.a aVar = (y54.a) obj;
        if (this.f541049a != aVar.f541049a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return false;
        }
        if (this.f541050b != aVar.f541050b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
            return false;
        }
        int i17 = this.f541051c;
        int i18 = aVar.f541051c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m176535x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        int hashCode = (((java.lang.Integer.hashCode(this.f541049a) * 31) + java.lang.Integer.hashCode(this.f541050b)) * 31) + java.lang.Integer.hashCode(this.f541051c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m176536x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        java.lang.String str = "ConfigData(orientation=" + this.f541049a + ", screenWidthDp=" + this.f541050b + ", screenHeightDp=" + this.f541051c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$ConfigData");
        return str;
    }
}
