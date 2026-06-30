package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f104636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f104638f;

    public tn(com.tencent.mm.plugin.finder.convert.yn ynVar, in5.s0 s0Var, so2.u1 u1Var) {
        this.f104636d = ynVar;
        this.f104637e = s0Var;
        this.f104638f = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$refreshDescContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.yn ynVar = this.f104636d;
        in5.s0 s0Var = this.f104637e;
        so2.u1 u1Var = this.f104638f;
        ynVar.getClass();
        com.tencent.mm.plugin.finder.convert.qe.E0(ynVar, s0Var, u1Var, false, 0L, null, 0, 4, ynVar instanceof com.tencent.mm.plugin.finder.feed.ms, 0L, this.f104636d.R(this.f104637e), 0, 1336, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$refreshDescContent$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
