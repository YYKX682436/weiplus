package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes3.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.o1 f145069d = new com.p314xaae8f345.mm.p642xad8b531f.o1();

    public o1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean valueOf;
        try {
            if (z65.c.a()) {
                valueOf = java.lang.Boolean.FALSE;
            } else if (gm0.j1.a()) {
                valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidOldNotifyReceiver"), 0) > kk.m.b(gm0.j1.b().h(), 100));
            } else {
                valueOf = java.lang.Boolean.FALSE;
            }
            return valueOf;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.NotifyReceiver", "getLegacyMode err: " + e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
