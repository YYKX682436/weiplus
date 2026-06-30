package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.f2 f89697d = new com.tencent.mm.plugin.appbrand.ui.f2();

    public f2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = !it.h();
        com.tencent.mm.plugin.appbrand.task.preload.w wVar = com.tencent.mm.plugin.appbrand.task.preload.x.f89149a;
        com.tencent.mm.sdk.platformtools.o4.M("__appbrand__preload__interval__limiter__").putBoolean("__key_test_disable__", z17);
        return jz5.f0.f302826a;
    }
}
