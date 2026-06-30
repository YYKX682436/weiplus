package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104873f;

    public wf(com.tencent.mm.plugin.finder.convert.zf zfVar, in5.s0 s0Var, so2.h1 h1Var) {
        this.f104871d = zfVar;
        this.f104872e = s0Var;
        this.f104873f = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshRealNameRecommendLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f104871d;
        zfVar.getClass();
        in5.s0 s0Var = this.f104872e;
        android.content.Context context = s0Var.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = activity != null ? (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) activity.findViewById(com.tencent.mm.R.id.tk9) : null;
        if (finderLikeDrawer == null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullLiveConvert", "lazy init live like drawer");
            finderLikeDrawer = zfVar.f104358f.W3();
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = finderLikeDrawer;
        if (finderLikeDrawer2 != null) {
            in5.s0 s0Var2 = this.f104872e;
            so2.h1 h1Var = this.f104873f;
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer2, s0Var2, h1Var.getFeedObject(), h1Var.getLikeBuffer(), zfVar.R(s0Var), null, null, 48, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$refreshRealNameRecommendLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
