package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

@db5.a(m123858x6ac9171 = 32)
@pk.b(m158604x6ac9171 = pk.a.ALL)
@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.voip.ui.VideoActivity */
/* loaded from: classes14.dex */
public class ActivityC18916xbd02f08a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f {

    /* renamed from: d, reason: collision with root package name */
    public hq4.a f258464d;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void H5(int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public android.content.Context J4() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void M4(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void Q2(boolean z17) {
    }

    public hq4.a T6() {
        if (this.f258464d == null) {
            if (getIntent().hasExtra("page_info")) {
                ((ao5.s) ((bo5.e) i95.n0.c(bo5.e.class))).getClass();
                this.f258464d = new ao5.w(this);
            } else {
                this.f258464d = ((y03.e) i95.n0.c(y03.e.class)).I4(this);
            }
        }
        return this.f258464d;
    }

    public void U6() {
        super.finish();
    }

    public void V6(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78596x71afbec8(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void W2() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: dealContentView */
    public void mo47898x2105eeb2(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "dealContentView", "(Landroid/view/View;)V", this, array);
        T6().mo8717x2105eeb2(view);
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "dealContentView", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void e4(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        yj0.a.a("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "finish", "()V", this);
        T6().mo8718xb4098c93();
        if (mm.k.H1.h()) {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) getSystemService(android.app.ActivityManager.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.app.ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                android.content.ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
                if (component != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b.equals(component.getPackageName())) {
                    arrayList.add(appTask);
                }
            }
            if (arrayList.size() == 1) {
                android.app.ActivityManager.AppTask appTask2 = (android.app.ActivityManager.AppTask) arrayList.get(0);
                android.content.ComponentName component2 = appTask2.getTaskInfo().baseIntent.getComponent();
                if (component2 != null && component2.getClassName().equals(getClass().getName())) {
                    appTask2.setExcludeFromRecents(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "finish", "()V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return T6().mo8720x663c095b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return T6().mo8721x2ee31f5b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return super.getResources();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void i2(cv.v0 v0Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void k() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: needResetStatusBarColorOnActivityCreate */
    public boolean mo44292x104fd6a5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void o5(long j17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        T6().mo8723x9d4787cb(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (T6().mo8724xbdc3c5dc()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionGranted */
    public void mo53825x600c4ed(java.lang.String str) {
        xq4.a aVar;
        dr4.c0 c0Var;
        android.util.Size size;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h1.a().A;
        synchronized (i1Var.f258186h) {
            i1Var.f258199u.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.RunnableC18910x5de75fa(i1Var));
        }
        dr4.p1 p1Var = ((b13.m) gq4.v.Bi().f258092b).f257908f;
        if (p1Var == null || (aVar = p1Var.f324237c) == null) {
            return;
        }
        aVar.e();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.CAMERA")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPRenderMgr", "camera start failed casue no permisson");
            return;
        }
        dr4.x1 x1Var = p1Var.f324241g;
        if (x1Var == null || (c0Var = x1Var.f324295b) == null) {
            return;
        }
        boolean z17 = aVar.b(p1Var.f324234J, true) == 1;
        p1Var.f324240f = z17;
        if (z17) {
            android.graphics.SurfaceTexture surfaceTexture = c0Var.f324136f;
            if (surfaceTexture != null) {
                ((zq4.b) aVar).f556587n = surfaceTexture;
            }
            zq4.b bVar = (zq4.b) aVar;
            gq4.v.Bi().J(bVar.f556576c);
            xq4.a aVar2 = p1Var.f324237c;
            if (aVar2 == null || bVar.f556579f == null) {
                return;
            }
            aVar2.c();
            p1Var.f324239e = true;
            xq4.a aVar3 = p1Var.f324237c;
            if (aVar3 == null || (size = ((zq4.b) aVar3).f556579f) == null) {
                return;
            }
            p1Var.p(size);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_pad_mode_landscape_forbily_enable, false)) {
            try {
                if (android.provider.Settings.Global.getInt(getContentResolver(), "dynamic_device_characteristics") == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation LANDSCAPE");
                    setRequestedOrientation(0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation PORTRAIT");
                    setRequestedOrientation(1);
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("pad_mode_landscape_forbily", "setRequestedOrientation FAILED");
            }
        }
        T6().mo8725x50e1c15d(configuration);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_pad_mode_landscape_forbily_enable, false)) {
            try {
                if (android.provider.Settings.Global.getInt(getContentResolver(), "dynamic_device_characteristics") == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation LANDSCAPE");
                    setRequestedOrientation(0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pad_mode_landscape_forbily", "setRequestedOrientation PORTRAIT");
                    setRequestedOrientation(1);
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("pad_mode_landscape_forbily", "setRequestedOrientation FAILED");
            }
        } else {
            setRequestedOrientation(1);
        }
        if (gq4.v.wi().f447516q == 0) {
            gq4.v.wi().f447516q = java.lang.System.currentTimeMillis();
        }
        m78598x47a8a819(true);
        T6().mo8726x3e5a77bb(bundle);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.VideoActivity)).Rj(this, iy1.a.Voip);
        m78735x28280f95().m81445xc09d199f(false);
        m78735x28280f95().m81447x71eb6f8a(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.p0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        T6().mo8727xac79a11b();
        if (com.p314xaae8f345.mm.ui.fj.b(this)) {
            com.p314xaae8f345.mm.ui.fj.d(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a.class, 0);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = T6().mo8728x1f03f0c2(i17, keyEvent) || super.onKeyDown(i17, keyEvent);
        yj0.a.i(z17, this, "com/tencent/mm/plugin/voip/ui/VideoActivity", "com/tencent/mm/plugin/voip/ui/VideoActivity", "onKeyDown", "(ILandroid/view/KeyEvent;)Z");
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        T6().mo8729xc944513d(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        T6().mo8730xb01dfb57();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        T6().mo8731x2517b42c();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        T6().mo8732x953457f1(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        T6().mo8733x57429eec();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        T6().mo8734xb05099c3();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        T6().mo8735xc39f8281();
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        super.mo48654xe4dc1f55();
        T6().mo8736xe4dc1f55();
        T6().mo8735xc39f8281();
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        super.onTrimMemory(i17);
        T6().mo8737x29685b02(i17);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        if (T6().mo8738xb1e9ab4()) {
            return;
        }
        super.onUserLeaveHint();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo44294xa334195d() {
        return T6().mo8739xa334195d();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_pad_mode_landscape_forbily_enable, false)) {
            if (android.os.Build.VERSION.SDK_INT != 26) {
                super.setRequestedOrientation(i17);
                return;
            }
            try {
                super.setRequestedOrientation(i17);
                return;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Voip.VideoActivity", "setRequestedOrientation() couldn't be called successfully");
                return;
            }
        }
        try {
            if (android.provider.Settings.Global.getInt(getContentResolver(), "dynamic_device_characteristics") == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pad_mode_landscape_forbily", "super.setRequestedOrientation LANDSCAPE");
                super.setRequestedOrientation(0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("pad_mode_landscape_forbily", "super.setRequestedOrientation PORTRAIT");
                super.setRequestedOrientation(1);
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("pad_mode_landscape_forbily", "super.setRequestedOrientation FAILED");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setScreenEnable */
    public void mo65198x1aec5e91(boolean z17) {
        super.mo65198x1aec5e91(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        T6().mo8722xa59964ef(hashSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void u() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void v1() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void y(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void z(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f
    public void z1(int i17, int i18) {
    }
}
