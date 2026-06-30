package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI */
/* loaded from: classes14.dex */
public class ActivityC13520x8c9585b4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int S = 0;
    public int B;
    public android.widget.ImageView C;
    public android.widget.TextView D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f181581J;
    public r45.zd5 K;
    public java.lang.String L;
    public android.widget.TextView M;
    public android.view.ViewGroup N;
    public android.widget.CheckBox P;
    public android.widget.TextView Q;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f181582d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f181583e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f181584f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f181585g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f181586h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f181587i;

    /* renamed from: q, reason: collision with root package name */
    public float f181592q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f181593r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f181594s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f181595t;

    /* renamed from: u, reason: collision with root package name */
    public int f181596u;

    /* renamed from: v, reason: collision with root package name */
    public int f181597v;

    /* renamed from: w, reason: collision with root package name */
    public int f181598w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f181599x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f181600y;

    /* renamed from: m, reason: collision with root package name */
    public r45.zd5 f181588m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181589n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f181590o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f181591p = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f181601z = true;
    public int A = 0;
    public java.lang.String G = "";
    public float H = 0.0f;
    public long I = 0;
    public boolean R = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4, java.lang.String str) {
        activityC13520x8c9585b4.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectConfirmUI", "jumpToWebView url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(activityC13520x8c9585b4, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void U6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_code", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90022));
        intent.putExtra("err_msg", "get confirm info error");
        intent.putExtra("verify_result", this.G);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().c(this.f181596u, false, 3, 2, 90022);
        vz2.c.f(90022);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().f181515p = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().b(this.f181595t, this.f181596u);
        setResult(-1, intent);
        finish();
    }

    public final void V6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_code", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(90024));
        intent.putExtra("err_msg", "user cancel in confirm ui");
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().c(this.f181596u, false, 3, 1, 90024);
        vz2.c.k("msgVerify", "user cancel in confirm ui");
        vz2.c.f(90024);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().f181515p = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().b(this.f181595t, this.f181596u);
        setResult(0, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f181586h;
        if (u3Var != null && u3Var.isShowing()) {
            this.f181586h.dismiss();
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570279aa1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "onActiviyResult reqeustCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13516xe45e9481.a().f181515p = java.lang.System.currentTimeMillis();
        if (intent != null && intent.hasExtra("err_code")) {
            intent.putExtra("err_code", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.k0.a(intent.getIntExtra("err_code", -1)));
        }
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.R) {
            U6();
        } else {
            V6();
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        vz2.c.b().f137724p = java.lang.System.currentTimeMillis();
        mo78530x8b45058f();
        this.f181593r = getIntent().getStringExtra("appId");
        this.f181594s = getIntent().getStringExtra("request_verify_pre_info");
        this.f181595t = getIntent().getStringExtra("key_function_name");
        this.f181596u = getIntent().getIntExtra("key_business_type", -1);
        boolean z17 = false;
        this.f181597v = getIntent().getIntExtra("check_alive_type", 0);
        this.I = java.lang.System.currentTimeMillis();
        this.f181601z = !getIntent().getBooleanExtra("face_flash_no_use_id_card", false);
        this.A = getIntent().getIntExtra("identify_type", 0);
        this.B = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "appId:%s jsonData:%s functionName:%s businessType:%s check_alive_type_request:%s isUseIdCard: %b identify_type: %s", this.f181593r, this.f181594s, this.f181595t, java.lang.Integer.valueOf(this.f181596u), java.lang.Integer.valueOf(this.f181597v), java.lang.Boolean.valueOf(this.f181601z), java.lang.Integer.valueOf(this.A));
        this.f181581J = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.dmt);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54448x9c8c0d33(new g72.g(this));
        this.f181582d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dmu);
        this.f181583e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ngn);
        this.C = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a3f);
        this.D = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a3g);
        ((android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.dmw)).setOnClickListener(new g72.h(this));
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.dmv);
        this.f181584f = checkBox;
        checkBox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: g72.a$$a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.this;
                boolean z19 = false;
                boolean z27 = activityC13520x8c9585b4.N.getVisibility() == 8 || activityC13520x8c9585b4.P.isChecked();
                android.widget.Button button = activityC13520x8c9585b4.f181583e;
                if (z18 && z27) {
                    z19 = true;
                }
                button.setEnabled(z19);
            }
        });
        this.f181584f.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dmx);
        this.f181585g = textView;
        textView.setOnClickListener(new g72.i(this));
        this.f181587i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dms);
        this.M = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pjj);
        this.N = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f565809dn0);
        this.Q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565810dn1);
        this.P = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.dmz);
        this.N.setVisibility(8);
        this.P.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: g72.a$$b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.this;
                activityC13520x8c9585b4.f181583e.setEnabled(z18 && activityC13520x8c9585b4.f181584f.isChecked());
            }
        });
        this.N.setOnClickListener(new android.view.View.OnClickListener() { // from class: g72.a$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.this;
                activityC13520x8c9585b4.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13520x8c9585b4, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13520x8c9585b4, array2);
                activityC13520x8c9585b4.P.setChecked(!r8.isChecked());
                yj0.a.h(activityC13520x8c9585b4, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(activityC13520x8c9585b4, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f181583e.setOnClickListener(new g72.j(this));
        if (this.A == 1 && this.B == 5) {
            z17 = true;
        }
        if (z17) {
            this.f181583e.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "start get confirm info");
        this.f181586h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, new g72.k(this));
        c72.p pVar = new c72.p(this.f181593r, this.f181594s, this.f181597v, this.f181601z, this.A);
        gm0.j1.d().a(1147, this);
        gm0.j1.d().g(pVar);
        wz2.e.f532303a.a(this);
        vz2.c.m(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.hardware.SensorManager sensorManager;
        super.onDestroy();
        wz2.f fVar = wz2.e.f532303a;
        if (!fVar.f532306c || (sensorManager = fVar.f532304a) == null) {
            return;
        }
        fVar.f532306c = false;
        sensorManager.unregisterListener(fVar.f532305b);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "onRequestPermissionsResult");
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        if (i17 == 16) {
            if (iArr[0] == 0) {
                this.f181583e.performClick();
                return;
            } else {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7j), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new g72.c(this), new g72.d(this));
                return;
            }
        }
        if (i17 == 18 || i17 == 80) {
            if (iArr[0] == 0) {
                this.f181583e.performClick();
            } else {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7k), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new g72.e(this), new g72.f(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "scene: %d, errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        vz2.c.k("confirmCode", java.lang.Integer.valueOf(i17));
        vz2.c.k("confirmMsg", str);
        c72.p pVar = (c72.p) m1Var;
        java.lang.String str3 = pVar.f121102n;
        this.f181590o = str3;
        this.G = pVar.f121110v;
        this.H = pVar.f121108t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "mFeedbackUrl:%s", str3);
        if (i17 == 0 && i18 == 0) {
            this.f181588m = pVar.f121098g;
            this.f181589n = pVar.f121101m;
            this.f181591p = pVar.f121103o;
            this.f181592q = pVar.f121104p;
            this.f181598w = pVar.f121105q;
            this.f181599x = pVar.f121106r;
            this.f181600y = pVar.f121107s;
            this.E = pVar.f121099h;
            this.F = pVar.f121100i;
            this.L = pVar.f121112x;
            this.K = pVar.f121111w;
            m1Var.toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181589n)) {
                this.f181589n = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6q);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f181586h;
            if (u3Var != null && u3Var.isShowing()) {
                this.f181586h.dismiss();
            }
            if (this.A == 1 && this.B == 5) {
                this.f181583e.performClick();
            } else {
                this.f181583e.setEnabled(true);
                this.f181582d.setText(this.f181589n);
                this.D.setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6r), this.F));
                n11.a.b().g(this.E, this.C);
                r45.zd5 zd5Var = this.f181588m;
                if (zd5Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "protocol info: %s", zd5Var.f473470d);
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zd5Var.f473470d) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6p) : zd5Var.f473470d;
                    java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zd5Var.f473472f) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6o) : zd5Var.f473472f;
                    android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string + string2);
                    newSpannable.setSpan(new g72.n(this), string.length(), string.length() + string2.length(), 33);
                    this.f181584f.setVisibility(0);
                    this.f181585g.setVisibility(0);
                    this.f181585g.setText(newSpannable);
                    this.f181585g.setMovementMethod(new g72.o(this, zd5Var));
                    int i19 = zd5Var.f473473g;
                    if (i19 == 0) {
                        this.f181584f.setChecked(false);
                        this.f181583e.setEnabled(false);
                    } else if (i19 == 1) {
                        this.f181584f.setChecked(true);
                        this.f181583e.setEnabled(true);
                    }
                    this.f181587i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6m));
                    this.f181587i.setOnClickListener(new g72.b(this));
                    this.f181587i.setVisibility(0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "wechat header text: %s", this.L);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
                    this.M.setVisibility(0);
                    this.M.setText(this.L);
                }
                r45.zd5 zd5Var2 = this.K;
                if (zd5Var2 != null && (str2 = zd5Var2.f473470d) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "wechat promptInfo wording: %s, check status: %d", str2, java.lang.Integer.valueOf(zd5Var2.f473473g));
                    this.N.setVisibility(0);
                    int i27 = this.K.f473473g;
                    if (i27 == 0) {
                        this.P.setChecked(false);
                        this.f181583e.setEnabled(false);
                    } else if (i27 == 1) {
                        this.P.setChecked(true);
                        this.f181583e.setEnabled(true);
                    }
                    this.Q.setText(this.K.f473470d);
                }
                this.f181581J.setVisibility(8);
            }
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.c79);
            }
            java.lang.String str4 = pVar.f121109u;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f181586h;
            if (u3Var2 != null && u3Var2.isShowing()) {
                this.f181586h.dismiss();
            }
            this.R = true;
            if (this.A == 1 && this.B == 5) {
                U6();
            } else {
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559303az);
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559304b0);
                android.widget.TextView textView = (android.widget.TextView) this.f181581J.findViewById(com.p314xaae8f345.mm.R.id.dnt);
                android.widget.TextView textView2 = (android.widget.TextView) this.f181581J.findViewById(com.p314xaae8f345.mm.R.id.dnq);
                android.widget.ImageView imageView = (android.widget.ImageView) this.f181581J.findViewById(com.p314xaae8f345.mm.R.id.dnr);
                android.widget.Button button = (android.widget.Button) this.f181581J.findViewById(com.p314xaae8f345.mm.R.id.dnm);
                android.widget.TextView textView3 = (android.widget.TextView) this.f181581J.findViewById(com.p314xaae8f345.mm.R.id.dnl);
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.f181581J.findViewById(com.p314xaae8f345.mm.R.id.dnp);
                this.f181581J.setVisibility(0);
                button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1);
                button.setOnClickListener(new g72.l(this));
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562964t6);
                imageView2.startAnimation(loadAnimation);
                imageView.setImageDrawable(i65.a.i(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f79724xeb42fc43));
                imageView.startAnimation(loadAnimation2);
                textView.setText(str);
                if (!android.text.TextUtils.isEmpty(str4)) {
                    textView2.setText(str4);
                }
                textView3.setVisibility(android.text.TextUtils.isEmpty(this.f181590o) ? 4 : 0);
                textView3.setOnClickListener(new g72.m(this, i18));
            }
        }
        gm0.j1.d().q(1147, this);
    }
}
