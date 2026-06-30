package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract;", "", "<init>", "()V", "FollowListPresent", "FollowListViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract */
/* loaded from: classes2.dex */
public final class C14637xcb061107 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107 f204132a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListPresent;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent */
    /* loaded from: classes2.dex */
    public static final class FollowListPresent implements fs2.a, com.p314xaae8f345.mm.p944x882e457a.u0 {

        /* renamed from: e, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback f204134e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.g f204135f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f204139m;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f204141o;

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f204133d = "Finder.FinderFollowListContract.FollowListPresent." + hashCode();

        /* renamed from: g, reason: collision with root package name */
        public final java.util.ArrayList f204136g = new java.util.ArrayList();

        /* renamed from: h, reason: collision with root package name */
        public final bu2.o f204137h = new bu2.o("followList.fp");

        /* renamed from: i, reason: collision with root package name */
        public boolean f204138i = true;

        /* renamed from: n, reason: collision with root package name */
        public long f204140n = android.os.SystemClock.uptimeMillis();

        public FollowListPresent() {
            cq.k1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            this.f204141o = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ff).mo141623x754a37bb()).r()).booleanValue();
        }

        public final void c(boolean z17) {
            this.f204140n = android.os.SystemClock.uptimeMillis();
            this.f204139m = z17;
            if (!this.f204141o) {
                gm0.j1.d().g(new db2.o5(this.f204135f));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = this.f204134e;
            if (followListViewCallback == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = followListViewCallback.f204153d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            new bq.l0(this.f204135f, V6).l().h(new cq.g0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14638x80b7cb92(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14639x80b7cb93(this)));
        }

        public final void f(boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, final java.util.LinkedList linkedList, boolean z18) {
            long j17;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            if (z17) {
                final p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f204135f, gVar)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204133d, "not my buf, ignore!");
                    return;
                }
                if (this.f204135f == null) {
                    c0Var.f391645d = true;
                    java.util.regex.Pattern pattern = pm0.v.f438335a;
                    pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14640xd658eb92(this, linkedList));
                }
                this.f204138i = z18;
                this.f204135f = gVar2;
                h0Var.f391656d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$handleGetFollowListResp$2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i17;
                        boolean z19;
                        boolean z27 = c0Var.f391645d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent.this;
                        boolean z28 = followListPresent.f204139m;
                        followListPresent.getClass();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstPage ");
                        sb6.append(z27);
                        sb6.append(", get follow contact ");
                        java.util.LinkedList linkedList2 = linkedList;
                        sb6.append(linkedList2.size());
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String str = followListPresent.f204133d;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                        java.util.ArrayList arrayList = followListPresent.f204136g;
                        int size = arrayList.size();
                        int size2 = linkedList2.size();
                        if (z27) {
                            arrayList.clear();
                            size = -1;
                            size2 = -1;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                        java.util.Iterator it = linkedList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else {
                                arrayList2.add(new so2.v1(ya2.d.h((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next(), null, false, 3, null)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = followListPresent.f204134e;
                        if (followListViewCallback == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                            throw null;
                        }
                        followListViewCallback.o(z28, size, size2);
                        boolean z29 = true;
                        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                            z19 = true;
                        } else {
                            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            z19 = false;
                        }
                        if (!z19 && !z65.c.a()) {
                            kb2.b bVar = kb2.b.f387758a;
                            z29 = false;
                        }
                        if (z29) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("firstPage:" + z27 + ';');
                            int size3 = linkedList2.size();
                            for (i17 = 0; i17 < size3; i17++) {
                                sb8.append("[" + i17 + "]:");
                                sb8.append(pm0.b0.g(linkedList2.get(i17)));
                                sb8.append(";");
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "printFinderContactList :" + ((java.lang.Object) sb8));
                        }
                    }
                };
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f204140n;
            if (!this.f204139m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (uptimeMillis < ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    j17 = ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis;
                    pm0.v.V(j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14642x9300e447(h0Var));
                }
            }
            j17 = 0;
            pm0.v.V(j17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14642x9300e447(h0Var));
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
            if (!this.f204141o) {
                gm0.j1.d().q(713, this);
            }
            gm0.j1.d().q(3867, this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = this.f204134e;
            if (followListViewCallback == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = followListViewCallback.f204160n;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.V0(followListViewCallback.f204164r);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
        }

        @Override // com.p314xaae8f345.mm.p944x882e457a.u0
        /* renamed from: onSceneEnd */
        public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
            sb6.append(i17);
            sb6.append(", errCode ");
            sb6.append(i18);
            sb6.append(", errMsg ");
            sb6.append(str);
            sb6.append(" scene type ");
            sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str2 = this.f204133d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
            java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
            if (valueOf != null && valueOf.intValue() == 713) {
                boolean z17 = i17 == 0 && i18 == 0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowList");
                db2.o5 o5Var = (db2.o5) m1Var;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = o5Var.f309639g.f152243a.f152217a;
                r45.k61 k61Var = fVar instanceof r45.k61 ? (r45.k61) fVar : null;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = k61Var != null ? k61Var.m75934xbce7f2f(1) : null;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g L = o5Var.L();
                java.util.LinkedList K = o5Var.K();
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = o5Var.f309639g.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
                f(z17, m75934xbce7f2f, L, K, ((r45.l61) fVar2).m75939xb282bd08(3) != 0);
                return;
            }
            if (valueOf != null && valueOf.intValue() == 3867 && i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p971x6de15a2e.v0 mo47948x7f0c4558 = m1Var.mo47948x7f0c4558();
                com.p314xaae8f345.mm.p944x882e457a.o oVar = mo47948x7f0c4558 instanceof com.p314xaae8f345.mm.p944x882e457a.o ? (com.p314xaae8f345.mm.p944x882e457a.o) mo47948x7f0c4558 : null;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar != null ? oVar.f152243a.f152217a : null;
                r45.s31 s31Var = fVar3 instanceof r45.s31 ? (r45.s31) fVar3 : null;
                java.lang.String m75945x2fec8307 = (s31Var == null || s31Var.m75939xb282bd08(2) != 2) ? "" : s31Var.m75945x2fec8307(1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                    return;
                }
                kz5.h0.B(this.f204136g, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14645x356193f0(m75945x2fec8307));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = this.f204134e;
                if (followListViewCallback == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                followListViewCallback.o(false, -1, -1);
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
                int r17 = c17.r(u3Var, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "oldFollowCnt %d", java.lang.Integer.valueOf(r17));
                if (r17 > 0) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 - 1));
                }
            }
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListPresent;", "Lym5/l1;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback */
    /* loaded from: classes2.dex */
    public static final class FollowListViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204153d;

        /* renamed from: e, reason: collision with root package name */
        public final android.view.View f204154e;

        /* renamed from: f, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent f204155f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f204156g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.TextView f204157h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f204158i;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f204159m;

        /* renamed from: n, reason: collision with root package name */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f204160n;

        /* renamed from: o, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f204161o;

        /* renamed from: p, reason: collision with root package name */
        public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f204162p;

        /* renamed from: q, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204163q;

        /* renamed from: r, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14653xe4bc0a2a f204164r;

        /* JADX WARN: Type inference failed for: r2v6, types: [com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1] */
        public FollowListViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View contentView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent presenter, android.content.Intent intent) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            this.f204153d = activity;
            this.f204154e = contentView;
            this.f204155f = presenter;
            this.f204156g = "Finder.FinderFollowListContract.FollowListViewCallback." + hashCode();
            this.f204158i = intent != null && intent.getBooleanExtra("from_teen_mode_setting_page", false);
            this.f204159m = intent != null && intent.getBooleanExtra("key_is_aggregation_page", false);
            this.f204164r = new p012xc85e97e9.p103xe821e364.p104xd1075a44.w2() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1
                @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
                /* renamed from: onScrollStateChanged */
                public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(c1163xf1deaba4);
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                }

                @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
                /* renamed from: onScrolled */
                public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(recyclerView);
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb.Kh((zy2.zb) c17, recyclerView, ml2.x1.f409734e, "12", ml2.y.f409772d, 0, 0L, 0, 112, null);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$mHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                }
            };
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204156g, "[onOverStart] dy=" + i18);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f204162p;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.b(i18 / ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561217cj)));
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlProcessBar");
            throw null;
        }

        public final void b() {
            android.view.View view = this.f204154e;
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
            this.f204161o = c22801x87cbdc00;
            c22801x87cbdc00.m82696x5dd8f4d3(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu)));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f204161o;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.m82702xfa5d1e8f(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f204161o;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc003.m82686x6e84640(1.85f);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.m6l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            this.f204162p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById2;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f204161o;
            if (c22801x87cbdc004 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = c22801x87cbdc004.m82555x4905e9fa();
            this.f204160n = m82555x4905e9fa;
            if (m82555x4905e9fa == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f204153d;
            m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    if (type == so2.v1.class.getName().hashCode()) {
                        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.f204159m ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.al(dv2.i.f325398e) : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.el();
                    }
                    hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.f204156g, type);
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                }
            };
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent = this.f204155f;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, followListPresent.f204136g, true);
            this.f204163q = c22848x6ddd90cf;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f204160n;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(c22848x6ddd90cf);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f204163q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22848x6ddd90cf2);
            c22848x6ddd90cf2.f374638o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$2
                @Override // in5.x
                public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view2, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                    in5.s0 holder = (in5.s0) k3Var;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this;
                    java.util.ArrayList arrayList = followListViewCallback.f204155f.f204136g;
                    if (i17 < 0 || i17 >= arrayList.size()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(followListViewCallback.f204156g, "[-] position out of bound, position:%s, length:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
                        return;
                    }
                    if (((so2.v1) arrayList.get(i17)).f492178d.f69325xed074063 == 1) {
                        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).rj(null, ((so2.v1) arrayList.get(i17)).f492178d.D0(), i17, ml2.x1.f409737h, "12");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107 c14637xcb061107 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.f204132a;
                    ya2.b2 b2Var = ((so2.v1) arrayList.get(i17)).f492178d;
                    boolean z17 = followListViewCallback.f204158i;
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = followListViewCallback.f204153d;
                    c14637xcb061107.a(context, b2Var, z17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                    if (nyVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(6, 0L, nyVar.V6(), 1, ((so2.v1) arrayList.get(i17)).f492178d.D0());
                    }
                }
            };
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f204163q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22848x6ddd90cf3);
            c22848x6ddd90cf3.f374637n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$3
                @Override // in5.y
                public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view2, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                    in5.s0 holder = (in5.s0) k3Var;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this;
                    java.util.ArrayList arrayList = followListViewCallback.f204155f.f204136g;
                    if (g92.b.f351302e.v(((so2.v1) arrayList.get(i17)).f492178d.D0())) {
                        return true;
                    }
                    java.lang.Object obj = arrayList.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    so2.v1 v1Var = (so2.v1) obj;
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = followListViewCallback.f204153d;
                    java.lang.String string = abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573649f92);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    qd2.k.a(abstractActivityC21394xb3d2c0cf2, view2, string, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14654x11a02e0d(v1Var.f492178d, followListViewCallback, v1Var));
                    return true;
                }
            };
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = this.f204161o;
            if (c22801x87cbdc005 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc005.m82562xefb63abb(this);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = this.f204161o;
            if (c22801x87cbdc006 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc006.m82683xb165a19d(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$4
                @Override // ym5.q3
                public void b(int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.f204155f.c(true);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.l();
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListPresent followListPresent2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.f204155f;
                    followListPresent2.f204135f = null;
                    followListPresent2.c(false);
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    android.view.View findViewById3;
                    android.widget.TextView textView;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    boolean z17 = reason.f545054f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback followListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this;
                    if (z17) {
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc007 = followListViewCallback.f204161o;
                        if (c22801x87cbdc007 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                            throw null;
                        }
                        if (!c22801x87cbdc007.isHasBottomMore) {
                            if (c22801x87cbdc007 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                                throw null;
                            }
                            c22801x87cbdc007.m82693x1501d518(true);
                            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc008 = followListViewCallback.f204161o;
                            if (c22801x87cbdc008 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                                throw null;
                            }
                            android.view.View f294968x = c22801x87cbdc008.getF294968x();
                            if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                                textView.setVisibility(0);
                            }
                            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc009 = followListViewCallback.f204161o;
                            if (c22801x87cbdc009 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                                throw null;
                            }
                            android.view.View f294968x2 = c22801x87cbdc009.getF294968x();
                            if (f294968x2 != null && (findViewById3 = f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ilg)) != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList.add(8);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc0010 = followListViewCallback.f204161o;
                    if (c22801x87cbdc0010 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                        throw null;
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.u(c22801x87cbdc0010, null, 1, null);
                    i95.m c17 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f409734e, "12", ml2.y.f409775g, 0, 0L, 0, 112, null);
                }
            });
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.dft);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            this.f204157h = (android.widget.TextView) findViewById3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh bhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215411b, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14650xcc38dc94(this, null)), v65.m.b(abstractActivityC21394xb3d2c0cf));
            abstractActivityC21394xb3d2c0cf.mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$6
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem it) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.f204153d.finish();
                    return true;
                }
            });
            followListPresent.getClass();
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            pm0.v.T(pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14643x5f711ed4(followListPresent)), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14644x5f711ed5(followListPresent));
            followListPresent.c(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_finder_search_watchlist_android, 1) == 1) && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                abstractActivityC21394xb3d2c0cf.mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$7
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(android.view.MenuItem it) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207294a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4.f207296c = null;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("request_type", 3);
                        intent.putExtra("need_history", false);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).nj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14637xcb061107.FollowListViewCallback.this.f204153d, null, intent);
                        return true;
                    }
                });
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f204160n;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.i(this.f204164r);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204156g, "[onOverStop]");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f204162p;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.d();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlProcessBar");
                throw null;
            }
        }

        @Override // fs2.c
        /* renamed from: getActivity */
        public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
            return this.f204153d;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f204156g, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final void l() {
            android.widget.TextView textView;
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, 0);
            if (this.f204155f.f204138i) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209428q8).mo141623x754a37bb()).r()).booleanValue()) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f204161o;
                if (c22801x87cbdc00 != null) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(c22801x87cbdc00, null, 1, null);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f204161o;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x = c22801x87cbdc002.getF294968x();
            if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxk, java.lang.Integer.valueOf(r17)));
                textView.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f204161o;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            android.view.View f294968x2 = c22801x87cbdc003.getF294968x();
            android.view.View findViewById = f294968x2 != null ? f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public final void o(boolean z17, int i17, int i18) {
            if (i17 < 0 || i18 <= 0) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f204163q;
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f204163q;
                if (c22848x6ddd90cf2 != null) {
                    c22848x6ddd90cf2.m8153xd399a4d9(i17, i18);
                }
            }
            if (!z17) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f204161o;
                if (c22801x87cbdc00 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                    throw null;
                }
                c22801x87cbdc00.P(0);
                l();
                return;
            }
            ym5.s3 s3Var = new ym5.s3(0);
            s3Var.f545054f = this.f204155f.f204138i;
            s3Var.f545056h = i18;
            if (i18 > 0) {
                s3Var.f545055g = false;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f204161o;
            if (c22801x87cbdc002 != null) {
                c22801x87cbdc002.mo56054xc12c74c0(s3Var);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
        }
    }

    private C14637xcb061107() {
    }

    public final void a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, ya2.b2 b2Var, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (b2Var == null) {
            return;
        }
        int i17 = b2Var.K2 & 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        if (i17 <= 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", b2Var.D0());
            intent.putExtra("from_teen_mode_setting_page", z17);
            intent.putExtra("KEY_FROM_TIMELINE", true);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", ya2.d.b(b2Var, false) == null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, activity, intent, 0L, null, 0, 1, false, 0, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(activity, intent);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, activity, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
        r45.xk b17 = ya2.d.b(b2Var, false);
        if (b17 == null || (str = b17.m75945x2fec8307(0)) == null) {
            str = "";
        }
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("Contact_Scene", 213);
        intent2.putExtra("force_get_contact", true);
        intent2.putExtra("key_use_new_contact_profile", true);
        intent2.putExtra("biz_profile_tab_type", 1);
        j45.l.j(activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
    }
}
