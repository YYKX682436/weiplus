package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wxassistant.cdp.e f92167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.appbrand.wxassistant.cdp.e eVar) {
        super(0);
        this.f92167d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams = this.f92167d.f92172b;
        if (cdpCommandParams == null || (str = cdpCommandParams.f88608h) == null) {
            str = "{}";
        }
        return new org.json.JSONObject(str);
    }
}
