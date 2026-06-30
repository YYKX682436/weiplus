package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonDetailUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI */
/* loaded from: classes14.dex */
public final class ActivityC19139x26e1e89c extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: f, reason: collision with root package name */
    public int f261983f;

    /* renamed from: g, reason: collision with root package name */
    public int f261984g;

    /* renamed from: h, reason: collision with root package name */
    public int f261985h;

    /* renamed from: m, reason: collision with root package name */
    public int f261987m;

    /* renamed from: n, reason: collision with root package name */
    public ft4.y0 f261988n;

    /* renamed from: o, reason: collision with root package name */
    public ft4.u1 f261989o;

    /* renamed from: p, reason: collision with root package name */
    public gt4.s0 f261990p;

    /* renamed from: q, reason: collision with root package name */
    public dt4.p f261991q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f261992r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f261993s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f261994t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f261995u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f261996v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f261997w;

    /* renamed from: x, reason: collision with root package name */
    public ft4.u f261998x;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261981d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261982e = "";

    /* renamed from: i, reason: collision with root package name */
    public int f261986i = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f261999y = 1;

    /* renamed from: z, reason: collision with root package name */
    public final ft4.a1 f262000z = new ft4.a1(this);
    public final ft4.z0 A = new ft4.z0(this);
    public final ft4.d1 B = new ft4.d1(this);

    public final void U6() {
        dt4.p pVar = this.f261991q;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        dt4.s k17 = pVar.k(this.f261987m, this.f261982e, this.f261983f, this.f261984g);
        java.util.ArrayList arrayList = (java.util.ArrayList) k17.f324819e;
        if (arrayList.size() <= 0) {
            android.widget.LinearLayout linearLayout = this.f261995u;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noTradeLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            if (this.f261999y == 1) {
                dt4.p pVar2 = this.f261991q;
                if (pVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                    throw null;
                }
                java.util.List n17 = pVar2.n(this.f261982e, this.f261987m, this.f261983f, 2, true);
                if (!n17.isEmpty()) {
                    this.f261986i = ((dt4.u) kz5.n0.X(n17)).f324825a / 100;
                    android.widget.TextView textView = this.f261996v;
                    if (textView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastMonthBtn");
                        throw null;
                    }
                    textView.setVisibility(0);
                } else {
                    android.widget.TextView textView2 = this.f261996v;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastMonthBtn");
                        throw null;
                    }
                    textView2.setVisibility(8);
                }
            } else {
                android.widget.TextView textView3 = this.f261996v;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastMonthBtn");
                    throw null;
                }
                textView3.setVisibility(8);
            }
        } else {
            android.widget.LinearLayout linearLayout2 = this.f261995u;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noTradeLayout");
                throw null;
            }
            linearLayout2.setVisibility(8);
            android.widget.TextView textView4 = this.f261996v;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastMonthBtn");
                throw null;
            }
            textView4.setVisibility(8);
        }
        ft4.y0 y0Var = this.f261988n;
        if (y0Var == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ft4.y0 y0Var2 = new ft4.y0(mo55332x76847179, arrayList);
            this.f261988n = y0Var2;
            java.lang.String str = this.f261981d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            y0Var2.f348264f = str;
            ft4.y0 y0Var3 = this.f261988n;
            if (y0Var3 != null) {
                java.lang.String str2 = this.f261982e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
                y0Var3.f348265g = str2;
            }
            ft4.y0 y0Var4 = this.f261988n;
            if (y0Var4 != null) {
                y0Var4.f348274s = new ft4.f1(this);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f261992r;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(this.f261988n);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f261992r;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
                throw null;
            }
            c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f261992r;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
                throw null;
            }
            c1163xf1deaba43.i(new ft4.g1(this));
        } else if (y0Var != null) {
            y0Var.f348263e = arrayList;
        }
        ft4.y0 y0Var5 = this.f261988n;
        if (y0Var5 != null) {
            y0Var5.f348266h = this.f261999y;
        }
        if (y0Var5 != null) {
            y0Var5.f348267i = this.f261983f;
        }
        if (y0Var5 != null) {
            y0Var5.f348268m = this.f261984g;
        }
        if (y0Var5 != null) {
            y0Var5.f348271p = this.f261987m;
        }
        if (y0Var5 != null) {
            y0Var5.f348269n = k17.f324818d;
        }
        if (y0Var5 != null) {
            y0Var5.f348270o = k17.f324817c;
        }
        if (y0Var5 != null) {
            ft4.a1 callback = this.f262000z;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            y0Var5.f348272q = callback;
        }
        ft4.y0 y0Var6 = this.f261988n;
        if (y0Var6 != null) {
            ft4.z0 callback2 = this.A;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback2, "callback");
            y0Var6.f348273r = callback2;
        }
        ft4.y0 y0Var7 = this.f261988n;
        if (y0Var7 != null) {
            y0Var7.m8146xced61ae5();
        }
        ft4.u uVar = this.f261998x;
        if (uVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        uVar.f348232c = this.f261999y;
        if (uVar != null) {
            uVar.b(this.f261983f, this.f261984g, k17.f324818d, k17.f324817c);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.de7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        int u17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.u(0L, "yyyyMM") * 100;
        this.f261983f = u17 + 1;
        this.f261984g = u17 + 31;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pyb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f261992r = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pya);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f261993s = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f567062py5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f261995u = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.pyl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById4).setOnClickListener(this.f262000z);
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.pyn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f261994t = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.qu_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        this.f261996v = textView;
        textView.setOnClickListener(new ft4.c1(this));
        android.widget.TextView textView2 = this.f261996v;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastMonthBtn");
            throw null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView2);
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.q2m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f261997w = (android.widget.LinearLayout) findViewById7;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        android.widget.LinearLayout linearLayout = this.f261997w;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
        ft4.u uVar = new ft4.u(mo55332x76847179, linearLayout);
        this.f261998x = uVar;
        uVar.a(this.A);
        ft4.u uVar2 = this.f261998x;
        if (uVar2 != null) {
            uVar2.f348232c = this.f261999y;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "onCreate");
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f261981d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        this.f261982e = stringExtra2 != null ? stringExtra2 : "";
        mo43517x10010bd5();
        dt4.p a17 = dt4.p.f324799f.a(this.f261981d);
        this.f261991q = a17;
        a17.p(new ft4.b1());
        dt4.p pVar = this.f261991q;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        int j17 = pVar.j(this.f261982e);
        if (j17 > 0) {
            int i17 = (j17 / 100) * 100;
            this.f261983f = i17 + 1;
            this.f261984g = i17 + 31;
        }
        dt4.p pVar2 = this.f261991q;
        if (pVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        java.lang.String username = this.f261982e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f261985h = pVar2.i(username, 0);
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(or4.h.class);
    }
}
