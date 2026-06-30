package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes5.dex */
public final class q6 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.appcache.r6 o17 = (com.tencent.mm.plugin.appbrand.appcache.r6) obj;
        com.tencent.mm.plugin.appbrand.appcache.r6 o27 = (com.tencent.mm.plugin.appbrand.appcache.r6) obj2;
        kotlin.jvm.internal.o.g(o17, "o1");
        kotlin.jvm.internal.o.g(o27, "o2");
        for (int i17 = 0; i17 < 3; i17++) {
            int i18 = o17.f75947b[i17];
            int i19 = o27.f75947b[i17];
            if (i18 != i19) {
                return i18 - i19;
            }
        }
        return 0;
    }
}
