package dl3;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f316882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.a0 f316883e;

    public x(dl3.a0 a0Var, int i17) {
        this.f316883e = a0Var;
        this.f316882d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onSeekComplete, seekPosition:%d", java.lang.Integer.valueOf(this.f316882d));
        dl3.a0 a0Var = this.f316883e;
        int i17 = a0Var.f316806e.f316825o;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "seek complete to startTime :%d", java.lang.Integer.valueOf(i17));
            a0Var.f316806e.f316825o = 0;
            return;
        }
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "_onSeekComplete");
        dl3.d0 d0Var = a0Var.f316806e;
        d0Var.o();
        if (d0Var.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "seek end, send play event!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onResumeEvent");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
            am.g0 g0Var = c5175x3ee93aa3.f135523g;
            g0Var.f88249a = 1;
            g0Var.f88252d = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27;
            g0Var.f88251c = d0Var.f316813c;
            g0Var.f88253e = d0Var.k();
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            dl3.f fVar = d0Var.f316881b;
            if (fVar != null) {
                ((dl3.l) fVar).a(d0Var.f316813c);
            }
        }
    }
}
