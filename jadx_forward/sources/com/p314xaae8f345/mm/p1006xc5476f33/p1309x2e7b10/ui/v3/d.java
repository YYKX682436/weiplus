package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176836e;

    public d(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f) {
        this.f176835d = s0Var;
        this.f176836e = activityC13069x47bc6a4f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.a) this.f176835d.f374658i;
        int i17 = aVar.a().f472882o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176836e;
        if (i17 == 1) {
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13069x47bc6a4f.mo55332x76847179(), aVar.a().f472883p, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = aVar.a().f472884q;
            if (iuVar != null) {
                lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
            }
        } else if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC13069x47bc6a4f.f176767d, "unknown type " + aVar.a().f472882o);
            java.lang.String user_card_id = aVar.a().f472875e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.T6(activityC13069x47bc6a4f, user_card_id);
        } else {
            java.lang.String user_card_id2 = aVar.a().f472875e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id2, "user_card_id");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.T6(activityC13069x47bc6a4f, user_card_id2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19674, 1, java.lang.Integer.valueOf(aVar.a().f472880m), aVar.a().f472875e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
