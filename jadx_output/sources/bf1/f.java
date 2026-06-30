package bf1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f19584a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.i f19585b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f19586c;

    /* renamed from: d, reason: collision with root package name */
    public final r9.j f19587d;

    public f(s9.c cache, s9.i cacheDataSourceFactory) {
        kotlin.jvm.internal.o.g(cache, "cache");
        kotlin.jvm.internal.o.g(cacheDataSourceFactory, "cacheDataSourceFactory");
        this.f19584a = cache;
        this.f19585b = cacheDataSourceFactory;
        this.f19586c = new java.util.concurrent.ConcurrentHashMap();
        this.f19587d = new bf1.e(this);
    }
}
