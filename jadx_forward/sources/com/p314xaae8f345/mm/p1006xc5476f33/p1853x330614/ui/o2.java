package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes2.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f f229990d;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f c16481x8b52b61f) {
        this.f229990d = c16481x8b52b61f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.C16481x8b52b61f c16481x8b52b61f = this.f229990d;
        c16481x8b52b61f.f229834f.getX();
        c16481x8b52b61f.f229834f.getLeft();
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 1);
        layoutParams.leftMargin = c16481x8b52b61f.f229834f.getLeft();
        c16481x8b52b61f.f229842q.setLayoutParams(layoutParams);
        android.view.View view = c16481x8b52b61f.f229842q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
