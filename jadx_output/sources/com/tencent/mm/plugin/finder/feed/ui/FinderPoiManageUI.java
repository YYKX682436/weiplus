package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiManageUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderPoiManageUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f109483w = 0;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f109484t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.oh(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f109485u = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.qh(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109486v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ph(this));

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 126;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b58;
    }

    public final void handleIntent(android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> poiList = intent != null ? intent.getStringArrayListExtra("extra_poi_list") : null;
        if (poiList == null || poiList.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.hn hnVar = (com.tencent.mm.plugin.finder.feed.hn) ((jz5.n) this.f109484t).getValue();
        hnVar.getClass();
        kotlin.jvm.internal.o.g(poiList, "poiList");
        java.util.LinkedList linkedList = new java.util.LinkedList(poiList);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.feed.fn fnVar = new com.tencent.mm.plugin.finder.feed.fn(hnVar);
        com.tencent.mm.plugin.finder.feed.gn gnVar = new com.tencent.mm.plugin.finder.feed.gn(hnVar);
        java.lang.String friendUsername = hnVar.f106932d;
        kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
        bq.g gVar = new bq.g(friendUsername, linkedList);
        pm0.v.T(gVar.l(), new cq.n(fnVar, gVar, gnVar));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.mh(this));
        setMMTitle(getResources().getString(com.tencent.mm.R.string.ett));
        hideActionbarLine();
        addTextOptionMenu(10001, getResources().getString(com.tencent.mm.R.string.etu), getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9), new com.tencent.mm.plugin.finder.feed.ui.nh(this));
        com.tencent.mm.plugin.finder.feed.hn hnVar = (com.tencent.mm.plugin.finder.feed.hn) ((jz5.n) this.f109484t).getValue();
        jz5.g gVar = this.f109485u;
        com.tencent.mm.plugin.finder.feed.rn callback = (com.tencent.mm.plugin.finder.feed.rn) ((jz5.n) gVar).getValue();
        hnVar.getClass();
        kotlin.jvm.internal.o.g(callback, "callback");
        hnVar.f106934f = callback;
        hnVar.f106941p = true;
        com.tencent.mm.plugin.finder.feed.rn rnVar = (com.tencent.mm.plugin.finder.feed.rn) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI finderPoiManageUI = rnVar.f108928d;
        android.view.View findViewById = finderPoiManageUI.findViewById(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
        rnVar.f108930f = refreshLoadMoreLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView = refreshLoadMoreLayout.getRecyclerView();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(finderPoiManageUI));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderPoiManageUIContract$PoiManageViewCallback$initView$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    return new com.tencent.mm.plugin.finder.convert.as();
                }
                if (type == 2) {
                    return new com.tencent.mm.plugin.finder.convert.zr();
                }
                hc2.l.a("Finder.FinderPoiManageUIContract", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, rnVar.f108929e.f106936h, true);
        rnVar.f108932h = wxRecyclerAdapter;
        recyclerView.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = rnVar.f108932h;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.feed.in();
        wxRecyclerAdapter2.f293104n = new com.tencent.mm.plugin.finder.feed.jn(rnVar);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = rnVar.f108930f;
        if (refreshLoadMoreLayout2 == null) {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
        refreshLoadMoreLayout2.setActionCallback(new com.tencent.mm.plugin.finder.feed.mn(rnVar));
        rnVar.f108931g = new rl5.r(finderPoiManageUI);
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.on(rnVar));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 12222 && i18 == -1) {
            handleIntent(intent);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        if (getIntent().hasExtra("extra_poi_list")) {
            handleIntent(getIntent());
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPoiManageUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((com.tencent.mm.plugin.finder.feed.hn) ((jz5.n) this.f109484t).getValue()).onDetach();
    }
}
