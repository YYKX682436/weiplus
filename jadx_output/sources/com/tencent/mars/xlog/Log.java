package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    protected static java.lang.String SYS_INFO = null;
    protected static final java.lang.String TAG = "MicroMsg.SDK.Log";
    protected static com.tencent.mars.xlog.Log.PendingLogImp debugLog = null;
    protected static int level = 6;
    protected static com.tencent.mars.xlog.Log.LogImp logImp;
    protected static java.util.Map<java.lang.String, com.tencent.mars.xlog.Log.LogInstance> sLogInstanceMap;

    /* loaded from: classes12.dex */
    public interface LogImp {
        void appenderClose();

        void appenderFlush(long j17, boolean z17);

        void appenderOpen(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19);

        int getLogLevel(long j17);

        long getNativeLogLevelFunc();

        long getNativeWriteLogFunc();

        long getXlogInstance(java.lang.String str);

        void logD(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        void logE(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        void logF(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        void logI(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        void logV(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        void logW(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        void moveLogsFromCacheDirToLogDir();

        long openLogInstance(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19);

        void releaseXlogInstance(java.lang.String str);

        void setAppenderMode(long j17, int i17);

        void setConsoleLogOpen(long j17, boolean z17);

        void setMaxAliveTime(long j17, long j18);

        void setMaxFileSize(long j17, long j18);
    }

    /* loaded from: classes12.dex */
    public static class LogInstance {
        public long mLogInstancePtr;
        protected java.lang.String mPrefix;

        public LogInstance(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
            this.mLogInstancePtr = 0L;
            this.mPrefix = null;
            com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
            if (logImp != null) {
                this.mLogInstancePtr = logImp.openLogInstance(i17, i18, str, str2, str3, i19);
                this.mPrefix = str3;
            }
        }

        public void appenderFlush() {
            com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
            if (logImp != null) {
                long j17 = this.mLogInstancePtr;
                if (j17 != 0) {
                    logImp.appenderFlush(j17, false);
                }
            }
        }

        public void appenderFlushSync() {
            com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
            if (logImp != null) {
                long j17 = this.mLogInstancePtr;
                if (j17 != 0) {
                    logImp.appenderFlush(j17, true);
                }
            }
        }

        public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 1 || this.mLogInstancePtr == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.tencent.mars.xlog.Log.logImp.logD(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 4 || this.mLogInstancePtr == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.tencent.mars.xlog.Log.logImp.logE(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 5 || this.mLogInstancePtr == 0) {
                return;
            }
            com.tencent.mars.xlog.Log.logImp.logF(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr));
        }

        public int getLogLevel() {
            com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
            if (logImp == null) {
                return 6;
            }
            long j17 = this.mLogInstancePtr;
            if (j17 != 0) {
                return logImp.getLogLevel(j17);
            }
            return 6;
        }

        public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 2 || this.mLogInstancePtr == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.tencent.mars.xlog.Log.logImp.logI(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void iNoFormat(java.lang.String str, java.lang.String str2) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 2) {
                return;
            }
            long j17 = this.mLogInstancePtr;
            if (j17 != 0) {
                com.tencent.mars.xlog.Log.logImp.logI(j17, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2 == null ? "" : str2);
            }
        }

        public void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 4 || this.mLogInstancePtr == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.tencent.mars.xlog.Log.logImp.logE(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
        }

        public void setConsoleLogOpen(boolean z17) {
            com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
            if (logImp != null) {
                long j17 = this.mLogInstancePtr;
                if (j17 != 0) {
                    logImp.setConsoleLogOpen(j17, z17);
                }
            }
        }

        public void setMaxAliveTime(long j17) {
            com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
            if (logImp != null) {
                long j18 = this.mLogInstancePtr;
                if (j18 != 0) {
                    logImp.setMaxAliveTime(j18, j17);
                }
            }
        }

        public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 0 || this.mLogInstancePtr == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.tencent.mars.xlog.Log.logImp.logV(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.tencent.mars.xlog.Log.logImp == null || getLogLevel() > 3 || this.mLogInstancePtr == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.tencent.mars.xlog.Log.logImp.logW(this.mLogInstancePtr, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }
    }

    /* loaded from: classes12.dex */
    public static class PendingLog {

        /* renamed from: df, reason: collision with root package name */
        protected static java.text.DateFormat f52539df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.ENGLISH);
        protected int level;
        protected java.lang.String log;
        protected java.lang.String tag;
        protected long tid;
        protected long timestamp;

        public com.tencent.mars.xlog.Log.PendingLog filling(int i17, java.lang.String str, long j17, long j18, java.lang.String str2) {
            this.level = i17;
            this.tag = str;
            this.timestamp = j17;
            this.tid = j18;
            this.log = str2;
            return this;
        }

        public java.lang.String formatLog() {
            int i17 = this.level;
            return java.lang.String.format(java.util.Locale.ENGLISH, "[%s][%s][%s] [:%s]%s", i17 == 2 ? "I" : i17 == 4 ? androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST : i17 == 4 ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : "D", f52539df.format(new java.util.Date(this.timestamp)), this.tag, java.lang.Long.valueOf(this.tid), this.log);
        }
    }

    /* loaded from: classes12.dex */
    public static class PendingLogImp implements com.tencent.mars.xlog.Log.LogImp {
        protected volatile com.tencent.mars.xlog.Log.LogImp mRealLogImpl;
        protected volatile java.util.ArrayList<com.tencent.mars.xlog.Log.PendingLog> mPendingLogs = new java.util.ArrayList<>(200);
        protected final byte[] mLock = new byte[0];

        public void addLogLocked(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j18, long j19, java.lang.String str4) {
            com.tencent.mars.xlog.Log.PendingLog pendingLog = new com.tencent.mars.xlog.Log.PendingLog();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.mLock) {
                if (this.mPendingLogs != null) {
                    this.mPendingLogs.add(pendingLog.filling(i17, str, currentTimeMillis, j18, str4));
                    return;
                }
                if (this.mRealLogImpl != null) {
                    if (i17 == 2) {
                        this.mRealLogImpl.logI(j17, str, str2, str3, i18, i19, j18, j19, str4);
                        return;
                    }
                    if (i17 == 3) {
                        this.mRealLogImpl.logW(j17, str, str2, str3, i18, i19, j18, j19, str4);
                    } else if (i17 == 4) {
                        this.mRealLogImpl.logE(j17, str, str2, str3, i18, i19, j18, j19, str4);
                    } else {
                        if (i17 != 5) {
                            return;
                        }
                        this.mRealLogImpl.logF(j17, str, str2, str3, i18, i19, j18, j19, str4);
                    }
                }
            }
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void appenderClose() {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void appenderFlush(long j17, boolean z17) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void appenderOpen(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        }

        public java.util.ArrayList<com.tencent.mars.xlog.Log.PendingLog> closeAndGetPendingLogs(com.tencent.mars.xlog.Log.LogImp logImp) {
            java.util.ArrayList<com.tencent.mars.xlog.Log.PendingLog> arrayList;
            synchronized (this.mLock) {
                if (logImp != null) {
                    if (!(logImp instanceof com.tencent.mars.xlog.Log.PendingLogImp)) {
                        this.mRealLogImpl = logImp;
                    }
                }
                arrayList = this.mPendingLogs;
                this.mPendingLogs = null;
            }
            return arrayList;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public int getLogLevel(long j17) {
            return com.tencent.mars.xlog.Log.level;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public long getNativeLogLevelFunc() {
            return 0L;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public long getNativeWriteLogFunc() {
            return 0L;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public long getXlogInstance(java.lang.String str) {
            return 0L;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logD(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            int i19 = com.tencent.mars.xlog.Log.LEVEL_VERBOSE;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logE(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.tencent.mars.xlog.Log.level <= 4) {
                addLogLocked(4, j17, str, str2, str3, i17, i18, j18, j19, str4);
            }
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logF(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.tencent.mars.xlog.Log.level > 5) {
                return;
            }
            addLogLocked(4, j17, str, str2, str3, i17, i18, j18, j19, str4);
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logI(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.tencent.mars.xlog.Log.level <= 2) {
                addLogLocked(2, j17, str, str2, str3, i17, i18, j18, j19, str4);
            }
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logV(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            int i19 = com.tencent.mars.xlog.Log.LEVEL_VERBOSE;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void logW(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.tencent.mars.xlog.Log.level <= 3) {
                addLogLocked(3, j17, str, str2, str3, i17, i18, j18, j19, str4);
            }
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void moveLogsFromCacheDirToLogDir() {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public long openLogInstance(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
            return 0L;
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void releaseXlogInstance(java.lang.String str) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setAppenderMode(long j17, int i17) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setConsoleLogOpen(long j17, boolean z17) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setMaxAliveTime(long j17, long j18) {
        }

        @Override // com.tencent.mars.xlog.Log.LogImp
        public void setMaxFileSize(long j17, long j18) {
        }
    }

    static {
        com.tencent.mars.xlog.Log.PendingLogImp pendingLogImp = new com.tencent.mars.xlog.Log.PendingLogImp();
        debugLog = pendingLogImp;
        logImp = pendingLogImp;
        sLogInstanceMap = new java.util.HashMap();
    }

    public static void appenderClose() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
            sLogInstanceMap.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.tencent.mars.xlog.Log.LogInstance>> it = sLogInstanceMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey());
            }
            java.util.ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                closeLogInstance((java.lang.String) listIterator.next());
            }
        }
    }

    public static void appenderFlush() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, false);
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.tencent.mars.xlog.Log.LogInstance>> it = sLogInstanceMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().appenderFlush();
            }
        }
    }

    public static void appenderFlushSync() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, true);
        }
    }

    public static void appenderOpen(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderOpen(i17, i18, str, str2, str3, i19);
        }
    }

    public static void closeLogInstance(java.lang.String str) {
        synchronized (sLogInstanceMap) {
            if (logImp != null && sLogInstanceMap.containsKey(str)) {
                com.tencent.mars.xlog.Log.LogInstance remove = sLogInstanceMap.remove(str);
                logImp.releaseXlogInstance(str);
                remove.mLogInstancePtr = 0L;
            }
        }
    }

    public static void d(java.lang.String str, java.lang.String str2) {
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        e(str, str2, null);
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        f(str, str2, null);
    }

    public static com.tencent.mars.xlog.Log.LogImp getImpl() {
        return logImp;
    }

    public static com.tencent.mars.xlog.Log.LogInstance getLogInstance(java.lang.String str) {
        synchronized (sLogInstanceMap) {
            if (!sLogInstanceMap.containsKey(str)) {
                return null;
            }
            return sLogInstanceMap.get(str);
        }
    }

    public static int getLogLevel() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel(0L);
        }
        return 6;
    }

    public static long getNativeLogLevelFunc() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getNativeLogLevelFunc();
        }
        return 0L;
    }

    public static long getNativeWriteLogFunc() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getNativeWriteLogFunc();
        }
        return 0L;
    }

    public static java.lang.String getSysInfo() {
        if (SYS_INFO == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                sb6.append("VERSION.RELEASE:[" + android.os.Build.VERSION.RELEASE);
                sb6.append("] VERSION.CODENAME:[" + android.os.Build.VERSION.CODENAME);
                sb6.append("] VERSION.INCREMENTAL:[" + android.os.Build.VERSION.INCREMENTAL);
                sb6.append("] BOARD:[" + android.os.Build.BOARD);
                sb6.append("] DEVICE:[" + android.os.Build.DEVICE);
                sb6.append("] DISPLAY:[" + android.os.Build.DISPLAY);
                sb6.append("] FINGERPRINT:[" + android.os.Build.FINGERPRINT);
                sb6.append("] HOST:[" + android.os.Build.HOST);
                sb6.append("] MANUFACTURER:[" + android.os.Build.MANUFACTURER);
                sb6.append("] MODEL:[" + android.os.Build.MODEL);
                sb6.append("] PRODUCT:[" + android.os.Build.PRODUCT);
                sb6.append("] TAGS:[" + android.os.Build.TAGS);
                sb6.append("] TYPE:[" + android.os.Build.TYPE);
                sb6.append("] USER:[" + android.os.Build.USER + "]");
            } catch (java.lang.Throwable th6) {
                printErrStackTrace(TAG, th6, "", new java.lang.Object[0]);
            }
            SYS_INFO = sb6.toString();
        }
        return SYS_INFO;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        i(str, str2, null);
    }

    public static boolean isDebug() {
        return getLogLevel() <= 1;
    }

    public static void moveLogsFromCacheDirToLogDir() {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.moveLogsFromCacheDirToLogDir();
        }
    }

    public static com.tencent.mars.xlog.Log.LogInstance openLogInstance(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        synchronized (sLogInstanceMap) {
            if (sLogInstanceMap.containsKey(str3)) {
                return sLogInstanceMap.get(str3);
            }
            com.tencent.mars.xlog.Log.LogInstance logInstance = new com.tencent.mars.xlog.Log.LogInstance(i17, i18, str, str2, str3, i19);
            sLogInstanceMap.put(str3, logInstance);
            return logInstance;
        }
    }

    public static void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        logImp.logE(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static void setConsoleLogOpen(boolean z17) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setConsoleLogOpen(0L, z17);
        }
    }

    public static void setLevel(int i17, boolean z17) {
        level = i17;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        w(str, str2, null);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 1) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logD(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 4) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logE(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 5) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        logImp.logF(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 2) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logI(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 0) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logV(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 3) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logW(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }
}
