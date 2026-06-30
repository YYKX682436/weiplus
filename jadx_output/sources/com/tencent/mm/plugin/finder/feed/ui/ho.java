package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ho implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView f110129d;

    public ho(com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView liveCritBuffAnimView) {
        this.f110129d = liveCritBuffAnimView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI27$buffAnimText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f110129d.a("test");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI27$buffAnimText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
