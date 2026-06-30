package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.w1 f90288d = new com.tencent.mm.plugin.appbrand.ui.w1();

    public w1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        k91.d1.f305561a.putBoolean("SAVE_STACK_WHEN_LOOP_JUMP", it.h());
        return jz5.f0.f302826a;
    }
}
