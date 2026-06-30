package ww1;

/* loaded from: classes13.dex */
public class i1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f531748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer.OnCompletionListener f531749c;

    public i1(java.lang.String str, android.media.MediaPlayer mediaPlayer, android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f531747a = str;
        this.f531748b = mediaPlayer;
        this.f531749c = onCompletionListener;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f531747a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = this.f531748b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        android.media.MediaPlayer.OnCompletionListener onCompletionListener = this.f531749c;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }
}
