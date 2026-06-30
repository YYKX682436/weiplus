package ga4;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f351446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f351447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f351450h;

    public e(long j17, int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f351446d = j17;
        this.f351447e = i17;
        this.f351448f = str;
        this.f351449g = i18;
        this.f351450h = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        long j17 = this.f351446d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = Fj != null ? Fj.W0(j17) : null;
        if (W0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2$1");
            return;
        }
        int i17 = W0.m70377x3172ed() ? 2 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(W0.m70374x6bf53a6c()) ? 3 : 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6895xfcd09b91 c6895xfcd09b91 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6895xfcd09b91();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6895xfcd09b91.f142106d = c6895xfcd09b91.b("SessionID", v52.c.g().d(), true);
        c6895xfcd09b91.f142107e = c6895xfcd09b91.b("FeedID", java.lang.String.valueOf(j17), true);
        c6895xfcd09b91.f142108f = c6895xfcd09b91.b("FeedUin", W0.m70374x6bf53a6c(), true);
        c6895xfcd09b91.f142109g = c6895xfcd09b91.b("CreatedCommentID", java.lang.String.valueOf(this.f351447e), true);
        c6895xfcd09b91.f142110h = c6895xfcd09b91.b("HotWord", this.f351448f, true);
        c6895xfcd09b91.f142111i = 1;
        c6895xfcd09b91.f142112j = this.f351449g;
        c6895xfcd09b91.f142113k = 2L;
        c6895xfcd09b91.f142114l = i17;
        c6895xfcd09b91.f142115m = this.f351450h.f391649d;
        c6895xfcd09b91.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$buildKeywordSpan$2$1");
    }
}
