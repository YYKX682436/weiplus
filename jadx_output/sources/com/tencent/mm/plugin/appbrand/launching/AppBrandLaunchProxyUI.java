package com.tencent.mm.plugin.appbrand.launching;

@db5.a(7)
@gm0.a2
/* loaded from: classes7.dex */
public final class AppBrandLaunchProxyUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity implements vj5.k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f84348r = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.precondition.y f84349h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f84350i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f84351m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f84352n = new com.tencent.mm.plugin.appbrand.launching.b0(this);

    /* renamed from: o, reason: collision with root package name */
    public int f84353o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.da f84354p = null;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f84355q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.weishi.AppBrandWeishiUIReadyEvent>(this) { // from class: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.2
        {
            this.__eventId = -1339599398;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.plugin.appbrand.weishi.AppBrandWeishiUIReadyEvent appBrandWeishiUIReadyEvent) {
            if (appBrandWeishiUIReadyEvent == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchProxyUI", "[weishi] video play, close launch proxy ui");
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.this.finish();
            return false;
        }
    };

    public static boolean e7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer, com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        return ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).b(context, str, str2, str3, i17, i18, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional);
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity
    /* renamed from: b7 */
    public boolean getF152056g() {
        return false;
    }

    public final void c7(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        objArr[2] = java.lang.Boolean.valueOf(isDestroyed() || isFinishing());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchProxyUI", "onLifecycle:%s, instance:%d, finishing:%b", objArr);
    }

    public void d7() {
        c7("revealProgressLayoutImmediately");
        com.tencent.mm.plugin.appbrand.launching.precondition.y yVar = this.f84349h;
        if (yVar == null || !yVar.b() || isFinishing()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f84351m;
        java.lang.Runnable runnable = this.f84352n;
        n3Var.removeCallbacks(runnable);
        n3Var.post(runnable);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (isFinishing() || isDestroyed()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLaunchProxyUI", "AppBrandLaunchProxyUI finish() already finishing");
        } else {
            c7("finish");
            super.finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityOpenAnimation(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        return false;
    }

    @Override // vj5.k
    public void n6(int i17) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        this.f84353o = i17;
        android.view.View view = this.f84350i;
        if (view == null || !(view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) this.f84350i.getLayoutParams()).topMargin = i17;
        this.f84350i.requestLayout();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.ui.da daVar = this.f84354p;
        if (daVar != null) {
            daVar.mmOnActivityResult(i17, i18, intent);
        }
        this.f84354p = null;
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        c7("onCreate-start");
        if (com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "extra_launch_use_default_color_as_background", false)) {
            android.view.View decorView = getWindow().getDecorView();
            int color = b3.l.getColor(this, com.tencent.mm.R.color.f478869jf);
            decorView.setBackgroundColor(color);
            boolean z17 = android.graphics.Color.red(color) > 200 && android.graphics.Color.blue(color) > 200 && android.graphics.Color.green(color) > 200;
            com.tencent.mm.ui.bk.j0(this);
            com.tencent.mm.ui.bk.i0(getWindow(), z17);
            getWindow().setNavigationBarColor(color);
            com.tencent.mm.ui.bk.h0(getWindow(), z17);
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(color));
        } else {
            try {
                if (getIntent().hasExtra("extra_from_activity_status_bar_color")) {
                    getWindow().setStatusBarColor(getIntent().getIntExtra("extra_from_activity_status_bar_color", 0));
                }
                if (getIntent().hasExtra("extra_from_activity_navigation_bar_color")) {
                    getWindow().setNavigationBarColor(getIntent().getIntExtra("extra_from_activity_navigation_bar_color", 0));
                }
                com.tencent.mm.ui.bk.j0(this);
                getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            } catch (java.lang.Exception unused) {
            }
        }
        if (com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "extra_add_wmpf_voip_window_flags", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(6815744);
            }
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        this.f84349h = !getIntent().getBooleanExtra("extra_from_mm", true) ? new com.tencent.mm.plugin.appbrand.launching.precondition.r(this, false) : new com.tencent.mm.plugin.appbrand.launching.precondition.w(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchProxyUI", "onCreate, instance:%d, uiDelegate %s", java.lang.Integer.valueOf(hashCode()), this.f84349h.getClass().getCanonicalName());
        this.f84349h.a(getIntent(), bundle);
        if (!isFinishing() && this.f84349h.b()) {
            this.f84351m.postDelayed(this.f84352n, 500L);
        }
        this.f84355q.alive();
        c7("onCreate-end");
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandUI)).Rj(this, iy1.a.MiniProgram);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c7("onDestroy");
        this.f84351m.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.appbrand.launching.precondition.y yVar = this.f84349h;
        if (yVar != null) {
            yVar.onDestroy();
            if (this.f84349h.b()) {
                try {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(android.R.id.content);
                    viewGroup.setVisibility(4);
                    viewGroup.removeAllViews();
                } catch (java.lang.NullPointerException unused) {
                }
            }
        }
        com.tencent.mm.sdk.event.IListener iListener = this.f84355q;
        if (iListener != null) {
            iListener.dead();
        }
        android.content.ServiceConnection serviceConnection = xg1.c.f454357h;
        if (serviceConnection != null) {
            try {
                unbindService(serviceConnection);
                xg1.c.f454357h = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLaunchProxyUI", "onDestroy: unbindService");
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c7("onPause");
        com.tencent.mm.plugin.appbrand.launching.precondition.y yVar = this.f84349h;
        if (yVar != null) {
            yVar.onPause();
        } else {
            super.finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c7("onResume");
        com.tencent.mm.plugin.appbrand.launching.precondition.y yVar = this.f84349h;
        if (yVar != null) {
            yVar.onResume();
        } else {
            super.finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        c7("onStart");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        c7("onStop");
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (intent != null) {
            try {
                intent.putExtra("key_appbrand_source_android_task_id", getTaskId());
            } catch (java.lang.Exception unused) {
            }
        }
        super.startActivityForResult(intent, i17, bundle);
    }
}
