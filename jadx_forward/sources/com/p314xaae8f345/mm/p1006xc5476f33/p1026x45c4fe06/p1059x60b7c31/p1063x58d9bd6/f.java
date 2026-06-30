package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f160717a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (f160717a.compareAndSet(false, true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m3 m3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.m3();
            m3Var.p(lVar);
            m3Var.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioInterruptionEventDispatcher", "dispatchInterruptionBegin");
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        if (f160717a.compareAndSet(true, false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.n3();
            n3Var.p(lVar);
            n3Var.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioInterruptionEventDispatcher", "dispatchInterruptionEnd");
        }
    }
}
