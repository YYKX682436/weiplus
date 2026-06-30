package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ca;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/ba", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ca extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ba f161697d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ba(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f161698e = "CheckStrangerTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c request) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11930x2666cb31 c11930x2666cb31 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11930x2666cb31();
        if (!(request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11929xa65651fb)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CheckStrangerTask", "handleRequest, request not instance of ProfileRequest");
            m50420x7b736e5c(c11930x2666cb31);
            return;
        }
        if (!gm0.j1.b().n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheckStrangerTask", "handleRequest, MMKernel.account().hasLogin() is false");
            m50420x7b736e5c(c11930x2666cb31);
            return;
        }
        java.lang.String reqData = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11929xa65651fb) request).getReqData();
        if (reqData == null) {
            reqData = "";
        }
        try {
            jSONObject = new org.json.JSONObject(reqData);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("param") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject != null ? jSONObject.optString("action") : null, "openChat")) {
            android.content.Context context = m50421x3c6fed6a();
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("hashUserName");
                java.lang.String optString2 = optJSONObject.optString("encodeUserName");
                optJSONObject.optString("nickName");
                optJSONObject.optString("headImageURL");
                java.lang.String optString3 = optJSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                boolean z17 = true;
                java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(optString, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "openTextStateChatting hashUserName:%s changeUserName:%s", optString, Di);
                if (Di != null && !r26.n0.N(Di)) {
                    z17 = false;
                }
                qj4.s sVar = qj4.s.f445491a;
                if (z17) {
                    ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                    java.lang.String l17 = o13.n.l(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getUnsignedMd5UInt(...)");
                    hi4.m.f363089g = l17;
                    ((ki4.x) i95.n0.c(ki4.x.class)).Di(optString3, optString2, context);
                    java.lang.String str = hi4.m.f363089g;
                    qj4.s.o(sVar, 1L, "0", str == null ? "" : str, 7, null, 2, 0, 0, 0, null, null, null, null, null, 16336, null);
                } else {
                    ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Di);
                    xVar.Ni(context, Di);
                    ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                    java.lang.String l18 = o13.n.l(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "getUnsignedMd5UInt(...)");
                    qj4.s.o(sVar, 6L, null, l18, 10, null, 0, 0, 0, 0, Di, null, null, null, null, 15858, null);
                }
            }
            m50420x7b736e5c(c11930x2666cb31);
        }
    }
}
