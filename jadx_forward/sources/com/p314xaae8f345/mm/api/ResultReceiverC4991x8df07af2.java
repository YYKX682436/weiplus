package com.p314xaae8f345.mm.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/api/TingMembershipSubscribeResultReceiver;", "Landroid/os/ResultReceiver;", "qk/fa", "ting-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.api.TingMembershipSubscribeResultReceiver */
/* loaded from: classes11.dex */
public class ResultReceiverC4991x8df07af2 extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final qk.fa f134749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC4991x8df07af2(android.os.Handler handler, qk.fa callback) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f134749d = callback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n7 n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n7) this.f134749d;
        n7Var.getClass();
        if (bundle != null) {
            int i18 = bundle.getInt("key_result_status");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShowTingWecoinPayPanel", "showTingWecoinPayPanel onResult: " + i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar = n7Var.f225225a.f224976f;
            if (oVar != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("status", i18);
                oVar.c(jSONObject, false);
            }
        }
    }
}
