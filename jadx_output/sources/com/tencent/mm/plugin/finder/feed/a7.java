package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public class a7 implements com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter, im5.b, com.tencent.mm.plugin.finder.view.l5, in5.x, in5.y, in5.z {
    public long A;
    public com.tencent.mm.plugin.finder.view.g2 A1;
    public boolean B;
    public com.tencent.mm.plugin.finder.view.si B1;
    public long C;
    public com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView C1;
    public boolean D;
    public final java.util.Map D1;
    public volatile boolean E;
    public final com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentChangeEventListener$1 E1;
    public fp0.t F;
    public android.app.Dialog F1;
    public boolean G;
    public so2.y0 G1;
    public boolean H;
    public final zy2.gc H1;
    public boolean I;
    public final com.tencent.mm.plugin.finder.feed.w2 I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f106206J;
    public boolean K;
    public com.tencent.mm.plugin.finder.view.FinderCommentDrawer L;
    public boolean M;
    public or2.s N;
    public com.tencent.mm.plugin.finder.feed.n2 P;
    public final java.util.HashMap Q;
    public boolean R;
    public com.tencent.mm.plugin.finder.storage.yj0 S;
    public final jz5.g T;
    public final java.util.HashSet U;
    public final jz5.g V;
    public final java.util.HashSet W;
    public com.tencent.mm.plugin.finder.feed.f7 X;
    public long Y;
    public r45.vy0 Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f106207d;

    /* renamed from: e, reason: collision with root package name */
    public int f106208e;

    /* renamed from: f, reason: collision with root package name */
    public final int f106209f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.y f106210g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f106211h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f106212i;

    /* renamed from: l1, reason: collision with root package name */
    public long f106213l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f106214m;

    /* renamed from: n, reason: collision with root package name */
    public int f106215n;

    /* renamed from: o, reason: collision with root package name */
    public yw2.a0 f106216o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.p2 f106217p;

    /* renamed from: p0, reason: collision with root package name */
    public r45.vg7 f106218p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f106219p1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback f106220q;

    /* renamed from: r, reason: collision with root package name */
    public long f106221r;

    /* renamed from: s, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f106222s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f106223t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f106224u;

    /* renamed from: v, reason: collision with root package name */
    public r45.uy0 f106225v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.q2 f106226w;

    /* renamed from: x, reason: collision with root package name */
    public r45.xq2 f106227x;

    /* renamed from: x0, reason: collision with root package name */
    public az2.f f106228x0;

    /* renamed from: x1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentErrorListener$1 f106229x1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f106230y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f106231y0;

    /* renamed from: y1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentImageResetAlphaListener$1 f106232y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f106233z;

    /* renamed from: z1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.n3 f106234z1;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentErrorListener$1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentImageResetAlphaListener$1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentChangeEventListener$1] */
    public a7(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f106207d = context;
        this.f106208e = 58;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f106209f = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127716gb).getValue()).r()).intValue();
        this.f106210g = new com.tencent.mm.plugin.finder.feed.model.y();
        this.f106211h = new java.util.concurrent.CopyOnWriteArraySet();
        this.f106215n = 2;
        this.f106224u = true;
        this.f106233z = true;
        this.C = 1000L;
        this.E = true;
        this.Q = new java.util.HashMap();
        this.T = jz5.h.b(new com.tencent.mm.plugin.finder.feed.p3(this));
        this.U = new java.util.HashSet();
        this.V = jz5.h.b(new com.tencent.mm.plugin.finder.feed.a3(this));
        this.W = new java.util.HashSet();
        this.f106218p0 = r45.vg7.emFinderGetCommentListSortType_Default;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f106229x1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentErrorListener$1
            {
                this.__eventId = -1228617349;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderCommentErrorEvent finderCommentErrorEvent) {
                com.tencent.mm.autogen.events.FinderCommentErrorEvent event = finderCommentErrorEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ua uaVar = event.f54264g;
                int i17 = uaVar.f8068a;
                com.tencent.mm.plugin.finder.feed.a7 a7Var = com.tencent.mm.plugin.finder.feed.a7.this;
                if (i17 != -4013) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.z2(a7Var));
                    return false;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(uaVar.f8069b)) {
                    return false;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.y2(a7Var, event));
                return false;
            }
        };
        final androidx.lifecycle.y a17 = tm3.a.a(context);
        a17 = a17 == null ? a0Var : a17;
        this.f106232y1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent>(a17) { // from class: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentImageResetAlphaListener$1
            {
                this.__eventId = 1111165049;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent finderCommentImageResetAlphaEvent) {
                com.tencent.mm.autogen.events.FinderCommentImageResetAlphaEvent event = finderCommentImageResetAlphaEvent;
                kotlin.jvm.internal.o.g(event, "event");
                yw2.a0 a0Var2 = com.tencent.mm.plugin.finder.feed.a7.this.f106216o;
                android.view.View view = a0Var2 != null ? a0Var2.A : null;
                if (view != null) {
                    float e17 = e06.p.e(event.f54265g.f8185a, 0.0f, 1.0f);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(e17));
                    java.util.Collections.reverse(arrayList);
                    android.view.View view2 = view;
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentImageResetAlphaListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderCommentImageResetAlphaEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentImageResetAlphaListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderCommentImageResetAlphaEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                return false;
            }
        };
        this.f106234z1 = new com.tencent.mm.plugin.finder.feed.n3(this);
        this.D1 = new java.util.LinkedHashMap();
        this.E1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentChangeEventListener$1
            {
                this.__eventId = 449554913;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.FinderCommentChangeEvent r8) {
                /*
                    r7 = this;
                    com.tencent.mm.autogen.events.FinderCommentChangeEvent r8 = (com.tencent.mm.autogen.events.FinderCommentChangeEvent) r8
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r8, r0)
                    r0 = 1
                    com.tencent.mm.plugin.finder.feed.a7 r1 = com.tencent.mm.plugin.finder.feed.a7.this
                    r2 = 0
                    am.ta r3 = r8.f54263g
                    if (r3 == 0) goto L26
                    long r3 = r3.f7993a
                    com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.f106212i
                    if (r5 == 0) goto L1f
                    long r5 = r5.getId()
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 != 0) goto L26
                    r3 = r0
                    goto L27
                L1f:
                    java.lang.String r8 = "feedObj"
                    kotlin.jvm.internal.o.o(r8)
                    r8 = 0
                    throw r8
                L26:
                    r3 = r2
                L27:
                    if (r3 != 0) goto L2b
                    r0 = r2
                    goto L56
                L2b:
                    com.tencent.mm.plugin.finder.feed.v2 r2 = new com.tencent.mm.plugin.finder.feed.v2
                    r2.<init>(r8, r1)
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    android.os.Looper r3 = android.os.Looper.getMainLooper()
                    java.lang.Thread r3 = r3.getThread()
                    boolean r8 = kotlin.jvm.internal.o.b(r8, r3)
                    if (r8 == 0) goto L46
                    r2.invoke()
                    goto L56
                L46:
                    yw2.a0 r8 = r1.f106216o
                    if (r8 == 0) goto L56
                    com.tencent.mm.plugin.finder.view.FinderCommentDrawer r8 = r8.k()
                    com.tencent.mm.plugin.finder.feed.t2 r1 = new com.tencent.mm.plugin.finder.feed.t2
                    r1.<init>(r2)
                    r8.post(r1)
                L56:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentChangeEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.H1 = new com.tencent.mm.plugin.finder.feed.y4(this);
        this.I1 = new com.tencent.mm.plugin.finder.feed.w2(this);
    }

    public static final void A(com.tencent.mm.plugin.finder.feed.a7 a7Var, android.view.View view) {
        yw2.a0 a0Var = a7Var.f106216o;
        if (a0Var != null) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var.n();
            if (n17.isShowKeyboard) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getGlobalVisibleRect(rect);
                int i17 = rect.bottom;
                yw2.a0 a0Var2 = a7Var.f106216o;
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer k17 = a0Var2 != null ? a0Var2.k() : null;
                kotlin.jvm.internal.o.d(k17);
                k17.getGlobalVisibleRect(rect);
                int i18 = rect.bottom - i17;
                int height = n17.getHeight() + com.tencent.mm.ui.bl.c(a7Var.f106207d);
                if (i18 < height) {
                    int i19 = i18 - height;
                    yw2.a0 a0Var3 = a7Var.f106216o;
                    androidx.recyclerview.widget.RecyclerView recyclerView = a0Var3 != null ? a0Var3.k().getRecyclerView() : null;
                    kotlin.jvm.internal.o.d(recyclerView);
                    recyclerView.animate().translationY(i19).setDuration(90L).start();
                }
            }
        }
    }

    public static final void B(com.tencent.mm.plugin.finder.feed.a7 a7Var, java.util.List list) {
        if (!a7Var.R || list.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "translateCommentLoadMore " + list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            so2.y0 y0Var = (so2.y0) obj;
            boolean p17 = y0Var.p(a7Var.n0());
            if (p17) {
                y0Var.f410709m = 1;
                y0Var.f410710n = 2;
            }
            if (p17) {
                arrayList.add(obj);
            }
        }
        android.content.Context context = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).R6(arrayList);
    }

    public static final void C(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        if (a7Var.f106212i == null) {
            return;
        }
        int commentScene = a7Var.getCommentScene();
        xc2.k0 k0Var = (xc2.k0) pf5.u.f353936a.e(zy2.b6.class).a(xc2.k0.class);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        long id6 = finderItem.getId();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
        if (finderItem2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        r45.ns2 ns2Var = (r45.ns2) k0Var.b7(id6, commentScene, finderItem2.getDupFlag()).getValue();
        com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
        pm0.v.b0(yVar.f108469d, com.tencent.mm.plugin.finder.feed.q6.f108799d);
        if (ns2Var != null) {
            java.lang.String string = ns2Var.getString(0);
            if (!(string == null || string.length() == 0)) {
                int i17 = yVar.f108468c == null ? 0 : 1;
                java.util.ArrayList arrayList = yVar.f108469d;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
                if (finderItem3 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                arrayList.add(i17, new so2.b1(finderItem3, ns2Var));
                com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "tryInsertRecommendLiveMicTopicItem inserted at " + i17 + ", micTopic=" + ns2Var.getString(0));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "tryInsertRecommendLiveMicTopicItem skip, info=" + ns2Var);
    }

    public static final void g(com.tencent.mm.plugin.finder.feed.a7 a7Var, r45.vg7 vg7Var) {
        if (a7Var.j0() != vg7Var) {
            a7Var.f106218p0 = vg7Var;
            yw2.a0 a0Var = a7Var.f106216o;
            if (a0Var != null) {
                a0Var.w();
            }
            u0(a7Var, false, 0, 0, 7, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        a7Var.getClass();
        long t07 = y0Var.f410703d.t0();
        com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
        int e17 = yVar.e(t07) + (!z17 ? 1 : 0);
        if (y0Var.h() != 1 || e17 == -1) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        if (finderItem.isSelfFeed()) {
            long c17 = c01.id.c();
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_HINT_TIME_LIST_STRING_SYNC, null);
            java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (str != null) {
                java.util.Iterator it = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null).iterator();
                while (it.hasNext()) {
                    linkedList.add(java.lang.Long.valueOf(pm0.v.Z((java.lang.String) it.next())));
                }
            }
            pm0.v.d0(linkedList, com.tencent.mm.plugin.finder.feed.s2.f108967d);
            linkedList.add(java.lang.Long.valueOf(c17));
            int size = linkedList.size();
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_HINT_LAST_TIME_LONG_SYNC;
            boolean z18 = false;
            java.lang.Object[] objArr = c17 - c18.t(u3Var, 0L) >= java.util.concurrent.TimeUnit.DAYS.toMillis(30L);
            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_HINT_SHOW_TIME_INT_SYNC;
            int r17 = c19.r(u3Var2, 0);
            if (r17 < 2 && r17 != -1) {
                z18 = true;
            }
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "currentOptCount: " + size + ", showCount: " + r17 + ", noLimited: " + z18);
            if (size >= ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Sa).getValue()).r()).intValue() && objArr != false && z18) {
                yVar.f108469d.add(e17, new so2.a1());
                yw2.a0 a0Var = a7Var.f106216o;
                if (a0Var != null && (recyclerView = a0Var.s().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(c17));
                gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(r17 + 1));
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_HINT_TIME_LIST_STRING_SYNC, kz5.n0.g0(linkedList, "#", null, null, 0, null, null, 62, null));
        }
    }

    public static final void i(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        a7Var.getClass();
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        if (!a7Var.f106223t || isTeenMode || a7Var.M) {
            yw2.a0 a0Var = a7Var.f106216o;
            if (a0Var != null) {
                a0Var.h(false);
            }
            yw2.a0 a0Var2 = a7Var.f106216o;
            if (a0Var2 != null) {
                a0Var2.k().l(true);
                return;
            }
            return;
        }
        yw2.a0 a0Var3 = a7Var.f106216o;
        com.tencent.mm.view.RefreshLoadMoreLayout s17 = a0Var3 != null ? a0Var3.s() : null;
        if (s17 != null) {
            s17.setLimitTopRequest(-1);
        }
        yw2.a0 a0Var4 = a7Var.f106216o;
        if (a0Var4 != null) {
            a0Var4.h(true);
        }
        yw2.a0 a0Var5 = a7Var.f106216o;
        if (a0Var5 != null) {
            float a17 = a0Var5.s().getA();
            yw2.a0 a0Var6 = a7Var.f106216o;
            com.tencent.mm.view.RefreshLoadMoreLayout s18 = a0Var6 != null ? a0Var6.s() : null;
            if (s18 == null) {
                return;
            }
            s18.setTranslationY(-a17);
        }
    }

    public static final void m(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, boolean z17) {
        ec2.d e27;
        android.content.Context context = a7Var.f106207d;
        jz5.f0 f0Var = null;
        boolean z18 = true;
        if (z17) {
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
                if (finderItem == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                long id6 = finderItem.getId();
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
                if (finderItem2 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                e27.a(new ec2.a(29, id6, finderItem2.getDupFlag()));
            }
        }
        android.app.Dialog dialog = a7Var.F1;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.content.Context context2 = a7Var.f106207d;
            a7Var.F1 = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.feed.b3.f106343d);
        }
        com.tencent.mm.plugin.finder.feed.f3 f3Var = new com.tencent.mm.plugin.finder.feed.f3(a7Var, z17, y0Var);
        com.tencent.mm.plugin.finder.feed.d3 d3Var = new com.tencent.mm.plugin.finder.feed.d3(a7Var, y0Var, f3Var, new com.tencent.mm.plugin.finder.feed.e3(a7Var));
        if (!y0Var.f410703d.d1()) {
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = y0Var.f410703d;
            if (yj0Var.field_localCommentId != 0) {
                mv2.l lVar = mv2.l.f331597d;
                lVar.getClass();
                mv2.b bVar = new mv2.b(yj0Var, null, 0, 6, null);
                fp0.o oVar = lVar.f331598a;
                oVar.getClass();
                pm0.v.X(new fp0.l(oVar, bVar));
                if (oVar.e(new mv2.b(yj0Var, null, 0, 6, null))) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", "removeWhenNotDoingNetScene " + yj0Var + " is running");
                    z18 = false;
                } else {
                    com.tencent.mars.xlog.Log.i("Finder.FinderActionManager", "removeWhenNotDoingNetScene " + yj0Var);
                    ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.field_localCommentId);
                }
                if (z18) {
                    f3Var.invoke();
                    return;
                }
                android.app.Dialog dialog2 = a7Var.F1;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                db5.t7.makeText(context, com.tencent.mm.R.string.eyg, 0).show();
                return;
            }
        }
        d3Var.invoke();
    }

    public static final void p(com.tencent.mm.plugin.finder.feed.a7 a7Var, java.util.List itemList, so2.y0 rootComment, boolean z17) {
        int i17;
        yw2.a0 a0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        int i18;
        com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
        yVar.getClass();
        kotlin.jvm.internal.o.g(itemList, "itemList");
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        java.util.List d17 = yVar.d(itemList);
        int g17 = yVar.g(rootComment.f410703d.t0(), z17);
        yVar.f108469d.addAll(g17, d17);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(g17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.util.ArrayList) d17).size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + itemList.size() + ", down:" + z17 + ", rootCommentId:" + rootComment.getItemId());
        if (intValue2 < 0 || intValue < 0 || intValue >= yVar.h() || (i17 = intValue + intValue2) > yVar.h() || (a0Var = a7Var.f106216o) == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (intValue2 > 0) {
            adapter.notifyItemRangeInserted(intValue, intValue2);
        }
        if (!z17 || (i18 = intValue - 1) < 0) {
            if (z17 || i17 >= yVar.h()) {
                return;
            }
            adapter.notifyItemChanged(i17, 1);
            return;
        }
        adapter.notifyItemChanged(i18, 1);
        yw2.a0 a0Var2 = a7Var.f106216o;
        if (a0Var2 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.r(a0Var2.s(), false, null, com.tencent.mm.plugin.finder.feed.o3.f108618d, 3, null);
        }
    }

    public static final boolean q(com.tencent.mm.plugin.finder.feed.a7 a7Var, int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View findViewByPosition;
        yw2.a0 a0Var = a7Var.f106216o;
        androidx.recyclerview.widget.RecyclerView recyclerView = a0Var != null ? a0Var.s().getRecyclerView() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView != null ? recyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
        if (linearLayoutManager == null || (layoutManager = recyclerView.getLayoutManager()) == null || (findViewByPosition = layoutManager.findViewByPosition(i17)) == null) {
            return false;
        }
        return linearLayoutManager.isViewPartiallyVisible(findViewByPosition, true, false);
    }

    public static final void s(com.tencent.mm.plugin.finder.feed.a7 a7Var, r45.ty0 ty0Var) {
        if (ty0Var == null) {
            a7Var.getClass();
            return;
        }
        android.content.Context context = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            ec2.d e27 = zy2.ra.e2(nyVar, 0, 1, null);
            if (e27 != null) {
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
                if (finderItem == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                long id6 = finderItem.getId();
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
                if (finderItem2 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                java.lang.String dupFlag = finderItem2.getDupFlag();
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = a7Var.L;
                int i17 = finderCommentDrawer != null ? finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0;
                long j17 = ty0Var.getLong(1);
                ec2.a aVar = new ec2.a(30, id6, dupFlag);
                aVar.f250950h = new ec2.c(0, false, false, i17, j17, 0, 36, null);
                e27.a(aVar);
            }
        }
    }

    public static void u0(com.tencent.mm.plugin.finder.feed.a7 a7Var, boolean z17, int i17, int i18, int i19, java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.feed.p2 p2Var;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshData");
        }
        boolean z18 = (i19 & 1) != 0 ? true : z17;
        int i27 = (i19 & 2) != 0 ? 0 : i17;
        int i28 = (i19 & 4) == 0 ? i18 : 0;
        a7Var.getClass();
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "refreshData " + z18 + " return for teen mode");
            return;
        }
        java.util.Iterator it = a7Var.f106210g.f108469d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((so2.y0) obj2).f410703d.j1()) {
                    break;
                }
            }
        }
        so2.y0 y0Var = (so2.y0) obj2;
        if (y0Var != null && (p2Var = a7Var.f106217p) != null) {
            p2Var.a(y0Var.f410703d.t0(), y0Var.f410703d.field_localCommentId, false);
        }
        a7Var.f106222s = null;
        a7Var.D0(true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        fp0.t tVar = a7Var.F;
        if (tVar != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.k5(z18, a7Var, i27, i28, currentTimeMillis), null, 2, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01dc  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r3v36, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract] */
    /* JADX WARN: Type inference failed for: r3v50, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.tencent.mm.plugin.finder.view.FinderCommentFooter] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.tencent.mm.plugin.finder.view.FinderCommentFooter] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.tencent.mm.api.IEmojiInfo] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.tencent.mm.api.IEmojiInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(com.tencent.mm.plugin.finder.feed.a7 r55, int r56, java.util.List r57, java.lang.CharSequence r58, boolean r59) {
        /*
            Method dump skipped, instructions count: 2079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.v(com.tencent.mm.plugin.finder.feed.a7, int, java.util.List, java.lang.CharSequence, boolean):void");
    }

    public static final void y(com.tencent.mm.plugin.finder.feed.a7 a7Var, int i17, fp0.r rVar) {
        a7Var.getClass();
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context = a7Var.f106207d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        o3Var.Di(context, finderItem);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
        if (finderItem2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        long id6 = finderItem2.getId();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
        if (finderItem3 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String dupFlag = finderItem3.getDupFlag();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = a7Var.f106212i;
        if (finderItem4 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String objectNonceId = finderItem4.getObjectNonceId();
        int i18 = a7Var.f106215n;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = a7Var.f106212i;
        if (finderItem5 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String userName = finderItem5.getUserName();
        com.tencent.mm.protobuf.g gVar = a7Var.f106222s;
        android.content.Context context2 = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        pq5.g l17 = new db2.j4(id6, dupFlag, objectNonceId, i17, i18, userName, gVar, null, 0L, false, nyVar != null ? nyVar.V6() : null, 1, a7Var.Z(), a7Var.j0(), 0, 16768, null).l();
        pq5.g h17 = l17.q(new com.tencent.mm.plugin.finder.feed.c5(a7Var, l17, rVar)).h(new com.tencent.mm.plugin.finder.feed.d5(a7Var, rVar));
        android.content.Context context3 = a7Var.f106207d;
        kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        h17.f((com.tencent.mm.ui.MMActivity) context3);
    }

    public static final void z(com.tencent.mm.plugin.finder.feed.a7 a7Var, r45.my0 my0Var, boolean z17) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        android.content.Context context = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        java.lang.Object obj = null;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        com.tencent.mm.plugin.finder.feed.q2 q2Var = a7Var.f106226w;
        java.lang.Object obj2 = q2Var != null ? q2Var.f108791a : null;
        java.lang.Object valueOf = q2Var != null ? java.lang.Long.valueOf(q2Var.f108792b) : null;
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        try {
            cl0.g gVar = new cl0.g();
            if (my0Var == null || (str = my0Var.getString(4)) == null) {
                str = "";
            }
            try {
                byte[] decode = android.util.Base64.decode(str, 0);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                cl0.g gVar2 = new cl0.g(new java.lang.String(decode, r26.c.f368865a));
                gVar2.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1014);
                gVar.h("referer", gVar2);
            } catch (org.json.JSONException unused) {
                new cl0.g();
            }
            gVar.h("feedid", pm0.v.u(feedObject.getId()));
            gVar.h("commenttext", my0Var != null ? my0Var.getString(1) : null);
            gVar.h("entersessionid", obj2);
            gVar.h("requestid", valueOf);
            if (my0Var != null && (finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) my0Var.getCustom(2)) != null) {
                obj = java.lang.Integer.valueOf(finderJumpInfo2.getBusiness_type());
            }
            gVar.h("businessType", obj);
            gVar.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
            if (my0Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) my0Var.getCustom(2)) != null) {
                org.json.JSONObject json = finderJumpInfo.toJSON();
                json.remove("ext_info");
                json.remove("style");
                gVar.h("jump_info", json);
            }
            com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "feed_jumpicon", z17 ? 1 : 0, gVar, true, null, 32, null);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderReportLogic", e17.getMessage());
        }
    }

    public final void A0(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        yw2.a0 a0Var = this.f106216o;
        if (a0Var == null || (recyclerView = a0Var.k().getRecyclerView()) == null) {
            return;
        }
        if (i17 >= 0 && i17 < this.f106210g.f108469d.size()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "scrollToAndBlink", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "scrollToAndBlink", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            d(i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void B0(boolean z17) {
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            a0Var.n().D(z17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0() {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.C0():void");
    }

    public void D(so2.y0 item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        this.G1 = z17 ? item : null;
        java.lang.Runnable H0 = H0();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.y yVar = hb2.y.f280114e;
        long itemId = item.getItemId();
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = item.f410703d;
        long j17 = yj0Var.field_feedId;
        java.lang.String str = yj0Var.field_objectNonceId;
        if (str == null) {
            str = "";
        }
        yVar.o(itemId, j17, str, true, new com.tencent.mm.plugin.finder.feed.r2(this, H0, item, z17));
    }

    public final void D0(boolean z17) {
        this.f106224u = z17;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "set downContinue " + z17);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void E(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onClickResendComment position:" + i17);
            return;
        }
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f106210g.f(i17).f410703d;
        if (yj0Var.field_state == -1) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a.c(this.f106207d, yj0Var.Z0(), 1, new com.tencent.mm.plugin.finder.feed.n4(yj0Var, this));
        }
    }

    public void E0(so2.y0 item, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        if (z17) {
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter.L(this, this.f106207d, item, 2, null, 8, null);
            return;
        }
        java.util.Iterator it = this.f106210g.f108469d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (hc2.c0.c(((so2.y0) it.next()).f410703d.z0())) {
                break;
            } else {
                i17++;
            }
        }
        if (!(i17 != -1)) {
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter.L(this, this.f106207d, item, 1, null, 8, null);
            return;
        }
        android.content.Context context = this.f106207d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.f211872n = com.tencent.mm.plugin.finder.feed.w5.f110952d;
        k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.x5(this, item);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(inflate.getContext().getResources().getString(com.tencent.mm.R.string.m9w));
        k0Var.s(inflate, false);
        k0Var.v();
    }

    public final int F() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        int i17;
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.w0().r()).intValue() == 1) {
            bu2.j jVar = bu2.j.f24534a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            finderItem = jVar.h(finderItem2.getId());
            if (finderItem == null && (finderItem = this.f106212i) == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
        } else {
            finderItem = this.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
        }
        int commentCount = finderItem.getCommentCount();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateCommentCount ");
        com.tencent.mm.plugin.finder.feed.model.y yVar = this.f106210g;
        sb6.append(yVar.h());
        sb6.append(", commentCount=");
        sb6.append(commentCount);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        java.util.ArrayList arrayList = yVar.f108469d;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if ((!((so2.y0) it.next()).f410703d.a1()) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        return java.lang.Math.max(i17 - (yVar.f108468c != null ? 1 : 0), commentCount);
    }

    public final void F0(boolean z17) {
        this.f106223t = z17;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "set upContinue " + z17);
    }

    public final boolean G() {
        java.util.LinkedList list;
        r45.vy0 vy0Var = this.Z;
        boolean z17 = false;
        int size = (vy0Var == null || (list = vy0Var.getList(0)) == null) ? 0 : list.size();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Yb).getValue()).r()).booleanValue();
        if (size > 0 && booleanValue) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "[canShowCommentSort] enable:" + z17 + " sortCtrlSize:" + size + " switchEnabled:" + booleanValue);
        return z17;
    }

    public final void G0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, so2.y0 y0Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        az2.f fVar = this.f106228x0;
        if (fVar != null) {
            fVar.a();
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        long id6 = feed.getFeedObject().getId();
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(qt2Var.getInteger(5)));
        cq.j1.i(kVar, D0, 2, id6, j17, qt2Var, new com.tencent.mm.plugin.finder.feed.z5(this, y0Var, j17, feed), new com.tencent.mm.plugin.finder.feed.b6(this));
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void H(android.view.View view, so2.y0 item) {
        r45.j60 j60Var;
        java.util.LinkedList list;
        r45.j60 j60Var2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            a0Var.t();
        }
        if (this.f106212i != null) {
            android.content.Intent intent = new android.content.Intent(this.f106207d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.class);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            ok5.d.b(intent, "feedObjKey", finderItem, new ok5.h());
            intent.putExtra("initCommentIdKey", item.getItemId());
            com.tencent.mm.protobuf.g gVar = this.f106222s;
            intent.putExtra("initLastBufferKey", gVar != null ? gVar.g() : null);
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.L;
            intent.putExtra("reasonKey", finderCommentDrawer != null ? java.lang.Integer.valueOf(finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String()) : null);
            intent.putExtra("openContextHashKey", this.f106207d.hashCode());
            intent.putExtra("shouldRunDragAnimationKey", true);
            intent.putExtra("FinderScene", 1);
            java.util.ArrayList arrayList = this.f106210g.f108469d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((so2.y0) next).f410703d.w0() == 2) {
                    arrayList2.add(next);
                }
            }
            ok5.d.b(intent, "initCommentsKey", arrayList2, new ok5.h());
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getGlobalVisibleRect(rect);
            intent.putExtra("commentImageRectKey", rect);
            yw2.a0 a0Var2 = this.f106216o;
            if (a0Var2 != null) {
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer k17 = a0Var2.k();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                k17.getSquares().getGlobalVisibleRect(rect2);
                intent.putExtra("commentDrawerRectKey", rect2);
            }
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.l7) ((zy2.b6) c17)).cl(zy2.z5.f477639d, true);
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(this.f106207d);
            if (a17 != null) {
                a17.mmStartActivityForResult((com.tencent.mm.ui.da) new com.tencent.mm.plugin.finder.feed.l4(this), intent, 0);
            } else {
                android.content.Context context = this.f106207d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "onClickCommentImageToImageFlow", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "onClickCommentImageToImageFlow", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            yw2.a0 a0Var3 = this.f106216o;
            if (a0Var3 == null) {
                return;
            }
            a0Var3.A = view;
            return;
        }
        com.tencent.mars.xlog.Log.e("Finder.DrawerPresenter", "onClickCommentImageToImageFlow: feedObj is not initialized");
        java.util.LinkedList Q0 = item.f410703d.Q0();
        java.lang.String string = (Q0 == null || (j60Var2 = (r45.j60) kz5.n0.Z(Q0)) == null) ? null : j60Var2.getString(0);
        if (string == null || string.length() == 0) {
            r45.e60 v07 = item.f410703d.v0();
            j60Var = (v07 == null || (list = v07.getList(1)) == null) ? null : (r45.j60) kz5.n0.Z(list);
        } else {
            java.util.LinkedList Q02 = item.f410703d.Q0();
            j60Var = Q02 != null ? (r45.j60) kz5.n0.Z(Q02) : null;
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "click localImage");
        }
        if (j60Var == null) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        java.lang.String string2 = j60Var.getString(0);
        java.lang.String string3 = j60Var.getString(1);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Wc).getValue()).r()).booleanValue()) {
            string2 = android.net.Uri.parse(j60Var.getString(0)).buildUpon().clearQuery().toString() + "-failedTest";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j60Var.getString(7));
        java.lang.String string4 = j60Var.getString(8);
        if (string4 == null) {
            string4 = "";
        }
        sb6.append(string4);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(string2);
        sb8.append(string3 == null ? "" : string3);
        intent2.putExtra("nowUrl", sb8.toString());
        intent2.putExtra("thumbUrl", sb7);
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
        sb9.append(string2);
        sb9.append(string3 != null ? string3 : "");
        strArr[0] = sb9.toString();
        intent2.putExtra("urlList", strArr);
        intent2.putExtra("isFromWebView", false);
        intent2.putExtra("ShowIndicator", false);
        intent2.putExtra("BottomSheetStyle", 0);
        intent2.putExtra("FinderScene", 1);
        intent2.putExtra("FinderCommentId", item.f410703d.t0());
        intent2.putExtra("FinderFeedId", item.f410703d.field_feedId);
        intent2.putExtra("FinderRawUrl", string2);
        intent2.putExtra("FinderUrlToken", string3);
        android.content.Context context2 = this.f106207d;
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        intent2.putExtra("key_ref_comment_scene", V6 != null ? V6.getInteger(5) : 0);
        intent2.putExtra("key_click_tab_context_id", V6 != null ? V6.getString(2) : null);
        intent2.putExtra("key_context_id", V6 != null ? V6.getString(1) : null);
        intent2.putExtra("KEY_FINDER_OPEN_CONTEXT_HASH", context2.hashCode());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cl(zy2.z5.f477639d, true);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect3);
        int width = rect3.width();
        int height = rect3.height();
        int i17 = rect3.left;
        int i18 = rect3.top;
        int k18 = i65.a.k(context2);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "doPreviewImg left %d, top %d, w %d, h %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
        intent2.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", i17).putExtra("img_gallery_top", i18);
        if (width > 0 && height > 0 && height < k18) {
            intent2.putExtra("shouldRunDragAnimation", true);
        }
        intent2.putExtra("img_gallery_width", width);
        view.postDelayed(new com.tencent.mm.plugin.finder.feed.k4(view), 400L);
        j45.l.j(context2, "subapp", ".ui.gallery.GestureGalleryUI", intent2, null);
        yw2.a0 a0Var4 = this.f106216o;
        if (a0Var4 == null) {
            return;
        }
        a0Var4.A = view;
    }

    public final java.lang.Runnable H0() {
        jz5.f0 f0Var;
        android.app.Dialog dialog = this.F1;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.content.Context context = this.f106207d;
            this.F1 = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f106207d.getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.feed.o6.f108623d);
        }
        com.tencent.mm.plugin.finder.feed.p6 p6Var = new com.tencent.mm.plugin.finder.feed.p6(this);
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            a0Var.s().postDelayed(p6Var, 5000L);
        }
        return p6Var;
    }

    public final void I(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        so2.z0 z0Var = this.f106210g.f108468c;
        if (z0Var != null) {
            z0Var.H = z17;
            yw2.a0 a0Var = this.f106216o;
            if (a0Var == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
                return;
            }
            adapter.notifyItemChanged(0);
        }
    }

    public final void I0(so2.y0 item, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        int e17;
        kotlin.jvm.internal.o.g(item, "item");
        this.R = !z17;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "translateAllComment cancel:" + this.R);
        boolean z18 = this.R;
        com.tencent.mm.plugin.finder.feed.model.y yVar = this.f106210g;
        if (!z18) {
            java.util.Iterator it = yVar.f108469d.iterator();
            while (it.hasNext()) {
                ((so2.y0) it.next()).f410710n = 0;
            }
            yw2.a0 a0Var = this.f106216o;
            if (a0Var == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
                return;
            }
            adapter.notifyDataSetChanged();
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(this.Q);
        int size = 20 - hashMap.size();
        if (size > 0 && (e17 = yVar.e(item.getItemId())) != -1) {
            int min = java.lang.Math.min(size + e17, yVar.f108469d.size());
            while (e17 < min) {
                java.lang.Object obj = yVar.f108469d.get(e17);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                so2.y0 y0Var = (so2.y0) obj;
                hashMap.put(java.lang.Long.valueOf(y0Var.getItemId()), y0Var);
                e17++;
            }
        }
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : values) {
            so2.y0 y0Var2 = (so2.y0) obj2;
            boolean p17 = y0Var2.p(n0());
            if (p17) {
                y0Var2.f410709m = 1;
                y0Var2.f410710n = 2;
            }
            if (p17) {
                arrayList.add(obj2);
            }
        }
        java.util.List S0 = kz5.n0.S0(arrayList);
        android.content.Context context = this.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).R6(S0);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean J(so2.y0 comment, boolean z17) {
        boolean z18;
        boolean z19;
        kotlin.jvm.internal.o.g(comment, "comment");
        long Y0 = comment.f410703d.Y0();
        com.tencent.mm.plugin.finder.feed.model.y yVar = this.f106210g;
        boolean z27 = false;
        if (Y0 == 0) {
            if (!z17) {
                return false;
            }
            yVar.getClass();
            if (comment.getItemId() != 0) {
                java.util.Iterator it = yVar.f108469d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((so2.y0) it.next()).f410703d.Y0() == comment.getItemId()) {
                        z27 = true;
                        break;
                    }
                }
            }
            return !z27;
        }
        int i17 = -1;
        if (z17) {
            yVar.getClass();
            java.util.Iterator it6 = yVar.f108469d.iterator();
            int i18 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    z19 = false;
                    break;
                }
                java.lang.Object next = it6.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.y0 comment1 = (so2.y0) next;
                kotlin.jvm.internal.o.g(comment1, "comment1");
                if (!(comment1.getItemId() == comment.getItemId())) {
                    if (i17 >= 0 && yVar.i(comment1, comment)) {
                        z19 = true;
                        break;
                    }
                } else {
                    i17 = i18;
                }
                i18 = i19;
            }
            if (z19) {
                return false;
            }
        } else {
            yVar.getClass();
            java.util.Iterator it7 = yVar.f108469d.iterator();
            int i27 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it7.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.y0 comment12 = (so2.y0) next2;
                kotlin.jvm.internal.o.g(comment12, "comment1");
                if (!(comment12.getItemId() == comment.getItemId())) {
                    if (yVar.i(comment12, comment)) {
                        i17 = i27;
                    }
                    i27 = i28;
                } else if (i17 >= 0 && i17 < i27) {
                    z18 = true;
                }
            }
            z18 = false;
            if (z18) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(com.tencent.mm.plugin.finder.storage.FinderItem r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.J0(com.tencent.mm.plugin.finder.storage.FinderItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void K(int i17) {
        java.util.ArrayList arrayList = this.f106210g.f108469d;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "preloadNextPage, onScrollIdle, lastVisiblePosition:" + i17 + ", dataList size:" + arrayList.size() + ", canPreload:" + this.H);
        if (i17 < 0 || i17 >= arrayList.size() || arrayList.size() - i17 > com.tencent.mm.plugin.finder.storage.t70.f127590a.s() || this.M) {
            return;
        }
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "preloadNextPage return for teen mode.");
            return;
        }
        if (this.H) {
            this.H = false;
            fp0.t tVar = this.F;
            if (tVar != null) {
                tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.b5(this), null, 2, null));
            }
        }
    }

    public final void M() {
        android.view.View f213435x;
        android.widget.TextView textView;
        if (!this.f106224u) {
            yw2.a0 a0Var = this.f106216o;
            if (a0Var != null) {
                com.tencent.mm.view.RefreshLoadMoreLayout.I(a0Var.s(), null, 1, null);
                return;
            }
            return;
        }
        yw2.a0 a0Var2 = this.f106216o;
        if (!(a0Var2 != null && a0Var2.s().isHasBottomMore)) {
            yw2.a0 a0Var3 = this.f106216o;
            com.tencent.mm.view.RefreshLoadMoreLayout s17 = a0Var3 != null ? a0Var3.s() : null;
            if (s17 != null) {
                s17.setHasBottomMore(true);
            }
        }
        yw2.a0 a0Var4 = this.f106216o;
        if (a0Var4 == null || (f213435x = a0Var4.s().getF213435x()) == null || (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) == null) {
            return;
        }
        textView.setText(this.f106207d.getText(com.tencent.mm.R.string.f490468vx));
        textView.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public so2.y0 N(long j17) {
        com.tencent.mm.plugin.finder.feed.model.y yVar = this.f106210g;
        java.lang.Object obj = null;
        if (j17 == 0) {
            yVar.getClass();
            return null;
        }
        java.util.Iterator it = yVar.f108469d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((so2.y0) next).f410703d.t0() == j17) {
                obj = next;
                break;
            }
        }
        return (so2.y0) obj;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean O(int i17) {
        so2.y0 y0Var = (so2.y0) kz5.n0.a0(this.f106210g.f108469d, i17);
        return y0Var != null && y0Var.getItemId() == this.f106213l1;
    }

    public final void P(so2.y0 item, boolean z17) {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        boolean z18;
        com.tencent.mm.plugin.finder.storage.FinderItem h18;
        kotlin.jvm.internal.o.g(item, "item");
        if (item.f410703d.Y0() != 0) {
            java.util.Iterator it = this.f106210g.f108469d.iterator();
            while (it.hasNext()) {
                so2.y0 y0Var = (so2.y0) it.next();
                if (y0Var.f410703d.t0() == item.f410703d.Y0()) {
                    y0Var.f410703d.u0().setExpandCommentCount(r7.A0() - 1);
                    if (y0Var.f410703d.A0() < 0) {
                        y0Var.f410703d.u0().setExpandCommentCount(0);
                    }
                    java.util.LinkedList P0 = y0Var.f410703d.P0();
                    if (P0 != null) {
                        pm0.v.d0(P0, new com.tencent.mm.plugin.finder.feed.h3(item));
                    }
                    if (z17 && (h18 = bu2.j.f24534a.h(item.f410703d.field_feedId)) != null) {
                        h18.setCommentCount(h18.getCommentCount() - 1);
                        hc2.a0.d(h18);
                        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "update commentCount for delete " + h18.getCommentCount());
                    }
                }
            }
        }
        if (item.f410703d.Y0() == 0 && (h17 = bu2.j.f24534a.h(item.f410703d.field_feedId)) != null) {
            boolean z19 = true;
            if (z17) {
                h17.setCommentCount(h17.getCommentCount() - 1);
                z18 = true;
            } else {
                z18 = false;
            }
            if (item.f410703d.A0() <= 0 || item.f410703d.A0() > h17.getCommentCount()) {
                z19 = z18;
            } else {
                h17.setCommentCount(h17.getCommentCount() - item.f410703d.A0());
            }
            if (z19) {
                hc2.a0.d(h17);
                com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "update commentCount for delete " + h17.getCommentCount());
            }
        }
        if (item.f410703d.t0() == 0) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> commentList = finderItem.getCommentList();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            hc2.a0.e(commentList, finderItem2.getId(), 0L, item.f410703d.getClientId());
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f106212i;
            if (finderItem3 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (finderItem3.getCommentCount() > 0) {
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = this.f106212i;
                if (finderItem4 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                finderItem4.setCommentCount(finderItem4.getCommentCount() - 1);
            }
        }
        com.tencent.mm.plugin.finder.feed.p2 p2Var = this.f106217p;
        if (p2Var != null) {
            p2Var.a(item.f410703d.t0(), item.f410703d.field_localCommentId, false);
        }
        if (item.f410703d.k1()) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = this.f106212i;
            if (finderItem5 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            finderItem5.setCommentProductPosted(false);
        }
        mv2.d dVar = (mv2.d) mv2.l.f331597d.f331599b.remove(java.lang.Long.valueOf(item.f410703d.field_localCommentId));
        if (dVar != null) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(com.tencent.mm.sdk.platformtools.w2.a(dVar.f331550a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (((so2.y0) r19.get(r6)).f410703d.Y0() != 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Q(java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.Q(java.util.List, boolean):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void R(android.widget.ImageView view, int i17) {
        so2.y0 y0Var;
        char c17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        so2.y0 y0Var2;
        kotlin.jvm.internal.o.g(view, "view");
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onLikeComment position:" + i17);
            return;
        }
        so2.y0 f17 = this.f106210g.f(i17);
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        boolean i18 = n1Var.i(finderItem.getId(), f17.f410703d, this.f106215n);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "[onLikeComment] position=" + i17 + " isLike=" + i18 + " commentObj=" + f17.f410703d);
        boolean z17 = !i18;
        android.content.Context context = this.f106207d;
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) context;
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            boolean H = hc2.o0.H(finderItem2.getFeedObject());
            if (!H) {
                y0Var2 = f17;
            } else if (z17) {
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var = f17.f410703d;
                yj0Var.l1(yj0Var.z0() | 1);
                com.tencent.mm.protocal.protobuf.FinderCommentInfo u07 = f17.f410703d.u0();
                r45.dc dcVar = new r45.dc();
                dcVar.set(0, java.lang.Long.valueOf(c01.id.a() / 1000));
                u07.setAuthor_reaction_info(dcVar);
                y0Var2 = f17;
            } else {
                y0Var2 = f17;
                com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = y0Var2.f410703d;
                yj0Var2.l1(yj0Var2.z0() & (-2));
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
            yw2.a0 a0Var = this.f106216o;
            com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var != null ? a0Var.n() : null;
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.L;
            java.lang.String e17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.e(finderMsgContract, n17, finderCommentDrawer != null ? finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0, y0Var2.D, y0Var2.f410703d.w0(), y0Var2.f410714r, y0Var2.f410703d.J0(), null, null, 192, null);
            so2.e2 e2Var = so2.e2.f410328a;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f106212i;
            if (finderItem3 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            long id6 = finderItem3.getId();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = this.f106212i;
            if (finderItem4 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.lang.String dupFlag = finderItem4.getDupFlag();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = this.f106212i;
            if (finderItem5 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            y0Var = y0Var2;
            c17 = 0;
            so2.e2.a(e2Var, V6, id6, dupFlag, finderItem5.getObjectNonceId(), y0Var2.f410703d, z17, this.f106215n, H, null, 0, e17, null, 2816, null);
            androidx.appcompat.app.AppCompatActivity activity2 = (androidx.appcompat.app.AppCompatActivity) context;
            kotlin.jvm.internal.o.g(activity2, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem6 = this.f106212i;
                if (finderItem6 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                long id7 = finderItem6.getId();
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem7 = this.f106212i;
                if (finderItem7 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                java.lang.String dupFlag2 = finderItem7.getDupFlag();
                e27.a(new ec2.a(15, id7, dupFlag2));
                if (z17) {
                    e27.a(new ec2.a(27, id7, dupFlag2));
                } else {
                    e27.a(new ec2.a(28, id7, dupFlag2));
                }
            }
        } else {
            y0Var = f17;
            c17 = 0;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        so2.y0 y0Var3 = y0Var;
        lVarArr[c17] = new jz5.l("comment_id", pm0.v.u(y0Var3.f410703d.t0()));
        lVarArr[1] = new jz5.l("comment_username", y0Var3.f410703d.Z0());
        lVarArr[2] = new jz5.l("display_flag", java.lang.Integer.valueOf(y0Var3.f410703d.z0()));
        lVarArr[3] = new jz5.l("is_action_like", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) rVar).Cj("comment_like_clk", view, kz5.c1.k(lVarArr), 24617);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ok(z17, y0Var3.f410703d.t0());
        yw2.a0 a0Var2 = this.f106216o;
        if (a0Var2 == null || (recyclerView = a0Var2.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(i17, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (((r0.u0().getExtFlag() & 1) > 0) == true) goto L15;
     */
    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int S() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.feed.model.y r0 = r3.f106210g
            java.util.ArrayList r0 = r0.f108469d
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.L0(r0)
            if (r1 != 0) goto L2d
            java.lang.Object r0 = kz5.n0.Z(r0)
            so2.y0 r0 = (so2.y0) r0
            r1 = 0
            if (r0 == 0) goto L29
            com.tencent.mm.plugin.finder.storage.yj0 r0 = r0.f410703d
            if (r0 == 0) goto L29
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.u0()
            int r0 = r0.getExtFlag()
            r2 = 1
            r0 = r0 & r2
            if (r0 <= 0) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 != r2) goto L29
            goto L2a
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r1 = -1
        L2e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.S():int");
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void T() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        pm0.v.b0(this.f106210g.f108469d, com.tencent.mm.plugin.finder.feed.model.x.f108438d);
        yw2.a0 a0Var = this.f106216o;
        if (a0Var == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void U(so2.y0 item, int i17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(item, "item");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = item.f410703d;
        long j17 = yj0Var.field_feedId;
        long t07 = yj0Var.t0();
        com.tencent.mm.plugin.finder.feed.y3 y3Var = new com.tencent.mm.plugin.finder.feed.y3(gcVar);
        hb2.z zVar = hb2.z.f280118e;
        zVar.getClass();
        r45.nh2 nh2Var = new r45.nh2();
        nh2Var.set(1, java.lang.Long.valueOf(j17));
        nh2Var.set(0, java.lang.Integer.valueOf(i17));
        nh2Var.set(2, java.lang.Long.valueOf(t07));
        hb2.w0.m(zVar, nh2Var, y3Var, false, false, null, null, 60, null);
    }

    public final int V(long j17) {
        if (j17 == 0) {
            return -1;
        }
        java.util.Iterator it = this.f106210g.f108469d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((so2.y0) it.next()).f410703d.t0() == j17) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public int W() {
        return this.f106215n;
    }

    public final com.tencent.mm.plugin.finder.view.FinderCommentEditText X() {
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            return a0Var.n().getEditText();
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.view.q7 Y() {
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            return a0Var.n().getPostContent();
        }
        return null;
    }

    public final int Z() {
        if (!hc2.t.d(this.f106207d)) {
            return 0;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        if (!finderItem.isChosenComment()) {
            return 0;
        }
        com.tencent.mm.plugin.finder.feed.f7 f7Var = this.X;
        return f7Var != null && f7Var.a() ? 1 : 0;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$getAdapter$adapter$1
            private final boolean useNewConvert;

            {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                this.useNewConvert = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127864od).getValue()).r()).booleanValue();
            }

            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 5) {
                    com.tencent.mm.plugin.finder.feed.a7 a7Var = com.tencent.mm.plugin.finder.feed.a7.this;
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
                    if (finderItem != null) {
                        return new rb2.v(a7Var, finderItem.getId());
                    }
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                if (type == 1) {
                    if (this.useNewConvert) {
                        com.tencent.mm.plugin.finder.feed.a7 a7Var2 = com.tencent.mm.plugin.finder.feed.a7.this;
                        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var2.f106212i;
                        if (finderItem2 != null) {
                            return new rb2.z2(a7Var2, finderItem2.getId());
                        }
                        kotlin.jvm.internal.o.o("feedObj");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.feed.a7 a7Var3 = com.tencent.mm.plugin.finder.feed.a7.this;
                    cu2.t tVar = cu2.u.f222441a;
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var3.f106212i;
                    if (finderItem3 != null) {
                        return new com.tencent.mm.plugin.finder.convert.u4(a7Var3, false, tVar.p(finderItem3));
                    }
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                if (type != 2) {
                    if (type == 3) {
                        return com.tencent.mm.plugin.finder.feed.a7.this.M ? new com.tencent.mm.plugin.finder.feed.m3(com.tencent.mm.plugin.finder.feed.a7.this) : new com.tencent.mm.plugin.finder.convert.q6(com.tencent.mm.plugin.finder.feed.a7.this, false);
                    }
                    if (type == 4) {
                        return new com.tencent.mm.plugin.finder.convert.v6(com.tencent.mm.plugin.finder.feed.a7.this);
                    }
                    if (type == 6) {
                        return new com.tencent.mm.plugin.finder.convert.v7(com.tencent.mm.plugin.finder.feed.a7.this);
                    }
                    hc2.l.a("Finder.DrawerPresenter", type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                if (this.useNewConvert) {
                    com.tencent.mm.plugin.finder.feed.a7 a7Var4 = com.tencent.mm.plugin.finder.feed.a7.this;
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem4 = a7Var4.f106212i;
                    if (finderItem4 != null) {
                        return new rb2.z2(a7Var4, finderItem4.getId());
                    }
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.a7 a7Var5 = com.tencent.mm.plugin.finder.feed.a7.this;
                cu2.t tVar2 = cu2.u.f222441a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem5 = a7Var5.f106212i;
                if (finderItem5 != null) {
                    return new com.tencent.mm.plugin.finder.convert.s7(a7Var5, tVar2.p(finderItem5));
                }
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }

            public final boolean getUseNewConvert() {
                return this.useNewConvert;
            }
        }, this.f106210g.f108469d, false);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = this;
        wxRecyclerAdapter.f293104n = this;
        wxRecyclerAdapter.f293106p = this;
        return wxRecyclerAdapter;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public java.lang.String a0() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.L;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer.getMemberProviderUsername();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public androidx.recyclerview.widget.p2 b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int[] iArr = new int[4];
        iArr[0] = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        return new dx2.a(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.tencent.mm.R.color.BW_90)), (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480414x9), iArr, (int) context.getResources().getDimension(com.tencent.mm.R.dimen.x_));
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void b0(android.content.Context context, so2.y0 item, int i17, zy2.gc gcVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.Runnable H0 = H0();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = item.f410703d;
        long j17 = yj0Var.field_feedId;
        long t07 = yj0Var.t0();
        com.tencent.mm.plugin.finder.feed.x3 x3Var = new com.tencent.mm.plugin.finder.feed.x3(gcVar, this, H0);
        hb2.z zVar = hb2.z.f280118e;
        zVar.getClass();
        r45.nh2 nh2Var = new r45.nh2();
        nh2Var.set(1, java.lang.Long.valueOf(j17));
        nh2Var.set(0, java.lang.Integer.valueOf(i17));
        nh2Var.set(2, java.lang.Long.valueOf(t07));
        hb2.w0.m(zVar, nh2Var, x3Var, false, false, null, null, 60, null);
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.getItemViewType() == 4 || holder.getItemViewType() == 6 || this.D) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onItemLongClick position:" + i17);
        if (i17 < 0) {
            return false;
        }
        so2.y0 f17 = this.f106210g.f(i17);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view.getContext(), 1, false);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211872n = new com.tencent.mm.plugin.finder.view.i0(f17, finderItem, this.f106207d, this.R, n0(), a0());
        android.content.Context context = this.f106207d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f106212i;
        if (finderItem2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211881s = new com.tencent.mm.plugin.finder.view.o0(context, finderItem2, f17, this.f106208e, this.f106215n, new com.tencent.mm.plugin.finder.feed.r4(this));
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f106212i;
        if (finderItem3 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211892z = new com.tencent.mm.plugin.finder.view.h0(f17, finderItem3, this.f106207d, this.f106215n);
        k0Var.v();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean c0() {
        return this.G && this.f106223t;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void d(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        so2.y0 y0Var = (so2.y0) kz5.n0.a0(this.f106210g.f108469d, i17);
        if (y0Var != null) {
            y0Var.f410718v = true;
            y0Var.f410719w = 2000L;
            y0Var.f410720x = false;
            yw2.a0 a0Var = this.f106216o;
            if (a0Var == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
                return;
            }
            adapter.notifyItemChanged(i17, 7);
        }
    }

    public final java.lang.String d0(android.content.Context context, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem != null) {
            return hc2.o0.y(finderItem.getFeedObject(), i17);
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void e(android.view.View anchor, so2.y0 item) {
        r45.qy0 promotion_info;
        kotlin.jvm.internal.o.g(anchor, "anchor");
        kotlin.jvm.internal.o.g(item, "item");
        boolean a17 = item.f410703d.a1();
        android.content.Context context = this.f106207d;
        if (!a17) {
            if (!item.f410703d.i1() || (promotion_info = item.f410703d.u0().getPromotion_info()) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = item.f410703d;
            long j17 = yj0Var.field_feedId;
            java.lang.String str = yj0Var.field_dupFlag;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.view.si siVar = new com.tencent.mm.plugin.finder.view.si(this.f106207d, j17, str, item.f410703d.t0(), nyVar != null ? nyVar.f135380n : 0, promotion_info, new com.tencent.mm.plugin.finder.feed.d6(this));
            this.B1 = siVar;
            if (!siVar.f133050l) {
                siVar.getContentView().measure(0, 0);
                siVar.f133050l = true;
            }
            int measuredWidth = siVar.getContentView().getMeasuredWidth();
            int measuredHeight = siVar.getContentView().getMeasuredHeight();
            siVar.setWidth(measuredWidth);
            siVar.setHeight(measuredHeight);
            anchor.getLocationInWindow(new int[2]);
            android.view.View findViewById = siVar.getContentView().findViewById(com.tencent.mm.R.id.a4x);
            android.view.View findViewById2 = siVar.getContentView().findViewById(com.tencent.mm.R.id.a4q);
            android.view.View contentView = siVar.getContentView();
            kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
            contentView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = contentView.getMeasuredHeight();
            int[] iArr = new int[2];
            anchor.getLocationOnScreen(iArr);
            android.graphics.Rect rect = new android.graphics.Rect();
            int i17 = iArr[0];
            rect.left = i17;
            rect.top = iArr[1];
            rect.right = i17 + anchor.getMeasuredWidth();
            rect.bottom = rect.top + anchor.getMeasuredHeight();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            anchor.getWindowVisibleDisplayFrame(rect2);
            int i18 = rect.bottom + measuredHeight2 > rect2.height() ? -(measuredHeight2 + rect.height()) : 0;
            int measuredWidth2 = (anchor.getMeasuredWidth() - findViewById.getMeasuredWidth()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = measuredWidth2;
            } else {
                marginLayoutParams = null;
            }
            findViewById.setLayoutParams(marginLayoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = measuredWidth2;
            } else {
                marginLayoutParams2 = null;
            }
            findViewById2.setLayoutParams(marginLayoutParams2);
            if (i18 < 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            siVar.setAnimationStyle(i18 < 0 ? com.tencent.mm.R.style.f494462np : com.tencent.mm.R.style.f494463nq);
            siVar.showAsDropDown(anchor, 0, i18, 8388613);
            float f17 = com.tencent.mm.ui.bk.C() ? 0.1f : 0.5f;
            try {
                android.view.View rootView = siVar.getContentView().getRootView();
                java.lang.Object systemService = siVar.f133040b.getSystemService("window");
                kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
                android.view.ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
                android.view.WindowManager.LayoutParams layoutParams4 = layoutParams3 instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.flags |= 2;
                    layoutParams4.dimAmount = f17;
                    windowManager.updateViewLayout(rootView, layoutParams4);
                }
            } catch (java.lang.Throwable unused) {
            }
            kotlin.jvm.internal.o.f(java.lang.String.format("pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 2)), "format(...)");
            return;
        }
        r45.ky0 advertisement_info = item.f410703d.u0().getAdvertisement_info();
        if (advertisement_info != null) {
            long j18 = item.f410703d.field_feedId;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i19 = nyVar2 != null ? nyVar2.f135380n : 0;
            android.content.Context context2 = this.f106207d;
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = item.f410703d;
            com.tencent.mm.plugin.finder.view.g2 g2Var = new com.tencent.mm.plugin.finder.view.g2(context2, j18, yj0Var2.field_dupFlag, yj0Var2.t0(), i19, advertisement_info, new com.tencent.mm.plugin.finder.feed.c6(this));
            this.A1 = g2Var;
            if (!g2Var.f132142n) {
                g2Var.getContentView().measure(0, 0);
                g2Var.f132142n = true;
            }
            int measuredWidth3 = g2Var.getContentView().getMeasuredWidth();
            int measuredHeight3 = g2Var.getContentView().getMeasuredHeight();
            g2Var.setWidth(measuredWidth3);
            g2Var.setHeight(measuredHeight3);
            anchor.getLocationInWindow(new int[2]);
            android.view.View findViewById3 = g2Var.getContentView().findViewById(com.tencent.mm.R.id.a4x);
            android.view.View findViewById4 = g2Var.getContentView().findViewById(com.tencent.mm.R.id.a4q);
            android.view.View contentView2 = g2Var.getContentView();
            kotlin.jvm.internal.o.f(contentView2, "getContentView(...)");
            contentView2.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight4 = contentView2.getMeasuredHeight();
            int[] iArr2 = new int[2];
            anchor.getLocationOnScreen(iArr2);
            android.graphics.Rect rect3 = new android.graphics.Rect();
            int i27 = iArr2[0];
            rect3.left = i27;
            rect3.top = iArr2[1];
            rect3.right = i27 + anchor.getMeasuredWidth();
            rect3.bottom = rect3.top + anchor.getMeasuredHeight();
            android.graphics.Rect rect4 = new android.graphics.Rect();
            anchor.getWindowVisibleDisplayFrame(rect4);
            int i28 = rect3.bottom + measuredHeight4 > rect4.height() ? -(measuredHeight4 + rect3.height()) : 0;
            int measuredWidth4 = (anchor.getMeasuredWidth() - findViewById3.getMeasuredWidth()) / 2;
            android.view.ViewGroup.LayoutParams layoutParams5 = findViewById3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.rightMargin = measuredWidth4;
            } else {
                marginLayoutParams3 = null;
            }
            findViewById3.setLayoutParams(marginLayoutParams3);
            android.view.ViewGroup.LayoutParams layoutParams6 = findViewById3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams6 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.rightMargin = measuredWidth4;
            } else {
                marginLayoutParams4 = null;
            }
            findViewById4.setLayoutParams(marginLayoutParams4);
            if (i28 < 0) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(findViewById3, arrayList7.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(findViewById4, arrayList8.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "showWith", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            g2Var.setAnimationStyle(i28 < 0 ? com.tencent.mm.R.style.f494462np : com.tencent.mm.R.style.f494463nq);
            g2Var.showAsDropDown(anchor, 0, i28, 8388613);
            float f18 = com.tencent.mm.ui.bk.C() ? 0.1f : 0.5f;
            try {
                android.view.View rootView2 = g2Var.getContentView().getRootView();
                java.lang.Object systemService2 = g2Var.f132130b.getSystemService("window");
                kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                android.view.WindowManager windowManager2 = (android.view.WindowManager) systemService2;
                android.view.ViewGroup.LayoutParams layoutParams7 = rootView2.getLayoutParams();
                android.view.WindowManager.LayoutParams layoutParams8 = layoutParams7 instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams7 : null;
                if (layoutParams8 != null) {
                    layoutParams8.flags |= 2;
                    layoutParams8.dimAmount = f18;
                    windowManager2.updateViewLayout(rootView2, layoutParams8);
                }
            } catch (java.lang.Throwable unused2) {
            }
            kotlin.jvm.internal.o.f(java.lang.String.format("pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(measuredWidth3), java.lang.Integer.valueOf(measuredHeight3)}, 2)), "format(...)");
        }
    }

    public final java.lang.String e0(android.content.Context context, int i17) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem != null) {
            return hc2.o0.z(finderItem.getFeedObject(), i17);
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    @Override // in5.z
    public boolean f(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var, android.view.MotionEvent event) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(event, "event");
        return event.getAction() == 0 && l0();
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f0() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f106214m;
        if (baseFinderFeed != null) {
            return baseFinderFeed;
        }
        kotlin.jvm.internal.o.o("finderFeed");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void g0(long j17) {
        yw2.a0 a0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        int V = V(j17);
        if (V < 0 || (a0Var = this.f106216o) == null || (recyclerView = a0Var.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(V);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public int getCommentScene() {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        android.content.Context context = this.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            return nyVar.f135380n;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean h0() {
        return this.I;
    }

    public final java.lang.String i0(int i17) {
        android.content.Context context = this.f106207d;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.n_s);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.n_t);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (i17 == 2) {
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.n_v);
            kotlin.jvm.internal.o.d(string3);
            return string3;
        }
        if (i17 != 3) {
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.n_s);
            kotlin.jvm.internal.o.d(string4);
            return string4;
        }
        java.lang.String string5 = context.getString(com.tencent.mm.R.string.n_u);
        kotlin.jvm.internal.o.d(string5);
        return string5;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public kw2.c j() {
        return (kw2.c) ((jz5.n) this.V).getValue();
    }

    public final r45.vg7 j0() {
        return G() ? this.f106218p0 : r45.vg7.emFinderGetCommentListSortType_Default;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public int k() {
        java.util.ArrayList arrayList = this.f106210g.f108469d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            return -1;
        }
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.y0 y0Var = (so2.y0) next;
            if (y0Var.f410703d.Y0() == 0) {
                if (!((y0Var.f410703d.u0().getExtFlag() & 1) > 0)) {
                    return i17;
                }
            }
            i17 = i18;
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public int k0() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.L;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer.getContactPreviewScene();
        }
        return 0;
    }

    @Override // im5.b
    public void keep(im5.a p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f106211h.add(p07);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void l(so2.y0 comment, boolean z17) {
        java.util.LinkedList list;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        java.util.LinkedList list2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(comment, "comment");
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "[onRecommendComment] isRecommend=" + z17 + " commentObj=" + comment.f410703d);
        if (z17) {
            if (comment.f410703d.u0().getFriend_recommend_list() == null) {
                comment.f410703d.u0().setFriend_recommend_list(new r45.k60());
            }
            r45.k60 friend_recommend_list = comment.f410703d.u0().getFriend_recommend_list();
            if (friend_recommend_list != null && (list2 = friend_recommend_list.getList(0)) != null) {
                java.lang.String r17 = c01.z1.r();
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.h60) obj).getString(0), r17)) {
                            break;
                        }
                    }
                }
                if (obj == null) {
                    r45.h60 h60Var = new r45.h60();
                    h60Var.set(0, r17);
                    list2.add(h60Var);
                }
            }
        } else {
            java.lang.String r18 = c01.z1.r();
            r45.k60 friend_recommend_list2 = comment.f410703d.u0().getFriend_recommend_list();
            if (friend_recommend_list2 != null && (list = friend_recommend_list2.getList(0)) != null) {
                kz5.h0.B(list, new com.tencent.mm.plugin.finder.feed.f5(r18));
            }
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        int i17 = z17 ? 34 : 35;
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6919b = i17;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = comment.f410703d;
        iaVar.f6918a = yj0Var.field_feedId;
        iaVar.f6931n = yj0Var.t0();
        feedUpdateEvent.e();
        bu2.n nVar = bu2.n.f24550a;
        long j17 = comment.f410703d.field_feedId;
        long itemId = comment.getItemId();
        synchronized (nVar) {
            bu2.n.f24551b.e(new bu2.k(j17, itemId));
            bu2.n.f24552c.e(new bu2.k(j17, itemId));
        }
        android.content.Context context = this.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        yw2.a0 a0Var = this.f106216o;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var != null ? a0Var.n() : null;
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.L;
        java.lang.String e17 = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.e(finderMsgContract, n17, finderCommentDrawer != null ? finderCommentDrawer.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String() : 0, comment.D, comment.f410703d.w0(), comment.f410714r, comment.f410703d.J0(), null, null, 192, null);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        com.tencent.mm.plugin.finder.storage.yj0 comment2 = comment.f410703d;
        kotlin.jvm.internal.o.g(comment2, "comment");
        nv2.n1.f340551h.e(finderItem.getId(), finderItem.getDupFlag(), finderItem.getObjectNonceId(), comment2, z17 ? nv2.x1.f340629g : nv2.x1.f340630h, 2, null, V6, hc2.o0.H(finderItem.getFeedObject()), null, 0, e17);
        int e18 = this.f106210g.e(comment.f410703d.t0());
        yw2.a0 a0Var2 = this.f106216o;
        if (a0Var2 == null || (recyclerView = a0Var2.s().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(e18, 3);
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean l0() {
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            return a0Var.n().isShowKeyboard;
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void n(com.tencent.mm.plugin.finder.view.FinderEmojiView emojiView, so2.y0 commentItem) {
        kotlin.jvm.internal.o.g(emojiView, "emojiView");
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = commentItem.f410714r;
        java.lang.String md52 = iEmojiInfo != null ? iEmojiInfo.getMd5() : null;
        if (md52 == null) {
            md52 = "";
        }
        objArr[0] = md52;
        objArr[1] = java.lang.Integer.valueOf(emojiView.getStatus());
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "emoji onClick: %s emojiStatus:%d", objArr);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = commentItem.f410714r;
        java.lang.String md53 = iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null;
        if (emojiView.getStatus() == -1) {
            emojiView.getDelegate().reload();
            return;
        }
        if (md53 == null || md53.length() == 0) {
            return;
        }
        if (((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(md53) == null) {
            ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).wi(md53, commentItem.f410714r);
            ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Vi(commentItem.f410714r);
        }
        qk.u uVar = new qk.u(md53, commentItem.f410714r);
        uVar.f364155a = 41;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Sc).getValue()).r()).booleanValue()) {
            uVar.f364159e = true;
            android.content.Context context = this.f106207d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.util.LinkedList linkedList = ((com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ha.class)).f134600d;
            android.content.Context context2 = emojiView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.u6) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).f136098f = true;
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            com.tencent.mm.plugin.listener.FinderLiteAppHalfDrawListener finderLiteAppHalfDrawListener = new com.tencent.mm.plugin.listener.FinderLiteAppHalfDrawListener(new com.tencent.mm.plugin.finder.feed.j4(linkedList, emojiView, h0Var));
            h0Var.f310123d = finderLiteAppHalfDrawListener;
            uVar.f364341p = finderLiteAppHalfDrawListener;
        }
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var != null) {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(emojiView.getContext(), uVar);
        }
    }

    public final boolean n0() {
        return ((java.lang.Boolean) ((jz5.n) this.T).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void o(so2.y0 rootComment, int i17) {
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        this.f106206J = true;
        android.content.Context context = this.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        boolean z17 = false;
        int i18 = nyVar != null ? nyVar.f135380n : 0;
        boolean z18 = i17 == 2 || i17 == 1;
        if (z18) {
            java.util.LinkedList P0 = rootComment.f410703d.P0();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(P0)) {
                java.util.Iterator it = this.f106210g.f108469d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        fp0.t tVar = this.F;
                        if (tVar != null) {
                            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.j3(P0, this, rootComment), null, 2, null));
                        }
                        z17 = true;
                    } else if (((so2.y0) it.next()).f410703d.t0() == ((com.tencent.mm.protocal.protobuf.FinderCommentInfo) P0.getFirst()).getCommentId()) {
                        break;
                    }
                }
            }
            if (z17) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c17).Yj(context, rootComment, 1);
                return;
            } else {
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((com.tencent.mm.plugin.finder.report.o3) c18).Yj(context, rootComment, i17);
            }
        } else {
            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c19).Yj(context, rootComment, i17);
        }
        fp0.t tVar2 = this.F;
        if (tVar2 != null) {
            tVar2.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.t3(rootComment, this, z18, i18), null, 2, null));
        }
    }

    public void o0(int i17, int i18) {
        yw2.a0 a0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "[onModeChange] from=" + i17 + " to=" + i18);
        java.util.Iterator it = this.U.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.feed.a7) ((com.tencent.mm.plugin.finder.view.l5) it.next())).o0(i17, i18);
        }
        if (i18 == 0) {
            yw2.a0 a0Var2 = this.f106216o;
            if (a0Var2 != null && (recyclerView = a0Var2.k().getRecyclerView()) != null && (animate = recyclerView.animate()) != null && (translationY = animate.translationY(0.0f)) != null && (duration = translationY.setDuration(180L)) != null) {
                duration.start();
            }
            if (!this.E || (a0Var = this.f106216o) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var.n();
            java.lang.String d07 = d0(this.f106207d, this.f106215n);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
            if (finderItem != null) {
                n17.k(d07, finderItem.getNickName(), null);
            } else {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a0  */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.tencent.mm.protobuf.g, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v68 */
    @Override // fs2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetach() {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.onDetach():void");
    }

    public final void p0(int i17, java.util.List list, java.lang.String str) {
        android.content.Context context = this.f106207d;
        java.lang.String e07 = e0(context, i17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a.c(context, e07, 1, new com.tencent.mm.plugin.finder.feed.u4(str, this, list, i17));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:140|(2:271|(1:273))(1:144)|145|(2:147|(1:149)(23:260|151|(1:153)(1:259)|154|155|156|(1:158)|160|(1:162)|163|(1:165)|166|(1:168)|169|(4:171|(1:173)(1:191)|(1:175)|176)(2:192|(10:(2:195|(1:197))(1:(1:(4:237|(1:243)|244|(1:248))(4:226|(1:228)(1:236)|229|(1:235)))(1:221))|198|(1:200)(1:218)|201|(1:203)(1:217)|(1:205)|206|(1:208)|209|(3:211|(1:213)(1:216)|(1:215)))(4:249|(1:251)|252|(1:256)))|177|(1:179)|180|(1:182)(1:190)|(1:184)(1:189)|(1:186)|187|188))(3:261|(1:270)(1:265)|(23:267|(1:269)|(0)(0)|154|155|156|(0)|160|(0)|163|(0)|166|(0)|169|(0)(0)|177|(0)|180|(0)(0)|(0)(0)|(0)|187|188))|150|151|(0)(0)|154|155|156|(0)|160|(0)|163|(0)|166|(0)|169|(0)(0)|177|(0)|180|(0)(0)|(0)(0)|(0)|187|188) */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05b6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05b7, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("Finder.DrawerPresenter", r0, "", new java.lang.Object[r15]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b0 A[Catch: IllegalStateException -> 0x05b6, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x05b6, blocks: (B:156:0x05a2, B:158:0x05b0), top: B:155:0x05a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.tencent.mm.plugin.finder.viewmodel.component.ny] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r0v140 */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object] */
    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0(com.tencent.mm.plugin.finder.view.FinderCommentDrawer r28, yw2.a0 r29, com.tencent.mm.plugin.finder.storage.FinderItem r30, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback r31, int r32, boolean r33, long r34, com.tencent.mm.plugin.finder.storage.yj0 r36, boolean r37, boolean r38, long r39, boolean r41, boolean r42, boolean r43, int r44) {
        /*
            Method dump skipped, instructions count: 2484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a7.q0(com.tencent.mm.plugin.finder.view.FinderCommentDrawer, yw2.a0, com.tencent.mm.plugin.finder.storage.FinderItem, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback, int, boolean, long, com.tencent.mm.plugin.finder.storage.yj0, boolean, boolean, long, boolean, boolean, boolean, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean r() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem != null) {
            return finderItem.isSelfFeed();
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void r0(so2.y0 commentItem) {
        com.tencent.mm.plugin.lite.s sVar;
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Qd).getValue()).r()).intValue() == 1;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        boolean isQAFeed = finderItem.isQAFeed();
        bd2.b bVar = bd2.b.f19244a;
        if (isQAFeed || z17) {
            int i17 = z17 ? 58 : 92;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Jc).getValue()).r()).intValue() == 1) {
                sVar = new com.tencent.mm.plugin.lite.s();
                sVar.f144167d = new com.tencent.mm.plugin.finder.feed.l3(this, commentItem);
            } else {
                sVar = null;
            }
            android.content.Context context = this.f106207d;
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = commentItem.f410703d;
            long j17 = yj0Var.field_feedId;
            long t07 = yj0Var.t0();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f106212i;
            if (finderItem2 != null) {
                bVar.d(context, j17, t07, i17, z17, sVar, finderItem2.getDupFlag());
                return;
            } else {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
        }
        if (!commentItem.f410703d.a1()) {
            android.content.Context context2 = this.f106207d;
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = commentItem.f410703d;
            bVar.a(context2, yj0Var2.field_feedId, yj0Var2.field_dupFlag, yj0Var2.t0(), this.f106208e);
            return;
        }
        r45.ky0 advertisement_info = commentItem.f410703d.u0().getAdvertisement_info();
        long j18 = advertisement_info != null ? advertisement_info.getLong(1) : 0L;
        android.content.Context context3 = this.f106207d;
        kotlin.jvm.internal.o.g(context3, "context");
        java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(j18)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context3, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void s0() {
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = this.C1;
        if (finderCommentAdVideoView != null) {
            finderCommentAdVideoView.v();
        }
        this.C1 = null;
        kw2.c cVar = (kw2.c) ((jz5.n) this.V).getValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cVar.f312894a;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            kw2.b bVar = (kw2.b) ((java.util.Map.Entry) it.next()).getValue();
            com.tencent.mm.autogen.mmdata.rpt.FinderAdCommentMediaReportStruct finderAdCommentMediaReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAdCommentMediaReportStruct();
            finderAdCommentMediaReportStruct.f56444d = finderAdCommentMediaReportStruct.b("FeedId", pm0.v.u(bVar.f312864a), true);
            finderAdCommentMediaReportStruct.f56445e = finderAdCommentMediaReportStruct.b("Aid", pm0.v.u(bVar.f312865b), true);
            finderAdCommentMediaReportStruct.f56446f = bVar.f312866c;
            finderAdCommentMediaReportStruct.f56447g = bVar.f312867d;
            finderAdCommentMediaReportStruct.f56448h = finderAdCommentMediaReportStruct.b("MediaUrl", bVar.f312868e, true);
            finderAdCommentMediaReportStruct.f56449i = 0L;
            finderAdCommentMediaReportStruct.f56450j = bVar.f312869f;
            finderAdCommentMediaReportStruct.f56451k = bVar.f312870g;
            finderAdCommentMediaReportStruct.f56452l = cVar.f312895b;
            finderAdCommentMediaReportStruct.f56453m = finderAdCommentMediaReportStruct.b("TraceId", bVar.f312871h, true);
            finderAdCommentMediaReportStruct.f56454n = bVar.f312872i;
            finderAdCommentMediaReportStruct.f56455o = bVar.f312873j;
            finderAdCommentMediaReportStruct.f56456p = bVar.f312874k;
            finderAdCommentMediaReportStruct.f56457q = bVar.f312875l;
            finderAdCommentMediaReportStruct.f56458r = bVar.f312876m;
            finderAdCommentMediaReportStruct.f56459s = bVar.f312877n;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (r45.t23 t23Var : bVar.f312888y) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("waitMs", t23Var.getInteger(2));
                    jSONObject.put("percent", t23Var.getInteger(1));
                    jSONObject.put("type", t23Var.getInteger(0));
                    jSONArray.put(jSONObject);
                } catch (java.lang.Exception unused) {
                }
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
            finderAdCommentMediaReportStruct.f56460t = finderAdCommentMediaReportStruct.b("WaitingDetails", r26.i0.t(jSONArray2, ",", ";", false), true);
            finderAdCommentMediaReportStruct.f56461u = finderAdCommentMediaReportStruct.b("SvrIp", bVar.f312878o, true);
            finderAdCommentMediaReportStruct.f56462v = bVar.f312879p;
            finderAdCommentMediaReportStruct.f56463w = bVar.f312880q;
            finderAdCommentMediaReportStruct.f56464x = bVar.f312881r;
            finderAdCommentMediaReportStruct.f56465y = 0L;
            finderAdCommentMediaReportStruct.f56466z = bVar.f312882s;
            finderAdCommentMediaReportStruct.A = bVar.f312883t;
            finderAdCommentMediaReportStruct.B = bVar.f312884u;
            finderAdCommentMediaReportStruct.C = bVar.f312885v;
            finderAdCommentMediaReportStruct.D = 0L;
            finderAdCommentMediaReportStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderAdCommentMediaReportStruct);
        }
        concurrentHashMap.clear();
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.getItemViewType() == 3 || holder.getItemViewType() == 4 || holder.getItemViewType() == 6 || this.D) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onItemClick position:" + i17);
        if (i17 < 0) {
            return;
        }
        so2.y0 f17 = this.f106210g.f(i17);
        if ((f17.f410716t && ((com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d)).i()) || !f17.f410703d.d1() || f17.f410703d.j1()) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = f17.f410703d.u0().getAuthor_contact();
        if ((author_contact == null || (author_contact.getUser_flag() & 4) == 0) ? false : true) {
            java.lang.String a17 = com.tencent.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
            if (a17 == null) {
                a17 = "";
            }
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).bj(this.f106207d, "wxid_wi_1d142z0zdj03", 5, a17, new com.tencent.mm.plugin.finder.feed.p4(this, ya2.d.j("wxid_wi_1d142z0zdj03"), f17, view));
            return;
        }
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var.n();
            int i18 = this.f106215n;
            n17.i(i18, f17.f410703d, i18 == 2);
        }
        yw2.a0 a0Var2 = this.f106216o;
        if (a0Var2 != null) {
            a0Var2.n().postDelayed(new com.tencent.mm.plugin.finder.feed.q4(this, view), 150L);
        }
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void t(int i17) {
        java.util.ArrayList arrayList = this.f106210g.f108469d;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "preloadPrevPage, onScrollIdle, firstVisiblePosition:" + i17 + ", dataList size:" + arrayList.size() + ", canPreloadPrev:" + this.G);
        if (this.M) {
            return;
        }
        if (!(i17 >= 0 && i17 < arrayList.size()) || i17 + 1 > com.tencent.mm.plugin.finder.storage.t70.f127590a.s()) {
            return;
        }
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "preloadPrevPage return for teen mode.");
            return;
        }
        if (this.G) {
            this.G = false;
            I(true);
            fp0.t tVar = this.F;
            if (tVar != null) {
                tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.e5(this), null, 2, null));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean t0() {
        return this.H;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public void u(android.view.View view, so2.y0 item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view.getContext(), 1, true);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211872n = new com.tencent.mm.plugin.finder.view.i0(item, finderItem, this.f106207d, this.R, n0(), a0());
        android.content.Context context = this.f106207d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = this.f106212i;
        if (finderItem2 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211881s = new com.tencent.mm.plugin.finder.view.o0(context, finderItem2, item, this.f106208e, this.f106215n, new com.tencent.mm.plugin.finder.feed.j6(this));
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = this.f106212i;
        if (finderItem3 == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        k0Var.f211892z = new com.tencent.mm.plugin.finder.view.h0(item, finderItem3, this.f106207d, this.f106215n);
        k0Var.v();
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView v0() {
        if (this.C1 == null) {
            com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = new com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView(this.f106207d);
            finderCommentAdVideoView.setMediaReporter((kw2.c) ((jz5.n) this.V).getValue());
            finderCommentAdVideoView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.C1 = finderCommentAdVideoView;
        }
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView2 = this.C1;
        kotlin.jvm.internal.o.d(finderCommentAdVideoView2);
        return finderCommentAdVideoView2;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public java.util.HashSet w() {
        return this.W;
    }

    public final void w0(long j17) {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2;
        boolean z17;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.view.rm rmVar;
        yw2.a0 a0Var = this.f106216o;
        if (a0Var != null) {
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer k17 = a0Var.k();
            com.tencent.mm.plugin.finder.view.i5 i5Var = com.tencent.mm.plugin.finder.view.FinderCommentDrawer.V;
            long j18 = k17.blinkDuration;
            k17.refCommentId = j17;
            k17.blinkRefComment = true;
            k17.blinkDuration = j18;
            com.tencent.mm.plugin.finder.feed.a7 a7Var = k17.presenter;
            if (a7Var != null) {
                yw2.a0 a0Var2 = a7Var.f106216o;
                com.tencent.mm.view.RefreshLoadMoreLayout s17 = a0Var2 != null ? a0Var2.s() : null;
                androidx.recyclerview.widget.RecyclerView recyclerView = s17 != null ? s17.getRecyclerView() : null;
                yw2.a0 a0Var3 = a7Var.f106216o;
                com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var3 != null ? a0Var3.n() : null;
                a7Var.Q.clear();
                a7Var.R = false;
                if (n17 != null) {
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
                    if (finderItem == null) {
                        kotlin.jvm.internal.o.o("feedObj");
                        throw null;
                    }
                    refreshLoadMoreLayout = s17;
                    n17.C(finderItem.getFeedObject().getId(), 0L);
                } else {
                    refreshLoadMoreLayout = s17;
                }
                if (n17 != null) {
                    n17.o(false);
                }
                int F = a7Var.F();
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
                if (finderItem2 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                finderItem2.setCommentCount(F);
                bu2.j jVar = bu2.j.f24534a;
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
                if (finderItem3 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                jVar.n(finderItem3, bu2.i.f24523d);
                com.tencent.mm.plugin.finder.view.FinderCommentEditText X = a7Var.X();
                if (X != null) {
                    X.setText((java.lang.CharSequence) null);
                }
                com.tencent.mm.plugin.finder.view.FinderCommentEditText X2 = a7Var.X();
                if (X2 != null) {
                    ((java.util.HashMap) X2.pastedList).clear();
                }
                yw2.a0 a0Var4 = a7Var.f106216o;
                if (a0Var4 != null && (rmVar = a0Var4.B) != null) {
                    rmVar.dismiss();
                }
                com.tencent.mm.plugin.finder.view.g2 g2Var = a7Var.A1;
                if (g2Var != null) {
                    g2Var.dismiss();
                }
                com.tencent.mm.plugin.finder.view.si siVar = a7Var.B1;
                if (siVar != null) {
                    siVar.dismiss();
                }
                a7Var.S = null;
                com.tencent.mm.plugin.finder.feed.model.y yVar = a7Var.f106210g;
                yVar.f108467b = j17;
                java.util.ArrayList arrayList = yVar.f108469d;
                arrayList.clear();
                so2.z0 z0Var = yVar.f108468c;
                if (z0Var != null) {
                    yVar.f108468c = z0Var;
                    arrayList.add(z0Var);
                }
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                a7Var.A = j17;
                a7Var.B = true;
                a7Var.C = j18;
                a7Var.f106222s = null;
                a7Var.F0(j17 != 0);
                a7Var.D0(true);
                a7Var.G = j17 != 0;
                a7Var.H = true;
                a7Var.K = false;
                boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
                if (a7Var.M || isTeenMode) {
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout3 = refreshLoadMoreLayout;
                    if (refreshLoadMoreLayout3 != null) {
                        refreshLoadMoreLayout3.setEnableLoadMore(false);
                    }
                    yw2.a0 a0Var5 = a7Var.f106216o;
                    if (a0Var5 != null) {
                        a0Var5.h(false);
                    }
                    yw2.a0 a0Var6 = a7Var.f106216o;
                    if (a0Var6 != null) {
                        a0Var6.k().l(true);
                    }
                } else {
                    if (refreshLoadMoreLayout == null) {
                        refreshLoadMoreLayout2 = refreshLoadMoreLayout;
                        z17 = true;
                    } else {
                        refreshLoadMoreLayout2 = refreshLoadMoreLayout;
                        z17 = true;
                        refreshLoadMoreLayout2.setEnableLoadMore(true);
                    }
                    if (refreshLoadMoreLayout2 != null) {
                        refreshLoadMoreLayout2.setLimitTopRequest(-1);
                    }
                    yw2.a0 a0Var7 = a7Var.f106216o;
                    if (a0Var7 != null) {
                        a0Var7.h(z17);
                    }
                }
                yw2.a0 a0Var8 = a7Var.f106216o;
                if (a0Var8 != null) {
                    a0Var8.u();
                }
                if (!a7Var.f106230y && !a7Var.M) {
                    u0(a7Var, true, 2, 0, 4, null);
                    yw2.a0 a0Var9 = a7Var.f106216o;
                    if (a0Var9 != null) {
                        a0Var9.w();
                    }
                }
                a7Var.M();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public boolean x() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem != null) {
            return finderItem.isChosenComment();
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    public final void x0() {
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        java.lang.String necessary_params;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        yw2.a0 a0Var = this.f106216o;
        android.view.ViewGroup viewGroup = a0Var != null ? a0Var.f466613i : null;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Xb;
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        i95.m c17 = i95.n0.c(zy2.qb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) c17)).isTeenMode();
        if (this.f106226w == null || viewGroup == null || isTeenMode || G()) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "title wording hide, isTeenMode:" + isTeenMode);
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        com.tencent.mm.plugin.finder.feed.q2 q2Var = this.f106226w;
        r45.wy0 wy0Var = q2Var != null ? q2Var.f108793c : null;
        java.lang.String strXml = wy0Var != null ? wy0Var.getString(0) : null;
        if (strXml == null || strXml.length() == 0) {
            viewGroup.setVisibility(8);
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "title wording hide, wording_xml is empty");
            return;
        }
        java.util.LinkedList<r45.my0> list = wy0Var.getList(1);
        if (list.isEmpty()) {
            viewGroup.setVisibility(8);
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "title wording hide, wordingInfo is empty ");
            return;
        }
        r45.my0 my0Var = (r45.my0) kz5.n0.Z(list);
        int business_type = (my0Var == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) my0Var.getCustom(2)) == null) ? 0 : finderJumpInfo.getBusiness_type();
        boolean z17 = business_type == 40;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) gVar).getValue()).r()).booleanValue();
        if (z17 && !booleanValue) {
            com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "title wording hide, disable search word");
            viewGroup.setVisibility(8);
            return;
        }
        ym5.a1.h(viewGroup, new com.tencent.mm.plugin.finder.feed.s5(list, this));
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "title wording show");
        viewGroup.setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.sad);
        textView.setHighlightColor(this.f106207d.getResources().getColor(com.tencent.mm.R.color.a9e));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        yw2.a0 a0Var2 = this.f106216o;
        if (a0Var2 != null) {
            a0Var2.k().k(textView);
        }
        com.tencent.mm.plugin.finder.feed.t5 t5Var = new com.tencent.mm.plugin.finder.feed.t5(this, business_type);
        kotlin.jvm.internal.o.g(strXml, "strXml");
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "createSearchContentSpan, strXml: " + strXml + ", keyWord: " + list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String Bj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Bj(strXml, list, arrayList);
        if (Bj == null) {
            Bj = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
        sb6.append(Bj);
        java.lang.String obj = r26.n0.Y(sb6, "#").toString();
        c61.vb vbVar = new c61.vb(16.0f, c61.wb.f39392d, 16, java.lang.Integer.valueOf(b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.BW_0_Alpha_0_5)));
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        textView.setText(c61.yb.ei((c61.yb) c18, "", obj, arrayList, null, vbVar, t5Var, 8, null));
        if (business_type == 40) {
            for (r45.my0 my0Var2 : list) {
                java.lang.String string = my0Var2.getString(1);
                if (!(string == null || string.length() == 0)) {
                    java.lang.String string2 = my0Var2.getString(4);
                    if (!(string2 == null || string2.length() == 0)) {
                        xc2.y2 y2Var = xc2.y2.f453343a;
                        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) my0Var2.getCustom(2);
                        if (((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).Ni() && finderJumpInfo2 != null && (native_info = finderJumpInfo2.getNative_info()) != null && (necessary_params = native_info.getNecessary_params()) != null) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject();
                                jSONObject.put("necessaryParams", necessary_params);
                                ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).fj(1014, 14, jSONObject);
                            } catch (org.json.JSONException e17) {
                                com.tencent.mars.xlog.Log.e("Finder.JumperUtils", e17.getMessage());
                            }
                        }
                        if (j62.e.g().l("clicfg_android_finder_comment_half_screen_search_use_flutter", false, false, true) && java.lang.System.currentTimeMillis() - xc2.y2.f453348f > 30000) {
                            xc2.y2.f453348f = java.lang.System.currentTimeMillis();
                            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Zi();
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter
    public com.tencent.mm.plugin.finder.storage.FinderItem z0() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106212i;
        if (finderItem != null) {
            return finderItem;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }
}
