package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class hf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 f228528d;

    public hf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 activityC16379x3e9c9e32) {
        this.f228528d = activityC16379x3e9c9e32;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "goto BalanceManagerUI!");
        h45.a0.b(this.f228528d.mo55332x76847179(), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
