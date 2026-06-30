package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* loaded from: classes.dex */
public abstract class a {
    public static int a(java.lang.String str) {
        if ("fingerPrint".equals(str)) {
            return 1;
        }
        if ("facial".equals(str)) {
            return 8;
        }
        if ("speech".equals(str)) {
            return 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
        return 0;
    }

    public static org.json.JSONArray b(int i17) {
        if (i17 <= 0) {
            return new org.json.JSONArray();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        if ((i17 & 1) == 1) {
            arrayList.add("fingerPrint");
        }
        if ((i17 & 8) == 8) {
            arrayList.add("facial");
        }
        if ((i17 & 2) == 2) {
            arrayList.add("speech");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: final string is: %s", arrayList.toString());
        return new org.json.JSONArray((java.util.Collection) arrayList);
    }
}
