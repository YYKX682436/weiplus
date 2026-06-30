package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes5.dex */
public final class f0 {
    public f0(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        if (!z65.c.a()) {
            com.tencent.mm.plugin.appbrand.debugger.g0.f77749f.clear();
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_weapp_all_debug_mode_appidlist, "", true);
        kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
        com.tencent.mm.plugin.appbrand.debugger.g0.f77748e = Zi;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.plugin.appbrand.debugger.g0.f77749f;
        copyOnWriteArrayList.clear();
        java.lang.String str = com.tencent.mm.plugin.appbrand.debugger.g0.f77748e;
        if (str == null) {
            kotlin.jvm.internal.o.o("exptVal");
            throw null;
        }
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
    }
}
