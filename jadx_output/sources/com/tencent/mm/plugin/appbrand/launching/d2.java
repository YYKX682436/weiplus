package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.s1 f84564a = new com.tencent.mm.plugin.appbrand.launching.y1();

    public static final com.tencent.mm.plugin.appbrand.launching.t1 a(com.tencent.mm.plugin.appbrand.o6 runtime, yz5.l function) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(function, "function");
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = runtime.S2(false);
        if (S2 != null) {
            function.invoke(S2);
            return null;
        }
        com.tencent.mm.plugin.appbrand.launching.s1 s1Var = f84564a;
        com.tencent.mm.plugin.appbrand.launching.c2 c2Var = new com.tencent.mm.plugin.appbrand.launching.c2(runtime);
        com.tencent.mm.plugin.appbrand.launching.y1 y1Var = (com.tencent.mm.plugin.appbrand.launching.y1) s1Var;
        y1Var.getClass();
        y1Var.f85424a.computeIfAbsent(runtime, new com.tencent.mm.plugin.appbrand.launching.x1(c2Var));
        y1Var.getClass();
        java.lang.Object obj = y1Var.f85424a.get(runtime);
        kotlin.jvm.internal.o.d(obj);
        com.tencent.mm.plugin.appbrand.launching.w1 w1Var = (com.tencent.mm.plugin.appbrand.launching.w1) obj;
        w1Var.b(function);
        return w1Var;
    }
}
