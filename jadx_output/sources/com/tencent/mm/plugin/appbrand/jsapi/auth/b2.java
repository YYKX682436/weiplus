package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest f79413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        super(1);
        this.f79413d = appBrandProxyUIProcessTask$ProcessRequest;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView img = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(img, "img");
        n11.a b17 = n11.a.b();
        java.lang.String iconURL = ((com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest) this.f79413d).getIconURL();
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342091o = com.tencent.mm.R.drawable.bgo;
        fVar.f342079c = true;
        b17.h(iconURL, img, fVar.a());
        return jz5.f0.f302826a;
    }
}
