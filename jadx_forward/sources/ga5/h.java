package ga5;

/* loaded from: classes5.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.HashMap a() {
        java.lang.String M;
        org.json.JSONObject jSONObject;
        org.json.JSONArray names;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRUniversalConfig", "getUniversalConfig");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_96eea621", "UDRConfig");
            if (Ui != null && (M = com.p314xaae8f345.mm.vfs.w6.M(Ui.m117639xfb83cc9b())) != null && (names = (jSONObject = new org.json.JSONObject(M)).names()) != null) {
                int length = names.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString = names.optString(i17);
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray(optString);
                    if (optJSONArray != null) {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        int length2 = optJSONArray.length();
                        for (int i18 = 0; i18 < length2; i18++) {
                            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                            java.lang.String optString2 = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                            java.lang.String optString3 = jSONObject2.optString("value");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRUniversalConfig", "universal module %s name:%s,value:%s", optString, optString2, optString3);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                            hashMap2.put(optString2, optString3);
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        hashMap.put(optString, hashMap2);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UDRUniversalConfig", e17, "getUniversalConfig fail", new java.lang.Object[0]);
        }
        return hashMap;
    }
}
