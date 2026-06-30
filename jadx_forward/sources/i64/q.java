package i64;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 f370820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f370821b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f370822c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f370823d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f370824e;

    /* renamed from: f, reason: collision with root package name */
    public int f370825f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 adInfo, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 adXml, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 timelineObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adXml, "adXml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineObj, "timelineObj");
        this.f370820a = adInfo;
        this.f370821b = adXml;
        this.f370822c = timelineObj;
        r45.a90 a90Var = timelineObj.f39014x86965dde;
        boolean z17 = true;
        if (!(a90Var != null && a90Var.f451370e == 5)) {
            if (!(a90Var != null && a90Var.f451370e == 15)) {
                z17 = false;
            }
        }
        this.f370823d = z17;
    }

    public static final i64.q a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        i64.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226 != null ? c17933xe8d1b226.m70346x10413e67() : null;
        if (m70346x10413e67 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        } else if (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
            if (m70371x485d7 != null) {
                qVar = new i64.q(m70346x10413e67, m70354x74235b3e, m70371x485d7);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
                return qVar;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        }
        qVar = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
        return qVar;
    }
}
