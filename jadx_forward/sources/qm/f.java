package qm;

/* loaded from: classes13.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm.o f446161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qm.o oVar, android.os.Looper looper) {
        super(looper);
        this.f446161a = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        qm.o oVar = this.f446161a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer playerIsInit:%s", java.lang.Boolean.valueOf(oVar.f446177a));
        try {
            android.media.MediaPlayer mediaPlayer = oVar.f446178b;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    oVar.f446178b.stop();
                }
                oVar.f446178b.release();
                oVar.f446177a = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Notification.Tool.Sound", "play sound handler, try to stop notify mediaplayer done playerIsInit:%s", false);
            }
        } catch (java.lang.IllegalStateException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Notification.Tool.Sound", "Exception in playSoundHander,playerIsInit:%s", java.lang.Boolean.valueOf(oVar.f446177a));
            android.media.MediaPlayer mediaPlayer2 = oVar.f446178b;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
        }
    }
}
