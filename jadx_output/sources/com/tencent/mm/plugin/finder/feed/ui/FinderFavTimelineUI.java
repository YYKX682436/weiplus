package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/j8;", "Lcom/tencent/mm/plugin/finder/feed/i8;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFavTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.j8, com.tencent.mm.plugin.finder.feed.i8> {
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.i8 f109229x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.j8 f109230y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f109231z;
    public java.lang.String A = "";
    public java.lang.String B = "";
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final int E = 2;
    public final com.tencent.mm.plugin.finder.feed.ui.x1 F = new com.tencent.mm.plugin.finder.feed.ui.x1();

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        if (getIntent().getBooleanExtra("KEY_COLLECTION", false)) {
            return 166;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127895q8).getValue()).r()).booleanValue() ? 165 : 21;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f109231z;
        if (baseFinderFeedLoader != null) {
            return baseFinderFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.i8 i8Var = this.f109229x;
        if (i8Var != null) {
            return i8Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.j8 j8Var = this.f109230y;
        if (j8Var != null) {
            return j8Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.agy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader;
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FAV_QUERY");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_REQUEST_ID");
        this.B = stringExtra2 != null ? stringExtra2 : "";
        this.C = getIntent().getBooleanExtra("KEY_COLLECTION", false);
        java.util.LinkedList linkedList = this.D;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_TAGS");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        linkedList.addAll(stringArrayListExtra);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.FinderFavTimelineUI;
        ((cy1.a) rVar).ak(this, cVar);
        int i17 = this.E;
        com.tencent.mm.plugin.finder.feed.i8 i8Var = new com.tencent.mm.plugin.finder.feed.i8(this, i17);
        this.f109229x = i8Var;
        this.f109230y = new com.tencent.mm.plugin.finder.feed.j8(this, i8Var, i17, getD());
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        if (this.C) {
            com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader finderGlobalFavLoader = new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoader(V6, true);
            finderGlobalFavLoader.initFromCache(getIntent());
            finderGlobalFavLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.r1(this, finderGlobalFavLoader));
            finderGlobalFavLoader.f129136e = new com.tencent.mm.plugin.finder.feed.ui.s1(this);
            finderInteractionSearchFeedLoader = finderGlobalFavLoader;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.A) && com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader(xy2.c.e(context), V6, true);
            finderFavFeedLoader.initFromCache(getIntent());
            finderFavFeedLoader.f107414m = getIntent().getLongExtra("key_active_topic_id", 0L);
            finderFavFeedLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.t1(this, finderFavFeedLoader));
            finderFavFeedLoader.f107410f = new com.tencent.mm.plugin.finder.feed.ui.u1(this);
            finderInteractionSearchFeedLoader = finderFavFeedLoader;
        } else {
            com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader2 = new com.tencent.mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader(V6, true, this.A, this.B, linkedList, 2);
            finderInteractionSearchFeedLoader2.initFromCache(getIntent());
            finderInteractionSearchFeedLoader2.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.v1(this, finderInteractionSearchFeedLoader2));
            finderInteractionSearchFeedLoader2.f107465i = new com.tencent.mm.plugin.finder.feed.ui.w1(this);
            finderInteractionSearchFeedLoader = finderInteractionSearchFeedLoader2;
        }
        this.f109231z = finderInteractionSearchFeedLoader;
        com.tencent.mm.plugin.finder.feed.j8 j8Var = this.f109230y;
        if (j8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        j8Var.getRecyclerView().i(this.F);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4)).setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, cVar)).Rj(this, iy1.a.Finder);
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
        com.tencent.mm.plugin.finder.feed.j8 j8Var = this.f109230y;
        if (j8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        j8Var.getRecyclerView().V0(this.F);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.j8 j8Var = this.f109230y;
        if (j8Var != null) {
            zy2.zb.Kh(zbVar, j8Var.getRecyclerView(), ml2.x1.f328203g, "21", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.feed.j8 j8Var = this.f109230y;
        if (j8Var != null) {
            zy2.zb.Kh(zbVar, j8Var.getRecyclerView(), ml2.x1.f328203g, "21", ml2.y.f328240e, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}
