package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr */
/* loaded from: classes16.dex */
public class C26185x39dabc5b {

    /* renamed from: BEACON_LOG_HOST_KEY */
    public static final java.lang.String f50770xb25935fe = "beacon_log_host";

    /* renamed from: BEACON_POLICY_HOST_KEY */
    public static final java.lang.String f50771x7973099a = "beacon_policy_host";

    /* renamed from: EVENT_ID_APP_ENTER_BACKGROUND */
    public static final int f50772xb2c3d72 = 100001;

    /* renamed from: EVENT_ID_APP_ENTER_FOREGROUND */
    public static final int f50773xd0dc5187 = 100002;

    /* renamed from: INVALID_CELLULAR_FLOW */
    public static final int f50774x6a00067b = -1;

    /* renamed from: INVALID_SUGGEST_BITRATE */
    public static final int f50775x855a4b0a = -1;

    /* renamed from: PLYAER_HOST_KEY */
    public static final java.lang.String f50776x857015f6 = "player_host_config";

    /* renamed from: PROPERTY_AB_USER_ID */
    public static final java.lang.String f50777x4ea7f09b = "PROPERTY_AbUserId";

    /* renamed from: PROPERTY_ENABLE_DATA_REPORT */
    public static final java.lang.String f50778x1b514d57 = "PROPERTY_EnableDataReport";

    /* renamed from: PROPERTY_ENABLE_NEW_REPORT */
    public static final java.lang.String f50779x284cf125 = "PROPERTY_EnableNewReport";

    /* renamed from: PROPERTY_ENABLE_PLAYER_REPORT */
    public static final java.lang.String f50780x3c2da6c0 = "PROPERTY_EnablePlayerReport";

    /* renamed from: PROPERTY_MEDIA_DRM_REUSE */
    public static final java.lang.String f50781xa88da66f = "PROPERTY_MediaDrmReuse";

    /* renamed from: PROPERTY_PROXY_MAX_USE_MEMORY_MB */
    public static final java.lang.String f50782xb847dce5 = "PROPERTY_ProxyMaxUseMemoryMB";

    /* renamed from: PROPERTY_VIDEO_MEDIACODEC_CO_EXIST_MAX_CNT */
    public static final java.lang.String f50783xd82a0ff2 = "PROPERTY_VideoMediaCodecCoexistMaxCnt";

    /* renamed from: PROPERTY_WIDEVINE_PROVISIONING_SERVER_URL */
    public static final java.lang.String f50784x8857d2cd = "PROPERTY_WidevineProvisioningServerUrl";

    /* renamed from: PROXY_HOST_KEY */
    public static final java.lang.String f50785x997341f9 = "httpproxy_config";
    private static final java.lang.String TAG = "TPThumbPlayer[TPPlayerMgr.java]";

    /* renamed from: TP_DOWNLOAD_PROXY_MODULE_NAME */
    public static final java.lang.String f50786xa95f6fb9 = "DownloadProxy";

    /* renamed from: TP_PLAYERCORE_MODULE_NAME */
    public static final java.lang.String f50787xe0639e2 = "TPCore";

    /* renamed from: mAppContext */
    private static android.content.Context f50788x5869d49b;

    /* renamed from: mBooleanPropertyNameToPropertyHandlerTables */
    private static final java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean>> f50790x14e46fa4;

    /* renamed from: mIntegerPropertyNameToPropertyHandlerTables */
    private static final java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Integer>> f50791xd2d912ce;

    /* renamed from: mIsInit */
    private static boolean f50793x9106827;

    /* renamed from: mLongPropertyNameToPropertyHandlerTables */
    private static final java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Long>> f50794x67287756;

    /* renamed from: mStringPropertyNameToPropertyHandlerTables */
    private static final java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.String>> f50796x1534a4e1;

    /* renamed from: mBoolPropertyNameToValueCache */
    private static final java.util.HashMap<java.lang.String, java.lang.Boolean> f50789xf57407a3 = new java.util.HashMap<>();

    /* renamed from: mIntegerPropertyNameToValueCache */
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> f50792x7c715cbd = new java.util.HashMap<>();

