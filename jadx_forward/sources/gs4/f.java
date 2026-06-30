package gs4;

/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f356614a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f356615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356616c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f356617d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f356618e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f356619f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f356620g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f356621h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f356622i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f356623j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f356624k;

    public static gs4.f a(java.lang.String str) {
        gs4.f fVar = new gs4.f();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            fVar.f356614a = jSONObject.optInt("retcode");
            fVar.f356624k = jSONObject.optBoolean("disabled");
            fVar.f356615b = jSONObject.optString("entrance_name");
            fVar.f356616c = jSONObject.optBoolean("reddot");
            fVar.f356617d = jSONObject.optString("refund_lingqian_title");
            fVar.f356618e = jSONObject.optString("refund_lingqian_desc");
            fVar.f356619f = jSONObject.optString("refund_origin_title");
            fVar.f356620g = jSONObject.optString("refund_origin_desc");
            fVar.f356621h = jSONObject.optString("top_tip");
            fVar.f356622i = jSONObject.optString("refund_time_title");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("refund_time");
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.util.ArrayList arrayList = fVar.f356623j;
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                gs4.g gVar = new gs4.g();
                gVar.f356625a = jSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                gVar.f356626b = jSONObject2.optString("desc");
                gVar.f356627c = jSONObject2.optString("iconurl");
                gVar.f356628d = jSONObject2.optString("iconmd5");
                arrayList.add(gVar);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetHbRefundConfig", "doGetHbRefundConfig() Exception:%s", e17.getMessage());
        }
        return fVar;
    }

    public java.lang.String b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("retcode", this.f356614a);
            jSONObject.put("disabled", this.f356624k);
            jSONObject.put("entrance_name", this.f356615b);
            jSONObject.put("reddot", this.f356616c);
            jSONObject.put("refund_lingqian_title", this.f356617d);
            jSONObject.put("refund_lingqian_desc", this.f356618e);
            jSONObject.put("refund_origin_title", this.f356619f);
            jSONObject.put("refund_origin_desc", this.f356620g);
            jSONObject.put("top_tip", this.f356621h);
            jSONObject.put("refund_time_title", this.f356622i);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.f356623j.iterator();
            while (it.hasNext()) {
                jSONArray.put(((gs4.g) it.next()).a());
            }
            jSONObject.put("refund_time", jSONArray);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetHbRefundConfig", "HbRefundConfig getJSONObjectString() Exception: %s", e17.getMessage());
            return "";
        }
    }

    /* renamed from: toString */
    public java.lang.String m132153x9616526c() {
        return "HbRefundConfig{retcode=" + this.f356614a + ", entrance_name='" + this.f356615b + "', reddot=" + this.f356616c + ", refund_lingqian_title='" + this.f356617d + "', refund_lingqian_desc='" + this.f356618e + "', refund_origin_title='" + this.f356619f + "', refund_origin_desc='" + this.f356620g + "', top_tip='" + this.f356621h + "', refund_time_title='" + this.f356622i + "', refund_time=" + this.f356623j + ", disabled=" + this.f356624k + '}';
    }
}
