package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/j3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            java.lang.String string = data.getString("messageSvrId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            long parseLong = java.lang.Long.parseLong(string);
            java.lang.String string2 = data.getString("chatName");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = pt0.f0.f439742b1.l(string2, parseLong);
            if (l17 == null) {
                throw new java.lang.IllegalStateException("msgInfo".toString());
            }
            android.content.Context c17 = c();
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(c(), "com.tencent.mm.ui.chatting.ChattingUI");
            intent.putExtra("msg_local_id", l17.m124847x74d37ac6());
            intent.putExtra("from_global_search", true);
            intent.putExtra("need_hight_item", true);
            intent.putExtra("Chat_User", string2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiLocateToChatPosition", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            c17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiLocateToChatPosition", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f224975e.d();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiLocateToChatPosition", e17.getMessage() + ": " + jz5.a.b(e17));
            this.f224975e.a();
        }
    }
}
