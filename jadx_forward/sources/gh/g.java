package gh;

/* loaded from: classes7.dex */
public final class g extends gh.c {

    /* renamed from: i, reason: collision with root package name */
    public final gh.i f353352i;

    /* renamed from: m, reason: collision with root package name */
    public final gh.b f353353m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.view.Choreographer f353354n;

    /* renamed from: o, reason: collision with root package name */
    public final gh.e f353355o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsThreadHandler, "jsThreadHandler");
        this.f353352i = new gh.i();
        this.f353353m = gh.b.ChoreographerInMainThread;
        this.f353355o = new gh.e(this);
    }

    @Override // gh.c
    public gh.b b() {
        return this.f353353m;
    }

    @Override // gh.c
    public void d() {
        android.os.Handler handler = hh.i.f362976a;
        hh.i.b(new hh.RunnableC28454x3046d9(new gh.f(this)));
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        if (this.f353354n != null) {
            android.view.Choreographer choreographer = this.f353354n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(choreographer);
            choreographer.removeFrameCallback(this.f353355o);
        }
    }

    @Override // gh.c
    public void g() {
        if (this.f353354n != null) {
            android.view.Choreographer choreographer = this.f353354n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(choreographer);
            choreographer.removeFrameCallback(this.f353355o);
            android.view.Choreographer choreographer2 = this.f353354n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(choreographer2);
            choreographer2.postFrameCallback(this.f353355o);
        }
    }
}
