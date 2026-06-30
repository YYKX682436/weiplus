package co2;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f43792d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f43793e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f43794f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f43795g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f43796h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f43797i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43798m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f43792d = "Finder.MegaVideo.SeeLaterDetailUIC";
        this.f43793e = jz5.h.b(new co2.h(activity));
        this.f43794f = jz5.h.b(new co2.g(this));
        this.f43795g = jz5.h.b(new co2.f(this));
        this.f43796h = jz5.h.b(new co2.e(this));
        this.f43797i = jz5.h.b(new co2.j(this));
    }

    public final com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader O6() {
        return (com.tencent.mm.plugin.finder.megavideo.topstory.seelaterflow.SeeLaterLoader) ((jz5.n) this.f43796h).getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout P6() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f43794f).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dj8;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar;
        android.view.View view2;
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar2;
        vn2.u0 u0Var = vn2.u0.f438387a;
        jz5.l lVar = vn2.u0.f438392f;
        java.lang.String str = this.f43792d;
        if (lVar != null && ((java.lang.Number) lVar.f302833d).longValue() == getIntent().getLongExtra("key_see_later_data_key", 0L)) {
            java.util.AbstractCollection dataListJustForAdapter = O6().getDataListJustForAdapter();
            java.lang.Object obj = lVar.f302834e;
            dataListJustForAdapter.addAll((java.util.Collection) obj);
            com.tencent.mars.xlog.Log.i(str, "get cache data size=" + ((java.util.List) obj).size());
            vn2.u0.f438392f = null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher.register$default(O6(), (co2.i) ((jz5.n) this.f43797i).getValue(), false, 2, null);
        int size = O6().getDataListJustForAdapter().size();
        u0Var.l(str, "initView data list size=" + size);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f43795g).getValue();
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getActivity()));
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.k kVar = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.k(O6().getDataListJustForAdapter(), false, null);
        kVar.f293105o = new co2.a(this, wxRecyclerView);
        kVar.f293104n = new co2.b(this);
        wxRecyclerView.setAdapter(kVar);
        ym5.a1.g(wxRecyclerView, new co2.c(this));
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout P6 = P6();
        on5.d refreshHeader = P6.getRefreshHeader();
        if (refreshHeader != null && (view2 = refreshHeader.getView()) != null && (mMProcessBar2 = (com.tencent.mm.ui.widget.MMProcessBar) view2.findViewById(com.tencent.mm.R.id.f486588lr5)) != null) {
            mMProcessBar2.setBackgroundResource(com.tencent.mm.R.drawable.akq);
        }
        on5.c loadMoreFooter = P6.getLoadMoreFooter();
        if (loadMoreFooter != null && (view = loadMoreFooter.getView()) != null && (mMProcessBar = (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.ilh)) != null) {
            mMProcessBar.setBackgroundResource(com.tencent.mm.R.drawable.akq);
        }
        P6.setOnSimpleAction(new co2.d(this));
        if (size <= 0) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(O6(), false, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6().unregister((co2.i) ((jz5.n) this.f43797i).getValue());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f43798m) {
            ((co2.i) ((jz5.n) this.f43797i).getValue()).onChanged();
        }
        this.f43798m = false;
    }
}
