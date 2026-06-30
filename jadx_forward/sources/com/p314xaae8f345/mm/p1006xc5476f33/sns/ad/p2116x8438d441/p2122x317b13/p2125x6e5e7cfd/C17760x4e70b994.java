package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardTimelineItem;", "Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem;", "Lxd4/d;", "Li64/k0;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onUIDestroy", "<init>", "()V", "t74/e2", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem */
/* loaded from: classes4.dex */
public class C17760x4e70b994 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d, i64.k0, p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: q, reason: collision with root package name */
    public t74.e2 f244749q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f244750r;

    /* renamed from: s, reason: collision with root package name */
    public final t74.d2 f244751s = new t74.d2();

    /* renamed from: t, reason: collision with root package name */
    public w64.n f244752t;

    /* renamed from: u, reason: collision with root package name */
    public int f244753u;

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "play, pos is " + i17 + ", hashCode is " + hashCode());
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.f244751s.f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        java.lang.String T = ca4.z0.T(this.f244750r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "onAdRemoved, curSnsId is " + T + ", paramSnsId is " + str);
        if ((T == null || T.length() == 0) || !T.equals(str)) {
            ca4.q.c("flipCardAd onAdRemoved adChanged", new java.lang.RuntimeException("adChanged"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFlipCardTimelineItem", "onAdRemoved, ad changed with no remove");
        } else {
            this.f244751s.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "onUIPause, hash is " + hashCode());
        this.f244751s.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        android.view.ViewGroup b17;
        android.view.ViewGroup b18;
        android.view.ViewGroup b19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        int[] iArr = new int[2];
        t74.e2 e2Var = this.f244749q;
        if (e2Var != null && (b19 = e2Var.b()) != null) {
            b19.getLocationOnScreen(iArr);
        }
        int i17 = 0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        t74.e2 e2Var2 = this.f244749q;
        int width = (e2Var2 == null || (b18 = e2Var2.b()) == null) ? 0 : b18.getWidth();
        t74.e2 e2Var3 = this.f244749q;
        if (e2Var3 != null && (b17 = e2Var3.b()) != null) {
            i17 = b17.getHeight();
        }
        android.graphics.Rect rect = new android.graphics.Rect(i18, i19, width + i18, i17 + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        return rect;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        if (!(baseViewHolder instanceof t74.e2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFlipCardTimelineItem", "buildContent, holder error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        if (this.f250782f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFlipCardTimelineItem", "mActivity is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        this.f244749q = (t74.e2) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.epf);
            t74.e2 e2Var = (t74.e2) baseViewHolder;
            if (!e2Var.f250823q) {
                android.view.View inflate = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var.D0 = (android.view.ViewGroup) inflate;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var.f250823q = true;
            }
        } else {
            t74.e2 e2Var2 = (t74.e2) baseViewHolder;
            if (!e2Var2.f250823q) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) e2Var2.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f566547tx1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var2.D0 = viewGroup2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var2.f250823q = true;
            }
        }
        t74.e2 e2Var3 = (t74.e2) baseViewHolder;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) e2Var3.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f566548tx2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
        e2Var3.E0 = viewGroup3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f250782f;
        p012xc85e97e9.p093xedfae76a.y yVar = componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) componentCallbacks2 : null;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(this);
        }
        this.f244753u = ca4.m0.y("AdFlipCardTimelineItem", this.f250782f, 0, this.f250780d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "buildContent, inLargeWindow is " + this.f250780d + ", width is " + this.f244753u + ", hash is " + hashCode());
        android.app.Activity activity = this.f250782f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250784h;
        this.f244752t = new w64.n(activity, 0, (bsVar == null || (l1Var2 = bsVar.f249569b) == null) ? null : l1Var2.f251235c, null, null);
        t74.e2 e2Var4 = this.f244749q;
        android.view.ViewGroup b17 = e2Var4 != null ? e2Var4.b() : null;
        t74.e2 e2Var5 = this.f244749q;
        if (e2Var5 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
            android.view.ViewGroup viewGroup4 = e2Var5.E0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
            viewGroup = viewGroup4;
        } else {
            viewGroup = null;
        }
        t74.e2 e2Var6 = this.f244749q;
        android.view.View view = e2Var6 != null ? e2Var6.f250834v0 : null;
        int i17 = this.f244753u;
        boolean z17 = this.f250780d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar2 = this.f250784h;
        t74.b2 b2Var = new t74.b2(b17, viewGroup, view, i17, z17, (bsVar2 == null || (l1Var = bsVar2.f249569b) == null) ? null : l1Var.f251235c, this.f244752t, bsVar2 != null ? bsVar2.f249572e : null, this.f250782f, 0);
        t74.d2 d2Var = this.f244751s;
        d2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.f497657a = b2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.b(this.f244753u);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onUIDestroy */
    public final void m69494x20b2fbc7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "onUIDestroy, hash is " + hashCode());
        this.f244751s.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        android.app.Activity activity;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        if (!(baseViewHolder instanceof t74.e2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFlipCardTimelineItem", "fillItem, holder error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        if (nsVar == null || (activity = this.f250782f) == null || !(activity instanceof p012xc85e97e9.p093xedfae76a.y) || bsVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdFlipCardTimelineItem", "fillItem params error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = nsVar.f251558a;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        this.f244750r = c17933xe8d1b226;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "ad fillItem, flipcardAd, pos is " + i17 + ", snsId is " + ca4.z0.y0(this.f244750r) + ", hash is " + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = this.f244750r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        i64.b1 b1Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = bsVar.f249569b;
        if ((l1Var != null ? l1Var.f251235c : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdFlipCardTimelineItem", "addOnRemovedListener, adapter SnsAdStatistic null");
        } else if (l1Var != null) {
            b1Var = l1Var.f251235c;
        }
        if (b1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdFlipCardTimelineItem", "addOnRemovedListener failed, snsId=" + ca4.z0.y0(this.f244750r));
            ca4.q.c("flipCardAd snsAdStatistic==null", new java.lang.RuntimeException("snsAdStatistic==null"));
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b2262);
        if (!android.text.TextUtils.isEmpty(T) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("0", T) && b1Var != null) {
            b1Var.a(T, this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        this.f244751s.a(this.f250782f, this.f244750r);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "pause, hash is " + hashCode());
        t74.d2 d2Var = this.f244751s;
        d2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = d2Var.f497658b;
        if (w1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            java.lang.String j17 = w1Var.j();
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "pausePlayByTimeline");
                w1Var.f497830z0 = false;
                w1Var.K0();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFlipCardTimelineItem", "stop, hash is " + hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        return "AdFlipCardTimelineItem";
    }
}
