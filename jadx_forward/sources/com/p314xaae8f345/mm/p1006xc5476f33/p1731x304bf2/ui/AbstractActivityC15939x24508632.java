package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBaseActivity */
/* loaded from: classes8.dex */
public abstract class AbstractActivityC15939x24508632 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final int f222197d = 1;

    /* renamed from: e, reason: collision with root package name */
    public long f222198e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f222199f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f222200g = 0;

    public abstract java.lang.String T6();

    public abstract java.lang.String U6();

    public abstract int V6();

    public abstract int W6();

    public abstract int X6();

    public boolean Y6() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f222199f != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f222199f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBaseActivity", "visit page(%s), stayTime:%sms, foregroundTime:%sms", getClass().getSimpleName(), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(this.f222198e));
            if (Y6()) {
                int V6 = V6();
                int X6 = X6();
                long W6 = W6();
                jj0.b a17 = jj0.b.a(14683, java.lang.Integer.valueOf(this.f222197d), java.lang.Integer.valueOf(V6), java.lang.Integer.valueOf(X6), java.lang.Long.valueOf(W6), "", U6(), "", java.lang.Long.valueOf(currentTimeMillis / 1000), java.lang.Long.valueOf(this.f222198e / 1000), T6());
                ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) jj0.a.a()).getClass();
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.a(a17);
            }
        }
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f222198e += java.lang.System.currentTimeMillis() - this.f222200g;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.f222199f == 0) {
            this.f222199f = java.lang.System.currentTimeMillis();
        }
        this.f222200g = java.lang.System.currentTimeMillis();
        super.onResume();
    }
}
