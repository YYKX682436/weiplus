package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public class p5 implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f274453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f274454c;

    public p5(java.lang.String str, android.media.MediaPlayer mediaPlayer, int i17) {
        this.f274452a = str;
        this.f274453b = mediaPlayer;
        this.f274454c = i17;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f274452a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySound", "play onPrepared mp:%d  path:%s", objArr);
        try {
            android.media.MediaPlayer mediaPlayer2 = this.f274453b;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PlaySound", e17, "play failed pathId:%d", java.lang.Integer.valueOf(this.f274454c));
        }
    }
}
