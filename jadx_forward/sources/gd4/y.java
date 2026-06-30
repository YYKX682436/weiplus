package gd4;

/* loaded from: classes4.dex */
public final class y extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public final int f352406q;

    /* renamed from: r, reason: collision with root package name */
    public final gd4.r f352407r;

    /* renamed from: s, reason: collision with root package name */
    public w64.n f352408s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f352409t;

    public y(int i17) {
        this.f352406q = i17;
        this.f352407r = new gd4.r(i17);
    }

    @Override // fd4.c, fd4.l
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.a(i17, c17933xe8d1b226, nVar, layoutParams);
        u74.d dVar = this.f342822f;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return;
        }
        android.app.Activity activity = this.f342820d;
        i64.b1 b1Var = this.f342821e;
        gd4.r rVar = this.f352407r;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        rVar.f352350b = dVar;
        if (c17933xe8d1b226 != null) {
            rVar.f352351c = c17933xe8d1b226;
        }
        if (activity != null) {
            rVar.f352352d = activity;
        }
        if (b1Var != null) {
            rVar.f352353e = b1Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BreakFrameAdBusiness", "onRefresh called");
        u74.d dVar2 = this.f342822f;
        android.view.View view = dVar2 != null ? dVar2.P : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f352406q == 1) {
            u74.d dVar3 = this.f342822f;
            android.view.View view3 = dVar3 != null ? dVar3.P : null;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view4 = view3;
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BreakFrameAdBusiness", "onRefresh", "(ILcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/storage/ADXml$AdFullCardInfo;Landroid/view/ViewGroup$LayoutParams;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617 = this.f342822f.f506689q;
        if (c18401x8b62a617 != null) {
            c18401x8b62a617.m71229xaaed1ec8(new gd4.u(this));
        }
        if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) rVar.d()).mo144003x754a37bb() != null) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) rVar.d()).k(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerReadyToMeasureViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        if (!this.f352409t) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a6172 = this.f342822f.f506689q;
            android.view.ViewTreeObserver viewTreeObserver = c18401x8b62a6172 != null ? c18401x8b62a6172.getViewTreeObserver() : null;
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new gd4.x(this, f0Var));
            }
            this.f352409t = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerReadyToMeasureViews", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, u74.d dVar, u74.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f342820d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return;
        }
        gd4.r rVar = this.f352407r;
        if (fVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBreakFrameWrapperDelegate", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            fVar.f506705g = rVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBreakFrameWrapperDelegate", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        }
        u74.d dVar2 = this.f342822f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f342825i;
        android.app.Activity activity2 = this.f342820d;
        i64.b1 b1Var2 = this.f342821e;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (dVar2 != null) {
            rVar.f352350b = dVar2;
        }
        if (c17933xe8d1b226 != null) {
            rVar.f352351c = c17933xe8d1b226;
        }
        if (activity2 != null) {
            rVar.f352352d = activity2;
        }
        if (b1Var2 != null) {
            rVar.f352353e = b1Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (dVar.f506689q == null) {
            android.view.View inflate = ((android.view.ViewStub) dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.n1v)).inflate();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            dVar.f506689q = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617) inflate;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BreakFrameAdBusiness", "buildContent many times");
        }
        if (dVar.P == null) {
            dVar.P = ((android.view.ViewStub) dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.n49)).inflate();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BreakFrameAdBusiness", "buildContent many times");
        }
        this.f352408s = new w64.n(this.f342820d, u(), this.f342821e, null, new gd4.s(this));
        gd4.t tVar = new gd4.t(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        rVar.f352355g = tVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar2 = this.f342824h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTimelineClickListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        rVar.f352356h = iVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTimelineClickListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617 = dVar.f506689q;
        if (c18401x8b62a617 != null) {
            c18401x8b62a617.m71234xcd1c0602(rVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        super.j();
        gd4.r rVar = this.f352407r;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        gd4.b bVar = rVar.f352365q;
        if (bVar != null) {
            bVar.k(rVar.f352351c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
    }

    public final gd4.r s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getController", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getController", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return this.f352407r;
    }

    public final android.view.View t() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        if (this.f352406q == 1) {
            u74.d dVar = this.f342822f;
            r4 = dVar != null ? dVar.H : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
            return r4;
        }
        u74.d dVar2 = this.f342822f;
        if (dVar2 != null && (view = dVar2.f506696x) != null) {
            r4 = view.findViewById(com.p314xaae8f345.mm.R.id.f564427r2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowComment", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return r4;
    }

    public final int u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        i64.b1 b1Var = this.f342821e;
        int i17 = b1Var != null ? b1Var != null ? b1Var.f370628j : 0 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BreakFrameAdBusiness");
        return i17;
    }
}
