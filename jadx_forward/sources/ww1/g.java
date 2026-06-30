package ww1;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f531720a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f531721b;

    /* renamed from: c, reason: collision with root package name */
    public long f531722c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f531723d;

    /* renamed from: e, reason: collision with root package name */
    public int f531724e;

    public static ww1.g a(org.json.JSONObject jSONObject) {
        ww1.g gVar = new ww1.g();
        gVar.f531720a = jSONObject.optString("bill_id");
        gVar.f531721b = jSONObject.optString("trans_id");
        gVar.f531722c = jSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, 0L);
        gVar.f531723d = jSONObject.optString("desc");
        gVar.f531724e = jSONObject.optInt("fee", 0);
        return gVar;
    }
}
