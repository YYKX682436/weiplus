package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.e3 f89678d = new com.tencent.mm.plugin.appbrand.ui.e3();

    public e3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.service.b0 b0Var = com.tencent.mm.plugin.appbrand.service.b0.f88627a;
        b0Var.d(it.h());
        it.j(it.h());
        if (b0Var.b()) {
            com.tencent.mm.plugin.appbrand.utils.q3 q3Var = com.tencent.mm.plugin.appbrand.utils.q3.f90534a;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) com.tencent.mm.plugin.appbrand.utils.q3.f90535b).getValue()).putInt("MicroMsg.LuggageTraceBooter", -1);
        }
        return jz5.f0.f302826a;
    }
}