    /* renamed from: mStringPropertyNameToValueCache */
    private static final java.util.HashMap<java.lang.String, java.lang.String> f50797x6e3c588a = new java.util.HashMap<>();

    /* renamed from: mLongPropertyNameToValueCache */
    private static final java.util.HashMap<java.lang.String, java.lang.Long> f50795xc6d37d35 = new java.util.HashMap<>();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$BooleanProperty */
    /* loaded from: classes6.dex */
    public @interface BooleanProperty {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$EventId */
    /* loaded from: classes6.dex */
    public @interface EventId {
    }

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$ITPPropertyHandler */
    /* loaded from: classes16.dex */
    public interface ITPPropertyHandler<T> {
        /* renamed from: getPropertyValue */
        T mo101138x8015dce6();

        /* renamed from: setPropertyValue */
        void mo101139x12ec435a(T t17);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$IntegerProperty */
    /* loaded from: classes6.dex */
    public @interface IntegerProperty {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$LongProperty */
    /* loaded from: classes6.dex */
    public @interface LongProperty {
    }

    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$OnLogListener */
    /* loaded from: classes13.dex */
    public interface OnLogListener {
        int d(java.lang.String str, java.lang.String str2);

        int e(java.lang.String str, java.lang.String str2);

        int i(java.lang.String str, java.lang.String str2);

        int v(java.lang.String str, java.lang.String str2);

