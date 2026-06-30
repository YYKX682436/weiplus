package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class cm implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228339c;

    public cm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, int i17, java.lang.String str) {
        this.f228339c = activityC16390x60cac25d;
        this.f228337a = i17;
        this.f228338b = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[setRightTextOptionMenu] OpenLiteApp fail");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bm(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f228339c.f228068w + 1);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f228339c.f228067v + 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228339c;
        g0Var.d(18892, 26, valueOf, valueOf2, activityC16390x60cac25d.K, activityC16390x60cac25d.b7(), this.f228339c.f228048J, java.lang.Integer.valueOf(r1.f228057n.mo1894x7e414b06() - 1), java.lang.Integer.valueOf(this.f228339c.a7()), java.lang.Integer.valueOf(this.f228337a), this.f228338b);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "[setRightTextOptionMenu] OpenLiteApp success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228339c;
        g0Var.d(18892, 25, java.lang.Integer.valueOf(activityC16390x60cac25d.f228068w + 1), java.lang.Integer.valueOf(activityC16390x60cac25d.f228067v + 1), activityC16390x60cac25d.K, activityC16390x60cac25d.b7(), activityC16390x60cac25d.f228048J, java.lang.Integer.valueOf(activityC16390x60cac25d.f228057n.mo1894x7e414b06() - 1), java.lang.Integer.valueOf(activityC16390x60cac25d.a7()), java.lang.Integer.valueOf(this.f228337a), this.f228338b);
    }
}
