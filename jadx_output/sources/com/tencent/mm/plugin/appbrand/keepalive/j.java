package com.tencent.mm.plugin.appbrand.keepalive;

/* loaded from: classes7.dex */
public enum j {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f84095d = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    j() {
    }

    public static void a(java.lang.Runnable runnable) {
        java.lang.String a17 = bm5.f1.a();
        if (android.text.TextUtils.isEmpty(a17)) {
            return;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(a17), com.tencent.mm.plugin.appbrand.keepalive.h.class, new com.tencent.mm.plugin.appbrand.keepalive.g(runnable));
    }
}
