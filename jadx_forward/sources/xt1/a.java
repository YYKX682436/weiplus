package xt1;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f537956a;

    /* renamed from: b, reason: collision with root package name */
    public int f537957b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f537958c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537959d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f537961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f537962g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f537963h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f537964i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f537965j;

    /* renamed from: k, reason: collision with root package name */
    public int f537966k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f537967l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f537968m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f537969n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f537970o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f537971p;

    public static java.util.LinkedList a(org.json.JSONArray jSONArray, boolean z17) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            xt1.a aVar = new xt1.a();
            aVar.f537956a = jSONObject.optString("card_tp_id");
            aVar.f537957b = jSONObject.optInt("card_type");
            jSONObject.optString("color");
            aVar.f537958c = jSONObject.optString("logo_url");
            aVar.f537959d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            aVar.f537960e = jSONObject.optString("sub_title");
            aVar.f537961f = jSONObject.optString("aux_title");
            aVar.f537962g = jSONObject.optString("encrypt_code");
            aVar.f537963h = jSONObject.optString("from_user_name");
            aVar.f537964i = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
            jSONObject.optInt("end_time");
            aVar.f537965j = jSONObject.optString("card_user_id");
            aVar.f537966k = jSONObject.optInt("choose_optional");
            aVar.f537968m = jSONObject.optString("invoice_item");
            aVar.f537969n = jSONObject.optString("invoice_status");
            aVar.f537967l = jSONObject.optString("invoice_title");
            aVar.f537970o = z17;
            linkedList.add(aVar);
        }
        return linkedList;
    }
}
