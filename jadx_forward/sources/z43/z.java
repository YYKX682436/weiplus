package z43;

/* loaded from: classes.dex */
public class z extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("invalid_params");
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.b(context)) {
            this.f224976f.a("exist_tab");
            return;
        }
        java.lang.String optString = jSONObject.optString("tabKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGameTabHome", "tabKey:[%s]", optString);
        long optLong = jSONObject.optLong("sourceid", 0L);
        long optLong2 = jSONObject.optLong(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52923xbc17776f, 0L);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_find_more_friend", false);
        intent.putExtra("game_report_from_scene", 5);
        intent.putExtra("start_time", java.lang.System.currentTimeMillis());
        intent.putExtra("has_game_life_chat_msg", false);
        intent.putExtra("default_game_tab_key", optString);
        intent.putExtra("disable_game_page_swipe", true);
        intent.putExtra("game_report_sourceid", optLong);
        intent.putExtra("game_report_ssid", optLong2);
        j45.l.j(context, "game", ".ui.GameCenterUI", intent, null);
        this.f224976f.d(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
