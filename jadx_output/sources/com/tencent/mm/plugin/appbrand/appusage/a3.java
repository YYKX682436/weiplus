package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public enum a3 {
    ;

    public static void a(int i17, android.os.Bundle bundle, java.util.LinkedList linkedList, k91.e5 e5Var) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.pc7 pc7Var = (r45.pc7) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(pc7Var.f382944d)) {
                hashSet.add(pc7Var.f382944d);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet.size());
        arrayList.addAll(hashSet);
        com.tencent.mm.plugin.appbrand.config.q.c(arrayList, i17 == 3 ? k91.h1.RECENTS_LIST : k91.h1.DEFAULT, e5Var);
    }

    public static com.tencent.mm.plugin.appbrand.appusage.a3 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appusage.a3.class, str));
        return null;
    }
}
