package n44;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f416537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f416538b;

    public n0(int i17, int i18) {
        this.f416537a = i17;
        this.f416538b = i18;
    }

    /* renamed from: equals */
    public boolean m149118xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
            return true;
        }
        if (!(obj instanceof n44.n0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
            return false;
        }
        n44.n0 n0Var = (n44.n0) obj;
        if (this.f416537a != n0Var.f416537a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
            return false;
        }
        int i17 = this.f416538b;
        int i18 = n0Var.f416538b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m149119x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        int hashCode = (java.lang.Integer.hashCode(this.f416537a) * 31) + java.lang.Integer.hashCode(this.f416538b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m149120x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        java.lang.String str = "GridItem(index=" + this.f416537a + ", exposureCount=" + this.f416538b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageStatistic$GridItem");
        return str;
    }
}
