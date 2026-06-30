package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardInvalidTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI */
/* loaded from: classes9.dex */
public final class ActivityC13065x7a79a025 extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f176731v = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f176732i;

    /* renamed from: m, reason: collision with root package name */
    public iu1.v0 f176733m;

    /* renamed from: o, reason: collision with root package name */
    public int f176735o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176737q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176738r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176739s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176741u;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f176734n = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final int f176736p = 10;

    /* renamed from: t, reason: collision with root package name */
    public boolean f176740t = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595
    public void T6(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", java.lang.Float.valueOf(this.f176745d), java.lang.Float.valueOf(this.f176746e), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (this.f176740t) {
            X6();
        } else {
            if (z17) {
                return;
            }
            W6();
        }
    }

    public final void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "do get invalid ticket: %s, %s, %s, %s", java.lang.Integer.valueOf(this.f176735o), java.lang.Integer.valueOf(this.f176736p), java.lang.Boolean.valueOf(this.f176737q), java.lang.Boolean.valueOf(this.f176738r));
        if (this.f176737q || this.f176738r) {
            return;
        }
        this.f176738r = true;
        new au1.q(this.f176735o, this.f176736p, this.f176745d, this.f176746e).l().h(new iu1.f0(this));
    }

    public final iu1.v0 Y6() {
        iu1.v0 v0Var = this.f176733m;
        if (v0Var != null) {
            return v0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f Z6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f176732i;
        if (c12808x5de4409f != null) {
            return c12808x5de4409f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
        throw null;
    }

    public final void a7(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f176741u;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        this.f176741u = u3Var;
    }

    public final void b7(r45.j45 j45Var) {
        java.util.ArrayList arrayList = this.f176734n;
        if (j45Var != null) {
            java.util.LinkedList page_ticket_element = j45Var.f459112d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(page_ticket_element, "page_ticket_element");
            if (!page_ticket_element.isEmpty()) {
                java.util.Iterator it = j45Var.f459112d.iterator();
                while (it.hasNext()) {
                    r45.g45 g45Var = (r45.g45) it.next();
                    iu1.w0 w0Var = new iu1.w0();
                    w0Var.f376507d = g45Var;
                    w0Var.f376504a = 2;
                    arrayList.add(w0Var);
                }
            }
        }
        iu1.v0 Y6 = Y6();
        Y6.f376498f = null;
        Y6.f376496d = arrayList;
        Y6.f376497e = null;
        Y6.f376501i = null;
        Y6.m8146xced61ae5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569905rj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cnr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f176732i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) findViewById;
        this.f176733m = new iu1.v0(true);
        Y6().mo8164xbbdced85(true);
        Z6().mo7960x6cab2c8d(Y6());
        Z6().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        Z6().m53686x71ef750(findViewById(com.p314xaae8f345.mm.R.id.f565256bv1));
        ((android.widget.TextView) Z6().m53685xaacb36dc().findViewById(com.p314xaae8f345.mm.R.id.f565257bv2)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.asz));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) Z6().m53685xaacb36dc().findViewById(com.p314xaae8f345.mm.R.id.f565255bv0);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79552x4ca416f);
        c22699x3dcdb352.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(this, 1);
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562642kz));
        Z6().N(i0Var);
        Z6().m53681x626a4c3f(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569847pw);
        Z6().m53683x6891e372(new iu1.g0(this));
        Z6().m53687xa1aeda28(new iu1.h0(this));
        Z6().m53688x1c3e70c(new iu1.i0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo78530x8b45058f();
        mo43517x10010bd5();
        r45.j45 j45Var = new r45.j45();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_INVALID_TICKET_STRING_SYNC, null);
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            j45Var.mo11468x92b714fd(bytes);
        }
        b7(j45Var);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jxt);
        mo54448x9c8c0d33(new iu1.j0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 9);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r45.j45 j45Var = new r45.j45();
        j45Var.f459112d = new java.util.LinkedList();
        java.util.Iterator it = this.f176734n.iterator();
        while (it.hasNext()) {
            r45.g45 g45Var = ((iu1.w0) it.next()).f376507d;
            if (g45Var != null) {
                j45Var.f459112d.add(g45Var);
            }
        }
        byte[] mo14344x5f01b1f6 = j45Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_INVALID_TICKET_STRING_SYNC, new java.lang.String(mo14344x5f01b1f6, r26.c.f450400c));
    }
}
