package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class uf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f229034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e f229035e;

    public uf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var) {
        this.f229035e = activityC16380x9ede44e;
        this.f229034d = f6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e.Y1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16380x9ede44e activityC16380x9ede44e = this.f229035e;
        if (activityC16380x9ede44e.isFinishing() || activityC16380x9ede44e.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "this activity has finished");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var = this.f229034d;
        java.lang.String o17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(f6Var.f226813h.f226778q / 100.0d);
        android.view.View findViewById = activityC16380x9ede44e.findViewById(com.p314xaae8f345.mm.R.id.j4g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "doUpdateAmount", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "doUpdateAmount", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC16380x9ede44e.f227879n.setVisibility(0);
        activityC16380x9ede44e.f227878m.setVisibility(0);
        activityC16380x9ede44e.f227878m.setContentDescription(o17);
        activityC16380x9ede44e.f227878m.m66162x70ee0181(o17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 c16356x97a60719 = activityC16380x9ede44e.f227878m;
        c16356x97a60719.f227504x = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ig(activityC16380x9ede44e, f6Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j(c16356x97a60719));
    }
}
