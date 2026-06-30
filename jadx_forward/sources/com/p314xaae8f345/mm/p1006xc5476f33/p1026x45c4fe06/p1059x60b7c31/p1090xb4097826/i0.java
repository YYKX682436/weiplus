package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34300x366c91de = 1366;

    /* renamed from: NAME */
    public static final java.lang.String f34301x24728b = "shareCurrentFinderLive";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiShareCurrentLive", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiShareCurrentLive", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12118x37c73fc c12118x37c73fc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12118x37c73fc();
        c12118x37c73fc.f162702d = jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.i0$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
            /* renamed from: onReceiveResult */
            public final void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
                java.lang.String str;
                java.lang.String str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12119x18e3e510 c12119x18e3e510 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12119x18e3e510) abstractC11888x1a859600;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.i0.this;
                i0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                int i18 = i17;
                if (c12119x18e3e510 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiShareCurrentLive", "onReceiveResult, result is null");
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 0);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    e9Var2.a(i18, i0Var.u(str2, jSONObject2));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiShareCurrentLive", "onReceiveResult result: " + c12119x18e3e510.f162703d);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put(ya.b.f77491x8758c4e1, c12119x18e3e510.f162703d);
                } catch (java.lang.Exception unused) {
                }
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var2.a(i18, i0Var.u(str2, jSONObject3));
            }
        };
        android.content.Context f229340d = e9Var.getF229340d();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12118x37c73fc, uVar, null);
    }
}
