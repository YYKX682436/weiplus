package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 f228571d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6) {
        this.f228571d = activityC16360x5abdc0d6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11701, 10, 0, 0, 0, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16360x5abdc0d6 activityC16360x5abdc0d6 = this.f228571d;
        if (activityC16360x5abdc0d6.f227555z.isChecked()) {
            g0Var.d(13050, java.lang.Integer.valueOf(activityC16360x5abdc0d6.F), 2, activityC16360x5abdc0d6.G.f227161w);
        } else {
            g0Var.d(13050, java.lang.Integer.valueOf(activityC16360x5abdc0d6.F), 2, "");
        }
        java.lang.String stringExtra = activityC16360x5abdc0d6.getIntent().getStringExtra("key_username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var = activityC16360x5abdc0d6.G;
        activityC16360x5abdc0d6.m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5(s5Var.f227150i, s5Var.f227149h, s5Var.f227151m, activityC16360x5abdc0d6.getIntent().getStringExtra("packageExt"), stringExtra), false);
        activityC16360x5abdc0d6.f227543n.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.G(activityC16360x5abdc0d6.f227544o, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
