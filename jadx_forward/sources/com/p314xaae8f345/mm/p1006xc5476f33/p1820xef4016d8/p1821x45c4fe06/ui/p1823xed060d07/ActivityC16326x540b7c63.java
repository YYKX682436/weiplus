package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI */
/* loaded from: classes9.dex */
public class ActivityC16326x540b7c63 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d implements ob3.c, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik {

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f226563z = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.f573824fy2) + "/touch/scene_product.html?scene_id=kf7";

    /* renamed from: r, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f226571r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f226572s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f226573t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f226574u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f226575v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 f226576w;

    /* renamed from: h, reason: collision with root package name */
    public ob3.a f226564h = null;

    /* renamed from: i, reason: collision with root package name */
    public lb3.i f226565i = lb3.i.RANDOM_LUCK;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 f226566m = null;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 f226567n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea f226568o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f226569p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f226570q = null;

    /* renamed from: x, reason: collision with root package name */
    public int f226577x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6 f226578y = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6();

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b4  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D4(boolean r19, int r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63.D4(boolean, int):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d_q;
    }

    /* renamed from: hideTenpayKB */
    public void m66045xd46dd964() {
        android.view.View view = this.f226573t;
        if (view == null || !view.isShown()) {
            return;
        }
        android.view.View view2 = this.f226573t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new ob3.p(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea c16405x4886faea = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16405x4886faea) findViewById(com.p314xaae8f345.mm.R.id.j7e);
        this.f226568o = c16405x4886faea;
        c16405x4886faea.m66213x1eba9ad6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjq));
        java.lang.String stringExtra = getIntent().getStringExtra("defaultWishingWord");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initView defaultWishingWord = %s", stringExtra);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f226568o.m66213x1eba9ad6(stringExtra);
        }
        this.f226570q = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j58);
        this.f226571r = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f226573t = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        this.f226574u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567343j56);
        this.f226566m = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1) findViewById(com.p314xaae8f345.mm.R.id.j4z);
        this.f226567n = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327) findViewById(com.p314xaae8f345.mm.R.id.f567287iy1);
        this.f226569p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5l);
        this.f226576w = (com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2) findViewById(com.p314xaae8f345.mm.R.id.j6v);
        this.f226572s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j5n);
        this.f226575v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5o);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f573980go4);
        lb3.i iVar = this.f226565i;
        lb3.i iVar2 = lb3.i.RANDOM_LUCK;
        if (iVar == iVar2) {
            this.f226567n.m66042x53bfe316(getString(com.p314xaae8f345.mm.R.C30867xcad56011.go8));
            this.f226567n.m66041xd192c3d9(true);
        } else {
            this.f226567n.m66042x53bfe316(getString(com.p314xaae8f345.mm.R.C30867xcad56011.go9));
            this.f226567n.m66041xd192c3d9(false);
        }
        this.f226567n.m66040x4af3f603(this);
        this.f226567n.m66036x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.glu));
        this.f226566m.m66206x4af3f603(this);
        this.f226566m.m66202x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gmc));
        this.f226566m.m66205xca0283c4("");
        this.f226568o.m66214x4af3f603(this);
        android.widget.EditText editText = (android.widget.EditText) this.f226567n.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        android.widget.EditText editText2 = (android.widget.EditText) this.f226566m.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        ((android.view.inputmethod.InputMethodManager) mo55332x76847179().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.addTextChangedListener(new ob3.x(this));
        editText.setOnClickListener(new ob3.e(this, editText, editText2));
        editText.requestFocus();
        android.widget.TextView textView = (android.widget.TextView) this.f226567n.findViewById(com.p314xaae8f345.mm.R.id.f567289iy3);
        if (textView != null) {
            textView.setOnClickListener(new ob3.f(this, editText, editText2));
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText2);
        ((android.view.inputmethod.InputMethodManager) mo55332x76847179().getSystemService("input_method")).showSoftInput(editText2, 0);
        editText2.setOnClickListener(new ob3.g(this, editText, editText2));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) this.f226568o.findViewById(com.p314xaae8f345.mm.R.id.j6x)).setOnFocusChangeListener(new ob3.h(this, editText, editText2));
        lb3.h hVar = lb3.h.GLOBAL;
        if (this.f226565i == iVar2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 c16323xdfbab327 = this.f226567n;
            hVar.getClass();
            c16323xdfbab327.m66037x1a41789a(2000.0d);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 c16323xdfbab3272 = this.f226567n;
            hVar.getClass();
            c16323xdfbab3272.m66037x1a41789a(200.0d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.C16323xdfbab327 c16323xdfbab3273 = this.f226567n;
        hVar.getClass();
        c16323xdfbab3273.m66039x484c8f08(0.01d);
        this.f226566m.m66203x17db3a84(100);
        if (this.f226565i == iVar2) {
            this.f226566m.m66204x18476ad6(1);
        } else {
            this.f226566m.m66204x18476ad6(1);
        }
        this.f226567n.m66038x17db3113(12);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gky);
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.glb);
        java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkt);
        java.lang.String string4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.glc);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
        android.text.SpannableString spannableString = new android.text.SpannableString(string + string2);
        spannableString.setSpan(b4Var, string.length(), string.length() + string2.length(), 33);
        android.text.SpannableString spannableString2 = new android.text.SpannableString(string3 + string4);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
        spannableString2.setSpan(b4Var2, string3.length(), string3.length() + string4.length(), 33);
        b4Var.f261679d = new ob3.t(this, spannableString2);
        b4Var2.f261679d = new ob3.u(this, spannableString);
        this.f226574u.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        this.f226574u.setText(spannableString);
        this.f226574u.setVisibility(0);
        this.f226570q.setClickable(false);
        this.f226570q.setEnabled(false);
        this.f226570q.setOnClickListener(new ob3.q(this, stringExtra));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16388xef85efa1 c16388xef85efa1 = this.f226566m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6 c6Var = this.f226578y;
        c6Var.d(c16388xef85efa1);
        c6Var.d(this.f226567n);
        c6Var.d(this.f226568o);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j5_);
        if (textView2 != null) {
            c6Var.f228314d = textView2;
        } else {
            c6Var.getClass();
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22901x93fec4d2 viewOnFocusChangeListenerC22901x93fec4d2 = this.f226576w;
        if (viewOnFocusChangeListenerC22901x93fec4d2 != null) {
            viewOnFocusChangeListenerC22901x93fec4d2.setOnTouchListener(new ob3.r(this));
        }
        this.f226567n.m66043x7650bebc(this.f226565i);
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.C30861xcebc809e.ama, new ob3.s(this));
        int intExtra = getIntent().getIntExtra("range", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyPrepareUI", "initRange range = %d", java.lang.Integer.valueOf(intExtra));
        this.f226572s.setVisibility(8);
        if (intExtra == 0) {
            this.f226577x = 0;
            return;
        }
        if (intExtra == 1) {
            this.f226577x = 1;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbl));
        arrayList.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbm));
        this.f226572s.setVisibility(0);
        this.f226575v.setText((java.lang.CharSequence) arrayList.get(this.f226577x));
        this.f226572s.setOnClickListener(new ob3.w(this, arrayList));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        setResult(0, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        ob3.a0 a0Var = new ob3.a0();
        this.f226564h = a0Var;
        android.content.Intent intent = getIntent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onCreate ");
        a0Var.f425577e = intent.getStringExtra("appId");
        a0Var.f425576d = this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c6 c6Var = this.f226578y;
        ((java.util.LinkedList) c6Var.f228311a).clear();
        c6Var.f228314d = null;
        ob3.a aVar = this.f226564h;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onDestroy ");
            ((ob3.a0) aVar).f425576d = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        android.view.View view;
        if (i17 != 4 || (view = this.f226573t) == null || !view.isShown()) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.view.View view2 = this.f226573t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    /* renamed from: setEditFocusListener */
    public void m66046x8f91b80(android.view.View view, int i17, boolean z17) {
        this.f226571r = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) findViewById(com.p314xaae8f345.mm.R.id.f78324xe9b380d4);
        this.f226573t = findViewById(com.p314xaae8f345.mm.R.id.o1v);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f78325xd41a9ed3);
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.j1d);
        if (this.f226571r == null || editText == null || this.f226573t == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v0(editText);
        editText.setOnFocusChangeListener(new ob3.k(this, z17, i17, editText));
        editText.setOnClickListener(new ob3.l(this, z17, i17, editText));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567289iy3);
        if (textView != null) {
            textView.setOnClickListener(new ob3.n(this, z17, editText, view, i17));
        }
        findViewById.setOnClickListener(new ob3.o(this));
    }
}
