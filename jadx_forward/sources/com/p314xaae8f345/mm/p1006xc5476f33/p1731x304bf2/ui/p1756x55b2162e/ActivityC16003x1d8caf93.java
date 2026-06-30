package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI2 */
/* loaded from: classes8.dex */
public class ActivityC16003x1d8caf93 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a {

    /* renamed from: g, reason: collision with root package name */
    public long f222653g;

    /* renamed from: h, reason: collision with root package name */
    public long f222654h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a
    public long T6() {
        return 10L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a
    public long U6() {
        return this.f222654h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a
    public long V6() {
        return this.f222653g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a
    public long W6() {
        return 1099L;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.di9;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.AbstractActivityC15842x87bee40a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 b17;
        super.onCreate(bundle);
        android.os.Bundle extras = getIntent().getExtras();
        if (!extras.containsKey("game_report_ssid")) {
            getIntent().putExtra("game_report_ssid", getIntent().getIntExtra("game_report_from_scene", 0));
        }
        if (!extras.containsKey("game_report_sourceid")) {
            getIntent().putExtra("game_report_sourceid", 0L);
        }
        this.f222653g = getIntent().getLongExtra("game_report_ssid", 0L);
        this.f222654h = getIntent().getLongExtra("game_report_sourceid", 0L);
        java.lang.String str = "";
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149731d = "";
        java.lang.String stringExtra = getIntent().getStringExtra("game_msg_ui_from_msgid");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(stringExtra)) != null) {
            b17.t0();
            str = b17.L2.f221904b.f221849a;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149731d = b17.T2;
        }
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.gd9, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16006x4c6b7dbb(str, true), null, 1);
        m7630xb2c12e75.d();
        mo54450xbf7c1df6("聊天");
        mo78529xe76c1b79();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.t(this));
    }
}
