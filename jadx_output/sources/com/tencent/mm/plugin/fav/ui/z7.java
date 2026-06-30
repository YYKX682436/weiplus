package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f101655a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f101656b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f101657c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f101658d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f101659e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f101660f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f101661g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f101662h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f101663i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ScrollView f101664j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f101665k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f101666l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout f101667m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f101668n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.y8 f101669o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f101670p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101671q;

    /* renamed from: r, reason: collision with root package name */
    public o75.a f101672r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f101673s;

    public z7(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f101655a = context;
        android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.dvw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f101656b = findViewById;
        android.view.View findViewById2 = context.findViewById(com.tencent.mm.R.id.f484316du4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f101657c = findViewById2;
        android.view.View findViewById3 = context.findViewById(com.tencent.mm.R.id.dvc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f101658d = findViewById3;
        android.view.View findViewById4 = context.findViewById(com.tencent.mm.R.id.f485504hx0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f101659e = findViewById4;
        android.view.View findViewById5 = context.findViewById(com.tencent.mm.R.id.dww);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f101660f = (android.widget.LinearLayout) findViewById5;
        android.view.View findViewById6 = context.findViewById(com.tencent.mm.R.id.dwx);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f101661g = (com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel) findViewById6;
        android.view.View findViewById7 = context.findViewById(com.tencent.mm.R.id.m6r);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f101662h = findViewById7;
        android.view.View findViewById8 = context.findViewById(com.tencent.mm.R.id.f485659ii5);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f101663i = findViewById8;
        android.view.View findViewById9 = context.findViewById(com.tencent.mm.R.id.dwy);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f101664j = (android.widget.ScrollView) findViewById9;
        android.view.View findViewById10 = context.findViewById(com.tencent.mm.R.id.dwv);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f101665k = findViewById10;
        android.view.View findViewById11 = context.findViewById(com.tencent.mm.R.id.dtf);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f101666l = findViewById11;
        java.lang.Object systemService = context.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.f101668n = (android.view.inputmethod.InputMethodManager) systemService;
        this.f101670p = new java.util.ArrayList();
    }

    public static final void a(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        w82.t0 searchInfo = z7Var.f101661g.getSearchInfo();
        com.tencent.mm.ui.MMActivity activity = z7Var.f101655a;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.fav.ui.da daVar = (com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.fav.ui.da.class);
        java.util.ArrayList types = searchInfo.f443930a;
        java.util.ArrayList tags = searchInfo.f443931b;
        java.util.ArrayList keys = searchInfo.f443932c;
        daVar.getClass();
        kotlin.jvm.internal.o.g(types, "types");
        kotlin.jvm.internal.o.g(tags, "tags");
        kotlin.jvm.internal.o.g(keys, "keys");
        if (com.tencent.mm.sdk.platformtools.t8.L0(types) && com.tencent.mm.sdk.platformtools.t8.L0(tags) && com.tencent.mm.sdk.platformtools.t8.L0(keys)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[changeCoreList] types and tags and keys all empty, exiting filter mode");
            daVar.P6();
            daVar.Q6().setVisibility(0);
            daVar.R6().setVisibility(8);
            android.view.View S6 = daVar.S6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "changeCoreList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "changeCoreList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = daVar.f100582m;
            if (h0Var == null) {
                kotlin.jvm.internal.o.o("mFavGallery");
                throw null;
            }
            h0Var.g(8);
            java.lang.Object value = ((jz5.n) daVar.f100581i).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "changeCoreList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "changeCoreList", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            daVar.f100590u = false;
            return;
        }
        daVar.f100590u = true;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(types)) {
            java.util.Iterator it = types.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                kotlin.jvm.internal.o.d(str);
                int i17 = kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cdd)) ? 22 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cd9)) ? 21 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.f491212cd2)) ? 20 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cdf)) ? 5 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cda)) ? 7 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cdh)) ? 3 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.f491211cd1)) ? 8 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cde)) ? 17 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cdc)) ? 18 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.cd_)) ? 6 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.ccy)) ? 19 : kotlin.jvm.internal.o.b(str, i65.a.r(daVar.getContext(), com.tencent.mm.R.string.ccz)) ? 23 : -1;
                if (i17 == -1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[getTypeIntValue] fail, typeName = ".concat(str));
                }
                if (i17 != -1) {
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[changeCoreList] types = " + types);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[changeCoreList] intTypes = " + arrayList3);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[changeCoreList] tags = " + tags);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[changeCoreList] keys = " + keys);
        boolean z17 = (kotlin.jvm.internal.o.b(daVar.B, keys) && kotlin.jvm.internal.o.b(daVar.A, arrayList3) && kotlin.jvm.internal.o.b(daVar.C, tags)) ? false : true;
        daVar.A = arrayList3;
        daVar.B = keys;
        daVar.C = tags;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.f(arrayList3, keys, tags);
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar2.notifyDataSetChanged();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[changeCoreList] shouldShowGridList = ");
        sb6.append(daVar.W6(arrayList3));
        sb6.append(", shouldShowFinderFrameLayout = ");
        sb6.append(!com.tencent.mm.sdk.platformtools.t8.L0(arrayList3) && arrayList3.contains(20));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", sb6.toString());
        if (daVar.W6(arrayList3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[refreshGridResult]");
            daVar.Q6().setVisibility(8);
            android.view.View S62 = daVar.S6();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(S62, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshGridResult", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S62.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(S62, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshGridResult", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            daVar.R6().setVisibility(8);
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var2 = daVar.f100582m;
            if (h0Var2 == null) {
                kotlin.jvm.internal.o.o("mFavGallery");
                throw null;
            }
            h0Var2.g(0);
            java.lang.Object value2 = ((jz5.n) daVar.f100581i).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            android.view.View view2 = (android.view.View) value2;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshGridResult", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshGridResult", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.fav.ui.c3 c3Var = daVar.f100584o;
            if (c3Var == null) {
                kotlin.jvm.internal.o.o("mFavFinderManager");
                throw null;
            }
            c3Var.f100537d.setVisibility(8);
            c3Var.f100543m = false;
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var3 = daVar.f100582m;
            if (h0Var3 == null) {
                kotlin.jvm.internal.o.o("mFavGallery");
                throw null;
            }
            h0Var3.f100958r = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryUI", "[loadDataWithFilter] Entering image/video filter page, isBatchPicSaveEnabled: " + o72.c2.f343317a.b());
            com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var = h0Var3.f100960t;
            if (a1Var != null) {
                a1Var.f100892a = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaHistoryGalleryReporter", "[resetSessionId] Session id reset, will generate new one on next use");
            }
            if (h0Var3.f100941a != null) {
                h0Var3.f100956p = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var = h0Var3.f100941a;
                int i18 = h0Var3.f100950j;
                com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = (com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var;
                l2Var.f100996d.f101106i = true;
                ((com.tencent.mm.plugin.fav.ui.gallery.h0) l2Var.f100993a).f(true, null);
                ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.fav.ui.gallery.g2(l2Var, true, keys, tags, arrayList3, i18));
            }
        } else {
            daVar.P6();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList3) && arrayList3.contains(20)) {
                daVar.Q6().setVisibility(8);
                android.view.View S63 = daVar.S6();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(S63, arrayList6.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshFinderFrameLayout", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                S63.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(S63, "com/tencent/mm/plugin/fav/ui/FavTopSearchUIC", "refreshFinderFrameLayout", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                daVar.R6().setVisibility(8);
                com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var4 = daVar.f100582m;
                if (h0Var4 == null) {
                    kotlin.jvm.internal.o.o("mFavGallery");
                    throw null;
                }
                h0Var4.g(8);
                com.tencent.mm.plugin.fav.ui.c3 c3Var2 = daVar.f100584o;
                if (c3Var2 == null) {
                    kotlin.jvm.internal.o.o("mFavFinderManager");
                    throw null;
                }
                android.widget.FrameLayout frameLayout = c3Var2.f100537d;
                frameLayout.setVisibility(0);
                int Q6 = c3Var2.a().Q6();
                c3Var2.a();
                com.tencent.mm.plugin.fav.ui.h3 a17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a();
                a17.getClass();
                java.util.ArrayList arrayList7 = a17.f101131b;
                arrayList7.clear();
                com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
                java.util.ArrayList arrayList8 = new java.util.ArrayList(1);
                arrayList8.add(20);
                java.util.List I7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(keys, tags, arrayList8);
                if (I7 == null) {
                    I7 = new java.util.ArrayList();
                }
                arrayList7.addAll(I7);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[loadFavIdList] favIdList size = " + arrayList7.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderManager", "[initContentView] data size = " + Q6);
                androidx.fragment.app.FragmentManager supportFragmentManager = c3Var2.f100538e.getSupportFragmentManager();
                kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
                androidx.fragment.app.i2 beginTransaction = supportFragmentManager.beginTransaction();
                kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                int id6 = frameLayout.getId();
                com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment finderGlobalFavFeedFragment = (com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment) c3Var2.f100539f;
                finderGlobalFavFeedFragment.getClass();
                beginTransaction.k(id6, finderGlobalFavFeedFragment, null);
                finderGlobalFavFeedFragment.f129134w = c3Var2;
                beginTransaction.d();
                if (!(Q6 == 0)) {
                    com.tencent.mm.plugin.finder.ui.fav.x xVar = finderGlobalFavFeedFragment.f129133v;
                    if (xVar == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.ui.fav.a aVar = xVar.f129219c;
                    aVar.s();
                    aVar.m();
                    androidx.recyclerview.widget.f2 adapter = xVar.d().getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    com.tencent.mm.view.recyclerview.WxRecyclerView d17 = xVar.d();
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(0);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(d17, arrayList9.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "refreshAllData", "()V", "Undefined", "scrollToPosition", "(I)V");
                    d17.a1(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(d17, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "refreshAllData", "()V", "Undefined", "scrollToPosition", "(I)V");
                    com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter finderGlobalFavLoaderMoreFooter = xVar.f129230n;
                    if (finderGlobalFavLoaderMoreFooter != null) {
                        finderGlobalFavLoaderMoreFooter.k();
                    }
                }
                c3Var2.f100543m = true;
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList3) && arrayList3.contains(7) && tags.isEmpty() && keys.isEmpty()) {
                    daVar.U6();
                    if (o72.x1.F()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[addTingSkipItem] has ting header = " + daVar.D);
                        if (!daVar.D) {
                            if (daVar.E == null) {
                                android.view.View inflate = android.view.LayoutInflater.from(daVar.getContext()).inflate(com.tencent.mm.R.layout.f488765ac2, (android.view.ViewGroup) null);
                                daVar.E = inflate;
                                kotlin.jvm.internal.o.d(inflate);
                                inflate.setOnClickListener(new com.tencent.mm.plugin.fav.ui.z8(daVar));
                            }
                            daVar.R6().addHeaderView(daVar.E);
                            daVar.D = true;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[addTingSkipItem] use musicList false, return");
                    }
                } else {
                    daVar.U6();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[removeTingSkipItem] has ting header = " + daVar.D);
                    if (daVar.D) {
                        daVar.R6().removeHeaderView(daVar.E);
                        daVar.D = false;
                    }
                }
            }
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        daVar.F = uuid;
        if (z17) {
            java.util.List I72 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(daVar.B, daVar.C, daVar.A);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String join = android.text.TextUtils.join(",", daVar.B);
            kotlin.jvm.internal.o.f(join, "join(...)");
            hashMap.put("query_word", join);
            hashMap.put("fav_homepage_sessionid", daVar.H);
            hashMap.put("fav_res_method", java.lang.Integer.valueOf(daVar.T6()));
            hashMap.put("search_result_cnt", java.lang.Integer.valueOf(I72.size()));
            hashMap.put("queryid", daVar.F);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("favHomePage", "fav_search_return", hashMap, 32903);
        }
    }

    public static final android.view.animation.Animation b(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        z7Var.getClass();
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.startNow();
        translateAnimation.setAnimationListener(new com.tencent.mm.plugin.fav.ui.b7(z7Var));
        return translateAnimation;
    }

    public static final void c(com.tencent.mm.plugin.fav.ui.z7 z7Var, java.lang.String str, java.lang.String str2, int i17) {
        z7Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.ui.MMActivity mMActivity = z7Var.f101655a;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = mMActivity instanceof com.tencent.mm.plugin.fav.ui.FavoriteIndexUI ? (com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) mMActivity : null;
        java.lang.String str3 = favoriteIndexUI != null ? favoriteIndexUI.Y : null;
        if (str3 == null) {
            str3 = "";
        }
        int i18 = (i17 == 1 && kotlin.jvm.internal.o.b(str2, mMActivity.getResources().getString(com.tencent.mm.R.string.cdd))) ? 1 : i17 == 1 ? 2 : i17 == 2 ? 3 : 0;
        hashMap.put("fav_homepage_sessionid", str3);
        hashMap.put("fav_tab_type", java.lang.Integer.valueOf(i18));
        hashMap.put("fav_tab_name", str2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, "view_clk", hashMap, 32903);
    }

    public final void d() {
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f101661g;
        favTopTagPanel.f();
        e();
        if (favTopTagPanel.M.size() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(favTopTagPanel.getEditText())) {
            android.view.View view = this.f101662h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter", "showSearchMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter", "showSearchMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f101656b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter", "showSearchMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter", "showSearchMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hideSoftInput], context.currentFocus = ");
        com.tencent.mm.ui.MMActivity mMActivity = this.f101655a;
        sb6.append(mMActivity);
        sb6.append(".currentFocus");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", sb6.toString());
        if (mMActivity.getCurrentFocus() != null) {
            android.view.View currentFocus = mMActivity.getCurrentFocus();
            kotlin.jvm.internal.o.d(currentFocus);
            this.f101668n.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    public final void f() {
        java.util.ArrayList arrayList;
        android.view.View view = this.f101659e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f101658d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavTopFilter", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.fav.ui.o7 o7Var = new com.tencent.mm.plugin.fav.ui.o7(this);
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f101661g;
        favTopTagPanel.getClass();
        favTopTagPanel.U = o7Var;
        this.f101662h.setOnClickListener(new com.tencent.mm.plugin.fav.ui.p7(this));
        favTopTagPanel.Q = new com.tencent.mm.plugin.fav.ui.r7(this);
        favTopTagPanel.R = new com.tencent.mm.plugin.fav.ui.t7(this);
        favTopTagPanel.S = new com.tencent.mm.plugin.fav.ui.u7(this);
        favTopTagPanel.T = new com.tencent.mm.plugin.fav.ui.v7(this);
        android.view.View view3 = this.f101665k;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) view3.findViewById(com.tencent.mm.R.id.dvt);
        android.view.View findViewById = view3.findViewById(com.tencent.mm.R.id.duj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f101667m = (com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout) findViewById;
        java.util.ArrayList arrayList4 = this.f101670p;
        if (o72.x1.G()) {
            java.util.List c17 = t72.b.f416040a.c();
            arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList5 = (java.util.ArrayList) c17;
            java.util.Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                t72.a aVar = (t72.a) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_name)) {
                    arrayList.add(aVar);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[getTagList] tagInfos size = " + arrayList5.size() + ", result size = " + arrayList.size());
            jx3.f.INSTANCE.d(29434, 1, 1);
        } else {
            java.util.List<r45.oq0> a17 = new com.tencent.mm.plugin.fav.ui.v6().a();
            arrayList = new java.util.ArrayList();
            for (r45.oq0 oq0Var : a17) {
                t72.a aVar2 = new t72.a();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(oq0Var.f382438d)) {
                    aVar2.field_id = -1;
                    aVar2.field_name = oq0Var.f382438d;
                    arrayList.add(aVar2);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[getTagList] oldTagInfos size = " + arrayList.size());
            jx3.f.INSTANCE.d(29434, 1, 0);
        }
        com.tencent.mm.plugin.fav.ui.y8 y8Var = new com.tencent.mm.plugin.fav.ui.y8(arrayList4, arrayList);
        this.f101669o = y8Var;
        final com.tencent.mm.ui.MMActivity owner = this.f101655a;
        kotlin.jvm.internal.o.g(owner, "context");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(owner) { // from class: com.tencent.mm.plugin.fav.ui.FavTopMenuAdapter$getLayoutManager$layoutManager$1
            @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
                try {
                    super.onLayoutChildren(z2Var, h3Var);
                } catch (java.lang.Exception unused) {
                }
            }
        };
        gridLayoutManager.B = new com.tencent.mm.plugin.fav.ui.l8(y8Var);
        com.tencent.mm.plugin.fav.ui.y8 y8Var2 = this.f101669o;
        com.tencent.mm.plugin.fav.ui.k8 k8Var = y8Var2 != null ? new com.tencent.mm.plugin.fav.ui.k8(y8Var2) : null;
        wxRecyclerView.setAdapter(y8Var2);
        wxRecyclerView.setLayoutManager(gridLayoutManager);
        kotlin.jvm.internal.o.d(k8Var);
        wxRecyclerView.N(k8Var);
        int i17 = owner.getResources().getDisplayMetrics().heightPixels;
        int height = this.f101659e.getHeight();
        android.widget.LinearLayout linearLayout = this.f101660f;
        int height2 = height - linearLayout.getHeight();
        int c18 = fp.a.c(owner);
        int i18 = (int) (((i17 - c18) * 0.75d) - height2);
        com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = this.f101667m;
        if (maxHeightFrameLayout == null) {
            kotlin.jvm.internal.o.o("mFlRvContains");
            throw null;
        }
        maxHeightFrameLayout.setMaxHeight(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "maxViewHeight = " + i18 + ", screen height = " + i17 + ", topFilterHeight = " + height2 + ", actionBarHeight = " + c18);
        com.tencent.mm.plugin.fav.ui.y8 y8Var3 = this.f101669o;
        if (y8Var3 != null) {
            y8Var3.f101628g = new com.tencent.mm.plugin.fav.ui.g7(this);
        }
        if (y8Var3 != null) {
            y8Var3.f101629h = new com.tencent.mm.plugin.fav.ui.h7(this);
        }
        if (y8Var3 != null) {
            y8Var3.f101630i = new com.tencent.mm.plugin.fav.ui.m7(this);
        }
        linearLayout.removeAllViews();
        if (com.tencent.mm.plugin.fav.ui.ia.f101180a.b()) {
            g(com.tencent.mm.plugin.fav.ui.ia.f101184e);
        } else {
            linearLayout.post(new com.tencent.mm.plugin.fav.ui.f7(this));
        }
        int f17 = i65.a.f(owner, com.tencent.mm.R.dimen.f479704cz);
        android.view.View view4 = this.f101657c;
        java.lang.Object parent = view4.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view5 = (android.view.View) parent;
        view5.post(new com.tencent.mm.plugin.fav.ui.a7(view4, f17, view5));
        view4.setOnClickListener(new com.tencent.mm.plugin.fav.ui.d7(this));
        this.f101666l.setOnClickListener(new com.tencent.mm.plugin.fav.ui.e7(this));
        ym5.a1.h(view4, new com.tencent.mm.plugin.fav.ui.y7(this));
        this.f101671q = true;
        com.tencent.mm.plugin.fav.ui.w7 w7Var = new com.tencent.mm.plugin.fav.ui.w7(this);
        this.f101672r = w7Var;
        t72.b bVar = t72.b.f416040a;
        kotlin.jvm.internal.o.g(owner, "owner");
        dm.q3.f239392q.observe(owner, w7Var);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FavTagAddNotifyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FavTagAddNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.fav.ui.FavTopFilter$initListener$2
            {
                this.__eventId = 1790401535;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FavTagAddNotifyEvent favTagAddNotifyEvent) {
                com.tencent.mm.autogen.events.FavTagAddNotifyEvent event = favTagAddNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.List list = event.f54240g.f8272a;
                if (list == null) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[favTagAddListener] tags = " + list);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    t72.a aVar3 = new t72.a();
                    aVar3.field_id = -1;
                    aVar3.field_name = (java.lang.String) next;
                    arrayList6.add(aVar3);
                }
                com.tencent.mm.plugin.fav.ui.y8 y8Var4 = com.tencent.mm.plugin.fav.ui.z7.this.f101669o;
                if (y8Var4 == null) {
                    return true;
                }
                ym5.a1.f(new com.tencent.mm.plugin.fav.ui.g8(arrayList6, y8Var4));
                return true;
            }
        };
        this.f101673s = iListener;
        iListener.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] init & register");
        ym5.a1.h(this.f101658d, new com.tencent.mm.plugin.fav.ui.x7(this));
    }

    public final void g(int i17) {
        java.util.ArrayList arrayList;
        android.view.View view;
        int i18 = 0;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.widget.LinearLayout linearLayout = this.f101660f;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("menu line width = ");
        android.view.View view2 = this.f101658d;
        sb6.append(view2.getMeasuredWidth());
        sb6.append(", down menu width = ");
        android.view.View view3 = this.f101657c;
        sb6.append(view3.getMeasuredWidth());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", sb6.toString());
        float measuredWidth = view2.getMeasuredWidth() - view3.getMeasuredWidth();
        com.tencent.mm.ui.MMActivity mMActivity = this.f101655a;
        float b17 = ym5.x.b(mMActivity, measuredWidth) - 28;
        java.util.ArrayList arrayList2 = this.f101670p;
        int size = arrayList2.size();
        int i19 = 0;
        int i27 = 0;
        while (i19 < size) {
            java.lang.Object obj = arrayList2.get(i19);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.lang.String str = (java.lang.String) obj;
            android.widget.TextView textView = new android.widget.TextView(mMActivity);
            textView.setText(str);
            textView.setTextColor(i65.a.d(mMActivity, com.tencent.mm.R.color.f478734fp));
            textView.setTextSize(i18, i65.a.f(mMActivity, com.tencent.mm.R.dimen.f479853h2));
            textView.setSingleLine(true);
            textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(i18, i18), android.view.View.MeasureSpec.makeMeasureSpec(i18, i18));
            float b18 = ym5.x.b(mMActivity, java.lang.Integer.valueOf(textView.getMeasuredWidth()).intValue());
            int f17 = i65.a.f(mMActivity, com.tencent.mm.R.dimen.f479646bl);
            textView.setPadding(f17, f17, f17, f17);
            int i28 = i27 + 8;
            if (i19 != 0) {
                view = new android.view.View(mMActivity);
                arrayList = arrayList2;
                view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i65.a.f(mMActivity, com.tencent.mm.R.dimen.f479704cz), 1));
                i28 += 24;
            } else {
                arrayList = arrayList2;
                view = null;
            }
            textView.setBackground(i65.a.i(mMActivity, com.tencent.mm.R.drawable.f481486u9));
            i27 = i28 + ((int) b18);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[handleFlowView] index = " + i19 + ", currWidth = " + i27 + ", totalWidth = " + b17 + ", endIndex = " + i17);
            if (i17 != -1 && i17 + 1 == i19) {
                return;
            }
            if (i17 == -1 && i27 >= b17) {
                return;
            }
            if (view != null) {
                linearLayout.addView(view);
            }
            linearLayout.addView(textView);
            com.tencent.mm.plugin.fav.ui.ia iaVar = com.tencent.mm.plugin.fav.ui.ia.f101180a;
            com.tencent.mm.plugin.fav.ui.ia.f101184e = i19;
            textView.setOnClickListener(new com.tencent.mm.plugin.fav.ui.n7(str, this));
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[handleFlowView] flow layout add fav type = ".concat(str));
            i19++;
            arrayList2 = arrayList;
            i18 = 0;
        }
    }

    public final void h(java.util.List list, boolean z17) {
        kotlin.jvm.internal.o.g(list, "list");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[setFavTypeList] = " + list + ", notify = " + z17);
        java.util.ArrayList arrayList = this.f101670p;
        arrayList.clear();
        arrayList.add(i65.a.r(this.f101655a, com.tencent.mm.R.string.cdd));
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(list);
        arrayList.addAll(linkedHashSet);
        if (z17) {
            com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f101669o;
            if (y8Var != null) {
                y8Var.notifyDataSetChanged();
            }
            this.f101660f.removeAllViews();
            g(-1);
        }
    }

    public final void i(int i17) {
        android.view.View view = this.f101659e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter", "setFilterVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter", "setFilterVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void j(int i17) {
        android.view.View view = this.f101658d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopFilter", "setMenuLineVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopFilter", "setMenuLineVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
