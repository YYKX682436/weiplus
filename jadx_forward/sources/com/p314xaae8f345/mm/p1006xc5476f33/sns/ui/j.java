package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f250992a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f250993b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f250994c;

    /* renamed from: d, reason: collision with root package name */
    public i64.b1 f250995d;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f250997f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.animation.Animation f250998g;

    /* renamed from: i, reason: collision with root package name */
    public final ra4.b f251000i;

    /* renamed from: k, reason: collision with root package name */
    public final i74.i f251002k;

    /* renamed from: l, reason: collision with root package name */
    public final k74.i f251003l;

    /* renamed from: m, reason: collision with root package name */
    public final l74.m f251004m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f251005n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ListView f251006o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f251007p;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.AbsoluteLayout f250996e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f250999h = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f251001j = false;

    /* renamed from: q, reason: collision with root package name */
    public int f251008q = -1;

    /* JADX WARN: Removed duplicated region for block: B:9:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(android.content.Context r11, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i r12, android.widget.FrameLayout r13, android.view.View r14, ra4.b r15) {
        /*
            r10 = this;
            r10.<init>()
            r14 = 0
            r10.f250996e = r14
            r0 = 0
            r10.f250999h = r0
            r10.f251001j = r0
            r0 = -1
            r10.f251008q = r0
            r10.f250992a = r11
            r10.f251000i = r15
            r10.f250993b = r12
            r10.f250994c = r13
            android.view.animation.ScaleAnimation r13 = new android.view.animation.ScaleAnimation
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1
            r9 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f250997f = r13
            r13 = 2130772029(0x7f01003d, float:1.7147165E38)
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r11, r13)
            r10.f250997f = r13
            android.view.animation.ScaleAnimation r13 = new android.view.animation.ScaleAnimation
            r1 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1
            r8 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f250998g = r13
            r13 = 2130772030(0x7f01003e, float:1.7147167E38)
            android.view.animation.Animation r13 = android.view.animation.AnimationUtils.loadAnimation(r11, r13)
            r10.f250998g = r13
            java.lang.String r13 = "newInstance"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r15)
            java.lang.String r0 = "setTimelineClickListener"
            java.lang.String r1 = "create new feedback panel failed!"
            if (r11 == 0) goto L6f
            i74.i r2 = new i74.i     // Catch: java.lang.Throwable -> L68
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L68
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r15)     // Catch: java.lang.Throwable -> L69
            r2.f371030m = r12     // Catch: java.lang.Throwable -> L69
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r15)     // Catch: java.lang.Throwable -> L69
            goto L70
        L68:
            r2 = r14
        L69:
            java.lang.String r3 = "FeedbackPromptManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r1)
            goto L70
        L6f:
            r2 = r14
        L70:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r15)
            r10.f251002k = r2
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r15)
            if (r11 == 0) goto L91
            k74.i r2 = new k74.i     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L8c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r15)     // Catch: java.lang.Throwable -> L8b
            r2.f386336i = r12     // Catch: java.lang.Throwable -> L8b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r15)     // Catch: java.lang.Throwable -> L8b
            r14 = r2
            goto L91
        L8b:
            r14 = r2
        L8c:
            java.lang.String r0 = "FeedbackNewStylePromptManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
        L91:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r15)
            r10.f251003l = r14
            l74.m r13 = new l74.m
            r13.<init>(r11, r12)
            r10.f251004m = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j.<init>(android.content.Context, com.tencent.mm.plugin.sns.ui.listener.i, android.widget.FrameLayout, android.view.View, ra4.b):void");
    }

    public static /* synthetic */ boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        jVar.f250999h = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return z17;
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpUseNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        try {
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_new_style_feedback, 1) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpUseNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdNotLikeHelper", "isExpUseNewStyleFeedback, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpUseNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.View r24) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j.b(android.view.View):boolean");
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, ca4.j jVar) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        boolean z18 = false;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpDisableFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        try {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_disable_feedback_version2, 0) > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpDisableFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdNotLikeHelper", "isExpDisableFeedbackVer2, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpDisableFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        ca4.i iVar = jVar.f121485a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = iVar != null ? iVar.f121472a : null;
        if (c17903x3b438f4 == null) {
            c17903x3b438f4 = c17933xe8d1b226.m70354x74235b3e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowOpenPersonalizedVer2", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        if (c17903x3b438f4 == null || m70346x10413e67 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowOpenPersonalizedVer2", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        } else {
            z18 = c17903x3b438f4.f38236x79188aec.f441496g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowOpenPersonalizedVer2", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFeedbackVer2", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return z18;
    }

    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        boolean z19 = false;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        if (ca4.m0.d0()) {
            int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19920xc9deb7b2());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, debugEnv, cfgInt=" + h17);
            if (h17 == 0) {
                if (!c()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                    return false;
                }
            } else {
                if (h17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                    return true;
                }
                if (h17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
                    return false;
                }
            }
        } else if (!c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, exp=false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
            boolean m70100xbfbe13e0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771.m70100xbfbe13e0(m70346x10413e67);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            if (m70346x10413e67 != null) {
                z17 = m70346x10413e67.f38094x6a99a254;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSpecialPrompt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowOpenPersonalized", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            if (m70346x10413e67 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowOpenPersonalized", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z18 = false;
            } else {
                java.lang.String a17 = i74.e.a(m70346x10413e67);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                boolean z27 = m70346x10413e67.f38096x9a2e5c1b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPersonalizedAdClose", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
                z18 = z27 && i74.a.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowOpenPersonalized", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDataSupplier");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, isXmlNewStyle=" + m70100xbfbe13e0 + ", isSpecialAd=" + z17 + ", isShowOpenPersonalized=" + z18);
            if (m70100xbfbe13e0 && !z17 && !z18) {
                z19 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return z19;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdNotLikeHelper", "isNewStyleFeedback, exp=" + e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNewStyleFeedback", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return false;
        }
    }

    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        if (this.f251000i != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.vj().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAbTestRunner", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAbTestRunner", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        }
        android.widget.AbsoluteLayout absoluteLayout = this.f250996e;
        if (absoluteLayout != null) {
            this.f250994c.removeView(absoluteLayout);
            this.f250996e = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            return true;
        }
        this.f250999h = false;
        this.f251006o = null;
        this.f251007p = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return false;
    }

    public boolean g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showUnLikeReasonList", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        int height = this.f251005n.getHeight();
        this.f251005n.setVisibility(8);
        int i17 = 0;
        android.view.View view = null;
        for (int i18 = 0; i18 < this.f251006o.getAdapter().getCount(); i18++) {
            view = this.f251006o.getAdapter().getView(i18, view, null);
            view.measure(this.f251007p.getWidth(), -2);
            i17 += view.getMeasuredHeight();
        }
        ((android.widget.RelativeLayout.LayoutParams) this.f251006o.getLayoutParams()).bottomMargin = height - i17;
        this.f251006o.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h(this, height, i17);
        hVar.setDuration(250L);
        this.f251006o.startAnimation(hVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showUnLikeReasonList", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        return true;
    }
}
