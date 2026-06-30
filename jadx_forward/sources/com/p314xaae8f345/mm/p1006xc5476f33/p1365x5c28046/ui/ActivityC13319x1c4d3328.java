package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreTopicUI */
/* loaded from: classes15.dex */
public class ActivityC13319x1c4d3328 extends com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0 {
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f179375J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846
    public void U6(android.os.Message message) {
        super.U6(message);
        if (message.what == 1009) {
            t7(this.M);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void X6(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar2 = this.f179194y;
        super.X6(z17, sVar, z18, z19);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int Y6() {
        return 11;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int c7() {
        return 7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int d7() {
        return 14;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public int e7() {
        return this.I;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void g7() {
        super.g7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public void h7(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar, boolean z17, boolean z18) {
        super.h7(sVar, z17, z18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.I = getIntent().getIntExtra("topic_id", -1);
        this.f179375J = getIntent().getStringExtra("topic_name");
        this.M = getIntent().getStringExtra("topic_ad_url");
        this.K = getIntent().getStringExtra("topic_icon_url");
        this.L = getIntent().getStringExtra("topic_desc");
        this.N = getIntent().getStringExtra("sns_object_data");
        getIntent().getIntExtra("extra_scence", 0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N)) {
            this.I = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.i(this.N);
            this.f179375J = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.j(this.N);
            this.K = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.g(this.N);
            this.L = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f(this.N);
            this.M = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.h(this.N);
        }
        mo54450xbf7c1df6(this.f179375J);
        super.mo43517x10010bd5();
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80306x8f6ba587, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.m3(this));
        mo74407xb0dfae51(0, false);
        t7(this.M);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public boolean j7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public boolean k7() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.M);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0
    public j12.b l7() {
        return new i12.m(mo55332x76847179());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13278x5c32d846, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12740, 3, "", "", java.lang.Integer.valueOf(this.I), 11, 11);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreTopicUI", "exit in teen mode");
        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.AbstractActivityC13270x1ac599a0, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (this.f179186q) {
            mo74407xb0dfae51(0, false);
        } else {
            mo74407xb0dfae51(0, true);
        }
    }

    public void t7(java.lang.String str) {
        if (this.f179179g == null || this.f179180h == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.e("Toptic", 8, str, i65.a.g(this), true);
        if (e17 == null) {
            n11.a.b().j(str, null, y12.f.c("Toptic", str, false, "Toptic", "BANNER"), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.n3(this));
        } else {
            this.f179180h.m64938x75cc54fa(e17.N0());
        }
    }
}
