package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public final class MultiContextNodeJS {
    private static final java.lang.String GLOBAL = "global";
    public com.eclipsesource.mmv8.MultiContextNodeJS.CreateStats createStats = null;
    private final com.eclipsesource.mmv8.V8Context mainContext;
    private final com.eclipsesource.mmv8.MultiContextV8 mv8;

    /* loaded from: classes7.dex */
    public static class CreateStats {
        public final long isolateCreateDurationMills;
        public final long mainContextCreateDurationMills;
        public final long nodeEnvCreateDurationMills;

        public CreateStats(long j17, long j18, long j19) {
            this.isolateCreateDurationMills = j17;
            this.mainContextCreateDurationMills = j18;
            this.nodeEnvCreateDurationMills = j19;
        }
    }

    private MultiContextNodeJS(com.eclipsesource.mmv8.MultiContextV8 multiContextV8, com.eclipsesource.mmv8.V8Context v8Context) {
        this.mv8 = multiContextV8;
        this.mainContext = v8Context;
    }

    public static com.eclipsesource.mmv8.MultiContextNodeJS createMultiContextNodeJS(int i17) {
        return createMultiContextNodeJS(i17, null, null, false);
    }

    public void closeUVLoop() {
        this.mv8.getV8().closeUVLoop();
    }

    public void debugDestroy() {
        this.mv8.debugDestroy();
    }

    public void debuggerMessageLoop() {
        this.mv8.debuggerMessageLoop();
    }

    public com.eclipsesource.mmv8.V8Context getMainContext() {
        return this.mainContext;
    }

    public com.eclipsesource.mmv8.MultiContextV8 getRuntime() {
        return this.mv8;
    }

    public boolean handleMessage(boolean z17) {
        this.mv8.getV8().checkThread();
        return this.mv8.getV8().pumpMessageLoop(z17);
    }

    public boolean isRunning() {
        this.mv8.getV8().checkThread();
        return this.mv8.getV8().isRunning();
    }

    public void nativeDispatch() {
        this.mv8.getV8().nativeDispatch();
    }

    public void nativeMessageLoop() {
        this.mv8.getV8().checkThread();
        this.mv8.getV8().nativeMessageLoop();
    }

    public void release() {
        this.mv8.getV8().checkThread();
        if (!this.mainContext.isReleased()) {
            this.mainContext.release();
        }
        this.mv8.release();
    }

    public void waitForDebugger(java.lang.String str, boolean z17) {
        this.mv8.waitForDebugger(str, z17);
    }

    public void wakeUpUVLoop() {
        this.mv8.getV8().wakeUpUVLoop();
    }

    public static com.eclipsesource.mmv8.MultiContextNodeJS createMultiContextNodeJS(int i17, boolean z17) {
        return createMultiContextNodeJS(i17, null, null, false, z17);
    }

    public static com.eclipsesource.mmv8.MultiContextNodeJS createMultiContextNodeJS(int i17, java.lang.String str, byte[] bArr, boolean z17) {
        return createMultiContextNodeJS(i17, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX, str, bArr, null, false, z17, 2);
    }

    public static com.eclipsesource.mmv8.MultiContextNodeJS createMultiContextNodeJS(int i17, java.lang.String str, byte[] bArr, boolean z17, boolean z18) {
        return createMultiContextNodeJS(i17, com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX, str, bArr, null, false, z17, 2, z18);
    }

    public static com.eclipsesource.mmv8.MultiContextNodeJS createMultiContextNodeJS(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.String str2, boolean z17, boolean z18, int i19) {
        return createMultiContextNodeJS(i17, i18, str, bArr, str2, z17, z18, i19, false);
    }

    public static com.eclipsesource.mmv8.MultiContextNodeJS createMultiContextNodeJS(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.String str2, boolean z17, boolean z18, int i19, boolean z19) {
        com.eclipsesource.mmv8.V8Context createContext;
        if (z19 && com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX != i18) {
            throw new java.lang.IllegalStateException("skipNode=true but snapshot path requested, mainContextSnapshotIndex=" + i18);
        }
        com.eclipsesource.mmv8.MultiContextV8 createMultiContextV8 = com.eclipsesource.mmv8.MultiContextV8.createMultiContextV8(GLOBAL, str, bArr, str2, z17, i19);
        long j17 = createMultiContextV8.getV8().isolateCreateDurationMills;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX != i18) {
            if (z17 && com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.NODE_MAIN_CONTEXT_INDEX != i18) {
                createMultiContextV8.release();
                throw new com.eclipsesource.mmv8.V8RuntimeException("Node is snapshot but main context snapshot index is not 0");
            }
            if (z17) {
                createContext = createMultiContextV8.createNodeMainContextFromSnapshot(i17);
            } else {
                createContext = createMultiContextV8.createContextFromSnapshot(i17, i18);
            }
            if (createContext == null) {
                createMultiContextV8.release();
                throw new com.eclipsesource.mmv8.V8RuntimeException("Create mainContext from snapshot fail");
            }
        } else {
            createContext = createMultiContextV8.createContext(i17);
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        com.eclipsesource.mmv8.MultiContextNodeJS multiContextNodeJS = new com.eclipsesource.mmv8.MultiContextNodeJS(createMultiContextV8, createContext);
        if (z18) {
            createMultiContextV8.getV8().enableNativeTrans();
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        try {
            com.eclipsesource.mmv8.V8TracerAccessible.beginSection("CreateNode");
            if (!createMultiContextV8.getV8Locker().hasLock()) {
                createMultiContextV8.getV8Locker().acquire();
            }
            createMultiContextV8.getV8().createNodeRuntime(z19);
            createMultiContextV8.getV8Locker().release();
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            multiContextNodeJS.createStats = new com.eclipsesource.mmv8.MultiContextNodeJS.CreateStats(j17, elapsedRealtime2, android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
            return multiContextNodeJS;
        } catch (java.lang.Throwable th6) {
            createMultiContextV8.getV8Locker().release();
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            throw th6;
        }
    }
}
