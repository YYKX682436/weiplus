package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.h f111428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.d f111429e;

    public e(com.tencent.mm.plugin.finder.highlight.h hVar, com.tencent.mm.plugin.finder.highlight.d dVar) {
        this.f111428d = hVar;
        this.f111429e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.highlight.n nVar = (com.tencent.mm.plugin.finder.highlight.n) this.f111428d.f111434e;
        nVar.getClass();
        com.tencent.mm.plugin.finder.highlight.d highlight = this.f111429e;
        kotlin.jvm.internal.o.g(highlight, "highlight");
        com.tencent.mm.plugin.finder.highlight.p pVar = nVar.f111452a;
        com.tencent.mm.plugin.finder.highlight.m mVar = pVar.f111455b;
        r45.gb1 gb1Var = highlight.f111427d;
        if (mVar != null) {
            in5.s0 s0Var = ((com.tencent.mm.plugin.finder.highlight.t) mVar).f111467a.f111468d;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = s0Var != null ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k) : null;
            if (finderVideoLayout != null) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, gb1Var.getInteger(0) * 1000, 3, 0.0f, false, null, 28, null);
            }
            if (finderVideoLayout != null) {
                finderVideoLayout.b0(true);
            }
        }
        pVar.a(gb1Var, "view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/highlight/FinderLiveHighlightConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
