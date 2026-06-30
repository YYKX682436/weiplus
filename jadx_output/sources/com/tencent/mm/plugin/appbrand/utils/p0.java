package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.p0 f90527a = new com.tencent.mm.plugin.appbrand.utils.p0();

    public static final com.tencent.mm.plugin.appbrand.utils.r2 a(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        com.tencent.mm.plugin.appbrand.utils.r2 r2Var;
        kotlin.jvm.internal.o.g(component, "component");
        synchronized (f90527a) {
            r2Var = (com.tencent.mm.plugin.appbrand.utils.r2) component.k(com.tencent.mm.plugin.appbrand.utils.r2.class);
            if (r2Var == null) {
                r2Var = new com.tencent.mm.plugin.appbrand.utils.c5();
                component.l(r2Var);
            }
        }
        return r2Var;
    }
}
