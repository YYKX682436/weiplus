package androidx.lifecycle;

/* loaded from: classes5.dex */
public final class e implements java.io.Closeable, kotlinx.coroutines.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f11620d;

    public e(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f11620d = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        kotlinx.coroutines.v2.c(this.f11620d, null, 1, null);
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        return this.f11620d;
    }
}
