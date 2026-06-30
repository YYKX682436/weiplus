package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8Function extends com.eclipsesource.mmv8.V8Object {
    public V8Function(com.eclipsesource.mmv8.V8 v86, com.eclipsesource.mmv8.JavaCallback javaCallback) {
        super(v86, javaCallback);
    }

    public java.lang.Object call(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Object);
        this.f43996v8.checkRuntime(v8Array);
        if (v8Object == null) {
            v8Object = this.f43996v8;
        }
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        if (v8Object.isUndefined()) {
            v8Object = this.f43996v8;
        }
        long handle2 = v8Object.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.executeFunction(v86.getV8RuntimePtr(), handle2, this.objectHandle, handle);
    }

    @Override // com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Value createTwin() {
        return new com.eclipsesource.mmv8.V8Function(this.f43996v8);
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public void initialize(long j17, java.lang.Object obj) {
        if (obj == null) {
            super.initialize(j17, null);
            return;
        }
        long[] initNewV8Function = this.f43996v8.initNewV8Function(j17);
        this.f43996v8.createAndRegisterMethodDescriptor((com.eclipsesource.mmv8.JavaCallback) obj, initNewV8Function[1]);
        this.released = false;
        addObjectReference(initNewV8Function[0]);
    }

    @Override // com.eclipsesource.mmv8.V8Object
    public java.lang.String toString() {
        return (this.released || this.f43996v8.isReleased()) ? "[Function released]" : super.toString();
    }

    public V8Function(com.eclipsesource.mmv8.V8 v86) {
        this(v86, null);
    }

    @Override // com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Function twin() {
        return (com.eclipsesource.mmv8.V8Function) super.twin();
    }
}
