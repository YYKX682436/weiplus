package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI f109934d;

    public d5(com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI finderGameSelectUI) {
        this.f109934d = finderGameSelectUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI$initViews$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.assist.x2.f102672a.f(3, null);
        com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI.e7(this.f109934d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI$initViews$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
