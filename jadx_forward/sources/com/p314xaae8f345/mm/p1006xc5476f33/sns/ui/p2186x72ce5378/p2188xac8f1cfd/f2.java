package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class f2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4, com.p314xaae8f345.mm.p944x882e457a.u0, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final i64.b1 f250327d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f250328e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 f250329f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f250330g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f250331h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f250332i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f250333m;

    /* renamed from: n, reason: collision with root package name */
    public int f250334n;

    /* renamed from: o, reason: collision with root package name */
    public int f250335o;

    /* renamed from: p, reason: collision with root package name */
    public wu5.c f250336p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.c2 f250337q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f250327d = new i64.b1(activity, 0);
        this.f250330g = new java.util.HashMap();
        this.f250331h = new java.util.HashMap();
        this.f250332i = new java.util.ArrayList();
        this.f250333m = new java.util.HashMap();
        this.f250337q = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.c2(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4
    public boolean L5(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vx vxVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f250329f;
        if (l1Var != null && (jVar = l1Var.f251251s) != null) {
            jVar.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = this.f250329f;
        if (l1Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var = l1Var2.f251253u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            if (m7Var != null) {
                m7Var.c();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var3 = this.f250329f;
        boolean a17 = (l1Var3 == null || (vxVar = l1Var3.f251250r) == null) ? false : vxVar.a(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return a17;
    }

    /* JADX WARN: Finally extract failed */
    public final void O6() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseADAbout", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        i64.b1 b1Var = this.f250327d;
        b1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStatistic", "--clear--");
        java.util.Iterator it = new java.util.HashSet(((java.util.HashMap) b1Var.f370627i).keySet()).iterator();
        while (it.hasNext()) {
            i64.a1 a1Var = (i64.a1) ((java.util.HashMap) b1Var.f370627i).get((java.lang.String) it.next());
            b1Var.o(a1Var.f370601d, a1Var.f370600c, a1Var.f370603f, a1Var.f370604g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new i64.v0(b1Var, new java.util.HashMap(b1Var.f370629k)));
        ((java.util.HashMap) b1Var.f370627i).clear();
        ((java.util.HashMap) b1Var.f370629k).clear();
        i64.b1.f370618z.clear();
        l44.q3 q3Var = l44.q3.f397846a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearAllListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
        java.util.Map map = l44.q3.f397847b;
        synchronized (map) {
            try {
                int size = map.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdRemovedEventHelper", "clearAllListener, size=" + size);
                if (size > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdRemovedEventHelper", "leak listener, size=" + size);
                }
                ((java.util.LinkedHashMap) map).clear();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearAllListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearAllListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doShareTimelineReportWhenOnDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        java.util.HashMap hashMap = this.f250333m;
        try {
            java.util.Iterator it6 = hashMap.entrySet().iterator();
            while (it6.hasNext()) {
                xc4.p pVar = (xc4.p) ((java.util.Map.Entry) it6.next()).getValue();
                if ((pVar == null || (h17 = pVar.h1()) == null || (a90Var = h17.f39014x86965dde) == null || a90Var.f451370e != 3) ? false : true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = pVar.c1();
                    com.p314xaae8f345.mm.p959x883644fd.k0.k(com.p314xaae8f345.mm.p959x883644fd.j0.Sns, pVar.h1().f39040xbd345fc4, c17.m70350x13c652ad(), ca4.z0.t0(pVar.y0()), c17);
                }
            }
            hashMap.clear();
        } catch (java.lang.Throwable th7) {
            ca4.q.c("MicroMsg.OldVersionUIC", th7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doShareTimelineReportWhenOnDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        a44.k.f82818g.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.model.AdModelManager$Companion");
        i64.i.f370716d.g();
        i64.t.f370849d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        i64.y.f370890d.g();
        i64.u.f370855d.g();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.model.AdModelManager$Companion");
        s74.a4 a17 = s74.a4.f485741e.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Preloader", "clearPreload");
        synchronized (a17.f485743a) {
            try {
                p3325xe03a0797.p3326xc267989b.z0.c(a17.b(), null);
                a17.f485744b = null;
                a17.f485743a.d(-1);
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                throw th8;
            }
        }
        a17.f485745c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseADAbout", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public final void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseBase", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f250329f;
        if (l1Var != null) {
            l1Var.c();
        }
        this.f250329f = null;
        this.f250330g.clear();
        this.f250331h.clear();
        this.f250332i.clear();
        i64.u1.a(100, this.f250334n);
        i64.u1.a(202, this.f250335o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "maxItemIndex:" + this.f250335o + " current ItemIndex:" + this.f250334n);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3 h3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.f252684e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f252689d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.f252798d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f252801c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        gm0.j1.n().f354821b.q(218, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseBase", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public final void Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseBaseAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (this.f250328e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closePlayer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "is invalid to getSnsInfoStorage");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closePlayer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idleStop", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idleStop", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closePlayer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250328e;
        if (bsVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 q1Var = bsVar.f249588u;
            if (q1Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                q1Var.f251825a = null;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        if (this.f250328e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar2 = this.f250328e;
        if (bsVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar2.f249586s.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar3 = this.f250328e;
        if (bsVar3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clean", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            java.util.LinkedList linkedList = bsVar3.f249570c;
            if (linkedList != null) {
                linkedList.clear();
            }
            java.util.HashMap hashMap = bsVar3.C;
            if (hashMap != null) {
                hashMap.clear();
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Bi();
            mm0.c.f410108b.a();
            if (bsVar3.f249580m.f38859x6ac9171) {
                ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_like_collapse_enable, 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clean", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        this.f250328e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseBaseAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns V1(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genStruct", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = ((zc4.b) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.class)).S6().f233598o.get(i17)).n().c1();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMergeSnsObject(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns D0 = ca4.z0.D0(c17, e17, m158354x19263085(), this.f250328e, false, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi(), pc4.d.f434943a.o(), this.f250330g, this.f250331h, this.f250332i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genStruct", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return D0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r4
    public boolean a1() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f250329f;
        if ((l1Var != null ? l1Var.f251250r : null) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = this.f250329f;
        if ((l1Var2 != null ? l1Var2.f251251s : null) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var2);
            l1Var2.f251251s.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var3 = this.f250329f;
        if (l1Var3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            m7Var = l1Var3.f251253u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        } else {
            m7Var = null;
        }
        if (m7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var4 = this.f250329f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var2 = l1Var4.f251253u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            m7Var2.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var5 = this.f250329f;
        if ((l1Var5 != null ? l1Var5.f251254v : null) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var5);
            l1Var5.f251254v.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.f244096a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var6 = this.f250329f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var6);
        boolean d17 = l1Var6.f251250r.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return d17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    public com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.AbstractC22733x77ee84fd g2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVending", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVending", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    /* renamed from: getCount */
    public int mo70850x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return Integer.MAX_VALUE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    /* renamed from: getItem */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 mo70851xfb80e389(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = ((zc4.b) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.class)).S6().f233598o.get(i17)).n().c1();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return c17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    /* renamed from: notifyDataSetChanged */
    public void mo70852xced61ae5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266622;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266623;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266624;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266625;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266626;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf80266627;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 2333 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]);
                if (!(strArr.length == 0)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f250329f;
                    if (l1Var != null && (c18037xf80266627 = l1Var.f251243k) != null) {
                        c18037xf80266627.P();
                    }
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str = strArr[0];
                    ((sg3.a) v0Var).getClass();
                    java.lang.String e17 = c01.a2.e(str);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = this.f250329f;
                        if (l1Var2 != null && (c18037xf80266626 = l1Var2.f251243k) != null) {
                            c18037xf80266626.s();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var3 = this.f250329f;
                        if (l1Var3 != null && (c18037xf80266625 = l1Var3.f251243k) != null) {
                            c18037xf80266625.m70732x765074af("@" + e17 + ' ');
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var4 = this.f250329f;
                        if (l1Var4 != null && (c18037xf80266624 = l1Var4.f251243k) != null) {
                            c18037xf80266624.m70719x6aee6762("@" + e17 + ' ');
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var5 = this.f250329f;
                        if (l1Var5 != null && (c18037xf80266623 = l1Var5.f251243k) != null) {
                            c18037xf80266623.m70722xed9839eb(new r45.e86());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var6 = this.f250329f;
                        r45.e86 m70715x5732c677 = (l1Var6 == null || (c18037xf80266622 = l1Var6.f251243k) == null) ? null : c18037xf80266622.m70715x5732c677();
                        if (m70715x5732c677 != null) {
                            m70715x5732c677.f454659d = strArr[0];
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var7 = this.f250329f;
                        if (l1Var7 != null && (c18037xf8026662 = l1Var7.f251243k) != null) {
                            c18037xf8026662.m70720xed96d4a9(8);
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBeforeFinish", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.mo2275x62f76871(intent);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.d2(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f250336p = t0Var.z(d2Var, 1500L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBeforeFinish", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3 h3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.f252684e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f252686a = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.f252798d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f252800b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        s74.a4 a17 = s74.a4.f485741e.a();
        android.app.Activity activity = m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Preloader", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        a17.f485745c = activity;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3 h3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.f252684e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f252686a = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.f252798d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f252800b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f252689d = m158354x19263085;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.s2.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f252801c = m158354x192630852;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleAdExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        m70934x2b98e6a2().i(this.f250337q);
        m70934x2b98e6a2().O(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleAdExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        android.content.Intent intent = m158354x19263085().getIntent();
        boolean booleanExtra = intent.getBooleanExtra("is_sns_notify_open", true);
        java.lang.String stringExtra = intent.getStringExtra("new_feed_id");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1(m158354x19263085(), booleanExtra ? 1 : 0, stringExtra, intent.getIntExtra("sns_unread_count", 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        this.f250329f = l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        i64.b1 b1Var = this.f250327d;
        l1Var.f251235c = b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = l1Var.f251255w;
        if (iVar != null) {
            iVar.T(b1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = this.f250329f;
        if (l1Var2 != null) {
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            l1Var2.f251244l = (android.widget.FrameLayout) decorView;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var3 = this.f250329f;
        if (l1Var3 != null) {
            l1Var3.f251246n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj(m80379x76847179());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var4 = this.f250329f;
        this.f250328e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs(abstractActivityC21394xb3d2c0cf, null, l1Var4 != null ? l1Var4.f251255w : null, l1Var4, 10, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "onCreate");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var5 = this.f250329f;
        if (l1Var5 != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250328e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var6 = this.f250329f;
            l1Var5.f251250r = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vx(m158354x192630854, bsVar, l1Var6 != null ? l1Var6.f251244l : null, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var7 = this.f250329f;
        if (l1Var7 != null) {
            l1Var7.f251242j = this.f250328e;
        }
        if (l1Var7 != null) {
            l1Var7.f251243k = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.c76);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar2 = this.f250328e;
        if (bsVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar2.f249592y = this;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var8 = this.f250329f;
        if (l1Var8 != null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar3 = this.f250328e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar2 = bsVar3 != null ? bsVar3.f249572e : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var9 = this.f250329f;
            l1Var8.f251252t = new ra4.b(m80379x76847179, iVar2, l1Var9 != null ? l1Var9.f251244l : null, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var10 = this.f250329f;
        if (l1Var10 != null) {
            android.app.Activity m80379x768471792 = m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar4 = this.f250328e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar3 = bsVar4 != null ? bsVar4.f249572e : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var11 = this.f250329f;
            l1Var10.f251251s = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j(m80379x768471792, iVar3, l1Var11 != null ? l1Var11.f251244l : null, null, l1Var11 != null ? l1Var11.f251252t : null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var12 = this.f250329f;
        if (l1Var12 != null && (jVar = l1Var12.f251251s) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            jVar.f250995d = b1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        }
        gm0.j1.n().f354821b.a(218, this);
        android.view.Display defaultDisplay = m158354x19263085().getWindowManager().getDefaultDisplay();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(defaultDisplay, "getDefaultDisplay(...)");
        int height = defaultDisplay.getHeight();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630855 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630855, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630855).mo2533x106ab264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
        android.view.View j17 = mo2533x106ab264.j();
        android.app.Activity m80379x768471793 = m80379x76847179();
        b1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        b1Var.f370630l = height;
        b1Var.f370631m = j17;
        if (m80379x768471793 != null) {
            b1Var.f370632n = m80379x768471793;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc m70934x2b98e6a2 = m70934x2b98e6a2();
        n3.m0.a(m70934x2b98e6a2, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.e2(m70934x2b98e6a2, this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "onDestroy");
        wu5.c cVar = this.f250336p;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Q6();
        P6();
        O6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.mo2281xb01dfb57();
        this.f250327d.p();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.mo2284x57429eec();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OldVersionUIC", "onResume");
        this.f250327d.r();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6080x51a94dc().e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if ((r6 != null && r6.L() == 4) != false) goto L31;
     */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r3, int r4, java.lang.String r5, com.p314xaae8f345.mm.p944x882e457a.m1 r6) {
        /*
            r2 = this;
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            r3 = 1
            r4 = 0
            if (r6 == 0) goto L16
            int r5 = r6.mo808xfb85f7b0()
            r0 = 218(0xda, float:3.05E-43)
            if (r5 != r0) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = r4
        L17:
            if (r5 == 0) goto La7
            boolean r5 = r6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2
            if (r5 == 0) goto L20
            com.tencent.mm.plugin.sns.model.q2 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) r6
            goto L21
        L20:
            r6 = 0
        L21:
            if (r6 == 0) goto L2b
            int r5 = r6.L()
            if (r5 != r3) goto L2b
            r5 = r3
            goto L2c
        L2b:
            r5 = r4
        L2c:
            if (r5 != 0) goto L49
            if (r6 == 0) goto L39
            int r5 = r6.L()
            r0 = 6
            if (r5 != r0) goto L39
            r5 = r3
            goto L3a
        L39:
            r5 = r4
        L3a:
            if (r5 != 0) goto L49
            if (r6 == 0) goto L46
            int r5 = r6.L()
            r0 = 4
            if (r5 != r0) goto L46
            goto L47
        L46:
            r3 = r4
        L47:
            if (r3 == 0) goto La7
        L49:
            com.tencent.mm.plugin.sns.ui.l1 r3 = r2.f250329f
            if (r3 == 0) goto L54
            com.tencent.mm.ui.widget.dialog.u3 r3 = r3.f251256x
            if (r3 == 0) goto L54
            r3.dismiss()
        L54:
            java.lang.Class<zc4.h> r3 = zc4.h.class
            byte[] r4 = jm0.k.f381803i
            monitor-enter(r4)
            gm0.m r5 = gm0.j1.b()     // Catch: java.lang.Throwable -> La4
            r5.c()     // Catch: java.lang.Throwable -> La4
            java.lang.Class<jm0.k> r5 = jm0.k.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> La4
            if (r5 == 0) goto L9c
            androidx.lifecycle.j1 r5 = new androidx.lifecycle.j1     // Catch: java.lang.Throwable -> La4
            gm0.m r0 = gm0.j1.b()     // Catch: java.lang.Throwable -> La4
            gm0.b r0 = r0.f354778h     // Catch: java.lang.Throwable -> La4
            jm0.h r1 = new jm0.h     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            r5.<init>(r0, r1)     // Catch: java.lang.Throwable -> La4
            androidx.lifecycle.c1 r3 = r5.a(r3)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r4)
            zc4.h r3 = (zc4.h) r3
            java.lang.Class<zc4.g> r4 = zc4.g.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r3 = r3.P6(r4)
            zc4.g r3 = (zc4.g) r3
            long r4 = r6.M()
            java.lang.String r6 = "postADInfoUpdateEventBySnsID$default"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r0)
            o75.b r1 = o75.b.f425116d
            r3.e7(r4, r1)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r0)
            goto La7
        L9c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = "getLiveDB modelClass must extends BaseMvvmDB"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> La4
            throw r3     // Catch: java.lang.Throwable -> La4
        La4:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        La7:
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j
    /* renamed from: onScrollStateChangedInMain */
    public void mo70847x2ce8b1ed(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 struct, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        super.mo70847x2ce8b1ed(recyclerView, struct, i17);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((r44.f) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(r44.f.class)).F3();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.o0> a17 = struct.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyItemScrollStateEvent", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        a17.size();
        if (i17 == 0) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.o0 o0Var : a17) {
                o0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                android.view.KeyEvent.Callback callback = o0Var.f250495c;
                if (callback instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4) callback).F3();
                } else if (callback instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2187x77cdc570.C18204xc21d6449) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2187x77cdc570.C18204xc21d6449 c18204xc21d6449 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2187x77cdc570.C18204xc21d6449) callback;
                    c18204xc21d6449.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    android.view.View view = c18204xc21d6449.f250184n;
                    java.lang.Object tag = view != null ? view.getTag() : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) tag : null;
                    java.lang.Object obj = baseViewHolder != null ? baseViewHolder.f250816m0 : null;
                    if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4) obj).F3();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyItemScrollStateEvent", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChildViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChildViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x4
    public void w3(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }
}
