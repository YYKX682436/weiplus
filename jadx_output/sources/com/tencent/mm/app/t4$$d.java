package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class t4$$d implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        com.tencent.mm.app.o4 o4Var = new com.tencent.mm.app.o4();
        int b17 = com.tencent.mm.plugin.performance.watchdogs.b1.b();
        o4Var.f53560a = b17;
        if (b17 < 130) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            o4Var.f53561b = null;
        } else {
            o4Var.f53561b = java.lang.String.valueOf(com.tencent.mm.plugin.performance.watchdogs.b1.c());
        }
        return o4Var;
    }
}
