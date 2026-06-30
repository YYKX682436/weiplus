package up2;

/* loaded from: classes2.dex */
public class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f511331d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f511332e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.c4 f511333f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f511334g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f511335h;

    /* renamed from: i, reason: collision with root package name */
    public final int f511336i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f511337m;

    /* renamed from: n, reason: collision with root package name */
    public final int f511338n;

    /* renamed from: o, reason: collision with root package name */
    public long f511339o;

    public m(java.util.ArrayList feedDataList, yz5.a autoPlayManager, sp2.c4 caller, yz5.a loadMoreCall, yz5.a canLoadingMore, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedDataList, "feedDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(autoPlayManager, "autoPlayManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadMoreCall, "loadMoreCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canLoadingMore, "canLoadingMore");
        this.f511331d = feedDataList;
        this.f511332e = autoPlayManager;
        this.f511333f = caller;
        this.f511334g = loadMoreCall;
        this.f511335h = canLoadingMore;
        this.f511336i = i17;
        this.f511337m = "NewEntrancePlayChecker";
        this.f511338n = b();
        int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;
    }

    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        int i17;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager;
            int i18 = this.f511336i;
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            c15416x1f1f78b7.u(iArr);
            c15416x1f1f78b7.v(iArr2);
            java.util.ArrayList<so2.j5> arrayList = new java.util.ArrayList();
            int K = kz5.z.K(iArr);
            int e07 = kz5.z.e0(iArr2);
            java.util.ArrayList arrayList2 = this.f511331d;
            if (K <= e07) {
                while (true) {
                    so2.j5 j5Var = (so2.j5) kz5.n0.a0(arrayList2, K);
                    if (j5Var != null && !d(j5Var)) {
                        arrayList.add(j5Var);
                    }
                    if (K == e07) {
                        break;
                    } else {
                        K++;
                    }
                }
            }
            sp2.c4 c4Var = this.f511333f;
            java.util.Iterator it = c4Var.f492530a.iterator();
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                sp2.b4 b4Var = (sp2.b4) it.next();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (b4Var.c((so2.j5) it6.next())) {
                                i17 = 1;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (i17 == 0) {
                    b4Var.f();
                }
            }
            int i19 = 0;
            for (so2.j5 j5Var2 : arrayList) {
                for (sp2.b4 b4Var2 : c4Var.f492530a) {
                    if (b4Var2.c(j5Var2) && b4Var2.b(i19)) {
                        i19++;
                    }
                }
            }
            gp2.l0 l0Var = (gp2.l0) this.f511332e.mo152xb9724478();
            boolean z17 = l0Var != null && l0Var.K(i19, true);
            if (l0Var != null) {
                l0Var.I(z17);
            }
            java.lang.String c17 = c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck]#checkAutoPlayNew firstVisibleItemPos=");
            sb6.append(iArr);
            sb6.append(", lastVisibleItemPos=");
            sb6.append(iArr2);
            sb6.append(", visibleFeeds=");
            sb6.append(arrayList.size());
            sb6.append(", autoPlayContainerCount = ");
            sb6.append(i19);
            sb6.append(", parent scrollView autoPlay=");
            sb6.append(z17);
            sb6.append(".caller.listeners.size=");
            sb6.append(((java.util.ArrayList) c4Var.f492530a).size());
            sb6.append("feedDataList=[");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (java.lang.Object obj : arrayList2) {
                int i27 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                so2.j5 j5Var3 = (so2.j5) obj;
                arrayList3.add(("[" + i17 + ']' + j5Var3.getClass().getSimpleName() + " hashCode=" + j5Var3.hashCode()) + (j5Var3 instanceof vp2.x ? " nickName=" + ((vp2.x) j5Var3).getFeedObject().m59273x80025a04() : ""));
                i17 = i27;
            }
            sb6.append(kz5.n0.g0(arrayList3, ", ", null, null, 0, null, null, 62, null));
            sb6.append(']');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17, sb6.toString());
        }
    }

    public int b() {
        return ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.V0().r()).intValue();
    }

    public java.lang.String c() {
        return this.f511337m;
    }

    public boolean d(so2.j5 j5Var) {
        return (j5Var instanceof wp2.b) || (j5Var instanceof vp2.c) || (j5Var instanceof vp2.h0);
    }

    public final void e(java.lang.String source, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (((java.lang.Boolean) this.f511335h.mo152xb9724478()).booleanValue()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            int[] iArr = new int[this.f511336i];
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager).v(iArr);
            int e07 = kz5.z.e0(iArr);
            java.util.ArrayList arrayList = this.f511331d;
            int size = arrayList.size();
            int i17 = this.f511338n;
            boolean z17 = size > 0 && e07 >= arrayList.size() - i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "checkLoadMore: source=" + source + ", enableLoadMore=" + z17 + ", lastPos=" + e07 + ", preloadCount=" + i17 + ", dataSize=" + arrayList.size());
            if (z17) {
                this.f511334g.mo152xb9724478();
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onScrollStateChanged: " + i17);
        sp2.z3.f492834b = null;
        if (i17 == 0) {
            a(recyclerView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f511339o > 50) {
            this.f511339o = currentTimeMillis;
            e("onScrolled", recyclerView);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f511333f.f492530a).iterator();
        while (it.hasNext()) {
            ((sp2.b4) it.next()).g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/NewEntranceRVScrollAutoPlayChecker", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
