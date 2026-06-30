package com.tencent.mm.plugin.appbrand.keepalive;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f84084d = new com.tencent.mm.plugin.appbrand.keepalive.a();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84086b;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f84085a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.ServiceConnection f84087c = new com.tencent.mm.plugin.appbrand.keepalive.c(this);

    public d(java.lang.String str) {
        this.f84086b = str;
        com.tencent.mm.ipcinvoker.d0.a(str, new com.tencent.mm.plugin.appbrand.keepalive.b(this, str));
    }
}
