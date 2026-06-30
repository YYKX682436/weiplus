package ir0;

/* loaded from: classes5.dex */
public final class e implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f375459d;

    public e(java.lang.Runnable runnable) {
        this.f375459d = runnable;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f375459d.getClass().getName();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f375459d.run();
    }
}
