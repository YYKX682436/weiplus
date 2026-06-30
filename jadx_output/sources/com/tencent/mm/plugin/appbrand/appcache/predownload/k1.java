package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.predownload.k1 f75859a = new com.tencent.mm.plugin.appbrand.appcache.predownload.k1();

    /* renamed from: b, reason: collision with root package name */
    public static final k91.h1[] f75860b = {k91.h1.WALLET_MALL_INDEX, k91.h1.CHATTING, k91.h1.QRCODE, k91.h1.QRCODE_PRE, k91.h1.MP_PRELOAD, k91.h1.WX_OPEN_SDK_PRE_FETCH};

    /* renamed from: c, reason: collision with root package name */
    public static final ik1.x f75861c = new ik1.x();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f75862d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final long f75863e = java.util.concurrent.TimeUnit.MINUTES.toMillis(5);

    public final void a(java.util.List usernameList, k91.h1 scene, yz5.a onSuccess) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        com.tencent.mm.plugin.appbrand.config.q.c(usernameList, scene, new com.tencent.mm.plugin.appbrand.appcache.predownload.g1(usernameList, onSuccess)).a(com.tencent.mm.plugin.appbrand.appcache.predownload.i1.f75852a);
    }
}
