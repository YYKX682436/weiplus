package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176826e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, in5.s0 s0Var) {
        this.f176825d = activityC13072x745567c8;
        this.f176826e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$onBindViewHolder$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176825d;
        java.lang.String str = activityC13072x745567c8.f176786i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click header view: ");
        in5.s0 s0Var = this.f176826e;
        sb6.append(s0Var.m8183xf806b362());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.wt a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w) s0Var.f374658i).a();
        int i17 = a17.f470965i;
        if (i17 == 1) {
            activityC13072x745567c8.f176798x = true;
            java.lang.String card_pack_merchant_id = a17.f470960d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pack_merchant_id, "card_pack_merchant_id");
            activityC13072x745567c8.f176799y = card_pack_merchant_id;
            activityC13072x745567c8.f176800z = a17.f470977x;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13072x745567c8.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo55332x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo55332x76847179, a17.f470966m, 0);
        } else if (i17 == 2) {
            activityC13072x745567c8.f176798x = true;
            java.lang.String card_pack_merchant_id2 = a17.f470960d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pack_merchant_id2, "card_pack_merchant_id");
            activityC13072x745567c8.f176799y = card_pack_merchant_id2;
            activityC13072x745567c8.f176800z = a17.f470977x;
            r45.iu iuVar = a17.f470967n;
            lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$onBindViewHolder$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
