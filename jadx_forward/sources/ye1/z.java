package ye1;

/* loaded from: classes15.dex */
public class z implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ye1.e0 f542742a;

    public z(ye1.e0 e0Var) {
        this.f542742a = e0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        ye1.e0 e0Var = this.f542742a;
        e0Var.f542695a = 6;
        e0Var.E();
    }
}
