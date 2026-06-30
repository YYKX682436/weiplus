package com.tencent.mm.plugin.appbrand.jsapi.contact;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/contact/r0;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/contact/JsApiUpdateAppContact$UpdateWxaAttrsTaskParam;", "Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class r0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam params = (com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam) obj;
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.String str = params.f80496d;
        java.lang.String str2 = params.f80497e;
        boolean z17 = params.f80498f;
        if (z17) {
            com.tencent.mm.plugin.appbrand.config.q.i(str, true, null, new k91.q4(str, null), null);
        } else {
            com.tencent.mm.plugin.appbrand.config.q.h(str2, true, null, null);
        }
        if (!z17) {
            str = str2;
        }
        com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes a17 = k91.k4.a(str, z17);
        if (rVar != null) {
            rVar.a(a17);
        }
    }
}
