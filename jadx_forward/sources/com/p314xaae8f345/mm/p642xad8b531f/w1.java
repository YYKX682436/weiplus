package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes7.dex */
public final class w1 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f145120d;

    public w1(long j17) {
        this.f145120d = j17;
    }

    @Override // hm0.t
    public void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f145120d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.NotifyReceiver", "onStartupDone startup= " + gm0.j1.i().f354741a.f354832d + ", take " + currentTimeMillis + " ms, tid " + android.os.Process.myTid() + ", post notify task");
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(11098, 3600, java.lang.Long.valueOf(currentTimeMillis));
        fVar.mo68477x336bdfd8(99L, 214L, 1L, false);
        ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p642xad8b531f.v1.f145118d);
    }
}
