package com.tencent.mm.plugin.appbrand.wxassistant;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class m1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {
    static {
        new com.tencent.mm.plugin.appbrand.wxassistant.m1();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.j jVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        if (string == null) {
            string = "";
        }
        bundle.getString("appId");
        java.lang.String string2 = bundle.getString("apiName");
        java.lang.String str = string2 != null ? string2 : "";
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class));
        u0Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var = u0Var.f92318e;
        j1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "doHumanAction: sessionId:" + string + " apiName:" + str);
        com.tencent.mm.plugin.appbrand.service.v5 v5Var = (com.tencent.mm.plugin.appbrand.service.v5) ((java.util.HashMap) ((jz5.n) j1Var.f92217c).getValue()).remove(string);
        if (v5Var != null && (jVar = ((com.tencent.mm.plugin.appbrand.wxassistant.a) v5Var).f92126a) != null) {
            jVar.a();
        }
        ((java.util.HashMap) ((jz5.n) j1Var.f92218d).getValue()).remove(string);
    }
}
