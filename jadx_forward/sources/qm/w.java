package qm;

/* loaded from: classes13.dex */
public class w implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f446194a;

    public w(qm.x xVar) {
        this.f446194a = xVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        qm.x xVar = this.f446194a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound error, player: %s", xVar.f446196g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f446196g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound real error, player: %s,playerIsInit:%s", xVar.f446196g, java.lang.Boolean.valueOf(xVar.f446195f));
        }
        xVar.f446195f = false;
        return false;
    }
}
