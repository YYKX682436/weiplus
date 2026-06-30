package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104605d;

    public tc(in5.s0 s0Var) {
        this.f104605d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshManagerFav$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f104605d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        boolean z17 = !nv2.o.f340558e.c(baseFinderFeed.getFeedObject().getFeedObject());
        android.content.Context context = s0Var.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = activity != null ? (com.tencent.mm.plugin.finder.view.FinderFavDrawer) activity.findViewById(com.tencent.mm.R.id.edy) : null;
        if (finderFavDrawer != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem feedObj = baseFinderFeed.getFeedObject();
            kotlin.jvm.internal.o.g(feedObj, "feedObj");
            if (!finderFavDrawer.q()) {
                finderFavDrawer.feedObj = feedObj;
                finderFavDrawer.r(true, true, 0);
            }
        }
        view.setTag(com.tencent.mm.R.id.rku, java.lang.Boolean.valueOf(z17));
        d92.s sVar = d92.k0.f227486e;
        view.announceForAccessibility(sVar.d(view, true));
        view.setContentDescription(sVar.d(view, false));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshManagerFav$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
