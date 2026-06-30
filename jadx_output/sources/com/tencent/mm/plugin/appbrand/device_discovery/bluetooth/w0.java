package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class w0 extends com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77971a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f77972b;

    public w0(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        java.lang.String str = u07 != null ? u07.f47277w : null;
        this.f77971a = str == null ? "" : str;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = o6Var.u0();
        java.lang.String str2 = u08 != null ? u08.f47276v : null;
        this.f77972b = str2 != null ? str2 : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e1
    public java.lang.String a() {
        return this.f77972b;
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e1
    public java.lang.String b() {
        return this.f77971a;
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e1
    public java.lang.Integer c() {
        return 0;
    }
}
