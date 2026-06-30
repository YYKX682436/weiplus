package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* renamed from: com.tencent.mars.xlog.Xlog */
/* loaded from: classes12.dex */
public abstract class AbstractC4613x29a3ec implements com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 {

    /* renamed from: AppednerModeAsync */
    public static final int f19772x952e7d9e = 0;

    /* renamed from: AppednerModeSync */
    public static final int f19773xc2c7b339 = 1;

    /* renamed from: LEVEL_ALL */
    public static final int f19774x43737e26 = 0;

    /* renamed from: LEVEL_DEBUG */
    public static final int f19775x34b38998 = 1;

    /* renamed from: LEVEL_ERROR */
    public static final int f19776x34c7c54d = 4;

    /* renamed from: LEVEL_FATAL */
    public static final int f19777x34ce2849 = 5;

    /* renamed from: LEVEL_INFO */
    public static final int f19778x2afff0a9 = 2;

    /* renamed from: LEVEL_NONE */
    public static final int f19779x2b023b33 = 6;

    /* renamed from: LEVEL_VERBOSE */
    public static final int f19780x8f00ab87 = 0;

    /* renamed from: LEVEL_WARNING */
    public static final int f19781xbd18e1a1 = 3;

    /* renamed from: MAX_RECENT_LOGS */
    protected static final int f19782x41c83e98 = 100;

    /* renamed from: MONITOR_LEVEL */
    public static int f19783x70f6fc1f = 2;

    /* renamed from: ZLIB_MODE */
    public static final int f19784x828e0197 = 0;

    /* renamed from: ZSTD_COMPRESS_LEVEL1 */
    public static final int f19785x8c5f47f4 = 1;

    /* renamed from: ZSTD_COMPRESS_LEVEL2 */
    public static final int f19786x8c5f47f5 = 2;

    /* renamed from: ZSTD_COMPRESS_LEVEL3 */
    public static final int f19787x8c5f47f6 = 3;

    /* renamed from: ZSTD_COMPRESS_LEVEL4 */
    public static final int f19788x8c5f47f7 = 4;

    /* renamed from: ZSTD_COMPRESS_LEVEL5 */
    public static final int f19789x8c5f47f8 = 5;

    /* renamed from: ZSTD_COMPRESS_LEVEL6 */
    public static final int f19790x8c5f47f9 = 6;

    /* renamed from: ZSTD_COMPRESS_LEVEL7 */
    public static final int f19791x8c5f47fa = 7;

    /* renamed from: ZSTD_COMPRESS_LEVEL8 */
    public static final int f19792x8c5f47fb = 8;

    /* renamed from: ZSTD_COMPRESS_LEVEL9 */
    public static final int f19793x8c5f47fc = 9;

    /* renamed from: ZSTD_MODE */
    public static final int f19794xa30478b9 = 1;

    /* renamed from: mCacheDir */
    protected static java.lang.String f19795xb26bd38 = null;

    /* renamed from: mLogDir */
    protected static java.lang.String f19796xe039976 = null;

    /* renamed from: recentLogs */
    protected static final java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> f19797x14d9daaa = new java.util.concurrent.ConcurrentLinkedDeque<>();

    /* renamed from: xlog_pubkey */
    protected static java.lang.String f19798x56a25e15 = "1dac3876bd566b60c7dcbffd219ca6af2d2c07f045711bf2a6d111a2b1fc27c4df31c1f568879708c5159e370ab141e6627ea028b47f8a5cf4d39ca30d501f81";

    /* renamed from: _hellAccFlag_ */
    private byte f19799x7f11beae;

    /* renamed from: com.tencent.mars.xlog.Xlog$XLogConfig */
    /* loaded from: classes12.dex */
    public static class XLogConfig {

        /* renamed from: cachedir */
        public java.lang.String f19801xe6298dcb;

        /* renamed from: logdir */
        public java.lang.String f19805xbe97eac9;

        /* renamed from: nameprefix */
        public java.lang.String f19807x4c6d8dd;

        /* renamed from: level */
        public int f19804x6219b84 = 2;

        /* renamed from: mode */
        public int f19806x3339a3 = 0;

        /* renamed from: pubkey */
        public java.lang.String f19808xc5bdae42 = "";

        /* renamed from: compressmode */
        public int f19803x55f2a405 = 1;

        /* renamed from: compresslevel */
        public int f19802x684f7d62 = 6;

        /* renamed from: cachedays */
        public int f19800xdf080ed9 = 0;
    }

