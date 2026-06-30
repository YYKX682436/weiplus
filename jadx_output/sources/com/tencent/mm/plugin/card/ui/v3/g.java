package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.j f95321f;

    public g(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, com.tencent.mm.plugin.card.ui.v3.j jVar) {
        this.f95319d = s0Var;
        this.f95320e = cardHomePageV3UI;
        this.f95321f = jVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.card.ui.v3.a aVar = (com.tencent.mm.plugin.card.ui.v3.a) this.f95319d.f293125i;
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95320e;
        rl5.r rVar = new rl5.r(cardHomePageV3UI.getContext(), view);
        rVar.f397351u = new com.tencent.mm.plugin.card.ui.v3.e(cardHomePageV3UI);
        rVar.f397354x = new com.tencent.mm.plugin.card.ui.v3.f(this.f95321f, aVar);
        kotlin.jvm.internal.o.d(view);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        yj0.a.i(false, this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
