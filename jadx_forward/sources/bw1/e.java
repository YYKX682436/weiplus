package bw1;

/* loaded from: classes12.dex */
public final class e implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw1.f f106334d;

    public e(bw1.f fVar) {
        this.f106334d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.Object peek = this.f106334d.f106335d.peek();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(peek);
        return ((bw1.d) peek).a();
    }
}
