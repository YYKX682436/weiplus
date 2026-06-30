package com.p314xaae8f345.mm.p788xd6f12a1a;

@j95.b(m140513x1e06fd29 = {a25.v.class})
/* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImpl */
/* loaded from: classes15.dex */
public class C10733x5980910c extends i95.w implements com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc {

    /* renamed from: MANUFACTURER_STRING */
    private static java.lang.String f29074x3c3e883f = "OPPO|vivo|Xiaomi|meizu|Meizu|samsung|Meitu|HMD Global|Hisense|asus|Lenovo|HUAWEI|GREE|TOSOT";

    /* renamed from: MODEL_STRING */
    private static java.lang.String f29075x27a78207 = "OPPO A57|OPPO R11t|PRO 7 Plus|M15|15 Lite|15 Plus|MP16|MP17|SM-N9600|SM-N9608|MI 8|Nokia X7|Nokia X6|HLTE311T|HLTE213T";
    private static final java.lang.String TAG = "MicroMsg.WXHardCoderJNI";

    /* renamed from: sHCREPORT */
    private static final boolean f29076x3a334762 = false;

    /* renamed from: getParametersCallback */
    private com.p314xaae8f345.mm.p788xd6f12a1a.a f29081xff871e45;

    /* renamed from: systemEventCallback */
    private com.p314xaae8f345.mm.p788xd6f12a1a.q f29235x1179bf10;

    /* renamed from: hardCoderReporterInfo */
    private com.p314xaae8f345.mm.p788xd6f12a1a.r f29082xe4dfcc49 = null;

    /* renamed from: needMapAPPScene */
    private boolean f29233x7fcf51f1 = false;

    /* renamed from: SCENE_ID_MAP */
    private final java.util.Map<java.lang.Integer, java.lang.Integer> f29078x9cb6274b = new java.util.HashMap();

    /* renamed from: APP_SCENE_ID_MAP */
    private final java.util.Map<java.lang.Integer, java.lang.Integer> f29077xf3f1cc9 = new java.util.HashMap();

    /* renamed from: flagKeyMap */
    private final java.util.HashMap<java.lang.Long, java.lang.String> f29079xcd8a909 = new java.util.HashMap<>();

    /* renamed from: hcBootEnable */
    private boolean f29103x7826fa70 = true;

    /* renamed from: hcBootDelay */
    private int f29102xf34a12f6 = 0;

    /* renamed from: hcBootCPU */
    private int f29101xcef897db = 1;

    /* renamed from: hcBootIO */
    private int f29104x1f736073 = 0;

    /* renamed from: hcBootThr */
    private boolean f29105xcef8dab1 = false;

    /* renamed from: hcBootTimeout */
    private int f29106x9e581614 = 5000;

    /* renamed from: hcBootAction */
    private long f29100x70c15323 = 4;

    /* renamed from: hcEnterChattingEnable */
    private boolean f29136x737ca366 = true;

    /* renamed from: hcEnterChattingDelay */
    private int f29135x66c07340 = 0;

    /* renamed from: hcEnterChattingCPU */
    private int f29134x7c3e82a5 = 1;

    /* renamed from: hcEnterChattingIO */
    private int f29137xfbbff469 = 1;

    /* renamed from: hcEnterChattingThr */
    private boolean f29138x7c3ec57b = false;

    /* renamed from: hcEnterChattingTimeout */
    private int f29139xdb78bde = 1000;

    /* renamed from: hcEnterChattingAction */
    private long f29133x6c16fc19 = 12294;

    /* renamed from: hcQuitChattingEnable */
    private boolean f29173x3b9b17f3 = true;

    /* renamed from: hcQuitChattingDelay */
    private int f29172x43eab913 = 0;

    /* renamed from: hcQuitChattingCPU */
    private int f29171x20d62138 = 2;

    /* renamed from: hcQuitChattingIO */
    private int f29174xc740b776 = 2;

    /* renamed from: hcQuitChattingThr */
    private boolean f29175x20d6640e = false;

    /* renamed from: hcQuitChattingTimeout */
    private int f29176x4967a8f1 = 800;

    /* renamed from: hcQuitChattingAction */
    private long f29170x343570a6 = 8194;

    /* renamed from: hcSendMsgEnable */
    private boolean f29209xa5c6f081 = true;

    /* renamed from: hcSendMsgDelay */
    private int f29208xd3ba96c5 = 0;

    /* renamed from: hcSendMsgCPU */
    private int f29207x3e05c36a = 3;

    /* renamed from: hcSendMsgIO */
    private int f29210x6d5b0704 = 0;

    /* renamed from: hcSendMsgThr */
    private boolean f29211x3e060640 = true;

    /* renamed from: hcSendMsgTimeout */
    private int f29212x24b6e223 = 1000;

    /* renamed from: hcSendMsgAction */
    private long f29206x9e614934 = 12288;

    /* renamed from: hcSendPicMsgEnable */
    private boolean f29216xd45bf0bd = true;

    /* renamed from: hcSendPicMsgDelay */
    private int f29215x82a69f09 = 0;

    /* renamed from: hcSendPicMsgCPU */
    private int f29214x8e1f0cae = 1;

    /* renamed from: hcSendPicMsgIO */
    private int f29217xf4118540 = 2;

    /* renamed from: hcSendPicMsgThr */
    private boolean f29218x8e1f4f84 = true;

    /* renamed from: hcSendPicMsgTimeout */
    private int f29219xc8c1e967 = 500;

    /* renamed from: hcSendPicMsgAction */
    private long f29213xccf64970 = 123072;

    /* renamed from: hcReceiveMsgEnable */
    private boolean f29180x654e8bdc = true;

    /* renamed from: hcReceiveMsgDelay */
    private int f29179xb74a40a = 500;

    /* renamed from: hcReceiveMsgCPU */
    private int f29178x58fc5def = 2;

    /* renamed from: hcReceiveMsgIO */
    private int f29181xd99487df = 2;

    /* renamed from: hcReceiveMsgThr */
    private boolean f29182x58fca0c5 = true;

    /* renamed from: hcReceiveMsgTimeout */
    private int f29183x5622b228 = 1000;

    /* renamed from: hcReceiveMsgAction */
    private long f29177x5de8e48f = 127040;

    /* renamed from: hcUpdateChatroomEnable */
    private boolean f29226xeeffee5a = true;

    /* renamed from: hcUpdateChatroomDelay */
    private int f29225x30edf9cc = 0;

    /* renamed from: hcUpdateChatroomCPU */
    private int f29224x9cf43c31 = 2;

    /* renamed from: hcUpdateChatroomIO */
    private int f29227x5fe6d95d = 2;

    /* renamed from: hcUpdateChatroomThr */
    private boolean f29229x9cf47f07 = true;

    /* renamed from: hcUpdateChatroomTimeout */
    private int f29230x29d9f6a = 1000;

    /* renamed from: hcUpdateChatroomAction */
    private long f29223xe79a470d = 127040;

    /* renamed from: hcUpdateChatroomMemberCount */
    private long f29228xfee68c1e = 50;

    /* renamed from: hcDBEnable */
    private boolean f29112x4b72259c = false;

    /* renamed from: hcDBDelayQuery */
    private int f29110x80cf349e = 100;

    /* renamed from: hcDBDelayWrite */
    private int f29111x812273b5 = 200;

    /* renamed from: hcDBCPU */
    private int f29109x2a551c2f = 2;

    /* renamed from: hcDBIO */
    private int f29113xb70b019f = 2;

    /* renamed from: hcDBThr */
    private boolean f29114x2a555f05 = false;

    /* renamed from: hcDBTimeout */
    private int f29115x34725068 = 500;

    /* renamed from: hcDBTimeoutBusy */
    private int f29116x18a3a281 = 5000;

    /* renamed from: hcDBActionQuery */
    private long f29107xf18d43b9 = 4096;

    /* renamed from: hcDBActionWrite */
    private long f29108xf1e082d0 = 12288;

    /* renamed from: hcEncodeVideoEnable */
    private boolean f29127xa8b4e62d = true;

    /* renamed from: hcEncodeVideoDelay */
    private int f29126xda13b99 = 0;

    /* renamed from: hcEncodeVideoCPU */
    private int f29125x7d378d3e = 1;

    /* renamed from: hcEncodeVideoIO */
    private int f29128x569eb2b0 = 1;

    /* renamed from: hcEncodeVideoThr */
    private boolean f29129x7d37d014 = false;

    /* renamed from: hcEncodeVideoTimeout */
    private int f29130x7f87a1f7 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;

    /* renamed from: hcEncodeVideoAction */
    private long f29124xa14f3ee0 = 81984;

    /* renamed from: hcDecodePicEnable */
    private boolean f29120xf9f682e4 = false;

    /* renamed from: hcDecodePicDelay */
    private int f29119xc5edac02 = 100;

    /* renamed from: hcDecodePicCPU */
    private int f29118x8b8703e7 = 2;

    /* renamed from: hcDecodePicIO */
    private int f29121x88a142e7 = 2;

    /* renamed from: hcDecodePicThr */
    private boolean f29122x8b8746bd = false;

    /* renamed from: hcDecodePicTimeout */
    private int f29123x56799c20 = 500;

    /* renamed from: hcDecodePicAction */
    private long f29117xf290db97 = 16448;

    /* renamed from: hcGifEnable */
    private boolean f29143x3f5b3bac = true;

    /* renamed from: hcGifDelay */
    private int f29142xc82aba3a = 0;

    /* renamed from: hcGifCPU */
    private int f29141x27a2401f = 3;

    /* renamed from: hcGifIO */
    private int f29151x2a919faf = 2;

    /* renamed from: hcGifThr */
    private boolean f29152x27a282f5 = false;

    /* renamed from: hcGifTimeout */
    private int f29153xbdabfc58 = 500;

    /* renamed from: hcGifAction */
    private long f29140x37f5945f = 81984;

    /* renamed from: hcGifFrameEnable */
    private boolean f29147x2eff90c7 = true;

    /* renamed from: hcGifFrameDelay */
    private int f29146xe069d5bf = 0;

    /* renamed from: hcGifFrameCPU */
    private int f29145x118c78e4 = 2;

    /* renamed from: hcGifFrameIO */
    private int f29148xe7caba4a = 0;

    /* renamed from: hcGifFrameThr */
    private boolean f29149x118cbbba = false;

    /* renamed from: hcGifFrameTimeout */
    private int f29150xc2924a9d = 1000;

    /* renamed from: hcGifFrameAction */
    private long f29144x2799e97a = 65600;

    /* renamed from: hcSNSScrollEnable */
    private boolean f29195xe2139cd = true;

    /* renamed from: hcSNSScrollDelay */
    private int f29194xa58bf3f9 = 0;

    /* renamed from: hcSNSScrollCPU */
    private int f29193x9f34dd9e = 2;

    /* renamed from: hcSNSScrollIO */
    private int f29196x9185d650 = 2;

    /* renamed from: hcSNSScrollThr */
    private boolean f29197x9f352074 = false;

    /* renamed from: hcSNSScrollTimeout */
    private int f29198xc7a5c257 = 1500;

    /* renamed from: hcSNSScrollAction */
    private long f29192x6bb9280 = 96;

    /* renamed from: hcSNSUserScrollEnable */
    private boolean f29202xc6da4ab8 = true;

    /* renamed from: hcSNSUserScrollDelay */
    private int f29201xc44799ae = 0;

    /* renamed from: hcSNSUserScrollCPU */
    private int f29200x88986c93 = 3;

    /* renamed from: hcSNSUserScrollIO */
    private int f29203xcaa14bb = 2;

    /* renamed from: hcSNSUserScrollThr */
    private boolean f29204x8898af69 = false;

    /* renamed from: hcSNSUserScrollTimeout */
    private int f29205x260ececc = 1500;

    /* renamed from: hcSNSUserScrollAction */
    private long f29199xbf74a36b = 96;

    /* renamed from: hcSNSMsgScrollEnable */
    private boolean f29188x4dd82c94 = true;

    /* renamed from: hcSNSMsgScrollDelay */
    private int f29187x9f580c52 = 0;

