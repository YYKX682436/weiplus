package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI */
/* loaded from: classes11.dex */
public class ActivityC16940x12c392bf extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f236447p = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f236448d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f236449e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f236450f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f236451g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f236452h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.ProgressDialog f236453i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f236454m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f236455n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f236456o;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16940x12c392bf activityC16940x12c392bf) {
        gm0.j1.d().g(new ks3.c0(2, activityC16940x12c392bf.f236454m, "", "", ""));
        activityC16940x12c392bf.f236453i = db5.e1.Q(activityC16940x12c392bf, "", activityC16940x12c392bf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
    }

    public final void U6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        gm0.j1.d().g(new ks3.c0(3, str, str2, str3, str4));
        this.f236453i = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
    }

    public final void V6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570972cj3, null);
        db5.e1.q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572511bg0), inflate, new os3.j3(this, (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.mgd), str, str2, str3));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c_t;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        m78601x22395ca8();
        mo2533x106ab264().o();
        mo78514x143f1b92().W0(this, mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f236448d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_4);
        this.f236449e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.prd);
        this.f236450f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ais);
        this.f236451g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f236452h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aij);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236454m)) {
            this.f236450f.setEnabled(false);
        } else {
            this.f236449e.setText(this.f236454m);
        }
        this.f236450f.setOnClickListener(new os3.g3(this));
        this.f236451g.setOnClickListener(new os3.h3(this));
        this.f236452h.setOnClickListener(new os3.i3(this));
        ng5.a.a(this.f236448d, c01.z1.r());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 293) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("key_qq_mail");
                java.lang.String string2 = bundleExtra.getString("key_bind_ticket");
                boolean z17 = bundleExtra.getBoolean("key_need_second_pwd", false);
                java.lang.String string3 = bundleExtra.getString("key_second_pwd_key");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrepareBindXMailUI", "mail %s, ticket %s, needSecondPwd %s, secPwdKey %s", string, string2, java.lang.Boolean.valueOf(z17), string3);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(string, string2)) {
                    return;
                }
                if (!z17) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236455n) || this.f236455n.equals(string)) {
                        U6(string, string2, "", "");
                        return;
                    } else {
                        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfx), "", new os3.l3(this, string, string2), null);
                        return;
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                    dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.is6), 1).show();
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236455n) || this.f236455n.equals(string)) {
                    V6(string, string2, string3);
                } else {
                    db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfx), "", new os3.k3(this, string, string2, string3), null);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f236454m = getIntent().getStringExtra("Key_WeXin_Mail");
        this.f236456o = getIntent().getStringExtra("Key_QQMail_Login_Url");
        java.lang.String stringExtra = getIntent().getStringExtra("Key_Last_Bind_Mail");
        this.f236455n = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrepareBindXMailUI", "wxMail %s, loginQQ %s, lastBindMail %s", this.f236454m, this.f236456o, stringExtra);
        mo43517x10010bd5();
        gm0.j1.d().a(586, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(586, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrepareBindXMailUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f236453i;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        ks3.c0 c0Var = (ks3.c0) m1Var;
        int i19 = ((ks3.f) c0Var.f393177d.f152244b.f152233a).f393197e;
        java.lang.String str2 = c0Var.f393179f;
        if (i17 == 0 && i18 == 0 && i19 == 0) {
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.is7), 0).show();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Key_Bind_XMail", str2);
            setResult(-1, intent);
            finish();
            return;
        }
        if (i19 != -39006) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.is6);
            }
            dp.a.m125854x26a183b(this, str, 1).show();
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hou);
            }
            dp.a.m125854x26a183b(this, str, 0).show();
            V6(str2, c0Var.f393180g, c0Var.f393181h);
        }
    }
}
