package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI */
/* loaded from: classes15.dex */
public class ActivityC19322x56482c27 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 f265230d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xv5 f265231e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c2 f265232f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f265233g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265234h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f265235i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f265236m;

    /* renamed from: n, reason: collision with root package name */
    public int f265237n;

    /* renamed from: o, reason: collision with root package name */
    public long f265238o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f265240q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265242s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options f265243t;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f265245v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f265246w;

    /* renamed from: x, reason: collision with root package name */
    public int f265247x;

    /* renamed from: y, reason: collision with root package name */
    public int f265248y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f265249z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f265239p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f265241r = 2;

    /* renamed from: u, reason: collision with root package name */
    public boolean f265244u = false;
    public java.util.LinkedList B = new java.util.LinkedList();

    public final void T6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "accept go  MPGdprPolicyUtil.checkPolicy");
        if (z17) {
            java.util.LinkedList linkedList = this.B;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c2 c2Var = this.f265232f;
            c2Var.getClass();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int i17 = 0;
            while (true) {
                java.util.LinkedList linkedList3 = c2Var.f265559d;
                if (i17 >= linkedList3.size()) {
                    break;
                }
                r45.px4 px4Var = (r45.px4) linkedList3.get(i17);
                int i18 = px4Var.f464993f;
                if (i18 == 2 || i18 == 3) {
                    linkedList2.add(px4Var.f464991d);
                }
                i17++;
            }
            linkedList.addAll(linkedList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.l(this.B));
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.b(this.f265231e, this.f265239p).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "doAuthDirectly");
            if (this.B.size() <= 0) {
                this.f265230d.d(-4, this.f265243t, this.f265245v, this.f265247x, this.f265244u);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", java.lang.Boolean.valueOf(this.f265239p), java.lang.Integer.valueOf(this.B.size()));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265242s;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f265242s = db5.e1.Q(this, null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w1(this));
            if (this.f265239p) {
                this.f265230d.i(1, this.B, this.f265237n, this.f265240q, null, false);
                return;
            }
            this.f265230d.j(1, this.B, this.f265237n, this.f265245v, this.f265247x, null, java.lang.Boolean.FALSE, this.f265244u);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "go to SDKOAuthAppDataUI");
        r45.xv5 xv5Var = this.f265231e;
        java.util.LinkedList linkedList4 = this.B;
        int i19 = this.f265237n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "startScopeActivity  cls:" + com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302.class);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302.class);
        intent.putExtra("0", this.f265233g);
        intent.putExtra("1", this.f265234h);
        intent.putExtra("4", this.f265235i);
        intent.putExtra("7", this.f265236m);
        intent.putExtra("3", i19);
        intent.putExtra("auth_raw_url", this.f265240q);
        intent.putExtra("auth_from_scan", this.f265239p);
        intent.putExtra("has_selected_scope", linkedList4);
        intent.putExtra("auth_isoption1", this.f265244u);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265245v)) {
            intent.putExtra("key_open_sdk_token", this.f265245v);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265246w)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f265246w);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f265247x);
        intent.putExtra("key_open_sdk_version", this.f265248y);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = this.f265243t;
        if (options != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33026x3a8e995e)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.f265243t.m48440x792022dd(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/util/LinkedList;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/util/LinkedList;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.g(this);
    }

    public final void U6() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ioq);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cip;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1137, this);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78514x143f1b92().X0(this, b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().E0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzy)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x1(this));
        android.content.Intent intent = getIntent();
        this.f265233g = intent.getStringExtra("0");
        this.f265234h = intent.getStringExtra("1");
        try {
            this.f265231e = (r45.xv5) new r45.xv5().mo11468x92b714fd(intent.getByteArrayExtra("2"));
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthOtherUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f265235i = intent.getStringExtra("4");
        this.f265236m = intent.getStringExtra("7");
        boolean z17 = false;
        this.f265239p = intent.getBooleanExtra("auth_from_scan", false);
        this.B = new java.util.LinkedList(intent.getStringArrayListExtra("has_selected_scope"));
        if (this.f265239p) {
            this.f265241r = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f265240q = stringExtra;
            this.f265230d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, true, this.f265233g, stringExtra);
        } else {
            this.f265230d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, this.f265233g, this.f265234h, this.f265235i, this.f265236m);
        }
        this.f265237n = intent.getIntExtra("3", -1);
        this.f265244u = intent.getBooleanExtra("auth_isoption1", false);
        this.f265245v = intent.getStringExtra("key_open_sdk_token");
        this.f265246w = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f265247x = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f265248y = intent.getIntExtra("key_open_sdk_version", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f265246w, java.lang.Integer.valueOf(this.f265247x), java.lang.Integer.valueOf(this.f265248y));
        android.os.Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options();
            this.f265243t = options;
            options.m48439x63aa4ccc(bundleExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "options.callbackClassName: " + this.f265243t.f33026x3a8e995e + "  options.callbackFlags: " + this.f265243t.f33027x54a34142);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "SendAuth.options, bundle is null");
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564830a83);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h8g);
        textView.getPaint().setFakeBoldText(true);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7z);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265231e.f472061v)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f265231e.f472061v);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 j3Var = this.f265230d;
        r45.xv5 xv5Var = this.f265231e;
        j3Var.f264500i = xv5Var.f472063x;
        this.f265249z = xv5Var.f472048f;
        this.A = xv5Var.f472047e;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.k76);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k7a);
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f80704x478452f2;
        fVar.f423630u = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9i);
        fVar.f423629t = true;
        n11.a.b().h(this.f265231e.f472048f, imageView, fVar.a());
        textView3.setText(this.f265231e.f472047e);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564829a82);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f265231e.f472046d.iterator();
        while (it.hasNext()) {
            r45.px4 px4Var = (r45.px4) it.next();
            if (!px4Var.f464991d.equals("snsapi_userinfo") && !px4Var.f464991d.equals("snsapi_login") && !px4Var.f464991d.equals("group_sns_login") && !px4Var.f464991d.equals("snsapi_friend")) {
                linkedList.add(px4Var);
                if (px4Var.f464993f == 3) {
                    z17 = true;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c2(this, linkedList);
        this.f265232f = c2Var;
        listView.setAdapter((android.widget.ListAdapter) c2Var);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iop);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iou);
        int intExtra = intent.getIntExtra("5", -2);
        int intExtra2 = intent.getIntExtra("6", -2);
        this.f265238o = java.lang.System.currentTimeMillis();
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y1(this, intExtra, intExtra2));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.z1(this, z17, intExtra, intExtra2));
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265242s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(1137, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        hy4.b.INSTANCE.a(this.f265233g, this.f265238o, 0, this.f265241r, 4, 1, 0);
        this.f265230d.d(-2, this.f265243t, this.f265245v, this.f265247x, this.f265244u);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthOtherUI", "onResume");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            hy4.b.INSTANCE.a(this.f265233g, this.f265238o, 2, this.f265241r, 4, 1, i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265242s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1) {
            this.f265230d.r(this, this.f265245v, this.f265248y, this.f265246w, this.f265247x, this.f265249z, this.A, i17, i18, str, m1Var, this.f265243t, this.f265244u);
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p1) {
            this.f265230d.q(i17, i18, str, m1Var, this.f265243t);
        }
    }
}
