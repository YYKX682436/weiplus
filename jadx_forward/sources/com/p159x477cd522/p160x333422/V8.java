package com.p159x477cd522.p160x333422;

/* loaded from: classes7.dex */
public class V8 extends com.p159x477cd522.p160x333422.C1477x4679881 {

    /* renamed from: MEMORY_PRESSURE_LEVEL_CRITICAL */
    public static final int f4751x75e1fe16 = 2;

    /* renamed from: MEMORY_PRESSURE_LEVEL_MODERATE */
    public static final int f4752xdca3837a = 1;

    /* renamed from: MEMORY_PRESSURE_LEVEL_NONE */
    public static final int f4753x6fc9112f = 0;

    /* renamed from: isV8TrapHandlerEnabled */
    private static boolean f4755x8348790 = false;

    /* renamed from: kMicrotasksPolicyAuto */
    public static final int f4756x69df7df6 = 2;

    /* renamed from: kMicrotasksPolicyExplicit */
    public static final int f4757x88ce8afb = 0;

    /* renamed from: kMicrotasksPolicyScoped */
    public static final int f4758x8daf3717 = 1;

    /* renamed from: nativeLibraryLoaded */
    private static boolean f4760x2bf085c9 = false;

    /* renamed from: nativeLoadError */
    private static java.lang.Error f4761x37c7366b = null;

    /* renamed from: nativeLoadException */
    private static java.lang.Exception f4762x3ff34b32 = null;

    /* renamed from: runtimeCounter */
    private static volatile int f4763x48051b04 = 0;

    /* renamed from: v8Flags */
    private static java.lang.String f4767xc5bbb125 = "";

    /* renamed from: _javaTaskScheduler */
    com.p159x477cd522.p160x333422.V8.InterfaceC1467x6225dd94 f4773x69848735;

    /* renamed from: data */
    private java.util.Map<java.lang.String, java.lang.Object> f4774x2eefaa;

    /* renamed from: executors */
    private com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595> f4775xbef92200;

    /* renamed from: forceTerminateExecutors */
    private boolean f4776x5988a2ea;

    /* renamed from: functionRegistry */
    private java.util.Map<java.lang.Long, com.p159x477cd522.p160x333422.V8.C1468x53bddf50> f4777x45a0b035;

    /* renamed from: isolateCreateDurationMills */
    protected final long f4778x7907205c;

    /* renamed from: locker */
    private final com.p159x477cd522.p160x333422.C1476xfffd285a f4779xbe963318;

    /* renamed from: nativeJavaCallback_ */
    java.lang.Runnable f4780xba94a1e1;

    /* renamed from: objectReferences */
    private long f4781xe776727;

    /* renamed from: referenceHandlers */
    private java.util.LinkedList<com.p159x477cd522.p160x333422.InterfaceC1463xce10399f> f4782x932bad4;

    /* renamed from: releaseHandlers */
    private java.util.LinkedList<com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf> f4783x73322790;

    /* renamed from: resources */
    private java.util.List<com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98> f4784x89ccbe25;

    /* renamed from: v8RuntimePtr */
    private long f4785x75266c18;

    /* renamed from: v8WeakReferences */
    protected java.util.Map<java.lang.Long, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef> f4786x6c917f42;

    /* renamed from: lock */
    private static final java.lang.Object f4759x32c52b = new java.lang.Object();

    /* renamed from: undefined */
    private static com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef f4766xc21f6150 = new com.p159x477cd522.p160x333422.C1477x4679881.Undefined();

    /* renamed from: invalid */
    private static java.lang.Object f4754x74cff1f7 = new java.lang.Object();

    /* renamed from: v8TracingConfig */
    private static java.lang.String f4770x9ae86b42 = "";

    /* renamed from: v8TracingResultFile */
    private static java.lang.String f4771x7ad8c339 = android.os.Environment.getExternalStorageDirectory().getPath() + "v8_trace.json";

    /* renamed from: v8TracingAutoStart */
    private static boolean f4768x5f2a43f3 = false;

    /* renamed from: v8TracingCategories */
    private static java.lang.String[] f4769xea3c2e1c = null;

    /* renamed from: v8TracingRunning */
    private static boolean f4772xe5e32dbf = false;

    /* renamed from: sLoadLibraryDelegate */
    private static com.p159x477cd522.p160x333422.InterfaceC1453x8d182e91 f4765x8da55a27 = new com.p159x477cd522.p160x333422.InterfaceC1453x8d182e91() { // from class: com.eclipsesource.mmv8.V8.1
        @Override // com.p159x477cd522.p160x333422.InterfaceC1453x8d182e91
        /* renamed from: loadLibrary */
        public void mo15045xeb57c8f5(java.lang.String str) {
            com.p159x477cd522.p160x333422.C1458xb803b88e.m15841xeb57c8f5(str);
        }
    };

    /* renamed from: sCachedProtectCreateContextFromSnapshot */
    private static java.util.concurrent.atomic.AtomicBoolean f4764x24d9ebc7 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: com.eclipsesource.mmv8.V8$JavaTaskScheduler */
    /* loaded from: classes7.dex */
    public interface InterfaceC1467x6225dd94 {
        /* renamed from: Schedule */
        void mo15013xda40f6b7(java.lang.Runnable runnable);
    }

    /* renamed from: com.eclipsesource.mmv8.V8$MethodDescriptor */
    /* loaded from: classes7.dex */
    public class C1468x53bddf50 {

        /* renamed from: callback */
        com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 f4788xf5bc2045;

        /* renamed from: includeReceiver */
        boolean f4789x2fc47ab7;

        /* renamed from: method */
        java.lang.reflect.Method f4790xbfc5d0e1;

        /* renamed from: object */
        java.lang.Object f4791xc300a33f;

        /* renamed from: voidCallback */
        com.p159x477cd522.p160x333422.InterfaceC1457xf776215b f4793x317d01f9;

        private C1468x53bddf50() {
        }
    }

    public V8() {
        this(null, true, null, null, false, 2);
    }

    /* renamed from: _acquireLock */
    private native void m15910x24c39d62(long j17);

    /* renamed from: _add */
    private native void m15911x2ca7e2(long j17, long j18, java.lang.String str, double d17);

    /* renamed from: _add */
    private native void m15912x2ca7e2(long j17, long j18, java.lang.String str, int i17);

    /* renamed from: _add */
    private native void m15913x2ca7e2(long j17, long j18, java.lang.String str, java.lang.String str2);

    /* renamed from: _add */
    private native void m15914x2ca7e2(long j17, long j18, java.lang.String str, boolean z17);

    /* renamed from: _addArrayBooleanItem */
    private native void m15915x5196344(long j17, long j18, boolean z17);

    /* renamed from: _addArrayDoubleItem */
    private native void m15916xf8491d7b(long j17, long j18, double d17);

    /* renamed from: _addArrayIntItem */
    private native void m15917x50fab00b(long j17, long j18, int i17);

    /* renamed from: _addArrayNullItem */
    private native void m15918x3c3fedf1(long j17, long j18);

    /* renamed from: _addArrayObjectItem */
    private native void m15919x974dde9(long j17, long j18, long j19);

    /* renamed from: _addArrayStringItem */
    private native void m15920x6c1ae1bb(long j17, long j18, java.lang.String str);

    /* renamed from: _addArrayUndefinedItem */
    private native void m15921xbea72e2c(long j17, long j18);

    /* renamed from: _addNull */
    private native void m15922x48172089(long j17, long j18, java.lang.String str);

