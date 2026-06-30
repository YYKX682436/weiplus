package com.p314xaae8f345.mm.p1006xc5476f33.fav.p1412xa3b20de3.ui;

/* renamed from: com.tencent.mm.plugin.fav.offline.ui.FavOfflineWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC13547xa84d1ae5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f181788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181789e;

    /* renamed from: f, reason: collision with root package name */
    public o72.r2 f181790f;

    /* renamed from: g, reason: collision with root package name */
    public i82.a f181791g;

    /* renamed from: h, reason: collision with root package name */
    public j82.a f181792h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f181793i = true;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.abs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        mo74406x9c8c0d33(new j82.b(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new j82.g(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.phz);
        c22633x83752a59.getClass();
        this.f181788d = c22633x83752a59;
        this.f181788d.mo120153xd15cf999().E(true);
        this.f181788d.mo120153xd15cf999().h(true);
        this.f181788d.mo120128x74041feb(this.f181792h, "java_obj");
        this.f181788d.mo74800x23d27c02(new j82.h(this));
        try {
            this.f181788d.mo64581x9b341568(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(mo55332x76847179(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.w6.i(this.f181791g.f67784x2260084a, false), false))).toString(), com.p314xaae8f345.mm.vfs.w6.M(this.f181791g.f67784x2260084a), "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        if (new o72.b3().c(this.f181790f, false, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineWebViewUI", "[onActivityResult], FavSendFilter filter true");
            db5.e1.T(getApplicationContext(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.cck));
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f181790f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6();
        f6Var.f182381b = stringExtra;
        f6Var.f182382c = intent.getStringExtra("custom_send_text");
        f6Var.f182384e = linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.h(mo55332x76847179(), f6Var, new j82.i(this, Q));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181789e = getIntent().getStringExtra("key_path");
        long longExtra = getIntent().getLongExtra("key_detail_info_id", 0L);
        if (longExtra == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "favLocalId is 0l!!!");
            finish();
            return;
        }
        i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(this.f181789e);
        this.f181791g = z07;
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "favOffline is null!!!");
            finish();
            return;
        }
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        this.f181790f = F;
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "curInfo is null!!!");
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.offline.FavOfflineWebViewUI", "mUrl : %s", this.f181789e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181789e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.offline.FavOfflineWebViewUI", "mUrl is null!!!");
            finish();
        } else {
            this.f181792h = new j82.a(this, this.f181791g);
            mo43517x10010bd5();
        }
    }
}
