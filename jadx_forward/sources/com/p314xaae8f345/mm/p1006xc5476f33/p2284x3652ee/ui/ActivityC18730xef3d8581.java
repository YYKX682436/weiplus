package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ui;

/* renamed from: com.tencent.mm.plugin.ting.ui.TingPostLiteAppTransparentUI */
/* loaded from: classes15.dex */
public class ActivityC18730xef3d8581 extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 implements q80.z, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {
    public org.json.JSONObject A1;
    public final q80.w B1;
    public q80.x C1;

    public ActivityC18730xef3d8581() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        this.B1 = new aa3.f0();
        this.C1 = null;
    }

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.C1 = xVar;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        if (intent.hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            try {
                this.A1 = new org.json.JSONObject(intent.getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
            } catch (java.lang.Exception unused) {
            }
        }
        if (intent.getBooleanExtra("onlySetData", false)) {
            return;
        }
        super.mo28560x10864c08(intent);
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

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    public boolean mo28575x387a9983() {
        return com.p314xaae8f345.mm.ui.bk.C();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        q80.x xVar = this.C1;
        if (xVar != null) {
            xVar.mo55562x9d4787cb(i17, i18, intent);
            this.C1 = null;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        super.mo28578x2635de3e(str, list);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.R.I;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().B(abstractC3700xe41a2874);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckLiteAppVersionError */
    public void mo65530xac5a411a(int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new im4.d(this));
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        super.mo28579x2d9f160(str, list);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.R.I;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().C(str, abstractC3700xe41a2874);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q80.w wVar = this.B1;
        im4.a aVar = new im4.a(this, weakReference);
        aa3.f0 f0Var = (aa3.f0) wVar;
        f0Var.getClass();
        f0Var.f84054b = aVar;
        ((aa3.f0) wVar).f84053a = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.a(wVar);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        if (!kx5.n.h().l()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 112L, 1L);
        }
        super.onCreate(bundle);
        this.f127608e.f431328d.m137283xa83bcec0(new im4.b(this));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 0;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 3;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.d(this.B1);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 2;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 1;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && j45.l.f()) {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        } else {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        new org.json.JSONObject().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(this.f127622q, "app.screenshot", (org.json.JSONObject) null);
    }
}
