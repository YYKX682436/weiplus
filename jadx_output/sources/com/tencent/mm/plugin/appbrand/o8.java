package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class o8 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f86238b;

    public o8(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f86238b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "HardCoderSetupProcess";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        final com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance();
        this.f86238b.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o8$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI2 = wXHardCoderJNI;
                com.tencent.mm.plugin.appbrand.o8 o8Var = com.tencent.mm.plugin.appbrand.o8.this;
                o8Var.getClass();
                try {
                    o8Var.f86238b.f86184p2 = wXHardCoderJNI2.startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchTimeout(), com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMiniProgramLaunchAction(), "MicroMsg.AppBrandRuntimeWC");
                } finally {
                    o8Var.d();
                }
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public boolean e() {
        return true;
    }
}
