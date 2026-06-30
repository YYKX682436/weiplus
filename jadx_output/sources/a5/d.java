package a5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Executor f1375a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f1376b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.w0 f1377c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.s f1378d;

    /* renamed from: e, reason: collision with root package name */
    public final a5.o0 f1379e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1380f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1381g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1382h;

    public d(a5.c cVar) {
        java.util.concurrent.Executor executor = cVar.f1373a;
        if (executor == null) {
            this.f1375a = a(false);
        } else {
            this.f1375a = executor;
        }
        java.util.concurrent.Executor executor2 = cVar.f1374b;
        if (executor2 == null) {
            this.f1376b = a(true);
        } else {
            this.f1376b = executor2;
        }
        java.lang.String str = a5.w0.f1439a;
        this.f1377c = new a5.v0();
        this.f1378d = new a5.r();
        this.f1379e = new b5.a();
        this.f1380f = 4;
        this.f1381g = Integer.MAX_VALUE;
        this.f1382h = 20;
    }

    public final java.util.concurrent.Executor a(boolean z17) {
        return java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Math.min(java.lang.Runtime.getRuntime().availableProcessors() - 1, 4)), new a5.b(this, z17));
    }
}
