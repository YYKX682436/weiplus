package gh;

/* loaded from: classes7.dex */
public final class h extends gh.c implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public final gh.b f353357i;

    /* renamed from: m, reason: collision with root package name */
    public double f353358m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsThreadHandler, "jsThreadHandler");
        this.f353357i = gh.b.EglSurfaceSwapLocker;
    }

    @Override // gh.c
    public gh.b b() {
        return this.f353357i;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        this.f353358m = 0.0d;
    }

    @Override // gh.c
    public void g() {
        this.f353335e.k(this, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f353337g) {
            this.f353335e.k(this, false);
            if (this.f353358m == 0.0d) {
                this.f353358m = android.os.SystemClock.elapsedRealtime();
            }
            c(this.f353358m);
            this.f353358m = android.os.SystemClock.elapsedRealtime();
        }
    }
}
