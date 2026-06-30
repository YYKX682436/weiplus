package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerDayDetailUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerDayDetailUI */
/* loaded from: classes14.dex */
public final class ActivityC19137x536ca21f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: e, reason: collision with root package name */
    public int f261947e;

    /* renamed from: f, reason: collision with root package name */
    public int f261948f;

    /* renamed from: h, reason: collision with root package name */
    public int f261950h;

    /* renamed from: i, reason: collision with root package name */
    public ft4.u1 f261951i;

    /* renamed from: n, reason: collision with root package name */
    public ft4.i f261953n;

    /* renamed from: o, reason: collision with root package name */
    public dt4.p f261954o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f261955p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f261956q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f261957r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f261958s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261946d = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f261949g = true;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f261952m = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final ft4.q f261959t = new ft4.q(this);

    /* renamed from: u, reason: collision with root package name */
    public final ft4.s f261960u = new ft4.s(this);

    public final java.lang.String U6(long j17, long j18) {
        double d17 = 100;
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575076lh3, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(java.lang.Math.abs(j18) / d17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575077lh4, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(java.lang.Math.abs(j17) / d17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string + "  " + string2;
    }

    public final void V6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        dt4.t tVar = new dt4.t();
        tVar.f324820a = this.f261947e;
        tVar.f324821b = this.f261948f;
        arrayList.add(tVar);
        dt4.p pVar = this.f261954o;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        java.util.List l17 = pVar.l(this.f261950h, arrayList);
        java.util.List list = this.f261952m;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) l17;
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            dt4.t tVar2 = (dt4.t) it.next();
            tVar2.f324824e.size();
            java.util.Iterator it6 = ((java.util.TreeMap) kz5.b1.g(tVar2.f324824e, new ft4.p())).entrySet().iterator();
            while (it6.hasNext()) {
                arrayList2.add(new ft4.j(2, new ft4.k(), (dt4.q) ((java.util.Map.Entry) it6.next()).getValue()));
            }
        }
        if (arrayList3.isEmpty()) {
            android.widget.TextView textView = this.f261957r;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("summarizeText");
                throw null;
            }
            textView.setText(U6(0L, 0L));
            android.widget.LinearLayout linearLayout = this.f261958s;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noTradeLayout");
                throw null;
            }
            linearLayout.setVisibility(0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f261956q;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            c1163xf1deaba4.setVisibility(8);
        } else {
            android.widget.TextView textView2 = this.f261957r;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("summarizeText");
                throw null;
            }
            textView2.setText(U6(((dt4.t) arrayList3.get(0)).f324823d, ((dt4.t) arrayList3.get(0)).f324822c));
            android.widget.LinearLayout linearLayout2 = this.f261958s;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noTradeLayout");
                throw null;
            }
            linearLayout2.setVisibility(8);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f261956q;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            c1163xf1deaba42.setVisibility(0);
        }
        ft4.i iVar = this.f261953n;
        if (iVar == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ft4.i iVar2 = new ft4.i(mo55332x76847179, list);
            this.f261953n = iVar2;
            java.lang.String str = this.f261946d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            iVar2.f348157f = str;
            ft4.i iVar3 = this.f261953n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar3);
            iVar3.f348160i = false;
            ft4.i iVar4 = this.f261953n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar4);
            iVar4.f348161m = !this.f261949g;
            ft4.i iVar5 = this.f261953n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar5);
            iVar5.f348158g = 0;
            ft4.i iVar6 = this.f261953n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar6);
            iVar6.f348159h = 0;
            ft4.i iVar7 = this.f261953n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar7);
            iVar7.f348162n = new ft4.t(this);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f261956q;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            c1163xf1deaba43.mo7960x6cab2c8d(this.f261953n);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f261956q;
            if (c1163xf1deaba44 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
            c1163xf1deaba44.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
            iVar.f348156e = list;
        }
        ft4.i iVar8 = this.f261953n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar8);
        iVar8.m8146xced61ae5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571151dm5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pym);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById).setOnClickListener(this.f261959t);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pyo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f261955p = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qxv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f261956q = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.q2t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f261957r = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f567062py5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f261958s = (android.widget.LinearLayout) findViewById5;
        android.widget.TextView textView = this.f261955p;
        if (textView != null) {
            textView.setText(mo55332x76847179().getString(dt4.p.f324799f.c(this.f261950h)));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeText");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0137  */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f.onCreate(android.os.Bundle):void");
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
