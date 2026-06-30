package yc4;

/* loaded from: classes4.dex */
public final class u extends yc4.f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static int f542402m = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f542403f;

    /* renamed from: g, reason: collision with root package name */
    public int f542404g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f542405h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f542406i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w1 uic) {
        super(uic);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        this.f542405h = "";
        this.f542406i = "";
    }

    @Override // yc4.f
    public void b(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        yc4.t tVar = new yc4.t(this, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        oz5.m mVar = oz5.m.f431862d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = id4.a.f372460a;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, mVar, null, tVar, 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.j1.n().f354821b.a(211, this);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).getClass();
        jx3.a a17 = zy1.e.f558858a.a(12076, true);
        if (a17 != null) {
            a17.j("BrowseTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "StartBrowseTime", java.lang.Long.valueOf(currentTimeMillis));
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "EnterObjectId", java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }

    @Override // yc4.f
    public void c() {
        long longValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        super.c();
        zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
        fVar.getClass();
        zy1.e eVar = zy1.e.f558858a;
        jx3.a a17 = eVar.a(12076, true);
        if (a17 != null) {
            java.lang.Object f17 = a17.f("BrowseTime");
            if (f17 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) f17).intValue();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f17, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) f17).longValue();
            }
            a17.j("BrowseTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - longValue));
        }
        fVar.Ri(12076, "BrowseNewFeedCount", java.lang.Integer.valueOf(this.f542404g));
        fVar.Ri(12076, "StartBrowseSnsObjectId", this.f542406i);
        fVar.Ri(12076, "EndBrowseSnsObjectId", this.f542405h);
        fVar.Ui(12076, "ClickFeedIdList", "ClickFeedId");
        fVar.Ui(12076, "ExposeFeedIdList", "ExposeFeedCount");
        fVar.Ui(12076, "FavFeedIdList", "FavFeedCount");
        fVar.Ui(12076, "ClickAlbumUserList", "ClickAlbumCount");
        fVar.Ui(12076, "ForwardFeedIdList", "ForwardFeedIdCount");
        fVar.Ui(12076, "ClickAvatarFeedIdList", "ClickAvatarFeedIdCount");
        fVar.Ui(12076, "ClickNickNameFeedIdList", "NickNameFeedIdCount");
        fVar.Ui(12076, "ForwardToSingleChatFeedIdList", "ForwardToSingleChatFeedIdCount");
        fVar.Ui(12076, "ForwardToChatRoomFeedIdList", "ForwardToChatRoomFeedIdCount");
        fVar.Ri(12076, "contactCount", java.lang.Integer.valueOf(f542402m));
        int longValue2 = (int) ((java.lang.Number) fVar.wi(12076, "BrowseTime", 0L)).longValue();
        int longValue3 = (int) ((java.lang.Number) fVar.wi(12076, "BackGroundTime", 0L)).longValue();
        i64.u1.a(2000, longValue2);
        i64.u1.a(2001, longValue3);
        i64.u1.a(2002, longValue2 - longValue3);
        jx3.a a18 = eVar.a(12076, false);
        if (a18 == null) {
            zy1.e.f558861d.remove(12076);
            zy1.e.f558859b.remove(12076);
        } else {
            java.util.HashSet<zy1.h> hashSet = (java.util.HashSet) zy1.e.f558861d.get(12076);
            if (hashSet != null) {
                for (zy1.h hVar : hashSet) {
                    java.lang.String str = hVar.f558865a;
                    java.util.HashSet hashSet2 = hVar.f558866b;
                    a18.j(str, java.lang.Integer.valueOf(hashSet2.size()));
                    hashSet2.size();
                }
            }
            java.util.Iterator it = zy1.e.f558860c.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                java.lang.Object key = ((java.util.Map.Entry) next).getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                if (r26.n0.B((java.lang.CharSequence) key, java.lang.String.valueOf(12076), false)) {
                    it.remove();
                }
            }
            a18.m();
            a18.k();
            zy1.e.f558861d.remove(12076);
            zy1.e.f558859b.remove(12076);
        }
        gm0.j1.n().f354821b.q(211, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }

    @Override // yc4.f
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        zy1.e.f558858a.c(12076, "BrowseTimeLineTime");
    }

    @Override // yc4.f
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseMyAlbumTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseOtherAlbumTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseMessageListTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "ClickNewPostTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseFullScreenImageTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseFullScreenSightTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseMPArticleTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseExternalArticleTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdFullScreenTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdCanvasPageTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdShortVideoTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdLongVideoTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseForwardAdLongVideoTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "FinderFeedTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "MusicPlayerFeedTime");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        zy1.e.f558858a.d(12076, "BrowseTimeLineTime");
    }

    @Override // yc4.f
    public void f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 struct, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        java.util.Iterator it = struct.a().iterator();
        while (it.hasNext()) {
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "BrowseFeedCount", ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.o0) it.next()).a().n().a1());
        }
        if (struct.a().isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
            return;
        }
        java.lang.String a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.o0) kz5.n0.i0(struct.a())).a().n().a1();
        java.lang.String a18 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.o0) kz5.n0.X(struct.a())).a().n().a1();
        if ((this.f542405h.length() == 0) || a17.compareTo(this.f542405h) < 0) {
            this.f542405h = a17;
        }
        if ((this.f542406i.length() == 0) || a18.compareTo(this.f542406i) > 0) {
            this.f542406i = a18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        boolean z17 = false;
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 211) {
            z17 = true;
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3 h3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h3) m1Var;
            if (h3Var.C()) {
                java.util.LinkedList linkedList = h3Var.I().f468703f;
                if (linkedList.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
                    return;
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) it.next()).Id > this.f542403f) {
                        this.f542404g++;
                    }
                }
                this.f542403f = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) linkedList.getFirst()).Id;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }
}
