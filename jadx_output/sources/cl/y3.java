package cl;

/* loaded from: classes7.dex */
public final class y3 implements com.tencent.mm.plugin.appbrand.jsruntime.g1 {

    /* renamed from: e, reason: collision with root package name */
    public static final cl.x3 f42830e = new cl.x3(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.eclipsesource.mmv8.InSandboxByteBuffer f42831d;

    public y3(com.eclipsesource.mmv8.InSandboxByteBuffer inSandboxByteBuffer, kotlin.jvm.internal.i iVar) {
        this.f42831d = inSandboxByteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42831d.release();
    }
}
