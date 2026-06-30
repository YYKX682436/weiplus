package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveReplayUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveReplayUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public int f109411v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment f109412w;

    /* renamed from: x, reason: collision with root package name */
    public int f109413x = -1;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public final void d7() {
        com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment finderLiveReplayFragment = new com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment();
        this.f109412w = finderLiveReplayFragment;
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.k(com.tencent.mm.R.id.gd9, finderLiveReplayFragment, null);
        beginTransaction.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI.finish():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ay8;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{im2.t4.class, im2.r4.class});
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        if (getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false)) {
            return;
        }
        super.initActivityCloseAnimation();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onConfigurationChanged] lastOrientation：" + this.f109413x + ",newConfig.orientation:" + newConfig.orientation);
        int i17 = this.f109413x;
        int i18 = newConfig.orientation;
        if (i17 != i18) {
            this.f109413x = i18;
            getIntent().putExtra("KEY_PARAMS_RESET_REPLAY", true);
            com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment finderLiveReplayFragment = this.f109412w;
            if (finderLiveReplayFragment != null) {
                androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
                kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                beginTransaction.j(finderLiveReplayFragment);
                beginTransaction.f();
            }
            d7();
        }
        com.tencent.mm.sdk.platformtools.m2.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        android.view.View decorView;
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderLiveReplayUI)).Rj(this, iy1.a.Finder);
        this.f109411v = getIntent().getIntExtra("KEY_PARAMS_SOURCE_TYPE", 0);
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_context_id");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_click_tab_context_id");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_click_sub_tab_context_id");
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_chnl_extra");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).f135382p = stringExtra;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).f135386r = stringExtra2;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra3)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).f135387s = stringExtra3;
        }
        if (!android.text.TextUtils.isEmpty(stringExtra4)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).Q6(stringExtra4);
        }
        getIntent().putExtra("KEY_PARAMS_RESET_REPLAY", false);
        d7();
        if (!getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false) && (window = getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackgroundColor(-16777216);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onCreate]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false)) {
            if (com.tencent.mm.ui.bk.C()) {
                setTheme(com.tencent.mm.R.style.f494372la);
            } else {
                setTheme(com.tencent.mm.R.style.f494372la);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onDestroy]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onPause]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onResume]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onStart]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayUI", "[onStop]");
    }
}
