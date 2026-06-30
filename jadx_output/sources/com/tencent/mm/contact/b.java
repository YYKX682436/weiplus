package com.tencent.mm.contact;

/* loaded from: classes9.dex */
public abstract class b {
    public static java.util.ArrayList a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = str.split(",");
        if (split != null) {
            for (java.lang.String str2 : split) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static java.lang.String b(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() < 1) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((java.lang.String) it.next());
            stringBuffer.append(",");
        }
        return stringBuffer.toString();
    }
}
