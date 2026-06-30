package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes11.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.k f161503f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.k kVar) {
        this.f161501d = lVar;
        this.f161502e = i17;
        this.f161503f = kVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12024x43acfd3d c12024x43acfd3d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12024x43acfd3d) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.k kVar = this.f161503f;
        int i17 = this.f161502e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161501d;
        if (c12024x43acfd3d == null) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 107);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, kVar.u(str2, jSONObject));
            return;
        }
        int i18 = c12024x43acfd3d.f161442d;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510 c12023x4ffb7510 = c12024x43acfd3d.f161443e;
            if (c12023x4ffb7510 == null || (intent = c12023x4ffb7510.f161441d) == null) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                intent.removeFlags(268435456);
            } else {
                intent.setFlags(intent.getFlags() & (-268435457));
            }
            intent.setExtrasClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.k.class.getClassLoader());
            android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo50352x76847179, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$invoke$1", "onCallback", "(Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo50352x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo50352x76847179, "com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$invoke$1", "onCallback", "(Lcom/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i18 != 2) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, kVar.u(str2, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2 c12026xb4f163e2 = c12024x43acfd3d.f161444f;
        if (c12026xb4f163e2 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12026xb4f163e2.f161448d, java.lang.Boolean.TRUE) : false) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 1);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            lVar.a(i17, kVar.u(str2, jSONObject3));
            return;
        }
        if (c12026xb4f163e2 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12026xb4f163e2.f161449e, java.lang.Boolean.TRUE) : false) {
            kVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 0);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i17, kVar.u(str2, jSONObject4));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (c12026xb4f163e2 != null) {
            java.lang.String str7 = c12026xb4f163e2.f161450f;
            if (str7 == null) {
                str7 = "";
            }
            hashMap.put("poiid", str7);
            java.lang.String str8 = c12026xb4f163e2.f161451g;
            if (str8 == null) {
                str8 = "";
            }
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str8);
            java.lang.String str9 = c12026xb4f163e2.f161452h;
            if (str9 == null) {
                str9 = "";
            }
            hashMap.put("address", str9);
            java.lang.Double d17 = c12026xb4f163e2.f161454m;
            hashMap.put("longitude", java.lang.Double.valueOf(d17 != null ? d17.doubleValue() : 0.0d));
            java.lang.Double d18 = c12026xb4f163e2.f161453i;
            hashMap.put("latitude", java.lang.Double.valueOf(d18 != null ? d18.doubleValue() : 0.0d));
            java.lang.String str10 = c12026xb4f163e2.f161455n;
            if (str10 == null) {
                str10 = "";
            }
            hashMap.put("districtid", str10);
            java.lang.String str11 = c12026xb4f163e2.f161456o;
            hashMap.put("content", str11 != null ? str11 : "");
        }
        kVar.getClass();
        java.lang.String str12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        lVar.a(i17, kVar.t("ok", hashMap));
    }
}
