package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class z5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f186617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186618e;

    public z5(so2.z0 z0Var, in5.s0 s0Var) {
        this.f186617d = z0Var;
        this.f186618e = s0Var;
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
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "pages/original-profile/entry");
        cl0.g gVar = new cl0.g();
        so2.z0 z0Var = this.f186617d;
        gVar.h("finderUsername", z0Var.E.getFeedObject().m76836x6c03c64c());
        gVar.h("feedId", pm0.v.u(z0Var.E.getFeedObject().m76784x5db1b11()));
        bundle.putString("query", gVar.toString());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this.f186618e.f374654e, bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y5());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshOrigin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
