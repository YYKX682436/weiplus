package wd4;

/* loaded from: classes11.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f526595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f526596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f526597c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f526598d;

    public y0(int i17, int i18, int i19, java.lang.String rawName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawName, "rawName");
        this.f526595a = i17;
        this.f526596b = i18;
        this.f526597c = i19;
        this.f526598d = rawName;
    }

    /* renamed from: equals */
    public boolean m173561xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return true;
        }
        if (!(obj instanceof wd4.y0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        wd4.y0 y0Var = (wd4.y0) obj;
        if (this.f526595a != y0Var.f526595a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        if (this.f526596b != y0Var.f526596b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        if (this.f526597c != y0Var.f526597c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526598d, y0Var.f526598d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return b17;
    }

    /* renamed from: hashCode */
    public int m173562x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        int hashCode = (((((java.lang.Integer.hashCode(this.f526595a) * 31) + java.lang.Integer.hashCode(this.f526596b)) * 31) + java.lang.Integer.hashCode(this.f526597c)) * 31) + this.f526598d.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m173563x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        java.lang.String str = "MenuItem(nameResId=" + this.f526595a + ", rawResId=" + this.f526596b + ", colorResId=" + this.f526597c + ", rawName=" + this.f526598d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
        return str;
    }

    public /* synthetic */ y0(int i17, int i18, int i19, java.lang.String str, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i27 & 2) != 0 ? -1 : i18, (i27 & 4) != 0 ? -1 : i19, (i27 & 8) != 0 ? "" : str);
    }
}
