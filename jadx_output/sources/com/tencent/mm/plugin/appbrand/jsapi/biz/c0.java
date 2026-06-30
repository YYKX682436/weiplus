package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/c0;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class c0 implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null && rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
        java.lang.String userName = bundle != null ? bundle.getString("be_send_card_name", "") : null;
        java.lang.String target = bundle != null ? bundle.getString("received_card_name", "") : null;
        java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("Is_Chatroom", false)) : null;
        java.lang.String customText = bundle != null ? bundle.getString("custom_send_text", "") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "SendBizCardToChatting " + userName + ", " + target + ", " + valueOf + ", " + customText);
        vw.m mVar = (vw.m) ((rv.y2) i95.n0.c(rv.y2.class));
        mVar.getClass();
        boolean booleanValue = valueOf.booleanValue();
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(customText, "customText");
        vw.k kVar = mVar.f440680d;
        kVar.getClass();
        if (kVar.f440670c == null) {
            com.tencent.mars.xlog.Log.w("BizProfileDraftDataUtil", "bizNameCard null");
        }
        if (r01.z.m(userName)) {
            ((dk5.s5) tg3.t1.a()).b(userName, target, booleanValue, kVar.f440670c);
        } else {
            ((dk5.s5) tg3.t1.a()).Di(userName, target, booleanValue, kVar.f440670c);
        }
        ((dk5.s5) tg3.t1.a()).Ui(customText, target);
    }
}
