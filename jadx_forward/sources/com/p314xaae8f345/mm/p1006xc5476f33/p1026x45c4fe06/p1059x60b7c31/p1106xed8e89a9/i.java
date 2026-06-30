package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public final class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.j f164335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f164338d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f164335a = jVar;
        this.f164336b = lVar;
        this.f164337c = i17;
        this.f164338d = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12216xab4d463d c12216xab4d463d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12216xab4d463d) abstractC11888x1a859600;
        org.json.JSONObject jSONObject = this.f164338d;
        int i17 = this.f164337c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164336b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.j jVar = this.f164335a;
        if (c12216xab4d463d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.OpenWeComUserProfile", "onReceiveResult#IProcessResultReceiver, result is null");
            jVar.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, jVar.u(str2, jSONObject2));
            jVar.D(lVar, jSONObject, mq0.z.f412182w, "result is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "onReceiveResult#IProcessResultReceiver, result: " + c12216xab4d463d);
        int ordinal = c12216xab4d463d.f164294d.ordinal();
        if (ordinal == 0) {
            jVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, jVar.u(str, jSONObject3));
            jVar.D(lVar, jSONObject, mq0.z.f412181v, "");
            return;
        }
        if (ordinal == 1) {
            jVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 1);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar.a(i17, jVar.u(str2, jSONObject4));
            jVar.D(lVar, jSONObject, mq0.z.f412182w, "cancel");
            return;
        }
        if (ordinal == 2) {
            jVar.getClass();
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, jVar.u(str2, jSONObject5));
            jVar.D(lVar, jSONObject, mq0.z.f412182w, com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
        java.lang.String str8 = c12216xab4d463d.f164295e;
        sb6.append(str8);
        java.lang.String sb7 = sb6.toString();
        jVar.getClass();
        str = android.text.TextUtils.isEmpty(sb7) ? null : sb7;
        str2 = str != null ? str : "";
        java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
        try {
            jSONObject6.put("errno", 8);
        } catch (java.lang.Exception e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
        }
        lVar.a(i17, jVar.u(str2, jSONObject6));
        jVar.D(lVar, jSONObject, mq0.z.f412182w, "fail:" + str8);
    }
}
