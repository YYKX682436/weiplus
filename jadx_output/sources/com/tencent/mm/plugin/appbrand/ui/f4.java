package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class f4 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f89699d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f89700e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f89701f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f89702g;

    public f4(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.f89699d = str;
        this.f89700e = str2;
        this.f89701f = str3;
        this.f89702g = list;
    }

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = this.f89699d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("appId", str);
            jSONObject.put("iconUrl", this.f89700e);
            jSONObject.put("nickName", this.f89701f);
            java.util.List list = this.f89702g;
            if (list != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put((java.lang.String) it.next());
                }
                jSONObject.put("messageList", jSONArray);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandEmployeeRelationExtraData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }
}
