package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class RegByMobileSendSmsUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f73583z = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73588h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73589i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f73590m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f73591n;

    /* renamed from: o, reason: collision with root package name */
    public int f73592o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f73593p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f73594q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f73595r;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f73598u;

    /* renamed from: v, reason: collision with root package name */
    public int f73599v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f73600w;

    /* renamed from: x, reason: collision with root package name */
    public int f73601x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f73584d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73585e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73586f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73587g = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f73596s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f73597t = 15;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct f73602y = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();

    public static void T6(com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI regByMobileSendSmsUI, java.lang.String str, java.lang.String str2) {
        regByMobileSendSmsUI.getClass();
        gm0.j1.d().a(701, regByMobileSendSmsUI);
        gm0.j1.d().a(252, regByMobileSendSmsUI);
        new com.tencent.mm.plugin.account.ui.fa(new com.tencent.mm.plugin.account.ui.sf(regByMobileSendSmsUI), str, str2, regByMobileSendSmsUI.f73584d).b(regByMobileSendSmsUI);
    }

    public final void U6() {
        if (c01.uc.f37515d) {
            c01.uc ucVar = c01.uc.f37514c;
            ucVar.a(c01.z1.r());
            ucVar.g(c01.z1.r(), c01.z1.q());
            c01.uc.f37515d = false;
        }
    }

    public final com.tencent.mm.pluginsdk.ui.span.f0 V6(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(str);
        int indexOf = str.indexOf(32) + 1;
        f0Var.c(new android.text.style.AbsoluteSizeSpan(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479855h4)), indexOf, str.length(), 33);
        f0Var.c(new android.text.style.ForegroundColorSpan(getResources().getColor(com.tencent.mm.R.color.f479206su)), indexOf, str.length(), 33);
        return f0Var;
    }

    public final void W6() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f73595r;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f73594q.setText(com.tencent.mm.R.string.hwk);
        this.f73594q.setEnabled(true);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2b;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486848mm3)).setText(getString(com.tencent.mm.R.string.hwq, this.f73584d));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486845mm0)).setText(V6(getString(com.tencent.mm.R.string.hwp, this.f73585e)));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486849mm4)).setText(V6(getString(com.tencent.mm.R.string.hws, this.f73586f)));
        this.f73593p = (android.widget.Button) findViewById(com.tencent.mm.R.id.mlz);
        this.f73594q = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        if (com.tencent.mm.sdk.platformtools.t8.N0(this.f73584d, this.f73586f, this.f73585e)) {
            this.f73593p.setEnabled(false);
            this.f73594q.setEnabled(false);
        } else {
            this.f73594q.setOnClickListener(new com.tencent.mm.plugin.account.ui.vf(this));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wo.w0.o())) {
            this.f73593p.setVisibility(8);
        } else {
            this.f73593p.setOnClickListener(new com.tencent.mm.plugin.account.ui.wf(this));
        }
        setMMTitle(com.tencent.mm.R.string.hwr);
        setBackBtn(new com.tencent.mm.plugin.account.ui.xf(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73599v = getIntent().getIntExtra("key_reg_style", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("from_mobile");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73584d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("to_mobile");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f73586f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("verify_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f73585e = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("regsession_id");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f73587g = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("reg_3d_app_ticket");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f73600w = stringExtra5;
        java.lang.String stringExtra6 = getIntent().getStringExtra("kintent_nickname");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f73589i = stringExtra6;
        java.lang.String stringExtra7 = getIntent().getStringExtra("kintent_password");
        this.f73588h = stringExtra7 != null ? stringExtra7 : "";
        this.f73590m = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f73601x = getIntent().getIntExtra("reg_3d_app_type", 0);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.u(this, getString(com.tencent.mm.R.string.hwm), "", new com.tencent.mm.plugin.account.ui.uf(this), null);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileSendSmsUI", "errType %s, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.app.ProgressDialog progressDialog = this.f73591n;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int type = m1Var.getType();
        boolean z17 = false;
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = this.f73602y;
        if (type == 145) {
            h11.e eVar = (h11.e) m1Var;
            if (eVar.M() == 15) {
                com.tencent.mm.network.v0 v0Var = eVar.f278071d;
                this.f73598u = ((h11.d) v0Var).f278069b.f342925a.f373509d;
                if (i18 == 0) {
                    W6();
                    if (this.f73599v == 1) {
                        gm0.j1.d().a(126, this);
                        com.tencent.mm.modelsimple.z0 z0Var = new com.tencent.mm.modelsimple.z0("", this.f73588h, this.f73589i, 0, "", this.f73584d, "", "", this.f73598u, 1, "", "", "", true, this.f73590m);
                        z0Var.L(this.f73587g);
                        z0Var.M(this.f73600w);
                        ((o45.bi) z0Var.f71456e.getReqObj()).f342909a.N = 1;
                        gm0.j1.d().g(z0Var);
                        this.f73591n = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.yf(this, z0Var));
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("regsetinfo_ticket", this.f73598u);
                    intent.putExtra("regsetinfo_user", this.f73584d);
                    intent.putExtra("regsetinfo_pwd", this.f73588h);
                    intent.putExtra("regsession_id", this.f73587g);
                    intent.putExtra("reg_3d_app_ticket", this.f73600w);
                    intent.putExtra("reg_3d_app_type", this.f73601x);
                    intent.putExtra("mobile_check_type", 1);
                    intent.putExtra("regsetinfo_ismobile", 4);
                    intent.putExtra("regsetinfo_NextControl", eVar.L());
                    intent.putExtra("key_reg_style", this.f73599v);
                    intent.setClass(this, com.tencent.mm.plugin.account.ui.RegSetInfoUI.class);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                if (i18 == -35) {
                    W6();
                    tm.a b17 = tm.a.b(str);
                    thirdAppRegisterStruct.f61234d = this.f73601x;
                    thirdAppRegisterStruct.f61235e = 7L;
                    thirdAppRegisterStruct.k();
                    if (b17 != null) {
                        b17.c(this, new com.tencent.mm.plugin.account.ui.zf(this, eVar), new com.tencent.mm.plugin.account.ui.ag(this));
                        return;
                    } else {
                        db5.e1.u(this, getString(com.tencent.mm.R.string.afq), null, new com.tencent.mm.plugin.account.ui.bg(this, eVar), new com.tencent.mm.plugin.account.ui.cg(this));
                        return;
                    }
                }
                if (i18 != -212) {
                    if (i18 == -442) {
                        r45.z66 z66Var = ((o45.eh) v0Var.getReqObj()).f342922a.A;
                        if (z66Var != null && z66Var.f391754e == 1) {
                            z17 = true;
                        }
                        if (!z17) {
                            this.f73596s = true;
                            return;
                        }
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        return;
                    }
                    W6();
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this, null, null);
                        return;
                    }
                    return;
                }
                W6();
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.class);
                intent2.putExtra("ticket", this.f73598u);
                intent2.putExtra("moble", this.f73584d);
                intent2.putExtra("regsession_id", this.f73587g);
                intent2.putExtra("reg_3d_app_ticket", this.f73600w);
                intent2.putExtra("reg_3d_app_type", this.f73601x);
                intent2.putExtra("next_controll", eVar.L());
                intent2.putExtra(dm.i4.COL_USERNAME, eVar.Q());
                intent2.putExtra("password", eVar.P());
                intent2.putExtra("nickname", eVar.O());
                intent2.putExtra("avatar_url", eVar.N());
                intent2.putExtra("mobile_check_type", 1);
                intent2.putExtra("kintent_hasavatar", this.f73590m);
                intent2.putExtra("kintent_nickname", this.f73589i);
                intent2.putExtra("kintent_password", this.f73588h);
                intent2.putExtra("key_reg_style", this.f73599v);
                intent2.putExtra("need_do_post_check", ((h11.d) v0Var).f278069b.f342925a.F);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
        }
        if (m1Var.getType() == 126) {
            com.tencent.mm.modelsimple.z0 z0Var2 = (com.tencent.mm.modelsimple.z0) m1Var;
            if (i17 != 0 || i18 != 0) {
                tm.a b19 = tm.a.b(str);
                if (b19 != null) {
                    b19.c(this, null, null);
                    return;
                }
                return;
            }
            java.lang.String str2 = this.f73584d;
            thirdAppRegisterStruct.f61234d = this.f73601x;
            thirdAppRegisterStruct.f61235e = 6L;
            thirdAppRegisterStruct.k();
            gm0.m.E();
            gm0.m.f273232u = true;
            com.tencent.mm.plugin.report.service.b1.f(1, 8);
            com.tencent.mm.plugin.report.service.b1.f(1, 3);
            com.tencent.mm.plugin.report.service.b1.f(1, 1);
            if (this.f73590m) {
                java.lang.String str3 = lp0.b.j() + "temp.avatar";
                java.lang.String str4 = lp0.b.j() + "temp.avatar.hd";
                com.tencent.mm.vfs.w6.w(str3, str4);
                com.tencent.mm.vfs.w6.h(str3);
                com.tencent.mm.sdk.platformtools.x.x(str4, 156, 156, android.graphics.Bitmap.CompressFormat.JPEG, 90, str3, true);
                kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
                java.lang.String str5 = lp0.b.j() + "temp.avatar";
                ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
                new com.tencent.mm.modelavatar.y0(this, str5, true).a(1, new com.tencent.mm.plugin.account.ui.dg(this, z0Var2, str2), new com.tencent.mm.plugin.account.ui.rf(this, z0Var2, str2));
                return;
            }
            this.f73598u = z0Var2.K();
            c01.b9.f37069c.d("login_user_name", str2);
            android.content.Intent b27 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
            b27.addFlags(67108864);
            b27.putExtra("LauncherUI.enter_from_reg", true);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(b27);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            U6();
            n71.a.e("RE900_100");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",R200_600,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R200_600"));
            sb6.append(",4");
            n71.a.c(10645, false, sb6.toString());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        W6();
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
    }
}
