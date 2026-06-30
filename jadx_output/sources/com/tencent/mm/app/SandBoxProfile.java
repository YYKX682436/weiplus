package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class SandBoxProfile extends yo.d {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f53273b = com.tencent.mm.sdk.platformtools.x2.f193072b + ":sandbox";

    @Override // yo.d
    public void a() {
        com.tencent.mm.booter.s b17 = com.tencent.mm.booter.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.app.SandBoxProfile.class.getClassLoader();
        fp.d0.n("MMProtocalJni");
        com.tencent.mars.WeChatMars.loadDependentLibraries();
        try {
            com.tencent.mm.protocal.MMProtocalJni.setClientPackVersion(o45.wf.f343029g);
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.protocal.MMProtocalJni.setClientPackVersion(o45.wf.f343029g);
        }
        try {
            x51.o1.f452056i = com.tencent.mm.sdk.platformtools.t8.m1(b17.a(".com.tencent.mm.debug.test.network.simulate_down_fault"), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SandboxDebugger", "Test.simulateDownFault = " + x51.o1.f452056i);
        } catch (java.lang.Error unused2) {
        }
        ((hd0.e) ((id0.e) i95.n0.c(id0.e.class))).getClass();
        s65.d1 d1Var = s65.c1.f403438a;
    }

    public java.lang.String toString() {
        return f53273b;
    }
}
