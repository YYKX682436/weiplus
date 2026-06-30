package nc4;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f417687a;

    /* renamed from: b, reason: collision with root package name */
    public int f417688b;

    /* renamed from: c, reason: collision with root package name */
    public int f417689c;

    /* renamed from: d, reason: collision with root package name */
    public int f417690d;

    public i(int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        this.f417687a = i17;
        this.f417688b = i18;
        this.f417689c = i19;
        this.f417690d = i27;
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        int i17 = this.f417687a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return i17;
    }

    /* renamed from: equals */
    public boolean m149398xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return true;
        }
        if (!(obj instanceof nc4.i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        nc4.i iVar = (nc4.i) obj;
        if (this.f417687a != iVar.f417687a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        if (this.f417688b != iVar.f417688b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        if (this.f417689c != iVar.f417689c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            return false;
        }
        int i17 = this.f417690d;
        int i18 = iVar.f417690d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m149399x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        int hashCode = (((((java.lang.Integer.hashCode(this.f417687a) * 31) + java.lang.Integer.hashCode(this.f417688b)) * 31) + java.lang.Integer.hashCode(this.f417689c)) * 31) + java.lang.Integer.hashCode(this.f417690d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m149400x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        java.lang.String str = "FinderEntranceData(finderEntranceEnableType=" + this.f417687a + ", finderEntranceMaxCountNoUser=" + this.f417688b + ", finderEntranceMaxCountNoFeed=" + this.f417689c + ", finderEntranceMaxCountNormal=" + this.f417690d + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
        return str;
    }
}
