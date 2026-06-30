package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes.dex */
public class p0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f180573a;

    public p0(long j17, java.lang.Runnable runnable) {
        this.f180573a = runnable;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.ExdeviceLogic", "getContact failed");
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.g.f(str, 3);
        java.lang.Runnable runnable = this.f180573a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
