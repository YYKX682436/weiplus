package u93;

/* loaded from: classes.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameLifeChatroom", "Invoke openGameLifeChatroom");
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("chatroom_name");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("data is null");
            return;
        }
        java.lang.String optString2 = jSONObject.optString("chatroom_icon");
        boolean optBoolean = jSONObject.optBoolean("is_auto_join", false);
        long optLong = jSONObject.optLong("sourceid", 0L);
        long optLong2 = jSONObject.optLong(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, 0L);
        boolean optBoolean2 = jSONObject.optBoolean("backToRoomList", false);
        int optInt = jSONObject.optInt("targetChannelId", -1);
        long optLong3 = jSONObject.optLong("targetSeq", -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameLifeChatroom", "chatRoomName:%s, iconUrl:%s, isAutoJoin:%b, sourceId:%d, ssid:%d, backToRoomList:%b, targetChannelId:%s, targetSeq:%s", optString, optString2, java.lang.Boolean.valueOf(optBoolean), java.lang.Long.valueOf(optLong), java.lang.Long.valueOf(optLong2), java.lang.Boolean.valueOf(optBoolean2), java.lang.Integer.valueOf(optInt), java.lang.Long.valueOf(optLong3));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chatroom_name", optString);
        hashMap.put("chatroom_icon", optString2);
        hashMap.put("is_auto_join", java.lang.String.valueOf(optBoolean));
        hashMap.put("sourceid", java.lang.String.valueOf(optLong));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, java.lang.String.valueOf(optLong2));
        hashMap.put("backToRoomList", java.lang.String.valueOf(optBoolean2));
        hashMap.put("targetChannelId", java.lang.String.valueOf(optInt));
        hashMap.put("targetSeq", java.lang.String.valueOf(optLong3));
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 8);
        intent.putExtra("open_game_life_chatroom_params", hashMap);
        int i17 = m93.j.f406590q + 1;
        m93.j.f406590q = i17;
        m93.j.f406591r.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f406590q);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiOpenGameLifeChatroom", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/gamecenter/LiteAppJsApiOpenGameLifeChatroom", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void t() {
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