    /* renamed from: _addObject */
    private native void m15923x9f7945c1(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: _addUndefined */
    private native void m15924x3c86978e(long j17, long j18, java.lang.String str);

    /* renamed from: _arrayGet */
    private native java.lang.Object m15925xb8550b9c(long j17, int i17, long j18, int i18);

    /* renamed from: _arrayGetBoolean */
    private native boolean m15926x8f43f0ec(long j17, long j18, int i17);

    /* renamed from: _arrayGetBooleans */
    private native int m15927x593a2d07(long j17, long j18, int i17, int i18, boolean[] zArr);

    /* renamed from: _arrayGetBooleans */
    private native boolean[] m15928x593a2d07(long j17, long j18, int i17, int i18);

    /* renamed from: _arrayGetByte */
    private native byte m15929x298db2c4(long j17, long j18, int i17);

    /* renamed from: _arrayGetBytes */
    private native int m15930x828a62f(long j17, long j18, int i17, int i18, byte[] bArr);

    /* renamed from: _arrayGetBytes */
    private native byte[] m15931x828a62f(long j17, long j18, int i17, int i18);

    /* renamed from: _arrayGetDouble */
    private native double m15932xffc94e8d(long j17, long j18, int i17);

    /* renamed from: _arrayGetDoubles */
    private native int m15933xf9608386(long j17, long j18, int i17, int i18, double[] dArr);

    /* renamed from: _arrayGetDoubles */
    private native double[] m15934xf9608386(long j17, long j18, int i17, int i18);

    /* renamed from: _arrayGetInteger */
    private native int m15935x1e0602(long j17, long j18, int i17);

    /* renamed from: _arrayGetIntegers */
    private native int m15936x3a2bab1(long j17, long j18, int i17, int i18, int[] iArr);

    /* renamed from: _arrayGetIntegers */
    private native int[] m15937x3a2bab1(long j17, long j18, int i17, int i18);

    /* renamed from: _arrayGetSize */
    private native int m15938x299531bd(long j17, long j18);

    /* renamed from: _arrayGetString */
    private native java.lang.String m15939x19a732cd(long j17, long j18, int i17);

    /* renamed from: _arrayGetStrings */
    private native int m15940x1b3f2746(long j17, long j18, int i17, int i18, java.lang.String[] strArr);

    /* renamed from: _arrayGetStrings */
    private native java.lang.String[] m15941x1b3f2746(long j17, long j18, int i17, int i18);

    /* renamed from: _batchCompileAndGenCodeCacheForScripts */
    private native java.lang.Object m15942x6358cc23(long j17, com.p159x477cd522.p160x333422.C1481x17e6a5e9[] c1481x17e6a5e9Arr, java.lang.String str);

    /* renamed from: _batchExecuteScripts */
    private native java.lang.Object m15943x67438eee(long j17, com.p159x477cd522.p160x333422.C1481x17e6a5e9[] c1481x17e6a5e9Arr, java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _closeUVLoop */
    private native void m15944xe6edef1e(long j17);

    /* renamed from: _contains */
    private native boolean m15945xe392a77e(long j17, long j18, java.lang.String str);

    /* renamed from: _createContext */
    private native long m15946x8fec2b14(long j17, int i17);

    /* renamed from: _createContextFromSnapshot */
    private native long m15947x3c7b88c2(long j17, int i17, int i18);

    /* renamed from: _createIsolate */
    private native long m15948xd42f5610(java.lang.String str, boolean z17, byte[] bArr, java.lang.String str2, boolean z18, int i17);

    /* renamed from: _createNodeMainContextFromSnapshot */
    private native long m15949x68fae8e7(long j17, int i17);

    /* renamed from: _createSnapshot */
    public static native com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d m15950xa0648cff(com.p159x477cd522.p160x333422.p163x10fad5c4.C1515x4c3290a6 c1515x4c3290a6);

    /* renamed from: _createTwin */
    private native void m15951x927b13a3(long j17, long j18, long j19);

    /* renamed from: _createV8ArrayBufferBackingStore */
    private native java.nio.ByteBuffer m15952x769e4be2(long j17, long j18, int i17);

    /* renamed from: _debugDestroy */
    private static native void m15953x1547d806(long j17);

    /* renamed from: _debugMessageLoop */
    private static native void m15954x40333157(long j17);

    /* renamed from: _enableNativeTrans */
    private static native void m15955xa86a14cf(long j17);

    /* renamed from: _equals */
    private native boolean m15956x54387cde(long j17, long j18, long j19);

    /* renamed from: _executeBooleanFunction */
    private native boolean m15957xede9c30a(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: _executeBooleanScript */
    private native boolean m15958xbdce447d(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _executeDebugScript */
    private static native java.lang.String m15959xca6334e8(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: _executeDoubleFunction */
    private native double m15960xf960469f(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: _executeDoubleScript */
    private native double m15961x16caa952(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _executeFileScript */
    private native java.lang.Object m15962x6bbe543d(long j17, int i17, com.p159x477cd522.p160x333422.C1484x78647178 c1484x78647178, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _executeFunction */
    private native java.lang.Object m15963xaf03e02e(long j17, int i17, long j18, java.lang.String str, long j19);

    /* renamed from: _executeFunction */
    private native java.lang.Object m15964xaf03e02e(long j17, long j18, long j19, long j27);

    /* renamed from: _executeIntegerFunction */
    private native int m15965x3fc06220(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: _executeIntegerScript */
    private native int m15966x11cdb113(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _executeScript */
    private native java.lang.Object m15967x4555aa1(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _executeStringFunction */
    private native java.lang.String m15968xea35eadf(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: _executeStringScript */
    private native java.lang.String m15969xdd3c5d92(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _executeVoidFunction */
    private native void m15970x676aa6e2(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: _executeVoidScript */
    private native void m15971xbd663e55(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d);

    /* renamed from: _get */
    private native java.lang.Object m15972x2cbe97(long j17, int i17, long j18, java.lang.String str);

    /* renamed from: _getArrayType */
    private native int m15973x2d1e7c5c(long j17, long j18);

    /* renamed from: _getBackingStore */
    private native java.nio.ByteBuffer m15974xee92243d(long j17, long j18);

    /* renamed from: _getBoolean */
    private native boolean m15975x8286fd91(long j17, long j18, java.lang.String str);

    /* renamed from: _getBuildID */
    private native long m15976x8c6f7d72();

    /* renamed from: _getDouble */
    private native double m15977xbd4f9948(long j17, long j18, java.lang.String str);

    /* renamed from: _getGlobalObject */
    private native long m15978xe6ebf4f9(long j17);

    /* renamed from: _getInteger */
    private native int m15979xf36112a7(long j17, long j18, java.lang.String str);

    /* renamed from: _getIsolatePtr */
    private native long m15980x9447203a(long j17);

    /* renamed from: _getKeys */
    private native java.lang.String[] m15981x88113d2b(long j17, long j18);

    /* renamed from: _getMyLoopIdleTimeMs */
    private static native long m15982xee46f18e(long j17);

    /* renamed from: _getNativeTransManager */
    private static native long m15983xa592c493();

    /* renamed from: _getString */
    private native java.lang.String m15984xd72d7d88(long j17, long j18, java.lang.String str);

    /* renamed from: _getType */
    private native int m15985x88159e71(long j17, long j18);

    /* renamed from: _getType */
    private native int m15986x88159e71(long j17, long j18, int i17);

    /* renamed from: _getType */
    private native int m15987x88159e71(long j17, long j18, int i17, int i18);

    /* renamed from: _getType */
    private native int m15988x88159e71(long j17, long j18, java.lang.String str);

    /* renamed from: _getUVLoopPtr */
    private native long m15989xa30c8312(long j17);

    /* renamed from: _getVersion */
    private static native java.lang.String m15990x93a0ae41();

    /* renamed from: _identityHash */
    private native int m15991x7b6780cb(long j17, long j18);

    @java.lang.Deprecated
    /* renamed from: _initNewSharedV8ArrayBuffer */
    private native long m15992xebf406c1(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: _initNewV8Array */
    private native long m15993x77ebaa86(long j17);

    /* renamed from: _initNewV8ArrayBuffer */
    private native long m15994xa6c7ae66(long j17, int i17);

    /* renamed from: _initNewV8ArrayBuffer */
    private native long m15995xa6c7ae66(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: _initNewV8Float32Array */
    private native long m15996x69320891(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8Float64Array */
    private native long m15997xb4e6b92(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8Function */
    private native long[] m15998xe919b08b(long j17);

    /* renamed from: _initNewV8Int16Array */
    private native long m15999x86bdd458(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8Int32Array */
    private native long m16000xe9b6e85e(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8Int8Array */
    private native long m16001x10fbe75d(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8Object */
    private native long m16002x9c8870b2(long j17);

    /* renamed from: _initNewV8UInt16Array */
    private native long m16003x95752927(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8UInt32Array */
    private native long m16004xf86e3d2d(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8UInt8Array */
    private native long m16005xf8af3cae(long j17, long j18, int i17, int i18);

    /* renamed from: _initNewV8UInt8ClampedArray */
    private native long m16006x48b67bea(long j17, long j18, int i17, int i18);

    /* renamed from: _isRunning */
    private static native boolean m16007xe12157b6(long j17);

    /* renamed from: _isWeak */
    private native boolean m16008x5b1a78e1(long j17, long j18);

    /* renamed from: _lowMemoryNotification */
    private native void m16009xb7a31401(long j17);

    /* renamed from: _markSnapshotNotNeed */
    private static native void m16010x80a9ae59(long j17);

    /* renamed from: _memoryPressureNotification */
    private native void m16011x8d895210(long j17, int i17);

    /* renamed from: _nativeDispatch */
    private static native void m16012x81585fd0(long j17);

    /* renamed from: _nativeLoopStop */
    private static native void m16013xf6ed6c1c(long j17);

    /* renamed from: _nativeMessageLoop */
    private static native void m16014x979ffc35(long j17);

    /* renamed from: _nativeTransBroadcastMessage */
    private static native void m16015xb67eb38(int i17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _nativeTransHandleMessage */
    public static native void m16016xfd32a2cd(long j17);

    /* renamed from: _nativeTransPostMessage */
    private static native void m16017x243c6cd5(int i17, java.lang.String str);

    /* renamed from: _nativeTransSetJavaSchedule */
    private static native void m16018x679fd6e9(long j17);

    /* renamed from: _precompile */
    private static native void m16019x5bf74fcf(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: _protectCreateContextFromSnapshot */
    private static native void m16020xa4fcf491();

    /* renamed from: _pumpMessageLoop */
    private static native boolean m16021x5a5a9d84(long j17, boolean z17);

    /* renamed from: _pumpMessageLoopDirect */
    private static native void m16022xa1edf28d(long j17);

    /* renamed from: _registerJavaMethod */
    private native long m16023x6d2d6745(long j17, long j18, java.lang.String str, boolean z17);

    /* renamed from: _release */
    private native void m16024xcd90cec8(long j17, long j18);

    /* renamed from: _releaseContext */
    private native void m16025xc6664dc7(long j17, long j18);

    /* renamed from: _releaseLock */
    private native void m16026xe7a06413(long j17);

    /* renamed from: _releaseMethodDescriptor */
    private native void m16027xb6a81e18(long j17, long j18);

    /* renamed from: _releaseRuntime */
    private native void m16028xea20e7f0(long j17);

    /* renamed from: _sameValue */
    private native boolean m16029xd59b2b2c(long j17, long j18, long j19);

    /* renamed from: _saveEntryPagePathToCachePath */
    private static native void m16030x43505342(long j17);

    /* renamed from: _setBreakOnStart */
    private static native void m16031x99c46f07(boolean z17);

    /* renamed from: _setCodeCacheDir */
    private native void m16032xaaeccdfb(long j17, java.lang.String str);

    /* renamed from: _setDelaySaveCodeCache */
    private native void m16033x9d8ae0d8(long j17, boolean z17);

    /* renamed from: _setFlags */
    private static native void m16034x5860e0a4(java.lang.String str);

    /* renamed from: _setMinimalCodeLength */
    private native void m16035x74ac3251(long j17, int i17);

    /* renamed from: _setPrototype */
    private native void m16036xbaafc0bf(long j17, long j18, long j19);

    /* renamed from: _setWeak */
    private native void m16037x2e175bb(long j17, long j18);

    /* renamed from: _startNodeJS */
    private static native void m16038x62dbfc0e(long j17, boolean z17);

    /* renamed from: _strictEquals */
    private native boolean m16039xa86839c7(long j17, long j18, long j19);

    /* renamed from: _switchContext */
    private native void m16040x72b325dc(long j17, long j18);

    /* renamed from: _terminateExecution */
    private native void m16041x6545056(long j17);

    /* renamed from: _toString */
    private native java.lang.String m16042x9b7b83cb(long j17, long j18);

    /* renamed from: _waitForDebuger */
    private static native void m16043x6ccc6eab(long j17, java.lang.String str, boolean z17);

    /* renamed from: _waitForDebuggerWithContexts */
    private static native void m16044xda933fc0(long j17, java.lang.String str, long[] jArr, java.lang.String[] strArr);

    /* renamed from: _wakeUpUVLoop */
    private native void m16045x52f6f6e3(long j17);

    /* renamed from: allocateDirectByteBufferInSandbox */
    public static native java.nio.ByteBuffer m16048xd37907f4(int i17);

    /* renamed from: broadcastMessage */
    public static void m16049x1aef8406(int i17, java.lang.String str) {
        m16015xb67eb38(i17, str);
    }

    /* renamed from: checkArgs */
    private void m16050x17b96605(java.lang.Object[] objArr) {
        for (java.lang.Object obj : objArr) {
            if (obj == f4754x74cff1f7) {
                throw new java.lang.IllegalArgumentException("argument type mismatch");
            }
        }
    }

    /* renamed from: checkNativeLibraryLoaded */
    private static void m16051xd1f2fba1() {
        if (f4760x2bf085c9) {
            return;
        }
        if (f4761x37c7366b != null) {
            throw new java.lang.IllegalStateException("J2V8 native library not loaded", f4761x37c7366b);
        }
        if (f4762x3ff34b32 == null) {
            throw new java.lang.IllegalStateException("J2V8 native library not loaded");
        }
        throw new java.lang.IllegalStateException("J2V8 native library not loaded", f4762x3ff34b32);
    }

    /* renamed from: checkResult */
    private java.lang.Object m16052x2b48b345(java.lang.Object obj) {
        if (obj == null) {
            return obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.String)) {
            return obj;
        }
        if (obj instanceof com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) {
            if (((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj).mo16335xafdb8087()) {
                throw new com.p159x477cd522.p160x333422.C1479xdecf3e19("V8Value already released");
            }
            return obj;
        }
        throw new com.p159x477cd522.p160x333422.C1479xdecf3e19("Unknown return type: " + obj.getClass());
    }

    /* renamed from: checkScript */
    public static void m16053x2ce0bbf3(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Script is null");
        }
    }

    /* renamed from: clearSnapshotCacheIfIdle */
    public static native void m16054x9f2b78c2();

    /* renamed from: createNodeSnapshot */
    public static native void m16055x54bf2102(java.lang.String str);

    /* renamed from: createV8Runtime */
    public static com.p159x477cd522.p160x333422.V8 m16056x79233d5a() {
        return m16058x79233d5a(null, null);
    }

    /* renamed from: enableTrapHandler */
    public static void m16062xbbce01da(boolean z17) {
        f4755x8348790 = z17;
    }

    /* renamed from: getActiveRuntimes */
    public static int m16063x9d1575b7() {
        return f4763x48051b04;
    }

    /* renamed from: getArgs */
    private java.lang.Object[] m16064xfb7d3953(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, boolean z17) {
        int length = c1468x53bddf50.f4790xbfc5d0e1.getParameterTypes().length;
        int i17 = z17 ? length - 1 : length;
        java.lang.Object[] m16096x8e510d81 = m16096x8e510d81(new java.lang.Object[length], c1468x53bddf50.f4790xbfc5d0e1.getParameterTypes(), c1477x4679881, c1468x53bddf50.f4789x2fc47ab7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m16087xf1146cb5(c1469x28b0ccd7, i17, m16096x8e510d81, arrayList, c1468x53bddf50.f4789x2fc47ab7);
        if (z17) {
            java.lang.Object m16075x5599d5c = m16075x5599d5c(c1468x53bddf50.f4790xbfc5d0e1.getParameterTypes(), arrayList.size());
            java.lang.System.arraycopy(arrayList.toArray(), 0, m16075x5599d5c, 0, arrayList.size());
            m16096x8e510d81[i17] = m16075x5599d5c;
        }
        return m16096x8e510d81;
    }

    /* renamed from: getArrayItem */
    private java.lang.Object m16065xaa79fe56(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17) {
        try {
            int mo16302xfb85f7b0 = c1469x28b0ccd7.mo16302xfb85f7b0(i17);
            if (mo16302xfb85f7b0 == 10) {
                return c1469x28b0ccd7.get(i17);
            }
            if (mo16302xfb85f7b0 == 99) {
                return m16073xc18cd29a();
            }
            switch (mo16302xfb85f7b0) {
                case 1:
                    return java.lang.Integer.valueOf(c1469x28b0ccd7.mo16294xb282bd08(i17));
                case 2:
                    return java.lang.Double.valueOf(c1469x28b0ccd7.mo16291x160e9ec7(i17));
                case 3:
                    return java.lang.Boolean.valueOf(c1469x28b0ccd7.mo16285x41a8a7f2(i17));
                case 4:
                    return c1469x28b0ccd7.mo16298x2fec8307(i17);
                case 5:
                case 8:
                    return c1469x28b0ccd7.mo16284x742a18a3(i17);
                case 6:
                    return c1469x28b0ccd7.mo16297x2817c635(i17);
                case 7:
                    return c1469x28b0ccd7.mo16297x2817c635(i17);
                default:
                    return null;
            }
        } catch (com.p159x477cd522.p160x333422.C1478xba225eb1 unused) {
            return null;
        }
    }

    /* renamed from: getDefaultValue */
    private java.lang.Object m16066x39a91e26(java.lang.Class<?> cls) {
        return cls.equals(com.p159x477cd522.p160x333422.C1477x4679881.class) ? new com.p159x477cd522.p160x333422.C1477x4679881.Undefined() : cls.equals(com.p159x477cd522.p160x333422.C1469x28b0ccd7.class) ? new com.p159x477cd522.p160x333422.C1469x28b0ccd7.Undefined() : f4754x74cff1f7;
    }

    /* renamed from: getFlags */
    public static java.lang.String m16067x746d94d1() {
        return f4767xc5bbb125;
    }

    /* renamed from: getNativeTransManager */
    public static long m16068xb9f28392() {
        return m15983xa592c493();
    }

    /* renamed from: getNodeVersion */
    public static native java.lang.String m16069x1eb2e740();

    /* renamed from: getSCMRevision */
    public static java.lang.String m16070x38afade2() {
        return "Unknown revision ID";
    }

    /* renamed from: getTracingCategories */
    public static java.lang.String[] m16071x8639efc8() {
        return f4769xea3c2e1c;
    }

    /* renamed from: getTracingResultFile */
    public static java.lang.String m16072x16d684e5() {
        return f4771x7ad8c339;
    }

    /* renamed from: getUndefined */
    public static com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef m16073xc18cd29a() {
        return f4766xc21f6150;
    }

    /* renamed from: getV8Version */
    public static java.lang.String m16074x88682140() {
        return m15990x93a0ae41();
    }

    /* renamed from: getVarArgContainer */
    private java.lang.Object m16075x5599d5c(java.lang.Class<?>[] clsArr, int i17) {
        java.lang.Class<?> cls = clsArr[clsArr.length - 1];
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return java.lang.reflect.Array.newInstance(cls, i17);
    }

    /* renamed from: isLoaded */
    public static boolean m16076xe6c221cf() {
        return f4760x2bf085c9;
    }

    /* renamed from: isTracingAutoStart */
    public static boolean m16077xfae7f29b() {
        return f4768x5f2a43f3;
    }

    /* renamed from: isTrapHandlerEnabled */
    public static boolean m16078xc9ec23ee() {
        return f4755x8348790;
    }

    /* renamed from: isV8TracingRunning */
    public static boolean m16079x8fcbeb09() {
        return f4772xe5e32dbf;
    }

    /* renamed from: isVoidMethod */
    private boolean m16080x33668c5f(java.lang.reflect.Method method) {
        return method.getReturnType().equals(java.lang.Void.TYPE);
    }

    /* renamed from: load */
    private static synchronized void m16081x32c4e6(java.lang.String str) {
        synchronized (com.p159x477cd522.p160x333422.V8.class) {
            try {
                try {
                    try {
                        com.p159x477cd522.p160x333422.C1486x1128de25.m16455x45433dfc("LoadSo");
                        f4765x8da55a27.mo15045xeb57c8f5(str);
                        f4760x2bf085c9 = true;
                    } catch (java.lang.Error e17) {
                        f4761x37c7366b = e17;
                    }
                } catch (java.lang.Exception e18) {
                    f4762x3ff34b32 = e18;
                }
            } finally {
                com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            }
        }
    }

    /* renamed from: notifyReferenceCreated */
    private void m16082xe87d4686(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        java.util.Iterator<com.p159x477cd522.p160x333422.InterfaceC1463xce10399f> it = this.f4782x932bad4.iterator();
        while (it.hasNext()) {
            it.next().mo15905x6302303e(abstractC1488x29d0ebef);
        }
    }

    /* renamed from: notifyReferenceDisposed */
    private void m16083xcba9ca47(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        java.util.Iterator<com.p159x477cd522.p160x333422.InterfaceC1463xce10399f> it = this.f4782x932bad4.iterator();
        while (it.hasNext()) {
            it.next().mo15906xa1c2178f(abstractC1488x29d0ebef);
        }
    }

    /* renamed from: notifyReleaseHandlers */
    private void m16084xa354ad07(com.p159x477cd522.p160x333422.V8 v86) {
        java.util.Iterator<com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf> it = this.f4783x73322790.iterator();
        while (it.hasNext()) {
            it.next().run(v86);
        }
    }

    /* renamed from: onStartV8Tracing */
    public static void m16085x4e15355d() {
        f4772xe5e32dbf = true;
    }

    /* renamed from: onStopV8Tracing */
    public static void m16086xef8d425f() {
        f4772xe5e32dbf = false;
    }

    /* renamed from: populateParamters */
    private void m16087xf1146cb5(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, int i17, java.lang.Object[] objArr, java.util.List<java.lang.Object> list, boolean z17) {
        for (int i18 = z17 ? 1 : 0; i18 < c1469x28b0ccd7.mo16304xbe0e3ae6() + (z17 ? 1 : 0); i18++) {
            if (i18 >= i17) {
                list.add(m16065xaa79fe56(c1469x28b0ccd7, i18 - (z17 ? 1 : 0)));
            } else {
                objArr[i18] = m16065xaa79fe56(c1469x28b0ccd7, i18 - (z17 ? 1 : 0));
            }
        }
    }

    /* renamed from: postMessage */
    public static void m16088x58d00b47(int i17, java.lang.String str) {
        m16017x243c6cd5(i17, str);
    }

    /* renamed from: protectCreateContextFromSnapshot */
    public static void m16089xf1ee3032() {
        if (f4760x2bf085c9) {
            m16020xa4fcf491();
        } else {
            f4764x24d9ebc7.set(true);
        }
    }

    /* renamed from: releaseArguments */
    private void m16090x75ec890f(java.lang.Object[] objArr, boolean z17) {
        if (z17 && objArr.length > 0 && (objArr[objArr.length - 1] instanceof java.lang.Object[])) {
            for (java.lang.Object obj : (java.lang.Object[]) objArr[objArr.length - 1]) {
                if (obj instanceof com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) {
                    ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj).mo15825x41012807();
                }
            }
        }
        for (java.lang.Object obj2 : objArr) {
            if (obj2 instanceof com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) {
                ((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) obj2).mo15825x41012807();
            }
        }
    }

    /* renamed from: releaseDirectByteBufferInSandbox */
    public static native void m16091xdac7866a(java.nio.ByteBuffer byteBuffer, int i17);

    /* renamed from: releaseNativeMethodDescriptors */
    private void m16092x18caa3e5() {
        java.util.Iterator<java.lang.Long> it = this.f4777x45a0b035.keySet().iterator();
        while (it.hasNext()) {
            m16258x32141957(this.f4785x75266c18, it.next().longValue());
        }
    }

    /* renamed from: releaseResources */
    private void m16093x790ccdde() {
        java.util.List<com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98> list = this.f4784x89ccbe25;
        if (list != null) {
            java.util.Iterator<com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo15825x41012807();
            }
            this.f4784x89ccbe25.clear();
            this.f4784x89ccbe25 = null;
        }
    }

    /* renamed from: requireSoLoaded */
    public static boolean m16094x6b8d2606(java.lang.String str) {
        if (f4760x2bf085c9) {
            return true;
        }
        synchronized (f4759x32c52b) {
            if (!f4760x2bf085c9) {
                m16081x32c4e6(str);
            }
        }
        return f4760x2bf085c9;
    }

    /* renamed from: setBreakOnStart */
    public static void m16095xe4a31946(java.lang.Boolean bool) {
        m16031x99c46f07(bool.booleanValue());
    }

    /* renamed from: setDefaultValues */
    private java.lang.Object[] m16096x8e510d81(java.lang.Object[] objArr, java.lang.Class<?>[] clsArr, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, boolean z17) {
        int i17 = 0;
        if (z17) {
            objArr[0] = c1477x4679881;
            i17 = 1;
        }
        while (i17 < objArr.length) {
            objArr[i17] = m16066x39a91e26(clsArr[i17]);
            i17++;
        }
        return objArr;
    }

    /* renamed from: setFlags */
    public static void m16097x52fbaf45(java.lang.String str) {
        f4767xc5bbb125 = str;
    }

    /* renamed from: setLoadLibraryDelegate */
    public static void m16098xdbb2e1d8(com.p159x477cd522.p160x333422.InterfaceC1453x8d182e91 interfaceC1453x8d182e91) {
        if (interfaceC1453x8d182e91 == null) {
            throw new java.lang.IllegalArgumentException("setLoadLibraryDelegate: param delegate null");
        }
        f4765x8da55a27 = interfaceC1453x8d182e91;
    }

    /* renamed from: setTracingInfo */
    public static void m16099x7e8532ce(java.lang.String str, java.lang.String str2, boolean z17) {
        f4770x9ae86b42 = str;
        f4771x7ad8c339 = str2;
        f4768x5f2a43f3 = z17;
        org.json.JSONArray jSONArray = new org.json.JSONObject(str).getJSONArray("included_categories");
        f4769xea3c2e1c = new java.lang.String[jSONArray.length()];
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            f4769xea3c2e1c[i17] = jSONArray.getString(i17);
        }
    }

    /* renamed from: startTracing */
    public static native void m16100xb85d5200();

    /* renamed from: stopTracing */
    public static native void m16101x73ccba60();

    /* renamed from: acquireLock */
    public void m16102x49d73f21(long j17) {
        m15910x24c39d62(j17);
    }

    public void add(long j17, long j18, java.lang.String str, int i17) {
        m15912x2ca7e2(j17, j18, str, i17);
    }

    /* renamed from: addArrayBooleanItem */
    public void m16103x100ad603(long j17, long j18, boolean z17) {
        m15915x5196344(j17, j18, z17);
    }

    /* renamed from: addArrayDoubleItem */
    public void m16104xa60ed6dc(long j17, long j18, double d17) {
        m15916xf8491d7b(j17, j18, d17);
    }

    /* renamed from: addArrayIntItem */
    public void m16105x9bd95a4a(long j17, long j18, int i17) {
        m15917x50fab00b(j17, j18, i17);
    }

    /* renamed from: addArrayNullItem */
    public void m16106x4d368b92(long j17, long j18) {
        m15918x3c3fedf1(j17, j18);
    }

    /* renamed from: addArrayObjectItem */
    public void m16107xb73a974a(long j17, long j18, long j19) {
        m15919x974dde9(j17, j18, j19);
    }

    /* renamed from: addArrayStringItem */
    public void m16108x19e09b1c(long j17, long j18, java.lang.String str) {
        m15920x6c1ae1bb(j17, j18, str);
    }

    /* renamed from: addArrayUndefinedItem */
    public void m16109xd306ed2b(long j17, long j18) {
        m15921xbea72e2c(j17, j18);
    }

    /* renamed from: addNull */
    public void m16110xbb8779c8(long j17, long j18, java.lang.String str) {
        m15922x48172089(j17, j18, str);
    }

    /* renamed from: addObjRef */
    public void m16111xf838041d(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        this.f4781xe776727++;
        if (this.f4782x932bad4.isEmpty()) {
            return;
        }
        m16082xe87d4686(abstractC1488x29d0ebef);
    }

    /* renamed from: addObject */
    public void m16112xf8384b40(long j17, long j18, java.lang.String str, long j19) {
        m15923x9f7945c1(j17, j18, str, j19);
    }

    /* renamed from: addReferenceHandler */
    public void m16113x6f65040(com.p159x477cd522.p160x333422.InterfaceC1463xce10399f interfaceC1463xce10399f) {
        this.f4782x932bad4.add(0, interfaceC1463xce10399f);
    }

    /* renamed from: addReleaseHandler */
    public void m16114xe9e21844(com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf interfaceC1528xb4ee7fdf) {
        this.f4783x73322790.add(interfaceC1528xb4ee7fdf);
    }

    /* renamed from: addUndefined */
    public void m16115xb9e72daf(long j17, long j18, java.lang.String str) {
        m15924x3c86978e(j17, j18, str);
    }

    /* renamed from: arrayGet */
    public java.lang.Object m16116xb2efda3d(long j17, int i17, long j18, int i18) {
        return m15925xb8550b9c(j17, i17, j18, i18);
    }

    /* renamed from: arrayGetBoolean */
    public boolean m16117xda229b2b(long j17, long j18, int i17) {
        return m15926x8f43f0ec(j17, j18, i17);
    }

    /* renamed from: arrayGetBooleans */
    public boolean[] m16119x6a30caa8(long j17, long j18, int i17, int i18) {
        return m15928x593a2d07(j17, j18, i17, i18);
    }

    /* renamed from: arrayGetByte */
    public byte m16120xa6ee48e5(long j17, long j18, int i17) {
        return m15929x298db2c4(j17, j18, i17);
    }

    /* renamed from: arrayGetBytes */
    public byte[] m16122x36dad42e(long j17, long j18, int i17, int i18) {
        return m15931x828a62f(j17, j18, i17, i18);
    }

    /* renamed from: arrayGetDouble */
    public double m16123xa75ce06e(long j17, long j18, int i17) {
        return m15932xffc94e8d(j17, j18, i17);
    }

    /* renamed from: arrayGetDoubles */
    public double[] m16125x443f2dc5(long j17, long j18, int i17, int i18) {
        return m15934xf9608386(j17, j18, i17, i18);
    }

    /* renamed from: arrayGetInteger */
    public int m16126x4afcb041(long j17, long j18, int i17) {
        return m15935x1e0602(j17, j18, i17);
    }

    /* renamed from: arrayGetIntegers */
    public int[] m16128x14995852(long j17, long j18, int i17, int i18) {
        return m15937x3a2bab1(j17, j18, i17, i18);
    }

    /* renamed from: arrayGetSize */
    public int m16129xa6f5c7de(long j17, long j18) {
        return m15938x299531bd(j17, j18);
    }

    /* renamed from: arrayGetString */
    public java.lang.String m16130xc13ac4ae(long j17, long j18, int i17) {
        return m15939x19a732cd(j17, j18, i17);
    }

    /* renamed from: arrayGetStrings */
    public java.lang.String[] m16132x661dd185(long j17, long j18, int i17, int i18) {
        return m15941x1b3f2746(j17, j18, i17, i18);
    }

    /* renamed from: batchCompileAndGenCodeCacheForScripts */
    public java.lang.Object m16134x45b0ad22(java.util.ArrayList<com.p159x477cd522.p160x333422.C1481x17e6a5e9> arrayList, java.lang.String str) {
        m16140x2edbf932();
        if (arrayList != null && !arrayList.isEmpty()) {
            return m16133x45b0ad22(m16218xd618fe8e(), (com.p159x477cd522.p160x333422.C1481x17e6a5e9[]) arrayList.toArray(new com.p159x477cd522.p160x333422.C1481x17e6a5e9[arrayList.size()]), str);
        }
        throw new java.lang.IllegalArgumentException("Scripts is Empty");
    }

    /* renamed from: batchExecuteScripts */
    public java.lang.Object m16136x723501ad(java.util.ArrayList<com.p159x477cd522.p160x333422.C1481x17e6a5e9> arrayList, java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        if (arrayList != null && !arrayList.isEmpty()) {
            return m16135x723501ad(m16218xd618fe8e(), (com.p159x477cd522.p160x333422.C1481x17e6a5e9[]) arrayList.toArray(new com.p159x477cd522.p160x333422.C1481x17e6a5e9[arrayList.size()]), str, c1452xdc35012d);
        }
        throw new java.lang.IllegalArgumentException("Scripts is Empty");
    }

    /* renamed from: callObjectJavaMethod */
    public java.lang.Object m16137xca91c4c0(long j17, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50 = this.f4777x45a0b035.get(java.lang.Long.valueOf(j17));
        com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7 = c1468x53bddf50.f4788xf5bc2045;
        if (interfaceC1456x656040a7 != null) {
            return m16052x2b48b345(interfaceC1456x656040a7.mo15014xb9724478(c1477x4679881, c1469x28b0ccd7));
        }
        boolean isVarArgs = c1468x53bddf50.f4790xbfc5d0e1.isVarArgs();
        java.lang.Object[] m16064xfb7d3953 = m16064xfb7d3953(c1477x4679881, c1468x53bddf50, c1469x28b0ccd7, isVarArgs);
        m16050x17b96605(m16064xfb7d3953);
        try {
            try {
                try {
                    try {
                        return m16052x2b48b345(c1468x53bddf50.f4790xbfc5d0e1.invoke(c1468x53bddf50.f4791xc300a33f, m16064xfb7d3953));
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
            m16090x75ec890f(m16064xfb7d3953, isVarArgs);
        }
    }

    /* renamed from: callVoidJavaMethod */
    public void m16138x84c0d455(long j17, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50 = this.f4777x45a0b035.get(java.lang.Long.valueOf(j17));
        com.p159x477cd522.p160x333422.InterfaceC1457xf776215b interfaceC1457xf776215b = c1468x53bddf50.f4793x317d01f9;
        if (interfaceC1457xf776215b != null) {
            interfaceC1457xf776215b.mo15012xb9724478(c1477x4679881, c1469x28b0ccd7);
            return;
        }
        boolean isVarArgs = c1468x53bddf50.f4790xbfc5d0e1.isVarArgs();
        java.lang.Object[] m16064xfb7d3953 = m16064xfb7d3953(c1477x4679881, c1468x53bddf50, c1469x28b0ccd7, isVarArgs);
        m16050x17b96605(m16064xfb7d3953);
        try {
            try {
                c1468x53bddf50.f4790xbfc5d0e1.invoke(c1468x53bddf50.f4791xc300a33f, m16064xfb7d3953);
            } catch (java.lang.IllegalAccessException e17) {
                throw e17;
            } catch (java.lang.IllegalArgumentException e18) {
                throw e18;
            } catch (java.lang.reflect.InvocationTargetException e19) {
                throw e19.getTargetException();
            }
        } finally {
            m16090x75ec890f(m16064xfb7d3953, isVarArgs);
        }
    }

    /* renamed from: checkRuntime */
    public void m16139x58d449b0(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        if (abstractC1488x29d0ebef == null || abstractC1488x29d0ebef.mo16336x85ca346()) {
            return;
        }
        com.p159x477cd522.p160x333422.V8 mo16331x9a3f0ba2 = abstractC1488x29d0ebef.mo16331x9a3f0ba2();
        if (mo16331x9a3f0ba2 == null || mo16331x9a3f0ba2.mo16335xafdb8087() || mo16331x9a3f0ba2 != this) {
            throw new java.lang.Error("Invalid target runtime");
        }
    }

    /* renamed from: checkThread */
    public void m16140x2edbf932() {
        this.f4779xbe963318.m16431x2edbf932();
        if (mo16335xafdb8087()) {
            throw new java.lang.Error("Runtime disposed error");
        }
    }

    /* renamed from: closeUVLoop */
    public void m16141xc0190dd() {
        m15944xe6edef1e(this.f4785x75266c18);
    }

    /* renamed from: contains */
    public boolean m16142xde2d761f(long j17, long j18, java.lang.String str) {
        return m15945xe392a77e(j17, j18, str);
    }

    /* renamed from: createAndRegisterMethodDescriptor */
    public void m16143xdc233a4e(com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7, long j17) {
        com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50 = new com.p159x477cd522.p160x333422.V8.C1468x53bddf50();
        c1468x53bddf50.f4788xf5bc2045 = interfaceC1456x656040a7;
        this.f4777x45a0b035.put(java.lang.Long.valueOf(j17), c1468x53bddf50);
    }

    /* renamed from: createNodeRuntime */
    public void m16144xb97824da() {
        m16145xb97824da(false);
    }

    /* renamed from: createTwin */
    public void m16147x519cbe04(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef, com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef2) {
        m16140x2edbf932();
        m16146x519cbe04(this.f4785x75266c18, abstractC1488x29d0ebef.m16473x1c19911e(), abstractC1488x29d0ebef2.m16473x1c19911e());
    }

    /* renamed from: createV8ArrayBufferBackingStore */
    public java.nio.ByteBuffer m16148xecb69821(long j17, long j18, int i17) {
        return m15952x769e4be2(j17, j18, i17);
    }

    /* renamed from: createV8Context */
    public long m16149x5568a331(int i17) {
        return m15946x8fec2b14(this.f4785x75266c18, i17);
    }

    /* renamed from: createV8ContextFromSnapshot */
    public long m16150x17dbbd5f(int i17, int i18) {
        return m15947x3c7b88c2(this.f4785x75266c18, i17, i18);
    }

    /* renamed from: createV8NodeMainContextFromSnapshot */
    public long m16151xb8df3084(int i17) {
        return m15949x68fae8e7(this.f4785x75266c18, i17);
    }

    /* renamed from: debugDestroy */
    public void m16152x92a86e27() {
        m16140x2edbf932();
        m15953x1547d806(this.f4785x75266c18);
    }

    /* renamed from: debuggerMessageLoop */
    public void m16153x9a7a646a() {
        m16140x2edbf932();
        m15954x40333157(this.f4785x75266c18);
    }

    /* renamed from: disposeMethodID */
    public void m16154xf4d820fb(long j17) {
        this.f4777x45a0b035.remove(java.lang.Long.valueOf(j17));
    }

    /* renamed from: enableNativeTrans */
    public void m16155xb6472b4e() {
        m15955xa86a14cf(this.f4785x75266c18);
    }

    /* renamed from: equals */
    public boolean m16156xb2c87fbf(long j17, long j18, long j19) {
        return m15956x54387cde(j17, j18, j19);
    }

    /* renamed from: executeArrayScript */
    public com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16157x152dcf(java.lang.String str) {
        return m16159x152dcf(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeBooleanFunction */
    public boolean m16160x6581e3eb(long j17, long j18, java.lang.String str, long j19) {
        return m15957xede9c30a(j17, j18, str, j19);
    }

    /* renamed from: executeBooleanScript */
    public boolean m16162x110b299e(java.lang.String str) {
        return m16164x110b299e(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeDebugScript */
    public java.lang.String m16165x7828ee49(java.lang.String str, java.lang.String str2) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        return m15959xca6334e8(this.f4785x75266c18, str, str2);
    }

    /* renamed from: executeDoubleFunction */
    public double m16166xdc0059e(long j17, long j18, java.lang.String str, long j19) {
        return m15960xf960469f(j17, j18, str, j19);
    }

    /* renamed from: executeDoubleScript */
    public double m16168x21bc1c11(java.lang.String str) {
        return m16170x21bc1c11(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeFileScript */
    public java.lang.Object m16172x799b6abc(com.p159x477cd522.p160x333422.C1484x78647178 c1484x78647178, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        if (c1484x78647178 != null) {
            return m16171x799b6abc(m16218xd618fe8e(), 0, c1484x78647178, str, i17, str2, str3, i18, c1452xdc35012d);
        }
        throw new java.lang.NullPointerException("Script is null");
    }

    /* renamed from: executeFunction */
    public java.lang.Object m16173xf9e28a6d(long j17, int i17, long j18, java.lang.String str, long j19) {
        return m15963xaf03e02e(j17, i17, j18, str, j19);
    }

    /* renamed from: executeIntegerFunction */
    public int m16175xb7588301(long j17, long j18, java.lang.String str, long j19) {
        return m15965x3fc06220(j17, j18, str, j19);
    }

    /* renamed from: executeIntegerScript */
    public int m16177x650a9634(java.lang.String str) {
        return m16179x650a9634(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeObjectScript */
    public com.p159x477cd522.p160x333422.C1477x4679881 m16180x96f978ff(java.lang.String str) {
        return m16182x96f978ff(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeScript */
    public java.lang.Object m16184x330788a0(java.lang.String str) {
        return m16186x330788a0(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeStringFunction */
    public java.lang.String m16187xfe95a9de(long j17, long j18, java.lang.String str, long j19) {
        return m15968xea35eadf(j17, j18, str, j19);
    }

    /* renamed from: executeStringScript */
    public java.lang.String m16189xe82dd051(java.lang.String str) {
        return m16191xe82dd051(str, null, 0, null, null, 0, null);
    }

    /* renamed from: executeVoidFunction */
    public void m16192x725c19a1(long j17, long j18, java.lang.String str, long j19) {
        m15970x676aa6e2(j17, j18, str, j19);
    }

    /* renamed from: executeVoidScript */
    public void m16194xcb4354d4(java.lang.String str) {
        m16196xcb4354d4(str, null, 0, null, null, 0, null);
    }

    public java.lang.Object get(long j17, int i17, long j18, java.lang.String str) {
        return m15972x2cbe97(j17, i17, j18, str);
    }

    /* renamed from: getArrayType */
    public int m16197xaa7f127d(long j17, long j18) {
        return m15973x2d1e7c5c(j17, j18);
    }

    /* renamed from: getBackingStore */
    public java.nio.ByteBuffer m16198x3970ce7c(long j17, long j18) {
        return m15974xee92243d(j17, j18);
    }

    /* renamed from: getBoolean */
    public boolean m16199x41a8a7f2(long j17, long j18, java.lang.String str) {
        return m15975x8286fd91(j17, j18, str);
    }

    /* renamed from: getBuildID */
    public long m16200x4b9127d3() {
        return m15976x8c6f7d72();
    }

    /* renamed from: getData */
    public java.lang.Object m16201xfb7e5820(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f4774x2eefaa;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: getDouble */
    public double m16202x160e9ec7(long j17, long j18, java.lang.String str) {
        return m15977xbd4f9948(j17, j18, str);
    }

    /* renamed from: getExecutor */
    public com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595 m16203xf5a03649(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        m16140x2edbf932();
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595> c1525x4d6875a = this.f4775xbef92200;
        if (c1525x4d6875a == null) {
            return null;
        }
        return c1525x4d6875a.get(c1477x4679881);
    }

    /* renamed from: getGlobalObject */
    public long m16204x31ca9f38() {
        return m15978xe6ebf4f9(this.f4785x75266c18);
    }

    /* renamed from: getInteger */
    public int m16205xb282bd08(long j17, long j18, java.lang.String str) {
        return m15979xf36112a7(j17, j18, str);
    }

    /* renamed from: getIsolatePtr */
    public long m16206xc2f94e39() {
        return m15980x9447203a(this.f4785x75266c18);
    }

    /* renamed from: getKeys */
    public java.lang.String[] m16207xfb81966a(long j17, long j18) {
        return m15981x88113d2b(j17, j18);
    }

    /* renamed from: getLocker */
    public com.p159x477cd522.p160x333422.C1476xfffd285a m16208x23ad560e() {
        return this.f4779xbe963318;
    }

    /* renamed from: getMyLoopIdleTimeMs */
    public long m16209xf938644d() {
        return m15982xee46f18e(this.f4785x75266c18);
    }

    /* renamed from: getObjectJavaMethodDescription */
    public java.lang.String m16210xb8a67f24(long j17) {
        com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50 = this.f4777x45a0b035.get(java.lang.Long.valueOf(j17));
        if (c1468x53bddf50 == null) {
            return "Unknown";
        }
        com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7 = c1468x53bddf50.f4788xf5bc2045;
        if (interfaceC1456x656040a7 != null) {
            return interfaceC1456x656040a7.getClass().getName();
        }
        com.p159x477cd522.p160x333422.InterfaceC1457xf776215b interfaceC1457xf776215b = c1468x53bddf50.f4793x317d01f9;
        if (interfaceC1457xf776215b != null) {
            return interfaceC1457xf776215b.getClass().getName();
        }
        return c1468x53bddf50.f4791xc300a33f.getClass().getName() + "." + c1468x53bddf50.f4790xbfc5d0e1.getName();
    }

    /* renamed from: getObjectReferenceCount */
    public long m16211x53ed0a19() {
        return this.f4781xe776727 - this.f4786x6c917f42.size();
    }

    /* renamed from: getString */
    public java.lang.String m16212x2fec8307(long j17, long j18, java.lang.String str) {
        return m15984xd72d7d88(j17, j18, str);
    }

    /* renamed from: getType */
    public int m16213xfb85f7b0(long j17, long j18) {
        return m15985x88159e71(j17, j18);
    }

    /* renamed from: getUVLoopPtr */
    public long m16217x206d1933() {
        return m15989xa30c8312(this.f4785x75266c18);
    }

    /* renamed from: getV8RuntimePtr */
    public long m16218xd618fe8e() {
        return this.f4785x75266c18;
    }

    /* renamed from: identityHash */
    public int m16219xf8c816ec(long j17, long j18) {
        return m15991x7b6780cb(j17, j18);
    }

    @java.lang.Deprecated
    /* renamed from: initNewSharedV8ArrayBuffer */
    public long m16220xa6decf22(long j17, java.nio.ByteBuffer byteBuffer, int i17) {
        return m15992xebf406c1(j17, byteBuffer, i17);
    }

    /* renamed from: initNewV8Array */
    public long m16221x1f7f3c67(long j17) {
        return m15993x77ebaa86(j17);
    }

    /* renamed from: initNewV8ArrayBuffer */
    public long m16223xfa049387(long j17, java.nio.ByteBuffer byteBuffer, int i17) {
        return m15995xa6c7ae66(j17, byteBuffer, i17);
    }

    /* renamed from: initNewV8Float32Array */
    public long m16224x7d91c790(long j17, long j18, int i17, int i18) {
        return m15996x69320891(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8Float64Array */
    public long m16225x1fae2a91(long j17, long j18, int i17, int i18) {
        return m15997xb4e6b92(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8Function */
    public long[] m16226xf6f6c70a(long j17) {
        m16140x2edbf932();
        return m15998xe919b08b(j17);
    }

    /* renamed from: initNewV8Int16Array */
    public long m16227x91af4717(long j17, long j18, int i17, int i18) {
        return m15999x86bdd458(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8Int32Array */
    public long m16228xf4a85b1d(long j17, long j18, int i17, int i18) {
        return m16000xe9b6e85e(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8Int8Array */
    public long m16229xbec1a0be(long j17, long j18, int i17, int i18) {
        return m16001x10fbe75d(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8Object */
    public long m16230xe7671af1(long j17) {
        return m16002x9c8870b2(j17);
    }

    /* renamed from: initNewV8UInt16Array */
    public long m16231xe8b20e48(long j17, long j18, int i17, int i18) {
        return m16003x95752927(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8UInt32Array */
    public long m16232x4bab224e(long j17, long j18, int i17, int i18) {
        return m16004xf86e3d2d(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8UInt8Array */
    public long m16233x3a0af6d(long j17, long j18, int i17, int i18) {
        return m16005xf8af3cae(j17, j18, i17, i18);
    }

    /* renamed from: initNewV8UInt8ClampedArray */
    public long m16234x3a1444b(long j17, long j18, int i17, int i18) {
        return m16006x48b67bea(j17, j18, i17, i18);
    }

    /* renamed from: isRunning */
    public boolean m16235x39e05d35() {
        return m16007xe12157b6(this.f4785x75266c18);
    }

    /* renamed from: isWeak */
    public boolean m16236xb9aa7bc2(long j17, long j18) {
        return m16008x5b1a78e1(j17, j18);
    }

    /* renamed from: lowMemoryNotification */
    public void m16237xcc02d300() {
        m16140x2edbf932();
        m16238xcc02d300(m16218xd618fe8e());
    }

    /* renamed from: markSnapshotNotNeed */
    public void m16239x8b9b2118() {
        m16010x80a9ae59(this.f4785x75266c18);
    }

    /* renamed from: memoryPressureNotification */
    public void m16240x48741a71(int i17) {
        m16011x8d895210(this.f4785x75266c18, i17);
    }

    /* renamed from: nativeDispatch */
    public void m16241x28ebf1b1() {
        m16012x81585fd0(this.f4785x75266c18);
    }

    /* renamed from: nativeLoopStop */
    public void m16242x9e80fdfd() {
        m16013xf6ed6c1c(this.f4785x75266c18);
    }

    /* renamed from: nativeMessageLoop */
    public void m16243xa57d12b4() {
        m16014x979ffc35(this.f4785x75266c18);
    }

    /* renamed from: onNativeRunJavaTask */
    public void m16244xf1dcd5bc() {
        java.lang.Runnable runnable = this.f4780xba94a1e1;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: onNativeTransMsgDispatchByJava */
    public void m16245xda83b2c2() {
        com.p159x477cd522.p160x333422.V8.InterfaceC1467x6225dd94 interfaceC1467x6225dd94 = this.f4773x69848735;
        if (interfaceC1467x6225dd94 != null) {
            interfaceC1467x6225dd94.mo15013xda40f6b7(new java.lang.Runnable() { // from class: com.eclipsesource.mmv8.V8.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p159x477cd522.p160x333422.V8.m16016xfd32a2cd(com.p159x477cd522.p160x333422.V8.this.f4785x75266c18);
                }
            });
        }
    }

    /* renamed from: precompile */
    public void m16246x1b18fa30(java.lang.String str, java.lang.String str2) {
        m16019x5bf74fcf(this.f4785x75266c18, str, str2);
    }

    /* renamed from: pumpMessageLoop */
    public boolean m16247xa53947c3(boolean z17) {
        return m16021x5a5a9d84(this.f4785x75266c18, z17);
    }

    /* renamed from: pumpMessageLoopDirect */
    public void m16248xb64db18c() {
        m16022xa1edf28d(this.f4785x75266c18);
    }

    /* renamed from: registerCallback */
    public void m16250xe7f76008(java.lang.Object obj, java.lang.reflect.Method method, long j17, java.lang.String str, boolean z17) {
        com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50 = new com.p159x477cd522.p160x333422.V8.C1468x53bddf50();
        c1468x53bddf50.f4791xc300a33f = obj;
        c1468x53bddf50.f4790xbfc5d0e1 = method;
        c1468x53bddf50.f4789x2fc47ab7 = z17;
        this.f4777x45a0b035.put(java.lang.Long.valueOf(m16251x1af320a6(m16218xd618fe8e(), j17, str, m16080x33668c5f(method))), c1468x53bddf50);
    }

    /* renamed from: registerJavaMethod */
    public long m16251x1af320a6(long j17, long j18, java.lang.String str, boolean z17) {
        return m16023x6d2d6745(j17, j18, str, z17);
    }

    /* renamed from: registerResource */
    public void m16252xdde703d1(com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 interfaceC1464x1c628e98) {
        m16140x2edbf932();
        if (this.f4784x89ccbe25 == null) {
            this.f4784x89ccbe25 = new java.util.ArrayList();
        }
        this.f4784x89ccbe25.add(interfaceC1464x1c628e98);
    }

    /* renamed from: registerV8Executor */
    public void m16253xd6dd2478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595 c1524xfd44a595) {
        m16140x2edbf932();
        if (this.f4775xbef92200 == null) {
            this.f4775xbef92200 = new com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<>();
        }
        this.f4775xbef92200.put2((com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef) c1477x4679881, (com.p159x477cd522.p160x333422.C1477x4679881) c1524xfd44a595);
    }

    /* renamed from: registerVoidCallback */
    public void m16254x10bca83c(com.p159x477cd522.p160x333422.InterfaceC1457xf776215b interfaceC1457xf776215b, long j17, java.lang.String str) {
        com.p159x477cd522.p160x333422.V8.C1468x53bddf50 c1468x53bddf50 = new com.p159x477cd522.p160x333422.V8.C1468x53bddf50();
        c1468x53bddf50.f4793x317d01f9 = interfaceC1457xf776215b;
        this.f4777x45a0b035.put(java.lang.Long.valueOf(m16251x1af320a6(m16218xd618fe8e(), j17, str, true)), c1468x53bddf50);
    }

    @Override // com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef, com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        m16256x41012807(true);
    }

    /* renamed from: releaseLock */
    public void m16257xcb405d2(long j17) {
        m16026xe7a06413(j17);
    }

    /* renamed from: releaseMethodDescriptor */
    public void m16258x32141957(long j17, long j18) {
        m16027xb6a81e18(j17, j18);
    }

    /* renamed from: releaseObjRef */
    public void m16259xb4340f03(com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef) {
        if (!this.f4782x932bad4.isEmpty()) {
            m16083xcba9ca47(abstractC1488x29d0ebef);
        }
        this.f4781xe776727--;
    }

    /* renamed from: releaseV8Context */
    public void m16260x9bfcd886(long j17) {
        m16025xc6664dc7(this.f4785x75266c18, j17);
    }

    /* renamed from: removeExecutor */
    public com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595 m16261x1abc9177(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        m16140x2edbf932();
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595> c1525x4d6875a = this.f4775xbef92200;
        if (c1525x4d6875a == null) {
            return null;
        }
        return c1525x4d6875a.remove(c1477x4679881);
    }

    /* renamed from: removeReferenceHandler */
    public void m16262xe901aa23(com.p159x477cd522.p160x333422.InterfaceC1463xce10399f interfaceC1463xce10399f) {
        this.f4782x932bad4.remove(interfaceC1463xce10399f);
    }

    /* renamed from: removeReleaseHandler */
    public void m16263x85b08ee7(com.p159x477cd522.p160x333422.p164x6a710b1.InterfaceC1528xb4ee7fdf interfaceC1528xb4ee7fdf) {
        this.f4783x73322790.remove(interfaceC1528xb4ee7fdf);
    }

    /* renamed from: sameValue */
    public boolean m16264x2e5a30ab(long j17, long j18, long j19) {
        return m16029xd59b2b2c(j17, j18, j19);
    }

    /* renamed from: saveEntryPagePathToCachePath */
    public void m16265xeeaa8763() {
        m16030x43505342(this.f4785x75266c18);
    }

    /* renamed from: setData */
    public synchronized void m16266x76491f2c(java.lang.String str, java.lang.Object obj) {
        if (this.f4774x2eefaa == null) {
            this.f4774x2eefaa = new java.util.HashMap();
        }
        this.f4774x2eefaa.put(str, obj);
    }

    /* renamed from: setDelaySaveCodeCache */
    public void m16267xb1ea9fd7(boolean z17) {
        m16033x9d8ae0d8(this.f4785x75266c18, z17);
    }

    /* renamed from: setJavaTaskScheduler */
    public void m16268xa62c3172(com.p159x477cd522.p160x333422.V8.InterfaceC1467x6225dd94 interfaceC1467x6225dd94) {
        this.f4773x69848735 = interfaceC1467x6225dd94;
        m16018x679fd6e9(1L);
    }

    /* renamed from: setMinimalCodeLength */
    public void m16269xc7e91772(int i17) {
        m16035x74ac3251(this.f4785x75266c18, i17);
    }

    /* renamed from: setNativeJavaCallback */
    public void m16270x5df80a40(java.lang.Runnable runnable) {
        this.f4780xba94a1e1 = runnable;
    }

    /* renamed from: setPrototype */
    public void m16271x381056e0(long j17, long j18, long j19) {
        m16036xbaafc0bf(j17, j18, j19);
    }

    /* renamed from: setWeak */
    public void m16272x7651cefa(long j17, long j18) {
        m16037x2e175bb(j17, j18);
    }

    /* renamed from: shutdownExecutors */
    public void m16273x2ed5fc4a(boolean z17) {
        m16140x2edbf932();
        com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595> c1525x4d6875a = this.f4775xbef92200;
        if (c1525x4d6875a == null) {
            return;
        }
        for (com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595 c1524xfd44a595 : c1525x4d6875a.values()) {
            if (z17) {
                c1524xfd44a595.m16650xa1d57319();
            } else {
                c1524xfd44a595.m16659xf5e80656();
            }
        }
    }

    /* renamed from: strictEquals */
    public boolean m16274x25c8cfe8(long j17, long j18, long j19) {
        return m16039xa86839c7(j17, j18, j19);
    }

    /* renamed from: switchV8Context */
    public void m16275xa25c0bf9(long j17) {
        m16040x72b325dc(this.f4785x75266c18, j17);
    }

    /* renamed from: terminateExecution */
    public void m16276xb41a09b7() {
        this.f4776x5988a2ea = true;
        m16277xb41a09b7(this.f4785x75266c18);
    }

    /* renamed from: toString */
    public java.lang.String m16278x9616526c(long j17, long j18) {
        return m16042x9b7b83cb(j17, j18);
    }

    /* renamed from: waitForDebugger */
    public void m16279x77a01755(java.lang.String str, boolean z17) {
        m16140x2edbf932();
        m16043x6ccc6eab(this.f4785x75266c18, str, z17);
    }

    /* renamed from: waitForDebuggerWithContexts */
    public void m16280x7d01837f(java.lang.String str, long[] jArr, java.lang.String[] strArr) {
        m16140x2edbf932();
        m16044xda933fc0(this.f4785x75266c18, str, jArr, strArr);
    }

    /* renamed from: wakeUpUVLoop */
    public void m16281xd0578d04() {
        m16045x52f6f6e3(this.f4785x75266c18);
    }

    /* renamed from: weakReferenceReleased */
    public void m16282x27778110(long j17) {
        com.p159x477cd522.p160x333422.AbstractC1488x29d0ebef abstractC1488x29d0ebef = this.f4786x6c917f42.get(java.lang.Long.valueOf(j17));
        if (abstractC1488x29d0ebef != null) {
            this.f4786x6c917f42.remove(java.lang.Long.valueOf(j17));
            try {
                abstractC1488x29d0ebef.mo15825x41012807();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public V8(java.lang.String str, boolean z17, byte[] bArr, java.lang.String str2, boolean z18, int i17) {
        super(null);
        this.f4786x6c917f42 = new java.util.HashMap();
        this.f4774x2eefaa = null;
        this.f4781xe776727 = 0L;
        this.f4785x75266c18 = 0L;
        this.f4784x89ccbe25 = null;
        this.f4775xbef92200 = null;
        this.f4776x5988a2ea = false;
        this.f4777x45a0b035 = new java.util.HashMap();
        this.f4782x932bad4 = new java.util.LinkedList<>();
        this.f4783x73322790 = new java.util.LinkedList<>();
        this.f4773x69848735 = null;
        this.f4857xdf23d93d = false;
        try {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16455x45433dfc("CreateIsolate");
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f4785x75266c18 = m15948xd42f5610(str, z17, bArr, str2, z18, i17);
            this.f4778x7907205c = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            this.f4779xbe963318 = new com.p159x477cd522.p160x333422.C1476xfffd285a(this);
            m16140x2edbf932();
            if (z17) {
                this.f4856x9fca5247 = m15978xe6ebf4f9(this.f4785x75266c18);
            }
        } catch (java.lang.Throwable th6) {
            com.p159x477cd522.p160x333422.C1486x1128de25.m16456x82fef18a();
            throw th6;
        }
    }

    /* renamed from: createV8Runtime */
    public static com.p159x477cd522.p160x333422.V8 m16057x79233d5a(java.lang.String str) {
        return m16058x79233d5a(str, null);
    }

    public void add(long j17, long j18, java.lang.String str, boolean z17) {
        m15914x2ca7e2(j17, j18, str, z17);
    }

    /* renamed from: arrayGetBooleans */
    public int m16118x6a30caa8(long j17, long j18, int i17, int i18, boolean[] zArr) {
        return m15927x593a2d07(j17, j18, i17, i18, zArr);
    }

    /* renamed from: arrayGetBytes */
    public int m16121x36dad42e(long j17, long j18, int i17, int i18, byte[] bArr) {
        return m15930x828a62f(j17, j18, i17, i18, bArr);
    }

    /* renamed from: arrayGetDoubles */
    public int m16124x443f2dc5(long j17, long j18, int i17, int i18, double[] dArr) {
        return m15933xf9608386(j17, j18, i17, i18, dArr);
    }

    /* renamed from: arrayGetIntegers */
    public int m16127x14995852(long j17, long j18, int i17, int i18, int[] iArr) {
        return m15936x3a2bab1(j17, j18, i17, i18, iArr);
    }

    /* renamed from: arrayGetStrings */
    public int m16131x661dd185(long j17, long j18, int i17, int i18, java.lang.String[] strArr) {
        return m15940x1b3f2746(j17, j18, i17, i18, strArr);
    }

    /* renamed from: createNodeRuntime */
    public void m16145xb97824da(boolean z17) {
        m16038x62dbfc0e(this.f4785x75266c18, z17);
    }

    /* renamed from: executeArrayScript */
    public com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16158x152dcf(java.lang.String str, java.lang.String str2, int i17) {
        return m16159x152dcf(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeBooleanScript */
    public boolean m16163x110b299e(java.lang.String str, java.lang.String str2, int i17) {
        return m16164x110b299e(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeDoubleScript */
    public double m16169x21bc1c11(java.lang.String str, java.lang.String str2, int i17) {
        return m16170x21bc1c11(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeFunction */
    public java.lang.Object m16174xf9e28a6d(long j17, long j18, long j19, long j27) {
        return m15964xaf03e02e(j17, j18, j19, j27);
    }

    /* renamed from: executeIntegerScript */
    public int m16178x650a9634(java.lang.String str, java.lang.String str2, int i17) {
        return m16179x650a9634(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeObjectScript */
    public com.p159x477cd522.p160x333422.C1477x4679881 m16181x96f978ff(java.lang.String str, java.lang.String str2, int i17) {
        return m16182x96f978ff(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeScript */
    public java.lang.Object m16185x330788a0(java.lang.String str, java.lang.String str2, int i17) {
        return m16186x330788a0(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeStringScript */
    public java.lang.String m16190xe82dd051(java.lang.String str, java.lang.String str2, int i17) {
        return m16191xe82dd051(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: executeVoidScript */
    public void m16195xcb4354d4(java.lang.String str, java.lang.String str2, int i17) {
        m16196xcb4354d4(str, str2, i17, null, null, 0, null);
    }

    /* renamed from: getType */
    public int m16216xfb85f7b0(long j17, long j18, java.lang.String str) {
        return m15988x88159e71(j17, j18, str);
    }

    /* renamed from: initNewV8ArrayBuffer */
    public long m16222xfa049387(long j17, int i17) {
        return m15994xa6c7ae66(j17, i17);
    }

    /* renamed from: release */
    public void m16256x41012807(boolean z17) {
        if (mo16335xafdb8087()) {
            return;
        }
        m16140x2edbf932();
        try {
            m16084xa354ad07(this);
            m16093x790ccdde();
            m16273x2ed5fc4a(this.f4776x5988a2ea);
            com.p159x477cd522.p160x333422.p164x6a710b1.C1525x4d6875a<com.p159x477cd522.p160x333422.p164x6a710b1.C1524xfd44a595> c1525x4d6875a = this.f4775xbef92200;
            if (c1525x4d6875a != null) {
                c1525x4d6875a.clear();
            }
            m16092x18caa3e5();
            synchronized (f4759x32c52b) {
                f4763x48051b04--;
            }
            this.f4779xbe963318.m16434x41012807();
            m16028xea20e7f0(this.f4785x75266c18);
            this.f4785x75266c18 = 0L;
            this.f4857xdf23d93d = true;
            if (!z17 || m16211x53ed0a19() <= 0) {
                return;
            }
            throw new java.lang.IllegalStateException(this.f4781xe776727 + " Object(s) still exist in runtime");
        } catch (java.lang.Throwable th6) {
            m16093x790ccdde();
            m16273x2ed5fc4a(this.f4776x5988a2ea);
            if (this.f4775xbef92200 != null) {
                this.f4775xbef92200.clear();
            }
            m16092x18caa3e5();
            synchronized (f4759x32c52b) {
                f4763x48051b04--;
                this.f4779xbe963318.m16434x41012807();
                m16028xea20e7f0(this.f4785x75266c18);
                this.f4785x75266c18 = 0L;
                this.f4857xdf23d93d = true;
                if (z17 && m16211x53ed0a19() > 0) {
                    throw new java.lang.IllegalStateException(this.f4781xe776727 + " Object(s) still exist in runtime");
                }
                throw th6;
            }
        }
    }

    /* renamed from: createV8Runtime */
    public static com.p159x477cd522.p160x333422.V8 m16058x79233d5a(java.lang.String str, java.lang.String str2) {
        return m16060x79233d5a(str, str2, true, null, null);
    }

    public void add(long j17, long j18, java.lang.String str, double d17) {
        m15911x2ca7e2(j17, j18, str, d17);
    }

    /* renamed from: createTwin */
    public void m16146x519cbe04(long j17, long j18, long j19) {
        m15951x927b13a3(j17, j18, j19);
    }

    /* renamed from: executeArrayScript */
    public com.p159x477cd522.p160x333422.C1469x28b0ccd7 m16159x152dcf(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        java.lang.Object m16186x330788a0 = m16186x330788a0(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        if (m16186x330788a0 instanceof com.p159x477cd522.p160x333422.C1469x28b0ccd7) {
            return (com.p159x477cd522.p160x333422.C1469x28b0ccd7) m16186x330788a0;
        }
        throw new com.p159x477cd522.p160x333422.C1478xba225eb1();
    }

    /* renamed from: executeBooleanScript */
    public boolean m16164x110b299e(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        return m16161x110b299e(this.f4785x75266c18, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeDoubleScript */
    public double m16170x21bc1c11(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        return m16167x21bc1c11(this.f4785x75266c18, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeIntegerScript */
    public int m16179x650a9634(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        return m16176x650a9634(this.f4785x75266c18, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeObjectScript */
    public com.p159x477cd522.p160x333422.C1477x4679881 m16182x96f978ff(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        java.lang.Object m16186x330788a0 = m16186x330788a0(str, str2, i17, str3, str4, i18, c1452xdc35012d);
        if (m16186x330788a0 instanceof com.p159x477cd522.p160x333422.C1477x4679881) {
            return (com.p159x477cd522.p160x333422.C1477x4679881) m16186x330788a0;
        }
        throw new com.p159x477cd522.p160x333422.C1478xba225eb1();
    }

    /* renamed from: executeScript */
    public java.lang.Object m16186x330788a0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        return m16183x330788a0(m16218xd618fe8e(), 0, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeStringScript */
    public java.lang.String m16191xe82dd051(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        return m16188xe82dd051(this.f4785x75266c18, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeVoidScript */
    public void m16196xcb4354d4(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m16140x2edbf932();
        m16053x2ce0bbf3(str);
        m16193xcb4354d4(this.f4785x75266c18, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: getType */
    public int m16214xfb85f7b0(long j17, long j18, int i17) {
        return m15986x88159e71(j17, j18, i17);
    }

    /* renamed from: lowMemoryNotification */
    public void m16238xcc02d300(long j17) {
        m16009xb7a31401(j17);
    }

    /* renamed from: terminateExecution */
    public void m16277xb41a09b7(long j17) {
        m16041x6545056(j17);
    }

    /* renamed from: createV8Runtime */
    public static com.p159x477cd522.p160x333422.V8 m16059x79233d5a(java.lang.String str, java.lang.String str2, boolean z17) {
        return m16060x79233d5a(str, str2, z17, null, null);
    }

    public void add(long j17, long j18, java.lang.String str, java.lang.String str2) {
        m15913x2ca7e2(j17, j18, str, str2);
    }

    /* renamed from: executeFileScript */
    public java.lang.Object m16171x799b6abc(long j17, int i17, com.p159x477cd522.p160x333422.C1484x78647178 c1484x78647178, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, int i19, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15962x6bbe543d(j17, i17, c1484x78647178, str, i18, str2, str3, i19, c1452xdc35012d);
    }

    /* renamed from: getType */
    public int m16215xfb85f7b0(long j17, long j18, int i17, int i18) {
        return m15987x88159e71(j17, j18, i17, i18);
    }

    /* renamed from: createV8Runtime */
    public static com.p159x477cd522.p160x333422.V8 m16060x79233d5a(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, byte[] bArr) {
        return m16061x79233d5a(str, str2, z17, str3, bArr, null, false, 2);
    }

    /* renamed from: batchCompileAndGenCodeCacheForScripts */
    public java.lang.Object m16133x45b0ad22(long j17, com.p159x477cd522.p160x333422.C1481x17e6a5e9[] c1481x17e6a5e9Arr, java.lang.String str) {
        return m15942x6358cc23(j17, c1481x17e6a5e9Arr, str);
    }

    /* renamed from: batchExecuteScripts */
    public java.lang.Object m16135x723501ad(long j17, com.p159x477cd522.p160x333422.C1481x17e6a5e9[] c1481x17e6a5e9Arr, java.lang.String str, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15943x67438eee(j17, c1481x17e6a5e9Arr, str, c1452xdc35012d);
    }

    /* renamed from: createV8Runtime */
    public static com.p159x477cd522.p160x333422.V8 m16061x79233d5a(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, byte[] bArr, java.lang.String str4, boolean z18, int i17) {
        if (!f4760x2bf085c9) {
            synchronized (f4759x32c52b) {
                if (!f4760x2bf085c9) {
                    m16081x32c4e6(str2);
                }
            }
        }
        m16051xd1f2fba1();
        if (f4764x24d9ebc7.compareAndSet(true, false)) {
            m16020xa4fcf491();
        }
        com.p159x477cd522.p160x333422.V8 v86 = new com.p159x477cd522.p160x333422.V8(str, z17, bArr, str4, z18, i17);
        if (str3 != null) {
            v86.m16032xaaeccdfb(v86.f4785x75266c18, str3);
        }
        synchronized (f4759x32c52b) {
            f4763x48051b04++;
        }
        return v86;
    }

    /* renamed from: executeBooleanScript */
    public boolean m16161x110b299e(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15958xbdce447d(j17, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeDoubleScript */
    public double m16167x21bc1c11(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15961x16caa952(j17, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeIntegerScript */
    public int m16176x650a9634(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15966x11cdb113(j17, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeScript */
    public java.lang.Object m16183x330788a0(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15967x4555aa1(j17, i17, str, str2, i18, str3, str4, i19, c1452xdc35012d);
    }

    /* renamed from: executeStringScript */
    public java.lang.String m16188xe82dd051(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        return m15969xdd3c5d92(j17, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: executeVoidScript */
    public void m16193xcb4354d4(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.p159x477cd522.p160x333422.C1452xdc35012d c1452xdc35012d) {
        m15971xbd663e55(j17, str, str2, i17, str3, str4, i18, c1452xdc35012d);
    }

    /* renamed from: registerCallback */
    public void m16249xe7f76008(com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 interfaceC1456x656040a7, long j17, java.lang.String str) {
        m16143xdc233a4e(interfaceC1456x656040a7, m16251x1af320a6(m16218xd618fe8e(), j17, str, false));
    }

    /* renamed from: release */
    public void m16255x41012807(long j17, long j18) {
        m16024xcd90cec8(j17, j18);
    }
}
