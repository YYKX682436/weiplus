package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public abstract class V8Value implements com.eclipsesource.mmv8.Releasable {
    public static final int BOOLEAN = 3;
    public static final int BYTE = 9;
    public static final int DOUBLE = 2;
    public static final int FLOAT_32_ARRAY = 16;
    public static final int FLOAT_64_ARRAY = 2;
    public static final int INTEGER = 1;
    public static final int INT_16_ARRAY = 13;
    public static final int INT_32_ARRAY = 1;
    public static final int INT_8_ARRAY = 9;
    public static final int NULL = 0;
    public static final int STRING = 4;
    public static final int UNDEFINED = 99;
    public static final int UNKNOWN = 0;
    public static final int UNSIGNED_INT_16_ARRAY = 14;
    public static final int UNSIGNED_INT_32_ARRAY = 15;
    public static final int UNSIGNED_INT_8_ARRAY = 11;
    public static final int UNSIGNED_INT_8_CLAMPED_ARRAY = 12;
    public static final int V8_ARRAY = 5;
    public static final int V8_ARRAY_BUFFER = 10;
    public static final int V8_FUNCTION = 7;
    public static final int V8_OBJECT = 6;
    public static final int V8_TYPED_ARRAY = 8;
    protected long objectHandle;
    protected boolean released = true;

    /* renamed from: v8, reason: collision with root package name */
    protected com.eclipsesource.mmv8.V8 f43996v8;

    public V8Value() {
    }

    @java.lang.Deprecated
    public static java.lang.String getStringRepresentaion(int i17) {
        return getStringRepresentation(i17);
    }

    public static java.lang.String getStringRepresentation(int i17) {
        if (i17 == 99) {
            return "Undefined";
        }
        switch (i17) {
            case 0:
                return "Null";
            case 1:
                return com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_INTEGER;
            case 2:
                return "Double";
            case 3:
                return "Boolean";
            case 4:
                return "String";
            case 5:
                return "V8Array";
            case 6:
                return "V8Object";
            case 7:
                return "V8Function";
            case 8:
                return "V8TypedArray";
            case 9:
                return "Byte";
            case 10:
                return "V8ArrayBuffer";
            case 11:
                return "UInt8Array";
            case 12:
                return "UInt8ClampedArray";
            case 13:
                return "Int16Array";
            case 14:
                return "UInt16Array";
            case 15:
                return "UInt32Array";
            case 16:
                return "Float32Array";
            default:
                throw new java.lang.IllegalArgumentException("Invalid V8 type: " + i17);
        }
    }

    public void addObjectReference(long j17) {
        this.objectHandle = j17;
        try {
            this.f43996v8.addObjRef(this);
        } catch (java.lang.Error e17) {
            release();
            throw e17;
        } catch (java.lang.RuntimeException e18) {
            release();
            throw e18;
        }
    }

    public void checkReleased() {
        if (this.released) {
            throw new java.lang.IllegalStateException("Object released");
        }
    }

    public abstract com.eclipsesource.mmv8.V8Value createTwin();

    public boolean equals(java.lang.Object obj) {
        return strictEquals(obj);
    }

    public long getHandle() {
        checkReleased();
        return this.objectHandle;
    }

    public com.eclipsesource.mmv8.V8 getRuntime() {
        return this.f43996v8;
    }

    public int getV8Type() {
        if (isUndefined()) {
            return 99;
        }
        this.f43996v8.checkThread();
        this.f43996v8.checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getType(v86.getV8RuntimePtr(), this.objectHandle);
    }

    public int hashCode() {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.identityHash(v86.getV8RuntimePtr(), getHandle());
    }

    public void initialize(long j17, java.lang.Object obj) {
        long initNewV8Object = this.f43996v8.initNewV8Object(j17);
        this.released = false;
        addObjectReference(initNewV8Object);
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean isUndefined() {
        return false;
    }

    public boolean isWeak() {
        this.f43996v8.checkThread();
        this.f43996v8.checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.isWeak(v86.getV8RuntimePtr(), getHandle());
    }

    public boolean jsEquals(java.lang.Object obj) {
        this.f43996v8.checkThread();
        checkReleased();
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof com.eclipsesource.mmv8.V8Value)) {
            return false;
        }
        if (isUndefined() && ((com.eclipsesource.mmv8.V8Value) obj).isUndefined()) {
            return true;
        }
        com.eclipsesource.mmv8.V8Value v8Value = (com.eclipsesource.mmv8.V8Value) obj;
        if (v8Value.isUndefined()) {
            return false;
        }
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.equals(v86.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        this.f43996v8.checkThread();
        if (this.released) {
            return;
        }
        try {
            this.f43996v8.releaseObjRef(this);
        } finally {
            this.released = true;
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            v86.release(v86.getV8RuntimePtr(), this.objectHandle);
        }
    }

    public com.eclipsesource.mmv8.V8Value setWeak() {
        this.f43996v8.checkThread();
        this.f43996v8.checkReleased();
        this.f43996v8.v8WeakReferences.put(java.lang.Long.valueOf(getHandle()), this);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.setWeak(v86.getV8RuntimePtr(), getHandle());
        return this;
    }

    public boolean strictEquals(java.lang.Object obj) {
        this.f43996v8.checkThread();
        checkReleased();
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof com.eclipsesource.mmv8.V8Value)) {
            return false;
        }
        if (isUndefined() && ((com.eclipsesource.mmv8.V8Value) obj).isUndefined()) {
            return true;
        }
        com.eclipsesource.mmv8.V8Value v8Value = (com.eclipsesource.mmv8.V8Value) obj;
        if (v8Value.isUndefined()) {
            return false;
        }
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.strictEquals(v86.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
    }

    public com.eclipsesource.mmv8.V8Value twin() {
        if (isUndefined()) {
            return this;
        }
        this.f43996v8.checkThread();
        this.f43996v8.checkReleased();
        com.eclipsesource.mmv8.V8Value createTwin = createTwin();
        this.f43996v8.createTwin(this, createTwin);
        return createTwin;
    }

    public V8Value(com.eclipsesource.mmv8.V8 v86) {
        if (v86 == null) {
            this.f43996v8 = (com.eclipsesource.mmv8.V8) this;
        } else {
            this.f43996v8 = v86;
        }
    }
}
