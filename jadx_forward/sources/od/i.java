package od;

/* loaded from: classes8.dex */
public class i extends od.a {
    public i(org.json.JSONObject jSONObject) {
        this.f426029a = od.b.m151056xdce0328(jSONObject.getString("type"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        this.f426030b = optJSONObject;
        if (optJSONObject == null) {
            this.f426030b = new org.json.JSONObject();
        }
    }
}
