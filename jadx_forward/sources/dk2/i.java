package dk2;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.i f315129a = new dk2.i();

    public final int a(java.lang.String str, int i17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return i17;
        }
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBannerUtil", "parse color fail " + str);
            return i17;
        }
    }

    public final r45.bm1 b(java.lang.String str) {
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        int optInt;
        int optInt2;
        java.lang.String optString2;
        java.lang.String optString3;
        int optInt3;
        java.lang.String optString4;
        java.lang.String optString5;
        java.lang.String optString6;
        int optInt4;
        int optInt5;
        int optInt6;
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject2;
        java.lang.String str3;
        java.lang.String str4;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderBannerUtil", "parseBannerExtInfo bannerExtInfo is empty");
            return null;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
            jSONObject.toString();
            optString = jSONObject.optString(dm.i4.f66865x76d1ec5a);
            optInt = jSONObject.optInt("need_preload", 0);
            optInt2 = jSONObject.optInt("background_source", 0);
            optString2 = jSONObject.optString("background_color", "");
            optString3 = jSONObject.optString("background_gradient_color", "");
            optInt3 = jSONObject.optInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXWebPage.f32847x4430964b, 0);
            optString4 = jSONObject.optString("dynamic_wording");
            optString5 = jSONObject.optString("wording_color");
            optString6 = jSONObject.optString("button_color");
            optInt4 = jSONObject.optInt("preload_interval");
            optInt5 = jSONObject.optInt("report_new_cgi");
            optInt6 = jSONObject.optInt("report_switch");
            str2 = "Finder.FinderBannerUtil";
        } catch (java.lang.Exception e17) {
            e = e17;
            str2 = "Finder.FinderBannerUtil";
        }
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("sub_title_list");
            org.json.JSONArray put = optJSONObject != null ? new org.json.JSONArray().put(optJSONObject) : jSONObject.optJSONArray("sub_title_list");
            int optInt7 = jSONObject.optInt("need_cache", 0);
            int optInt8 = jSONObject.optInt("preload_delay_ms", 2000);
            java.lang.String optString7 = jSONObject.optString("sub_icon_url", "");
            int optInt9 = jSONObject.optInt("display_interval_ms", 5000);
            boolean optBoolean = jSONObject.optBoolean("is_show_sub_icon_pag", false);
            int optInt10 = jSONObject.optInt("version", 0);
            boolean optBoolean2 = jSONObject.optBoolean("need_reload_preload_cache", false);
            r45.bm1 bm1Var = new r45.bm1();
            bm1Var.set(0, optString);
            bm1Var.set(1, java.lang.Integer.valueOf(optInt));
            bm1Var.set(2, java.lang.Integer.valueOf(optInt2));
            bm1Var.set(3, optString2);
            bm1Var.set(4, java.lang.Integer.valueOf(optInt3));
            bm1Var.set(5, optString4);
            bm1Var.set(6, optString5);
            bm1Var.set(7, optString6);
            bm1Var.set(9, optString3);
            bm1Var.set(10, java.lang.Integer.valueOf(optInt4));
            bm1Var.set(11, java.lang.Integer.valueOf(optInt5));
            bm1Var.set(12, java.lang.Integer.valueOf(optInt6));
            bm1Var.set(15, java.lang.Integer.valueOf(optInt7));
            bm1Var.set(16, java.lang.Integer.valueOf(optInt8));
            bm1Var.set(14, optString7);
            if (optInt9 == 0) {
                optInt9 = 5000;
            }
            bm1Var.set(17, java.lang.Integer.valueOf(optInt9));
            bm1Var.set(19, java.lang.Integer.valueOf(optInt10));
            bm1Var.set(20, java.lang.Boolean.valueOf(optBoolean2));
            bm1Var.set(21, jSONObject.optString("jump_navlive_buffer_encode", ""));
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("side_bar_related_live_prepare_info");
            if (optJSONObject2 != null) {
                r45.fw2 fw2Var = new r45.fw2();
                fw2Var.set(0, optJSONObject2.optString("top_left_wording", ""));
                fw2Var.set(1, optJSONObject2.optString("top_right_wording", ""));
                fw2Var.set(2, java.lang.Integer.valueOf(optJSONObject2.optInt("top_right_func", 0)));
                bm1Var.set(22, fw2Var);
            }
            int length = put != null ? put.length() : 0;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i17 = 0;
            while (i17 < length) {
                r45.td tdVar = new r45.td();
                if (put != null) {
                    jSONArray = put;
                    jSONObject2 = jSONArray.optJSONObject(i17);
                } else {
                    jSONArray = put;
                    jSONObject2 = null;
                }
                if (jSONObject2 == null || (str3 = jSONObject2.optString("icon_url")) == null) {
                    str3 = "";
                }
                tdVar.set(0, str3);
                if (jSONObject2 == null || (str4 = jSONObject2.optString("wording")) == null) {
                    str4 = "";
                }
                tdVar.set(1, str4);
                linkedList.add(tdVar);
                i17++;
                put = jSONArray;
            }
            bm1Var.set(13, linkedList);
            bm1Var.set(18, java.lang.Boolean.valueOf(optBoolean));
            return bm1Var;
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e, "parseBannerExtInfo fail", new java.lang.Object[0]);
            return null;
        }
    }
}
