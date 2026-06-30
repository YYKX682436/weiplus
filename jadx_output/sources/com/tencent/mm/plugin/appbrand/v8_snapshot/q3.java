package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class q3 extends dm.zc {
    public static final java.lang.String[] Q;
    public static final l75.e0 R = dm.zc.initAutoDBInfo(com.tencent.mm.plugin.appbrand.v8_snapshot.q3.class);

    static {
        java.lang.String[] strArr = {"arch", "wxaPkgPath", "snapshotCategory"};
        Q = strArr;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PRIMARY KEY ( ");
        int i17 = 0;
        int i18 = 0;
        while (i17 < 3) {
            java.lang.String str = strArr[i17];
            int i19 = i18 + 1;
            if (i18 != 0) {
                sb6.append(", ");
            }
            sb6.append(str);
            i17++;
            i18 = i19;
        }
        sb6.append(" )");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        R.f316956e += ", " + sb7;
    }
}
