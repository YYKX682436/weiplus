package nw4;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f422323a;

    public static java.util.Map a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String string = bundle.getString("__json_key_set");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    hashSet.add(jSONArray.getString(i17));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbsMsgWrapper", "convertBundleToMap ex %s", e17.getMessage());
            }
        }
        boolean z17 = hashSet.size() > 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : keySet) {
            java.lang.Object obj = bundle.get(str);
            if (z17 && hashSet.contains(str) && (obj instanceof java.lang.String)) {
                try {
                    hashMap.put(str, new org.json.JSONObject((java.lang.String) obj));
                } catch (java.lang.Exception e18) {
                    hashMap.put(str, obj);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AbsMsgWrapper", "convertBundleToMap ex %s", e18.getMessage());
                }
            } else {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }
}
