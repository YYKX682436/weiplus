package n44;

/* loaded from: classes14.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public int f416540a;

    /* renamed from: b, reason: collision with root package name */
    public int f416541b;

    /* renamed from: c, reason: collision with root package name */
    public int f416542c;

    /* renamed from: d, reason: collision with root package name */
    public int f416543d;

    public o0(int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        this.f416540a = i17;
        this.f416541b = i18;
        this.f416542c = i19;
        this.f416543d = i27;
    }

    /* renamed from: equals */
    public boolean m149121xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return true;
        }
        if (!(obj instanceof n44.o0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        n44.o0 o0Var = (n44.o0) obj;
        if (this.f416540a != o0Var.f416540a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        if (this.f416541b != o0Var.f416541b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        if (this.f416542c != o0Var.f416542c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
            return false;
        }
        int i17 = this.f416543d;
        int i18 = o0Var.f416543d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m149122x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        int hashCode = (((((java.lang.Integer.hashCode(this.f416540a) * 31) + java.lang.Integer.hashCode(this.f416541b)) * 31) + java.lang.Integer.hashCode(this.f416542c)) * 31) + java.lang.Integer.hashCode(this.f416543d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m149123x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        java.lang.String str = "VideoInfo(videoDuration=" + this.f416540a + ", playTimeInterval=" + this.f416541b + ", playCount=" + this.f416542c + ", playCompletedCount=" + this.f416543d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$VideoInfo");
        return str;
    }
}
