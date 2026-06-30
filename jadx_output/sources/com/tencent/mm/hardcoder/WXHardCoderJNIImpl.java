package com.tencent.mm.hardcoder;

@j95.b(dependencies = {a25.v.class})
/* loaded from: classes15.dex */
public class WXHardCoderJNIImpl extends i95.w implements com.tencent.mm.hardcoder.WXHardCoderJNI {
    private static java.lang.String MANUFACTURER_STRING = "OPPO|vivo|Xiaomi|meizu|Meizu|samsung|Meitu|HMD Global|Hisense|asus|Lenovo|HUAWEI|GREE|TOSOT";
    private static java.lang.String MODEL_STRING = "OPPO A57|OPPO R11t|PRO 7 Plus|M15|15 Lite|15 Plus|MP16|MP17|SM-N9600|SM-N9608|MI 8|Nokia X7|Nokia X6|HLTE311T|HLTE213T";
    private static final java.lang.String TAG = "MicroMsg.WXHardCoderJNI";
    private static final boolean sHCREPORT = false;
    private com.tencent.mm.hardcoder.a getParametersCallback;
    private com.tencent.mm.hardcoder.q systemEventCallback;
    private com.tencent.mm.hardcoder.r hardCoderReporterInfo = null;
    private boolean needMapAPPScene = false;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> SCENE_ID_MAP = new java.util.HashMap();
    private final java.util.Map<java.lang.Integer, java.lang.Integer> APP_SCENE_ID_MAP = new java.util.HashMap();
    private final java.util.HashMap<java.lang.Long, java.lang.String> flagKeyMap = new java.util.HashMap<>();
    private boolean hcBootEnable = true;
    private int hcBootDelay = 0;
    private int hcBootCPU = 1;
    private int hcBootIO = 0;
    private boolean hcBootThr = false;
    private int hcBootTimeout = 5000;
    private long hcBootAction = 4;
    private boolean hcEnterChattingEnable = true;
    private int hcEnterChattingDelay = 0;
    private int hcEnterChattingCPU = 1;
    private int hcEnterChattingIO = 1;
    private boolean hcEnterChattingThr = false;
    private int hcEnterChattingTimeout = 1000;
    private long hcEnterChattingAction = 12294;
    private boolean hcQuitChattingEnable = true;
    private int hcQuitChattingDelay = 0;
    private int hcQuitChattingCPU = 2;
    private int hcQuitChattingIO = 2;
    private boolean hcQuitChattingThr = false;
    private int hcQuitChattingTimeout = 800;
    private long hcQuitChattingAction = 8194;
    private boolean hcSendMsgEnable = true;
    private int hcSendMsgDelay = 0;
    private int hcSendMsgCPU = 3;
    private int hcSendMsgIO = 0;
    private boolean hcSendMsgThr = true;
    private int hcSendMsgTimeout = 1000;
    private long hcSendMsgAction = 12288;
    private boolean hcSendPicMsgEnable = true;
    private int hcSendPicMsgDelay = 0;
    private int hcSendPicMsgCPU = 1;
    private int hcSendPicMsgIO = 2;
    private boolean hcSendPicMsgThr = true;
    private int hcSendPicMsgTimeout = 500;
    private long hcSendPicMsgAction = 123072;
    private boolean hcReceiveMsgEnable = true;
    private int hcReceiveMsgDelay = 500;
    private int hcReceiveMsgCPU = 2;
    private int hcReceiveMsgIO = 2;
    private boolean hcReceiveMsgThr = true;
    private int hcReceiveMsgTimeout = 1000;
    private long hcReceiveMsgAction = 127040;
    private boolean hcUpdateChatroomEnable = true;
    private int hcUpdateChatroomDelay = 0;
    private int hcUpdateChatroomCPU = 2;
    private int hcUpdateChatroomIO = 2;
    private boolean hcUpdateChatroomThr = true;
    private int hcUpdateChatroomTimeout = 1000;
    private long hcUpdateChatroomAction = 127040;
    private long hcUpdateChatroomMemberCount = 50;
    private boolean hcDBEnable = false;
    private int hcDBDelayQuery = 100;
    private int hcDBDelayWrite = 200;
    private int hcDBCPU = 2;
    private int hcDBIO = 2;
    private boolean hcDBThr = false;
    private int hcDBTimeout = 500;
    private int hcDBTimeoutBusy = 5000;
    private long hcDBActionQuery = 4096;
    private long hcDBActionWrite = 12288;
    private boolean hcEncodeVideoEnable = true;
    private int hcEncodeVideoDelay = 0;
    private int hcEncodeVideoCPU = 1;
    private int hcEncodeVideoIO = 1;
    private boolean hcEncodeVideoThr = false;
    private int hcEncodeVideoTimeout = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
    private long hcEncodeVideoAction = 81984;
    private boolean hcDecodePicEnable = false;
    private int hcDecodePicDelay = 100;
    private int hcDecodePicCPU = 2;
    private int hcDecodePicIO = 2;
    private boolean hcDecodePicThr = false;
    private int hcDecodePicTimeout = 500;
    private long hcDecodePicAction = 16448;
    private boolean hcGifEnable = true;
    private int hcGifDelay = 0;
    private int hcGifCPU = 3;
    private int hcGifIO = 2;
    private boolean hcGifThr = false;
    private int hcGifTimeout = 500;
    private long hcGifAction = 81984;
    private boolean hcGifFrameEnable = true;
    private int hcGifFrameDelay = 0;
    private int hcGifFrameCPU = 2;
    private int hcGifFrameIO = 0;
    private boolean hcGifFrameThr = false;
    private int hcGifFrameTimeout = 1000;
    private long hcGifFrameAction = 65600;
    private boolean hcSNSScrollEnable = true;
    private int hcSNSScrollDelay = 0;
    private int hcSNSScrollCPU = 2;
    private int hcSNSScrollIO = 2;
    private boolean hcSNSScrollThr = false;
    private int hcSNSScrollTimeout = 1500;
    private long hcSNSScrollAction = 96;
    private boolean hcSNSUserScrollEnable = true;
    private int hcSNSUserScrollDelay = 0;
    private int hcSNSUserScrollCPU = 3;
    private int hcSNSUserScrollIO = 2;
    private boolean hcSNSUserScrollThr = false;
    private int hcSNSUserScrollTimeout = 1500;
    private long hcSNSUserScrollAction = 96;
    private boolean hcSNSMsgScrollEnable = true;
    private int hcSNSMsgScrollDelay = 0;
    private int hcSNSMsgScrollCPU = 3;
    private int hcSNSMsgScrollIO = 2;
    private boolean hcSNSMsgScrollThr = false;
    private int hcSNSMsgScrollTimeout = 1500;
    private long hcSNSMsgScrollAction = 96;
    private boolean hcMediaGalleryScrollEnable = true;
    private int hcMediaGalleryScrollDelay = 0;
    private int hcMediaGalleryScrollCPU = 3;
    private int hcMediaGalleryScrollIO = 2;
    private boolean hcMediaGalleryScrollThr = false;
    private int hcMediaGalleryScrollTimeout = 1500;
    private long hcMediaGalleryScrollAction = 96;
    private boolean hcAlbumScrollEnable = true;
    private int hcAlbumScrollDelay = 0;
    private int hcAlbumScrollCPU = 3;
    private int hcAlbumScrollIO = 2;
    private boolean hcAlbumScrollThr = false;
    private int hcAlbumScrollTimeout = 1500;
    private long hcAlbumScrollAction = 96;
    private boolean hcMiniProgramLaunchEnable = true;
    private int hcMiniProgramLaunchDelay = 500;
    private int hcMiniProgramLaunchCPU = 1;
    private int hcMiniProgramLaunchIO = 1;
    private boolean hcMiniProgramLaunchThr = false;
    private int hcMiniProgramLaunchTimeout = 5000;
    private long hcMiniProgramLaunchAction = 114688;
    private boolean hcBizEnable = true;
    private int hcBizDelay = 0;
    private int hcBizCPU = 1;
    private int hcBizIO = 1;
    private boolean hcBizThr = false;
    private int hcBizTimeout = 5000;
    private long hcBizAction = 114690;
    private boolean hcBgEnable = true;
    private int hcRetryInterval = 30;
    private int hcUinHash = 0;
    private int hcTimeoutMargin = 0;
    private boolean hcKVPerReport = false;
    private boolean hcKVFtReport = false;
    private boolean hcTimeLimit = false;
    private int hcBeginTimeHour = 8;
    private int hcBeginTimeMin = 0;
    private int hcEndTimeHour = 23;
    private int hcEndTimeMin = 0;
    private volatile java.lang.Class<?> mSystemPropertiesClazz = null;
    private java.lang.reflect.Method mGetStringPropsMethod = null;
    private com.tencent.mm.hardcoder.m wxHardCoderLog = new com.tencent.mm.hardcoder.m() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.2
        @Override // com.tencent.mm.hardcoder.m
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.tencent.mm.hardcoder.m
        public void e(java.lang.String str, java.lang.String str2) {
            com.tencent.mars.xlog.Log.e(str, str2);
        }

