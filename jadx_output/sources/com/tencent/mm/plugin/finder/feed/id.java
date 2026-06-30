package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class id implements com.tencent.mm.plugin.finder.feed.w20, in5.x, in5.y, im5.b {
    public final jz5.g A;
    public final com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$thanksUpdateListener$1 B;
    public final java.util.Set C;
    public final java.util.List D;
    public final java.lang.Object E;
    public final com.tencent.mm.plugin.finder.assist.e2 F;
    public final com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$heartLikeRemoveByPrivacyListener$1 G;
    public final com.tencent.mm.plugin.finder.feed.sc H;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f107001d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107002e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f107003f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f107004g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f107005h;

    /* renamed from: i, reason: collision with root package name */
    public fp0.t f107006i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f107007m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f107008n;

    /* renamed from: o, reason: collision with root package name */
    public in5.s0 f107009o;

    /* renamed from: p, reason: collision with root package name */
    public yw2.n f107010p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107011q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f107012r;

    /* renamed from: s, reason: collision with root package name */
    public int f107013s;

    /* renamed from: t, reason: collision with root package name */
    public final so2.m6 f107014t;

    /* renamed from: u, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f107015u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f107016v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f107017w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f107018x;

    /* renamed from: y, reason: collision with root package name */
    public r45.ri0 f107019y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f107020z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$thanksUpdateListener$1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$heartLikeRemoveByPrivacyListener$1] */
    public id(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f107001d = context;
        this.f107002e = z17;
        this.f107005h = "";
        this.f107007m = new java.util.ArrayList();
        this.f107008n = c01.z1.r();
        this.f107012r = true;
        this.f107014t = new so2.m6();
        this.f107016v = new java.util.concurrent.CopyOnWriteArraySet();
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.wc(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$thanksUpdateListener$1
            {
                this.__eventId = 1097932050;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.md mdVar = event.f54333g;
                if (mdVar != null && mdVar.f7340d == 2) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.hd(mdVar != null ? jz5.x.a(mdVar.f7337a) : null, mdVar != null ? mdVar.f7339c : null, com.tencent.mm.plugin.finder.feed.id.this, event));
                }
                return false;
            }
        };
        this.C = new java.util.LinkedHashSet();
        this.D = new java.util.ArrayList();
        this.E = new java.lang.Object();
        this.F = new com.tencent.mm.plugin.finder.assist.e2(100L, null, null, 6, null);
        ?? a17 = tm3.a.a(context);
        a0Var = a17 != 0 ? a17 : a0Var;
        this.G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$heartLikeRemoveByPrivacyListener$1
            {
                this.__eventId = 1974411636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent finderHeartLikeRemoveByPrivacyEvent) {
                com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent event = finderHeartLikeRemoveByPrivacyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                cq.k1.a();
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue()) {
                    am.jb jbVar = event.f54279g;
                    java.util.List list = jbVar != null ? jbVar.f7022a : null;
                    if (!(list == null || list.isEmpty())) {
                        if (jbVar != null) {
                            com.tencent.mm.plugin.finder.feed.id idVar = com.tencent.mm.plugin.finder.feed.id.this;
                            synchronized (idVar.E) {
                                ((java.util.ArrayList) idVar.D).add(jbVar);
                            }
                        }
                        com.tencent.mm.plugin.finder.feed.id idVar2 = com.tencent.mm.plugin.finder.feed.id.this;
                        idVar2.F.a(new com.tencent.mm.plugin.finder.feed.rc(idVar2));
                    }
                }
                return false;
            }
        };
        this.H = new com.tencent.mm.plugin.finder.feed.sc(this);
    }

    public static final boolean j(com.tencent.mm.plugin.finder.feed.id idVar) {
        idVar.getClass();
        return (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127978v2).getValue()).r()).intValue() == 1 || idVar.f107018x) && !hc2.s.b();
    }

    public static void m(com.tencent.mm.plugin.finder.feed.id idVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshData");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            lVar = null;
        }
        if (finderItem == null) {
            idVar.getClass();
            return;
        }
        fp0.t tVar = idVar.f107006i;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.gd(z17, finderItem, idVar, lVar), null, 2, null));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(l(), this.f107007m, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = this;
        wxRecyclerAdapter.f293104n = this;
        return wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.p2 b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.feed.qc();
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public r45.ri0 d() {
        return this.f107019y;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void e(android.content.Context context, android.widget.FrameLayout headerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public int f() {
        return this.f107013s;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void g(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public int getScene() {
        com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void h(yw2.n builder, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f107003f = finderItem;
        this.f107004g = gVar;
        this.f107006i = new fp0.t("FinderLikeExecutor");
        this.f107010p = builder;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach ");
        sb6.append(finderItem != null ? java.lang.Long.valueOf(finderItem.getId()) : null);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        fp0.t tVar = this.f107006i;
        if (tVar != null) {
            tVar.e();
        }
        o();
        this.f107007m.clear();
        this.C.clear();
        alive();
        alive();
        try {
            androidx.recyclerview.widget.f2 adapter = builder.o().getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.H);
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.DrawerPresenter", e17, "", new java.lang.Object[0]);
        }
        builder.g(false);
        yw2.n nVar = this.f107010p;
        if (nVar != null) {
            nVar.k().l(true);
        }
        builder.o().getRecyclerView().setLayoutFrozen(false);
        builder.o().setActionCallback(new com.tencent.mm.plugin.finder.feed.yc(this, finderItem));
        yw2.n nVar2 = this.f107010p;
        if (nVar2 != null) {
            android.widget.FrameLayout frameLayout = nVar2.f466655h;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("loadingLayout");
                throw null;
            }
            frameLayout.setVisibility(8);
            nVar2.n().setOnClickListener(null);
        }
        yw2.n nVar3 = this.f107010p;
        if (nVar3 != null) {
            nVar3.p();
        }
        m(this, finderItem, false, null, 6, null);
        if (!this.f107012r) {
            yw2.n nVar4 = this.f107010p;
            if (nVar4 != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.I(nVar4.o(), null, 1, null);
            }
            yw2.n nVar5 = this.f107010p;
            if (nVar5 != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.r(nVar5.o(), false, null, new com.tencent.mm.plugin.finder.feed.zc(this), 3, null);
            }
        }
        this.f107017w = true;
        android.content.Context context = this.f107001d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).O6();
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public androidx.recyclerview.widget.RecyclerView.LayoutManager i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false);
    }

    public final jz5.o k() {
        synchronized (this.E) {
            if (((java.util.ArrayList) this.D).isEmpty()) {
                return null;
            }
            java.util.List<am.jb> S0 = kz5.n0.S0(this.D);
            ((java.util.ArrayList) this.D).clear();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            for (am.jb jbVar : S0) {
                java.util.List list = jbVar.f7022a;
                if (list != null) {
                    java.util.Set X0 = kz5.n0.X0(list);
                    int i17 = jbVar.f7023b;
                    if (i17 == 0) {
                        linkedHashSet2.addAll(X0);
                        linkedHashSet.removeAll(X0);
                    } else if (i17 == 1) {
                        linkedHashSet.addAll(X0);
                        linkedHashSet2.removeAll(X0);
                    }
                }
            }
            return new jz5.o(S0, linkedHashSet, linkedHashSet2);
        }
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f107016v.add(aVar);
    }

    public in5.s l() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderLikeDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                boolean j17 = com.tencent.mm.plugin.finder.feed.id.j(com.tencent.mm.plugin.finder.feed.id.this);
                com.tencent.mm.plugin.finder.feed.id idVar = com.tencent.mm.plugin.finder.feed.id.this;
                return new com.tencent.mm.plugin.finder.convert.kh(j17, new com.tencent.mm.plugin.finder.feed.lc(idVar), new com.tencent.mm.plugin.finder.feed.mc(idVar), new com.tencent.mm.plugin.finder.feed.nc(idVar), new com.tencent.mm.plugin.finder.feed.oc(idVar), new com.tencent.mm.plugin.finder.feed.pc(idVar));
            }
        };
    }

    public final void n(boolean z17) {
        this.f107012r = z17;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "set downContinue " + z17);
    }

    public void o() {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        yw2.n nVar = this.f107010p;
        if (nVar != null) {
            android.widget.TextView h17 = nVar.h();
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.l6 l6Var = new zy2.l6();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107003f;
            l6Var.f477451b = finderItem != null ? finderItem.getFeedObject() : null;
            l6Var.f477452c = this.f107013s;
            l6Var.f477454e = this.f107014t;
            l6Var.f477453d = true;
            cu2.f0 f0Var = cu2.f0.f222391a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f107003f;
            l6Var.f477450a = f0Var.e((finderItem2 == null || (feedObject = finderItem2.getFeedObject()) == null) ? 0 : feedObject.getObjectType());
            ((ht2.y0) s6Var).Ni(h17, l6Var);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.w20
    public void onDetach() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        if (!this.f107017w) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        android.content.Context context = this.f107001d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).P6();
        kotlinx.coroutines.r2 r2Var = this.F.f102114d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        jz5.o k17 = k();
        if (k17 == null) {
            kz5.p0 p0Var = kz5.p0.f313996d;
            kz5.r0 r0Var = kz5.r0.f314002d;
            k17 = new jz5.o(p0Var, r0Var, r0Var);
        }
        java.util.Set set = (java.util.Set) k17.f302842e;
        java.util.Set set2 = (java.util.Set) k17.f302843f;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onDetach blocked:" + set + " restore:" + set2);
        this.C.addAll(set);
        this.C.removeAll(set2);
        if (!this.C.isEmpty()) {
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            am.ia iaVar = feedUpdateEvent.f54252g;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107003f;
            iaVar.f6918a = finderItem != null ? finderItem.getId() : 0L;
            am.ia iaVar2 = feedUpdateEvent.f54252g;
            iaVar2.f6919b = 39;
            iaVar2.f6933p = kz5.n0.S0(this.C);
            feedUpdateEvent.e();
        }
        this.f107017w = false;
        fp0.t tVar = this.f107006i;
        if (tVar != null) {
            tVar.f();
        }
        this.f107006i = null;
        dead();
        dead();
        java.util.Iterator it = this.f107016v.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        this.f107016v.clear();
        this.f107007m.clear();
        this.C.clear();
        synchronized (this.E) {
            ((java.util.ArrayList) this.D).clear();
        }
        this.f107015u = null;
        this.f107011q = false;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "set upContinue false");
        n(true);
        yw2.n nVar = this.f107010p;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = nVar != null ? nVar.o() : null;
        if (o17 != null) {
            o17.setHasBottomMore(true);
        }
        yw2.n nVar2 = this.f107010p;
        com.tencent.mm.view.RefreshLoadMoreLayout o18 = nVar2 != null ? nVar2.o() : null;
        if (o18 != null) {
            o18.setCanLoadMore(true);
        }
        yw2.n nVar3 = this.f107010p;
        if (nVar3 != null && (recyclerView = nVar3.o().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        yw2.n nVar4 = this.f107010p;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = nVar4 != null ? nVar4.o().getRecyclerView() : null;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutFrozen(true);
        }
        yw2.n nVar5 = this.f107010p;
        com.tencent.mm.view.RefreshLoadMoreLayout o19 = nVar5 != null ? nVar5.o() : null;
        if (o19 != null) {
            o19.setActionCallback(null);
        }
        this.f107010p = null;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.f1 f1Var = (so2.f1) holder.f293125i;
        r45.md1 md1Var = f1Var != null ? f1Var.f410336d : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click likeInfo:");
        sb6.append(md1Var != null ? md1Var.getString(5) : null);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107003f;
        if (finderItem == null || md1Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String feedUserName = finderItem.getUserName();
        long id6 = finderItem.getId();
        java.lang.String dupFlag = finderItem.getDupFlag();
        java.lang.String nonceId = finderItem.getObjectNonceId();
        i0Var.getClass();
        kotlin.jvm.internal.o.g(feedUserName, "feedUserName");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.sdk.platformtools.t8.K0(feedUserName) || !kotlin.jvm.internal.o.b(feedUserName, xy2.c.e(context))) {
            intent.putExtra("IsPoster", false);
            intent.putExtra("Action", 2);
        } else {
            intent.putExtra("IsPoster", true);
            intent.putExtra("Action", 1);
            intent.putExtra("feedUser", feedUserName);
        }
        intent.putExtra("Avatar", md1Var.getString(1));
        intent.putExtra("Nickname", md1Var.getString(0));
        intent.putExtra("CommentId", md1Var.getLong(2));
        intent.putExtra("FeedId", id6);
        intent.putExtra("DupFlag", dupFlag);
        intent.putExtra("FeedNonceId", nonceId);
        intent.putExtra("V5UserName", md1Var.getString(5));
        intent.putExtra("hideSendMsg", this.f107002e);
        if (((r45.lz0) md1Var.getCustom(8)) != null) {
            r45.lz0 lz0Var = (r45.lz0) md1Var.getCustom(8);
            intent.putExtra("ContactMsgInfo", lz0Var != null ? lz0Var.toByteArray() : null);
        }
        com.tencent.mm.plugin.finder.view.e3 pl6 = i0Var.pl(context, md1Var.getString(5), intent, 4, new com.tencent.mm.plugin.finder.assist.f0(context));
        android.app.Dialog dialog = pl6.f131957d;
        android.view.Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null) {
            window.addFlags(2);
        }
        android.app.Dialog dialog2 = pl6.f131957d;
        android.view.Window window2 = dialog2 != null ? dialog2.getWindow() : null;
        if (window2 != null) {
            window2.setDimAmount(0.6f);
        }
        if (((r45.lz0) md1Var.getCustom(8)) == null) {
            com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "msgInfo is null ,feedId:" + id6 + ",likeId:" + md1Var.getLong(2));
        }
    }
}
