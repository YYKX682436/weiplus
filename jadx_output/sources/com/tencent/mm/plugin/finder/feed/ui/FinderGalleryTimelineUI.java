package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryLoader;", "Lcom/tencent/mm/plugin/finder/gallery/t0;", "Lcom/tencent/mm/plugin/finder/gallery/r0;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGalleryTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader, com.tencent.mm.plugin.finder.gallery.t0, com.tencent.mm.plugin.finder.gallery.r0> {
    public android.widget.LinearLayout A;
    public com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader B;
    public boolean C;
    public int D;
    public final com.tencent.mm.plugin.finder.feed.ui.d4 E = new com.tencent.mm.plugin.finder.feed.ui.d4(this);

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.r0 f109269x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.t0 f109270y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f109271z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = this.B;
        if (finderGalleryLoader != null) {
            return finderGalleryLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.gallery.r0 r0Var = this.f109269x;
        if (r0Var != null) {
            return r0Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.finder.gallery.t0 t0Var = this.f109270y;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (t0Var.getRecyclerView().getLayoutManager() instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) {
            com.tencent.mm.plugin.finder.gallery.t0 t0Var2 = this.f109270y;
            if (t0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = t0Var2.getRecyclerView().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w();
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = this.B;
            if (finderGalleryLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            java.lang.Object obj = finderGalleryLoader.getDataList().get(w17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            intent.putExtra("SELECT_OBJECT", ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getFeedObject().getFeedObject().toByteArray());
            intent.putExtra("TAB_TYPE", this.D);
            setResult(-2, intent);
        }
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.gallery.t0 t0Var = this.f109270y;
        if (t0Var != null) {
            return t0Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ajo;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        this.C = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_GALLERY_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.iie);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.A = linearLayout;
        if (this.C) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.gallery.d.f111359b.a(getIntent());
        int intExtra = getIntent().getIntExtra("BIZ_SCENE", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("EXT_BUFF");
        this.D = getIntent().getIntExtra("TAB_TYPE", 0);
        r45.c41 c41Var = new r45.c41();
        c41Var.set(0, java.lang.Integer.valueOf(this.D));
        c41Var.set(1, java.lang.Integer.valueOf(intExtra));
        c41Var.set(2, byteArrayExtra == null ? null : com.tencent.mm.protobuf.g.b(byteArrayExtra));
        com.tencent.mm.plugin.finder.gallery.r0 r0Var = new com.tencent.mm.plugin.finder.gallery.r0(this, this.D);
        this.f109269x = r0Var;
        this.f109270y = new com.tencent.mm.plugin.finder.gallery.t0(this, r0Var, 0, 0);
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = new com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader(c41Var, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), true);
        finderGalleryLoader.initFromCache(getIntent());
        finderGalleryLoader.setInitDone(new com.tencent.mm.plugin.finder.feed.ui.a4(this, finderGalleryLoader));
        finderGalleryLoader.f111338f = new com.tencent.mm.plugin.finder.feed.ui.b4(this);
        this.B = finderGalleryLoader;
        com.tencent.mm.plugin.finder.gallery.t0 t0Var = this.f109270y;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        t0Var.getRecyclerView().i(this.E);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4)).setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.opo);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f109271z = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.c4(this));
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, ni3.n.class});
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.gallery.t0 t0Var = this.f109270y;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        t0Var.getRecyclerView().V0(this.E);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.j6.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.z6.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i7.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b7.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i6.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.d7.class)));
        set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b9.class)));
    }
}
