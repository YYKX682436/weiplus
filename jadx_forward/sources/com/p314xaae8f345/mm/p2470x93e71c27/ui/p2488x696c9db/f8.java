package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class f8 implements android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273161a;

    public f8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05) {
        this.f273161a = c19749xff44b05;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        android.media.MediaPlayer mediaPlayer2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273161a;
        try {
            mediaPlayer2 = c19749xff44b05.f273019n;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "on video size changed error[%d, %d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        if (mediaPlayer != mediaPlayer2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoTextureView", "another player on video size changed, return now.[%s, %s]", mediaPlayer, mediaPlayer2);
            return;
        }
        c19749xff44b05.f273021p = mediaPlayer.getVideoWidth();
        c19749xff44b05.f273022q = mediaPlayer.getVideoHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "on size change size:( " + c19749xff44b05.f273021p + " , " + c19749xff44b05.f273022q + " )");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = c19749xff44b05.f273024s;
        if (a4Var != null) {
            a4Var.T4(c19749xff44b05.f273021p, c19749xff44b05.f273022q);
        }
        int i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05.R;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c19749xff44b05.getLayoutParams();
        layoutParams.addRule(13);
        c19749xff44b05.setLayoutParams(layoutParams);
    }
}
