package u93;

/* loaded from: classes.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenGamePluginSettingPage", "invoke openGamePluginSettingPage");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "gh_25d9ac85a4bc");
        intent.putExtra("key_wxgame_setting_from_scene", 3);
        j45.l.j(c(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        this.f224975e.d();
    }
}
