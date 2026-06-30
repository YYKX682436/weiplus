package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f176931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tt f176932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f176933g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f176934h;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, r45.wt wtVar, r45.tt ttVar, int i17, int i18) {
        this.f176930d = activityC13072x745567c8;
        this.f176931e = wtVar;
        this.f176932f = ttVar;
        this.f176933g = i17;
        this.f176934h = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176930d;
        activityC13072x745567c8.f176798x = true;
        r45.wt wtVar = this.f176931e;
        java.lang.String card_pack_merchant_id = wtVar.f470960d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        activityC13072x745567c8.f176799y = card_pack_merchant_id;
        activityC13072x745567c8.f176800z = wtVar.f470977x;
        r45.tt ttVar = this.f176932f;
        java.lang.String user_card_id = ttVar.f468298d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8.X6(activityC13072x745567c8, user_card_id);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19748, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000), ttVar.f468298d, java.lang.Integer.valueOf(this.f176933g), java.lang.Integer.valueOf(this.f176934h), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
