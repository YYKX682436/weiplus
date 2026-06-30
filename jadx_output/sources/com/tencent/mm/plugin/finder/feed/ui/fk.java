package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class fk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI f110020d;

    public fk(com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI finderSelfAggregationUI) {
        this.f110020d = finderSelfAggregationUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderSelfAggregationUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.feed.ui.FinderSelfAggregationUI finderSelfAggregationUI = this.f110020d;
        androidx.appcompat.app.AppCompatActivity context = finderSelfAggregationUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        intent.setClass(finderSelfAggregationUI, com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI.class);
        finderSelfAggregationUI.startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfAggregationUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
