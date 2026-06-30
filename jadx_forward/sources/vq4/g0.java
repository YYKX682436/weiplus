package vq4;

/* loaded from: classes14.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520831d;

    public g0(vq4.m0 m0Var) {
        this.f520831d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        vq4.m0 m0Var = this.f520831d;
        m0Var.f520873d = elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "device happened shake in time,%s", java.lang.Long.valueOf(m0Var.f520873d));
    }
}
