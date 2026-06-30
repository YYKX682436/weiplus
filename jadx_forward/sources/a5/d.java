package a5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f82908a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f82909b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.w0 f82910c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.s f82911d;

    /* renamed from: e, reason: collision with root package name */
    public final a5.o0 f82912e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82913f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82914g;

    /* renamed from: h, reason: collision with root package name */
    public final int f82915h;

    public d(a5.c cVar) {
        java.util.concurrent.Executor executor = cVar.f82906a;
        if (executor == null) {
            this.f82908a = a(false);
        } else {
            this.f82908a = executor;
        }
        java.util.concurrent.Executor executor2 = cVar.f82907b;
        if (executor2 == null) {
            this.f82909b = a(true);
        } else {
            this.f82909b = executor2;
        }
        java.lang.String str = a5.w0.f82972a;
        this.f82910c = new a5.v0();
        this.f82911d = new a5.r();
        this.f82912e = new b5.a();
        this.f82913f = 4;
        this.f82914g = Integer.MAX_VALUE;
        this.f82915h = 20;
    }

    public final java.util.concurrent.Executor a(boolean z17) {
        return java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4)), new a5.b(this, z17));
    }
}
