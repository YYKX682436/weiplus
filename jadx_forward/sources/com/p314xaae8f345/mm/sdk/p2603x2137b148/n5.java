package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class n5 implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f274404a;

    public n5(android.media.MediaPlayer mediaPlayer) {
        this.f274404a = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySound", "onError, what: %d, extra: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
                return false;
            }
        }
        android.media.MediaPlayer mediaPlayer2 = this.f274404a;
        if (mediaPlayer2 == null) {
            return false;
        }
        mediaPlayer2.release();
        return false;
    }
}
