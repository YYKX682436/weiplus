package sd4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f488222a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f488223b;

    public b(int i17, java.lang.String scrollWord, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        scrollWord = (i18 & 2) != 0 ? "idle" : scrollWord;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrollWord, "scrollWord");
        this.f488222a = i17;
        this.f488223b = scrollWord;
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f488223b = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
    }

    /* renamed from: equals */
    public boolean m164323xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return true;
        }
        if (!(obj instanceof sd4.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return false;
        }
        sd4.b bVar = (sd4.b) obj;
        if (this.f488222a != bVar.f488222a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488223b, bVar.f488223b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return b17;
    }

    /* renamed from: hashCode */
    public int m164324x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        int hashCode = (java.lang.Integer.hashCode(this.f488222a) * 31) + this.f488223b.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m164325x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        java.lang.String str = "ScrollState(scrollState=" + this.f488222a + ", scrollWord=" + this.f488223b + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return str;
    }
}
