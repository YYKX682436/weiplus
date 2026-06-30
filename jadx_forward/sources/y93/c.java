package y93;

/* loaded from: classes.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        try {
            java.lang.String string = jSONObject.has("openId") ? jSONObject.getString("openId") : null;
            java.lang.String string2 = jSONObject.has("userName") ? jSONObject.getString("userName") : null;
            if (string2 != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", string2);
                intent.putExtra("Contact_Scene", 3);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                this.f224976f.d(false);
                return;
            }
            if (string == null) {
                this.f224976f.a("openId or userName is required");
                return;
            }
            ((lf0.w) ((mf0.e0) i95.n0.c(mf0.e0.class))).getClass();
            sm4.d dVar = new sm4.d(string);
            gm0.j1.d().a(2830, new y93.b(this, dVar));
            gm0.j1.d().g(dVar);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiOpenProfileWithOpenId", e17, "get openId", new java.lang.Object[0]);
            this.f224976f.a("get openId exception");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
