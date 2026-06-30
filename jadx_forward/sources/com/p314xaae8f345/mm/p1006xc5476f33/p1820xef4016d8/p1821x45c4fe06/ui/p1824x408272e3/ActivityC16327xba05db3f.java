package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI */
/* loaded from: classes9.dex */
public class ActivityC16327xba05db3f extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d implements pb3.b {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f226579y = 0;

    /* renamed from: m, reason: collision with root package name */
    public pb3.a f226582m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f226583n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f226584o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f226585p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f226586q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f226587r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f226588s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f226589t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f226590u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f226591v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f226592w;

    /* renamed from: h, reason: collision with root package name */
    public int f226580h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f226581i = -1;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f226593x = null;

    public final void U6() {
        if (this.f226587r == null) {
            return;
        }
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
            this.f226587r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.amv);
            this.f226587r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gmm);
        }
    }

    public final void V6(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "setBackResult cgiType:[%d],errCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            setResult(0, new android.content.Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:no permission to receive the red packet"));
        } else if (i17 == 4) {
            setResult(0, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
        }
    }

    public final void W6(android.widget.TextView textView, int i17) {
        int f17 = (int) (i65.a.f(mo55332x76847179(), i17) * i65.a.w(mo55332x76847179()));
        int h17 = i65.a.h(mo55332x76847179(), i17);
        if (h17 <= f17) {
            f17 = h17;
        }
        textView.setTextSize(0, f17);
    }

    public final void X6(boolean z17, boolean z18) {
        if (!z17) {
            android.view.View view = this.f226589t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f226590u.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f226589t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z18) {
            this.f226591v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573949gk1);
        } else {
            this.f226591v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gjl);
        }
        this.f226590u.setVisibility(8);
        this.f226589t.setOnClickListener(new pb3.d(this));
    }

    public final void Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f226592w, null);
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Z6(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f226585p.setVisibility(8);
        } else {
            this.f226585p.setText(str);
            this.f226585p.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f226586q, str2);
        this.f226586q.setVisibility(0);
    }

    public void a7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f226593x;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f226593x.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d_r;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f226592w = findViewById(com.p314xaae8f345.mm.R.id.f567347j63);
        this.f226583n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j67);
        this.f226584o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j68);
        this.f226585p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6_);
        this.f226586q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6c);
        this.f226587r = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j6g);
        this.f226588s = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j6h);
        this.f226591v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6d);
        this.f226589t = findViewById(com.p314xaae8f345.mm.R.id.j6e);
        this.f226590u = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.iy6);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j6f)).setOnClickListener(new pb3.e(this));
        W6(this.f226584o, com.p314xaae8f345.mm.R.C30860x5b28f31.a4r);
        W6(this.f226585p, com.p314xaae8f345.mm.R.C30860x5b28f31.a4s);
        W6(this.f226586q, com.p314xaae8f345.mm.R.C30860x5b28f31.a4t);
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new pb3.f(this));
        this.f226593x = Q;
        Q.show();
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        V6(this.f226581i, this.f226580h);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onCreate ");
        mo43517x10010bd5();
        getIntent();
        pb3.k kVar = new pb3.k();
        this.f226582m = kVar;
        android.content.Intent intent = getIntent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate ");
        kVar.f434713a = this;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate intent == null");
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{intent is null}}"));
            return;
        }
        kVar.f434714b = intent.getStringExtra("appId");
        kVar.f434715c = intent.getStringExtra("sendId");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f434714b) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f434715c)) {
            new lb3.e(kVar.f434714b, kVar.f434715c).a(new pb3.g(kVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate appId = [%s] sendId = [%s]", kVar.f434714b, kVar.f434715c);
            kVar.a(new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{appid or send is nil}}"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.AbstractActivityC16322x2b9a639d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onDestroy ");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f226593x;
        if (u3Var != null && u3Var.isShowing()) {
            this.f226593x.dismiss();
        }
        pb3.a aVar = this.f226582m;
        if (aVar != null) {
            pb3.k kVar = (pb3.k) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDestroy ");
            kVar.f434713a = null;
            kVar.f434717e = null;
            kVar.f434718f = null;
            this.f226582m = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f226587r.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.H(this.f226588s);
        this.f226587r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3t);
        U6();
    }
}
