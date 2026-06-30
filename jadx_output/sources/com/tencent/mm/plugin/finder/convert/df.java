package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class df extends com.tencent.mm.plugin.finder.convert.qe {

    /* renamed from: l1, reason: collision with root package name */
    public int f103147l1;

    /* renamed from: p1, reason: collision with root package name */
    public int f103148p1;

    /* renamed from: x1, reason: collision with root package name */
    public int f103149x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f103150y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f103151y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f103152z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public df(com.tencent.mm.plugin.finder.feed.k8 r2, boolean r3, int r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = r0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "contract"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            r2 = -1
            r1.f103150y0 = r2
            r1.f103147l1 = r2
            r1.f103148p1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.df.<init>(com.tencent.mm.plugin.finder.feed.k8, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0157, code lost:
    
        if (r4 == false) goto L34;
     */
    @Override // com.tencent.mm.plugin.finder.convert.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(in5.s0 r22, com.tencent.mm.plugin.finder.model.BaseFinderFeed r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.df.K(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int):void");
    }

    public final void O1(in5.s0 s0Var) {
        android.view.ViewGroup viewGroup;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.gbz);
        if (p17 == null || (viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484486ee3)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) s0Var.p(com.tencent.mm.R.id.f484869fs3);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.h8n);
        if (p18 != null) {
            p18.post(new com.tencent.mm.plugin.finder.convert.re(s0Var, finderBaseMediaBanner, p18, viewGroup, p17));
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public int P() {
        return 2;
    }

    @Override // in5.r
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.d1 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("Finder.FeedFullVideoConvert", "onBindViewHolder position=" + i17 + " type=" + i18 + " isHotPatch=" + z17);
        o(holder, item, i17, i18, z17, list);
    }

    public final void Q1(in5.s0 holder, so2.d1 item, com.tencent.mm.plugin.finder.view.FinderMediaLayout mediaLayout, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(mediaLayout, "mediaLayout");
        if (this.f103152z1) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L0).getValue()).r()).intValue() == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedFullImageConvert", "[reportExposed]");
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.qt2 d17 = xy2.c.d(context);
            hc2.v0.d(mediaLayout, "finder_feed_photo", null, true, kz5.c1.k(new jz5.l("feedid", pm0.v.u(item.getItemId())), new jz5.l("finder_feed_photo_exp_type", java.lang.Integer.valueOf(i17)), new jz5.l("feed_photo_index", java.lang.Integer.valueOf(i18)), new jz5.l("feed_source_photo_index", java.lang.Integer.valueOf(i19)), new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(item.getItemId(), item.w(), d17 != null ? d17.getInteger(5) : 0))), null, 18, null);
        }
    }

    public final void R1(in5.s0 holder, so2.d1 item, com.tencent.mm.plugin.finder.view.FinderMediaLayout mediaLayout) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(mediaLayout, "mediaLayout");
        if (this.f103147l1 == -1 || !this.f103152z1) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L0).getValue()).r()).intValue() == 1) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullImageConvert", "[reportUnExposed]");
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.qt2 d17 = xy2.c.d(context);
            java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(item.getItemId(), item.w(), d17 != null ? d17.getInteger(5) : 0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = this.f103151y1;
            hc2.v0.d(mediaLayout, "finder_feed_photo", "view_unexp", true, kz5.c1.k(new jz5.l("feedid", pm0.v.u(item.getItemId())), new jz5.l("finder_feed_photo_exp_type", java.lang.Integer.valueOf(this.f103149x1)), new jz5.l("feed_photo_index", java.lang.Integer.valueOf(this.f103147l1)), new jz5.l("feed_source_photo_index", java.lang.Integer.valueOf(this.f103148p1)), new jz5.l("stay_time_ms", java.lang.Long.valueOf(1 <= j17 && j17 < elapsedRealtime ? elapsedRealtime - j17 : 0L)), new jz5.l("session_buffer", ek6)), null, 16, null);
        }
    }

    @Override // in5.r
    public int e() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue() ? com.tencent.mm.R.layout.drs : com.tencent.mm.R.layout.f487846o;
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.view.KeyEvent.Callback k17;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.k(com.tencent.mm.R.id.fs6);
        if (finderMediaLayout == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.qr qrVar = com.tencent.mm.plugin.finder.view.qr.f132906e;
        com.tencent.mm.plugin.finder.view.s0 s0Var = new com.tencent.mm.plugin.finder.view.s0();
        s0Var.f132990c = this.f104358f.getG();
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.M1().r()).booleanValue()) {
            com.tencent.mm.view.MediaBannerIndicator mediaBannerIndicator = (com.tencent.mm.view.MediaBannerIndicator) holder.k(com.tencent.mm.R.id.h8n);
            if (mediaBannerIndicator != null) {
                mediaBannerIndicator.setVisibility(8);
            }
            k17 = holder.k(com.tencent.mm.R.id.u3d);
            com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView = (com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView) k17;
            if (finderPageIndicatorView != null) {
                finderPageIndicatorView.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView2 = (com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView) holder.k(com.tencent.mm.R.id.u3d);
            if (finderPageIndicatorView2 != null) {
                finderPageIndicatorView2.setVisibility(8);
            }
            k17 = holder.k(com.tencent.mm.R.id.h8n);
            com.tencent.mm.view.MediaBannerIndicator mediaBannerIndicator2 = (com.tencent.mm.view.MediaBannerIndicator) k17;
            if (mediaBannerIndicator2 != null) {
                mediaBannerIndicator2.setVisibility(0);
            }
        }
        if (k17 != null) {
            s0Var.f132989b = (ym5.o1) k17;
        }
        s0Var.f132988a = recyclerView;
        finderMediaLayout.b(qrVar, s0Var);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.l(holder);
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        if (finderMediaLayout != null) {
            finderMediaLayout.getImageBanner().h();
        }
        this.f103150y0 = -1;
        this.f103147l1 = -1;
        this.f103148p1 = -1;
        this.f103149x1 = 0;
        this.f103151y1 = 0L;
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7
    public boolean p() {
        return ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void p0(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.p0(holder);
        this.f103152z1 = true;
        com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) holder.p(com.tencent.mm.R.id.f484869fs3);
        if (finderBaseMediaBanner != null) {
            java.lang.Object obj = holder.f293125i;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
            if (baseFinderFeed != null && (baseFinderFeed instanceof so2.d1)) {
                so2.e1 e1Var = ((so2.d1) baseFinderFeed).f410311e;
                e1Var.f410324a.clear();
                e1Var.f410325b.clear();
                e1Var.f410326c.clear();
                e1Var.f410327d = baseFinderFeed.getFeedObject().getMediaList().size();
                e1Var.f410324a.put(java.lang.Integer.valueOf(finderBaseMediaBanner.getFocusPosition()), java.lang.Integer.valueOf(((java.lang.Number) e1Var.f410324a.getOrDefault(java.lang.Integer.valueOf(finderBaseMediaBanner.getFocusPosition()), 0)).intValue() + 1));
            }
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f104357J;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = recyclerView.getChildAt(i17);
                if (childAt != null) {
                    androidx.recyclerview.widget.k3 w07 = recyclerView.w0(childAt);
                    in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
                    if (s0Var != null && s0Var.getItemViewType() == 2) {
                        O1(s0Var);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void t(in5.s0 holder) {
        android.view.View p17;
        kotlin.jvm.internal.o.g(holder, "holder");
        O1(holder);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.g1y);
        if (p18 == null || (p17 = holder.p(com.tencent.mm.R.id.h8n)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.post(new com.tencent.mm.plugin.finder.convert.se(holder, p17, p18, this));
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void w(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, boolean z17) {
        int bottom;
        android.view.ViewParent parent;
        so2.d1 item = (so2.d1) baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M0).getValue()).r()).booleanValue()) {
            super.w(holder, item, i17, z17);
            return;
        }
        android.content.Context context = holder.f293121e;
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) == null) {
            return;
        }
        if (hc2.f1.f280320f) {
            bottom = com.tencent.mm.ui.bl.b(context).y;
        } else {
            androidx.recyclerview.widget.RecyclerView o17 = holder.o();
            java.lang.Object parent2 = (o17 == null || (parent = o17.getParent()) == null) ? null : parent.getParent();
            android.view.View view = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            bottom = view != null ? view.getBottom() : context.getResources().getDisplayMetrics().heightPixels;
        }
        android.view.ViewGroup.LayoutParams layoutParams = finderMediaLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.gravity = 8388723;
        layoutParams2.height = -1;
        android.view.ViewGroup.LayoutParams layoutParams3 = finderMediaLayout.c().getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.topMargin = 0;
            layoutParams4.bottomMargin = 0;
            layoutParams4.gravity = 17;
        }
        finderMediaLayout.getImageBanner().getImageAdapter().f422472g = bottom;
        finderMediaLayout.requestLayout();
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void w0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 holder) {
        so2.d1 item = (so2.d1) baseFinderFeed;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.w0(item, holder);
        O1(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.z0(holder, i17, i18, z17);
        this.f103152z1 = false;
    }
}
