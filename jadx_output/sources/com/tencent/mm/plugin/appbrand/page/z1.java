package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f87307d;

    public z1(com.tencent.mm.plugin.appbrand.page.y1 y1Var) {
        this.f87307d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = this.f87307d;
        if (y1Var.A1 || y1Var.getCurrentPageView() == null || y1Var.f87273z1 || !"top".equals(y1Var.f87271y0.getPosition()) || !(y1Var.f87271y0.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) y1Var.f87271y0.getLayoutParams();
        al1.b r17 = y1Var.getCurrentPageView().r1();
        int top = r17.getTop() + r17.getMeasuredHeight();
        if (marginLayoutParams.topMargin != top) {
            marginLayoutParams.topMargin = top;
            y1Var.f87271y0.setLayoutParams(marginLayoutParams);
            y1Var.post(new com.tencent.mm.plugin.appbrand.page.a2(y1Var));
        }
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = y1Var.getCurrentPageView();
        int measuredHeight = y1Var.f87271y0.getMeasuredHeight();
        if (!currentPageView.G1 && (currentPageView.G.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) currentPageView.G.getLayoutParams();
            if (marginLayoutParams2.bottomMargin != measuredHeight) {
                marginLayoutParams2.bottomMargin = measuredHeight;
                currentPageView.G.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
