package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatFavUI */
/* loaded from: classes11.dex */
public class ActivityC21585x4f340ac4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f279448d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f279449e;

    /* renamed from: f, reason: collision with root package name */
    public hb5.o f279450f;

    /* renamed from: g, reason: collision with root package name */
    public db5.t4 f279451g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f279452h;

    /* renamed from: i, reason: collision with root package name */
    public long f279453i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f279454m;

    /* renamed from: n, reason: collision with root package name */
    public s01.f f279455n;

    /* renamed from: o, reason: collision with root package name */
    public s01.l f279456o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f279457p;

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f279457p;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a97;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f279449e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.odk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dfo);
        this.f279448d = textView;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572291ao2);
        this.f279449e.setOnScrollListener(new hb5.w(this));
        this.f279450f = new hb5.o(this, new hb5.x(this), this.f279452h);
        this.f279450f.getClass();
        this.f279449e.setAdapter((android.widget.ListAdapter) this.f279450f);
        this.f279451g = new hb5.y(this);
        this.f279449e.setOnItemLongClickListener(new hb5.p(this, new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this)));
        this.f279449e.setOnItemClickListener(new hb5.q(this));
        mo54448x9c8c0d33(new hb5.v(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f279452h = getIntent().getStringExtra("Contact_User");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatFavUI", "[registerListener]");
        this.f279455n = new hb5.t(this);
        this.f279456o = new hb5.u(this);
        s01.g aj6 = r01.q3.aj();
        aj6.f483405e.a(this.f279455n, getMainLooper());
        s01.m Ui = r01.q3.Ui();
        Ui.f483434e.a(this.f279456o, getMainLooper());
        mo43517x10010bd5();
        s01.y Ni = r01.q3.Ni();
        java.lang.String str = this.f279452h;
        Ni.getClass();
        gm0.j1.n().f354821b.g(new s01.l0(str));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f279453i = ((s01.h) this.f279450f.getItem(adapterContextMenuInfo.position)).f69168x92559640;
        contextMenu.add(adapterContextMenuInfo.position, 0, 1, com.p314xaae8f345.mm.R.C30867xcad56011.f572292ao3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatFavUI", "[unRegitListener]");
        s01.g aj6 = r01.q3.aj();
        s01.f fVar = this.f279455n;
        l75.v0 v0Var = aj6.f483405e;
        if (v0Var != null) {
            v0Var.j(fVar);
        }
        s01.m Ui = r01.q3.Ui();
        s01.l lVar = this.f279456o;
        l75.v0 v0Var2 = Ui.f483434e;
        if (v0Var2 != null) {
            v0Var2.j(lVar);
        }
        this.f279450f.c();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        db5.c6 c6Var = this.f279450f.f361776q;
        if (c6Var != null) {
            c6Var.c();
        }
        this.f279454m = false;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b = "";
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f279452h, true);
        if (n17 == null || !n17.r2()) {
            finish();
            return;
        }
        m78594xca3c3c9a(8);
        this.f279454m = true;
        this.f279450f.f();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b = this.f279452h;
    }
}
