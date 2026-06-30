package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class h8 implements android.media.MediaPlayer.OnSeekCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273221a;

    public h8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05) {
        this.f273221a = c19749xff44b05;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273221a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "video seek complete curPos[%d] mStartWhenPrepared[%b] pauseWhenUpdated[%b]", valueOf, java.lang.Boolean.valueOf(c19749xff44b05.f273023r), java.lang.Boolean.valueOf(c19749xff44b05.K));
        if (!c19749xff44b05.f273023r) {
            c19749xff44b05.mo69313x65825f6();
        } else if (c19749xff44b05.K) {
            return;
        } else {
            c19749xff44b05.mo69330x68ac462();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var = c19749xff44b05.f273026u;
        if (c4Var != null) {
            c4Var.z(c19749xff44b05.f273023r);
        }
        c19749xff44b05.I = 0L;
    }
}
