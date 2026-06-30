package tr5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f502990d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f502991e;

    public e(java.lang.Runnable runnable, boolean z17) {
        this.f502990d = runnable;
        this.f502991e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f502990d.run();
    }
}
