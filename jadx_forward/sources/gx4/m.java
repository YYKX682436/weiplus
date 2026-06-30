package gx4;

/* loaded from: classes.dex */
public final class m extends org.json.JSONObject {
    public m(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            put("type", 1);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            put("type", 2);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            put("type", 3);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
        } else if (obj instanceof java.lang.Boolean) {
            put("type", 4);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBagIntentLogic", "put not support type;class:%s", obj.getClass());
            put("type", 0);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
        }
    }

    public static void a(android.os.Bundle bundle, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            int i17 = jSONObject.getInt("type");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagIntentLogic", "restoreToBundle key:%s type：%d", str, java.lang.Integer.valueOf(i17));
            if (i17 == 1) {
                bundle.putString(str, jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
            } else if (i17 == 2) {
                bundle.putInt(str, jSONObject.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
            } else if (i17 == 3) {
                bundle.putLong(str, jSONObject.getLong(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
            } else if (i17 != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewBagIntentLogic", "not support type");
            } else {
                bundle.putBoolean(str, jSONObject.getBoolean(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewBagIntentLogic", "restoreToBundle e:%s", e17);
        }
    }
}
