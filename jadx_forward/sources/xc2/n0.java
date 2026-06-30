package xc2;

/* loaded from: classes2.dex */
public final class n0 extends xc2.p {

    /* renamed from: l, reason: collision with root package name */
    public int f534746l;

    /* renamed from: m, reason: collision with root package name */
    public int f534747m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(cl0.g data) {
        super(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MutualJumpInfoCache", "aid:" + this.f534763i);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(data.mo15082x48bce8a4("crt_info"));
            if (jSONArray.length() > 0) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(0);
                this.f534754c = jSONObject.optString("image_url");
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("card_info");
                if (optJSONObject != null) {
                    this.f534752a = optJSONObject.optString("description");
                    this.f534753b = optJSONObject.optString("caption");
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
