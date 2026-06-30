package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class tg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI f110570d;

    public tg(com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI) {
        this.f110570d = finderNewManagementUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("FROM_SOURCE", 1);
        com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI = this.f110570d;
        if (finderNewManagementUI.A) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            androidx.appcompat.app.AppCompatActivity context = finderNewManagementUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.plugin.finder.assist.i0) c17).ik(context, intent, 1);
        } else {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            androidx.appcompat.app.AppCompatActivity context2 = finderNewManagementUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((com.tencent.mm.plugin.finder.assist.i0) c18).mj(context2, intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderNewManagementUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
