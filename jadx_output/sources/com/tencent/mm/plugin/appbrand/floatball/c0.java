package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class c0 implements com.tencent.mm.plugin.appbrand.floatball.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78074b;

    public c0(com.tencent.mm.plugin.appbrand.floatball.u uVar, int i17) {
        this.f78074b = uVar;
        this.f78073a = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.floatball.v0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, voip, show voip tip, result:%s", java.lang.Boolean.valueOf(this.f78074b.a(this.f78073a)));
    }
}
