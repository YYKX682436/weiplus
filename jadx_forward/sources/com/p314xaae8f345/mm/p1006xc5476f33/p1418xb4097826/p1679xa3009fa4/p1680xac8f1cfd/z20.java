package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class z20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f218166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218167e;

    public z20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, java.lang.String str) {
        this.f218166d = f50Var;
        this.f218167e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f218166d;
        f50Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openH5CreatorCenter url:");
        java.lang.String str = this.f218167e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SelfUIC", sb6.toString());
        f50Var.R6();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", f50Var.Y6(str));
        j45.l.j(f50Var.m158354x19263085(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
