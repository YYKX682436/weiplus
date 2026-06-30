package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u0 f129088b = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129089a;

    public v0(java.lang.String moduleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        this.f129089a = moduleName;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service) {
        java.lang.String str = this.f129089a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo32091x9a3f0ba2 = service.mo32091x9a3f0ba2();
            if (mo32091x9a3f0ba2 != null) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5) mo32091x9a3f0ba2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5.class)).a()) {
                    jSONObject.put("isLazyLoad", true);
                }
                if ((mo32091x9a3f0ba2 instanceof ze.n) && ((ze.n) mo32091x9a3f0ba2).x2()) {
                    jSONObject.put("exportBaseMethods", true);
                }
            }
            jSONObject.put("moduleName", str);
            f129088b.a(service, str, jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.FULL.EventOnSubPackageReady", "dispatch appId(" + service.mo48798x74292566() + ") onSubPackageReady(" + jSONObject2 + ')');
            service.g("onSubPackageReady", jSONObject2);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.EventOnSubPackageReady", "dispatch with service(" + service.mo48798x74292566() + "), create data failed");
        }
    }
}
