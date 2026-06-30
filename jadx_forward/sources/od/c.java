package od;

/* loaded from: classes8.dex */
public class c extends od.e {
    public c(long j17, int i17, java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        super(od.b.CALLBACK);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("callbackId", java.lang.Integer.valueOf(i17));
        hashMap.put("liteCallbackId", java.lang.Long.valueOf(j17));
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("error", str);
        }
        if (jSONObject != null) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject);
        }
        hashMap.put("keepCallback", java.lang.Boolean.valueOf(z17));
        this.f426030b = new org.json.JSONObject(hashMap);
    }
}
