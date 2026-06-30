package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

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
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSoterTranslateUtil", "hy: final string is: %s", arrayList.toString());
        return new org.json.JSONArray((java.util.Collection) arrayList);
    }
}
