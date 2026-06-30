package ww1;

/* loaded from: classes13.dex */
public class g1 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f531725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f531726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer.OnCompletionListener f531727c;

    public g1(java.lang.String str, android.media.MediaPlayer mediaPlayer, android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f531725a = str;
        this.f531726b = mediaPlayer;
        this.f531727c = onCompletionListener;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f531725a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2fRcvVoiceListener", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = this.f531726b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        android.media.MediaPlayer.OnCompletionListener onCompletionListener = this.f531727c;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mediaPlayer);
        }
    }
}
