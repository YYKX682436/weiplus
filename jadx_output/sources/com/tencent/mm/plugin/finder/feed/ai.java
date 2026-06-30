package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ai implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f106297d;

    public ai(com.tencent.mm.plugin.finder.feed.li liVar) {
        this.f106297d = liVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveMentionNotifyContract$NotifyViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f106297d.f107294d.f(false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveMentionNotifyContract$NotifyViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
