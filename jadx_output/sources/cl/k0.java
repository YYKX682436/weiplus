package cl;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public com.eclipsesource.mmv8.V8ArrayBuffer f42671a;

    /* renamed from: b, reason: collision with root package name */
    public final com.eclipsesource.mmv8.InSandboxByteBuffer f42672b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f42673c;

    /* renamed from: d, reason: collision with root package name */
    public final cl.q0 f42674d;

    public k0(cl.q0 v86, com.eclipsesource.mmv8.V8ArrayBuffer v8Buffer, cl.i0 i0Var) {
        java.nio.ByteBuffer backingStore;
        kotlin.jvm.internal.o.g(v86, "v8");
        kotlin.jvm.internal.o.g(v8Buffer, "v8Buffer");
        this.f42674d = v86;
        this.f42671a = v8Buffer;
        if (i0Var == cl.i0.f42659e && !v8Buffer.getBackingStore().isReadOnly()) {
            java.nio.ByteBuffer backingStore2 = v8Buffer.getBackingStore();
            backingStore = backingStore2 != null ? backingStore2.asReadOnlyBuffer() : null;
        } else {
            backingStore = v8Buffer.getBackingStore();
        }
        this.f42673c = backingStore;
    }

    public k0(cl.q0 v86, com.eclipsesource.mmv8.InSandboxByteBuffer byteBufferHolder, cl.i0 i0Var) {
        kotlin.jvm.internal.o.g(v86, "v8");
        kotlin.jvm.internal.o.g(byteBufferHolder, "byteBufferHolder");
        this.f42674d = v86;
        this.f42672b = byteBufferHolder;
        java.nio.ByteBuffer asByteBuffer = byteBufferHolder.asByteBuffer();
        kotlin.jvm.internal.o.d(asByteBuffer);
        if (i0Var == cl.i0.f42659e && !asByteBuffer.isReadOnly()) {
            asByteBuffer = asByteBuffer.asReadOnlyBuffer();
        }
        this.f42673c = asByteBuffer;
    }
}
