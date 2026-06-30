package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c f228829d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c activityC16358x34a9fc3c) {
        this.f228829d = activityC16358x34a9fc3c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c activityC16358x34a9fc3c = this.f228829d;
        android.content.Intent intent = activityC16358x34a9fc3c.getIntent().getIntExtra("key_swipe", 0) == 1 ? ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi() ? new android.content.Intent(activityC16358x34a9fc3c.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16378x1096dd37.class) : new android.content.Intent(activityC16358x34a9fc3c.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16404x3de3a807.class) : ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi() ? new android.content.Intent(activityC16358x34a9fc3c.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.class) : new android.content.Intent(activityC16358x34a9fc3c.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.class);
        intent.putExtra("key_from_username", activityC16358x34a9fc3c.f227513n);
        intent.putExtras(activityC16358x34a9fc3c.getIntent());
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c activityC16358x34a9fc3c2 = this.f228829d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16358x34a9fc3c2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBeforeDetailUI$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16358x34a9fc3c2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16358x34a9fc3c2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBeforeDetailUI$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o(this), 500L);
    }
}
