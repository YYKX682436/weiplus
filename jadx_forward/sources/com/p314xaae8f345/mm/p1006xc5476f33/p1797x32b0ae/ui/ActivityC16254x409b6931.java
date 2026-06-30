package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppIsolateTaskUI */
/* loaded from: classes15.dex */
public class ActivityC16254x409b6931 extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 implements q80.z, nf.m, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public org.json.JSONObject N1;
    public final q80.w P1;
    public q80.x Q1;
    public int M1 = -1;
    public android.content.Intent O1 = null;

    public ActivityC16254x409b6931() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        this.P1 = new aa3.f0();
        this.Q1 = null;
    }

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.Q1 = xVar;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        if (intent.hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            try {
                this.N1 = new org.json.JSONObject(intent.getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
            } catch (java.lang.Exception unused) {
            }
        }
        if (intent.getBooleanExtra("onlySetData", false)) {
            return;
        }
        super.mo28560x10864c08(intent);
    }

    @Override // com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        zk3.c Ai;
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).S6(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void g7(boolean z17) {
        android.content.Intent intent;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "onResume" : "onCreate";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "addWindowFlags from=[%s]", objArr);
        this.M1 = getTaskId();
        android.content.Intent intent2 = getIntent();
        if (z17 && (intent = this.O1) != null) {
            intent2 = intent;
        }
        android.os.Bundle extras = intent2.getExtras();
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "getIntent getExtras is null");
            return;
        }
        android.os.Bundle bundle = extras.getBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "getBundle.extraData is null");
            return;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bundle.getBoolean("showLiteAppOnLockedScreen", false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "canShowLiteAppOnLocked=%s, containsKey=%s", valueOf, java.lang.Boolean.valueOf(bundle.containsKey("showLiteAppOnLockedScreen")));
        if (valueOf.booleanValue()) {
            getWindow().addFlags(6815872);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService) : systemService;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hideKeyboard */
    public void mo28574x3f895349() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.b();
        super.mo28574x3f895349();
    }

    @Override // com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Collections.emptySet());
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).wi(this, hashSet);
        return hashSet;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    public boolean mo28575x387a9983() {
        return com.p314xaae8f345.mm.ui.bk.C();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: keyboardEnable */
    public void mo28576xa5ddbc4a(boolean z17) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.c(z17);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        q80.x xVar = this.Q1;
        if (xVar != null) {
            xVar.mo55562x9d4787cb(i17, i18, intent);
            this.Q1 = null;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        super.mo28578x2635de3e(str, list);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.X.I;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().B(abstractC3700xe41a2874);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckLiteAppVersionError */
    public void mo65530xac5a411a(int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.f1(this));
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        super.mo28579x2d9f160(str, list);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.X.I;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().C(str, abstractC3700xe41a2874);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q80.w wVar = this.P1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c1(this, weakReference);
        aa3.f0 f0Var = (aa3.f0) wVar;
        f0Var.getClass();
        f0Var.f84054b = c1Var;
        ((aa3.f0) wVar).f84053a = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.a(wVar);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        if (!kx5.n.h().l()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 112L, 1L);
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f576155yf);
        } else {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f576156yg);
        }
        super.onCreate(bundle);
        g7(false);
        ox5.a aVar = this.f127565g;
        if (aVar != null) {
            aVar.f431328d.m137283xa83bcec0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.d1(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLiteAppIsolateTaskUI", "onCreate delegate is null");
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this);
        android.view.View decorView = getWindow().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
            if (viewGroup.getChildCount() > 0) {
                android.view.View childAt = viewGroup.getChildAt(0);
                zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this);
                if (Ai != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).R6(childAt, null, false);
                }
            }
        }
        long longExtra = getIntent().getLongExtra("callbackUuid", -1L);
        if (longExtra > 0) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226051u;
            q80.f0 f0Var2 = (q80.f0) hashMap.get(java.lang.Long.valueOf(longExtra));
            if (f0Var2 != null) {
                f0Var2.mo25804x3e5a77bb(this.f127641r, this.A);
                hashMap.remove(java.lang.Long.valueOf(longExtra));
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 0;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.N1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.app.ActivityManager activityManager;
        super.onDestroy();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.d(this.P1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 3;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.N1;
        c5675xda3892c3.e();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        nf.g.b(this);
        if (!isFinishing() || (activityManager = (android.app.ActivityManager) getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)) == null) {
            return;
        }
        for (android.app.ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            if (android.os.Build.VERSION.SDK_INT >= 29 && this.M1 == appTask.getTaskInfo().taskId) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "task.remove isolate task");
                appTask.finishAndRemoveTask();
            }
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppIsolateTaskUI", "onNewIntent=%s", intent.toString());
        this.O1 = intent;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 2;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.N1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        g7(true);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 1;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.N1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        } else {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(this.f127641r, "app.screenshot", (org.json.JSONObject) null);
    }
}
