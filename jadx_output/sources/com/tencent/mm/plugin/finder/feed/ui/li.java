package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class li implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110277d;

    public li(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        this.f110277d = finderPostPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI = this.f110277d;
        android.content.Intent intent = finderPostPreviewUI.N;
        if (intent != null) {
            finderPostPreviewUI.finish();
            intent.putExtra("KEY_IS_FULLSCREEN", !finderPostPreviewUI.P);
            com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewFeedLoader finderPostPreviewFeedLoader = finderPostPreviewUI.A;
            if (finderPostPreviewFeedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            hc2.e0.b(intent, 0, finderPostPreviewFeedLoader.getDataList(), null, null);
            android.content.Intent intent2 = finderPostPreviewUI.N;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderPostPreviewUI, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finderPostPreviewUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(finderPostPreviewUI, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPreviewUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
