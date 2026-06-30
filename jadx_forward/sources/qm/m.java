package qm;

/* loaded from: classes13.dex */
public class m implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f446173a;

    public m(qm.o oVar) {
        this.f446173a = oVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.o oVar = this.f446173a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "play sound error, player: %s", oVar.f446178b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f446178b;
        if (mediaPlayer2 == null) {
            return false;
        }
        mediaPlayer2.release();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "play sound real error, player: %s,playerIsInit:%s", oVar.f446178b, java.lang.Boolean.valueOf(oVar.f446177a));
        return false;
    }
}
