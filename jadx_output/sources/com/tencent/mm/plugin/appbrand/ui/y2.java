package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.y2 f90344d = new com.tencent.mm.plugin.appbrand.ui.y2();

    public y2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = false;
        if (com.tencent.mm.plugin.appbrand.ui.e4.g()) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("libiao", 4);
            kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
            z17 = sharedPreferences.getBoolean("enable_fake_native_profile_skyline", false);
        }
        it.f220100d = z17;
        return jz5.f0.f302826a;
    }
}
