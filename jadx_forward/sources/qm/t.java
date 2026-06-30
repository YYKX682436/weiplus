package qm;

/* loaded from: classes13.dex */
public class t implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f446191a;

    public t(qm.x xVar) {
        this.f446191a = xVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.x xVar = this.f446191a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound finish, player: %s", xVar.f446196g);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = xVar.f446196g;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        xVar.f446195f = false;
    }
}
