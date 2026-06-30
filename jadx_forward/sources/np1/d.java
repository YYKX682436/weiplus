package np1;

/* loaded from: classes.dex */
public final class d extends org.json.JSONObject {
    public d(java.lang.Object obj) {
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
            return;
        }
        if (obj instanceof java.lang.Double) {
            put("type", 4);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
        } else if (obj instanceof java.lang.Boolean) {
            put("type", 5);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, obj);
        } else if (obj instanceof byte[]) {
            put("type", 6);
            put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa, android.util.Base64.encodeToString((byte[]) obj, 2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BallInfo", "not support type, class:%s", obj.getClass());
            put("type", 0);
        }
    }

    public static void a(android.os.Bundle bundle, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            switch (jSONObject.getInt("type")) {
                case 1:
                    bundle.putString(str, jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
                    break;
                case 2:
                    bundle.putInt(str, jSONObject.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
                    break;
                case 3:
                    bundle.putLong(str, jSONObject.getLong(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
                    break;
                case 4:
                    bundle.putDouble(str, jSONObject.getDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
                    break;
                case 5:
                    bundle.putBoolean(str, jSONObject.getBoolean(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
                    break;
                case 6:
                    bundle.putByteArray(str, android.util.Base64.decode(jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa), 2));
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BallInfo", "restoreToBundle, not support type");
                    break;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BallInfo", e17, "restoreToBundle fail, exception:%s", e17);
        }
    }
}
