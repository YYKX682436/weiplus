package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ek implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI f109987d;

    public ek(com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI finderSelfAggregationUI) {
        this.f109987d = finderSelfAggregationUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderSelfAggregationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI finderSelfAggregationUI = this.f109987d;
        android.content.Intent from = finderSelfAggregationUI.getIntent();
        kotlin.jvm.internal.o.g(from, "from");
        pm0.v.g(intent, from, "KEY_MIX_SEARCH_CUR_TAB", 7);
        pm0.v.g(intent, from, "KEY_MIX_SEARCH_MIX_SUB_TAB", 7);
        pm0.v.g(intent, from, "KEY_MIX_SEARCH_HISTORY_SUB_TAB", 7);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.appcompat.app.AppCompatActivity context = finderSelfAggregationUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context2 = finderSelfAggregationUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.Wj(context2, intent, 15, new java.util.ArrayList());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfAggregationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
