package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class d0 implements com.tencent.mm.plugin.appbrand.floatball.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78083b;

    public d0(com.tencent.mm.plugin.appbrand.floatball.u uVar, int i17) {
        this.f78083b = uVar;
        this.f78082a = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.floatball.s1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "close, voip1v1, show voip tip, result:%s", java.lang.Boolean.valueOf(this.f78083b.a(this.f78082a)));
    }
}
