package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n1 f198767d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n1 n1Var) {
        this.f198767d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n1 n1Var = this.f198767d;
        android.view.View view = n1Var.f198799f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewRoot");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLivePromoteUIC", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        el2.i0 i0Var = n1Var.f198798e;
        if (i0Var != null) {
            i0Var.p0();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("view");
            throw null;
        }
    }
}
