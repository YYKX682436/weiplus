package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.b2 f89565d = new com.tencent.mm.plugin.appbrand.ui.b2();

    public b2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean h17 = it.h();
        java.lang.Boolean bool = com.tencent.mm.plugin.appbrand.ui.t7.f90228a;
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.putBoolean("enable_multi_system_recent_tasks", h17);
        }
        it.j(it.h());
        return jz5.f0.f302826a;
    }
}
