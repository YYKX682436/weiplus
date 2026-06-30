package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d;

/* loaded from: classes4.dex */
public final class r0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a f250399d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a c18248x5f8bb60a) {
        this.f250399d = c18248x5f8bb60a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$7");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a c18248x5f8bb60a = this.f250399d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70861xd28455e0(c18248x5f8bb60a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int width = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70861xd28455e0(c18248x5f8bb60a).getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70856x66b6bc34(c18248x5f8bb60a).getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        int rint = (int) java.lang.Math.rint(width * (ca4.z0.l0(c18248x5f8bb60a.m80379x76847179()) ? 0.17f : 0.12f));
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
        if (rint < 1.5f * b17) {
            rint = (int) java.lang.Math.ceil(r8);
        }
        if (rint > b17 * 1.8d) {
            rint = (int) java.lang.Math.floor(r7 * 1.8f);
        }
        layoutParams2.width = rint;
        layoutParams2.height = rint;
        layoutParams2.topMargin = -((rint * 2) / 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70856x66b6bc34(c18248x5f8bb60a).setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$7");
    }
}
