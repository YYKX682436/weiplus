package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderInteractionSearchUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ui.a6 f109306y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ui.p6 f109307z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f109301t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public int f109302u = 2;

    /* renamed from: v, reason: collision with root package name */
    public int f109303v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f109304w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f109305x = -1;
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.u5(this));
    public boolean B = true;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return getIntent().getIntExtra("KEY_SCENE", 2) == 2 ? com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS : com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.akk;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        fc2.o Z6;
        super.onCreate(bundle);
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        this.f109302u = getIntent().getIntExtra("KEY_SCENE", 2);
        this.f109303v = getIntent().getIntExtra("KEY_MIX_SEARCH_TAB_TYPE", -1);
        int i17 = 7;
        int intExtra = getIntent().getIntExtra("KEY_MIX_SEARCH_CUR_TAB", 7);
        this.f109304w = intExtra;
        if (intExtra == 7) {
            i17 = getIntent().getIntExtra("KEY_MIX_SEARCH_MIX_SUB_TAB", 7);
        } else if (intExtra == 8) {
            i17 = getIntent().getIntExtra("KEY_MIX_SEARCH_HISTORY_SUB_TAB", 7);
        }
        this.f109305x = i17;
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("KEY_TOPIC_LIST");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = this.f109301t;
        arrayList.clear();
        java.util.Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            r45.r03 r03Var = ((com.tencent.mm.plugin.finder.feed.model.FinderParcelTopicInfo) it.next()).f107531d;
            kotlin.jvm.internal.o.f(r03Var, "getTopicInfo(...)");
            arrayList.add(new so2.e5(r03Var, 2));
        }
        com.tencent.mm.plugin.finder.feed.ui.a6 a6Var = new com.tencent.mm.plugin.finder.feed.ui.a6(this, arrayList, this.f109302u, this.f109303v, this.f109304w, this.f109305x);
        this.f109306y = a6Var;
        vb2.p pVar = (vb2.p) ((jz5.n) this.A).getValue();
        kotlin.jvm.internal.o.f(pVar, "<get-uiBinding>(...)");
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var = new com.tencent.mm.plugin.finder.feed.ui.p6(this, a6Var, pVar, this.f109302u);
        this.f109307z = p6Var;
        final com.tencent.mm.plugin.finder.feed.ui.a6 a6Var2 = this.f109306y;
        if (a6Var2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        a6Var2.f109656m = p6Var;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$Presenter$onAttach$1
            {
                this.__eventId = 169359783;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent finderFavTopicUpdateEvent) {
                com.tencent.mm.autogen.events.FinderFavTopicUpdateEvent event = finderFavTopicUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.ArrayList arrayList2 = event.f54273g.f6440a;
                kotlin.jvm.internal.o.e(arrayList2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderTopicInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.protocal.protobuf.FinderTopicInfo> }");
                com.tencent.mm.plugin.finder.feed.ui.a6 a6Var3 = com.tencent.mm.plugin.finder.feed.ui.a6.this;
                a6Var3.f109651e.clear();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    a6Var3.f109651e.add(new so2.e5((r45.r03) it6.next(), 2));
                }
                com.tencent.mm.plugin.finder.feed.ui.p6 p6Var2 = a6Var3.f109656m;
                if (p6Var2 != null) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.l6(p6Var2));
                    java.util.ArrayList arrayList3 = p6Var2.f110399e.f109651e;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.util.Iterator it7 = arrayList3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.String string = ((so2.e5) it7.next()).f410330d.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        sb6.append(string);
                        sb6.append(";");
                    }
                    if (sb6.length() > 0) {
                        sb6.deleteCharAt(sb6.length() - 1);
                    }
                    jSONObject.put("tag", java.lang.String.valueOf(sb6));
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    com.tencent.mm.ui.MMFragmentActivity context = p6Var2.f110398d;
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                    com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "fav_tag", jSONObject2, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
                }
                return true;
            }
        };
        a6Var2.f109665v = iListener;
        iListener.alive();
        com.tencent.mm.plugin.finder.feed.ui.p6 p6Var2 = this.f109307z;
        if (p6Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = p6Var2.f110398d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = new com.tencent.mm.ui.search.FTSSearchView((android.content.Context) mMFragmentActivity, false);
        p6Var2.f110408q = fTSSearchView;
        fTSSearchView.setSearchViewListener(p6Var2);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView2 = p6Var2.f110408q;
        if (fTSSearchView2 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView2.getFtsEditText().setHint(mMFragmentActivity.getString(com.tencent.mm.R.string.f491416d10));
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView3 = p6Var2.f110408q;
        if (fTSSearchView3 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView3.getFtsEditText().setFtsEditTextListener(p6Var2);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView4 = p6Var2.f110408q;
        if (fTSSearchView4 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView4.getFtsEditText().setCanDeleteTag(true);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView5 = p6Var2.f110408q;
        if (fTSSearchView5 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView5.getFtsEditText().m();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView6 = p6Var2.f110408q;
        if (fTSSearchView6 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView6.getFtsEditText().t();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView7 = p6Var2.f110408q;
        if (fTSSearchView7 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView7.getFtsEditText().g();
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView8 = p6Var2.f110408q;
        if (fTSSearchView8 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) fTSSearchView8.getFtsEditText().getTagPanel().findViewById(com.tencent.mm.R.id.nvv);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = mMFragmentActivity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        textView.setLayoutParams(marginLayoutParams);
        androidx.appcompat.app.b supportActionBar = mMFragmentActivity.getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView9 = p6Var2.f110408q;
        if (fTSSearchView9 == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        supportActionBar.y(fTSSearchView9);
        jz5.g gVar = p6Var2.f110402h;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).N(new com.tencent.mm.plugin.finder.feed.ui.v5(mMFragmentActivity, 0, 2, null));
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new com.tencent.mm.plugin.finder.feed.flow.FlowLayoutManager());
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$buildTopicItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type != 1 ? type != 2 ? new com.tencent.mm.plugin.finder.convert.z2() : new com.tencent.mm.plugin.finder.convert.a3() : new com.tencent.mm.plugin.finder.convert.gx();
            }
        };
        com.tencent.mm.plugin.finder.feed.ui.a6 a6Var3 = p6Var2.f110399e;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(sVar, a6Var3.f109651e, false);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.feed.ui.h6(p6Var2);
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setAdapter(wxRecyclerAdapter);
        if (p6Var2.j()) {
            p6Var2.g().setVisibility(0);
        } else {
            p6Var2.g().setVisibility(8);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = p6Var2.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
        }
        p6Var2.f110409r = new com.tencent.mm.plugin.finder.feed.ui.d6(p6Var2, p6Var2.f110410s.b(null), a6Var3.f109663t);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = p6Var2.getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.N(new com.tencent.mm.plugin.finder.storage.ij0());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = p6Var2.f110409r;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.feed.ui.e6(p6Var2);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = p6Var2.getRecyclerView();
        if (recyclerView3 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = p6Var2.f110409r;
            if (wxRecyclerAdapter3 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            recyclerView3.setAdapter(wxRecyclerAdapter3);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = p6Var2.getRecyclerView();
        if (recyclerView4 != null) {
            ym5.a1.g(recyclerView4, new com.tencent.mm.plugin.finder.feed.ui.f6(p6Var2));
        }
        com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter finderLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter(mMFragmentActivity, null);
        finderLoaderMoreFooter.j(com.tencent.mm.R.layout.f489227bs5);
        p6Var2.a().D(finderLoaderMoreFooter);
        p6Var2.a().setOnSimpleAction(new com.tencent.mm.plugin.finder.feed.ui.g6(p6Var2));
        androidx.recyclerview.widget.RecyclerView recyclerView5 = p6Var2.getRecyclerView();
        if (recyclerView5 == null || (nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMFragmentActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)) == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(recyclerView5);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.feed.ui.a6 a6Var = this.f109306y;
        if (a6Var != null) {
            a6Var.onDetach();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.B) {
            this.B = false;
        } else {
            hideVKB();
        }
    }
}
