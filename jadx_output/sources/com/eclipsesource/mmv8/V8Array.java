package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8Array extends com.eclipsesource.mmv8.V8Object {

    /* loaded from: classes7.dex */
    public static class Undefined extends com.eclipsesource.mmv8.V8Array {
        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, boolean z17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object addUndefined(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public boolean contains(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Value
        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.eclipsesource.mmv8.V8Object) && ((com.eclipsesource.mmv8.V8Object) obj).isUndefined();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Array executeArrayFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public boolean executeBooleanFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public double executeDoubleFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public int executeIntegerFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object executeObjectFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public java.lang.String executeStringFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public void executeVoidFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public java.lang.Object get(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Array getArray(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public boolean getBoolean(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public boolean[] getBooleans(int i17, int i18) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public byte getByte(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public byte[] getBytes(int i17, int i18) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public double getDouble(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public double[] getDoubles(int i17, int i18) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public int getInteger(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int[] getIntegers(int i17, int i18) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public java.lang.String[] getKeys() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object getObject(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Value
        public com.eclipsesource.mmv8.V8 getRuntime() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public java.lang.String getString(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public java.lang.String[] getStrings(int i17, int i18) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public int getType(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Value
        public int hashCode() {
            return 919;
        }

        @Override // com.eclipsesource.mmv8.V8Value
        public boolean isReleased() {
            return false;
        }

        @Override // com.eclipsesource.mmv8.V8Value
        public boolean isUndefined() {
            return true;
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int length() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array push(boolean z17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array pushUndefined() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object registerJavaMethod(com.eclipsesource.mmv8.JavaCallback javaCallback, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Value, com.eclipsesource.mmv8.Releasable
        public void release() {
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object setPrototype(com.eclipsesource.mmv8.V8Object v8Object) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array, com.eclipsesource.mmv8.V8Object
        public java.lang.String toString() {
            return "undefined";
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, double d17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array getArray(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public boolean getBoolean(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getBooleans(int i17, int i18, boolean[] zArr) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getBytes(int i17, int i18, byte[] bArr) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public double getDouble(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getDoubles(int i17, int i18, double[] dArr) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getInteger(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getIntegers(int i17, int i18, int[] iArr) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Object getObject(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public java.lang.String getString(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getStrings(int i17, int i18, java.lang.String[] strArr) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getType() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array push(double d17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object registerJavaMethod(com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback, java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getType(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array push(int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object registerJavaMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class<?>[] clsArr, boolean z17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, java.lang.String str2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public int getType(int i17, int i18) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array push(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array, com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
        public com.eclipsesource.mmv8.V8Array.Undefined twin() {
            return (com.eclipsesource.mmv8.V8Array.Undefined) super.twin();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, com.eclipsesource.mmv8.V8Value v8Value) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Array
        public com.eclipsesource.mmv8.V8Array push(com.eclipsesource.mmv8.V8Value v8Value) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public V8Array() {
    }

    @Override // com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Value createTwin() {
        return new com.eclipsesource.mmv8.V8Array(this.f43996v8);
    }

    public java.lang.Object get(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGet(v86.getV8RuntimePtr(), 6, this.objectHandle, i17);
    }

    public com.eclipsesource.mmv8.V8Array getArray(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        java.lang.Object arrayGet = v86.arrayGet(v86.getV8RuntimePtr(), 5, this.objectHandle, i17);
        if (arrayGet == null || (arrayGet instanceof com.eclipsesource.mmv8.V8Array)) {
            return (com.eclipsesource.mmv8.V8Array) arrayGet;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public boolean getBoolean(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetBoolean(v86.getV8RuntimePtr(), getHandle(), i17);
    }

    public boolean[] getBooleans(int i17, int i18) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetBooleans(v86.getV8RuntimePtr(), getHandle(), i17, i18);
    }

    public byte getByte(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetByte(v86.getV8RuntimePtr(), getHandle(), i17);
    }

    public byte[] getBytes(int i17, int i18) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetBytes(v86.getV8RuntimePtr(), getHandle(), i17, i18);
    }

    public double getDouble(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetDouble(v86.getV8RuntimePtr(), getHandle(), i17);
    }

    public double[] getDoubles(int i17, int i18) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetDoubles(v86.getV8RuntimePtr(), getHandle(), i17, i18);
    }

    public int getInteger(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetInteger(v86.getV8RuntimePtr(), getHandle(), i17);
    }

    public int[] getIntegers(int i17, int i18) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetIntegers(v86.getV8RuntimePtr(), getHandle(), i17, i18);
    }

    public com.eclipsesource.mmv8.V8Object getObject(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        java.lang.Object arrayGet = v86.arrayGet(v86.getV8RuntimePtr(), 6, this.objectHandle, i17);
        if (arrayGet == null || (arrayGet instanceof com.eclipsesource.mmv8.V8Object)) {
            return (com.eclipsesource.mmv8.V8Object) arrayGet;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public java.lang.String getString(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetString(v86.getV8RuntimePtr(), getHandle(), i17);
    }

    public java.lang.String[] getStrings(int i17, int i18) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetStrings(v86.getV8RuntimePtr(), getHandle(), i17, i18);
    }

    public int getType(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getType(v86.getV8RuntimePtr(), getHandle(), i17);
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public void initialize(long j17, java.lang.Object obj) {
        long initNewV8Array = this.f43996v8.initNewV8Array(j17);
        this.released = false;
        addObjectReference(initNewV8Array);
    }

    public int length() {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.arrayGetSize(v86.getV8RuntimePtr(), getHandle());
    }

    public com.eclipsesource.mmv8.V8Array push(int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addArrayIntItem(v86.getV8RuntimePtr(), getHandle(), i17);
        return this;
    }

    public com.eclipsesource.mmv8.V8Array pushNull() {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addArrayNullItem(v86.getV8RuntimePtr(), getHandle());
        return this;
    }

    public com.eclipsesource.mmv8.V8Array pushUndefined() {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addArrayUndefinedItem(v86.getV8RuntimePtr(), getHandle());
        return this;
    }

    @Override // com.eclipsesource.mmv8.V8Object
    public java.lang.String toString() {
        return (this.released || this.f43996v8.isReleased()) ? "[Array released]" : super.toString();
    }

    public V8Array(com.eclipsesource.mmv8.V8 v86) {
        super(v86);
        v86.checkThread();
    }

    @Override // com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Array twin() {
        return (com.eclipsesource.mmv8.V8Array) super.twin();
    }

    public V8Array(com.eclipsesource.mmv8.V8 v86, java.lang.Object obj) {
        super(v86, obj);
    }

    public int getBooleans(int i17, int i18, boolean[] zArr) {
        this.f43996v8.checkThread();
        checkReleased();
        if (i18 <= zArr.length) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            return v86.arrayGetBooleans(v86.getV8RuntimePtr(), getHandle(), i17, i18, zArr);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int getBytes(int i17, int i18, byte[] bArr) {
        this.f43996v8.checkThread();
        checkReleased();
        if (i18 <= bArr.length) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            return v86.arrayGetBytes(v86.getV8RuntimePtr(), getHandle(), i17, i18, bArr);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int getDoubles(int i17, int i18, double[] dArr) {
        this.f43996v8.checkThread();
        checkReleased();
        if (i18 <= dArr.length) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            return v86.arrayGetDoubles(v86.getV8RuntimePtr(), getHandle(), i17, i18, dArr);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int getIntegers(int i17, int i18, int[] iArr) {
        this.f43996v8.checkThread();
        checkReleased();
        if (i18 <= iArr.length) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            return v86.arrayGetIntegers(v86.getV8RuntimePtr(), getHandle(), i17, i18, iArr);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int getStrings(int i17, int i18, java.lang.String[] strArr) {
        this.f43996v8.checkThread();
        checkReleased();
        if (i18 <= strArr.length) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            return v86.arrayGetStrings(v86.getV8RuntimePtr(), getHandle(), i17, i18, strArr);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public int getType() {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getArrayType(v86.getV8RuntimePtr(), getHandle());
    }

    public com.eclipsesource.mmv8.V8Array push(boolean z17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addArrayBooleanItem(v86.getV8RuntimePtr(), getHandle(), z17);
        return this;
    }

    public int getType(int i17, int i18) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getType(v86.getV8RuntimePtr(), getHandle(), i17, i18);
    }

    public com.eclipsesource.mmv8.V8Array push(double d17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addArrayDoubleItem(v86.getV8RuntimePtr(), getHandle(), d17);
        return this;
    }

    public com.eclipsesource.mmv8.V8Array push(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        if (str == null) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            v86.addArrayNullItem(v86.getV8RuntimePtr(), getHandle());
        } else if (str.equals(com.eclipsesource.mmv8.V8.getUndefined())) {
            com.eclipsesource.mmv8.V8 v87 = this.f43996v8;
            v87.addArrayUndefinedItem(v87.getV8RuntimePtr(), getHandle());
        } else {
            com.eclipsesource.mmv8.V8 v88 = this.f43996v8;
            v88.addArrayStringItem(v88.getV8RuntimePtr(), getHandle(), str);
        }
        return this;
    }

    public com.eclipsesource.mmv8.V8Array push(com.eclipsesource.mmv8.V8Value v8Value) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Value);
        if (v8Value == null) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            v86.addArrayNullItem(v86.getV8RuntimePtr(), getHandle());
        } else if (v8Value.equals(com.eclipsesource.mmv8.V8.getUndefined())) {
            com.eclipsesource.mmv8.V8 v87 = this.f43996v8;
            v87.addArrayUndefinedItem(v87.getV8RuntimePtr(), getHandle());
        } else {
            com.eclipsesource.mmv8.V8 v88 = this.f43996v8;
            v88.addArrayObjectItem(v88.getV8RuntimePtr(), getHandle(), v8Value.getHandle());
        }
        return this;
    }

    public com.eclipsesource.mmv8.V8Array push(java.lang.Object obj) {
        this.f43996v8.checkThread();
        checkReleased();
        if (obj instanceof com.eclipsesource.mmv8.V8Value) {
            this.f43996v8.checkRuntime((com.eclipsesource.mmv8.V8Value) obj);
        }
        if (obj == null) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            v86.addArrayNullItem(v86.getV8RuntimePtr(), getHandle());
        } else if (obj.equals(com.eclipsesource.mmv8.V8.getUndefined())) {
            com.eclipsesource.mmv8.V8 v87 = this.f43996v8;
            v87.addArrayUndefinedItem(v87.getV8RuntimePtr(), getHandle());
        } else if (obj instanceof java.lang.Double) {
            com.eclipsesource.mmv8.V8 v88 = this.f43996v8;
            v88.addArrayDoubleItem(v88.getV8RuntimePtr(), getHandle(), ((java.lang.Double) obj).doubleValue());
        } else if (obj instanceof java.lang.Integer) {
            com.eclipsesource.mmv8.V8 v89 = this.f43996v8;
            v89.addArrayIntItem(v89.getV8RuntimePtr(), getHandle(), ((java.lang.Integer) obj).intValue());
        } else if (obj instanceof java.lang.Float) {
            com.eclipsesource.mmv8.V8 v810 = this.f43996v8;
            v810.addArrayDoubleItem(v810.getV8RuntimePtr(), getHandle(), ((java.lang.Float) obj).doubleValue());
        } else if (obj instanceof java.lang.Number) {
            com.eclipsesource.mmv8.V8 v811 = this.f43996v8;
            v811.addArrayDoubleItem(v811.getV8RuntimePtr(), getHandle(), ((java.lang.Number) obj).doubleValue());
        } else if (obj instanceof java.lang.Boolean) {
            com.eclipsesource.mmv8.V8 v812 = this.f43996v8;
            v812.addArrayBooleanItem(v812.getV8RuntimePtr(), getHandle(), ((java.lang.Boolean) obj).booleanValue());
        } else if (obj instanceof java.lang.String) {
            com.eclipsesource.mmv8.V8 v813 = this.f43996v8;
            v813.addArrayStringItem(v813.getV8RuntimePtr(), getHandle(), (java.lang.String) obj);
        } else if (obj instanceof com.eclipsesource.mmv8.V8Value) {
            com.eclipsesource.mmv8.V8 v814 = this.f43996v8;
            v814.addArrayObjectItem(v814.getV8RuntimePtr(), getHandle(), ((com.eclipsesource.mmv8.V8Value) obj).getHandle());
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        return this;
    }
}
