package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77635d;

    public b2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var) {
        this.f77635d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77635d;
        com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = l2Var.f77785f;
        int width = l2Var.getWidth();
        int height = l2Var.getHeight();
        remoteDebugMoveView.getClass();
        remoteDebugMoveView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        remoteDebugMoveView.f77587d = width;
        remoteDebugMoveView.f77588e = height;
        remoteDebugMoveView.post(new com.tencent.mm.plugin.appbrand.debugger.j1(remoteDebugMoveView));
        l2Var.addView(l2Var.f77785f);
    }
}
