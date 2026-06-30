package rl3;

/* loaded from: classes14.dex */
public class e implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f478771a;

    public e(rl3.h hVar) {
        this.f478771a = hVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        rl3.h hVar = this.f478771a;
        if (hVar.f478776e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "onPrepared");
            try {
                hVar.f478776e.start();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "start", new java.lang.Object[0]);
            }
            hVar.f478777f = false;
            if (hVar.f232196a != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.f(hVar));
            }
            rl3.g gVar = hVar.f478775d;
            if (gVar != null) {
                gVar.f478773d = true;
            }
            rl3.g gVar2 = new rl3.g(hVar, null);
            hVar.f478775d = gVar2;
            gVar2.f478773d = false;
            s75.d.b(gVar2, "music_play_progress_runnable");
        }
    }
}
