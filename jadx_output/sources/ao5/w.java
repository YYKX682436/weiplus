package ao5;

/* loaded from: classes11.dex */
public final class w implements hq4.a, pi0.o0, pi0.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.ui.VideoActivity f12582d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f12583e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f12584f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterViewEngine f12585g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterPageStyle f12586h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.flutter.ui.FlutterPageInfo f12587i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12588m;

    public w(com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity) {
        kotlin.jvm.internal.o.g(videoActivity, "videoActivity");
        this.f12582d = videoActivity;
        this.f12583e = "MicroMsg.ILinkVoipVideoActivityProxy-" + hashCode();
        this.f12584f = jz5.h.b(new ao5.u(this));
    }

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageInfo F5() {
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f12587i;
        kotlin.jvm.internal.o.d(flutterPageInfo);
        return flutterPageInfo;
    }

    @Override // pi0.o0
    public bj0.t P1() {
        return null;
    }

    @Override // pi0.o0
    public android.view.ViewGroup S2() {
        return (android.widget.FrameLayout) ((jz5.n) this.f12584f).getValue();
    }

    @Override // pi0.o0
    public com.tencent.mm.flutter.ui.FlutterPageStyle S3() {
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f12586h;
        kotlin.jvm.internal.o.d(flutterPageStyle);
        return flutterPageStyle;
    }

    @Override // pi0.o0
    public void S5(boolean z17) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f12582d.getSwipeBackLayout();
        if (swipeBackLayout != null) {
            swipeBackLayout.setEnableGesture(z17);
        }
    }

    @Override // hq4.a
    public void dealContentView(android.view.View view) {
        this.f12582d.setContentView(view);
    }

    @Override // hq4.a
    public void finish() {
        com.tencent.mars.xlog.Log.i(this.f12583e, "finish: ");
        com.tencent.mm.plugin.voip.ui.VideoActivity context = this.f12582d;
        context.U6();
        context.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477953g5);
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f12585g;
        if (flutterViewEngine != null) {
            flutterViewEngine.b();
        }
        if (this.f12588m) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_NEED_ANIM", true);
            i0Var.Yj(context, intent);
        }
    }

    @Override // pi0.o0
    public androidx.appcompat.app.AppCompatActivity getActivity() {
        return this.f12582d;
    }

    @Override // hq4.a
    public int getForceOrientation() {
        return 1;
    }

    @Override // hq4.a
    public int getLayoutId() {
        return -1;
    }

    @Override // hq4.a
    public void importUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
    }

    @Override // hq4.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f12585g;
        if (flutterViewEngine == null || flutterViewEngine.f68135m == null || flutterViewEngine.f68137o == null) {
            return;
        }
        flutterViewEngine.f68133h.getActivityControlSurface().onActivityResult(i17, i18, intent);
    }

    @Override // hq4.a
    public boolean onBackPressed() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f12585g;
        if (flutterViewEngine == null) {
            return true;
        }
        flutterViewEngine.f68133h.getNavigationChannel().popRoute();
        return true;
    }

    @Override // hq4.a
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        ((jp5.o) i95.n0.c(jp5.o.class)).ug(configuration);
    }

    @Override // hq4.a
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.view.WindowInsetsController insetsController;
        com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity = this.f12582d;
        videoActivity.overridePendingTransition(com.tencent.mm.R.anim.f477952g4, com.tencent.mm.R.anim.f477728p);
        this.f12587i = (com.tencent.mm.flutter.ui.FlutterPageInfo) videoActivity.getIntent().getParcelableExtra("page_info");
        this.f12586h = (com.tencent.mm.flutter.ui.FlutterPageStyle) videoActivity.getIntent().getParcelableExtra("page_style");
        this.f12588m = videoActivity.getIntent().getBooleanExtra("EXTRA_VOIP_FROM_FINDER", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate ");
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f12587i;
        sb6.append(flutterPageInfo != null ? flutterPageInfo.f68113d : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f12583e;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        io.flutter.embedding.engine.FlutterEngineCache flutterEngineCache = io.flutter.embedding.engine.FlutterEngineCache.getInstance();
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo2 = this.f12587i;
        if (flutterPageInfo2 == null || (str = flutterPageInfo2.f68113d) == null) {
            str = "";
        }
        if (flutterEngineCache.get(str) == null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("launch with cached engine id ");
            com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo3 = this.f12587i;
            sb8.append(flutterPageInfo3 != null ? flutterPageInfo3.f68113d : null);
            sb8.append(", but it has been destroyed");
            com.tencent.mars.xlog.Log.e(str2, sb8.toString());
            videoActivity.V6(bundle);
            finish();
            return;
        }
        videoActivity.setTheme(com.tencent.mm.R.style.f494370l9);
        videoActivity.supportRequestWindowFeature(1);
        videoActivity.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        videoActivity.V6(bundle);
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = new com.tencent.mm.flutter.ui.FlutterViewEngine(this);
        this.f12585g = flutterViewEngine;
        flutterViewEngine.f();
        videoActivity.getWindow().getDecorView().setSystemUiVisibility(1280);
        videoActivity.getWindow().setStatusBarColor(0);
        videoActivity.getWindow().addFlags(Integer.MIN_VALUE);
        videoActivity.getWindow().setNavigationBarColor(0);
        androidx.appcompat.app.b supportActionBar = videoActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && (insetsController = videoActivity.getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsBehavior(2);
        }
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = this.f12586h;
        if ((flutterPageStyle != null ? flutterPageStyle.f68123m : null) != null) {
            java.lang.Integer num = flutterPageStyle != null ? flutterPageStyle.f68123m : null;
            kotlin.jvm.internal.o.d(num);
            int intValue = num.intValue();
            if (fp.h.c(21)) {
                videoActivity.getWindow().setNavigationBarColor(intValue);
            }
        }
    }

    @Override // hq4.a
    public void onDestroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy: ");
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = this.f12587i;
        sb6.append(flutterPageInfo != null ? flutterPageInfo.f68113d : null);
        com.tencent.mars.xlog.Log.i(this.f12583e, sb6.toString());
        this.f12585g = null;
    }

    @Override // hq4.a
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // hq4.a
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo;
        com.tencent.mars.xlog.Log.i(this.f12583e, "onNewIntent: " + intent);
        if (intent == null || (flutterPageInfo = (com.tencent.mm.flutter.ui.FlutterPageInfo) intent.getParcelableExtra("page_info")) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f12583e, "pageInfo: " + flutterPageInfo + "， " + flutterPageInfo.f68113d);
        java.lang.String str = flutterPageInfo.f68113d;
        com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo2 = this.f12587i;
        if (kotlin.jvm.internal.o.b(str, flutterPageInfo2 != null ? flutterPageInfo2.f68113d : null)) {
            return;
        }
        finish();
        ((ku5.t0) ku5.t0.f312615d).B(new ao5.v(this, intent));
    }

    @Override // hq4.a
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f12583e, "onPause: ");
    }

    @Override // hq4.a
    public void onPostResume() {
    }

    @Override // hq4.a
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f12585g;
        if (flutterViewEngine == null || flutterViewEngine.f68135m == null || flutterViewEngine.f68137o == null) {
            return;
        }
        flutterViewEngine.f68133h.getActivityControlSurface().onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // hq4.a
    public void onResume() {
        java.lang.String str = this.f12583e;
        com.tencent.mars.xlog.Log.i(str, "onResume: ");
        boolean ie6 = ((jp5.o) i95.n0.c(jp5.o.class)).ie();
        if (!ie6 || this.f12585g != null) {
            com.tencent.mars.xlog.Log.i(str, "onResume, flutterViewEngine is not null or isInVoip " + ie6);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "onResume, reattach FlutterViewEngine");
        jz5.g gVar = this.f12584f;
        ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).removeAllViews();
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = new com.tencent.mm.flutter.ui.FlutterViewEngine(this);
        this.f12585g = flutterViewEngine;
        flutterViewEngine.f();
        ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).requestApplyInsets();
    }

    @Override // hq4.a
    public void onStart() {
        com.tencent.mars.xlog.Log.i(this.f12583e, "onStart: ");
    }

    @Override // hq4.a
    public void onStop() {
        com.tencent.mars.xlog.Log.i(this.f12583e, "onStop: ");
    }

    @Override // hq4.a
    public void onSwipeBackFinish() {
    }

    @Override // hq4.a
    public void onTrimMemory(int i17) {
    }

    @Override // hq4.a
    public boolean onUserLeaveHint() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f12585g;
        if (flutterViewEngine == null) {
            return false;
        }
        flutterViewEngine.h();
        return false;
    }

    @Override // pi0.o0
    public void pop() {
        this.f12582d.finish();
    }

    @Override // hq4.a
    public android.view.View provideCustomActivityContentView() {
        return (android.widget.FrameLayout) ((jz5.n) this.f12584f).getValue();
    }

    @Override // pi0.w0
    public void u3(pi0.w0 host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f12585g;
        if (flutterViewEngine != null) {
            flutterViewEngine.onDestroy();
        }
        this.f12585g = null;
    }

    @Override // pi0.o0
    public androidx.lifecycle.o y6() {
        androidx.lifecycle.o mo133getLifecycle = this.f12582d.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
        return mo133getLifecycle;
    }
}
