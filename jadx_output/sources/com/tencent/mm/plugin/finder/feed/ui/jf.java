package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class jf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI f110192d;

    public jf(com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI finderLoaderFeedSupportSlideUI) {
        this.f110192d = finderLoaderFeedSupportSlideUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI$fixActionBarStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI finderLoaderFeedSupportSlideUI = this.f110192d;
        com.tencent.mm.ui.ee.f(finderLoaderFeedSupportSlideUI.getTaskId(), new com.tencent.mm.plugin.finder.feed.ui.Cif(finderLoaderFeedSupportSlideUI));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI$fixActionBarStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
