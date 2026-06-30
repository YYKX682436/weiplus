package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class li implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228682d;

    public li(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228682d = activityC16384xb66222dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228682d;
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.d(activityC16384xb66222dd.J1, activityC16384xb66222dd.C1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            activityC16384xb66222dd.d7(6);
            return;
        }
        android.view.View view = activityC16384xb66222dd.f227971x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = activityC16384xb66222dd.f227946m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = activityC16384xb66222dd.f227950o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (activityC16384xb66222dd.C1.equals("loop")) {
            if (activityC16384xb66222dd.f227975y0.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.m(activityC16384xb66222dd.C1, d17, activityC16384xb66222dd.f227975y0, activityC16384xb66222dd.f227944l1, activityC16384xb66222dd.f227954p1, activityC16384xb66222dd.f227972x1);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.m(activityC16384xb66222dd.C1, d17, activityC16384xb66222dd.f227944l1, activityC16384xb66222dd.f227975y0, activityC16384xb66222dd.f227954p1, activityC16384xb66222dd.f227972x1);
                return;
            }
        }
        if (activityC16384xb66222dd.f227975y0.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.m(activityC16384xb66222dd.C1, d17, activityC16384xb66222dd.f227944l1, activityC16384xb66222dd.f227975y0, activityC16384xb66222dd.f227954p1, activityC16384xb66222dd.f227972x1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.m(activityC16384xb66222dd.C1, d17, activityC16384xb66222dd.f227975y0, activityC16384xb66222dd.f227944l1, activityC16384xb66222dd.f227954p1, activityC16384xb66222dd.f227972x1);
        }
    }
}