        int w(java.lang.String str, java.lang.String str2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.api.TPPlayerMgr$StringProperty */
    /* loaded from: classes6.dex */
    public @interface StringProperty {
    }

    static {
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean>> hashMap = new java.util.HashMap<>();
        f50790x14e46fa4 = hashMap;
        hashMap.put(f50781xa88da66f, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue */
            public java.lang.Boolean mo101138x8015dce6() {
                return java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101635xe0f9c3c6());
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.Boolean bool) {
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101654x2f3e833a(bool.booleanValue());
            }
        });
        hashMap.put(f50778x1b514d57, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue */
            public java.lang.Boolean mo101138x8015dce6() {
                return java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101646xa0ad81eb());
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.Boolean bool) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, "set data report enable : " + bool);
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101651x4299c123(bool.booleanValue());
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103077x10788f8a(bool.booleanValue());
            }
        });
        hashMap.put(f50780x3c2da6c0, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue */
            public java.lang.Boolean mo101138x8015dce6() {
                return java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101647x3380e822());
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.Boolean bool) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, "set player report enable : " + bool);
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101658xb5a395a(bool.booleanValue());
            }
        });
        hashMap.put(f50779x284cf125, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue */
            public java.lang.Boolean mo101138x8015dce6() {
                return java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101636x91940f61());
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.Boolean bool) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, "set new report enable : " + bool);
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101655xc86aa8d5(bool.booleanValue());
            }
        });
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.String>> hashMap2 = new java.util.HashMap<>();
        f50796x1534a4e1 = hashMap2;
        hashMap2.put(f50777x4ea7f09b, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.String>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.10
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue, reason: avoid collision after fix types in other method */
            public java.lang.String mo101138x8015dce6() {
                return com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101630xafdf073d();
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.String str) {
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101650xaa976849(str);
            }
        });
        hashMap2.put(f50784x8857d2cd, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.String>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.11
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue, reason: avoid collision after fix types in other method */
            public java.lang.String mo101138x8015dce6() {
                return com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101645xecc3da0c();
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.String str) {
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101666x4f06d880(str);
            }
        });
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Integer>> hashMap3 = new java.util.HashMap<>();
        f50791xd2d912ce = hashMap3;
        hashMap3.put(f50783xd82a0ff2, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Integer>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue */
            public java.lang.Integer mo101138x8015dce6() {
                return java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101644x850fb159());
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.Integer num) {
                com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101664x7ff91465(num.intValue());
            }
        });
        java.util.HashMap<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Long>> hashMap4 = new java.util.HashMap<>();
        f50794x67287756 = hashMap4;
        hashMap4.put(f50782xb847dce5, new com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Long>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: getPropertyValue */
            public java.lang.Long mo101138x8015dce6() {
                return java.lang.Long.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103090x3b48761a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103089xe23ad884()).f53871xb028b8f9);
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler
            /* renamed from: setPropertyValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo101139x12ec435a(java.lang.Long l17) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103097x66b6edfb(l17.longValue());
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103081x4ef42a22(l17.longValue());
            }
        });
    }

    /* renamed from: dumpStackTrace */
    private static void m101092x96cec8b1() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Current stack trace: ");
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, stackTraceElement.toString());
        }
    }

    /* renamed from: getAppContext */
    public static android.content.Context m101093x6a789444() {
        return f50788x5869d49b;
    }

    /* renamed from: getCellularDataCost */
    public static int m101094x9918c997() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 mo103015xbe71e310;
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b m103074xfa372ad7 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103074xfa372ad7(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101640xab647bb7());
        if (m103074xfa372ad7 == null || (mo103015xbe71e310 = m103074xfa372ad7.mo103015xbe71e310()) == null) {
            return -1;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104281xc3ca103c(mo103015xbe71e310.mo102235xa741fd5b(2), -1);
    }

    /* renamed from: getLibVersion */
    public static java.lang.String m101095x9aeda89(java.lang.String str) {
        if (!f50793x9106827) {
            throw new java.lang.IllegalStateException("player not initialized");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            if (str.equals("DownloadProxy")) {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102352xa942c580();
            }
            if (str.equals(f50787xe0639e2)) {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101875x9aeda89();
            }
        }
        throw new java.lang.IllegalArgumentException("libName:" + str);
    }

    /* renamed from: getOfflineRecordDurationMs */
    public static int m101096xc521ad58(java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102353x667809fb(str, str2);
    }

    /* renamed from: getOfflineRecordVinfo */
    public static java.lang.String m101097x15c26866(java.lang.String str, java.lang.String str2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102348xee841625(str, str2);
    }

    /* renamed from: getPropertyBoolean */
    public static synchronized boolean m101099xc81fae5d(java.lang.String str, boolean z17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            java.lang.Boolean bool = f50789xf57407a3.get(str);
            if (bool != null) {
                z17 = bool.booleanValue();
            }
        }
        return z17;
    }

    /* renamed from: getPropertyInteger */
    public static synchronized int m101101x38f9c373(java.lang.String str, int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            java.lang.Integer num = f50792x7c715cbd.get(str);
            if (num != null) {
                i17 = num.intValue();
            }
        }
        return i17;
    }

    /* renamed from: getPropertyLong */
    public static synchronized long m101103x2d67b867(java.lang.String str, long j17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            java.lang.Long l17 = f50795xc6d37d35.get(str);
            if (l17 != null) {
                j17 = l17.longValue();
            }
        }
        return j17;
    }

    /* renamed from: getPropertyString */
    public static synchronized java.lang.String m101105x7e95833c(java.lang.String str, java.lang.String str2) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            java.lang.String str3 = f50797x6e3c588a.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    /* renamed from: getSuggestedBitrate */
    public static int m101106xf1c99240() {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 mo103015xbe71e310;
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b m103074xfa372ad7 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103074xfa372ad7(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101640xab647bb7());
        if (m103074xfa372ad7 == null || (mo103015xbe71e310 = m103074xfa372ad7.mo103015xbe71e310()) == null) {
            return -1;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104281xc3ca103c(mo103015xbe71e310.mo102235xa741fd5b(0), -1);
    }

    /* renamed from: getThumbPlayerVersion */
    public static java.lang.String m101107x9e2c5677() {
        return com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51522x3fc0a8b8;
    }

    /* renamed from: initAsyncWithWait */
    private static java.util.concurrent.Future<java.lang.Boolean> m101108xb3d092c7() {
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104412x6dce83aa().submit(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Boolean call() {
                com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101110xd4011611();
                return java.lang.Boolean.TRUE;
            }
        });
    }

    /* renamed from: initAsyncWithoutWait */
    private static void m101109x552e6b71() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104413x137f2902().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.3
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350 c26568x28144350 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350();
                c26568x28144350.m104295xa1660e4e();
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100884x316510();
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, "Init SDK, initAsyncWithoutWait  nativeKeyMap init, times: " + c26568x28144350.m104290xb96f3c70());
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104331x9cf0d20b().m104348x316510(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50788x5869d49b);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.m104368x316510();
                new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26264xfefda14f().m101588x731e29ef();
                com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.m101119xbcdaaf60();
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, "Init SDK, initAsyncWithoutWait all times: " + c26568x28144350.m104292xa7a94d38());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initInAsyncThread */
    public static void m101110xd4011611() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350 c26568x28144350 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350();
        c26568x28144350.m104295xa1660e4e();
        com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26263x413d0abf.m101573x316510(f50788x5869d49b.getApplicationContext());
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, initAsyncWithWait  TPBeaconReportWrapper init, times: " + c26568x28144350.m104291x8cbdaa89());
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.p3010xb8ff1437.C26149x86b35afb.m100718x316510(f50788x5869d49b);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, initAsyncWithWait  TPDrmCapability init, times: " + c26568x28144350.m104291x8cbdaa89());
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26331xd6902921.m101981x316510(f50788x5869d49b, true);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, initAsyncWithWait all times: " + c26568x28144350.m104292xa7a94d38());
    }

    /* renamed from: initSdk */
    public static synchronized void m101112x7421050a(android.content.Context context, java.lang.String str, int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            m101092x96cec8b1();
            if (f50793x9106827) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, has init sdk");
                return;
            }
            f50793x9106827 = true;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350 c26568x28144350 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350();
            c26568x28144350.m104295xa1660e4e();
            m101117x7f9caf8e(context, str, i17);
            java.util.concurrent.Future<java.lang.Boolean> m101108xb3d092c7 = m101108xb3d092c7();
            m101113xfffebcb();
            m101109x552e6b71();
            c26568x28144350.m104294x65e5590();
            try {
                try {
                    if (m101108xb3d092c7.get().booleanValue()) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, TPPlayer  wait initSync finish, times: " + c26568x28144350.m104290xb96f3c70());
                    }
                } catch (java.util.concurrent.ExecutionException unused) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Init SDK, TPPlayer wait initSync ExecutionException, times: " + c26568x28144350.m104290xb96f3c70());
                }
            } catch (java.lang.InterruptedException unused2) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "Init SDK, TPPlayer wait initSync InterruptedException, times: " + c26568x28144350.m104290xb96f3c70());
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, TPPlayer all times: " + c26568x28144350.m104292xa7a94d38());
        }
    }

    /* renamed from: initSync */
    private static void m101113xfffebcb() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350 c26568x28144350 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350();
        c26568x28144350.m104295xa1660e4e();
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101882x9ec66011(f50788x5869d49b);
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, initSync so load times: " + c26568x28144350.m104292xa7a94d38());
    }

    /* renamed from: isProxyEnable */
    public static boolean m101114x10bc6e07() {
        return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103093x10bc6e07() && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102354xccbd22c4();
    }

    /* renamed from: isThumbPlayerEnable */
    public static boolean m101115x30cb20b0() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101878x5f41dc85();
    }

    /* renamed from: postEvent */
    public static void m101116x75f54dda(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104304x1057b7f7(i17, i18, i19, obj);
    }

    /* renamed from: preInitSync */
    private static void m101117x7f9caf8e(android.content.Context context, java.lang.String str, int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350 c26568x28144350 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26568x28144350();
        c26568x28144350.m104295xa1660e4e();
        f50788x5869d49b = context.getApplicationContext();
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101653x764ac60b(str);
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101657xe65006f5(i17);
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103094x79665a90(i17);
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101888xcdae5de7(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26282x1866f50d() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26282x1866f50d
            /* renamed from: onPrintLog */
            public void mo101137x5f950056(int i18, java.lang.String str2, java.lang.String str3) {
                if (i18 == 0) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.v(str2, str3);
                    return;
                }
                if (i18 == 1) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(str2, str3);
                    return;
                }
                if (i18 == 2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(str2, str3);
                } else if (i18 == 3) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(str2, str3);
                } else {
                    if (i18 != 4) {
                        return;
                    }
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(str2, str3);
                }
            }
        });
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Init SDK, preInitSync all times: " + c26568x28144350.m104292xa7a94d38());
    }

    /* renamed from: setDebugEnable */
    public static void m101118xfb4317f4(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101652xfb4317f4(z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setExternalProperties */
    public static synchronized void m101119xbcdaaf60() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : f50789xf57407a3.entrySet()) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean> iTPPropertyHandler = f50790x14e46fa4.get(entry.getKey());
                if (iTPPropertyHandler != null) {
                    iTPPropertyHandler.mo101139x12ec435a(entry.getValue());
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry2 : f50792x7c715cbd.entrySet()) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Integer> iTPPropertyHandler2 = f50791xd2d912ce.get(entry2.getKey());
                if (iTPPropertyHandler2 != null) {
                    iTPPropertyHandler2.mo101139x12ec435a(entry2.getValue());
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : f50797x6e3c588a.entrySet()) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.String> iTPPropertyHandler3 = f50796x1534a4e1.get(entry3.getKey());
                if (iTPPropertyHandler3 != null) {
                    iTPPropertyHandler3.mo101139x12ec435a(entry3.getValue());
                }
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry4 : f50795xc6d37d35.entrySet()) {
                com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Long> iTPPropertyHandler4 = f50794x67287756.get(entry4.getKey());
                if (iTPPropertyHandler4 != null) {
                    iTPPropertyHandler4.mo101139x12ec435a(entry4.getValue());
                }
            }
        }
    }

    /* renamed from: setHost */
    public static void m101120x764b252a(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101649x67dafa1d(str);
    }

    /* renamed from: setLibLoader */
    public static void m101121x4c1838b6(final com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26163x8ea712c4 interfaceC26163x8ea712c4) {
        if (f50793x9106827) {
            throw new java.lang.IllegalStateException("player has init");
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101883x4c1838b6(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.4
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd
            /* renamed from: loadLib */
            public boolean mo101140x141073bf(java.lang.String str, java.lang.String str2) {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26163x8ea712c4 interfaceC26163x8ea712c42 = com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26163x8ea712c4.this;
                if (interfaceC26163x8ea712c42 == null) {
                    return false;
                }
                try {
                    interfaceC26163x8ea712c42.m100897xeb57c8f5(str, str2);
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, th6);
                    return false;
                }
            }
        });
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102356xf1f26bdf(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26359x474967c0() { // from class: com.tencent.thumbplayer.api.TPPlayerMgr.5
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26359x474967c0
            /* renamed from: loadLib */
            public boolean mo101141x141073bf(java.lang.String str, java.lang.String str2) {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26163x8ea712c4 interfaceC26163x8ea712c42 = com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26163x8ea712c4.this;
                if (interfaceC26163x8ea712c42 == null) {
                    return false;
                }
                try {
                    interfaceC26163x8ea712c42.m100897xeb57c8f5(str, str2);
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.TAG, th6);
                    return false;
                }
            }
        });
    }

    /* renamed from: setOnLogListener */
    public static void m101122x24b7f377(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.OnLogListener onLogListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.m104312x24b7f377(onLogListener);
    }

    /* renamed from: setOutNetIP */
    public static void m101123x78db1f58(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101656x78db1f78(str);
    }

    /* renamed from: setPropertyBool */
    public static synchronized void m101124x63ac27e1(java.lang.String str, boolean z17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            if (!f50793x9106827) {
                f50789xf57407a3.put(str, java.lang.Boolean.valueOf(z17));
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Boolean> iTPPropertyHandler = f50790x14e46fa4.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.mo101139x12ec435a(java.lang.Boolean.valueOf(z17));
                f50789xf57407a3.put(str, java.lang.Boolean.valueOf(z17));
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    /* renamed from: setPropertyInteger */
    public static synchronized void m101125x6fd05ce7(java.lang.String str, int i17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            if (!f50793x9106827) {
                f50792x7c715cbd.put(str, java.lang.Integer.valueOf(i17));
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Integer> iTPPropertyHandler = f50791xd2d912ce.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.mo101139x12ec435a(java.lang.Integer.valueOf(i17));
                f50792x7c715cbd.put(str, java.lang.Integer.valueOf(i17));
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    /* renamed from: setPropertyLong */
    public static synchronized void m101126x63b0b373(java.lang.String str, long j17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            if (!f50793x9106827) {
                f50795xc6d37d35.put(str, java.lang.Long.valueOf(j17));
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.Long> iTPPropertyHandler = f50794x67287756.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.mo101139x12ec435a(java.lang.Long.valueOf(j17));
                f50795xc6d37d35.put(str, java.lang.Long.valueOf(j17));
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    /* renamed from: setPropertyString */
    public static synchronized void m101127x468beb48(java.lang.String str, java.lang.String str2) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            if (!f50793x9106827) {
                f50797x6e3c588a.put(str, str2);
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.ITPPropertyHandler<java.lang.String> iTPPropertyHandler = f50796x1534a4e1.get(str);
            if (iTPPropertyHandler != null) {
                iTPPropertyHandler.mo101139x12ec435a(str2);
                f50797x6e3c588a.put(str, str2);
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "not found handler of property, propertyName:" + str);
            }
        }
    }

    /* renamed from: setProxyConfig */
    public static void m101128xd1ade98e(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103100xd1ade98e(i17, str, str2);
    }

    /* renamed from: setProxyEnable */
    public static void m101129xd5038bcf(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103102xd5038bcf(z17);
    }

    /* renamed from: setProxyMaxStorageSizeMB */
    public static void m101131x501877f9(long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "setProxyMaxStorageSize: " + j17 + " MB.");
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103099x6de6aa4b(j17);
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103079xa5c04b96(j17);
    }

    /* renamed from: setProxyServiceType */
    public static void m101132x4f6110c3(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103094x79665a90(i17);
    }

    /* renamed from: setProxyVodCachedEnable */
    public static void m101133x4bc7a4e4(int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103105xe4ce20ee(i17, z17);
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103082x43869a7(i17, z17);
    }

    /* renamed from: setTPProxyAdapter */
    public static void m101134xf15a667f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26366x9ea44a26 interfaceC26366x9ea44a26) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102358xf15a667f(interfaceC26366x9ea44a26);
    }

    /* renamed from: setUpcInfo */
    public static void m101135xa32c5334(java.lang.String str, int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101662xa879529b(str);
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101663xb5d0eab6(i17);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104304x1057b7f7(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.f55299x87635d9e, i17, 0, str);
    }

    /* renamed from: setUserInfo */
    public static void m101136x66ab859b(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101661xa87951cd(str);
        com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101660x6ec73746(z17);
    }

    @java.lang.Deprecated
    /* renamed from: getPropertyBoolean */
    public static synchronized boolean m101098xc81fae5d(java.lang.String str) {
        boolean m101099xc81fae5d;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            m101099xc81fae5d = m101099xc81fae5d(str, false);
        }
        return m101099xc81fae5d;
    }

    @java.lang.Deprecated
    /* renamed from: getPropertyInteger */
    public static synchronized int m101100x38f9c373(java.lang.String str) {
        int m101101x38f9c373;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.class) {
            m101101x38f9c373 = m101101x38f9c373(str, 0);
        }
        return m101101x38f9c373;
    }

    @java.lang.Deprecated
    /* renamed from: getPropertyLong */
    public static long m101102x2d67b867(java.lang.String str) {
        return m101103x2d67b867(str, 0L);
    }

    @java.lang.Deprecated
    /* renamed from: getPropertyString */
    public static java.lang.String m101104x7e95833c(java.lang.String str) {
        return m101105x7e95833c(str, "");
    }

    /* renamed from: setProxyMaxStorageSizeMB */
    public static void m101130x501877f9(int i17, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103098x6de6aa4b(i17, j17);
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103078xa5c04b96(i17, j17);
    }

    /* renamed from: initSdk */
    public static void m101111x7421050a(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.api.C26178x8dd93a52 c26178x8dd93a52) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101965x4af1f803(c26178x8dd93a52.m101038x1ccda9f7());
        m101112x7421050a(context, c26178x8dd93a52.m101039xfb7ffeff(), c26178x8dd93a52.m101040xeb97a5e9());
    }
}
