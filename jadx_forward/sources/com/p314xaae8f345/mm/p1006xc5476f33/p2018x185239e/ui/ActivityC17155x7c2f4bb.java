package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* renamed from: com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI */
/* loaded from: classes9.dex */
public class ActivityC17155x7c2f4bb extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements mp5.v {
    public static final /* synthetic */ int X = 0;
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public android.widget.TextView G;
    public android.widget.LinearLayout H;
    public android.widget.RelativeLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.RelativeLayout f239130J;
    public android.widget.RelativeLayout K;
    public android.widget.TextView L;
    public int M;
    public long N;
    public java.lang.String P;
    public android.view.View Q;
    public android.widget.TextView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.widget.Button U;

    /* renamed from: d, reason: collision with root package name */
    public int f239131d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f239132e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f239133f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f239134g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f239135h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f239136i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f239137m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f239138n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f239139o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239140p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.EditText f239141q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f239143s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ScrollView f239144t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f239145u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f239146v;

    /* renamed from: x, reason: collision with root package name */
    public double f239148x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f239149y;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239142r = false;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f239147w = "";

    /* renamed from: z, reason: collision with root package name */
    public int f239150z = 4;
    public int V = 0;
    public final java.lang.Runnable W = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.o9(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        activityC17155x7c2f4bb.f239135h.clearFocus();
        if (activityC17155x7c2f4bb.f239140p == null) {
            activityC17155x7c2f4bb.f239140p = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e(activityC17155x7c2f4bb, 60, "", com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7.f239342f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = activityC17155x7c2f4bb.f239140p;
        java.lang.String title = activityC17155x7c2f4bb.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyf);
        c17147x9fa5370e.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        c17147x9fa5370e.f239101n = title;
        activityC17155x7c2f4bb.f239140p.a(activityC17155x7c2f4bb.f239149y, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17155x7c2f4bb.f239143s) ? "" : activityC17155x7c2f4bb.f239143s, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k9(activityC17155x7c2f4bb));
    }

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb) {
        activityC17155x7c2f4bb.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "do place order");
        activityC17155x7c2f4bb.mo73823x964575a5();
        if (activityC17155x7c2f4bb.f239142r) {
            activityC17155x7c2f4bb.mo48674x36654fab();
            activityC17155x7c2f4bb.f239141q.clearFocus();
        }
        activityC17155x7c2f4bb.m83090x14f40144(4954);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0(activityC17155x7c2f4bb.f239146v, activityC17155x7c2f4bb.f239148x, activityC17155x7c2f4bb.f239149y, activityC17155x7c2f4bb.F);
        d0Var.m82989x7c4af7d8("MerchantPay");
        activityC17155x7c2f4bb.mo73913x2b33b77f();
        android.app.Dialog dialog = activityC17155x7c2f4bb.f39911xe3cdd3d6;
        if (dialog != null) {
            dialog.setCancelable(false);
            activityC17155x7c2f4bb.f39911xe3cdd3d6.setCanceledOnTouchOutside(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "doPlaceOrder: set loading dialog not cancelable");
        }
        activityC17155x7c2f4bb.m83099x5406100e(d0Var, false);
    }

    public void a7(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "do check pay");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b0(str, i17, this.f239146v);
        b0Var.m82989x7c4af7d8("MerchantPay");
        m83099x5406100e(b0Var, false);
    }

    public final double b7() {
        if (this.f239131d == 0) {
            this.f239148x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f239135h.m83183xfb85ada3(), 0.0d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "mMoneyEt.getText：%s", this.f239135h.m83183xfb85ada3());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "mTotalAmt：%s", java.lang.Double.valueOf(this.f239148x));
        return this.f239148x;
    }

    public void c7(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0 d0Var) {
        java.lang.String str = d0Var.f238337f.f453187g;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("prepayId", str);
        bundle.putInt("payScene", 73);
        bundle.putInt("payChannel", this.A);
        bundle.putString("qrCodeUrl", getIntent().getStringExtra("qrcodeUrl"));
        bundle.putInt("chatType", getIntent().getIntExtra("chat_type", 0));
        bundle.putInt("sendType", getIntent().getIntExtra("send_type", 0));
        bundle.putInt("qrCodeSessionType", getIntent().getIntExtra("qrcodeSessionType", 0));
        bundle.putString("qrCodeSessionName", getIntent().getStringExtra("qrcodeSessionName"));
        bundle.putString("qrCodeTimelineObjId", getIntent().getStringExtra("qrcodeTimelineObjId"));
        bundle.putString("qrcodeSenderName", getIntent().getStringExtra("qrcode_sender_username"));
        bundle.putString("qrcodeSenderMsgId", getIntent().getStringExtra("msg_svr_id"));
        java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
        long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bundle.putString("payInitRawUrl", stringExtra == null ? "" : stringExtra);
        bundle.putLong("payInitTimestamp", longExtra);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "startPay initRawUrl: %s, initTimestamp: %d", stringExtra, java.lang.Long.valueOf(longExtra));
        ((h45.q) i95.n0.c(h45.q.class)).mo24806xf00c9308(this, bundle);
    }

    public final void d7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f239149y)) {
            this.f239138n.setVisibility(8);
            this.f239139o.setVisibility(0);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyf);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f239139o, string, 0, string.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j9(this), true), mo55332x76847179());
            return;
        }
        this.f239138n.setVisibility(0);
        this.f239139o.setVisibility(8);
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574357i05);
        java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9z, this.f239149y, string2);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, string3);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f239138n, i17.toString(), i17.length() - string2.length(), i17.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i9(this), true), mo55332x76847179());
    }

    public final void e7() {
        double b76 = b7();
        this.f239148x = b76;
        if (b76 <= 0.0d) {
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f239145u;
            if (c22894x55bf3223 != null) {
                c22894x55bf3223.e(false);
            }
            this.U.setEnabled(false);
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf32232 = this.f239145u;
        if (c22894x55bf32232 != null) {
            c22894x55bf32232.e(true);
        }
        if (!this.f239142r) {
            this.U.setEnabled(true);
        } else if (this.U.getVisibility() != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f239141q.getText())) {
            this.U.setEnabled(false);
        } else {
            this.U.setEnabled(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxk;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.widget.ScrollView scrollView = this.f239144t;
        if (scrollView != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) scrollView.getLayoutParams();
            layoutParams.bottomMargin = (int) f17;
            this.f239144t.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean z17;
        mo78530x8b45058f();
        this.f239144t = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78309xcc53afe2);
        this.f239132e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567446ji5);
        this.f239133f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567444ji3);
        this.f239134g = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.f567445ji4);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f567441ji0);
        this.f239135h = viewOnFocusChangeListenerC22907xe18534c2;
        viewOnFocusChangeListenerC22907xe18534c2.m83172xfb8046fd();
        this.H = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jhu);
        this.G = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jhv);
        this.f239136i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jhr);
        this.f239139o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jho);
        this.f239138n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jhq);
        this.f239137m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jhs);
        this.f239141q = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.jht);
        this.f239130J = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pco);
        this.f239145u = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) findViewById(com.p314xaae8f345.mm.R.id.pok);
        this.Q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jhw);
        this.R = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jhl);
        this.S = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jhm);
        this.T = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jhk);
        this.U = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.jhn);
        if (this.f239131d == 1) {
            android.view.View view = this.Q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initFixedModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initFixedModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.H.setVisibility(8);
            this.f239130J.setVisibility(8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
                android.widget.TextView textView = this.R;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = this.P;
                float textSize = this.R.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize));
            }
            this.S.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(this.f239148x));
            this.T.setTextSize(1, 56.0f);
            this.S.setTextSize(1, 56.0f);
            this.U.setVisibility(0);
            this.f239144t.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m9(this, false));
        } else {
            android.view.View view2 = this.Q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initNormalModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initNormalModeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.H.setVisibility(0);
            this.f239130J.setVisibility(0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
                android.widget.TextView textView2 = this.G;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = this.P;
                float textSize2 = this.G.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str2, textSize2));
            }
            this.f239135h.m83169xe7297452().setTextSize(1, 52.0f);
            this.f239135h.m83169xe7297452().setMinHeight(i65.a.b(mo55332x76847179(), 56));
            this.f239135h.m83186xefe232c4().setTextSize(1, 52.0f);
            if (this.f239142r) {
                this.U.setVisibility(0);
                this.U.setEnabled(false);
                this.f239144t.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m9(this, false));
                z17 = false;
            } else {
                this.U.setVisibility(8);
                this.f239144t.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m9(this, true));
                z17 = true;
            }
            if (!z17) {
                this.f239135h.m83169xe7297452().clearFocus();
            }
            m83130x21cc23c2(this.f239135h.m83169xe7297452(), z17, true);
            this.f239135h.m83217x59dfe8de(true);
            if (fp.h.c(28)) {
                this.f239135h.m83169xe7297452().post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d9(this, z17));
            }
            if (this.f239142r) {
                this.f239145u.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1.class)).m42291x53d8522f("keyboard_title_key", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            } else {
                this.f239145u.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hys));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1.class)).m42291x53d8522f("keyboard_title_key", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hys));
            }
            m83131x28a5f720(this);
            ((android.widget.RelativeLayout.LayoutParams) this.f239145u.getLayoutParams()).addRule(12);
            this.f239135h.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e9(this));
            this.f239135h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f9(this));
            this.f239135h.r(7, 2);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u9(this));
        if (this.f239142r) {
            this.f239136i.setVisibility(8);
            this.f239137m.setVisibility(0);
            this.f239141q.setHint(this.f239143s);
            this.f239141q.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g9(this));
            this.f239141q.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h9(this));
        } else {
            this.f239137m.setVisibility(8);
            this.f239136i.setVisibility(0);
            d7();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.p9 p9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.p9(this);
        this.U.setOnClickListener(p9Var);
        this.f239135h.m83169xe7297452().setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q9(this, p9Var));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.pck);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pcp);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pcm);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chv);
        } else {
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.pcp);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.pcm);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById4, arrayList6.toArray(), "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/remittance/ui/WalletMerchantPayUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.chu);
        }
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r9(this));
        this.I = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pcl);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_TW") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_HK")) {
            this.K = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.pcn);
            this.L = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pcq);
            this.K.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s9(this));
            this.f239135h.m83218xe68631a1(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t9(this));
        } else {
            this.I.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.k8.b(this, this.f239144t, findViewById(com.p314xaae8f345.mm.R.id.jhz), findViewById(com.p314xaae8f345.mm.R.id.jhz), findViewById(com.p314xaae8f345.mm.R.id.jhy), 24, 0.0f, false);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        return this.f239131d == 0 && this.f239145u.o();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById;
        super.onCreate(bundle);
        mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07)));
        android.view.View j17 = mo2533x106ab264().j();
        if (j17 != null && (findViewById = j17.findViewById(android.R.id.text1)) != null && (findViewById instanceof android.widget.TextView)) {
            ((android.widget.TextView) findViewById).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        android.view.Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        if (fp.h.c(21) && !fp.h.c(23)) {
            getWindow().setStatusBarColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        }
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l9(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        m83090x14f40144(4954);
        m83090x14f40144(4839);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hys);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n9(this));
        this.f239150z = 4;
        this.B = getIntent().getStringExtra("shopName");
        this.f239146v = getIntent().getStringExtra("scanId");
        this.D = getIntent().getStringExtra("shopAddress");
        this.C = getIntent().getStringExtra("shopAdName");
        this.E = getIntent().getStringExtra("shopHeadImgURL");
        this.A = getIntent().getIntExtra("payChannel", 0);
        this.F = getIntent().getStringExtra("qrcode_sender_username");
        this.P = getIntent().getStringExtra("key_shop_desc");
        this.N = getIntent().getLongExtra("key_shop_amount", 0L);
        this.f239142r = getIntent().getBooleanExtra("merchantPayPayerDescRequired", false);
        java.lang.String stringExtra = getIntent().getStringExtra("merchantPayPayerDescPlaceholder");
        this.f239143s = stringExtra;
        if (this.f239142r && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f239143s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.hyv);
        }
        double j18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j("" + this.N, "100", 2, java.math.RoundingMode.HALF_UP);
        this.f239148x = j18;
        if (j18 > 0.0d) {
            this.f239131d = 1;
        } else {
            this.f239131d = 0;
        }
        mo43517x10010bd5();
        e7();
        if (this.f239131d == 0) {
            this.V = 1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(4954);
        m83121xf6ff5b27(4839);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "onDestroy()");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "onDialogDismiss()");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.W, 300L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f239145u;
        if (c22894x55bf3223 == null || !c22894x55bf3223.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "onPause()");
        if (this.f239131d != 0 || this.f239145u.p()) {
            return;
        }
        this.V = 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MerchantPayUI", "onResume()");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r1.f239444a.a(this);
        if (this.V == 3 && mo48628x7c5cc589() && !this.f239142r) {
            m83136xb67ebaa8();
        }
        if (this.f239131d == 0) {
            this.V = 2;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0) m1Var;
            mo48627xce38d9a();
            if (i17 == 0 && i18 == 0) {
                r45.cl4 cl4Var = d0Var.f238337f;
                if (cl4Var.f453184d == 0) {
                    java.lang.String str2 = cl4Var.f453187g;
                    this.f239147w = cl4Var.f453186f;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.e(cl4Var.f453188h)) {
                        new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this).c(cl4Var.f453188h, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.c9(this, d0Var));
                        return true;
                    }
                    c7(d0Var);
                } else {
                    java.lang.String str3 = cl4Var.f453185e;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    objArr[0] = str3 == null ? "" : str3;
                    objArr[1] = "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MerchantPayUI", "showAlert3() msg:%s, title:%s", objArr);
                    db5.e1.G(this, str3, "", true, null);
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: shouldEnsureSoterConnection */
    public boolean mo48648xabe27cf2() {
        return true;
    }
}
