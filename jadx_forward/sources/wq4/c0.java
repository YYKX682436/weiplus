package wq4;

/* loaded from: classes14.dex */
public class c0 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f530153a;

    public c0(wq4.k0 k0Var) {
        this.f530153a = k0Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        this.f530153a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RingPlayer", "RingPlayer startPlayCustomRing MediaPlayer onError, what: " + i17 + ":extra:" + i18);
        return false;
    }
}
