package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaPlayer f243970d;

    /* renamed from: e, reason: collision with root package name */
    public int f243971e;

    /* renamed from: f, reason: collision with root package name */
    public double f243972f = -1.0d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s f243973g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.b bVar) {
        this.f243973g = sVar;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "stopPlayer");
        try {
            android.media.MediaPlayer mediaPlayer = this.f243970d;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f243970d.release();
                this.f243970d = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightPlayController", e17, "stop play sound error: %s", e17.getMessage());
            this.f243970d = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i17 = this.f243971e;
        objArr[0] = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "seek" : "resume" : "pause" : "start" : "stop";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "do play sound, operation %s", objArr);
        int i18 = this.f243971e;
        if (i18 == 0) {
            a();
            return;
        }
        if (i18 == 1) {
            a();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f243973g.f243980c)) {
                return;
            }
            try {
                to.g gVar = new to.g();
                this.f243970d = gVar;
                gVar.setDisplay(null);
                this.f243970d.reset();
                this.f243970d.setDataSource(com.p314xaae8f345.mm.vfs.w6.i(this.f243973g.f243980c, false));
                this.f243970d.setAudioStreamType(3);
                this.f243970d.setOnErrorListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.o(this));
                this.f243970d.prepare();
                this.f243970d.start();
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightPlayController", e17, "play sound error: %s", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", this.f243973g.f243980c);
                this.f243973g.c();
                if (this.f243973g.F != null) {
                    this.f243973g.F.a(this.f243973g, -1);
                    return;
                }
                return;
            }
        }
        if (i18 == 2) {
            try {
                android.media.MediaPlayer mediaPlayer = this.f243970d;
                if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                    return;
                }
                this.f243970d.pause();
                return;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightPlayController", e18, "pause sound error: %s", e18.getMessage());
                a();
                return;
            }
        }
        if (i18 != 3) {
            if (i18 != 4) {
                return;
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayController", "soundplayer seek %f", java.lang.Double.valueOf(this.f243972f));
                this.f243970d.seekTo((int) (this.f243972f * 1000.0d));
                return;
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightPlayController", e19, "seek sound error: %s", e19.getMessage());
                return;
            }
        }
        try {
            android.media.MediaPlayer mediaPlayer2 = this.f243970d;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightPlayController", e27, "pause sound error: %s", e27.getMessage());
            a();
        }
    }
}
