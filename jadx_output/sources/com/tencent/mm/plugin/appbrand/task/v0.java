package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public abstract class v0 {
    public static final int a(com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType) {
        int ordinal = luggageServiceType.ordinal();
        if (ordinal == 0) {
            return Integer.MAX_VALUE;
        }
        if (ordinal == 1) {
            return com.tencent.mm.plugin.appbrand.task.x0.h();
        }
        if (ordinal == 2) {
            return 0;
        }
        throw new jz5.j();
    }

    public static final com.tencent.mm.plugin.appbrand.task.u0 b() {
        return com.tencent.mm.plugin.appbrand.ui.t7.g() ? new com.tencent.mm.plugin.appbrand.task.y0() : com.tencent.mm.plugin.appbrand.ui.t7.h() ? new com.tencent.mm.plugin.appbrand.task.z0() : com.tencent.mm.plugin.appbrand.ui.t7.i() ? new com.tencent.mm.plugin.appbrand.task.d1() : com.tencent.mm.plugin.appbrand.jsruntime.f2.f83986a.a() ? new com.tencent.mm.plugin.appbrand.task.g1() : new com.tencent.mm.plugin.appbrand.task.p();
    }
}
