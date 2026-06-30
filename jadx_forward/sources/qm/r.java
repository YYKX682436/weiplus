package qm;

/* loaded from: classes13.dex */
public class r implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioManager f446187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.x f446188b;

    public r(qm.x xVar, android.media.AudioManager audioManager) {
        this.f446188b = xVar;
        this.f446187a = audioManager;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.x xVar = this.f446188b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "WiredHeadset play sound finish, player: %s", xVar.f446196g);
        this.f446187a.setMode(0);
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
