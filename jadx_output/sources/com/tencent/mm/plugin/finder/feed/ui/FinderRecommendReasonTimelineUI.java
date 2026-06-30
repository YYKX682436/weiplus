package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRecommendReasonTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/ds;", "Lcom/tencent/mm/plugin/finder/feed/cs;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderRecommendReasonTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.ds, com.tencent.mm.plugin.finder.feed.cs> {
    public long B;
    public long C;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.cs f109520x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.ds f109521y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109522z;
    public final int A = 1;
    public java.lang.String D = "";
    public java.lang.String E = "";
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.mj(this));
    public final jz5.g G = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.kj(this));
    public final com.tencent.mm.plugin.finder.feed.ui.lj H = new com.tencent.mm.plugin.finder.feed.ui.lj();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return ((java.lang.Number) ((jz5.n) this.F).getValue()).intValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109522z;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.cs csVar = this.f109520x;
        if (csVar != null) {
            return csVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.ds dsVar = this.f109521y;
        if (dsVar != null) {
            return dsVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dny;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        java.util.ArrayList<so2.j5> arrayList;
        getIntent().getIntExtra("KEY_BUSINESS_TYPE", 0);
        this.B = getIntent().getLongExtra("KEY_JUMP_FEEDID", 0L);
        this.C = getIntent().getLongExtra("key_click_feed_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_SOURCE_SESSION_BUFFER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_CLI_REPORT_INFO");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.D = stringExtra2;
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.cs csVar = new com.tencent.mm.plugin.finder.feed.cs(this, i17);
        this.f109520x = csVar;
        this.f109521y = new com.tencent.mm.plugin.finder.feed.ds(this, csVar, i17, getD());
        com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader finderRecommendReasonLoader = new com.tencent.mm.plugin.finder.feed.model.FinderRecommendReasonLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
        finderRecommendReasonLoader.initFromCache(getIntent());
        finderRecommendReasonLoader.f107622d = getIntent().getStringExtra("KEY_BY_PASS");
        finderRecommendReasonLoader.f107623e = java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_PREFETCH", 0));
        finderRecommendReasonLoader.f107624f = getIntent().getIntExtra("KEY_BUSINESS_TYPE", 0);
        finderRecommendReasonLoader.f107625g = this.B;
        finderRecommendReasonLoader.f107626h = this.E;
        java.lang.String str = this.D;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderRecommendReasonLoader.f107628m = str;
        finderRecommendReasonLoader.f107630o = ((java.lang.Number) ((jz5.n) this.F).getValue()).intValue();
        jz5.g gVar = this.G;
        finderRecommendReasonLoader.f107629n = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        finderRecommendReasonLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.ij(this, finderRecommendReasonLoader));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str2 = finderRecommendReasonLoader.f107628m;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("source_jump_info", str2);
            jSONObject.put("ref_commentscene", ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            jSONObject.put("source_feedid", pm0.v.u(this.C));
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderRecommendReasonLoader.f107627i = jSONObject2;
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderRecommendReasonLoader.getCache();
            if (cache != null && (arrayList = cache.f108300a) != null) {
                for (so2.j5 j5Var : arrayList) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                    long itemId = j5Var.getItemId();
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                    com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk(o3Var, itemId, baseFinderFeed != null ? baseFinderFeed.w() : null, finderRecommendReasonLoader.f107630o, null, 8, null);
                    if (hk6 != null) {
                        try {
                            r45.fl2 fl2Var = hk6.f125012a;
                            db2.t4 t4Var = db2.t4.f228171a;
                            java.lang.String string = fl2Var.getString(5);
                            if (string == null) {
                                string = "";
                            }
                            fl2Var.set(5, db2.t4.m(t4Var, string, jSONObject2, false, 4, null));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(finderRecommendReasonLoader.getF123427d(), "FinderReporterUIC add sourceJumpInfo error", e17);
        }
        finderRecommendReasonLoader.f107632q = new com.tencent.mm.plugin.finder.feed.ui.jj(finderRecommendReasonLoader, this);
        this.f109522z = finderRecommendReasonLoader;
        com.tencent.mm.plugin.finder.feed.ds dsVar = this.f109521y;
        if (dsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        dsVar.getRecyclerView().i(this.H);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4);
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet Q0 = kz5.n0.Q0(super.importUIComponents());
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.h80.class);
        Q0.add(hy2.f.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
        return Q0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.feed.ds dsVar = this.f109521y;
        if (dsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        dsVar.getRecyclerView().V0(this.H);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
