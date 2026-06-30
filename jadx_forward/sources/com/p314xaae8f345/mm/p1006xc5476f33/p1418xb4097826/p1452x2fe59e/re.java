package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class re implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f190437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z35 f190438e;

    public re(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, r45.z35 z35Var) {
        this.f190437d = afVar;
        this.f190438e = z35Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$setTopRightBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f190438e.m75945x2fec8307(1));
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(this.f190437d.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$setTopRightBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
