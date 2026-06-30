package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem;", "Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem;", "Lxd4/d;", "Li64/k0;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/sns/ui/y4;", "Ljz5/f0;", "onUIDestroy", "<init>", "()V", "v74/n", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem */
/* loaded from: classes4.dex */
public class C17764xb07793af extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 implements xd4.d, i64.k0, p012xc85e97e9.p093xedfae76a.x, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4 {

    /* renamed from: q, reason: collision with root package name */
    public v74.n f244769q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f244770r;

    /* renamed from: t, reason: collision with root package name */
    public k84.e6 f244772t;

    /* renamed from: u, reason: collision with root package name */
    public w64.n f244773u;

    /* renamed from: v, reason: collision with root package name */
    public int f244774v;

    /* renamed from: s, reason: collision with root package name */
    public final v74.k0 f244771s = new v74.k0(0);

    /* renamed from: w, reason: collision with root package name */
    public final v74.o f244775w = new v74.o(this);

    public final void F(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardTimelineItem", "adjustContentContainerLayout, w=" + i17);
        v74.r rVar = v74.k0.E;
        v74.n nVar = this.f244769q;
        android.view.ViewGroup c17 = nVar != null ? nVar.c() : null;
        v74.n nVar2 = this.f244769q;
        android.view.ViewGroup viewGroup = nVar2 != null ? nVar2.f250812k0 : null;
        android.view.ViewGroup viewGroup2 = nVar2 != null ? nVar2.f250814l0 : null;
        android.view.View view = nVar2 != null ? nVar2.f250810j0 : null;
        rVar.a(c17, viewGroup, viewGroup2, view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null, i17, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y4
    public void F3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        this.f244771s.j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    public final void G(boolean z17) {
        android.view.View b17;
        int parseColor;
        int parseColor2;
        android.view.View b18;
        android.view.View b19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEdgeMaskViewVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility, visible=" + z17);
        v74.n nVar = this.f244769q;
        java.lang.Integer valueOf = (nVar == null || (b19 = nVar.b()) == null) ? null : java.lang.Integer.valueOf(b19.getVisibility());
        if (z17) {
            if (valueOf == null || valueOf.intValue() != 0) {
                v74.n nVar2 = this.f244769q;
                android.view.View b27 = nVar2 != null ? nVar2.b() : null;
                if (b27 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(b27, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(b27, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                v74.n nVar3 = this.f244769q;
                if (((nVar3 == null || (b18 = nVar3.b()) == null) ? null : b18.getBackground()) == null) {
                    v74.n nVar4 = this.f244769q;
                    b17 = nVar4 != null ? nVar4.b() : null;
                    if (b17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
                        if (com.p314xaae8f345.mm.ui.bk.C()) {
                            parseColor = android.graphics.Color.parseColor("#00191919");
                            parseColor2 = android.graphics.Color.parseColor("#FF191919");
                        } else {
                            parseColor = android.graphics.Color.parseColor("#00FFFFFF");
                            parseColor2 = android.graphics.Color.parseColor("#FFFFFFFF");
                        }
                        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
                        gradientDrawable.setGradientType(0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
                        b17.setBackground(gradientDrawable);
                    }
                }
            }
        } else if (valueOf == null || valueOf.intValue() != 8) {
            v74.n nVar5 = this.f244769q;
            b17 = nVar5 != null ? nVar5.b() : null;
            if (b17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEdgeMaskViewVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.f244771s.o();
        k84.e6 e6Var = this.f244772t;
        if (e6Var != null) {
            e6Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        java.lang.String T = ca4.z0.T(this.f244770r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardTimelineItem", "onAdRemoved, curSnsId=" + T + ", paramSnsId=" + str);
        if ((T == null || T.length() == 0) || !T.equals(str)) {
            ca4.q.c("lookbookAd onAdRemoved adChanged", new java.lang.RuntimeException("adChanged"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookCardTimelineItem", "onAdRemoved, ad changed with no remove");
        } else {
            this.f244771s.f();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        v74.k0 k0Var = this.f244771s;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.l(false);
        v74.s0 s0Var = k0Var.f515382o;
        if (s0Var != null) {
            s0Var.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k84.e6 e6Var = this.f244772t;
        if (e6Var != null) {
            e6Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: getDisplayRect */
    public android.graphics.Rect mo69493x4003fc90() {
        android.view.ViewGroup c17;
        android.view.ViewGroup c18;
        android.view.ViewGroup c19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        int[] iArr = new int[2];
        v74.n nVar = this.f244769q;
        if (nVar != null && (c19 = nVar.c()) != null) {
            c19.getLocationOnScreen(iArr);
        }
        int i17 = 0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        v74.n nVar2 = this.f244769q;
        int width = (nVar2 == null || (c18 = nVar2.c()) == null) ? 0 : c18.getWidth();
        v74.n nVar3 = this.f244769q;
        if (nVar3 != null && (c17 = nVar3.c()) != null) {
            i17 = c17.getHeight();
        }
        android.graphics.Rect rect = new android.graphics.Rect(i18, i19, width + i18, i17 + i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        return rect;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        if (!(baseViewHolder instanceof v74.n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookCardTimelineItem", "buildContent, holder err");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
            return;
        }
        if (this.f250782f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLookbookCardTimelineItem", "mActivity==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
            return;
        }
        this.f244769q = (v74.n) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571058cu4);
            v74.n nVar = (v74.n) baseViewHolder;
            if (!nVar.f250823q) {
                android.view.View inflate = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar.D0 = (android.view.ViewGroup) inflate;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar.f250823q = true;
            }
        } else {
            v74.n nVar2 = (v74.n) baseViewHolder;
            if (!nVar2.f250823q) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) nVar2.f250805h.findViewById(com.p314xaae8f345.mm.R.id.iqu);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar2.D0 = viewGroup;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar2.f250823q = true;
            }
        }
        v74.n nVar3 = (v74.n) baseViewHolder;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f05 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05) nVar3.f250805h.findViewById(com.p314xaae8f345.mm.R.id.iqv);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.E0 = c17765x7b4a5f05;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.View findViewById = nVar3.f250805h.findViewById(com.p314xaae8f345.mm.R.id.iqw);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEdgeMaskView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.F0 = findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEdgeMaskView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub2 = (android.view.ViewStub) nVar3.f250805h.findViewById(com.p314xaae8f345.mm.R.id.qlu);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.G0 = viewStub2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub3 = (android.view.ViewStub) nVar3.f250805h.findViewById(com.p314xaae8f345.mm.R.id.v_f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.H0 = viewStub3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.widget.ImageView imageView = (android.widget.ImageView) nVar3.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f567247rw0);
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f250782f;
        p012xc85e97e9.p093xedfae76a.y yVar = componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) componentCallbacks2 : null;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(this);
        }
        v74.r rVar = v74.k0.E;
        android.app.Activity mActivity = this.f250782f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mActivity, "mActivity");
        v74.s b17 = rVar.b(mActivity, this.f250780d, 0);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        boolean e17 = rVar.e(this.f250782f);
        int d17 = rVar.d(this.f250782f, this.f250780d, 0, b17, c19762x487075a);
        this.f244774v = d17;
        F(d17);
        if (c19762x487075a.f38859x6ac9171 || e17) {
            G(true);
        } else {
            G(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookCardTimelineItem", "buildContent, inLargeWindow=" + this.f250780d + ", width=" + this.f244774v + ", hash=" + hashCode());
        android.app.Activity activity = this.f250782f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250784h;
        this.f244773u = new w64.n(activity, 0, (bsVar == null || (l1Var2 = bsVar.f249569b) == null) ? null : l1Var2.f251235c, null, null);
        android.app.Activity activity2 = this.f250782f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar2 = this.f250784h;
        i64.b1 b1Var = (bsVar2 == null || (l1Var = bsVar2.f249569b) == null) ? null : l1Var.f251235c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17765x7b4a5f05 c17765x7b4a5f052 = nVar3.E0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewGroup c17 = nVar3.c();
        android.widget.LinearLayout linearLayout = nVar3.f250819o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub4 = nVar3.G0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub5 = nVar3.H0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        this.f244771s.g(new v74.t(activity2, b1Var, c17765x7b4a5f052, c17, linearLayout, viewStub4, imageView, viewStub5), this.f244773u, this.f244775w);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onUIDestroy */
    public final void m69499x20b2fbc7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        this.f244771s.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r18, int r19, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r20, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r21, int r22, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r23) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17764xb07793af.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    /* renamed from: pause */
    public void mo69495x65825f6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        v74.k0 k0Var = this.f244771s;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.f515376i = true;
        k0Var.l(true);
        v74.s0 s0Var = k0Var.f515382o;
        if (s0Var != null) {
            s0Var.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k84.e6 e6Var = this.f244772t;
        if (e6Var != null) {
            e6Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    /* renamed from: stop */
    public void mo69496x360802() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        v74.k0 k0Var = this.f244771s;
        k0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookLogic", "onStopPlay");
        k0Var.f515377j.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        return "AdLookbookCardTimelineItem";
    }
}
