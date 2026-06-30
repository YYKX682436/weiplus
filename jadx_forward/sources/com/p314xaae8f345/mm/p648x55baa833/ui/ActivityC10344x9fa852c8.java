package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.GroupToolsManagereUI */
/* loaded from: classes11.dex */
public class ActivityC10344x9fa852c8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f145303v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f145304d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f145305e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f145306f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f145307g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.c4 f145309i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f145310m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.d4 f145311n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.c4 f145312o;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145315r;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f145308h = null;

    /* renamed from: p, reason: collision with root package name */
    public rn.h f145313p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f145314q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public boolean f145316s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f145317t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.w3 f145318u = new com.p314xaae8f345.mm.p648x55baa833.ui.n3(this);

    public final boolean T6() {
        if (this.f145316s) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ays), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayu), getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayt), false, new com.p314xaae8f345.mm.p648x55baa833.ui.q3(this), new com.p314xaae8f345.mm.p648x55baa833.ui.r3(this));
        } else {
            kn.m0.a(this.f145315r, 1, this.f145317t, this.f145313p.f479137t.size());
            finish();
        }
        return true;
    }

    public final void U6() {
        if (this.f145316s) {
            m78500x43e00957(0, true);
        } else {
            m78500x43e00957(0, false);
        }
    }

    public final void V6() {
        if (this.f145313p.f479137t.size() > 0) {
            this.f145304d.setVisibility(0);
        } else {
            this.f145304d.setVisibility(8);
        }
        if (this.f145314q.size() > 0) {
            this.f145306f.setVisibility(0);
        } else {
            this.f145306f.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569949sp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.o3(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayv), new com.p314xaae8f345.mm.p648x55baa833.ui.s3(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        U6();
        this.f145304d = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jb8);
        this.f145305e = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.jb9);
        this.f145306f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.jb6);
        this.f145307g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.jb7);
        this.f145311n = new com.p314xaae8f345.mm.p648x55baa833.ui.d4(mo55332x76847179());
        this.f145305e.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f145305e.N(this.f145311n);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.util.LinkedList linkedList = this.f145313p.f479137t;
        com.p314xaae8f345.mm.p648x55baa833.ui.w3 w3Var = this.f145318u;
        com.p314xaae8f345.mm.p648x55baa833.ui.c4 c4Var = new com.p314xaae8f345.mm.p648x55baa833.ui.c4(mo55332x76847179, true, linkedList, w3Var);
        this.f145309i = c4Var;
        this.f145305e.mo7960x6cab2c8d(c4Var);
        this.f145309i.m8146xced61ae5();
        this.f145307g.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this));
        this.f145307g.N(this.f145311n);
        this.f145312o = new com.p314xaae8f345.mm.p648x55baa833.ui.c4(mo55332x76847179(), false, this.f145314q, w3Var);
        if (this.f145313p.v0()) {
            this.f145312o.f145603f = false;
        }
        this.f145307g.mo7960x6cab2c8d(this.f145312o);
        this.f145312o.m8146xced61ae5();
        V6();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new com.p314xaae8f345.mm.p648x55baa833.ui.u3(this.f145313p.f479137t, new com.p314xaae8f345.mm.p648x55baa833.ui.p3(this)));
        this.f145310m = g1Var;
        g1Var.d(this.f145305e);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        java.lang.String stringExtra = getIntent().getStringExtra("key_chatroomname");
        this.f145315r = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomtools.GroupToolsManagereUI", "mChatRoomName is null");
            finish();
        } else {
            rn.h y07 = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(this.f145315r);
            this.f145313p = y07;
            if (y07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.roomtools.GroupToolsManagereUI", "tools is null");
                finish();
            } else {
                java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_recent_use_tools");
                if (parcelableArrayListExtra == null) {
                    this.f145314q = new java.util.LinkedList();
                } else {
                    this.f145314q.addAll(parcelableArrayListExtra);
                }
                java.util.Iterator it = this.f145313p.f479137t.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a = (com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a) it.next();
                    if (this.f145314q.contains(c10329x6f52684a)) {
                        this.f145314q.remove(c10329x6f52684a);
                    }
                }
                this.f145317t = this.f145313p.f479137t.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "mChatRoomName is %s, recentUseToolItemList:%s", this.f145315r, java.lang.Integer.valueOf(this.f145314q.size()));
            }
        }
        mo43517x10010bd5();
        gm0.j1.d().a(3546, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(3546, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f145308h;
        if (u3Var != null && u3Var.isShowing()) {
            this.f145308h.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsManagereUI", "onSceneEnd result:%s", java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().mo9952xce0038c9(this.f145313p, new java.lang.String[0])));
            kn.m0.a(this.f145315r, 3, this.f145317t, this.f145313p.f479137t.size());
            finish();
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4u);
            }
            db5.t7.m123883x26a183b(mo55332x76847179, str, 0).show();
        }
    }
}
