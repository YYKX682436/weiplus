package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class n4 implements gi.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final uq3.g f149151a;

    public n4(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4 r4Var) {
        this.f149151a = r4Var.aj("Compositors", new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.m4(this));
    }

    public final boolean a(rh.c1 monitors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(monitors, "monitors");
        if (kz5.c0.i("canary", "module", "dataSampling", "alertThermal", "alertBatt").contains(monitors.f476870s)) {
            return true;
        }
        return (monitors instanceof gi.w0) && kz5.c0.i("ExplicitBg", "ExplicitBgPoll", "ExcessiveCpu", "CpuAlert", "CpuAlertDeepBg", "UserAbsent").contains(((gi.w0) monitors).z());
    }
}
