package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class t {
    public static final java.lang.String a(int i17) {
        ne.n nVar = ne.m.f336484a;
        if (nVar != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            return ((com.tencent.mm.plugin.appbrand.report.l2) nVar).b(java.lang.System.currentTimeMillis());
        }
        java.lang.String a17 = kk.v.a(i17);
        kotlin.jvm.internal.o.f(a17, "getString(...)");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return kz5.n0.g0(kz5.c0.i(a17, java.lang.String.valueOf(java.lang.System.currentTimeMillis())), "_", null, null, 0, null, null, 62, null);
    }

    public static final boolean b(java.lang.String str) {
        return !(str == null || str.length() == 0);
    }
}
