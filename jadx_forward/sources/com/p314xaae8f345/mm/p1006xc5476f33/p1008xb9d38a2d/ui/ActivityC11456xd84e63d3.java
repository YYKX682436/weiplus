package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg */
/* loaded from: classes14.dex */
public class ActivityC11456xd84e63d3 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {
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
    public java.util.Map f155036J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f155037d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f155038e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f155039f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f155040g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f155042i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f155043m;

    /* renamed from: n, reason: collision with root package name */
    public int f155044n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155045o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155046p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155047q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f155048r;

    /* renamed from: s, reason: collision with root package name */
    public int f155049s;

    /* renamed from: u, reason: collision with root package name */
    public int f155051u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f155052v;

    /* renamed from: y, reason: collision with root package name */
    public boolean f155055y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f155056z;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f155041h = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa f155050t = null;

    /* renamed from: w, reason: collision with root package name */
    public boolean f155053w = true;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f155054x = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mc(this);
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db B = null;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 K = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d L = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.2
        {
            this.f39173x3fe91575 = -1399051904;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370) {
            am.gj gjVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x465423702 = c5690x46542370;
            if (c5690x465423702 == null || (gjVar = c5690x465423702.f136016g) == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileLoginOrForceReg", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg$2", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 M = null;

    public final void V6() {
        if (c01.uc.f119048d) {
            c01.uc ucVar = c01.uc.f119047c;
            ucVar.a(c01.z1.r());
            ucVar.g(c01.z1.r(), c01.z1.q());
            c01.uc.f119048d = false;
        }
    }

    public final void W6() {
        n71.a.e("R200_100");
        android.content.Intent intent = this.E == 1 ? new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class) : new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        intent.putExtra("mobile_input_purpose", 2);
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        n71.a.d(this.f155052v);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileLoginOrForceReg", "handleForceRegBt %s", java.lang.Integer.valueOf(this.I));
        if (this.I == 1) {
            h11.e eVar = new h11.e(this.f155043m, 26, "", 0, "");
            eVar.S(this.F);
            gm0.j1.d().g(eVar);
            this.f155041h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxk), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qc(this, eVar));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155056z)) {
            com.p314xaae8f345.mm.p957x53236a1b.z0 z0Var = new com.p314xaae8f345.mm.p957x53236a1b.z0("", this.A, this.f155056z, 0, "", this.f155043m, "", "", this.f155042i, this.f155051u, "", "", "", true, this.f155055y);
            z0Var.L(this.F);
            z0Var.M(this.G);
            ((o45.bi) z0Var.f152989e.mo47979x2d63726f()).f424442a.N = this.f155049s;
            gm0.j1.d().g(z0Var);
            this.f155041h = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxk), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.lc(this, z0Var));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        n71.a.e("R200_900_phone");
        intent.putExtra("regsetinfo_ticket", this.f155042i);
        intent.putExtra("regsetinfo_user", this.f155043m);
        intent.putExtra("regsetinfo_pwd", this.A);
        intent.putExtra("regsetinfo_ismobile", 4);
        intent.putExtra("regsetinfo_isForce", true);
        intent.putExtra("regsession_id", this.F);
        intent.putExtra("reg_3d_app_ticket", this.G);
        intent.putExtra("reg_3d_app_type", this.H);
        intent.putExtra("regsetinfo_NextControl", this.f155044n);
        intent.putExtra("mobile_check_type", this.f155049s);
        intent.putExtra("key_reg_style", this.E);
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11466x7d774b0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "handleForceRegBt", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/MobileLoginOrForceReg", "handleForceRegBt", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eka;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570834c20;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ekb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        this.f155037d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gwz);
        this.f155038e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.kbv);
        this.f155039f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_4);
        this.f155040g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kbq);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 c21574x28121786 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("force_reg");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 c21574x281217862 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("continue_login");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a) m79335xcc101dd9()).addFooterView(android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ek_, null));
        c21574x28121786.I = true;
        c21574x281217862.I = true;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u1h);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ult);
        if (this.f155043m.startsWith("+")) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(this.f155043m);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                str = this.f155043m;
            } else {
                str = "+" + c17 + " " + this.f155043m.substring(c17.length() + 1);
            }
        } else {
            str = "+86 " + this.f155043m;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155047q) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155048r)) {
            this.f155038e.setVisibility(0);
            this.f155037d.setVisibility(8);
            c21574x28121786.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_h));
            c21574x281217862.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_f));
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwi, str));
            jx3.f.INSTANCE.mo68477x336bdfd8(2096L, 1L, 1L, false);
        } else {
            this.f155038e.setVisibility(8);
            this.f155037d.setVisibility(0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155047q)) {
                this.f155040g.setVisibility(8);
            } else {
                this.f155040g.setText(this.f155047q);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            android.graphics.Bitmap uc6 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().uc();
            if (uc6 != null) {
                this.f155039f.setImageBitmap(uc6);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155048r)) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.oc(this, this.f155048r));
            }
            c21574x28121786.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_i, this.f155047q));
            c21574x281217862.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_g, this.f155047q));
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwh, str));
            jx3.f.INSTANCE.mo68477x336bdfd8(2096L, 0L, 1L, false);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pc(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30845) {
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        super.onCreate(bundle);
        this.f155052v = n71.a.a();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(126, this);
        gm0.j1.d().a(255, this);
        gm0.j1.d().a(145, this);
        this.E = getIntent().getIntExtra("key_reg_style", 1);
        this.f155042i = getIntent().getStringExtra("ticket");
        this.f155043m = getIntent().getStringExtra("moble");
        this.f155044n = getIntent().getIntExtra("next_controll", 0);
        this.f155045o = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
        this.f155046p = getIntent().getStringExtra("password");
        this.f155047q = getIntent().getStringExtra("nickname");
        this.f155048r = getIntent().getStringExtra("avatar_url");
        this.F = getIntent().getStringExtra("regsession_id");
        this.G = getIntent().getStringExtra("reg_3d_app_ticket");
        this.H = getIntent().getIntExtra("reg_3d_app_type", 0);
        this.f155049s = getIntent().getIntExtra("mobile_check_type", 0);
        this.f155055y = getIntent().getBooleanExtra("kintent_hasavatar", false);
        this.f155056z = getIntent().getStringExtra("kintent_nickname");
        this.A = getIntent().getStringExtra("kintent_password");
        this.I = getIntent().getIntExtra("need_do_post_check", 0);
        java.lang.String str3 = this.A;
        if (str3 == null || str3.length() < 8) {
            this.f155051u = 4;
        } else {
            this.f155051u = 1;
        }
        if (this.f155043m.startsWith("+")) {
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(this.f155043m);
            str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? this.f155043m.substring(str2.length() + 1) : this.f155043m.substring(1);
        } else {
            str = this.f155043m;
            str2 = "";
        }
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f155036J = hashMap;
        hashMap.put("origin_username", this.f155045o);
        this.f155036J.put("phone_num", a17);
        this.f155036J.put("country_num", str2);
        this.f155036J.put("reg_sessionid", this.F);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
        this.C = new x51.f();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.WXAccountEnsurePage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, this.f155036J);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 34575);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 c21574x28121786 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("force_reg");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 c21574x281217862 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("continue_login");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c21574x28121786.p(null, null), "register_continute");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c21574x28121786.p(null, null), this.f155036J);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c21574x28121786.p(null, null), 8, 34575);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c21574x281217862.p(null, null), "login_now");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c21574x281217862.p(null, null), this.f155036J);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c21574x281217862.p(null, null), 8, 34575);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
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

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.L.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if ("continue_login".equals(str)) {
            this.f155050t = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.nc(this), this.f155045o, this.f155046p, this.f155043m);
            jx3.f.INSTANCE.mo68477x336bdfd8(2096L, 3L, 1L, false);
            this.f155050t.b(this);
            return true;
        }
        if (!"force_reg".equals(str)) {
            return true;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(2096L, 2L, 1L, false);
        X6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.L.mo48813x58998cd();
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
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r24, int r25, java.lang.String r26, com.p314xaae8f345.mm.p944x882e457a.m1 r27) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11456xd84e63d3.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
