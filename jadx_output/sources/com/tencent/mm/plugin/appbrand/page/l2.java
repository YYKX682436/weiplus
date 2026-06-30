package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class l2 extends android.widget.RelativeLayout implements zl1.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.appbrand.page.y1 y1Var, android.content.Context context) {
        super(context);
        this.f86846d = y1Var;
    }

    public void a(zl1.t tVar, boolean z17) {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.appbrand.page.y1 y1Var = this.f86846d;
        if (y1Var.A1 || (frameLayout = y1Var.f87266l1) == null || !(frameLayout.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) y1Var.f87266l1.getLayoutParams();
        if (layoutParams.getRule(2) != y1Var.f87271y0.getId()) {
            layoutParams.addRule(2, y1Var.f87271y0.getId());
            layoutParams.removeRule(12);
            y1Var.f87266l1.requestLayout();
        }
    }
}
