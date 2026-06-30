package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.su f104426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104428f;

    public qu(com.tencent.mm.plugin.finder.convert.su suVar, android.view.View view, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f104426d = suVar;
        this.f104427e = view;
        this.f104428f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f104427e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104428f;
        com.tencent.mm.plugin.finder.convert.su.i(this.f104426d, context, baseFinderFeed, baseFinderFeed.getFeedObject().getUserName());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaLiveViewHolder$bindUserInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
