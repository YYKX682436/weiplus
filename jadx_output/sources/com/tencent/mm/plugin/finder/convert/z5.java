package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f105084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105085e;

    public z5(so2.z0 z0Var, in5.s0 s0Var) {
        this.f105084d = z0Var;
        this.f105085e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshOrigin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite17bb73d0180cae18320aefbf49ecd90d");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/original-profile/entry");
        cl0.g gVar = new cl0.g();
        so2.z0 z0Var = this.f105084d;
        gVar.h("finderUsername", z0Var.E.getFeedObject().getUsername());
        gVar.h("feedId", pm0.v.u(z0Var.E.getFeedObject().getId()));
        bundle.putString("query", gVar.toString());
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this.f105085e.f293121e, bundle, true, false, new com.tencent.mm.plugin.finder.convert.y5());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshOrigin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
