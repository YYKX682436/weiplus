package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "iu1/a1", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI */
/* loaded from: classes9.dex */
public final class ActivityC13068x5a32e52e extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {
    public static final /* synthetic */ int B = 0;
    public au1.r A;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f176750i;

    /* renamed from: m, reason: collision with root package name */
    public iu1.v0 f176751m;

    /* renamed from: n, reason: collision with root package name */
    public int f176752n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f176754p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f176755q;

    /* renamed from: w, reason: collision with root package name */
    public iu1.w0 f176761w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f176762x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176763y;

    /* renamed from: o, reason: collision with root package name */
    public final int f176753o = 10;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176756r = true;

    /* renamed from: s, reason: collision with root package name */
    public int f176757s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f176758t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f176759u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f176760v = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final iu1.o1 f176764z = new iu1.o1(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595
    public void T6(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", java.lang.Float.valueOf(this.f176745d), java.lang.Float.valueOf(this.f176746e), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final void X6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "do delete ticket: %s", str);
        Z6(java.lang.Boolean.TRUE);
        new au1.j(str).l().h(new iu1.b1(this, str));
    }

    public final void Y6(boolean z17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f176752n);
        int i17 = this.f176753o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "do get ticket: %s, %s, %s, %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f176754p), java.lang.Boolean.valueOf(this.f176755q));
        if (z17 || !(this.f176754p || this.f176755q)) {
            this.f176755q = true;
            if (z17) {
                int i18 = this.f176752n;
                if (i18 * 2 >= i17) {
                    i17 = i18 * 2;
                }
                this.f176752n = 0;
            }
            au1.r rVar = new au1.r(this.f176752n, i17, this.f176745d, this.f176746e);
            this.A = rVar;
            rVar.l().h(new iu1.c1(this, z17));
        }
    }

    public final void Z6(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f176763y;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        this.f176763y = u3Var;
    }

