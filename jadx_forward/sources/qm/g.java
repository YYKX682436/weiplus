package qm;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f446163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f446164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm.o f446165g;

    public g(qm.o oVar, java.lang.String str, boolean z17, boolean z18) {
        this.f446165g = oVar;
        this.f446162d = str;
        this.f446163e = z17;
        this.f446164f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f446162d;
        boolean z17 = this.f446163e;
        boolean z18 = this.f446164f;
        qm.o oVar = this.f446165g;
        if (oVar.f446179c == null) {
            oVar.f446179c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context = oVar.f446179c;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Notification.Tool.Sound", "playSound:context is null!!");
            return;
        }
        try {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager.getStreamVolume(5) == 0) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = oVar.f446180d;
            n3Var.mo50303x856b99f0(305419896);
            n3Var.mo50307xb9e94560(305419896, 8000L);
            boolean z19 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "doPlaySound playerIsInit: %s", java.lang.Boolean.valueOf(oVar.f446177a));
            if (oVar.f446177a) {
                try {
                    android.media.MediaPlayer mediaPlayer = oVar.f446178b;
                    if (mediaPlayer != null) {
                        if (mediaPlayer.isPlaying()) {
                            oVar.f446178b.stop();
                        }
                        oVar.f446178b.release();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "try to release player before playSound playerIsInit: %s", java.lang.Boolean.valueOf(oVar.f446177a));
                    }
                } catch (java.lang.IllegalStateException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Notification.Tool.Sound", "try to release player before playSound error");
                    android.media.MediaPlayer mediaPlayer2 = oVar.f446178b;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.release();
                    }
                }
                oVar.f446177a = false;
            }
            to.g gVar = new to.g();
            oVar.f446178b = gVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "doPlaySound player: %s", gVar);
            oVar.b(oVar.f446178b, str, z17, z18);
            if (!audioManager.isWiredHeadsetOn()) {
                audioManager.getStreamVolume(5);
                oVar.f446178b.setOnCompletionListener(new qm.l(oVar));
                oVar.f446178b.setOnErrorListener(new qm.m(oVar));
                oVar.f446178b.setAudioStreamType(5);
                oVar.f446178b.setLooping(true);
                oVar.f446178b.prepare();
                oVar.f446178b.setLooping(false);
                oVar.f446178b.start();
                oVar.f446177a = true;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Boolean.TRUE;
                objArr[1] = java.lang.Boolean.valueOf(android.os.Looper.myLooper() != null);
                if (android.os.Looper.getMainLooper() == null) {
                    z19 = false;
                }
                objArr[2] = java.lang.Boolean.valueOf(z19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "doPlaySound start finish playerIsInit:%s, myLooper[%b] mainLooper[%b]", objArr);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "headset on, setSpeakerphoneOn to false");
            audioManager.setSpeakerphoneOn(false);
            wo.o oVar2 = wo.v1.f529366m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "notificationSetMode: %s", java.lang.Integer.valueOf(oVar2.G));
            if (oVar2.G == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "notification set mode enable, set mode now");
                if (audioManager.getMode() == 0) {
                    audioManager.setMode(3);
                }
                oVar.f446178b.setOnCompletionListener(new qm.h(oVar, audioManager));
                oVar.f446178b.setOnErrorListener(new qm.i(oVar, audioManager));
            } else {
                oVar.f446178b.setOnCompletionListener(new qm.j(oVar));
                oVar.f446178b.setOnErrorListener(new qm.k(oVar));
            }
            oVar.f446178b.setAudioStreamType(g17);
            oVar.f446178b.setLooping(true);
            oVar.f446178b.prepare();
            float f17 = streamVolume / streamMaxVolume;
            oVar.f446178b.setVolume(f17, f17);
            oVar.f446178b.setLooping(false);
            oVar.f446178b.start();
            oVar.f446177a = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.Tool.Sound", e17, "PlaySound Exception:", new java.lang.Object[0]);
            try {
                android.media.MediaPlayer mediaPlayer3 = oVar.f446178b;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.release();
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.Tool.Sound", e18, "try to release player in Exception:", new java.lang.Object[0]);
            }
        }
    }
}
