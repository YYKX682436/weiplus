package md1;

/* loaded from: classes7.dex */
public class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f407317b;

    public q(md1.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407317b = sVar;
        this.f407316a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String errMsg, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "on event callback!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407316a;
        md1.s sVar = this.f407317b;
        if (i17 == 0) {
            map.put("errCode", 0);
            md1.f1 f1Var = sVar.f407326p;
            f1Var.u(c0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onVoIPChatStateChangedJsEvent", "hy: event callback");
            f1Var.t(map);
            f1Var.m();
            return;
        }
        if (i17 == 1) {
            java.lang.String str = (java.lang.String) map.get("openId");
            if (str != null) {
                md1.z0 z0Var = sVar.f407328r;
                z0Var.u(c0Var);
                md1.y0 y0Var = md1.y0.f407354d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onOperateVoIPViewErrorJsEvent", "dispatch onOperateVoIPViewError type:" + y0Var + " openId:" + str + " errCode:" + i18 + " errMsg:" + errMsg);
                java.util.HashMap hashMap = new java.util.HashMap(4);
                hashMap.put("type", "record");
                hashMap.put("errMsg", errMsg);
                hashMap.put("errCode", java.lang.Integer.valueOf(i18));
                hashMap.put("openId", str);
                z0Var.t(hashMap);
                z0Var.m();
                return;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "unknown event type:%s", java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "uncaught event type:%s errCode:%s ,errMsg:%s, data:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg, map);
    }
}
