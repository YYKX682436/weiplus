package com.p314xaae8f345.p3121x37984a.p3122x2e06d1;

/* renamed from: com.tencent.wcdb.base.WCDBException */
/* loaded from: classes12.dex */
public class C26903x69761325 extends java.lang.RuntimeException {

    /* renamed from: code */
    public final com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code f57830x2eaded;

    /* renamed from: info */
    public final java.util.Map<java.lang.String, java.lang.Object> f57831x3164ae;

    /* renamed from: level */
    public final com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level f57832x6219b84;

    /* renamed from: com.tencent.wcdb.base.WCDBException$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$wcdb$base$WCDBException$Level */
        static final /* synthetic */ int[] f57833x75df550a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.m106400xcee59d22().length];
            f57833x75df550a = iArr;
            try {
                iArr[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Ignore.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f57833x75df550a[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Debug.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f57833x75df550a[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Notice.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f57833x75df550a[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Warning.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f57833x75df550a[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Error.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f57833x75df550a[com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Fatal.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.tencent.wcdb.base.WCDBException$Code */
    /* loaded from: classes12.dex */
    public enum Code {
        OK(0),
        Error(1),
        Internal(2),
        Permission(3),
        Abort(4),
        Busy(5),
        Locked(6),
        NoMemory(7),
        Readonly(8),
        Interrupt(9),
        IOError(10),
        Corrupt(11),
        NotFound(12),
        Full(13),
        CantOpen(14),
        Protocol(15),
        Empty(16),
        Schema(17),
        Exceed(18),
        Constraint(19),
        Mismatch(20),
        Misuse(21),
        NoLargeFileSupport(22),
        Authorization(23),
        Format(24),
        Range(25),
        NotADatabase(26),
        Notice(27),
        Warning(28),
        Row(100),
        Done(101),
        Unknown(-1);


        /* renamed from: value */
        private final int f57865x6ac9171;

        Code(int i17) {
            this.f57865x6ac9171 = i17;
        }

        /* renamed from: value */
        public int m106383x6ac9171() {
            return this.f57865x6ac9171;
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code m106380xdce0328(int i17) {
            if (i17 == 100) {
                return Row;
            }
            if (i17 != 101) {
                switch (i17) {
                    case 0:
                        return OK;
                    case 1:
                        return Error;
                    case 2:
                        return Internal;
                    case 3:
                        return Permission;
                    case 4:
                        return Abort;
                    case 5:
                        return Busy;
                    case 6:
                        return Locked;
                    case 7:
                        return NoMemory;
                    case 8:
                        return Readonly;
                    case 9:
                        return Interrupt;
                    case 10:
                        return IOError;
                    case 11:
                        return Corrupt;
                    case 12:
                        return NotFound;
                    case 13:
                        return Full;
                    case 14:
                        return CantOpen;
                    case 15:
                        return Protocol;
                    case 16:
                        return Empty;
                    case 17:
                        return Schema;
                    case 18:
                        return Exceed;
                    case 19:
                        return Constraint;
                    case 20:
                        return Mismatch;
                    case 21:
                        return Misuse;
                    case 22:
                        return NoLargeFileSupport;
                    case 23:
                        return Authorization;
                    case 24:
                        return Format;
                    case 25:
                        return Range;
                    case 26:
                        return NotADatabase;
                    case 27:
                        return Notice;
                    case 28:
                        return Warning;
                    default:
                        return Unknown;
                }
            }
            return Done;
        }
    }

    /* renamed from: com.tencent.wcdb.base.WCDBException$ExtendCode */
    /* loaded from: classes6.dex */
    public enum ExtendCode {
        ErrorMissingCollseq(257),
        ErrorRetry(513),
        ErrorSnapshot(769),
        IOErrorRead(266),
        IOErrorShortRead(522),
        IOErrorWrite(778),
        IOErrorFsync(1034),
        IOErrorDirFsync(il1.b.f70351x366c91de),
        IOErrorTruncate(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.u.f34135x366c91de),
        IOErrorFstat(1802),
        IOErrorUnlock(2058),
        IOErrorRdlock(2314),
        IOErrorDelete(2570),
        IOErrorBlocked(2826),
        IOErrorNoMemory(3082),
        IOErrorAccess(3338),
        IOErrorCheckReservedLock(3594),
        IOErrorLock(3850),
        IOErrorClose(4106),
        IOErrorDirClose(4362),
        IOErrorShmOpen(4618),
        IOErrorShmSize(4874),
        IOErrorShmLock(5130),
        IOErrorShmMap(5386),
        IOErrorSeek(5642),
        IOErrorDeleteNoEntry(5898),
        IOErrorMmap(6154),
        IOErrorGetTempPath(6410),
        IOErrorConvPath(6666),
        IOErrorVnode(6922),
        IOErrorAuthorization(7178),
        IOErrorBeginAtomic(7434),
        IOErrorCommitAtomic(7690),
        IOErrorRollbackAtomic(7946),
        LockedSharedCache(262),
        LockedVirtualTable(md1.d1.f72842x366c91de),
        BusyRecovery(261),
        BusySnapshot(md1.c.f72836x366c91de),
        CantOpenNoTempDir(270),
        CantOpenIsDir(uc1.x1.f76938x366c91de),
        CantOpenFullPath(782),
        CantOpenConvPath(1038),
        CantOpenDirtyWal(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s1.f34652x366c91de),
        CorruptVirtualTable(267),
        CorruptSequence(523),
        ReadonlyRecovery(264),
        ReadonlyCantLock(520),
        ReadonlyRollback(776),
        ReadonlyDatabaseMoved(1032),
        ReadonlyCantInit(1288),
        ReadonlyDirectory(1544),
        AbortRollback(md1.s.f72860x366c91de),
        ConstraintCheck(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd),
        ConstraintCommitHook(531),
        ConstraintForeignKey(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6.f34493x366c91de),
        ConstraintFunction(1043),
        ConstraintNotNull(1299),
        ConstraintPrimaryKey(1555),
        ConstraintTrigger(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26811xa9bfd794.f57460x39770346),
        ConstraintUnique(2067),
        ConstraintVirtualTable(2323),
        ConstraintRowID(2579),
        NoticeRecoverWal(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de),
        NoticeRecoverRollback(539),
        WarningAutoIndex(nd1.f2.f72925x366c91de),
        AuthorizationUser(279),
        OKLoadPermanently(256),
        Unknown(-1);


        /* renamed from: value */
        private final int f57935x6ac9171;

        ExtendCode(int i17) {
            this.f57935x6ac9171 = i17;
        }

        /* renamed from: value */
        public int m106389x6ac9171() {
            return this.f57935x6ac9171;
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.ExtendCode m106386xdce0328(int i17) {
            switch (i17) {
                case 256:
                    return OKLoadPermanently;
                case 257:
                    return ErrorMissingCollseq;
                case 261:
                    return BusyRecovery;
                case 262:
                    return LockedSharedCache;
                case 264:
                    return ReadonlyRecovery;
                case 266:
                    return IOErrorRead;
                case 267:
                    return CorruptVirtualTable;
                case 270:
                    return CantOpenNoTempDir;
                case com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd /* 275 */:
                    return ConstraintCheck;
                case 279:
                    return AuthorizationUser;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pe.f34670x366c91de /* 283 */:
                    return NoticeRecoverWal;
                case nd1.f2.f72925x366c91de /* 284 */:
                    return WarningAutoIndex;
                case 513:
                    return ErrorRetry;
                case md1.s.f72860x366c91de /* 516 */:
                    return AbortRollback;
                case md1.c.f72836x366c91de /* 517 */:
                    return BusySnapshot;
                case md1.d1.f72842x366c91de /* 518 */:
                    return LockedVirtualTable;
                case 520:
                    return ReadonlyCantLock;
                case 522:
                    return IOErrorShortRead;
                case 523:
                    return CorruptSequence;
                case uc1.x1.f76938x366c91de /* 526 */:
                    return CantOpenIsDir;
                case 531:
                    return ConstraintCommitHook;
                case 539:
                    return NoticeRecoverRollback;
                case 769:
                    return ErrorSnapshot;
                case 776:
                    return ReadonlyRollback;
                case 778:
                    return IOErrorWrite;
                case 782:
                    return CantOpenFullPath;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n6.f34493x366c91de /* 787 */:
                    return ConstraintForeignKey;
                case 1032:
                    return ReadonlyDatabaseMoved;
                case 1034:
                    return IOErrorFsync;
                case 1038:
                    return CantOpenConvPath;
                case 1043:
                    return ConstraintFunction;
                case 1288:
                    return ReadonlyCantInit;
                case il1.b.f70351x366c91de /* 1290 */:
                    return IOErrorDirFsync;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s1.f34652x366c91de /* 1294 */:
                    return CantOpenDirtyWal;
                case 1299:
                    return ConstraintNotNull;
                case 1544:
                    return ReadonlyDirectory;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.u.f34135x366c91de /* 1546 */:
                    return IOErrorTruncate;
                case 1555:
                    return ConstraintPrimaryKey;
                case 1802:
                    return IOErrorFstat;
                case com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.C26811xa9bfd794.f57460x39770346 /* 1811 */:
                    return ConstraintTrigger;
                case 2058:
                    return IOErrorUnlock;
                case 2067:
                    return ConstraintUnique;
                case 2314:
                    return IOErrorRdlock;
                case 2323:
                    return ConstraintVirtualTable;
                case 2570:
                    return IOErrorDelete;
                case 2579:
                    return ConstraintRowID;
                case 2826:
                    return IOErrorBlocked;
                case 3082:
                    return IOErrorNoMemory;
                case 3338:
                    return IOErrorAccess;
                case 3594:
                    return IOErrorCheckReservedLock;
                case 3850:
                    return IOErrorLock;
                case 4106:
                    return IOErrorClose;
                case 4362:
                    return IOErrorDirClose;
                case 4618:
                    return IOErrorShmOpen;
                case 4874:
                    return IOErrorShmSize;
                case 5130:
                    return IOErrorShmLock;
                case 5386:
                    return IOErrorShmMap;
                case 5642:
                    return IOErrorSeek;
                case 5898:
                    return IOErrorDeleteNoEntry;
                case 6154:
                    return IOErrorMmap;
                case 6410:
                    return IOErrorGetTempPath;
                case 6666:
                    return IOErrorConvPath;
                case 6922:
                    return IOErrorVnode;
                case 7178:
                    return IOErrorAuthorization;
                case 7434:
                    return IOErrorBeginAtomic;
                case 7690:
                    return IOErrorCommitAtomic;
                case 7946:
                    return IOErrorRollbackAtomic;
                default:
                    return Unknown;
            }
        }
    }

    /* renamed from: com.tencent.wcdb.base.WCDBException$Key */
    /* loaded from: classes12.dex */
    public enum Key {
        tag("Tag"),
        path("Path"),
        type("Type"),
        source("Source"),
        SQL("SQL"),
        extendedCode("ExtCode"),
        message("Message");


        /* renamed from: value */
        private final java.lang.String f57942x6ac9171;

        Key(java.lang.String str) {
            this.f57942x6ac9171 = str;
        }

        /* renamed from: getValue */
        public java.lang.String m106395x754a37bb() {
            return this.f57942x6ac9171;
        }
    }

    /* renamed from: com.tencent.wcdb.base.WCDBException$Level */
    /* loaded from: classes16.dex */
    public enum Level {
        Ignore,
        Debug,
        Notice,
        Warning,
        Error,
        Fatal,
        Unknown;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            switch (com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.AnonymousClass1.f57833x75df550a[ordinal()]) {
                case 1:
                    return "IGNORE";
                case 2:
                    return "DEBUG";
                case 3:
                    return "NOTICE";
                case 4:
                    return "WARNING";
                case 5:
                    return "ERROR";
                case 6:
                    return "FATAL";
                default:
                    return "UNKNOWN";
            }
        }

        /* renamed from: valueOf */
        public static com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level m106398xdce0328(int i17) {
            switch (i17) {
                case 1:
                    return Ignore;
                case 2:
                    return Debug;
                case 3:
                    return Notice;
                case 4:
                    return Warning;
                case 5:
                    return Error;
                case 6:
                    return Fatal;
                default:
                    return Unknown;
            }
        }
    }

    public C26903x69761325(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level level, com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code code, long j17) {
        this.f57832x6219b84 = level;
        this.f57830x2eaded = code;
        java.lang.String m106372x76b83bd1 = m106372x76b83bd1(j17);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f57831x3164ae = linkedHashMap;
        linkedHashMap.put(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Key.message.f57942x6ac9171, m106372x76b83bd1);
        m106369xff7fd32(j17);
    }

    /* renamed from: addInfo */
    private void m106367xbb8518ef(java.lang.String str, int i17, long j17, double d17, java.lang.String str2) {
        if (i17 == 3) {
            this.f57831x3164ae.put(str, java.lang.Long.valueOf(j17));
        } else if (i17 == 5) {
            this.f57831x3164ae.put(str, java.lang.Double.valueOf(d17));
        } else if (i17 == 6) {
            this.f57831x3164ae.put(str, str2);
        }
    }

    /* renamed from: createException */
    public static com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 m106368xfbaab3(long j17) {
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level m106398xdce0328 = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.m106398xdce0328(m106371x74bf41ce(j17));
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code m106380xdce0328 = com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.m106380xdce0328(m106370xfb7e1663(j17));
        return m106398xdce0328 != com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Level.Error ? new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26905x236117e(m106398xdce0328, m106380xdce0328, j17) : m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.Interrupt ? new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26904xe509cf16(m106398xdce0328, m106380xdce0328, j17) : (m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.Permission || m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.Readonly || m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.IOError || m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.Corrupt || m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.Full || m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.CantOpen || m106380xdce0328 == com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Code.NotADatabase) ? new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26902xbaa44a63(m106398xdce0328, m106380xdce0328, j17) : new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26905x236117e(m106398xdce0328, m106380xdce0328, j17);
    }

    /* renamed from: enumerateInfo */
    private native void m106369xff7fd32(long j17);

    /* renamed from: getCode */
    private static native int m106370xfb7e1663(long j17);

    /* renamed from: getLevel */
    private static native int m106371x74bf41ce(long j17);

    /* renamed from: getMessage */
    private static native java.lang.String m106372x76b83bd1(long j17);

    /* renamed from: extendCode */
    public com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.ExtendCode m106373x9341c427() {
        java.lang.Object obj = this.f57831x3164ae.get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Key.extendedCode.m106395x754a37bb());
        return obj != null ? com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.ExtendCode.m106386xdce0328(((java.lang.Long) obj).intValue()) : com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.ExtendCode.Unknown;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        sb6.append("Code: ");
        sb6.append(this.f57830x2eaded.m106383x6ac9171());
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.f57831x3164ae.entrySet()) {
            sb6.append("; ");
            sb6.append(entry.getKey());
            sb6.append(": ");
            sb6.append(entry.getValue());
        }
        return sb6.toString();
    }

    /* renamed from: message */
    public java.lang.String m106374x38eb0007() {
        return (java.lang.String) this.f57831x3164ae.get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Key.message.m106395x754a37bb());
    }

    /* renamed from: path */
    public java.lang.String m106375x346425() {
        return (java.lang.String) this.f57831x3164ae.get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Key.path.m106395x754a37bb());
    }

    public java.lang.String sql() {
        return (java.lang.String) this.f57831x3164ae.get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Key.SQL.m106395x754a37bb());
    }

    public long tag() {
        java.lang.Object obj = this.f57831x3164ae.get(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325.Key.tag.m106395x754a37bb());
        if (obj != null) {
            return ((java.lang.Long) obj).longValue();
        }
        return 0L;
    }

    /* renamed from: toStringForLog */
    public java.lang.String m106376xbb763b47() {
        return "[WCDB] [" + this.f57832x6219b84 + "] " + getMessage();
    }
}
