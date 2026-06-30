package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f47334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.luggage.sdk.jsapi.component.b bVar, com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        super(mVar);
        this.f47334b = bVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String readLibSync(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? "" : this.f47334b.x().M(str);
    }

    @android.webkit.JavascriptInterface
    public java.lang.String readLibXWebScriptSync(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        com.tencent.luggage.sdk.jsapi.component.b bVar = this.f47334b;
        return !(bVar.Q1() instanceof com.tencent.mm.plugin.appbrand.page.a) ? "" : ((com.tencent.mm.plugin.appbrand.page.a) bVar.Q1()).O().b(str);
    }
}
