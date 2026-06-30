package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8ArrayBuffer extends com.eclipsesource.mmv8.V8Value {
    private java.nio.ByteBuffer byteBuffer;

    public V8ArrayBuffer(com.eclipsesource.mmv8.V8 v86, int i17) {
        super(v86);
        initialize(v86.getV8RuntimePtr(), java.lang.Integer.valueOf(i17));
        java.nio.ByteBuffer createV8ArrayBufferBackingStore = v86.createV8ArrayBufferBackingStore(v86.getV8RuntimePtr(), this.objectHandle, i17);
        this.byteBuffer = createV8ArrayBufferBackingStore;
        createV8ArrayBufferBackingStore.order(java.nio.ByteOrder.nativeOrder());
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Value createTwin() {
        return new com.eclipsesource.mmv8.V8ArrayBuffer(this.f43996v8, this.byteBuffer);
    }

    public java.nio.ByteBuffer getBackingStore() {
        this.f43996v8.checkReleased();
        this.f43996v8.checkThread();
        return this.byteBuffer;
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public void initialize(long j17, java.lang.Object obj) {
        this.f43996v8.checkThread();
        if (obj instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            int limit = byteBuffer.limit();
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            this.objectHandle = v86.initNewV8ArrayBuffer(v86.getV8RuntimePtr(), byteBuffer, limit);
        } else {
            int intValue = ((java.lang.Integer) obj).intValue();
            com.eclipsesource.mmv8.V8 v87 = this.f43996v8;
            this.objectHandle = v87.initNewV8ArrayBuffer(v87.getV8RuntimePtr(), intValue);
        }
        this.released = false;
        addObjectReference(this.objectHandle);
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8ArrayBuffer twin() {
        return (com.eclipsesource.mmv8.V8ArrayBuffer) super.twin();
    }

    public V8ArrayBuffer(com.eclipsesource.mmv8.V8 v86, java.nio.ByteBuffer byteBuffer) {
        this(v86, byteBuffer, false);
    }

    public V8ArrayBuffer(com.eclipsesource.mmv8.V8 v86, java.nio.ByteBuffer byteBuffer, boolean z17) {
        super(v86);
        if (byteBuffer.isDirect()) {
            initialize(v86.getV8RuntimePtr(), byteBuffer);
            if (z17) {
                this.byteBuffer = byteBuffer;
            } else {
                this.byteBuffer = v86.getBackingStore(v86.getV8RuntimePtr(), this.objectHandle);
            }
            java.nio.ByteBuffer byteBuffer2 = this.byteBuffer;
            if (byteBuffer2 != null) {
                byteBuffer2.order(java.nio.ByteOrder.nativeOrder());
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer must be a allocated as a direct ByteBuffer");
    }
}