    /* renamed from: hcSNSMsgScrollCPU */
    private int f29186x55ad3837 = 3;

    /* renamed from: hcSNSMsgScrollIO */
    private int f29189xe1bb4497 = 2;

    /* renamed from: hcSNSMsgScrollThr */
    private boolean f29190x55ad7b0d = false;

    /* renamed from: hcSNSMsgScrollTimeout */
    private int f29191x7ecd2870 = 1500;

    /* renamed from: hcSNSMsgScrollAction */
    private long f29185x46728547 = 96;

    /* renamed from: hcMediaGalleryScrollEnable */
    private boolean f29159xaccee0b9 = true;

    /* renamed from: hcMediaGalleryScrollDelay */
    private int f29158x6057bf8d = 0;

    /* renamed from: hcMediaGalleryScrollCPU */
    private int f29157xbfe67e32 = 3;

    /* renamed from: hcMediaGalleryScrollIO */
    private int f29160x9293d33c = 2;

    /* renamed from: hcMediaGalleryScrollThr */
    private boolean f29161xbfe6c108 = false;

    /* renamed from: hcMediaGalleryScrollTimeout */
    private int f29162xfeacf8eb = 1500;

    /* renamed from: hcMediaGalleryScrollAction */
    private long f29156xa569396c = 96;

    /* renamed from: hcAlbumScrollEnable */
    private boolean f29086x29f6f704 = true;

    /* renamed from: hcAlbumScrollDelay */
    private int f29085xd7fe33e2 = 0;

    /* renamed from: hcAlbumScrollCPU */
    private int f29084xedd803c7 = 3;

    /* renamed from: hcAlbumScrollIO */
    private int f29087x5a40c707 = 2;

    /* renamed from: hcAlbumScrollThr */
    private boolean f29088xedd8469d = false;

    /* renamed from: hcAlbumScrollTimeout */
    private int f29089x2687ac00 = 1500;

    /* renamed from: hcAlbumScrollAction */
    private long f29083x22914fb7 = 96;

    /* renamed from: hcMiniProgramLaunchEnable */
    private boolean f29166xf5218e68 = true;

    /* renamed from: hcMiniProgramLaunchDelay */
    private int f29165x73311ffe = 500;

    /* renamed from: hcMiniProgramLaunchCPU */
    private int f29164xa9cf46e3 = 1;

    /* renamed from: hcMiniProgramLaunchIO */
    private int f29167x3706b06b = 1;

    /* renamed from: hcMiniProgramLaunchThr */
    private boolean f29168xa9cf89b9 = false;

    /* renamed from: hcMiniProgramLaunchTimeout */
    private int f29169xc0b0011c = 5000;

    /* renamed from: hcMiniProgramLaunchAction */
    private long f29163xedbbe71b = 114688;

    /* renamed from: hcBizEnable */
    private boolean f29096x7c01b1bb = true;

    /* renamed from: hcBizDelay */
    private int f29095xe2e5c64b = 0;

    /* renamed from: hcBizCPU */
    private int f29094x1f231c70 = 1;

    /* renamed from: hcBizIO */
    private int f29097x2a4b753e = 1;

    /* renamed from: hcBizThr */
    private boolean f29098x1f235f46 = false;

    /* renamed from: hcBizTimeout */
    private int f29099x15d44829 = 5000;

    /* renamed from: hcBizAction */
    private long f29093x749c0a6e = 114690;

    /* renamed from: hcBgEnable */
    private boolean f29092x20f65c43 = true;

    /* renamed from: hcRetryInterval */
    private int f29184xc37e9652 = 30;

    /* renamed from: hcUinHash */
    private int f29222xb1b0470d = 0;

    /* renamed from: hcTimeoutMargin */
    private int f29221x4ff6c534 = 0;

    /* renamed from: hcKVPerReport */
    private boolean f29155xaffab = false;

    /* renamed from: hcKVFtReport */
    private boolean f29154x6b41d68 = false;

    /* renamed from: hcTimeLimit */
    private boolean f29220x6de03e33 = false;

    /* renamed from: hcBeginTimeHour */
    private int f29090xb85404df = 8;

    /* renamed from: hcBeginTimeMin */
    private int f29091x8a134bf7 = 0;

    /* renamed from: hcEndTimeHour */
    private int f29131x6adeb051 = 23;

    /* renamed from: hcEndTimeMin */
    private int f29132xeaac6a45 = 0;

    /* renamed from: mSystemPropertiesClazz */
    private volatile java.lang.Class<?> f29232x95e9fc49 = null;

    /* renamed from: mGetStringPropsMethod */
    private java.lang.reflect.Method f29231xc3e838f7 = null;

