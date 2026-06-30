package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.MMFBAuthUI */
/* loaded from: classes14.dex */
public class ActivityC11448x932bffb8 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f154972q = {"public_profile", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, "user_location"};

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f154973d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f154974e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f154975f;

    /* renamed from: g, reason: collision with root package name */
    public r61.a1 f154976g;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f154980n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154977h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154978i = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154979m = "";

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f154981o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f154982p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.MMFBAuthUI.1
        {
            this.f39173x3fe91575 = -1399051904;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370) {
            am.gj gjVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x465423702 = c5690x46542370;
            if (c5690x465423702 == null || (gjVar = c5690x465423702.f136016g) == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookAuthUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBAuthUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MMFBAuthUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public final void V6() {
        android.app.ProgressDialog show = android.app.ProgressDialog.show(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c86), true);
        this.f154974e = show;
        show.setOnCancelListener(this.f154975f);
        this.f154976g = new r61.a1(1, this.f154979m);
        gm0.j1.d().g(this.f154976g);
        W6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(582L, 1L, 1L, false);
    }

    public final void W6(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new e21.p(32, z17 ? "0" : "1"));
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.q(arrayList));
    }

    public final void X6() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).t();
        boolean u17 = this.f154977h ? false : c01.z1.u();
        java.util.Map map = this.f154981o;
        if (((java.util.HashMap) map).containsKey("facebook_auth_tip")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.util.HashMap) map).get("facebook_auth_tip");
            c21560x1fce98fb.J(u17 ? com.p314xaae8f345.mm.R.C30867xcad56011.c8d : com.p314xaae8f345.mm.R.C30867xcad56011.f572710c85);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).d(c21560x1fce98fb, -1);
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_cat")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.util.HashMap) map).get("facebook_auth_cat"), -1);
        }
        if (!u17) {
            if (((java.util.HashMap) map).containsKey("facebook_auth_bind_btn")) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.util.HashMap) map).get("facebook_auth_bind_btn"), -1);
                return;
            }
            return;
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_account")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.util.HashMap) map).get("facebook_auth_account");
            c21560x1fce98fb2.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c87) + gm0.j1.u().c().l(65826, null));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).d(c21560x1fce98fb2, -1);
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_cat2")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.util.HashMap) map).get("facebook_auth_cat2"), -1);
        }
        if (((java.util.HashMap) map).containsKey("facebook_auth_unbind_btn")) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) ((java.util.HashMap) map).get("facebook_auth_unbind_btn"), -1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576404ad;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154977h = getIntent().getBooleanExtra("is_force_unbind", false);
        this.f154975f = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j8(this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.afl);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).g(com.p314xaae8f345.mm.R.xml.f576404ad);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).h("facebook_auth_tip");
        java.util.Map map = this.f154981o;
        if (h17 != null) {
            ((java.util.HashMap) map).put("facebook_auth_tip", h17);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).h("facebook_auth_cat");
        if (h18 != null) {
            ((java.util.HashMap) map).put("facebook_auth_cat", h18);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).h("facebook_auth_bind_btn");
        if (h19 != null) {
            ((java.util.HashMap) map).put("facebook_auth_bind_btn", h19);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h27 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).h("facebook_auth_account");
        if (h27 != null) {
            ((java.util.HashMap) map).put("facebook_auth_account", h27);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h28 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).h("facebook_auth_cat2");
        if (h28 != null) {
            ((java.util.HashMap) map).put("facebook_auth_cat2", h28);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h29 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f154980n).h("facebook_auth_unbind_btn");
        if (h29 != null) {
            ((java.util.HashMap) map).put("facebook_auth_unbind_btn", h29);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookAuthUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra));
            objArr2[1] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? 0 : stringExtra.length());
            objArr2[2] = java.lang.Integer.valueOf(intExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookAuthUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                V6();
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154973d;
        if (lVar != null) {
            lVar.b(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154980n = m79336x8b97809d();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154973d;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.content.Intent intent = getIntent();
            intent.putExtra("bind_facebook_succ", this.f154978i);
            setResult(-1, intent);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f154982p.mo48814x2efc64();
        gm0.j1.d().q(183, this);
        gm0.j1.d().q(254, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FacebookAuthUI", "onPreferenceTreeClick, key is null");
            return true;
        }
        if (!str.equals("facebook_auth_bind_btn")) {
            if (!str.equals("facebook_auth_unbind_btn")) {
                return false;
            }
            db5.e1.n(this, com.p314xaae8f345.mm.R.C30867xcad56011.c8b, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l8(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m8(this));
            return true;
        }
        try {
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154973d;
            lVar.getClass();
            com.p314xaae8f345.p3210x3857dc.d.g().e();
            lVar.g(null);
            lVar.f290747b = 0L;
            lVar.h(this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FacebookAuthUI", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar2 = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
        this.f154973d = lVar2;
        lVar2.a(this, f154972q, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r8(this, null));
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f154982p.mo48813x58998cd();
        super.onResume();
        gm0.j1.d().a(183, this);
        gm0.j1.d().a(254, this);
        X6();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 254) {
            if (i17 == 0 && i18 == 0) {
                this.f154976g = new r61.a1(0, "");
                gm0.j1.d().g(this.f154976g);
                return;
            }
            android.app.ProgressDialog progressDialog = this.f154974e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (i18 == -82) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n8(this));
                return;
            }
            if (i18 == -83) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o8(this));
                return;
            }
            if (i18 == -84) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p8(this));
                return;
            }
            if (i18 == -85) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.f81562int, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q8(this));
                return;
            }
            if (i18 == -86) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.iny, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i8(this));
                return;
            }
            if (i18 == -106) {
                x51.i1.c(this, str, 0);
                return;
            }
            if (i18 == -217) {
                x51.i1.f(this, x51.i.a((com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var), i18);
                return;
            }
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(this, null, null);
                return;
            }
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 183) {
            android.app.ProgressDialog progressDialog2 = this.f154974e;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            int i19 = ((r61.a1) m1Var).f474349f;
            if (i17 == 0 && i18 == 0) {
                dp.a.m125853x26a183b(this, i19 == 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.bdi : com.p314xaae8f345.mm.R.C30867xcad56011.bde, 1).show();
                this.f154977h = false;
                X6();
                if (i19 == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("facebookapp");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().J0("facebookapp");
                    this.f154978i = true;
                    return;
                }
                return;
            }
            if (i17 == 4 && i18 == -67) {
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.c89, 1).show();
                return;
            }
            if (i17 == 4 && i18 == -5) {
                dp.a.m125853x26a183b(this, i19 == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572708c83 : com.p314xaae8f345.mm.R.C30867xcad56011.c8a, 1).show();
                return;
            }
            if (i18 == -106) {
                x51.i1.c(this, str, 0);
                return;
            }
            tm.a b18 = tm.a.b(str);
            if (b18 != null) {
                b18.c(this, null, null);
            } else {
                dp.a.m125853x26a183b(this, i19 == 0 ? com.p314xaae8f345.mm.R.C30867xcad56011.bdh : com.p314xaae8f345.mm.R.C30867xcad56011.bdd, 1).show();
            }
        }
    }
}
