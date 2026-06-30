package wz2;

/* loaded from: classes14.dex */
public abstract class a {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String obj = keys.next().toString();
            java.lang.Object opt = jSONObject.opt(obj);
            if (opt instanceof java.lang.Integer) {
                bundle.putInt(obj, ((java.lang.Integer) opt).intValue());
            } else if (opt instanceof java.lang.String) {
                bundle.putString(obj, (java.lang.String) opt);
            } else if (opt instanceof java.lang.Long) {
                bundle.putLong(obj, ((java.lang.Long) opt).longValue());
            }
        }
        return bundle;
    }

    public static java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String optString = jSONObject.optString("err_tip", jSONObject.optString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, jSONObject.optString("errormsg", jSONObject.optString("err_msg", str))));
        if (android.text.TextUtils.isEmpty(optString)) {
            vz2.c.k("msgVerify", str);
            return str;
        }
        vz2.c.k("msgVerify", optString);
        return optString;
    }

    public static java.lang.String c(android.content.Context context, java.lang.String str) {
        return context.getResources().getString(context.getResources().getIdentifier(str, "string", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b));
    }

    public static boolean d(org.json.JSONObject jSONObject) {
        return jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 0) == 271449101;
    }

    public static boolean e() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_face_restore_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashUtils", "[isOpenFaceRestoreSwitch] %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean f() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_check_cross_switch, false);
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_FaceCheckCross_Int, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashUtils", "isOpenCrossSwitch: %s, %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return true;
        }
        return fj6;
    }

    public static boolean g(java.util.HashMap hashMap, java.lang.String str, int i17) {
        return hashMap.containsKey(str) && ((java.lang.Integer) hashMap.get(str)).intValue() == i17;
    }

    public static void h(android.content.Context context, java.util.HashMap hashMap) {
        try {
            if (hashMap.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(java.lang.String.valueOf(hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)));
                java.lang.String string = jSONObject.getString("errormsg");
                if (android.text.TextUtils.isEmpty(string)) {
                    return;
                }
                jSONObject.put("errormsg", c(context, string));
                hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, jSONObject.toString());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashUtils", e17, "replaceErrorMsg", new java.lang.Object[0]);
        }
    }

    public static void i(java.util.HashMap hashMap, java.lang.String str) {
        try {
            if (hashMap.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(java.lang.String.valueOf(hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)));
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put("err_msg", str);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashUtils", e17, "setErrorMsg", new java.lang.Object[0]);
        }
    }

    public static void j(android.widget.TextView textView, java.lang.String str) {
        textView.setText("");
        textView.setTextSize(0, i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561387h3));
        textView.setText(str);
    }
}
