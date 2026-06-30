package bs2;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final bs2.f f23830a = new bs2.f();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f23831b;

    /* renamed from: c, reason: collision with root package name */
    public static mn2.g4 f23832c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.storage.FeedData f23833d;

    /* renamed from: e, reason: collision with root package name */
    public static android.widget.FrameLayout f23834e;

    /* renamed from: f, reason: collision with root package name */
    public static androidx.lifecycle.x f23835f;

    public final boolean a(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        mn2.g4 g4Var = f23832c;
        return kotlin.jvm.internal.o.b(mediaId, g4Var != null ? g4Var.n() : null);
    }

    public final void b(final androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.x xVar = f23835f;
        if (xVar != null) {
            android.widget.FrameLayout frameLayout = f23834e;
            android.content.Context context = frameLayout != null ? frameLayout.getContext() : null;
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
            if (appCompatActivity2 != null && (mo133getLifecycle = appCompatActivity2.mo133getLifecycle()) != null) {
                mo133getLifecycle.c(xVar);
            }
        }
        f23835f = null;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(appCompatActivity);
        frameLayout2.setAlpha(0.0f);
        f23834e = frameLayout2;
        androidx.lifecycle.x xVar2 = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore$newPlaceHolderView$3
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", "onDestroy: placeHolderView=" + bs2.f.f23834e);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearCache: source=");
                sb6.append("LauncherUIDestroy");
                sb6.append(", cacheMedia=");
                sb6.append(hc2.b0.g(bs2.f.f23833d, 0, 1, null));
                sb6.append('.');
                mn2.g4 g4Var = bs2.f.f23832c;
                sb6.append(g4Var != null ? g4Var.n() : null);
                com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", sb6.toString());
                pm0.v.X(bs2.d.f23823d);
                androidx.appcompat.app.AppCompatActivity.this.mo133getLifecycle().c(this);
            }
        };
        f23835f = xVar2;
        appCompatActivity.mo133getLifecycle().a(xVar2);
    }

    public final void c(mn2.g4 media, com.tencent.mm.plugin.finder.storage.FeedData feedData) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(feedData, "feedData");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean S2 = t70Var.S2();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadThumbPlayer: switchOn=");
        sb6.append(S2);
        sb6.append(", newMedia=");
        jz5.f0 f0Var = null;
        sb6.append(hc2.b0.g(feedData, 0, 1, null));
        sb6.append('.');
        sb6.append(media.n());
        sb6.append(", oldCacheMedia=");
        sb6.append(hc2.b0.g(f23833d, 0, 1, null));
        sb6.append('.');
        mn2.g4 g4Var = f23832c;
        sb6.append(g4Var != null ? g4Var.n() : null);
        com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", sb6.toString());
        if (S2) {
            java.lang.String mediaId = media.n();
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).O6(new bs2.e(c0Var, mediaId));
            if (c0Var.f310112d) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preloadThumbPlayer:return for hasLoadInPool, newMedia=");
                sb7.append(hc2.b0.g(feedData, 0, 1, null));
                sb7.append('.');
                sb7.append(media.n());
                sb7.append(", oldCacheMedia=");
                sb7.append(hc2.b0.g(feedData, 0, 1, null));
                sb7.append('.');
                mn2.g4 g4Var2 = f23832c;
                sb7.append(g4Var2 != null ? g4Var2.n() : null);
                com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", sb7.toString());
                return;
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = f23831b;
            if (finderThumbPlayerProxy2 != null) {
                finderThumbPlayerProxy2.stop();
                finderThumbPlayerProxy2.b();
            }
            f23832c = media;
            f23833d = feedData;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127771ja).getValue()).r()).intValue() > 0) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                finderThumbPlayerProxy = new cw2.o(context);
            } else {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                finderThumbPlayerProxy = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context2);
            }
            finderThumbPlayerProxy.setPreloadedView(true);
            feedData.setPositionType(8);
            finderThumbPlayerProxy.n(media, false, feedData);
            bs2.f fVar = f23830a;
            boolean T2 = t70Var.T2();
            com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", "attachSurface: switchOn=" + T2);
            if (T2) {
                ((bt.u0) ((ct.a3) i95.n0.c(ct.a3.class))).getClass();
                com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", "attachSurface: LauncherUI=" + launcherUI);
                if (launcherUI != null) {
                    android.widget.FrameLayout frameLayout = f23834e;
                    if (frameLayout != null) {
                        if (kotlin.jvm.internal.o.b(frameLayout.getContext(), launcherUI)) {
                            frameLayout.removeAllViews();
                        } else {
                            android.view.ViewParent parent = frameLayout.getParent();
                            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(frameLayout);
                            }
                            fVar.b(launcherUI);
                        }
                        f0Var = jz5.f0.f302826a;
                    }
                    if (f0Var == null) {
                        fVar.b(launcherUI);
                    }
                    android.widget.FrameLayout frameLayout2 = f23834e;
                    if (frameLayout2 != null && frameLayout2.getParent() == null) {
                        android.view.View decorView = launcherUI.getWindow().getDecorView();
                        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((android.view.ViewGroup) decorView).addView(f23834e, 1, 1);
                    }
                    android.widget.FrameLayout frameLayout3 = f23834e;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(finderThumbPlayerProxy);
                    }
                }
            }
            int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().R * 1000;
            if (i17 > 0) {
                com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", "preloadThumbPlayer " + i17);
            } else {
                i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127856o5).getValue()).r()).intValue();
            }
            com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "prepareToPlay minBufferDuration:" + i17);
            finderThumbPlayerProxy.M1 = i17;
            finderThumbPlayerProxy.F();
            finderThumbPlayerProxy.M1 = 0;
            finderThumbPlayerProxy.setMute(true);
            f23831b = finderThumbPlayerProxy;
        }
    }
}