        @Override // com.tencent.mm.hardcoder.m
        public void i(java.lang.String str, java.lang.String str2) {
            com.tencent.mars.xlog.Log.i(str, str2);
        }

        @Override // com.tencent.mm.hardcoder.m
        public void printErrStackTrace(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, str2, objArr);
        }
    };
    private com.tencent.mm.hardcoder.l sceneReportCallback = new com.tencent.mm.hardcoder.l() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.4
        @Override // com.tencent.mm.hardcoder.l
        public void sceneReport(int i17, long j17) {
            java.lang.Integer num;
            if (com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.needMapAPPScene || (num = (java.lang.Integer) com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.SCENE_ID_MAP.get(java.lang.Integer.valueOf(i17))) == null) {
                return;
            }
            com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.reportInfo(new com.tencent.mm.hardcoder.u(num.intValue(), j17));
        }
    };
    private com.tencent.mm.hardcoder.j funcRet = new com.tencent.mm.hardcoder.j() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.5
        @Override // com.tencent.mm.hardcoder.j
        public void onFuncRet(int i17, long j17, int i18, int i19, int i27, byte[] bArr) {
            org.json.JSONObject jSONObject;
            org.json.JSONException e17;
            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "FuncRetCallback callbackType:" + i17 + ", requestId:" + j17 + ", retCode:" + i18 + ", funcId:" + i19 + ", dataType:" + i27);
            if (i17 == 2) {
                int i28 = 0;
                if (i19 == 1015) {
                    if (com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.systemEventCallback != null) {
                        try {
                            int optInt = new org.json.JSONObject(new java.lang.String(bArr)).optInt("system_event_code", 0);
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "onData SYSTEM_EVENT_CODE: " + optInt);
                            com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.systemEventCallback.onEvent(optInt);
                            return;
                        } catch (org.json.JSONException e18) {
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "onData parse system event e:" + e18.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i19 == 1019 && com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.getParametersCallback != null) {
                    try {
                        jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
                        try {
                            i28 = jSONObject.getInt("getparameterstype");
                        } catch (org.json.JSONException e19) {
                            e17 = e19;
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "onData parse get parameters e:" + e17.getMessage());
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i28);
                            com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.getParametersCallback.onGetParameters(i28, jSONObject);
                        }
                    } catch (org.json.JSONException e27) {
                        jSONObject = null;
                        e17 = e27;
                    }
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i28);
                    com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.getParametersCallback.onGetParameters(i28, jSONObject);
                }
            }
        }
    };

    private boolean booleanChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str, boolean z17) {
        return sharedPreferences.getBoolean(str, z17) != z17;
    }

    private boolean checkHardCoderEnv() {
        com.tencent.mars.xlog.Log.i(TAG, "checkHardCoderEnv manufacture[%s], model[%s], remote[%s]", android.os.Build.MANUFACTURER, wo.w0.m(), readServerAddr(false));
        return !com.tencent.mm.sdk.platformtools.t8.K0(r2);
    }

    private void initSceneAndFlagMap() {
        this.SCENE_ID_MAP.clear();
        this.APP_SCENE_ID_MAP.clear();
        this.SCENE_ID_MAP.put(101, 1);
        this.SCENE_ID_MAP.put(201, 2);
        this.SCENE_ID_MAP.put(202, 3);
        this.SCENE_ID_MAP.put(203, 4);
        this.SCENE_ID_MAP.put(301, 5);
        this.SCENE_ID_MAP.put(302, 6);
        this.SCENE_ID_MAP.put(401, 7);
        this.SCENE_ID_MAP.put(501, 8);
        this.SCENE_ID_MAP.put(601, 9);
        this.SCENE_ID_MAP.put(602, 10);
        this.SCENE_ID_MAP.put(603, 11);
        this.SCENE_ID_MAP.put(701, 12);
        this.SCENE_ID_MAP.put(702, 13);
        this.SCENE_ID_MAP.put(703, 14);
        this.SCENE_ID_MAP.put(704, 15);
        this.SCENE_ID_MAP.put(705, 16);
        this.SCENE_ID_MAP.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX), 17);
        this.SCENE_ID_MAP.put(901, 18);
        this.SCENE_ID_MAP.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX), 19);
        this.SCENE_ID_MAP.put(java.lang.Integer.valueOf(oc1.f.CTRL_INDEX), 20);
        this.SCENE_ID_MAP.put(706, 21);
        this.SCENE_ID_MAP.put(707, 22);
        this.APP_SCENE_ID_MAP.put(101, 1);
        this.APP_SCENE_ID_MAP.put(201, 6);
        this.APP_SCENE_ID_MAP.put(202, 6);
        this.APP_SCENE_ID_MAP.put(203, 5);
        this.APP_SCENE_ID_MAP.put(301, 2);
        this.APP_SCENE_ID_MAP.put(302, 2);
        this.APP_SCENE_ID_MAP.put(401, 6);
        this.APP_SCENE_ID_MAP.put(501, 4);
        this.APP_SCENE_ID_MAP.put(601, 5);
        this.APP_SCENE_ID_MAP.put(602, 5);
        this.APP_SCENE_ID_MAP.put(603, 5);
        this.APP_SCENE_ID_MAP.put(701, 3);
        this.APP_SCENE_ID_MAP.put(702, 3);
        this.APP_SCENE_ID_MAP.put(703, 3);
        this.APP_SCENE_ID_MAP.put(704, 3);
        this.APP_SCENE_ID_MAP.put(705, 3);
        this.APP_SCENE_ID_MAP.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX), 1);
        this.APP_SCENE_ID_MAP.put(901, 2);
        this.APP_SCENE_ID_MAP.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX), 2);
        this.APP_SCENE_ID_MAP.put(java.lang.Integer.valueOf(oc1.f.CTRL_INDEX), 3);
        this.APP_SCENE_ID_MAP.put(706, 2);
        this.APP_SCENE_ID_MAP.put(707, 7);
        this.flagKeyMap.put(2L, "KEY_HC_BOOT_ENABLE");
        this.flagKeyMap.put(4L, "KEY_HC_RECEIVE_MSG_ENABLE");
        this.flagKeyMap.put(8L, "KEY_HC_SEND_MSG_ENABLE");
        this.flagKeyMap.put(16L, "KEY_HC_SEND_PIC_MSG_ENABLE");
        this.flagKeyMap.put(32L, "KEY_HC_ENTER_CHATTING_ENABLE");
        this.flagKeyMap.put(64L, "KEY_HC_QUIT_CHATTING_ENABLE");
        this.flagKeyMap.put(128L, "KEY_HC_UPDATE_CHATROOM_ENABLE");
        this.flagKeyMap.put(256L, "KEY_HC_DB_ENABLE");
        this.flagKeyMap.put(512L, "KEY_HC_DECODE_PIC_ENABLE");
        this.flagKeyMap.put(1024L, "KEY_HC_GIF_ENABLE");
        this.flagKeyMap.put(2048L, "KEY_HC_GIF_FRAME_ENABLE");
        this.flagKeyMap.put(4096L, "KEY_HC_ENCODE_VIDEO_ENABLE");
        this.flagKeyMap.put(8192L, "KEY_HC_SNS_SCROLL_ENABLE");
        this.flagKeyMap.put(16384L, "KEY_HCALBUM_SCROLL_ENABLE");
        this.flagKeyMap.put(32768L, "KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE");
        this.flagKeyMap.put(65536L, "KEY_HC_SNS_USER_SCROLL_ENABLE");
        this.flagKeyMap.put(131072L, "KEY_HC_SNS_MSG_SCROLL_ENABLE");
        this.flagKeyMap.put(262144L, "KEY_HC_MINI_PROGRAM_LAUNCH_ENABLE");
    }

    private boolean intChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str, int i17) {
        return sharedPreferences.getInt(str, i17) != i17;
    }

    private boolean longChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str, long j17) {
        return sharedPreferences.getLong(str, j17) != j17;
    }

    private void reloadHardcoderConfig() {
        android.content.SharedPreferences.Editor edit = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("hardcoder_setting", 0).edit();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_enable", "1", false, true), getEnable() ? 1 : 0) > 0;
        boolean z18 = z17 && !getEnable();
        edit.putBoolean("KEY_HC_ENABLE", z17);
        edit.putBoolean("KEY_HC_BG_ENABLE", com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_bgenable", "1", false, true), this.hcBgEnable ? 1 : 0) > 0);
        edit.putBoolean("KEY_HC_DEBUG", com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_debug", "1", false, true), getDebug() ? 1 : 0) > 0);
        edit.putInt("KEY_HC_KV_PER", com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_kvper", "50", false, true), this.hcUinHash));
        edit.putInt("KEY_HC_KV_FT", com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_kvft", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, false, true), this.hcUinHash));
        gm0.j1.i();
        int b17 = kk.m.b(gm0.j1.b().h(), 100);
        edit.putInt("KEY_HC_UIN_HASH", b17);
        long V = com.tencent.mm.sdk.platformtools.t8.V(j62.e.g().a("clicfg_scene", "523518", false, true), -1L);
        for (java.util.Map.Entry<java.lang.Long, java.lang.String> entry : this.flagKeyMap.entrySet()) {
            edit.putBoolean(entry.getValue(), (entry.getKey().longValue() & V) != 0);
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_margin", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, false, true), this.hcTimeoutMargin);
        edit.putInt("KEY_HC_TIMEOUT_MARGIN", P);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_retryitv", "300", false, true), this.hcRetryInterval);
        edit.putInt("KEY_HC_RETRY_INTERVAL", P2);
        java.lang.String a17 = j62.e.g().a("clicfg_model", MODEL_STRING, false, true);
        java.lang.String str = MODEL_STRING;
        if (a17 == null) {
            a17 = str;
        }
        java.lang.String m17 = wo.w0.m();
        java.lang.String a18 = j62.e.g().a("clicfg_manufacturer", MANUFACTURER_STRING, false, true);
        java.lang.String str2 = a18 == null ? MANUFACTURER_STRING : a18;
        java.lang.String str3 = android.os.Build.MANUFACTURER;
        if (str2.length() > 0 || a17.length() > 0) {
            boolean contains = str2.contains(str3);
            if (!contains) {
                contains = a17.contains(m17);
            }
            reportIDKey(true, contains ? 10 : 11, 1, true);
            edit.putBoolean("KEY_HC_ENABLE", contains);
            boolean z19 = contains && !getEnable();
            com.tencent.mars.xlog.Log.i(TAG, "reloadHardcoderConfig check manufacturer[%s] manufacturerlist[%s] model[%s] modellist[%s] enable[%b] init[%b]", str3, str2, m17, a17, java.lang.Boolean.valueOf(contains), java.lang.Boolean.valueOf(z19));
            z18 = z19;
        } else {
            reportIDKey(true, 12, 1, true);
        }
        edit.apply();
        com.tencent.mars.xlog.Log.i(TAG, "reloadHardcoderConfig enable[%b] init[%b] bgEnable[%b] debug[%b] uinHash[%d] kv[%b, %b] sceneFlag[%d] margin[%d] retryInterval[%d] model[%s]", java.lang.Boolean.valueOf(getEnable()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.hcBgEnable), java.lang.Boolean.valueOf(getDebug()), java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(this.hcKVPerReport), java.lang.Boolean.valueOf(this.hcKVFtReport), java.lang.Long.valueOf(V), java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), a17);
    }

    private void report() {
        jx3.f.INSTANCE.d(21019, java.lang.Boolean.FALSE, 0, 11003, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportInfo(com.tencent.mm.hardcoder.s sVar) {
        com.tencent.mm.hardcoder.r rVar = this.hardCoderReporterInfo;
        if (rVar != null) {
            com.tencent.mm.plugin.hardcoder.a aVar = (com.tencent.mm.plugin.hardcoder.a) rVar;
            aVar.getClass();
            if (sVar instanceof com.tencent.mm.hardcoder.u) {
                com.tencent.mm.hardcoder.u uVar = (com.tencent.mm.hardcoder.u) sVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", "reportIDKey feature[%b] key[%d], value[%d]", java.lang.Boolean.valueOf(uVar.f68283a), java.lang.Integer.valueOf(uVar.f68284b), java.lang.Integer.valueOf(uVar.f68285c), java.lang.Boolean.valueOf(uVar.f68286d));
                long j17 = uVar.f68283a ? 678L : 679L;
                long j18 = uVar.f68284b;
                long j19 = uVar.f68285c;
                boolean z17 = uVar.f68286d;
                if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
                    return;
                } else {
                    if (gm0.j1.b().f273254q) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
                        return;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.HardCoderReporterImpl", "idkeyStat accountNotInitialReady!");
                    aVar.f142258c.alive();
                    aVar.f142257b.add(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(z17)});
                    return;
                }
            }
            if (!(sVar instanceof com.tencent.mm.hardcoder.t)) {
                if (sVar instanceof com.tencent.mm.hardcoder.v) {
                    aVar.a(16509, new java.lang.Object[0]);
                    return;
                }
                return;
            }
            com.tencent.mm.hardcoder.t tVar = (com.tencent.mm.hardcoder.t) sVar;
            if (com.tencent.mm.plugin.hardcoder.a.f142253e == null) {
                gm0.j1.i();
                com.tencent.mm.plugin.hardcoder.a.f142253e = (java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L);
            }
            if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.hardcoder.a.f142252d)) {
                com.tencent.mm.plugin.hardcoder.a.f142252d = wo.w0.g(false);
            }
            java.lang.String str = com.tencent.mm.plugin.hardcoder.a.f142252d;
            int longValue = (int) com.tencent.mm.plugin.hardcoder.a.f142253e.longValue();
            boolean isHCEnable = ((com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(com.tencent.mm.hardcoder.WXHardCoderJNI.class)).isHCEnable();
            int isRunning = ((com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(com.tencent.mm.hardcoder.WXHardCoderJNI.class)).isRunning();
            boolean enable = ((com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(com.tencent.mm.hardcoder.WXHardCoderJNI.class)).getEnable();
            if (tVar.f68280c == 1) {
                long j27 = (tVar.f68281d * 100) / tVar.f68282e;
                aVar.a(15187, str, java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(isHCEnable ? 1 : 0), java.lang.Integer.valueOf(isRunning), java.lang.Integer.valueOf(tVar.f68278a), java.lang.Long.valueOf(tVar.f68279b), java.lang.Integer.valueOf(tVar.f68280c), java.lang.Long.valueOf(tVar.f68281d), java.lang.Long.valueOf(tVar.f68282e), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(enable ? 1 : 0));
                com.tencent.mars.xlog.Log.i("MicroMsg.HardCoderReporterImpl", java.lang.String.format("fpsReport imei:%s enable:%s, heavy:%s speedUp:%s, engineStatus:%s, scene:%s, action:%s, type:%s, totalDroppedFrames:%s, interval:%s, average:%s", str, java.lang.Integer.valueOf(enable ? 1 : 0), java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(isHCEnable ? 1 : 0), java.lang.Integer.valueOf(isRunning), java.lang.Integer.valueOf(tVar.f68278a), java.lang.Long.valueOf(tVar.f68279b), java.lang.Integer.valueOf(tVar.f68280c), java.lang.Long.valueOf(tVar.f68281d), java.lang.Long.valueOf(tVar.f68282e), java.lang.Long.valueOf(j27)));
            }
        }
    }

    private void reportModifiedConfig() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("hardcoder_setting", 0);
            if ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((intChanged(sharedPreferences, "KEY_HC_BEGIN_TIME_HOUR", 8)) || intChanged(sharedPreferences, "KEY_HC_BEGIN_TIME_MIN", 0)) || intChanged(sharedPreferences, "KEY_HC_END_TIME_HOUR", 23)) || intChanged(sharedPreferences, "KEY_HC_END_TIME_MIN", 0)) || intChanged(sharedPreferences, "KEY_HC_BOOT_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_BOOT_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_BOOT_IO", 0)) || booleanChanged(sharedPreferences, "KEY_HC_BOOT_THR", false)) || intChanged(sharedPreferences, "KEY_HC_BOOT_TIMEOUT", 5000)) || longChanged(sharedPreferences, "KEY_HC_BOOT_ACTION", 4L)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_IO", 1)) || booleanChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_THR", false)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_ACTION", 12294L)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_THR", false)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_TIMEOUT", 800)) || longChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_ACTION", 8194L)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_IO", 0)) || booleanChanged(sharedPreferences, "KEY_HC_SEND_MSG_THR", true)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_SEND_MSG_ACTION", 12288L)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_THR", true)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_TIMEOUT", 500)) || longChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_ACTION", 123072L)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_DELEY", 500)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_THR", true)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_ACTION", 127040L)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_THR", true)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_ACTION", 127040L)) || longChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_MEMBER_COUNT", 50L)) || intChanged(sharedPreferences, "KEY_HC_DB_DELEY_QUERY", 100)) || intChanged(sharedPreferences, "KEY_HC_DB_DELEY_WRITE", 200)) || intChanged(sharedPreferences, "KEY_HC_DB_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_DB_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_DB_THR", false)) || intChanged(sharedPreferences, "KEY_HC_DB_TIMEOUT", 500)) || intChanged(sharedPreferences, "KEY_HC_DB_TIMEOUT_BUSY", 5000)) || longChanged(sharedPreferences, "KEY_HC_DB_ACTION_QUERY", 4096L)) || longChanged(sharedPreferences, "KEY_HC_DB_ACTION_WRITE", 12288L)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_IO", 1)) || booleanChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_THR", false)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_TIMEOUT", com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL)) || longChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_ACTION", 81984L)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_DELEY", 100)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_DECODE_PIC_THR", false)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_TIMEOUT", 500)) || longChanged(sharedPreferences, "KEY_HC_DECODE_PIC_ACTION", 16448L)) || intChanged(sharedPreferences, "KEY_HC_GIF_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_GIF_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_GIF_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_GIF_THR", false)) || intChanged(sharedPreferences, "KEY_HC_GIF_TIMEOUT", 500)) || longChanged(sharedPreferences, "KEY_HC_GIF_ACTION", 81984L)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_IO", 0)) || booleanChanged(sharedPreferences, "KEY_HC_GIF_FRAME_THR", false)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_GIF_FRAME_ACTION", 65600L)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_ACTION", 96L)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_ACTION", 96L)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_ACTION", 96L)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_ACTION", 96L)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_ACTION", 96L)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_DELEY", 500)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_IO", 1)) || booleanChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_THR", false)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_TIMEOUT", 5000)) || longChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_ACTION", 114688L)) {
                report();
            }
        }
    }

    private void requireAccountInitializedOnDemand() {
        if (gm0.j1.a() && gm0.j1.j()) {
            requireAccountInitialized();
        }
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getDebug() {
        requireAccountInitializedOnDemand();
        return com.tencent.mm.hardcoder.HardCoderJNI.isHcDebug();
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getEnable() {
        requireAccountInitializedOnDemand();
        return com.tencent.mm.hardcoder.HardCoderJNI.isHcEnable();
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHCKVPerReport() {
        return this.hcKVPerReport;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcAlbumScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcAlbumScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcAlbumScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcAlbumScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcAlbumScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcAlbumScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcAlbumScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBeginTimeHour() {
        requireAccountInitializedOnDemand();
        return this.hcBeginTimeHour;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBeginTimeMin() {
        requireAccountInitializedOnDemand();
        return this.hcBeginTimeMin;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcBgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcBgEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcBizAction() {
        requireAccountInitializedOnDemand();
        return this.hcBizAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBizCPU() {
        requireAccountInitializedOnDemand();
        return this.hcBizCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBizDelay() {
        requireAccountInitializedOnDemand();
        return this.hcBizDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcBizEnable() {
        requireAccountInitializedOnDemand();
        return this.hcBizEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBizIO() {
        requireAccountInitializedOnDemand();
        return this.hcBizIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcBizThr() {
        requireAccountInitializedOnDemand();
        return this.hcBizThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBizTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcBizTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcBootAction() {
        requireAccountInitializedOnDemand();
        return this.hcBootAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBootCPU() {
        requireAccountInitializedOnDemand();
        return this.hcBootCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBootDelay() {
        requireAccountInitializedOnDemand();
        return this.hcBootDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcBootEnable() {
        requireAccountInitializedOnDemand();
        return this.hcBootEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBootIO() {
        requireAccountInitializedOnDemand();
        return this.hcBootIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcBootThr() {
        requireAccountInitializedOnDemand();
        return this.hcBootThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcBootTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcBootTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcDBActionQuery() {
        requireAccountInitializedOnDemand();
        return this.hcDBActionQuery;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcDBActionWrite() {
        requireAccountInitializedOnDemand();
        return this.hcDBActionWrite;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDBCPU() {
        requireAccountInitializedOnDemand();
        return this.hcDBCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDBDelayQuery() {
        requireAccountInitializedOnDemand();
        return this.hcDBDelayQuery;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDBDelayWrite() {
        requireAccountInitializedOnDemand();
        return this.hcDBDelayWrite;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcDBEnable() {
        requireAccountInitializedOnDemand();
        return this.hcDBEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDBIO() {
        requireAccountInitializedOnDemand();
        return this.hcDBIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcDBThr() {
        requireAccountInitializedOnDemand();
        return this.hcDBThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDBTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcDBTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDBTimeoutBusy() {
        requireAccountInitializedOnDemand();
        return this.hcDBTimeoutBusy;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcDecodePicAction() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDecodePicCPU() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDecodePicDelay() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcDecodePicEnable() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDecodePicIO() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcDecodePicThr() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcDecodePicTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcEncodeVideoAction() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEncodeVideoCPU() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEncodeVideoDelay() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcEncodeVideoEnable() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEncodeVideoIO() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcEncodeVideoThr() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEncodeVideoTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEndTimeHour() {
        requireAccountInitializedOnDemand();
        return this.hcEndTimeHour;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEndTimeMin() {
        requireAccountInitializedOnDemand();
        return this.hcEndTimeMin;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcEnterChattingAction() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEnterChattingCPU() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEnterChattingDelay() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcEnterChattingEnable() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEnterChattingIO() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcEnterChattingThr() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcEnterChattingTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcGifAction() {
        requireAccountInitializedOnDemand();
        return this.hcGifAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifCPU() {
        requireAccountInitializedOnDemand();
        return this.hcGifCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifDelay() {
        requireAccountInitializedOnDemand();
        return this.hcGifDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcGifEnable() {
        requireAccountInitializedOnDemand();
        return this.hcGifEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcGifFrameAction() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifFrameCPU() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifFrameDelay() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcGifFrameEnable() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifFrameIO() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcGifFrameThr() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifFrameTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifIO() {
        requireAccountInitializedOnDemand();
        return this.hcGifIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcGifThr() {
        requireAccountInitializedOnDemand();
        return this.hcGifThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcGifTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcGifTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcKVFtReport() {
        requireAccountInitializedOnDemand();
        return this.hcKVFtReport;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcKVPerReport() {
        requireAccountInitializedOnDemand();
        return this.hcKVPerReport;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcMediaGalleryScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMediaGalleryScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMediaGalleryScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcMediaGalleryScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMediaGalleryScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcMediaGalleryScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMediaGalleryScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcMiniProgramLaunchAction() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMiniProgramLaunchCPU() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMiniProgramLaunchDelay() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcMiniProgramLaunchEnable() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMiniProgramLaunchIO() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcMiniProgramLaunchThr() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcMiniProgramLaunchTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcQuitChattingAction() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcQuitChattingCPU() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcQuitChattingDelay() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcQuitChattingEnable() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcQuitChattingIO() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcQuitChattingThr() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcQuitChattingTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcReceiveMsgAction() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcReceiveMsgCPU() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcReceiveMsgDelay() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcReceiveMsgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcReceiveMsgIO() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcReceiveMsgThr() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcReceiveMsgTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcRetryInterval() {
        requireAccountInitializedOnDemand();
        return this.hcRetryInterval;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcSNSMsgScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSMsgScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSMsgScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSNSMsgScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSMsgScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSNSMsgScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSMsgScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcSNSScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSNSScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSNSScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcSNSUserScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSUserScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSUserScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSNSUserScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSUserScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSNSUserScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSNSUserScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcSendMsgAction() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendMsgCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendMsgDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSendMsgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendMsgIO() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSendMsgThr() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendMsgTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcSendPicMsgAction() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendPicMsgCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendPicMsgDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSendPicMsgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendPicMsgIO() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcSendPicMsgThr() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcSendPicMsgTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcTimeLimit() {
        requireAccountInitializedOnDemand();
        return this.hcTimeLimit;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcTimeoutMargin() {
        requireAccountInitializedOnDemand();
        return this.hcTimeoutMargin;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcUinHash() {
        requireAccountInitializedOnDemand();
        return this.hcUinHash;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcUpdateChatroomAction() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomAction;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcUpdateChatroomCPU() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomCPU;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcUpdateChatroomDelay() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomDelay;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcUpdateChatroomEnable() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomEnable;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcUpdateChatroomIO() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomIO;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getHcUpdateChatroomMemberCount() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomMemberCount;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean getHcUpdateChatroomThr() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomThr;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int getHcUpdateChatroomTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomTimeout;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getParameters(int i17, com.tencent.mm.hardcoder.a aVar, java.lang.String... strArr) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("getparameterstype", i17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str : strArr) {
                jSONArray.put(str);
            }
            jSONObject.put("getparameterskeys", jSONArray);
            return getParameters(i17, aVar, jSONObject);
        } catch (org.json.JSONException unused) {
            return -1L;
        }
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int initHardCoder(com.tencent.mm.hardcoder.o oVar, com.tencent.mm.hardcoder.r rVar, com.tencent.mm.hardcoder.i iVar) {
        com.tencent.mm.hardcoder.HardCoderJNI.setHcEnable(com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv());
        java.lang.String readServerAddr = readServerAddr(false);
        if (readServerAddr == null || readServerAddr.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (readServerAddr == null) {
                readServerAddr = "null";
            }
            objArr[0] = readServerAddr;
            com.tencent.mars.xlog.Log.w(TAG, "initHardCoder serverSock is null or empty, skip init and reguard as disabled, serverSock:%s.", objArr);
            com.tencent.mm.hardcoder.HardCoderJNI.setCheckEnv(false);
            return -3;
        }
        if (readServerAddr.contains("|")) {
            this.needMapAPPScene = true;
        }
        if (com.tencent.mm.hardcoder.p.f68277a == null) {
            com.tencent.mm.hardcoder.n.c("Hardcoder.HardCoderReporter", java.lang.String.format("setReporter[%s]", oVar));
            com.tencent.mm.hardcoder.p.f68277a = oVar;
        }
        this.hardCoderReporterInfo = rVar;
        com.tencent.mm.hardcoder.n.f68276a = this.wxHardCoderLog;
        com.tencent.mm.hardcoder.HardCoderJNI.setSceneReportCallback(this.sceneReportCallback);
        com.tencent.mars.xlog.Log.i(TAG, "initHardCoder hcDebug[%b] hcEnable[%b] checkEnv[%b] TICK_RATE[%d]", java.lang.Boolean.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.isHcDebug()), java.lang.Boolean.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.isHcEnable()), java.lang.Boolean.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv()), java.lang.Integer.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.tickRate));
        return com.tencent.mm.hardcoder.HardCoderJNI.initHardCoder(readServerAddr, 0, com.tencent.mm.sdk.platformtools.x2.f193072b + com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_SOCK, new com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.3
            @Override // com.tencent.mm.hardcoder.HardCoderJNI.HCPerfManagerThread
            public java.lang.Thread newThread(java.lang.Runnable runnable, java.lang.String str, int i17) {
                return pu5.i.b(str, runnable, i17);
            }
        }, iVar);
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean isCheckEnv() {
        requireAccountInitializedOnDemand();
        return com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv();
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public boolean isHCEnable() {
        return isCheckEnv() & getEnable();
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int isRunning() {
        return com.tencent.mm.hardcoder.HardCoderJNI.isRunning();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        reloadHardcoderConfig();
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("hardcoder_setting", 0);
        gm0.j1.i();
        if (gm0.j1.b().h() != 0) {
            gm0.j1.i();
            int b17 = kk.m.b(gm0.j1.b().h(), 100);
            if (b17 != sharedPreferences.getInt("KEY_HC_UIN_HASH", 0)) {
                com.tencent.mars.xlog.Log.i(TAG, "onAccountInitialized hardcoder uinHash[%d] reloadSPConfig", java.lang.Integer.valueOf(b17));
                sharedPreferences.edit().putInt("KEY_HC_UIN_HASH", b17).apply();
                reloadSPConfig(2);
            }
        }
        q25.b.b(new mp.a(), "//fsd");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mm.hardcoder.HardCoderJNI.loadLibrary(new com.tencent.mm.hardcoder.WXHardCoderJNIImpl$$a());
        initSceneAndFlagMap();
        reloadSPConfig(0);
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.tencent.mm.plugin.hardcoder.a.f142255g == null) {
            com.tencent.mm.plugin.hardcoder.a.f142255g = new com.tencent.mm.plugin.hardcoder.a();
        }
        com.tencent.mm.plugin.hardcoder.a aVar = com.tencent.mm.plugin.hardcoder.a.f142255g;
        if (aVar == null) {
            com.tencent.mm.plugin.hardcoder.a.f142255g = new com.tencent.mm.plugin.hardcoder.a();
        }
        initHardCoder(aVar, com.tencent.mm.plugin.hardcoder.a.f142255g, new com.tencent.mm.hardcoder.i() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.1
            @Override // com.tencent.mm.hardcoder.i
            public void onConnectStatus(boolean z17) {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "configure initHardCoder callback, connect:%b", java.lang.Boolean.valueOf(z17));
                if (z17 && com.tencent.mm.sdk.platformtools.x2.n()) {
                    com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.registerSystemEventCallback(new com.tencent.mm.hardcoder.q() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.1.1
                        @Override // com.tencent.mm.hardcoder.q
                        public void onEvent(int i17) {
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "configure SystemEventCallback onEvent eventCode[%d]", java.lang.Integer.valueOf(i17));
                            com.tencent.mm.autogen.events.HardCoderSystemEvent hardCoderSystemEvent = new com.tencent.mm.autogen.events.HardCoderSystemEvent();
                            hardCoderSystemEvent.f54432g.f6834a = i17;
                            hardCoderSystemEvent.e();
                        }
                    });
                    com.tencent.mm.hardcoder.a aVar2 = new com.tencent.mm.hardcoder.a() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.1.2
                        @Override // com.tencent.mm.hardcoder.a
                        public void onGetParameters(int i17, org.json.JSONObject jSONObject) {
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "configure GetParametersCallback onGetParameters type[%d]", java.lang.Integer.valueOf(i17));
                            if (i17 == 1) {
                                try {
                                    java.lang.String string = jSONObject.getString("HCMinQPKey");
                                    java.lang.String string2 = jSONObject.getString("HCMaxQPKey");
                                    java.lang.String string3 = jSONObject.getString("HCQPSceneKey");
                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "onGetParameters, minkey:%s, maxKey:%s, sceneKey:%s", string, string2, string3);
                                    com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("HardcoderQP");
                                    M.D("HCMinQPKey", string);
                                    M.D("HCMaxQPKey", string2);
                                    M.D("HCQPSceneKey", string3);
                                    return;
                                } catch (org.json.JSONException unused) {
                                    return;
                                }
                            }
                            if (i17 == 4) {
                                java.lang.String optString = jSONObject.optString("BFrameKey");
                                int optInt = jSONObject.optInt("BFrameKeyOptionOpen", -1);
                                int optInt2 = jSONObject.optInt("BFrameKeyOptionClose", -1);
                                com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "get bFrame parameters, BFrameKey:%s, BFrameKeyOptionOpen:%s, BFrameKeyOptionClose:%s", optString, java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2));
                                com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("HardcoderBFrame");
                                M2.D("BFrameKey", optString);
                                M2.A("BFrameKeyOptionOpen", optInt);
                                M2.A("BFrameKeyOptionClose", optInt2);
                            }
                        }
                    };
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "configure qp registerGetParametersCallback ret:%d", java.lang.Integer.valueOf(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.registerGetParametersCallback(1, aVar2, "HCMinQPKey", "HCMaxQPKey", "HCQPSceneKey")));
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.TAG, "configure bFrame registerGetParametersCallback ret:%d", java.lang.Integer.valueOf(com.tencent.mm.hardcoder.WXHardCoderJNIImpl.this.registerGetParametersCallback(4, aVar2, new java.lang.String[0])));
                }
            }
        });
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i(TAG, "configure initHardCoder[%d %d %d %d] take[%d]ms tid[%s, %s]", java.lang.Long.valueOf(im0.a.f292163b), java.lang.Long.valueOf(im0.a.f292164c), java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2), java.lang.Long.valueOf(elapsedRealtime2 - im0.a.f292163b), currentThread.getName(), java.lang.Long.valueOf(currentThread.getId()));
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public synchronized java.lang.String readServerAddr(boolean z17) {
        java.lang.String str;
        try {
            if (this.mSystemPropertiesClazz == null) {
                this.mSystemPropertiesClazz = java.lang.Class.forName("android.os.SystemProperties");
                java.lang.reflect.Method declaredMethod = this.mSystemPropertiesClazz.getDeclaredMethod("get", java.lang.String.class, java.lang.String.class);
                this.mGetStringPropsMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            str = (java.lang.String) this.mGetStringPropsMethod.invoke(null, com.tencent.mm.hardcoder.HardCoderJNI.SERVER_PROP_KEY, "");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i(TAG, "readServerAddr, serverprop[%s], result[%s], stack[%s]", com.tencent.mm.hardcoder.HardCoderJNI.SERVER_PROP_KEY, str, new com.tencent.mm.sdk.platformtools.z3());
            if (z17) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    reportInfo(new com.tencent.mm.hardcoder.u(true, 1, 1, false));
                } else {
                    reportInfo(new com.tencent.mm.hardcoder.u(true, 2, 1, false));
                    reportInfo(new com.tencent.mm.hardcoder.v());
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "readServerAddr", new java.lang.Object[0]);
            if (!z17) {
                return "";
            }
            reportInfo(new com.tencent.mm.hardcoder.u(true, 3, 1, false));
            return "";
        }
        return str;
    }

    public long registerANRCallback(com.tencent.mm.hardcoder.HardCoderJNI.AnrCallback anrCallback) {
        requireAccountInitializedOnDemand();
        if (com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv()) {
            return com.tencent.mm.hardcoder.HardCoderJNI.registerANRCallback(anrCallback);
        }
        return -2L;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int registerGetParametersCallback(int i17, com.tencent.mm.hardcoder.a aVar, java.lang.String... strArr) {
        if (!com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv()) {
            return -2;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = aVar == null ? "null" : aVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = new com.tencent.mm.sdk.platformtools.z3();
        com.tencent.mars.xlog.Log.i(TAG, "registerGetParametersCallback, type:%d, callback:%s, stack[%s]", objArr);
        getParameters(i17, aVar, strArr);
        return 0;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long registerSystemEventCallback(com.tencent.mm.hardcoder.q qVar) {
        if (!com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv()) {
            return -2L;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "registerSystemEventCallback, stack[%s]", new com.tencent.mm.sdk.platformtools.z3());
        this.systemEventCallback = qVar;
        long registerSystemEventCallback = com.tencent.mm.hardcoder.HardCoderJNI.registerSystemEventCallback(android.os.Process.myTid(), android.os.SystemClock.elapsedRealtime());
        com.tencent.mm.hardcoder.HardCoderJNI.putFuncRetHashMap(registerSystemEventCallback, this.funcRet);
        return registerSystemEventCallback;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void reloadSPConfig(int i17) {
        boolean checkHardCoderEnv = checkHardCoderEnv();
        com.tencent.mm.hardcoder.HardCoderJNI.setCheckEnv(checkHardCoderEnv);
        if (!checkHardCoderEnv) {
            com.tencent.mars.xlog.Log.e(TAG, "reloadSPConfig hcEnv is false.");
            return;
        }
        setDebug(false);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("hardcoder_setting", 0);
        com.tencent.mm.hardcoder.HardCoderJNI.setHcEnable(sharedPreferences.getBoolean("KEY_HC_ENABLE", true));
        this.hcBgEnable = sharedPreferences.getBoolean("KEY_HC_BG_ENABLE", true);
        this.hcUinHash = sharedPreferences.getInt("KEY_HC_UIN_HASH", 0);
        com.tencent.mm.hardcoder.HardCoderJNI.setHcDebug(sharedPreferences.getBoolean("KEY_HC_DEBUG", false));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.isHcDebug());
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.isHcEnable());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.hcUinHash);
        java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(com.tencent.mm.hardcoder.HardCoderJNI.isCheckEnv());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "reloadSPConfig scene:%d, hcDebug:%b, hcEnable:%b, hcUinHash:%d, checkEnv:%b, stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, new com.tencent.mm.sdk.platformtools.z3());
        this.hcRetryInterval = sharedPreferences.getInt("KEY_HC_RETRY_INTERVAL", 30);
        this.hcKVPerReport = sharedPreferences.getInt("KEY_HC_KV_PER", 0) < this.hcUinHash;
        this.hcKVFtReport = sharedPreferences.getInt("KEY_HC_KV_FT", 0) < this.hcUinHash;
        this.hcTimeoutMargin = sharedPreferences.getInt("KEY_HC_TIMEOUT_MARGIN", 0);
        this.hcTimeLimit = false;
        this.hcBeginTimeHour = 8;
        this.hcBeginTimeMin = 0;
        this.hcEndTimeHour = 23;
        this.hcEndTimeMin = 0;
        this.hcBootEnable = sharedPreferences.getBoolean("KEY_HC_BOOT_ENABLE", true);
        this.hcBootDelay = 0;
        this.hcBootCPU = 1;
        this.hcBootIO = 0;
        this.hcBootThr = false;
        this.hcBootTimeout = 5000;
        this.hcBootAction = 4L;
        this.hcEnterChattingEnable = sharedPreferences.getBoolean("KEY_HC_ENTER_CHATTING_ENABLE", true);
        this.hcEnterChattingDelay = 0;
        this.hcEnterChattingCPU = 1;
        this.hcEnterChattingIO = 1;
        this.hcEnterChattingThr = false;
        this.hcEnterChattingTimeout = 1000;
        this.hcEnterChattingAction = 12294L;
        this.hcQuitChattingEnable = sharedPreferences.getBoolean("KEY_HC_QUIT_CHATTING_ENABLE", true);
        this.hcQuitChattingDelay = 0;
        this.hcQuitChattingCPU = 2;
        this.hcQuitChattingIO = 2;
        this.hcQuitChattingThr = false;
        this.hcQuitChattingTimeout = 800;
        this.hcQuitChattingAction = 8194L;
        this.hcSendMsgEnable = sharedPreferences.getBoolean("KEY_HC_SEND_MSG_ENABLE", true);
        this.hcSendMsgDelay = 0;
        this.hcSendMsgCPU = 3;
        this.hcSendMsgIO = 0;
        this.hcSendMsgThr = true;
        this.hcSendMsgTimeout = 1000;
        this.hcSendMsgAction = 12288L;
        this.hcSendPicMsgEnable = sharedPreferences.getBoolean("KEY_HC_SEND_PIC_MSG_ENABLE", true);
        this.hcSendPicMsgDelay = 0;
        this.hcSendPicMsgCPU = 1;
        this.hcSendPicMsgIO = 2;
        this.hcSendPicMsgThr = true;
        this.hcSendPicMsgTimeout = 500;
        this.hcSendPicMsgAction = 123072L;
        this.hcReceiveMsgEnable = sharedPreferences.getBoolean("KEY_HC_RECEIVE_MSG_ENABLE", true);
        this.hcReceiveMsgDelay = 500;
        this.hcReceiveMsgCPU = 2;
        this.hcReceiveMsgIO = 2;
        this.hcReceiveMsgThr = true;
        this.hcReceiveMsgTimeout = 1000;
        this.hcReceiveMsgAction = 127040L;
        this.hcUpdateChatroomEnable = sharedPreferences.getBoolean("KEY_HC_UPDATE_CHATROOM_ENABLE", true);
        this.hcUpdateChatroomDelay = 0;
        this.hcUpdateChatroomCPU = 2;
        this.hcUpdateChatroomIO = 2;
        this.hcUpdateChatroomThr = true;
        this.hcUpdateChatroomTimeout = 1000;
        this.hcUpdateChatroomAction = 127040L;
        this.hcUpdateChatroomMemberCount = 50L;
        this.hcDBEnable = sharedPreferences.getBoolean("KEY_HC_DB_ENABLE", false);
        this.hcDBDelayQuery = 100;
        this.hcDBDelayWrite = 200;
        this.hcDBCPU = 2;
        this.hcDBIO = 2;
        this.hcDBThr = false;
        this.hcDBTimeout = 500;
        this.hcDBTimeoutBusy = 5000;
        this.hcDBActionQuery = 4096L;
        this.hcDBActionWrite = 12288L;
        this.hcEncodeVideoEnable = sharedPreferences.getBoolean("KEY_HC_ENCODE_VIDEO_ENABLE", true);
        this.hcEncodeVideoDelay = 0;
        this.hcEncodeVideoCPU = 1;
        this.hcEncodeVideoIO = 1;
        this.hcEncodeVideoThr = false;
        this.hcEncodeVideoTimeout = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        this.hcEncodeVideoAction = 81984L;
        this.hcDecodePicEnable = sharedPreferences.getBoolean("KEY_HC_DECODE_PIC_ENABLE", false);
        this.hcDecodePicDelay = 100;
        this.hcDecodePicCPU = 2;
        this.hcDecodePicIO = 2;
        this.hcDecodePicThr = false;
        this.hcDecodePicTimeout = 500;
        this.hcDecodePicAction = 16448L;
        this.hcGifEnable = sharedPreferences.getBoolean("KEY_HC_GIF_ENABLE", true);
        this.hcGifDelay = 0;
        this.hcGifCPU = 3;
        this.hcGifIO = 2;
        this.hcGifThr = false;
        this.hcGifTimeout = 500;
        this.hcGifAction = 81984L;
        this.hcGifFrameEnable = sharedPreferences.getBoolean("KEY_HC_GIF_FRAME_ENABLE", true);
        this.hcGifFrameDelay = 0;
        this.hcGifFrameCPU = 2;
        this.hcGifFrameIO = 0;
        this.hcGifFrameThr = false;
        this.hcGifFrameTimeout = 1000;
        this.hcGifFrameAction = 65600L;
        this.hcSNSScrollEnable = sharedPreferences.getBoolean("KEY_HC_SNS_SCROLL_ENABLE", true);
        this.hcSNSScrollDelay = 0;
        this.hcSNSScrollCPU = 2;
        this.hcSNSScrollIO = 2;
        this.hcSNSScrollThr = false;
        this.hcSNSScrollTimeout = 1500;
        this.hcSNSScrollAction = 96L;
        this.hcSNSUserScrollEnable = sharedPreferences.getBoolean("KEY_HC_SNS_USER_SCROLL_ENABLE", true);
        this.hcSNSUserScrollDelay = 0;
        this.hcSNSUserScrollCPU = 3;
        this.hcSNSUserScrollIO = 2;
        this.hcSNSUserScrollThr = false;
        this.hcSNSUserScrollTimeout = 1500;
        this.hcSNSUserScrollAction = 96L;
        this.hcSNSMsgScrollEnable = sharedPreferences.getBoolean("KEY_HC_SNS_MSG_SCROLL_ENABLE", true);
        this.hcSNSMsgScrollDelay = 0;
        this.hcSNSMsgScrollCPU = 3;
        this.hcSNSMsgScrollIO = 2;
        this.hcSNSMsgScrollThr = false;
        this.hcSNSMsgScrollTimeout = 1500;
        this.hcSNSMsgScrollAction = 96L;
        this.hcMediaGalleryScrollEnable = sharedPreferences.getBoolean("KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE", true);
        this.hcMediaGalleryScrollDelay = 0;
        this.hcMediaGalleryScrollCPU = 3;
        this.hcMediaGalleryScrollIO = 2;
        this.hcMediaGalleryScrollThr = false;
        this.hcMediaGalleryScrollTimeout = 1500;
        this.hcMediaGalleryScrollAction = 96L;
        this.hcAlbumScrollEnable = sharedPreferences.getBoolean("KEY_HCALBUM_SCROLL_ENABLE", true);
        this.hcAlbumScrollDelay = 0;
        this.hcAlbumScrollCPU = 3;
        this.hcAlbumScrollIO = 2;
        this.hcAlbumScrollThr = false;
        this.hcAlbumScrollTimeout = 1500;
        this.hcAlbumScrollAction = 96L;
        this.hcMiniProgramLaunchEnable = sharedPreferences.getBoolean("KEY_HC_MINI_PROGRAM_LAUNCH_ENABLE", true);
        this.hcMiniProgramLaunchDelay = 500;
        this.hcMiniProgramLaunchCPU = 1;
        this.hcMiniProgramLaunchIO = 1;
        this.hcMiniProgramLaunchThr = false;
        this.hcMiniProgramLaunchTimeout = 5000;
        this.hcMiniProgramLaunchAction = 114688L;
        com.tencent.mars.xlog.Log.i(TAG, "reloadSPConfig Boot[%b] EnterChatting[%b] QuitChatting[%b] SendMsg[%b] SendPicMsg[%b] ReceiveMsg[%b] UpdateChatroom[%b] DB[%b] EncodeVideo[%b] DecodePic[%b] Gif[%b] GifFrame[%b] SNS[%b] MediaGallery[%b] Album[%b] SNSUser[%b] SNSMsg[%b] MiniProgramLaunch[%b]", java.lang.Boolean.valueOf(this.hcBootEnable), java.lang.Boolean.valueOf(this.hcEnterChattingEnable), java.lang.Boolean.valueOf(this.hcQuitChattingEnable), java.lang.Boolean.valueOf(this.hcSendMsgEnable), java.lang.Boolean.valueOf(this.hcSendPicMsgEnable), java.lang.Boolean.valueOf(this.hcReceiveMsgEnable), java.lang.Boolean.valueOf(this.hcUpdateChatroomEnable), java.lang.Boolean.valueOf(this.hcDBEnable), java.lang.Boolean.valueOf(this.hcEncodeVideoEnable), java.lang.Boolean.valueOf(this.hcDecodePicEnable), java.lang.Boolean.valueOf(this.hcGifEnable), java.lang.Boolean.valueOf(this.hcGifFrameEnable), java.lang.Boolean.valueOf(this.hcSNSScrollEnable), java.lang.Boolean.valueOf(this.hcMediaGalleryScrollEnable), java.lang.Boolean.valueOf(this.hcAlbumScrollEnable), java.lang.Boolean.valueOf(this.hcSNSUserScrollEnable), java.lang.Boolean.valueOf(this.hcSNSMsgScrollEnable), java.lang.Boolean.valueOf(this.hcMiniProgramLaunchEnable));
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void reportFPS(int i17, long j17, int i18, long j18, long j19) {
        reportInfo(new com.tencent.mm.hardcoder.t(i17, j17, i18, j18, j19));
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void reportIDKey(boolean z17, int i17, int i18, boolean z18) {
        reportInfo(new com.tencent.mm.hardcoder.u(z17, i17, i18, z18));
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setDebug(boolean z17) {
        com.tencent.mm.hardcoder.HardCoderJNI.setHcDebug(z17);
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollAction(long j17) {
        this.hcAlbumScrollAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollCPU(int i17) {
        this.hcAlbumScrollCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollDelay(int i17) {
        this.hcAlbumScrollDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollEnable(boolean z17) {
        this.hcAlbumScrollEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollIO(int i17) {
        this.hcAlbumScrollIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollThr(boolean z17) {
        this.hcAlbumScrollThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcAlbumScrollTimeout(int i17) {
        this.hcAlbumScrollTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBeginTimeHour(int i17) {
        this.hcBeginTimeHour = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBeginTimeMin(int i17) {
        this.hcBeginTimeMin = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBgEnable(boolean z17) {
        this.hcBgEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizAction(long j17) {
        this.hcBizAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizCPU(int i17) {
        this.hcBizCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizDelay(int i17) {
        this.hcBizDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizEnable(boolean z17) {
        this.hcBizEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizIO(int i17) {
        this.hcBizIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizThr(boolean z17) {
        this.hcBizThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBizTimeout(int i17) {
        this.hcBizTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootAction(long j17) {
        this.hcBootAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootCPU(int i17) {
        this.hcBootCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootDelay(int i17) {
        this.hcBootDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootEnable(boolean z17) {
        this.hcBootEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootIO(int i17) {
        this.hcBootIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootThr(boolean z17) {
        this.hcBootThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcBootTimeout(int i17) {
        this.hcBootTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBActionQuery(long j17) {
        this.hcDBActionQuery = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBActionWrite(long j17) {
        this.hcDBActionWrite = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBCPU(int i17) {
        this.hcDBCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBDelayQuery(int i17) {
        this.hcDBDelayQuery = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBDelayWrite(int i17) {
        this.hcDBDelayWrite = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBEnable(boolean z17) {
        this.hcDBEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBIO(int i17) {
        this.hcDBIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBThr(boolean z17) {
        this.hcDBThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBTimeout(int i17) {
        this.hcDBTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDBTimeoutBusy(int i17) {
        this.hcDBTimeoutBusy = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicAction(long j17) {
        this.hcDecodePicAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicCPU(int i17) {
        this.hcDecodePicCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicDelay(int i17) {
        this.hcDecodePicDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicEnable(boolean z17) {
        this.hcDecodePicEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicIO(int i17) {
        this.hcDecodePicIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicThr(boolean z17) {
        this.hcDecodePicThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcDecodePicTimeout(int i17) {
        this.hcDecodePicTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnable(boolean z17) {
        com.tencent.mm.hardcoder.HardCoderJNI.setHcEnable(z17);
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoAction(long j17) {
        this.hcEncodeVideoAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoCPU(int i17) {
        this.hcEncodeVideoCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoDelay(int i17) {
        this.hcEncodeVideoDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoEnable(boolean z17) {
        this.hcEncodeVideoEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoIO(int i17) {
        this.hcEncodeVideoIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoThr(boolean z17) {
        this.hcEncodeVideoThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEncodeVideoTimeout(int i17) {
        this.hcEncodeVideoTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEndTimeHour(int i17) {
        this.hcEndTimeHour = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEndTimeMin(int i17) {
        this.hcEndTimeMin = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingAction(long j17) {
        this.hcEnterChattingAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingCPU(int i17) {
        this.hcEnterChattingCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingDelay(int i17) {
        this.hcEnterChattingDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingEnable(boolean z17) {
        this.hcEnterChattingEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingIO(int i17) {
        this.hcEnterChattingIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingThr(boolean z17) {
        this.hcEnterChattingThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcEnterChattingTimeout(int i17) {
        this.hcEnterChattingTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifAction(long j17) {
        this.hcGifAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifCPU(int i17) {
        this.hcGifCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifDelay(int i17) {
        this.hcGifDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifEnable(boolean z17) {
        this.hcGifEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameAction(long j17) {
        this.hcGifFrameAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameCPU(int i17) {
        this.hcGifFrameCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameDelay(int i17) {
        this.hcGifFrameDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameEnable(boolean z17) {
        this.hcGifFrameEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameIO(int i17) {
        this.hcGifFrameIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameThr(boolean z17) {
        this.hcGifFrameThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifFrameTimeout(int i17) {
        this.hcGifFrameTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifIO(int i17) {
        this.hcGifIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifThr(boolean z17) {
        this.hcGifThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcGifTimeout(int i17) {
        this.hcGifTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcKVFtReport(boolean z17) {
        this.hcKVFtReport = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcKVPerReport(boolean z17) {
        this.hcKVPerReport = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollAction(long j17) {
        this.hcMediaGalleryScrollAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollCPU(int i17) {
        this.hcMediaGalleryScrollCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollDelay(int i17) {
        this.hcMediaGalleryScrollDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollEnable(boolean z17) {
        this.hcMediaGalleryScrollEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollIO(int i17) {
        this.hcMediaGalleryScrollIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollThr(boolean z17) {
        this.hcMediaGalleryScrollThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMediaGalleryScrollTimeout(int i17) {
        this.hcMediaGalleryScrollTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchAction(long j17) {
        this.hcMiniProgramLaunchAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchCPU(int i17) {
        this.hcMiniProgramLaunchCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchDelay(int i17) {
        this.hcMiniProgramLaunchDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchEnable(boolean z17) {
        this.hcMiniProgramLaunchEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchIO(int i17) {
        this.hcMiniProgramLaunchIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchThr(boolean z17) {
        this.hcMiniProgramLaunchThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcMiniProgramLaunchTimeout(int i17) {
        this.hcMiniProgramLaunchTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingAction(long j17) {
        this.hcQuitChattingAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingCPU(int i17) {
        this.hcQuitChattingCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingDelay(int i17) {
        this.hcQuitChattingDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingEnable(boolean z17) {
        this.hcQuitChattingEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingIO(int i17) {
        this.hcQuitChattingIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingThr(boolean z17) {
        this.hcQuitChattingThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcQuitChattingTimeout(int i17) {
        this.hcQuitChattingTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgAction(long j17) {
        this.hcReceiveMsgAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgCPU(int i17) {
        this.hcReceiveMsgCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgDelay(int i17) {
        this.hcReceiveMsgDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgEnable(boolean z17) {
        this.hcReceiveMsgEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgIO(int i17) {
        this.hcReceiveMsgIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgThr(boolean z17) {
        this.hcReceiveMsgThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcReceiveMsgTimeout(int i17) {
        this.hcReceiveMsgTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcRetryInterval(int i17) {
        this.hcRetryInterval = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollAction(long j17) {
        this.hcSNSMsgScrollAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollCPU(int i17) {
        this.hcSNSMsgScrollCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollDelay(int i17) {
        this.hcSNSMsgScrollDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollEnable(boolean z17) {
        this.hcSNSMsgScrollEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollIO(int i17) {
        this.hcSNSMsgScrollIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollThr(boolean z17) {
        this.hcSNSMsgScrollThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSMsgScrollTimeout(int i17) {
        this.hcSNSMsgScrollTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollAction(long j17) {
        this.hcSNSScrollAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollCPU(int i17) {
        this.hcSNSScrollCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollDelay(int i17) {
        this.hcSNSScrollDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollEnable(boolean z17) {
        this.hcSNSScrollEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollIO(int i17) {
        this.hcSNSScrollIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollThr(boolean z17) {
        this.hcSNSScrollThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSScrollTimeout(int i17) {
        this.hcSNSScrollTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollAction(long j17) {
        this.hcSNSUserScrollAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollCPU(int i17) {
        this.hcSNSUserScrollCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollDelay(int i17) {
        this.hcSNSUserScrollDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollEnable(boolean z17) {
        this.hcSNSUserScrollEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollIO(int i17) {
        this.hcSNSUserScrollIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollThr(boolean z17) {
        this.hcSNSUserScrollThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSNSUserScrollTimeout(int i17) {
        this.hcSNSUserScrollTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgAction(long j17) {
        this.hcSendMsgAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgCPU(int i17) {
        this.hcSendMsgCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgDelay(int i17) {
        this.hcSendMsgDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgEnable(boolean z17) {
        this.hcSendMsgEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgIO(int i17) {
        this.hcSendMsgIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgThr(boolean z17) {
        this.hcSendMsgThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendMsgTimeout(int i17) {
        this.hcSendMsgTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgAction(long j17) {
        this.hcSendPicMsgAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgCPU(int i17) {
        this.hcSendPicMsgCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgDelay(int i17) {
        this.hcSendPicMsgDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgEnable(boolean z17) {
        this.hcSendPicMsgEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgIO(int i17) {
        this.hcSendPicMsgIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgThr(boolean z17) {
        this.hcSendPicMsgThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcSendPicMsgTimeout(int i17) {
        this.hcSendPicMsgTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcTimeLimit(boolean z17) {
        this.hcTimeLimit = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcTimeoutMargin(int i17) {
        this.hcTimeoutMargin = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUinHash(int i17) {
        this.hcUinHash = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomAction(long j17) {
        this.hcUpdateChatroomAction = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomCPU(int i17) {
        this.hcUpdateChatroomCPU = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomDelay(int i17) {
        this.hcUpdateChatroomDelay = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomEnable(boolean z17) {
        this.hcUpdateChatroomEnable = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomIO(int i17) {
        this.hcUpdateChatroomIO = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomMemberCount(long j17) {
        this.hcUpdateChatroomMemberCount = j17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomThr(boolean z17) {
        this.hcUpdateChatroomThr = z17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setHcUpdateChatroomTimeout(int i17) {
        this.hcUpdateChatroomTimeout = i17;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public void setRetryConnectInterval(int i17) {
        com.tencent.mm.hardcoder.HardCoderJNI.setRetryConnectInterval(i17);
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int startPerformance(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29, long j17, java.lang.String str) {
        java.lang.Integer num;
        boolean z18;
        if (!z17) {
            return -3;
        }
        if (!this.hcBgEnable) {
            boolean[] zArr = wj0.i.f446561d;
            synchronized (zArr) {
                z18 = zArr[0];
            }
            if (!z18) {
                return -4;
            }
        }
        return com.tencent.mm.hardcoder.HardCoderJNI.startPerformance(i17, i18, i19, i27, i28 + this.hcTimeoutMargin, (!this.needMapAPPScene || (num = this.APP_SCENE_ID_MAP.get(java.lang.Integer.valueOf(i29))) == null) ? i29 : num.intValue(), j17, android.os.Process.myTid(), str);
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public int stopPerformance(boolean z17, int i17) {
        if (z17) {
            return com.tencent.mm.hardcoder.HardCoderJNI.stopPerformance(i17);
        }
        return -3;
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long terminateApp(int i17, long j17) {
        return com.tencent.mm.hardcoder.HardCoderJNI.terminateApp(i17, j17);
    }

    @Override // com.tencent.mm.hardcoder.WXHardCoderJNI
    public long getParameters(int i17, com.tencent.mm.hardcoder.a aVar, org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject.toString();
        this.getParametersCallback = aVar;
        long parameters = com.tencent.mm.hardcoder.HardCoderJNI.getParameters(jSONObject2.getBytes(), android.os.Process.myTid(), android.os.SystemClock.elapsedRealtimeNanos());
        com.tencent.mm.hardcoder.HardCoderJNI.putFuncRetHashMap(parameters, this.funcRet);
        com.tencent.mars.xlog.Log.i(TAG, "getParameters type:" + i17 + ", len: " + jSONObject2.length());
        try {
            java.lang.Thread.sleep(20L);
        } catch (java.lang.InterruptedException unused) {
        }
        return parameters;
    }
}
