package com.tencent.mm.plugin.card.sharecard.ui;

/* loaded from: classes15.dex */
public class CardConsumeCodeUI extends com.tencent.mm.ui.MMActivity implements wt1.h, wt1.f, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f94683d;

    /* renamed from: h, reason: collision with root package name */
    public gu1.d f94687h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f94688i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f94689m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f94690n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f94691o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f94692p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f94693q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f94694r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f94695s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f94696t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f94697u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Vibrator f94698v;

    /* renamed from: e, reason: collision with root package name */
    public int f94684e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f94685f = 3;

    /* renamed from: g, reason: collision with root package name */
    public int f94686g = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f94699w = false;

    @Override // wt1.f
    public void F1() {
        this.f94687h.a();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488287p5;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (this.f94683d.o()) {
            if (android.text.TextUtils.isEmpty(this.f94683d.s0().f388568y)) {
                setMMTitle(getString(com.tencent.mm.R.string.ary, getString(com.tencent.mm.R.string.f490799au3)));
            } else {
                setMMTitle(getString(com.tencent.mm.R.string.ary, this.f94683d.s0().f388568y));
            }
        }
        setBackBtn(new gu1.e(this));
        if (this.f94687h == null) {
            gu1.d dVar = new gu1.d(this, getContentView());
            this.f94687h = dVar;
            dVar.f275883o = dVar.f275870b.getWindow().getAttributes().screenBrightness;
            gu1.d dVar2 = this.f94687h;
            android.view.View view = dVar2.f275869a;
            dVar2.f275876h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483579bb2);
            dVar2.f275877i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bbc);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.kga);
            dVar2.f275878j = checkBox;
            checkBox.setChecked(true);
            dVar2.f275878j.setOnClickListener(dVar2.f275884p);
            if (dVar2.f275883o < 0.8f) {
                android.view.WindowManager.LayoutParams attributes = dVar2.f275870b.getWindow().getAttributes();
                attributes.screenBrightness = 0.8f;
                dVar2.f275870b.getWindow().setAttributes(attributes);
            }
            this.f94687h.f275882n = new gu1.f(this);
        }
        gu1.d dVar3 = this.f94687h;
        tt1.j jVar = this.f94683d;
        dVar3.f275879k = jVar;
        dVar3.f275881m = true;
        if (jVar.i()) {
            this.f94687h.f275880l = 1;
        }
        this.f94698v = (android.os.Vibrator) getSystemService("vibrator");
        this.f94688i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aws);
        this.f94689m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f94690n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.a1f);
        this.f94691o = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a1e);
        this.f94692p = findViewById(com.tencent.mm.R.id.cqd);
        this.f94693q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c0k);
        if (this.f94683d.o()) {
            findViewById(com.tencent.mm.R.id.b97).setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478780h0));
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        } else {
            findViewById(com.tencent.mm.R.id.b97).setBackgroundColor(lu1.a0.d(this.f94683d.s0().f388555p));
            setActionbarColor(lu1.a0.d(this.f94683d.s0().f388555p));
        }
        if (!this.f94683d.o() || android.text.TextUtils.isEmpty(this.f94683d.s0().f388546e)) {
            this.f94688i.setText(this.f94683d.s0().f388552m);
            this.f94689m.setText(this.f94683d.s0().f388553n);
        } else {
            this.f94690n.setVisibility(0);
            this.f94688i.setVisibility(8);
            this.f94689m.setVisibility(8);
            android.view.View view2 = this.f94692p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lu1.g0.b(this.f94691o, this.f94683d.s0().f388546e, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480172qd), com.tencent.mm.R.drawable.cbt, true);
        }
        if (this.f94683d.s0().Z != null) {
            r45.w50 w50Var = this.f94683d.s0().Z;
            if (!android.text.TextUtils.isEmpty(w50Var.f388878d)) {
                if (this.f94694r == null) {
                    this.f94694r = ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.bbd)).inflate();
                }
                this.f94694r.setOnClickListener(this);
                this.f94695s = (android.widget.TextView) this.f94694r.findViewById(com.tencent.mm.R.id.bbf);
                this.f94696t = (android.widget.TextView) this.f94694r.findViewById(com.tencent.mm.R.id.bbe);
                this.f94697u = (android.widget.TextView) this.f94694r.findViewById(com.tencent.mm.R.id.bbb);
                this.f94695s.setVisibility(0);
                this.f94695s.setText(w50Var.f388878d);
                android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.byh);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                drawable.setColorFilter(lu1.a0.d(this.f94683d.s0().f388555p), android.graphics.PorterDuff.Mode.SRC_IN);
                this.f94695s.setCompoundDrawables(null, null, drawable, null);
                this.f94695s.setTextColor(lu1.a0.d(this.f94683d.s0().f388555p));
                this.f94695s.setOnClickListener(this);
                if (android.text.TextUtils.isEmpty(w50Var.f388879e)) {
                    this.f94696t.setVisibility(0);
                    this.f94696t.setText(getString(com.tencent.mm.R.string.f490800au4));
                } else {
                    this.f94696t.setVisibility(0);
                    this.f94696t.setText(w50Var.f388879e);
                }
                if (!android.text.TextUtils.isEmpty(w50Var.f388880f)) {
                    this.f94697u.setVisibility(0);
                    this.f94697u.setText(w50Var.f388880f);
                }
                android.view.ViewGroup.LayoutParams layoutParams = this.f94691o.getLayoutParams();
                layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480173qe);
                layoutParams.width = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480173qe);
                this.f94691o.setLayoutParams(layoutParams);
                android.view.ViewGroup.LayoutParams layoutParams2 = this.f94690n.getLayoutParams();
                layoutParams2.height = i65.a.b(this, 54);
                layoutParams2.width = i65.a.b(this, 54);
                this.f94690n.setLayoutParams(layoutParams2);
                lu1.g0.b(this.f94691o, this.f94683d.s0().f388546e, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480173qe), com.tencent.mm.R.drawable.cbt, true);
                this.f94693q.setPadding(0, i65.a.b(this, 10), 0, i65.a.b(this, 30));
            }
        }
        wt1.i Bi = xt1.t0.Bi();
        if (Bi.f449288e == null) {
            Bi.f449288e = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Bi.f449288e).add(new java.lang.ref.WeakReference(this));
        if (this.f94683d.N()) {
            wt1.g Ai = xt1.t0.Ai();
            if (Ai.f449269d == null) {
                Ai.f449269d = new java.util.ArrayList();
            }
            ((java.util.ArrayList) Ai.f449269d).add(new java.lang.ref.WeakReference(this));
            if (!xt1.t0.Ai().c()) {
                xt1.t0.Ai().d();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
                xt1.t0.Ai().a(this.f94683d.g());
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
        if (view.getId() == com.tencent.mm.R.id.bbf || view.getId() == com.tencent.mm.R.id.bba) {
            if (this.f94683d.n0()) {
                lu1.d.g(this, 0, null, false, this.f94683d);
            } else {
                r45.w50 w50Var = this.f94683d.s0().Z;
                if (!lu1.d.e(this.f94683d.g(), w50Var, this.f94685f, this.f94686g) && w50Var != null && !android.text.TextUtils.isEmpty(w50Var.f388881g)) {
                    lu1.d.j(this, lu1.a0.k(w50Var.f388881g, w50Var.f388882h), 1);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 9, this.f94683d.g(), this.f94683d.f(), "", w50Var.f388878d);
                    if (lu1.a0.C(w50Var, this.f94683d.g())) {
                        lu1.a0.L(this.f94683d.g(), w50Var.f388878d);
                        lu1.d.h(this, this.f94683d.s0().f388552m);
                    }
                }
            }
            finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeUI", "onCreate()");
        setResult(0);
        this.f94683d = (tt1.j) getIntent().getParcelableExtra("key_card_info_data");
        this.f94684e = getIntent().getIntExtra("key_from_scene", 3);
        this.f94685f = getIntent().getIntExtra("key_previous_scene", 3);
        getIntent().getStringExtra("key_mark_user");
        this.f94686g = getIntent().getIntExtra("key_from_appbrand_type", 0);
        tt1.j jVar = this.f94683d;
        if (jVar == null || jVar.s0() == null || this.f94683d.i0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
            finish();
        } else {
            initView();
            xt1.t0.ij().a("", "", 3);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gu1.d dVar = this.f94687h;
        float f17 = dVar.f275883o;
        android.view.WindowManager.LayoutParams attributes = dVar.f275870b.getWindow().getAttributes();
        attributes.screenBrightness = f17;
        dVar.f275870b.getWindow().setAttributes(attributes);
        lu1.a0.F(dVar.f275874f);
        lu1.a0.F(dVar.f275875g);
        dVar.f275882n = null;
        dVar.f275870b = null;
        wt1.i Bi = xt1.t0.Bi();
        if (Bi.f449289f == null) {
            Bi.f449289f = new java.util.HashMap();
        }
        Bi.f449289f.remove(this);
        xt1.t0.Bi().f(this);
        if (this.f94683d.N()) {
            xt1.t0.Ai().g(this);
            xt1.t0.Ai().f();
        }
        this.f94698v.cancel();
        super.onDestroy();
    }

    @Override // wt1.f
    public void onFail(int i17, java.lang.String str) {
        lu1.r.e(this, str, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
            setResult(-1);
            finish();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        xt1.t0.Bi().e(this, false);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f94687h.a();
        xt1.t0.Bi().e(this, true);
        super.onResume();
    }

    @Override // wt1.f
    public void onSuccess() {
        this.f94687h.a();
    }

    @Override // wt1.h
    public void t5(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
        if (this.f94699w) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
        this.f94699w = true;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.class);
        intent.putExtra("KEY_CARD_ID", this.f94683d.g());
        intent.putExtra("KEY_CARD_CONSUMED_JSON", str);
        intent.putExtra("KEY_CARD_COLOR", this.f94683d.s0().f388555p);
        intent.putExtra("key_stastic_scene", this.f94684e);
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
        this.f94698v.vibrate(300L);
    }

    @Override // wt1.h
    public void x4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
        finish();
    }

    @Override // wt1.h
    public void y2(tt1.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumeCodeUI", "onDataChange");
        if (jVar == null || jVar.g() == null || !jVar.g().equals(this.f94683d.g())) {
            return;
        }
        this.f94683d = jVar;
        gu1.d dVar = this.f94687h;
        dVar.f275879k = jVar;
        dVar.a();
    }
}
