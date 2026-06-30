package pm0;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f438312f;

    public k(yz5.a aVar, boolean z17, android.os.HandlerThread handlerThread) {
        this.f438310d = aVar;
        this.f438311e = z17;
        this.f438312f = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f438310d.mo152xb9724478();
        if (this.f438311e) {
            this.f438312f.quitSafely();
        }
    }
}
