package pc;

/* loaded from: classes14.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f434754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pc.r f434755e;

    public q(pc.r rVar, int i17) {
        this.f434755e = rVar;
        this.f434754d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.media.SoundPool soundPool = this.f434755e.f434756a;
        if (soundPool == null) {
            mc.p.f407064a.e("SoundPoolHelper", "soundpool is null.");
        } else {
            soundPool.play(this.f434754d, 0.8f, 0.8f, 0, 0, 1.0f);
        }
    }
}
