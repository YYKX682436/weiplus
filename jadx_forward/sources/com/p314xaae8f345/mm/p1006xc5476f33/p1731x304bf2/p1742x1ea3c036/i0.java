package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f221095a = new java.util.concurrent.atomic.AtomicInteger(0);

    public static void a() {
        int decrementAndGet = f221095a.decrementAndGet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewActivityStack", "remove count = " + decrementAndGet);
        if (decrementAndGet <= 0) {
            if (h53.j.d() != null) {
                h53.j d17 = h53.j.d();
                d17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsCore", "stop");
                d17.f360591h = h53.i.stopped;
                d17.f360589f.a(new h53.f(d17, "onStop"));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new h53.d(d17), false);
                d17.f360592i = b4Var;
                b4Var.c(300000L, 300000L);
            }
            java.lang.String str = vz4.h.f523267a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsServerCommLibPkg", "load");
        }
    }
}
