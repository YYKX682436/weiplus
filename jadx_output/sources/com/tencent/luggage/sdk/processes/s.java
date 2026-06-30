package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47685b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.luggage.sdk.processes.t f47686c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f47687d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f47688e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47689f;

    /* renamed from: g, reason: collision with root package name */
    public final long f47690g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f47691h;

    public s(java.lang.String appId, int i17, com.tencent.luggage.sdk.processes.t status, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig initConfig, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        this.f47684a = appId;
        this.f47685b = i17;
        this.f47686c = status;
        this.f47687d = initConfig;
        this.f47688e = z17;
        this.f47689f = status == com.tencent.luggage.sdk.processes.t.f47693e || status == com.tencent.luggage.sdk.processes.t.f47694f;
        this.f47690g = java.lang.System.currentTimeMillis();
        this.f47691h = "";
    }

    public java.lang.String toString() {
        return "LuggageMiniProgramRecord(appId='" + this.f47684a + "', debugType=" + this.f47685b + ", instanceId=" + this.f47691h + ", status=" + this.f47686c + ", isPersistent=" + this.f47688e + ", preRendered=" + this.f47689f + ", startingTimestamp=" + this.f47690g + ')';
    }
}
