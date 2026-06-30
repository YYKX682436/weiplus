package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ja;", "Lcom/tencent/mm/ipcinvoker/j;", "", "", "", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class ja implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        byte[] data = (byte[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        dw5.o oVar = new dw5.o();
        try {
            dw5.o mo11468x92b714fd = new dw5.o().mo11468x92b714fd(data);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo11468x92b714fd, "parseFrom(...)");
            oVar = mo11468x92b714fd;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPreviewAppMsgCommentImage", "parse launch info error: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(e17, true));
        }
        rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ia iaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ia(rVar);
        vw.m2 m2Var = (vw.m2) k3Var;
        m2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        m2Var.ij();
        p3325xe03a0797.p3326xc267989b.l.d(m2Var.f522218e, null, null, new vw.c2(oVar, context, iaVar, null), 3, null);
    }
}
