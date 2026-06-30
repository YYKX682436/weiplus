package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes11.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a1 f175631d = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a1();

    public a1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("biz_persist"), false) + "/aff_db/biz.db";
        com.p314xaae8f345.mm.vfs.w6.h(str + "-wal");
        com.p314xaae8f345.mm.vfs.w6.h(str + "-shm");
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N("/dev/urandom", 0, 4096);
        java.io.RandomAccessFile B = com.p314xaae8f345.mm.vfs.w6.B(str, true);
        B.write(N);
        B.close();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17 = yw.q3.f547970a.c();
        if (c17 != null) {
            c17.i();
        }
        return jz5.f0.f384359a;
    }
}
