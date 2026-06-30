package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class y0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 f229243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf2) {
        super(false);
        this.f229243d = activityC16361xa250edf2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - receive");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 11, 0, 0, 0, 4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf2 = this.f229243d;
        android.content.Intent intent = activityC16361xa250edf2.getIntent();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(activityC16361xa250edf2.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
        intent.putExtra("key_native_url", activityC16361xa250edf2.f227568v);
        intent.putExtra("key_sendid", activityC16361xa250edf2.C.f227150i);
        intent.putExtra("key_static_from_scene", activityC16361xa250edf2.B);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", activityC16361xa250edf2.f227569w);
        intent.putExtra("key_from_username", activityC16361xa250edf2.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("key_msgid", activityC16361xa250edf2.f227572z);
        intent.putExtra("key_hb_kind", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf22 = this.f229243d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16361xa250edf22, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$7", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16361xa250edf22.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16361xa250edf22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$7", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16361xa250edf2.W6(-1, "");
    }
}
