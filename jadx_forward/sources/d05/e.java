package d05;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f307121d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f307122e;

    /* renamed from: f, reason: collision with root package name */
    public int f307123f;

    public e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind_serialno", str);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 59;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f307122e = jSONObject.getString("session_key");
            this.f307123f = jSONObject.optInt("answer_times_left", -1);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            if (jSONArray == null || jSONArray.length() <= 0) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                d05.l lVar = new d05.l();
                lVar.f307143b = jSONObject2.getString("qt_id");
                lVar.f307145d = jSONObject2.getString("parent_id");
                jSONObject2.getString("qt_type");
                lVar.f307146e = jSONObject2.getString("qt_cont");
                jSONObject2.getInt("ans_len");
                lVar.f307147f = jSONObject2.getString("wording");
                lVar.f307148g = jSONObject2.getInt(ya.b.f77487x44fa364);
                if (!hashMap.containsKey(lVar.f307145d) || "0".equals(lVar.f307145d)) {
                    hashMap.put(lVar.f307143b, lVar);
                } else {
                    ((d05.l) hashMap.get(lVar.f307145d)).f307149h = lVar;
                }
            }
            this.f307121d = new java.util.ArrayList(hashMap.values());
            hashMap.clear();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }
}
