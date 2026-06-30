package s34;

/* loaded from: classes4.dex */
public final class i1 {

    /* renamed from: c, reason: collision with root package name */
    public static final s34.h1 f484202c = new s34.h1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f484203a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f484204b;

    public i1(java.lang.String color, java.lang.String colorDark) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(color, "color");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorDark, "colorDark");
        this.f484203a = color;
        this.f484204b = colorDark;
    }

    /* renamed from: equals */
    public boolean m163788xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
            return true;
        }
        if (!(obj instanceof s34.i1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
            return false;
        }
        s34.i1 i1Var = (s34.i1) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f484203a, i1Var.f484203a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f484204b, i1Var.f484204b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        return b17;
    }

    /* renamed from: hashCode */
    public int m163789x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        int hashCode = (this.f484203a.hashCode() * 31) + this.f484204b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m163790x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        java.lang.String str = "ColorInfo(color=" + this.f484203a + ", colorDark=" + this.f484204b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.adxml.ColorInfo");
        return str;
    }

    public /* synthetic */ i1(java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2);
    }
}
