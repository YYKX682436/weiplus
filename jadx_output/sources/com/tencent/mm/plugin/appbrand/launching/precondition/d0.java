package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class d0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final int f84948d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f84949e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84950f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f84951g;

    /* renamed from: h, reason: collision with root package name */
    public final l81.v0 f84952h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84953i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.p f84954m;

    public d0(int i17, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel parcel, java.lang.String instanceId, yz5.p pVar, l81.v0 v0Var, boolean z17, com.tencent.luggage.sdk.launching.p wxaColdStartMode) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(wxaColdStartMode, "wxaColdStartMode");
        this.f84948d = i17;
        this.f84949e = parcel;
        this.f84950f = instanceId;
        this.f84951g = pVar;
        this.f84952h = v0Var;
        this.f84953i = z17;
        this.f84954m = wxaColdStartMode;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppBrandPreRenderColdStartService.Loader-" + this.f84948d;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run()-start, id:");
        sb6.append(this.f84948d);
        sb6.append(", username:");
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f84949e;
        sb6.append(launchParcel.f84901d);
        sb6.append(", appId:");
        sb6.append(launchParcel.f84902e);
        sb6.append(", versionType:");
        sb6.append(launchParcel.f84904g);
        sb6.append(", instanceId:");
        sb6.append(this.f84950f);
        sb6.append(", path:");
        sb6.append(launchParcel.f84906i);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService.Loader", sb6.toString());
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.appbrand.launching.precondition.c0(this, null), 2, null);
    }
}
