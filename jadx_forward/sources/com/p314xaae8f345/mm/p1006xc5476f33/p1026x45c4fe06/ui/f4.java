package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes.dex */
public final class f4 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f171232d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f171233e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f171234f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f171235g;

    public f4(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.f171232d = str;
        this.f171233e = str2;
        this.f171234f = str3;
        this.f171235g = list;
    }

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = this.f171232d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("appId", str);
            jSONObject.put("iconUrl", this.f171233e);
            jSONObject.put("nickName", this.f171234f);
            java.util.List list = this.f171235g;
            if (list != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put((java.lang.String) it.next());
                }
                jSONObject.put("messageList", jSONArray);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandEmployeeRelationExtraData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }
}
