package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* loaded from: classes12.dex */
public class Log {

    /* renamed from: LEVEL_DEBUG */
    public static final int f19715x34b38998 = 1;

    /* renamed from: LEVEL_ERROR */
    public static final int f19716x34c7c54d = 4;

    /* renamed from: LEVEL_FATAL */
    public static final int f19717x34ce2849 = 5;

    /* renamed from: LEVEL_INFO */
    public static final int f19718x2afff0a9 = 2;

    /* renamed from: LEVEL_NONE */
    public static final int f19719x2b023b33 = 6;

    /* renamed from: LEVEL_VERBOSE */
    public static final int f19720x8f00ab87 = 0;

    /* renamed from: LEVEL_WARNING */
    public static final int f19721xbd18e1a1 = 3;

    /* renamed from: SYS_INFO */
    protected static java.lang.String f19722xa50b7700 = null;
    protected static final java.lang.String TAG = "MicroMsg.SDK.Log";

    /* renamed from: debugLog */
    protected static com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4604x3c6e5e3f f19723x20a68ff1 = null;

    /* renamed from: level */
    protected static int f19724x6219b84 = 6;

    /* renamed from: logImp */
    protected static com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 f19725xbe9785e8;

    /* renamed from: sLogInstanceMap */
    protected static java.util.Map<java.lang.String, com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9> f19726xd4d16df6;

    /* renamed from: com.tencent.mars.xlog.Log$LogImp */
    /* loaded from: classes12.dex */
    public interface InterfaceC4601x87fc7208 {
        /* renamed from: appenderClose */
        void mo40545x3103a4f1();

        /* renamed from: appenderFlush */
        void mo40546x312e01fd(long j17, boolean z17);

        /* renamed from: appenderOpen */
        void mo40547x6cf51c31(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19);

        /* renamed from: getLogLevel */
        int mo40548xf2ceb016(long j17);

        /* renamed from: getNativeLogLevelFunc */
        long mo40549x97935531();

        /* renamed from: getNativeWriteLogFunc */
        long mo40550x212c0af6();

        /* renamed from: getXlogInstance */
        long mo40551x85052ef7(java.lang.String str);

