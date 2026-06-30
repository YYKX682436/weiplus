package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public abstract class g {
    public static java.util.List a(java.lang.ClassLoader classLoader) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object obj = ak0.c0.a(classLoader, "pathList").get(classLoader);
        if (obj != null) {
            java.util.List list = (java.util.List) ak0.c0.a(obj, "nativeLibraryDirectories").get(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.Delivery", "dumpV23: nativeLibraryDirectories");
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
