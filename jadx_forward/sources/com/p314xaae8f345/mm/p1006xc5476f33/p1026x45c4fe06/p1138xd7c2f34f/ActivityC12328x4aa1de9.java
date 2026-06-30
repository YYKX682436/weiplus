package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@db5.a(m123858x6ac9171 = 7)
@gm0.a2
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI */
/* loaded from: classes7.dex */
public final class ActivityC12328x4aa1de9 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17354xafef217a implements vj5.k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f165881r = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y f165882h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f165883i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f165884m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f165885n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b0(this);

    /* renamed from: o, reason: collision with root package name */
    public int f165886o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.da f165887p = null;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f165888q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.C12749xedaeef0a>(this) { // from class: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.2
        {
            this.f39173x3fe91575 = -1339599398;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.C12749xedaeef0a c12749xedaeef0a) {
            if (c12749xedaeef0a == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchProxyUI", "[weishi] video play, close launch proxy ui");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.this.finish();
            return false;
        }
    };

    public static boolean e7(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98, com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).b(context, str, str2, str3, i17, i18, c12559xbdae8559, c11812xa040dc98, c11105x57aff1b9);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16712xf1541050
    /* renamed from: b7 */
    public boolean getF233589g() {
        return false;
    }

    public final void c7(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        objArr[2] = java.lang.Boolean.valueOf(isDestroyed() || isFinishing());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchProxyUI", "onLifecycle:%s, instance:%d, finishing:%b", objArr);
    }

    public void d7() {
        c7("revealProgressLayoutImmediately");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y yVar = this.f165882h;
        if (yVar == null || !yVar.b() || isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f165884m;
        java.lang.Runnable runnable = this.f165885n;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50293x3498a0(runnable);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (isFinishing() || isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandLaunchProxyUI", "AppBrandLaunchProxyUI finish() already finishing");
        } else {
            c7("finish");
            super.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityCloseAnimation */
    public void mo50392x5138328b() {
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityOpenAnimation */
    public void mo51655xf502a5b(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF147381t() {
        return false;
    }

    @Override // vj5.k
    public void n6(int i17) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        this.f165886o = i17;
        android.view.View view = this.f165883i;
        if (view == null || !(view.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) this.f165883i.getLayoutParams()).topMargin = i17;
        this.f165883i.requestLayout();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.ui.da daVar = this.f165887p;
        if (daVar != null) {
            daVar.mo9729x757c998b(i17, i18, intent);
        }
        this.f165887p = null;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        c7("onCreate-start");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "extra_launch_use_default_color_as_background", false)) {
            android.view.View decorView = getWindow().getDecorView();
            int m9702x7444d5ad = b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf);
            decorView.setBackgroundColor(m9702x7444d5ad);
            boolean z17 = android.graphics.Color.red(m9702x7444d5ad) > 200 && android.graphics.Color.blue(m9702x7444d5ad) > 200 && android.graphics.Color.green(m9702x7444d5ad) > 200;
            com.p314xaae8f345.mm.ui.bk.j0(this);
            com.p314xaae8f345.mm.ui.bk.i0(getWindow(), z17);
            getWindow().setNavigationBarColor(m9702x7444d5ad);
            com.p314xaae8f345.mm.ui.bk.h0(getWindow(), z17);
            getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(m9702x7444d5ad));
        } else {
            try {
                if (getIntent().hasExtra("extra_from_activity_status_bar_color")) {
                    getWindow().setStatusBarColor(getIntent().getIntExtra("extra_from_activity_status_bar_color", 0));
                }
                if (getIntent().hasExtra("extra_from_activity_navigation_bar_color")) {
                    getWindow().setNavigationBarColor(getIntent().getIntExtra("extra_from_activity_navigation_bar_color", 0));
                }
                com.p314xaae8f345.mm.ui.bk.j0(this);
                getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            } catch (java.lang.Exception unused) {
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "extra_add_wmpf_voip_window_flags", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(6815744);
            }
        }
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        this.f165882h = !getIntent().getBooleanExtra("extra_from_mm", true) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.r(this, false) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.w(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchProxyUI", "onCreate, instance:%d, uiDelegate %s", java.lang.Integer.valueOf(hashCode()), this.f165882h.getClass().getCanonicalName());
        this.f165882h.a(getIntent(), bundle);
        if (!isFinishing() && this.f165882h.b()) {
            this.f165884m.mo50297x7c4d7ca2(this.f165885n, 500L);
        }
        this.f165888q.mo48813x58998cd();
        c7("onCreate-end");
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandUI)).Rj(this, iy1.a.MiniProgram);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c7("onDestroy");
        this.f165884m.mo50302x6b17ad39(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y yVar = this.f165882h;
        if (yVar != null) {
            yVar.mo51791xac79a11b();
            if (this.f165882h.b()) {
                try {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(android.R.id.content);
                    viewGroup.setVisibility(4);
                    viewGroup.removeAllViews();
                } catch (java.lang.NullPointerException unused) {
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f165888q;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        android.content.ServiceConnection serviceConnection = xg1.c.f535890h;
        if (serviceConnection != null) {
            try {
                unbindService(serviceConnection);
                xg1.c.f535890h = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchProxyUI", "onDestroy: unbindService");
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        c7("onPause");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y yVar = this.f165882h;
        if (yVar != null) {
            yVar.mo51788xb01dfb57();
        } else {
            super.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c7("onResume");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y yVar = this.f165882h;
        if (yVar != null) {
            yVar.mo51789x57429eec();
        } else {
            super.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        c7("onStart");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        c7("onStop");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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
