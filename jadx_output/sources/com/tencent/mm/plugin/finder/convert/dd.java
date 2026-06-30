package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class dd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103141d;

    public dd(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f103141d = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.s(this.f103141d.getFeedObject());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
