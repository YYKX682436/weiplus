package yc4;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f542407a;

    /* renamed from: b, reason: collision with root package name */
    public final long f542408b;

    /* renamed from: c, reason: collision with root package name */
    public int f542409c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f542410d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f542411e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f542412f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f542413g;

    public v(java.lang.String sessionId, long j17, int i17, java.util.HashMap feedLikeMap, java.util.HashMap feedCommentMap, java.util.HashMap feedClickList, java.util.HashMap feedBrowseTimeMsMap, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        feedLikeMap = (i18 & 8) != 0 ? new java.util.HashMap() : feedLikeMap;
        feedCommentMap = (i18 & 16) != 0 ? new java.util.HashMap() : feedCommentMap;
        feedClickList = (i18 & 32) != 0 ? new java.util.HashMap() : feedClickList;
        feedBrowseTimeMsMap = (i18 & 64) != 0 ? new java.util.HashMap() : feedBrowseTimeMsMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLikeMap, "feedLikeMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedCommentMap, "feedCommentMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedClickList, "feedClickList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedBrowseTimeMsMap, "feedBrowseTimeMsMap");
        this.f542407a = sessionId;
        this.f542408b = j17;
        this.f542409c = i17;
        this.f542410d = feedLikeMap;
        this.f542411e = feedCommentMap;
        this.f542412f = feedClickList;
        this.f542413g = feedBrowseTimeMsMap;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSessionId", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSessionId", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return this.f542407a;
    }

    /* renamed from: equals */
    public boolean m176813xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return true;
        }
        if (!(obj instanceof yc4.v)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        yc4.v vVar = (yc4.v) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542407a, vVar.f542407a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (this.f542408b != vVar.f542408b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (this.f542409c != vVar.f542409c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542410d, vVar.f542410d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542411e, vVar.f542411e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542412f, vVar.f542412f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542413g, vVar.f542413g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return b17;
    }

    /* renamed from: hashCode */
    public int m176814x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        int hashCode = (((((((((((this.f542407a.hashCode() * 31) + java.lang.Long.hashCode(this.f542408b)) * 31) + java.lang.Integer.hashCode(this.f542409c)) * 31) + this.f542410d.hashCode()) * 31) + this.f542411e.hashCode()) * 31) + this.f542412f.hashCode()) * 31) + this.f542413g.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m176815x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        java.lang.String str = "Report16242Data(sessionId=" + this.f542407a + ", localNewestFeedId=" + this.f542408b + ", newFeedCount=" + this.f542409c + ", feedLikeMap=" + this.f542410d + ", feedCommentMap=" + this.f542411e + ", feedClickList=" + this.f542412f + ", feedBrowseTimeMsMap=" + this.f542413g + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
        return str;
    }
}
