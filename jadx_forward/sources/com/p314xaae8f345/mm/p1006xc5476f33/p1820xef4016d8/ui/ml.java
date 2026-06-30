package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ml implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228729d;

    public ml(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d) {
        this.f228729d = activityC16390x60cac25d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f228729d;
        int i17 = activityC16390x60cac25d.f228067v;
        if (i17 >= 0 && i17 < activityC16390x60cac25d.f228057n.mo1894x7e414b06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "normal scroll，pos: %s", java.lang.Integer.valueOf(activityC16390x60cac25d.f228067v));
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16364x2d32e7b c16364x2d32e7b = activityC16390x60cac25d.f228054i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1828x52f6dc24.C16338xd9ca7419 c16338xd9ca7419 = activityC16390x60cac25d.f228056m;
            int b07 = c16338xd9ca7419.b0(activityC16390x60cac25d.f228067v);
            if (c16338xd9ca7419.f227276y == 1) {
                c16364x2d32e7b.scrollBy(0, b07);
            } else {
                c16364x2d32e7b.scrollBy(b07, 0);
            }
        }
        java.lang.Math.max(activityC16390x60cac25d.f228067v, 0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = activityC16390x60cac25d.H;
        if (w2Var == null) {
            activityC16390x60cac25d.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ll(this);
        } else {
            activityC16390x60cac25d.f228054i.V0(w2Var);
        }
        activityC16390x60cac25d.f228054i.i(activityC16390x60cac25d.H);
    }
}
