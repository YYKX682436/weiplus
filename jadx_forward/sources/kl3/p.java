package kl3;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl3.q f390371d;

    public p(kl3.q qVar) {
        this.f390371d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kl3.q qVar = this.f390371d;
        boolean g17 = qVar.a().g();
        boolean i17 = qVar.a().i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayRunnable, isStartPlayMusic:%b, isPlayingMusic:%b", java.lang.Boolean.valueOf(g17), java.lang.Boolean.valueOf(i17));
        if (!g17 || i17) {
            return;
        }
        qVar.a().mo67222x66343656();
    }
}
