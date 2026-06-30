package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j7 f88684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.tencent.mm.plugin.appbrand.service.j7 j7Var) {
        super(0);
        this.f88684d = j7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.luggage.sdk.jsapi.component.service.a0 A1;
        com.tencent.luggage.sdk.jsapi.component.service.e O;
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f88684d.f88700a;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = e9Var instanceof com.tencent.luggage.sdk.jsapi.component.service.y ? (com.tencent.luggage.sdk.jsapi.component.service.y) e9Var : null;
        if (yVar != null && (A1 = yVar.A1()) != null && (O = A1.O()) != null && (appBrandCommonBindingJni = O.f47398a) != null) {
            return appBrandCommonBindingJni;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaServiceDevToolsLogicImpl", "inspectorAccessible#get, inspectorAccessible is null");
        return null;
    }
}
