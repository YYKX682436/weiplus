package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public abstract class j2 {
    public static final void a(su4.j2 params, int i17, android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (i17 <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TagSearchNewStyleApplier", "applyNewStyleParams: tagSearchStyle=" + i17);
        params.f494479i = false;
        if (i17 == 2) {
            params.B = true;
            params.C = true;
        }
        int i18 = j62.e.g().i("clicfg_android_global_search_use_ai_search_input", 0, true, true);
        java.util.Map extParams = params.f494477g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams, "extParams");
        extParams.put("webSearchStyle", java.lang.String.valueOf(i18));
        if (i18 > 0) {
            try {
                org.json.JSONArray jSONArray = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(params.f494495y) ? new org.json.JSONArray(params.f494495y) : new org.json.JSONArray();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("key", "webSearchStyle");
                jSONObject.put("uintValue", i18);
                jSONArray.put(jSONObject);
                params.f494495y = jSONArray.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TagSearchNewStyleApplier", e17, "append webSearchStyle to extReqParamsStr", new java.lang.Object[0]);
            }
        }
        java.lang.String string = bundle != null ? bundle.getString("tagJump_webviewJson") : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            params.f494488r = string;
        }
        java.lang.String string2 = bundle != null ? bundle.getString("tagJump_jumpQuery") : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            params.f494496z = string2;
            java.util.Map extParams2 = params.f494477g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams2, "extParams");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            extParams2.put("displayQuery", string2);
        }
        java.util.Map extParams3 = params.f494477g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams3, "extParams");
        extParams3.put("parentSearchID", "163::::");
        boolean z19 = bundle != null ? bundle.getBoolean("tagJump_isNewWebSearchStyle", false) : false;
        if (i18 > 0) {
            try {
                tg0.i1 i1Var = (tg0.i1) i95.n0.c(tg0.i1.class);
                if (i1Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TagSearchNewStyleApplier", "applyFTSConfigParams: IFTSGlobalSearchInputConfigProvider not available");
                } else {
                    if (!z19) {
                        java.lang.String wi6 = ((s50.i0) i1Var).wi();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                            java.util.Map extParams4 = params.f494477g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams4, "extParams");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wi6);
                            extParams4.put("checkboxes", wi6);
                        }
                    }
                    try {
                        z17 = new g23.h().f349452c;
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.ConfigProvider", e18, "isHideNavBar error", new java.lang.Object[0]);
                        z17 = false;
                    }
                    try {
                        z18 = new g23.h().f349451b;
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.ConfigProvider", e19, "isHideSearchBar error", new java.lang.Object[0]);
                        z18 = false;
                    }
                    if (z17 || z18) {
                        java.util.Map extParams5 = params.f494477g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams5, "extParams");
                        java.lang.String str = "1";
                        extParams5.put("hideSearchBar", z18 ? "1" : "0");
                        java.util.Map extParams6 = params.f494477g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams6, "extParams");
                        if (!z17) {
                            str = "0";
                        }
                        extParams6.put("hideNavBar", str);
                        params.f494479i = z18;
                        params.f494480j = z17;
                    }
                }
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TagSearchNewStyleApplier", e27, "applyFTSConfigParams: error", new java.lang.Object[0]);
            }
        }
        params.f494493w = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyNewStyleParams done: webSearchStyle=");
        sb6.append(i18);
        sb6.append(", isNewWebSearchStyle=");
        sb6.append(z19);
        sb6.append(", halfScreen=");
        sb6.append(params.B);
        sb6.append(", allowSwitchToFullScreen=");
        sb6.append(params.C);
        sb6.append(", hasWebviewJson=");
        sb6.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string));
        sb6.append(", hasJumpQuery=");
        sb6.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TagSearchNewStyleApplier", sb6.toString());
    }
}
