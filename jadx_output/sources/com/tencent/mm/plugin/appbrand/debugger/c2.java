package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77640d;

    public c2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var) {
        this.f77640d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77640d;
        if (l2Var.f77784e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugView", "showDebugView mContentView is null");
            return;
        }
        if (!l2Var.c()) {
            l2Var.setBackgroundColor(l2Var.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            return;
        }
        l2Var.setVisibility(0);
        if (l2Var.f77784e.indexOfChild(l2Var) == -1) {
            l2Var.f77784e.addView(l2Var);
        }
        l2Var.f77784e.bringChildToFront(l2Var);
        l2Var.setBackgroundColor(l2Var.getContext().getResources().getColor(com.tencent.mm.R.color.t_));
    }
}
