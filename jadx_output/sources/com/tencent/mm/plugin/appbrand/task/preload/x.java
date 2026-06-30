package com.tencent.mm.plugin.appbrand.task.preload;

/* loaded from: classes7.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.task.preload.w f89149a = new com.tencent.mm.plugin.appbrand.task.preload.w();

    public static final boolean a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a() && com.tencent.mm.sdk.platformtools.o4.M("__appbrand__preload__interval__limiter__").getBoolean("__key_test_disable__", false);
    }
}
