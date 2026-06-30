package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public final class l4 extends i95.w implements com.tencent.mm.feature.emoji.api.r6 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f66375d = jz5.h.b(new com.tencent.mm.feature.emoji.k4(this));

    public final java.util.LinkedList Ai() {
        return (java.util.LinkedList) ((jz5.n) this.f66375d).getValue();
    }

    public final void Bi(java.util.List list) {
        z85.x e17 = com.tencent.mm.storage.n5.f().e();
        byte[] bytes = kz5.n0.g0(list, "_", null, null, 0, null, null, 62, null).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        e17.getClass();
        e17.replace(new z85.w("cache_type_send_list", bytes));
    }

    public java.lang.String wi(java.lang.String md52) {
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(md52);
        if (u17 == null) {
            return null;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        zq.h.f474972a.e(u17, new com.tencent.mm.feature.emoji.j4(countDownLatch));
        countDownLatch.await();
        java.lang.String str = u17.N0() + "_gif";
        if (com.tencent.mm.vfs.w6.k(str) > 0) {
            return str;
        }
        com.tencent.mm.vfs.w6.R(str, ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).wi(u17));
        return str;
    }
}
