package com.tencent.mm.plugin.finder.feed.ui;

@db5.c9
@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSecondaryDeviceUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class FinderLiveAnchorSecondaryDeviceUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment f109329w;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109328v = "FinderLiveAnchorSecondaryDeviceUI";

    /* renamed from: x, reason: collision with root package name */
    public int f109330x = -1;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF109328v() {
        return this.f109328v;
    }

    public final void d7() {
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment finderLiveAnchorFragment = new com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment();
        this.f109329w = finderLiveAnchorFragment;
        finderLiveAnchorFragment.f111651n = true;
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.k(com.tencent.mm.R.id.gd9, finderLiveAnchorFragment, null);
        beginTransaction.f();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.finder.live.fragment.FinderLiveAnchorFragment finderLiveAnchorFragment = this.f109329w;
        if (finderLiveAnchorFragment != null) {
            java.util.Iterator it = finderLiveAnchorFragment.f206298e.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.component.UIComponent) it.next()).onBeforeFinish(getIntent());
            }
        }
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b0u;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onConfigurationChanged] lastOrientation：" + this.f109330x + ",newConfig.orientation:" + newConfig.orientation);
        int i17 = this.f109330x;
        int i18 = newConfig.orientation;
        if (i17 != i18) {
            this.f109330x = i18;
            android.content.Intent intent = getIntent();
            java.lang.String stringExtra = getIntent().getStringExtra("KEY_PARAMS_CONFIG_KEY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent.putExtra("KEY_PARAMS_CONFIG_KEY", stringExtra);
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            d7();
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ik(true, newConfig.orientation);
        }
        com.tencent.mm.sdk.platformtools.m2.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            k0Var.checkFinishWhenDiffTask(this);
        }
        super.onCreate(bundle);
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        d7();
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onCreate]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onDestroy]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onPause]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onResume]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onStart]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f109328v, "[onStop]");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(or2.f.class);
        set.add(com.tencent.mm.plugin.finder.live.viewmodel.g4.class);
    }
}
