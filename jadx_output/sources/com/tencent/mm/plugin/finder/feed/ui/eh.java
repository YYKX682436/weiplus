package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class eh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI f109984d;

    public eh(com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI finderNewStyleTimelineUI) {
        this.f109984d = finderNewStyleTimelineUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderNewStyleTimelineUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f109984d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderNewStyleTimelineUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
