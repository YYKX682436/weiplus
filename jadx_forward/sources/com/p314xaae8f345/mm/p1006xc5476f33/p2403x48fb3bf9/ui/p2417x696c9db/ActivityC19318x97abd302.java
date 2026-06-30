package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI */
/* loaded from: classes15.dex */
public class ActivityC19318x97abd302 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 f265182d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xv5 f265183e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1 f265184f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f265185g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265186h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f265187i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f265188m;

    /* renamed from: n, reason: collision with root package name */
    public long f265189n;

    /* renamed from: o, reason: collision with root package name */
    public int f265190o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f265192q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265194s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options f265195t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 f265196u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f265197v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f265198w;

    /* renamed from: x, reason: collision with root package name */
    public r45.aw6 f265199x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f265200y;

    /* renamed from: p, reason: collision with root package name */
    public boolean f265191p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f265193r = 2;

    /* renamed from: z, reason: collision with root package name */
    public boolean f265201z = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302 activityC19318x97abd302, boolean z17) {
        java.lang.String str;
        activityC19318x97abd302.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "accept go  MPGdprPolicyUtil.checkPolicy");
        if (z17) {
            activityC19318x97abd302.f265184f.f267158f.f452790f = 1;
        } else {
            activityC19318x97abd302.f265184f.f267158f.f452790f = 2;
        }
        boolean z18 = activityC19318x97abd302.f265183e.f472054o;
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(activityC19318x97abd302.f265184f.f267158f.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC19318x97abd302.f265194s;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            activityC19318x97abd302.f265194s = db5.e1.Q(activityC19318x97abd302, null, activityC19318x97abd302.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f1(activityC19318x97abd302));
            java.util.LinkedList linkedList = activityC19318x97abd302.f265200y;
            int i17 = activityC19318x97abd302.f265190o;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("用户操作结果：1\n已授权选项：");
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(", \n");
            }
            sb6.append("用户头像id：");
            sb6.append(i17);
            sb6.append("\n");
            java.lang.String str2 = "";
            try {
                r45.c36 c36Var = new r45.c36();
                c36Var.mo11468x92b714fd(gVar.g());
                java.util.Iterator it6 = c36Var.f452788d.iterator();
                while (it6.hasNext()) {
                    r45.yv6 yv6Var = (r45.yv6) it6.next();
                    str2 = str2 + java.lang.String.format("status_id: %s, status_value: %s\n", java.lang.Integer.valueOf(yv6Var.f472961d), java.lang.Integer.valueOf(yv6Var.f472962e));
                }
                str2 = str2 + "submit_value: " + c36Var.f452790f + "\n";
                str = str2 + "isHaveGameCenterPage: " + valueOf + "\n";
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "parse proto fail, %s", e17.getMessage());
                str = str2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "auth result: %s", ((java.lang.Object) sb6) + str);
            if (activityC19318x97abd302.f265191p) {
                activityC19318x97abd302.f265182d.i(1, activityC19318x97abd302.f265200y, activityC19318x97abd302.f265190o, activityC19318x97abd302.f265192q, gVar, z18);
            } else {
                activityC19318x97abd302.f265182d.j(1, activityC19318x97abd302.f265200y, activityC19318x97abd302.f265190o, activityC19318x97abd302.A, activityC19318x97abd302.C, gVar, java.lang.Boolean.valueOf(z18), activityC19318x97abd302.f265201z);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthAppDataUI", "ByteString create failed");
        }
    }

    public final void U6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById(com.p314xaae8f345.mm.R.id.a7y);
        c22624x85d69039.b(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).nj(mo55332x76847179(), this.f265199x.f451851f.f452643d, (int) c22624x85d69039.m84164x40077844()));
        c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(c22624x85d69039.getContext())));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cin;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1137, this);
        android.content.Intent intent = getIntent();
        this.f265200y = new java.util.LinkedList(intent.getStringArrayListExtra("has_selected_scope"));
        this.f265185g = intent.getStringExtra("0");
        this.f265186h = intent.getStringExtra("1");
        try {
            this.f265183e = (r45.xv5) new r45.xv5().mo11468x92b714fd(intent.getByteArrayExtra("2"));
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthAppDataUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f265187i = intent.getStringExtra("4");
        this.f265188m = intent.getStringExtra("7");
        boolean booleanExtra = intent.getBooleanExtra("auth_from_scan", false);
        this.f265191p = booleanExtra;
        if (booleanExtra) {
            this.f265193r = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f265192q = stringExtra;
            this.f265182d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, true, this.f265185g, stringExtra);
        } else {
            this.f265182d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, this.f265185g, this.f265186h, this.f265187i, this.f265188m);
        }
        this.f265190o = intent.getIntExtra("3", -1);
        this.f265201z = intent.getBooleanExtra("auth_isoption1", false);
        this.A = intent.getStringExtra("key_open_sdk_token");
        this.B = intent.getStringExtra("key_open_sdk_pkg_name");
        this.C = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.D = intent.getIntExtra("key_open_sdk_version", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.B, java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(this.D));
        r45.xv5 xv5Var = this.f265183e;
        this.E = xv5Var.f472048f;
        this.F = xv5Var.f472047e;
        android.os.Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options();
            this.f265195t = options;
            options.m48439x63aa4ccc(bundleExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "options.callbackClassName: " + this.f265195t.f33026x3a8e995e + "  options.callbackFlags: " + this.f265195t.f33027x54a34142);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "SendAuth.options, bundle is null");
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f265183e.A;
        if (gVar != null && gVar.f273689a.length > 0) {
            r45.lq3 lq3Var = new r45.lq3();
            try {
                lq3Var.mo11468x92b714fd(gVar.g());
                this.f265197v = lq3Var.f461253d;
                this.f265198w = lq3Var.f461254e;
                this.f265199x = lq3Var.f461255f;
            } catch (java.io.IOException unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthAppDataUI", "GetUserGrantInfoBuffer parseFrom byteArray failed");
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzy)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g1(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567641k74);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k78);
        textView.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView.getPaint().setStrokeWidth(0.8f);
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f80704x478452f2;
        fVar.f423630u = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9i);
        fVar.f423629t = true;
        fVar.f423611b = true;
        fVar.f423616g = ap3.g.a();
        n11.a.b().h(this.f265199x.f451849d.f453407d, imageView, fVar.a());
        textView.setText(this.f265199x.f451849d.f453408e);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k79)).setText(this.f265199x.f451849d.f453409f);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7x);
        textView2.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView2.getPaint().setStrokeWidth(0.8f);
        textView2.setText(this.f265199x.f451849d.f453410g);
        this.f265184f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1(this, mo55332x76847179(), this.f265199x.f451850e.f473947d, this.f265183e);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f564831a84);
        c1163xf1deaba4.mo7960x6cab2c8d(this.f265184f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        c1162x665295de.Q(1);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        U6();
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iom);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ior);
        this.f265189n = java.lang.System.currentTimeMillis();
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h1(this));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265194s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(1137, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        hy4.b.INSTANCE.a(this.f265185g, this.f265189n, 0, this.f265193r, 5, 1, 0);
        this.f265182d.d(-2, this.f265195t, this.A, this.C, this.f265201z);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthAppDataUI", "onResume");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            hy4.b.INSTANCE.a(this.f265185g, this.f265189n, 2, this.f265193r, 5, 1, i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265194s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1) {
            this.f265182d.r(this, this.A, this.D, this.B, this.C, this.E, this.F, i17, i18, str, m1Var, this.f265195t, this.f265201z);
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p1) {
            this.f265182d.q(i17, i18, str, m1Var, this.f265195t);
        }
    }
}
