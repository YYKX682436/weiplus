package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class xe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f229222d;

    public xe(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        this.f229222d = activityC16377xf00b6def;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f229222d;
        android.view.View view = activityC16377xf00b6def.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$renderEnvelopeDynamic$1$onAnimationStart$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$renderEnvelopeDynamic$1$onAnimationStart$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = activityC16377xf00b6def.f227845v;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        android.widget.ImageView imageView = activityC16377xf00b6def.f227850y;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        android.widget.ImageView imageView2 = activityC16377xf00b6def.f227853z;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(4);
    }
}
