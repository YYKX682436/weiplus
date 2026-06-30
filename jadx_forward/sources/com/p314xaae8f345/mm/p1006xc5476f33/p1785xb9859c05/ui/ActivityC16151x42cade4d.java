package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI */
/* loaded from: classes8.dex */
public class ActivityC16151x42cade4d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f224254d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224255e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f224256f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f224257g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f224258h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f224259i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f224260m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f224261n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f224262o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f224263p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f224264q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f224265r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f224266s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f224267t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f224268u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f224269v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f224270w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f224271x = false;

    /* renamed from: y, reason: collision with root package name */
    public android.database.Cursor f224272y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f224273z = false;
    public final q83.d A = new q83.d();

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16151x42cade4d activityC16151x42cade4d, java.lang.String str) {
        activityC16151x42cade4d.getClass();
        if (t83.f.c(activityC16151x42cade4d)) {
            android.content.Intent intent = new android.content.Intent(activityC16151x42cade4d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16134x74658289.class);
            if (activityC16151x42cade4d.f224273z) {
                intent.putExtra("IPCallTalkUI_dialScene", 4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12059, 0, 0, 0, 0, 4);
            } else {
                intent.putExtra("IPCallTalkUI_dialScene", 2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12059, 0, 0, 0, 0, 2);
            }
            intent.putExtra("IPCallTalkUI_contactId", activityC16151x42cade4d.f224267t);
            intent.putExtra("IPCallTalkUI_nickname", activityC16151x42cade4d.f224265r);
            intent.putExtra("IPCallTalkUI_phoneNumber", t83.f.i(str));
            intent.putExtra("IPCallTalkUI_toWechatUsername", activityC16151x42cade4d.f224266s);
            activityC16151x42cade4d.startActivityForResult(intent, 1001);
            activityC16151x42cade4d.f224270w = true;
        }
    }

    public final void U6() {
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cb8, (android.view.ViewGroup) this.f224258h, false);
        this.f224258h.addView(inflate);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m5(this));
    }

    public final void V6(java.lang.String str, int i17, boolean z17) {
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570903cb5, (android.view.ViewGroup) this.f224257g, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3j);
        if (z17) {
            linearLayout.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj));
        } else {
            linearLayout.setBackgroundDrawable(null);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567834kv0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kuz);
        textView2.setText(t83.c.c(t83.f.i(str)));
        textView.setText(t83.c.n(i17));
        inflate.setClickable(true);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o5(this, str));
        inflate.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p5(this, textView2));
        this.f224257g.addView(inflate);
    }

    public final void W6(s83.l lVar, boolean z17, int i17) {
        if (lVar != null) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cb7, (android.view.ViewGroup) this.f224258h, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.l_z);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567989la1);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567990la2);
            textView2.setText(t83.c.c(lVar.f68176x5b3f2672));
            long j17 = lVar.f68174xa7075739;
            if (j17 > 0) {
                textView3.setText(t83.f.a(j17));
            } else {
                textView3.setText(t83.f.h(lVar.f68177x10a0fed7));
            }
            textView.setText(t83.f.b(lVar.f68173x138777d0));
            if (z17) {
                inflate.setBackgroundDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.av9));
                int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562116a81);
                inflate.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            if (1 == i17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams();
                layoutParams.height = i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.a7b);
                inflate.setLayoutParams(layoutParams);
            }
            this.f224258h.addView(inflate);
        }
    }

    public final void X6() {
        android.database.Cursor E;
        s83.c D0;
        if (!this.f224273z) {
            this.f224258h.setVisibility(8);
            this.f224262o.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224267t)) {
            E = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d.E("IPCallRecord", s83.m.f486420f, "phonenumber=?", new java.lang.String[]{this.f224268u}, null, null, "calltime desc limit 4");
        } else {
            java.lang.String str = this.f224267t;
            E = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().D0(str)) != null) {
                long j17 = D0.f72763xa3c65b86;
                if (j17 != -1) {
                    E = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d.E("IPCallRecord", s83.m.f486420f, "addressId=?", new java.lang.String[]{j17 + ""}, null, null, "calltime desc limit 4");
                }
            }
        }
        if (E == null || E.getCount() <= 0) {
            this.f224258h.setVisibility(8);
            this.f224262o.setVisibility(8);
            return;
        }
        try {
            try {
                if (E.moveToFirst()) {
                    int i17 = 0;
                    while (!E.isAfterLast()) {
                        s83.l lVar = new s83.l();
                        lVar.mo9015xbf5d97fd(E);
                        i17++;
                        boolean z17 = i17 >= 3;
                        W6(lVar, z17, E.getCount());
                        if (z17) {
                            break;
                        } else {
                            E.moveToNext();
                        }
                    }
                    if (i17 <= 0) {
                        this.f224258h.setVisibility(8);
                    } else if (E.getCount() >= 4) {
                        U6();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallUserProfileUI", "initRecordList, error: %s", e17.getMessage());
            }
        } finally {
            E.close();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blu;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12061, 0, 1, 0, 0, 0, 0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n5(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g49);
        this.f224254d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_4);
        this.f224255e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nun);
        this.f224256f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pju);
        this.f224257g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.l_f);
        this.f224259i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.l_d);
        this.f224261n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.l_c);
        this.f224260m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.l_b);
        this.f224258h = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567988la0);
        this.f224262o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lpt);
        this.f224263p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hez);
        this.f224264q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567984l94);
        this.f224267t = getIntent().getStringExtra("IPCallProfileUI_contactid");
        this.f224265r = getIntent().getStringExtra("IPCallProfileUI_systemUsername");
        this.f224266s = getIntent().getStringExtra("IPCallProfileUI_wechatUsername");
        this.f224268u = getIntent().getStringExtra("IPCallProfileUI_phonenumber");
        this.f224273z = getIntent().getBooleanExtra("IPCallProfileUI_isNeedShowRecord", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224267t)) {
            android.graphics.Bitmap d17 = t83.c.d(this, this.f224267t, false);
            this.f224269v = d17;
            if (d17 != null) {
                this.f224254d.setImageBitmap(d17);
            }
        }
        if (this.f224269v == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224266s)) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str = this.f224266s;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
            this.f224269v = a17;
            if (a17 != null) {
                this.f224254d.setImageBitmap(a17);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224265r)) {
            this.f224255e.setText(this.f224265r);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224268u)) {
            this.f224255e.setText(t83.c.c(this.f224268u));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224266s) || this.f224266s.endsWith("@stranger")) {
            this.f224256f.setVisibility(8);
        } else {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = this.f224266s;
            ((sg3.a) v0Var).getClass();
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4_, c01.a2.e(str2));
            android.widget.TextView textView = this.f224256f;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, string));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224267t)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.READ_CONTACTS", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
                return;
            } else {
                android.database.Cursor query = getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{this.f224267t}, null);
                this.f224272y = query;
                this.f224271x = query.getCount() <= 1;
            }
        }
        X6();
        this.f224261n.setVisibility(8);
        this.f224260m.setVisibility(8);
        this.f224259i.setVisibility(8);
        this.f224264q.setVisibility(8);
        this.f224263p.setVisibility(8);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224266s) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224265r)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f224266s, true);
            if (n17 != null && !n17.r2()) {
                this.f224264q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u5(this));
                this.f224264q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573874g44);
                this.f224264q.setVisibility(0);
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224267t) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224265r)) {
            this.f224264q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v5(this));
            this.f224264q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g47);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224268u)) {
            this.f224260m.setVisibility(0);
            this.f224261n.setVisibility(0);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("phone", "10086");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, false, false)) {
                this.f224259i.setVisibility(0);
            }
            this.f224259i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w5(this));
            this.f224260m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x5(this));
            this.f224261n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l5(this));
            this.f224264q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v5(this));
            this.f224264q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.g47);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = this.f224272y;
        if (cursor == null || cursor.getCount() <= 0) {
            this.f224257g.setVisibility(8);
            return;
        }
        try {
            try {
                if (this.f224272y.moveToFirst()) {
                    int i17 = 0;
                    while (!this.f224272y.isAfterLast()) {
                        i17++;
                        android.database.Cursor cursor2 = this.f224272y;
                        java.lang.String string2 = cursor2.getString(cursor2.getColumnIndex("data1"));
                        android.database.Cursor cursor3 = this.f224272y;
                        int i18 = cursor3.getInt(cursor3.getColumnIndex("data2"));
                        if (!arrayList.contains(string2)) {
                            arrayList.add(string2);
                            if (i17 == this.f224272y.getCount()) {
                                V6(string2, i18, false);
                            } else {
                                V6(string2, i18, true);
                            }
                        }
                        this.f224272y.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallUserProfileUI", "initPhoneNumberList error: %s", e17.getMessage());
            }
        } finally {
            this.f224272y.close();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f224270w) {
            this.f224270w = false;
            this.f224258h.removeAllViews();
            X6();
        }
    }
}
