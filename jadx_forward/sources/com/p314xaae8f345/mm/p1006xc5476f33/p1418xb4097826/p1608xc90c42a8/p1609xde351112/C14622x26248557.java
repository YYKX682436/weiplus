package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract;", "", "<init>", "()V", "BlockListPresenter", "BlockListViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract */
/* loaded from: classes10.dex */
public final class C14622x26248557 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f204096a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f204097b;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListPresenter */
    /* loaded from: classes10.dex */
    public static final class BlockListPresenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 f204098d;

        /* renamed from: e, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback f204099e;

        /* renamed from: f, reason: collision with root package name */
        public final java.util.ArrayList f204100f;

        /* renamed from: g, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2495xc50a8b8b.g f204101g;

        public BlockListPresenter(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 config) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
            this.f204098d = config;
            this.f204100f = new java.util.ArrayList();
        }

        public final void c() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var = this.f204098d;
            if ((uj0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q) uj0Var : null) != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f204101g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14623xd7a95b94 c14623xd7a95b94 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14623xd7a95b94(this);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14624xd7a95b95 c14624xd7a95b95 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14624xd7a95b95.f204103d;
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                new bq.h(gVar, null).l().q(new cq.s(c14623xd7a95b94, c14624xd7a95b95));
            }
        }

        public final void f() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList g17 = this.f204098d.g();
            if (g17 != null) {
                java.util.Iterator it = g17.iterator();
                while (it.hasNext()) {
                    arrayList.add(new so2.i0((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next()));
                }
            }
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = this.f204099e;
                if (blockListViewCallback != null) {
                    blockListViewCallback.l(arrayList, true);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback2 = this.f204099e;
                if (blockListViewCallback2 != null) {
                    blockListViewCallback2.o();
                }
            }
            pm0.v.V(300L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14625x86513f21(this));
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
            this.f204099e = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var = this.f204098d;
            x51.h h17 = uj0Var.h();
            if (h17 != null) {
                h17.a();
            }
            java.util.ArrayList arrayList = this.f204100f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((so2.i0) it.next()).f491948d);
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
            x51.h h18 = uj0Var.h();
            if (h18 != null) {
                h18.c(linkedList);
            }
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback;", "Lfs2/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListPresenter;", "Lym5/l1;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback */
    /* loaded from: classes10.dex */
    public static final class BlockListViewCallback implements fs2.c, ym5.l1 {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter f204105d;

        /* renamed from: e, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204106e;

        /* renamed from: f, reason: collision with root package name */
        public final android.view.View f204107f;

        /* renamed from: g, reason: collision with root package name */
        public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f204108g;

        /* renamed from: h, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f204109h;

        /* renamed from: i, reason: collision with root package name */
        public so2.u f204110i;

        /* renamed from: m, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204111m;

        public BlockListViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View rootView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter presenter) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            this.f204105d = presenter;
            this.f204106e = activity;
            this.f204107f = rootView;
        }

        @Override // ym5.l1
        public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.f204096a, "[onOverStart] dy=" + i18);
            return false;
        }

        public final void b() {
            android.view.View findViewById = this.f204107f.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById;
            this.f204109h = c22801x87cbdc00;
            c22801x87cbdc00.m82696x5dd8f4d3(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu)));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f204109h;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.m82702xfa5d1e8f(((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj)) - ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562029zi)));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f204109h;
            if (c22801x87cbdc003 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc003.m82686x6e84640(1.85f);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f204109h;
            if (c22801x87cbdc004 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = c22801x87cbdc004.m82555x4905e9fa();
            this.f204108g = m82555x4905e9fa;
            if (m82555x4905e9fa == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f204106e;
            m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = this.f204109h;
            if (c22801x87cbdc005 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f204105d;
            c22801x87cbdc005.m82688x390c1d00(blockListPresenter.f204098d.c());
            boolean z17 = true;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    if (type == -3) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q();
                    }
                    if (type == -8) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r();
                    }
                    if (type == so2.i0.class.getName().hashCode()) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p();
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
                    throw new jz5.d();
                }
            }, blockListPresenter.f204100f, true);
            this.f204111m = c22848x6ddd90cf;
            if (this.f204110i == null) {
                this.f204110i = new so2.u();
            }
            so2.u uVar = this.f204110i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uVar);
            in5.n0.S(c22848x6ddd90cf, uVar, false, 2, null);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f204108g;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba4.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$2
                /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r15 = this;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r1.f204111m
                        r2 = 1
                        r3 = 0
                        if (r0 == 0) goto L15
                        so2.u r4 = r1.f204110i
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
                        boolean r0 = r0.W(r4)
                        if (r0 != 0) goto L15
                        r0 = r2
                        goto L16
                    L15:
                        r0 = r3
                    L16:
                        if (r0 == 0) goto L1a
                        goto L95
                    L1a:
                        androidx.recyclerview.widget.RecyclerView r0 = r1.f204108g
                        r4 = 0
                        java.lang.String r5 = "recyclerView"
                        if (r0 == 0) goto L9a
                        androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                        boolean r6 = r0 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
                        if (r6 == 0) goto L2d
                        androidx.recyclerview.widget.LinearLayoutManager r0 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r0
                        r14 = r0
                        goto L2e
                    L2d:
                        r14 = r4
                    L2e:
                        if (r14 == 0) goto L82
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.lang.ThreadLocal r6 = zj0.c.f554818a
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                        r0.add(r6)
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        r0.add(r6)
                        java.util.Collections.reverse(r0)
                        java.lang.Object[] r7 = r0.toArray()
                        java.lang.String r8 = "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback"
                        java.lang.String r9 = "hideSearchBar"
                        java.lang.String r10 = "(JZ)V"
                        java.lang.String r11 = "Undefined"
                        java.lang.String r12 = "scrollToPositionWithOffset"
                        java.lang.String r13 = "(II)V"
                        r6 = r14
                        yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
                        java.lang.Object r3 = r0.get(r3)
                        java.lang.Integer r3 = (java.lang.Integer) r3
                        int r3 = r3.intValue()
                        java.lang.Object r0 = r0.get(r2)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        r14.P(r3, r0)
                        java.lang.String r7 = "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback"
                        java.lang.String r8 = "hideSearchBar"
                        java.lang.String r9 = "(JZ)V"
                        java.lang.String r10 = "Undefined"
                        java.lang.String r11 = "scrollToPositionWithOffset"
                        java.lang.String r12 = "(II)V"
                        yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
                    L82:
                        androidx.recyclerview.widget.RecyclerView r6 = r1.f204108g
                        if (r6 == 0) goto L96
                        com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$hideSearchBar$1 r7 = new com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$hideSearchBar$1
                        r2 = 0
                        r4 = 200(0xc8, double:9.9E-322)
                        r0 = r7
                        r3 = r14
                        r0.<init>()
                        r0 = 200(0xc8, double:9.9E-322)
                        r6.postDelayed(r7, r0)
                    L95:
                        return
                    L96:
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r5)
                        throw r4
                    L9a:
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r5)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.RunnableC14629xbf6bc7f.run():void");
                }
            });
            java.lang.CharSequence f17 = blockListPresenter.f204098d.f(abstractActivityC21394xb3d2c0cf);
            if (f17 != null && f17.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f204111m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22848x6ddd90cf2);
                in5.n0.S(c22848x6ddd90cf2, new so2.z(blockListPresenter.f204098d), false, 2, null);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f204111m;
            if (c22848x6ddd90cf3 != null) {
                c22848x6ddd90cf3.f374638o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$3
                    @Override // in5.x
                    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this;
                        if (i17 == 0) {
                            blockListViewCallback.f204105d.f204098d.l(blockListViewCallback.f204106e);
                            return;
                        }
                        int a07 = i17 - ((in5.n0) adapter).a0();
                        if (a07 < 0 || a07 >= blockListViewCallback.f204105d.f204100f.size()) {
                            return;
                        }
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = ((so2.i0) blockListViewCallback.f204105d.f204100f.get(a07)).f491948d;
                        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(c19782x23db1cfa.m76197x6c03c64c())) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Bk(c19782x23db1cfa.m76197x6c03c64c(), blockListViewCallback.f204106e);
                            return;
                        }
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("finder_username", c19782x23db1cfa.m76197x6c03c64c());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                        android.content.Context context = holder.f374654e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        i0Var.mk(context, intent);
                    }
                };
            }
            if (c22848x6ddd90cf3 != null) {
                c22848x6ddd90cf3.f374637n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4
                    @Override // in5.y
                    public boolean c(final p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                        in5.s0 holder = (in5.s0) k3Var;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this;
                        rl5.r rVar = new rl5.r(blockListViewCallback.f204106e);
                        final int a07 = i17 - ((in5.n0) adapter).a0();
                        rVar.g(view, a07, 0L, new android.view.View.OnCreateContextMenuListener() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$1
                            @Override // android.view.View.OnCreateContextMenuListener
                            public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view2, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
                                if (contextMenu != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this.getClass();
                                    contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.eoj);
                                }
                            }
                        }, new db5.t4() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2
                            @Override // db5.t4
                            /* renamed from: onMMMenuItemSelected */
                            public void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                                final int i19 = a07;
                                if (i19 >= 0) {
                                    final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback2 = blockListViewCallback;
                                    if (i19 < blockListViewCallback2.f204105d.f204100f.size()) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter2 = blockListViewCallback2.f204105d;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var = blockListPresenter2.f204098d;
                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = ((so2.i0) blockListPresenter2.f204100f.get(i19)).f491948d;
                                        final p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = adapter;
                                        uj0Var.d(c19782x23db1cfa, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4$onItemLongClick$2$onMMMenuItemSelected$1
                                            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0
                                            public void a(boolean z18) {
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback3 = blockListViewCallback2;
                                                if (z18) {
                                                    int size = blockListViewCallback3.f204105d.f204100f.size();
                                                    int i27 = i19;
                                                    if (i27 < size && i27 >= 0) {
                                                        blockListViewCallback3.f204105d.f204100f.remove(i27);
                                                    }
                                                    p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var2 = f2Var;
                                                    f2Var2.m8155x27702c4(((in5.n0) f2Var2).a0() + i27);
                                                } else {
                                                    db5.t7.m123883x26a183b(blockListViewCallback3.f204106e, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, 0).show();
                                                }
                                                blockListViewCallback3.o();
                                            }
                                        });
                                    }
                                }
                            }
                        }, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
                        rVar.m();
                        return true;
                    }
                };
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f204108g;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf3);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = this.f204109h;
            if (c22801x87cbdc006 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc006.m82562xefb63abb(this);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc007 = this.f204109h;
            if (c22801x87cbdc007 != null) {
                c22801x87cbdc007.m82683xb165a19d(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$5
                    @Override // ym5.q3
                    public void b(int i17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this.f204105d.c();
                    }

                    @Override // ym5.q3
                    public void c(ym5.s3 reason) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    }

                    @Override // ym5.q3
                    public void d(int i17, rn5.a aVar, boolean z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this;
                        blockListViewCallback.f204105d.c();
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = blockListViewCallback.f204108g;
                        if (c1163xf1deaba43 != null) {
                            c1163xf1deaba43.m7964x8d4ad49c(new uw2.n0());
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                            throw null;
                        }
                    }

                    @Override // ym5.q3
                    public void e(ym5.s3 reason) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback blockListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this;
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc008 = blockListViewCallback.f204109h;
                        if (c22801x87cbdc008 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.u(c22801x87cbdc008, null, 1, null);
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = blockListViewCallback.f204108g;
                        if (c1163xf1deaba43 != null) {
                            c1163xf1deaba43.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$5$onRefreshEnd$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListViewCallback.this.f204108g;
                                    if (c1163xf1deaba44 != null) {
                                        c1163xf1deaba44.m7964x8d4ad49c(new rs.k());
                                    } else {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                                        throw null;
                                    }
                                }
                            }, 1000L);
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                            throw null;
                        }
                    }
                });
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
        }

        @Override // ym5.l1
        public void g(int i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.f204096a, "[onOverStop]");
        }

        @Override // fs2.c
        /* renamed from: getActivity */
        public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
            return this.f204106e;
        }

        @Override // ym5.l1
        public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.f204096a, "[onOverEnd] dy=" + i18);
            return false;
        }

        public final void l(java.util.List newList, boolean z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = this.f204105d.f204100f.size();
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.f204097b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            pm0.v.V(uptimeMillis >= ((java.lang.Number) t70Var.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14626x3d279077(z17, this, newList, f0Var));
        }

        public final void o() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557.BlockListPresenter blockListPresenter = this.f204105d;
            int size = blockListPresenter.f204100f.size();
            android.view.View view = this.f204107f;
            if (size != 0) {
                android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.lrd);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.lrd);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lrd)).setText(blockListPresenter.f204098d.k(this.f204106e));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c.f212351x;
            android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.lrd);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            b0Var.a((android.widget.TextView) findViewById5);
        }
    }

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14622x26248557();
        f204096a = "Finder.FinderBlockListContract";
        f204097b = android.os.SystemClock.uptimeMillis();
    }

    private C14622x26248557() {
    }
}
