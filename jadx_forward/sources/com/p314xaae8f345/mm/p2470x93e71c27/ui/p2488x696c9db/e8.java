package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes13.dex */
public class e8 extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f273139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273140e;

    public e8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05, android.media.MediaPlayer mediaPlayer) {
        this.f273140e = c19749xff44b05;
        this.f273139d = mediaPlayer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.media.MediaPlayer mediaPlayer = this.f273139d;
        if (mediaPlayer != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d another thread to release player[%s]", java.lang.Integer.valueOf(this.f273140e.hashCode()), mediaPlayer);
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
