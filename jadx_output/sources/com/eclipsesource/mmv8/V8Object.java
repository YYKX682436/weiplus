package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8Object extends com.eclipsesource.mmv8.V8Value {

    /* loaded from: classes7.dex */
    public static class Undefined extends com.eclipsesource.mmv8.V8Object {
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
        public java.lang.Object executeFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public int executeIntegerFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public java.lang.Object executeJSFunction(java.lang.String str, java.lang.Object... objArr) {
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

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Array getArray(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public boolean getBoolean(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public double getDouble(java.lang.String str) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public int getInteger(java.lang.String str) {
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

        @Override // com.eclipsesource.mmv8.V8Object
        public java.lang.String toString() {
            return "undefined";
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, double d17) {
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

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object registerJavaMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class<?>[] clsArr, boolean z17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Value
        public com.eclipsesource.mmv8.V8Object.Undefined twin() {
            return (com.eclipsesource.mmv8.V8Object.Undefined) super.twin();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, java.lang.String str2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.eclipsesource.mmv8.V8Object
        public com.eclipsesource.mmv8.V8Object add(java.lang.String str, com.eclipsesource.mmv8.V8Value v8Value) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public V8Object(com.eclipsesource.mmv8.V8 v86) {
        this(v86, null);
    }

    private void checkKey(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Key cannot be null");
        }
    }

    public com.eclipsesource.mmv8.V8Object add(java.lang.String str, int i17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.add(v86.getV8RuntimePtr(), this.objectHandle, str, i17);
        return this;
    }

    public com.eclipsesource.mmv8.V8Object addNull(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addNull(v86.getV8RuntimePtr(), this.objectHandle, str);
        return this;
    }

    public com.eclipsesource.mmv8.V8Object addUndefined(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.addUndefined(v86.getV8RuntimePtr(), this.objectHandle, str);
        return this;
    }

    public boolean contains(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.contains(v86.getV8RuntimePtr(), this.objectHandle, str);
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Value createTwin() {
        return new com.eclipsesource.mmv8.V8Object(this.f43996v8);
    }

    public com.eclipsesource.mmv8.V8Array executeArrayFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        java.lang.Object executeFunction = v86.executeFunction(v86.getV8RuntimePtr(), 5, this.objectHandle, str, handle);
        if (executeFunction instanceof com.eclipsesource.mmv8.V8Array) {
            return (com.eclipsesource.mmv8.V8Array) executeFunction;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public boolean executeBooleanFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.executeBooleanFunction(v86.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public double executeDoubleFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.executeDoubleFunction(v86.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public java.lang.Object executeFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.executeFunction(v86.getV8RuntimePtr(), 0, this.objectHandle, str, handle);
    }

    public int executeIntegerFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.executeIntegerFunction(v86.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public java.lang.Object executeJSFunction(java.lang.String str) {
        return executeFunction(str, null);
    }

    public com.eclipsesource.mmv8.V8Object executeObjectFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        java.lang.Object executeFunction = v86.executeFunction(v86.getV8RuntimePtr(), 6, this.objectHandle, str, handle);
        if (executeFunction instanceof com.eclipsesource.mmv8.V8Object) {
            return (com.eclipsesource.mmv8.V8Object) executeFunction;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public java.lang.String executeStringFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.executeStringFunction(v86.getV8RuntimePtr(), getHandle(), str, handle);
    }

    public void executeVoidFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Array);
        long handle = v8Array == null ? 0L : v8Array.getHandle();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.executeVoidFunction(v86.getV8RuntimePtr(), this.objectHandle, str, handle);
    }

    public java.lang.Object get(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.get(v86.getV8RuntimePtr(), 6, this.objectHandle, str);
    }

    public com.eclipsesource.mmv8.V8Array getArray(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        java.lang.Object obj = v86.get(v86.getV8RuntimePtr(), 5, this.objectHandle, str);
        if (obj == null || (obj instanceof com.eclipsesource.mmv8.V8Array)) {
            return (com.eclipsesource.mmv8.V8Array) obj;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public boolean getBoolean(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getBoolean(v86.getV8RuntimePtr(), this.objectHandle, str);
    }

    public double getDouble(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getDouble(v86.getV8RuntimePtr(), this.objectHandle, str);
    }

    public int getInteger(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getInteger(v86.getV8RuntimePtr(), this.objectHandle, str);
    }

    public java.lang.String[] getKeys() {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getKeys(v86.getV8RuntimePtr(), this.objectHandle);
    }

    public com.eclipsesource.mmv8.V8Object getObject(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        java.lang.Object obj = v86.get(v86.getV8RuntimePtr(), 6, this.objectHandle, str);
        if (obj == null || (obj instanceof com.eclipsesource.mmv8.V8Object)) {
            return (com.eclipsesource.mmv8.V8Object) obj;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public java.lang.String getString(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getString(v86.getV8RuntimePtr(), this.objectHandle, str);
    }

    public int getType(java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        checkKey(str);
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.getType(v86.getV8RuntimePtr(), this.objectHandle, str);
    }

    public com.eclipsesource.mmv8.V8Object registerJavaMethod(com.eclipsesource.mmv8.JavaCallback javaCallback, java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.registerCallback(javaCallback, getHandle(), str);
        return this;
    }

    public com.eclipsesource.mmv8.V8Object setPrototype(com.eclipsesource.mmv8.V8Object v8Object) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.setPrototype(v86.getV8RuntimePtr(), this.objectHandle, v8Object.getHandle());
        return this;
    }

    public java.lang.String toString() {
        if (isReleased() || this.f43996v8.isReleased()) {
            return "[Object released]";
        }
        this.f43996v8.checkThread();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        return v86.toString(v86.getV8RuntimePtr(), getHandle());
    }

    public V8Object(com.eclipsesource.mmv8.V8 v86, java.lang.Object obj) {
        super(v86);
        if (v86 != null) {
            this.f43996v8.checkThread();
            initialize(this.f43996v8.getV8RuntimePtr(), obj);
        }
    }

    public java.lang.Object executeJSFunction(java.lang.String str, java.lang.Object... objArr) {
        if (objArr == null) {
            return executeFunction(str, null);
        }
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.f43996v8.getRuntime());
        try {
            for (java.lang.Object obj : objArr) {
                if (obj == null) {
                    v8Array.pushNull();
                } else if (obj instanceof com.eclipsesource.mmv8.V8Value) {
                    v8Array.push((com.eclipsesource.mmv8.V8Value) obj);
                } else if (obj instanceof java.lang.Integer) {
                    v8Array.push((java.lang.Integer) obj);
                } else if (obj instanceof java.lang.Double) {
                    v8Array.push((java.lang.Double) obj);
                } else if (obj instanceof java.lang.Long) {
                    v8Array.push(((java.lang.Long) obj).doubleValue());
                } else if (obj instanceof java.lang.Float) {
                    v8Array.push(((java.lang.Float) obj).floatValue());
                } else if (obj instanceof java.lang.Boolean) {
                    v8Array.push((java.lang.Boolean) obj);
                } else if (obj instanceof java.lang.String) {
                    v8Array.push((java.lang.String) obj);
                } else {
                    throw new java.lang.IllegalArgumentException("Unsupported Object of type: " + obj.getClass());
                }
            }
            return executeFunction(str, v8Array);
        } finally {
            v8Array.release();
        }
    }

    @Override // com.eclipsesource.mmv8.V8Value
    public com.eclipsesource.mmv8.V8Object twin() {
        return (com.eclipsesource.mmv8.V8Object) super.twin();
    }

    public com.eclipsesource.mmv8.V8Object add(java.lang.String str, boolean z17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.add(v86.getV8RuntimePtr(), this.objectHandle, str, z17);
        return this;
    }

    public com.eclipsesource.mmv8.V8Object registerJavaMethod(com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback, java.lang.String str) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.registerVoidCallback(javaVoidCallback, getHandle(), str);
        return this;
    }

    public V8Object() {
    }

    public com.eclipsesource.mmv8.V8Object add(java.lang.String str, double d17) {
        this.f43996v8.checkThread();
        checkReleased();
        com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
        v86.add(v86.getV8RuntimePtr(), this.objectHandle, str, d17);
        return this;
    }

    public com.eclipsesource.mmv8.V8Object registerJavaMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class<?>[] clsArr) {
        return registerJavaMethod(obj, str, str2, clsArr, false);
    }

    public com.eclipsesource.mmv8.V8Object registerJavaMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class<?>[] clsArr, boolean z17) {
        this.f43996v8.checkThread();
        checkReleased();
        try {
            java.lang.reflect.Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            this.f43996v8.registerCallback(obj, method, getHandle(), str2, z17);
            return this;
        } catch (java.lang.NoSuchMethodException e17) {
            throw new java.lang.IllegalStateException(e17);
        } catch (java.lang.SecurityException e18) {
            throw new java.lang.IllegalStateException(e18);
        }
    }

    public com.eclipsesource.mmv8.V8Object add(java.lang.String str, java.lang.String str2) {
        this.f43996v8.checkThread();
        checkReleased();
        if (str2 == null) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            v86.addNull(v86.getV8RuntimePtr(), this.objectHandle, str);
        } else if (str2.equals(com.eclipsesource.mmv8.V8.getUndefined())) {
            com.eclipsesource.mmv8.V8 v87 = this.f43996v8;
            v87.addUndefined(v87.getV8RuntimePtr(), this.objectHandle, str);
        } else {
            com.eclipsesource.mmv8.V8 v88 = this.f43996v8;
            v88.add(v88.getV8RuntimePtr(), this.objectHandle, str, str2);
        }
        return this;
    }

    public com.eclipsesource.mmv8.V8Object add(java.lang.String str, com.eclipsesource.mmv8.V8Value v8Value) {
        this.f43996v8.checkThread();
        checkReleased();
        this.f43996v8.checkRuntime(v8Value);
        if (v8Value == null) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            v86.addNull(v86.getV8RuntimePtr(), this.objectHandle, str);
        } else if (v8Value.equals(com.eclipsesource.mmv8.V8.getUndefined())) {
            com.eclipsesource.mmv8.V8 v87 = this.f43996v8;
            v87.addUndefined(v87.getV8RuntimePtr(), this.objectHandle, str);
        } else {
            com.eclipsesource.mmv8.V8 v88 = this.f43996v8;
            v88.addObject(v88.getV8RuntimePtr(), this.objectHandle, str, v8Value.getHandle());
        }
        return this;
    }
}
