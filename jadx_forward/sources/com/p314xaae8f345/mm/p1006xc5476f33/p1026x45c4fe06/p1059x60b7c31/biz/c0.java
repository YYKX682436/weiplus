package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/c0;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<android.os.Bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null && rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
        java.lang.String userName = bundle != null ? bundle.getString("be_send_card_name", "") : null;
        java.lang.String target = bundle != null ? bundle.getString("received_card_name", "") : null;
        java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("Is_Chatroom", false)) : null;
        java.lang.String customText = bundle != null ? bundle.getString("custom_send_text", "") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "SendBizCardToChatting " + userName + ", " + target + ", " + valueOf + ", " + customText);
        vw.m mVar = (vw.m) ((rv.y2) i95.n0.c(rv.y2.class));
        mVar.getClass();
        boolean booleanValue = valueOf.booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customText, "customText");
        vw.k kVar = mVar.f522213d;
        kVar.getClass();
        if (kVar.f522203c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileDraftDataUtil", "bizNameCard null");
        }
        if (r01.z.m(userName)) {
            ((dk5.s5) tg3.t1.a()).b(userName, target, booleanValue, kVar.f522203c);
        } else {
            ((dk5.s5) tg3.t1.a()).Di(userName, target, booleanValue, kVar.f522203c);
        }
        ((dk5.s5) tg3.t1.a()).Ui(customText, target);
    }
}
