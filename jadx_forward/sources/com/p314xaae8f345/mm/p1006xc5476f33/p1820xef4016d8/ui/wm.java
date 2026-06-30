package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class wm implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm f229190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.xm f229191e;

    public wm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.xm xmVar, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar) {
        this.f229191e = xmVar;
        this.f229190d = zmVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$CreateEnvelopeVH$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.xm xmVar = this.f229191e;
        if (action == 0) {
            xmVar.f229237n.m82040x7541828(xmVar.f229239p.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
            xmVar.f229235i.setTextColor(xmVar.f229239p.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        } else {
            xmVar.f229237n.m82040x7541828(xmVar.f229239p.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560880x2));
            xmVar.f229235i.setTextColor(xmVar.f229239p.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560880x2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "on click ");
            r45.wv3 wv3Var = this.f229190d.f229326b;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(wv3Var.f471044t, wv3Var.f471045u, 0, 1100);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(xmVar.f229239p.f228068w + 1);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(xmVar.f229239p.f228067v + 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = xmVar.f229239p;
            java.lang.String str = activityC16390x60cac25d.K;
            java.lang.String b76 = activityC16390x60cac25d.b7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d2 = xmVar.f229239p;
            g0Var.d(18892, 32, valueOf, valueOf2, str, b76, activityC16390x60cac25d2.f228048J, java.lang.Integer.valueOf(activityC16390x60cac25d2.f228057n.mo1894x7e414b06() - 1), java.lang.Integer.valueOf(xmVar.f229239p.a7()), java.lang.Integer.valueOf(xmVar.f229239p.k7()), xmVar.f229239p.j7());
            if (xmVar.f229231e == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click CreateEnvelopeVH: %s", java.lang.Integer.valueOf(xmVar.m8186xceeefb69()));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$CreateEnvelopeVH$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
