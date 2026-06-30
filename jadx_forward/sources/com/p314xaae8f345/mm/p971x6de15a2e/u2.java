package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes7.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f153682a;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f153683b;

    static {
        new com.p314xaae8f345.mm.p971x6de15a2e.s2(null);
        f153682a = new java.util.concurrent.atomic.AtomicInteger(0);
        f153683b = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.p971x6de15a2e.r2.f153665d);
    }

    public final void a(java.lang.String reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        ((c01.b2) ((hm0.r) i95.n0.c(hm0.r.class))).getClass();
        java.lang.String str = c01.e2.a0() ? "https://www.wechat.com/netcheck" : "https://weixin.qq.com/netcheck";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMNetCheck", "reason:" + reason + ", url:" + str + ", timeout:10");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f153682a;
        if (atomicInteger.get() < 5) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p971x6de15a2e.t2(str, 10, reason));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMNetCheck", "too many http check is running, count:" + atomicInteger.get());
    }
}
