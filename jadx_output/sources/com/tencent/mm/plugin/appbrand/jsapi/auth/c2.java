package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.d2 f79423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.appbrand.jsapi.auth.d2 d2Var) {
        super(1);
        this.f79423d = d2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wd0.i2 it = (wd0.i2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("JsApiGetPhoneNumberForFakeNative", "requestTicket: " + it);
        this.f79423d.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse(it.f444728c, it.f444726a, it.f444727b));
        return jz5.f0.f302826a;
    }
}
