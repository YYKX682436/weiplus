package cl;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final cl.q0 f42692a;

    /* renamed from: b, reason: collision with root package name */
    public final com.eclipsesource.mmv8.InSandboxByteBuffer f42693b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f42694c;

    /* renamed from: d, reason: collision with root package name */
    public com.eclipsesource.mmv8.SharedV8ArrayBuffer f42695d;

    public m0(int i17, cl.q0 q0Var) {
        this.f42692a = q0Var;
        com.eclipsesource.mmv8.InSandboxByteBuffer allocate = com.eclipsesource.mmv8.InSandboxByteBuffer.allocate(i17);
        this.f42693b = allocate;
        this.f42694c = allocate.asByteBuffer();
        this.f42695d = null;
    }
}
