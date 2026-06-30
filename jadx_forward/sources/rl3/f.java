package rl3;

/* loaded from: classes14.dex */
public class f implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f478772a;

    public f(rl3.h hVar) {
        this.f478772a = hVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMediaPlayer", "onError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        rl3.h hVar = this.f478772a;
        hVar.f478778g = true;
        if (hVar.f232196a != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.e(hVar, false));
        }
        return false;
    }
}
