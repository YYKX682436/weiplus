package wq4;

/* loaded from: classes14.dex */
public class b0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f530148a;

    public b0(wq4.k0 k0Var) {
        this.f530148a = k0Var;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wq4.k0 k0Var = this.f530148a;
        if (currentTimeMillis - k0Var.f530185f > 70000) {
            k0Var.getClass();
        }
    }
}
