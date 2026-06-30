package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes7.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.debugger.console.m0 f77688d = new com.tencent.mm.plugin.appbrand.debugger.console.m0();

    public m0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String a17 = bm5.f1.a();
        kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        kotlin.jvm.internal.o.f(str, "getApplicationId(...)");
        java.lang.String m07 = r26.n0.m0(a17, str, a17);
        return m07.length() == 0 ? com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM : m07;
    }
}
