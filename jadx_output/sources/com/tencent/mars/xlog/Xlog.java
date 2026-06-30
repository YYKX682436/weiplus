package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public abstract class Xlog implements com.tencent.mars.xlog.Log.LogImp {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    protected static final int MAX_RECENT_LOGS = 100;
    public static int MONITOR_LEVEL = 2;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_COMPRESS_LEVEL1 = 1;
    public static final int ZSTD_COMPRESS_LEVEL2 = 2;
    public static final int ZSTD_COMPRESS_LEVEL3 = 3;
    public static final int ZSTD_COMPRESS_LEVEL4 = 4;
    public static final int ZSTD_COMPRESS_LEVEL5 = 5;
    public static final int ZSTD_COMPRESS_LEVEL6 = 6;
    public static final int ZSTD_COMPRESS_LEVEL7 = 7;
    public static final int ZSTD_COMPRESS_LEVEL8 = 8;
    public static final int ZSTD_COMPRESS_LEVEL9 = 9;
    public static final int ZSTD_MODE = 1;
    protected static java.lang.String mCacheDir = null;
    protected static java.lang.String mLogDir = null;
    protected static final java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> recentLogs = new java.util.concurrent.ConcurrentLinkedDeque<>();
    protected static java.lang.String xlog_pubkey = "1dac3876bd566b60c7dcbffd219ca6af2d2c07f045711bf2a6d111a2b1fc27c4df31c1f568879708c5159e370ab141e6627ea028b47f8a5cf4d39ca30d501f81";
    private byte _hellAccFlag_;

    /* loaded from: classes12.dex */
    public static class XLogConfig {
        public java.lang.String cachedir;
        public java.lang.String logdir;
        public java.lang.String nameprefix;
        public int level = 2;
        public int mode = 0;
        public java.lang.String pubkey = "";
        public int compressmode = 1;
        public int compresslevel = 6;
        public int cachedays = 0;
    }

    /* loaded from: classes12.dex */
    public static class XLoggerInfo {
        public java.lang.String filename;
        public java.lang.String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public java.lang.String tag;
        public long tid;
    }

    public static native void appenderOpen(com.tencent.mars.xlog.Xlog.XLogConfig xLogConfig);

    public static native long getLogLevelFunc();

    public static native long getLogWriteFunc();

    public static java.lang.String[] getRecentLogs() {
        return (java.lang.String[]) recentLogs.toArray(new java.lang.String[0]);
    }

    public static java.lang.String levelToString(int i17) {
        switch (i17) {
            case 0:
                return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            case 1:
                return "D";
            case 2:
                return "I";
            case 3:
                return androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST;
            case 4:
                return androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
            case 5:
                return "F";
            case 6:
                return "N";
            default:
                return "UNKNOWN(" + i17 + ")";
        }
    }

    public static native void logWrite(com.tencent.mars.xlog.Xlog.XLoggerInfo xLoggerInfo, java.lang.String str);

    public static native void logWrite2(long j17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j18, long j19, java.lang.String str4);

    public static void open(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tencentxlog");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mars/xlog/Xlog", "open", "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mars/xlog/Xlog", "open", "(ZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        com.tencent.mars.xlog.Log.appenderOpen(i17, i18, str, str2, str3, i19);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderClose();

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderFlush(long j17, boolean z17);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderOpen(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        mCacheDir = str;
        mLogDir = str2;
        com.tencent.mars.xlog.Xlog.XLogConfig xLogConfig = new com.tencent.mars.xlog.Xlog.XLogConfig();
        xLogConfig.level = i17;
        xLogConfig.mode = i18;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 1;
        xLogConfig.pubkey = xlog_pubkey;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i19;
        appenderOpen(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native int getLogLevel(long j17);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long getNativeLogLevelFunc() {
        return getLogLevelFunc();
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long getNativeWriteLogFunc() {
        return getLogWriteFunc();
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native long getXlogInstance(java.lang.String str);

    public native long newXlogInstance(com.tencent.mars.xlog.Xlog.XLogConfig xLogConfig);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long openLogInstance(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        com.tencent.mars.xlog.Xlog.XLogConfig xLogConfig = new com.tencent.mars.xlog.Xlog.XLogConfig();
        xLogConfig.level = i17;
        xLogConfig.mode = i18;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 1;
        xLogConfig.pubkey = xlog_pubkey;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i19;
        return newXlogInstance(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void releaseXlogInstance(java.lang.String str);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setAppenderMode(long j17, int i17);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setConsoleLogOpen(long j17, boolean z17);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxAliveTime(long j17, long j18);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxFileSize(long j17, long j18);
}
