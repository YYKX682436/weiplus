package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftAcceptUI */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC13049x1183363c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public xt1.y A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f176316d;

    /* renamed from: e, reason: collision with root package name */
    public int f176317e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f176318f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f176319g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f176320h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f176321i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f176322m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f176323n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f176324o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f176325p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f176326q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f176327r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f176328s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f176329t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f176330u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f176331v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f176332w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.RelativeLayout f176333x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176334y = null;

    /* renamed from: z, reason: collision with root package name */
    public xt1.n0 f176335z;

    public final void T6() {
        gm0.j1.n().f354821b.g(new xt1.y(this.f176317e, this.f176316d, this.f176319g, java.lang.Boolean.FALSE));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176334y;
        if (u3Var != null) {
            u3Var.show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569831pg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f176320h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.b_1);
        this.f176321i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.b__);
        this.f176322m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.b_b);
        this.f176323n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b_c);
        this.f176324o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b_8);
        this.f176325p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f566959hn1);
        this.f176326q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b_e);
        this.f176328s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b_9);
        this.f176330u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b_a);
        this.f176333x = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.b_d);
        this.f176331v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.b_7);
        this.f176332w = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568320mh3);
        this.f176327r = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.kn8);
        this.f176329t = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f568321mh4);
        this.f176333x.setOnClickListener(this);
        this.f176320h.setOnClickListener(this);
        this.f176321i.setOnClickListener(this);
        this.f176327r.setOnClickListener(this);
        this.f176329t.setOnClickListener(this);
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176334y = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.t0(this));
        gm0.j1.n().f354821b.g(new xt1.n0(this.f176317e, this.f176316d, this.f176319g));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176334y;
        if (u3Var != null) {
            u3Var.show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.b_e || view.getId() == com.p314xaae8f345.mm.R.id.kn8) {
            if (this.f176326q.getVisibility() == 0) {
                int d17 = com.p314xaae8f345.mm.ui.bk.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176335z.f538072p, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560322h9)));
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(d17);
                gradientDrawable.setStroke(2, d17);
                gradientDrawable.setCornerRadius(6.0f);
                this.f176326q.setBackground(gradientDrawable);
                this.f176326q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            }
            T6();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176318f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 2, this.f176316d, kk.v.a(this.f176317e), this.f176318f);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.b_d) {
            finish();
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.b_1) {
            finish();
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f568321mh4) {
            gm0.j1.n().f354821b.g(new xt1.y(this.f176317e, this.f176316d, this.f176319g, java.lang.Boolean.TRUE));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176334y;
            if (u3Var != null) {
                u3Var.show();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f176316d = getIntent().getStringExtra("key_order_id");
        this.f176317e = getIntent().getIntExtra("key_biz_uin", -1);
        this.f176318f = getIntent().getStringExtra("key_from_user_name");
        this.f176319g = getIntent().getStringExtra("key_chatroom_name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftAcceptUI", "onCreate, orderId:%s, bizUin:%s, fromUserName:%s", this.f176316d, java.lang.Integer.valueOf(this.f176317e), this.f176318f);
        if (this.f176317e == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftAcceptUI", "bizUin is -1, fail!");
            lu1.r.e(this, "", true);
        } else {
            if (this.f176316d == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftAcceptUI", "orderId is null, fail");
                lu1.r.e(this, "", true);
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176318f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 1, this.f176316d, kk.v.a(this.f176317e), this.f176318f);
            }
            mo43517x10010bd5();
            gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.c.f33375x366c91de, this);
            gm0.j1.n().f354821b.a(1136, this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.c.f33375x366c91de, this);
        gm0.j1.n().f354821b.q(1136, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftAcceptUI", "onKeyDown finishUI");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176334y;
            if (u3Var != null && u3Var.isShowing()) {
                this.f176334y.dismiss();
            }
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176334y;
            if (u3Var != null && u3Var.isShowing()) {
                this.f176334y.dismiss();
            }
            if (m1Var instanceof xt1.n0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                lu1.r.e(this, str, true);
                return;
            } else {
                if (m1Var instanceof xt1.y) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    lu1.r.e(this, str, true);
                    return;
                }
                return;
            }
        }
        if (!(m1Var instanceof xt1.n0)) {
            if (m1Var instanceof xt1.y) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f176334y;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.f176334y.dismiss();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftAcceptUI", "accept gift card is success!");
                this.A = (xt1.y) m1Var;
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17.class);
                intent.putExtra("key_order_id", this.f176316d);
                intent.putExtra("key_biz_uin", this.f176317e);
                intent.putExtra("key_gift_into", this.A.f538140f);
                intent.putExtra("key_from_group_chat_room", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176319g));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                return;
            }
            return;
        }
        xt1.n0 n0Var = (xt1.n0) m1Var;
        this.f176335z = n0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftAcceptUI", "ignore:%b", java.lang.Boolean.valueOf(n0Var.f538070n));
        if (this.f176335z.f538070n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftAcceptUI", "NetScenePreAcceptGiftCard ignore is true~so ignore it");
            T6();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f176334y;
        if (u3Var3 != null && u3Var3.isShowing()) {
            this.f176334y.dismiss();
        }
        xt1.n0 n0Var2 = this.f176335z;
        if (n0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftAcceptUI", "preAcceptGiftCard is null");
        } else {
            this.f176324o.setText(n0Var2.f538068i);
            android.widget.TextView textView = this.f176323n;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = this.f176335z.f538065f;
            float textSize = this.f176323n.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str2, textSize));
            xt1.n0 n0Var3 = this.f176335z;
            int i19 = n0Var3.f538067h;
            if (i19 == 0) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var3.f538069m)) {
                    this.f176326q.setVisibility(0);
                    this.f176326q.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ash));
                    this.f176326q.setOnClickListener(this);
                } else {
                    this.f176326q.setVisibility(0);
                    this.f176326q.setText(this.f176335z.f538069m);
                    this.f176326q.setOnClickListener(this);
                }
            } else if (i19 == 1) {
                this.f176326q.setVisibility(8);
                this.f176326q.setOnClickListener(null);
            } else if (i19 != 2) {
                this.f176326q.setVisibility(8);
                this.f176326q.setOnClickListener(null);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n0Var3.f538069m)) {
                this.f176326q.setVisibility(8);
                this.f176326q.setOnClickListener(null);
            } else {
                this.f176326q.setVisibility(0);
                this.f176326q.setBackgroundDrawable(null);
                this.f176326q.setText(this.f176335z.f538069m);
                this.f176326q.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                this.f176326q.setTextSize(1, 17.0f);
                this.f176326q.setOnClickListener(null);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538073q)) {
                this.f176326q.setVisibility(8);
                this.f176329t.setVisibility(8);
                this.f176327r.setVisibility(0);
                this.f176328s.setText(this.f176335z.f538073q);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538074r)) {
                this.f176327r.setVisibility(8);
                this.f176329t.setVisibility(0);
                this.f176330u.setText(this.f176335z.f538074r);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538066g)) {
                int b17 = i65.a.b(this, 15);
                o11.f fVar = new o11.f();
                fVar.f423616g = lp0.b.D();
                fVar.f423615f = xt1.q.m(this.f176335z.f538066g);
                fVar.f423611b = true;
                fVar.f423629t = true;
                fVar.f423630u = b17;
                fVar.f423610a = true;
                fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.cbt;
                n11.a.b().h(this.f176335z.f538066g, this.f176322m, fVar.a());
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538071o)) {
                n11.a.b().g(this.f176335z.f538071o, this.f176325p);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538072p) && this.f176326q.getVisibility() == 0) {
                int d17 = com.p314xaae8f345.mm.ui.bk.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176335z.f538072p, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560322h9)));
                int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setStroke(2, d17);
                gradientDrawable.setCornerRadius(6.0f);
                this.f176326q.setBackground(gradientDrawable);
                this.f176326q.setTextColor(d17);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538072p) && this.f176328s.getVisibility() == 0) {
                this.f176328s.setTextColor(com.p314xaae8f345.mm.ui.bk.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176335z.f538072p, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560322h9))));
                int color2 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560322h9);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538072p)) {
                    color2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176335z.f538072p, color2);
                }
                int d18 = com.p314xaae8f345.mm.ui.bk.d(color2);
                android.widget.ImageView imageView = this.f176331v;
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                f3.b.h(drawable, android.content.res.ColorStateList.valueOf(d18));
                imageView.setImageDrawable(drawable);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538072p) && this.f176330u.getVisibility() == 0) {
                this.f176330u.setTextColor(com.p314xaae8f345.mm.ui.bk.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176335z.f538072p, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560322h9))));
                int color3 = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560322h9);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176335z.f538072p)) {
                    color3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176335z.f538072p, color3);
                }
                int d19 = com.p314xaae8f345.mm.ui.bk.d(color3);
                android.widget.ImageView imageView2 = this.f176332w;
                android.graphics.drawable.Drawable drawable2 = imageView2.getDrawable();
                f3.b.h(drawable2, android.content.res.ColorStateList.valueOf(d19));
                imageView2.setImageDrawable(drawable2);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f176326q.getLayoutParams();
                marginLayoutParams.topMargin -= i65.a.b(this, 20);
                this.f176326q.setLayoutParams(marginLayoutParams);
            }
            if (this.f176326q.getVisibility() == 0 && this.f176329t.getVisibility() == 8) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f176326q.getLayoutParams();
                marginLayoutParams2.bottomMargin += i65.a.b(this, 28);
                this.f176326q.setLayoutParams(marginLayoutParams2);
            }
        }
        android.widget.RelativeLayout relativeLayout = this.f176321i;
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new lu1.f0(relativeLayout, scaleAnimation2));
        if (relativeLayout != null) {
            relativeLayout.startAnimation(scaleAnimation);
        }
        com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560026e));
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m78513xc2a54588, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/card/ui/CardGiftAcceptUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
