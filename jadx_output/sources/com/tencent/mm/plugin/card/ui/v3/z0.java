package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class z0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.c1 f95413f;

    public z0(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, com.tencent.mm.plugin.card.ui.v3.c1 c1Var) {
        this.f95411d = s0Var;
        this.f95412e = vipCardListUI;
        this.f95413f = c1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.card.ui.v3.t0 t0Var = (com.tencent.mm.plugin.card.ui.v3.t0) this.f95411d.f293125i;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95412e;
        rl5.r rVar = new rl5.r(vipCardListUI.getContext(), view);
        rVar.f397351u = new com.tencent.mm.plugin.card.ui.v3.x0(vipCardListUI);
        rVar.f397354x = new com.tencent.mm.plugin.card.ui.v3.y0(this.f95413f, t0Var);
        kotlin.jvm.internal.o.d(view);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 3);
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
