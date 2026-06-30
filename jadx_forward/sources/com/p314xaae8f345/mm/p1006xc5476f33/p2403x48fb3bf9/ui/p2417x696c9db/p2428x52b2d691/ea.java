package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ea;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class ea implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo8834xb9724478(android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreloadFinderFeed", "start preload");
            cl0.e eVar = new cl0.e(bundle != null ? bundle.getString("KEY_REQUEST_DATA") : null);
            int i17 = bundle != null ? bundle.getInt("KEY_REQUEST_SCENE", 0) : 0;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            if (mo15056xbe0e3ae6 > 20) {
                mo15056xbe0e3ae6 = 20;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreloadFinderFeed", "preload %s", java.lang.Integer.valueOf(eVar.mo15056xbe0e3ae6()));
            for (int i18 = 0; i18 < mo15056xbe0e3ae6; i18++) {
                r45.rv0 rv0Var = new r45.rv0();
                java.lang.Object obj = eVar.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.json.InnerJSONObject");
                cl0.c cVar = (cl0.c) obj;
                rv0Var.set(1, cVar.mo15074x2fec8307("encryptId"));
                rv0Var.set(2, cVar.mo15074x2fec8307("nonceId"));
                linkedList.add(rv0Var);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, i17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiPreloadFinderFeed", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPreloadFinderFeed", "callback");
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
    }
}
