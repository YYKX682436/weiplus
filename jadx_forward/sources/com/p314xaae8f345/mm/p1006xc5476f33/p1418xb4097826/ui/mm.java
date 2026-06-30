package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class mm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm f211062d;

    public mm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar) {
        this.f211062d = qmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17;
        android.view.View f294968x;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o18;
        android.view.View f294968x2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this.f211062d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = qmVar.f187957g;
        android.view.View view = null;
        android.view.View findViewById = (i0Var == null || (o18 = i0Var.o()) == null || (f294968x2 = o18.getF294968x()) == null) ? null : f294968x2.findViewById(com.p314xaae8f345.mm.R.id.m6l);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onLoadMoreEnd$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onLoadMoreEnd$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = qmVar.f187957g;
        if (i0Var2 != null && (o17 = i0Var2.o()) != null && (f294968x = o17.getF294968x()) != null) {
            view = f294968x.findViewById(com.p314xaae8f345.mm.R.id.ile);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onLoadMoreEnd$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onLoadMoreEnd$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
