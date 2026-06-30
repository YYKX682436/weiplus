package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f78401a;

    public static void a() {
        if (!com.tencent.mm.sdk.platformtools.u3.e()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.ipc.f$$a());
        } else {
            if (!f78401a) {
                com.tencent.mm.ipcinvoker.d0.b(com.tencent.mm.sdk.platformtools.x2.f193072b, com.tencent.mm.plugin.appbrand.ipc.g.INSTANCE);
                f78401a = true;
            }
            com.tencent.mm.ipcinvoker.i0.a(com.tencent.mm.sdk.platformtools.x2.f193072b);
        }
    }
}
