package m54;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f405781a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f405782b;

    public b0(int i17, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f405781a = i17;
        this.f405782b = value;
    }

    /* renamed from: equals */
    public boolean m146836xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            return true;
        }
        if (!(obj instanceof m54.b0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            return false;
        }
        m54.b0 b0Var = (m54.b0) obj;
        if (this.f405781a != b0Var.f405781a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f405782b, b0Var.f405782b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        return b17;
    }

    /* renamed from: hashCode */
    public int m146837x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        int hashCode = (java.lang.Integer.hashCode(this.f405781a) * 31) + this.f405782b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m146838x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        java.lang.String str = "VangoghDowngradeData(type=" + this.f405781a + ", value=" + this.f405782b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghDowngradeSupport$VangoghDowngradeData");
        return str;
    }
}