        /* renamed from: logD */
        void mo40552x32c580(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        /* renamed from: logE */
        void mo40553x32c581(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        /* renamed from: logF */
        void mo40554x32c582(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        /* renamed from: logI */
        void mo40555x32c585(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        /* renamed from: logV */
        void mo40556x32c592(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        /* renamed from: logW */
        void mo40557x32c593(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4);

        /* renamed from: moveLogsFromCacheDirToLogDir */
        void mo40558x580354d9();

        /* renamed from: openLogInstance */
        long mo40559x1b68a74f(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19);

        /* renamed from: releaseXlogInstance */
        void mo40560xf3f84628(java.lang.String str);

        /* renamed from: setAppenderMode */
        void mo40561x42fbd0c(long j17, int i17);

        /* renamed from: setConsoleLogOpen */
        void mo40562x97568359(long j17, boolean z17);

        /* renamed from: setMaxAliveTime */
        void mo40563xc4d409b8(long j17, long j18);

        /* renamed from: setMaxFileSize */
        void mo40564xbd864b5f(long j17, long j18);
    }

    /* renamed from: com.tencent.mars.xlog.Log$LogInstance */
    /* loaded from: classes12.dex */
    public static class C4602xec36bfd9 {

        /* renamed from: mLogInstancePtr */
        public long f19727xb9acfe02;

        /* renamed from: mPrefix */
        protected java.lang.String f19728x1500d95f;

        public C4602xec36bfd9(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
            this.f19727xb9acfe02 = 0L;
            this.f19728x1500d95f = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
            if (interfaceC4601x87fc7208 != null) {
                this.f19727xb9acfe02 = interfaceC4601x87fc7208.mo40559x1b68a74f(i17, i18, str, str2, str3, i19);
                this.f19728x1500d95f = str3;
            }
        }

        /* renamed from: appenderFlush */
        public void m40565x312e01fd() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
            if (interfaceC4601x87fc7208 != null) {
                long j17 = this.f19727xb9acfe02;
                if (j17 != 0) {
                    interfaceC4601x87fc7208.mo40546x312e01fd(j17, false);
                }
            }
        }

        /* renamed from: appenderFlushSync */
        public void m40566x65a4a38() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
            if (interfaceC4601x87fc7208 != null) {
                long j17 = this.f19727xb9acfe02;
                if (j17 != 0) {
                    interfaceC4601x87fc7208.mo40546x312e01fd(j17, true);
                }
            }
        }

        public void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 1 || this.f19727xb9acfe02 == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40552x32c580(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 4 || this.f19727xb9acfe02 == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40553x32c581(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 5 || this.f19727xb9acfe02 == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40554x32c582(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr));
        }

        /* renamed from: getLogLevel */
        public int m40567xf2ceb016() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
            if (interfaceC4601x87fc7208 == null) {
                return 6;
            }
            long j17 = this.f19727xb9acfe02;
            if (j17 != 0) {
                return interfaceC4601x87fc7208.mo40548xf2ceb016(j17);
            }
            return 6;
        }

        public void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 2 || this.f19727xb9acfe02 == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40555x32c585(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        /* renamed from: iNoFormat */
        public void m40568xe445c8a1(java.lang.String str, java.lang.String str2) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 2) {
                return;
            }
            long j17 = this.f19727xb9acfe02;
            if (j17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40555x32c585(j17, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2 == null ? "" : str2);
            }
        }

        /* renamed from: printErrStackTrace */
        public void m40569x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 4 || this.f19727xb9acfe02 == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40553x32c581(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
        }

        /* renamed from: setConsoleLogOpen */
        public void m40570x97568359(boolean z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
            if (interfaceC4601x87fc7208 != null) {
                long j17 = this.f19727xb9acfe02;
                if (j17 != 0) {
                    interfaceC4601x87fc7208.mo40562x97568359(j17, z17);
                }
            }
        }

        /* renamed from: setMaxAliveTime */
        public void m40571xc4d409b8(long j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
            if (interfaceC4601x87fc7208 != null) {
                long j18 = this.f19727xb9acfe02;
                if (j18 != 0) {
                    interfaceC4601x87fc7208.mo40563xc4d409b8(j18, j17);
                }
            }
        }

        public void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 0 || this.f19727xb9acfe02 == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40556x32c592(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }

        public void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 == null || m40567xf2ceb016() > 3 || this.f19727xb9acfe02 == 0) {
                return;
            }
            java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
            if (format == null) {
                format = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40557x32c593(this.f19727xb9acfe02, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format);
        }
    }

    /* renamed from: com.tencent.mars.xlog.Log$PendingLog */
    /* loaded from: classes12.dex */
    public static class C4603xdc0e824d {

        /* renamed from: df, reason: collision with root package name */
        protected static java.text.DateFormat f134072df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.ENGLISH);

        /* renamed from: level */
        protected int f19729x6219b84;
        protected java.lang.String log;
        protected java.lang.String tag;
        protected long tid;

        /* renamed from: timestamp */
        protected long f19730x3492916;

        /* renamed from: filling */
        public com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d m40573xcd0d0f7f(int i17, java.lang.String str, long j17, long j18, java.lang.String str2) {
            this.f19729x6219b84 = i17;
            this.tag = str;
            this.f19730x3492916 = j17;
            this.tid = j18;
            this.log = str2;
            return this;
        }

