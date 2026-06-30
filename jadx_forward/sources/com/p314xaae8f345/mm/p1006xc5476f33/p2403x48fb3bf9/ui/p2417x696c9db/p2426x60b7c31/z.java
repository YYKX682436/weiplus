package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267109e;

    public z(nw4.k kVar, nw4.y2 y2Var) {
        this.f267108d = kVar;
        this.f267109e = y2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        final nw4.y2 y2Var = this.f267109e;
        final nw4.k kVar = this.f267108d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266472d;
            b0Var.j(2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "real scene = %d", 1);
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = kVar.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            boolean Di = ((sb0.f) jVar).Di((android.app.Activity) context, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "checkPermission checkStorage[%b]", java.lang.Boolean.valueOf(Di));
            if (Di) {
                b0Var.i(kVar, y2Var, 1);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "requestStoragePermission: requesting storage permission");
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.j(kVar.f422393a, 151, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.v(kVar, y2Var, 1), new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, "", "");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(32227, "3,0,0,0");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.jsapi.JsApiChoosePassport$doScanPassport$1
            {
                this.f39173x3fe91575 = -2051503330;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e c5968xe69f472e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e event = c5968xe69f472e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ws wsVar = event.f136266g;
                int i18 = wsVar.f89852a;
                nw4.y2 y2Var2 = y2Var;
                nw4.k kVar2 = nw4.k.this;
                if (i18 == 0) {
                    kVar2.f422396d.e(y2Var2.f422546c, "choosePassport:fail", null);
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266473e;
                    if (abstractC20980x9b9ad01d2 != null) {
                        abstractC20980x9b9ad01d2.mo48814x2efc64();
                    }
                } else if (i18 == 1) {
                    java.util.ArrayList cardBitmapArr = wsVar.f89854c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cardBitmapArr, "cardBitmapArr");
                    if (cardBitmapArr.size() == 0) {
                        kVar2.f422396d.e(y2Var2.f422546c, "choosePassport:fail", null);
                    } else {
                        try {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = cardBitmapArr.iterator();
                            while (it.hasNext()) {
                                java.lang.Object next = it.next();
                                java.lang.String str = lp0.b.e() + "tmpScanLicense/";
                                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                                    com.p314xaae8f345.mm.vfs.w6.f(str);
                                }
                                com.p314xaae8f345.mm.vfs.w6.u(str);
                                com.p314xaae8f345.mm.vfs.w6.t(str);
                                java.lang.String str2 = str + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(next instanceof android.graphics.Bitmap ? (android.graphics.Bitmap) next : null, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(str2);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
                                arrayList.add(d17.f264269e);
                            }
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("sourceType", "scan");
                            hashMap.put("localIdArr", new org.json.JSONArray((java.lang.String[]) arrayList.toArray(new java.lang.String[0])));
                            kVar2.f422396d.e(y2Var2.f422546c, "choosePassport:ok", hashMap);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChoosePassport", "save scan license error: %s", e17.getMessage());
                            kVar2.f422396d.e(y2Var2.f422546c, "choosePassport:fail", null);
                        }
                    }
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266473e;
                    if (abstractC20980x9b9ad01d3 != null) {
                        abstractC20980x9b9ad01d3.mo48814x2efc64();
                    }
                } else if (i18 == 2) {
                    kVar2.f422396d.e(y2Var2.f422546c, "choosePassport:cancel", null);
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d4 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266473e;
                    if (abstractC20980x9b9ad01d4 != null) {
                        abstractC20980x9b9ad01d4.mo48814x2efc64();
                    }
                } else if (i18 == 3) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(wsVar.f89853b);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(32227, "5," + jSONObject.getInt("scan_detail") + ',' + jSONObject.getLong("scan_time") + ',' + jSONObject.getString("scan_session_id") + ',' + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_passport_scan_oblique_control_value, 0.15f) + ',' + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_passport_scan_stable_control_value, 15.0f) + ",," + jSONObject.optInt("is_vertical_screen"));
                    } catch (org.json.JSONException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "json error");
                    }
                }
                return true;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.b0.f266473e = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 11);
        intent.putExtra("KEY_SUPPORT_ORIENTATION", true);
        java.lang.Object obj = y2Var.f422323a.get("scanDetailMsgMap");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePassport", "JSPAI scan params: " + str);
            intent.putExtra("key_basescanui_scan_detail_msg_map", str);
        }
        j45.l.j(kVar.f422393a, "scanner", ".ui.ScanPassportUI", intent, null);
    }
}
