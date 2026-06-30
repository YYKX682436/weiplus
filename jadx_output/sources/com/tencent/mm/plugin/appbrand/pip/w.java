package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.y f87561d;

    public w(com.tencent.mm.plugin.appbrand.pip.y yVar) {
        this.f87561d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.tencent.mm.plugin.appbrand.pip.y yVar = this.f87561d;
        com.tencent.mars.xlog.Log.i(yVar.f87567a.f87518a, "onPlayEnd, onPlayEndWorkaround");
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = yVar.f87567a;
        pd1.l lVar = o0Var.f87529l;
        if (lVar == null || (view = o0Var.f87527j) == null) {
            return;
        }
        lVar.f(view);
    }
}
