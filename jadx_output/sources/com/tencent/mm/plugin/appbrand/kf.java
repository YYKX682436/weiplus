package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class kf {
    public static boolean a(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        return o6Var.u0().K1 == 1;
    }

    public static void b(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jf jfVar = new com.tencent.mm.plugin.appbrand.jf();
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("currentPath", str);
        jfVar.t(hashMap);
        jfVar.u(o6Var.C0());
        jfVar.m();
    }
}
