package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI */
/* loaded from: classes8.dex */
public class ActivityC16134x74658289 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ViewOnClickListenerC16124xc5ddcee3 f224122d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224123e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f224124f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f224125g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f224126h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f224127i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f224128m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f224129n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224130o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f224131p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f224132q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f224133r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f224134s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f224135t;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f224139x;

    /* renamed from: y, reason: collision with root package name */
    public p83.b f224140y;

    /* renamed from: z, reason: collision with root package name */
    public p83.c f224141z;

    /* renamed from: u, reason: collision with root package name */
    public int f224136u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f224137v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f224138w = -1;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6189xa516e8c0>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.2
        {
            this.f39173x3fe91575 = -53647664;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6189xa516e8c0 c6189xa516e8c0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6189xa516e8c0 c6189xa516e8c02 = c6189xa516e8c0;
            if (!(c6189xa516e8c02 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6189xa516e8c0)) {
                return false;
            }
            c6189xa516e8c02.f136447g.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289 activityC16134x74658289 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289.this;
            if (activityC16134x74658289.f224130o == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                return false;
            }
            activityC16134x74658289.f224130o.c(null);
            return false;
        }
    };

    public final void T6() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.RECORD_AUDIO", 80, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (a17) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g3l);
            setVolumeControlStream(1);
            this.f224122d = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ViewOnClickListenerC16124xc5ddcee3) findViewById(com.p314xaae8f345.mm.R.id.cyt);
            this.f224123e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565487ck0);
            this.f224124f = findViewById(com.p314xaae8f345.mm.R.id.cjy);
            this.f224125g = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.kuz);
            this.f224126h = findViewById(com.p314xaae8f345.mm.R.id.kuy);
            this.f224127i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cyx);
            this.f224128m = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.cyd);
            this.f224129n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565489ck2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o(this, this.f224125g, this.f224123e, this.f224126h, this.f224122d, this.f224128m, this.f224127i, this.f224124f, this.f224129n, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cyg));
            this.f224130o = oVar;
            oVar.f224482a = this;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224132q)) {
                this.f224130o.e(this.f224132q, -1);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224134s)) {
                this.f224130o.c(this.f224134s);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224132q) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224134s)) {
                this.f224130o.b();
            }
            this.f224130o.d(this.f224139x);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224130o;
        oVar.getClass();
        if (i17 != 100 || i18 != 100) {
            if (i17 == 1001 && i18 == -1) {
                intent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = oVar.f224490i;
                abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
                abstractActivityC21394xb3d2c0cf.finish();
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        oVar.f224492k = stringExtra;
        java.lang.String concat = "+".concat(stringExtra2);
        oVar.f224493l = concat;
        oVar.f224483b.setText(concat);
        java.lang.String a17 = oVar.a(stringExtra2.replace("+", ""), oVar.f224494m);
        oVar.f224494m = a17;
        oVar.e(a17, -1);
        oVar.f224499r = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.A.mo48813x58998cd();
        c01.d9.e().a(807, this);
        c01.d9.e().a(746, this);
        getWindow().addFlags(131072);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q1(this), com.p314xaae8f345.mm.R.raw.f78367xaa0a534d);
        this.f224131p = getIntent().getStringExtra("IPCallTalkUI_nickname");
        this.f224132q = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
        this.f224133r = getIntent().getStringExtra("IPCallTalkUI_contactId");
        this.f224134s = getIntent().getStringExtra("IPCallTalkUI_countryCode");
        this.f224135t = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
        int intExtra = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
        this.f224136u = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", this.f224131p, this.f224132q, this.f224133r, this.f224134s, this.f224135t, java.lang.Integer.valueOf(intExtra));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224132q)) {
            this.f224132q = t83.f.i(this.f224132q);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224134s)) {
            if (!t83.c.m(this.f224132q)) {
                this.f224134s = t83.f.f();
            } else {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t83.c.a(this.f224132q))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
                    this.f224137v = 4;
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5.class);
                    intent.putExtra("IPCallTalkUI_contactId", this.f224133r);
                    intent.putExtra("IPCallTalkUI_countryCode", this.f224134s);
                    intent.putExtra("IPCallTalkUI_nickname", this.f224131p);
                    intent.putExtra("IPCallTalkUI_phoneNumber", this.f224132q);
                    intent.putExtra("IPCallTalkUI_dialScene", this.f224136u);
                    intent.putExtra("IPCallTalkUI_countryType", this.f224137v);
                    startActivityForResult(intent, 1001);
                    finish();
                    return;
                }
                this.f224132q = t83.c.o(this.f224132q);
                this.f224134s = t83.f.f();
            }
        }
        if (this.f224136u != 1) {
            this.f224138w = 0;
            this.f224137v = 3;
            this.f224140y = new p83.b(this.f224132q, this.f224134s, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.d0(this), this.f224136u);
            c01.d9.e().g(this.f224140y);
        } else {
            this.f224138w = -1;
            this.f224137v = 4;
        }
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224130o;
        if (oVar != null) {
            oVar.f224482a = null;
        }
        this.A.mo48814x2efc64();
        c01.d9.e().q(807, this);
        c01.d9.e().q(746, this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            T6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.r1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p83.b bVar;
        int i19;
        if (!(m1Var instanceof p83.b)) {
            if (m1Var instanceof p83.c) {
                if (i17 == 0 && i18 == 0) {
                    this.f224139x = ((p83.c) m1Var).f434268e.f461315e;
                } else {
                    this.f224139x = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224130o;
                if (oVar != null) {
                    oVar.d(this.f224139x);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0 && m1Var == (bVar = this.f224140y)) {
            r45.je5 je5Var = bVar.f434265e;
            if (je5Var != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(je5Var.f459300f);
                r45.je5 je5Var2 = this.f224140y.f434265e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", valueOf, je5Var2.f459298d, je5Var2.f459299e);
            }
            if (this.f224138w == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
                return;
            }
            boolean z17 = true;
            this.f224138w = 1;
            this.f224137v = 1;
            r45.je5 je5Var3 = this.f224140y.f434265e;
            if (je5Var3 != null && je5Var3.f459300f == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "check error show error dialog");
                return;
            }
            if (je5Var3 == null || ((i19 = je5Var3.f459300f) != 1 && i19 != 0)) {
                z17 = false;
            }
            if (z17) {
                if (je5Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(je5Var3.f459299e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
                } else if (this.f224130o != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", this.f224140y.f434265e.f459299e, this.f224134s);
                    java.lang.String str2 = this.f224140y.f434265e.f459299e;
                    this.f224134s = str2;
                    this.f224130o.c(str2);
                }
            }
            r45.je5 je5Var4 = this.f224140y.f434265e;
            if (je5Var4 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(je5Var4.f459298d) || this.f224130o == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", this.f224140y.f434265e.f459298d, this.f224132q);
            java.lang.String str3 = this.f224140y.f434265e.f459298d;
            this.f224132q = str3;
            this.f224130o.e(str3, -1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f224141z = new p83.c();
        c01.d9.e().g(this.f224141z);
    }
}
