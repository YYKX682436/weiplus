package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes3.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.d0 f93282d;

    public c0(com.tencent.mm.plugin.ball.ui.d0 d0Var) {
        this.f93282d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.d0 d0Var = this.f93282d;
        dp1.x xVar = d0Var.f93287g;
        if (xVar == null || xVar.getContentView() == null) {
            return;
        }
        android.view.View contentView = d0Var.f93287g.getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
