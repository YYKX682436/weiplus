package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.f3 f89698d = new com.tencent.mm.plugin.appbrand.ui.f3();

    public f3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.service.b0 b0Var = com.tencent.mm.plugin.appbrand.service.b0.f88627a;
        boolean h17 = it.h();
        b0Var.getClass();
        com.tencent.mm.plugin.appbrand.service.b0.f88630d.c(b0Var, com.tencent.mm.plugin.appbrand.service.b0.f88628b[1], java.lang.Boolean.valueOf(h17));
        it.j(it.h());
        return jz5.f0.f302826a;
    }
}
