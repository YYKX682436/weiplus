package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterBaseUI */
/* loaded from: classes8.dex */
public abstract class AbstractActivityC15946xc98b8f0c extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336 {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f222234m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f222235n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f222236o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f222232h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f222233i = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f222237p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f222238q = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public java.lang.String T6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public java.lang.String U6() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int V6() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int W6() {
        return this.f222233i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632
    public int X6() {
        return 1000;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15945x98cc0336, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterBaseUI", "account not ready");
            finish();
        } else {
            this.f222233i = getIntent().getIntExtra("game_report_from_scene", 0);
            this.f222232h = getIntent().getBooleanExtra("from_find_more_friend", false);
            r53.f.l().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h0(this));
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(this, 10, 1000, 0, 1, 0, null, this.f222233i, 0, null, null, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.AbstractActivityC15939x24508632, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameCenterBaseUI", "account not ready");
            return;
        }
        if (!this.f222238q) {
            r53.d dVar = r53.b.f474173a;
            if (dVar.f474181b) {
                dVar.f474181b = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCenterBaseUI", "restart page from country setting");
                if (!isFinishing()) {
                    finish();
                }
                android.content.Intent intent = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
                intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
                sendBroadcast(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("game_report_from_scene", 901);
                intent2.putExtra("switch_country_no_anim", true);
                j45.l.j(this, "game", ".ui.GameCenterUI", intent2, null);
            }
        }
        this.f222238q = false;
    }
}
