package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI */
/* loaded from: classes12.dex */
public class ActivityC13593xd0ed46ce extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43 {

    /* renamed from: r, reason: collision with root package name */
    public static final int f182183r = ip.c.d();

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f182184m;

    /* renamed from: n, reason: collision with root package name */
    public o72.r2 f182185n;

    /* renamed from: o, reason: collision with root package name */
    public o72.r2 f182186o;

    /* renamed from: p, reason: collision with root package name */
    public long f182187p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.t4 f182188q = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.w1(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58 V6() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58) findViewById(com.p314xaae8f345.mm.R.id.mcm);
    }

    public final void Z6() {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f182187p);
        this.f182185n = F;
        Y6(F);
        o72.r2 r2Var = this.f182185n;
        if (r2Var == null || r2Var.f67640x5ab01132 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", java.lang.Long.valueOf(this.f182187p));
            k82.c.f386420a.e(this.f182187p, 3);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.v1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.y1.a(this, this.f182185n);
        o72.r2 r2Var2 = this.f182186o;
        if (r2Var2 != null && r2Var2.f67638x7d4eb57c == this.f182185n.f67638x7d4eb57c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteTextDetailUI", "not change, return");
            return;
        }
        o72.r2 r2Var3 = this.f182185n;
        this.f182186o = r2Var3;
        this.f182184m.setText(r2Var3.f67640x5ab01132.f452507s);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wxa_short_link_launch_scene", "FAVORITE");
        o72.r2 r2Var4 = this.f182185n;
        if (r2Var4 != null && (bq0Var = r2Var4.f67640x5ab01132) != null && (jq0Var = bq0Var.f452495d) != null) {
            bundle.putInt("geta8key_scene", 14);
            bundle.putString("serverMsgID", jq0Var.f459579s);
            bundle.putString("msgUsername", jq0Var.f459569f);
            bundle.putString("geta8key_username", o72.c3.b(jq0Var));
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = this.f182184m;
        le0.r rVar = le0.x.P0;
        ((ke0.e) xVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.o(textView, 1, 3, bundle, rVar, true, false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.acd;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 != i17 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
        } else {
            db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572081y7));
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.x1(this), 250L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f182184m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.bfo);
        this.f182187p = getIntent().getLongExtra("key_detail_info_id", -1L);
        h45.g0.f360478a = 5;
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(mo55332x76847179()).c(this.f182184m, this, this.f182188q);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_m));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.p1(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1(this));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        Z6();
    }
}
