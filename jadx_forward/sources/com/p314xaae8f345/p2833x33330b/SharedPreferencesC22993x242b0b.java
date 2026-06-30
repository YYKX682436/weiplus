package com.p314xaae8f345.p2833x33330b;

/* renamed from: com.tencent.mmkv.MMKV */
/* loaded from: classes12.dex */
public class SharedPreferencesC22993x242b0b implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {

    /* renamed from: ASHMEM_MODE */
    private static final int f39999xbeacd243 = 8;

    /* renamed from: BACKUP_MODE */
    private static final int f40000xc4d14a00 = 16;

    /* renamed from: CONTEXT_MODE_MULTI_PROCESS */
    private static final int f40001xddc8943d = 4;

    /* renamed from: ExpireInDay */
    public static final int f40002x5c74c638 = 86400;

    /* renamed from: ExpireInHour */
    public static final int f40003x322606c8 = 3600;

    /* renamed from: ExpireInMinute */
    public static final int f40004x48f00df8 = 60;

    /* renamed from: ExpireInMonth */
    public static final int f40005x12e12e1c = 2592000;

    /* renamed from: ExpireInYear */
    public static final int f40006x322d9921 = 946080000;

    /* renamed from: ExpireNever */
    public static final int f40007x5cb7e08d = 0;

    /* renamed from: MULTI_PROCESS_MODE */
    public static final int f40008x4921b6f9 = 2;

    /* renamed from: READ_ONLY_MODE */
    public static final int f40009x83c886ed = 32;

    /* renamed from: SINGLE_PROCESS_MODE */
    public static final int f40010xf247002a = 1;

    /* renamed from: checkedHandleSet */
    private static final java.util.Set<java.lang.Long> f40011xf3274133;

    /* renamed from: gCallbackHandler */
    private static ir5.d f40012x96d7e3de;

    /* renamed from: gContentChangeNotify */
    private static ir5.c f40013xafc5b64b;

    /* renamed from: gWantLogReDirecting */
    private static boolean f40014xa3060779;

    /* renamed from: index2LogLevel */
    private static final ir5.e[] f40015xd27d2860;

    /* renamed from: isNativeLibLoaded */
    private static boolean f40016x57f7209;

    /* renamed from: isProcessModeCheckerEnabled */
    private static boolean f40017xa29a6d14;

    /* renamed from: logLevel2Index */
    private static final java.util.EnumMap<ir5.e, java.lang.Integer> f40018x5fc68260;

    /* renamed from: mCreators */
    private static final java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>> f40019x917f2d54;

    /* renamed from: recoverIndex */
    private static final java.util.EnumMap<ir5.g, java.lang.Integer> f40020x74c9c9ce;

    /* renamed from: rootDir */
    private static java.lang.String f40021x5242484b;

    /* renamed from: _hellAccFlag_ */
    private byte f40022x7f11beae;

    /* renamed from: nativeHandle */
    private final long f40023x7b5cfd1f;

