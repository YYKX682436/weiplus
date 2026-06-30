package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final /* synthetic */ class a4$$e implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        final com.tencent.mm.app.o4 o4Var = new com.tencent.mm.app.o4();
        try {
            com.tencent.mm.app.f4.f53416a.submit(new java.lang.Runnable() { // from class: com.tencent.mm.app.a4$$y
                @Override // java.lang.Runnable
                public final void run() {
                    int b17 = com.tencent.mm.plugin.performance.watchdogs.b1.b();
                    com.tencent.mm.app.o4 o4Var2 = com.tencent.mm.app.o4.this;
                    o4Var2.f53560a = b17;
                    if (b17 >= 130) {
                        o4Var2.f53561b = java.lang.String.valueOf(com.tencent.mm.plugin.performance.watchdogs.b1.c());
                    } else {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        o4Var2.f53561b = null;
                    }
                }
            }).get(1L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Throwable unused) {
            o4Var.f53561b = "[time-out]";
        }
        return o4Var;
    }
}
