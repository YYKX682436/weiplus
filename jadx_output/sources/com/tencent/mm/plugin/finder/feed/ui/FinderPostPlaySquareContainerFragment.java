package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostPlaySquareContainerFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public static final /* synthetic */ int A = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.no f109490t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.to f109491u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader f109492v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f109495y;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109493w = "";

    /* renamed from: x, reason: collision with root package name */
    public boolean f109494x = true;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109496z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.wh(this));

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("byPassInfo", "");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            this.f109493w = string;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPostPlayProfilePage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "cluster_profile");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.yh(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        return inflater.inflate(com.tencent.mm.R.layout.edc, viewGroup, false);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.feed.no noVar = this.f109490t;
        if (noVar != null) {
            noVar.onDetach();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [com.tencent.mm.plugin.finder.feed.FinderPostPlaySquareContainerContract$ViewCallback$initView$2] */
    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader = new com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderPostPlaySquareContainerLoader.f107573d = this.f129265p;
        java.lang.String str = this.f109493w;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderPostPlaySquareContainerLoader.f107574e = str;
        finderPostPlaySquareContainerLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.xh(this));
        this.f109492v = finderPostPlaySquareContainerLoader;
        jz5.g gVar = this.f109496z;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlaySquareContainerLoader finderPostPlaySquareContainerLoader2 = this.f109492v;
        if (finderPostPlaySquareContainerLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f109490t = new com.tencent.mm.plugin.finder.feed.no(mMActivity, finderPostPlaySquareContainerLoader2);
        com.tencent.mm.plugin.finder.feed.to toVar = new com.tencent.mm.plugin.finder.feed.to((com.tencent.mm.ui.MMActivity) ((jz5.n) gVar).getValue(), this, view, this.f109494x);
        this.f109491u = toVar;
        com.tencent.mm.plugin.finder.feed.no noVar = this.f109490t;
        if (noVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        toVar.f109095i = noVar;
        noVar.f108588e = toVar;
        com.tencent.mm.plugin.finder.feed.mo moVar = noVar.f108589f;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = noVar.f108587d;
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(baseFinderFeedLoader, moVar, false, 2, null);
        com.tencent.mm.plugin.finder.feed.to toVar2 = noVar.f108588e;
        if (toVar2 != null) {
            java.util.ArrayList data = baseFinderFeedLoader.getDataListJustForAdapter();
            kotlin.jvm.internal.o.g(data, "data");
            android.view.View findViewById = toVar2.f109092f.findViewById(com.tencent.mm.R.id.m6e);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            toVar2.f109096m = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
            toVar2.g();
            androidx.recyclerview.widget.RecyclerView recyclerView = toVar2.g().getRecyclerView();
            com.tencent.mm.ui.MMActivity mMActivity2 = toVar2.f109090d;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity2));
            com.tencent.mm.plugin.finder.feed.po poVar = new com.tencent.mm.plugin.finder.feed.po(data, new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderPostPlaySquareContainerContract$ViewCallback$initView$2
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return type == so2.t4.class.hashCode() ? new com.tencent.mm.plugin.finder.convert.gs() : new com.tencent.mm.plugin.finder.convert.z2();
                }
            });
            toVar2.f109097n = poVar;
            recyclerView.setAdapter(poVar);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = toVar2.f109097n;
            if (wxRecyclerAdapter == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.feed.qo(toVar2);
            android.view.View inflate = android.view.View.inflate(mMActivity2, com.tencent.mm.R.layout.bsd, null);
            inflate.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2));
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById2 == null) {
                num = 8;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                num = 8;
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ilh);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(num);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$ViewCallback", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            toVar2.g().setLoadMoreFooter(new android.widget.ImageView(mMActivity2));
            toVar2.f109098o = inflate;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = toVar2.f109097n;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter2.O(inflate, toVar2.f109099p, false);
            toVar2.g().setActionCallback(new com.tencent.mm.plugin.finder.feed.so(toVar2));
            toVar2.g().setEnableRefresh(false);
            recyclerView.i(toVar2.f109100q);
            if (!toVar2.f109093g) {
                com.tencent.mars.xlog.Log.i(toVar2.f109094h, "onViewPrepared: skip auto load data");
                return;
            }
            com.tencent.mm.plugin.finder.feed.no noVar2 = toVar2.f109095i;
            if (noVar2 != null) {
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(noVar2.f108587d, false, 1, null);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout.T(toVar2.g(), 0, false, null, 7, null);
        }
    }
}
