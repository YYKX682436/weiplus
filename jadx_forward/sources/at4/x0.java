package at4;

/* loaded from: classes9.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f95520a;

    /* renamed from: b, reason: collision with root package name */
    public int f95521b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f95522c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f95523d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f95524e;

    public static at4.x0 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        at4.x0 x0Var = new at4.x0();
        x0Var.f95520a = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        jSONObject.optString("desc");
        jSONObject.optString("logo_url");
        x0Var.f95521b = jSONObject.optInt("jump_type", 0);
        x0Var.f95522c = jSONObject.optString("jump_url");
        x0Var.f95523d = jSONObject.optString(dm.i4.f66875xa013b0d5);
        x0Var.f95524e = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        return x0Var;
    }
}
