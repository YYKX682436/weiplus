package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228459d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f228459d = activityC16363x8a0a619d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228459d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar = activityC16363x8a0a619d.f227614n2;
        if (nVar == null) {
            activityC16363x8a0a619d.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(nVar)) {
            activityC16363x8a0a619d.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            activityC16363x8a0a619d.f227617o2.b(activityC16363x8a0a619d.f227614n2, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f3(this));
            activityC16363x8a0a619d.f227614n2 = null;
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
