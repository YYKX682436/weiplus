package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(39)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveCountDownUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveCountDownUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f109353v = 0;

    public FinderLiveCountDownUI() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            intent.getIntExtra("LANDSCAPE_TYPE", 0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109449v() {
        return "Finder.FinderLiveCountDownUI";
    }

    public final int d7() {
        android.content.Intent intent = getIntent();
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("LANDSCAPE_TYPE", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        return (valueOf != null && valueOf.intValue() == 2) ? 8 : -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return d7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.apn;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.live.viewmodel.b4.class);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCountDownUI", "onConfigurationChanged: orientation = " + newConfig.orientation);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(d7());
        ((com.tencent.mm.plugin.finder.live.viewmodel.b4) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.b4.class)).f116920d = new com.tencent.mm.plugin.finder.feed.ui.n8(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        b7(true);
        setTheme(com.tencent.mm.R.style.f494369l8);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.live.viewmodel.b4 b4Var = (com.tencent.mm.plugin.finder.live.viewmodel.b4) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.b4.class);
        b4Var.f116925i.d();
        b4Var.f116924h = 3;
        az2.f fVar = b4Var.f116923g;
        if (fVar != null) {
            fVar.b();
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.b4) zVar.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.b4.class)).f116920d = null;
    }
}