    public final void a7(r45.i45 i45Var, r45.j45 j45Var, r45.j45 j45Var2, r45.k45 k45Var) {
        r45.nj4 nj4Var;
        java.util.ArrayList arrayList = this.f176760v;
        if (i45Var != null) {
            arrayList.clear();
            java.util.LinkedList page_ticket_jump_element = i45Var.f458257d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(page_ticket_jump_element, "page_ticket_jump_element");
            if (!page_ticket_jump_element.isEmpty()) {
                java.util.Iterator it = i45Var.f458257d.iterator();
                while (it.hasNext()) {
                    r45.h45 h45Var = (r45.h45) it.next();
                    iu1.w0 w0Var = new iu1.w0();
                    w0Var.f376506c = h45Var;
                    w0Var.f376504a = 1;
                    arrayList.add(w0Var);
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f176758t;
        if (j45Var != null) {
            java.util.LinkedList page_ticket_element = j45Var.f459112d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(page_ticket_element, "page_ticket_element");
            if (!page_ticket_element.isEmpty()) {
                java.util.Iterator it6 = j45Var.f459112d.iterator();
                while (it6.hasNext()) {
                    r45.g45 g45Var = (r45.g45) it6.next();
                    iu1.w0 w0Var2 = new iu1.w0();
                    w0Var2.f376507d = g45Var;
                    w0Var2.f376504a = 2;
                    arrayList2.add(w0Var2);
                }
            }
        }
        java.util.ArrayList arrayList3 = this.f176759u;
        if (j45Var2 != null) {
            java.util.LinkedList page_ticket_element2 = j45Var2.f459112d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(page_ticket_element2, "page_ticket_element");
            if (!page_ticket_element2.isEmpty()) {
                java.util.Iterator it7 = j45Var2.f459112d.iterator();
                while (it7.hasNext()) {
                    r45.g45 g45Var2 = (r45.g45) it7.next();
                    iu1.w0 w0Var3 = new iu1.w0();
                    w0Var3.f376507d = g45Var2;
                    w0Var3.f376504a = 2;
                    arrayList3.add(w0Var3);
                }
            }
        }
        if (k45Var != null && (nj4Var = k45Var.f459898d) != null) {
            iu1.w0 w0Var4 = new iu1.w0();
            this.f176761w = w0Var4;
            w0Var4.f376504a = 3;
            w0Var4.f376508e = nj4Var;
        }
        if (((!arrayList.isEmpty()) || (!arrayList2.isEmpty())) && ((!arrayList3.isEmpty()) || this.f176761w != null)) {
            iu1.v0 v0Var = this.f176751m;
            if (v0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                throw null;
            }
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572343aw2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            v0Var.E(string);
            iu1.v0 v0Var2 = this.f176751m;
            if (v0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                throw null;
            }
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.atj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            v0Var2.B(string2);
        } else {
            iu1.v0 v0Var3 = this.f176751m;
            if (v0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                throw null;
            }
            v0Var3.E("");
            iu1.v0 v0Var4 = this.f176751m;
            if (v0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
                throw null;
            }
            v0Var4.B("");
        }
        iu1.v0 v0Var5 = this.f176751m;
        if (v0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
            throw null;
        }
        iu1.w0 w0Var5 = this.f176761w;
        v0Var5.f376498f = arrayList;
        v0Var5.f376496d = arrayList2;
        v0Var5.f376497e = arrayList3;
        v0Var5.f376501i = w0Var5;
        v0Var5.m8146xced61ae5();
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
        this.f176750i = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f) findViewById;
        iu1.v0 v0Var = new iu1.v0(false);
        this.f176751m = v0Var;
        v0Var.mo8164xbbdced85(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f176750i;
        if (c12808x5de4409f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        iu1.v0 v0Var2 = this.f176751m;
        if (v0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketAdapter");
            throw null;
        }
        c12808x5de4409f.mo7960x6cab2c8d(v0Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f2 = this.f176750i;
        if (c12808x5de4409f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        c12808x5de4409f2.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(this, 1);
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562642kz));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f3 = this.f176750i;
        if (c12808x5de4409f3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        c12808x5de4409f3.N(i0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f4 = this.f176750i;
        if (c12808x5de4409f4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        c12808x5de4409f4.m53681x626a4c3f(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569847pw);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565256bv1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f5 = this.f176750i;
        if (c12808x5de4409f5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        c12808x5de4409f5.m53686x71ef750(viewGroup);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f6 = this.f176750i;
        if (c12808x5de4409f6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        c12808x5de4409f6.m53683x6891e372(new iu1.d1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f7 = this.f176750i;
        if (c12808x5de4409f7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
        c12808x5de4409f7.m53687xa1aeda28(new iu1.e1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f8 = this.f176750i;
        if (c12808x5de4409f8 != null) {
            c12808x5de4409f8.m53688x1c3e70c(new iu1.f1(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTicketRv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 256 && i18 == -1) {
            java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("key_finish_action", -1)) : null;
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_card_id") : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                X6(stringExtra);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo78530x8b45058f();
        mo43517x10010bd5();
        if (this.f176756r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "firstLoad doGetTicketHomePage");
            Y6(false);
        }
        W6();
        r45.i45 i45Var = new r45.i45();
        r45.j45 j45Var = new r45.j45();
        r45.j45 j45Var2 = new r45.j45();
        r45.k45 k45Var = new r45.k45();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_JUMP_LIST_STRING_SYNC, null);
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            i45Var.mo11468x92b714fd(bytes);
        }
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_TICKET_LIST_STRING_SYNC, null);
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            j45Var.mo11468x92b714fd(bytes2);
        }
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_LICENSE_LIST_STRING_SYNC, null);
        if (str3 != null) {
            byte[] bytes3 = str3.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
            j45Var2.mo11468x92b714fd(bytes3);
        }
        java.lang.String str4 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_UNDER_TICKET_LIST_STRING_SYNC, null);
        if (str4 != null) {
            byte[] bytes4 = str4.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes4, "getBytes(...)");
            k45Var.mo11468x92b714fd(bytes4);
        }
        a7(i45Var, j45Var, j45Var2, k45Var);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.jxu);
        mo54448x9c8c0d33(new iu1.g1(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new iu1.n1(this));
        if (getIntent().getBooleanExtra("key_ticket_page_is_from_jsapi", false)) {
            this.f176757s = 2;
        } else {
            this.f176757s = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        au1.r rVar = this.A;
        if (rVar != null) {
            rVar.j();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).hj(this.f176764z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardTicketListUI", "do save snapshot");
        r45.i45 i45Var = new r45.i45();
        i45Var.f458257d = new java.util.LinkedList();
        java.util.Iterator it = this.f176760v.iterator();
        while (it.hasNext()) {
            r45.h45 h45Var = ((iu1.w0) it.next()).f376506c;
            if (h45Var != null) {
                i45Var.f458257d.add(h45Var);
            }
        }
        r45.j45 j45Var = new r45.j45();
        j45Var.f459112d = new java.util.LinkedList();
        java.util.Iterator it6 = this.f176758t.iterator();
        while (it6.hasNext()) {
            r45.g45 g45Var = ((iu1.w0) it6.next()).f376507d;
            if (g45Var != null) {
                j45Var.f459112d.add(g45Var);
            }
        }
        r45.j45 j45Var2 = new r45.j45();
        j45Var2.f459112d = new java.util.LinkedList();
        java.util.Iterator it7 = this.f176759u.iterator();
        while (it7.hasNext()) {
            r45.g45 g45Var2 = ((iu1.w0) it7.next()).f376507d;
            if (g45Var2 != null) {
                j45Var2.f459112d.add(g45Var2);
            }
        }
        r45.k45 k45Var = new r45.k45();
        iu1.w0 w0Var = this.f176761w;
        if (w0Var != null) {
            k45Var.f459898d = w0Var.f376508e;
        }
        byte[] mo14344x5f01b1f6 = i45Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        java.nio.charset.Charset charset = r26.c.f450400c;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_JUMP_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f6, charset));
        byte[] mo14344x5f01b1f62 = j45Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f62, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_TICKET_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f62, charset));
        byte[] mo14344x5f01b1f63 = j45Var2.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f63, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_LICENSE_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f63, charset));
        byte[] mo14344x5f01b1f64 = k45Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f64, "toByteArray(...)");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_UNDER_TICKET_LIST_STRING_SYNC, new java.lang.String(mo14344x5f01b1f64, charset));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f176762x) {
            Y6(true);
            this.f176762x = false;
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(iu1.a1.class);
    }
}
