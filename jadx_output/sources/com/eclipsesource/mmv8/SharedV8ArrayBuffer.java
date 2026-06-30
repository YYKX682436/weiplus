package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class SharedV8ArrayBuffer extends com.eclipsesource.mmv8.V8ArrayBuffer {
    private SharedV8ArrayBuffer(com.eclipsesource.mmv8.V8 v86, int i17) {
        super(v86, i17);
        throw new java.lang.IllegalArgumentException("not support this way construct");
    }

    @Override // com.eclipsesource.mmv8.V8ArrayBuffer, com.eclipsesource.mmv8.V8Value
    public void initialize(long j17, java.lang.Object obj) {
        this.f43996v8.checkThread();
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        int limit = byteBuffer.limit();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        long initNewSharedV8ArrayBuffer = v86.initNewSharedV8ArrayBuffer(v86.getV8RuntimePtr(), byteBuffer, limit);
        this.objectHandle = initNewSharedV8ArrayBuffer;
        this.released = false;
        addObjectReference(initNewSharedV8ArrayBuffer);
    }

    public void manualRelease() {
        super.release();
    }

    @Override // com.eclipsesource.mmv8.V8Value, com.eclipsesource.mmv8.Releasable
    public void release() {
    }

    public SharedV8ArrayBuffer(com.eclipsesource.mmv8.V8 v86, java.nio.ByteBuffer byteBuffer) {
        super(v86, byteBuffer);
    }
}
