package com.tencent.mm.plugin.brandservice.ui.timeline.video.lite;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class VideoLiteUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f94524d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView f94525e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar f94526f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f94527g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d3k;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar videoLiteControBar = this.f94526f;
        if (videoLiteControBar != null) {
            int i17 = newConfig.orientation;
            if (i17 == 1) {
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) videoLiteControBar.F.getLayoutParams();
                layoutParams.addRule(2, com.tencent.mm.R.id.f487545oy5);
                layoutParams.removeRule(8);
                layoutParams.removeRule(1);
                layoutParams.setMargins(i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479704cz), 0, i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479704cz), 0);
                videoLiteControBar.F.setLayoutParams(layoutParams);
                ((android.widget.RelativeLayout.LayoutParams) videoLiteControBar.D.getLayoutParams()).setMargins(i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479704cz), i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479704cz), 0, 0);
                ((android.widget.RelativeLayout.LayoutParams) videoLiteControBar.E.getLayoutParams()).setMargins(0, 0, 0, i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479688cn));
                return;
            }
            if (i17 == 2) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) videoLiteControBar.F.getLayoutParams();
                layoutParams2.removeRule(2);
                layoutParams2.addRule(8, com.tencent.mm.R.id.f487545oy5);
                layoutParams2.addRule(1, com.tencent.mm.R.id.f487545oy5);
                layoutParams2.setMargins(i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479727dj), 0, i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479704cz), 0);
                videoLiteControBar.F.setLayoutParams(layoutParams2);
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) videoLiteControBar.D.getLayoutParams();
                int f17 = i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479704cz);
                layoutParams3.setMargins(f17, i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479688cn), 0, i65.a.b(videoLiteControBar.getContext(), -5));
                ((android.widget.RelativeLayout.LayoutParams) videoLiteControBar.E.getLayoutParams()).setMargins(f17, 0, 0, i65.a.f(videoLiteControBar.getContext(), com.tencent.mm.R.dimen.f479718db));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f5107a = true;
        getWindow().setNavigationBarColor(-16777216);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.CTRL_INDEX);
        this.f94524d = getIntent().getStringExtra("rawUrl");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.bdx);
        this.f94527g = imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper appBrandVideoWrapper = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper(this, null);
        appBrandVideoWrapper.setMyVideoViewFactory(gf1.f.f271249d);
        this.f94525e = new com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView(this, appBrandVideoWrapper);
        com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar videoLiteControBar = new com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar(this);
        this.f94526f = videoLiteControBar;
        videoLiteControBar.setBtnCloseListener(new ns1.d(this));
        com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar videoLiteControBar2 = this.f94526f;
        kotlin.jvm.internal.o.d(videoLiteControBar2);
        videoLiteControBar2.setOnPlayStatusChangeListener(new ns1.e(this));
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f94525e;
        if (appBrandVideoView != null) {
            appBrandVideoView.k(this.f94526f);
        }
        appBrandVideoWrapper.setVideoFooterView(this.f94526f);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cgj);
        if (frameLayout != null) {
            frameLayout.addView(this.f94525e, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        android.widget.ImageView imageView2 = this.f94527g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ns1.f(this));
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView2 = this.f94525e;
        if (appBrandVideoView2 != null) {
            appBrandVideoView2.setAutoPlay(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView3 = this.f94525e;
        if (appBrandVideoView3 != null) {
            appBrandVideoView3.setLoop(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView4 = this.f94525e;
        if (appBrandVideoView4 != null) {
            appBrandVideoView4.setMute(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView5 = this.f94525e;
        if (appBrandVideoView5 != null) {
            appBrandVideoView5.setCookieData(null);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView6 = this.f94525e;
        if (appBrandVideoView6 != null) {
            appBrandVideoView6.setObjectFit("contain");
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView7 = this.f94525e;
        if (appBrandVideoView7 != null) {
            appBrandVideoView7.setShowDanmakuBtn(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView8 = this.f94525e;
        if (appBrandVideoView8 != null) {
            appBrandVideoView8.setShowMuteBtn(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView9 = this.f94525e;
        if (appBrandVideoView9 != null) {
            appBrandVideoView9.setShowPlayBtn(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView10 = this.f94525e;
        if (appBrandVideoView10 != null) {
            appBrandVideoView10.setShowProgress(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView11 = this.f94525e;
        if (appBrandVideoView11 != null) {
            appBrandVideoView11.setShowFullScreenBtn(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView12 = this.f94525e;
        if (appBrandVideoView12 != null) {
            appBrandVideoView12.setIsShowBasicControls(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView13 = this.f94525e;
        if (appBrandVideoView13 != null) {
            appBrandVideoView13.setIsEnableBottomProgressBar(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView14 = this.f94525e;
        if (appBrandVideoView14 != null) {
            appBrandVideoView14.setShowCenterPlayBtn(false);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView15 = this.f94525e;
        if (appBrandVideoView15 != null) {
            appBrandVideoView15.setShowControlProgress(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView16 = this.f94525e;
        if (appBrandVideoView16 != null) {
            appBrandVideoView16.setPageGesture(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView17 = this.f94525e;
        if (appBrandVideoView17 != null) {
            appBrandVideoView17.g(true);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView18 = this.f94525e;
        if (appBrandVideoView18 != null) {
            appBrandVideoView18.w(this.f94524d, false, 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f94525e;
        if (appBrandVideoView != null) {
            appBrandVideoView.o("onUIDestroy", new java.lang.Object[0]);
            appBrandVideoView.f();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f94525e;
        if (appBrandVideoView != null) {
            appBrandVideoView.f83529f.e();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = this.f94525e;
        if (appBrandVideoView != null) {
            appBrandVideoView.r();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.CTRL_INDEX);
    }
}
