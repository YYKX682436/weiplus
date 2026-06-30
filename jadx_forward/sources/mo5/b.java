package mo5;

/* loaded from: classes14.dex */
public final class b implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final to5.c f411958d;

    /* renamed from: e, reason: collision with root package name */
    public java.nio.ByteBuffer f411959e;

    public b(to5.c engineOp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineOp, "engineOp");
        this.f411958d = engineOp;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f411959e = null;
    }
}
