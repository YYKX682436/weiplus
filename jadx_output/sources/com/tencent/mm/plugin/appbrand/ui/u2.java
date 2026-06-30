package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.u2 f90249d = new com.tencent.mm.plugin.appbrand.ui.u2();

    public u2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        k91.d1.f305561a.putBoolean("ENABLE_ALL_APP_DEBUG", it.h());
        return jz5.f0.f302826a;
    }
}
