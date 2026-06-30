package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.h3 f89750d = new com.tencent.mm.plugin.appbrand.ui.h3();

    public h3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.f220100d = com.tencent.mm.plugin.appbrand.ui.e4.g() ? com.tencent.mm.sdk.platformtools.o4.M("AppBrandDebugUI").getBoolean("ENABLE_EMBED_HALF_SCREEN_EXPAND", false) : false;
        it.i(8);
        return jz5.f0.f302826a;
    }
}
