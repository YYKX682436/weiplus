package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI */
/* loaded from: classes9.dex */
public class ActivityC16100x8f3665d6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f223838f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f223839g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f223840h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f223841i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f223842m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f223843n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f223844o;

    /* renamed from: p, reason: collision with root package name */
    public long f223845p;

    /* renamed from: q, reason: collision with root package name */
    public int f223846q;

    /* renamed from: r, reason: collision with root package name */
    public r45.an6 f223847r;

    /* renamed from: s, reason: collision with root package name */
    public int f223848s;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(activityC16100x8f3665d6.f223847r == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do get pwd token: %s", objArr);
        if (activityC16100x8f3665d6.f223847r != null) {
            activityC16100x8f3665d6.m83138x296ea477();
            java.lang.String m83161xfb85ada3 = activityC16100x8f3665d6.f223838f.m83161xfb85ada3();
            r45.an6 an6Var = activityC16100x8f3665d6.f223847r;
            activityC16100x8f3665d6.m83099x5406100e(new ss4.c0(m83161xfb85ada3, an6Var.f451692g, an6Var.f451689d, an6Var.f451690e, an6Var.f451691f, an6Var.f451693h), false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: cleanUiData */
    public void mo65144xd0a01007(int i17) {
        super.mo65144xd0a01007(i17);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f223838f;
        if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
            viewOnFocusChangeListenerC22906x9d30fd14.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) findViewById(com.p314xaae8f345.mm.R.id.hdh);
        this.f223838f = viewOnFocusChangeListenerC22906x9d30fd14;
        qp5.p.b(viewOnFocusChangeListenerC22906x9d30fd14);
        this.f223838f.m83166x1270e8e7(new v73.w(this));
        m83125x8f91b80(this.f223838f, 0, false);
        this.f223840h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pes);
        this.f223839g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.peo);
        int i17 = this.f223846q;
        if (i17 == 1) {
            this.f223840h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwo);
        } else if (i17 == 2) {
            this.f223840h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwp);
        } else {
            this.f223840h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwr);
        }
        this.f223839g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwq);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f223841i = getIntent().getStringExtra("key_username");
        this.f223842m = getIntent().getStringExtra("key_take_message");
        this.f223845p = getIntent().getLongExtra("key_credit_line", 0L);
        this.f223846q = getIntent().getIntExtra("key_scene", 0);
        this.f223843n = getIntent().getStringExtra("key_card_no");
        this.f223844o = getIntent().getStringExtra("key_wishing");
        if (this.f223846q == 1) {
            int intExtra = getIntent().getIntExtra("key_cardtype", 0);
            this.f223848s = intExtra;
            if (intExtra == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayCheckPwdUI", "error card type: %s", java.lang.Integer.valueOf(intExtra));
                finish();
            }
        }
        int i17 = this.f223846q;
        if (i17 == 3 || i17 == 2) {
            r45.an6 an6Var = new r45.an6();
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_toke_mess");
                if (byteArrayExtra == null || byteArrayExtra.length == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayCheckPwdUI", "toke mess is null when unbind !!!");
                    finish();
                }
                an6Var.mo11468x92b714fd(byteArrayExtra);
                this.f223847r = an6Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HoneyPayCheckPwdUI", e17, "", new java.lang.Object[0]);
                finish();
            }
        }
        mo54450xbf7c1df6("");
        m83090x14f40144(2662);
        m83090x14f40144(2685);
        m83090x14f40144(2630);
        m83090x14f40144(2815);
        m83090x14f40144(2659);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2662);
        m83121xf6ff5b27(2685);
        m83121xf6ff5b27(2630);
        m83121xf6ff5b27(2815);
        m83121xf6ff5b27(2659);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ss4.c0) {
            ss4.c0 c0Var = (ss4.c0) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd14 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd14.a();
                }
                m83114xe5d7a18f();
                if (!c0Var.m83017x15b23bda() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "show normal error msg");
                    db5.e1.G(mo55332x76847179(), str, null, false, new v73.x(this));
                }
                return true;
            }
            int i19 = this.f223846q;
            if (i19 == 1) {
                java.lang.String str2 = c0Var.f493560d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do give card");
                m83138x296ea477();
                r73.c cVar = new r73.c(str2, this.f223845p, this.f223841i, this.f223842m, this.f223848s, this.f223844o);
                cVar.K(this);
                m83099x5406100e(cVar, false);
            } else if (i19 == 2) {
                java.lang.String str3 = c0Var.f493560d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do modify quota");
                m83138x296ea477();
                r73.h hVar = new r73.h(this.f223845p, str3, this.f223843n);
                hVar.K(this);
                m83099x5406100e(hVar, false);
            } else if (i19 == 3) {
                java.lang.String str4 = c0Var.f493560d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "do unbind: %s", this.f223843n);
                m83138x296ea477();
                r73.n nVar = new r73.n(this.f223843n, str4);
                nVar.K(this);
                m83099x5406100e(nVar, false);
            }
        } else if (m1Var instanceof r73.c) {
            r73.c cVar2 = (r73.c) m1Var;
            m83114xe5d7a18f();
            cVar2.O(new v73.y(this, cVar2));
            if (cVar2.f295565m) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd142 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd142 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd142.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 3L, 1L);
            }
            if (cVar2.f295564i) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd143 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd143 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd143.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 3L, 1L);
            }
        } else if (m1Var instanceof r73.h) {
            m83114xe5d7a18f();
            r73.h hVar2 = (r73.h) m1Var;
            if (!hVar2.f295564i && !hVar2.f295565m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "modify success");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_modify_create_line_succ", true);
                intent.putExtra("key_credit_line", hVar2.f474705s);
                setResult(-1, intent);
                finish();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 8L, 1L);
            }
            if (hVar2.f295565m) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd144 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd144 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd144.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 9L, 1L);
            }
            if (hVar2.f295564i) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd145 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd145 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd145.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 9L, 1L);
            }
        } else if (m1Var instanceof r73.d) {
            r73.d dVar = (r73.d) m1Var;
            dVar.O(new v73.v(this, dVar));
            dVar.J(new v73.t(this, dVar));
            if (dVar.f295564i) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd146 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd146 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd146.a();
                }
                m83114xe5d7a18f();
            }
        } else if (m1Var instanceof r73.g) {
            r73.g gVar = (r73.g) m1Var;
            this.f223847r = gVar.f474703r.f455911d;
            if (!gVar.f295564i && !gVar.f295565m) {
                V6(this);
            }
            if (gVar.f295565m) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd147 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd147 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd147.a();
                }
                m83114xe5d7a18f();
            }
            if (gVar.f295564i) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd148 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd148 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd148.a();
                }
                m83114xe5d7a18f();
            }
        } else if (m1Var instanceof r73.n) {
            m83114xe5d7a18f();
            r73.n nVar2 = (r73.n) m1Var;
            if (!nVar2.f295564i && !nVar2.f295565m) {
                setResult(-1);
                finish();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 6L, 1L);
            }
            if (nVar2.f295565m) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd149 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd149 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd149.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 7L, 1L);
            }
            if (nVar2.f295564i) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd1410 = this.f223838f;
                if (viewOnFocusChangeListenerC22906x9d30fd1410 != null) {
                    viewOnFocusChangeListenerC22906x9d30fd1410.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 7L, 1L);
            }
        }
        return true;
    }
}
