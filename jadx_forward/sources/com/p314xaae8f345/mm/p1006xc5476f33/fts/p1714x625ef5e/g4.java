package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes9.dex */
public final class g4 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f219083b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f219084c;

    /* renamed from: a, reason: collision with root package name */
    public r45.ko0 f219085a = new r45.ko0();

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e4(null);
        f219083b = "MMKV_KEY_FTS_VOICE_TRANS_TASK" + gm0.j1.b().j();
        f219084c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d4.f219034d);
    }

    public final synchronized void a(long j17) {
        java.util.LinkedList waitingList = this.f219085a.f460408d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(waitingList, "waitingList");
        if (kz5.h0.B(waitingList, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f4(j17))) {
            synchronized (this) {
                java.lang.Object mo141623x754a37bb = ((jz5.n) f219084c).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).H(f219083b, this.f219085a.mo14344x5f01b1f6());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.VoiceTransTaskMgr", "remove: msgId %d, list size: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f219085a.f460408d.size()));
            }
        }
    }
}
