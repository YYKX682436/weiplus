package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.utils.q3 f90534a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f90535b;

    static {
        com.tencent.mm.plugin.appbrand.utils.q3 q3Var = new com.tencent.mm.plugin.appbrand.utils.q3();
        f90534a = q3Var;
        f90535b = jz5.h.b(com.tencent.mm.plugin.appbrand.utils.p3.f90528d);
        sj1.l.f408374d = new com.tencent.mm.plugin.appbrand.utils.n3();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i17 = sj1.l.f408371a;
        int a17 = q3Var.a();
        sj1.l.f408371a = a17;
        if (a17 != -1) {
            sj1.l.f408372b = true;
        }
        java.lang.String c17 = com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.c(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageTraceBooter", "udr path:" + c17);
        if (com.tencent.mm.vfs.w6.j(c17)) {
            pb.h.f353116a = new com.tencent.mm.plugin.appbrand.utils.o3(c17);
            int i18 = sj1.l.f408371a;
            if (i18 == 1) {
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    sj1.l.f408371a = -1;
                } else {
                    sj1.l.f408371a = 1;
                    sj1.l.f408372b = true;
                }
                sj1.l.d("", false);
            } else if (i18 == 3) {
                sj1.l.d("", false);
            }
        } else {
            sj1.l.f408371a = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageTraceBooter", "init enableSystrace:false profileMode:" + q3Var.a() + " mode:" + sj1.l.f408371a);
    }

    public final int a() {
        return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f90535b).getValue()).getInt("MicroMsg.LuggageTraceBooter", -1);
    }
}