    /* renamed from: com.tencent.mars.xlog.Xlog$XLoggerInfo */
    /* loaded from: classes12.dex */
    public static class XLoggerInfo {

        /* renamed from: filename */
        public java.lang.String f19809xd4345207;

        /* renamed from: funcname */
        public java.lang.String f19810x524c9b4f;

        /* renamed from: level */
        public int f19811x6219b84;

        /* renamed from: line */
        public int f19812x32aff4;

        /* renamed from: maintid */
        public long f19813x3188b436;
        public long pid;
        public java.lang.String tag;
        public long tid;
    }

    /* renamed from: appenderOpen */
    public static native void m40612x6cf51c31(com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLogConfig xLogConfig);

    /* renamed from: getLogLevelFunc */
    public static native long m40613x8d4e4bfa();

    /* renamed from: getLogWriteFunc */
    public static native long m40614x9c3362d5();

    /* renamed from: getRecentLogs */
    public static java.lang.String[] m40615x31a92a0() {
        return (java.lang.String[]) f19797x14d9daaa.toArray(new java.lang.String[0]);
    }

    /* renamed from: levelToString */
    public static java.lang.String m40616xd1908e10(int i17) {
        switch (i17) {
            case 0:
                return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a;
            case 1:
                return "D";
            case 2:
                return "I";
            case 3:
                return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f;
            case 4:
                return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad;
            case 5:
                return "F";
            case 6:
                return "N";
            default:
                return "UNKNOWN(" + i17 + ")";
        }
    }

    /* renamed from: logWrite */
    public static native void m40617x77952efb(com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLoggerInfo xLoggerInfo, java.lang.String str);

    /* renamed from: logWrite2 */
    public static native void m40618x7b10b097(long j17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j18, long j19, java.lang.String str4);

    /* renamed from: open */
    public static void m40619x34264a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tencentxlog");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mars/xlog/Xlog", "open", "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mars/xlog/Xlog", "open", "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40531x6cf51c31(i17, i18, str, str2, str3, i19);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: appenderClose */
    public native void mo40545x3103a4f1();

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: appenderFlush */
    public native void mo40546x312e01fd(long j17, boolean z17);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: appenderOpen */
    public void mo40547x6cf51c31(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        f19795xb26bd38 = str;
        f19796xe039976 = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLogConfig xLogConfig = new com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLogConfig();
        xLogConfig.f19804x6219b84 = i17;
        xLogConfig.f19806x3339a3 = i18;
        xLogConfig.f19805xbe97eac9 = str2;
        xLogConfig.f19807x4c6d8dd = str3;
        xLogConfig.f19803x55f2a405 = 1;
        xLogConfig.f19808xc5bdae42 = f19798x56a25e15;
        xLogConfig.f19801xe6298dcb = str;
        xLogConfig.f19800xdf080ed9 = i19;
        m40612x6cf51c31(xLogConfig);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: getLogLevel */
    public native int mo40548xf2ceb016(long j17);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: getNativeLogLevelFunc */
    public long mo40549x97935531() {
        return m40613x8d4e4bfa();
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: getNativeWriteLogFunc */
    public long mo40550x212c0af6() {
        return m40614x9c3362d5();
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: getXlogInstance */
    public native long mo40551x85052ef7(java.lang.String str);

    /* renamed from: newXlogInstance */
    public native long m40620xc58e2a41(com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLogConfig xLogConfig);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: openLogInstance */
    public long mo40559x1b68a74f(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLogConfig xLogConfig = new com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.XLogConfig();
        xLogConfig.f19804x6219b84 = i17;
        xLogConfig.f19806x3339a3 = i18;
        xLogConfig.f19805xbe97eac9 = str2;
        xLogConfig.f19807x4c6d8dd = str3;
        xLogConfig.f19803x55f2a405 = 1;
        xLogConfig.f19808xc5bdae42 = f19798x56a25e15;
        xLogConfig.f19801xe6298dcb = str;
        xLogConfig.f19800xdf080ed9 = i19;
        return m40620xc58e2a41(xLogConfig);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: releaseXlogInstance */
    public native void mo40560xf3f84628(java.lang.String str);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: setAppenderMode */
    public native void mo40561x42fbd0c(long j17, int i17);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: setConsoleLogOpen */
    public native void mo40562x97568359(long j17, boolean z17);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: setMaxAliveTime */
    public native void mo40563xc4d409b8(long j17, long j18);

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: setMaxFileSize */
    public native void mo40564xbd864b5f(long j17, long j18);
}
