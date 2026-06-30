package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.hl f103497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103498e;

    public gl(com.tencent.mm.plugin.finder.convert.hl hlVar, in5.s0 s0Var) {
        this.f103497d = hlVar;
        this.f103498e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f103498e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int adapterPosition = s0Var.getAdapterPosition();
        this.f103497d.getClass();
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).yj(2, 2, adapterPosition, nyVar.V6());
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("Source", 4);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).f7(4, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderHistoryDividerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
