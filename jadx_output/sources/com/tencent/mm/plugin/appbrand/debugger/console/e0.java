package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.f0 f77663d;

    public e0(com.tencent.mm.plugin.appbrand.debugger.console.f0 f0Var) {
        this.f77663d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.debugger.console.f0 f0Var = this.f77663d;
        int lineTop = f0Var.getLayout().getLineTop(f0Var.getLineCount()) - f0Var.getHeight();
        if (lineTop > 0) {
            f0Var.scrollTo(0, lineTop);
        }
    }
}
