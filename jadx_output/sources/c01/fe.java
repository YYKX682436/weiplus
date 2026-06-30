package c01;

/* loaded from: classes9.dex */
public class fe implements c01.de {
    @Override // c01.de
    public void a(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(jSONObject.optString(next), next);
        }
        c01.ge.f37217a = hashMap;
    }
}
