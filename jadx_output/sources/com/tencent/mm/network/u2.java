package com.tencent.mm.network;

/* loaded from: classes7.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f72149a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f72150b;

    static {
        new com.tencent.mm.network.s2(null);
        f72149a = new java.util.concurrent.atomic.AtomicInteger(0);
        f72150b = jz5.h.a(jz5.i.f302829d, com.tencent.mm.network.r2.f72132d);
    }

    public final void a(java.lang.String reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        ((c01.b2) ((hm0.r) i95.n0.c(hm0.r.class))).getClass();
        java.lang.String str = c01.e2.a0() ? "https://www.wechat.com/netcheck" : "https://weixin.qq.com/netcheck";
        com.tencent.mars.xlog.Log.i("MMNetCheck", "reason:" + reason + ", url:" + str + ", timeout:10");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f72149a;
        if (atomicInteger.get() < 5) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.network.t2(str, 10, reason));
            return;
        }
        com.tencent.mars.xlog.Log.w("MMNetCheck", "too many http check is running, count:" + atomicInteger.get());
    }
}
