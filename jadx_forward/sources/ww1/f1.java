package ww1;

/* loaded from: classes13.dex */
public class f1 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f531715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer.OnErrorListener f531716b;

    public f1(android.media.MediaPlayer mediaPlayer, android.media.MediaPlayer.OnErrorListener onErrorListener) {
        this.f531715a = mediaPlayer;
        this.f531716b = onErrorListener;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "onError, what: %d, extra: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
            }
        }
        android.media.MediaPlayer mediaPlayer2 = this.f531715a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        android.media.MediaPlayer.OnErrorListener onErrorListener = this.f531716b;
        if (onErrorListener == null) {
            return false;
        }
        onErrorListener.onError(mediaPlayer, i17, i18);
        return false;
    }
}
