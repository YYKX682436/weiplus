package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8 extends com.eclipsesource.mmv8.V8Object {
    public static final int MEMORY_PRESSURE_LEVEL_CRITICAL = 2;
    public static final int MEMORY_PRESSURE_LEVEL_MODERATE = 1;
    public static final int MEMORY_PRESSURE_LEVEL_NONE = 0;
    private static boolean isV8TrapHandlerEnabled = false;
    public static final int kMicrotasksPolicyAuto = 2;
    public static final int kMicrotasksPolicyExplicit = 0;
    public static final int kMicrotasksPolicyScoped = 1;
    private static boolean nativeLibraryLoaded = false;
    private static java.lang.Error nativeLoadError = null;
    private static java.lang.Exception nativeLoadException = null;
    private static volatile int runtimeCounter = 0;
    private static java.lang.String v8Flags = "";
    com.eclipsesource.mmv8.V8.JavaTaskScheduler _javaTaskScheduler;
    private java.util.Map<java.lang.String, java.lang.Object> data;
    private com.eclipsesource.mmv8.utils.V8Map<com.eclipsesource.mmv8.utils.V8Executor> executors;
    private boolean forceTerminateExecutors;
    private java.util.Map<java.lang.Long, com.eclipsesource.mmv8.V8.MethodDescriptor> functionRegistry;
    protected final long isolateCreateDurationMills;
    private final com.eclipsesource.mmv8.V8Locker locker;
    java.lang.Runnable nativeJavaCallback_;
    private long objectReferences;
    private java.util.LinkedList<com.eclipsesource.mmv8.ReferenceHandler> referenceHandlers;
    private java.util.LinkedList<com.eclipsesource.mmv8.utils.V8Runnable> releaseHandlers;
    private java.util.List<com.eclipsesource.mmv8.Releasable> resources;
    private long v8RuntimePtr;
    protected java.util.Map<java.lang.Long, com.eclipsesource.mmv8.V8Value> v8WeakReferences;
    private static final java.lang.Object lock = new java.lang.Object();
    private static com.eclipsesource.mmv8.V8Value undefined = new com.eclipsesource.mmv8.V8Object.Undefined();
    private static java.lang.Object invalid = new java.lang.Object();
    private static java.lang.String v8TracingConfig = "";
    private static java.lang.String v8TracingResultFile = android.os.Environment.getExternalStorageDirectory().getPath() + "v8_trace.json";
    private static boolean v8TracingAutoStart = false;
    private static java.lang.String[] v8TracingCategories = null;
    private static boolean v8TracingRunning = false;
    private static com.eclipsesource.mmv8.ILoadLibraryDelegate sLoadLibraryDelegate = new com.eclipsesource.mmv8.ILoadLibraryDelegate() { // from class: com.eclipsesource.mmv8.V8.1
        @Override // com.eclipsesource.mmv8.ILoadLibraryDelegate
        public void loadLibrary(java.lang.String str) {
            com.eclipsesource.mmv8.LibraryLoader.loadLibrary(str);
        }
    };
    private static java.util.concurrent.atomic.AtomicBoolean sCachedProtectCreateContextFromSnapshot = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* loaded from: classes7.dex */
    public interface JavaTaskScheduler {
        void Schedule(java.lang.Runnable runnable);
    }

    /* loaded from: classes7.dex */
    public class MethodDescriptor {
        com.eclipsesource.mmv8.JavaCallback callback;
        boolean includeReceiver;
        java.lang.reflect.Method method;
        java.lang.Object object;
        com.eclipsesource.mmv8.JavaVoidCallback voidCallback;

        private MethodDescriptor() {
        }
    }

    public V8() {
        this(null, true, null, null, false, 2);
    }

    private native void _acquireLock(long j17);

    private native void _add(long j17, long j18, java.lang.String str, double d17);

    private native void _add(long j17, long j18, java.lang.String str, int i17);

    private native void _add(long j17, long j18, java.lang.String str, java.lang.String str2);

    private native void _add(long j17, long j18, java.lang.String str, boolean z17);

    private native void _addArrayBooleanItem(long j17, long j18, boolean z17);

    private native void _addArrayDoubleItem(long j17, long j18, double d17);

    private native void _addArrayIntItem(long j17, long j18, int i17);

    private native void _addArrayNullItem(long j17, long j18);

    private native void _addArrayObjectItem(long j17, long j18, long j19);

    private native void _addArrayStringItem(long j17, long j18, java.lang.String str);

    private native void _addArrayUndefinedItem(long j17, long j18);

    private native void _addNull(long j17, long j18, java.lang.String str);

    private native void _addObject(long j17, long j18, java.lang.String str, long j19);

    private native void _addUndefined(long j17, long j18, java.lang.String str);

    private native java.lang.Object _arrayGet(long j17, int i17, long j18, int i18);

    private native boolean _arrayGetBoolean(long j17, long j18, int i17);

    private native int _arrayGetBooleans(long j17, long j18, int i17, int i18, boolean[] zArr);

    private native boolean[] _arrayGetBooleans(long j17, long j18, int i17, int i18);

    private native byte _arrayGetByte(long j17, long j18, int i17);

    private native int _arrayGetBytes(long j17, long j18, int i17, int i18, byte[] bArr);

    private native byte[] _arrayGetBytes(long j17, long j18, int i17, int i18);

    private native double _arrayGetDouble(long j17, long j18, int i17);

    private native int _arrayGetDoubles(long j17, long j18, int i17, int i18, double[] dArr);

    private native double[] _arrayGetDoubles(long j17, long j18, int i17, int i18);

    private native int _arrayGetInteger(long j17, long j18, int i17);

    private native int _arrayGetIntegers(long j17, long j18, int i17, int i18, int[] iArr);

    private native int[] _arrayGetIntegers(long j17, long j18, int i17, int i18);

    private native int _arrayGetSize(long j17, long j18);

    private native java.lang.String _arrayGetString(long j17, long j18, int i17);

    private native int _arrayGetStrings(long j17, long j18, int i17, int i18, java.lang.String[] strArr);

    private native java.lang.String[] _arrayGetStrings(long j17, long j18, int i17, int i18);

    private native java.lang.Object _batchCompileAndGenCodeCacheForScripts(long j17, com.eclipsesource.mmv8.V8ScriptEvaluateRequest[] v8ScriptEvaluateRequestArr, java.lang.String str);

    private native java.lang.Object _batchExecuteScripts(long j17, com.eclipsesource.mmv8.V8ScriptEvaluateRequest[] v8ScriptEvaluateRequestArr, java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native void _closeUVLoop(long j17);

    private native boolean _contains(long j17, long j18, java.lang.String str);

    private native long _createContext(long j17, int i17);

    private native long _createContextFromSnapshot(long j17, int i17, int i18);

    private native long _createIsolate(java.lang.String str, boolean z17, byte[] bArr, java.lang.String str2, boolean z18, int i17);

    private native long _createNodeMainContextFromSnapshot(long j17, int i17);

    public static native com.eclipsesource.mmv8.snapshot.CreateSnapshotResult _createSnapshot(com.eclipsesource.mmv8.snapshot.CreateSnapshotParams createSnapshotParams);

    private native void _createTwin(long j17, long j18, long j19);

    private native java.nio.ByteBuffer _createV8ArrayBufferBackingStore(long j17, long j18, int i17);

    private static native void _debugDestroy(long j17);

    private static native void _debugMessageLoop(long j17);

    private static native void _enableNativeTrans(long j17);

    private native boolean _equals(long j17, long j18, long j19);

    private native boolean _executeBooleanFunction(long j17, long j18, java.lang.String str, long j19);

    private native boolean _executeBooleanScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private static native java.lang.String _executeDebugScript(long j17, java.lang.String str, java.lang.String str2);

    private native double _executeDoubleFunction(long j17, long j18, java.lang.String str, long j19);

    private native double _executeDoubleScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native java.lang.Object _executeFileScript(long j17, int i17, com.eclipsesource.mmv8.V8ScriptFileDescriptor v8ScriptFileDescriptor, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native java.lang.Object _executeFunction(long j17, int i17, long j18, java.lang.String str, long j19);

    private native java.lang.Object _executeFunction(long j17, long j18, long j19, long j27);

    private native int _executeIntegerFunction(long j17, long j18, java.lang.String str, long j19);

    private native int _executeIntegerScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native java.lang.Object _executeScript(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native java.lang.String _executeStringFunction(long j17, long j18, java.lang.String str, long j19);

    private native java.lang.String _executeStringScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native void _executeVoidFunction(long j17, long j18, java.lang.String str, long j19);

    private native void _executeVoidScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    private native java.lang.Object _get(long j17, int i17, long j18, java.lang.String str);

    private native int _getArrayType(long j17, long j18);

    private native java.nio.ByteBuffer _getBackingStore(long j17, long j18);

    private native boolean _getBoolean(long j17, long j18, java.lang.String str);

    private native long _getBuildID();

    private native double _getDouble(long j17, long j18, java.lang.String str);

    private native long _getGlobalObject(long j17);

    private native int _getInteger(long j17, long j18, java.lang.String str);

    private native long _getIsolatePtr(long j17);

    private native java.lang.String[] _getKeys(long j17, long j18);

    private static native long _getMyLoopIdleTimeMs(long j17);

    private static native long _getNativeTransManager();

    private native java.lang.String _getString(long j17, long j18, java.lang.String str);

    private native int _getType(long j17, long j18);

    private native int _getType(long j17, long j18, int i17);

    private native int _getType(long j17, long j18, int i17, int i18);

    private native int _getType(long j17, long j18, java.lang.String str);

    private native long _getUVLoopPtr(long j17);

    private static native java.lang.String _getVersion();

    private native int _identityHash(long j17, long j18);

    @java.lang.Deprecated
    private native long _initNewSharedV8ArrayBuffer(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    private native long _initNewV8Array(long j17);

    private native long _initNewV8ArrayBuffer(long j17, int i17);

    private native long _initNewV8ArrayBuffer(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    private native long _initNewV8Float32Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8Float64Array(long j17, long j18, int i17, int i18);

    private native long[] _initNewV8Function(long j17);

    private native long _initNewV8Int16Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8Int32Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8Int8Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8Object(long j17);

    private native long _initNewV8UInt16Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8UInt32Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8UInt8Array(long j17, long j18, int i17, int i18);

    private native long _initNewV8UInt8ClampedArray(long j17, long j18, int i17, int i18);

    private static native boolean _isRunning(long j17);

    private native boolean _isWeak(long j17, long j18);

    private native void _lowMemoryNotification(long j17);

    private static native void _markSnapshotNotNeed(long j17);

    private native void _memoryPressureNotification(long j17, int i17);

    private static native void _nativeDispatch(long j17);

    private static native void _nativeLoopStop(long j17);

    private static native void _nativeMessageLoop(long j17);

    private static native void _nativeTransBroadcastMessage(int i17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void _nativeTransHandleMessage(long j17);

    private static native void _nativeTransPostMessage(int i17, java.lang.String str);

    private static native void _nativeTransSetJavaSchedule(long j17);

    private static native void _precompile(long j17, java.lang.String str, java.lang.String str2);

    private static native void _protectCreateContextFromSnapshot();

    private static native boolean _pumpMessageLoop(long j17, boolean z17);

    private static native void _pumpMessageLoopDirect(long j17);

    private native long _registerJavaMethod(long j17, long j18, java.lang.String str, boolean z17);

    private native void _release(long j17, long j18);

    private native void _releaseContext(long j17, long j18);

    private native void _releaseLock(long j17);

    private native void _releaseMethodDescriptor(long j17, long j18);

    private native void _releaseRuntime(long j17);

    private native boolean _sameValue(long j17, long j18, long j19);

    private static native void _saveEntryPagePathToCachePath(long j17);

    private static native void _setBreakOnStart(boolean z17);

    private native void _setCodeCacheDir(long j17, java.lang.String str);

    private native void _setDelaySaveCodeCache(long j17, boolean z17);

    private static native void _setFlags(java.lang.String str);

    private native void _setMinimalCodeLength(long j17, int i17);

    private native void _setPrototype(long j17, long j18, long j19);

    private native void _setWeak(long j17, long j18);

    private static native void _startNodeJS(long j17, boolean z17);

    private native boolean _strictEquals(long j17, long j18, long j19);

    private native void _switchContext(long j17, long j18);

    private native void _terminateExecution(long j17);

    private native java.lang.String _toString(long j17, long j18);

    private static native void _waitForDebuger(long j17, java.lang.String str, boolean z17);

    private static native void _waitForDebuggerWithContexts(long j17, java.lang.String str, long[] jArr, java.lang.String[] strArr);

    private native void _wakeUpUVLoop(long j17);

    public static native java.nio.ByteBuffer allocateDirectByteBufferInSandbox(int i17);

    public static void broadcastMessage(int i17, java.lang.String str) {
        _nativeTransBroadcastMessage(i17, str);
    }

    private void checkArgs(java.lang.Object[] objArr) {
        for (java.lang.Object obj : objArr) {
            if (obj == invalid) {
                throw new java.lang.IllegalArgumentException("argument type mismatch");
            }
        }
    }

    private static void checkNativeLibraryLoaded() {
        if (nativeLibraryLoaded) {
            return;
        }
        if (nativeLoadError != null) {
            throw new java.lang.IllegalStateException("J2V8 native library not loaded", nativeLoadError);
        }
        if (nativeLoadException == null) {
            throw new java.lang.IllegalStateException("J2V8 native library not loaded");
        }
        throw new java.lang.IllegalStateException("J2V8 native library not loaded", nativeLoadException);
    }

    private java.lang.Object checkResult(java.lang.Object obj) {
        if (obj == null) {
            return obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.String)) {
            return obj;
        }
        if (obj instanceof com.eclipsesource.mmv8.V8Value) {
            if (((com.eclipsesource.mmv8.V8Value) obj).isReleased()) {
                throw new com.eclipsesource.mmv8.V8RuntimeException("V8Value already released");
            }
            return obj;
        }
        throw new com.eclipsesource.mmv8.V8RuntimeException("Unknown return type: " + obj.getClass());
    }

    public static void checkScript(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Script is null");
        }
    }

    public static native void clearSnapshotCacheIfIdle();

    public static native void createNodeSnapshot(java.lang.String str);

    public static com.eclipsesource.mmv8.V8 createV8Runtime() {
        return createV8Runtime(null, null);
    }

    public static void enableTrapHandler(boolean z17) {
        isV8TrapHandlerEnabled = z17;
    }

    public static int getActiveRuntimes() {
        return runtimeCounter;
    }

    private java.lang.Object[] getArgs(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor, com.eclipsesource.mmv8.V8Array v8Array, boolean z17) {
        int length = methodDescriptor.method.getParameterTypes().length;
        int i17 = z17 ? length - 1 : length;
        java.lang.Object[] defaultValues = setDefaultValues(new java.lang.Object[length], methodDescriptor.method.getParameterTypes(), v8Object, methodDescriptor.includeReceiver);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        populateParamters(v8Array, i17, defaultValues, arrayList, methodDescriptor.includeReceiver);
        if (z17) {
            java.lang.Object varArgContainer = getVarArgContainer(methodDescriptor.method.getParameterTypes(), arrayList.size());
            java.lang.System.arraycopy(arrayList.toArray(), 0, varArgContainer, 0, arrayList.size());
            defaultValues[i17] = varArgContainer;
        }
        return defaultValues;
    }

    private java.lang.Object getArrayItem(com.eclipsesource.mmv8.V8Array v8Array, int i17) {
        try {
            int type = v8Array.getType(i17);
            if (type == 10) {
                return v8Array.get(i17);
            }
            if (type == 99) {
                return getUndefined();
            }
            switch (type) {
                case 1:
                    return java.lang.Integer.valueOf(v8Array.getInteger(i17));
                case 2:
                    return java.lang.Double.valueOf(v8Array.getDouble(i17));
                case 3:
                    return java.lang.Boolean.valueOf(v8Array.getBoolean(i17));
                case 4:
                    return v8Array.getString(i17);
                case 5:
                case 8:
                    return v8Array.getArray(i17);
                case 6:
                    return v8Array.getObject(i17);
                case 7:
                    return v8Array.getObject(i17);
                default:
                    return null;
            }
        } catch (com.eclipsesource.mmv8.V8ResultUndefined unused) {
            return null;
        }
    }

    private java.lang.Object getDefaultValue(java.lang.Class<?> cls) {
        return cls.equals(com.eclipsesource.mmv8.V8Object.class) ? new com.eclipsesource.mmv8.V8Object.Undefined() : cls.equals(com.eclipsesource.mmv8.V8Array.class) ? new com.eclipsesource.mmv8.V8Array.Undefined() : invalid;
    }

    public static java.lang.String getFlags() {
        return v8Flags;
    }

    public static long getNativeTransManager() {
        return _getNativeTransManager();
    }

    public static native java.lang.String getNodeVersion();

    public static java.lang.String getSCMRevision() {
        return "Unknown revision ID";
    }

    public static java.lang.String[] getTracingCategories() {
        return v8TracingCategories;
    }

    public static java.lang.String getTracingResultFile() {
        return v8TracingResultFile;
    }

    public static com.eclipsesource.mmv8.V8Value getUndefined() {
        return undefined;
    }

    public static java.lang.String getV8Version() {
        return _getVersion();
    }

    private java.lang.Object getVarArgContainer(java.lang.Class<?>[] clsArr, int i17) {
        java.lang.Class<?> cls = clsArr[clsArr.length - 1];
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return java.lang.reflect.Array.newInstance(cls, i17);
    }

    public static boolean isLoaded() {
        return nativeLibraryLoaded;
    }

    public static boolean isTracingAutoStart() {
        return v8TracingAutoStart;
    }

    public static boolean isTrapHandlerEnabled() {
        return isV8TrapHandlerEnabled;
    }

    public static boolean isV8TracingRunning() {
        return v8TracingRunning;
    }

    private boolean isVoidMethod(java.lang.reflect.Method method) {
        return method.getReturnType().equals(java.lang.Void.TYPE);
    }

    private static synchronized void load(java.lang.String str) {
        synchronized (com.eclipsesource.mmv8.V8.class) {
            try {
                try {
                    try {
                        com.eclipsesource.mmv8.V8TracerAccessible.beginSection("LoadSo");
                        sLoadLibraryDelegate.loadLibrary(str);
                        nativeLibraryLoaded = true;
                    } catch (java.lang.Error e17) {
                        nativeLoadError = e17;
                    }
                } catch (java.lang.Exception e18) {
                    nativeLoadException = e18;
                }
            } finally {
                com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            }
        }
    }

    private void notifyReferenceCreated(com.eclipsesource.mmv8.V8Value v8Value) {
        java.util.Iterator<com.eclipsesource.mmv8.ReferenceHandler> it = this.referenceHandlers.iterator();
        while (it.hasNext()) {
            it.next().v8HandleCreated(v8Value);
        }
    }

    private void notifyReferenceDisposed(com.eclipsesource.mmv8.V8Value v8Value) {
        java.util.Iterator<com.eclipsesource.mmv8.ReferenceHandler> it = this.referenceHandlers.iterator();
        while (it.hasNext()) {
            it.next().v8HandleDisposed(v8Value);
        }
    }

    private void notifyReleaseHandlers(com.eclipsesource.mmv8.V8 v86) {
        java.util.Iterator<com.eclipsesource.mmv8.utils.V8Runnable> it = this.releaseHandlers.iterator();
        while (it.hasNext()) {
            it.next().run(v86);
        }
    }

    public static void onStartV8Tracing() {
        v8TracingRunning = true;
    }

    public static void onStopV8Tracing() {
        v8TracingRunning = false;
    }

    private void populateParamters(com.eclipsesource.mmv8.V8Array v8Array, int i17, java.lang.Object[] objArr, java.util.List<java.lang.Object> list, boolean z17) {
        for (int i18 = z17 ? 1 : 0; i18 < v8Array.length() + (z17 ? 1 : 0); i18++) {
            if (i18 >= i17) {
                list.add(getArrayItem(v8Array, i18 - (z17 ? 1 : 0)));
            } else {
                objArr[i18] = getArrayItem(v8Array, i18 - (z17 ? 1 : 0));
            }
        }
    }

    public static void postMessage(int i17, java.lang.String str) {
        _nativeTransPostMessage(i17, str);
    }

    public static void protectCreateContextFromSnapshot() {
        if (nativeLibraryLoaded) {
            _protectCreateContextFromSnapshot();
        } else {
            sCachedProtectCreateContextFromSnapshot.set(true);
        }
    }

    private void releaseArguments(java.lang.Object[] objArr, boolean z17) {
        if (z17 && objArr.length > 0 && (objArr[objArr.length - 1] instanceof java.lang.Object[])) {
            for (java.lang.Object obj : (java.lang.Object[]) objArr[objArr.length - 1]) {
                if (obj instanceof com.eclipsesource.mmv8.V8Value) {
                    ((com.eclipsesource.mmv8.V8Value) obj).release();
                }
            }
        }
        for (java.lang.Object obj2 : objArr) {
            if (obj2 instanceof com.eclipsesource.mmv8.V8Value) {
                ((com.eclipsesource.mmv8.V8Value) obj2).release();
            }
        }
    }

    public static native void releaseDirectByteBufferInSandbox(java.nio.ByteBuffer byteBuffer, int i17);

    private void releaseNativeMethodDescriptors() {
        java.util.Iterator<java.lang.Long> it = this.functionRegistry.keySet().iterator();
        while (it.hasNext()) {
            releaseMethodDescriptor(this.v8RuntimePtr, it.next().longValue());
        }
    }

    private void releaseResources() {
        java.util.List<com.eclipsesource.mmv8.Releasable> list = this.resources;
        if (list != null) {
            java.util.Iterator<com.eclipsesource.mmv8.Releasable> it = list.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.resources.clear();
            this.resources = null;
        }
    }

    public static boolean requireSoLoaded(java.lang.String str) {
        if (nativeLibraryLoaded) {
            return true;
        }
        synchronized (lock) {
            if (!nativeLibraryLoaded) {
                load(str);
            }
        }
        return nativeLibraryLoaded;
    }

    public static void setBreakOnStart(java.lang.Boolean bool) {
        _setBreakOnStart(bool.booleanValue());
    }

    private java.lang.Object[] setDefaultValues(java.lang.Object[] objArr, java.lang.Class<?>[] clsArr, com.eclipsesource.mmv8.V8Object v8Object, boolean z17) {
        int i17 = 0;
        if (z17) {
            objArr[0] = v8Object;
            i17 = 1;
        }
        while (i17 < objArr.length) {
            objArr[i17] = getDefaultValue(clsArr[i17]);
            i17++;
        }
        return objArr;
    }

    public static void setFlags(java.lang.String str) {
        v8Flags = str;
    }

    public static void setLoadLibraryDelegate(com.eclipsesource.mmv8.ILoadLibraryDelegate iLoadLibraryDelegate) {
        if (iLoadLibraryDelegate == null) {
            throw new java.lang.IllegalArgumentException("setLoadLibraryDelegate: param delegate null");
        }
        sLoadLibraryDelegate = iLoadLibraryDelegate;
    }

    public static void setTracingInfo(java.lang.String str, java.lang.String str2, boolean z17) {
        v8TracingConfig = str;
        v8TracingResultFile = str2;
        v8TracingAutoStart = z17;
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("included_categories");
        v8TracingCategories = new java.lang.String[jSONArray.length()];
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            v8TracingCategories[i17] = jSONArray.getString(i17);
        }
    }

    public static native void startTracing();

    public static native void stopTracing();

    public void acquireLock(long j17) {
        _acquireLock(j17);
    }

    public void add(long j17, long j18, java.lang.String str, int i17) {
        _add(j17, j18, str, i17);
    }

    public void addArrayBooleanItem(long j17, long j18, boolean z17) {
        _addArrayBooleanItem(j17, j18, z17);
    }

    public void addArrayDoubleItem(long j17, long j18, double d17) {
        _addArrayDoubleItem(j17, j18, d17);
    }

    public void addArrayIntItem(long j17, long j18, int i17) {
        _addArrayIntItem(j17, j18, i17);
    }

    public void addArrayNullItem(long j17, long j18) {
        _addArrayNullItem(j17, j18);
    }

    public void addArrayObjectItem(long j17, long j18, long j19) {
        _addArrayObjectItem(j17, j18, j19);
    }

    public void addArrayStringItem(long j17, long j18, java.lang.String str) {
        _addArrayStringItem(j17, j18, str);
    }

    public void addArrayUndefinedItem(long j17, long j18) {
        _addArrayUndefinedItem(j17, j18);
    }

    public void addNull(long j17, long j18, java.lang.String str) {
        _addNull(j17, j18, str);
    }

    public void addObjRef(com.eclipsesource.mmv8.V8Value v8Value) {
        this.objectReferences++;
        if (this.referenceHandlers.isEmpty()) {
            return;
        }
        notifyReferenceCreated(v8Value);
    }

    public void addObject(long j17, long j18, java.lang.String str, long j19) {
        _addObject(j17, j18, str, j19);
    }

    public void addReferenceHandler(com.eclipsesource.mmv8.ReferenceHandler referenceHandler) {
        this.referenceHandlers.add(0, referenceHandler);
    }

    public void addReleaseHandler(com.eclipsesource.mmv8.utils.V8Runnable v8Runnable) {
        this.releaseHandlers.add(v8Runnable);
    }

    public void addUndefined(long j17, long j18, java.lang.String str) {
        _addUndefined(j17, j18, str);
    }

    public java.lang.Object arrayGet(long j17, int i17, long j18, int i18) {
        return _arrayGet(j17, i17, j18, i18);
    }

    public boolean arrayGetBoolean(long j17, long j18, int i17) {
        return _arrayGetBoolean(j17, j18, i17);
    }

    public boolean[] arrayGetBooleans(long j17, long j18, int i17, int i18) {
        return _arrayGetBooleans(j17, j18, i17, i18);
    }

    public byte arrayGetByte(long j17, long j18, int i17) {
        return _arrayGetByte(j17, j18, i17);
    }

    public byte[] arrayGetBytes(long j17, long j18, int i17, int i18) {
        return _arrayGetBytes(j17, j18, i17, i18);
    }

    public double arrayGetDouble(long j17, long j18, int i17) {
        return _arrayGetDouble(j17, j18, i17);
    }

    public double[] arrayGetDoubles(long j17, long j18, int i17, int i18) {
        return _arrayGetDoubles(j17, j18, i17, i18);
    }

    public int arrayGetInteger(long j17, long j18, int i17) {
        return _arrayGetInteger(j17, j18, i17);
    }

    public int[] arrayGetIntegers(long j17, long j18, int i17, int i18) {
        return _arrayGetIntegers(j17, j18, i17, i18);
    }

    public int arrayGetSize(long j17, long j18) {
        return _arrayGetSize(j17, j18);
    }

    public java.lang.String arrayGetString(long j17, long j18, int i17) {
        return _arrayGetString(j17, j18, i17);
    }

    public java.lang.String[] arrayGetStrings(long j17, long j18, int i17, int i18) {
        return _arrayGetStrings(j17, j18, i17, i18);
    }

    public java.lang.Object batchCompileAndGenCodeCacheForScripts(java.util.ArrayList<com.eclipsesource.mmv8.V8ScriptEvaluateRequest> arrayList, java.lang.String str) {
        checkThread();
        if (arrayList != null && !arrayList.isEmpty()) {
            return batchCompileAndGenCodeCacheForScripts(getV8RuntimePtr(), (com.eclipsesource.mmv8.V8ScriptEvaluateRequest[]) arrayList.toArray(new com.eclipsesource.mmv8.V8ScriptEvaluateRequest[arrayList.size()]), str);
        }
        throw new java.lang.IllegalArgumentException("Scripts is Empty");
    }

    public java.lang.Object batchExecuteScripts(java.util.ArrayList<com.eclipsesource.mmv8.V8ScriptEvaluateRequest> arrayList, java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        if (arrayList != null && !arrayList.isEmpty()) {
            return batchExecuteScripts(getV8RuntimePtr(), (com.eclipsesource.mmv8.V8ScriptEvaluateRequest[]) arrayList.toArray(new com.eclipsesource.mmv8.V8ScriptEvaluateRequest[arrayList.size()]), str, executeDetails);
        }
        throw new java.lang.IllegalArgumentException("Scripts is Empty");
    }

    public java.lang.Object callObjectJavaMethod(long j17, com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor = this.functionRegistry.get(java.lang.Long.valueOf(j17));
        com.eclipsesource.mmv8.JavaCallback javaCallback = methodDescriptor.callback;
        if (javaCallback != null) {
            return checkResult(javaCallback.invoke(v8Object, v8Array));
        }
        boolean isVarArgs = methodDescriptor.method.isVarArgs();
        java.lang.Object[] args = getArgs(v8Object, methodDescriptor, v8Array, isVarArgs);
        checkArgs(args);
        try {
            try {
                try {
                    try {
                        return checkResult(methodDescriptor.method.invoke(methodDescriptor.object, args));
                    } catch (java.lang.reflect.InvocationTargetException e17) {
                        throw e17.getTargetException();
                    }
                } catch (java.lang.IllegalAccessException e18) {
                    throw e18;
                }
            } catch (java.lang.IllegalArgumentException e19) {
                throw e19;
            }
        } finally {
            releaseArguments(args, isVarArgs);
        }
    }

    public void callVoidJavaMethod(long j17, com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor = this.functionRegistry.get(java.lang.Long.valueOf(j17));
        com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback = methodDescriptor.voidCallback;
        if (javaVoidCallback != null) {
            javaVoidCallback.invoke(v8Object, v8Array);
            return;
        }
        boolean isVarArgs = methodDescriptor.method.isVarArgs();
        java.lang.Object[] args = getArgs(v8Object, methodDescriptor, v8Array, isVarArgs);
        checkArgs(args);
        try {
            try {
                methodDescriptor.method.invoke(methodDescriptor.object, args);
            } catch (java.lang.IllegalAccessException e17) {
                throw e17;
            } catch (java.lang.IllegalArgumentException e18) {
                throw e18;
            } catch (java.lang.reflect.InvocationTargetException e19) {
                throw e19.getTargetException();
            }
        } finally {
            releaseArguments(args, isVarArgs);
        }
    }

    public void checkRuntime(com.eclipsesource.mmv8.V8Value v8Value) {
        if (v8Value == null || v8Value.isUndefined()) {
            return;
        }
        com.eclipsesource.mmv8.V8 runtime = v8Value.getRuntime();
        if (runtime == null || runtime.isReleased() || runtime != this) {
            throw new java.lang.Error("Invalid target runtime");
        }
    }

    public void checkThread() {
        this.locker.checkThread();
        if (isReleased()) {
            throw new java.lang.Error("Runtime disposed error");
        }
    }

    public void closeUVLoop() {
        _closeUVLoop(this.v8RuntimePtr);
    }

    public boolean contains(long j17, long j18, java.lang.String str) {
        return _contains(j17, j18, str);
    }

    public void createAndRegisterMethodDescriptor(com.eclipsesource.mmv8.JavaCallback javaCallback, long j17) {
        com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor = new com.eclipsesource.mmv8.V8.MethodDescriptor();
        methodDescriptor.callback = javaCallback;
        this.functionRegistry.put(java.lang.Long.valueOf(j17), methodDescriptor);
    }

    public void createNodeRuntime() {
        createNodeRuntime(false);
    }

    public void createTwin(com.eclipsesource.mmv8.V8Value v8Value, com.eclipsesource.mmv8.V8Value v8Value2) {
        checkThread();
        createTwin(this.v8RuntimePtr, v8Value.getHandle(), v8Value2.getHandle());
    }

    public java.nio.ByteBuffer createV8ArrayBufferBackingStore(long j17, long j18, int i17) {
        return _createV8ArrayBufferBackingStore(j17, j18, i17);
    }

    public long createV8Context(int i17) {
        return _createContext(this.v8RuntimePtr, i17);
    }

    public long createV8ContextFromSnapshot(int i17, int i18) {
        return _createContextFromSnapshot(this.v8RuntimePtr, i17, i18);
    }

    public long createV8NodeMainContextFromSnapshot(int i17) {
        return _createNodeMainContextFromSnapshot(this.v8RuntimePtr, i17);
    }

    public void debugDestroy() {
        checkThread();
        _debugDestroy(this.v8RuntimePtr);
    }

    public void debuggerMessageLoop() {
        checkThread();
        _debugMessageLoop(this.v8RuntimePtr);
    }

    public void disposeMethodID(long j17) {
        this.functionRegistry.remove(java.lang.Long.valueOf(j17));
    }

    public void enableNativeTrans() {
        _enableNativeTrans(this.v8RuntimePtr);
    }

    public boolean equals(long j17, long j18, long j19) {
        return _equals(j17, j18, j19);
    }

    public com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str) {
        return executeArrayScript(str, null, 0, null, null, 0, null);
    }

    public boolean executeBooleanFunction(long j17, long j18, java.lang.String str, long j19) {
        return _executeBooleanFunction(j17, j18, str, j19);
    }

    public boolean executeBooleanScript(java.lang.String str) {
        return executeBooleanScript(str, null, 0, null, null, 0, null);
    }

    public java.lang.String executeDebugScript(java.lang.String str, java.lang.String str2) {
        checkThread();
        checkScript(str);
        return _executeDebugScript(this.v8RuntimePtr, str, str2);
    }

    public double executeDoubleFunction(long j17, long j18, java.lang.String str, long j19) {
        return _executeDoubleFunction(j17, j18, str, j19);
    }

    public double executeDoubleScript(java.lang.String str) {
        return executeDoubleScript(str, null, 0, null, null, 0, null);
    }

    public java.lang.Object executeFileScript(com.eclipsesource.mmv8.V8ScriptFileDescriptor v8ScriptFileDescriptor, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        if (v8ScriptFileDescriptor != null) {
            return executeFileScript(getV8RuntimePtr(), 0, v8ScriptFileDescriptor, str, i17, str2, str3, i18, executeDetails);
        }
        throw new java.lang.NullPointerException("Script is null");
    }

    public java.lang.Object executeFunction(long j17, int i17, long j18, java.lang.String str, long j19) {
        return _executeFunction(j17, i17, j18, str, j19);
    }

    public int executeIntegerFunction(long j17, long j18, java.lang.String str, long j19) {
        return _executeIntegerFunction(j17, j18, str, j19);
    }

    public int executeIntegerScript(java.lang.String str) {
        return executeIntegerScript(str, null, 0, null, null, 0, null);
    }

    public com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str) {
        return executeObjectScript(str, null, 0, null, null, 0, null);
    }

    public java.lang.Object executeScript(java.lang.String str) {
        return executeScript(str, null, 0, null, null, 0, null);
    }

    public java.lang.String executeStringFunction(long j17, long j18, java.lang.String str, long j19) {
        return _executeStringFunction(j17, j18, str, j19);
    }

    public java.lang.String executeStringScript(java.lang.String str) {
        return executeStringScript(str, null, 0, null, null, 0, null);
    }

    public void executeVoidFunction(long j17, long j18, java.lang.String str, long j19) {
        _executeVoidFunction(j17, j18, str, j19);
    }

    public void executeVoidScript(java.lang.String str) {
        executeVoidScript(str, null, 0, null, null, 0, null);
    }

    public java.lang.Object get(long j17, int i17, long j18, java.lang.String str) {
        return _get(j17, i17, j18, str);
    }

    public int getArrayType(long j17, long j18) {
        return _getArrayType(j17, j18);
    }

    public java.nio.ByteBuffer getBackingStore(long j17, long j18) {
        return _getBackingStore(j17, j18);
    }

    public boolean getBoolean(long j17, long j18, java.lang.String str) {
        return _getBoolean(j17, j18, str);
    }

    public long getBuildID() {
        return _getBuildID();
    }

    public java.lang.Object getData(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.data;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public double getDouble(long j17, long j18, java.lang.String str) {
        return _getDouble(j17, j18, str);
    }

    public com.eclipsesource.mmv8.utils.V8Executor getExecutor(com.eclipsesource.mmv8.V8Object v8Object) {
        checkThread();
        com.eclipsesource.mmv8.utils.V8Map<com.eclipsesource.mmv8.utils.V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return null;
        }
        return v8Map.get(v8Object);
    }

    public long getGlobalObject() {
        return _getGlobalObject(this.v8RuntimePtr);
    }

    public int getInteger(long j17, long j18, java.lang.String str) {
        return _getInteger(j17, j18, str);
    }

    public long getIsolatePtr() {
        return _getIsolatePtr(this.v8RuntimePtr);
    }

    public java.lang.String[] getKeys(long j17, long j18) {
        return _getKeys(j17, j18);
    }

    public com.eclipsesource.mmv8.V8Locker getLocker() {
        return this.locker;
    }

    public long getMyLoopIdleTimeMs() {
        return _getMyLoopIdleTimeMs(this.v8RuntimePtr);
    }

    public java.lang.String getObjectJavaMethodDescription(long j17) {
        com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor = this.functionRegistry.get(java.lang.Long.valueOf(j17));
        if (methodDescriptor == null) {
            return "Unknown";
        }
        com.eclipsesource.mmv8.JavaCallback javaCallback = methodDescriptor.callback;
        if (javaCallback != null) {
            return javaCallback.getClass().getName();
        }
        com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback = methodDescriptor.voidCallback;
        if (javaVoidCallback != null) {
            return javaVoidCallback.getClass().getName();
        }
        return methodDescriptor.object.getClass().getName() + "." + methodDescriptor.method.getName();
    }

    public long getObjectReferenceCount() {
        return this.objectReferences - this.v8WeakReferences.size();
    }

    public java.lang.String getString(long j17, long j18, java.lang.String str) {
        return _getString(j17, j18, str);
    }

    public int getType(long j17, long j18) {
        return _getType(j17, j18);
    }

    public long getUVLoopPtr() {
        return _getUVLoopPtr(this.v8RuntimePtr);
    }

    public long getV8RuntimePtr() {
        return this.v8RuntimePtr;
    }

    public int identityHash(long j17, long j18) {
        return _identityHash(j17, j18);
    }

    @java.lang.Deprecated
    public long initNewSharedV8ArrayBuffer(long j17, java.nio.ByteBuffer byteBuffer, int i17) {
        return _initNewSharedV8ArrayBuffer(j17, byteBuffer, i17);
    }

    public long initNewV8Array(long j17) {
        return _initNewV8Array(j17);
    }

    public long initNewV8ArrayBuffer(long j17, java.nio.ByteBuffer byteBuffer, int i17) {
        return _initNewV8ArrayBuffer(j17, byteBuffer, i17);
    }

    public long initNewV8Float32Array(long j17, long j18, int i17, int i18) {
        return _initNewV8Float32Array(j17, j18, i17, i18);
    }

    public long initNewV8Float64Array(long j17, long j18, int i17, int i18) {
        return _initNewV8Float64Array(j17, j18, i17, i18);
    }

    public long[] initNewV8Function(long j17) {
        checkThread();
        return _initNewV8Function(j17);
    }

    public long initNewV8Int16Array(long j17, long j18, int i17, int i18) {
        return _initNewV8Int16Array(j17, j18, i17, i18);
    }

    public long initNewV8Int32Array(long j17, long j18, int i17, int i18) {
        return _initNewV8Int32Array(j17, j18, i17, i18);
    }

    public long initNewV8Int8Array(long j17, long j18, int i17, int i18) {
        return _initNewV8Int8Array(j17, j18, i17, i18);
    }

    public long initNewV8Object(long j17) {
        return _initNewV8Object(j17);
    }

    public long initNewV8UInt16Array(long j17, long j18, int i17, int i18) {
        return _initNewV8UInt16Array(j17, j18, i17, i18);
    }

    public long initNewV8UInt32Array(long j17, long j18, int i17, int i18) {
        return _initNewV8UInt32Array(j17, j18, i17, i18);
    }

    public long initNewV8UInt8Array(long j17, long j18, int i17, int i18) {
        return _initNewV8UInt8Array(j17, j18, i17, i18);
    }

    public long initNewV8UInt8ClampedArray(long j17, long j18, int i17, int i18) {
        return _initNewV8UInt8ClampedArray(j17, j18, i17, i18);
    }

    public boolean isRunning() {
        return _isRunning(this.v8RuntimePtr);
    }

    public boolean isWeak(long j17, long j18) {
        return _isWeak(j17, j18);
    }

    public void lowMemoryNotification() {
        checkThread();
        lowMemoryNotification(getV8RuntimePtr());
    }

    public void markSnapshotNotNeed() {
        _markSnapshotNotNeed(this.v8RuntimePtr);
    }

    public void memoryPressureNotification(int i17) {
        _memoryPressureNotification(this.v8RuntimePtr, i17);
    }

    public void nativeDispatch() {
        _nativeDispatch(this.v8RuntimePtr);
    }

    public void nativeLoopStop() {
        _nativeLoopStop(this.v8RuntimePtr);
    }

    public void nativeMessageLoop() {
        _nativeMessageLoop(this.v8RuntimePtr);
    }

    public void onNativeRunJavaTask() {
        java.lang.Runnable runnable = this.nativeJavaCallback_;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void onNativeTransMsgDispatchByJava() {
        com.eclipsesource.mmv8.V8.JavaTaskScheduler javaTaskScheduler = this._javaTaskScheduler;
        if (javaTaskScheduler != null) {
            javaTaskScheduler.Schedule(new java.lang.Runnable() { // from class: com.eclipsesource.mmv8.V8.2
                @Override // java.lang.Runnable
                public void run() {
                    com.eclipsesource.mmv8.V8._nativeTransHandleMessage(com.eclipsesource.mmv8.V8.this.v8RuntimePtr);
                }
            });
        }
    }

    public void precompile(java.lang.String str, java.lang.String str2) {
        _precompile(this.v8RuntimePtr, str, str2);
    }

    public boolean pumpMessageLoop(boolean z17) {
        return _pumpMessageLoop(this.v8RuntimePtr, z17);
    }

    public void pumpMessageLoopDirect() {
        _pumpMessageLoopDirect(this.v8RuntimePtr);
    }

    public void registerCallback(java.lang.Object obj, java.lang.reflect.Method method, long j17, java.lang.String str, boolean z17) {
        com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor = new com.eclipsesource.mmv8.V8.MethodDescriptor();
        methodDescriptor.object = obj;
        methodDescriptor.method = method;
        methodDescriptor.includeReceiver = z17;
        this.functionRegistry.put(java.lang.Long.valueOf(registerJavaMethod(getV8RuntimePtr(), j17, str, isVoidMethod(method))), methodDescriptor);
    }

    public long registerJavaMethod(long j17, long j18, java.lang.String str, boolean z17) {
        return _registerJavaMethod(j17, j18, str, z17);
    }

    public void registerResource(com.eclipsesource.mmv8.Releasable releasable) {
        checkThread();
        if (this.resources == null) {
            this.resources = new java.util.ArrayList();
        }
        this.resources.add(releasable);
    }

    public void registerV8Executor(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.utils.V8Executor v8Executor) {
        checkThread();
        if (this.executors == null) {
            this.executors = new com.eclipsesource.mmv8.utils.V8Map<>();
        }
        this.executors.put2((com.eclipsesource.mmv8.V8Value) v8Object, (com.eclipsesource.mmv8.V8Object) v8Executor);
    }

    public void registerVoidCallback(com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback, long j17, java.lang.String str) {
        com.eclipsesource.mmv8.V8.MethodDescriptor methodDescriptor = new com.eclipsesource.mmv8.V8.MethodDescriptor();
        methodDescriptor.voidCallback = javaVoidCallback;
        this.functionRegistry.put(java.lang.Long.valueOf(registerJavaMethod(getV8RuntimePtr(), j17, str, true)), methodDescriptor);
    }

    @Override // com.eclipsesource.mmv8.V8Value, com.eclipsesource.mmv8.Releasable
    public void release() {
        release(true);
    }

    public void releaseLock(long j17) {
        _releaseLock(j17);
    }

    public void releaseMethodDescriptor(long j17, long j18) {
        _releaseMethodDescriptor(j17, j18);
    }

    public void releaseObjRef(com.eclipsesource.mmv8.V8Value v8Value) {
        if (!this.referenceHandlers.isEmpty()) {
            notifyReferenceDisposed(v8Value);
        }
        this.objectReferences--;
    }

    public void releaseV8Context(long j17) {
        _releaseContext(this.v8RuntimePtr, j17);
    }

    public com.eclipsesource.mmv8.utils.V8Executor removeExecutor(com.eclipsesource.mmv8.V8Object v8Object) {
        checkThread();
        com.eclipsesource.mmv8.utils.V8Map<com.eclipsesource.mmv8.utils.V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return null;
        }
        return v8Map.remove(v8Object);
    }

    public void removeReferenceHandler(com.eclipsesource.mmv8.ReferenceHandler referenceHandler) {
        this.referenceHandlers.remove(referenceHandler);
    }

    public void removeReleaseHandler(com.eclipsesource.mmv8.utils.V8Runnable v8Runnable) {
        this.releaseHandlers.remove(v8Runnable);
    }

    public boolean sameValue(long j17, long j18, long j19) {
        return _sameValue(j17, j18, j19);
    }

    public void saveEntryPagePathToCachePath() {
        _saveEntryPagePathToCachePath(this.v8RuntimePtr);
    }

    public synchronized void setData(java.lang.String str, java.lang.Object obj) {
        if (this.data == null) {
            this.data = new java.util.HashMap();
        }
        this.data.put(str, obj);
    }

    public void setDelaySaveCodeCache(boolean z17) {
        _setDelaySaveCodeCache(this.v8RuntimePtr, z17);
    }

    public void setJavaTaskScheduler(com.eclipsesource.mmv8.V8.JavaTaskScheduler javaTaskScheduler) {
        this._javaTaskScheduler = javaTaskScheduler;
        _nativeTransSetJavaSchedule(1L);
    }

    public void setMinimalCodeLength(int i17) {
        _setMinimalCodeLength(this.v8RuntimePtr, i17);
    }

    public void setNativeJavaCallback(java.lang.Runnable runnable) {
        this.nativeJavaCallback_ = runnable;
    }

    public void setPrototype(long j17, long j18, long j19) {
        _setPrototype(j17, j18, j19);
    }

    public void setWeak(long j17, long j18) {
        _setWeak(j17, j18);
    }

    public void shutdownExecutors(boolean z17) {
        checkThread();
        com.eclipsesource.mmv8.utils.V8Map<com.eclipsesource.mmv8.utils.V8Executor> v8Map = this.executors;
        if (v8Map == null) {
            return;
        }
        for (com.eclipsesource.mmv8.utils.V8Executor v8Executor : v8Map.values()) {
            if (z17) {
                v8Executor.forceTermination();
            } else {
                v8Executor.shutdown();
            }
        }
    }

    public boolean strictEquals(long j17, long j18, long j19) {
        return _strictEquals(j17, j18, j19);
    }

    public void switchV8Context(long j17) {
        _switchContext(this.v8RuntimePtr, j17);
    }

    public void terminateExecution() {
        this.forceTerminateExecutors = true;
        terminateExecution(this.v8RuntimePtr);
    }

    public java.lang.String toString(long j17, long j18) {
        return _toString(j17, j18);
    }

    public void waitForDebugger(java.lang.String str, boolean z17) {
        checkThread();
        _waitForDebuger(this.v8RuntimePtr, str, z17);
    }

    public void waitForDebuggerWithContexts(java.lang.String str, long[] jArr, java.lang.String[] strArr) {
        checkThread();
        _waitForDebuggerWithContexts(this.v8RuntimePtr, str, jArr, strArr);
    }

    public void wakeUpUVLoop() {
        _wakeUpUVLoop(this.v8RuntimePtr);
    }

    public void weakReferenceReleased(long j17) {
        com.eclipsesource.mmv8.V8Value v8Value = this.v8WeakReferences.get(java.lang.Long.valueOf(j17));
        if (v8Value != null) {
            this.v8WeakReferences.remove(java.lang.Long.valueOf(j17));
            try {
                v8Value.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public V8(java.lang.String str, boolean z17, byte[] bArr, java.lang.String str2, boolean z18, int i17) {
        super(null);
        this.v8WeakReferences = new java.util.HashMap();
        this.data = null;
        this.objectReferences = 0L;
        this.v8RuntimePtr = 0L;
        this.resources = null;
        this.executors = null;
        this.forceTerminateExecutors = false;
        this.functionRegistry = new java.util.HashMap();
        this.referenceHandlers = new java.util.LinkedList<>();
        this.releaseHandlers = new java.util.LinkedList<>();
        this._javaTaskScheduler = null;
        this.released = false;
        try {
            com.eclipsesource.mmv8.V8TracerAccessible.beginSection("CreateIsolate");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.v8RuntimePtr = _createIsolate(str, z17, bArr, str2, z18, i17);
            this.isolateCreateDurationMills = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            this.locker = new com.eclipsesource.mmv8.V8Locker(this);
            checkThread();
            if (z17) {
                this.objectHandle = _getGlobalObject(this.v8RuntimePtr);
            }
        } catch (java.lang.Throwable th6) {
            com.eclipsesource.mmv8.V8TracerAccessible.endSection();
            throw th6;
        }
    }

    public static com.eclipsesource.mmv8.V8 createV8Runtime(java.lang.String str) {
        return createV8Runtime(str, null);
    }

    public void add(long j17, long j18, java.lang.String str, boolean z17) {
        _add(j17, j18, str, z17);
    }

    public int arrayGetBooleans(long j17, long j18, int i17, int i18, boolean[] zArr) {
        return _arrayGetBooleans(j17, j18, i17, i18, zArr);
    }

    public int arrayGetBytes(long j17, long j18, int i17, int i18, byte[] bArr) {
        return _arrayGetBytes(j17, j18, i17, i18, bArr);
    }

    public int arrayGetDoubles(long j17, long j18, int i17, int i18, double[] dArr) {
        return _arrayGetDoubles(j17, j18, i17, i18, dArr);
    }

    public int arrayGetIntegers(long j17, long j18, int i17, int i18, int[] iArr) {
        return _arrayGetIntegers(j17, j18, i17, i18, iArr);
    }

    public int arrayGetStrings(long j17, long j18, int i17, int i18, java.lang.String[] strArr) {
        return _arrayGetStrings(j17, j18, i17, i18, strArr);
    }

    public void createNodeRuntime(boolean z17) {
        _startNodeJS(this.v8RuntimePtr, z17);
    }

    public com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeArrayScript(str, str2, i17, null, null, 0, null);
    }

    public boolean executeBooleanScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeBooleanScript(str, str2, i17, null, null, 0, null);
    }

    public double executeDoubleScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeDoubleScript(str, str2, i17, null, null, 0, null);
    }

    public java.lang.Object executeFunction(long j17, long j18, long j19, long j27) {
        return _executeFunction(j17, j18, j19, j27);
    }

    public int executeIntegerScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeIntegerScript(str, str2, i17, null, null, 0, null);
    }

    public com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeObjectScript(str, str2, i17, null, null, 0, null);
    }

    public java.lang.Object executeScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeScript(str, str2, i17, null, null, 0, null);
    }

    public java.lang.String executeStringScript(java.lang.String str, java.lang.String str2, int i17) {
        return executeStringScript(str, str2, i17, null, null, 0, null);
    }

    public void executeVoidScript(java.lang.String str, java.lang.String str2, int i17) {
        executeVoidScript(str, str2, i17, null, null, 0, null);
    }

    public int getType(long j17, long j18, java.lang.String str) {
        return _getType(j17, j18, str);
    }

    public long initNewV8ArrayBuffer(long j17, int i17) {
        return _initNewV8ArrayBuffer(j17, i17);
    }

    public void release(boolean z17) {
        if (isReleased()) {
            return;
        }
        checkThread();
        try {
            notifyReleaseHandlers(this);
            releaseResources();
            shutdownExecutors(this.forceTerminateExecutors);
            com.eclipsesource.mmv8.utils.V8Map<com.eclipsesource.mmv8.utils.V8Executor> v8Map = this.executors;
            if (v8Map != null) {
                v8Map.clear();
            }
            releaseNativeMethodDescriptors();
            synchronized (lock) {
                runtimeCounter--;
            }
            this.locker.release();
            _releaseRuntime(this.v8RuntimePtr);
            this.v8RuntimePtr = 0L;
            this.released = true;
            if (!z17 || getObjectReferenceCount() <= 0) {
                return;
            }
            throw new java.lang.IllegalStateException(this.objectReferences + " Object(s) still exist in runtime");
        } catch (java.lang.Throwable th6) {
            releaseResources();
            shutdownExecutors(this.forceTerminateExecutors);
            if (this.executors != null) {
                this.executors.clear();
            }
            releaseNativeMethodDescriptors();
            synchronized (lock) {
                runtimeCounter--;
                this.locker.release();
                _releaseRuntime(this.v8RuntimePtr);
                this.v8RuntimePtr = 0L;
                this.released = true;
                if (z17 && getObjectReferenceCount() > 0) {
                    throw new java.lang.IllegalStateException(this.objectReferences + " Object(s) still exist in runtime");
                }
                throw th6;
            }
        }
    }

    public static com.eclipsesource.mmv8.V8 createV8Runtime(java.lang.String str, java.lang.String str2) {
        return createV8Runtime(str, str2, true, null, null);
    }

    public void add(long j17, long j18, java.lang.String str, double d17) {
        _add(j17, j18, str, d17);
    }

    public void createTwin(long j17, long j18, long j19) {
        _createTwin(j17, j18, j19);
    }

    public com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        java.lang.Object executeScript = executeScript(str, str2, i17, str3, str4, i18, executeDetails);
        if (executeScript instanceof com.eclipsesource.mmv8.V8Array) {
            return (com.eclipsesource.mmv8.V8Array) executeScript;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public boolean executeBooleanScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeBooleanScript(this.v8RuntimePtr, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public double executeDoubleScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeDoubleScript(this.v8RuntimePtr, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public int executeIntegerScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeIntegerScript(this.v8RuntimePtr, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        java.lang.Object executeScript = executeScript(str, str2, i17, str3, str4, i18, executeDetails);
        if (executeScript instanceof com.eclipsesource.mmv8.V8Object) {
            return (com.eclipsesource.mmv8.V8Object) executeScript;
        }
        throw new com.eclipsesource.mmv8.V8ResultUndefined();
    }

    public java.lang.Object executeScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeScript(getV8RuntimePtr(), 0, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public java.lang.String executeStringScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        return executeStringScript(this.v8RuntimePtr, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public void executeVoidScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        checkThread();
        checkScript(str);
        executeVoidScript(this.v8RuntimePtr, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public int getType(long j17, long j18, int i17) {
        return _getType(j17, j18, i17);
    }

    public void lowMemoryNotification(long j17) {
        _lowMemoryNotification(j17);
    }

    public void terminateExecution(long j17) {
        _terminateExecution(j17);
    }

    public static com.eclipsesource.mmv8.V8 createV8Runtime(java.lang.String str, java.lang.String str2, boolean z17) {
        return createV8Runtime(str, str2, z17, null, null);
    }

    public void add(long j17, long j18, java.lang.String str, java.lang.String str2) {
        _add(j17, j18, str, str2);
    }

    public java.lang.Object executeFileScript(long j17, int i17, com.eclipsesource.mmv8.V8ScriptFileDescriptor v8ScriptFileDescriptor, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _executeFileScript(j17, i17, v8ScriptFileDescriptor, str, i18, str2, str3, i19, executeDetails);
    }

    public int getType(long j17, long j18, int i17, int i18) {
        return _getType(j17, j18, i17, i18);
    }

    public static com.eclipsesource.mmv8.V8 createV8Runtime(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, byte[] bArr) {
        return createV8Runtime(str, str2, z17, str3, bArr, null, false, 2);
    }

    public java.lang.Object batchCompileAndGenCodeCacheForScripts(long j17, com.eclipsesource.mmv8.V8ScriptEvaluateRequest[] v8ScriptEvaluateRequestArr, java.lang.String str) {
        return _batchCompileAndGenCodeCacheForScripts(j17, v8ScriptEvaluateRequestArr, str);
    }

    public java.lang.Object batchExecuteScripts(long j17, com.eclipsesource.mmv8.V8ScriptEvaluateRequest[] v8ScriptEvaluateRequestArr, java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _batchExecuteScripts(j17, v8ScriptEvaluateRequestArr, str, executeDetails);
    }

    public static com.eclipsesource.mmv8.V8 createV8Runtime(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, byte[] bArr, java.lang.String str4, boolean z18, int i17) {
        if (!nativeLibraryLoaded) {
            synchronized (lock) {
                if (!nativeLibraryLoaded) {
                    load(str2);
                }
            }
        }
        checkNativeLibraryLoaded();
        if (sCachedProtectCreateContextFromSnapshot.compareAndSet(true, false)) {
            _protectCreateContextFromSnapshot();
        }
        com.eclipsesource.mmv8.V8 v86 = new com.eclipsesource.mmv8.V8(str, z17, bArr, str4, z18, i17);
        if (str3 != null) {
            v86._setCodeCacheDir(v86.v8RuntimePtr, str3);
        }
        synchronized (lock) {
            runtimeCounter++;
        }
        return v86;
    }

    public boolean executeBooleanScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _executeBooleanScript(j17, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public double executeDoubleScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _executeDoubleScript(j17, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public int executeIntegerScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _executeIntegerScript(j17, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public java.lang.Object executeScript(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _executeScript(j17, i17, str, str2, i18, str3, str4, i19, executeDetails);
    }

    public java.lang.String executeStringScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        return _executeStringScript(j17, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public void executeVoidScript(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails) {
        _executeVoidScript(j17, str, str2, i17, str3, str4, i18, executeDetails);
    }

    public void registerCallback(com.eclipsesource.mmv8.JavaCallback javaCallback, long j17, java.lang.String str) {
        createAndRegisterMethodDescriptor(javaCallback, registerJavaMethod(getV8RuntimePtr(), j17, str, false));
    }

    public void release(long j17, long j18) {
        _release(j17, j18);
    }
}
