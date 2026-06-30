package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public abstract class h1 {
    public static boolean a(java.lang.String str) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.f1.f234577a).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (android.os.Build.BRAND.equalsIgnoreCase((java.lang.String) it.next())) {
                z17 = true;
                break;
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.f1.f234578b).iterator();
        while (true) {
            if (!it6.hasNext()) {
                z18 = false;
                break;
            }
            if (((java.lang.Integer) it6.next()).intValue() == android.os.Build.VERSION.SDK_INT) {
                z18 = true;
                break;
            }
        }
        java.util.Iterator it7 = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.f1.f234579c).iterator();
        while (true) {
            if (!it7.hasNext()) {
                z19 = false;
                break;
            }
            if (str.contains((java.lang.String) it7.next())) {
                z19 = true;
                break;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(z17 && z18 && z19);
        java.lang.String str2 = android.os.Build.BRAND;
        objArr[1] = str2;
        int i17 = android.os.Build.VERSION.SDK_INT;
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadWhiteList", "OnePlus_Q_AudioLeak: matchWhiteThread? %s, brand = %s, API = %s, threadName = %s", objArr);
        if (z17 && z18 && z19) {
            return true;
        }
        boolean equalsIgnoreCase = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.g1.f234581a.equalsIgnoreCase(str2);
        boolean z28 = i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.g1.f234582b;
        boolean equals = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.g1.f234583c.equals(str);
        if (equalsIgnoreCase && z28 && equals) {
            java.util.Iterator it8 = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.g1.f234584d).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    z27 = false;
                    break;
                }
                if (((java.lang.String) it8.next()).equalsIgnoreCase(wo.w0.m())) {
                    z27 = true;
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadWhiteList", "Vivo_Q_Camera_Leak: matchWhiteThread? %s, brand = %s, model = %s, API = %s, threadName = %s", java.lang.Boolean.TRUE, android.os.Build.BRAND, wo.w0.m(), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), str);
        } else {
            z27 = false;
        }
        return z27;
    }
}
