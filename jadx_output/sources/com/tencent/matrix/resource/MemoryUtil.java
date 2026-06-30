package com.tencent.matrix.resource;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eJ\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\t\u0010\u0007\u001a\u00020\u0002H\u0082 J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 J)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 J)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 J)\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 J)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0082 J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000bH\u0082 ¨\u0006\u001f"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil;", "", "Ljz5/f0;", "loadJniCache", "", "storageDirPath", "syncTaskDir", "initializeSymbol", "hprofPath", "", "timeout", "", "forkDump", "resultPath", "referenceKey", "forkAnalyze", "nativeForkAnalyzeV2", "nativeAnalyzeSync", "nativeAnalyzeSyncV2", "forkDumpAndAnalyze", "pid", "Lcom/tencent/matrix/resource/MemoryUtil$TaskResult;", "waitTask", "ForkException", "InitializeException", "com/tencent/matrix/resource/m", "TaskResult", "TerminateException", "UnexpectedExitException", "UnknownAnalyzeException", "WaitException", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class MemoryUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final java.io.File f52933a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.matrix.resource.MemoryUtil.InitializeException f52934b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f52935c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.resource.MemoryUtil f52936d;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$ForkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class ForkException extends java.lang.RuntimeException {
        public ForkException() {
            super("Failed to fork task process");
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$InitializeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "throwable", "", "(Ljava/lang/Throwable;)V", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class InitializeException extends java.lang.RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializeException(java.lang.Throwable throwable) {
            super("Initialization failed due to: " + throwable);
            kotlin.jvm.internal.o.g(throwable, "throwable");
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$TaskResult;", "", "Ljava/lang/RuntimeException;", "exception$delegate", "Ljz5/g;", "getException", "()Ljava/lang/RuntimeException;", "exception", "", "type", "I", "code", "", "stateRaw", "B", "", "error", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "getState", "state", "", "getSuccess", "()Z", ya.b.SUCCESS, "<init>", "(IIBLjava/lang/String;)V", "Companion", "com/tencent/matrix/resource/n", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class TaskResult {
        public static final com.tencent.matrix.resource.n Companion = new com.tencent.matrix.resource.n(null);
        private static final int TYPE_EXIT = 0;
        private static final int TYPE_SIGNALED = 1;
        private static final int TYPE_WAIT_FAILED = -1;
        private final int code;
        private final java.lang.String error;

        /* renamed from: exception$delegate, reason: from kotlin metadata */
        private final jz5.g exception;
        private final byte stateRaw;
        private final int type;

        public TaskResult(int i17, int i18, byte b17, java.lang.String error) {
            kotlin.jvm.internal.o.g(error, "error");
            this.type = i17;
            this.code = i18;
            this.stateRaw = b17;
            this.error = error;
            this.exception = jz5.h.b(new com.tencent.matrix.resource.o(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String getState() {
            switch (this.stateRaw) {
                case 1:
                    return "dump";
                case 2:
                    return "analyzer_create";
                case 3:
                    return "analyzer_initialize";
                case 4:
                    return "analyzer_execute";
                case 5:
                    return "create_result_file";
                case 6:
                    return "serialize";
                default:
                    return com.eclipsesource.mmv8.Platform.UNKNOWN;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getSuccess() {
            return this.type == 0 && this.code == 0;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.RuntimeException getException() {
            return (java.lang.RuntimeException) this.exception.getValue();
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$TerminateException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "signal", "", "state", "", "error", "(ILjava/lang/String;Ljava/lang/String;)V", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class TerminateException extends java.lang.RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TerminateException(int i17, java.lang.String state, java.lang.String error) {
            super("Task process was terminated by signal " + i17 + " (state: " + state + ", error: " + error + ')');
            kotlin.jvm.internal.o.g(state, "state");
            kotlin.jvm.internal.o.g(error, "error");
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$UnexpectedExitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "state", "", "error", "(ILjava/lang/String;Ljava/lang/String;)V", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class UnexpectedExitException extends java.lang.RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedExitException(int i17, java.lang.String state, java.lang.String error) {
            super("Task process exited with code " + i17 + " unexpectedly (state: " + state + ", error: " + error + ')');
            kotlin.jvm.internal.o.g(state, "state");
            kotlin.jvm.internal.o.g(error, "error");
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$UnknownAnalyzeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "type", "", "code", "state", "", "error", "(IILjava/lang/String;Ljava/lang/String;)V", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class UnknownAnalyzeException extends java.lang.RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownAnalyzeException(int i17, int i18, java.lang.String state, java.lang.String error) {
            super("Unknown error with type " + i17 + " returned from task process (code: " + i18 + ", state: " + state + ", error: " + error + ')');
            kotlin.jvm.internal.o.g(state, "state");
            kotlin.jvm.internal.o.g(error, "error");
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$WaitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errno", "", "(I)V", "matrix-resource-canary-android_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes11.dex */
    public static final class WaitException extends java.lang.RuntimeException {
        public WaitException(int i17) {
            super("Failed to wait task process with errno " + i17);
        }
    }

    static {
        com.tencent.matrix.resource.MemoryUtil.InitializeException initializeException;
        com.tencent.matrix.resource.MemoryUtil memoryUtil = new com.tencent.matrix.resource.MemoryUtil();
        f52936d = memoryUtil;
        ih.d d17 = ih.d.d();
        kotlin.jvm.internal.o.f(d17, "Matrix.with()");
        android.app.Application application = d17.f291471b;
        kotlin.jvm.internal.o.f(application, "Matrix.with().application");
        java.io.File file = new java.io.File(application.getCacheDir(), "matrix_mem_util");
        com.tencent.matrix.resource.t.a(file);
        f52933a = file;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("matrix_mem_util");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/resource/MemoryUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/matrix/resource/MemoryUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            memoryUtil.loadJniCache();
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.o.f(absolutePath, "storageDir.absolutePath");
            memoryUtil.syncTaskDir(absolutePath);
            memoryUtil.initializeSymbol();
            initializeException = null;
        } catch (java.lang.Throwable th6) {
            initializeException = new com.tencent.matrix.resource.MemoryUtil.InitializeException(th6);
        }
        f52934b = initializeException;
        f52935c = new java.text.SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", java.util.Locale.US);
    }

    public static final java.lang.String d(java.lang.String hprofPath, java.lang.String referenceKey, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(hprofPath, "hprofPath");
        kotlin.jvm.internal.o.g(referenceKey, "referenceKey");
        com.tencent.matrix.resource.MemoryUtil memoryUtil = f52936d;
        com.tencent.matrix.resource.q qVar = new com.tencent.matrix.resource.q(memoryUtil);
        if (f52934b != null) {
            return "ERROR: init failed";
        }
        java.io.File e17 = memoryUtil.e();
        if (e17 == null) {
            return "ERROR: create file failed";
        }
        java.lang.String resultPath = e17.getAbsolutePath();
        kotlin.jvm.internal.o.f(resultPath, "resultPath");
        int intValue = ((java.lang.Number) qVar.C(hprofPath, resultPath, referenceKey, java.lang.Long.valueOf(j17))).intValue();
        if (intValue != -1) {
            com.tencent.matrix.resource.t.b("Wait for task process [" + intValue + "] complete executing.");
            com.tencent.matrix.resource.MemoryUtil.TaskResult waitTask = memoryUtil.waitTask(intValue);
            if (waitTask.getException() != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Task process [");
                sb6.append(intValue);
                sb6.append("] complete with error: ");
                java.lang.RuntimeException exception = waitTask.getException();
                kotlin.jvm.internal.o.d(exception);
                sb6.append(exception.getMessage());
                sb6.append('.');
                com.tencent.matrix.resource.t.b(sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ERROR: ");
                java.lang.RuntimeException exception2 = waitTask.getException();
                kotlin.jvm.internal.o.d(exception2);
                sb7.append(exception2.getMessage());
                str = sb7.toString();
            } else {
                com.tencent.matrix.resource.t.b("Task process [" + intValue + "] complete without error.");
                try {
                    kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                    h0Var.f310123d = "ERROR: analyse failed";
                    com.tencent.matrix.resource.r rVar = new com.tencent.matrix.resource.r(h0Var);
                    java.nio.charset.Charset charset = r26.c.f368865a;
                    kotlin.jvm.internal.o.g(charset, "charset");
                    vz5.v.a(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(e17), charset)), rVar);
                    str = (java.lang.String) h0Var.f310123d;
                } catch (java.lang.Throwable th6) {
                    str = "Reading result file failed: " + android.util.Log.getStackTraceString(th6);
                }
            }
        } else {
            str = "ERROR: fork failed";
        }
        if (!e17.exists()) {
            return str;
        }
        e17.delete();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native int forkAnalyze(java.lang.String hprofPath, java.lang.String resultPath, java.lang.String referenceKey, long timeout);

    private final native int forkDump(java.lang.String hprofPath, long timeout);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int forkDumpAndAnalyze(java.lang.String hprofPath, java.lang.String resultPath, java.lang.String referenceKey, long timeout);

    public static final boolean h(java.lang.String hprofPath, long j17) {
        kotlin.jvm.internal.o.g(hprofPath, "hprofPath");
        com.tencent.matrix.resource.MemoryUtil.InitializeException initializeException = f52934b;
        if (initializeException != null) {
            oj.j.d("Matrix.MemoryUtil", initializeException, "", new java.lang.Object[0]);
            return false;
        }
        com.tencent.matrix.resource.MemoryUtil memoryUtil = f52936d;
        int forkDump = memoryUtil.forkDump(hprofPath, j17);
        if (forkDump == -1) {
            oj.j.b("Matrix.MemoryUtil", "Failed to fork task executing process.", new java.lang.Object[0]);
            return false;
        }
        com.tencent.matrix.resource.t.b("Wait for task process [" + forkDump + "] complete executing.");
        com.tencent.matrix.resource.MemoryUtil.TaskResult waitTask = memoryUtil.waitTask(forkDump);
        java.lang.RuntimeException exception = waitTask.getException();
        if (exception != null) {
            com.tencent.matrix.resource.t.b("Task process [" + forkDump + "] complete with error: " + exception.getMessage() + '.');
        } else {
            com.tencent.matrix.resource.t.b("Task process [" + forkDump + "] complete without error.");
        }
        return waitTask.getException() == null;
    }

    private final native void initializeSymbol();

    private final native void loadJniCache();

    private final native int nativeAnalyzeSync(java.lang.String hprofPath, java.lang.String resultPath, java.lang.String referenceKey, long timeout);

    private final native int nativeAnalyzeSyncV2(java.lang.String hprofPath, java.lang.String resultPath, java.lang.String referenceKey, long timeout);

    /* JADX INFO: Access modifiers changed from: private */
    public final native int nativeForkAnalyzeV2(java.lang.String hprofPath, java.lang.String resultPath, java.lang.String referenceKey, long timeout);

    private final native void syncTaskDir(java.lang.String str);

    private final native com.tencent.matrix.resource.MemoryUtil.TaskResult waitTask(int pid);

    public final java.io.File e() {
        java.text.SimpleDateFormat simpleDateFormat = f52935c;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.o.f(calendar, "Calendar.getInstance()");
        java.lang.String format = simpleDateFormat.format(calendar.getTime());
        java.io.File file = new java.io.File(f52933a, "result");
        com.tencent.matrix.resource.t.a(file);
        java.io.File file2 = new java.io.File(file, "result-" + format + ".tmp");
        try {
            file2.createNewFile();
            return file2;
        } catch (java.io.IOException unused) {
            oj.j.b("Matrix.MemoryUtil", "Failed to create analyze result file on path " + file2.getAbsolutePath() + '.', new java.lang.Object[0]);
            return null;
        }
    }

    public final ti.a f(java.lang.String str, java.lang.String str2, long j17, yz5.r rVar) {
        ti.a a17;
        com.tencent.matrix.resource.MemoryUtil.InitializeException initializeException = f52934b;
        if (initializeException != null) {
            return ti.a.a(initializeException, 0L);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.matrix.resource.MemoryUtil memoryUtil = f52936d;
        java.io.File e17 = memoryUtil.e();
        if (e17 == null) {
            return ti.a.a(new java.lang.RuntimeException("Failed to create temporary analyze result file."), 0L);
        }
        java.lang.String resultPath = e17.getAbsolutePath();
        kotlin.jvm.internal.o.f(resultPath, "resultPath");
        int intValue = ((java.lang.Number) rVar.C(str, resultPath, str2, java.lang.Long.valueOf(j17))).intValue();
        if (intValue != -1) {
            com.tencent.matrix.resource.t.b("Wait for task process [" + intValue + "] complete executing.");
            com.tencent.matrix.resource.MemoryUtil.TaskResult waitTask = memoryUtil.waitTask(intValue);
            if (waitTask.getException() != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Task process [");
                sb6.append(intValue);
                sb6.append("] complete with error: ");
                java.lang.RuntimeException exception = waitTask.getException();
                kotlin.jvm.internal.o.d(exception);
                sb6.append(exception.getMessage());
                sb6.append('.');
                com.tencent.matrix.resource.t.b(sb6.toString());
                a17 = ti.a.a(waitTask.getException(), java.lang.System.currentTimeMillis() - currentTimeMillis);
            } else {
                com.tencent.matrix.resource.t.b("Task process [" + intValue + "] complete without error.");
                try {
                    java.util.List g17 = memoryUtil.g(e17);
                    if (g17.isEmpty()) {
                        a17 = ti.a.b(java.lang.System.currentTimeMillis() - currentTimeMillis);
                    } else {
                        com.tencent.matrix.resource.m mVar = (com.tencent.matrix.resource.m) kz5.n0.X(g17);
                        a17 = new ti.a(true, false, ((com.tencent.matrix.resource.l) kz5.n0.i0(mVar.f52962a)).f52958a, mVar.a(), null, java.lang.System.currentTimeMillis() - currentTimeMillis);
                    }
                } catch (java.lang.Throwable th6) {
                    a17 = ti.a.a(th6, java.lang.System.currentTimeMillis() - currentTimeMillis);
                }
            }
        } else {
            a17 = ti.a.a(new com.tencent.matrix.resource.MemoryUtil.ForkException(), 0L);
        }
        if (!e17.exists()) {
            return a17;
        }
        e17.delete();
        return a17;
    }

    public final java.util.List g(java.io.File file) {
        com.tencent.matrix.resource.u uVar;
        java.lang.String str;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        if (java.util.Arrays.equals(bArr, new byte[]{0, 0, 0, 1})) {
            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
            kotlin.jvm.internal.o.f(byteOrder, "ByteOrder.BIG_ENDIAN");
            uVar = new com.tencent.matrix.resource.u(byteOrder, fileInputStream);
        } else {
            java.nio.ByteOrder byteOrder2 = java.nio.ByteOrder.LITTLE_ENDIAN;
            kotlin.jvm.internal.o.f(byteOrder2, "ByteOrder.LITTLE_ENDIAN");
            uVar = new com.tencent.matrix.resource.u(byteOrder2, fileInputStream);
        }
        try {
            try {
                java.io.InputStream inputStream = uVar.f52971b;
                int a17 = uVar.a();
                if (a17 == 0) {
                    inputStream.close();
                    kz5.p0 p0Var = kz5.p0.f313996d;
                    inputStream.close();
                    return p0Var;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < a17; i17++) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int a18 = uVar.a();
                    for (int i18 = 0; i18 < a18; i18++) {
                        int a19 = uVar.a();
                        byte[] bArr2 = new byte[uVar.a()];
                        inputStream.read(bArr2);
                        java.nio.charset.Charset charset = r26.c.f368865a;
                        java.lang.String str2 = new java.lang.String(bArr2, charset);
                        int a27 = uVar.a();
                        if (a27 == 0) {
                            str = "";
                        } else {
                            byte[] bArr3 = new byte[uVar.a()];
                            inputStream.read(bArr3);
                            str = new java.lang.String(bArr3, charset);
                        }
                        arrayList2.add(new com.tencent.matrix.resource.l(str2, a19, str, a27));
                    }
                    arrayList.add(new com.tencent.matrix.resource.m(arrayList2));
                }
                inputStream.close();
                return arrayList;
            } catch (java.io.IOException e17) {
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            uVar.f52971b.close();
            throw th6;
        }
    }
}
