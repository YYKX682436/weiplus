package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.v7 f294751d = new com.p314xaae8f345.mm.vfs.v7();

    public v7() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb it = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.vfs.AbstractC22734x1e3d8cad[] abstractC22734x1e3d8cadArr = com.p314xaae8f345.mm.vfs.y7.f294790a;
        long j17 = 7 * 86400000;
        com.p314xaae8f345.mm.vfs.C22747x9dc2c96a c22747x9dc2c96a = new com.p314xaae8f345.mm.vfs.C22747x9dc2c96a(new com.p314xaae8f345.mm.vfs.C22761xdd3c6343(it, 256 * 1048576, 1048576 * 512, j17, true, "${target},${threshold},${expire}"), j17, "${expire}");
        c22747x9dc2c96a.a("${name}", com.p314xaae8f345.mm.vfs.q1.f294667a);
        return c22747x9dc2c96a;
    }
}
