package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class m8 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 f273311d;

    public m8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05) {
        this.f273311d = c19749xff44b05;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        int i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05.R;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273311d;
        c19749xff44b05.getClass();
        c19749xff44b05.C();
        android.view.Surface surface = c19749xff44b05.f273018m;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d8(c19749xff44b05, surface));
        c19749xff44b05.f273018m = new android.view.Surface(surfaceTexture);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d on texture available %d*%d mIsPrepared[%b] mSurface[%d] ", java.lang.Integer.valueOf(c19749xff44b05.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(c19749xff44b05.f273020o), java.lang.Integer.valueOf(c19749xff44b05.f273018m.hashCode()));
        android.media.MediaPlayer mediaPlayer = c19749xff44b05.f273019n;
        if (mediaPlayer == null || !c19749xff44b05.f273020o) {
            c19749xff44b05.G();
        } else {
            mediaPlayer.setSurface(c19749xff44b05.f273018m);
            if (c19749xff44b05.f273015J) {
                c19749xff44b05.f273019n.start();
            } else {
                c19749xff44b05.K = true;
                c19749xff44b05.f273019n.setVolume(0.0f, 0.0f);
                c19749xff44b05.f273019n.start();
            }
            c19749xff44b05.f273015J = false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 d4Var = c19749xff44b05.f273028w;
        if (d4Var != null) {
            d4Var.mo48230xe037649b();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273311d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d on texture destroyed mIsPrepared[%b]", java.lang.Integer.valueOf(c19749xff44b05.hashCode()), java.lang.Boolean.valueOf(c19749xff44b05.f273020o));
        android.view.Surface surface = c19749xff44b05.f273018m;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d8(c19749xff44b05, surface));
        c19749xff44b05.f273018m = null;
        if (c19749xff44b05.f273019n == null || !c19749xff44b05.f273020o) {
            c19749xff44b05.H();
            c19749xff44b05.f273015J = false;
        } else if (c19749xff44b05.mo69311xc00617a4()) {
            c19749xff44b05.f273015J = true;
            c19749xff44b05.f273019n.pause();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "on texture size changed width : " + i17 + " height : " + i18);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273311d;
        android.media.MediaPlayer mediaPlayer = c19749xff44b05.f273019n;
        if (mediaPlayer != null && c19749xff44b05.f273020o && c19749xff44b05.f273021p == i17 && c19749xff44b05.f273022q == i18) {
            mediaPlayer.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05 c19749xff44b05 = this.f273311d;
        if (c19749xff44b05.K) {
            android.media.MediaPlayer mediaPlayer = c19749xff44b05.f273019n;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
                if (c19749xff44b05.N) {
                    c19749xff44b05.f273019n.setVolume(0.0f, 0.0f);
                } else {
                    c19749xff44b05.f273019n.setVolume(1.0f, 1.0f);
                }
            }
            c19749xff44b05.K = false;
        }
        if (c19749xff44b05.I > 0 && (e4Var = c19749xff44b05.f273025t) != null) {
            e4Var.v();
            c19749xff44b05.f273025t = null;
        }
        c19749xff44b05.I = java.lang.System.currentTimeMillis();
        if (c19749xff44b05.L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d flush surface pause now time[%d]", java.lang.Integer.valueOf(c19749xff44b05.hashCode()), java.lang.Integer.valueOf(c19749xff44b05.mo69307x9746038c()));
            android.media.MediaPlayer mediaPlayer2 = c19749xff44b05.f273019n;
            if (mediaPlayer2 != null) {
                mediaPlayer2.pause();
                c19749xff44b05.mo69318x764d819b(c19749xff44b05.N);
            }
            c19749xff44b05.L = false;
        }
    }
}
