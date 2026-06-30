package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class r3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.r3 f89976d = new com.tencent.mm.plugin.appbrand.ui.r3();

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.plugin.appbrand.utils.q3 q3Var = com.tencent.mm.plugin.appbrand.utils.q3.f90534a;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.q3.f90535b).getValue()).putInt("MicroMsg.LuggageTraceBooter", -1);
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.appbrand.utils.q3 q3Var2 = com.tencent.mm.plugin.appbrand.utils.q3.f90534a;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.q3.f90535b).getValue()).putInt("MicroMsg.LuggageTraceBooter", 0);
            com.tencent.mm.plugin.appbrand.service.b0.f88627a.d(false);
            com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.a(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a);
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.appbrand.utils.q3 q3Var3 = com.tencent.mm.plugin.appbrand.utils.q3.f90534a;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.q3.f90535b).getValue()).putInt("MicroMsg.LuggageTraceBooter", 1);
            com.tencent.mm.plugin.appbrand.service.b0.f88627a.d(false);
            com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.a(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a);
            return;
        }
        if (i17 != 3) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.q3 q3Var4 = com.tencent.mm.plugin.appbrand.utils.q3.f90534a;
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.q3.f90535b).getValue()).putInt("MicroMsg.LuggageTraceBooter", 3);
        com.tencent.mm.plugin.appbrand.service.b0.f88627a.d(false);
        com.tencent.luggage.sdk.jsapi.component.service.h2.f47439a.a(com.tencent.luggage.sdk.jsapi.component.service.z1.f47567a);
    }
}
