package e04;

/* loaded from: classes13.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f327671a;

    public static java.lang.String a(java.lang.String str) {
        try {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScannerUtil", e17, "escapeHtml exception", new java.lang.Object[0]);
            return str;
        }
    }

    public static boolean b(int i17) {
        return i17 == 1 || i17 == 8 || i17 == 4;
    }

    public static boolean c() {
        java.lang.String[] split;
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableNewOCRTranslation", 0);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PicTranslationSupportUserLanguage");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(b17 == 1);
        objArr[1] = d17;
        objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerUtil", "enable %s, support lang %s, current lang %s", objArr);
        return b17 == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && (split = d17.split(";")) != null && java.util.Arrays.asList(split).contains(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
    }

    public static boolean d(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScannerUtil", "list == null || list.size() == 0");
            return false;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            e04.u3 u3Var = (e04.u3) arrayList.get(i17);
            if (u3Var != null) {
                if (((du1.l) i95.n0.c(du1.l.class)) != null ? lu1.a0.B(u3Var.f327665b) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e(android.os.Bundle bundle, com.p314xaae8f345.p2891x34da02.C25310xa03ac6cd c25310xa03ac6cd, float[] fArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerUtil", "normalizeRect");
        if (c25310xa03ac6cd == null || fArr == null || fArr.length != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerUtil", "normalizeRect fail");
            bundle.putParcelable("result_normalize_rect", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807(0.0f, 0.0f, 1.0f, 1.0f));
            return;
        }
        float f17 = fArr[0];
        float f18 = fArr[2];
        float f19 = fArr[1];
        int i17 = (int) (f18 - f17);
        int i18 = (int) (fArr[3] - f19);
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerUtil", "normalizeRect fail with args error");
            bundle.putParcelable("result_normalize_rect", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807(0.0f, 0.0f, 1.0f, 1.0f));
            return;
        }
        float min = java.lang.Math.min(c25310xa03ac6cd.f296765x2, c25310xa03ac6cd.f296766x3);
        float min2 = java.lang.Math.min(c25310xa03ac6cd.f296767y0, c25310xa03ac6cd.f296770y3);
        float max = java.lang.Math.max(c25310xa03ac6cd.f296763x0, c25310xa03ac6cd.f296764x1);
        float max2 = java.lang.Math.max(c25310xa03ac6cd.f296768y1, c25310xa03ac6cd.f296769y2);
        float f27 = i17;
        float f28 = i18;
        bundle.putInt("result_image_width", i17);
        bundle.putInt("result_image_height", i18);
        bundle.putParcelable("result_normalize_rect", new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807((min - f17) / f27, (min2 - f19) / f28, (max - f17) / f27, (max2 - f19) / f28));
    }

    public static e04.u3 f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            e04.u3 u3Var = new e04.u3();
            u3Var.f327664a = jSONObject.optString("card_tp_id");
            u3Var.f327665b = jSONObject.optInt("card_type");
            u3Var.f327666c = jSONObject.optString("card_ext");
            return u3Var;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScannerUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.util.ArrayList g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("card_list");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    e04.u3 u3Var = new e04.u3();
                    u3Var.f327664a = optJSONObject.optString("card_tp_id");
                    u3Var.f327665b = optJSONObject.optInt("card_type");
                    u3Var.f327666c = optJSONObject.optString("card_ext");
                    arrayList.add(u3Var);
                }
                return arrayList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScannerUtil", "parseCardListItemArray cardItemListJson is null");
            return null;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScannerUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static void h() {
        boolean z17 = false;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_code_multi_code_enable, 0);
        if (Ni == 0) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            z17 = true;
        }
        f327671a = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScannerUtil", "updateEnableMultiCode clicfg_scan_code_multi_code_enable config: %d, enable: %b", java.lang.Integer.valueOf(Ni), f327671a);
    }
}
