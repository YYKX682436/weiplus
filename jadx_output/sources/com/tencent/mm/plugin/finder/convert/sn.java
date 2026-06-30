package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f104566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f104567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104568f;

    public sn(com.tencent.mm.plugin.finder.convert.yn ynVar, so2.u1 u1Var, in5.s0 s0Var) {
        this.f104566d = ynVar;
        this.f104567e = u1Var;
        this.f104568f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.u1 u1Var = this.f104567e;
        com.tencent.mm.plugin.finder.convert.yn ynVar = this.f104566d;
        if (ynVar.C(u1Var)) {
            com.tencent.mm.plugin.finder.convert.yn ynVar2 = this.f104566d;
            in5.s0 s0Var = this.f104568f;
            so2.u1 u1Var2 = this.f104567e;
            ynVar2.getClass();
            com.tencent.mm.plugin.finder.convert.qe.E0(ynVar2, s0Var, u1Var2, false, 0L, null, 0, 4, ynVar2 instanceof com.tencent.mm.plugin.finder.feed.ms, 0L, ynVar.R(this.f104568f), 0, 1336, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$refreshDescContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
