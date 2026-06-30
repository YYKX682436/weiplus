package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class c8 implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 f273080d;

    public c8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997) {
        this.f273080d = c19748x5c264997;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSurfaceView", "on surface changed %d*%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997 = this.f273080d;
        android.media.MediaPlayer mediaPlayer = c19748x5c264997.f273003g;
        if (mediaPlayer != null && c19748x5c264997.f273004h && c19748x5c264997.f273005i == i18 && c19748x5c264997.f273006m == i19) {
            mediaPlayer.start();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSurfaceView", "on surface created");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997 = this.f273080d;
        c19748x5c264997.f273002f = surfaceHolder;
        c19748x5c264997.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSurfaceView", "on surface destroyed");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997 = this.f273080d;
        c19748x5c264997.f273002f = null;
        android.media.MediaPlayer mediaPlayer = c19748x5c264997.f273003g;
        if (mediaPlayer != null) {
            c19748x5c264997.f273008o.q(mediaPlayer.getCurrentPosition(), c19748x5c264997.f273003g.getDuration());
            c19748x5c264997.f273003g.reset();
            c19748x5c264997.f273003g.release();
            c19748x5c264997.f273003g = null;
        }
    }
}
