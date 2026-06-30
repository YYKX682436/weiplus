package ss4;

/* loaded from: classes9.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f493629a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f493630b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f493631c;

    /* renamed from: d, reason: collision with root package name */
    public ss4.l0 f493632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493633e;

    public static ss4.m0 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ss4.m0 m0Var = new ss4.m0();
        m0Var.f493629a = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        m0Var.f493630b = jSONObject.optString("sub_title");
        m0Var.f493631c = jSONObject.optBoolean("is_lqt_user");
        m0Var.f493633e = jSONObject.optString("lqt_operate_id");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c(jSONObject.optString("lqt_trace_info"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("open_lqt_info");
        if (optJSONObject != null) {
            ss4.l0 l0Var = new ss4.l0();
            m0Var.f493632d = l0Var;
            l0Var.f493621a = optJSONObject.optString("open_info");
            m0Var.f493632d.f493622b = optJSONObject.optString("open_url");
            m0Var.f493632d.f493623c = optJSONObject.optInt("route_type");
            m0Var.f493632d.f493624d = optJSONObject.optString("appname");
        }
        return m0Var;
    }
}
