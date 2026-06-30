package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.GameChatRoomBaseUI */
/* loaded from: classes8.dex */
public abstract class AbstractActivityC15842x87bee40a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public long f220284d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f220285e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f220286f = 0;

    public abstract long T6();

    public abstract long U6();

    public abstract long V6();

    public abstract long W6();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f220285e != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f220285e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChatRoomBaseUI", "visit page(%s), stayTime:%sms, foregroundTime:%sms", getClass().getSimpleName(), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f220284d));
            if (T6() != -1) {
                long T6 = T6();
                long W6 = W6();
                long V6 = V6();
                long U6 = U6();
                long j17 = this.f220284d / 1000;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e c6632x56e7d94e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e();
                c6632x56e7d94e.f139854d = T6;
                c6632x56e7d94e.f139855e = W6;
                c6632x56e7d94e.f139856f = 0L;
                c6632x56e7d94e.f139857g = 29L;
                c6632x56e7d94e.f139858h = 0L;
                c6632x56e7d94e.f139859i = V6;
                c6632x56e7d94e.f139860j = U6;
                c6632x56e7d94e.f139869s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149731d, 0L);
                c6632x56e7d94e.f139871u = c6632x56e7d94e.b("session_id", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.b().getString("session_id"), true);
                c6632x56e7d94e.f139872v = java.lang.System.currentTimeMillis();
                c6632x56e7d94e.p(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149729b);
                c6632x56e7d94e.f139867q = j17;
                c6632x56e7d94e.k();
            }
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f220284d += java.lang.System.currentTimeMillis() - this.f220286f;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f220285e == 0) {
            this.f220285e = java.lang.System.currentTimeMillis();
        }
        this.f220286f = java.lang.System.currentTimeMillis();
        super.onResume();
    }
}
