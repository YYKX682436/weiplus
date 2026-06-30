package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI */
/* loaded from: classes9.dex */
public class ActivityC16343x55c0d8b extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik {
    public static final /* synthetic */ int I = 0;
    public int A;
    public java.lang.String B;
    public int C;
    public boolean D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 E;
    public java.lang.String F;
    public int G;

    /* renamed from: p, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f227295p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f227296q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227297r;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f227299t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f227300u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f227301v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ScrollView f227302w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f227303x;

    /* renamed from: z, reason: collision with root package name */
    public int f227305z;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 f227289g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7 f227290h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea f227291i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f227292m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f227293n = null;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f227294o = null;

    /* renamed from: s, reason: collision with root package name */
    public android.app.Dialog f227298s = null;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6 f227304y = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6();
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 H = null;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2);
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b) {
        android.view.View view = activityC16343x55c0d8b.f227296q;
        if (view == null || view.isShown()) {
            return;
        }
        android.view.View view2 = activityC16343x55c0d8b.f227296q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(boolean r17, int r18) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b.D4(boolean, int):void");
    }

    public final int W6() {
        if (this.D) {
            return getIntent().getIntExtra("key_chatroom_num", 0) > 0 ? 2 : 1;
        }
        return 3;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f227299t.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        android.view.View view = this.f227299t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        U6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570780bv4;
    }

    /* renamed from: hideTenpayKB */
    public void m66122xd46dd964() {
        android.view.View view = this.f227296q;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f227296q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563469c91);
        mo54448x9c8c0d33(new zb3.q(this));
        this.f227299t = findViewById(com.p314xaae8f345.mm.R.id.j5g);
        this.f227300u = findViewById(com.p314xaae8f345.mm.R.id.j5k);
        this.f227294o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j5j);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea c16405x4886faea = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea) findViewById(com.p314xaae8f345.mm.R.id.j7e);
        this.f227291i = c16405x4886faea;
        c16405x4886faea.m66213x1eba9ad6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjq));
        this.f227293n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j58);
        this.f227295p = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f227296q = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        this.f227297r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567343j56);
        this.f227289g = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1) findViewById(com.p314xaae8f345.mm.R.id.j4z);
        this.f227290h = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16369x7101dda7) findViewById(com.p314xaae8f345.mm.R.id.f567287iy1);
        this.f227292m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5l);
        this.f227301v = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.j5e);
        this.f227302w = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.j6v);
        this.f227303x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5c);
        if (this.f227305z == 1) {
            this.f227290h.m66187x53bfe316(getString(com.p314xaae8f345.mm.R.C30867xcad56011.go8));
            this.f227290h.m66186xd192c3d9(true);
        } else {
            this.f227290h.m66187x53bfe316(getString(com.p314xaae8f345.mm.R.C30867xcad56011.go9));
            this.f227290h.m66186xd192c3d9(false);
        }
        this.f227290h.m66184x4af3f603(this);
        this.f227289g.m66206x4af3f603(this);
        this.f227291i.m66214x4af3f603(this);
        android.widget.EditText editText = (android.widget.EditText) this.f227290h.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        android.widget.EditText editText2 = (android.widget.EditText) this.f227289g.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        ((android.view.inputmethod.InputMethodManager) mo55332x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.setOnClickListener(new zb3.y(this, editText, editText2));
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText2);
        ((android.view.inputmethod.InputMethodManager) mo55332x76847179().getSystemService("input_method")).showSoftInput(editText2, 0);
        editText2.setOnClickListener(new zb3.z(this, editText, editText2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = this.E;
        if (c1Var != null) {
            if (this.f227305z == 1) {
                this.f227290h.m66181x1a41789a(c1Var.f226716e);
            } else {
                this.f227290h.m66181x1a41789a(c1Var.f226719h);
            }
            this.f227290h.m66183x484c8f08(this.E.f226721m);
        }
        if (!this.D) {
            this.f227289g.m66205xca0283c4("");
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 1) {
            this.f227289g.m66205xca0283c4("");
        } else {
            this.f227289g.m66205xca0283c4("1");
        }
        this.f227289g.m66203x17db3a84(this.E.f226715d);
        if (this.f227305z == 1) {
            this.f227289g.m66204x18476ad6(1);
        } else {
            this.f227289g.m66204x18476ad6(1);
        }
        this.f227289g.m66199x7498fe14();
        this.f227290h.m66182x17db3113(12);
        if (!this.D) {
            int i17 = this.f227305z;
            if (i17 == 1) {
                this.f227297r.setText(this.E.f226717f);
                this.f227297r.setVisibility(0);
            } else if (i17 == 0) {
                this.f227297r.setText(this.E.f226718g);
                this.f227297r.setVisibility(0);
            }
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 0) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gle);
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.glb);
            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gld);
            java.lang.String string4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.glc);
            android.text.SpannableString spannableString = new android.text.SpannableString(string + string2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
            spannableString.setSpan(b4Var, string.length(), string.length() + string2.length(), 33);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(string3 + string4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
            spannableString2.setSpan(b4Var2, string3.length(), string3.length() + string4.length(), 33);
            b4Var.f261679d = new zb3.s(this, spannableString2);
            b4Var2.f261679d = new zb3.t(this, spannableString);
            this.f227297r.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            this.f227297r.setText(spannableString);
            this.f227297r.setVisibility(0);
        } else {
            this.f227289g.setVisibility(8);
        }
        this.f227293n.setOnClickListener(new zb3.v(this));
        this.f227292m.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(0.0d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 c16388xef85efa1 = this.f227289g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6 c6Var = this.f227304y;
        c6Var.d(c16388xef85efa1);
        c6Var.d(this.f227290h);
        c6Var.d(this.f227291i);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5_);
        if (textView != null) {
            c6Var.f228314d = textView;
        } else {
            c6Var.getClass();
        }
        if (this.D && this.f227305z == 1) {
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5d);
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmb, java.lang.Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8))));
            textView2.setVisibility(0);
        }
        this.H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new zb3.w(this), false);
        android.widget.ScrollView scrollView = this.f227302w;
        if (scrollView != null) {
            scrollView.setOnTouchListener(new zb3.x(this));
        }
        this.f227290h.m66188x7650bebc(this.f227305z);
        if (this.D && getIntent().getIntExtra("key_chatroom_num", 0) == 0) {
            this.f227290h.requestFocus();
        } else {
            this.f227289g.requestFocus();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2) {
                if (i18 == -1 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 7, stringExtra);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        finish();
                    } else {
                        m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n6(stringExtra.replaceAll(",", "|"), this.B, 1, "v1.0"));
                    }
                } else if (i18 == 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.class);
                    intent2.putExtra("key_type", 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } else if (i18 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 5);
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
            if (!this.D || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                T6();
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new zb3.i(this), 200L);
                this.f227294o.setOnClickListener(new zb3.k(this));
                ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j59)).setOnClickListener(new zb3.l(this));
            } else {
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.F, "msg", null);
                if (d17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
                    finish();
                    return;
                }
                java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
                if (hb3.o.Ni().Ui().a(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.C(this.F, stringExtra2, 1)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
                        hb3.o.Ni().Ui().b(str);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
                }
                finish();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f227305z = getIntent().getIntExtra("key_type", 1);
        this.A = getIntent().getIntExtra("key_way", 3);
        this.D = getIntent().getIntExtra("key_from", 0) == 1;
        this.G = getIntent().getIntExtra("pay_channel", -1);
        m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5(0, "v1.0", 0), false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 a17 = hb3.o.Ni().wi().a();
        this.E = a17;
        java.util.Objects.toString(a17);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6 c6Var = this.f227304y;
        ((java.util.LinkedList) c6Var.f228311a).clear();
        c6Var.f228314d = null;
        this.H.e();
        android.app.Dialog dialog = this.f227298s;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f227298s.dismiss();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view;
        if (i17 != 4 || (view = this.f227296q) == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        m66122xd46dd964();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6) {
            android.app.Dialog dialog = this.f227298s;
            if (dialog != null && dialog.isShowing()) {
                this.f227298s.hide();
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != 401) {
                    db5.e1.T(this, str);
                    return true;
                }
                this.f227293n.setEnabled(false);
                this.f227293n.setClickable(false);
                this.H.c(5000L, 5000L);
                db5.e1.T(this, str);
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6) m1Var;
            this.C = h6Var.f226859n;
            this.B = h6Var.f226856h;
            this.F = h6Var.f226858m;
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
            c19760x34448d56.f273647m = h6Var.f226857i;
            c19760x34448d56.f273642e = 37;
            c19760x34448d56.f273644g = this.G;
            h45.a0.f(this, c19760x34448d56, 1);
            return true;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n6) {
            if (i17 == 0 && i18 == 0) {
                if (this.D) {
                    db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
                    finish();
                } else {
                    T6();
                    this.f227300u.postDelayed(new zb3.d(this), 1000L);
                }
                return true;
            }
            if (i18 == 402) {
                db5.e1.A(mo55332x76847179(), str, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnq), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new zb3.e(this), new zb3.f(this));
                return true;
            }
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5) {
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5 x5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5) m1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 a17 = hb3.o.Ni().wi().a();
                this.E = a17;
                java.util.Objects.toString(a17);
                if (this.f227305z == 1) {
                    this.f227290h.m66181x1a41789a(this.E.f226716e);
                } else {
                    this.f227290h.m66181x1a41789a(this.E.f226719h);
                }
                this.f227290h.m66183x484c8f08(this.E.f226721m);
                this.f227289g.m66203x17db3a84(this.E.f226715d);
                if (x5Var.f227230i && this.D) {
                    android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5a);
                    textView.setOnClickListener(new zb3.g(this));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(W6()), 8);
                    textView.setVisibility(0);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x5Var.f227232n)) {
                    this.f227303x.setVisibility(8);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + x5Var.f227232n);
                    this.f227303x.setText(x5Var.f227232n);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x5Var.f227233o)) {
                        this.f227303x.setOnClickListener(new zb3.h(this, x5Var));
                    }
                    this.f227303x.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok okVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ok();
                okVar.f228816a = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_w);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rk.a(this, this.f227301v, x5Var.f227240v, okVar);
            }
            return true;
        }
        return false;
    }

    /* renamed from: setEditFocusListener */
    public void m66123x8f91b80(android.view.View view, int i17, boolean z17) {
        this.f227295p = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f227296q = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        if (this.f227295p == null || editText == null || this.f227296q == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new zb3.o(this, z17, i17, editText));
        editText.setOnClickListener(new zb3.p(this, z17, i17, editText));
        findViewById.setOnClickListener(new zb3.r(this));
    }
}
