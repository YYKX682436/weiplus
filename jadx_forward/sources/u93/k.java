package u93;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiQuitGameLifeChatroom", "Invoke startGameLifeConversation");
        if (jSONObject == null) {
            this.f224976f.a("fail: data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("chatroom_name");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            this.f224976f.a("data is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiQuitGameLifeChatroom", "chatRoomName:%s", optString);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.game.ACTION_QUIT_CHAT_ROOM");
        intent.putExtra("chatroom_name", optString);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.g0.f220981a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65269x10864c08(this.f224976f.f224973a.f380557a, new android.content.Intent());
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 0;
    }
}
