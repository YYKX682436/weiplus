package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.ref.WeakReference f246363k = new java.lang.ref.WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    public int f246364a;

    /* renamed from: c, reason: collision with root package name */
    public int f246366c;

    /* renamed from: d, reason: collision with root package name */
    public int f246367d;

    /* renamed from: e, reason: collision with root package name */
    public long f246368e;

    /* renamed from: f, reason: collision with root package name */
    public long f246369f;

    /* renamed from: h, reason: collision with root package name */
    public int f246371h;

    /* renamed from: i, reason: collision with root package name */
    public int f246372i;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f246365b = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f246370g = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f246373j = new java.util.HashSet();

    public final void a(java.lang.String userName) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initWithUserName", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f246370g = userName;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, c01.z1.r())) {
            this.f246372i = 1;
        } else {
            this.f246372i = 2;
        }
        this.f246368e = java.lang.System.currentTimeMillis();
        r45.cb6 b17 = p94.w0.c() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(userName) : null;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnSProfileReporter", "userinfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWithUserName", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        boolean z17 = (b17.f452964g & 4096) > 0;
        int i17 = b17.f452965h;
        if (i17 == 4320 && z17) {
            this.f246371h = 1;
        } else if (i17 == 72 && z17) {
            this.f246371h = 3;
        } else if (i17 == 720 && z17) {
            this.f246371h = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initWithUserName", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFeedClick", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFeedClick", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        try {
            java.lang.String s07 = ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e);
            int i17 = c17933xe8d1b226.f68895x2262335f;
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", s07);
            gVar.o("sendtype", i17);
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            java.util.HashSet hashSet = this.f246373j;
            hashSet.add(gVar2);
            if (this.f246367d != hashSet.size()) {
                this.f246367d = hashSet.size();
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f246364a)), new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f246372i)), new jz5.l("associate_username", this.f246370g), new jz5.l("snsalbumsid", this.f246365b), new jz5.l("send_type_sns", java.lang.Integer.valueOf(i17)), new jz5.l("sns_feed_id", s07), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f246371h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f246366c)), new jz5.l("is_pin_feed", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) mo11468x92b714fd).f38980x988ba8e)));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w("SnSProfileReporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            wVar.a("view_clk", "sns_feed", i18);
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SnSProfileReporter", e17, "onFeedClick error: " + c17933xe8d1b226.f68891x29d1292e, new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFeedClick", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.lang.String s07;
        int i17;
        java.lang.String gVar;
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        try {
            s07 = ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e);
            i17 = c17933xe8d1b226.f68895x2262335f;
            cl0.g gVar2 = new cl0.g();
            gVar2.h("feedid", s07);
            gVar2.o("sendtype", i17);
            gVar = gVar2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
            hashSet = this.f246373j;
        } catch (cl0.f e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("SnSProfileReporter", e17, "onFeedExposure error: " + c17933xe8d1b226.f68891x29d1292e, new java.lang.Object[0]);
        }
        if (hashSet.contains(gVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        hashSet.add(gVar);
        if (this.f246367d != hashSet.size()) {
            this.f246367d = hashSet.size();
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(c17933xe8d1b226.f68881x4c58c87d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f246364a)), new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f246372i)), new jz5.l("associate_username", this.f246370g), new jz5.l("snsalbumsid", this.f246365b), new jz5.l("send_type_sns", java.lang.Integer.valueOf(i17)), new jz5.l("sns_feed_id", s07), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f246371h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f246366c)), new jz5.l("is_pin_feed", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) mo11468x92b714fd).f38980x988ba8e)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w("SnSProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        wVar.a("view_exp", "sns_feed", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        f246363k = new java.lang.ref.WeakReference(this);
        this.f246369f = java.lang.System.currentTimeMillis();
        f("page_in", kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f246364a)), new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f246372i)), new jz5.l("associate_username", this.f246370g), new jz5.l("snsalbumsid", this.f246365b), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f246371h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f246366c))));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f246369f;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f246368e;
        jz5.l lVar = new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f246364a));
        jz5.l lVar2 = new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f246372i));
        jz5.l lVar3 = new jz5.l("associate_username", this.f246370g);
        jz5.l lVar4 = new jz5.l("feeddepth", java.lang.Integer.valueOf(this.f246367d));
        jz5.l lVar5 = new jz5.l("snsalbumsid", this.f246365b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildSnsFeedList", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.util.HashSet hashSet = this.f246373j;
        sb6.append(kz5.n0.g0(hashSet, "#", null, null, 0, null, null, 62, null));
        sb6.append('}');
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildSnsFeedList", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        f("page_out", kz5.c1.i(lVar, lVar2, lVar3, lVar4, lVar5, new jz5.l("sns_feed_list", sb7), new jz5.l("stay_time", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("snsalbum_ms", java.lang.Long.valueOf(currentTimeMillis2)), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f246371h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f246366c))));
        hashSet.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void f(java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        int i17 = this.f246366c;
        int i18 = i17 != 2 ? i17 != 9 ? 0 : 50331 : 50330;
        java.util.Objects.toString(ri.l0.a(map));
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a0(i18, str, map));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }
}
