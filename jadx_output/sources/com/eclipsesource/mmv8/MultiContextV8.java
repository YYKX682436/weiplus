package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public final class MultiContextV8 {
    private final com.eclipsesource.mmv8.V8ContextSessionMgr contextSessionMgr;

    /* renamed from: v8, reason: collision with root package name */
    private final com.eclipsesource.mmv8.V8 f43993v8;

    private MultiContextV8() {
        this(null);
    }

    public static com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8() {
        return new com.eclipsesource.mmv8.MultiContextV8();
    }

    public com.eclipsesource.mmv8.V8Context createContext(int i17) {
        try {
            com.eclipsesource.mmv8.V8TracerAccessible.beginSection("CreateContext");
            long createV8Context = this.f43993v8.createV8Context(i17);
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            return new com.eclipsesource.mmv8.V8ContextWrapper(this, createV8Context).context();
        } catch (java.lang.Throwable th6) {
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            throw th6;
        }
    }

    public com.eclipsesource.mmv8.V8Context createContextFromSnapshot(int i17, int i18) {
        try {
            com.eclipsesource.mmv8.V8TracerAccessible.beginSection("CreateContextFromSnapshot");
            long createV8ContextFromSnapshot = this.f43993v8.createV8ContextFromSnapshot(i17, i18);
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            if (0 == createV8ContextFromSnapshot) {
                return null;
            }
            return new com.eclipsesource.mmv8.V8ContextWrapper(this, createV8ContextFromSnapshot).context();
        } catch (java.lang.Throwable th6) {
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            throw th6;
        }
    }

    public com.eclipsesource.mmv8.utils.MemoryManager createMemoryManager() {
        return new com.eclipsesource.mmv8.utils.MemoryManager(this.f43993v8);
    }

    public com.eclipsesource.mmv8.V8Context createNodeMainContextFromSnapshot(int i17) {
        try {
            com.eclipsesource.mmv8.V8TracerAccessible.beginSection("CreateNodeMainContextFromSnapshot");
            long createV8NodeMainContextFromSnapshot = this.f43993v8.createV8NodeMainContextFromSnapshot(i17);
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            if (0 == createV8NodeMainContextFromSnapshot) {
                return null;
            }
            return new com.eclipsesource.mmv8.V8ContextWrapper(this, createV8NodeMainContextFromSnapshot).context();
        } catch (java.lang.Throwable th6) {
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            throw th6;
        }
    }

    public void debugDestroy() {
        this.f43993v8.debugDestroy();
    }

    public void debuggerMessageLoop() {
        this.f43993v8.debuggerMessageLoop();
    }

    public void enterContext(com.eclipsesource.mmv8.V8ContextWrapper v8ContextWrapper) {
        this.contextSessionMgr.enterContext(v8ContextWrapper);
    }

    public long getIsolatePtr() {
        return this.f43993v8.getIsolatePtr();
    }

    public long getUVLoopPtr() {
        return this.f43993v8.getUVLoopPtr();
    }

    public com.eclipsesource.mmv8.V8 getV8() {
        return this.f43993v8;
    }

    public com.eclipsesource.mmv8.V8Locker getV8Locker() {
        return this.f43993v8.getLocker();
    }

    public void markSnapshotNotNeed() {
        this.f43993v8.markSnapshotNotNeed();
    }

    public void memoryPressureNotification(int i17) {
        this.f43993v8.memoryPressureNotification(i17);
    }

    public void release() {
        this.f43993v8.release();
    }

    public void releaseContext(com.eclipsesource.mmv8.V8ContextWrapper v8ContextWrapper) {
        this.contextSessionMgr.releaseContext(v8ContextWrapper);
    }

    public void setMinimalCodeLength(int i17) {
        this.f43993v8.setMinimalCodeLength(i17);
    }

    public void waitForDebugger(java.lang.String str, boolean z17) {
        this.f43993v8.waitForDebugger(str, z17);
    }

    public void waitForDebuggerWithContexts(java.lang.String str, long[] jArr, java.lang.String[] strArr) {
        this.f43993v8.waitForDebuggerWithContexts(str, jArr, strArr);
    }

    private MultiContextV8(java.lang.String str) {
        this(str, null, null, 2);
    }

    public static com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8(java.lang.String str) {
        return new com.eclipsesource.mmv8.MultiContextV8(str);
    }

    private MultiContextV8(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        this(str, str2, bArr, null, false, i17);
    }

    public static com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8(java.lang.String str, byte[] bArr, int i17) {
        return new com.eclipsesource.mmv8.MultiContextV8(null, str, bArr, i17);
    }

    private MultiContextV8(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, boolean z17, int i17) {
        this.f43993v8 = com.eclipsesource.mmv8.V8.createV8Runtime(str, null, false, str2, bArr, str3, z17, i17);
        this.contextSessionMgr = new com.eclipsesource.mmv8.V8ContextSessionMgr(getV8());
    }

    public static com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        return new com.eclipsesource.mmv8.MultiContextV8(str, str2, bArr, i17);
    }

    public static com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, boolean z17, int i17) {
        return new com.eclipsesource.mmv8.MultiContextV8(str, str2, bArr, str3, z17, i17);
    }
}
