package com.tencent.mm.booter;

/* loaded from: classes3.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.booter.o1 f63536d = new com.tencent.mm.booter.o1();

    public o1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf;
        try {
            if (z65.c.a()) {
                valueOf = java.lang.Boolean.FALSE;
            } else if (gm0.j1.a()) {
                valueOf = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOldNotifyReceiver"), 0) > kk.m.b(gm0.j1.b().h(), 100));
            } else {
                valueOf = java.lang.Boolean.FALSE;
            }
            return valueOf;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "getLegacyMode err: " + e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
