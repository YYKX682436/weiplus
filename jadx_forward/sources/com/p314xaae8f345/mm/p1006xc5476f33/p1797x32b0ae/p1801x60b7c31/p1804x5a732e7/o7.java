package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/o7;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class o7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShowTingWecoinPayPanel", "showTingWecoinPayPanel appId: " + str + ", data: " + jSONObject + ", isFromView: " + z17);
        com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9 = new com.p314xaae8f345.mm.api.C4990x83627a9();
        c4990x83627a9.f134746f = true;
        c4990x83627a9.f134744d = 3;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("session_id") : null;
        if (optString == null) {
            optString = "";
        }
        c4990x83627a9.f134747g = optString;
        c4990x83627a9.f134748h = 2100;
        android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n7 n7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n7(this);
        qk.x8 x8Var = (qk.x8) i95.n0.c(qk.x8.class);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m77777x504cd8a2);
        com.p314xaae8f345.mm.api.ResultReceiverC4991x8df07af2 resultReceiverC4991x8df07af2 = new com.p314xaae8f345.mm.api.ResultReceiverC4991x8df07af2(m77777x504cd8a2, n7Var);
        ((ef0.o3) x8Var).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_receiver", resultReceiverC4991x8df07af2);
        intent.putExtra("key_membership_request", c4990x83627a9);
        intent.setClass(c17, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.ActivityC18708x5ac0f042.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/feature/ting/TingMembershipService", "startMembershipSubscribeForResult", "(Landroid/content/Context;Lcom/tencent/mm/api/TingMemberShipSubscribeRequest;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/feature/ting/TingMembershipService", "startMembershipSubscribeForResult", "(Landroid/content/Context;Lcom/tencent/mm/api/TingMemberShipSubscribeRequest;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
