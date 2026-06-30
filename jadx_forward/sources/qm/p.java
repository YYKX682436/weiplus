package qm;

/* loaded from: classes13.dex */
public class p extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.x f446182a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qm.x xVar, android.os.Looper looper) {
        super(looper);
        this.f446182a = xVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what == 305419896) {
            qm.x xVar = this.f446182a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", java.lang.Boolean.valueOf(xVar.f446195f));
            try {
                try {
                    if (xVar.f446195f) {
                        if (xVar.f446196g.isPlaying()) {
                            xVar.f446196g.stop();
                        }
                        xVar.f446196g.release();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.SoundFixed", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", java.lang.Boolean.valueOf(xVar.f446195f));
                    }
                } catch (java.lang.IllegalStateException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Notification.Tool.SoundFixed", e17, "Exception in playSoundHander,playerIsInit:%s", java.lang.Boolean.valueOf(xVar.f446195f));
                    android.media.MediaPlayer mediaPlayer = xVar.f446196g;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                }
            } finally {
                xVar.f446195f = false;
            }
        }
    }
}
