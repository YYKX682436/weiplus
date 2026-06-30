package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class u10 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f109128e;

    public u10(android.view.View view, r45.ze2 ze2Var) {
        this.f109127d = view;
        this.f109128e = ze2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$refreshHeader$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        la2.d dVar = la2.d.f317510a;
        android.content.Context context = this.f109127d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        la2.d.a(dVar, context, this.f109128e, false, 0, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback$refreshHeader$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
