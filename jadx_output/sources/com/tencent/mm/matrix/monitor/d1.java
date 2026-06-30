package com.tencent.mm.matrix.monitor;

/* loaded from: classes12.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.matrix.monitor.d1 f68745d = new com.tencent.mm.matrix.monitor.d1();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.matrix.util.MemInfo b17 = com.tencent.matrix.util.MemInfo.f53095p.b();
        com.tencent.mm.matrix.monitor.e1 e1Var = com.tencent.mm.matrix.monitor.e1.f68748a;
        com.tencent.mm.matrix.monitor.e1.a(e1Var, b17, 2000, 0L);
        e1Var.c().f299904h.invoke(b17);
        e1Var.b().f299904h.invoke(b17);
    }
}