    static {
        java.util.EnumMap<ir5.g, java.lang.Integer> enumMap = new java.util.EnumMap<>((java.lang.Class<ir5.g>) ir5.g.class);
        f40020x74c9c9ce = enumMap;
        enumMap.put((java.util.EnumMap<ir5.g, java.lang.Integer>) ir5.g.OnErrorDiscard, (ir5.g) 0);
        enumMap.put((java.util.EnumMap<ir5.g, java.lang.Integer>) ir5.g.OnErrorRecover, (ir5.g) 1);
        java.util.EnumMap<ir5.e, java.lang.Integer> enumMap2 = new java.util.EnumMap<>((java.lang.Class<ir5.e>) ir5.e.class);
        f40018x5fc68260 = enumMap2;
        ir5.e eVar = ir5.e.LevelDebug;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar, (ir5.e) 0);
        ir5.e eVar2 = ir5.e.LevelInfo;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar2, (ir5.e) 1);
        ir5.e eVar3 = ir5.e.LevelWarning;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar3, (ir5.e) 2);
        ir5.e eVar4 = ir5.e.LevelError;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar4, (ir5.e) 3);
        ir5.e eVar5 = ir5.e.LevelNone;
        enumMap2.put((java.util.EnumMap<ir5.e, java.lang.Integer>) eVar5, (ir5.e) 4);
        f40015xd27d2860 = new ir5.e[]{eVar, eVar2, eVar3, eVar4, eVar5};
        f40011xf3274133 = new java.util.HashSet();
        f40016x57f7209 = false;
        f40021x5242484b = null;
        f40017xa29a6d14 = true;
        f40019x917f2d54 = new java.util.HashMap<>();
        f40012x96d7e3de = null;
        f40014xa3060779 = false;
    }

    private SharedPreferencesC22993x242b0b(long j17) {
        this.f40023x7b5cfd1f = j17;
    }

    /* renamed from: actualSize */
    private native long m83911xd12b86af(long j17);

    /* renamed from: allKeys */
    private native java.lang.String[] m83912xc99d6335(long j17, boolean z17);

    /* renamed from: backedUpMMKVWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83913x757d1b0d(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375816c = str2;
        bVar.f375817d = str3;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: backupAllToDirectory */
    public static native long m83915xf913e033(java.lang.String str);

    /* renamed from: backupOneToDirectory */
    public static native boolean m83916xfa5f6e4e(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: checkExist */
    public static boolean m83917xdfae7acf(java.lang.String str) {
        return m83918xdfae7acf(str, null);
    }

    /* renamed from: checkExist */
    public static native boolean m83918xdfae7acf(java.lang.String str, java.lang.String str2);

    /* renamed from: checkProcessMode */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83919xbc70ca8a(long j17, java.lang.String str, int i17) {
        java.lang.String str2;
        if (j17 != 0) {
            if (!f40017xa29a6d14) {
                return new com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b(j17);
            }
            java.util.Set<java.lang.Long> set = f40011xf3274133;
            synchronized (set) {
                if (!set.contains(java.lang.Long.valueOf(j17))) {
                    if (!m83920xbc70ca8a(j17)) {
                        if (i17 == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new java.lang.IllegalArgumentException(str2);
                    }
                    set.add(java.lang.Long.valueOf(j17));
                }
            }
            return new com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b(j17);
        }
        throw new java.lang.RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
    }

    /* renamed from: checkProcessMode */
    private static native boolean m83920xbc70ca8a(long j17);

    /* renamed from: containsKey */
    private native boolean m83921xc6607c0(long j17, java.lang.String str);

    /* renamed from: count */
    private native long m83922x5a7510f(long j17, boolean z17);

    /* renamed from: createNB */
    private static native long m83923x6c815bb0(int i17);

    /* renamed from: createNativeBuffer */
    public static ir5.i m83924xe8f17e53(int i17) {
        long m83923x6c815bb0 = m83923x6c815bb0(i17);
        if (m83923x6c815bb0 == 0) {
            return null;
        }
        return new ir5.i(m83923x6c815bb0, i17);
    }

    /* renamed from: decodeBool */
    private native boolean m83925xb7eb99f8(long j17, java.lang.String str, boolean z17);

    /* renamed from: decodeBytes */
    private native byte[] m83926x458c431d(long j17, java.lang.String str);

    /* renamed from: decodeDouble */
    private native double m83927x6ed94f5f(long j17, java.lang.String str, double d17);

    /* renamed from: decodeFloat */
    private native float m83928x45bea50e(long j17, java.lang.String str, float f17);

    /* renamed from: decodeInt */
    private native int m83929x1eb51f21(long j17, java.lang.String str, int i17);

    /* renamed from: decodeLong */
    private native long m83930xb7f0258a(long j17, java.lang.String str, long j18);

    /* renamed from: decodeString */
    private native java.lang.String m83931x88b7339f(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: decodeStringSet */
    private native java.lang.String[] m83932xbf617843(long j17, java.lang.String str);

    /* renamed from: defaultMMKV */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83933xe5f0f8cc() {
        return m83936xe5f0f8cc(new ir5.b());
    }

    /* renamed from: defaultNameSpace */
    public static ir5.h m83937xb4d527fa() {
        java.lang.String str = f40021x5242484b;
        if (str != null) {
            return new ir5.h(str);
        }
        throw new java.lang.IllegalStateException("You should Call MMKV.initialize() first.");
    }

    /* renamed from: destroyNB */
    private static native void m83938x766b932e(long j17, int i17);

    /* renamed from: destroyNativeBuffer */
    public static void m83939x8152f051(ir5.i iVar) {
        m83938x766b932e(iVar.f375829a, iVar.f375830b);
    }

    /* renamed from: disableProcessModeChecker */
    public static void m83940xc3ac13ab() {
        synchronized (f40011xf3274133) {
            f40017xa29a6d14 = false;
        }
        m83944x3178c78d(false);
    }

    /* renamed from: doCheckReSetCryptKey */
    private native void m83941xdde24823(java.lang.String str, boolean z17);

    /* renamed from: doInitialize */
    private static java.lang.String m83942x3b4bc27b(java.lang.String str, java.lang.String str2, ir5.a aVar, ir5.e eVar, boolean z17, boolean z18, long j17) {
        m84029x334022ad(aVar);
        m83987xcd20b915(str, str2, m83988x2c51fcfd(eVar), z17, z18, j17);
        f40021x5242484b = str;
        return str;
    }

    /* renamed from: doReKey */
    private native boolean m83943x6c0ba961(java.lang.String str, boolean z17);

    /* renamed from: enableDisableProcessMode */
    private static native void m83944x3178c78d(boolean z17);

    /* renamed from: enableProcessModeChecker */
    public static void m83945xbdcfc586() {
        synchronized (f40011xf3274133) {
            f40017xa29a6d14 = true;
        }
        m83944x3178c78d(true);
    }

    /* renamed from: encodeBool */
    private native boolean m83946xe29cf220(long j17, java.lang.String str, boolean z17);

    /* renamed from: encodeBool_2 */
    private native boolean m83947xaf28f5d3(long j17, java.lang.String str, boolean z17, int i17);

    /* renamed from: encodeBytes */
    private native boolean m83948x7105eff5(long j17, java.lang.String str, byte[] bArr);

    /* renamed from: encodeBytes_2 */
    private native boolean m83949x4749d268(long j17, java.lang.String str, byte[] bArr, int i17);

    /* renamed from: encodeDouble */
    private native boolean m83950xb2953d87(long j17, java.lang.String str, double d17);

    /* renamed from: encodeDouble_2 */
    private native boolean m83951x623c037a(long j17, java.lang.String str, double d17, int i17);

    /* renamed from: encodeFloat */
    private native boolean m83952x713851e6(long j17, java.lang.String str, float f17);

    /* renamed from: encodeFloat_2 */
    private native boolean m83953x46b7c19(long j17, java.lang.String str, float f17, int i17);

    /* renamed from: encodeInt */
    private native boolean m83954x59e421f9(long j17, java.lang.String str, int i17);

    /* renamed from: encodeInt_2 */
    private native boolean m83955x7163936c(long j17, java.lang.String str, int i17, int i18);

    /* renamed from: encodeLong */
    private native boolean m83956xe2a17db2(long j17, java.lang.String str, long j18);

    /* renamed from: encodeLong_2 */
    private native boolean m83957xc038e4e5(long j17, java.lang.String str, long j18, int i17);

    /* renamed from: encodeSet */
    private native boolean m83958x59e4466c(long j17, java.lang.String str, java.lang.String[] strArr);

    /* renamed from: encodeSet_2 */
    private native boolean m83959x71ec671f(long j17, java.lang.String str, java.lang.String[] strArr, int i17);

    /* renamed from: encodeString */
    private native boolean m83960xcc7321c7(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: encodeString_2 */
    private native boolean m83961x7c31d7ba(long j17, java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: getDefaultMMKV */
    private static native long m83962xbfc73f96(int i17, java.lang.String str, long j17, boolean z17, int i18, int i19, boolean z18, int i27, int i28);

    /* renamed from: getMMKVWithAshmemFD */
    private static native long m83963x7d728584(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17);

    /* renamed from: getMMKVWithID */
    public static native long m83964x58dedf22(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17, boolean z17, int i18, int i19, boolean z18, int i27, int i28);

    /* renamed from: getNameSpace */
    private static native boolean m83965x484dd685(java.lang.String str);

    /* renamed from: getParcelableByte */
    private byte[] m83966x6919e181(android.os.Parcelable parcelable) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: getRootDir */
    public static java.lang.String m83967x900f8415() {
        return f40021x5242484b;
    }

    /* renamed from: importFrom */
    private native long m83968x7ea6a4ef(long j17, long j18);

    /* renamed from: initialize */
    public static java.lang.String m83969x33ebcb90(android.content.Context context) {
        return m83976x33ebcb90(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, ir5.e.LevelInfo, null);
    }

    /* renamed from: isCompareBeforeSetEnabled */
    private native boolean m83982x20c2cfd9();

    @dalvik.annotation.optimization.FastNative
    /* renamed from: isEncryptionEnabled */
    private native boolean m83983x5a9b1634();

    @dalvik.annotation.optimization.FastNative
    /* renamed from: isExpirationEnabled */
    private native boolean m83984xd0a83188();

    /* renamed from: isFileValid */
    public static boolean m83985xf740f9d6(java.lang.String str) {
        return m83986xf740f9d6(str, null);
    }

    /* renamed from: isFileValid */
    public static native boolean m83986xf740f9d6(java.lang.String str, java.lang.String str2);

    /* renamed from: jniInitialize */
    private static native void m83987xcd20b915(java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, long j17);

    /* renamed from: logLevel2Int */
    private static int m83988x2c51fcfd(ir5.e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal != 3) {
            return ordinal != 4 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: mmkvLogImp */
    private static void m83989x79a1f0d3(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        if (f40012x96d7e3de == null || !f40014xa3060779) {
            f40015xd27d2860[i17].ordinal();
        } else {
            ir5.e eVar = f40015xd27d2860[i17];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKV", "[%s:%d][%s] %s", str, java.lang.Integer.valueOf(i18), str2, str3);
        }
    }

    /* renamed from: mmkvWithAshmemFD */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83990x1d216a2e(java.lang.String str, int i17, int i18, java.lang.String str2) {
        return m83991x1d216a2e(str, i17, i18, str2, false);
    }

    /* renamed from: mmkvWithAshmemID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83992x1d216a8b(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2) {
        return m83993x1d216a8b(context, str, i17, i18, str2, false);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83995x8c190b4c(java.lang.String str) {
        return m84004x8c190b4c(str, new ir5.b());
    }

    /* renamed from: nameSpace */
    public static ir5.h m84007x48e0653b(java.lang.String str) {
        m84029x334022ad(null);
        if (m83965x484dd685(str)) {
            return new ir5.h(str);
        }
        throw new java.lang.RuntimeException("Fail to get NameSpace[" + str + "] in JNI.");
    }

    @dalvik.annotation.optimization.FastNative
    /* renamed from: nativeEnableCompareBeforeSet */
    private native void m84008xc444b998();

    /* renamed from: onContentChangedByOuterProcess */
    private static void m84009x5d3e9dc5(java.lang.String str) {
    }

    /* renamed from: onExit */
    public static native void m84010xc399339d();

    /* renamed from: onMMKVCRCCheckFail */
    private static int m84011x4341135c(java.lang.String str) {
        ir5.g gVar = ir5.g.OnErrorDiscard;
        if (f40012x96d7e3de != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "onMMKVCRCCheckFail:%s", str);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(941L, 3L, 1L, true);
            fVar.d(24632, str, 1, 0, 0);
        }
        m84026x81604432(ir5.e.LevelInfo, "Recover strategic for " + str + " is " + gVar);
        java.lang.Integer num = f40020x74c9c9ce.get(gVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: onMMKVContentLoadSuccessfully */
    private static void m84012x68c17f7c(java.lang.String str) {
    }

    /* renamed from: onMMKVFileLengthError */
    private static int m84013x4c178dc(java.lang.String str) {
        ir5.g gVar = ir5.g.OnErrorDiscard;
        if (f40012x96d7e3de != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiProcessMMKV", "onMMKVFileLengthError:%s", str);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(941L, 4L, 1L, true);
            fVar.d(24632, str, 2, 0, 0);
        }
        m84026x81604432(ir5.e.LevelInfo, "Recover strategic for " + str + " is " + gVar);
        java.lang.Integer num = f40020x74c9c9ce.get(gVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: pageSize */
    public static native int m84014x3339d730();

    @java.lang.Deprecated
    /* renamed from: registerContentChangeNotify */
    public static void m84015xb1dd068f(ir5.c cVar) {
        ir5.d dVar = f40012x96d7e3de;
        if (dVar != null) {
            dVar.getClass();
        }
        m84025x2f7f0751(false);
    }

    /* renamed from: registerHandler */
    public static void m84016x20979327(ir5.d dVar) {
        f40012x96d7e3de = dVar;
        dVar.getClass();
        f40014xa3060779 = true;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n4) f40012x96d7e3de).getClass();
        long m40537x212c0af6 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40537x212c0af6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKV", "getNativeWriteLogFunc: %x", java.lang.Long.valueOf(m40537x212c0af6));
        m84022x2bcd5283(f40014xa3060779, true, m40537x212c0af6);
        f40012x96d7e3de.getClass();
    }

    /* renamed from: removeStorage */
    public static boolean m84017xd6f20557(java.lang.String str) {
        return m84018xd6f20557(str, null);
    }

    /* renamed from: removeStorage */
    public static native boolean m84018xd6f20557(java.lang.String str, java.lang.String str2);

    /* renamed from: removeValueForKey */
    private native void m84019xd4d5283(long j17, java.lang.String str);

    /* renamed from: restoreAllFromDirectory */
    public static native long m84020x315b8470(java.lang.String str);

    /* renamed from: restoreOneMMKVFromDirectory */
    public static native boolean m84021xb8d12a0(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: setCallbackHandler */
    private static native void m84022x2bcd5283(boolean z17, boolean z18, long j17);

    /* renamed from: setLogLevel */
    private static native void m84023xed871122(int i17);

    /* renamed from: setLogLevel */
    public static void m84024xed871122(ir5.e eVar) {
        m84023xed871122(m83988x2c51fcfd(eVar));
    }

    /* renamed from: setWantsContentChangeNotify */
    private static native void m84025x2f7f0751(boolean z17);

    /* renamed from: simpleLog */
    private static void m84026x81604432(ir5.e eVar, java.lang.String str) {
        java.lang.StackTraceElement stackTraceElement = java.lang.Thread.currentThread().getStackTrace()[r0.length - 1];
        java.lang.Integer num = f40018x5fc68260.get(eVar);
        m83989x79a1f0d3(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    /* renamed from: sync */
    private native void m84027x361a9b(boolean z17);

    /* renamed from: totalSize */
    private native long m84028xdd96ed65(long j17);

    /* renamed from: tryLoadNativeLib */
    private static void m84029x334022ad(ir5.a aVar) {
        if (f40016x57f7209) {
            return;
        }
        if (aVar != null) {
            aVar.m139765xeb57c8f5("c++_shared");
            aVar.m139765xeb57c8f5("mmkv");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add("mmkv");
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList2.get(0));
            yj0.a.f(obj2, "com/tencent/mmkv/MMKV", "tryLoadNativeLib", "(Lcom/tencent/mmkv/MMKV$LibLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        f40016x57f7209 = true;
    }

    @java.lang.Deprecated
    /* renamed from: unregisterContentChangeNotify */
    public static void m84030xd31a056() {
        ir5.d dVar = f40012x96d7e3de;
        if (dVar != null) {
            dVar.getClass();
        }
        m84025x2f7f0751(false);
    }

    /* renamed from: unregisterHandler */
    public static void m84031xeae75f6e() {
        f40012x96d7e3de = null;
        m84022x2bcd5283(false, false, 0L);
        f40014xa3060779 = false;
        m84025x2f7f0751(false);
    }

    /* renamed from: valueSize */
    private native int m84032xd25bc512(long j17, java.lang.String str, boolean z17);

    /* renamed from: version */
    public static native java.lang.String m84033x14f51cd8();

    /* renamed from: writeValueToNB */
    private native int m84034x7eb77d61(long j17, java.lang.String str, long j18, int i17);

    /* renamed from: actualSize */
    public long m84035xd12b86af() {
        return m83911xd12b86af(this.f40023x7b5cfd1f);
    }

    /* renamed from: allKeys */
    public java.lang.String[] m84036xc99d6335() {
        return m83912xc99d6335(this.f40023x7b5cfd1f, false);
    }

    /* renamed from: allNonExpireKeys */
    public java.lang.String[] m84037xebab463f() {
        return m83912xc99d6335(this.f40023x7b5cfd1f, true);
    }

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public void apply() {
        m84027x361a9b(false);
    }

    /* renamed from: ashmemFD */
    public native int m84038xd7662c9d();

    /* renamed from: ashmemMetaFD */
    public native int m84039x370dba02();

    /* renamed from: async */
    public void m84040x58d027c() {
        m84027x361a9b(false);
    }

    /* renamed from: checkContentChangedByOuterProcess */
    public native void m84041x17158d6e();

    /* renamed from: checkReSetCryptKey */
    public void m84042xc8066c38(java.lang.String str) {
        m83941xdde24823(str, false);
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        m84044x2f1a8c14();
        return this;
    }

    /* renamed from: clearAll */
    public native void m84044x2f1a8c14();

    /* renamed from: clearAllWithKeepingSpace */
    public native void m84045xf81510e3();

    /* renamed from: clearMemoryCache */
    public native void m84046xc3a2ea74();

    /* renamed from: close */
    public native void m84047x5a5ddf8();

    @Override // android.content.SharedPreferences.Editor
    @java.lang.Deprecated
    public boolean commit() {
        m84027x361a9b(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        return m84048xc6607c0(str);
    }

    /* renamed from: containsKey */
    public boolean m84048xc6607c0(java.lang.String str) {
        return m83921xc6607c0(this.f40023x7b5cfd1f, str);
    }

    /* renamed from: count */
    public long m84049x5a7510f() {
        return m83922x5a7510f(this.f40023x7b5cfd1f, false);
    }

    /* renamed from: countNonExpiredKeys */
    public long m84050x2e7af09b() {
        return m83922x5a7510f(this.f40023x7b5cfd1f, true);
    }

    /* renamed from: cryptKey */
    public native java.lang.String m84051x8f754a11();

    /* renamed from: decodeBool */
    public boolean m84052xb7eb99f8(java.lang.String str) {
        return m83925xb7eb99f8(this.f40023x7b5cfd1f, str, false);
    }

    /* renamed from: decodeBytes */
    public byte[] m84054x458c431d(java.lang.String str) {
        return m84055x458c431d(str, (byte[]) null);
    }

    /* renamed from: decodeDouble */
    public double m84056x6ed94f5f(java.lang.String str) {
        return m83927x6ed94f5f(this.f40023x7b5cfd1f, str, 0.0d);
    }

    /* renamed from: decodeFloat */
    public float m84058x45bea50e(java.lang.String str) {
        return m83928x45bea50e(this.f40023x7b5cfd1f, str, 0.0f);
    }

    /* renamed from: decodeInt */
    public int m84060x1eb51f21(java.lang.String str) {
        return m83929x1eb51f21(this.f40023x7b5cfd1f, str, 0);
    }

    /* renamed from: decodeLong */
    public long m84062xb7f0258a(java.lang.String str) {
        return m83930xb7f0258a(this.f40023x7b5cfd1f, str, 0L);
    }

    /* renamed from: decodeParcelable */
    public <T extends android.os.Parcelable> T m84064x268c571(java.lang.String str, java.lang.Class<T> cls) {
        return (T) m84065x268c571(str, cls, null);
    }

    /* renamed from: decodeString */
    public java.lang.String m84066x88b7339f(java.lang.String str) {
        return m83931x88b7339f(this.f40023x7b5cfd1f, str, null);
    }

    /* renamed from: decodeStringSet */
    public java.util.Set<java.lang.String> m84068xbf617843(java.lang.String str) {
        return m84069xbf617843(str, (java.util.Set<java.lang.String>) null);
    }

    /* renamed from: disableAutoKeyExpire */
    public native boolean m84071x73194167();

    /* renamed from: disableCompareBeforeSet */
    public native void m84072x3b548c06();

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        return this;
    }

    /* renamed from: enableAutoKeyExpire */
    public native boolean m84073xea5e92ac(int i17);

    /* renamed from: enableCompareBeforeSet */
    public void m84074xe6e0f8a1() {
        m83984xd0a83188();
        m83983x5a9b1634();
        m84008xc444b998();
    }

    /* renamed from: encode */
    public boolean m84089xb2963e16(java.lang.String str, boolean z17) {
        return m83946xe29cf220(this.f40023x7b5cfd1f, str, z17);
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
        throw new java.lang.UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        return m83925xb7eb99f8(this.f40023x7b5cfd1f, str, z17);
    }

    /* renamed from: getBytes */
    public byte[] m84093x743b66b5(java.lang.String str, byte[] bArr) {
        return m84055x458c431d(str, bArr);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        return m83928x45bea50e(this.f40023x7b5cfd1f, str, f17);
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        return m83929x1eb51f21(this.f40023x7b5cfd1f, str, i17);
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        return m83930xb7f0258a(this.f40023x7b5cfd1f, str, j17);
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        return m83931x88b7339f(this.f40023x7b5cfd1f, str, str2);
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return m84069xbf617843(str, set);
    }

    /* renamed from: getValueActualSize */
    public int m84094xe3d6cca(java.lang.String str) {
        return m84032xd25bc512(this.f40023x7b5cfd1f, str, true);
    }

    /* renamed from: getValueSize */
    public int m84095xd1c9365c(java.lang.String str) {
        return m84032xd25bc512(this.f40023x7b5cfd1f, str, false);
    }

    /* renamed from: importFrom */
    public long m84096x7ea6a4ef(com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b sharedPreferencesC22993x242b0b) {
        return m83968x7ea6a4ef(this.f40023x7b5cfd1f, sharedPreferencesC22993x242b0b.f40023x7b5cfd1f);
    }

    /* renamed from: importFromSharedPreferences */
    public int m84097x3b7ed024(android.content.SharedPreferences sharedPreferences) {
        java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (key != null && value != null) {
                if (value instanceof java.lang.Boolean) {
                    m83946xe29cf220(this.f40023x7b5cfd1f, key, ((java.lang.Boolean) value).booleanValue());
                } else if (value instanceof java.lang.Integer) {
                    m83954x59e421f9(this.f40023x7b5cfd1f, key, ((java.lang.Integer) value).intValue());
                } else if (value instanceof java.lang.Long) {
                    m83956xe2a17db2(this.f40023x7b5cfd1f, key, ((java.lang.Long) value).longValue());
                } else if (value instanceof java.lang.Float) {
                    m83952x713851e6(this.f40023x7b5cfd1f, key, ((java.lang.Float) value).floatValue());
                } else if (value instanceof java.lang.Double) {
                    m83950xb2953d87(this.f40023x7b5cfd1f, key, ((java.lang.Double) value).doubleValue());
                } else if (value instanceof java.lang.String) {
                    m83960xcc7321c7(this.f40023x7b5cfd1f, key, (java.lang.String) value);
                } else if (value instanceof java.util.Set) {
                    m84087xb2963e16(key, (java.util.Set<java.lang.String>) value);
                } else {
                    m84026x81604432(ir5.e.LevelError, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }

    /* renamed from: isMultiProcess */
    public native boolean m84098x4fe73140();

    /* renamed from: isReadOnly */
    public native boolean m84099x9cffd9ac();

    /* renamed from: lock */
    public native void m84100x32c52b();

    /* renamed from: mmapID */
    public native java.lang.String m84101xc02e032a();

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        m83946xe29cf220(this.f40023x7b5cfd1f, str, z17);
        return this;
    }

    /* renamed from: putBytes */
    public android.content.SharedPreferences.Editor m84103x6989ae9c(java.lang.String str, byte[] bArr) {
        m84091xb2963e16(str, bArr);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        m83952x713851e6(this.f40023x7b5cfd1f, str, f17);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        m83954x59e421f9(this.f40023x7b5cfd1f, str, i17);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        m83956xe2a17db2(this.f40023x7b5cfd1f, str, j17);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        m83960xcc7321c7(this.f40023x7b5cfd1f, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        m84087xb2963e16(str, set);
        return this;
    }

    /* renamed from: reKey */
    public boolean m84110x675872c(java.lang.String str) {
        return m83943x6c0ba961(str, false);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new java.lang.UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        m84112xd4d5283(str);
        return this;
    }

    /* renamed from: removeValueForKey */
    public void m84112xd4d5283(java.lang.String str) {
        m84019xd4d5283(this.f40023x7b5cfd1f, str);
    }

    /* renamed from: removeValuesForKeys */
    public native void m84113xb5f320b7(java.lang.String[] strArr);

    /* renamed from: sync */
    public void m84114x361a9b() {
        m84027x361a9b(true);
    }

    /* renamed from: totalSize */
    public long m84115xdd96ed65() {
        return m84028xdd96ed65(this.f40023x7b5cfd1f);
    }

    /* renamed from: trim */
    public native void m84116x367422();

    /* renamed from: tryLock */
    public native boolean m84117xc1a8a586();

    /* renamed from: unlock */
    public native void m84118xcde7df44();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new java.lang.UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    /* renamed from: writeValueToNativeBuffer */
    public int m84119x9cd1f6c4(java.lang.String str, ir5.i iVar) {
        return m84034x7eb77d61(this.f40023x7b5cfd1f, str, iVar.f375829a, iVar.f375830b);
    }

    /* renamed from: mmkvWithAshmemFD */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83991x1d216a2e(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        long m83963x7d728584 = m83963x7d728584(str, i17, i18, str2, z17);
        if (m83963x7d728584 != 0) {
            return new com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b(m83963x7d728584);
        }
        throw new java.lang.RuntimeException("Fail to create an ashmem MMKV instance [" + str + "] in JNI");
    }

    /* renamed from: mmkvWithAshmemID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83993x1d216a8b(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i18 | 8;
        bVar.f375818e = i17;
        bVar.f375815b = z17;
        bVar.f375816c = str2;
        return m83994x1d216a8b(context, str, bVar);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84004x8c190b4c(java.lang.String str, ir5.b bVar) {
        if (f40021x5242484b != null) {
            bVar.getClass();
            java.lang.Integer num = f40020x74c9c9ce.get(null);
            return m83919xbc70ca8a(m83964x58dedf22(str, bVar.f375814a, bVar.f375816c, bVar.f375817d, bVar.f375818e, bVar.f375815b, -1, 0, false, num == null ? -1 : num.intValue(), 0), str, bVar.f375814a);
        }
        throw new java.lang.IllegalStateException("You should Call MMKV.initialize() first.");
    }

    /* renamed from: checkReSetCryptKey */
    public void m84043xc8066c38(java.lang.String str, boolean z17) {
        m83941xdde24823(str, z17);
    }

    /* renamed from: decodeBool */
    public boolean m84053xb7eb99f8(java.lang.String str, boolean z17) {
        return m83925xb7eb99f8(this.f40023x7b5cfd1f, str, z17);
    }

    /* renamed from: decodeBytes */
    public byte[] m84055x458c431d(java.lang.String str, byte[] bArr) {
        byte[] m83926x458c431d = m83926x458c431d(this.f40023x7b5cfd1f, str);
        return m83926x458c431d != null ? m83926x458c431d : bArr;
    }

    /* renamed from: decodeDouble */
    public double m84057x6ed94f5f(java.lang.String str, double d17) {
        return m83927x6ed94f5f(this.f40023x7b5cfd1f, str, d17);
    }

    /* renamed from: decodeFloat */
    public float m84059x45bea50e(java.lang.String str, float f17) {
        return m83928x45bea50e(this.f40023x7b5cfd1f, str, f17);
    }

    /* renamed from: decodeInt */
    public int m84061x1eb51f21(java.lang.String str, int i17) {
        return m83929x1eb51f21(this.f40023x7b5cfd1f, str, i17);
    }

    /* renamed from: decodeLong */
    public long m84063xb7f0258a(java.lang.String str, long j17) {
        return m83930xb7f0258a(this.f40023x7b5cfd1f, str, j17);
    }

    /* renamed from: decodeParcelable */
    public <T extends android.os.Parcelable> T m84065x268c571(java.lang.String str, java.lang.Class<T> cls, T t17) {
        byte[] m83926x458c431d;
        android.os.Parcelable.Creator<?> creator;
        if (cls == null || (m83926x458c431d = m83926x458c431d(this.f40023x7b5cfd1f, str)) == null) {
            return t17;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.unmarshall(m83926x458c431d, 0, m83926x458c431d.length);
        obtain.setDataPosition(0);
        try {
            java.lang.String cls2 = cls.toString();
            java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>> hashMap = f40019x917f2d54;
            synchronized (hashMap) {
                creator = hashMap.get(cls2);
                if (creator == null && (creator = (android.os.Parcelable.Creator) cls.getField("CREATOR").get(null)) != null) {
                    hashMap.put(cls2, creator);
                }
            }
            if (creator != null) {
                return (T) creator.createFromParcel(obtain);
            }
            throw new java.lang.Exception("Parcelable protocol requires a non-null static Parcelable.Creator object called CREATOR on class " + cls2);
        } catch (java.lang.Exception e17) {
            m84026x81604432(ir5.e.LevelError, e17.toString());
            return t17;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: decodeString */
    public java.lang.String m84067x88b7339f(java.lang.String str, java.lang.String str2) {
        return m83931x88b7339f(this.f40023x7b5cfd1f, str, str2);
    }

    /* renamed from: decodeStringSet */
    public java.util.Set<java.lang.String> m84069xbf617843(java.lang.String str, java.util.Set<java.lang.String> set) {
        return m84070xbf617843(str, set, java.util.HashSet.class);
    }

    /* renamed from: encode */
    public boolean m84090xb2963e16(java.lang.String str, boolean z17, int i17) {
        return m83947xaf28f5d3(this.f40023x7b5cfd1f, str, z17, i17);
    }

    /* renamed from: putBoolean */
    public android.content.SharedPreferences.Editor m84102x1c849219(java.lang.String str, boolean z17, int i17) {
        m83947xaf28f5d3(this.f40023x7b5cfd1f, str, z17, i17);
        return this;
    }

    /* renamed from: putBytes */
    public android.content.SharedPreferences.Editor m84104x6989ae9c(java.lang.String str, byte[] bArr, int i17) {
        m84092xb2963e16(str, bArr, i17);
        return this;
    }

    /* renamed from: putFloat */
    public android.content.SharedPreferences.Editor m84105x69bc108d(java.lang.String str, float f17, int i17) {
        m83953x46b7c19(this.f40023x7b5cfd1f, str, f17, i17);
        return this;
    }

    /* renamed from: putInt */
    public android.content.SharedPreferences.Editor m84106xc5c55e60(java.lang.String str, int i17, int i18) {
        m83955x7163936c(this.f40023x7b5cfd1f, str, i17, i18);
        return this;
    }

    /* renamed from: putLong */
    public android.content.SharedPreferences.Editor m84107xf2e7ce2b(java.lang.String str, long j17, int i17) {
        m83957xc038e4e5(this.f40023x7b5cfd1f, str, j17, i17);
        return this;
    }

    /* renamed from: putString */
    public android.content.SharedPreferences.Editor m84108xe4673800(java.lang.String str, java.lang.String str2, int i17) {
        m83961x7c31d7ba(this.f40023x7b5cfd1f, str, str2, i17);
        return this;
    }

    /* renamed from: putStringSet */
    public android.content.SharedPreferences.Editor m84109x87af0c42(java.lang.String str, java.util.Set<java.lang.String> set, int i17) {
        m84088xb2963e16(str, set, i17);
        return this;
    }

    /* renamed from: reKey */
    public boolean m84111x675872c(java.lang.String str, boolean z17) {
        return m83943x6c0ba961(str, z17);
    }

    /* renamed from: defaultMMKV */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83934xe5f0f8cc(int i17, java.lang.String str) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375816c = str;
        return m83936xe5f0f8cc(bVar);
    }

    /* renamed from: decodeStringSet */
    public java.util.Set<java.lang.String> m84070xbf617843(java.lang.String str, java.util.Set<java.lang.String> set, java.lang.Class<? extends java.util.Set> cls) {
        java.lang.String[] m83932xbf617843 = m83932xbf617843(this.f40023x7b5cfd1f, str);
        if (m83932xbf617843 == null) {
            return set;
        }
        try {
            java.util.Set<java.lang.String> newInstance = cls.newInstance();
            newInstance.addAll(java.util.Arrays.asList(m83932xbf617843));
            return newInstance;
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
            return set;
        }
    }

    /* renamed from: encode */
    public boolean m84079xb2963e16(java.lang.String str, int i17) {
        return m83954x59e421f9(this.f40023x7b5cfd1f, str, i17);
    }

    /* renamed from: initialize */
    public static java.lang.String m83972x33ebcb90(android.content.Context context, ir5.e eVar) {
        return m83976x33ebcb90(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, eVar, null);
    }

    /* renamed from: encode */
    public boolean m84080xb2963e16(java.lang.String str, int i17, int i18) {
        return m83955x7163936c(this.f40023x7b5cfd1f, str, i17, i18);
    }

    /* renamed from: encode */
    public boolean m84081xb2963e16(java.lang.String str, long j17) {
        return m83956xe2a17db2(this.f40023x7b5cfd1f, str, j17);
    }

    /* renamed from: backedUpMMKVWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83914x757d1b0d(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17 | 16;
        bVar.f375816c = str2;
        bVar.f375817d = str3;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: initialize */
    public static java.lang.String m83970x33ebcb90(android.content.Context context, ir5.a aVar) {
        return m83976x33ebcb90(context, context.getFilesDir().getAbsolutePath() + "/mmkv", aVar, ir5.e.LevelInfo, null);
    }

    /* renamed from: encode */
    public boolean m84082xb2963e16(java.lang.String str, long j17, int i17) {
        return m83957xc038e4e5(this.f40023x7b5cfd1f, str, j17, i17);
    }

    /* renamed from: defaultMMKV */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83935xe5f0f8cc(int i17, java.lang.String str, boolean z17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375815b = z17;
        bVar.f375816c = str;
        return m83936xe5f0f8cc(bVar);
    }

    /* renamed from: encode */
    public boolean m84077xb2963e16(java.lang.String str, float f17) {
        return m83952x713851e6(this.f40023x7b5cfd1f, str, f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
    /* renamed from: mmkvWithAshmemID */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83994x1d216a8b(android.content.Context r7, java.lang.String r8, ir5.b r9) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b.m83994x1d216a8b(android.content.Context, java.lang.String, ir5.b):com.tencent.mmkv.MMKV");
    }

    /* renamed from: encode */
    public boolean m84078xb2963e16(java.lang.String str, float f17, int i17) {
        return m83953x46b7c19(this.f40023x7b5cfd1f, str, f17, i17);
    }

    /* renamed from: initialize */
    public static java.lang.String m83971x33ebcb90(android.content.Context context, ir5.a aVar, ir5.e eVar) {
        return m83976x33ebcb90(context, context.getFilesDir().getAbsolutePath() + "/mmkv", aVar, eVar, null);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83996x8c190b4c(java.lang.String str, int i17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: encode */
    public boolean m84075xb2963e16(java.lang.String str, double d17) {
        return m83950xb2953d87(this.f40023x7b5cfd1f, str, d17);
    }

    /* renamed from: encode */
    public boolean m84076xb2963e16(java.lang.String str, double d17, int i17) {
        return m83951x623c037a(this.f40023x7b5cfd1f, str, d17, i17);
    }

    /* renamed from: initialize */
    public static java.lang.String m83973x33ebcb90(android.content.Context context, java.lang.String str) {
        return m83976x33ebcb90(context, str, null, ir5.e.LevelInfo, null);
    }

    /* renamed from: encode */
    public boolean m84085xb2963e16(java.lang.String str, java.lang.String str2) {
        return m83960xcc7321c7(this.f40023x7b5cfd1f, str, str2);
    }

    /* renamed from: defaultMMKV */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83936xe5f0f8cc(ir5.b bVar) {
        if (f40021x5242484b != null) {
            bVar.getClass();
            java.lang.Integer num = f40020x74c9c9ce.get(null);
            return m83919xbc70ca8a(m83962xbfc73f96(bVar.f375814a, bVar.f375816c, bVar.f375818e, bVar.f375815b, -1, 0, false, num == null ? -1 : num.intValue(), 0), "DefaultMMKV", bVar.f375814a);
        }
        throw new java.lang.IllegalStateException("You should Call MMKV.initialize() first.");
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83997x8c190b4c(java.lang.String str, int i17, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375818e = j17;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: encode */
    public boolean m84086xb2963e16(java.lang.String str, java.lang.String str2, int i17) {
        return m83961x7c31d7ba(this.f40023x7b5cfd1f, str, str2, i17);
    }

    /* renamed from: initialize */
    public static java.lang.String m83977x33ebcb90(android.content.Context context, java.lang.String str, ir5.e eVar) {
        return m83976x33ebcb90(context, str, null, eVar, null);
    }

    /* renamed from: encode */
    public boolean m84087xb2963e16(java.lang.String str, java.util.Set<java.lang.String> set) {
        return m83958x59e4466c(this.f40023x7b5cfd1f, str, set == null ? null : (java.lang.String[]) set.toArray(new java.lang.String[0]));
    }

    /* renamed from: initialize */
    public static java.lang.String m83974x33ebcb90(android.content.Context context, java.lang.String str, ir5.a aVar) {
        return m83976x33ebcb90(context, str, aVar, ir5.e.LevelInfo, null);
    }

    /* renamed from: encode */
    public boolean m84088xb2963e16(java.lang.String str, java.util.Set<java.lang.String> set, int i17) {
        return m83959x71ec671f(this.f40023x7b5cfd1f, str, set == null ? null : (java.lang.String[]) set.toArray(new java.lang.String[0]), i17);
    }

    /* renamed from: encode */
    public boolean m84091xb2963e16(java.lang.String str, byte[] bArr) {
        return m83948x7105eff5(this.f40023x7b5cfd1f, str, bArr);
    }

    /* renamed from: initialize */
    public static java.lang.String m83975x33ebcb90(android.content.Context context, java.lang.String str, ir5.a aVar, ir5.e eVar) {
        return m83976x33ebcb90(context, str, aVar, eVar, null);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83998x8c190b4c(java.lang.String str, int i17, java.lang.String str2) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375816c = str2;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: encode */
    public boolean m84092xb2963e16(java.lang.String str, byte[] bArr, int i17) {
        return m83949x4749d268(this.f40023x7b5cfd1f, str, bArr, i17);
    }

    /* renamed from: initialize */
    public static java.lang.String m83976x33ebcb90(android.content.Context context, java.lang.String str, ir5.a aVar, ir5.e eVar, ir5.d dVar) {
        boolean z17;
        long j17;
        if (android.os.Process.is64Bit()) {
            java.lang.String absolutePath = context.getCacheDir().getAbsolutePath();
            f40012x96d7e3de = dVar;
            if (dVar != null) {
                z17 = true;
                f40014xa3060779 = true;
                j17 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40537x212c0af6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKV", "getNativeWriteLogFunc: %x", java.lang.Long.valueOf(j17));
            } else {
                z17 = false;
                j17 = 0;
            }
            java.lang.String m83942x3b4bc27b = m83942x3b4bc27b(str, absolutePath, aVar, eVar, f40014xa3060779, z17, j17);
            if ((context.getApplicationInfo().flags & 2) == 0) {
                m83940xc3ac13ab();
            } else {
                m83945xbdcfc586();
            }
            return m83942x3b4bc27b;
        }
        throw new ir5.k("MMKV 2.0+ requires 64-bit App, use 1.3.x instead.");
    }

    /* renamed from: encode */
    public boolean m84083xb2963e16(java.lang.String str, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            return m83948x7105eff5(this.f40023x7b5cfd1f, str, null);
        }
        return m83948x7105eff5(this.f40023x7b5cfd1f, str, m83966x6919e181(parcelable));
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84001x8c190b4c(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375815b = z17;
        bVar.f375816c = str2;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: encode */
    public boolean m84084xb2963e16(java.lang.String str, android.os.Parcelable parcelable, int i17) {
        if (parcelable == null) {
            return m83949x4749d268(this.f40023x7b5cfd1f, str, null, i17);
        }
        return m83949x4749d268(this.f40023x7b5cfd1f, str, m83966x6919e181(parcelable), i17);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84005x8c190b4c(java.lang.String str, java.lang.String str2) {
        ir5.b bVar = new ir5.b();
        bVar.f375817d = str2;
        return m84004x8c190b4c(str, bVar);
    }

    @java.lang.Deprecated
    /* renamed from: initialize */
    public static java.lang.String m83978x33ebcb90(java.lang.String str) {
        return m83942x3b4bc27b(str, str + "/.tmp", null, ir5.e.LevelInfo, false, false, 0L);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84006x8c190b4c(java.lang.String str, java.lang.String str2, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f375817d = str2;
        bVar.f375818e = j17;
        return m84004x8c190b4c(str, bVar);
    }

    @java.lang.Deprecated
    /* renamed from: initialize */
    public static java.lang.String m83981x33ebcb90(java.lang.String str, ir5.e eVar) {
        return m83942x3b4bc27b(str, str + "/.tmp", null, eVar, false, false, 0L);
    }

    @java.lang.Deprecated
    /* renamed from: initialize */
    public static java.lang.String m83979x33ebcb90(java.lang.String str, ir5.a aVar) {
        return m83942x3b4bc27b(str, str + "/.tmp", aVar, ir5.e.LevelInfo, false, false, 0L);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84000x8c190b4c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375816c = str2;
        bVar.f375817d = str3;
        bVar.f375818e = j17;
        return m84004x8c190b4c(str, bVar);
    }

    @java.lang.Deprecated
    /* renamed from: initialize */
    public static java.lang.String m83980x33ebcb90(java.lang.String str, ir5.a aVar, ir5.e eVar) {
        return m83942x3b4bc27b(str, str + "/.tmp", aVar, eVar, false, false, 0L);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84003x8c190b4c(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3, long j17) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375815b = z17;
        bVar.f375816c = str2;
        bVar.f375817d = str3;
        bVar.f375818e = j17;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m83999x8c190b4c(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375816c = str2;
        bVar.f375817d = str3;
        return m84004x8c190b4c(str, bVar);
    }

    /* renamed from: mmkvWithID */
    public static com.p314xaae8f345.p2833x33330b.SharedPreferencesC22993x242b0b m84002x8c190b4c(java.lang.String str, int i17, java.lang.String str2, boolean z17, java.lang.String str3) {
        ir5.b bVar = new ir5.b();
        bVar.f375814a = i17;
        bVar.f375815b = z17;
        bVar.f375816c = str2;
        bVar.f375817d = str3;
        return m84004x8c190b4c(str, bVar);
    }
}
