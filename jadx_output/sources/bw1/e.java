package bw1;

/* loaded from: classes12.dex */
public final class e implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw1.f f24801d;

    public e(bw1.f fVar) {
        this.f24801d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Object peek = this.f24801d.f24802d.peek();
        kotlin.jvm.internal.o.d(peek);
        return ((bw1.d) peek).a();
    }
}
