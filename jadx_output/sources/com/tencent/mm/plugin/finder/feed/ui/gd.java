package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class gd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110083d;

    public gd(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f110083d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$showChargeModeBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f110083d.F1;
        if (z2Var != null) {
            z2Var.B();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$showChargeModeBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
