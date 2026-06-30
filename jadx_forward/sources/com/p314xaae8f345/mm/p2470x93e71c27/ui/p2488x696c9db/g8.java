package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class g8 implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273196a;

    public g8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05) {
        this.f273196a = c19749xff44b05;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273196a;
        android.media.MediaPlayer mediaPlayer2 = c19749xff44b05.f273019n;
        if (mediaPlayer != mediaPlayer2 && mediaPlayer != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoTextureView", "another player callback, release now.[%s, %s]", mediaPlayer, mediaPlayer2);
            new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e8(c19749xff44b05, mediaPlayer).start();
            return;
        }
        c19749xff44b05.f273020o = true;
        c19749xff44b05.f273021p = mediaPlayer != null ? mediaPlayer.getVideoWidth() : 0;
        c19749xff44b05.f273022q = mediaPlayer != null ? mediaPlayer.getVideoHeight() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "on prepared. size [%d, %d] mStartWhenPrepared %b ", java.lang.Integer.valueOf(c19749xff44b05.f273021p), java.lang.Integer.valueOf(c19749xff44b05.f273022q), java.lang.Boolean.valueOf(c19749xff44b05.f273023r));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c19749xff44b05.getLayoutParams();
        layoutParams.addRule(13);
        c19749xff44b05.setLayoutParams(layoutParams);
        if (c19749xff44b05.f273021p == 0 || c19749xff44b05.f273022q == 0) {
            if (c19749xff44b05.f273023r) {
                c19749xff44b05.f273019n.start();
                c19749xff44b05.f273023r = false;
                c19749xff44b05.f273019n.setLooping(c19749xff44b05.A);
            }
        } else if (c19749xff44b05.f273023r) {
            c19749xff44b05.f273019n.start();
            c19749xff44b05.f273019n.setLooping(c19749xff44b05.A);
            c19749xff44b05.f273023r = false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19749xff44b05.f273024s;
        if (a4Var != null) {
            a4Var.mo9757x58d5b73c();
        }
    }
}
