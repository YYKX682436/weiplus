package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f262297a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f262298b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f262299c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f262300d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f262301e;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("activity_change_info")) == null) {
            return;
        }
        this.f262297a = optJSONObject.optString("url");
        this.f262298b = optJSONObject.optString("wording");
        this.f262299c = optJSONObject.optString("icon");
        this.f262300d = optJSONObject.optString("btn_text");
        this.f262301e = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
    }

    /* renamed from: toString */
    public java.lang.String m73942x9616526c() {
        return this.f262297a + " , " + this.f262298b + " , " + this.f262299c + " , " + this.f262300d + " , " + this.f262301e;
    }
}
