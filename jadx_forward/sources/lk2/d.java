package lk2;

/* loaded from: classes3.dex */
public abstract class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final dk2.xg f400545d = new dk2.xg("activeMicHeartBeat", null, this, 2, null);

    public final void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LoopTask", "startTaskLoop delay: " + j17 + " task: activeMicHeartBeat");
        this.f400545d.c(java.lang.Long.valueOf(j17));
    }

    @Override // java.lang.Runnable
    public void run() {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            lk2.c.f400543e.a(eVar, lk2.c.f400544f ? 1 : 0, (lk2.c) this);
            lk2.c.f400544f = false;
        }
    }
}
