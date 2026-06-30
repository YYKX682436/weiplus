package com.tencent.mm.plugin.appbrand.ui.recommend;

@db5.a(19)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendVideoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AppBrandRecommendVideoUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.CommonVideoView f90179d;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = this.f90179d;
        if (commonVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        if (commonVideoView.isPlaying()) {
            com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView2 = this.f90179d;
            if (commonVideoView2 == null) {
                kotlin.jvm.internal.o.o("videoView");
                throw null;
            }
            commonVideoView2.pause();
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488084gs;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        getWindow().setFlags(1024, 1024);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483208zt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f90179d = (com.tencent.mm.pluginsdk.ui.CommonVideoView) findViewById;
        java.lang.String stringExtra = getIntent().getStringExtra("1");
        kotlin.jvm.internal.o.d(stringExtra);
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = this.f90179d;
        if (commonVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        commonVideoView.h(true, stringExtra, 1000);
        com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView2 = this.f90179d;
        if (commonVideoView2 != null) {
            commonVideoView2.start();
        } else {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
