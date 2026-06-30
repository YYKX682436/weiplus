package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class me extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f228718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        super(false);
        this.f228718d = z17;
        this.f228719e = activityC16377xf00b6def;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewReceiveUI", "click check detail layout");
        gb3.o.f351568a.a(5);
        boolean z17 = this.f228718d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228719e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = 6;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var = activityC16377xf00b6def.F1;
            int i17 = l6Var != null ? l6Var.f226965y : 0;
            objArr[1] = java.lang.Integer.valueOf(i17 != 0 ? i17 != 1 ? 0 : 1 : 2);
            objArr[2] = java.lang.Integer.valueOf(activityC16377xf00b6def.Y6());
            objArr[3] = 0;
            objArr[4] = 1;
            g0Var.d(11701, objArr);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC16377xf00b6def.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
        intent.putExtra("key_swipe", activityC16377xf00b6def.C1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var2 = activityC16377xf00b6def.F1;
        intent.putExtra("key_native_url", l6Var2 != null ? l6Var2.f226954n : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var3 = activityC16377xf00b6def.F1;
        intent.putExtra("key_sendid", l6Var3 != null ? l6Var3.f226953m : null);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", activityC16377xf00b6def.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", activityC16377xf00b6def.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", activityC16377xf00b6def.f227839p1);
        intent.putExtra("key_msgid", activityC16377xf00b6def.Y);
        activityC16377xf00b6def.b7(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def2 = this.f228719e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16377xf00b6def2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$onSceneEnd$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16377xf00b6def2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16377xf00b6def2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$onSceneEnd$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16377xf00b6def.finish();
        activityC16377xf00b6def.d7(ml2.f5.f408998p, true);
    }
}
