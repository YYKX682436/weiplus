package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f225169a;

    public k5(java.util.Collection fileList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileList, "fileList");
        this.f225169a = fileList;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.l5 l5Var : this.f225169a) {
            l5Var.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("status", l5Var.f225190a.f329143d);
            java.lang.String str = l5Var.f225191b;
            if (str != null) {
                jSONObject2.put("fileId", str);
            }
            java.lang.Integer num = l5Var.f225192c;
            if (num != null) {
                jSONObject2.put("progress", num.intValue());
            }
            java.lang.String str2 = l5Var.f225193d;
            if (str2 != null) {
                jSONObject2.put("errMsg", str2);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("fileList", jSONArray);
        return jSONObject;
    }
}
