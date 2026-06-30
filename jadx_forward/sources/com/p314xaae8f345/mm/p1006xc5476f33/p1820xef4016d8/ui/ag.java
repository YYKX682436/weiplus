package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes.dex */
public class ag implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f228244d;

    public ag(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e) {
        this.f228244d = activityC16380x9ede44e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "goto detail!");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f228244d;
        intent.putExtra("key_native_url", activityC16380x9ede44e.Q);
        j45.l.j(activityC16380x9ede44e.mo55332x76847179(), "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
