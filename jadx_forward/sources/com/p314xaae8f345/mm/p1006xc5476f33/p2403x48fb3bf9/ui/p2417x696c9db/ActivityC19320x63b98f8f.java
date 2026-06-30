package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI */
/* loaded from: classes15.dex */
public class ActivityC19320x63b98f8f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.lang.String A;
    public java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 f265202d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xv5 f265203e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265204f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f265205g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265206h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f265207i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f265208m;

    /* renamed from: n, reason: collision with root package name */
    public int f265209n;

    /* renamed from: o, reason: collision with root package name */
    public long f265210o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f265212q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265214s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options f265216u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f265218w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f265219x;

    /* renamed from: y, reason: collision with root package name */
    public int f265220y;

    /* renamed from: z, reason: collision with root package name */
    public int f265221z;

    /* renamed from: p, reason: collision with root package name */
    public boolean f265211p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f265213r = 2;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f265215t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public boolean f265217v = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19320x63b98f8f activityC19320x63b98f8f, boolean z17, r45.px4 px4Var) {
        if (z17) {
            activityC19320x63b98f8f.f265215t.add(activityC19320x63b98f8f.f265205g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.l(activityC19320x63b98f8f.f265215t));
        } else {
            activityC19320x63b98f8f.getClass();
            if (px4Var.f464993f == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "user disagree + but must agree => cancel");
                activityC19320x63b98f8f.f265202d.d(-4, activityC19320x63b98f8f.f265216u, activityC19320x63b98f8f.f265218w, activityC19320x63b98f8f.f265220y, activityC19320x63b98f8f.f265217v);
                return;
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.m(activityC19320x63b98f8f.f265203e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "go to SDKOAuthOtherUI");
            activityC19320x63b98f8f.W6(activityC19320x63b98f8f.f265203e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19322x56482c27.class, activityC19320x63b98f8f.f265209n);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.g(activityC19320x63b98f8f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "only page 2");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.b(activityC19320x63b98f8f.f265203e, activityC19320x63b98f8f.f265211p).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "go to SDKOAuthAppDataUI");
            activityC19320x63b98f8f.W6(activityC19320x63b98f8f.f265203e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302.class, activityC19320x63b98f8f.f265209n);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.g(activityC19320x63b98f8f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "doAuthDirectly");
        if (activityC19320x63b98f8f.f265215t.size() <= 0) {
            activityC19320x63b98f8f.f265202d.d(-4, activityC19320x63b98f8f.f265216u, activityC19320x63b98f8f.f265218w, activityC19320x63b98f8f.f265220y, activityC19320x63b98f8f.f265217v);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", java.lang.Boolean.valueOf(activityC19320x63b98f8f.f265211p), java.lang.Integer.valueOf(activityC19320x63b98f8f.f265215t.size()));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC19320x63b98f8f.f265214s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC19320x63b98f8f.f265214s = db5.e1.Q(activityC19320x63b98f8f, null, activityC19320x63b98f8f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n1(activityC19320x63b98f8f));
        if (activityC19320x63b98f8f.f265211p) {
            activityC19320x63b98f8f.f265202d.i(1, activityC19320x63b98f8f.f265215t, activityC19320x63b98f8f.f265209n, activityC19320x63b98f8f.f265212q, null, false);
            return;
        }
        activityC19320x63b98f8f.f265202d.j(1, activityC19320x63b98f8f.f265215t, activityC19320x63b98f8f.f265209n, activityC19320x63b98f8f.f265218w, activityC19320x63b98f8f.f265220y, null, java.lang.Boolean.FALSE, activityC19320x63b98f8f.f265217v);
    }

    public final int U6() {
        return "snsapi_friend".equals(this.f265205g) ? 3 : 4;
    }

    public final void V6() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ioq);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final void W6(r45.xv5 xv5Var, java.lang.Class cls, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "startScopeActivity  cls:" + cls);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) cls);
        intent.putExtra("0", this.f265204f);
        intent.putExtra("1", this.f265206h);
        intent.putExtra("4", this.f265207i);
        intent.putExtra("7", this.f265208m);
        intent.putExtra("3", i17);
        intent.putExtra("auth_raw_url", this.f265212q);
        intent.putExtra("has_selected_scope", this.f265215t);
        intent.putExtra("auth_from_scan", this.f265211p);
        intent.putExtra("auth_isoption1", this.f265217v);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265218w)) {
            intent.putExtra("key_open_sdk_token", this.f265218w);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265219x)) {
            intent.putExtra("key_open_sdk_pkg_name", this.f265219x);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.f265220y);
        intent.putExtra("key_open_sdk_version", this.f265221z);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = this.f265216u;
        if (options != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33026x3a8e995e)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.f265216u.m48440x792022dd(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cio;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1137, this);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78514x143f1b92().X0(this, b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().E0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hzy)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.o1(this));
        android.content.Intent intent = getIntent();
        this.f265204f = intent.getStringExtra("0");
        this.f265205g = intent.getStringExtra("auth_scope");
        this.f265206h = intent.getStringExtra("1");
        this.f265215t = new java.util.LinkedList(intent.getStringArrayListExtra("has_selected_scope"));
        try {
            this.f265203e = (r45.xv5) new r45.xv5().mo11468x92b714fd(intent.getByteArrayExtra("2"));
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthFriendUI", "SdkOauthAuthorizeResp parseFrom byteArray failed");
        }
        this.f265207i = intent.getStringExtra("4");
        this.f265208m = intent.getStringExtra("7");
        this.f265211p = intent.getBooleanExtra("auth_from_scan", false);
        this.f265218w = intent.getStringExtra("key_open_sdk_token");
        this.f265219x = intent.getStringExtra("key_open_sdk_pkg_name");
        this.f265220y = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.f265221z = intent.getIntExtra("key_open_sdk_version", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "pkgName:%s, authenticationResult:%d, openSDKVersion:%d", this.f265219x, java.lang.Integer.valueOf(this.f265220y), java.lang.Integer.valueOf(this.f265221z));
        if (this.f265211p) {
            this.f265213r = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f265212q = stringExtra;
            this.f265202d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, true, this.f265204f, stringExtra);
        } else {
            this.f265202d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, this.f265204f, this.f265206h, this.f265207i, this.f265208m);
        }
        this.f265209n = intent.getIntExtra("3", -1);
        this.f265217v = intent.getBooleanExtra("auth_isoption1", false);
        android.os.Bundle bundleExtra = intent.getBundleExtra("send_auth_option");
        if (bundleExtra != null) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options();
            this.f265216u = options;
            options.m48439x63aa4ccc(bundleExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "options.callbackClassName: " + this.f265216u.f33026x3a8e995e + "  options.callbackFlags: " + this.f265216u.f33027x54a34142);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "SendAuth.options, bundle is null");
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564827a80);
        java.util.Iterator it = this.f265203e.f472046d.iterator();
        while (it.hasNext()) {
            r45.px4 px4Var = (r45.px4) it.next();
            if (px4Var.f464991d.equals(this.f265205g)) {
                textView.setText(px4Var.f464992e);
            }
        }
        textView.getPaint().setFakeBoldText(true);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a7z);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265203e.f472061v)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(this.f265203e.f472061v);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 j3Var = this.f265202d;
        r45.xv5 xv5Var = this.f265203e;
        j3Var.f264500i = xv5Var.f472063x;
        this.A = xv5Var.f472048f;
        this.B = xv5Var.f472047e;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567642k75);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k7_);
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f80704x478452f2;
        fVar.f423630u = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9i);
        fVar.f423629t = true;
        n11.a.b().h(this.f265203e.f472048f, imageView, fVar.a());
        textView3.setText(this.f265203e.f472047e);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ion);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ios);
        r45.px4 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.n(this.f265205g, this.f265203e.f472046d);
        this.f265210o = java.lang.System.currentTimeMillis();
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p1(this, n17));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q1(this, n17));
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265214s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(1137, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f265202d.d(-2, this.f265216u, this.f265218w, this.f265220y, this.f265217v);
        hy4.b.INSTANCE.a(this.f265204f, this.f265210o, 0, this.f265213r, U6(), 1, 0);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthFriendUI", "onResume");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            hy4.b.INSTANCE.a(this.f265204f, this.f265210o, 2, this.f265213r, U6(), 1, i18);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265214s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1) {
            this.f265202d.r(this, this.f265218w, this.f265221z, this.f265219x, this.f265220y, this.A, this.B, i17, i18, str, m1Var, this.f265216u, this.f265217v);
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p1) {
            this.f265202d.q(i17, i18, str, m1Var, this.f265216u);
        }
    }
}
