package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class n4 implements gi.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final uq3.g f67618a;

    public n4(com.tencent.mm.feature.performance.r4 r4Var) {
        this.f67618a = r4Var.aj("Compositors", new com.tencent.mm.feature.performance.m4(this));
    }

    public final boolean a(rh.c1 monitors) {
        kotlin.jvm.internal.o.g(monitors, "monitors");
        if (kz5.c0.i("canary", "module", "dataSampling", "alertThermal", "alertBatt").contains(monitors.f395337s)) {
            return true;
        }
        return (monitors instanceof gi.w0) && kz5.c0.i("ExplicitBg", "ExplicitBgPoll", "ExcessiveCpu", "CpuAlert", "CpuAlertDeepBg", "UserAbsent").contains(((gi.w0) monitors).z());
    }
}
