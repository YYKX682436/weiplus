package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "M", "Lcom/tencent/mm/plugin/finder/feed/gj;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/tencent/mm/plugin/finder/feed/dj;", "P", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderLoaderFeedUI<M extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, V extends com.tencent.mm.plugin.finder.feed.gj, P extends com.tencent.mm.plugin.finder.feed.dj> extends com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f109459w = 0;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f109460t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.uf(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f109461u = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.sf(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109462v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.rf(this));

    public final android.widget.TextView c7() {
        return (android.widget.TextView) ((jz5.n) this.f109461u).getValue();
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7();

    public abstract com.tencent.mm.plugin.finder.feed.dj e7();

    public final vb2.m f7() {
        return (vb2.m) ((jz5.n) this.f109460t).getValue();
    }

    public abstract com.tencent.mm.plugin.finder.feed.gj g7();

    public abstract void h7();

    public boolean i7() {
        return this instanceof com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineUI;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet d17 = kz5.p1.d(com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, ni3.n.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class);
        if (i7()) {
            d17.add(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        }
        return d17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    public final void j7() {
        if ((com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.N(getTaskId())) {
            f7().f434678n.setVisibility(0);
            f7().f434676l.setVisibility(0);
            f7().f434672h.setVisibility(4);
        } else {
            f7().f434678n.setVisibility(8);
            f7().f434676l.setVisibility(8);
            f7().f434672h.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        super.onActivityResult(i17, i18, intent);
        if (-1 == i18 && i17 == 101) {
            androidx.recyclerview.widget.RecyclerView recyclerView = g7().getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w());
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                if (s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null) {
                    return;
                }
                long longExtra = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1L) : -1L;
                long longExtra2 = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1L) : -1L;
                com.tencent.mars.xlog.Log.i("FinderLoaderFeedUI", "[onActivityResult] feedId=" + pm0.v.u(longExtra) + " seekTime=" + longExtra2);
                if (longExtra2 != -1) {
                    com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, longExtra2, 0, 0.0f, false, null, 30, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) r0).P6(false) != false) goto L12;
     */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r2 = this;
            java.util.HashSet r0 = r2.getUiComponents()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.mm.ui.component.UIComponent) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto L8
            return
        L1b:
            com.tencent.mm.plugin.finder.feed.dj r0 = r2.e7()
            boolean r0 = r0.F()
            if (r0 != 0) goto L3f
            pf5.z r0 = pf5.z.f353948a
            pf5.v r0 = r0.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.gg> r1 = com.tencent.mm.plugin.finder.viewmodel.component.gg.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            com.tencent.mm.plugin.finder.viewmodel.component.gg r0 = (com.tencent.mm.plugin.finder.viewmodel.component.gg) r0
            r1 = 0
            boolean r0 = r0.P6(r1)
            if (r0 == 0) goto L40
        L3f:
            r1 = 1
        L40:
            if (r1 != 0) goto L45
            r2.finish()
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI.onBackPressed():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        j7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!(this instanceof com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI)) {
            android.view.View decorView = getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
            getWindow().setStatusBarColor(0);
            getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
            com.tencent.mm.ui.r0.a(this, false);
            androidx.appcompat.app.b supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
                supportActionBar.o();
            }
            android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(getContext());
            android.view.View bodyView = getBodyView();
            kotlin.jvm.internal.o.e(bodyView, "null cannot be cast to non-null type android.view.ViewGroup");
            boolean z17 = true;
            b17.inflate(com.tencent.mm.R.layout.aj9, (android.view.ViewGroup) bodyView, true);
            int h17 = com.tencent.mm.ui.bl.h(this);
            android.widget.FrameLayout frameLayout = f7().f434671g;
            frameLayout.setPadding(0, h17, 0, 0);
            com.tencent.mm.ui.a4.g(frameLayout, true);
            f7().f434666b.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.of(this));
            if (getIntent().getBooleanExtra("KEY_IS_SUPPORT_DELETE_SOURCE", false)) {
                android.widget.LinearLayout linearLayout = f7().f434667c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(linearLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI", "updateDeleteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                linearLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(linearLayout, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI", "updateDeleteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(linearLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.widget.LinearLayout linearLayout2 = f7().f434667c;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(linearLayout2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(intValue2));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(linearLayout2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI", "updateDeleteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                linearLayout2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(linearLayout2, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI", "updateDeleteBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(linearLayout2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f7().f434667c.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.xf(this));
            j7();
            f7().f434678n.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.qf(this));
            java.lang.CharSequence mMTitle = getMMTitle();
            if (mMTitle != null && mMTitle.length() != 0) {
                z17 = false;
            }
            if (z17) {
                c7().setVisibility(8);
            } else {
                c7().setVisibility(0);
                c7().setText(getMMTitle());
            }
            com.tencent.mm.ui.bk.i0(getWindow(), false);
            com.tencent.mm.ui.bk.h0(getWindow(), false);
            getWindow().getNavigationBarColor();
            setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
            f7().f434671g.setVisibility(0);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
            if (findViewById != null) {
                findViewById.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
            }
        }
        h7();
        com.tencent.mm.plugin.finder.feed.dj e76 = e7();
        com.tencent.mm.plugin.finder.feed.gj g76 = g7();
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d76 = d7();
        e76.X(d76, g76);
        if (i7()) {
            android.widget.FrameLayout frameLayout2 = f7().f434668d;
            frameLayout2.setVisibility(0);
            frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.tf(this));
            com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
            ggVar.f134512n = d76;
            ggVar.U6(getIntent().getExtras());
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e7().onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        e7().I();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        e7().M();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(d7(), getIntent(), d7().getInitPos(), null, 4, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.CharSequence charSequence) {
        super.setMMTitle(charSequence);
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            c7().setVisibility(8);
        } else {
            c7().setVisibility(0);
            c7().setText(getMMTitle());
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(int i17) {
        super.setMMTitle(i17);
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            c7().setVisibility(8);
        } else {
            c7().setVisibility(0);
            c7().setText(getMMTitle());
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.String str) {
        super.setMMTitle(str);
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            c7().setVisibility(8);
        } else {
            c7().setVisibility(0);
            c7().setText(getMMTitle());
        }
    }
}
