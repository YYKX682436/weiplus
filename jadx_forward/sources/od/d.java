package od;

/* loaded from: classes8.dex */
public class d extends od.e {
    public d(java.lang.String str, org.json.JSONObject jSONObject) {
        super(od.b.EVENT);
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("event name can not be null or empty");
        }
        jSONObject = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", str);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject);
        this.f426030b = new org.json.JSONObject(hashMap);
    }
}
