package im1;

/* loaded from: classes15.dex */
public abstract class a extends t85.a {
    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", c());
        return jSONObject;
    }

    public abstract java.lang.String c();
}
