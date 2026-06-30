package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        java.lang.String optString2 = jSONObject.optString("chatRoomUserName", "");
        java.lang.String optString3 = jSONObject.optString("selectedUserNameList");
        java.lang.String optString4 = jSONObject.optString("allUserNameList");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, optString);
        hashMap.put("chatRoomUserName", optString2);
        hashMap.put("selectedUserNameList", optString3);
        hashMap.put("allUserNameList", optString4);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 9);
        intent.putExtra("choose_chat_room_member_params", hashMap);
        int i17 = m93.j.f406592s + 1;
        m93.j.f406592s = i17;
        m93.j.f406593t.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406592s);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiChooseChatRoomMember", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiChooseChatRoomMember", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void g(int i17, int i18, android.content.Intent intent) {
        byte[] byteArrayExtra;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i19 = i18 == -1 ? 0 : -1;
        hashMap.put("errCode", java.lang.Integer.valueOf(i19));
        hashMap.put("action", java.lang.Integer.valueOf(i19));
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiChooseChatRoomMember", th6.getMessage());
            }
        }
        org.json.JSONArray optJSONArray = ha5Var.mo12245xcc313de3().optJSONArray("dataList");
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        hashMap.put("dataList", optJSONArray);
        if (i19 == 0) {
            this.f224976f.b(hashMap);
        } else {
            this.f224976f.a(hashMap.toString());
        }
    }
}
