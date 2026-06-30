package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f85307d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f85308e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85309f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.a1 f85310g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.b1 f85311h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f85312i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.p f85313m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, java.lang.String instanceId, boolean z17, com.tencent.mm.plugin.appbrand.launching.a1 a1Var) {
        this(launchParcel, instanceId, z17, a1Var, null, 16, null);
        kotlin.jvm.internal.o.g(launchParcel, "launchParcel");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
    }

    public static final java.lang.Object a(com.tencent.mm.plugin.appbrand.launching.w0 w0Var, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.launching.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        w0Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mm.plugin.appbrand.launching.x0 x0Var = new com.tencent.mm.plugin.appbrand.launching.x0(launchParcel, w0Var.f85308e, w0Var.f85309f, new com.tencent.mm.plugin.appbrand.launching.v0(rVar, a1Var), w0Var.f85311h);
        x0Var.A = w0Var.f85313m;
        launchParcel.P = x0Var.A;
        x0Var.run();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f85312i) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.launching.u0(this, null), 2, null);
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.launching.t0(this, null), 2, null);
        }
    }

    public w0(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, java.lang.String instanceId, boolean z17, com.tencent.mm.plugin.appbrand.launching.a1 a1Var, com.tencent.mm.plugin.appbrand.launching.b1 b1Var) {
        kotlin.jvm.internal.o.g(launchParcel, "launchParcel");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        this.f85307d = launchParcel;
        this.f85308e = instanceId;
        this.f85309f = z17;
        this.f85310g = a1Var;
        this.f85311h = b1Var;
        boolean z18 = false;
        if (!z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_launch_migrate_during_get_contact, com.tencent.mm.sdk.platformtools.z.f193112h <= 671096831 ? 1 : 0) == 1) {
                z18 = true;
            }
        }
        this.f85312i = z18;
        this.f85313m = com.tencent.luggage.sdk.launching.p.LEGACY;
    }

    public /* synthetic */ w0(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, java.lang.String str, boolean z17, com.tencent.mm.plugin.appbrand.launching.a1 a1Var, com.tencent.mm.plugin.appbrand.launching.b1 b1Var, int i17, kotlin.jvm.internal.i iVar) {
        this(launchParcel, str, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? null : a1Var, (i17 & 16) != 0 ? null : b1Var);
    }
}
