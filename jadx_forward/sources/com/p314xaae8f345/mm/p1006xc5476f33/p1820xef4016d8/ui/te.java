package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class te extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f228991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        super(false);
        this.f228991d = f6Var;
        this.f228992e = activityC16377xf00b6def;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var = this.f228991d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = f6Var.f226818p;
        if (c19088xa4b300c1 != null) {
            intent.putExtra("key_realname_guide_helper", c19088xa4b300c1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228992e;
        intent.setClass(activityC16377xf00b6def.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
        intent.putExtra("key_swipe", activityC16377xf00b6def.C1);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", f6Var.f226815m);
        intent.putExtra("key_sendid", f6Var.f226814i);
        intent.putExtra("key_username", activityC16377xf00b6def.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_from_username", activityC16377xf00b6def.getIntent().getStringExtra("key_from_username"));
        intent.putExtra("scene_id", activityC16377xf00b6def.f227839p1);
        intent.putExtra("key_emoji_switch", f6Var.f226820r);
        intent.putExtra("key_detail_emoji_md5", f6Var.f226821s);
        intent.putExtra("key_detail_emoji_type", f6Var.f226822t);
        intent.putExtra("key_msgid", activityC16377xf00b6def.Y);
        activityC16377xf00b6def.b7(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def2 = this.f228992e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16377xf00b6def2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$openLuckyDetail$1", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16377xf00b6def2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16377xf00b6def2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$openLuckyDetail$1", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16377xf00b6def.finish();
    }
}