    /* renamed from: wxHardCoderLog */
    private com.p314xaae8f345.mm.p788xd6f12a1a.m f29236xe3bd106b = new com.p314xaae8f345.mm.p788xd6f12a1a.m() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.2
        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.m
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.m
        public void e(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        }

        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.m
        public void i(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        }

        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.m
        /* renamed from: printErrStackTrace */
        public void mo46149x58ef3d35(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, str2, objArr);
        }
    };

    /* renamed from: sceneReportCallback */
    private com.p314xaae8f345.mm.p788xd6f12a1a.l f29234xec226545 = new com.p314xaae8f345.mm.p788xd6f12a1a.l() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.4
        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.l
        /* renamed from: sceneReport */
        public void mo46150xed6ac0e0(int i17, long j17) {
            java.lang.Integer num;
            if (com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29233x7fcf51f1 || (num = (java.lang.Integer) com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29078x9cb6274b.get(java.lang.Integer.valueOf(i17))) == null) {
                return;
            }
            com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.u(num.intValue(), j17));
        }
    };

    /* renamed from: funcRet */
    private com.p314xaae8f345.mm.p788xd6f12a1a.j f29080xe19ef73d = new com.p314xaae8f345.mm.p788xd6f12a1a.j() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.5
        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.j
        /* renamed from: onFuncRet */
        public void mo46151x3144f85e(int i17, long j17, int i18, int i19, int i27, byte[] bArr) {
            org.json.JSONObject jSONObject;
            org.json.JSONException e17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "FuncRetCallback callbackType:" + i17 + ", requestId:" + j17 + ", retCode:" + i18 + ", funcId:" + i19 + ", dataType:" + i27);
            if (i17 == 2) {
                int i28 = 0;
                if (i19 == 1015) {
                    if (com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29235x1179bf10 != null) {
                        try {
                            int optInt = new org.json.JSONObject(new java.lang.String(bArr)).optInt("system_event_code", 0);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "onData SYSTEM_EVENT_CODE: " + optInt);
                            com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29235x1179bf10.mo46147xaf8c47fb(optInt);
                            return;
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "onData parse system event e:" + e18.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (i19 == 1019 && com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29081xff871e45 != null) {
                    try {
                        jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
                        try {
                            i28 = jSONObject.getInt("getparameterstype");
                        } catch (org.json.JSONException e19) {
                            e17 = e19;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "onData parse get parameters e:" + e17.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i28);
                            com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29081xff871e45.mo46148x3ca75e41(i28, jSONObject);
                        }
                    } catch (org.json.JSONException e27) {
                        jSONObject = null;
                        e17 = e27;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i28);
                    com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.f29081xff871e45.mo46148x3ca75e41(i28, jSONObject);
                }
            }
        }
    };

    /* renamed from: booleanChanged */
    private boolean m46135xc926116c(android.content.SharedPreferences sharedPreferences, java.lang.String str, boolean z17) {
        return sharedPreferences.getBoolean(str, z17) != z17;
    }

    /* renamed from: checkHardCoderEnv */
    private boolean m46136x6a45c9bb() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkHardCoderEnv manufacture[%s], model[%s], remote[%s]", android.os.Build.MANUFACTURER, wo.w0.m(), mo45970xcc0e980a(false));
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2);
    }

    /* renamed from: initSceneAndFlagMap */
    private void m46137x4348daf5() {
        this.f29078x9cb6274b.clear();
        this.f29077xf3f1cc9.clear();
        this.f29078x9cb6274b.put(101, 1);
        this.f29078x9cb6274b.put(201, 2);
        this.f29078x9cb6274b.put(202, 3);
        this.f29078x9cb6274b.put(203, 4);
        this.f29078x9cb6274b.put(301, 5);
        this.f29078x9cb6274b.put(302, 6);
        this.f29078x9cb6274b.put(401, 7);
        this.f29078x9cb6274b.put(501, 8);
        this.f29078x9cb6274b.put(601, 9);
        this.f29078x9cb6274b.put(602, 10);
        this.f29078x9cb6274b.put(603, 11);
        this.f29078x9cb6274b.put(701, 12);
        this.f29078x9cb6274b.put(702, 13);
        this.f29078x9cb6274b.put(703, 14);
        this.f29078x9cb6274b.put(704, 15);
        this.f29078x9cb6274b.put(705, 16);
        this.f29078x9cb6274b.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de), 17);
        this.f29078x9cb6274b.put(901, 18);
        this.f29078x9cb6274b.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de), 19);
        this.f29078x9cb6274b.put(java.lang.Integer.valueOf(oc1.f.f73032x366c91de), 20);
        this.f29078x9cb6274b.put(706, 21);
        this.f29078x9cb6274b.put(707, 22);
        this.f29077xf3f1cc9.put(101, 1);
        this.f29077xf3f1cc9.put(201, 6);
        this.f29077xf3f1cc9.put(202, 6);
        this.f29077xf3f1cc9.put(203, 5);
        this.f29077xf3f1cc9.put(301, 2);
        this.f29077xf3f1cc9.put(302, 2);
        this.f29077xf3f1cc9.put(401, 6);
        this.f29077xf3f1cc9.put(501, 4);
        this.f29077xf3f1cc9.put(601, 5);
        this.f29077xf3f1cc9.put(602, 5);
        this.f29077xf3f1cc9.put(603, 5);
        this.f29077xf3f1cc9.put(701, 3);
        this.f29077xf3f1cc9.put(702, 3);
        this.f29077xf3f1cc9.put(703, 3);
        this.f29077xf3f1cc9.put(704, 3);
        this.f29077xf3f1cc9.put(705, 3);
        this.f29077xf3f1cc9.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.r0.f34827x366c91de), 1);
        this.f29077xf3f1cc9.put(901, 2);
        this.f29077xf3f1cc9.put(java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.f34420x366c91de), 2);
        this.f29077xf3f1cc9.put(java.lang.Integer.valueOf(oc1.f.f73032x366c91de), 3);
        this.f29077xf3f1cc9.put(706, 2);
        this.f29077xf3f1cc9.put(707, 7);
        this.f29079xcd8a909.put(2L, "KEY_HC_BOOT_ENABLE");
        this.f29079xcd8a909.put(4L, "KEY_HC_RECEIVE_MSG_ENABLE");
        this.f29079xcd8a909.put(8L, "KEY_HC_SEND_MSG_ENABLE");
        this.f29079xcd8a909.put(16L, "KEY_HC_SEND_PIC_MSG_ENABLE");
        this.f29079xcd8a909.put(32L, "KEY_HC_ENTER_CHATTING_ENABLE");
        this.f29079xcd8a909.put(64L, "KEY_HC_QUIT_CHATTING_ENABLE");
        this.f29079xcd8a909.put(128L, "KEY_HC_UPDATE_CHATROOM_ENABLE");
        this.f29079xcd8a909.put(256L, "KEY_HC_DB_ENABLE");
        this.f29079xcd8a909.put(512L, "KEY_HC_DECODE_PIC_ENABLE");
        this.f29079xcd8a909.put(1024L, "KEY_HC_GIF_ENABLE");
        this.f29079xcd8a909.put(2048L, "KEY_HC_GIF_FRAME_ENABLE");
        this.f29079xcd8a909.put(4096L, "KEY_HC_ENCODE_VIDEO_ENABLE");
        this.f29079xcd8a909.put(8192L, "KEY_HC_SNS_SCROLL_ENABLE");
        this.f29079xcd8a909.put(16384L, "KEY_HCALBUM_SCROLL_ENABLE");
        this.f29079xcd8a909.put(32768L, "KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE");
        this.f29079xcd8a909.put(65536L, "KEY_HC_SNS_USER_SCROLL_ENABLE");
        this.f29079xcd8a909.put(131072L, "KEY_HC_SNS_MSG_SCROLL_ENABLE");
        this.f29079xcd8a909.put(262144L, "KEY_HC_MINI_PROGRAM_LAUNCH_ENABLE");
    }

    /* renamed from: intChanged */
    private boolean m46138x88d367c5(android.content.SharedPreferences sharedPreferences, java.lang.String str, int i17) {
        return sharedPreferences.getInt(str, i17) != i17;
    }

    /* renamed from: longChanged */
    private boolean m46139xcc983098(android.content.SharedPreferences sharedPreferences, java.lang.String str, long j17) {
        return sharedPreferences.getLong(str, j17) != j17;
    }

    /* renamed from: reloadHardcoderConfig */
    private void m46140x2bf3cf23() {
        android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("hardcoder_setting", 0).edit();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_enable", "1", false, true), mo45814x17ac4879() ? 1 : 0) > 0;
        boolean z18 = z17 && !mo45814x17ac4879();
        edit.putBoolean("KEY_HC_ENABLE", z17);
        edit.putBoolean("KEY_HC_BG_ENABLE", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_bgenable", "1", false, true), this.f29092x20f65c43 ? 1 : 0) > 0);
        edit.putBoolean("KEY_HC_DEBUG", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_debug", "1", false, true), mo45813x744e3c9d() ? 1 : 0) > 0);
        edit.putInt("KEY_HC_KV_PER", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_kvper", "50", false, true), this.f29222xb1b0470d));
        edit.putInt("KEY_HC_KV_FT", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_kvft", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62846x68d3fef, false, true), this.f29222xb1b0470d));
        gm0.j1.i();
        int b17 = kk.m.b(gm0.j1.b().h(), 100);
        edit.putInt("KEY_HC_UIN_HASH", b17);
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(j62.e.g().a("clicfg_scene", "523518", false, true), -1L);
        for (java.util.Map.Entry<java.lang.Long, java.lang.String> entry : this.f29079xcd8a909.entrySet()) {
            edit.putBoolean(entry.getValue(), (entry.getKey().longValue() & V) != 0);
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_margin", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62846x68d3fef, false, true), this.f29221x4ff6c534);
        edit.putInt("KEY_HC_TIMEOUT_MARGIN", P);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_retryitv", "300", false, true), this.f29184xc37e9652);
        edit.putInt("KEY_HC_RETRY_INTERVAL", P2);
        java.lang.String a17 = j62.e.g().a("clicfg_model", f29075x27a78207, false, true);
        java.lang.String str = f29075x27a78207;
        if (a17 == null) {
            a17 = str;
        }
        java.lang.String m17 = wo.w0.m();
        java.lang.String a18 = j62.e.g().a("clicfg_manufacturer", f29074x3c3e883f, false, true);
        java.lang.String str2 = a18 == null ? f29074x3c3e883f : a18;
        java.lang.String str3 = android.os.Build.MANUFACTURER;
        if (str2.length() > 0 || a17.length() > 0) {
            boolean contains = str2.contains(str3);
            if (!contains) {
                contains = a17.contains(m17);
            }
            mo45975xf0018e90(true, contains ? 10 : 11, 1, true);
            edit.putBoolean("KEY_HC_ENABLE", contains);
            boolean z19 = contains && !mo45814x17ac4879();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "reloadHardcoderConfig check manufacturer[%s] manufacturerlist[%s] model[%s] modellist[%s] enable[%b] init[%b]", str3, str2, m17, a17, java.lang.Boolean.valueOf(contains), java.lang.Boolean.valueOf(z19));
            z18 = z19;
        } else {
            mo45975xf0018e90(true, 12, 1, true);
        }
        edit.apply();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "reloadHardcoderConfig enable[%b] init[%b] bgEnable[%b] debug[%b] uinHash[%d] kv[%b, %b] sceneFlag[%d] margin[%d] retryInterval[%d] model[%s]", java.lang.Boolean.valueOf(mo45814x17ac4879()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f29092x20f65c43), java.lang.Boolean.valueOf(mo45813x744e3c9d()), java.lang.Integer.valueOf(b17), java.lang.Boolean.valueOf(this.f29155xaffab), java.lang.Boolean.valueOf(this.f29154x6b41d68), java.lang.Long.valueOf(V), java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), a17);
    }

    /* renamed from: report */
    private void m46141xc84c5534() {
        jx3.f.INSTANCE.d(21019, java.lang.Boolean.FALSE, 0, 11003, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reportInfo */
    public void m46142x73197402(com.p314xaae8f345.mm.p788xd6f12a1a.s sVar) {
        com.p314xaae8f345.mm.p788xd6f12a1a.r rVar = this.f29082xe4dfcc49;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a) rVar;
            aVar.getClass();
            if (sVar instanceof com.p314xaae8f345.mm.p788xd6f12a1a.u) {
                com.p314xaae8f345.mm.p788xd6f12a1a.u uVar = (com.p314xaae8f345.mm.p788xd6f12a1a.u) sVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", "reportIDKey feature[%b] key[%d], value[%d]", java.lang.Boolean.valueOf(uVar.f149816a), java.lang.Integer.valueOf(uVar.f149817b), java.lang.Integer.valueOf(uVar.f149818c), java.lang.Boolean.valueOf(uVar.f149819d));
                long j17 = uVar.f149816a ? 678L : 679L;
                long j18 = uVar.f149817b;
                long j19 = uVar.f149818c;
                boolean z17 = uVar.f149819d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
                    return;
                } else {
                    if (gm0.j1.b().f354787q) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HardCoderReporterImpl", "idkeyStat accountNotInitialReady!");
                    aVar.f223791c.mo48813x58998cd();
                    aVar.f223790b.add(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(z17)});
                    return;
                }
            }
            if (!(sVar instanceof com.p314xaae8f345.mm.p788xd6f12a1a.t)) {
                if (sVar instanceof com.p314xaae8f345.mm.p788xd6f12a1a.v) {
                    aVar.a(16509, new java.lang.Object[0]);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p788xd6f12a1a.t tVar = (com.p314xaae8f345.mm.p788xd6f12a1a.t) sVar;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e == null) {
                gm0.j1.i();
                com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L);
            }
            if (android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223785d)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223785d = wo.w0.g(false);
            }
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223785d;
            int longValue = (int) com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223786e.longValue();
            boolean mo45968x586d7588 = ((com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc) i95.n0.c(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class)).mo45968x586d7588();
            int mo45969x39e05d35 = ((com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc) i95.n0.c(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class)).mo45969x39e05d35();
            boolean mo45814x17ac4879 = ((com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc) i95.n0.c(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.class)).mo45814x17ac4879();
            if (tVar.f149813c == 1) {
                long j27 = (tVar.f149814d * 100) / tVar.f149815e;
                aVar.a(15187, str, java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(mo45968x586d7588 ? 1 : 0), java.lang.Integer.valueOf(mo45969x39e05d35), java.lang.Integer.valueOf(tVar.f149811a), java.lang.Long.valueOf(tVar.f149812b), java.lang.Integer.valueOf(tVar.f149813c), java.lang.Long.valueOf(tVar.f149814d), java.lang.Long.valueOf(tVar.f149815e), java.lang.Long.valueOf(j27), java.lang.Integer.valueOf(mo45814x17ac4879 ? 1 : 0));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HardCoderReporterImpl", java.lang.String.format("fpsReport imei:%s enable:%s, heavy:%s speedUp:%s, engineStatus:%s, scene:%s, action:%s, type:%s, totalDroppedFrames:%s, interval:%s, average:%s", str, java.lang.Integer.valueOf(mo45814x17ac4879 ? 1 : 0), java.lang.Integer.valueOf(longValue), java.lang.Integer.valueOf(mo45968x586d7588 ? 1 : 0), java.lang.Integer.valueOf(mo45969x39e05d35), java.lang.Integer.valueOf(tVar.f149811a), java.lang.Long.valueOf(tVar.f149812b), java.lang.Integer.valueOf(tVar.f149813c), java.lang.Long.valueOf(tVar.f149814d), java.lang.Long.valueOf(tVar.f149815e), java.lang.Long.valueOf(j27)));
            }
        }
    }

    /* renamed from: reportModifiedConfig */
    private void m46143x1f9b6dbf() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("hardcoder_setting", 0);
            if ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((m46138x88d367c5(sharedPreferences, "KEY_HC_BEGIN_TIME_HOUR", 8)) || m46138x88d367c5(sharedPreferences, "KEY_HC_BEGIN_TIME_MIN", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_END_TIME_HOUR", 23)) || m46138x88d367c5(sharedPreferences, "KEY_HC_END_TIME_MIN", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_BOOT_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_BOOT_CPU", 1)) || m46138x88d367c5(sharedPreferences, "KEY_HC_BOOT_IO", 0)) || m46135xc926116c(sharedPreferences, "KEY_HC_BOOT_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_BOOT_TIMEOUT", 5000)) || m46139xcc983098(sharedPreferences, "KEY_HC_BOOT_ACTION", 4L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENTER_CHATTING_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENTER_CHATTING_CPU", 1)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENTER_CHATTING_IO", 1)) || m46135xc926116c(sharedPreferences, "KEY_HC_ENTER_CHATTING_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENTER_CHATTING_TIMEOUT", 1000)) || m46139xcc983098(sharedPreferences, "KEY_HC_ENTER_CHATTING_ACTION", 12294L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_QUIT_CHATTING_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_QUIT_CHATTING_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_QUIT_CHATTING_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_QUIT_CHATTING_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_QUIT_CHATTING_TIMEOUT", 800)) || m46139xcc983098(sharedPreferences, "KEY_HC_QUIT_CHATTING_ACTION", 8194L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_MSG_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_MSG_CPU", 3)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_MSG_IO", 0)) || m46135xc926116c(sharedPreferences, "KEY_HC_SEND_MSG_THR", true)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_MSG_TIMEOUT", 1000)) || m46139xcc983098(sharedPreferences, "KEY_HC_SEND_MSG_ACTION", 12288L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_PIC_MSG_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_PIC_MSG_CPU", 1)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_PIC_MSG_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_SEND_PIC_MSG_THR", true)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SEND_PIC_MSG_TIMEOUT", 500)) || m46139xcc983098(sharedPreferences, "KEY_HC_SEND_PIC_MSG_ACTION", 123072L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_RECEIVE_MSG_DELEY", 500)) || m46138x88d367c5(sharedPreferences, "KEY_HC_RECEIVE_MSG_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_RECEIVE_MSG_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_RECEIVE_MSG_THR", true)) || m46138x88d367c5(sharedPreferences, "KEY_HC_RECEIVE_MSG_TIMEOUT", 1000)) || m46139xcc983098(sharedPreferences, "KEY_HC_RECEIVE_MSG_ACTION", 127040L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_THR", true)) || m46138x88d367c5(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_TIMEOUT", 1000)) || m46139xcc983098(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_ACTION", 127040L)) || m46139xcc983098(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_MEMBER_COUNT", 50L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DB_DELEY_QUERY", 100)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DB_DELEY_WRITE", 200)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DB_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DB_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_DB_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DB_TIMEOUT", 500)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DB_TIMEOUT_BUSY", 5000)) || m46139xcc983098(sharedPreferences, "KEY_HC_DB_ACTION_QUERY", 4096L)) || m46139xcc983098(sharedPreferences, "KEY_HC_DB_ACTION_WRITE", 12288L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENCODE_VIDEO_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENCODE_VIDEO_CPU", 1)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENCODE_VIDEO_IO", 1)) || m46135xc926116c(sharedPreferences, "KEY_HC_ENCODE_VIDEO_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ENCODE_VIDEO_TIMEOUT", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059)) || m46139xcc983098(sharedPreferences, "KEY_HC_ENCODE_VIDEO_ACTION", 81984L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DECODE_PIC_DELEY", 100)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DECODE_PIC_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DECODE_PIC_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_DECODE_PIC_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_DECODE_PIC_TIMEOUT", 500)) || m46139xcc983098(sharedPreferences, "KEY_HC_DECODE_PIC_ACTION", 16448L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_CPU", 3)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_GIF_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_TIMEOUT", 500)) || m46139xcc983098(sharedPreferences, "KEY_HC_GIF_ACTION", 81984L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_FRAME_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_FRAME_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_FRAME_IO", 0)) || m46135xc926116c(sharedPreferences, "KEY_HC_GIF_FRAME_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_GIF_FRAME_TIMEOUT", 1000)) || m46139xcc983098(sharedPreferences, "KEY_HC_GIF_FRAME_ACTION", 65600L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_SCROLL_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_SCROLL_CPU", 2)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_SCROLL_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_SNS_SCROLL_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_SCROLL_TIMEOUT", 1500)) || m46139xcc983098(sharedPreferences, "KEY_HC_SNS_SCROLL_ACTION", 96L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_CPU", 3)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_TIMEOUT", 1500)) || m46139xcc983098(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_ACTION", 96L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_CPU", 3)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_TIMEOUT", 1500)) || m46139xcc983098(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_ACTION", 96L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_CPU", 3)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_TIMEOUT", 1500)) || m46139xcc983098(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_ACTION", 96L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ALBUM_SCROLL_DELEY", 0)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ALBUM_SCROLL_CPU", 3)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ALBUM_SCROLL_IO", 2)) || m46135xc926116c(sharedPreferences, "KEY_HC_ALBUM_SCROLL_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_ALBUM_SCROLL_TIMEOUT", 1500)) || m46139xcc983098(sharedPreferences, "KEY_HC_ALBUM_SCROLL_ACTION", 96L)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_DELEY", 500)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_CPU", 1)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_IO", 1)) || m46135xc926116c(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_THR", false)) || m46138x88d367c5(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_TIMEOUT", 5000)) || m46139xcc983098(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_ACTION", 114688L)) {
                m46141xc84c5534();
            }
        }
    }

    /* renamed from: requireAccountInitializedOnDemand */
    private void m46144x4edd5dd6() {
        if (gm0.j1.a() && gm0.j1.j()) {
            m134976x2690a4ac();
        }
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getDebug */
    public boolean mo45813x744e3c9d() {
        m46144x4edd5dd6();
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45775x7d6c58e();
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getEnable */
    public boolean mo45814x17ac4879() {
        m46144x4edd5dd6();
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45776xf534dda8();
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHCKVPerReport */
    public boolean mo45815xc7361015() {
        return this.f29155xaffab;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollAction */
    public long mo45816x7ac12c81() {
        m46144x4edd5dd6();
        return this.f29083x22914fb7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollCPU */
    public int mo45817x95b06b3d() {
        m46144x4edd5dd6();
        return this.f29084xedd803c7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollDelay */
    public int mo45818xeb5a95d8() {
        m46144x4edd5dd6();
        return this.f29085xd7fe33e2;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollEnable */
    public boolean mo45819x8226d3ce() {
        m46144x4edd5dd6();
        return this.f29086x29f6f704;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollIO */
    public int mo45820x3ea298d1() {
        m46144x4edd5dd6();
        return this.f29087x5a40c707;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollThr */
    public boolean mo45821x95b0ae13() {
        m46144x4edd5dd6();
        return this.f29088xedd8469d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcAlbumScrollTimeout */
    public int mo45822xd4536876() {
        m46144x4edd5dd6();
        return this.f29089x2687ac00;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBeginTimeHour */
    public int mo45823x9cb5d6a9() {
        m46144x4edd5dd6();
        return this.f29090xb85404df;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBeginTimeMin */
    public int mo45824x78ab18ed() {
        m46144x4edd5dd6();
        return this.f29091x8a134bf7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBgEnable */
    public boolean mo45825xf371439() {
        m46144x4edd5dd6();
        return this.f29092x20f65c43;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizAction */
    public long mo45826x4e725138() {
        m46144x4edd5dd6();
        return this.f29093x749c0a6e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizCPU */
    public int mo45827x9afd59e6() {
        m46144x4edd5dd6();
        return this.f29094x1f231c70;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizDelay */
    public int mo45828xd1267e41() {
        m46144x4edd5dd6();
        return this.f29095xe2e5c64b;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizEnable */
    public boolean mo45829x55d7f885() {
        m46144x4edd5dd6();
        return this.f29096x7c01b1bb;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizIO */
    public int mo45830x6818b108() {
        m46144x4edd5dd6();
        return this.f29097x2a4b753e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizThr */
    public boolean mo45831x9afd9cbc() {
        m46144x4edd5dd6();
        return this.f29098x1f235f46;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBizTimeout */
    public int mo45832x76c6da9f() {
        m46144x4edd5dd6();
        return this.f29099x15d44829;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootAction */
    public long mo45833xd1b3e599() {
        m46144x4edd5dd6();
        return this.f29100x70c15323;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootCPU */
    public int mo45834xce660925() {
        m46144x4edd5dd6();
        return this.f29101xcef897db;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootDelay */
    public int mo45835xcd2059c0() {
        m46144x4edd5dd6();
        return this.f29102xf34a12f6;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootEnable */
    public boolean mo45836xd9198ce6() {
        m46144x4edd5dd6();
        return this.f29103x7826fa70;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootIO */
    public int mo45837x9b4d9de9() {
        m46144x4edd5dd6();
        return this.f29104x1f736073;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootThr */
    public boolean mo45838xce664bfb() {
        m46144x4edd5dd6();
        return this.f29105xcef8dab1;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcBootTimeout */
    public int mo45839x5bb7d25e() {
        m46144x4edd5dd6();
        return this.f29106x9e581614;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBActionQuery */
    public long mo45840xd5ef1583() {
        m46144x4edd5dd6();
        return this.f29107xf18d43b9;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBActionWrite */
    public long mo45841xd642549a() {
        m46144x4edd5dd6();
        return this.f29108xf1e082d0;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBCPU */
    public int mo45842x682257f9() {
        m46144x4edd5dd6();
        return this.f29109x2a551c2f;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBDelayQuery */
    public int mo45843x6f670194() {
        m46144x4edd5dd6();
        return this.f29110x80cf349e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBDelayWrite */
    public int mo45844x6fba40ab() {
        m46144x4edd5dd6();
        return this.f29111x812273b5;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBEnable */
    public boolean mo45845x39b2dd92() {
        m46144x4edd5dd6();
        return this.f29112x4b72259c;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBIO */
    public int mo45846x1c222495() {
        m46144x4edd5dd6();
        return this.f29113xb70b019f;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBThr */
    public boolean mo45847x68229acf() {
        m46144x4edd5dd6();
        return this.f29114x2a555f05;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBTimeout */
    public int mo45848xe489732() {
        m46144x4edd5dd6();
        return this.f29115x34725068;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDBTimeoutBusy */
    public int mo45849xfd05744b() {
        m46144x4edd5dd6();
        return this.f29116x18a3a281;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicAction */
    public long mo45850x45c562e1() {
        m46144x4edd5dd6();
        return this.f29117xf290db97;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicCPU */
    public int mo45851x7a1ed0dd() {
        m46144x4edd5dd6();
        return this.f29118x8b8703e7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicDelay */
    public int mo45852x6dc61378() {
        m46144x4edd5dd6();
        return this.f29119xc5edac02;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicEnable */
    public boolean mo45853x4d2b0a2e() {
        m46144x4edd5dd6();
        return this.f29120xf9f682e4;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicIO */
    public int mo45854x4600ff31() {
        m46144x4edd5dd6();
        return this.f29121x88a142e7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicThr */
    public boolean mo45855x7a1f13b3() {
        m46144x4edd5dd6();
        return this.f29122x8b8746bd;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcDecodePicTimeout */
    public int mo45856x69d5fe16() {
        m46144x4edd5dd6();
        return this.f29123x56799c20;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoAction */
    public long mo45857xf97f1baa() {
        m46144x4edd5dd6();
        return this.f29124xa14f3ee0;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoCPU */
    public int mo45858x250ff4b4() {
        m46144x4edd5dd6();
        return this.f29125x7d378d3e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoDelay */
    public int mo45859x20fd9d8f() {
        m46144x4edd5dd6();
        return this.f29126xda13b99;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoEnable */
    public boolean mo45860xe4c2f7() {
        m46144x4edd5dd6();
        return this.f29127xa8b4e62d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoIO */
    public int mo45861x3b00847a() {
        m46144x4edd5dd6();
        return this.f29128x569eb2b0;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoThr */
    public boolean mo45862x2510378a() {
        m46144x4edd5dd6();
        return this.f29129x7d37d014;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEncodeVideoTimeout */
    public int mo45863x2d535e6d() {
        m46144x4edd5dd6();
        return this.f29130x7f87a1f7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEndTimeHour */
    public int mo45864x283e6c9b() {
        m46144x4edd5dd6();
        return this.f29131x6adeb051;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEndTimeMin */
    public int mo45865x4b9efcbb() {
        m46144x4edd5dd6();
        return this.f29132xeaac6a45;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingAction */
    public long mo45866x77c2ce63() {
        m46144x4edd5dd6();
        return this.f29133x6c16fc19;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingCPU */
    public int mo45867x8f9ae49b() {
        m46144x4edd5dd6();
        return this.f29134x7c3e82a5;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingDelay */
    public int mo45868x148c2fb6() {
        m46144x4edd5dd6();
        return this.f29135x66c07340;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingEnable */
    public boolean mo45869x7f2875b0() {
        m46144x4edd5dd6();
        return this.f29136x737ca366;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingIO */
    public int mo45870x4ef47bb3() {
        m46144x4edd5dd6();
        return this.f29137xfbbff469;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingThr */
    public boolean mo45871x8f9b2771() {
        m46144x4edd5dd6();
        return this.f29138x7c3ec57b;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcEnterChattingTimeout */
    public int mo45872x778602d4() {
        m46144x4edd5dd6();
        return this.f29139xdb78bde;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifAction */
    public long mo45873x11cbdb29() {
        m46144x4edd5dd6();
        return this.f29140x37f5945f;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifCPU */
    public int mo45874xa37c7d95() {
        m46144x4edd5dd6();
        return this.f29141x27a2401f;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifDelay */
    public int mo45875xb66b7230() {
        m46144x4edd5dd6();
        return this.f29142xc82aba3a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifEnable */
    public boolean mo45876x19318276() {
        m46144x4edd5dd6();
        return this.f29143x3f5b3bac;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameAction */
    public long mo45877xcf7250f0() {
        m46144x4edd5dd6();
        return this.f29144x2799e97a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameCPU */
    public int mo45878xceec352e() {
        m46144x4edd5dd6();
        return this.f29145x118c78e4;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameDelay */
    public int mo45879xc4cba789() {
        m46144x4edd5dd6();
        return this.f29146xe069d5bf;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameEnable */
    public boolean mo45880xd6d7f83d() {
        m46144x4edd5dd6();
        return this.f29147x2eff90c7;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameIO */
    public int mo45881x48bd4cc0() {
        m46144x4edd5dd6();
        return this.f29148xe7caba4a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameThr */
    public boolean mo45882xceec7804() {
        m46144x4edd5dd6();
        return this.f29149x118cbbba;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifFrameTimeout */
    public int mo45883x15c6d1e7() {
        m46144x4edd5dd6();
        return this.f29150xc2924a9d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifIO */
    public int mo45884x685edb79() {
        m46144x4edd5dd6();
        return this.f29151x2a919faf;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifThr */
    public boolean mo45885xa37cc06b() {
        m46144x4edd5dd6();
        return this.f29152x27a282f5;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcGifTimeout */
    public int mo45886x1e9e8ece() {
        m46144x4edd5dd6();
        return this.f29153xbdabfc58;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcKVFtReport */
    public boolean mo45887x67a6afde() {
        m46144x4edd5dd6();
        return this.f29154x6b41d68;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcKVPerReport */
    public boolean mo45888xbd6abbf5() {
        m46144x4edd5dd6();
        return this.f29155xaffab;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollAction */
    public long mo45889x4974562() {
        m46144x4edd5dd6();
        return this.f29156xa569396c;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollCPU */
    public int mo45890x8fe6e5fc() {
        m46144x4edd5dd6();
        return this.f29157xbfe67e32;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollDelay */
    public int mo45891x31dd5cd7() {
        m46144x4edd5dd6();
        return this.f29158x6057bf8d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollEnable */
    public boolean mo45892xbfcecaf() {
        m46144x4edd5dd6();
        return this.f29159xaccee0b9;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollIO */
    public int mo45893xfc624a32() {
        m46144x4edd5dd6();
        return this.f29160x9293d33c;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollThr */
    public boolean mo45894x8fe728d2() {
        m46144x4edd5dd6();
        return this.f29161xbfe6c108;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMediaGalleryScrollTimeout */
    public int mo45895x85406bb5() {
        m46144x4edd5dd6();
        return this.f29162xfeacf8eb;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchAction */
    public long mo45896xbf418465() {
        m46144x4edd5dd6();
        return this.f29163xedbbe71b;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchCPU */
    public int mo45897x139dbdd9() {
        m46144x4edd5dd6();
        return this.f29164xa9cf46e3;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchDelay */
    public int mo45898xa33db174() {
        m46144x4edd5dd6();
        return this.f29165x73311ffe;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchEnable */
    public boolean mo45899xc6a72bb2() {
        m46144x4edd5dd6();
        return this.f29166xf5218e68;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchIO */
    public int mo45900x42b282b5() {
        m46144x4edd5dd6();
        return this.f29167x3706b06b;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchThr */
    public boolean mo45901x139e00af() {
        m46144x4edd5dd6();
        return this.f29168xa9cf89b9;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcMiniProgramLaunchTimeout */
    public int mo45902x1fde0d12() {
        m46144x4edd5dd6();
        return this.f29169xc0b0011c;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingAction */
    public long mo45903xe2012d1c() {
        m46144x4edd5dd6();
        return this.f29170x343570a6;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingCPU */
    public int mo45904x740aa882() {
        m46144x4edd5dd6();
        return this.f29171x20d62138;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingDelay */
    public int mo45905x9c1a95dd() {
        m46144x4edd5dd6();
        return this.f29172x43eab913;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingEnable */
    public boolean mo45906xe966d469() {
        m46144x4edd5dd6();
        return this.f29173x3b9b17f3;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingIO */
    public int mo45907x6f191eec() {
        m46144x4edd5dd6();
        return this.f29174xc740b776;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingThr */
    public boolean mo45908x740aeb58() {
        m46144x4edd5dd6();
        return this.f29175x20d6640e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcQuitChattingTimeout */
    public int mo45909x55137b3b() {
        m46144x4edd5dd6();
        return this.f29176x4967a8f1;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgAction */
    public long mo45910x71454685() {
        m46144x4edd5dd6();
        return this.f29177x5de8e48f;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgCPU */
    public int mo45911x3d5e2fb9() {
        m46144x4edd5dd6();
        return this.f29178x58fc5def;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgDelay */
    public int mo45912x5ea92b54() {
        m46144x4edd5dd6();
        return this.f29179xb74a40a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgEnable */
    public boolean mo45913x78aaedd2() {
        m46144x4edd5dd6();
        return this.f29180x654e8bdc;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgIO */
    public int mo45914xc82c54d5() {
        m46144x4edd5dd6();
        return this.f29181xd99487df;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgThr */
    public boolean mo45915x3d5e728f() {
        m46144x4edd5dd6();
        return this.f29182x58fca0c5;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcReceiveMsgTimeout */
    public int mo45916xae528ef2() {
        m46144x4edd5dd6();
        return this.f29183x5622b228;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcRetryInterval */
    public int mo45917xa7e0681c() {
        m46144x4edd5dd6();
        return this.f29184xc37e9652;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollAction */
    public long mo45918xf43e41bd() {
        m46144x4edd5dd6();
        return this.f29185x46728547;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollCPU */
    public int mo45919xa8e1bf81() {
        m46144x4edd5dd6();
        return this.f29186x55ad3837;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollDelay */
    public int mo45920xf787e91c() {
        m46144x4edd5dd6();
        return this.f29187x9f580c52;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollEnable */
    public boolean mo45921xfba3e90a() {
        m46144x4edd5dd6();
        return this.f29188x4dd82c94;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollIO */
    public int mo45922x8993ac0d() {
        m46144x4edd5dd6();
        return this.f29189xe1bb4497;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollThr */
    public boolean mo45923xa8e20257() {
        m46144x4edd5dd6();
        return this.f29190x55ad7b0d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSMsgScrollTimeout */
    public int mo45924x8a78faba() {
        m46144x4edd5dd6();
        return this.f29191x7ecd2870;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollAction */
    public long mo45925x59f019ca() {
        m46144x4edd5dd6();
        return this.f29192x6bb9280;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollCPU */
    public int mo45926x8dccaa94() {
        m46144x4edd5dd6();
        return this.f29193x9f34dd9e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollDelay */
    public int mo45927x4d645b6f() {
        m46144x4edd5dd6();
        return this.f29194xa58bf3f9;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollEnable */
    public boolean mo45928x6155c117() {
        m46144x4edd5dd6();
        return this.f29195xe2139cd;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollIO */
    public int mo45929x4ee5929a() {
        m46144x4edd5dd6();
        return this.f29196x9185d650;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollThr */
    public boolean mo45930x8dcced6a() {
        m46144x4edd5dd6();
        return this.f29197x9f352074;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSScrollTimeout */
    public int mo45931xdb02244d() {
        m46144x4edd5dd6();
        return this.f29198xc7a5c257;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollAction */
    public long mo45932xcb2075b5() {
        m46144x4edd5dd6();
        return this.f29199xbf74a36b;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollCPU */
    public int mo45933x9bf4ce89() {
        m46144x4edd5dd6();
        return this.f29200x88986c93;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollDelay */
    public int mo45934x72135624() {
        m46144x4edd5dd6();
        return this.f29201xc44799ae;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollEnable */
    public boolean mo45935xd2861d02() {
        m46144x4edd5dd6();
        return this.f29202xc6da4ab8;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollIO */
    public int mo45936x5fde9c05() {
        m46144x4edd5dd6();
        return this.f29203xcaa14bb;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollThr */
    public boolean mo45937x9bf5115f() {
        m46144x4edd5dd6();
        return this.f29204x8898af69;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSNSUserScrollTimeout */
    public int mo45938x8fdd45c2() {
        m46144x4edd5dd6();
        return this.f29205x260ececc;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgAction */
    public long mo45939x82c31afe() {
        m46144x4edd5dd6();
        return this.f29206x9e614934;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgCPU */
    public int mo45940x9ef855e0() {
        m46144x4edd5dd6();
        return this.f29207x3e05c36a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgDelay */
    public int mo45941xc25263bb() {
        m46144x4edd5dd6();
        return this.f29208xd3ba96c5;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgEnable */
    public boolean mo45942x8a28c24b() {
        m46144x4edd5dd6();
        return this.f29209xa5c6f081;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgIO */
    public int mo45943x47314dce() {
        m46144x4edd5dd6();
        return this.f29210x6d5b0704;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgThr */
    public boolean mo45944x9ef898b6() {
        m46144x4edd5dd6();
        return this.f29211x3e060640;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendMsgTimeout */
    public int mo45945xcc8f4999() {
        m46144x4edd5dd6();
        return this.f29212x24b6e223;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgAction */
    public long mo45946xe052ab66() {
        m46144x4edd5dd6();
        return this.f29213xccf64970;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgCPU */
    public int mo45947x7280de78() {
        m46144x4edd5dd6();
        return this.f29214x8e1f0cae;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgDelay */
    public int mo45948xd5db2653() {
        m46144x4edd5dd6();
        return this.f29215x82a69f09;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgEnable */
    public boolean mo45949xe7b852b3() {
        m46144x4edd5dd6();
        return this.f29216xd45bf0bd;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgIO */
    public int mo45950xe2a95236() {
        m46144x4edd5dd6();
        return this.f29217xf4118540;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgThr */
    public boolean mo45951x7281214e() {
        m46144x4edd5dd6();
        return this.f29218x8e1f4f84;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcSendPicMsgTimeout */
    public int mo45952x20f1c631() {
        m46144x4edd5dd6();
        return this.f29219xc8c1e967;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcTimeLimit */
    public boolean mo45953x47b684fd() {
        m46144x4edd5dd6();
        return this.f29220x6de03e33;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcTimeoutMargin */
    public int mo45954x345896fe() {
        m46144x4edd5dd6();
        return this.f29221x4ff6c534;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUinHash */
    public int mo45955xb11db857() {
        m46144x4edd5dd6();
        return this.f29222xb1b0470d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomAction */
    public long mo45956x5168be03() {
        m46144x4edd5dd6();
        return this.f29223xe79a470d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomCPU */
    public int mo45957xf52418fb() {
        m46144x4edd5dd6();
        return this.f29224x9cf43c31;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomDelay */
    public int mo45958x3c99cc16() {
        m46144x4edd5dd6();
        return this.f29225x30edf9cc;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomEnable */
    public boolean mo45959x58ce6550() {
        m46144x4edd5dd6();
        return this.f29226xeeffee5a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomIO */
    public int mo45960x73433b53() {
        m46144x4edd5dd6();
        return this.f29227x5fe6d95d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomMemberCount */
    public long mo45961x8579fee8() {
        m46144x4edd5dd6();
        return this.f29228xfee68c1e;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomThr */
    public boolean mo45962xf5245bd1() {
        m46144x4edd5dd6();
        return this.f29229x9cf47f07;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getHcUpdateChatroomTimeout */
    public int mo45963xd29e0734() {
        m46144x4edd5dd6();
        return this.f29230x29d9f6a;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getParameters */
    public long mo45965x99879e0(int i17, com.p314xaae8f345.mm.p788xd6f12a1a.a aVar, java.lang.String... strArr) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("getparameterstype", i17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.lang.String str : strArr) {
                jSONArray.put(str);
            }
            jSONObject.put("getparameterskeys", jSONArray);
            return mo45964x99879e0(i17, aVar, jSONObject);
        } catch (org.json.JSONException unused) {
            return -1L;
        }
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: initHardCoder */
    public int mo45966x31c7a6ca(com.p314xaae8f345.mm.p788xd6f12a1a.o oVar, com.p314xaae8f345.mm.p788xd6f12a1a.r rVar, com.p314xaae8f345.mm.p788xd6f12a1a.i iVar) {
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45799x9b0fd4e0(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f());
        java.lang.String mo45970xcc0e980a = mo45970xcc0e980a(false);
        if (mo45970xcc0e980a == null || mo45970xcc0e980a.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (mo45970xcc0e980a == null) {
                mo45970xcc0e980a = "null";
            }
            objArr[0] = mo45970xcc0e980a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "initHardCoder serverSock is null or empty, skip init and reguard as disabled, serverSock:%s.", objArr);
            com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45795xd22d4d47(false);
            return -3;
        }
        if (mo45970xcc0e980a.contains("|")) {
            this.f29233x7fcf51f1 = true;
        }
        if (com.p314xaae8f345.mm.p788xd6f12a1a.p.f149810a == null) {
            com.p314xaae8f345.mm.p788xd6f12a1a.n.c("Hardcoder.HardCoderReporter", java.lang.String.format("setReporter[%s]", oVar));
            com.p314xaae8f345.mm.p788xd6f12a1a.p.f149810a = oVar;
        }
        this.f29082xe4dfcc49 = rVar;
        com.p314xaae8f345.mm.p788xd6f12a1a.n.f149809a = this.f29236xe3bd106b;
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45801x92970183(this.f29234xec226545);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "initHardCoder hcDebug[%b] hcEnable[%b] checkEnv[%b] TICK_RATE[%d]", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45775x7d6c58e()), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45776xf534dda8()), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f()), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29072x7370fc1d));
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45773x31c7a6ca(mo45970xcc0e980a, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29004x77bbe3b8, new com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.HCPerfManagerThread() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.3
            @Override // com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.HCPerfManagerThread
            /* renamed from: newThread */
            public java.lang.Thread mo45809xdd89ebca(java.lang.Runnable runnable, java.lang.String str, int i17) {
                return pu5.i.b(str, runnable, i17);
            }
        }, iVar);
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: isCheckEnv */
    public boolean mo45967x2c52560f() {
        m46144x4edd5dd6();
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f();
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: isHCEnable */
    public boolean mo45968x586d7588() {
        return mo45967x2c52560f() & mo45814x17ac4879();
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: isRunning */
    public int mo45969x39e05d35() {
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45777x39e05d35();
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        m46140x2bf3cf23();
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("hardcoder_setting", 0);
        gm0.j1.i();
        if (gm0.j1.b().h() != 0) {
            gm0.j1.i();
            int b17 = kk.m.b(gm0.j1.b().h(), 100);
            if (b17 != sharedPreferences.getInt("KEY_HC_UIN_HASH", 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onAccountInitialized hardcoder uinHash[%d] reloadSPConfig", java.lang.Integer.valueOf(b17));
                sharedPreferences.edit().putInt("KEY_HC_UIN_HASH", b17).apply();
                mo45973xa5b85898(2);
            }
        }
        q25.b.b(new mp.a(), "//fsd");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45778xeb57c8f5(new com.p314xaae8f345.mm.p788xd6f12a1a.C10734x786fcf55());
        m46137x4348daf5();
        mo45973xa5b85898(0);
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223788g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223788g = new com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223788g;
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223788g = new com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a();
        }
        mo45966x31c7a6ca(aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1775xd6f12a1a.a.f223788g, new com.p314xaae8f345.mm.p788xd6f12a1a.i() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.1
            @Override // com.p314xaae8f345.mm.p788xd6f12a1a.i
            /* renamed from: onConnectStatus */
            public void mo46146xef2e41dd(boolean z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "configure initHardCoder callback, connect:%b", java.lang.Boolean.valueOf(z17));
                if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.mo45972x9062176d(new com.p314xaae8f345.mm.p788xd6f12a1a.q() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.1.1
                        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.q
                        /* renamed from: onEvent */
                        public void mo46147xaf8c47fb(int i17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "configure SystemEventCallback onEvent eventCode[%d]", java.lang.Integer.valueOf(i17));
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771 c5637xe5a09771 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771();
                            c5637xe5a09771.f135965g.f88367a = i17;
                            c5637xe5a09771.e();
                        }
                    });
                    com.p314xaae8f345.mm.p788xd6f12a1a.a aVar2 = new com.p314xaae8f345.mm.p788xd6f12a1a.a() { // from class: com.tencent.mm.hardcoder.WXHardCoderJNIImpl.1.2
                        @Override // com.p314xaae8f345.mm.p788xd6f12a1a.a
                        /* renamed from: onGetParameters */
                        public void mo46148x3ca75e41(int i17, org.json.JSONObject jSONObject) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "configure GetParametersCallback onGetParameters type[%d]", java.lang.Integer.valueOf(i17));
                            if (i17 == 1) {
                                try {
                                    java.lang.String string = jSONObject.getString("HCMinQPKey");
                                    java.lang.String string2 = jSONObject.getString("HCMaxQPKey");
                                    java.lang.String string3 = jSONObject.getString("HCQPSceneKey");
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "onGetParameters, minkey:%s, maxKey:%s, sceneKey:%s", string, string2, string3);
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("HardcoderQP");
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
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "get bFrame parameters, BFrameKey:%s, BFrameKeyOptionOpen:%s, BFrameKeyOptionClose:%s", optString, java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2));
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("HardcoderBFrame");
                                M2.D("BFrameKey", optString);
                                M2.A("BFrameKeyOptionOpen", optInt);
                                M2.A("BFrameKeyOptionClose", optInt2);
                            }
                        }
                    };
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "configure qp registerGetParametersCallback ret:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.mo45971x65bad362(1, aVar2, "HCMinQPKey", "HCMaxQPKey", "HCQPSceneKey")));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.TAG, "configure bFrame registerGetParametersCallback ret:%d", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10733x5980910c.this.mo45971x65bad362(4, aVar2, new java.lang.String[0])));
                }
            }
        });
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "configure initHardCoder[%d %d %d %d] take[%d]ms tid[%s, %s]", java.lang.Long.valueOf(im0.a.f373696b), java.lang.Long.valueOf(im0.a.f373697c), java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2), java.lang.Long.valueOf(elapsedRealtime2 - im0.a.f373696b), currentThread.getName(), java.lang.Long.valueOf(currentThread.getId()));
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: readServerAddr */
    public synchronized java.lang.String mo45970xcc0e980a(boolean z17) {
        java.lang.String str;
        try {
            if (this.f29232x95e9fc49 == null) {
                this.f29232x95e9fc49 = java.lang.Class.forName("android.os.SystemProperties");
                java.lang.reflect.Method declaredMethod = this.f29232x95e9fc49.getDeclaredMethod("get", java.lang.String.class, java.lang.String.class);
                this.f29231xc3e838f7 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            str = (java.lang.String) this.f29231xc3e838f7.invoke(null, com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29058x589f8cdf, "");
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "readServerAddr, serverprop[%s], result[%s], stack[%s]", com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29058x589f8cdf, str, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            if (z17) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.u(true, 1, 1, false));
                } else {
                    m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.u(true, 2, 1, false));
                    m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.v());
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "readServerAddr", new java.lang.Object[0]);
            if (!z17) {
                return "";
            }
            m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.u(true, 3, 1, false));
            return "";
        }
        return str;
    }

    /* renamed from: registerANRCallback */
    public long m46145xd6b4aa7(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.AnrCallback anrCallback) {
        m46144x4edd5dd6();
        if (com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f()) {
            return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45785xd6b4aa7(anrCallback);
        }
        return -2L;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: registerGetParametersCallback */
    public int mo45971x65bad362(int i17, com.p314xaae8f345.mm.p788xd6f12a1a.a aVar, java.lang.String... strArr) {
        if (!com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f()) {
            return -2;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = aVar == null ? "null" : aVar;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[2] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerGetParametersCallback, type:%d, callback:%s, stack[%s]", objArr);
        mo45965x99879e0(i17, aVar, strArr);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: registerSystemEventCallback */
    public long mo45972x9062176d(com.p314xaae8f345.mm.p788xd6f12a1a.q qVar) {
        if (!com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f()) {
            return -2L;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerSystemEventCallback, stack[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f29235x1179bf10 = qVar;
        long m45787x9062176d = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45787x9062176d(android.os.Process.myTid(), android.os.SystemClock.elapsedRealtime());
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45781x1e0f1460(m45787x9062176d, this.f29080xe19ef73d);
        return m45787x9062176d;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: reloadSPConfig */
    public void mo45973xa5b85898(int i17) {
        boolean m46136x6a45c9bb = m46136x6a45c9bb();
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45795xd22d4d47(m46136x6a45c9bb);
        if (!m46136x6a45c9bb) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reloadSPConfig hcEnv is false.");
            return;
        }
        mo45976x52dc5711(false);
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("hardcoder_setting", 0);
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45799x9b0fd4e0(sharedPreferences.getBoolean("KEY_HC_ENABLE", true));
        this.f29092x20f65c43 = sharedPreferences.getBoolean("KEY_HC_BG_ENABLE", true);
        this.f29222xb1b0470d = sharedPreferences.getInt("KEY_HC_UIN_HASH", 0);
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45798xdba40756(sharedPreferences.getBoolean("KEY_HC_DEBUG", false));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45775x7d6c58e());
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45776xf534dda8());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.f29222xb1b0470d);
        java.lang.Boolean valueOf5 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45774x2c52560f());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "reloadSPConfig scene:%d, hcDebug:%b, hcEnable:%b, hcUinHash:%d, checkEnv:%b, stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f29184xc37e9652 = sharedPreferences.getInt("KEY_HC_RETRY_INTERVAL", 30);
        this.f29155xaffab = sharedPreferences.getInt("KEY_HC_KV_PER", 0) < this.f29222xb1b0470d;
        this.f29154x6b41d68 = sharedPreferences.getInt("KEY_HC_KV_FT", 0) < this.f29222xb1b0470d;
        this.f29221x4ff6c534 = sharedPreferences.getInt("KEY_HC_TIMEOUT_MARGIN", 0);
        this.f29220x6de03e33 = false;
        this.f29090xb85404df = 8;
        this.f29091x8a134bf7 = 0;
        this.f29131x6adeb051 = 23;
        this.f29132xeaac6a45 = 0;
        this.f29103x7826fa70 = sharedPreferences.getBoolean("KEY_HC_BOOT_ENABLE", true);
        this.f29102xf34a12f6 = 0;
        this.f29101xcef897db = 1;
        this.f29104x1f736073 = 0;
        this.f29105xcef8dab1 = false;
        this.f29106x9e581614 = 5000;
        this.f29100x70c15323 = 4L;
        this.f29136x737ca366 = sharedPreferences.getBoolean("KEY_HC_ENTER_CHATTING_ENABLE", true);
        this.f29135x66c07340 = 0;
        this.f29134x7c3e82a5 = 1;
        this.f29137xfbbff469 = 1;
        this.f29138x7c3ec57b = false;
        this.f29139xdb78bde = 1000;
        this.f29133x6c16fc19 = 12294L;
        this.f29173x3b9b17f3 = sharedPreferences.getBoolean("KEY_HC_QUIT_CHATTING_ENABLE", true);
        this.f29172x43eab913 = 0;
        this.f29171x20d62138 = 2;
        this.f29174xc740b776 = 2;
        this.f29175x20d6640e = false;
        this.f29176x4967a8f1 = 800;
        this.f29170x343570a6 = 8194L;
        this.f29209xa5c6f081 = sharedPreferences.getBoolean("KEY_HC_SEND_MSG_ENABLE", true);
        this.f29208xd3ba96c5 = 0;
        this.f29207x3e05c36a = 3;
        this.f29210x6d5b0704 = 0;
        this.f29211x3e060640 = true;
        this.f29212x24b6e223 = 1000;
        this.f29206x9e614934 = 12288L;
        this.f29216xd45bf0bd = sharedPreferences.getBoolean("KEY_HC_SEND_PIC_MSG_ENABLE", true);
        this.f29215x82a69f09 = 0;
        this.f29214x8e1f0cae = 1;
        this.f29217xf4118540 = 2;
        this.f29218x8e1f4f84 = true;
        this.f29219xc8c1e967 = 500;
        this.f29213xccf64970 = 123072L;
        this.f29180x654e8bdc = sharedPreferences.getBoolean("KEY_HC_RECEIVE_MSG_ENABLE", true);
        this.f29179xb74a40a = 500;
        this.f29178x58fc5def = 2;
        this.f29181xd99487df = 2;
        this.f29182x58fca0c5 = true;
        this.f29183x5622b228 = 1000;
        this.f29177x5de8e48f = 127040L;
        this.f29226xeeffee5a = sharedPreferences.getBoolean("KEY_HC_UPDATE_CHATROOM_ENABLE", true);
        this.f29225x30edf9cc = 0;
        this.f29224x9cf43c31 = 2;
        this.f29227x5fe6d95d = 2;
        this.f29229x9cf47f07 = true;
        this.f29230x29d9f6a = 1000;
        this.f29223xe79a470d = 127040L;
        this.f29228xfee68c1e = 50L;
        this.f29112x4b72259c = sharedPreferences.getBoolean("KEY_HC_DB_ENABLE", false);
        this.f29110x80cf349e = 100;
        this.f29111x812273b5 = 200;
        this.f29109x2a551c2f = 2;
        this.f29113xb70b019f = 2;
        this.f29114x2a555f05 = false;
        this.f29115x34725068 = 500;
        this.f29116x18a3a281 = 5000;
        this.f29107xf18d43b9 = 4096L;
        this.f29108xf1e082d0 = 12288L;
        this.f29127xa8b4e62d = sharedPreferences.getBoolean("KEY_HC_ENCODE_VIDEO_ENABLE", true);
        this.f29126xda13b99 = 0;
        this.f29125x7d378d3e = 1;
        this.f29128x569eb2b0 = 1;
        this.f29129x7d37d014 = false;
        this.f29130x7f87a1f7 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
        this.f29124xa14f3ee0 = 81984L;
        this.f29120xf9f682e4 = sharedPreferences.getBoolean("KEY_HC_DECODE_PIC_ENABLE", false);
        this.f29119xc5edac02 = 100;
        this.f29118x8b8703e7 = 2;
        this.f29121x88a142e7 = 2;
        this.f29122x8b8746bd = false;
        this.f29123x56799c20 = 500;
        this.f29117xf290db97 = 16448L;
        this.f29143x3f5b3bac = sharedPreferences.getBoolean("KEY_HC_GIF_ENABLE", true);
        this.f29142xc82aba3a = 0;
        this.f29141x27a2401f = 3;
        this.f29151x2a919faf = 2;
        this.f29152x27a282f5 = false;
        this.f29153xbdabfc58 = 500;
        this.f29140x37f5945f = 81984L;
        this.f29147x2eff90c7 = sharedPreferences.getBoolean("KEY_HC_GIF_FRAME_ENABLE", true);
        this.f29146xe069d5bf = 0;
        this.f29145x118c78e4 = 2;
        this.f29148xe7caba4a = 0;
        this.f29149x118cbbba = false;
        this.f29150xc2924a9d = 1000;
        this.f29144x2799e97a = 65600L;
        this.f29195xe2139cd = sharedPreferences.getBoolean("KEY_HC_SNS_SCROLL_ENABLE", true);
        this.f29194xa58bf3f9 = 0;
        this.f29193x9f34dd9e = 2;
        this.f29196x9185d650 = 2;
        this.f29197x9f352074 = false;
        this.f29198xc7a5c257 = 1500;
        this.f29192x6bb9280 = 96L;
        this.f29202xc6da4ab8 = sharedPreferences.getBoolean("KEY_HC_SNS_USER_SCROLL_ENABLE", true);
        this.f29201xc44799ae = 0;
        this.f29200x88986c93 = 3;
        this.f29203xcaa14bb = 2;
        this.f29204x8898af69 = false;
        this.f29205x260ececc = 1500;
        this.f29199xbf74a36b = 96L;
        this.f29188x4dd82c94 = sharedPreferences.getBoolean("KEY_HC_SNS_MSG_SCROLL_ENABLE", true);
        this.f29187x9f580c52 = 0;
        this.f29186x55ad3837 = 3;
        this.f29189xe1bb4497 = 2;
        this.f29190x55ad7b0d = false;
        this.f29191x7ecd2870 = 1500;
        this.f29185x46728547 = 96L;
        this.f29159xaccee0b9 = sharedPreferences.getBoolean("KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE", true);
        this.f29158x6057bf8d = 0;
        this.f29157xbfe67e32 = 3;
        this.f29160x9293d33c = 2;
        this.f29161xbfe6c108 = false;
        this.f29162xfeacf8eb = 1500;
        this.f29156xa569396c = 96L;
        this.f29086x29f6f704 = sharedPreferences.getBoolean("KEY_HCALBUM_SCROLL_ENABLE", true);
        this.f29085xd7fe33e2 = 0;
        this.f29084xedd803c7 = 3;
        this.f29087x5a40c707 = 2;
        this.f29088xedd8469d = false;
        this.f29089x2687ac00 = 1500;
        this.f29083x22914fb7 = 96L;
        this.f29166xf5218e68 = sharedPreferences.getBoolean("KEY_HC_MINI_PROGRAM_LAUNCH_ENABLE", true);
        this.f29165x73311ffe = 500;
        this.f29164xa9cf46e3 = 1;
        this.f29167x3706b06b = 1;
        this.f29168xa9cf89b9 = false;
        this.f29169xc0b0011c = 5000;
        this.f29163xedbbe71b = 114688L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "reloadSPConfig Boot[%b] EnterChatting[%b] QuitChatting[%b] SendMsg[%b] SendPicMsg[%b] ReceiveMsg[%b] UpdateChatroom[%b] DB[%b] EncodeVideo[%b] DecodePic[%b] Gif[%b] GifFrame[%b] SNS[%b] MediaGallery[%b] Album[%b] SNSUser[%b] SNSMsg[%b] MiniProgramLaunch[%b]", java.lang.Boolean.valueOf(this.f29103x7826fa70), java.lang.Boolean.valueOf(this.f29136x737ca366), java.lang.Boolean.valueOf(this.f29173x3b9b17f3), java.lang.Boolean.valueOf(this.f29209xa5c6f081), java.lang.Boolean.valueOf(this.f29216xd45bf0bd), java.lang.Boolean.valueOf(this.f29180x654e8bdc), java.lang.Boolean.valueOf(this.f29226xeeffee5a), java.lang.Boolean.valueOf(this.f29112x4b72259c), java.lang.Boolean.valueOf(this.f29127xa8b4e62d), java.lang.Boolean.valueOf(this.f29120xf9f682e4), java.lang.Boolean.valueOf(this.f29143x3f5b3bac), java.lang.Boolean.valueOf(this.f29147x2eff90c7), java.lang.Boolean.valueOf(this.f29195xe2139cd), java.lang.Boolean.valueOf(this.f29159xaccee0b9), java.lang.Boolean.valueOf(this.f29086x29f6f704), java.lang.Boolean.valueOf(this.f29202xc6da4ab8), java.lang.Boolean.valueOf(this.f29188x4dd82c94), java.lang.Boolean.valueOf(this.f29166xf5218e68));
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: reportFPS */
    public void mo45974xeaf03f15(int i17, long j17, int i18, long j18, long j19) {
        m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.t(i17, j17, i18, j18, j19));
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: reportIDKey */
    public void mo45975xf0018e90(boolean z17, int i17, int i18, boolean z18) {
        m46142x73197402(new com.p314xaae8f345.mm.p788xd6f12a1a.u(z17, i17, i18, z18));
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setDebug */
    public void mo45976x52dc5711(boolean z17) {
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45798xdba40756(z17);
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollAction */
    public void mo45977xc905ebf5(long j17) {
        this.f29083x22914fb7 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollCPU */
    public void mo45978x39ad0049(int i17) {
        this.f29084xedd803c7 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollDelay */
    public void mo45979x828617e4(int i17) {
        this.f29085xd7fe33e2 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollEnable */
    public void mo45980xd06b9342(boolean z17) {
        this.f29086x29f6f704 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollIO */
    public void mo45981x75793245(int i17) {
        this.f29087x5a40c707 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollThr */
    public void mo45982x39ad431f(boolean z17) {
        this.f29088xedd8469d = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcAlbumScrollTimeout */
    public void mo45983x4ea69782(int i17) {
        this.f29089x2687ac00 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBeginTimeHour */
    public void mo45984xd38c701d(int i17) {
        this.f29090xb85404df = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBeginTimeMin */
    public void mo45985x40a180f9(int i17) {
        this.f29091x8a134bf7 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBgEnable */
    public void mo45986x3d5b6245(boolean z17) {
        this.f29092x20f65c43 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizAction */
    public void mo45987xe4d7c4ac(long j17) {
        this.f29093x749c0a6e = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizCPU */
    public void mo45988x95b5baf2(int i17) {
        this.f29094x1f231c70 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizDelay */
    public void mo45989xff4acc4d(int i17) {
        this.f29095xe2e5c64b = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizEnable */
    public void mo45990xec3d6bf9(boolean z17) {
        this.f29096x7c01b1bb = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizIO */
    public void mo45991xdb89fe7c(int i17) {
        this.f29097x2a4b753e = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizThr */
    public void mo45992x95b5fdc8(boolean z17) {
        this.f29098x1f235f46 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBizTimeout */
    public void mo45993xad0fd5ab(int i17) {
        this.f29099x15d44829 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootAction */
    public void mo45994x7fce0a5(long j17) {
        this.f29100x70c15323 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootCPU */
    public void mo45995x2ab9c999(int i17) {
        this.f29101xcef897db = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootDelay */
    public void mo45996x6385cd34(int i17) {
        this.f29102xf34a12f6 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootEnable */
    public void mo45997xf6287f2(boolean z17) {
        this.f29103x7826fa70 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootIO */
    public void mo45998x9605fef5(int i17) {
        this.f29104x1f736073 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootThr */
    public void mo45999x2aba0c6f(boolean z17) {
        this.f29105xcef8dab1 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcBootTimeout */
    public void mo46000xee8e38d2(int i17) {
        this.f29106x9e581614 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBActionQuery */
    public void mo46001xcc5aef7(long j17) {
        this.f29107xf18d43b9 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBActionWrite */
    public void mo46002xd18ee0e(long j17) {
        this.f29108xf1e082d0 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBCPU */
    public void mo46003xdb93a56d(int i17) {
        this.f29109x2a551c2f = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBDelayQuery */
    public void mo46004x375d69a0(int i17) {
        this.f29110x80cf349e = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBDelayWrite */
    public void mo46005x37b0a8b7(int i17) {
        this.f29111x812273b5 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBEnable */
    public void mo46006x67d72b9e(boolean z17) {
        this.f29112x4b72259c = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBIO */
    public void mo46007xf5758a1(int i17) {
        this.f29113xb70b019f = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBThr */
    public void mo46008xdb93e843(boolean z17) {
        this.f29114x2a555f05 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBTimeout */
    public void mo46009xa4ae0aa6(int i17) {
        this.f29115x34725068 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDBTimeoutBusy */
    public void mo46010x33dc0dbf(int i17) {
        this.f29116x18a3a281 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicAction */
    public void mo46011x215b6f55(long j17) {
        this.f29117xf290db97 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicCPU */
    public void mo46012x421538e9(int i17) {
        this.f29118x8b8703e7 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicDelay */
    public void mo46013x11c2a884(int i17) {
        this.f29119xc5edac02 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicEnable */
    public void mo46014x28c116a2(boolean z17) {
        this.f29120xf9f682e4 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicIO */
    public void mo46015xd8d765a5(int i17) {
        this.f29121x88a142e7 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicThr */
    public void mo46016x42157bbf(boolean z17) {
        this.f29122x8b8746bd = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcDecodePicTimeout */
    public void mo46017x1018022(int i17) {
        this.f29123x56799c20 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnable */
    public void mo46018x9b0fd4e0(boolean z17) {
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45799x9b0fd4e0(z17);
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoAction */
    public void mo46019x47c3db1e(long j17) {
        this.f29124xa14f3ee0 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoCPU */
    public void mo46020xc90c89c0(int i17) {
        this.f29125x7d378d3e = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoDelay */
    public void mo46021xb8291f9b(int i17) {
        this.f29126xda13b99 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoEnable */
    public void mo46022x4f29826b(boolean z17) {
        this.f29127xa8b4e62d = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoIO */
    public void mo46023x71d71dee(int i17) {
        this.f29128x569eb2b0 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoThr */
    public void mo46024xc90ccc96(boolean z17) {
        this.f29129x7d37d014 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEncodeVideoTimeout */
    public void mo46025xa7a68d79(int i17) {
        this.f29130x7f87a1f7 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEndTimeHour */
    public void mo46026xbb14d30f(int i17) {
        this.f29131x6adeb051 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEndTimeMin */
    public void mo46027x81e7f7c7(int i17) {
        this.f29132xeaac6a45 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingAction */
    public void mo46028x47d580d7(long j17) {
        this.f29133x6c16fc19 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingCPU */
    public void mo46029x26c666a7(int i17) {
        this.f29134x7c3e82a5 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingDelay */
    public void mo46030x8edf5ec2(int i17) {
        this.f29135x66c07340 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingEnable */
    public void mo46031x4f3b2824(boolean z17) {
        this.f29136x737ca366 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingIO */
    public void mo46032x2a8a8827(int i17) {
        this.f29137xfbbff469 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingThr */
    public void mo46033x26c6a97d(boolean z17) {
        this.f29138x7c3ec57b = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcEnterChattingTimeout */
    public void mo46034xa9c99ee0(int i17) {
        this.f29139xdb78bde = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifAction */
    public void mo46035xa8314e9d(long j17) {
        this.f29140x37f5945f = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifCPU */
    public void mo46036x9e34dea1(int i17) {
        this.f29141x27a2401f = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifDelay */
    public void mo46037xe48fc03c(int i17) {
        this.f29142xc82aba3a = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifEnable */
    public void mo46038xaf96f5ea(boolean z17) {
        this.f29143x3f5b3bac = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameAction */
    public void mo46039x736ee5fc(long j17) {
        this.f29144x2799e97a = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameCPU */
    public void mo46040x61c29ba2(int i17) {
        this.f29145x118c78e4 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameDelay */
    public void mo46041xfba240fd(int i17) {
        this.f29146xe069d5bf = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameEnable */
    public void mo46042x7ad48d49(boolean z17) {
        this.f29147x2eff90c7 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameIO */
    public void mo46043x7f0647cc(int i17) {
        this.f29148xe7caba4a = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameThr */
    public void mo46044x61c2de78(boolean z17) {
        this.f29149x118cbbba = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifFrameTimeout */
    public void mo46045xf15cde5b(int i17) {
        this.f29150xc2924a9d = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifIO */
    public void mo46046xdbd028ed(int i17) {
        this.f29151x2a919faf = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifThr */
    public void mo46047x9e352177(boolean z17) {
        this.f29152x27a282f5 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcGifTimeout */
    public void mo46048x54e789da(int i17) {
        this.f29153xbdabfc58 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcKVFtReport */
    public void mo46049x9defaaea(boolean z17) {
        this.f29154x6b41d68 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcKVPerReport */
    public void mo46050x50412269(boolean z17) {
        this.f29155xaffab = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollAction */
    public void mo46051xf455fb6e(long j17) {
        this.f29156xa569396c = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollCPU */
    public void mo46052xa616cb70(int i17) {
        this.f29157xbfe67e32 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollDelay */
    public void mo46053x7ba9b54b(int i17) {
        this.f29158x6057bf8d = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollEnable */
    public void mo46054xfbbba2bb(boolean z17) {
        this.f29159xaccee0b9 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollIO */
    public void mo46055x2ea5e63e(int i17) {
        this.f29160x9293d33c = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollThr */
    public void mo46056xa6170e46(boolean z17) {
        this.f29161xbfe6c108 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMediaGalleryScrollTimeout */
    public void mo46057x8d587729(int i17) {
        this.f29162xfeacf8eb = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchAction */
    public void mo46058x90ddcd9(long j17) {
        this.f29163xedbbe71b = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchCPU */
    public void mo46059x45e159e5(int i17) {
        this.f29164xa9cf46e3 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchDelay */
    public void mo46060x530a7a80(int i17) {
        this.f29165x73311ffe = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchEnable */
    public void mo46061x10738426(boolean z17) {
        this.f29166xf5218e68 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchIO */
    public void mo46062x12c53529(int i17) {
        this.f29167x3706b06b = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchThr */
    public void mo46063x45e19cbb(boolean z17) {
        this.f29168xa9cf89b9 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcMiniProgramLaunchTimeout */
    public void mo46064xf9cc31e(int i17) {
        this.f29169xc0b0011c = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingAction */
    public void mo46065x5c545c28(long j17) {
        this.f29170x343570a6 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingCPU */
    public void mo46066x4fa0b4f6(int i17) {
        this.f29171x20d62138 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingDelay */
    public void mo46067xea5f5551(int i17) {
        this.f29172x43eab913 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingEnable */
    public void mo46068x63ba0375(boolean z17) {
        this.f29173x3b9b17f3 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingIO */
    public void mo46069x1315b3f8(int i17) {
        this.f29174xc740b776 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingThr */
    public void mo46070x4fa0f7cc(boolean z17) {
        this.f29175x20d6640e = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcQuitChattingTimeout */
    public void mo46071x25262daf(int i17) {
        this.f29176x4967a8f1 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgAction */
    public void mo46072x870c891(long j17) {
        this.f29177x5de8e48f = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgCPU */
    public void mo46073x7434c92d(int i17) {
        this.f29178x58fc5def = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgDelay */
    public void mo46074x3a3f37c8(int i17) {
        this.f29179xb74a40a = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgEnable */
    public void mo46075xfd66fde(boolean z17) {
        this.f29180x654e8bdc = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgIO */
    public void mo46076x9022bce1(int i17) {
        this.f29181xd99487df = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgThr */
    public void mo46077x74350c03(boolean z17) {
        this.f29182x58fca0c5 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcReceiveMsgTimeout */
    public void mo46078xfc974e66(int i17) {
        this.f29183x5622b228 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcRetryInterval */
    public void mo46079xdeb70190(int i17) {
        this.f29184xc37e9652 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollAction */
    public void mo46080x6e9170c9(long j17) {
        this.f29185x46728547 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollCPU */
    public void mo46081x8477cbf5(int i17) {
        this.f29186x55ad3837 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollDelay */
    public void mo46082x45cca890(int i17) {
        this.f29187x9f580c52 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollEnable */
    public void mo46083x75f71816(boolean z17) {
        this.f29188x4dd82c94 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollIO */
    public void mo46084x2d904119(int i17) {
        this.f29189xe1bb4497 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollThr */
    public void mo46085x84780ecb(boolean z17) {
        this.f29190x55ad7b0d = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSMsgScrollTimeout */
    public void mo46086x5a8bad2e(int i17) {
        this.f29191x7ecd2870 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollAction */
    public void mo46087x3586263e(long j17) {
        this.f29192x6bb9280 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollCPU */
    public void mo46088x55c312a0(int i17) {
        this.f29193x9f34dd9e = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollDelay */
    public void mo46089xf160f07b(int i17) {
        this.f29194xa58bf3f9 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollEnable */
    public void mo46090x3cebcd8b(boolean z17) {
        this.f29195xe2139cd = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollIO */
    public void mo46091xe1bbf90e(int i17) {
        this.f29196x9185d650 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollThr */
    public void mo46092x55c35576(boolean z17) {
        this.f29197x9f352074 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSScrollTimeout */
    public void mo46093x722da659(int i17) {
        this.f29198xc7a5c257 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollAction */
    public void mo46094x9b332829(long j17) {
        this.f29199xbf74a36b = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollCPU */
    public void mo46095x33205095(int i17) {
        this.f29200x88986c93 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollDelay */
    public void mo46096xec668530(int i17) {
        this.f29201xc44799ae = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollEnable */
    public void mo46097xa298cf76(boolean z17) {
        this.f29202xc6da4ab8 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollIO */
    public void mo46098x3b74a879(int i17) {
        this.f29203xcaa14bb = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollThr */
    public void mo46099x3320936b(boolean z17) {
        this.f29204x8898af69 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSNSUserScrollTimeout */
    public void mo46100xc220e1ce(int i17) {
        this.f29205x260ececc = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgAction */
    public void mo46101xb999b472(long j17) {
        this.f29206x9e614934 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgCPU */
    public void mo46102xd54150ec(int i17) {
        this.f29207x3e05c36a = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgDelay */
    public void mo46103x8a48cbc7(int i17) {
        this.f29208xd3ba96c5 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgEnable */
    public void mo46104xc0ff5bbf(boolean z17) {
        this.f29209xa5c6f081 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgIO */
    public void mo46105xdd96c142(int i17) {
        this.f29210x6d5b0704 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgThr */
    public void mo46106xd54193c2(boolean z17) {
        this.f29211x3e060640 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendMsgTimeout */
    public void mo46107x708bdea5(int i17) {
        this.f29212x24b6e223 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgAction */
    public void mo46108x777e2d72(long j17) {
        this.f29213xccf64970 = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgCPU */
    public void mo46109xa95777ec(int i17) {
        this.f29214x8e1f0cae = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgDelay */
    public void mo46110xb17132c7(int i17) {
        this.f29215x82a69f09 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgEnable */
    public void mo46111x7ee3d4bf(boolean z17) {
        this.f29216xd45bf0bd = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgIO */
    public void mo46112xaa9fba42(int i17) {
        this.f29217xf4118540 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgThr */
    public void mo46113xa957bac2(boolean z17) {
        this.f29218x8e1f4f84 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcSendPicMsgTimeout */
    public void mo46114x6f3685a5(int i17) {
        this.f29219xc8c1e967 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcTimeLimit */
    public void mo46115xde1bf871(boolean z17) {
        this.f29220x6de03e33 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcTimeoutMargin */
    public void mo46116x6b2f3072(int i17) {
        this.f29221x4ff6c534 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUinHash */
    public void mo46117xd7178cb(int i17) {
        this.f29222xb1b0470d = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomAction */
    public void mo46118x83ac5a0f(long j17) {
        this.f29223xe79a470d = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomCPU */
    public void mo46119x4368d86f(int i17) {
        this.f29224x9cf43c31 = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomDelay */
    public void mo46120xcac7e8a(int i17) {
        this.f29225x30edf9cc = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomEnable */
    public void mo46121x8b12015c(boolean z17) {
        this.f29226xeeffee5a = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomIO */
    public void mo46122xa6ebd5f(int i17) {
        this.f29227x5fe6d95d = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomMemberCount */
    public void mo46123x8d920a5c(long j17) {
        this.f29228xfee68c1e = j17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomThr */
    public void mo46124x43691b45(boolean z17) {
        this.f29229x9cf47f07 = z17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setHcUpdateChatroomTimeout */
    public void mo46125xe8cdeca8(int i17) {
        this.f29230x29d9f6a = i17;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: setRetryConnectInterval */
    public void mo46126xd7d11389(int i17) {
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45800xd7d11389(i17);
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: startPerformance */
    public int mo46127x5f00c26e(boolean z17, int i17, int i18, int i19, int i27, int i28, int i29, long j17, java.lang.String str) {
        java.lang.Integer num;
        boolean z18;
        if (!z17) {
            return -3;
        }
        if (!this.f29092x20f65c43) {
            boolean[] zArr = wj0.i.f528094d;
            synchronized (zArr) {
                z18 = zArr[0];
            }
            if (!z18) {
                return -4;
            }
        }
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45802x5f00c26e(i17, i18, i19, i27, i28 + this.f29221x4ff6c534, (!this.f29233x7fcf51f1 || (num = this.f29077xf3f1cc9.get(java.lang.Integer.valueOf(i29))) == null) ? i29 : num.intValue(), j17, android.os.Process.myTid(), str);
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: stopPerformance */
    public int mo46128x89c4face(boolean z17, int i17) {
        if (z17) {
            return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45805x89c4face(i17);
        }
        return -3;
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: terminateApp */
    public long mo46129x26f19c00(int i17, long j17) {
        return com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45807x26f19c00(i17, j17);
    }

    @Override // com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc
    /* renamed from: getParameters */
    public long mo45964x99879e0(int i17, com.p314xaae8f345.mm.p788xd6f12a1a.a aVar, org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject.toString();
        this.f29081xff871e45 = aVar;
        long m45770x99879e0 = com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45770x99879e0(jSONObject2.getBytes(), android.os.Process.myTid(), android.os.SystemClock.elapsedRealtimeNanos());
        com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.m45781x1e0f1460(m45770x99879e0, this.f29080xe19ef73d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getParameters type:" + i17 + ", len: " + jSONObject2.length());
        try {
            java.lang.Thread.sleep(20L);
        } catch (java.lang.InterruptedException unused) {
        }
        return m45770x99879e0;
    }
}
