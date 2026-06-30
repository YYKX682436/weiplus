package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.i f76737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.u f76738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.appbrand.av_device_usage.i iVar, com.tencent.mm.plugin.appbrand.av_device_usage.u uVar) {
        super(0);
        this.f76737d = iVar;
        this.f76738e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.g0 g0Var = this.f76737d.f76709b;
        com.tencent.mm.plugin.appbrand.av_device_usage.u uVar = this.f76738e;
        g0Var.observe(uVar.f76739d.getLifecycleOwner(), uVar);
        return jz5.f0.f302826a;
    }
}
