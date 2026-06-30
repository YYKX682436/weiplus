package qm;

/* loaded from: classes13.dex */
public class v implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f446193a;

    public v(qm.x xVar) {
        this.f446193a = xVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.x xVar = this.f446193a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound finish, player: %s", xVar.f446196g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f446196g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound real finish, player: %s,playerIsInit:%s", xVar.f446196g, java.lang.Boolean.valueOf(xVar.f446195f));
        }
        xVar.f446195f = false;
    }
}
