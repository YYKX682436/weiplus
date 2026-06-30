package oc4;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425902a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f425903b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f425904c;

    public v(java.lang.String indicator, java.util.ArrayList feedList, java.util.ArrayList userNames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indicator, "indicator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNames, "userNames");
        this.f425902a = indicator;
        this.f425903b = feedList;
        this.f425904c = userNames;
    }

    public final java.util.ArrayList a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedList", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedList", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return this.f425903b;
    }

    public final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return this.f425902a;
    }

    /* renamed from: equals */
    public boolean m151042xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return true;
        }
        if (!(obj instanceof oc4.v)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        }
        oc4.v vVar = (oc4.v) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425902a, vVar.f425902a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425903b, vVar.f425903b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425904c, vVar.f425904c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return b17;
    }

    /* renamed from: hashCode */
    public int m151043x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        int hashCode = (((this.f425902a.hashCode() * 31) + this.f425903b.hashCode()) * 31) + this.f425904c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m151044x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        java.lang.String str = "SnsUnreadTier(indicator=" + this.f425902a + ", feedList=" + this.f425903b + ", userNames=" + this.f425904c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return str;
    }
}
