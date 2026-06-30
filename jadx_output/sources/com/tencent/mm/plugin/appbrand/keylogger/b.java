package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class b implements java.util.Comparator {
    public b(com.tencent.mm.plugin.appbrand.keylogger.d dVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((com.tencent.mm.plugin.appbrand.keylogger.c) obj).f84140a.f84132d;
        long j18 = ((com.tencent.mm.plugin.appbrand.keylogger.c) obj2).f84140a.f84132d;
        if (j17 > j18) {
            return 1;
        }
        return j17 < j18 ? -1 : 0;
    }
}
