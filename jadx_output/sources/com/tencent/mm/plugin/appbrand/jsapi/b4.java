package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f79826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79827b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f79828c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.networking.c0 f79829d;

    /* renamed from: e, reason: collision with root package name */
    public final long f79830e;

    public b4(java.lang.String hostWxaAppId, int i17, java.util.List appIds, com.tencent.mm.plugin.appbrand.networking.c0 cgiService) {
        kotlin.jvm.internal.o.g(hostWxaAppId, "hostWxaAppId");
        kotlin.jvm.internal.o.g(appIds, "appIds");
        kotlin.jvm.internal.o.g(cgiService, "cgiService");
        this.f79826a = hostWxaAppId;
        this.f79827b = i17;
        this.f79828c = appIds;
        this.f79829d = cgiService;
        this.f79830e = java.util.concurrent.TimeUnit.MINUTES.toSeconds(5L);
    }
}
