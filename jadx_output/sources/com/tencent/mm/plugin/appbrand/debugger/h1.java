package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.debugger.h1 f77762b;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.g1 f77763a;

    public static com.tencent.mm.plugin.appbrand.debugger.h1 a() {
        if (f77762b == null) {
            synchronized (com.tencent.mm.plugin.appbrand.debugger.h1.class) {
                if (f77762b == null) {
                    f77762b = new com.tencent.mm.plugin.appbrand.debugger.h1();
                }
            }
        }
        return f77762b;
    }

    public com.tencent.mm.plugin.appbrand.debugger.g1 b(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var;
        if (yVar == null || yVar.t3() == null) {
            return null;
        }
        if (yVar.t3().A) {
            com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f77763a;
            if (g1Var != null && (a1Var = g1Var.f77750d) != null) {
                a1Var.b(yVar, yVar.t3().u0().F);
                this.f77763a.f77750d.f77622x = yVar.t3().u0().H;
                com.tencent.mm.plugin.appbrand.debugger.g1 g1Var2 = this.f77763a;
                g1Var2.S(g1Var2.f77750d, true, true);
                yVar.t3().A = false;
                return this.f77763a;
            }
            yVar.t3().A = false;
        }
        this.f77763a = new com.tencent.mm.plugin.appbrand.debugger.g1();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = new com.tencent.mm.plugin.appbrand.debugger.a1();
        a1Var2.b(yVar, yVar.t3().u0().F);
        a1Var2.f77622x = yVar.t3().u0().H;
        this.f77763a.S(a1Var2, false, true);
        return this.f77763a;
    }
}
