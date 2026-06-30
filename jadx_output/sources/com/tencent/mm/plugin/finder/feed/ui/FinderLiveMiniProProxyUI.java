package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveMiniProProxyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class FinderLiveMiniProProxyUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109386v = "FinderLive.MiniProProxyUI";

    public final void d7() {
        android.content.Intent intent = getIntent();
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("ACTIVITY_PURPOSE", 0)) : null;
        java.lang.String str = this.f109386v;
        com.tencent.mars.xlog.Log.i(str, "[checkIntentState] purpose = " + valueOf);
        if (valueOf == null || valueOf.intValue() != 1) {
            if (valueOf != null && valueOf.intValue() == 2) {
                finish();
                return;
            } else if (valueOf == null || valueOf.intValue() != 3) {
                finish();
                return;
            } else {
                moveTaskToBack(true);
                finish();
                return;
            }
        }
        android.content.Intent intent2 = getIntent();
        java.lang.Integer valueOf2 = intent2 != null ? java.lang.Integer.valueOf(intent2.getIntExtra("LUANCH_KEY", 0)) : null;
        java.util.HashMap hashMap = km2.n.f309147p;
        l81.b1 b1Var = (l81.b1) kotlin.jvm.internal.m0.c(km2.n.f309147p).remove(valueOf2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LUANCH_MINI_PROGRAM] key = ");
        sb6.append(valueOf2);
        sb6.append(",bundle is null:");
        sb6.append(b1Var == null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (b1Var == null) {
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "launchMiniProgram appid:" + b1Var.f317014b + ", path:" + b1Var.f317022f);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this, b1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.getIntExtra("ACTIVITY_PURPOSE", 0) == 1) goto L8;
     */
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enableActivityAnimation() {
        /*
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r2 = "ACTIVITY_PURPOSE"
            int r0 = r0.getIntExtra(r2, r1)
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 == 0) goto L15
            return r1
        L15:
            boolean r0 = super.enableActivityAnimation()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveMiniProProxyUI.enableActivityAnimation():boolean");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i(this.f109386v, "finish");
        super.finish();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.awd;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i(this.f109386v, "onConfigurationChanged orientation:" + java.lang.Integer.valueOf(newConfig.orientation));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onCreate");
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        db5.f.c(this, new com.tencent.mm.plugin.finder.feed.ui.ua(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onDestroy");
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onNewIntent");
        super.onNewIntent(intent);
        d7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onPause");
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onResume");
        super.onResume();
        d7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onStart");
        super.onStart();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i(this.f109386v, "onStop");
        super.onStop();
    }
}
