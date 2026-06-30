package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@db5.a(m123858x6ac9171 = 8192)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavBaseUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC13548xbf543800 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements android.widget.AdapterView.OnItemClickListener {
    public static final /* synthetic */ int R = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 C;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f181803h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f181804i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f181805m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f181806n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f181807o;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181809q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f181810r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f181811s;

    /* renamed from: t, reason: collision with root package name */
    public w82.b0 f181812t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f181813u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f181814v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f181815w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f181816x;

    /* renamed from: d, reason: collision with root package name */
    public boolean f181799d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181800e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181801f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f181802g = 0;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181808p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: y, reason: collision with root package name */
    public boolean f181817y = false;

    /* renamed from: z, reason: collision with root package name */
    public w82.a0 f181818z = null;
    public final java.lang.Object A = new java.lang.Object();
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 B = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e0(this, android.os.Looper.getMainLooper());
    public final boolean D = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fav_finder_show_filter, true);
    public final boolean E = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fav_title_menu_update, true);
    public final boolean F = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_top_filter_open_switch, true);
    public final boolean G = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_sync_fail_retry_open, true);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f181798J = false;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d K = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5434x2d22e975>(this) { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI.2
        {
            this.f39173x3fe91575 = 1640126341;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5434x2d22e975 c5434x2d22e975) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5434x2d22e975 c5434x2d22e9752 = c5434x2d22e975;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "FavoritesBatchSafeCheckerEvent received, secAuthResponse: %s", c5434x2d22e9752.f135778g.f87760a);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
            if (abstractActivityC13548xbf543800.m78542x6d20d943()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "Activity is not resumed, ignore FavoritesBatchSafeCheckerEvent");
            } else {
                java.lang.String str = c5434x2d22e9752.f135778g.f87760a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteBaseUI", "secAuthResponse is null or empty");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "Parsing secAuthResponse with Broadcast");
                    tm.a b17 = tm.a.b(str);
                    if (b17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "Broadcast parsed, showType: %d, url: %s", java.lang.Integer.valueOf(b17.f501933c), b17.f501931a);
                        if (abstractActivityC13548xbf543800.I) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "br.show has already been called, ignore this call");
                        } else {
                            b17.f501936f = 6000;
                            if (b17.c(abstractActivityC13548xbf543800, null, null)) {
                                abstractActivityC13548xbf543800.I = true;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "br.show called successfully, set hasBrShowCalled to true");
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteBaseUI", "Broadcast.parse returned null for secAuthResponse");
                    }
                }
            }
            return true;
        }
    };
    public final java.lang.Runnable L = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k0(this);
    public final java.lang.Runnable M = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l0(this);
    public final java.lang.Runnable N = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c0(this);
    public final l75.q0 P = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d0(this);
    public boolean Q = false;

    public static void U6(final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        abstractActivityC13548xbf543800.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleOrderType] hasInitOrderType = ");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia iaVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182713a;
        sb6.append(iaVar.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
        if (iaVar.b()) {
            return;
        }
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$f
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                java.util.List list = (java.util.List) obj;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf5438002 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                if (abstractActivityC13548xbf5438002.d7().isEmpty()) {
                    abstractActivityC13548xbf5438002.Y6(true);
                    return null;
                }
                abstractActivityC13548xbf5438002.C.h(list, true);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = abstractActivityC13548xbf5438002.C;
                if (!z7Var.f183204q) {
                    z7Var.f();
                }
                abstractActivityC13548xbf5438002.X6(false);
                abstractActivityC13548xbf5438002.Y6(false);
                abstractActivityC13548xbf5438002.f181803h.setVisibility(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: VISIBLE");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[handleOrderType] order type init finish, strings = " + list);
                abstractActivityC13548xbf5438002.d7().notifyDataSetChanged();
                return null;
            }
        };
        abstractActivityC13548xbf543800.f7();
        java.util.Set blockSet = abstractActivityC13548xbf543800.e7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSet, "blockSet");
        if (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182716d) {
            java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182715c;
            if (!arrayList.isEmpty()) {
                lVar.mo146xb9724478(arrayList);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ha(lVar));
    }

    public abstract boolean V6();

    public final void W6() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia iaVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182713a;
        java.util.List a17 = iaVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dealWithLoadingView] hasInitOrderType = ");
        sb6.append(iaVar.b());
        sb6.append(", types.size() = ");
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
        if (iaVar.b() || arrayList.size() > 0) {
            X6(false);
            this.f181803h.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: VISIBLE");
        } else {
            X6(true);
            this.f181803h.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: GONE");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[dealWithLoadingView] empty = " + d7().isEmpty() + ", checkLoading = " + V6());
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
        android.view.View view = this.f181810r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "dealWithLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "dealWithLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void X6(boolean z17) {
        android.view.ViewStub viewStub;
        if (!z17) {
            android.view.View view = this.f181811s;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.f181811s == null && (viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.dfm)) != null) {
            this.f181811s = viewStub.inflate();
        }
        android.view.View view2 = this.f181811s;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyLoadingView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void Y6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "enableEmptyView enable = " + z17);
        if (z17) {
            android.view.View view = this.f181806n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f181804i.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f181806n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enableEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181804i.setVisibility(8);
    }

    public void Z6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[enterMoreMode]");
        a7();
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbj, java.lang.Integer.valueOf(i17)));
        this.C.i(8);
        this.C.j(8);
        android.view.View view = this.f181815w;
        if (view != null && view.getVisibility() == 0) {
            android.view.View view2 = this.f181815w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enterMoreMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "enterMoreMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo78491xd9193382(16, i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.c9s), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$h
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                abstractActivityC13548xbf543800.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da) pf5.z.f435481a.a(abstractActivityC13548xbf543800).a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class);
                if (daVar.f182123u) {
                    daVar.P6();
                } else {
                    abstractActivityC13548xbf543800.c7();
                }
                abstractActivityC13548xbf543800.C.j(0);
                return true;
            }
        });
        this.Q = true;
    }

    public abstract void a7();

    public void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[exitMoreMode]");
        mo54450xbf7c1df6(h7());
        this.C.i(0);
        this.C.j(0);
        android.view.View view = this.f181815w;
        if (view != null && view.getVisibility() == 8) {
            android.view.View view2 = this.f181815w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavBaseUI", "exitMoreMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavBaseUI", "exitMoreMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m78551x8f8ecf18(16);
        this.Q = false;
    }

    public abstract void c7();

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.b d7();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.view.View view = this.C.f183192e;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "x = " + rawX + ", y = " + rawY + ", ait = " + z17);
            if (!z17) {
                this.C.d();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract java.util.Set e7();

    public abstract o72.i4 f7();

    public abstract android.view.View.OnClickListener g7();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ac_;
    }

    public abstract java.lang.String h7();

    public void i7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.b bVar) {
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
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
        boolean a37 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().a3(bVar.f182006d, bVar.f182007e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[handleDataChanged] isEmpty = " + isEmpty + ", hasShowAll = " + a37);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("footerViewsCount = ");
        sb6.append(this.f181803h.getFooterViewsCount());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
        if (isEmpty || a37) {
            this.f181803h.removeFooterView(this.f181810r);
        } else if (this.f181803h.getFooterViewsCount() == 0) {
            this.f181803h.addFooterView(this.f181810r);
        }
        if (!this.f181798J || this.f181803h.isShown() || d7().isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "yes, match after security check, and fix ui visible bug");
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f181807o = findViewById(com.p314xaae8f345.mm.R.id.t_e);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.dxw);
        this.f181803h = listView;
        listView.setDrawingCacheEnabled(false);
        m78597x53c22598(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g0(this));
        this.f181806n = findViewById(com.p314xaae8f345.mm.R.id.f565763dg4);
        this.f181804i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfd);
        this.f181805m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f565757t84);
        j7();
        this.f181810r = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.abn, (android.view.ViewGroup) null);
        this.f181803h.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h0(this));
        this.f181803h.setOnItemClickListener(this);
        this.f181803h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i0(this));
        this.f181803h.setAdapter((android.widget.ListAdapter) d7());
        if (d7() instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c) d7()).K = new s82.i() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$g
                @Override // s82.i
                public final void a(java.lang.String str) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this.k7(str);
                }
            };
        }
        i7(d7());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "init view use %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.f181815w = mo2533x106ab264().j().findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
    }

    public void j7() {
        boolean z17 = this.F;
        if (z17) {
            this.C = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7(this);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia iaVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182713a;
            if (iaVar.b()) {
                this.C.h(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ia.f182715c, false);
                this.C.f();
            } else {
                java.util.List a17 = iaVar.a();
                if (((java.util.ArrayList) a17).size() > 0) {
                    this.C.h(a17, false);
                    this.C.f();
                }
            }
        }
        w82.b0 b0Var = new w82.b0(mo55332x76847179());
        this.f181812t = b0Var;
        b0Var.m173331x103a12d2(this.f181818z);
        this.f181812t.b(false);
        this.f181812t.a(false);
        this.f181812t.getPaddingTop();
        this.f181812t.getPaddingBottom();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.du9);
        if (z17) {
            frameLayout.setVisibility(0);
            frameLayout.addView(this.f181812t);
        } else {
            this.f181803h.addHeaderView(this.f181812t);
            frameLayout.setVisibility(0);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        boolean z18 = this.E;
        if (z18) {
            this.f181813u = android.view.View.inflate(mo55332x76847179, com.p314xaae8f345.mm.R.C30864xbddafb2a.ac6, null);
        } else {
            this.f181813u = android.view.View.inflate(mo55332x76847179, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570301ac5, null);
        }
        android.widget.TextView textView = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwf);
        android.widget.TextView textView2 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwd);
        android.widget.TextView textView3 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dw_);
        android.widget.TextView textView4 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwg);
        android.widget.TextView textView5 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwb);
        android.widget.TextView textView6 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dw9);
        android.widget.TextView textView7 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dw8);
        android.widget.TextView textView8 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwe);
        android.widget.TextView textView9 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwc);
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
            android.widget.TextView textView10 = (android.widget.TextView) this.f181813u.findViewById(com.p314xaae8f345.mm.R.id.dwa);
            textView10.setOnClickListener(g76);
            textView10.setTag(6);
            textView6.setTag(20);
        } else if (this.D) {
            textView6.setTag(20);
        } else {
            textView6.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cd_));
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
        this.f181813u.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j0(this, textView3, textView2, textView8));
        if (z17) {
            return;
        }
        this.f181803h.addHeaderView(this.f181813u);
    }

    public void k7(java.lang.String name) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[onListTagItemClick] name = " + name + ", moreMode = " + this.Q);
        if (this.Q) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.C;
        z7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z6(z7Var, name, 2, true));
    }

    public abstract void l7();

    public abstract void m7();

    public void n7() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f181808p;
        java.lang.Runnable runnable = this.M;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 305 && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[onActivityResult] tagList = " + intent.getStringArrayListExtra("key_fav_result_list"));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[onActivityResult] FAV_SAFE_AUTH_REQUEST_CODE, nextStep = " + str);
            if (!"fav_safe_auth_done".equals(str)) {
                finish();
            } else {
                this.f181798J = true;
                this.H.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.RunnableC13549x29a153e1());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        this.K.mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "FavoritesBatchSafeCheckerEvent listener bindOnInit");
        o72.v4 pj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj();
        if (pj6 instanceof b82.e) {
            ((b82.e) pj6).f99847e = this.D;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", java.lang.Boolean.valueOf(gm0.j1.a()));
        o72.d3 d3Var = o72.d3.f424854a;
        d3Var.d();
        d3Var.e();
        gm0.j1.d().g(new o72.k5());
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this.P);
        this.f181809q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(getClass().getName() + "_handlerThread_" + java.lang.System.currentTimeMillis());
        this.f181814v = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra(mo55332x76847179(), 64);
        mo43517x10010bd5();
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(8217, null));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.H;
        if (q17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "do init data for first time");
            this.f181801f = true;
            n3Var.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$k
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                    abstractActivityC13548xbf543800.getClass();
                    ((s72.j0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(5, 1, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m0(abstractActivityC13548xbf543800));
                }
            });
            java.lang.System.currentTimeMillis();
            if (this.f181801f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "show loading dialog");
                if (d7() == null || d7().isEmpty()) {
                    X6(true);
                    this.f181803h.setVisibility(8);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV visibility: GONE");
                }
                Y6(false);
            }
        } else {
            n3Var.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$k
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                    abstractActivityC13548xbf543800.getClass();
                    ((s72.j0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(5, 1, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m0(abstractActivityC13548xbf543800));
                }
            });
            final boolean G = o72.x1.G();
            n3Var.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$d
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                    final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                    abstractActivityC13548xbf543800.getClass();
                    o72.y4 sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj();
                    final boolean z17 = G;
                    s72.j0 j0Var = (s72.j0) sj6;
                    v65.i.b(j0Var.X6(), null, new s72.m(j0Var, new yz5.a() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$j
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                            final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf5438002 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                            abstractActivityC13548xbf5438002.getClass();
                            boolean G2 = o72.x1.G();
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(352281, null)) == 1;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doGetAllFavTags] isFinishInitNewTag = ");
                            sb6.append(z18);
                            sb6.append(", lastUseTag = ");
                            boolean z19 = z17;
                            sb6.append(z19);
                            sb6.append(", currentUseTag = ");
                            sb6.append(G2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", sb6.toString());
                            if (G2 && (!z18 || G2 != z19)) {
                                abstractActivityC13548xbf5438002.H.mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.R;
                                        final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf5438003 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this;
                                        abstractActivityC13548xbf5438003.getClass();
                                        o72.y4 sj7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj();
                                        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.fav.ui.FavBaseUI$$c
                                            @Override // yz5.a
                                            /* renamed from: invoke */
                                            public final java.lang.Object mo152xb9724478() {
                                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var;
                                                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800.this.C;
                                                if (z7Var == null || (y8Var = z7Var.f183202o) == null) {
                                                    return null;
                                                }
                                                ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w8(y8Var));
                                                return null;
                                            }
                                        };
                                        s72.j0 j0Var2 = (s72.j0) sj7;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSyncService", "[getAllFavTagsWithCallback] start");
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
            this.B.mo50305x3d8a09a2(52428);
            if (this.G) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.RunnableC13553x29a153e5());
            }
        }
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
        ((a82.o0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
        ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).yj().b();
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f0(this));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            android.widget.Toast.makeText(this, "[DEBUG FAV]new xml serial=" + o72.d3.f424855b, 0).show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "[onDestroy]");
        this.K.mo48814x2efc64();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "FavoritesBatchSafeCheckerEvent listener release");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteBaseUI", "[onDestroy] return getBaseDB is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.C;
        if (z7Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = z7Var.f183202o;
            if (y8Var != null) {
                p3325xe03a0797.p3326xc267989b.z0.e(y8Var.f183160f, null, 1, null);
            }
            o75.a aVar = z7Var.f183205r;
            if (aVar != null) {
                t72.b bVar = t72.b.f497573a;
                dm.q3.f320925q.mo127128xb5bdeb7a(aVar);
            }
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = z7Var.f183206s;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
        }
        this.f181814v.f();
        this.f181814v = null;
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).mo49775xc84af884(this.P);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.B;
        n3Var.mo50303x856b99f0(52428);
        n3Var.mo50299x35224f();
        this.H.mo50299x35224f();
        this.f181809q.mo50299x35224f();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c) d7()).f182023w = true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c) d7();
        cVar.f182023w = false;
        if (cVar.f182024x) {
            cVar.notifyDataSetChanged();
        }
        h45.g0.f360478a = 5;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.C;
        if (z7Var != null) {
            z7Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class);
        hashSet.add(t82.d.class);
        hashSet.add(t82.r.class);
        hashSet.add(t82.s.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u.class);
    }
}
