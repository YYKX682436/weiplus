package rl3;

/* loaded from: classes14.dex */
public class d implements android.media.MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f478770a;

    public d(rl3.h hVar) {
        this.f478770a = hVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        rl3.h hVar = this.f478770a;
        android.media.MediaPlayer mediaPlayer2 = hVar.f478776e;
        if (mediaPlayer2 == null || !mediaPlayer2.isPlaying()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMediaPlayer", "onSeekComplete");
        try {
            hVar.f478776e.start();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMediaPlayer", e17, "start", new java.lang.Object[0]);
        }
    }
}
