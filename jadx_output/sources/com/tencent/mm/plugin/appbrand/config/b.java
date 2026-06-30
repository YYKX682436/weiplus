package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class b implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig f77519d;

    public b(com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig appBrandGlobalSystemConfig) {
        this.f77519d = appBrandGlobalSystemConfig;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            cf.f.b(jSONObject.getJSONArray("list"), new k91.x(this, linkedList));
            this.f77519d.M.f77276h.put(jSONObject.getLong("UsedTime"), linkedList);
        } catch (org.json.JSONException unused) {
        }
        return jz5.f0.f302826a;
    }
}
