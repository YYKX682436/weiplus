package l81;

/* loaded from: classes2.dex */
public class d1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public float f398585d;

    /* renamed from: e, reason: collision with root package name */
    public float f398586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f398587f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f398588g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f398589h;

    /* renamed from: i, reason: collision with root package name */
    public long f398590i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f398591m;

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", this.f398585d);
            jSONObject.put("longitude", this.f398586e);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f398587f);
            jSONObject.put("clickTime", this.f398590i);
            jSONObject.put("cityName", this.f398589h);
            jSONObject.put("cityCode", this.f398588g);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f398591m)) {
                jSONObject.put("poiId", this.f398591m);
            }
            return new org.json.JSONObject().put(ya.b.f77489x9ff58fb5, jSONObject).toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeAppOpenPoiNativeExtraData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }
}
