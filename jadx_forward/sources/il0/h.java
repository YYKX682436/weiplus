package il0;

@j95.b
/* loaded from: classes13.dex */
public class h extends i95.w implements ys.f {
    public h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotPredict", "initRet:%b", java.lang.Boolean.valueOf(il0.e.f373542f.f()));
    }

    public final void Ai(com.p314xaae8f345.mm.p689xc5a27af6.api.p690x104877e9.C10456x4ff7dd25 c10456x4ff7dd25) {
        if (c10456x4ff7dd25 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.DiscoveryReddotPredict", "preHandleFeature feature null");
            return;
        }
        c10456x4ff7dd25.f27914x8c864e70 = c10456x4ff7dd25.f27962x4c0681d4;
        c10456x4ff7dd25.f28064x59d4fa54 = c10456x4ff7dd25.f28112xae6d09b8;
        c10456x4ff7dd25.f28186xad6f96b8 = c10456x4ff7dd25.f28234x6667021c;
        c10456x4ff7dd25.f28312xdf0b34e = c10456x4ff7dd25.f28360x122528b2;
        c10456x4ff7dd25.f28539x702d9012 = c10456x4ff7dd25.f28587xcc2b0176;
        c10456x4ff7dd25.f28740x881fe48c = c10456x4ff7dd25.f28788xef263bf0;
        for (java.lang.reflect.Field field : c10456x4ff7dd25.getClass().getFields()) {
            if (field.getName().contains("_info_exitInterval") && field.getFloat(c10456x4ff7dd25) > 86400.0f) {
                field.setFloat(c10456x4ff7dd25, 86400.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bi(java.lang.String r17, com.p314xaae8f345.mm.p689xc5a27af6.api.p690x104877e9.C10456x4ff7dd25 r18, ys.e r19) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: il0.h.Bi(java.lang.String, com.tencent.mm.feature.api.discover.DiscoveryReddotFeatures, ys.e):void");
    }

    public final java.util.Map wi(java.util.Map map, float f17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String[] strArr = {"2", "2_3", "2_3_4", "2_3_5", "2_3_6", "2_3_7", "2_3_8", "2_4", "2_4_5", "2_4_6", "2_4_7", "2_4_8", "2_5", "2_5_6", "2_5_7", "2_5_8", "2_6", "2_6_7", "2_6_8", "2_7", "2_7_8", "2_8", "3", "3_4", "3_4_5", "3_4_6", "3_4_7", "3_4_8", "3_5", "3_5_6", "3_5_7", "3_5_8", "3_6", "3_6_7", "3_6_8", "3_7", "3_7_8", "3_8", "4", "4_5", "4_5_6", "4_5_7", "4_5_8", "4_6", "4_6_7", "4_6_8", "4_7", "4_7_8", "4_8", "5", "5_6", "5_6_7", "5_6_8", "5_7", "5_7_8", "5_8", "6", "6_7", "6_7_8", "6_8", "7", "7_8", "8"};
        for (int i17 = 0; i17 < 63; i17++) {
            hashMap.put(strArr[i17], java.lang.Float.valueOf(0.0f));
        }
        if (map == null) {
            return hashMap;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_discovery_reddot_predict_use_threshold", "0").equals("1")) {
            for (java.lang.String str : map.keySet()) {
                float floatValue = ((java.lang.Float) map.get(str)).floatValue();
                if (floatValue < f17) {
                    map.put(str, java.lang.Float.valueOf(floatValue - 1.0f));
                }
            }
        }
        for (java.lang.String str2 : map.keySet()) {
            for (java.lang.String str3 : hashMap.keySet()) {
                if (str3.contains(str2)) {
                    hashMap.put(str3, java.lang.Float.valueOf(((java.lang.Float) hashMap.get(str3)).floatValue() + ((java.lang.Float) map.get(str2)).floatValue()));
                }
            }
        }
        return hashMap;
    }
}
