package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes.dex */
public abstract class o2 {
    public static java.lang.Object[] a(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return new java.lang.Object[0];
        }
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length];
        int length = objArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            java.lang.Object obj = objArr[i17];
            java.lang.String str = "";
            if (obj == null) {
                obj = "";
            } else if (obj instanceof java.lang.String) {
                java.lang.String str2 = (java.lang.String) obj;
                if (str2.contains(",")) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        try {
                            java.lang.String a17 = fp.s0.a(str2);
                            if (a17 != null) {
                                str = a17;
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ReportUtil", "safeEncode, given %s, e %s", str2, e17);
                        }
                    }
                    obj = str;
                }
                obj = u46.l.t((java.lang.String) obj, 0, 1024);
            }
            objArr2[i18] = java.lang.String.valueOf(obj);
            i17++;
            i18++;
        }
        return objArr2;
    }
}
