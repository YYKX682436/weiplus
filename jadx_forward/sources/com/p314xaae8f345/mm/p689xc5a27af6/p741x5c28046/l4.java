package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes12.dex */
public final class l4 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r6 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f147908d = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.k4(this));

    public final java.util.LinkedList Ai() {
        return (java.util.LinkedList) ((jz5.n) this.f147908d).mo141623x754a37bb();
    }

    public final void Bi(java.util.List list) {
        z85.x e17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e();
        byte[] bytes = kz5.n0.g0(list, "_", null, null, 0, null, null, 62, null).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        e17.getClass();
        e17.mo11260x413cb2b4(new z85.w("cache_type_send_list", bytes));
    }

    public java.lang.String wi(java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(md52);
        if (u17 == null) {
            return null;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        zq.h.f556505a.e(u17, new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.j4(countDownLatch));
        countDownLatch.await();
        java.lang.String str = u17.N0() + "_gif";
        if (com.p314xaae8f345.mm.vfs.w6.k(str) > 0) {
            return str;
        }
        com.p314xaae8f345.mm.vfs.w6.R(str, ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).wi(u17));
        return str;
    }
}
