package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class hc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103573f;

    public hc(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f103571d = qeVar;
        this.f103572e = baseFinderFeed;
        this.f103573f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103572e;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103571d;
        if (qeVar.C(baseFinderFeed)) {
            com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f103571d;
            com.tencent.mm.plugin.finder.convert.qe.E0(qeVar2, this.f103573f, this.f103572e, false, 0L, null, 0, 4, qeVar2.i0(), 0L, qeVar.R(this.f103573f), 1, 312, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
