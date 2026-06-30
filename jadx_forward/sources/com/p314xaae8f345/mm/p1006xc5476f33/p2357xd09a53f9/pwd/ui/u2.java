package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class u2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f260618a;

    /* renamed from: b, reason: collision with root package name */
    public int f260619b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f260620c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f260621d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260622e;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2 u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2();
        u2Var.f260618a = jSONObject.optString("button_wording");
        u2Var.f260619b = jSONObject.optInt("jump_type");
        u2Var.f260620c = jSONObject.optString("jump_h5_url");
        u2Var.f260621d = jSONObject.optString("tinyapp_name");
        u2Var.f260622e = jSONObject.optString("tinyapp_path");
        return u2Var;
    }
}
