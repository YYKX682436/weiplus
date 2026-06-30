package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 129)
/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI */
/* loaded from: classes14.dex */
public class ActivityC11461x47892174 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int Y = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b C;
    public android.graphics.Bitmap E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f155095J;
    public java.lang.String K;
    public java.lang.String L;
    public d71.d R;
    public d71.e S;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f155097e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f155098f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f155099g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155100h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f155101i;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155107r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155108s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f155109t;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f f155112w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f155113x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f155114y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f155096d = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f155102m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f155103n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f155104o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f155105p = null;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f155106q = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f155110u = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f155111v = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f155115z = false;
    public int D = 0;
    public int M = 0;
    public boolean N = true;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 P = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();
    public java.lang.String Q = "";
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d T = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.1
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileRegAIOUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public java.lang.String U = "";
    public final x51.c1 V = new x51.c1();
    public boolean W = false;
    public int X = 60;

    public final void U6(java.lang.String str) {
        if (c71.b.a(this, this.f155114y.m78931xfb85ada3().toString())) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155107r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.V.a(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.af(this, str));
        }
    }

    public final boolean V6() {
        boolean z17;
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155104o);
        android.text.Editable[] editableArr = {this.f155099g.getText(), this.f155114y.m78931xfb85ada3(), this.C.m78931xfb85ada3()};
        for (int i17 = 0; i17 < 3; i17++) {
            android.text.Editable editable = editableArr[i17];
            if (editable == null || editable.toString().length() == 0) {
                z17 = false;
                break;
            }
        }
        z17 = true;
        boolean z19 = z18 & (z17 && this.f155106q);
        if (z19) {
            this.f155113x.setEnabled(true);
        } else {
            this.f155113x.setEnabled(false);
        }
        return z19;
    }

    public final void W6() {
        synchronized (this) {
            if (!this.W) {
                boolean z17 = true;
                this.W = true;
                finish();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("bindmcontact_mobile", this.f155110u + " " + X6());
                intent.putExtra("bindmcontact_shortmobile", this.f155111v);
                intent.putExtra("country_name", this.f155103n);
                intent.putExtra("couttry_code", this.f155104o);
                intent.putExtra("mobileverify_countdownsec", this.X);
                intent.putExtra("kintent_nickname", this.C.m78931xfb85ada3().toString());
                intent.putExtra("kintent_password", this.f155114y.m78931xfb85ada3().toString());
                intent.putExtra("kintent_hasavatar", this.f155115z);
                intent.putExtra("key_reg_style", 1);
                intent.putExtra("regsession_id", this.F);
                intent.putExtra("reg_3d_app_ticket", this.I);
                intent.putExtra("reg_3d_app_type", this.f155095J);
                intent.putExtra("mobile_verify_purpose", 2);
                if (this.M != 3) {
                    z17 = false;
                }
                intent.putExtra("mobileverify_useDialCode", z17);
                m78604xa4df9991(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.class, intent);
            }
        }
    }

    public final java.lang.String X6() {
        java.lang.String phoneNumber = this.f155099g.getText().toString().trim().replace("+86", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneNumber, "phoneNumber");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\D");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(phoneNumber).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final void Y6() {
        int i17;
        if (this.M == 3) {
            W6();
            return;
        }
        this.f155107r = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574330hw3), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.Cif(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileRegAIOUI", "isMobile:%s, isMobileOpen:%s, SIM iso:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(this)), java.lang.Boolean.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40087x5bd0d78c(this)), wo.w0.o());
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(this) || (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40087x5bd0d78c(this) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wo.w0.o()))) {
                i17 = 2;
                int i18 = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileRegAIOUI", "select mobile check type %d", java.lang.Integer.valueOf(i18));
                h11.e eVar = new h11.e(this.f155110u + this.f155111v, 14, "", 0, "", i18);
                eVar.S(this.F);
                gm0.j1.d().g(eVar);
            }
        }
        i17 = 1;
        int i182 = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileRegAIOUI", "select mobile check type %d", java.lang.Integer.valueOf(i182));
        h11.e eVar2 = new h11.e(this.f155110u + this.f155111v, 14, "", 0, "", i182);
        eVar2.S(this.F);
        gm0.j1.d().g(eVar2);
    }

    public final void Z6() {
        n71.a.e(null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",RE200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("RE200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    public final void a7(java.lang.String countryISOCode) {
        this.f155104o = countryISOCode;
        d71.e eVar = this.S;
        if (eVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(countryISOCode, "countryISOCode");
            eVar.f308413f = countryISOCode;
            eVar.f308415h = "";
            eVar.f308414g = false;
            android.widget.EditText editText = this.f155099g;
            if (editText != null) {
                this.S.a(editText.getText());
            }
        }
    }

    public final void b7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155103n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155104o)) {
            this.f155098f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwa));
        } else {
            this.f155098f.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.b(this.f155103n, this.f155104o));
        }
    }

    public final void c7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155107r;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f155107r = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        gm0.j1.d().g(new v61.m0(1, 1, this.H));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cdr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        d71.d dVar = new d71.d();
        this.R = dVar;
        dVar.c(mo55332x76847179());
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jlt);
        if (findViewById != null) {
            com.p314xaae8f345.mm.ui.a4.f(findViewById);
        }
        this.f155097e = findViewById(com.p314xaae8f345.mm.R.id.cjz);
        this.f155098f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565488ck1);
        this.f155100h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lru);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.f568123ls1);
        this.f155101i = c21490xb2dd0b6b;
        c21490xb2dd0b6b.m78937xc17f97e2(3);
        android.widget.EditText m78930xd454f3ba = this.f155101i.m78930xd454f3ba();
        this.f155099g = m78930xd454f3ba;
        d71.e eVar = new d71.e(m78930xd454f3ba, this.R, this.f155104o);
        this.S = eVar;
        this.f155099g.addTextChangedListener(eVar);
        this.f155112w = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21536x74125e7f) findViewById(com.p314xaae8f345.mm.R.id.vd8);
        this.f155113x = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.lrn);
        this.A = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mnp);
        this.B = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.mnr);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.lrz);
        this.f155114y = c21490xb2dd0b6b2;
        ck5.f b17 = ck5.f.b(c21490xb2dd0b6b2.m78930xd454f3ba());
        b17.f124094f = 0;
        b17.f124093e = 16;
        b17.d(null);
        this.C = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.lrp);
        this.f155112w.m79304xb0efb15f(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.jf(this));
        boolean[] zArr = {true};
        this.f155099g.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.kf(this, zArr));
        this.f155099g.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.lf(this, zArr));
        this.f155114y.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mf(this));
        this.f155114y.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.nf(this));
        this.C.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.of(this));
        this.C.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pf(this));
        boolean[] zArr2 = {false};
        this.f155113x.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qf(this, zArr2));
        this.f155113x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ue(this, zArr2));
        this.f155113x.setEnabled(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.b()) {
            a7("1");
            this.f155103n = u11.b.c(this.f155104o);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155104o)) {
            this.f155103n = getString(com.p314xaae8f345.mm.R.C30867xcad56011.blk);
            a7(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.blj)));
        } else {
            this.f155103n = u11.b.c(this.f155104o);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
            this.f155100h.setText(this.G);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155103n) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155104o)) {
            this.f155105p = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegByMobileRegAIOUI", "tm.getSimCountryIso()" + this.f155105p);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155105p)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
            } else {
                u11.a a17 = u11.b.a(this.f155105p);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
                } else {
                    this.f155103n = a17.f505262c;
                    a7(a17.f505261b);
                }
            }
        }
        b7();
        java.lang.String str = this.f155102m;
        java.lang.String str2 = "";
        if (str != null && !str.equals("")) {
            this.f155099g.setText(this.f155102m);
        }
        this.f155097e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ve(this));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.we(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        this.A.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xe(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H)) {
            gm0.j1.e().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ye(this));
        } else {
            this.C.m78938x765074af(this.K);
            gm0.j1.e().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ze(this));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Q)) {
            android.view.View view = this.f155097e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f155099g.setEnabled(false);
            this.f155099g.setText("+86 " + this.Q);
            this.f155099g.setTextColor(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        }
        if (o45.wf.f424566k) {
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp) + j65.v.b(this);
        } else {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        mo54450xbf7c1df6(str2);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            m78607xef685e15(com.p314xaae8f345.mm.ui.bk.C());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30846) {
            if (i18 == -1 && V6()) {
                Y6();
                n71.a.e("RE200_250");
                return;
            }
            return;
        }
        if (i17 == 30847) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("agree_privacy")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 1L, 1L, false);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(712L, 2L, 1L, false);
            this.N = false;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H)) {
                c7();
                return;
            }
            U6(this.f155110u + this.f155111v);
            return;
        }
        if (i18 != 100) {
            android.graphics.Bitmap Vi = ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent);
            this.E = Vi;
            if (Vi != null) {
                this.A.setImageBitmap(Vi);
                this.f155115z = true;
                this.B.setVisibility(8);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f155103n = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        a7(stringExtra2);
        java.lang.String stringExtra3 = intent.getStringExtra("iso_code");
        this.f155105p = stringExtra3 != null ? stringExtra3 : "";
        if (!u11.c.e(this.f155104o)) {
            b7();
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.K) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            b7();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        intent2.putExtra("mobile_input_purpose", 2);
        intent2.putExtra("couttry_code", this.f155104o);
        intent2.putExtra("country_name", this.f155103n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        super.setRequestedOrientation(1);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f155103n = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        a7(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.g(stringExtra2));
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f155105p = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("bindmcontact_shortmobile");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f155102m = stringExtra4;
        this.G = getIntent().getStringExtra("register_title");
        this.K = getIntent().getStringExtra("register_nick_name");
        this.L = getIntent().getStringExtra("register_avatar");
        this.H = getIntent().getStringExtra("third_app_token");
        this.f155095J = getIntent().getIntExtra("reg_3d_app_type", 0);
        java.lang.String stringExtra5 = getIntent().getStringExtra("KForceMobileNum");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.Q = stringExtra5;
        java.lang.String stringExtra6 = getIntent().getStringExtra("KForceMobileMsgId");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f155096d = stringExtra6;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Q)) {
            this.f155096d = "";
        } else {
            this.f155110u = "+86";
            a7("86");
            this.f155111v = this.Q;
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        fo3.s.INSTANCE.E7("ie_reg");
        this.P.k();
        ((java.util.LinkedHashMap) this.R.f308410a).clear();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        Z6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155107r;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.T.mo48814x2efc64();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(132, this);
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qc.f34715x366c91de, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(701, this);
        n71.a.d("RE200_100");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.T.mo48813x58998cd();
        super.onResume();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qc.f34715x366c91de, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(701, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",RE200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("RE200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        this.D = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x03c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c6  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(j71.b.class);
    }
}
