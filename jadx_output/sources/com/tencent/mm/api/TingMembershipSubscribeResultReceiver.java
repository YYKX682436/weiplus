package com.tencent.mm.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/api/TingMembershipSubscribeResultReceiver;", "Landroid/os/ResultReceiver;", "qk/fa", "ting-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class TingMembershipSubscribeResultReceiver extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final qk.fa f53216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingMembershipSubscribeResultReceiver(android.os.Handler handler, qk.fa callback) {
        super(handler);
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f53216d = callback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.lite.jsapi.comms.n7 n7Var = (com.tencent.mm.plugin.lite.jsapi.comms.n7) this.f53216d;
        n7Var.getClass();
        if (bundle != null) {
            int i18 = bundle.getInt("key_result_status");
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiShowTingWecoinPayPanel", "showTingWecoinPayPanel onResult: " + i18);
            com.tencent.mm.plugin.lite.api.o oVar = n7Var.f143692a.f143443f;
            if (oVar != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("status", i18);
                oVar.c(jSONObject, false);
            }
        }
    }
}
