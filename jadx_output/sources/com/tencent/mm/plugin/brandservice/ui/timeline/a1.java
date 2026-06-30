package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes11.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.a1 f94098d = new com.tencent.mm.plugin.brandservice.ui.timeline.a1();

    public a1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("biz_persist"), false) + "/aff_db/biz.db";
        com.tencent.mm.vfs.w6.h(str + "-wal");
        com.tencent.mm.vfs.w6.h(str + "-shm");
        byte[] N = com.tencent.mm.vfs.w6.N("/dev/urandom", 0, 4096);
        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(str, true);
        B.write(N);
        B.close();
        com.tencent.wechat.mm.biz.g0 c17 = yw.q3.f466437a.c();
        if (c17 != null) {
            c17.i();
        }
        return jz5.f0.f302826a;
    }
}
