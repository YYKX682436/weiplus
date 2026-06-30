package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f176942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tt f176943f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, r45.wt wtVar, r45.tt ttVar) {
        this.f176941d = activityC13072x745567c8;
        this.f176942e = wtVar;
        this.f176943f = ttVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176941d;
        activityC13072x745567c8.f176798x = true;
        r45.wt wtVar = this.f176942e;
        java.lang.String card_pack_merchant_id = wtVar.f470960d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        activityC13072x745567c8.f176799y = card_pack_merchant_id;
        activityC13072x745567c8.f176800z = wtVar.f470977x;
        java.lang.String user_card_id = this.f176943f.f468298d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8.X6(activityC13072x745567c8, user_card_id);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
