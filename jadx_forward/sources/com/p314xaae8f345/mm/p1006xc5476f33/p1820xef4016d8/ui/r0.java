package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5 f228892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 f228893e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5 r5Var) {
        this.f228893e = activityC16360x5abdc0d6;
        this.f228892d = r5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6 = this.f228893e;
        intent.setClass(activityC16360x5abdc0d6.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5 r5Var = this.f228892d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = r5Var.f227124u;
        if (c19088xa4b300c1 != null) {
            intent.putExtra("key_realname_guide_helper", c19088xa4b300c1);
        }
        intent.putExtra("key_native_url", activityC16360x5abdc0d6.B);
        intent.putExtra("key_sendid", r5Var.f227114h);
        intent.putExtra("key_static_from_scene", activityC16360x5abdc0d6.F);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d62 = this.f228893e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16360x5abdc0d62, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16360x5abdc0d62.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16360x5abdc0d62, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16360x5abdc0d6.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
