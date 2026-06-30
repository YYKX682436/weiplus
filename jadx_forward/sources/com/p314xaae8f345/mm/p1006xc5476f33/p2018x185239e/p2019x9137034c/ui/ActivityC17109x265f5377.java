package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI */
/* loaded from: classes9.dex */
public class ActivityC17109x265f5377 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce implements db5.t4 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f238071q = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f238072e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f238073f;

    /* renamed from: g, reason: collision with root package name */
    public qw3.t1 f238074g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f238075h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f238076i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f238077m;

    /* renamed from: n, reason: collision with root package name */
    public int f238078n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f238079o = -1;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Intent f238080p;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569723k0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f238072e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.azc);
        this.f238073f = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(this);
        qw3.t1 t1Var = new qw3.t1(this, null);
        this.f238074g = t1Var;
        this.f238072e.setAdapter((android.widget.ListAdapter) t1Var);
        this.f238072e.setOnItemClickListener(new qw3.m1(this));
        this.f238072e.setOnItemLongClickListener(new qw3.n1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.AbstractActivityC17102xb060a8ce, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_self_transfer_record_list");
        java.util.ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("key_freq_transfer_record_list");
        this.f238075h = new java.util.ArrayList();
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            this.f238078n = 0;
            ((java.util.ArrayList) this.f238075h).addAll(parcelableArrayListExtra);
        }
        if (parcelableArrayListExtra2 != null && !parcelableArrayListExtra2.isEmpty()) {
            this.f238079o = ((java.util.ArrayList) this.f238075h).size() + this.f238078n + 1;
            ((java.util.ArrayList) this.f238075h).addAll(parcelableArrayListExtra2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "selfHeaderPos: %s, otherHeaderPos: %s", java.lang.Integer.valueOf(this.f238078n), java.lang.Integer.valueOf(this.f238079o));
        java.util.Iterator it = ((java.util.ArrayList) this.f238075h).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) it.next()).f238003d;
        }
        this.f238080p = new android.content.Intent();
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aez);
        m83090x14f40144(1590);
        m83090x14f40144(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g0.f34294x366c91de);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.aex);
        contextMenu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.aeu);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1590);
        m83121xf6ff5b27(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g0.f34294x366c91de);
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) this.f238072e.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (c17100xa183cf65 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "select record is null");
            return;
        }
        if (itemId == 1) {
            gt4.l.b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9y), c17100xa183cf65.f238009m, "", false, 32, new qw3.o1(this, c17100xa183cf65), new qw3.q1(this));
        } else {
            if (itemId != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "unknown itemId: %s", java.lang.Integer.valueOf(itemId));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "do delete record");
            m83099x5406100e(new ow3.e(c17100xa183cf65.f238003d), true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14673, 7);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ow3.h) {
            ow3.h hVar = (ow3.h) m1Var;
            hVar.O(new qw3.r1(this, hVar));
            if (hVar.f295565m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", java.lang.Integer.valueOf(hVar.f430944s.f462261d), hVar.f430944s.f462262e);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f430944s.f462262e)) {
                    dp.a.m125854x26a183b(this, hVar.f430944s.f462262e, 1).show();
                }
            }
            if (!hVar.f295564i) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", hVar);
            return false;
        }
        if (!(m1Var instanceof ow3.e)) {
            return false;
        }
        ow3.e eVar = (ow3.e) m1Var;
        eVar.O(new qw3.l1(this, eVar));
        if (eVar.f295565m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitSelectPayeeUI", "reponse error: %s, msg: %s", java.lang.Integer.valueOf(eVar.f430933s.f461909d), eVar.f430933s.f461910e);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f430933s.f461910e)) {
                dp.a.m125854x26a183b(this, eVar.f430933s.f461910e, 1).show();
            }
        }
        if (!eVar.f295564i) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankRemitSelectPayeeUI", "net error: %s", eVar);
        return false;
    }
}
