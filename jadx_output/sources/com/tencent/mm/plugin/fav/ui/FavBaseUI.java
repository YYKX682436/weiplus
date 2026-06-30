package com.tencent.mm.plugin.fav.ui;

@db5.a(8192)
@ul5.d(0)
/* loaded from: classes12.dex */
public abstract class FavBaseUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements android.widget.AdapterView.OnItemClickListener {
    public static final /* synthetic */ int R = 0;
    public com.tencent.mm.plugin.fav.ui.z7 C;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f100270h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f100271i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f100272m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f100273n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f100274o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f100276q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f100277r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f100278s;

    /* renamed from: t, reason: collision with root package name */
    public w82.b0 f100279t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f100280u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.ra f100281v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f100282w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f100283x;

    /* renamed from: d, reason: collision with root package name */
    public boolean f100266d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100267e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100268f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f100269g = 0;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f100275p = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: y, reason: collision with root package name */
    public boolean f100284y = false;

    /* renamed from: z, reason: collision with root package name */
    public w82.a0 f100285z = null;
    public final java.lang.Object A = new java.lang.Object();
    public final com.tencent.mm.sdk.platformtools.n3 B = new com.tencent.mm.plugin.fav.ui.e0(this, android.os.Looper.getMainLooper());
    public final boolean D = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fav_finder_show_filter, true);
    public final boolean E = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fav_title_menu_update, true);
    public final boolean F = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_top_filter_open_switch, true);
    public final boolean G = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_sync_fail_retry_open, true);
    public final com.tencent.mm.sdk.platformtools.n3 H = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f100265J = false;
    public final com.tencent.mm.sdk.event.IListener K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FavoritesBatchSafeCheckerEvent>(this) { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI.2
        {
            this.__eventId = 1640126341;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FavoritesBatchSafeCheckerEvent favoritesBatchSafeCheckerEvent) {
            com.tencent.mm.autogen.events.FavoritesBatchSafeCheckerEvent favoritesBatchSafeCheckerEvent2 = favoritesBatchSafeCheckerEvent;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "FavoritesBatchSafeCheckerEvent received, secAuthResponse: %s", favoritesBatchSafeCheckerEvent2.f54245g.f6227a);
            com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
            if (favBaseUI.isStopped()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "Activity is not resumed, ignore FavoritesBatchSafeCheckerEvent");
            } else {
                java.lang.String str = favoritesBatchSafeCheckerEvent2.f54245g.f6227a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteBaseUI", "secAuthResponse is null or empty");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "Parsing secAuthResponse with Broadcast");
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "Broadcast parsed, showType: %d, url: %s", java.lang.Integer.valueOf(b17.f420400c), b17.f420398a);
                        if (favBaseUI.I) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "br.show has already been called, ignore this call");
                        } else {
                            b17.f420403f = 6000;
                            if (b17.c(favBaseUI, null, null)) {
                                favBaseUI.I = true;
                                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "br.show called successfully, set hasBrShowCalled to true");
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteBaseUI", "Broadcast.parse returned null for secAuthResponse");
                    }
                }
            }
            return true;
        }
    };
    public final java.lang.Runnable L = new com.tencent.mm.plugin.fav.ui.k0(this);
    public final java.lang.Runnable M = new com.tencent.mm.plugin.fav.ui.l0(this);
    public final java.lang.Runnable N = new com.tencent.mm.plugin.fav.ui.c0(this);
    public final l75.q0 P = new com.tencent.mm.plugin.fav.ui.d0(this);
    public boolean Q = false;

    public static void U6(final com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        favBaseUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleOrderType] hasInitOrderType = ");
        com.tencent.mm.plugin.fav.ui.ia iaVar = com.tencent.mm.plugin.fav.ui.ia.f101180a;
        sb6.append(iaVar.b());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
        if (iaVar.b()) {
            return;
        }
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$f
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.util.List list = (java.util.List) obj;
                int i17 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI2 = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                if (favBaseUI2.d7().isEmpty()) {
                    favBaseUI2.Y6(true);
                    return null;
                }
                favBaseUI2.C.h(list, true);
                com.tencent.mm.plugin.fav.ui.z7 z7Var = favBaseUI2.C;
                if (!z7Var.f101671q) {
                    z7Var.f();
                }
                favBaseUI2.X6(false);
                favBaseUI2.Y6(false);
                favBaseUI2.f100270h.setVisibility(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: VISIBLE");
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[handleOrderType] order type init finish, strings = " + list);
                favBaseUI2.d7().notifyDataSetChanged();
                return null;
            }
        };
        favBaseUI.f7();
        java.util.Set blockSet = favBaseUI.e7();
        kotlin.jvm.internal.o.g(blockSet, "blockSet");
        if (com.tencent.mm.plugin.fav.ui.ia.f101183d) {
            java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.ia.f101182c;
            if (!arrayList.isEmpty()) {
                lVar.invoke(arrayList);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.fav.ui.ha(lVar));
    }

    public abstract boolean V6();

    public final void W6() {
        com.tencent.mm.plugin.fav.ui.ia iaVar = com.tencent.mm.plugin.fav.ui.ia.f101180a;
        java.util.List a17 = iaVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dealWithLoadingView] hasInitOrderType = ");
        sb6.append(iaVar.b());
        sb6.append(", types.size() = ");
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
        if (iaVar.b() || arrayList.size() > 0) {
            X6(false);
            this.f100270h.setVisibility(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: VISIBLE");
        } else {
            X6(true);
            this.f100270h.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: GONE");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[dealWithLoadingView] empty = " + d7().isEmpty() + ", checkLoading = " + V6());
        if (d7() == null) {
            Y6(true);
        } else if (d7().isEmpty()) {
            if (V6()) {
                X6(true);
                Y6(false);
            } else {
                X6(false);
                Y6(true);
                m7();
            }
        }
        android.view.View view = this.f100277r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "dealWithLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "dealWithLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void X6(boolean z17) {
        android.view.ViewStub viewStub;
        if (!z17) {
            android.view.View view = this.f100278s;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.f100278s == null && (viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.dfm)) != null) {
            this.f100278s = viewStub.inflate();
        }
        android.view.View view2 = this.f100278s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void Y6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "enableEmptyView enable = " + z17);
        if (z17) {
            android.view.View view = this.f100273n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f100271i.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f100273n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100271i.setVisibility(8);
    }

    public void Z6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[enterMoreMode]");
        a7();
        setMMTitle(getResources().getString(com.tencent.mm.R.string.cbj, java.lang.Integer.valueOf(i17)));
        this.C.i(8);
        this.C.j(8);
        android.view.View view = this.f100282w;
        if (view != null && view.getVisibility() == 0) {
            android.view.View view2 = this.f100282w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enterMoreMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enterMoreMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        addTextOptionMenu(16, i65.a.r(this, com.tencent.mm.R.string.c9s), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$h
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i18 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                favBaseUI.getClass();
                com.tencent.mm.plugin.fav.ui.da daVar = (com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(favBaseUI).a(com.tencent.mm.plugin.fav.ui.da.class);
                if (daVar.f100590u) {
                    daVar.P6();
                } else {
                    favBaseUI.c7();
                }
                favBaseUI.C.j(0);
                return true;
            }
        });
        this.Q = true;
    }

    public abstract void a7();

    public void b7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[exitMoreMode]");
        setMMTitle(h7());
        this.C.i(0);
        this.C.j(0);
        android.view.View view = this.f100282w;
        if (view != null && view.getVisibility() == 8) {
            android.view.View view2 = this.f100282w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "exitMoreMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "exitMoreMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        removeOptionMenu(16);
        this.Q = false;
    }

    public abstract void c7();

    public abstract com.tencent.mm.plugin.fav.ui.adapter.b d7();

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.view.View view = this.C.f101659e;
            boolean z17 = false;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                int measuredWidth = view.getMeasuredWidth() + i17;
                int measuredHeight = view.getMeasuredHeight() + i18;
                if (rawY >= i18 && rawY <= measuredHeight && rawX >= i17 && rawX <= measuredWidth) {
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "x = " + rawX + ", y = " + rawY + ", ait = " + z17);
            if (!z17) {
                this.C.d();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract java.util.Set e7();

    public abstract o72.i4 f7();

    public abstract android.view.View.OnClickListener g7();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ac_;
    }

    public abstract java.lang.String h7();

    public void i7(com.tencent.mm.plugin.fav.ui.adapter.b bVar) {
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
            return;
        }
        if (!bVar.isEmpty()) {
            X6(false);
            Y6(false);
        } else if (V6()) {
            X6(true);
            Y6(false);
        } else {
            X6(false);
            Y6(true);
            m7();
        }
        boolean isEmpty = bVar.isEmpty();
        boolean a37 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().a3(bVar.f100473d, bVar.f100474e);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[handleDataChanged] isEmpty = " + isEmpty + ", hasShowAll = " + a37);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("footerViewsCount = ");
        sb6.append(this.f100270h.getFooterViewsCount());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
        if (isEmpty || a37) {
            this.f100270h.removeFooterView(this.f100277r);
        } else if (this.f100270h.getFooterViewsCount() == 0) {
            this.f100270h.addFooterView(this.f100277r);
        }
        if (!this.f100265J || this.f100270h.isShown() || d7().isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "yes, match after security check, and fix ui visible bug");
        W6();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f100274o = findViewById(com.tencent.mm.R.id.t_e);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.dxw);
        this.f100270h = listView;
        listView.setDrawingCacheEnabled(false);
        setToTop(new com.tencent.mm.plugin.fav.ui.g0(this));
        this.f100273n = findViewById(com.tencent.mm.R.id.f484230dg4);
        this.f100271i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfd);
        this.f100272m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f484224t84);
        j7();
        this.f100277r = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.abn, (android.view.ViewGroup) null);
        this.f100270h.setOnScrollListener(new com.tencent.mm.plugin.fav.ui.h0(this));
        this.f100270h.setOnItemClickListener(this);
        this.f100270h.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.i0(this));
        this.f100270h.setAdapter((android.widget.ListAdapter) d7());
        if (d7() instanceof com.tencent.mm.plugin.fav.ui.adapter.c) {
            ((com.tencent.mm.plugin.fav.ui.adapter.c) d7()).K = new s82.i() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$g
                @Override // s82.i
                public final void a(java.lang.String str) {
                    com.tencent.mm.plugin.fav.ui.FavBaseUI.this.k7(str);
                }
            };
        }
        i7(d7());
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "init view use %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.f100282w = getSupportActionBar().j().findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
    }

    public void j7() {
        boolean z17 = this.F;
        if (z17) {
            this.C = new com.tencent.mm.plugin.fav.ui.z7(this);
            com.tencent.mm.plugin.fav.ui.ia iaVar = com.tencent.mm.plugin.fav.ui.ia.f101180a;
            if (iaVar.b()) {
                this.C.h(com.tencent.mm.plugin.fav.ui.ia.f101182c, false);
                this.C.f();
            } else {
                java.util.List a17 = iaVar.a();
                if (((java.util.ArrayList) a17).size() > 0) {
                    this.C.h(a17, false);
                    this.C.f();
                }
            }
        }
        w82.b0 b0Var = new w82.b0(getContext());
        this.f100279t = b0Var;
        b0Var.setCleanFavSpace(this.f100285z);
        this.f100279t.b(false);
        this.f100279t.a(false);
        this.f100279t.getPaddingTop();
        this.f100279t.getPaddingBottom();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.du9);
        if (z17) {
            frameLayout.setVisibility(0);
            frameLayout.addView(this.f100279t);
        } else {
            this.f100270h.addHeaderView(this.f100279t);
            frameLayout.setVisibility(0);
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        boolean z18 = this.E;
        if (z18) {
            this.f100280u = android.view.View.inflate(context, com.tencent.mm.R.layout.ac6, null);
        } else {
            this.f100280u = android.view.View.inflate(context, com.tencent.mm.R.layout.f488768ac5, null);
        }
        android.widget.TextView textView = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwf);
        android.widget.TextView textView2 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwd);
        android.widget.TextView textView3 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dw_);
        android.widget.TextView textView4 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwg);
        android.widget.TextView textView5 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwb);
        android.widget.TextView textView6 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dw9);
        android.widget.TextView textView7 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dw8);
        android.widget.TextView textView8 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwe);
        android.widget.TextView textView9 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwc);
        android.view.View.OnClickListener g76 = g7();
        textView.setOnClickListener(g76);
        textView.setTag(5);
        textView3.setOnClickListener(g76);
        textView3.setTag(21);
        textView4.setOnClickListener(g76);
        textView4.setTag(3);
        textView5.setOnClickListener(g76);
        textView5.setTag(7);
        textView6.setOnClickListener(g76);
        if (z18) {
            android.widget.TextView textView10 = (android.widget.TextView) this.f100280u.findViewById(com.tencent.mm.R.id.dwa);
            textView10.setOnClickListener(g76);
            textView10.setTag(6);
            textView6.setTag(20);
        } else if (this.D) {
            textView6.setTag(20);
        } else {
            textView6.setText(getString(com.tencent.mm.R.string.cd_));
            textView6.setTag(6);
        }
        textView7.setOnClickListener(g76);
        textView7.setTag(8);
        textView8.setOnClickListener(g76);
        textView8.setTag(17);
        textView9.setOnClickListener(g76);
        textView9.setTag(18);
        textView2.setOnClickListener(g76);
        textView2.setTag(22);
        this.f100280u.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.fav.ui.j0(this, textView3, textView2, textView8));
        if (z17) {
            return;
        }
        this.f100270h.addHeaderView(this.f100280u);
    }

    public void k7(java.lang.String name) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[onListTagItemClick] name = " + name + ", moreMode = " + this.Q);
        if (this.Q) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.C;
        z7Var.getClass();
        kotlin.jvm.internal.o.g(name, "name");
        ym5.a1.f(new com.tencent.mm.plugin.fav.ui.z6(z7Var, name, 2, true));
    }

    public abstract void l7();

    public abstract void m7();

    public void n7() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f100275p;
        java.lang.Runnable runnable = this.M;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 305 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[onActivityResult] tagList = " + intent.getStringArrayListExtra("key_fav_result_list"));
        }
        if (i17 == 6000) {
            java.lang.String str = null;
            if (intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null) {
                java.io.Serializable serializable = bundleExtra.getSerializable("next_params");
                java.util.Map map = serializable instanceof java.util.Map ? (java.util.Map) serializable : null;
                java.lang.Object obj = map != null ? map.get("next_step") : null;
                if (obj instanceof java.lang.String) {
                    str = (java.lang.String) obj;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[onActivityResult] FAV_SAFE_AUTH_REQUEST_CODE, nextStep = " + str);
            if (!"fav_safe_auth_done".equals(str)) {
                finish();
            } else {
                this.f100265J = true;
                this.H.post(new com.tencent.mm.plugin.fav.ui.FavBaseUI$$a());
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        this.K.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "FavoritesBatchSafeCheckerEvent listener bindOnInit");
        o72.v4 pj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj();
        if (pj6 instanceof b82.e) {
            ((b82.e) pj6).f18314e = this.D;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", java.lang.Boolean.valueOf(gm0.j1.a()));
        o72.d3 d3Var = o72.d3.f343321a;
        d3Var.d();
        d3Var.e();
        gm0.j1.d().g(new o72.k5());
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this.P);
        this.f100276q = new com.tencent.mm.sdk.platformtools.n3(getClass().getName() + "_handlerThread_" + java.lang.System.currentTimeMillis());
        this.f100281v = new com.tencent.mm.plugin.fav.ui.ra(getContext(), 64);
        initView();
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(8217, null));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.H;
        if (q17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "do init data for first time");
            this.f100268f = true;
            n3Var.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$k
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                    com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                    favBaseUI.getClass();
                    ((s72.j0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(5, 1, new com.tencent.mm.plugin.fav.ui.m0(favBaseUI));
                }
            });
            java.lang.System.currentTimeMillis();
            if (this.f100268f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "show loading dialog");
                if (d7() == null || d7().isEmpty()) {
                    X6(true);
                    this.f100270h.setVisibility(8);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: GONE");
                }
                Y6(false);
            }
        } else {
            n3Var.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$k
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                    com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                    favBaseUI.getClass();
                    ((s72.j0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(5, 1, new com.tencent.mm.plugin.fav.ui.m0(favBaseUI));
                }
            });
            final boolean G = o72.x1.G();
            n3Var.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$d
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                    final com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                    favBaseUI.getClass();
                    o72.y4 sj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj();
                    final boolean z17 = G;
                    s72.j0 j0Var = (s72.j0) sj6;
                    v65.i.b(j0Var.X6(), null, new s72.m(j0Var, new yz5.a() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$j
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            int i18 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                            final com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI2 = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                            favBaseUI2.getClass();
                            boolean G2 = o72.x1.G();
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(352281, null)) == 1;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doGetAllFavTags] isFinishInitNewTag = ");
                            sb6.append(z18);
                            sb6.append(", lastUseTag = ");
                            boolean z19 = z17;
                            sb6.append(z19);
                            sb6.append(", currentUseTag = ");
                            sb6.append(G2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
                            if (G2 && (!z18 || G2 != z19)) {
                                favBaseUI2.H.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i19 = com.tencent.mm.plugin.fav.ui.FavBaseUI.R;
                                        final com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI3 = com.tencent.mm.plugin.fav.ui.FavBaseUI.this;
                                        favBaseUI3.getClass();
                                        o72.y4 sj7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj();
                                        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$c
                                            @Override // yz5.a
                                            public final java.lang.Object invoke() {
                                                com.tencent.mm.plugin.fav.ui.y8 y8Var;
                                                com.tencent.mm.plugin.fav.ui.z7 z7Var = com.tencent.mm.plugin.fav.ui.FavBaseUI.this.C;
                                                if (z7Var == null || (y8Var = z7Var.f101669o) == null) {
                                                    return null;
                                                }
                                                ym5.a1.f(new com.tencent.mm.plugin.fav.ui.w8(y8Var));
                                                return null;
                                            }
                                        };
                                        s72.j0 j0Var2 = (s72.j0) sj7;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[getAllFavTagsWithCallback] start");
                                        v65.i.b(j0Var2.X6(), null, new s72.j(j0Var2, aVar, null), 1, null);
                                    }
                                });
                            }
                            return null;
                        }
                    }, null), 1, null);
                }
            });
            java.lang.System.currentTimeMillis();
            W6();
            this.B.sendEmptyMessage(52428);
            if (this.G) {
                n3Var.post(new com.tencent.mm.plugin.fav.ui.FavBaseUI$$e());
            }
        }
        ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
        ((a82.o0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
        ((a82.h2) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).yj().b();
        gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.f0(this));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            android.widget.Toast.makeText(this, "[DEBUG FAV]new xml serial=" + o72.d3.f343322b, 0).show();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "[onDestroy]");
        this.K.dead();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "FavoritesBatchSafeCheckerEvent listener release");
        if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteBaseUI", "[onDestroy] return getBaseDB is null");
            return;
        }
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.C;
        if (z7Var != null) {
            com.tencent.mm.plugin.fav.ui.y8 y8Var = z7Var.f101669o;
            if (y8Var != null) {
                kotlinx.coroutines.z0.e(y8Var.f101627f, null, 1, null);
            }
            o75.a aVar = z7Var.f101672r;
            if (aVar != null) {
                t72.b bVar = t72.b.f416040a;
                dm.q3.f239392q.removeObserver(aVar);
            }
            com.tencent.mm.sdk.event.IListener iListener = z7Var.f101673s;
            if (iListener != null) {
                iListener.dead();
            }
        }
        this.f100281v.f();
        this.f100281v = null;
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(this.P);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.B;
        n3Var.removeMessages(52428);
        n3Var.quit();
        this.H.quit();
        this.f100276q.quit();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.tencent.mm.plugin.fav.ui.adapter.c) d7()).f100490w = true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = (com.tencent.mm.plugin.fav.ui.adapter.c) d7();
        cVar.f100490w = false;
        if (cVar.f100491x) {
            cVar.notifyDataSetChanged();
        }
        h45.g0.f278945a = 5;
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.C;
        if (z7Var != null) {
            z7Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.fav.ui.da.class);
        hashSet.add(t82.d.class);
        hashSet.add(t82.r.class);
        hashSet.add(t82.s.class);
        hashSet.add(com.tencent.mm.plugin.fav.ui.u.class);
    }
}
