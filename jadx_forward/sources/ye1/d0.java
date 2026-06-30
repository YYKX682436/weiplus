package ye1;

/* loaded from: classes15.dex */
public class d0 implements android.media.MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ye1.e0 f542725a;

    public d0(ye1.e0 e0Var) {
        this.f542725a = e0Var;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i17) {
        this.f542725a.D(i17);
    }
}
