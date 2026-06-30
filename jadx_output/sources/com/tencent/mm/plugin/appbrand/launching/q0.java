package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer f85036d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.p0 f85037e;

    /* renamed from: f, reason: collision with root package name */
    public final int f85038f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85039g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f85040h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f85041i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f85042m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f85043n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate f85044o;

    public q0(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.launching.p0 p0Var) {
        this.f85037e = p0Var;
        this.f85038f = launchParcel.f84904g;
        this.f85040h = launchParcel.f84902e;
        this.f85041i = launchParcel.f84901d;
        this.f85039g = launchParcel.f84903f;
        this.f85043n = launchParcel.f84910o;
        this.f85042m = launchParcel.f84906i;
        this.f85044o = launchParcel.f84921x;
        this.f85036d = launchParcel.f84911p;
    }
}
