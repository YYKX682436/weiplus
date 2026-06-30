package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.z2 f90361d = new com.tencent.mm.plugin.appbrand.ui.z2();

    public z2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean h17 = it.h();
        jz5.g gVar = com.tencent.mm.plugin.appbrand.ui.e4.f89679a;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("libiao", 4);
        kotlin.jvm.internal.o.f(sharedPreferences, "getSharedPreferences(...)");
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("enable_fake_native_profile_skyline", h17);
        edit.commit();
        return jz5.f0.f302826a;
    }
}
