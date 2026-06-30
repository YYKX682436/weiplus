package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ew extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.pz f103293e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103294f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f103295g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qt2 f103296h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f103297i;

    /* renamed from: m, reason: collision with root package name */
    public final fp0.t f103298m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f103299n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.internal.w0 f103300o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f103301p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f103302q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f103303r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.dw f103304s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1 f103305t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f103306u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f103307v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.fv f103308w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f103309x;

    /* JADX WARN: Type inference failed for: r10v11, types: [com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1] */
    public ew(com.tencent.mm.plugin.finder.feed.pz contract, int i17) {
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f103293e = contract;
        this.f103294f = i17;
        this.f103295g = jz5.h.b(com.tencent.mm.plugin.finder.convert.bw.f103005d);
        this.f103297i = jz5.h.b(com.tencent.mm.plugin.finder.convert.mv.f104049d);
        fp0.t tVar = new fp0.t("StreamCardFeedLoader");
        tVar.e();
        this.f103298m = tVar;
        this.f103300o = new com.tencent.mm.plugin.finder.feed.model.internal.w0(0L, 1, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        for (int i18 = 0; i18 < 4; i18++) {
            arrayList.add(new r45.mb4());
        }
        this.f103301p = arrayList;
        this.f103302q = new android.graphics.Rect();
        this.f103303r = new android.graphics.Rect();
        this.f103304s = new com.tencent.mm.plugin.finder.convert.dw(this);
        this.f103305t = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                com.tencent.mm.plugin.finder.convert.fv fvVar;
                com.tencent.mm.plugin.finder.feed.ys ysVar;
                com.tencent.mm.plugin.finder.convert.ew ewVar = com.tencent.mm.plugin.finder.convert.ew.this;
                android.view.View view = ewVar.f103307v;
                if (view == null || !com.tencent.mm.plugin.finder.convert.ew.n(ewVar, view) || (ysVar = (fvVar = ewVar.f103308w).f103423a) == null) {
                    return;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() - fvVar.f103425c;
                int indexOf = ewVar.f103293e.C.getDataListJustForAdapter().indexOf(ysVar);
                com.tencent.mm.plugin.finder.report.x4 x4Var = com.tencent.mm.plugin.finder.report.x4.f125435a;
                java.lang.String string = ysVar.f111192d.getString(1);
                if (string == null) {
                    string = "";
                }
                java.lang.String str = string;
                r45.qt2 qt2Var = ewVar.f103296h;
                if (qt2Var != null) {
                    x4Var.a(str, ysVar, indexOf, currentTimeMillis, qt2Var);
                } else {
                    kotlin.jvm.internal.o.o("contextObj");
                    throw null;
                }
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                com.tencent.mm.plugin.finder.convert.ew ewVar = com.tencent.mm.plugin.finder.convert.ew.this;
                android.view.View view = ewVar.f103307v;
                if (view == null || !com.tencent.mm.plugin.finder.convert.ew.n(ewVar, view)) {
                    return;
                }
                ewVar.f103308w.f103425c = java.lang.System.currentTimeMillis();
            }
        };
        this.f103308w = new com.tencent.mm.plugin.finder.convert.fv(null, 0L, 0L, 0L, -1);
    }

    public static final boolean n(com.tencent.mm.plugin.finder.convert.ew ewVar, android.view.View view) {
        android.graphics.Rect rect = ewVar.f103302q;
        view.getHitRect(rect);
        androidx.recyclerview.widget.RecyclerView recyclerView = ewVar.f103306u;
        android.graphics.Rect rect2 = ewVar.f103303r;
        if (recyclerView != null) {
            recyclerView.getLocalVisibleRect(rect2);
        }
        int i17 = rect.top;
        if (i17 < 0) {
            rect.top = 0;
        } else {
            int i18 = rect2.bottom;
            if (i17 > i18) {
                rect.top = i18;
            }
        }
        int i19 = rect.bottom;
        if (i19 < 0) {
            rect.bottom = 0;
        } else {
            int i27 = rect2.bottom;
            if (i19 > i27) {
                rect.bottom = i27;
            }
        }
        return view.getHeight() > 0 && rect.height() > 0 && rect.height() >= view.getHeight() / 6;
    }

    public static final void o(com.tencent.mm.plugin.finder.convert.ew ewVar, android.content.Context context, int i17, in5.s0 s0Var) {
        ewVar.getClass();
        com.tencent.mm.plugin.finder.feed.ys ysVar = (com.tencent.mm.plugin.finder.feed.ys) s0Var.f293125i;
        java.util.LinkedList linkedList = ysVar.f111194f;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        int indexOf = ewVar.f103293e.C.getDataListJustForAdapter().indexOf(ysVar);
        com.tencent.mm.plugin.finder.report.x4 x4Var = com.tencent.mm.plugin.finder.report.x4.f125435a;
        java.lang.String string = ysVar.f111192d.getString(1);
        if (string == null) {
            string = "";
        }
        long j17 = ysVar.f111192d.getLong(14);
        long itemId = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) linkedList.get(0)).getItemId();
        r45.qt2 qt2Var = ewVar.f103296h;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        x4Var.b(string, j17, i17, itemId, qt2Var, indexOf);
        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", "[jumpRelatedTimelineUI] parentIndex=" + indexOf + " cardBuffer=" + ysVar.f111192d.getByteString(6));
        if (((com.tencent.mm.plugin.finder.model.BaseFinderFeed) linkedList.get(0)).getItemId() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("TITLE_WORDING", ysVar.f111192d.getString(1));
        intent.putExtra("CARD_ID", ysVar.f111192d.getLong(14));
        intent.putExtra("GET_REL_SCENE", ysVar.f111192d.getInteger(9));
        intent.putExtra("STREAM_CARD", ysVar.f111192d.toByteArray());
        intent.putExtra("COMMENT_SCENE", 51);
        hc2.e0.b(intent, 0, new java.util.LinkedList(linkedList), ysVar.f111192d.getByteString(6), null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ni(context, intent);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487844n;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f103306u = recyclerView;
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f103296h = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).W6(this.f103294f);
        com.tencent.mm.plugin.finder.convert.dw dwVar = this.f103304s;
        recyclerView.V0(dwVar);
        recyclerView.i(dwVar);
        android.content.Context context2 = recyclerView.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.lifecycle.o mo133getLifecycle = ((com.tencent.mm.ui.MMActivity) context2).mo133getLifecycle();
        com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$lifecycleObserver$1 finderStreamCardAlbumConvert$lifecycleObserver$1 = this.f103305t;
        mo133getLifecycle.c(finderStreamCardAlbumConvert$lifecycleObserver$1);
        android.content.Context context3 = recyclerView.getContext();
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context3).mo133getLifecycle().a(finderStreamCardAlbumConvert$lifecycleObserver$1);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.f486583lr1);
        linearLayout.post(new com.tencent.mm.plugin.finder.convert.pv(linearLayout));
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.rv(this, holder, i17));
        holder.itemView.findViewById(com.tencent.mm.R.id.f486786mh2).setOnClickListener(new com.tencent.mm.plugin.finder.convert.sv(holder));
        holder.itemView.findViewById(com.tencent.mm.R.id.f483553b72).setOnClickListener(new com.tencent.mm.plugin.finder.convert.tv(holder));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f483553b72)).getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.lqz)).getPaint(), 0.8f);
        holder.itemView.findViewById(com.tencent.mm.R.id.f486783mh0).setOnClickListener(new com.tencent.mm.plugin.finder.convert.uv(holder, this));
        holder.itemView.findViewById(com.tencent.mm.R.id.f483555b74).setOnClickListener(new com.tencent.mm.plugin.finder.convert.vv(holder, this));
        com.tencent.mm.plugin.finder.view.FinderFeedAlbumView finderFeedAlbumView = (com.tencent.mm.plugin.finder.view.FinderFeedAlbumView) holder.itemView.findViewById(com.tencent.mm.R.id.f484350dz4);
        com.tencent.mm.plugin.finder.convert.wv wvVar = new com.tencent.mm.plugin.finder.convert.wv(holder, this, this.f103301p);
        wvVar.f422466c = new com.tencent.mm.plugin.finder.convert.xv(holder, this);
        finderFeedAlbumView.setAdapter(wvVar);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", "[onDetachedFromRecyclerView] ret=" + this.f103300o.a() + " report unReadItem");
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse = this.f103300o.f108065c;
        if (iResponse != null) {
            int i17 = this.f103294f;
            java.lang.Iterable<so2.j5> incrementList = iResponse.getIncrementList();
            if (incrementList == null) {
                incrementList = new java.util.LinkedList();
            }
            r45.qt2 qt2Var = this.f103296h;
            if (qt2Var == null) {
                kotlin.jvm.internal.o.o("contextObj");
                throw null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (so2.j5 j5Var : incrementList) {
                if (!bu2.j.f24534a.i(i17, j5Var.getItemId())) {
                    r45.e13 e13Var = new r45.e13();
                    e13Var.set(0, java.lang.Long.valueOf(j5Var.getItemId()));
                    boolean z17 = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z17 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                    e13Var.set(4, baseFinderFeed != null ? baseFinderFeed.w() : null);
                    if (z17) {
                        e13Var.set(1, ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getObjectNonceId());
                    }
                    e13Var.set(3, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(e13Var.getLong(0), e13Var.getString(4), qt2Var.getInteger(5)));
                    e13Var.set(2, 4);
                    linkedList.add(e13Var);
                }
            }
            if (!linkedList.isEmpty()) {
                new db2.f(linkedList, qt2Var).l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher] */
    public final void p(boolean z17, com.tencent.mm.plugin.finder.feed.ys ysVar, final r45.vd6 vd6Var, yz5.l lVar) {
        r45.z91 z91Var;
        r45.ni6 ni6Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchContent] isRefresh=");
        sb6.append(z17);
        sb6.append(" hasCache=");
        sb6.append(this.f103300o.f108065c != null);
        sb6.append(" card request id=");
        r45.xw2 xw2Var = (r45.xw2) ysVar.f111192d.getCustom(22);
        sb6.append(pm0.v.u((xw2Var == null || (z91Var = (r45.z91) xw2Var.getCustom(2)) == null || (ni6Var = (r45.ni6) z91Var.getCustom(20)) == null) ? 0L : ni6Var.getLong(0)));
        sb6.append(fb2.l.a(ysVar.f111192d));
        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
        final r45.qt2 qt2Var = this.f103296h;
        if (qt2Var == null) {
            kotlin.jvm.internal.o.o("contextObj");
            throw null;
        }
        ?? r76 = new com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader(qt2Var) { // from class: com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1
            @Override // com.tencent.mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
            public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
                return new com.tencent.mm.plugin.finder.convert.lv(this, r45.vd6.this);
            }
        };
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(r76, new ym5.w(), false, 2, null);
        this.f103298m.b(new fp0.r(new com.tencent.mm.plugin.finder.convert.kv(z17, ysVar, r76, this, vd6Var, lVar), null, 2, null));
    }

    public final r45.vd6 q(com.tencent.mm.plugin.finder.feed.ys ysVar) {
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(1, new r45.oi());
        vd6Var.set(3, new r45.q25());
        vd6Var.set(0, java.lang.Long.valueOf(ysVar.getItemId()));
        vd6Var.set(8, ysVar.f111192d.getString(15));
        vd6Var.set(10, java.lang.Integer.valueOf(hc2.d0.b(this.f103294f)));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        vd6Var.set(5, xy2.c.e(context));
        vd6Var.set(11, java.lang.Long.valueOf(ysVar.f111195g));
        vd6Var.set(6, java.lang.Long.valueOf(c01.id.c()));
        vd6Var.set(13, 11);
        return vd6Var;
    }

    @Override // in5.r
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.feed.ys item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", "[onBindViewHolder] isHotPatch=" + z17 + " pos=" + i17 + " item=" + fb2.l.a(item.f111192d) + " rvFeedList isEmpty=" + item.f111194f.isEmpty());
        this.f103307v = holder.itemView;
        long itemId = item.getItemId();
        com.tencent.mm.plugin.finder.convert.fv fvVar = this.f103308w;
        fvVar.f103424b = itemId;
        fvVar.f103426d = i17;
        fvVar.f103423a = item;
        item.f111196h = i17;
        jz5.f0 f0Var = null;
        if (!z17 && item.f111194f.isEmpty()) {
            r45.xw2 xw2Var = (r45.xw2) item.f111192d.getCustom(20);
            if (xw2Var != null && xw2Var.getInteger(0) == 1) {
                p(false, item, null, new com.tencent.mm.plugin.finder.convert.nv(this, holder, i17, i18, z17, list));
            }
        } else if (!item.f111194f.isEmpty()) {
            java.util.ArrayList arrayList = this.f103301p;
            arrayList.clear();
            java.util.LinkedList linkedList = item.f111194f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getMediaList().getFirst());
            }
            arrayList.addAll(arrayList2.subList(0, java.lang.Math.min(4, item.f111194f.size())));
            com.tencent.mm.plugin.finder.view.FinderFeedAlbumView finderFeedAlbumView = (com.tencent.mm.plugin.finder.view.FinderFeedAlbumView) holder.itemView.findViewById(com.tencent.mm.R.id.f484350dz4);
            finderFeedAlbumView.f131071i = true;
            finderFeedAlbumView.isInLayout();
            finderFeedAlbumView.post(new com.tencent.mm.plugin.finder.view.q9(finderFeedAlbumView));
            finderFeedAlbumView.post(new com.tencent.mm.plugin.finder.convert.ov(this));
            s(item, q(item));
        }
        ((com.tencent.neattextview.textview.view.NeatTextView) holder.itemView.findViewById(com.tencent.mm.R.id.obc)).b(item.f111192d.getString(1));
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.nq_)).setText(item.f111192d.getString(13));
        java.lang.String string = item.f111192d.getString(21);
        if (string != null) {
            android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f486583lr1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.lqz)).setText(string);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f486583lr1);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void s(com.tencent.mm.plugin.finder.feed.ys ysVar, r45.vd6 vd6Var) {
        r45.z91 z91Var;
        r45.ni6 ni6Var;
        if (((java.lang.Boolean) ((jz5.n) this.f103297i).getValue()).booleanValue()) {
            java.lang.String string = ysVar.f111192d.getString(21);
            if (string == null || string.length() == 0) {
                return;
            }
            if (this.f103300o.f108065c != null) {
                com.tencent.mars.xlog.Log.w("Finder.FinderStreamCardAlbumConvert", "has cache never use. just return.");
                return;
            }
            if (this.f103309x) {
                com.tencent.mars.xlog.Log.w("Finder.FinderStreamCardAlbumConvert", "isPreloadContenting. just return.");
                return;
            }
            this.f103309x = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preloadContent] now title=");
            sb6.append(ysVar.f111192d.getString(1));
            sb6.append(" stats=");
            long j17 = 0;
            sb6.append(pm0.v.u(vd6Var != null ? vd6Var.getLong(0) : 0L));
            sb6.append(" card request id=");
            r45.xw2 xw2Var = (r45.xw2) ysVar.f111192d.getCustom(22);
            if (xw2Var != null && (z91Var = (r45.z91) xw2Var.getCustom(2)) != null && (ni6Var = (r45.ni6) z91Var.getCustom(20)) != null) {
                j17 = ni6Var.getLong(0);
            }
            sb6.append(pm0.v.u(j17));
            sb6.append(' ');
            sb6.append(fb2.l.a(ysVar.f111192d));
            com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
            this.f103298m.b(new fp0.r(new com.tencent.mm.plugin.finder.convert.aw(this, ysVar, vd6Var), null, 2, null));
        }
    }
}
