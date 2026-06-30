package com.p314xaae8f345.p3121x37984a.p3125x2eaf9f;

/* renamed from: com.tencent.wcdb.core.Database */
/* loaded from: classes12.dex */
public class C26918x6e83759b extends com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26920xa8c17405 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58000x7118e671 = false;

    /* renamed from: DictDefaultMatchValue */
    public static final long f58001x610e5697 = Long.MAX_VALUE;

    /* renamed from: OperationInfoKeyHandleCount */
    public static java.lang.String f58002x19b829dd = "HandleCount";

    /* renamed from: OperationInfoKeyIndexCount */
    public static java.lang.String f58003xc5e53287 = "IndexCount";

    /* renamed from: OperationInfoKeyOpenCPUTime */
    public static java.lang.String f58004xb8e67901 = "OpenCPUTime";

    /* renamed from: OperationInfoKeyOpenTime */
    public static java.lang.String f58005x69f0c1e1 = "OpenTime";

    /* renamed from: OperationInfoKeySchemaUsage */
    public static java.lang.String f58006x85775296 = "SchemaUsage";

    /* renamed from: OperationInfoKeyTableCount */
    public static java.lang.String f58007x3fb09d0b = "TableCount";

    /* renamed from: OperationInfoKeyTriggerCount */
    public static java.lang.String f58008x9a8e02e1 = "TriggerCount";

    /* renamed from: com.tencent.wcdb.core.Database$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$wcdb$core$Database$ConfigPriority */
        static final /* synthetic */ int[] f58009xaffcf182;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.m106726xcee59d22().length];
            f58009xaffcf182 = iArr;
            try {
                iArr[com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.low.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f58009xaffcf182[com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.high.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f58009xaffcf182[com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.highest.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.tencent.wcdb.core.Database$BackupFilter */
    /* loaded from: classes12.dex */
    public interface BackupFilter {
        /* renamed from: tableShouldBeBackup */
        boolean m106710xc40b4e26(java.lang.String str);
    }

    /* renamed from: com.tencent.wcdb.core.Database$BusyTracer */
    /* loaded from: classes12.dex */
    public interface BusyTracer {
        /* renamed from: onTrace */
        void m106711xb05dc6a6(long j17, java.lang.String str, long j18, java.lang.String str2);
    }

    /* renamed from: com.tencent.wcdb.core.Database$CipherVersion */
    /* loaded from: classes12.dex */
    public enum CipherVersion {
        defaultVersion,
        version1,
        version2,
        version3,
        version4
    }

    /* renamed from: com.tencent.wcdb.core.Database$CloseCallBack */
    /* loaded from: classes12.dex */
    public interface CloseCallBack {
        /* renamed from: onClose */
        void mo106716xaf6bb359();
    }

    /* renamed from: com.tencent.wcdb.core.Database$CompressionFilter */
    /* loaded from: classes12.dex */
    public interface CompressionFilter {
        /* renamed from: filterCompress */
        void m106717xd04422fa(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionInfo compressionInfo);
    }

    /* renamed from: com.tencent.wcdb.core.Database$CompressionInfo */
    /* loaded from: classes12.dex */
    public static class CompressionInfo {

        /* renamed from: cppInfo */
        private long f58016x3a74d0f1;

        /* renamed from: table */
        public java.lang.String f58017x6903bce;

        public CompressionInfo(long j17, java.lang.String str) {
            this.f58016x3a74d0f1 = j17;
            this.f58017x6903bce = str;
        }

        /* renamed from: addZSTDDictCompress */
        public <T> void m106718xc46e05e2(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, byte b17) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106549xc46e05e2(this.f58016x3a74d0f1, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26981x40bb0da), b17);
        }

        /* renamed from: addZSTDMultiDictCompress */
        public <T> void m106719x52337aa7(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da2, java.util.Map<java.lang.Long, java.lang.Byte> map) {
            long[] jArr = new long[map.size()];
            byte[] bArr = new byte[map.size()];
            int i17 = 0;
            for (java.util.Map.Entry<java.lang.Long, java.lang.Byte> entry : map.entrySet()) {
                jArr[i17] = entry.getKey().longValue();
                bArr[i17] = entry.getValue().byteValue();
                i17++;
            }
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106550x52337aa7(this.f58016x3a74d0f1, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26981x40bb0da), com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26981x40bb0da2), jArr, bArr);
        }

        /* renamed from: addZSTDNormalCompress */
        public <T> void m106720xc7f07393(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da) {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106551xc7f07393(this.f58016x3a74d0f1, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) c26981x40bb0da));
        }

        /* renamed from: enableReplaceCompression */
        public <T> void m106721xeb55fcf5() {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106574xeb55fcf5(this.f58016x3a74d0f1);
        }
    }

    /* renamed from: com.tencent.wcdb.core.Database$CompressionNotification */
    /* loaded from: classes12.dex */
    public interface CompressionNotification {
        /* renamed from: onCompressed */
        void m106722xb11806c0(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, java.lang.String str);
    }

    /* renamed from: com.tencent.wcdb.core.Database$Config */
    /* loaded from: classes12.dex */
    public interface Config {
        /* renamed from: onInvocation */
        void mo106518x2ebfd7cf(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48);
    }

    /* renamed from: com.tencent.wcdb.core.Database$ConfigPriority */
    /* loaded from: classes12.dex */
    public enum ConfigPriority {
        low,
        default_,
        high,
        highest
    }

    /* renamed from: com.tencent.wcdb.core.Database$CorruptionNotification */
    /* loaded from: classes12.dex */
    public interface CorruptionNotification {
        /* renamed from: onCorrupted */
        void mo106519xb6f7e04d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b);
    }

    /* renamed from: com.tencent.wcdb.core.Database$ExceptionTracer */
    /* loaded from: classes12.dex */
    public interface ExceptionTracer {
        /* renamed from: onTrace */
        void mo106727xb05dc6a6(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 c26903x69761325);
    }

    /* renamed from: com.tencent.wcdb.core.Database$MigrationFilter */
    /* loaded from: classes12.dex */
    public interface MigrationFilter {
        /* renamed from: filterMigrate */
        void m106728x15674b13(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationInfo migrationInfo);
    }

    /* renamed from: com.tencent.wcdb.core.Database$MigrationInfo */
    /* loaded from: classes12.dex */
    public static class MigrationInfo {

        /* renamed from: filterCondition */
        public com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 f58022x58342883;

        /* renamed from: sourceTable */
        public java.lang.String f58023xfa50bc73;

        /* renamed from: table */
        public java.lang.String f58024x6903bce;
    }

    /* renamed from: com.tencent.wcdb.core.Database$MigrationNotification */
    /* loaded from: classes12.dex */
    public interface MigrationNotification {
        /* renamed from: onMigrated */
        void m106729x48a00318(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationInfo migrationInfo);
    }

    /* renamed from: com.tencent.wcdb.core.Database$Operation */
    /* loaded from: classes12.dex */
    public enum Operation {
        Create,
        SetTag,
        OpenHandle
    }

    /* renamed from: com.tencent.wcdb.core.Database$OperationTracer */
    /* loaded from: classes12.dex */
    public interface OperationTracer {
        /* renamed from: onTrace */
        void m106734xb05dc6a6(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Operation operation, java.util.HashMap<java.lang.String, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151> hashMap);
    }

    /* renamed from: com.tencent.wcdb.core.Database$PerformanceInfo */
    /* loaded from: classes12.dex */
    public static class PerformanceInfo {

        /* renamed from: costInNanoseconds */
        public long f58029x2aabd419;

        /* renamed from: indexPageReadCount */
        public int f58030xa91c2f98;

        /* renamed from: indexPageWriteCount */
        public int f58031x8c55d1d1;

        /* renamed from: overflowPageReadCount */
        public int f58032x19555268;

        /* renamed from: overflowPageWriteCount */
        public int f58033x23410901;

        /* renamed from: tablePageReadCount */
        public int f58034xf126d61c;

        /* renamed from: tablePageWriteCount */
        public int f58035x459ffbcd;
    }

    /* renamed from: com.tencent.wcdb.core.Database$PerformanceTracer */
    /* loaded from: classes12.dex */
    public interface PerformanceTracer {
        /* renamed from: onTrace */
        void mo106735xb05dc6a6(long j17, java.lang.String str, long j18, java.lang.String str2, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceInfo performanceInfo);
    }

    /* renamed from: com.tencent.wcdb.core.Database$ProgressMonitor */
    /* loaded from: classes12.dex */
    public interface ProgressMonitor {
        /* renamed from: onProgressUpdate */
        boolean m106736xc0e67915(double d17, double d18);
    }

    /* renamed from: com.tencent.wcdb.core.Database$SQLTracer */
    /* loaded from: classes12.dex */
    public interface SQLTracer {
        /* renamed from: onTrace */
        void m106737xb05dc6a6(long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3);
    }

    private C26918x6e83759b() {
    }

    /* renamed from: addAuxiliaryFunction */
    private static native void m106546x9e7c001d(long j17, java.lang.String str);

    /* renamed from: addMigrationSource */
    private static native void m106547x6eebbea8(long j17, java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationFilter migrationFilter);

    /* renamed from: addTokenizer */
    private static native void m106548x407376(long j17, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addZSTDDictCompress */
    public static native void m106549xc46e05e2(long j17, long j18, byte b17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addZSTDMultiDictCompress */
    public static native void m106550x52337aa7(long j17, long j18, long j19, long[] jArr, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addZSTDNormalCompress */
    public static native void m106551xc7f07393(long j17, long j18);

    /* renamed from: backup */
    private static native boolean m106552xacc075c2(long j17);

    /* renamed from: blockade */
    private static native void m106553xd8634cf5(long j17);

    /* renamed from: canOpen */
    private static native boolean m106554x20c2b23a(long j17);

    /* renamed from: checkIfCorrupted */
    private static native boolean m106555x47b1f4a7(long j17);

    /* renamed from: checkIfIsAlreadyCorrupted */
    private static native boolean m106556xef239463(long j17);

    /* renamed from: checkTableShouldBeBackup */
    private static boolean m106557x6a0dc3fe(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.BackupFilter backupFilter, java.lang.String str) {
        return backupFilter.m106710xc40b4e26(str);
    }

    /* renamed from: close */
    private static native void m106558x5a5ddf8(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CloseCallBack closeCallBack);

    /* renamed from: configPinyinDict */
    public static void m106559xdae175e1(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        if (strArr.length == 0) {
            return;
        }
        java.lang.String[][] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            java.util.List<java.lang.String> list = map.get(strArr[i17]);
            if (list != null) {
                strArr2[i17] = (java.lang.String[]) list.toArray(new java.lang.String[0]);
            }
        }
        m106560xdae175e1(strArr, strArr2);
    }

    /* renamed from: configPinyinDict */
    private static native void m106560xdae175e1(java.lang.String[] strArr, java.lang.String[][] strArr2);

    /* renamed from: configTraditionalChineseDict */
    public static void m106561x280307fe(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        if (strArr.length == 0) {
            return;
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length];
        for (int i17 = 0; i17 < strArr.length; i17++) {
            strArr2[i17] = map.get(strArr[i17]);
        }
        m106562x280307fe(strArr, strArr2);
    }

    /* renamed from: configTraditionalChineseDict */
    private static native void m106562x280307fe(java.lang.String[] strArr, java.lang.String[] strArr2);

    /* renamed from: containDepositedFiles */
    private static native boolean m106563xa33692ae(long j17);

    /* renamed from: createDatabase */
    private static native long m106564xa1a65a97(java.lang.String str, boolean z17, boolean z18);

    /* renamed from: createInMemoryDatabase */
    public static com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b m106565xf100833d() {
        long m106564xa1a65a97 = m106564xa1a65a97("", false, true);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b();
        c26918x6e83759b.f57826xaf4e2c54 = m106564xa1a65a97;
        return c26918x6e83759b;
    }

    /* renamed from: createThreadedException */
    private static com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 m106566xab14848a() {
        return com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.m106368xfbaab3(m106586xef1a8fa9());
    }

    /* renamed from: deposit */
    private static native boolean m106567x5ca7169e(long j17);

    /* renamed from: disableCompressNewData */
    private static native void m106568x1c471fa0(long j17, boolean z17);

    /* renamed from: enableAutoBackup */
    private static native void m106569xbd203a34(long j17, boolean z17);

    /* renamed from: enableAutoCompression */
    private static native void m106570xe0bd8c34(long j17, boolean z17);

    /* renamed from: enableAutoMigration */
    private static native void m106571x45c3c21c(long j17, boolean z17);

    /* renamed from: enableAutoVacuum */
    private static native void m106572xdf414c27(long j17, boolean z17);

    /* renamed from: enableLiteMode */
    private static native void m106573x6592ae14(long j17, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enableReplaceCompression */
    public static native void m106574xeb55fcf5(long j17);

    /* renamed from: enumerateInfo */
    private static native void m106575xff7fd32(java.util.HashMap<java.lang.String, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151> hashMap, long j17);

    /* renamed from: filterBackup */
    private static native void m106576x6115b35a(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.BackupFilter backupFilter);

    /* renamed from: filterCompress */
    private static void m106577xd04422fa(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionFilter compressionFilter, long j17, java.lang.String str) {
        compressionFilter.m106717xd04422fa(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionInfo(j17, str));
    }

    /* renamed from: filterMigrate */
    private static void m106578x15674b13(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationFilter migrationFilter, long j17, long j18, java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationInfo migrationInfo = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationInfo();
        migrationInfo.f58024x6903bce = str;
        migrationFilter.m106728x15674b13(migrationInfo);
        m106628x6c94985a(j17, j18, migrationInfo.f58023xfa50bc73, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2.get((com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26899xf18c2aa2) migrationInfo.f58022x58342883));
    }

    /* renamed from: getError */
    private static native long m106579x74627852(long j17);

    /* renamed from: getFileSize */
    private static native long m106580x50026913(long j17);

    /* renamed from: getHandle */
    public static native long m106581x1c19911e(long j17, boolean z17);

    /* renamed from: getNumberOfAliveHandle */
    private static native int m106582xe1ee52ff(long j17);

    /* renamed from: getPath */
    private static native java.lang.String m106583xfb83cc9b(long j17);

    /* renamed from: getPaths */
    private static native java.util.List<java.lang.String> m106584x74f5c738(long j17);

    /* renamed from: getTag */
    private static native long m106585xb5887064(long j17);

    /* renamed from: getThreadedError */
    private static native long m106586xef1a8fa9();

    /* renamed from: globalTraceBusy */
    public static native void m106587xe9e3107b(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.BusyTracer busyTracer, double d17);

    /* renamed from: globalTraceDatabaseOperation */
    public static native void m106588x66e0c2ea(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.OperationTracer operationTracer);

    /* renamed from: globalTraceException */
    public static native void m106589x75b7d30d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ExceptionTracer exceptionTracer);

    /* renamed from: globalTracePerformance */
    public static native void m106590xb355b6e(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceTracer performanceTracer);

    /* renamed from: globalTraceSQL */
    public static native void m106591x415a230c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.SQLTracer sQLTracer);

    /* renamed from: incrementalVacuum */
    private static native boolean m106592xe1d1202f(long j17, int i17);

    /* renamed from: isBlockaded */
    private static native boolean m106593x7a439405(long j17);

    /* renamed from: isCompressed */
    private static native boolean m106594x6b65a44b(long j17);

    /* renamed from: isMigrated */
    private static native boolean m106595x743d8763(long j17);

    /* renamed from: isOpened */
    private static native boolean m106596xebf0ba33(long j17);

    /* renamed from: moveFile */
    private static native boolean m106597xf9c054ed(long j17, java.lang.String str);

    /* renamed from: nativeRegisterDict */
    private static native boolean m106598xf209deb0(byte[] bArr, byte b17);

    /* renamed from: onBusyTrace */
    private static void m106599xd1023fad(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.BusyTracer busyTracer, long j17, java.lang.String str, long j18, java.lang.String str2) {
        busyTracer.m106711xb05dc6a6(j17, str, j18, str2);
    }

    /* renamed from: onClose */
    private static void m106600xaf6bb359(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CloseCallBack closeCallBack) {
        closeCallBack.mo106716xaf6bb359();
    }

    /* renamed from: onConfig */
    private static boolean m106601x3e345a01(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config) {
        try {
            config.mo106518x2ebfd7cf(new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48(j17, (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b) null));
            return true;
        } catch (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 unused) {
            return false;
        }
    }

    /* renamed from: onCorrupted */
    private static void m106602xb6f7e04d(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification corruptionNotification, long j17) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b();
        c26918x6e83759b.f57826xaf4e2c54 = j17;
        corruptionNotification.mo106519xb6f7e04d(c26918x6e83759b);
    }

    /* renamed from: onEnumerateInfo */
    private static void m106603x4306e193(java.util.HashMap<java.lang.String, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151> hashMap, java.lang.String str, int i17, long j17, double d17, java.lang.String str2) {
        if (i17 == 3) {
            hashMap.put(str, new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(j17));
        } else if (i17 == 5) {
            hashMap.put(str, new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(d17));
        } else if (i17 == 6) {
            hashMap.put(str, new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(str2));
        }
    }

    /* renamed from: onProgressUpdate */
    private static boolean m106604xc0e67915(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor, double d17, double d18) {
        return progressMonitor.m106736xc0e67915(d17, d18);
    }

    /* renamed from: onTableCompressed */
    private static void m106605xa37e2610(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionNotification compressionNotification, long j17, java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b();
        c26918x6e83759b.f57826xaf4e2c54 = j17;
        compressionNotification.m106722xb11806c0(c26918x6e83759b, str);
    }

    /* renamed from: onTableMigrated */
    private static void m106606x65a5b668(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationNotification migrationNotification, long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationInfo migrationInfo;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b();
        c26918x6e83759b.f57826xaf4e2c54 = j17;
        if (str == null || str.length() <= 0) {
            migrationInfo = null;
        } else {
            migrationInfo = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationInfo();
            migrationInfo.f58024x6903bce = str;
            migrationInfo.f58023xfa50bc73 = str2;
        }
        migrationNotification.m106729x48a00318(c26918x6e83759b, migrationInfo);
    }

    /* renamed from: onTraceException */
    private static void m106607x6d224449(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ExceptionTracer exceptionTracer, long j17) {
        exceptionTracer.mo106727xb05dc6a6(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.m106368xfbaab3(j17));
    }

    /* renamed from: onTraceOperation */
    private static void m106608x77ed4961(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.OperationTracer operationTracer, long j17, int i17, long j18) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b();
        c26918x6e83759b.f57826xaf4e2c54 = j17;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Operation operation = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Operation.Create;
        if (i17 == 1) {
            operation = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Operation.SetTag;
        } else if (i17 == 2) {
            operation = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Operation.OpenHandle;
        }
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151> hashMap = new java.util.HashMap<>();
        m106575xff7fd32(hashMap, j18);
        operationTracer.m106734xb05dc6a6(c26918x6e83759b, operation, hashMap);
    }

    /* renamed from: onTracePerformance */
    private static void m106609xd1c86daa(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceTracer performanceTracer, long j17, java.lang.String str, long j18, java.lang.String str2, long j19, int[] iArr) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceInfo performanceInfo;
        if (iArr == null || iArr.length != 6) {
            performanceInfo = null;
        } else {
            performanceInfo = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceInfo();
            performanceInfo.f58034xf126d61c = iArr[0];
            performanceInfo.f58035x459ffbcd = iArr[1];
            performanceInfo.f58030xa91c2f98 = iArr[2];
            performanceInfo.f58031x8c55d1d1 = iArr[3];
            performanceInfo.f58032x19555268 = iArr[4];
            performanceInfo.f58033x23410901 = iArr[5];
            performanceInfo.f58029x2aabd419 = j19;
        }
        performanceTracer.mo106735xb05dc6a6(j17, str, j18, str2, performanceInfo);
    }

    /* renamed from: onTraceSQL */
    private static void m106610xf0d13148(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.SQLTracer sQLTracer, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3) {
        sQLTracer.m106737xb05dc6a6(j17, str, j18, str2, str3);
    }

    /* renamed from: passiveCheckpoint */
    private static native boolean m106611xd7d1c0f(long j17);

    /* renamed from: purge */
    private static native void m106612x66130ab(long j17);

    /* renamed from: purgeAll */
    public static native void m106613x681f8cf6();

    /* renamed from: registerDict */
    public static void m106614x9a2ea4f9(byte[] bArr, byte b17) {
        if (!m106598xf209deb0(bArr, b17)) {
            throw m106566xab14848a();
        }
    }

    /* renamed from: releaseSQLiteMemory */
    public static native void m106615x30f3fdd4(int i17);

    /* renamed from: removeDepositedFiles */
    private static native boolean m106616x94f6325e(long j17);

    /* renamed from: removeFiles */
    private static native boolean m106617xed1b8453(long j17);

    /* renamed from: retrieve */
    private static native double m106618xed85403c(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor);

    /* renamed from: rollbackCompression */
    private static native boolean m106619x2a0b8be2(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor);

    /* renamed from: setAutoCheckpointEnable */
    private static native void m106620x8d3f07c(long j17, boolean z17);

    /* renamed from: setAutoCheckpointMinFrames */
    public static native void m106621x6a99b7ff(int i17);

    /* renamed from: setCipherKey */
    private static native void m106622x2989b212(long j17, byte[] bArr, int i17, int i18);

    /* renamed from: setCompression */
    private static native void m106623xc59613a4(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionFilter compressionFilter);

    /* renamed from: setConfig */
    private static native void m106624x78bda44(long j17, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config2, int i17);

    /* renamed from: setDefaultCipherVersion */
    private static native void m106625x3246330e(int i17);

    /* renamed from: setDefaultCipherVersion */
    public static void m106626x3246330e(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion cipherVersion) {
        m106625x3246330e(cipherVersion.ordinal());
    }

    /* renamed from: setFullSQLTraceEnable */
    private static native void m106627x401048eb(long j17, boolean z17);

    /* renamed from: setMigrationInfo */
    private static native void m106628x6c94985a(long j17, long j18, java.lang.String str, long j19);

    /* renamed from: setNotificationWhenCompressed */
    private static native void m106629xed858e28(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionNotification compressionNotification);

    /* renamed from: setNotificationWhenCorrupted */
    private static native void m106630x2c87cbe5(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification corruptionNotification);

    /* renamed from: setNotificationWhenMigrated */
    private static native void m106631x2184480(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationNotification migrationNotification);

    /* renamed from: setSoftHeapLimit */
    public static native void m106632x4d50bee3(long j17);

    /* renamed from: setTag */
    private static native void m106633xca0297d8(long j17, long j18);

    /* renamed from: stepCompression */
    private static native boolean m106634xe63e02fa(long j17);

    /* renamed from: stepMigration */
    private static native boolean m106635x845f3262(long j17);

    /* renamed from: traceException */
    private static native void m106636x3e549c8a(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ExceptionTracer exceptionTracer);

    /* renamed from: tracePerformance */
    private static native void m106637x1fc5b9ab(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceTracer performanceTracer);

    /* renamed from: traceSQL */
    private static native void m106638x4bb70e49(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.SQLTracer sQLTracer);

    /* renamed from: trainDict */
    private static native byte[] m106639x35e02dde(java.lang.String[] strArr, byte b17);

    /* renamed from: trainDict */
    private static native byte[] m106640x35e02dde(byte[][] bArr, byte b17);

    /* renamed from: trainDictWithData */
    public static byte[] m106641xbc7c158e(java.util.List<byte[]> list, byte b17) {
        byte[] m106640x35e02dde = m106640x35e02dde((byte[][]) list.toArray(new byte[0]), b17);
        if (m106640x35e02dde == null || m106640x35e02dde.length == 0) {
            throw m106566xab14848a();
        }
        return m106640x35e02dde;
    }

    /* renamed from: trainDictWithString */
    public static byte[] m106642xa8709cf5(java.util.List<java.lang.String> list, byte b17) {
        byte[] m106639x35e02dde = m106639x35e02dde((java.lang.String[]) list.toArray(new java.lang.String[0]), b17);
        if (m106639x35e02dde == null || m106639x35e02dde.length == 0) {
            throw m106566xab14848a();
        }
        return m106639x35e02dde;
    }

    /* renamed from: truncateCheckpoint */
    private static native boolean m106643xfdaf778e(long j17);

    /* renamed from: unblockade */
    private static native void m106644x335bb28e(long j17);

    /* renamed from: vacuum */
    private static native boolean m106645xcee187b5(long j17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor);

    /* renamed from: addAuxiliaryFunction */
    public void m106646x9e7c001d(java.lang.String str) {
        m106546x9e7c001d(this.f57826xaf4e2c54, str);
    }

    /* renamed from: addMigrationSource */
    public void m106648x6eebbea8(java.lang.String str, byte[] bArr, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationFilter migrationFilter) {
        m106547x6eebbea8(this.f57826xaf4e2c54, str, bArr, migrationFilter);
    }

    /* renamed from: addTokenizer */
    public void m106649x407376(java.lang.String str) {
        m106548x407376(this.f57826xaf4e2c54, str);
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26921x6472abff
    /* renamed from: autoInvalidateHandle */
    public boolean mo106650x96555712() {
        return true;
    }

    /* renamed from: backup */
    public void m106651xacc075c2() {
        if (!m106552xacc075c2(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: blockade */
    public void m106652xd8634cf5() {
        m106553xd8634cf5(this.f57826xaf4e2c54);
    }

    /* renamed from: canOpen */
    public boolean m106653x20c2b23a() {
        return m106554x20c2b23a(this.f57826xaf4e2c54);
    }

    /* renamed from: checkIfCorrupted */
    public boolean m106654x47b1f4a7() {
        return m106555x47b1f4a7(this.f57826xaf4e2c54);
    }

    /* renamed from: checkIfIsAlreadyCorrupted */
    public boolean m106655xef239463() {
        return m106556xef239463(this.f57826xaf4e2c54);
    }

    /* renamed from: close */
    public void m106657x5a5ddf8(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CloseCallBack closeCallBack) {
        long j17 = this.f57826xaf4e2c54;
        if (j17 != 0) {
            m106558x5a5ddf8(j17, closeCallBack);
        }
    }

    /* renamed from: containDepositedFiles */
    public boolean m106658xa33692ae() {
        return m106563xa33692ae(this.f57826xaf4e2c54);
    }

    /* renamed from: createException */
    public com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 m106659xfbaab3() {
        return com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.m106368xfbaab3(m106579x74627852(this.f57826xaf4e2c54));
    }

    /* renamed from: deposit */
    public void m106660x5ca7169e() {
        if (!m106567x5ca7169e(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: disableCompressNewData */
    public void m106661x1c471fa0(boolean z17) {
        m106568x1c471fa0(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: enableAutoBackup */
    public void m106662xbd203a34(boolean z17) {
        m106569xbd203a34(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: enableAutoCompression */
    public void m106663xe0bd8c34(boolean z17) {
        m106570xe0bd8c34(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: enableAutoMigration */
    public void m106664x45c3c21c(boolean z17) {
        m106571x45c3c21c(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: enableAutoVacuum */
    public void m106665xdf414c27(boolean z17) {
        m106572xdf414c27(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: enableLiteMode */
    public void m106666x6592ae14(boolean z17) {
        m106573x6592ae14(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: filterBackup */
    public void m106667x6115b35a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.BackupFilter backupFilter) {
        m106576x6115b35a(this.f57826xaf4e2c54, backupFilter);
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26920xa8c17405
    /* renamed from: getDatabase */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b mo106668xe6834ef1() {
        return this;
    }

    /* renamed from: getFileSize */
    public long m106669x50026913() {
        long m106580x50026913 = m106580x50026913(this.f57826xaf4e2c54);
        if (m106580x50026913 >= 0) {
            return m106580x50026913;
        }
        throw m106659xfbaab3();
    }

    /* renamed from: getHandle */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 m106670x1c19911e() {
        return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48(this, false);
    }

    /* renamed from: getNumberOfAliveHandle */
    public int m106672xe1ee52ff() {
        return m106582xe1ee52ff(this.f57826xaf4e2c54);
    }

    /* renamed from: getPath */
    public java.lang.String m106673xfb83cc9b() {
        return m106583xfb83cc9b(this.f57826xaf4e2c54);
    }

    /* renamed from: getPaths */
    public java.util.List<java.lang.String> m106674x74f5c738() {
        return m106584x74f5c738(this.f57826xaf4e2c54);
    }

    /* renamed from: getTag */
    public long m106675xb5887064() {
        return m106585xb5887064(this.f57826xaf4e2c54);
    }

    /* renamed from: incrementalVacuum */
    public void m106676xe1d1202f(int i17) {
        if (!m106592xe1d1202f(this.f57826xaf4e2c54, i17)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: isBlockaded */
    public boolean m106677x7a439405() {
        return m106593x7a439405(this.f57826xaf4e2c54);
    }

    /* renamed from: isCompressed */
    public boolean m106678x6b65a44b() {
        return m106594x6b65a44b(this.f57826xaf4e2c54);
    }

    /* renamed from: isMigrated */
    public boolean m106679x743d8763() {
        return m106595x743d8763(this.f57826xaf4e2c54);
    }

    /* renamed from: isOpened */
    public boolean m106680xebf0ba33() {
        return m106596xebf0ba33(this.f57826xaf4e2c54);
    }

    /* renamed from: moveFile */
    public void m106681xf9c054ed(java.lang.String str) {
        if (!m106597xf9c054ed(this.f57826xaf4e2c54, str)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: passiveCheckpoint */
    public void m106682xd7d1c0f() {
        if (!m106611xd7d1c0f(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: purge */
    public void m106683x66130ab() {
        m106612x66130ab(this.f57826xaf4e2c54);
    }

    /* renamed from: removeDepositedFiles */
    public void m106684x94f6325e() {
        if (!m106616x94f6325e(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: removeFiles */
    public void m106685xed1b8453() {
        if (!m106617xed1b8453(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: retrieve */
    public double m106686xed85403c(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor) {
        double m106618xed85403c = m106618xed85403c(this.f57826xaf4e2c54, progressMonitor);
        if (m106618xed85403c >= 0.0d) {
            return m106618xed85403c;
        }
        throw m106659xfbaab3();
    }

    /* renamed from: rollbackCompression */
    public void m106687x2a0b8be2(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor) {
        if (!m106619x2a0b8be2(this.f57826xaf4e2c54, progressMonitor)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: setAutoCheckpointEnable */
    public void m106688x8d3f07c(boolean z17) {
        m106620x8d3f07c(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: setCipherKey */
    public void m106691x2989b212(byte[] bArr, int i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion cipherVersion) {
        m106622x2989b212(this.f57826xaf4e2c54, bArr, i17, cipherVersion.ordinal());
    }

    /* renamed from: setCompression */
    public void m106692xc59613a4(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionFilter compressionFilter) {
        m106623xc59613a4(this.f57826xaf4e2c54, compressionFilter);
    }

    /* renamed from: setConfig */
    public void m106694x78bda44(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config2, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority configPriority) {
        int i17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.AnonymousClass1.f58009xaffcf182[configPriority.ordinal()];
        m106624x78bda44(this.f57826xaf4e2c54, str, config, config2, i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : Integer.MIN_VALUE : -100 : 100);
    }

    /* renamed from: setFullSQLTraceEnable */
    public void m106696x401048eb(boolean z17) {
        m106627x401048eb(this.f57826xaf4e2c54, z17);
    }

    /* renamed from: setNotificationWhenCompressed */
    public void m106697xed858e28(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CompressionNotification compressionNotification) {
        m106629xed858e28(this.f57826xaf4e2c54, compressionNotification);
    }

    /* renamed from: setNotificationWhenCorrupted */
    public void m106698x2c87cbe5(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CorruptionNotification corruptionNotification) {
        m106630x2c87cbe5(this.f57826xaf4e2c54, corruptionNotification);
    }

    /* renamed from: setNotificationWhenMigrated */
    public void m106699x2184480(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationNotification migrationNotification) {
        m106631x2184480(this.f57826xaf4e2c54, migrationNotification);
    }

    /* renamed from: setTag */
    public void m106700xca0297d8(long j17) {
        m106633xca0297d8(this.f57826xaf4e2c54, j17);
    }

    /* renamed from: stepCompression */
    public void m106701xe63e02fa() {
        if (!m106634xe63e02fa(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: stepMigration */
    public void m106702x845f3262() {
        if (!m106635x845f3262(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: traceException */
    public void m106703x3e549c8a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ExceptionTracer exceptionTracer) {
        m106636x3e549c8a(this.f57826xaf4e2c54, exceptionTracer);
    }

    /* renamed from: tracePerformance */
    public void m106704x1fc5b9ab(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.PerformanceTracer performanceTracer) {
        m106637x1fc5b9ab(this.f57826xaf4e2c54, performanceTracer);
    }

    /* renamed from: traceSQL */
    public void m106705x4bb70e49(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.SQLTracer sQLTracer) {
        m106638x4bb70e49(this.f57826xaf4e2c54, sQLTracer);
    }

    /* renamed from: truncateCheckpoint */
    public void m106706xfdaf778e() {
        if (!m106643xfdaf778e(this.f57826xaf4e2c54)) {
            throw m106659xfbaab3();
        }
    }

    /* renamed from: unblockade */
    public void m106707x335bb28e() {
        m106644x335bb28e(this.f57826xaf4e2c54);
    }

    /* renamed from: vacuum */
    public void m106708xcee187b5(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ProgressMonitor progressMonitor) {
        if (!m106645xcee187b5(this.f57826xaf4e2c54, progressMonitor)) {
            throw m106659xfbaab3();
        }
    }

    public C26918x6e83759b(java.lang.String str) {
        this.f57826xaf4e2c54 = m106564xa1a65a97(str, false, false);
    }

    /* renamed from: addMigrationSource */
    public void m106647x6eebbea8(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.MigrationFilter migrationFilter) {
        m106648x6eebbea8(str, null, migrationFilter);
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26921x6472abff
    /* renamed from: getHandle */
    public com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e(boolean z17) {
        return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48(this, z17);
    }

    /* renamed from: setCipherKey */
    public void m106690x2989b212(byte[] bArr, int i17) {
        m106691x2989b212(bArr, i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion.defaultVersion);
    }

    /* renamed from: close */
    public void m106656x5a5ddf8() {
        m106558x5a5ddf8(this.f57826xaf4e2c54, null);
    }

    /* renamed from: setCipherKey */
    public void m106689x2989b212(byte[] bArr) {
        m106690x2989b212(bArr, 4096);
    }

    /* renamed from: setConfig */
    public void m106695x78bda44(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority configPriority) {
        m106694x78bda44(str, config, null, configPriority);
    }

    public C26918x6e83759b(java.lang.String str, boolean z17) {
        this.f57826xaf4e2c54 = m106564xa1a65a97(str, z17, false);
    }

    /* renamed from: setConfig */
    public void m106693x78bda44(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.Config config) {
        m106695x78bda44(str, config, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.default_);
    }
}
