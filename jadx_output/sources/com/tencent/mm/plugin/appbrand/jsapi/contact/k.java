package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class k implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask f80568a;

    public k(com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask) {
        this.f80568a = jsApiChattingTask;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChattingTask", "privateUsername:%s info is null, err", this.f80568a.f80485g);
        }
    }
}
