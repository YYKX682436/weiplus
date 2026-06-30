package com.eclipsesource.mmv8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class V8ContextWrapper implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String TAG = "V8ContextWrapper";
    private final com.eclipsesource.mmv8.MultiContextV8 multiContextV8;
    private final com.eclipsesource.mmv8.V8Context proxy;
    private final com.eclipsesource.mmv8.V8ContextWrapper.V8ContextImpl v8ContextImpl;
    private final long v8ContextPtr;

    /* loaded from: classes7.dex */
    public final class V8ContextImpl extends com.eclipsesource.mmv8.V8Object implements com.eclipsesource.mmv8.V8Context {
        private final long ptr;

        public V8ContextImpl(long j17) {
            super(com.eclipsesource.mmv8.V8ContextWrapper.this.multiContextV8.getV8());
            this.objectHandle = this.f43996v8.getGlobalObject();
            this.ptr = j17;
        }

        private void shareObjectImpl(java.lang.String str, com.eclipsesource.mmv8.V8Context v8Context, java.lang.String str2) {
            checkReleased();
            this.f43996v8.checkThread();
            if (str == null || str.isEmpty() || v8Context == null) {
                return;
            }
            com.eclipsesource.mmv8.V8Object object = getObject(str);
            if (str2 != null && !str2.isEmpty()) {
                str = str2;
            }
            v8Context.add(str, object);
            object.release();
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void batchCompileAndGenCodeCacheForScripts(java.util.ArrayList<com.eclipsesource.mmv8.V8ScriptEvaluateRequest> arrayList, java.lang.String str) {
            this.f43996v8.batchCompileAndGenCodeCacheForScripts(arrayList, str);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.Object batchExecuteScripts(java.util.ArrayList<com.eclipsesource.mmv8.V8ScriptEvaluateRequest> arrayList, java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.batchExecuteScripts(arrayList, str, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeArrayScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public boolean executeBooleanScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeBooleanScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.String executeDebugScript(java.lang.String str, java.lang.String str2) {
            return this.f43996v8.executeDebugScript(str, str2);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public double executeDoubleScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeDoubleScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.Object executeFileScript(com.eclipsesource.mmv8.V8ScriptFileDescriptor v8ScriptFileDescriptor, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeFileScript(v8ScriptFileDescriptor, str, i17, str2, str3, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public int executeIntegerScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeIntegerScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeObjectScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.Object executeScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.String executeStringScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeStringScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void executeVoidScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            this.f43996v8.executeVoidScript(str, null, 0, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Object getGlobalObject() {
            return this;
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public long getPtr() {
            return this.ptr;
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.SharedV8ArrayBuffer newSharedV8ArrayBuffer(com.eclipsesource.mmv8.InSandboxByteBuffer inSandboxByteBuffer) {
            com.eclipsesource.mmv8.V8 v86 = this.f43996v8;
            java.nio.ByteBuffer asByteBuffer = inSandboxByteBuffer.asByteBuffer();
            java.util.Objects.requireNonNull(asByteBuffer);
            return new com.eclipsesource.mmv8.SharedV8ArrayBuffer(v86, asByteBuffer);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Array newV8Array() {
            return new com.eclipsesource.mmv8.V8Array(this.f43996v8);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8ArrayBuffer newV8ArrayBuffer(int i17) {
            return new com.eclipsesource.mmv8.V8ArrayBuffer(this.f43996v8, i17);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Function newV8Function(com.eclipsesource.mmv8.JavaCallback javaCallback) {
            return new com.eclipsesource.mmv8.V8Function(this.f43996v8, javaCallback);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Object newV8Object() {
            return new com.eclipsesource.mmv8.V8Object(this.f43996v8);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8TypedArray newV8TypedArray(com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer, int i17, int i18, int i19) {
            return new com.eclipsesource.mmv8.V8TypedArray(this.f43996v8, v8ArrayBuffer, i17, i18, i19);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void precompile(java.lang.String str, java.lang.String str2) {
            this.f43996v8.precompile(str, str2);
        }

        @Override // com.eclipsesource.mmv8.V8Value, com.eclipsesource.mmv8.Releasable
        public void release() {
            if (isReleased()) {
                return;
            }
            this.f43996v8.releaseObjRef(this);
            com.eclipsesource.mmv8.V8ContextWrapper.this.multiContextV8.releaseContext(com.eclipsesource.mmv8.V8ContextWrapper.this);
            this.released = true;
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void saveEntryPagePathToCachePath() {
            this.f43996v8.saveEntryPagePathToCachePath();
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void shareObject(java.lang.String str, com.eclipsesource.mmv8.V8Context v8Context) {
            shareObjectImpl(str, v8Context, null);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeArrayScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public boolean executeBooleanScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeBooleanScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public double executeDoubleScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeDoubleScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public int executeIntegerScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeIntegerScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeObjectScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.Object executeScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.String executeStringScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeStringScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void executeVoidScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            this.f43996v8.executeVoidScript(str, str2, i17, null, null, 0, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.SharedV8ArrayBuffer newSharedV8ArrayBuffer(com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer) {
            return new com.eclipsesource.mmv8.SharedV8ArrayBuffer(this.f43996v8, v8ArrayBuffer.getBackingStore());
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8ArrayBuffer newV8ArrayBuffer(java.nio.ByteBuffer byteBuffer) {
            return new com.eclipsesource.mmv8.V8ArrayBuffer(this.f43996v8, byteBuffer);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void shareObject(java.lang.String str, com.eclipsesource.mmv8.V8Context v8Context, java.lang.String str2) {
            shareObjectImpl(str, v8Context, str2);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeArrayScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public boolean executeBooleanScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeBooleanScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public double executeDoubleScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeDoubleScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public int executeIntegerScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeIntegerScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeObjectScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.Object executeScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public java.lang.String executeStringScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            return this.f43996v8.executeStringScript(str, str2, i17, str3, str4, i18, executeDetails);
        }

        @Override // com.eclipsesource.mmv8.V8Context
        public void executeVoidScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
            this.f43996v8.executeVoidScript(str, str2, i17, str3, str4, i18, executeDetails);
        }
    }

    public V8ContextWrapper(com.eclipsesource.mmv8.MultiContextV8 multiContextV8, long j17) {
        this.multiContextV8 = multiContextV8;
        this.v8ContextPtr = j17;
        enterContext();
        this.v8ContextImpl = new com.eclipsesource.mmv8.V8ContextWrapper.V8ContextImpl(j17);
        this.proxy = (com.eclipsesource.mmv8.V8Context) java.lang.reflect.Proxy.newProxyInstance(com.eclipsesource.mmv8.V8ContextWrapper.class.getClassLoader(), new java.lang.Class[]{com.eclipsesource.mmv8.V8Context.class}, this);
    }

    private void enterContext() {
        this.multiContextV8.enterContext(this);
    }

    public com.eclipsesource.mmv8.V8Context context() {
        return this.proxy;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.v8ContextPtr == ((com.eclipsesource.mmv8.V8ContextWrapper) obj).v8ContextPtr;
    }

    public long getPtr() {
        return this.v8ContextPtr;
    }

    public int hashCode() {
        long j17 = this.v8ContextPtr;
        return (int) (j17 ^ (j17 >>> 32));
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        if (!method.getName().equals("isReleased")) {
            this.v8ContextImpl.checkReleased();
            enterContext();
        }
        try {
            return method.invoke(this.v8ContextImpl, objArr);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw e17.getCause();
        }
    }
}
