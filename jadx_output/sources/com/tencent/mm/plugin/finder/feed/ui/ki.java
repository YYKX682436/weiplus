package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ki implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110238d;

    public ki(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        this.f110238d = finderPostPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f110238d.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
