package com.tencent.mm.plugin.finder.gallery;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/gallery/FinderGalleryFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/gallery/v0;", "Lcom/tencent/mm/plugin/finder/gallery/a0;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGalleryFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.gallery.v0, com.tencent.mm.plugin.finder.gallery.a0> {
    public static final /* synthetic */ int B = 0;
    public final com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$feedProgressListener$1 A;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.gallery.d f111328u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f111329v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.a0 f111330w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.v0 f111331x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader f111332y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f111333z;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$feedProgressListener$1] */
    public FinderGalleryFragment(com.tencent.mm.plugin.finder.gallery.d galleryConfig, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(galleryConfig, "galleryConfig");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedPostProgressEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$feedProgressListener$1
            {
                this.__eventId = 1870727551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent) {
                com.tencent.mm.autogen.events.FeedPostProgressEvent event = feedPostProgressEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i18 = com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment.B;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f54250g;
                sb6.append(gaVar.f6749a);
                sb6.append(", progress:");
                sb6.append(gaVar.f6750b);
                com.tencent.mars.xlog.Log.i("Finder.FinderGalleryFragment", sb6.toString());
                com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment.this.f111332y;
                if (finderGalleryLoader != null) {
                    finderGalleryLoader.updateProgressByLocalId(gaVar.f6749a);
                    return true;
                }
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
        };
        this.f111328u = galleryConfig;
        this.f111329v = z17;
        this.f129265p = i17;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.gallery.v0 v0Var = this.f111331x;
        if (v0Var != null) {
            return v0Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public void C0(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        final r45.c41 c41Var = new r45.c41();
        c41Var.set(0, java.lang.Integer.valueOf(this.f129265p));
        com.tencent.mm.plugin.finder.gallery.d dVar = this.f111328u;
        c41Var.set(1, java.lang.Integer.valueOf(dVar.f111360a.f111343b));
        com.tencent.mm.plugin.finder.gallery.a aVar = dVar.f111360a;
        byte[] bArr = aVar.f111344c;
        c41Var.set(2, bArr == null ? null : com.tencent.mm.protobuf.g.b(bArr));
        if (this.f111329v) {
            c41Var.set(3, aVar.f111345d);
        }
        if (this.f129265p == 5) {
            this.f111333z = true;
        }
        com.tencent.mm.ui.MMActivity activity = y0();
        kotlin.jvm.internal.o.g(activity, "activity");
        final r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = new com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader(c41Var, V6) { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment$initOnCreate$1
            @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, mv2.w0
            public void onPostStart(long j17) {
                com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment = this;
                com.tencent.mm.plugin.finder.gallery.v0 v0Var = finderGalleryFragment.f111331x;
                if (v0Var == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                android.view.View t17 = v0Var.t();
                if (t17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "onPostStart", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(t17, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$1", "onPostStart", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.finder.gallery.v0 v0Var2 = finderGalleryFragment.f111331x;
                if (v0Var2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                v0Var2.f106180m.setVisibility(0);
                super.onPostStart(j17);
            }
        };
        this.f111332y = finderGalleryLoader;
        finderGalleryLoader.setInitDone(new com.tencent.mm.plugin.finder.gallery.n(this));
        finderGalleryLoader.f111338f = new com.tencent.mm.plugin.finder.gallery.o(this);
        com.tencent.mm.ui.MMActivity y07 = y0();
        com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader2 = this.f111332y;
        if (finderGalleryLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        this.f111330w = new com.tencent.mm.plugin.finder.gallery.a0(y07, finderGalleryLoader2, dVar, this.f129265p);
        com.tencent.mm.plugin.finder.gallery.p pVar = new com.tencent.mm.plugin.finder.gallery.p(view, y0(), dVar, this.f129265p);
        this.f111331x = pVar;
        com.tencent.mm.plugin.finder.gallery.a0 a0Var = this.f111330w;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        pVar.f106182o = a0Var;
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ajk;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        if (this.f111333z) {
            return;
        }
        this.f111333z = true;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.gallery.q(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dead();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        com.tencent.mm.plugin.finder.gallery.a0 a0Var = this.f111330w;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
