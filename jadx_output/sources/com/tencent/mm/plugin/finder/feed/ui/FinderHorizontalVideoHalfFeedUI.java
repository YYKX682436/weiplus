package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/xb;", "Lcom/tencent/mm/plugin/finder/feed/wb;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHorizontalVideoHalfFeedUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.xb, com.tencent.mm.plugin.finder.feed.wb> {
    public static final /* synthetic */ int B = 0;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed A;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.wb f109292x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.xb f109293y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f109294z;

    public static final void k7(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI, boolean z17) {
        finderHorizontalVideoHalfFeedUI.getClass();
        com.tencent.mars.xlog.Log.i("FinderHalfScreenUI", "showRetryTips ifShow:" + z17);
        android.view.View findViewById = finderHorizontalVideoHalfFeedUI.findViewById(com.tencent.mm.R.id.m2d);
        if (findViewById != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showRetryTips", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.p5(finderHorizontalVideoHalfFeedUI, findViewById));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 162;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f109294z;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.wb wbVar = this.f109292x;
        if (wbVar != null) {
            return wbVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.xb xbVar = this.f109293y;
        if (xbVar != null) {
            return xbVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ak7;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.k5(this));
        long longExtra = getIntent().getLongExtra("feed_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("feed_encrypted_object_id");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("feed_object_nonceId");
        java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
        if (longExtra != 0 && (h17 = bu2.j.f24534a.h(longExtra)) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("use cache cacheTime=");
            long j17 = 1000;
            sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, h17.getTimestamps() / j17));
            sb6.append(", cacheTime=");
            sb6.append(h17.getTimestamps());
            sb6.append(" current=");
            sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, c01.id.c() / j17));
            sb6.append(", urlValidDuration=");
            sb6.append(h17.getFeedObject().getUrlValidDuration());
            sb6.append('s');
            com.tencent.mars.xlog.Log.i("FinderHalfScreenUI", sb6.toString());
            if (h17.getTimestamps() <= 0 || c01.id.c() < h17.getTimestamps() + (h17.getFeedObject().getUrlValidDuration() * 1000)) {
                this.A = cu2.u.f222441a.p(h17);
            }
        }
        if (this.A == null) {
            com.tencent.mars.xlog.Log.i("FinderHalfScreenUI", "cache null.show progress");
            l7(true);
        } else {
            l7(false);
        }
        int intExtra = getContext().getIntent().getIntExtra("key_reuqest_scene", 31);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = new com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader(longExtra, str, str2, getIntent().getIntExtra("tab_type", 301), false, intExtra, "", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), false, 0, false, false, null, null, null, null, null, null, null, null, null, null, 4194048, null);
        finderFeedShareRelativeListLoader.F = new com.tencent.mm.plugin.finder.feed.ui.l5(this);
        this.f109294z = finderFeedShareRelativeListLoader;
        com.tencent.mm.plugin.finder.feed.wb wbVar = new com.tencent.mm.plugin.finder.feed.wb(this);
        wbVar.f110966z = longExtra;
        wbVar.A = str2;
        wbVar.E = this.A;
        wbVar.B = str;
        wbVar.F = intExtra;
        wbVar.C = new com.tencent.mm.plugin.finder.feed.ui.m5(this, wbVar);
        wbVar.D = new com.tencent.mm.plugin.finder.feed.ui.n5(this, wbVar);
        this.f109292x = wbVar;
        this.f109293y = new com.tencent.mm.plugin.finder.feed.xb(this, wbVar, 2, 162);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Rj(this, iy1.a.Finder);
        aVar.ik(this, be1.r0.CTRL_INDEX, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.feed.ui.o5(this));
    }

    public final void l7(boolean z17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.gwj);
        if (findViewById == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