        /* renamed from: formatLog */
        public java.lang.String m40574x6bfa1bcd() {
            int i17 = this.f19729x6219b84;
            return java.lang.String.format(java.util.Locale.ENGLISH, "[%s][%s][%s] [:%s]%s", i17 == 2 ? "I" : i17 == 4 ? p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f : i17 == 4 ? p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad : "D", f134072df.format(new java.util.Date(this.f19730x3492916)), this.tag, java.lang.Long.valueOf(this.tid), this.log);
        }
    }

    /* renamed from: com.tencent.mars.xlog.Log$PendingLogImp */
    /* loaded from: classes12.dex */
    public static class C4604x3c6e5e3f implements com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 {

        /* renamed from: mRealLogImpl */
        protected volatile com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 f19733xd15d1959;

        /* renamed from: mPendingLogs */
        protected volatile java.util.ArrayList<com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d> f19732xec653139 = new java.util.ArrayList<>(200);

        /* renamed from: mLock */
        protected final byte[] f19731x6243b38 = new byte[0];

        /* renamed from: addLogLocked */
        public void m40575x5fe60bcd(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j18, long j19, java.lang.String str4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d c4603xdc0e824d = new com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f19731x6243b38) {
                if (this.f19732xec653139 != null) {
                    this.f19732xec653139.add(c4603xdc0e824d.m40573xcd0d0f7f(i17, str, currentTimeMillis, j18, str4));
                    return;
                }
                if (this.f19733xd15d1959 != null) {
                    if (i17 == 2) {
                        this.f19733xd15d1959.mo40555x32c585(j17, str, str2, str3, i18, i19, j18, j19, str4);
                        return;
                    }
                    if (i17 == 3) {
                        this.f19733xd15d1959.mo40557x32c593(j17, str, str2, str3, i18, i19, j18, j19, str4);
                    } else if (i17 == 4) {
                        this.f19733xd15d1959.mo40553x32c581(j17, str, str2, str3, i18, i19, j18, j19, str4);
                    } else {
                        if (i17 != 5) {
                            return;
                        }
                        this.f19733xd15d1959.mo40554x32c582(j17, str, str2, str3, i18, i19, j18, j19, str4);
                    }
                }
            }
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: appenderClose */
        public void mo40545x3103a4f1() {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: appenderFlush */
        public void mo40546x312e01fd(long j17, boolean z17) {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: appenderOpen */
        public void mo40547x6cf51c31(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        }

        /* renamed from: closeAndGetPendingLogs */
        public java.util.ArrayList<com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d> m40576x187c394f(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208) {
            java.util.ArrayList<com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d> arrayList;
            synchronized (this.f19731x6243b38) {
                if (interfaceC4601x87fc7208 != null) {
                    if (!(interfaceC4601x87fc7208 instanceof com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4604x3c6e5e3f)) {
                        this.f19733xd15d1959 = interfaceC4601x87fc7208;
                    }
                }
                arrayList = this.f19732xec653139;
                this.f19732xec653139 = null;
            }
            return arrayList;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: getLogLevel */
        public int mo40548xf2ceb016(long j17) {
            return com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19724x6219b84;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: getNativeLogLevelFunc */
        public long mo40549x97935531() {
            return 0L;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: getNativeWriteLogFunc */
        public long mo40550x212c0af6() {
            return 0L;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: getXlogInstance */
        public long mo40551x85052ef7(java.lang.String str) {
            return 0L;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: logD */
        public void mo40552x32c580(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            int i19 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19720x8f00ab87;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: logE */
        public void mo40553x32c581(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19724x6219b84 <= 4) {
                m40575x5fe60bcd(4, j17, str, str2, str3, i17, i18, j18, j19, str4);
            }
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: logF */
        public void mo40554x32c582(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19724x6219b84 > 5) {
                return;
            }
            m40575x5fe60bcd(4, j17, str, str2, str3, i17, i18, j18, j19, str4);
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: logI */
        public void mo40555x32c585(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19724x6219b84 <= 2) {
                m40575x5fe60bcd(2, j17, str, str2, str3, i17, i18, j18, j19, str4);
            }
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: logV */
        public void mo40556x32c592(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            int i19 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19720x8f00ab87;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: logW */
        public void mo40557x32c593(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19724x6219b84 <= 3) {
                m40575x5fe60bcd(3, j17, str, str2, str3, i17, i18, j18, j19, str4);
            }
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: moveLogsFromCacheDirToLogDir */
        public void mo40558x580354d9() {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: openLogInstance */
        public long mo40559x1b68a74f(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
            return 0L;
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: releaseXlogInstance */
        public void mo40560xf3f84628(java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: setAppenderMode */
        public void mo40561x42fbd0c(long j17, int i17) {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: setConsoleLogOpen */
        public void mo40562x97568359(long j17, boolean z17) {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: setMaxAliveTime */
        public void mo40563xc4d409b8(long j17, long j18) {
        }

        @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
        /* renamed from: setMaxFileSize */
        public void mo40564xbd864b5f(long j17, long j18) {
        }
    }

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4604x3c6e5e3f c4604x3c6e5e3f = new com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4604x3c6e5e3f();
        f19723x20a68ff1 = c4604x3c6e5e3f;
        f19725xbe9785e8 = c4604x3c6e5e3f;
        f19726xd4d16df6 = new java.util.HashMap();
    }

    /* renamed from: appenderClose */
    public static void m40528x3103a4f1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            interfaceC4601x87fc7208.mo40545x3103a4f1();
            f19726xd4d16df6.size();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9>> it = f19726xd4d16df6.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey());
            }
            java.util.ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                m40532x2d4cf6e1((java.lang.String) listIterator.next());
            }
        }
    }

    /* renamed from: appenderFlush */
    public static void m40529x312e01fd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            interfaceC4601x87fc7208.mo40546x312e01fd(0L, false);
            java.util.Iterator<java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9>> it = f19726xd4d16df6.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().m40565x312e01fd();
            }
        }
    }

    /* renamed from: appenderFlushSync */
    public static void m40530x65a4a38() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            interfaceC4601x87fc7208.mo40546x312e01fd(0L, true);
        }
    }

    /* renamed from: appenderOpen */
    public static void m40531x6cf51c31(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            interfaceC4601x87fc7208.mo40547x6cf51c31(i17, i18, str, str2, str3, i19);
        }
    }

    /* renamed from: closeLogInstance */
    public static void m40532x2d4cf6e1(java.lang.String str) {
        synchronized (f19726xd4d16df6) {
            if (f19725xbe9785e8 != null && f19726xd4d16df6.containsKey(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9 remove = f19726xd4d16df6.remove(str);
                f19725xbe9785e8.mo40560xf3f84628(str);
                remove.f19727xb9acfe02 = 0L;
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

    /* renamed from: getImpl */
    public static com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 m40533xfb80ca96() {
        return f19725xbe9785e8;
    }

    /* renamed from: getLogInstance */
    public static com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9 m40534x62a35ec3(java.lang.String str) {
        synchronized (f19726xd4d16df6) {
            if (!f19726xd4d16df6.containsKey(str)) {
                return null;
            }
            return f19726xd4d16df6.get(str);
        }
    }

    /* renamed from: getLogLevel */
    public static int m40535xf2ceb016() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            return interfaceC4601x87fc7208.mo40548xf2ceb016(0L);
        }
        return 6;
    }

    /* renamed from: getNativeLogLevelFunc */
    public static long m40536x97935531() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            return interfaceC4601x87fc7208.mo40549x97935531();
        }
        return 0L;
    }

    /* renamed from: getNativeWriteLogFunc */
    public static long m40537x212c0af6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            return interfaceC4601x87fc7208.mo40550x212c0af6();
        }
        return 0L;
    }

    /* renamed from: getSysInfo */
    public static java.lang.String m40538xd62ba4e5() {
        if (f19722xa50b7700 == null) {
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
                m40542x58ef3d35(TAG, th6, "", new java.lang.Object[0]);
            }
            f19722xa50b7700 = sb6.toString();
        }
        return f19722xa50b7700;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        i(str, str2, null);
    }

    /* renamed from: isDebug */
    public static boolean m40539x7a994349() {
        return m40535xf2ceb016() <= 1;
    }

    /* renamed from: moveLogsFromCacheDirToLogDir */
    public static void m40540x580354d9() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            interfaceC4601x87fc7208.mo40558x580354d9();
        }
    }

    /* renamed from: openLogInstance */
    public static com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9 m40541x1b68a74f(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19) {
        synchronized (f19726xd4d16df6) {
            if (f19726xd4d16df6.containsKey(str3)) {
                return f19726xd4d16df6.get(str3);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9 c4602xec36bfd9 = new com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4602xec36bfd9(i17, i18, str, str2, str3, i19);
            f19726xd4d16df6.put(str3, c4602xec36bfd9);
            return c4602xec36bfd9;
        }
    }

    /* renamed from: printErrStackTrace */
    public static void m40542x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        f19725xbe9785e8.mo40553x32c581(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    /* renamed from: setConsoleLogOpen */
    public static void m40543x97568359(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 != null) {
            interfaceC4601x87fc7208.mo40562x97568359(0L, z17);
        }
    }

    /* renamed from: setLevel */
    public static void m40544x534d5c42(int i17, boolean z17) {
        f19724x6219b84 = i17;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        w(str, str2, null);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 1) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        f19725xbe9785e8.mo40552x32c580(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 4) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        f19725xbe9785e8.mo40553x32c581(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 5) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        f19725xbe9785e8.mo40554x32c582(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 2) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        f19725xbe9785e8.mo40555x32c585(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 0) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        f19725xbe9785e8.mo40556x32c592(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 3) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        f19725xbe9785e8.mo40557x32c593(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), str2);
    }
}
