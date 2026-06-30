package k46;

/* loaded from: classes13.dex */
public abstract class f extends java.io.FilterOutputStream {

    /* renamed from: d, reason: collision with root package name */
    public java.io.InputStream f385644d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f385645e;

    public f(java.io.OutputStream outputStream) {
        super(outputStream);
        this.f385645e = new java.lang.Object();
    }

    public java.io.InputStream a() {
        synchronized (this.f385645e) {
            if (this.f385644d == null) {
                this.f385644d = b();
            }
        }
        return this.f385644d;
    }

    public abstract java.io.InputStream b();
}
