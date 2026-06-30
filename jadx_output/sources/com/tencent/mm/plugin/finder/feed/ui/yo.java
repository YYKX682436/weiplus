package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class yo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 f110782d;

    public yo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34) {
        this.f110782d = occupyFinderUI34;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34 = this.f110782d;
        occupyFinderUI34.finish();
        occupyFinderUI34.c7(-2, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
