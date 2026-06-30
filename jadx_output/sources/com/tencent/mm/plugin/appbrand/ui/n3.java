package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.n3 f89879d = new com.tencent.mm.plugin.appbrand.ui.n3();

    public n3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean h17 = it.h();
        jz5.g gVar = com.tencent.mm.plugin.appbrand.ui.e4.f89679a;
        com.tencent.mm.sdk.platformtools.o4.M("AppBrandDebugUI").putBoolean("ENABLE_COMM_LIB_DOWNLOAD_PKG_WEAKNET_MOCK", h17);
        it.j(it.h());
        return jz5.f0.f302826a;
    }
}
