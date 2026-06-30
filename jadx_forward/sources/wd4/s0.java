package wd4;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f526553a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f526554b;

    /* renamed from: c, reason: collision with root package name */
    public final wd4.t0 f526555c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f526556d;

    public s0(int i17, java.lang.String str, wd4.t0 t0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 2) != 0 ? null : str;
        t0Var = (i18 & 4) != 0 ? null : t0Var;
        z3Var = (i18 & 8) != 0 ? null : z3Var;
        this.f526553a = i17;
        this.f526554b = str;
        this.f526555c = t0Var;
        this.f526556d = z3Var;
    }

    public final wd4.t0 a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLabel", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLabel", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return this.f526555c;
    }

    /* renamed from: equals */
    public boolean m173555xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return true;
        }
        if (!(obj instanceof wd4.s0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        wd4.s0 s0Var = (wd4.s0) obj;
        if (this.f526553a != s0Var.f526553a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526554b, s0Var.f526554b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526555c, s0Var.f526555c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526556d, s0Var.f526556d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return b17;
    }

    /* renamed from: hashCode */
    public int m173556x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        int hashCode = java.lang.Integer.hashCode(this.f526553a) * 31;
        java.lang.String str = this.f526554b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        wd4.t0 t0Var = this.f526555c;
        int m173559x8cdac1b = (hashCode2 + (t0Var == null ? 0 : t0Var.m173559x8cdac1b())) * 31;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f526556d;
        int hashCode3 = m173559x8cdac1b + (z3Var != null ? z3Var.hashCode() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return hashCode3;
    }

    /* renamed from: toString */
    public java.lang.String m173557x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        java.lang.String str = "ItemInfo(type=" + this.f526553a + ", title=" + this.f526554b + ", label=" + this.f526555c + ", contact=" + this.f526556d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo");
        return str;
    }
}
