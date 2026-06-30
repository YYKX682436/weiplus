package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class y7 implements android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 f273545a;

    public y7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997) {
        this.f273545a = c19748x5c264997;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        int videoWidth = mediaPlayer.getVideoWidth();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997 = this.f273545a;
        c19748x5c264997.f273005i = videoWidth;
        c19748x5c264997.f273006m = mediaPlayer.getVideoHeight();
        int i19 = c19748x5c264997.f273005i;
        int i27 = c19748x5c264997.f273006m;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997.d(c19748x5c264997);
    }
}
