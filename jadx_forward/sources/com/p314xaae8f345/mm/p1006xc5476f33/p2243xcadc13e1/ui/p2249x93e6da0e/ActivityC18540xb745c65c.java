package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI */
/* loaded from: classes8.dex */
public class ActivityC18540xb745c65c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f253957f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f253958d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f253959e = null;

    public final void T6() {
        java.lang.String trim = this.f253958d.getText().toString().trim();
        if (trim == null || trim.length() <= 0) {
            db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574972k65, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return;
        }
        tg3.r1 r1Var = new tg3.r1(trim, 1);
        c01.d9.e().g(r1Var);
        this.f253959e = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571457fn), true, true, new gg4.w(this, r1Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2q;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bkg);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.cfn);
        this.f253958d = editText;
        editText.addTextChangedListener(new gg4.s(this));
        this.f253958d.setImeOptions(3);
        this.f253958d.setOnEditorActionListener(new gg4.t(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571964uw), new gg4.u(this));
        mo54448x9c8c0d33(new gg4.v(this));
        if (getIntent().getBooleanExtra("from_webview", false)) {
            this.f253958d.setText(getIntent().getStringExtra("userName"));
            T6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(106, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.d9.e().a(106, this);
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSearchUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f253959e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f253959e = null;
        }
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 7)) {
            return;
        }
        if (i17 == 4 && i18 == -4) {
            db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571454fi, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            java.lang.String G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(G)) {
                G = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            dp.a.m125854x26a183b(this, G, 0).show();
            return;
        }
        r45.iw5 H = ((tg3.r1) m1Var).H();
        if (H.D > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e.ActivityC18539xe0826959.class);
            try {
                intent.putExtra("result", H.mo14344x5f01b1f6());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/ContactSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ContactSearchUI", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        java.lang.String g17 = x51.j1.g(H.f458889d);
        android.content.Intent intent2 = new android.content.Intent();
        o25.r1 r1Var = (o25.r1) i95.n0.c(o25.r1.class);
        java.lang.String trim = this.f253958d.getText().toString().trim();
        int i27 = 2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a1(trim)) {
            i19 = 1;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y0(trim)) {
            i19 = 2;
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.X0(trim);
            i19 = 3;
        }
        ((com.p314xaae8f345.mm.app.o7) r1Var).getClass();
        qk.p.a(intent2, H, i19);
        if ((g17 != null ? g17 : "").length() > 0) {
            if ((H.f458899q & 8) > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(g17);
                sb6.append(",");
                java.lang.String trim2 = this.f253958d.getText().toString().trim();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a1(trim2)) {
                    i27 = 1;
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y0(trim2)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.X0(trim2);
                    i27 = 3;
                }
                sb6.append(i27);
                g0Var.mo68478xbd3cda5f(10298, sb6.toString());
            }
            j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
        }
    }
}
