package com.tencent.mm.booter;

/* loaded from: classes7.dex */
public final class w1 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f63587d;

    public w1(long j17) {
        this.f63587d = j17;
    }

    @Override // hm0.t
    public void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f63587d;
        com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", "onStartupDone startup= " + gm0.j1.i().f273208a.f273299d + ", take " + currentTimeMillis + " ms, tid " + android.os.Process.myTid() + ", post notify task");
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(11098, 3600, java.lang.Long.valueOf(currentTimeMillis));
        fVar.idkeyStat(99L, 214L, 1L, false);
        ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.booter.v1.f63585d);
    }
}
