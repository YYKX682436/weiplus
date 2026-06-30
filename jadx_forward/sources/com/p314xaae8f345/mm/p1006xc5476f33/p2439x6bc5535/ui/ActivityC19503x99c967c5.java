package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI */
/* loaded from: classes11.dex */
public class ActivityC19503x99c967c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f269493J = 0;
    public android.widget.CheckBox A;
    public android.widget.RelativeLayout B;
    public android.widget.CheckBox C;

    /* renamed from: h, reason: collision with root package name */
    public long f269498h;

    /* renamed from: i, reason: collision with root package name */
    public int f269499i;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f269502o;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f269504q;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f269509v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f269510w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f269511x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f269512y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f269513z;

    /* renamed from: d, reason: collision with root package name */
    public int f269494d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f269495e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f269496f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f269497g = null;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f269500m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f269501n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f269503p = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f269505r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f269506s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f269507t = "";

    /* renamed from: u, reason: collision with root package name */
    public int f269508u = 0;
    public boolean D = false;
    public boolean E = false;
    public int F = 0;
    public java.lang.String G = "";
    public boolean H = true;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.11
        {
            this.f39173x3fe91575 = 1684674094;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e2 = c6268x26920e3e;
            if (c6268x26920e3e2.f136517g.f88753a.equals("continue_login")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "continue login, only set isStartVerify false");
                com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5.this.D = false;
            } else if (c6268x26920e3e2.f136517g.f88753a.equals("cancel_login")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "cancel login, but do nothing");
            }
            return false;
        }
    };

    public final boolean U6() {
        c01.d9.e().g(new iy4.x0(this.f269495e));
        this.D = false;
        if (X6()) {
            this.H = false;
            q61.j.e(q61.j.f441801h, 1, 2, 2, 0);
        }
        return true;
    }

    public final boolean V6(boolean z17, boolean z18) {
        if (X6()) {
            this.H = false;
            java.lang.String str = q61.j.f441801h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "reportComfirmPageClk");
            java.util.HashMap d17 = q61.j.d();
            d17.put("page_id", "50368");
            d17.put("page_name", "LoginAssistAgreePage");
            d17.put("login_ticket_id", str);
            d17.put("has_sync_chat_login", java.lang.Integer.valueOf(z17 ? 1 : 0));
            d17.put("view_id", "login_agree_assist");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", d17, 34575);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "doDeviceWXLogin synchronize:%s, autoLogin:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        iy4.z0 z0Var = new iy4.z0(this.f269495e, this.f269497g, z17, z18, this.f269498h, this.F);
        c01.d9.e().g(z0Var);
        this.f269500m = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.pag), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.a(this, z0Var));
        return true;
    }

    public final void W6() {
        int i17 = this.f269494d;
        if (i17 != 0) {
            if (i17 == -2) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("BaseScanUI_select_scan_mode", 1);
                intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
                intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
                intent.putExtra("key_scan_report_enter_scene", 29);
                intent.putExtra("from_album", false);
                intent.putExtra("show_intro", false);
                intent.setFlags(65536);
                j45.l.j(this, "scanner", ".ui.BaseScanUI", intent, null);
                finish();
                return;
            }
            return;
        }
        boolean isChecked = this.A.isChecked();
        if (!this.f269505r) {
            V6(false, isChecked);
            return;
        }
        boolean isChecked2 = this.C.isChecked();
        this.f269506s = false;
        if (isChecked2) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN, java.lang.Boolean.TRUE);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN;
            if (((java.lang.Boolean) p17.m(u3Var, java.lang.Boolean.TRUE)).booleanValue()) {
                this.f269506s = true;
            }
            c01.d9.b().p().x(u3Var, java.lang.Boolean.FALSE);
        }
        V6(this.f269505r && isChecked2, isChecked);
    }

    public final boolean X6() {
        java.lang.String str = this.f269495e;
        if (str == null) {
            return false;
        }
        return str.substring(str.lastIndexOf("/") + 1).equals(q61.j.f441801h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y6(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            int r0 = i65.a.b(r4, r6)
            int r5 = r5 / r0
            android.widget.TextView r0 = r4.f269511x
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r1 = r4.f269512y
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L2a
            android.widget.TextView r1 = r4.f269512y
            android.text.TextPaint r1 = r1.getPaint()
            float r1 = r1.measureText(r7)
            int r1 = (int) r1
            if (r0 <= 0) goto L2a
            int r3 = r1 / r0
            int r3 = r3 + r2
            int r1 = r1 % r0
            if (r1 <= 0) goto L2b
            int r3 = r3 + 1
            goto L2b
        L2a:
            r3 = r2
        L2b:
            android.widget.TextView r1 = r4.f269511x
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L49
            android.widget.TextView r1 = r4.f269511x
            android.text.TextPaint r1 = r1.getPaint()
            float r7 = r1.measureText(r7)
            int r7 = (int) r7
            if (r0 <= 0) goto L49
            int r1 = r7 / r0
            int r1 = r1 + r2
            int r7 = r7 % r0
            if (r7 <= 0) goto L4a
            int r1 = r1 + 1
            goto L4a
        L49:
            r1 = r2
        L4a:
            int r3 = r3 + r1
            if (r3 <= r5) goto L4e
            return r2
        L4e:
            int r5 = i65.a.b(r4, r6)
            android.widget.TextView r6 = r4.f269512y
            float r5 = (float) r5
            r6.setTextSize(r2, r5)
            android.widget.TextView r6 = r4.f269511x
            r6.setTextSize(r2, r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19503x99c967c5.Y6(int, int, java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (X6() && this.H) {
            q61.j.e(q61.j.f441801h, 1, 2, 1, 0);
        }
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570238a43;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mac);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.b(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        mo78530x8b45058f();
        this.f269495e = getIntent().getStringExtra("intent.key.login.url");
        this.f269496f = getIntent().getStringExtra("intent.key.auto.login.switch.tip.string");
        this.f269494d = getIntent().getIntExtra("intent.key.type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.title.string");
        this.F = getIntent().getIntExtra("intent.key.icon.type", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.ok.string");
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.cancel.string");
        java.lang.String stringExtra4 = getIntent().getStringExtra("intent.key.content.string");
        this.f269497g = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f269498h = getIntent().getLongExtra("intent.key.login.client.version", 0L);
        this.f269499i = getIntent().getIntExtra("intent.key.function.control", 0);
        this.f269501n = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        this.G = getIntent().getStringExtra("intent.key.usage.link");
        this.f269507t = getIntent().getStringExtra("intent.key.spam.url");
        this.f269508u = getIntent().getIntExtra("intent.key.multi.device.tips.type", 0);
        this.f269509v = getIntent().getStringExtra("intent.key.multi.device.tips.string");
        this.E = getIntent().getBooleanExtra("intent.key.need.show.privacy.agreement", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "type:%s title:%s ok:%s content:%s usage:%s iconType:%s multiDeviceTipsType:%s multiDeviceTipsStr:%s, funcCtrl:%s", java.lang.Integer.valueOf(this.f269494d), stringExtra, stringExtra2, stringExtra4, this.G, java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(this.f269508u), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f269509v), java.lang.Integer.valueOf(this.f269499i));
        this.f269510w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568632ni1);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f269510w.setText(stringExtra);
        }
        com.p314xaae8f345.mm.ui.bk.s0(this.f269510w.getPaint());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5713xf4e10b78 c5713xf4e10b78 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5713xf4e10b78();
        c5713xf4e10b78.e();
        am.yj yjVar = c5713xf4e10b78.f136034g;
        int i17 = yjVar.f89998a;
        int i18 = yjVar.f89999b;
        int i19 = yjVar.f90000c;
        int i27 = this.F;
        if (i27 == 1) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 3);
        } else if (i27 == 2) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 4);
        } else if (i27 != 8) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 0);
        } else {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOGIN_EXT_DEVICE_INFO_INT, 2);
        }
        this.f269512y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.juq);
        if (this.f269508u != 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f269509v)) {
            this.f269508u = 0;
        }
        this.B = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.nuk);
        this.C = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.nuj);
        if (i17 >= 0) {
            boolean z17 = (this.f269499i & 1) > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "msgsynchronize needCheckedSync[%b], iconType[%d]", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.F));
            int i28 = this.F;
            if ((i28 == 1 && this.f269498h >= i18) || ((i28 == 2 && this.f269498h >= i19) || i28 == 8 || i28 == 3 || i28 == 11 || i28 == 16 || i28 == 17)) {
                this.f269505r = true;
                this.B.setVisibility(this.f269501n ? 0 : 8);
                if (z17 && ((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MSG_SYNCHRONIZE_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue()) {
                    this.C.setChecked(true);
                } else {
                    this.C.setChecked(false);
                }
                this.B.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.c(this));
            }
        }
        this.f269513z = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.a9j);
        this.A = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.a9h);
        if ((this.f269499i & 2) > 0) {
            this.f269513z.setVisibility(0);
            this.A.setChecked((this.f269499i & 4) > 0);
            this.f269513z.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.f(this));
        } else {
            this.f269513z.setVisibility(8);
        }
        this.f269511x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nhp);
        this.A.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.g(this, stringExtra4));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
            int i29 = this.F;
            if (i29 != 1 && i29 != 11 && i29 != 2 && i29 != 8 && i29 != 3 && i29 != 17) {
                mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80136xebd52499, new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.i(this));
            } else if (this.f269501n) {
                mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80136xebd52499, new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.h(this));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nhu);
        int i37 = this.F;
        if (i37 == 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78894xd1c45968);
        } else if (i37 == 2) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78892x66c6c87a);
        } else if (i37 == 3) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78890x7210adbf);
        } else if (i37 == 5) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78898xcc96a346);
        } else if (i37 == 6) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79070x2b9e9973);
        } else if (i37 == 8) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78887x4c570eee);
        } else if (i37 == 10) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78889x2b74a563);
        } else if (i37 == 14) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78897xd0c3c93a);
        } else if (i37 == 17) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80076xd59d819);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78894xd1c45968);
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pjd);
        this.f269504q = textView;
        textView.setText(stringExtra3);
        this.f269504q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.j(this));
        com.p314xaae8f345.mm.ui.bk.s0(this.f269504q.getPaint());
        this.f269502o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.pjb);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            this.f269502o.setVisibility(4);
        } else {
            this.f269502o.setText(stringExtra2);
            int i38 = this.f269494d;
            if (i38 == 0) {
                this.f269502o.setEnabled(true);
            } else if (i38 == -1) {
                this.f269502o.setEnabled(false);
                if (this.F == 5) {
                    this.f269504q.setVisibility(8);
                }
            } else if (i38 == -2) {
                this.f269502o.setEnabled(true);
            }
        }
        this.f269502o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k(this));
        if (this.E) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this);
            java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e();
            }
            java.lang.String str = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x0(obj)) ? obj : "";
            arrayList.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.l3e, f17, str));
            arrayList.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.l3n, f17, str));
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ma_);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ioe));
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.io_));
            ((ke0.e) xVar).sj(this, arrayList, string, arrayList2, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.r8b));
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.r8a);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.r8_);
            checkBox.setChecked(false);
            this.f269502o.setEnabled(false);
            checkBox.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.l(this, checkBox));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nuc);
        iy4.z zVar = (iy4.z) i95.n0.c(iy4.z.class);
        long j17 = this.f269498h;
        int i39 = this.F;
        zVar.getClass();
        boolean b17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.m.f298233c.b(j17, i39);
        ot5.g.c("MicroMsg.ExtDeviceService", "getSyncRecordTrigger: " + b17);
        if (b17) {
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.pgz));
        } else {
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.l7u));
        }
        c01.d9.e().a(972, this);
        c01.d9.e().a(973, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 60001) {
            if (intent != null) {
                android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                if (i18 == -1 && bundleExtra != null) {
                    java.lang.String string = bundleExtra.getString("go_next", "");
                    if (string.equals("continue_login")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "continue login");
                        this.D = false;
                        W6();
                    } else if (string.equals("cancel_login")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "cancel login");
                        U6();
                    }
                }
            }
            if (this.D) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "do cancel for other scenes");
                U6();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aao));
        mo43517x10010bd5();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        this.I.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.I.mo48814x2efc64();
        super.onDestroy();
        c01.d9.e().q(972, this);
        c01.d9.e().q(973, this);
        if (isChangingConfigurations() || !this.f269503p) {
            return;
        }
        gm0.j1.d().g(new iy4.x0(this.f269495e));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        android.app.ProgressDialog progressDialog = this.f269500m;
        java.lang.String str3 = null;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f269500m = null;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "onSceneEnd type[%d], [%d, %d]", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            c01.d9.e().q(972, this);
            if (m1Var.mo808xfb85f7b0() == 972) {
                iy4.z0 z0Var = (iy4.z0) m1Var;
                boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_device_to_device_msg_sync, 1) == 1;
                if ((z0Var.f377570f || this.f269506s) && z17) {
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = z0Var.f377569e;
                    r45.zm0 zm0Var = (r45.zm0) oVar.f152244b.f152233a;
                    byte[] g17 = (zm0Var == null || (gVar = zm0Var.f473740d) == null) ? null : gVar.g();
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7 c5714xc4ebffe7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7();
                    am.zj zjVar = c5714xc4ebffe7.f136035g;
                    zjVar.f90103a = g17;
                    zjVar.f90104b = this.F;
                    zjVar.f90105c = this.f269506s;
                    r45.zm0 zm0Var2 = (r45.zm0) oVar.f152244b.f152233a;
                    if (zm0Var2 != null && (str2 = zm0Var2.f473741e) != null) {
                        str3 = str2;
                    }
                    zjVar.f90106d = str3;
                    c5714xc4ebffe7.e();
                }
            } else {
                m1Var.mo808xfb85f7b0();
            }
            this.f269494d = 0;
            this.f269503p = false;
            finish();
            return;
        }
        if (i18 == -1) {
            this.f269494d = -1;
        } else if (i18 == -2) {
            this.f269494d = -2;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nhp)).setVisibility(0);
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nhp)).setText(str);
        }
        int i19 = this.f269494d;
        if (i19 == -1) {
            android.widget.Button button = this.f269502o;
            if (button != null) {
                button.setEnabled(false);
            }
            android.widget.TextView textView = this.f269511x;
            if (textView != null) {
                textView.setVisibility(0);
                this.f269511x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.maa);
            }
        } else if (i19 == -2) {
            android.widget.Button button2 = this.f269502o;
            if (button2 != null) {
                button2.setEnabled(true);
                this.f269502o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l7v);
            }
            android.widget.TextView textView2 = this.f269511x;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f269511x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mab);
            }
            android.widget.TextView textView3 = this.f269504q;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtDeviceWXLoginUI", "[oneliang][onSceneEnd]errType:%s,errCode:%s,errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (X6()) {
            q61.j.e(q61.j.f441801h, 1, 3, 0, 6);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(my4.c.class);
    }
}
