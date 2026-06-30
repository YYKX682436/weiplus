package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/i0;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/tencent/mm/plugin/finder/feed/c0;", "P", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class FinderBaseFeedUI<V extends com.tencent.mm.plugin.finder.feed.i0, P extends com.tencent.mm.plugin.finder.feed.c0> extends com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI {

    /* renamed from: t, reason: collision with root package name */
    public vb2.m f109219t;

    public abstract com.tencent.mm.plugin.finder.feed.c0 c7();

    public abstract com.tencent.mm.plugin.finder.feed.i0 d7();

    public void e7() {
    }

    public abstract void f7();

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class});
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        super.onActivityResult(i17, i18, intent);
        if (-1 == i18 && i17 == 101) {
            androidx.recyclerview.widget.RecyclerView recyclerView = d7().getRecyclerView();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w());
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                if (s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null) {
                    return;
                }
                long longExtra = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1L) : -1L;
                long longExtra2 = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1L) : -1L;
                com.tencent.mars.xlog.Log.i("FinderBaseFeedUI", "[onActivityResult] feedId=" + pm0.v.u(longExtra) + " seekTime=" + longExtra2);
                if (longExtra2 != -1) {
                    com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, longExtra2, 0, 0.0f, false, null, 30, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) r0).P6(false) != false) goto L6;
     */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r2 = this;
            com.tencent.mm.plugin.finder.feed.c0 r0 = r2.c7()
            boolean r0 = r0.F()
            if (r0 != 0) goto L24
            pf5.z r0 = pf5.z.f353948a
            pf5.v r0 = r0.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.gg> r1 = com.tencent.mm.plugin.finder.viewmodel.component.gg.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            com.tencent.mm.plugin.finder.viewmodel.component.gg r0 = (com.tencent.mm.plugin.finder.viewmodel.component.gg) r0
            r1 = 0
            boolean r0 = r0.P6(r1)
            if (r0 == 0) goto L25
        L24:
            r1 = 1
        L25:
            if (r1 != 0) goto L53
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
            if (r0 == 0) goto L50
            super.onBackPressed()
            goto L53
        L50:
            r2.finish()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI.onBackPressed():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
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
        android.view.View bodyView = getBodyView();
        kotlin.jvm.internal.o.e(bodyView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) bodyView;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.aj9, viewGroup, false);
        viewGroup.addView(inflate);
        this.f109219t = vb2.m.a(inflate);
        int h17 = com.tencent.mm.ui.bl.h(this);
        vb2.m mVar = this.f109219t;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        android.widget.FrameLayout frameLayout = mVar.f434671g;
        frameLayout.setPadding(0, h17, 0, 0);
        boolean z17 = true;
        com.tencent.mm.ui.a4.g(frameLayout, true);
        vb2.m mVar2 = this.f109219t;
        if (mVar2 == null) {
            kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        mVar2.f434666b.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.a1(this));
        if (com.tencent.mm.ui.bk.y()) {
            vb2.m mVar3 = this.f109219t;
            if (mVar3 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar3.f434678n.setVisibility(0);
            vb2.m mVar4 = this.f109219t;
            if (mVar4 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar4.f434676l.setVisibility(0);
        } else {
            vb2.m mVar5 = this.f109219t;
            if (mVar5 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar5.f434678n.setVisibility(8);
            vb2.m mVar6 = this.f109219t;
            if (mVar6 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar6.f434676l.setVisibility(8);
        }
        vb2.m mVar7 = this.f109219t;
        if (mVar7 == null) {
            kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        mVar7.f434678n.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.d1(this));
        java.lang.CharSequence mMTitle = getMMTitle();
        if (mMTitle != null && mMTitle.length() != 0) {
            z17 = false;
        }
        if (z17) {
            vb2.m mVar8 = this.f109219t;
            if (mVar8 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar8.f434669e.setVisibility(8);
        } else {
            vb2.m mVar9 = this.f109219t;
            if (mVar9 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar9.f434669e.setVisibility(0);
            vb2.m mVar10 = this.f109219t;
            if (mVar10 == null) {
                kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
                throw null;
            }
            mVar10.f434669e.setText(getMMTitle());
        }
        com.tencent.mm.ui.bk.i0(getWindow(), false);
        com.tencent.mm.ui.bk.h0(getWindow(), false);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        vb2.m mVar11 = this.f109219t;
        if (mVar11 == null) {
            kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
        mVar11.f434671g.setVisibility(0);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m6e);
        if (findViewById != null) {
            findViewById.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
            findViewById.setBackgroundResource(com.tencent.mm.R.color.f479160rk);
        }
        f7();
        c7().D(d7());
        e7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c7().onDetach();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c7().I();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c7().M();
    }
}
