package qm;

/* loaded from: classes13.dex */
public class j implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f446170a;

    public j(qm.o oVar) {
        this.f446170a = oVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        qm.o oVar = this.f446170a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "WiredHeadset play sound finish, player: %s", oVar.f446178b);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = oVar.f446178b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
    }
}
