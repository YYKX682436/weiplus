package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "M", "Lcom/tencent/mm/plugin/finder/feed/gj;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/tencent/mm/plugin/finder/feed/dj;", "P", "Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderHomeSlideProfileUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderLoaderFeedSupportSlideUI<M extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, V extends com.tencent.mm.plugin.finder.feed.gj, P extends com.tencent.mm.plugin.finder.feed.dj> extends com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI {
    public static final /* synthetic */ int B = 0;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109457y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.nf(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109458z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.lf(this));
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.kf(this));

    @Override // com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI
    public void i7(boolean z17) {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        cw2.z9 videoCore;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2;
        cw2.z9 videoCore2;
        pf5.u uVar = pf5.u.f353936a;
        if (z17) {
            androidx.recyclerview.widget.RecyclerView recyclerView = p7().getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w());
                s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                if (s0Var != null && (finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null && (videoCore2 = finderVideoLayout2.getVideoCore()) != null) {
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    videoCore2.g(context);
                }
            } else {
                ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).f7(this);
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                ((uo2.v) uVar.c(context2).a(uo2.v.class)).T6();
            }
            t7(true);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = p7().getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
        if (layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.k3 p08 = recyclerView2.p0(((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).w());
            s0Var = p08 instanceof in5.s0 ? (in5.s0) p08 : null;
            if (s0Var != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null && (videoCore = finderVideoLayout.getVideoCore()) != null) {
                androidx.appcompat.app.AppCompatActivity context3 = getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                videoCore.c(context3);
            }
        } else {
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).c7(this);
            androidx.appcompat.app.AppCompatActivity context4 = getContext();
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            ((uo2.v) uVar.c(context4).a(uo2.v.class)).S6();
        }
        t7(false);
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet d17 = kz5.p1.d(com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, ni3.n.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class);
        if (this instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) {
            d17.add(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        }
        return d17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    public final boolean k7() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        if (context == null) {
            return false;
        }
        if ((com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0()) {
            return com.tencent.mm.ui.bk.P(context) || com.tencent.mm.ui.bk.N(context.getTaskId()) || (com.tencent.mm.ui.bk.O(context.getContentResolver()) && !context.isInMultiWindowMode());
        }
        return false;
    }

    public final android.widget.TextView l7() {
        return (android.widget.TextView) ((jz5.n) this.f109458z).getValue();
    }

    public abstract com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader m7();

    public abstract com.tencent.mm.plugin.finder.feed.dj n7();

    public final vb2.m o7() {
        return (vb2.m) ((jz5.n) this.f109457y).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        super.onActivityResult(i17, i18, intent);
        if (-1 == i18 && i17 == 101) {
            androidx.recyclerview.widget.RecyclerView recyclerView = p7().getRecyclerView();
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) r0).P6(false) != false) goto L18;
     */
    @Override // com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r2 = this;
            boolean r0 = r2.f7()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.HashSet r0 = r2.getUiComponents()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.mm.ui.component.UIComponent) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto Lf
            return
        L22:
            boolean r0 = r2.r7()
            if (r0 == 0) goto L29
            return
        L29:
            com.tencent.mm.plugin.finder.feed.dj r0 = r2.n7()
            boolean r0 = r0.F()
            if (r0 != 0) goto L4d
            pf5.z r0 = pf5.z.f353948a
            pf5.v r0 = r0.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.gg> r1 = com.tencent.mm.plugin.finder.viewmodel.component.gg.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            com.tencent.mm.plugin.finder.viewmodel.component.gg r0 = (com.tencent.mm.plugin.finder.viewmodel.component.gg) r0
            r1 = 0
            boolean r0 = r0.P6(r1)
            if (r0 == 0) goto L4e
        L4d:
            r1 = 1
        L4e:
            if (r1 != 0) goto L7c
            java.lang.Class<cq.k> r0 = cq.k.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            cq.k r0 = (cq.k) r0
            com.tencent.mm.plugin.finder.storage.t70 r0 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r0 = com.tencent.mm.plugin.finder.storage.t70.Z5
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L79
            super.onBackPressed()
            goto L7c
        L79:
            r2.finish()
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI.onBackPressed():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        u7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
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
        android.view.View timelineView = ((com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) findViewById(com.tencent.mm.R.id.u2u)).getTimelineView();
        kotlin.jvm.internal.o.e(timelineView, "null cannot be cast to non-null type android.view.ViewGroup");
        boolean z17 = true;
        b17.inflate(com.tencent.mm.R.layout.aj9, (android.view.ViewGroup) timelineView, true);
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.widget.FrameLayout frameLayout = o7().f434671g;
        frameLayout.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(frameLayout, true);
        o7().f434666b.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.hf(this));
        u7();
        o7().f434678n.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.jf(this));
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle != null && mMTitle.length() != 0) {
            z17 = false;
        }
        if (z17) {
            l7().setVisibility(8);
        } else {
            l7().setVisibility(0);
            l7().setText(getMMTitle());
        }
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        com.tencent.mm.ui.bk.h0(getWindow(), false);
        getWindow().getNavigationBarColor();
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        o7().f434671g.setVisibility(0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
        if (findViewById != null) {
            findViewById.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
            findViewById.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479160rk));
        }
        q7();
        com.tencent.mm.plugin.finder.feed.dj n76 = n7();
        com.tencent.mm.plugin.finder.feed.gj p76 = p7();
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader m76 = m7();
        n76.X(m76, p76);
        if (this instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) {
            android.widget.FrameLayout frameLayout2 = o7().f434668d;
            frameLayout2.setVisibility(0);
            frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.mf(this));
            com.tencent.mm.plugin.finder.viewmodel.component.gg ggVar = (com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
            ggVar.f134512n = m76;
            ggVar.U6(getIntent().getExtras());
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        n7().onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        n7().I();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n7().M();
        u7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.o.g(outState, "outState");
        super.onSaveInstanceState(outState);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(m7(), getIntent(), m7().getInitPos(), null, 4, null);
    }

    public abstract com.tencent.mm.plugin.finder.feed.gj p7();

    public abstract void q7();

    public boolean r7() {
        return false;
    }

    public boolean s7() {
        if (!k7()) {
            ((hy2.f) pf5.z.f353948a.a(this).a(hy2.f.class)).getClass();
            if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.CharSequence charSequence) {
        super.setMMTitle(charSequence);
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            l7().setVisibility(8);
        } else {
            l7().setVisibility(0);
            l7().setText(getMMTitle());
        }
    }

    public final void t7(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = p7().getRecyclerView();
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            androidx.recyclerview.widget.k3 m07 = recyclerView.m0(recyclerView.getChildAt(i17));
            if (m07 != null && (m07 instanceof in5.s0)) {
                in5.s0 s0Var = (in5.s0) m07;
                java.lang.Object obj = s0Var.f293125i;
                if ((obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj).getFeedObject().getMediaType() == 2) {
                    com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = (com.tencent.mm.plugin.finder.view.image.FinderImageBanner) s0Var.p(com.tencent.mm.R.id.f484869fs3);
                    if (z17) {
                        finderImageBanner.m();
                    } else {
                        finderImageBanner.o();
                    }
                }
            }
        }
    }

    public void u7() {
        if (k7()) {
            o7().f434678n.setVisibility(0);
        } else {
            o7().f434678n.setVisibility(8);
        }
        if (s7()) {
            o7().f434676l.setVisibility(0);
        } else {
            o7().f434676l.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(int i17) {
        super.setMMTitle(i17);
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            l7().setVisibility(8);
        } else {
            l7().setVisibility(0);
            l7().setText(getMMTitle());
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.String str) {
        super.setMMTitle(str);
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            l7().setVisibility(8);
        } else {
            l7().setVisibility(0);
            l7().setText(getMMTitle());
        }
    }
}
