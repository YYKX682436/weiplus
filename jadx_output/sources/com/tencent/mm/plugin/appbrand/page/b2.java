package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86423d;

    public b2(com.tencent.mm.plugin.appbrand.page.y1 y1Var) {
        this.f86423d = y1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        al1.b r17;
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = this.f86423d;
        if (y1Var.A1 || (currentPageView = y1Var.getCurrentPageView()) == null || (r17 = currentPageView.r1()) == null) {
            return;
        }
        currentPageView.P1().d(r17.getTop() + r17.getMeasuredHeight());
    }
}
