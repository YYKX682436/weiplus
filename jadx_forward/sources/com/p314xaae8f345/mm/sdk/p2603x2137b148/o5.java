package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class o5 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaPlayer f274437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.t5 f274438c;

    public o5(java.lang.String str, android.media.MediaPlayer mediaPlayer, com.p314xaae8f345.mm.sdk.p2603x2137b148.t5 t5Var) {
        this.f274436a = str;
        this.f274437b = mediaPlayer;
        this.f274438c = t5Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mediaPlayer == null ? -1 : mediaPlayer.hashCode());
        objArr[1] = this.f274436a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlaySound", "play completion mp:%d  path:%s", objArr);
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        android.media.MediaPlayer mediaPlayer2 = this.f274437b;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t5 t5Var = this.f274438c;
        if (t5Var != null) {
            t5Var.mo72731xa6db431b();
        }
    }
}
