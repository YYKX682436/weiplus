package z6;

/* loaded from: classes13.dex */
public final class b implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f551837d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.d f551838e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f551839f;

    /* renamed from: g, reason: collision with root package name */
    public int f551840g;

    public b(java.lang.String str, z6.d dVar, boolean z17) {
        this.f551837d = str;
        this.f551838e = dVar;
        this.f551839f = z17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public synchronized java.lang.Thread newThread(java.lang.Runnable runnable) {
        z6.a aVar;
        aVar = new z6.a(this, runnable, "glide-" + this.f551837d + "-thread-" + this.f551840g);
        this.f551840g = this.f551840g + 1;
        return aVar;
    }
}
