package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class LoginIndepPass extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f73351t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f73352d;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73356h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73357i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f73358m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73359n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73360o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73361p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73362q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73363r;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f73353e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73354f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f73355g = new com.tencent.mm.plugin.account.ui.w6();

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f73364s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.LoginIndepPass.1
        {
            this.__eventId = -1399051904;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent) {
            am.gj gjVar;
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent2 = loginDisasterEvent;
            if (loginDisasterEvent2 == null || (gjVar = loginDisasterEvent2.f54483g) == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginIndepPass", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginIndepPass$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginIndepPass$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public final void T6() {
        java.lang.String obj = this.f73352d.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73356h)) {
            db5.e1.i(this, com.tencent.mm.R.string.k6d, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        if (obj.equals("")) {
            db5.e1.i(this, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        hideVKB();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(this.f73356h, obj, (java.lang.String) null, 1);
        gm0.j1.d().g(v0Var);
        this.f73353e = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.i6(this, v0Var));
    }

    public boolean U6(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return true;
        }
        if (i17 == 4) {
            if (i18 != -2023) {
                if (i18 == -140) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73363r)) {
                        x51.i1.e(getContext(), str, this.f73363r);
                    }
                    return true;
                }
                if (i18 != -100) {
                    if (i18 == -9) {
                        db5.e1.i(this, com.tencent.mm.R.string.f492403gi0, com.tencent.mm.R.string.f492404gi1);
                        return true;
                    }
                    if (i18 == -1) {
                        if (gm0.j1.d().n() != 5) {
                            return false;
                        }
                        db5.e1.i(this, com.tencent.mm.R.string.h7l, com.tencent.mm.R.string.h7k);
                        return true;
                    }
                    if (i18 == -4 || i18 == -3) {
                        db5.e1.i(this, com.tencent.mm.R.string.c1t, com.tencent.mm.R.string.f492404gi1);
                        return true;
                    }
                }
            }
            gm0.m.o();
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f273235x)) {
                str2 = i65.a.r(getContext(), com.tencent.mm.R.string.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f273235x;
            }
            db5.e1.M(context2, str2, getContext().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.w5(this), new com.tencent.mm.plugin.account.ui.x5(this));
            return true;
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489231bt0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73352d = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f485339hc4);
        this.f73358m = (android.widget.Button) findViewById(com.tencent.mm.R.id.ipe);
        enableOptionMenu(false);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.gi7), new com.tencent.mm.plugin.account.ui.y5(this));
        this.f73352d.addTextChangedListener(new com.tencent.mm.plugin.account.ui.z5(this));
        this.f73352d.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.a6(this));
        this.f73352d.setOnKeyListener(new com.tencent.mm.plugin.account.ui.b6(this));
        this.f73358m.setText(getString(com.tencent.mm.R.string.gi_));
        this.f73358m.setOnClickListener(new com.tencent.mm.plugin.account.ui.f6(this));
        setBackBtn(new com.tencent.mm.plugin.account.ui.g6(this));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f73360o = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.account.ui.h6(this), 500L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                stringExtra.length();
            }
            if (intExtra == -217) {
                T6();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String string = getString(com.tencent.mm.R.string.f492408gi5);
        if (o45.wf.f343033k) {
            string = getString(com.tencent.mm.R.string.f490495wp) + j65.v.b(this);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        setMMTitle(string);
        java.lang.String stringExtra = getIntent().getStringExtra("bindmcontact_mobile");
        this.f73357i = stringExtra;
        if (stringExtra != null) {
            this.f73356h = com.tencent.mm.sdk.platformtools.c5.h(stringExtra);
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        n71.a.a();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f73364s.dead();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L200_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_200"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f73364s.alive();
        super.onResume();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L200_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_200"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L200_200");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tm.a b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginIndepPass", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f73353e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73353e = null;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73359n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f73359n = null;
        }
        boolean z17 = true;
        if (m1Var.getType() != 252 && m1Var.getType() != 701) {
            if (m1Var.getType() != 145) {
                if (U6(i17, i18, str)) {
                    return;
                }
                if (i17 == 0 && i18 == 0) {
                    return;
                }
                dp.a.makeText(this, getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                return;
            }
            gm0.j1.d().q(145, this);
            h11.e eVar = (h11.e) m1Var;
            java.lang.String str2 = ((h11.d) eVar.f278071d).f278069b.f342925a.f373522t;
            if (i18 == -41) {
                db5.e1.i(this, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                return;
            }
            if (i18 == -75) {
                db5.e1.s(this, getString(com.tencent.mm.R.string.f489997hz), "");
                return;
            }
            n71.a.e("L3");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(getClass().getName());
            sb6.append(",L3,");
            gm0.j1.b();
            sb6.append(gm0.m.f("L3"));
            sb6.append(",1");
            n71.a.c(10645, true, sb6.toString());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bindmcontact_mobile", this.f73357i);
            intent.putExtra("bindmcontact_shortmobile", str2);
            intent.putExtra("mobile_verify_purpose", 1);
            intent.putExtra("mobileverify_countdownsec", eVar.I());
            intent.putExtra("mobileverify_fb", eVar.K());
            startActivity(com.tencent.mm.plugin.account.ui.MobileVerifyUI.class, intent);
            return;
        }
        com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) m1Var;
        this.f73363r = v0Var.H();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        java.lang.String M = v0Var.M();
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73355g;
        w6Var.f74289e = M;
        w6Var.f74291g = v0Var.K();
        w6Var.f74290f = v0Var.L();
        w6Var.f74292h = v0Var.N();
        w6Var.f74286b = this.f73356h;
        w6Var.f74287c = this.f73352d.getText().toString();
        if (i18 == -75) {
            x51.i1.d(getContext());
            return;
        }
        if (i18 == -106) {
            x51.i1.c(this, str, 0);
            return;
        }
        if (i18 == -217) {
            x51.i1.f(this, x51.i.a(v0Var), i18);
            return;
        }
        if (i18 == -205) {
            this.f73360o = v0Var.I();
            this.f73361p = v0Var.R();
            this.f73362q = v0Var.J();
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginIndepPass", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.tencent.mm.sdk.platformtools.t8.G1(this.f73360o), this.f73362q);
            com.tencent.mm.plugin.account.ui.w6.f74285i = w6Var;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("auth_ticket", this.f73360o);
            intent2.putExtra("binded_mobile", this.f73361p);
            intent2.putExtra("close_safe_device_style", this.f73362q);
            intent2.putExtra("from_source", 5);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.C(this, intent2);
            return;
        }
        if (i18 == -140) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73363r)) {
                return;
            }
            x51.i1.e(this, str, this.f73363r);
            return;
        }
        if (i17 == 4 && (i18 == -16 || i18 == -17)) {
            gm0.j1.d().g(new c01.ra(new com.tencent.mm.plugin.account.ui.r5(this), null));
        } else {
            z17 = false;
        }
        if (i18 == -6 || i18 == -311 || i18 == -310) {
            gm0.j1.d().a(701, this);
            gm0.j1.d().a(252, this);
            if (this.f73354f == null) {
                this.f73354f = bb5.j.a(getContext(), com.tencent.mm.R.string.hxl, w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f, new com.tencent.mm.plugin.account.ui.t5(this), null, new com.tencent.mm.plugin.account.ui.u5(this), w6Var);
                return;
            }
            int length = w6Var.f74291g.length;
            fp.k.c();
            this.f73354f.b(w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f);
            return;
        }
        if (!z17 && (i17 != 0 || i18 != 0)) {
            if (U6(i17, i18, str)) {
                return;
            }
            if ((m1Var.getType() == 252 || m1Var.getType() == 701) && (b17 = tm.a.b(str)) != null && b17.c(this, null, null)) {
                return;
            }
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        gm0.m.E();
        x51.i1.a(this, w6Var.f74286b);
        x51.i1.b(this, new com.tencent.mm.plugin.account.ui.v5(this), false, 2);
        if (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) {
            com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct();
            foldingPhoneLoginTypeStruct.f58210d = 2L;
            foldingPhoneLoginTypeStruct.k();
        }
    }
}
