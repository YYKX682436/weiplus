package wq4;

/* loaded from: classes14.dex */
public class i0 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f530174a;

    public i0(wq4.k0 k0Var) {
        this.f530174a = k0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        if (mediaPlayer == null) {
            return false;
        }
        mediaPlayer.release();
        this.f530174a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RingPlayer", "RingPlayer playSound :onError", mediaPlayer, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return false;
    }
}
