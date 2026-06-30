package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI */
/* loaded from: classes12.dex */
public class ActivityC16966x2b279c15 extends com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 {
    public static final /* synthetic */ int M = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 G;
    public boolean H;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f236811w;

    /* renamed from: v, reason: collision with root package name */
    public r45.ul5 f236810v = null;

    /* renamed from: x, reason: collision with root package name */
    public long f236812x = -1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f236813y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f236814z = null;
    public boolean A = true;
    public boolean B = false;
    public java.lang.String C = "";
    public java.lang.String D = "";
    public java.lang.String E = "";
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 F = null;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w I = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w(new java.lang.ref.WeakReference(this), new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ForwardRecordMsgDataLogic", this, 1));

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f236809J = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15.AnonymousClass1(com.p314xaae8f345.mm.app.a0.f134821d);
    public final com.p314xaae8f345.mm.p947xba6de98f.c1 K = new com.p314xaae8f345.mm.p947xba6de98f.c1() { // from class: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$a
        @Override // com.p314xaae8f345.mm.p947xba6de98f.c1
        public final void a(int i17, com.p314xaae8f345.mm.p947xba6de98f.d1 d1Var) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15.M;
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15.this;
            activityC16966x2b279c15.getClass();
            if (d1Var.f152452o == activityC16966x2b279c15.f236812x && i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = activityC16966x2b279c15.f236800n;
                h0Var.f236934g.mo50293x3498a0(h0Var.f236947w);
            }
        }
    };
    public final tt.j L = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.C16968xf66cfbad(this);

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5944xbd28d2b1> {
        public AnonymousClass1(p012xc85e97e9.p093xedfae76a.y yVar) {
            super(yVar);
            this.f39173x3fe91575 = 477570721;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5944xbd28d2b1 c5944xbd28d2b1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5944xbd28d2b1 c5944xbd28d2b12 = c5944xbd28d2b1;
            if (!(c5944xbd28d2b12 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5944xbd28d2b1) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(c5944xbd28d2b12.f136245g.f87814a, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15.this.f236812x)) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgDetailUI", "msg(%s) history revoked", java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15.this.f236812x));
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.m0(this));
            return true;
        }
    }

    public static void i7(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16966x2b279c15 activityC16966x2b279c15) {
        activityC16966x2b279c15.getClass();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f415651b = 1001;
        xd5.a aVar = new xd5.a();
        long j17 = activityC16966x2b279c15.f236812x;
        int i17 = aVar.f125235d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(j17));
        aVar.set(i17 + 1, activityC16966x2b279c15.f236811w.Q0());
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(activityC16966x2b279c15.f236811w.U1());
        aVar.n(cVar);
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(activityC16966x2b279c15, aVar, rVar);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 a7() {
        if (getIntent().getIntExtra("from_scene", 0) == 3) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.q(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.r(this.I));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.z());
        xVar.f237130x = getIntent().getIntExtra("from_scene", 0);
        xVar.f236945u = getIntent().getStringExtra("msgUsername");
        xVar.f236931d = getIntent().getIntExtra("chatTypeForAppbrand", -1);
        xVar.f236932e = getIntent().getStringExtra("preChatName");
        java.lang.String stringExtra = getIntent().getStringExtra("serverMsgID");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("prePublishId");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                stringExtra = stringExtra2.replace("msg_", "");
            }
        }
        xVar.f236946v = stringExtra;
        return xVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String b7() {
        return this.E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String c7() {
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public java.lang.String d7() {
        return this.C;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void e7() {
        this.f236812x = getIntent().getLongExtra("message_id", -1L);
        this.f236813y = getIntent().getStringExtra("message_talker");
        this.f236814z = getIntent().getStringExtra("record_xml");
        this.A = getIntent().getBooleanExtra("record_show_share", true);
        this.B = getIntent().getBooleanExtra("big_appmsg", false);
        this.H = getIntent().getBooleanExtra("record_nest", false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("pre_username"))) {
            getIntent().getStringExtra("msgUsername");
        }
        getIntent().getStringExtra("serverMsgID");
        this.f236810v = bt3.g2.A(this.f236814z);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f236813y, this.f236812x);
        this.f236811w = Li;
        ot0.q v17 = ot0.q.v(Li.U1());
        if (v17 != null && this.f236810v == null) {
            this.f236810v = bt3.g2.A(v17.f430196h0);
        }
        r45.ul5 ul5Var = this.f236810v;
        if (ul5Var != null) {
            if (j7(ul5Var) != null) {
                this.C = j7(this.f236810v);
            } else {
                this.C = this.f236810v.f468996d;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f236810v.f468998f)) {
                this.D = ((r45.gp0) this.f236810v.f468998f.getFirst()).M1;
                this.E = ((r45.gp0) this.f236810v.f468998f.getLast()).M1;
            }
        } else if (this.f236811w != null && v17 != null) {
            this.C = v17.f430187f;
            this.F = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 0, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgDetailUI", "loading");
        }
        r45.ul5 ul5Var2 = this.f236810v;
        if (ul5Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w wVar = this.I;
            wVar.getClass();
            pm0.v.O("ForwardRecordMsgDataLogic", new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.v(ul5Var2, true, wVar));
            k7();
            return;
        }
        g7();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.n0(this));
        if (!this.B || com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(this.f236812x, this.f236811w.Q0()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(this.f236813y, this.f236812x);
        c01.d9.e().g(new bt3.l0(this.f236812x, Li2.Q0(), Li2.I0(), v17 != null ? v17.f430199i : 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.o0(this), true));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void f7(int i17, int i18, android.content.Intent intent) {
        if (-1 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgDetailUI", "processResult %d", java.lang.Integer.valueOf(i18));
            return;
        }
        if (1001 != i17) {
            if (1002 == i17 && intent.getBooleanExtra("kfavorite", false)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.l(c5303xc75d2f73, intent);
                am.c4 c4Var = c5303xc75d2f73.f135623g;
                c4Var.f87856i = this;
                c4Var.f87860m = 8;
                c5303xc75d2f73.e();
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(this.f236813y, this.f236812x);
        if (Li.m124847x74d37ac6() != this.f236812x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
        } else {
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.v0(this, stringExtra, stringExtra2, Li, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null)));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695
    public void h7() {
        boolean booleanExtra = getIntent().getBooleanExtra("show_jump_chat", false);
        if (this.A || booleanExtra) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t0(this, booleanExtra));
        }
    }

    public final java.lang.String j7(r45.ul5 ul5Var) {
        java.lang.String str = null;
        if (ul5Var == null) {
            return null;
        }
        java.util.Iterator it = ul5Var.f468998f.iterator();
        java.lang.String str2 = null;
        boolean z17 = false;
        java.lang.String str3 = null;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            r45.ip0 ip0Var = gp0Var.J1.f457886d;
            if (ip0Var.f458770o != null) {
                str2 = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsy);
                z17 = true;
            } else if (ip0Var.f458764f != null) {
                if (str == null) {
                    str = gp0Var.K1;
                } else {
                    java.lang.String str4 = gp0Var.K1;
                    if (str != str4) {
                        str3 = str4;
                    }
                }
            }
        }
        return (str == null || str3 != null || z17) ? (str == null || str3 == null || str.equals(str3) || z17) ? str2 : mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572741cc5, str, str3) : mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cc6, str);
    }

    public void k7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.y();
        r45.ul5 ul5Var = this.f236810v;
        if (ul5Var != null) {
            yVar.f236875a = ul5Var.f468998f;
        }
        yVar.f237136c = this.f236812x;
        yVar.f237139f = this.f236813y;
        yVar.f237137d = this.f236811w;
        yVar.f237138e = this.f236814z;
        yVar.f236876b = new bt3.g3();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f236811w;
        if (f9Var != null && !this.H && f9Var.W0() != null) {
            try {
                yVar.f236876b.mo11468x92b714fd(this.f236811w.W0().getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RecordMsgDetailUI", e17, "", new java.lang.Object[0]);
            }
        }
        super.e7();
        this.f236800n.h(yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2(this, this.f236800n, yVar);
        this.G = l2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = this.f236800n;
        h0Var.f236943s = l2Var;
        if (h0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x) {
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).y0((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x) this.f236800n);
        }
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).wi(this.K);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f236809J.mo48813x58998cd();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.RecordMsgDetailUI);
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        tt.j listener = this.L;
        ((ot.w) l0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        jz5.g gVar = ot.w.f429873m;
        ((java.util.HashSet) ((jz5.n) ot.w.f429873m).mo141623x754a37bb()).add(new d75.c(listener));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        super.onDestroy();
        this.f236809J.mo48814x2efc64();
        if (this.f236800n instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x) {
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0((com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.x) this.f236800n);
        }
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.K);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.b1 bj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.bj();
        if (bj6 != null) {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) bj6.f152421h).mo141623x754a37bb(), null, new com.p314xaae8f345.mm.p947xba6de98f.u0(bj6, null), 1, null);
        }
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        tt.j listener = this.L;
        ((ot.w) l0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        jz5.g gVar = ot.w.f429873m;
        ((java.util.HashSet) ((jz5.n) ot.w.f429873m).mo141623x754a37bb()).remove(new d75.c(listener));
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = this.G;
        if (l2Var != null) {
            byte[] e17 = l2Var.e();
            if (this.H || (f9Var = this.f236811w) == null || e17 == null || e17.length <= 0) {
                return;
            }
            f9Var.D1(new java.lang.String(e17, java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(this.f236812x, this.f236811w);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.l2 l2Var = this.G;
        if (l2Var != null) {
            l2Var.f236978d = false;
        }
    }
}
