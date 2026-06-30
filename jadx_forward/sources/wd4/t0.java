package wd4;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f526560a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f526561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f526562c;

    public t0(int i17, java.lang.String name, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f526560a = i17;
        this.f526561b = name;
        this.f526562c = i18;
    }

    /* renamed from: equals */
    public boolean m173558xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return true;
        }
        if (!(obj instanceof wd4.t0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        }
        wd4.t0 t0Var = (wd4.t0) obj;
        if (this.f526560a != t0Var.f526560a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526561b, t0Var.f526561b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
            return false;
        }
        int i17 = this.f526562c;
        int i18 = t0Var.f526562c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m173559x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        int hashCode = (((java.lang.Integer.hashCode(this.f526560a) * 31) + this.f526561b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f526562c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m173560x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        java.lang.String str = "LabelInfo(id=" + this.f526560a + ", name=" + this.f526561b + ", count=" + this.f526562c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo");
        return str;
    }
}
