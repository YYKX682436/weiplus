package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class g4 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f81238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f81239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.i4 f81241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81242e;

    public g4(java.lang.ref.WeakReference weakReference, int i17, com.tencent.mm.plugin.appbrand.jsapi.i4 i4Var, java.lang.String str) {
        this.f81239b = weakReference;
        this.f81240c = i17;
        this.f81241d = i4Var;
        this.f81242e = str;
    }

    @Override // r.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean apply(java.util.List input) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.jsapi.i4 i4Var = this.f81241d;
        int i17 = this.f81240c;
        java.lang.ref.WeakReference weakReference = this.f81239b;
        kotlin.jvm.internal.o.g(input, "input");
        if (this.f81238a) {
            z17 = false;
        } else {
            try {
                com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) weakReference.get();
                if (yVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str = this.f81242e;
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = input.iterator();
                    while (it.hasNext()) {
                        k91.v5 v5Var = (k91.v5) it.next();
                        org.json.JSONObject optJSONObject = new org.json.JSONObject(v5Var.field_appInfo).optJSONObject("PluginInfo");
                        if (optJSONObject == null) {
                            optJSONObject = new org.json.JSONObject();
                        }
                        jSONArray.put(optJSONObject.put("appId", v5Var.field_appId));
                    }
                    jSONObject.put("contactList", jSONArray);
                    jSONObject.put("callbackId", str);
                    yVar.a(i17, i4Var.s("ok", jSONObject));
                }
            } catch (org.json.JSONException unused) {
                com.tencent.mm.plugin.appbrand.y yVar2 = (com.tencent.mm.plugin.appbrand.y) weakReference.get();
                if (yVar2 != null) {
                    yVar2.a(i17, i4Var.o("fail: toJson fail"));
                }
            }
            z17 = true;
            this.f81238a = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
