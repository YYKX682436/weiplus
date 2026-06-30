package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.d1 f91721d;

    public y0(com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var) {
        this.f91721d = d1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.fb a27;
        android.view.View contentView;
        com.tencent.mm.plugin.appbrand.widget.input.d1 d1Var = this.f91721d;
        if (d1Var.f91389e.isRunning()) {
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = d1Var.f91389e;
            android.widget.FrameLayout pageArea = !v5Var.isRunning() ? null : v5Var.getPageArea();
            if (pageArea != null) {
                pageArea.scrollTo(0, 0);
                if (d1Var.f91396o != 0 && (a27 = v5Var.a2()) != null && (contentView = a27.getContentView()) != null) {
                    contentView.scrollBy(contentView.getScrollX(), -d1Var.f91396o);
                }
                java.lang.Object obj = d1Var.f91388d;
                if (((x.n) obj).f450846f <= 0) {
                    return;
                }
                for (com.tencent.mm.plugin.appbrand.widget.input.b1 b1Var : (com.tencent.mm.plugin.appbrand.widget.input.b1[]) ((x.b) obj).keySet().toArray(new com.tencent.mm.plugin.appbrand.widget.input.b1[((x.n) obj).f450846f])) {
                    com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = ((com.tencent.mm.plugin.appbrand.widget.input.autofill.l) b1Var).f91344a;
                    oVar.f91352e = Integer.MIN_VALUE;
                    oVar.b(3);
                }
            }
        }
    }
}
