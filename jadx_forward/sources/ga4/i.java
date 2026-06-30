package ga4;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str) {
        super(0);
        this.f351457d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        java.lang.String str = this.f351457d;
        if (str != null) {
            ga4.m mVar = ga4.m.f351461a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            ga4.c cVar = new ga4.c(str, new java.util.ArrayList());
            q26.l lVar = new q26.l((q26.m) r26.t.c(ga4.m.f351468h, str, 0, 2, null));
            while (lVar.hasNext()) {
                r26.q qVar = (r26.q) ((r26.m) lVar.next());
                java.util.Collection collection = qVar.f450444c;
                if (collection != null && ((kz5.b) collection).d() > 1) {
                    r26.k e17 = ((r26.p) qVar.f450444c).e(1);
                    if (r26.i0.q(e17 != null ? e17.f450433a : null, qVar.c(), false, 2, null)) {
                        java.util.Objects.toString(qVar.b());
                        qVar.c();
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                cVar.f351440b.add(new ga4.a(qVar.b().f327742d, qVar.b().f327743e, qVar.c()));
                java.util.Objects.toString(qVar.b());
                qVar.c();
            }
            synchronized (ga4.m.f351463c) {
                try {
                    r2Var = ga4.m.f351462b;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    throw th6;
                }
            }
            android.os.SystemClock.elapsedRealtime();
            r2Var.m77804x35e001();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
        return f0Var;
    }
}
