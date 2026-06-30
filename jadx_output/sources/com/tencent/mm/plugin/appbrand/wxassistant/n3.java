package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes12.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.o3 f92249d;

    public n3(com.tencent.mm.plugin.appbrand.wxassistant.o3 o3Var) {
        this.f92249d = o3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rk0.c.b("MicroMsg.WxAssistantMonitor", "ANR detected, killing wxa process now! token=0", new java.lang.Object[0]);
        this.f92249d.h();
    }
}
