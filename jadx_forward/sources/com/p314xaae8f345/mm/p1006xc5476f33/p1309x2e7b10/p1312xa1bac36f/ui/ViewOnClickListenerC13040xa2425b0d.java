package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC13040xa2425b0d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements wt1.h, wt1.f, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f176216d;

    /* renamed from: h, reason: collision with root package name */
    public gu1.d f176220h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f176221i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f176222m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f176223n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f176224o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f176225p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f176226q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f176227r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f176228s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f176229t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f176230u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Vibrator f176231v;

    /* renamed from: e, reason: collision with root package name */
    public int f176217e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f176218f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f176219g = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f176232w = false;

    @Override // wt1.f
    public void F1() {
        this.f176220h.a();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569820p5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f176216d.o()) {
            if (android.text.TextUtils.isEmpty(this.f176216d.s0().f470101y)) {
                mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ary, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572332au3)));
            } else {
                mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ary, this.f176216d.s0().f470101y));
            }
        }
        mo54448x9c8c0d33(new gu1.e(this));
        if (this.f176220h == null) {
            gu1.d dVar = new gu1.d(this, m78513xc2a54588());
            this.f176220h = dVar;
            dVar.f357416o = dVar.f357403b.getWindow().getAttributes().screenBrightness;
            gu1.d dVar2 = this.f176220h;
            android.view.View view = dVar2.f357402a;
            dVar2.f357409h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565112bb2);
            dVar2.f357410i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bbc);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.kga);
            dVar2.f357411j = checkBox;
            checkBox.setChecked(true);
            dVar2.f357411j.setOnClickListener(dVar2.f357417p);
            if (dVar2.f357416o < 0.8f) {
                android.view.WindowManager.LayoutParams attributes = dVar2.f357403b.getWindow().getAttributes();
                attributes.screenBrightness = 0.8f;
                dVar2.f357403b.getWindow().setAttributes(attributes);
            }
            this.f176220h.f357415n = new gu1.f(this);
        }
        gu1.d dVar3 = this.f176220h;
        tt1.j jVar = this.f176216d;
        dVar3.f357412k = jVar;
        dVar3.f357414m = true;
        if (jVar.i()) {
            this.f176220h.f357413l = 1;
        }
        this.f176231v = (android.os.Vibrator) getSystemService("vibrator");
        this.f176221i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aws);
        this.f176222m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f176223n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.a1f);
        this.f176224o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a1e);
        this.f176225p = findViewById(com.p314xaae8f345.mm.R.id.cqd);
        this.f176226q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.c0k);
        if (this.f176216d.o()) {
            findViewById(com.p314xaae8f345.mm.R.id.b97).setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560313h0));
            mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        } else {
            findViewById(com.p314xaae8f345.mm.R.id.b97).setBackgroundColor(lu1.a0.d(this.f176216d.s0().f470088p));
            mo64405x4dab7448(lu1.a0.d(this.f176216d.s0().f470088p));
        }
        if (!this.f176216d.o() || android.text.TextUtils.isEmpty(this.f176216d.s0().f470079e)) {
            this.f176221i.setText(this.f176216d.s0().f470085m);
            this.f176222m.setText(this.f176216d.s0().f470086n);
        } else {
            this.f176223n.setVisibility(0);
            this.f176221i.setVisibility(8);
            this.f176222m.setVisibility(8);
            android.view.View view2 = this.f176225p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lu1.g0.b(this.f176224o, this.f176216d.s0().f470079e, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561705qd), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
        }
        if (this.f176216d.s0().Z != null) {
            r45.w50 w50Var = this.f176216d.s0().Z;
            if (!android.text.TextUtils.isEmpty(w50Var.f470411d)) {
                if (this.f176227r == null) {
                    this.f176227r = ((android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.bbd)).inflate();
                }
                this.f176227r.setOnClickListener(this);
                this.f176228s = (android.widget.TextView) this.f176227r.findViewById(com.p314xaae8f345.mm.R.id.bbf);
                this.f176229t = (android.widget.TextView) this.f176227r.findViewById(com.p314xaae8f345.mm.R.id.bbe);
                this.f176230u = (android.widget.TextView) this.f176227r.findViewById(com.p314xaae8f345.mm.R.id.bbb);
                this.f176228s.setVisibility(0);
                this.f176228s.setText(w50Var.f470411d);
                android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.byh);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                drawable.setColorFilter(lu1.a0.d(this.f176216d.s0().f470088p), android.graphics.PorterDuff.Mode.SRC_IN);
                this.f176228s.setCompoundDrawables(null, null, drawable, null);
                this.f176228s.setTextColor(lu1.a0.d(this.f176216d.s0().f470088p));
                this.f176228s.setOnClickListener(this);
                if (android.text.TextUtils.isEmpty(w50Var.f470412e)) {
                    this.f176229t.setVisibility(0);
                    this.f176229t.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572333au4));
                } else {
                    this.f176229t.setVisibility(0);
                    this.f176229t.setText(w50Var.f470412e);
                }
                if (!android.text.TextUtils.isEmpty(w50Var.f470413f)) {
                    this.f176230u.setVisibility(0);
                    this.f176230u.setText(w50Var.f470413f);
                }
                android.view.ViewGroup.LayoutParams layoutParams = this.f176224o.getLayoutParams();
                layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561706qe);
                layoutParams.width = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561706qe);
                this.f176224o.setLayoutParams(layoutParams);
                android.view.ViewGroup.LayoutParams layoutParams2 = this.f176223n.getLayoutParams();
                layoutParams2.height = i65.a.b(this, 54);
                layoutParams2.width = i65.a.b(this, 54);
                this.f176223n.setLayoutParams(layoutParams2);
                lu1.g0.b(this.f176224o, this.f176216d.s0().f470079e, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561706qe), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
                this.f176226q.setPadding(0, i65.a.b(this, 10), 0, i65.a.b(this, 30));
            }
        }
        wt1.i Bi = xt1.t0.Bi();
        if (Bi.f530821e == null) {
            Bi.f530821e = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Bi.f530821e).add(new java.lang.ref.WeakReference(this));
        if (this.f176216d.N()) {
            wt1.g Ai = xt1.t0.Ai();
            if (Ai.f530802d == null) {
                Ai.f530802d = new java.util.ArrayList();
            }
            ((java.util.ArrayList) Ai.f530802d).add(new java.lang.ref.WeakReference(this));
            if (!xt1.t0.Ai().c()) {
                xt1.t0.Ai().d();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
                xt1.t0.Ai().a(this.f176216d.g());
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.bbf || view.getId() == com.p314xaae8f345.mm.R.id.bba) {
            if (this.f176216d.n0()) {
                lu1.d.g(this, 0, null, false, this.f176216d);
            } else {
                r45.w50 w50Var = this.f176216d.s0().Z;
                if (!lu1.d.e(this.f176216d.g(), w50Var, this.f176218f, this.f176219g) && w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f470414g)) {
                    lu1.d.j(this, lu1.a0.k(w50Var.f470414g, w50Var.f470415h), 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 9, this.f176216d.g(), this.f176216d.f(), "", w50Var.f470411d);
                    if (lu1.a0.C(w50Var, this.f176216d.g())) {
                        lu1.a0.L(this.f176216d.g(), w50Var.f470411d);
                        lu1.d.h(this, this.f176216d.s0().f470085m);
                    }
                }
            }
            finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeUI", "onCreate()");
        setResult(0);
        this.f176216d = (tt1.j) getIntent().getParcelableExtra("key_card_info_data");
        this.f176217e = getIntent().getIntExtra("key_from_scene", 3);
        this.f176218f = getIntent().getIntExtra("key_previous_scene", 3);
        getIntent().getStringExtra("key_mark_user");
        this.f176219g = getIntent().getIntExtra("key_from_appbrand_type", 0);
        tt1.j jVar = this.f176216d;
        if (jVar == null || jVar.s0() == null || this.f176216d.i0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
            finish();
        } else {
            mo43517x10010bd5();
            xt1.t0.ij().a("", "", 3);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gu1.d dVar = this.f176220h;
        float f17 = dVar.f357416o;
        android.view.WindowManager.LayoutParams attributes = dVar.f357403b.getWindow().getAttributes();
        attributes.screenBrightness = f17;
        dVar.f357403b.getWindow().setAttributes(attributes);
        lu1.a0.F(dVar.f357407f);
        lu1.a0.F(dVar.f357408g);
        dVar.f357415n = null;
        dVar.f357403b = null;
        wt1.i Bi = xt1.t0.Bi();
        if (Bi.f530822f == null) {
            Bi.f530822f = new java.util.HashMap();
        }
        Bi.f530822f.remove(this);
        xt1.t0.Bi().f(this);
        if (this.f176216d.N()) {
            xt1.t0.Ai().g(this);
            xt1.t0.Ai().f();
        }
        this.f176231v.cancel();
        super.onDestroy();
    }

    @Override // wt1.f
    /* renamed from: onFail */
    public void mo54446xc399519d(int i17, java.lang.String str) {
        lu1.r.e(this, str, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
            setResult(-1);
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        xt1.t0.Bi().e(this, false);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f176220h.a();
        xt1.t0.Bi().e(this, true);
        super.onResume();
    }

    @Override // wt1.f
    /* renamed from: onSuccess */
    public void mo54447xe05b4124() {
        this.f176220h.a();
    }

    @Override // wt1.h
    public void t5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
        if (this.f176232w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
        this.f176232w = true;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13041xc416088b.class);
        intent.putExtra("KEY_CARD_ID", this.f176216d.g());
        intent.putExtra("KEY_CARD_CONSUMED_JSON", str);
        intent.putExtra("KEY_CARD_COLOR", this.f176216d.s0().f470088p);
        intent.putExtra("key_stastic_scene", this.f176217e);
        intent.putExtra("key_from_scene", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // wt1.h
    public void x3() {
        this.f176231v.vibrate(300L);
    }

    @Override // wt1.h
    public void x4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
        finish();
    }

    @Override // wt1.h
    public void y2(tt1.j jVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeUI", "onDataChange");
        if (jVar == null || jVar.g() == null || !jVar.g().equals(this.f176216d.g())) {
            return;
        }
        this.f176216d = jVar;
        gu1.d dVar = this.f176220h;
        dVar.f357412k = jVar;
        dVar.a();
    }
}
