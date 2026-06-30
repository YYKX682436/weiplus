package dr0;

/* loaded from: classes12.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.f3 f323956d = new dr0.f3();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String f17 = ri.i.f();
        java.lang.String key = "acc-proc-life-stats-" + f17;
        dr0.t tVar = dr0.t0.f324072j;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c accPowerStats = dr0.t0.f324073k.i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accPowerStats, "accPowerStats");
        if (mh.k.f407804a.b(key, accPowerStats, "acc-proc-life-stats.bin")) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.proc.ProcLifeTasks", "mmkv encode failed: " + f17);
    }
}
