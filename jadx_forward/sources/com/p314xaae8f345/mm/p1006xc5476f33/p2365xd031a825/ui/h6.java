package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f261840a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f261841b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f261842c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f261843d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f261844e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f261845f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f261846g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f261847h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f261848i;

    /* renamed from: j, reason: collision with root package name */
    public final int f261849j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f261850k;

    public h6(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("activity_change_info")) == null) {
            return;
        }
        this.f261840a = optJSONObject.optString("url");
        this.f261841b = optJSONObject.optString("wording");
        this.f261842c = optJSONObject.optString("icon");
        this.f261843d = optJSONObject.optString("btn_text");
        this.f261844e = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        optJSONObject.optString("tinyapp_name");
        this.f261845f = optJSONObject.optString("tinyapp_logo");
        this.f261846g = optJSONObject.optString("tinyapp_desc");
        this.f261847h = optJSONObject.optString("tinyapp_username");
        this.f261848i = optJSONObject.optString("tinyapp_path");
        this.f261850k = optJSONObject.optString("activity_tinyapp_btn_text");
    }

    /* renamed from: toString */
    public java.lang.String m73911x9616526c() {
        return this.f261840a + " , " + this.f261841b + " , " + this.f261842c + " , " + this.f261843d + " , " + this.f261844e;
    }

    public h6(r45.fh5 fh5Var) {
        r45.y1 y1Var;
        if (fh5Var == null || (y1Var = fh5Var.f455892f) == null) {
            return;
        }
        this.f261840a = y1Var.f472225d;
        java.lang.String str = y1Var.f472226e;
        this.f261841b = str;
        java.lang.String str2 = y1Var.f472227f;
        this.f261842c = str2;
        java.lang.String str3 = y1Var.f472228g;
        this.f261843d = str3;
        this.f261844e = y1Var.f472229h;
        this.f261847h = y1Var.f472230i;
        this.f261848i = y1Var.f472231m;
        this.f261849j = y1Var.f472232n;
        this.f261845f = str2;
        this.f261846g = str;
        this.f261850k = str3;
    }
}
