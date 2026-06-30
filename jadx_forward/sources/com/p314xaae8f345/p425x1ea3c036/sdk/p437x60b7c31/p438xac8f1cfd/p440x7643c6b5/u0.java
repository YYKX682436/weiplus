package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class u0 {
    public u0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final org.json.JSONObject a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l service, java.lang.String moduleName, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847> b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) service.b(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052.class);
        if (c3899xf952a052 != null && (c11667xc7e59dd6 = c3899xf952a052.f387385r) != null && (c11670x2ef26cc7 = c11667xc7e59dd6.f156937i) != null && (b17 = c11670x2ef26cc7.b(moduleName)) != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847 c11669x3195c847 : b17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("plugin_id", c11669x3195c847.f33473xc52405f1);
                jSONObject.put("custom_version", c11669x3195c847.f33474x1a804f87);
                jSONObject.put("prefix_path", c11669x3195c847.f33472xb01af1d7);
                jSONObject.put("inner_version", c11669x3195c847.f33475x14f51cd8);
                jSONArray.put(jSONObject);
            }
            data.put("separatedPlugins", jSONArray);
        }
        return data;
    }
}
