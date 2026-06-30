package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes.dex */
public abstract class i1 {
    public static final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        if (str.length() > 1024) {
            str = str.substring(0, 1024);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        if (!r26.n0.B(str, ",", false)) {
            return str;
        }
        java.lang.String b17 = fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
        return b17 == null ? "" : b17;
    }
}
