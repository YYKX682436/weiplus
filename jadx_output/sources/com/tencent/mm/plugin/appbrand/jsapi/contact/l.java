package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes7.dex */
public class l implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask f80570a;

    public l(com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChattingTask jsApiChattingTask) {
        this.f80570a = jsApiChattingTask;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public void a(k91.v5 v5Var) {
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiChattingTask", "info is null, err");
        }
        this.f80570a.c();
    }
}
