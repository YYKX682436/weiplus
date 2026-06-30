package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8TypedArray extends com.eclipsesource.mmv8.V8Array {

    /* loaded from: classes7.dex */
    public static class V8ArrayData {
        private com.eclipsesource.mmv8.V8ArrayBuffer buffer;
        private int offset;
        private int size;
        private int type;

        public V8ArrayData(com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer, int i17, int i18, int i19) {
            this.buffer = v8ArrayBuffer;
            this.offset = i17;
            this.size = i18;
            this.type = i19;
        }
    }

    public V8TypedArray(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer, int i17, int i18, int i19) {
        super(v86, new com.eclipsesource.mmv8.V8TypedArray.V8ArrayData(v8ArrayBuffer, i18, i19, i17));
    }

    private void checkArrayProperties(com.eclipsesource.mmv8.V8TypedArray.V8ArrayData v8ArrayData) {
        checkOffset(v8ArrayData);
        checkSize(v8ArrayData);
    }

    private void checkOffset(com.eclipsesource.mmv8.V8TypedArray.V8ArrayData v8ArrayData) {
        if (v8ArrayData.offset % getStructureSize(v8ArrayData.type) == 0) {
            return;
        }
        throw new java.lang.IllegalStateException("RangeError: Start offset of Int32Array must be a multiple of " + getStructureSize(v8ArrayData.type));
    }

    private void checkSize(com.eclipsesource.mmv8.V8TypedArray.V8ArrayData v8ArrayData) {
        if (v8ArrayData.size < 0) {
            throw new java.lang.IllegalStateException("RangeError: Invalid typed array length");
        }
        if ((v8ArrayData.size * getStructureSize(v8ArrayData.type)) + v8ArrayData.offset > v8ArrayData.buffer.getBackingStore().limit()) {
            throw new java.lang.IllegalStateException("RangeError: Invalid typed array length");
        }
    }

    private long createTypedArray(long j17, com.eclipsesource.mmv8.V8TypedArray.V8ArrayData v8ArrayData) {
        int i17 = v8ArrayData.type;
        if (i17 == 1) {
            return this.f43996v8.initNewV8Int32Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
        if (i17 == 2) {
            return this.f43996v8.initNewV8Float64Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
        if (i17 == 9) {
            return this.f43996v8.initNewV8Int8Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
        }
        switch (i17) {
            case 11:
                return this.f43996v8.initNewV8UInt8Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 12:
                return this.f43996v8.initNewV8UInt8ClampedArray(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 13:
                return this.f43996v8.initNewV8Int16Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 14:
                return this.f43996v8.initNewV8UInt16Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 15:
                return this.f43996v8.initNewV8UInt32Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            case 16:
                return this.f43996v8.initNewV8Float32Array(j17, v8ArrayData.buffer.objectHandle, v8ArrayData.offset, v8ArrayData.size);
            default:
                throw new java.lang.IllegalArgumentException("Cannot create a typed array of type " + com.eclipsesource.mmv8.V8Value.getStringRepresentation(v8ArrayData.type));
        }
    }

    public static int getStructureSize(int i17) {
        if (i17 == 1) {
            return 4;
        }
        if (i17 == 2) {
            return 8;
        }
        if (i17 != 9) {
            switch (i17) {
                case 11:
                case 12:
                    break;
                case 13:
                case 14:
                    return 2;
                case 15:
                case 16:
                    return 4;
                default:
                    throw new java.lang.IllegalArgumentException("Cannot create a typed array of type " + com.eclipsesource.mmv8.V8Value.getStringRepresentation(i17));
            }
        }
        return 1;
    }

    @Override // com.eclipsesource.mmv8.V8Array, com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Value createTwin() {
        return new com.eclipsesource.mmv8.V8TypedArray(this.f43996v8);
    }

    public com.eclipsesource.mmv8.V8ArrayBuffer getBuffer() {
        return (com.eclipsesource.mmv8.V8ArrayBuffer) get("buffer");
    }

    public java.nio.ByteBuffer getByteBuffer() {
        com.eclipsesource.mmv8.V8ArrayBuffer buffer = getBuffer();
        try {
            return buffer.getBackingStore();
        } finally {
            buffer.release();
        }
    }

    @Override // com.eclipsesource.mmv8.V8Array, com.eclipsesource.mmv8.V8Value
    public void initialize(long j17, java.lang.Object obj) {
        this.f43996v8.checkThread();
        if (obj == null) {
            super.initialize(j17, obj);
            return;
        }
        com.eclipsesource.mmv8.V8TypedArray.V8ArrayData v8ArrayData = (com.eclipsesource.mmv8.V8TypedArray.V8ArrayData) obj;
        checkArrayProperties(v8ArrayData);
        long createTypedArray = createTypedArray(j17, v8ArrayData);
        this.released = false;
        addObjectReference(createTypedArray);
    }

    private V8TypedArray(com.eclipsesource.mmv8.V8 v86) {
        super(v86);
    }
}
