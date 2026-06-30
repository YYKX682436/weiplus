package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class b1 extends com.tencent.mm.plugin.finder.convert.n0 {
    public final boolean A;
    public long B;
    public final com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1 C;

    /* renamed from: s, reason: collision with root package name */
    public final cw2.z9 f102915s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.i0 f102916t;

    /* renamed from: u, reason: collision with root package name */
    public final int f102917u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.en2 f102918v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.a f102919w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.q f102920x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f102921y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f102922z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1] */
    public b1(cw2.z9 videoCore, com.tencent.mm.plugin.finder.feed.k8 contract, int i17, com.tencent.mm.plugin.finder.convert.i0 i0Var, int i18, r45.en2 en2Var, java.lang.String vmKey, yz5.a bigCardAvailableSize, yz5.q onTriggerSpeedChanged) {
        super(contract, false, i0Var, i18, en2Var, vmKey, i17, 2, null);
        kotlin.jvm.internal.o.g(videoCore, "videoCore");
        kotlin.jvm.internal.o.g(contract, "contract");
        kotlin.jvm.internal.o.g(vmKey, "vmKey");
        kotlin.jvm.internal.o.g(bigCardAvailableSize, "bigCardAvailableSize");
        kotlin.jvm.internal.o.g(onTriggerSpeedChanged, "onTriggerSpeedChanged");
        this.f102915s = videoCore;
        this.f102916t = i0Var;
        this.f102917u = i18;
        this.f102918v = en2Var;
        this.f102919w = bigCardAvailableSize;
        this.f102920x = onTriggerSpeedChanged;
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f102921y = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127682ef).getValue()).r()).booleanValue();
        cq.k1.a();
        this.f102922z = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127720gf).getValue()).r()).booleanValue();
        cq.k1.a();
        this.A = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127701ff).getValue()).r()).booleanValue();
        final com.tencent.mm.ui.MMActivity f122643d = contract.getF122643d();
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent>(f122643d) { // from class: com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1
            {
                this.__eventId = -1291074182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent event = feedMegaVideoAnimPlayEvent;
                kotlin.jvm.internal.o.g(event, "event");
                boolean z17 = event.f54249g.f6661d;
                return true;
            }
        };
    }

    public static final void v(com.tencent.mm.plugin.finder.convert.b1 b1Var, in5.s0 s0Var, boolean z17) {
        b1Var.getClass();
        float f17 = z17 ? 0.0f : 1.0f;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.skp);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.uwr);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.ufp);
        if (p19 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p19.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p27 = s0Var.p(com.tencent.mm.R.id.oup);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p28 = s0Var.p(com.tencent.mm.R.id.a_x);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p28.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p29 = s0Var.p(com.tencent.mm.R.id.f485458u85);
        if (p29 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p29.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // in5.r
    public int e() {
        return this.f102921y ? com.tencent.mm.R.layout.e5x : com.tencent.mm.R.layout.f488785e61;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1 finderColumnCardVideoConvert$videoFinishListener$1$1 = this.C;
        if (finderColumnCardVideoConvert$videoFinishListener$1$1 != null) {
            finderColumnCardVideoConvert$videoFinishListener$1$1.alive();
        }
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.util.ArrayList arrayList;
        so2.u1 item = (so2.u1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.FinderColumnCardVideoConvert-onBindViewHolder position=");
        sb6.append(i17);
        sb6.append(" type=");
        sb6.append(i18);
        sb6.append(" isHotPatch=");
        sb6.append(z17);
        sb6.append(' ');
        sb6.append(hc2.b0.d(item, i17));
        sb6.append(" payloads:");
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                arrayList.add(((java.lang.Number) lVar.f302833d).intValue() + " - " + lVar.f302834e);
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.FinderColumnCardVideoConvert", sb6.toString());
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                if (kotlin.jvm.internal.o.b(it6.next(), "speedChanged")) {
                    android.view.View view = holder.itemView;
                    long j17 = this.B;
                    float f17 = (j17 == 0 || j17 == item.getFeedObject().getFeedObject().getId()) ? 1.0f : 0.0f;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            return;
        }
        if (!z17) {
            r(holder, item, i17, i18);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f485458u85);
        if (this.f102922z) {
            if (p17 != null) {
                com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                com.tencent.mm.plugin.finder.report.s sVar = com.tencent.mm.plugin.finder.report.s.f125337a;
                int i19 = this.f102917u;
                r45.en2 en2Var = this.f102918v;
                java.util.Map a17 = sVar.a(item, i17, i19, en2Var != null ? (r45.ey0) en2Var.getCustom(11) : null, this.f102918v);
                ey2.u s17 = s();
                android.content.Context context = holder.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                d2Var.n(p17, "column_card_detail", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : a17, (r20 & 128) != 0 ? null : new com.tencent.mm.plugin.finder.report.r(s17, item, context, this.f104057o));
            }
            if (p17 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p17 != null) {
                p17.setOnClickListener(new com.tencent.mm.plugin.finder.convert.z0(holder, this, i17));
            }
        } else if (p17 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.jdk);
        com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = p18 instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) p18 : null;
        if (simpleTouchableLayout == null || !this.A) {
            return;
        }
        long id6 = item.getFeedObject().getFeedObject().getId();
        simpleTouchableLayout.setOnSimultaneouslyLongPressListener(new com.tencent.mm.plugin.finder.convert.v0(holder, simpleTouchableLayout, this, id6));
        simpleTouchableLayout.setOnTouchEventUpOrCancel(new com.tencent.mm.plugin.finder.convert.w0(holder, this, simpleTouchableLayout, id6, i17, item));
        simpleTouchableLayout.setOnSingleClickListener(new com.tencent.mm.plugin.finder.convert.x0(this, i17, item));
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        if (this.f102921y) {
            holder.itemView.getLayoutParams().width = -1;
            android.view.View view = holder.itemView;
            com.tencent.mm.plugin.finder.view.FinderColumnBigCardLayout finderColumnBigCardLayout = view instanceof com.tencent.mm.plugin.finder.view.FinderColumnBigCardLayout ? (com.tencent.mm.plugin.finder.view.FinderColumnBigCardLayout) view : null;
            android.content.Context context = holder.f293121e;
            if (finderColumnBigCardLayout != null) {
                com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                java.lang.System.nanoTime();
                boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                int i19 = a17.f197135a;
                if (!z17 && i19 > (i18 = a17.f197136b)) {
                    i19 = i18;
                }
                finderColumnBigCardLayout.setMaxWidth(i19 - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) * 2));
            }
            kotlin.jvm.internal.o.d(finderMediaLayout);
            android.view.ViewGroup.LayoutParams layoutParams = finderMediaLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            finderMediaLayout.setLayoutParams(layoutParams);
            holder.itemView.setOutlineProvider(new com.tencent.mm.plugin.finder.convert.y0(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn)));
            holder.itemView.setTag(com.tencent.mm.R.id.tuy, java.lang.Integer.valueOf(i65.a.f(context, com.tencent.mm.R.dimen.f479688cn)));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.g99);
        if (weImageView != null) {
            weImageView.setFocusable(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.w7, in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1 finderColumnCardVideoConvert$videoFinishListener$1$1 = this.C;
        if (finderColumnCardVideoConvert$videoFinishListener$1$1 != null) {
            finderColumnCardVideoConvert$videoFinishListener$1$1.dead();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0, in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.l(holder);
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    public void q(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f102921y || baseFinderFeed == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        float f17 = bu2.z.f(baseFinderFeed.getFeedObject().getMediaList(), "Finder.FinderColumnCardVideoConvert", false, 2, null);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.jdk);
        if (p17 != null) {
            p17.setTranslationY(0.0f);
            if (f17 < 1.0f) {
                p17.setTranslationY((-i18) * 0.05f);
            }
        }
        if (finderMediaLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = finderMediaLayout.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 17;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = finderMediaLayout.c().getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i17;
                layoutParams3.height = (int) (i17 * f17);
            }
            finderMediaLayout.requestLayout();
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    public android.util.Size t(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f102921y) {
            return super.t(holder);
        }
        android.util.Size size = (android.util.Size) this.f102919w.invoke();
        android.view.View view = holder.itemView;
        com.tencent.mm.plugin.finder.view.FinderColumnBigCardLayout finderColumnBigCardLayout = view instanceof com.tencent.mm.plugin.finder.view.FinderColumnBigCardLayout ? (com.tencent.mm.plugin.finder.view.FinderColumnBigCardLayout) view : null;
        if (finderColumnBigCardLayout == null) {
            return super.t(holder);
        }
        int width = size.getWidth();
        int height = size.getHeight();
        boolean z17 = false;
        if (finderColumnBigCardLayout.aspectRatio <= 0.0f) {
            return new android.util.Size(0, 0);
        }
        int i17 = finderColumnBigCardLayout.maxWidth;
        int min = i17 > 0 ? java.lang.Math.min(width, i17) : width;
        int b17 = a06.d.b(min / finderColumnBigCardLayout.aspectRatio);
        if (b17 > height) {
            min = a06.d.b(height * finderColumnBigCardLayout.aspectRatio);
            int i18 = finderColumnBigCardLayout.maxWidth;
            if (1 <= i18 && i18 < min) {
                z17 = true;
            }
            if (z17) {
                height = a06.d.b(i18 / finderColumnBigCardLayout.aspectRatio);
                min = i18;
            }
        } else {
            height = b17;
        }
        if (min > width) {
            height = a06.d.b(width / finderColumnBigCardLayout.aspectRatio);
        } else {
            width = min;
        }
        return new android.util.Size(width, height);
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    public com.tencent.mm.plugin.finder.view.qr u() {
        return com.tencent.mm.plugin.finder.view.qr.f132907f;
    }

    @Override // com.tencent.mm.plugin.finder.convert.n0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void r(in5.s0 holder, so2.u1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        com.tencent.mm.plugin.finder.view.y yVar = new com.tencent.mm.plugin.finder.view.y();
        yVar.f133368d = this.f102915s;
        yVar.f133366b = this.f104057o;
        yVar.f133370f = new com.tencent.mm.plugin.finder.convert.t0(holder);
        yVar.f133369e = new com.tencent.mm.plugin.finder.convert.u0(holder, item, this);
        finderMediaLayout.a(item, yVar);
    }
}
