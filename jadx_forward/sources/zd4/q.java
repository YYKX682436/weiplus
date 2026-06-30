package zd4;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f553174a;

    /* renamed from: b, reason: collision with root package name */
    public final int f553175b;

    /* renamed from: c, reason: collision with root package name */
    public final int f553176c;

    /* renamed from: d, reason: collision with root package name */
    public final int f553177d;

    public q(int i17, int i18, int i19, int i27) {
        this.f553174a = i17;
        this.f553175b = i18;
        this.f553176c = i19;
        this.f553177d = i27;
    }

    /* renamed from: equals */
    public boolean m178731xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return true;
        }
        if (!(obj instanceof zd4.q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        zd4.q qVar = (zd4.q) obj;
        if (this.f553174a != qVar.f553174a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        if (this.f553175b != qVar.f553175b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        if (this.f553176c != qVar.f553176c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            return false;
        }
        int i17 = this.f553177d;
        int i18 = qVar.f553177d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m178732x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        int hashCode = (((((java.lang.Integer.hashCode(this.f553174a) * 31) + java.lang.Integer.hashCode(this.f553175b)) * 31) + java.lang.Integer.hashCode(this.f553176c)) * 31) + java.lang.Integer.hashCode(this.f553177d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m178733x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        java.lang.String str = "SelectVisibleGroupChildConfigItem(visibleState=" + this.f553174a + ", childKey=" + this.f553175b + ", titleResId=" + this.f553176c + ", subTitleResId=" + this.f553177d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        return str;
    }
}
