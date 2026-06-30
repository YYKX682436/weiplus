package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class wh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f229186d;

    public wh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f229186d = activityC16384xb66222dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f229186d;
        activityC16384xb66222dd.L.setVisibility(0);
        activityC16384xb66222dd.E.setVisibility(0);
        activityC16384xb66222dd.M.setVisibility(0);
        activityC16384xb66222dd.D.setVisibility(0);
        android.view.View view = activityC16384xb66222dd.f227978z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$18", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$18", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC16384xb66222dd.f227929J.setVisibility(0);
        activityC16384xb66222dd.K.setVisibility(8);
        activityC16384xb66222dd.T.setVisibility(8);
        activityC16384xb66222dd.X.setVisibility(8);
        if (!activityC16384xb66222dd.g7()) {
            activityC16384xb66222dd.Y.setChecked(true);
            activityC16384xb66222dd.R.setVisibility(0);
        }
        activityC16384xb66222dd.r7(true, activityC16384xb66222dd.L);
        activityC16384xb66222dd.r7(true, activityC16384xb66222dd.N);
    }
}
