package rl3;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f478773d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.h f478774e;

    public g(rl3.h hVar, rl3.c cVar) {
        this.f478774e = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rl3.h hVar = this.f478774e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "start run play progress task");
        while (!this.f478773d) {
            try {
                android.media.MediaPlayer mediaPlayer = hVar.f478776e;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    android.media.MediaPlayer mediaPlayer2 = hVar.f478776e;
                    int currentPosition = mediaPlayer2.getCurrentPosition();
                    int duration = mediaPlayer2.getDuration();
                    if (currentPosition > 0 && duration > 0) {
                        int i17 = (currentPosition * 100) / duration;
                        if (hVar.f232196a != null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.g(hVar, i17));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "onPlayUpdate", new java.lang.Object[0]);
            }
            try {
                java.lang.Thread.sleep(200L);
            } catch (java.lang.InterruptedException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e18, "sleep", new java.lang.Object[0]);
            }
        }
    }
}
