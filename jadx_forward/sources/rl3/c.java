package rl3;

/* loaded from: classes14.dex */
public class c implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.h f478769a;

    public c(rl3.h hVar) {
        this.f478769a = hVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMediaPlayer", "onCompletion, stop music");
        rl3.h hVar = this.f478769a;
        if (hVar.f478778g) {
            hVar.f(false);
        } else {
            hVar.f(true);
        }
    }
}
