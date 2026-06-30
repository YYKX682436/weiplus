package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class tf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI f110569d;

    public tf(com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI finderLoaderFeedUI) {
        this.f110569d = finderLoaderFeedUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI activity = this.f110569d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.gg.O6((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17, false, false, false, null, false, false, 63, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
