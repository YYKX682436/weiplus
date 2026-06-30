package com.tencent.mm.plugin.appbrand.wxassistant;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class y0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.y0 f92347d = new com.tencent.mm.plugin.appbrand.wxassistant.y0();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("callbackId");
        int i18 = bundle.getInt("response_Code");
        java.lang.String string = bundle.getString("response_key");
        java.lang.String str = "";
        if (string == null) {
            string = "";
        }
        boolean z17 = true;
        if (string.length() > 0) {
            jz5.g gVar = com.tencent.mm.plugin.appbrand.wxassistant.j1.f92214h;
            jz5.g gVar2 = com.tencent.mm.plugin.appbrand.wxassistant.j1.f92214h;
            java.lang.Object value = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            str = ((com.tencent.mm.sdk.platformtools.o4) value).getString(string, "");
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((com.tencent.mm.sdk.platformtools.o4) value2).remove(string);
        } else {
            java.lang.String string2 = bundle.getString("response");
            if (string2 != null) {
                str = string2;
            }
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "callbackByAppBrandProcess: responseInMM is null or empty");
        }
        com.tencent.mm.plugin.appbrand.service.t5 t5Var = (com.tencent.mm.plugin.appbrand.service.t5) ((java.util.HashMap) ((jz5.n) ((com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class))).f92317d.f92343d).getValue()).remove(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "callbackByAppBrandProcess: callbackId: " + i17 + " callback:" + t5Var);
        if (t5Var != null) {
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.appbrand.service.CdpCommandResponse cdpCommandResponse = new com.tencent.mm.plugin.appbrand.service.CdpCommandResponse(i18, str);
            com.tencent.mm.plugin.appbrand.wxassistant.cdp.e eVar = ((com.tencent.mm.plugin.appbrand.wxassistant.cdp.c) t5Var).f92169a;
            eVar.getClass();
            eVar.f92175e = com.tencent.mm.plugin.appbrand.wxassistant.cdp.f.f92178g;
            yz5.l lVar = eVar.f92171a;
            if (lVar != null) {
                lVar.invoke(cdpCommandResponse);
            }
        }
    }
}
