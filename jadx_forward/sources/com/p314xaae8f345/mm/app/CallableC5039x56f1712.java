package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.a4$$e */
/* loaded from: classes12.dex */
public final /* synthetic */ class CallableC5039x56f1712 implements java.util.concurrent.Callable {
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        final com.p314xaae8f345.mm.app.o4 o4Var = new com.p314xaae8f345.mm.app.o4();
        try {
            com.p314xaae8f345.mm.app.f4.f134949a.submit(new java.lang.Runnable() { // from class: com.tencent.mm.app.a4$$y
                @Override // java.lang.Runnable
                public final void run() {
                    int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.b();
                    com.p314xaae8f345.mm.app.o4 o4Var2 = com.p314xaae8f345.mm.app.o4.this;
                    o4Var2.f135093a = b17;
                    if (b17 >= 130) {
                        o4Var2.f135094b = java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b1.c());
                    } else {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        o4Var2.f135094b = null;
                    }
                }
            }).get(1L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.Throwable unused) {
            o4Var.f135094b = "[time-out]";
        }
        return o4Var;
    }
}
