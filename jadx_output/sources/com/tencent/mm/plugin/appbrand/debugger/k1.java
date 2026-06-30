package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l1 f77780d;

    public k1(com.tencent.mm.plugin.appbrand.debugger.l1 l1Var) {
        this.f77780d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l1 l1Var = this.f77780d;
        if (l1Var.f77782e.getParent() instanceof android.view.View) {
            android.view.View view = (android.view.View) l1Var.f77782e.getParent();
            l1Var.f77782e.f77587d = view.getMeasuredWidth();
            l1Var.f77782e.f77588e = view.getMeasuredHeight();
            com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = l1Var.f77782e;
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(remoteDebugMoveView.f77587d - remoteDebugMoveView.getWidth(), l1Var.f77782e.getX()));
            com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView2 = l1Var.f77782e;
            float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(remoteDebugMoveView2.f77588e - remoteDebugMoveView2.getHeight(), l1Var.f77782e.getY()));
            l1Var.f77782e.setX(max);
            l1Var.f77782e.setY(max2);
            l1Var.f77782e.requestLayout();
        }
    }
}
