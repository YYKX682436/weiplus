package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerPersonUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI */
/* loaded from: classes14.dex */
public final class ActivityC19140xe76629ab extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: f, reason: collision with root package name */
    public long f262003f;

    /* renamed from: g, reason: collision with root package name */
    public int f262004g;

    /* renamed from: h, reason: collision with root package name */
    public int f262005h;

    /* renamed from: i, reason: collision with root package name */
    public int f262006i;

    /* renamed from: m, reason: collision with root package name */
    public int f262007m;

    /* renamed from: n, reason: collision with root package name */
    public int f262008n;

    /* renamed from: o, reason: collision with root package name */
    public dt4.p f262009o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Dialog f262010p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f262011q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f262012r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f262013s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f262001d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f262002e = "";

    /* renamed from: t, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f262014t = new ft4.h1(this);

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, java.lang.Integer.valueOf(this.f262003f > 0 ? 3 : 2), 12, 0, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", this.f262001d);
        intent.putExtra("key_username", this.f262002e);
        j45.l.j(mo55332x76847179(), "wallet_core", ".ui.ledger.WalletLedgerPersonDetailUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dea;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: hideLoading */
    public void mo48627xce38d9a() {
        android.app.Dialog dialog = this.f262010p;
        if (dialog != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
            if (dialog.isShowing()) {
                android.app.Dialog dialog2 = this.f262010p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
                dialog2.dismiss();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pyi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f262011q = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pyj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f262012r = textView;
        if (this.f262003f > 0) {
            textView.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhg));
        } else {
            textView.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhi));
        }
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.py6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f262013s = textView2;
        textView2.setOnClickListener(new ft4.l1(this));
        android.widget.TextView textView3 = this.f262013s;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
            throw null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView3);
        int i17 = this.f262008n;
        if (i17 == 1) {
            android.widget.TextView textView4 = this.f262013s;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
                throw null;
            }
            textView4.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575078lh5));
        } else if (i17 != 2) {
            android.widget.TextView textView5 = this.f262013s;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
                throw null;
            }
            textView5.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lo_));
        } else {
            android.widget.TextView textView6 = this.f262013s;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allTradeBtn");
                throw null;
            }
            textView6.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lo9));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f262011q;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.post(new ft4.n1(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        dt4.r rVar;
        p012xc85e97e9.p093xedfae76a.c1 a18;
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonUI", "onCreate");
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f262001d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_username");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f262002e = stringExtra2;
        this.f262003f = getIntent().getLongExtra("key_amount", 0L);
        this.f262004g = getIntent().getIntExtra("key_date", 0);
        this.f262005h = getIntent().getIntExtra("key_from_date", 0);
        this.f262006i = getIntent().getIntExtra("key_to_date", 0);
        this.f262007m = getIntent().getIntExtra("key_select_type", 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f262002e, true);
        if (n17 != null) {
            this.f262008n = n17.I;
        }
        mo43517x10010bd5();
        dt4.p a19 = dt4.p.f324799f.a(this.f262001d);
        this.f262009o = a19;
        a19.p(new ft4.i1());
        int i17 = this.f262004g;
        if (i17 > 0) {
            dt4.p pVar = this.f262009o;
            if (pVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                throw null;
            }
            int i18 = this.f262007m;
            java.lang.String username = this.f262002e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            rVar = new dt4.r();
            p75.m0 j17 = dm.ec.f318248r.j(pVar.f324801a);
            p75.d dVar = dm.ec.f318250t;
            p75.y yVar = (p75.y) j17.c(dVar.i(java.lang.Integer.valueOf(i17)));
            yVar.f(dm.ec.f318252v.j(username));
            p75.d dVar2 = dm.ec.f318254x;
            yVar.f(dVar2.o(0));
            if (i18 > 0) {
                yVar.f(dm.ec.f318253w.i(java.lang.Integer.valueOf(i18)));
            }
            dm.dc dcVar = new dm.dc();
            dcVar.d();
            dcVar.c();
            ((java.util.LinkedList) dcVar.f317997a).add(dVar);
            dcVar.f();
            ((java.util.LinkedList) dcVar.f317997a).add(dm.ec.f318253w);
            ((java.util.LinkedList) dcVar.f317997a).add(dVar2);
            dcVar.e();
            dcVar.f317998b = yVar;
            dcVar.b();
            p75.l0 a27 = dcVar.a();
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a18 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
            }
            java.util.Iterator it = ((java.util.ArrayList) a27.k(((xs4.b) a18).Q4(), dm.ec.class)).iterator();
            while (it.hasNext()) {
                dm.ec ecVar = (dm.ec) it.next();
                dt4.u uVar = new dt4.u();
                uVar.f324825a = ecVar.t0();
                java.lang.String D0 = ecVar.D0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D0, "getTradeUser(...)");
                uVar.f324826b = D0;
                uVar.f324828d = ecVar.v0();
                uVar.f324829e = ecVar.A0();
                uVar.f324830f = ecVar.u0();
                if (ecVar.z0() == 1) {
                    rVar.f324812b += ecVar.y0();
                    uVar.f324827c += ecVar.y0();
                    ((java.util.ArrayList) rVar.f324814d).add(uVar);
                } else {
                    rVar.f324811a -= ecVar.y0();
                    uVar.f324827c -= ecVar.y0();
                    ((java.util.ArrayList) rVar.f324813c).add(uVar);
                }
            }
        } else {
            dt4.p pVar2 = this.f262009o;
            if (pVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
                throw null;
            }
            int i19 = this.f262007m;
            java.lang.String username2 = this.f262002e;
            int i27 = this.f262005h;
            int i28 = this.f262006i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username2, "username");
            dt4.r rVar2 = new dt4.r();
            p75.m0 j18 = dm.ec.f318248r.j(pVar2.f324801a);
            p75.d dVar3 = dm.ec.f318250t;
            p75.y yVar2 = (p75.y) j18.c(dVar3.n(java.lang.Integer.valueOf(i27)));
            yVar2.f(dVar3.w(java.lang.Integer.valueOf(i28)));
            yVar2.f(dm.ec.f318252v.j(username2));
            p75.d dVar4 = dm.ec.f318254x;
            yVar2.f(dVar4.o(0));
            if (i19 > 0) {
                yVar2.f(dm.ec.f318253w.i(java.lang.Integer.valueOf(i19)));
            }
            dm.dc dcVar2 = new dm.dc();
            dcVar2.d();
            dcVar2.c();
            ((java.util.LinkedList) dcVar2.f317997a).add(dVar3);
            dcVar2.f();
            ((java.util.LinkedList) dcVar2.f317997a).add(dm.ec.f318253w);
            ((java.util.LinkedList) dcVar2.f317997a).add(dVar4);
            dcVar2.e();
            dcVar2.f317998b = yVar2;
            dcVar2.b();
            p75.l0 a28 = dcVar2.a();
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(xs4.b.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(xs4.b.class);
            }
            java.util.Iterator it6 = ((java.util.ArrayList) a28.k(((xs4.b) a17).Q4(), dm.ec.class)).iterator();
            while (it6.hasNext()) {
                dm.ec ecVar2 = (dm.ec) it6.next();
                dt4.u uVar2 = new dt4.u();
                uVar2.f324825a = ecVar2.t0();
                java.lang.String D02 = ecVar2.D0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D02, "getTradeUser(...)");
                uVar2.f324826b = D02;
                uVar2.f324828d = ecVar2.v0();
                uVar2.f324829e = ecVar2.A0();
                uVar2.f324830f = ecVar2.u0();
                if (ecVar2.z0() == 1) {
                    rVar2.f324812b += ecVar2.y0();
                    uVar2.f324827c += ecVar2.y0();
                    ((java.util.ArrayList) rVar2.f324814d).add(uVar2);
                } else {
                    rVar2.f324811a -= ecVar2.y0();
                    uVar2.f324827c -= ecVar2.y0();
                    ((java.util.ArrayList) rVar2.f324813c).add(uVar2);
                }
            }
            rVar = rVar2;
        }
        java.util.List list = rVar.f324814d;
        if (this.f262003f < 0) {
            list = rVar.f324813c;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ft4.r0 r0Var = new ft4.r0(mo55332x76847179, list);
        r0Var.f348214f = this.f262008n;
        java.lang.String str = this.f262001d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        r0Var.f348215g = str;
        java.lang.String str2 = this.f262002e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        r0Var.f348216h = str2;
        r0Var.f348217i = this.f262004g;
        r0Var.f348218m = this.f262005h;
        r0Var.f348219n = this.f262006i;
        r0Var.f348220o = this.f262003f;
        r0Var.f348222q = new ft4.j1(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f262011q;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(r0Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f262011q;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f262011q;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.i(new ft4.k1(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("detailListView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: showLoading */
    public void mo73913x2b33b77f() {
        android.app.Dialog dialog = this.f262010p;
        if (dialog == null) {
            this.f262010p = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), false, true, this.f262014t);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
        if (dialog.isShowing()) {
            return;
        }
        android.app.Dialog dialog2 = this.f262010p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
        dialog2.show();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(or4.h.class);
    }
}
