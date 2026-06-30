package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class zm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI f110810d;

    public zm(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI finderTopicFeedUI) {
        this.f110810d = finderTopicFeedUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$initCustomActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI.I;
        this.f110810d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI$initCustomActionBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
