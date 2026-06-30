package qm;

/* loaded from: classes13.dex */
public class i implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioManager f446168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.o f446169b;

    public i(qm.o oVar, android.media.AudioManager audioManager) {
        this.f446169b = oVar;
        this.f446168a = audioManager;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.o oVar = this.f446169b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", oVar.f446178b);
        this.f446168a.setMode(0);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f446178b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        return false;
    }
}
