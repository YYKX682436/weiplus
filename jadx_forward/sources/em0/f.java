package em0;

/* loaded from: classes8.dex */
public abstract class f {
    public static void a(pl0.e eVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        if (java.lang.Math.random() > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(j62.e.g().j("clicfg_android_kara_label_report", java.lang.String.valueOf(1.0E-5d), true, true), 1.0E-5d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(j62.e.g().j("clicfg_android_kara_label_report", java.lang.String.valueOf(1.0E-5d), true, true), 1.0E-5d) < 0.0d) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KaraReport", "report %s %d", str, java.lang.Integer.valueOf(i17));
        java.lang.String h17 = eVar.h();
        byte[] a17 = fm0.a.a(h17.getBytes());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KaraReport", "zip error:%s", h17);
            return;
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(a17, 2);
        int length = encodeToString.length() / 6144;
        if (encodeToString.length() % 6144 != 0) {
            length++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        while (i18 < length) {
            int i19 = i18 * 6144;
            i18++;
            int i27 = i18 * 6144;
            arrayList.add(i19 > encodeToString.length() ? null : i27 > encodeToString.length() ? encodeToString.substring(i19, encodeToString.length()) : encodeToString.substring(i19, i27));
        }
        int size = arrayList.size();
        long parseLong = java.lang.Long.parseLong(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g.replace("0x", ""), 16);
        try {
            java.lang.String b17 = kk.r.b(encodeToString);
            for (int i28 = 0; i28 < size; i28++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25582, str, str2, b17, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i28), arrayList.get(i28), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(parseLong), str3);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KaraReport", "fragments cnt %d, SHA1:", java.lang.Integer.valueOf(size), b17);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KaraReport", "SHA1 error:%s", encodeToString);
        }
    }
}
