package z43;

/* loaded from: classes.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("appId") : "";
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", optString);
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 4);
        intent.addFlags(268435456);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ri(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent, new z43.r(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
