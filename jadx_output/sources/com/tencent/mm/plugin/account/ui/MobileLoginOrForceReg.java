package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class MobileLoginOrForceReg extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int N = 0;
    public java.lang.String A;
    public x51.f C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.Map f73503J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f73504d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f73505e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f73506f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73507g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73509i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73510m;

    /* renamed from: n, reason: collision with root package name */
    public int f73511n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73512o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73513p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73514q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73515r;

    /* renamed from: s, reason: collision with root package name */
    public int f73516s;

    /* renamed from: u, reason: collision with root package name */
    public int f73518u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f73519v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f73522y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f73523z;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f73508h = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.fa f73517t = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f73520w = true;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f73521x = new com.tencent.mm.plugin.account.ui.mc(this);
    public com.tencent.mm.ui.applet.SecurityImage B = null;
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct K = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();
    public final com.tencent.mm.sdk.event.IListener L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.2
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
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileLoginOrForceReg", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public com.tencent.mm.plugin.account.ui.w6 M = null;

    public final void V6() {
        if (c01.uc.f37515d) {
            c01.uc ucVar = c01.uc.f37514c;
            ucVar.a(c01.z1.r());
            ucVar.g(c01.z1.r(), c01.z1.q());
            c01.uc.f37515d = false;
        }
    }

    public final void W6() {
        n71.a.e("R200_100");
        android.content.Intent intent = this.E == 1 ? new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class) : new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", 2);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        n71.a.d(this.f73519v);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
        finish();
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileLoginOrForceReg", "handleForceRegBt %s", java.lang.Integer.valueOf(this.I));
        if (this.I == 1) {
            h11.e eVar = new h11.e(this.f73510m, 26, "", 0, "");
            eVar.S(this.F);
            gm0.j1.d().g(eVar);
            this.f73508h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.qc(this, eVar));
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73523z)) {
            com.tencent.mm.modelsimple.z0 z0Var = new com.tencent.mm.modelsimple.z0("", this.A, this.f73523z, 0, "", this.f73510m, "", "", this.f73509i, this.f73518u, "", "", "", true, this.f73522y);
            z0Var.L(this.F);
            z0Var.M(this.G);
            ((o45.bi) z0Var.f71456e.getReqObj()).f342909a.N = this.f73516s;
            gm0.j1.d().g(z0Var);
            this.f73508h = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.lc(this, z0Var));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        n71.a.e("R200_900_phone");
        intent.putExtra("regsetinfo_ticket", this.f73509i);
        intent.putExtra("regsetinfo_user", this.f73510m);
        intent.putExtra("regsetinfo_pwd", this.A);
        intent.putExtra("regsetinfo_ismobile", 4);
        intent.putExtra("regsetinfo_isForce", true);
        intent.putExtra("regsession_id", this.F);
        intent.putExtra("reg_3d_app_ticket", this.G);
        intent.putExtra("reg_3d_app_type", this.H);
        intent.putExtra("regsetinfo_NextControl", this.f73511n);
        intent.putExtra("mobile_check_type", this.f73516s);
        intent.putExtra("key_reg_style", this.E);
        intent.setClass(this, com.tencent.mm.plugin.account.ui.RegSetInfoUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "handleForceRegBt", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "handleForceRegBt", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.eka;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489301c20;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.layout.ekb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        this.f73504d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gwz);
        this.f73505e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.kbv);
        this.f73506f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_4);
        this.f73507g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kbq);
        com.tencent.mm.ui.base.preference.SummaryBelowPreference summaryBelowPreference = (com.tencent.mm.ui.base.preference.SummaryBelowPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("force_reg");
        com.tencent.mm.ui.base.preference.SummaryBelowPreference summaryBelowPreference2 = (com.tencent.mm.ui.base.preference.SummaryBelowPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("continue_login");
        ((com.tencent.mm.ui.widget.listview.PullDownListView) getListView()).addFooterView(android.view.View.inflate(getContext(), com.tencent.mm.R.layout.ek_, null));
        summaryBelowPreference.I = true;
        summaryBelowPreference2.I = true;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.u1h);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ult);
        if (this.f73510m.startsWith("+")) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.c5.c(this.f73510m);
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                str = this.f73510m;
            } else {
                str = "+" + c17 + " " + this.f73510m.substring(c17.length() + 1);
            }
        } else {
            str = "+86 " + this.f73510m;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73514q) && com.tencent.mm.sdk.platformtools.t8.K0(this.f73515r)) {
            this.f73505e.setVisibility(0);
            this.f73504d.setVisibility(8);
            summaryBelowPreference.H(getString(com.tencent.mm.R.string.o_h));
            summaryBelowPreference2.H(getString(com.tencent.mm.R.string.o_f));
            textView2.setText(getString(com.tencent.mm.R.string.gwi, str));
            jx3.f.INSTANCE.idkeyStat(2096L, 1L, 1L, false);
        } else {
            this.f73505e.setVisibility(8);
            this.f73504d.setVisibility(0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73514q)) {
                this.f73507g.setVisibility(8);
            } else {
                this.f73507g.setText(this.f73514q);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            android.graphics.Bitmap uc6 = com.tencent.mm.pluginsdk.ui.u.c().uc();
            if (uc6 != null) {
                this.f73506f.setImageBitmap(uc6);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73515r)) {
                gm0.j1.e().j(new com.tencent.mm.plugin.account.ui.oc(this, this.f73515r));
            }
            summaryBelowPreference.H(getString(com.tencent.mm.R.string.o_i, this.f73514q));
            summaryBelowPreference2.H(getString(com.tencent.mm.R.string.o_g, this.f73514q));
            textView.setText(getString(com.tencent.mm.R.string.gwh, str));
            jx3.f.INSTANCE.idkeyStat(2096L, 0L, 1L, false);
        }
        setBackBtn(new com.tencent.mm.plugin.account.ui.pc(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30845) {
            X6();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        super.onCreate(bundle);
        this.f73519v = n71.a.a();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(126, this);
        gm0.j1.d().a(255, this);
        gm0.j1.d().a(145, this);
        this.E = getIntent().getIntExtra("key_reg_style", 1);
        this.f73509i = getIntent().getStringExtra("ticket");
        this.f73510m = getIntent().getStringExtra("moble");
        this.f73511n = getIntent().getIntExtra("next_controll", 0);
        this.f73512o = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        this.f73513p = getIntent().getStringExtra("password");
        this.f73514q = getIntent().getStringExtra("nickname");
        this.f73515r = getIntent().getStringExtra("avatar_url");
        this.F = getIntent().getStringExtra("regsession_id");
        this.G = getIntent().getStringExtra("reg_3d_app_ticket");
        this.H = getIntent().getIntExtra("reg_3d_app_type", 0);
        this.f73516s = getIntent().getIntExtra("mobile_check_type", 0);
        this.f73522y = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f73523z = getIntent().getStringExtra("kintent_nickname");
        this.A = getIntent().getStringExtra("kintent_password");
        this.I = getIntent().getIntExtra("need_do_post_check", 0);
        java.lang.String str3 = this.A;
        if (str3 == null || str3.length() < 8) {
            this.f73518u = 4;
        } else {
            this.f73518u = 1;
        }
        if (this.f73510m.startsWith("+")) {
            str2 = com.tencent.mm.sdk.platformtools.c5.c(this.f73510m);
            str = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? this.f73510m.substring(str2.length() + 1) : this.f73510m.substring(1);
        } else {
            str = this.f73510m;
            str2 = "";
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f73503J = hashMap;
        hashMap.put("origin_username", this.f73512o);
        this.f73503J.put("phone_num", a17);
        this.f73503J.put("country_num", str2);
        this.f73503J.put("reg_sessionid", this.F);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitle("");
        initView();
        this.C = new x51.f();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.WXAccountEnsurePage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, this.f73503J);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 34575);
        com.tencent.mm.ui.base.preference.SummaryBelowPreference summaryBelowPreference = (com.tencent.mm.ui.base.preference.SummaryBelowPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("force_reg");
        com.tencent.mm.ui.base.preference.SummaryBelowPreference summaryBelowPreference2 = (com.tencent.mm.ui.base.preference.SummaryBelowPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("continue_login");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(summaryBelowPreference.p(null, null), "register_continute");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(summaryBelowPreference.p(null, null), this.f73503J);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(summaryBelowPreference.p(null, null), 8, 34575);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(summaryBelowPreference2.p(null, null), "login_now");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(summaryBelowPreference2.p(null, null), this.f73503J);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(summaryBelowPreference2.p(null, null), 8, 34575);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(126, this);
        gm0.j1.d().q(255, this);
        gm0.j1.d().q(145, this);
        x51.f fVar = this.C;
        if (fVar != null) {
            fVar.a();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.L.dead();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if ("continue_login".equals(str)) {
            this.f73517t = new com.tencent.mm.plugin.account.ui.fa(new com.tencent.mm.plugin.account.ui.nc(this), this.f73512o, this.f73513p, this.f73510m);
            jx3.f.INSTANCE.idkeyStat(2096L, 3L, 1L, false);
            this.f73517t.b(this);
            return true;
        }
        if (!"force_reg".equals(str)) {
            return true;
        }
        jx3.f.INSTANCE.idkeyStat(2096L, 2L, 1L, false);
        X6();
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.L.alive();
        super.onResume();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",R200_600,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_600"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        n71.a.d("R200_600");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03aa  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, com.tencent.mm.modelbase.m1 r27) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
