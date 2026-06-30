package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes3.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0 f174815d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0 d0Var) {
        this.f174815d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0 d0Var = this.f174815d;
        dp1.x xVar = d0Var.f174820g;
        if (xVar == null || xVar.mo50329xc2a54588() == null) {
            return;
        }
        android.view.View mo50329xc2a54588 = d0Var.f174820g.mo50329xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo50329xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo50329xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo50329xc2a54588, "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
