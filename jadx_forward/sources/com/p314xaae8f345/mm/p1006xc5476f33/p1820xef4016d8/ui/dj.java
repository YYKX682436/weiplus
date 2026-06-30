package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class dj extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f228378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9, boolean z17) {
        super(false);
        this.f228379e = activityC16387x8521db9;
        this.f228378d = z17;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        gb3.o.f351568a.a(5);
        boolean z17 = this.f228378d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228379e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            int i17 = activityC16387x8521db9.D1.f226965y;
            g0Var.d(11701, 6, java.lang.Integer.valueOf(i17 == 1 ? 1 : i17 == 0 ? 2 : 0), java.lang.Integer.valueOf(activityC16387x8521db9.X6()), 0, 1);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC16387x8521db9.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
        intent.putExtra("key_swipe", activityC16387x8521db9.A1);
        intent.putExtra("key_native_url", activityC16387x8521db9.D1.f226954n);
        intent.putExtra("key_sendid", activityC16387x8521db9.D1.f226953m);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", activityC16387x8521db9.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", activityC16387x8521db9.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", activityC16387x8521db9.f228022y0);
        intent.putExtra("key_msgid", activityC16387x8521db9.W);
        activityC16387x8521db9.Z6(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db92 = this.f228379e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16387x8521db92, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$10", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16387x8521db92.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16387x8521db92, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$10", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16387x8521db9.finish();
        activityC16387x8521db9.d7(ml2.f5.f408998p, true);
    }
}
