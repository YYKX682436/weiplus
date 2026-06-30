package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes8.dex */
public class k4 {

    /* renamed from: field_aesKey */
    public java.lang.String f38729xf11df5f5;

    /* renamed from: field_fileId */
    public java.lang.String f38730xf9dbbe9c;

    /* renamed from: field_fileLength */
    public int f38731x17c343e7;

    /* renamed from: field_fileUrl */
    public java.lang.String f38732x419c440e;

    public java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("aesKey", this.f38729xf11df5f5);
            jSONObject.put("fileId", this.f38730xf9dbbe9c);
            jSONObject.put("fileUrl", this.f38732x419c440e);
            jSONObject.put("fileLength", this.f38731x17c343e7);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }
}
