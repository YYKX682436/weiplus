package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class g0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f84989d;

    public g0(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        this.f84989d = launchParcel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f84989d;
        java.lang.String str = launchParcel.f84902e;
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? k91.k4.e(launchParcel.f84901d) : str;
    }
}
