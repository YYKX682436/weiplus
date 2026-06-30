package com.tencent.mm.plugin.appbrand.wxassistant;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "callback", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class f1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.f1 f92202d = new com.tencent.mm.plugin.appbrand.wxassistant.f1();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        kotlin.jvm.internal.o.d(string);
        java.lang.String string2 = bundle.getString("appId");
        kotlin.jvm.internal.o.d(string2);
        java.io.Serializable serializable = bundle.getSerializable("status");
        kotlin.jvm.internal.o.e(serializable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.service.CdpCommandStatus");
        com.tencent.mm.plugin.appbrand.service.o0 o0Var = (com.tencent.mm.plugin.appbrand.service.o0) serializable;
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class));
        u0Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.x1 x1Var = u0Var.f92317d;
        x1Var.getClass();
        java.util.HashMap hashMap = x1Var.f92344e;
        yz5.l lVar = (yz5.l) hashMap.remove(string + '-' + string2);
        if (lVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "notifyLaunch: sessionId:" + string + " appId:" + string2 + " status:" + o0Var);
            lVar.invoke(o0Var);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "notifyLaunch: callback not found, sessionId:" + string + " appId:" + string2 + " status:" + o0Var + ", pendingKeys:" + hashMap.keySet());
        }
        rVar.a(new android.os.Bundle());
    }
}
