package zd4;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f553178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f553179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f553180c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f553181d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.CharSequence f553182e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f553183f;

    public r(int i17, int i18, int i19, java.util.List childItems, java.lang.CharSequence customTitle, java.lang.String customSubTitle, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        customTitle = (i27 & 16) != 0 ? "" : customTitle;
        customSubTitle = (i27 & 32) != 0 ? "" : customSubTitle;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childItems, "childItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customTitle, "customTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customSubTitle, "customSubTitle");
        this.f553178a = i17;
        this.f553179b = i18;
        this.f553180c = i19;
        this.f553181d = childItems;
        this.f553182e = customTitle;
        this.f553183f = customSubTitle;
    }

    /* renamed from: equals */
    public boolean m178734xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return true;
        }
        if (!(obj instanceof zd4.r)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        zd4.r rVar = (zd4.r) obj;
        if (this.f553178a != rVar.f553178a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (this.f553179b != rVar.f553179b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (this.f553180c != rVar.f553180c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553181d, rVar.f553181d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553182e, rVar.f553182e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553183f, rVar.f553183f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return b17;
    }

    /* renamed from: hashCode */
    public int m178735x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        int hashCode = (((((((((java.lang.Integer.hashCode(this.f553178a) * 31) + java.lang.Integer.hashCode(this.f553179b)) * 31) + java.lang.Integer.hashCode(this.f553180c)) * 31) + this.f553181d.hashCode()) * 31) + this.f553182e.hashCode()) * 31) + this.f553183f.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m178736x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        java.lang.String str = "SelectVisibleGroupHeaderConfigItem(visibleState=" + this.f553178a + ", titleResId=" + this.f553179b + ", subTitleResId=" + this.f553180c + ", childItems=" + this.f553181d + ", customTitle=" + ((java.lang.Object) this.f553182e) + ", customSubTitle=" + this.f553183f + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        return str;
    }
}
