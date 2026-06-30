package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f172173a = new java.util.concurrent.ConcurrentHashMap();

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 cfg, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cfg, "cfg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) f172173a.remove(cfg.f158811d);
        if (o6Var != null) {
            new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3947x247c1c22(o6Var).s();
            if (!b(o6Var, "stashed")) {
                return null;
            }
            o6Var.O1(container);
            return o6Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(cfg.f158811d);
        if (b17 != null) {
            if ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.e(b17) || b17.Q0() || b17.N0()) && ((b17.f156329e == null || !b17.R0()) && b(b17, "preferPersistent"))) {
                b17.O1(container);
                return b17;
            }
        }
        return null;
    }

    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str) {
        boolean z17;
        java.lang.Boolean[] boolArr = {java.lang.Boolean.valueOf(o6Var.J0()), java.lang.Boolean.valueOf(!o6Var.S), java.lang.Boolean.valueOf(!o6Var.L0())};
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "pollOrCreate, existed runtime[" + o6Var.f156336n + "], reason[" + str + "] conditions[" + u46.a.c(boolArr, "{}") + ']');
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i17 = 0;
        while (true) {
            if (i17 >= 3) {
                z17 = true;
                break;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(boolArr[i17], bool)) {
                z17 = false;
                break;
            }
            i17++;
        }
        return z17;
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "stash " + runtime);
        if (!(runtime.f156329e instanceof yi1.a)) {
            runtime.O1(null);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f172173a;
        java.lang.String str = runtime.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        concurrentHashMap.put(str, runtime);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12617xdce2afee(runtime).s();
    }
}
