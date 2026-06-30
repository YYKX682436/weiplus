package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class wl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeTipsUI f110708d;

    public wl(com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeTipsUI finderTeenModeTipsUI) {
        this.f110708d = finderTeenModeTipsUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeTipsUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f110708d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTeenModeTipsUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
