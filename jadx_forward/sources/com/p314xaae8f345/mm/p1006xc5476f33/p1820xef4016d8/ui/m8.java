package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228704d;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228704d = activityC16371xf216ae6d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228704d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n nVar = activityC16371xf216ae6d.f227738n2;
        if (nVar == null) {
            activityC16371xf216ae6d.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(nVar)) {
                activityC16371xf216ae6d.finish();
                yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var = activityC16371xf216ae6d.f227741o2;
            if (l0Var != null) {
                l0Var.b(activityC16371xf216ae6d.f227738n2, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l8(activityC16371xf216ae6d));
            }
            activityC16371xf216ae6d.f227738n2 = null;
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
