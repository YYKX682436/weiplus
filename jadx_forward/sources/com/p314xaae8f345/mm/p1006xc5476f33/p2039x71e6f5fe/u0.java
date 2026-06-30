package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

@j95.b
/* loaded from: classes12.dex */
public class u0 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a0 {
    public java.lang.String Ai(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ri();
        return com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ni() + java.lang.String.format("%s_%d.%s", "tmp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginScanner", "PluginScanner onAccountInitialized");
        e04.f2 f2Var = e04.f2.f327458a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        e04.f2.f327459b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("ScanDebug");
        e04.f2.f();
        e04.r1 r1Var = e04.t1.f327628c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraThreadPoolManager", "setScanTaskExecutor " + r1Var.a());
        if (r1Var.a()) {
            rt5.c.f481079a = new e04.o1();
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Bi(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u0(context2));
        q25.b.b(new e04.i2(), "//scan");
    }

    public java.lang.String wi(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ri();
        return com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Ni() + java.lang.String.format("%s_%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }
}
