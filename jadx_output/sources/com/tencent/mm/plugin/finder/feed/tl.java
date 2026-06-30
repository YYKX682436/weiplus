package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tl implements com.tencent.mm.plugin.finder.feed.k8 {
    public final jz5.g A;
    public do2.k B;
    public final boolean C;
    public final java.lang.Runnable D;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f109069d;

    /* renamed from: e, reason: collision with root package name */
    public ao2.a f109070e;

    /* renamed from: f, reason: collision with root package name */
    public final cw2.f8 f109071f;

    /* renamed from: g, reason: collision with root package name */
    public final int f109072g;

    /* renamed from: h, reason: collision with root package name */
    public final o25.y1 f109073h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f109074i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f109075m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f109076n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f109077o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f109078p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f109079q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f109080r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.ea f109081s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xj f109082t;

    /* renamed from: u, reason: collision with root package name */
    public int f109083u;

    /* renamed from: v, reason: collision with root package name */
    public long f109084v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109085w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f109086x;

    /* renamed from: y, reason: collision with root package name */
    public so2.u1 f109087y;

    /* renamed from: z, reason: collision with root package name */
    public long f109088z;

    public tl(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f109069d = context;
        boolean z17 = false;
        z17 = false;
        this.f109071f = new cw2.f8(z17 ? 1 : 0, 1, null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        this.f109072g = nyVar != null ? nyVar.f135380n : 0;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f109073h = new com.tencent.mm.pluginsdk.forward.m();
        this.f109074i = jz5.h.b(com.tencent.mm.plugin.finder.feed.xk.f111084d);
        this.f109075m = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ak(this));
        this.f109076n = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ck(this));
        this.f109077o = jz5.h.b(new com.tencent.mm.plugin.finder.feed.rl(this));
        this.f109078p = jz5.h.b(new com.tencent.mm.plugin.finder.feed.bk(this));
        this.f109079q = jz5.h.b(com.tencent.mm.plugin.finder.feed.tk.f109068d);
        this.f109081s = new com.tencent.mm.plugin.finder.feed.model.ea();
        this.f109083u = -1;
        this.f109085w = "";
        this.f109086x = "";
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.kk(this));
        android.content.Intent intent = context.getIntent();
        if (intent != null && intent.getIntExtra("key_comment_scene", 0) == 285) {
            z17 = true;
        }
        this.C = z17;
        this.D = new com.tencent.mm.plugin.finder.feed.sl(this);
    }

    public static final void a(com.tencent.mm.plugin.finder.feed.tl tlVar, boolean z17) {
        tlVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "showRetryTips ifShow:" + z17);
        android.view.View findViewById = tlVar.f109069d.findViewById(com.tencent.mm.R.id.m2d);
        if (findViewById != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ol(tlVar, findViewById));
        }
    }

    public static void b(com.tencent.mm.plugin.finder.feed.tl tlVar, so2.u1 u1Var, java.lang.Object obj, int i17, int i18, java.lang.Object obj2) {
        r45.vx0 vx0Var;
        fc2.q f76;
        java.lang.Object obj3 = (i18 & 2) != 0 ? null : obj;
        int i19 = (i18 & 4) != 0 ? -1 : i17;
        tlVar.g().f111080i = false;
        ((com.tencent.mm.plugin.finder.convert.yn) ((jz5.n) tlVar.f109076n).getValue()).h(tlVar.f(), u1Var, 0, 0, false, obj3 != null ? kz5.c0.k(obj3) : null);
        if (obj3 == null) {
            com.tencent.mm.ui.MMActivity context = tlVar.f109069d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (f76 = nyVar.f7()) != null) {
                fc2.s sVar = new fc2.s(2);
                sVar.f260981e = u1Var;
                f76.f260976d = u1Var;
                sVar.f260984h = f76.f260974b;
                sVar.f260982f = u1Var.getItemId();
                sVar.f260983g = u1Var.w();
                f76.f260974b = u1Var.getItemId();
                f76.a(sVar);
            }
            com.tencent.mm.plugin.finder.feed.model.l0.P0((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) tlVar.f109075m).getValue(), u1Var.getFeedObject().getId(), u1Var.w(), u1Var.getFeedObject().getObjectNonceId(), tlVar.f109072g, u1Var.getFeedObject().getFeedObject().getSecondaryShowFlag() != 1, u1Var.getFeedObject().getUserName(), 0, com.tencent.mm.plugin.finder.feed.model.z.f108497e, 64, null);
            com.tencent.mm.ui.MMActivity activity = tlVar.f109069d;
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = (com.tencent.mm.plugin.finder.viewmodel.component.zl) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.zl.class);
            zlVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "attach " + zlVar.S6(u1Var) + ' ' + hc2.b0.h(u1Var, false, 1, null));
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Od).getValue()).r()).intValue() == 1) {
                zlVar.f136689d = u1Var;
                if (zlVar.S6(u1Var)) {
                    zlVar.f136690e = tlVar;
                    com.tencent.mm.plugin.finder.playlist.e2 e2Var = zlVar.f136691f;
                    long id6 = zlVar.R6().getFeedObject().getId();
                    r45.dm2 object_extend = zlVar.R6().getFeedObject().getFeedObject().getObject_extend();
                    jz5.l a17 = e2Var.a(id6, object_extend != null ? (r45.vx0) object_extend.getCustom(0) : null, zlVar.f136696n);
                    com.tencent.mm.plugin.finder.playlist.b bVar = (com.tencent.mm.plugin.finder.playlist.b) a17.f302833d;
                    ((java.lang.Boolean) a17.f302834e).booleanValue();
                    com.tencent.mm.protobuf.g gVar = bVar.f122258a;
                    boolean z17 = bVar.f122259b;
                    boolean z18 = bVar.f122260c;
                    zlVar.f136693h = gVar;
                    zlVar.V6(z17);
                    zlVar.U6(z18);
                    zlVar.f136697o = zlVar.f136697o;
                    zlVar.f136701s = false;
                    zlVar.f136702t = false;
                    zlVar.f136703u = false;
                    so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
                    q6Var.f410556b = 16;
                    q6Var.f410557c = zlVar.R6().getFeedObject().getId();
                    q6Var.f410558d = zlVar.R6().getFeedObject().getDupFlag();
                    r45.dm2 object_extend2 = zlVar.R6().getFeedObject().getFeedObject().getObject_extend();
                    if (object_extend2 != null && (vx0Var = (r45.vx0) object_extend2.getCustom(0)) != null) {
                        q6Var.f410559e = vx0Var.getLong(0);
                    }
                    kotlinx.coroutines.l.d(zlVar.f136692g, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.tl(zlVar, q6Var, null), 3, null);
                } else {
                    com.tencent.mm.plugin.finder.feed.xj g17 = tlVar.g();
                    qr2.a aVar = g17.f111083l;
                    if (aVar != null) {
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = g17.f111076e;
                        if (wxRecyclerAdapter == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        wxRecyclerAdapter.i0(aVar.getItemId(), false);
                        g17.f111083l = null;
                    }
                }
            }
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) tlVar.g().f111072a.findViewById(com.tencent.mm.R.id.ipw);
            if (appBarLayout != null) {
                appBarLayout.d(true, false, true);
            }
            if (!((java.lang.Boolean) ((jz5.n) tlVar.f109079q).getValue()).booleanValue() && !tlVar.C) {
                int i27 = tlVar.f109083u;
                tlVar.f109083u = i19;
                if (i27 >= 0) {
                    tlVar.g().f(i27);
                }
                tlVar.g().f(tlVar.f109083u);
                if (tlVar.f109069d.getResources().getConfiguration().orientation == 1) {
                    com.tencent.mm.ui.MMActivity activity2 = tlVar.f109069d;
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    if (!((com.tencent.mm.plugin.finder.viewmodel.component.po) zVar.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.po.class)).O6() || tlVar.f109083u < 0) {
                        return;
                    }
                    pm0.v.V(100L, new com.tencent.mm.plugin.finder.feed.yj(tlVar));
                    return;
                }
                return;
            }
            if (i19 < 0) {
                return;
            }
            tlVar.g();
            tlVar.e().f107433d = u1Var.getFeedObject().getId();
            tlVar.e().d(u1Var.getFeedObject().getObjectNonceId());
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = tlVar.g().f111075d.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            int y17 = linearLayoutManager != null ? linearLayoutManager.y() : -1;
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter = tlVar.e().getDataListJustForAdapter();
            if (y17 < 0 || dataListJustForAdapter.size() <= y17 + 2) {
                tlVar.e().getDataListJustForAdapter().clear();
                tlVar.g().g(true);
            } else {
                dataListJustForAdapter.subList(0, dataListJustForAdapter.size() - 2).clear();
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = tlVar.g().f111076e;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.i0(r1.f111077f.hashCode(), false);
            androidx.recyclerview.widget.f2 adapter = tlVar.g().f111075d.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            tlVar.e().requestRefresh();
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 A0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.nk(this, feed, sheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 D1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder, yz5.a aVar) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.qk(aVar, this, feed, i17, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: H1 */
    public cw2.f8 getF122653q() {
        return this.f109071f;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.s4 K0(com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, in5.s0 holder) {
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.pk(this, feed, bottomSheet, holder);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void W4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, boolean z18, int i17, boolean z19, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.MMActivity activity = this.f109069d;
        kotlin.jvm.internal.o.g(activity, "activity");
        so2.e2.f410328a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), i17, feed.getFeedObject(), z17, z18, 2, feed.getShowLikeTips(), z19, hc2.s.f(feed.getContact()), bc1Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 Y(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.ok(this, feed);
    }

    public void c(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.view.MenuItem menuItem, int i17, int i18, in5.s0 holder) {
        java.lang.String str;
        r45.q23 video_tmpl_info;
        cw2.da videoView;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "getMoreMenuItemSelectedListener feed " + feed + ' ' + i17 + " menuItem:" + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        com.tencent.mm.ui.MMActivity activity = this.f109069d;
        if (itemId == 99) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", holder.itemView, null, 24617);
            x3Var.c(this.f109069d, "button_uninterested", feed.getItemId(), i18);
            r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
            java.lang.String string = ls2Var != null && ls2Var.getInteger(0) == 1 ? activity.getResources().getString(com.tencent.mm.R.string.f1q) : activity.getResources().getString(com.tencent.mm.R.string.f1p);
            kotlin.jvm.internal.o.d(string);
            db5.t7.i(activity, string, com.tencent.mm.R.raw.icons_filled_done);
            return;
        }
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        if (itemId == 109) {
            com.tencent.mm.plugin.finder.assist.y4.T(y4Var, this.f109069d, feed, holder, i18, 0, 16, null);
            return;
        }
        if (itemId == 200) {
            y4Var.Y(feed, activity, cu2.f0.f222391a.f(feed.getFeedObject().getFromAppId()));
            return;
        }
        if (itemId == 202) {
            xc2.y2.f453343a.V(activity, feed, i18, false);
            return;
        }
        if (itemId == 210) {
            y4Var.j0(activity, feed, holder);
            return;
        }
        if (itemId == 213) {
            com.tencent.mm.plugin.finder.assist.k2 k2Var = com.tencent.mm.plugin.finder.assist.k2.f102306a;
            k2Var.a(feed.getFeedObject());
            k2Var.b(activity);
            return;
        }
        if (itemId == 219) {
            y4Var.d0(activity, feed, holder);
            return;
        }
        cu2.m mVar = cu2.m.f222420a;
        if (itemId == 106) {
            mVar.b(activity, feed, false, new com.tencent.mm.plugin.finder.feed.ik(this));
            return;
        }
        if (itemId == 107) {
            mVar.b(activity, feed, true, new com.tencent.mm.plugin.finder.feed.hk(this));
            return;
        }
        if (itemId == 301 || itemId == 302) {
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a17, holder, false, true, false, 8, null);
            return;
        }
        if (itemId == 312) {
            y4Var.M(activity, holder, feed, this.f109071f);
            return;
        }
        if (itemId == 313) {
            y4Var.K(activity, feed, holder, menuItem);
            return;
        }
        vs5.a aVar = vs5.a.f439924a;
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        switch (itemId) {
            case 101:
                boolean C = zl2.q4.f473933a.C(feed);
                bd2.b bVar = bd2.b.f19244a;
                if (C) {
                    r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                    if (liveInfo != null) {
                        long j17 = liveInfo.getLong(0);
                        kotlin.jvm.internal.o.g(activity, "activity");
                        bd2.b.k(bVar, activity, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j17, feed.getFeedObject().getUserName(), null, 0, null, 112, null);
                    }
                } else {
                    bd2.b.b(bVar, this.f109069d, feed.getFeedObject().field_id, feed.w(), 0L, 0, 24, null);
                }
                x3Var.c(this.f109069d, "button_complaint", feed.getItemId(), i18);
                return;
            case 102:
                n7Var.B(this.f109069d, feed.getFeedObject(), new android.os.Bundle(), 3, new com.tencent.mm.plugin.finder.feed.gk(feed));
                x3Var.c(this.f109069d, "button_forward_friend", feed.getItemId(), i18);
                return;
            case 103:
                com.tencent.mm.plugin.finder.assist.n7.F(n7Var, this.f109069d, feed, null, 0, 0, 28, null);
                if (feed.getFeedObject().isLiveFeed()) {
                    r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                    java.lang.String valueOf = java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null);
                    java.lang.String valueOf2 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                    java.lang.String username = feed.getFeedObject().getFeedObject().getUsername();
                    java.lang.String str2 = com.tencent.mm.plugin.finder.convert.zf.D1;
                    vs5.a.b(aVar, valueOf, valueOf2, username, com.tencent.mm.plugin.finder.convert.zf.D1, "2", "0", null, null, 192, null);
                }
                x3Var.c(this.f109069d, "button_forward_friendcircle", feed.getItemId(), i18);
                return;
            case 104:
                so2.v0.b(so2.v0.f410644a, feed, this.f109069d, null, null, 12, null);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c17, this.f109069d, true, feed.getItemId(), false, 8, null);
                return;
            default:
                switch (itemId) {
                    case 112:
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("KEY_FROM_SCENE", 1);
                        intent.putExtra("KEY_USERNAME", xy2.c.e(activity));
                        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
                        intent.putExtra("KEY_IS_FULLSCREEN", true);
                        intent.putExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", false);
                        hc2.e0.b(intent, 0, kz5.b0.c(feed), null, null);
                        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).al(activity, intent);
                        return;
                    case 113:
                        com.tencent.mm.plugin.finder.assist.n7.H(n7Var, this.f109069d, feed, null, 0, 12, null);
                        x3Var.c(this.f109069d, "textstatus_in_menu", feed.getItemId(), i18);
                        if (feed.getFeedObject().isLiveFeed()) {
                            r45.nw1 liveInfo3 = feed.getFeedObject().getLiveInfo();
                            java.lang.String valueOf3 = java.lang.String.valueOf(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null);
                            java.lang.String valueOf4 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().getId());
                            java.lang.String username2 = feed.getFeedObject().getFeedObject().getUsername();
                            java.lang.String str3 = com.tencent.mm.plugin.finder.convert.zf.D1;
                            vs5.a.b(aVar, valueOf3, valueOf4, username2, com.tencent.mm.plugin.finder.convert.zf.D1, "3", "0", null, null, 192, null);
                            return;
                        }
                        return;
                    case 114:
                        android.view.View view = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
                        if (view == null) {
                            view = holder.p(com.tencent.mm.R.id.frt);
                        }
                        if (view != null) {
                            cw2.ca.d((cw2.ca) view, null, false, 3, null);
                        }
                        android.content.Intent intent2 = activity.getIntent();
                        if (intent2 == null || (str = intent2.getStringExtra("KEY_RINGTONE_REPORT_JSON")) == null) {
                            str = "";
                        }
                        kotlin.jvm.internal.o.g(activity, "activity");
                        com.tencent.mm.plugin.finder.assist.y5.e(com.tencent.mm.plugin.finder.assist.y5.f102716a, this.f109069d, feed, 2L, false, null, str, ((com.tencent.mm.plugin.finder.viewmodel.component.je) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.je.class)).f134268h, holder, new com.tencent.mm.plugin.finder.feed.dk(view), 24, null);
                        x3Var.c(this.f109069d, "button_set_bell", feed.getItemId(), i18);
                        return;
                    default:
                        switch (itemId) {
                            case 116:
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                android.view.View p17 = holder.p(com.tencent.mm.R.id.f484486ee3);
                                if (p17 != null) {
                                    arrayList.add(p17);
                                }
                                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                                cw2.da videoView2 = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                                if (finderThumbPlayerProxy != null) {
                                    kotlin.jvm.internal.o.g(activity, "activity");
                                    androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
                                    kotlin.jvm.internal.o.f(a18, "get(...)");
                                    com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.a7((com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) a18, holder, arrayList, finderThumbPlayerProxy, null, null, null, 56, null);
                                }
                                x3Var.c(this.f109069d, "button_speedplay", feed.getItemId(), i18);
                                return;
                            case 117:
                                com.tencent.mm.ui.ee.f(activity.getTaskId(), null);
                                return;
                            case 118:
                                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getFeedObject().getFeedObject().getObjectDesc();
                                r45.q23 video_tmpl_info2 = objectDesc != null ? objectDesc.getVideo_tmpl_info() : null;
                                if (video_tmpl_info2 == null) {
                                    db5.t7.g(activity, activity.getString(com.tencent.mm.R.string.d0c));
                                } else {
                                    android.content.Intent intent3 = new android.content.Intent();
                                    int i19 = video_tmpl_info2.f383586e;
                                    int i27 = i19 != 1 ? i19 != 3 ? -1 : 16 : 13;
                                    com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                                    p2Var.W(p2Var.i(activity, 53, false));
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    jSONObject.put("shoot_same_feedid", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(feed.getFeedObject().getFeedObject().getId()));
                                    java.lang.String jSONObject2 = jSONObject.toString();
                                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                                    p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
                                    zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                                    intent3.putExtra("key_maas_entrance", 5);
                                    intent3.putExtra("key_ref_feed_id", feed.getFeedObject().getFeedObject().getId());
                                    intent3.putExtra("key_ref_feed_dup_flag", feed.w());
                                    intent3.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
                                    intent3.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", video_tmpl_info2.f383585d);
                                    intent3.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", video_tmpl_info2.f383586e);
                                    ((c61.l7) b6Var).tj(activity, video_tmpl_info2, intent3, i27);
                                    com.tencent.mm.plugin.finder.report.p2.L(p2Var, this.f109069d, 93, video_tmpl_info2, 0L, 0, 24, null);
                                }
                                kotlin.jvm.internal.o.g(activity, "activity");
                                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                                com.tencent.mm.plugin.finder.report.b6 b6Var2 = com.tencent.mm.plugin.finder.report.b6.f124969a;
                                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = feed.getFeedObject().getFeedObject().getObjectDesc();
                                java.lang.Object obj = (objectDesc2 == null || (video_tmpl_info = objectDesc2.getVideo_tmpl_info()) == null) ? null : video_tmpl_info.f383585d;
                                if (obj == null) {
                                    obj = 0;
                                }
                                jSONObject3.put("templateId", obj);
                                b6Var2.c(V6, "shoot_same_video", true, jSONObject3);
                                return;
                            case 119:
                                y4Var.X(activity, feed);
                                return;
                            case 120:
                                kotlin.jvm.internal.o.g(activity, "activity");
                                fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                                byte[] byteArray = feed.getFeedObject().getFeedObject().toByteArray();
                                ((ee0.n4) k4Var).getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                if (byteArray == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                    return;
                                } else {
                                    je4.a.f299315a.a(activity, 2, byteArray, 0, 9);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                    return;
                                }
                            case 121:
                                y4Var.Q(activity, feed);
                                return;
                            default:
                                switch (itemId) {
                                    case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE /* 307 */:
                                        kotlin.jvm.internal.o.g(activity, "activity");
                                        androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.f2.class);
                                        kotlin.jvm.internal.o.f(a19, "get(...)");
                                        ((com.tencent.mm.plugin.finder.viewmodel.component.f2) a19).Q6(holder, false);
                                        x3Var.c(this.f109069d, "button_minimize", feed.getItemId(), i18);
                                        return;
                                    case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR /* 308 */:
                                        y4Var.I(activity, feed);
                                        return;
                                    case com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL /* 309 */:
                                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                                        float currentPlayMs = (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) ? 0.0f : ((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs());
                                        vn2.u0 u0Var = vn2.u0.f438387a;
                                        com.tencent.mm.ui.MMActivity mMActivity = this.f109069d;
                                        u0Var.a("FinderLongVideoShareContract", "", mMActivity, feed, true, mMActivity.getIntent().getIntExtra("key_comment_scene", 0) != 285, currentPlayMs);
                                        return;
                                    default:
                                        ((com.tencent.mm.pluginsdk.forward.m) this.f109073h).aj((db5.h4) menuItem, new com.tencent.mm.plugin.finder.feed.fk(feed, this, menuItem, i18));
                                        return;
                                }
                        }
                }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.t4 c4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        return new com.tencent.mm.plugin.finder.feed.sk(this, feed, holder);
    }

    public final android.view.View d() {
        return (android.view.View) ((jz5.n) this.f109078p).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public boolean d0() {
        return false;
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader e() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f109080r;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public androidx.recyclerview.widget.y2 e2() {
        return (androidx.recyclerview.widget.y2) ((jz5.n) this.f109074i).getValue();
    }

    public final in5.s0 f() {
        return (in5.s0) ((jz5.n) this.f109077o).getValue();
    }

    public final com.tencent.mm.plugin.finder.feed.xj g() {
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f109082t;
        if (xjVar != null) {
            return xjVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    /* renamed from: getActivity */
    public com.tencent.mm.ui.MMActivity getF122643d() {
        return this.f109069d;
    }

    public final void h(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "onScreenSizeChange: source = ".concat(source));
        java.lang.Object obj = f().f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var != null) {
            b(this, u1Var, new jz5.l(30, 1), 0, 4, null);
        }
        if (kotlin.jvm.internal.o.b(source, "resetToPortrait")) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) f().p(com.tencent.mm.R.id.e_k);
            java.lang.Object videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            android.view.View view = videoView instanceof android.view.View ? (android.view.View) videoView : null;
            if (view != null) {
                view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                view.requestLayout();
            }
        }
    }

    public final void i() {
        com.tencent.mm.plugin.finder.feed.ll llVar = new com.tencent.mm.plugin.finder.feed.ll(this);
        com.tencent.mm.plugin.finder.feed.ml mlVar = new com.tencent.mm.plugin.finder.feed.ml(this);
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai() && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.O().r()).intValue() == 1) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.uk(mlVar, this));
            return;
        }
        long j17 = this.f109084v;
        java.lang.String str = this.f109086x;
        int i17 = this.f109072g;
        java.lang.String str2 = this.f109085w;
        com.tencent.mm.ui.MMActivity context = this.f109069d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        db2.g4 g4Var = new db2.g4(j17, str, i17, 2, "", true, null, null, 0L, null, false, false, str2, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, true, null, null, 469749696, null);
        g4Var.S = context.getIntent().getStringExtra("key_firstFeedSessionBuffer");
        pq5.g l17 = g4Var.l();
        l17.f(context);
        l17.h(new com.tencent.mm.plugin.finder.feed.wk(this, mlVar, llVar));
    }

    public final void j(boolean z17) {
        android.view.View findViewById = this.f109069d.findViewById(com.tencent.mm.R.id.mst);
        if (findViewById == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public com.tencent.mm.plugin.finder.view.f5 j2() {
        com.tencent.mm.ui.MMActivity activity = this.f109069d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.view.f5 P6 = ((com.tencent.mm.plugin.finder.viewmodel.component.u6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u6.class)).P6();
        return P6 == null ? new com.tencent.mm.plugin.finder.view.f5() : P6;
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void n0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, boolean z17, int i17, r45.qt2 qt2Var) {
        int i18;
        kotlin.jvm.internal.o.g(feed, "feed");
        if (qt2Var == null) {
            com.tencent.mm.ui.MMActivity activity = this.f109069d;
            kotlin.jvm.internal.o.g(activity, "activity");
            qt2Var = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        r45.qt2 qt2Var2 = qt2Var;
        so2.z1 z1Var = so2.z1.f410730a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f109069d;
        int i19 = db2.m0.f228066v;
        so2.z1.b(z1Var, mMActivity, qt2Var2, feed, z17 ? 1 : 2, false, i17, 16, null);
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 contact = feed.getContact();
        java.lang.String D0 = contact != null ? contact.D0() : "";
        if (z17) {
            l75.e0 e0Var = ya2.b2.O2;
            i18 = ya2.b2.Q2;
        } else {
            l75.e0 e0Var2 = ya2.b2.O2;
            i18 = 0;
        }
        gVar.i(D0, i18);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 p1(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.mk(this, feed, sheet);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void s0(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public void u2(com.tencent.mm.plugin.finder.storage.FinderItem feed, boolean z17, in5.s0 s0Var, int i17, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        so2.v0.d(so2.v0.f410644a, this.f109069d, feed, z17, 2, i17, null, bc1Var, 32, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.o4 w4(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.lk(this, feed, sheet, i17);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k8
    public db5.r4 z6(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, com.tencent.mm.ui.widget.dialog.k0 sheet) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(sheet, "sheet");
        return new com.tencent.mm.plugin.finder.feed.rk(this, feed);
    }
}
