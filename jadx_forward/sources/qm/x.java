package qm;

/* loaded from: classes13.dex */
public class x extends qm.o {

    /* renamed from: f, reason: collision with root package name */
    public boolean f446195f = false;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaPlayer f446196g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.content.Context f446197h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f446198i;

    private void b(android.media.MediaPlayer mediaPlayer, java.lang.String str, boolean z17, boolean z18) {
        android.net.Uri parse;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            parse = android.media.RingtoneManager.getDefaultUri(2);
        } else if (z18) {
            parse = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(this.f446197h, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(str)));
        } else if (z17) {
            android.content.res.AssetFileDescriptor openFd = this.f446197h.getAssets().openFd(str);
            mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
            openFd.close();
            parse = null;
        } else {
            parse = android.net.Uri.parse(str);
        }
        if (parse != null) {
            try {
                mediaPlayer.setDataSource(this.f446197h, parse);
            } catch (java.io.IOException unused) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "setPlayerDataSource IOException soundUri:%s, isAsset:%s", str, java.lang.Boolean.valueOf(z17));
                } else {
                    mediaPlayer.setDataSource(this.f446197h, android.media.RingtoneManager.getDefaultUri(2));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "summeranrt setPlayerDataSource tid[%d] [%d]ms", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static void c(qm.x xVar, java.lang.String str, boolean z17, boolean z18) {
        if (xVar.f446197h == null) {
            xVar.f446197h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context = xVar.f446197h;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Notification.Tool.SoundFixed", "playSound:context is null!!");
            return;
        }
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager.getStreamVolume(5) == 0) {
                return;
            }
            boolean z19 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound playerIsInit: %s", java.lang.Boolean.valueOf(xVar.f446195f));
            if (xVar.f446195f) {
                try {
                    android.media.MediaPlayer mediaPlayer = xVar.f446196g;
                    if (mediaPlayer != null) {
                        if (mediaPlayer.isPlaying()) {
                            xVar.f446196g.stop();
                        }
                        xVar.f446196g.release();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "try to release player before playSound playerIsInit: %s", java.lang.Boolean.valueOf(xVar.f446195f));
                    }
                } catch (java.lang.IllegalStateException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Notification.Tool.SoundFixed", "try to release player before playSound error");
                    android.media.MediaPlayer mediaPlayer2 = xVar.f446196g;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.release();
                    }
                }
                xVar.f446195f = false;
            }
            to.g gVar = new to.g();
            xVar.f446196g = gVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound player: %s", gVar);
            xVar.b(xVar.f446196g, str, z17, z18);
            if (!audioManager.isWiredHeadsetOn()) {
                audioManager.getStreamVolume(5);
                xVar.f446196g.setOnCompletionListener(new qm.v(xVar));
                xVar.f446196g.setOnErrorListener(new qm.w(xVar));
                xVar.f446196g.setAudioStreamType(5);
                xVar.f446196g.setLooping(true);
                xVar.f446196g.prepare();
                xVar.f446196g.setLooping(false);
                xVar.f446196g.start();
                xVar.f446195f = true;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.TRUE;
                objArr[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
                if (android.os.Looper.getMainLooper() == null) {
                    z19 = false;
                }
                objArr[2] = java.lang.Boolean.valueOf(z19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", objArr);
                return;
            }
            int g17 = ym1.f.f544667h.g(false);
            float streamVolume = audioManager.getStreamVolume(g17);
            float streamVolume2 = audioManager.getStreamVolume(3);
            float streamMaxVolume = audioManager.getStreamMaxVolume(g17);
            float streamMaxVolume2 = streamVolume2 / audioManager.getStreamMaxVolume(3);
            if (streamVolume / streamMaxVolume > streamMaxVolume2) {
                streamVolume = streamMaxVolume * streamMaxVolume2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "headset on, setSpeakerphoneOn to false");
            audioManager.setSpeakerphoneOn(false);
            wo.o oVar = wo.v1.f529366m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "notificationSetMode: %s", java.lang.Integer.valueOf(oVar.G));
            if (oVar.G == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "notification set mode enable, set mode now");
                if (audioManager.getMode() == 0) {
                    audioManager.setMode(3);
                }
                xVar.f446196g.setOnCompletionListener(new qm.r(xVar, audioManager));
                xVar.f446196g.setOnErrorListener(new qm.s(xVar, audioManager));
            } else {
                xVar.f446196g.setOnCompletionListener(new qm.t(xVar));
                xVar.f446196g.setOnErrorListener(new qm.u(xVar));
            }
            xVar.f446196g.setAudioStreamType(g17);
            xVar.f446196g.setLooping(true);
            xVar.f446196g.prepare();
            float f17 = streamVolume / streamMaxVolume;
            xVar.f446196g.setVolume(f17, f17);
            xVar.f446196g.setLooping(false);
            xVar.f446196g.start();
            xVar.f446195f = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.Tool.SoundFixed", e17, "PlaySound Exception:", new java.lang.Object[0]);
            try {
                android.media.MediaPlayer mediaPlayer3 = xVar.f446196g;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
                xVar.f446195f = false;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.Tool.SoundFixed", e18, "try to release player in Exception:", new java.lang.Object[0]);
            }
        }
    }

    @Override // qm.o
    public synchronized void a(java.lang.String str, boolean z17, boolean z18) {
        if (this.f446198i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "playSound playHandler == null");
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("playSoundThread", 0);
            a17.start();
            this.f446198i = new qm.p(this, a17.getLooper());
        }
        this.f446198i.mo50303x856b99f0(305419896);
        this.f446198i.mo50307xb9e94560(305419896, 8000L);
        this.f446198i.mo50293x3498a0(new qm.q(this, str, z17, z18));
    }
}
