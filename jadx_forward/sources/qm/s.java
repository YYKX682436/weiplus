package qm;

/* loaded from: classes13.dex */
public class s implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioManager f446189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.x f446190b;

    public s(qm.x xVar, android.media.AudioManager audioManager) {
        this.f446190b = xVar;
        this.f446189a = audioManager;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.x xVar = this.f446190b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound error, player: %s", xVar.f446196g);
        this.f446189a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f446196g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        xVar.f446195f = false;
        return false;
    }
}
