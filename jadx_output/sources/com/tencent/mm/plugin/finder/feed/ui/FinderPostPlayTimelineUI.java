package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPostPlayTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/wo;", "Lcom/tencent/mm/plugin/finder/feed/uo;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostPlayTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.wo, com.tencent.mm.plugin.finder.feed.uo> {
    public long B;
    public long C;
    public long E;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.uo f109497x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.wo f109498y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109499z;
    public final int A = 1;
    public java.lang.String D = "";
    public java.lang.String F = "";
    public java.lang.String G = "";
    public final jz5.g H = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.di(this));
    public final com.tencent.mm.plugin.finder.feed.ui.ci I = new com.tencent.mm.plugin.finder.feed.ui.ci();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return ((java.lang.Number) ((jz5.n) this.H).getValue()).intValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109499z;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.uo uoVar = this.f109497x;
        if (uoVar != null) {
            return uoVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.wo woVar = this.f109498y;
        if (woVar != null) {
            return woVar;
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
        this.B = getIntent().getLongExtra("topic_id", 0L);
        this.C = getIntent().getLongExtra("from_object_id", 0L);
        this.E = getIntent().getLongExtra("key_click_feed_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("source_session_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.G = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("by_pass");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.D = stringExtra2;
        getIntent().getIntExtra("business_type", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("cli_report_info");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.F = stringExtra3;
        int i17 = this.A;
        com.tencent.mm.plugin.finder.feed.uo uoVar = new com.tencent.mm.plugin.finder.feed.uo(this, i17);
        this.f109497x = uoVar;
        this.f109498y = new com.tencent.mm.plugin.finder.feed.wo(this, uoVar, i17, getD());
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = new com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader(V6);
        finderPostPlayLoader.initFromCache(getIntent());
        finderPostPlayLoader.f107559d = java.lang.Long.valueOf(this.B);
        finderPostPlayLoader.f107563h = this.D;
        finderPostPlayLoader.f107561f = java.lang.Long.valueOf(this.C);
        finderPostPlayLoader.f107570r = this.G;
        java.lang.String str = this.F;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        finderPostPlayLoader.f107567o = str;
        finderPostPlayLoader.f107569q = getIntent().getIntExtra("single_comment_scene", 0);
        finderPostPlayLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.ai(this, finderPostPlayLoader));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (finderPostPlayLoader.f107567o.length() > 0) {
                jSONObject.put("source_jump_info", finderPostPlayLoader.f107567o);
            }
            jSONObject.put("ref_commentscene", V6.getInteger(7));
            jSONObject.put("source_feedid", pm0.v.u(this.E));
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            finderPostPlayLoader.f107566n = jSONObject2;
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderPostPlayLoader.getCache();
            if (cache != null && (arrayList = cache.f108300a) != null) {
                for (so2.j5 j5Var : arrayList) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                    long itemId = j5Var.getItemId();
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                    com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk(o3Var, itemId, baseFinderFeed != null ? baseFinderFeed.w() : null, finderPostPlayLoader.f107569q, null, 8, null);
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
            com.tencent.mars.xlog.Log.e(finderPostPlayLoader.getF123427d(), "FinderReporterUIC add sourceJumpInfo error", e17);
        }
        finderPostPlayLoader.f107571s = new com.tencent.mm.plugin.finder.feed.ui.bi(finderPostPlayLoader, this);
        this.f109499z = finderPostPlayLoader;
        com.tencent.mm.plugin.finder.feed.wo woVar = this.f109498y;
        if (woVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        woVar.getRecyclerView().i(this.I);
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
        com.tencent.mm.plugin.finder.feed.wo woVar = this.f109498y;
        if (woVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        woVar.getRecyclerView().V0(this.I);
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
