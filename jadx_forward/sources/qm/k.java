package qm;

/* loaded from: classes13.dex */
public class k implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f446171a;

    public k(qm.o oVar) {
        this.f446171a = oVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.o oVar = this.f446171a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound error, player: %s", oVar.f446178b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f446178b;
        if (mediaPlayer2 == null) {
            return false;
        }
        mediaPlayer2.release();
        return false;
    }
}
