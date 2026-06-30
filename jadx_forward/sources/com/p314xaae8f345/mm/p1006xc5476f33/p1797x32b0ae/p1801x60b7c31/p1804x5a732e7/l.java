package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f225180a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f225181b;

    public l(java.util.Collection fileList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileList, "fileList");
        this.f225180a = fileList;
        this.f225181b = z17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m mVar : this.f225180a) {
            mVar.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", mVar.f225203a.f329143d);
            java.lang.String str = mVar.f225204b;
            if (str != null) {
                jSONObject2.put("fileId", str);
            }
            java.lang.Integer num = mVar.f225205c;
            if (num != null) {
                jSONObject2.put("progress", num.intValue());
            }
            java.lang.String str2 = mVar.f225206d;
            if (str2 != null) {
                jSONObject2.put("errMsg", str2);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("fileList", jSONArray);
        jSONObject.put("complete", this.f225181b);
        return jSONObject;
    }
}
