package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI */
/* loaded from: classes15.dex */
public class ActivityC16256xf01eee95 extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 implements q80.z, nf.m, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public static final /* synthetic */ int S1 = 0;
    public org.json.JSONObject M1;
    public final q80.w N1;
    public pa3.p O1;
    public pa3.i P1;
    public x93.b Q1;
    public q80.x R1;

    public ActivityC16256xf01eee95() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        this.N1 = new aa3.f0();
        this.O1 = null;
        this.P1 = null;
        this.Q1 = null;
        this.R1 = null;
    }

    public static /* synthetic */ void g7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95, boolean z17) {
        if (activityC16256xf01eee95.h7().booleanValue()) {
            return;
        }
        super.mo28577xc55eddf8(z17);
    }

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.R1 = xVar;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        if (intent.hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            try {
                this.M1 = new org.json.JSONObject(intent.getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
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
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).S6(keyEvent) && this.O1 == null && this.P1 == null) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
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

    public final java.lang.Boolean h7() {
        if ((this.O1 != null || this.P1 != null) && this.K && !this.W) {
            com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f = this.f127566h.f14371xe26567ad;
            java.util.Objects.toString(enumC3698xfb48f2f);
            com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f2 = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.STAR;
            if (enumC3698xfb48f2f != enumC3698xfb48f2f2 && enumC3698xfb48f2f != com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.FLOAT) {
                return java.lang.Boolean.FALSE;
            }
            pa3.p pVar = this.O1;
            boolean z17 = false;
            if (pVar != null && enumC3698xfb48f2f == enumC3698xfb48f2f2 && !pVar.U(2, false)) {
                z17 = true;
            }
            pa3.i iVar = this.P1;
            if (iVar != null && enumC3698xfb48f2f == com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.FLOAT && !iVar.m0(2)) {
                z17 = true;
            }
            return java.lang.Boolean.valueOf(!z17);
        }
        return java.lang.Boolean.FALSE;
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

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: navigateBack */
    public void mo28577xc55eddf8(final boolean z17) {
        runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.g7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.this, z17);
            }
        });
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        q80.x xVar = this.R1;
        if (xVar != null) {
            xVar.mo55562x9d4787cb(i17, i18, intent);
            this.R1 = null;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (h7().booleanValue()) {
            return;
        }
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
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.w1(this));
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
        java.lang.String str;
        android.app.Activity mo2157x19263085;
        android.app.Activity mo2157x192630852;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225683b.get()) {
            kd.c.b("MicroMsg.WxaLiteAppLiteUI", "LiteAppProcessProfileInit has no init.", new java.lang.Object[0]);
            this.f127571p = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q80.w wVar = this.N1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.t1 t1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.t1(this, weakReference);
        aa3.f0 f0Var = (aa3.f0) wVar;
        f0Var.getClass();
        f0Var.f84054b = t1Var;
        f0Var.f84053a = true;
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
        if (this.f127565g == null) {
            return;
        }
        pa3.s sVar = (pa3.s) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226052v.get(java.lang.Long.valueOf(this.f127641r));
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.j(this, this.f127647x, this.f127641r, this.f127653z, this.f127650y, sVar);
            pa3.p pVar = this.O1;
            if (pVar != null && (str = pVar.H) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppMultiTaskHelper", "coverBitmapToAvoidWhiteScreen coverBitmapPath: ".concat(str));
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                android.graphics.Bitmap a17 = al3.b.f87382a.a(str, null);
                h0Var.f391656d = a17;
                if (a17 != null) {
                    ak3.c cVar = pVar.f381644d;
                    android.widget.ImageView imageView = new android.widget.ImageView(cVar != null ? cVar.mo2157x19263085() : null);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    imageView.setLayoutParams(layoutParams);
                    imageView.setVisibility(0);
                    imageView.setImageBitmap((android.graphics.Bitmap) h0Var.f391656d);
                    android.widget.FrameLayout frameLayout = (cVar == null || (mo2157x192630852 = cVar.mo2157x19263085()) == null) ? null : new android.widget.FrameLayout(mo2157x192630852);
                    if (frameLayout != null) {
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.addView(imageView);
                        if (cVar != null && (mo2157x19263085 = cVar.mo2157x19263085()) != null) {
                            mo2157x19263085.addContentView(frameLayout, layoutParams);
                        }
                        pm0.v.V(200L, new pa3.m(imageView, h0Var));
                    }
                }
            }
        }
        this.f127565g.f431328d.m137283xa83bcec0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.u1(this));
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
        if (u46.l.c(this.f127647x, "wxalite2fd372f050eecd471a4392786dfae78c")) {
            ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FTSSOSHomeWebViewUI)).Rj(this, iy1.a.SearchHome);
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
        riVar.f89351b = this.M1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.os.Bundle bundleExtra = getIntent().getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        if (bundleExtra != null && bundleExtra.containsKey("key_multi_task_common_info")) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Vi(0, "MultiTaskForSnapshotMinusScreen", 1048576, "");
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.d(this.N1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 3;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.M1;
        c5675xda3892c3.e();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        nf.g.b(this);
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.getClass();
        }
        pa3.i iVar = this.P1;
        if (iVar != null) {
            iVar.o0();
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        kd.c.c("MicroMsg.WxaLiteAppLiteUI", "onPause: unregistered screenshot share provider", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 2;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.M1;
        c5675xda3892c3.e();
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.A();
        }
        pa3.i iVar = this.P1;
        if (iVar != null) {
            iVar.z();
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3716xde9d47f8, com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.Q1 == null) {
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            this.Q1 = new x93.b(new yz5.a() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI$$a
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95.S1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95) weakReference.get();
                    return java.lang.Long.valueOf((activityC16256xf01eee95 == null || (pageInfo = activityC16256xf01eee95.f127569n) == null) ? -1L : pageInfo.f37290xc4a6040a);
                }
            });
        }
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(this.Q1);
        kd.c.c("MicroMsg.WxaLiteAppLiteUI", "onResume: registered screenshot share provider, appUuid=%d, appId=%s", java.lang.Long.valueOf(this.f127641r), this.f127647x);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 1;
        riVar.f89352c = this.f127647x;
        riVar.f89353d = java.lang.Long.valueOf(this.f127641r);
        riVar.f89354e = this.A;
        riVar.f89351b = this.M1;
        c5675xda3892c3.e();
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.z();
        }
        pa3.i iVar = this.P1;
        if (iVar != null) {
            iVar.x();
        }
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

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: setIsPopGestureEnabled */
    public void mo28588xf7fe169d(boolean z17) {
        super.mo28588xf7fe169d(z17);
        pa3.p pVar = this.O1;
        if (pVar != null) {
            pVar.d0();
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(this.f127641r, "app.screenshot", (org.json.JSONObject) null);
    }
}
