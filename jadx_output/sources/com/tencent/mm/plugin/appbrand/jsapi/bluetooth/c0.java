package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class c0 extends com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f80052a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f80053b;

    public c0(com.tencent.mm.plugin.appbrand.e9 e9Var) {
        ze.n t37;
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07;
        ze.n t38;
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u08;
        boolean z17 = e9Var instanceof com.tencent.luggage.sdk.jsapi.component.service.y;
        java.lang.String str = null;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = z17 ? (com.tencent.luggage.sdk.jsapi.component.service.y) e9Var : null;
        java.lang.String str2 = (yVar == null || (t38 = yVar.t3()) == null || (u08 = t38.u0()) == null) ? null : u08.f47277w;
        this.f80052a = str2 == null ? "" : str2;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = z17 ? (com.tencent.luggage.sdk.jsapi.component.service.y) e9Var : null;
        if (yVar2 != null && (t37 = yVar2.t3()) != null && (u07 = t37.u0()) != null) {
            str = u07.f47276v;
        }
        this.f80053b = str != null ? str : "";
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e1
    public java.lang.String a() {
        return this.f80053b;
    }

    @Override // com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.l1, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.e1
    public java.lang.String b() {
        return this.f80052a;
    }
}
