package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState */
/* loaded from: classes14.dex */
public class C27907x6bbe48f6 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "NetLivenessReqResultState";

    /* renamed from: appId */
    private java.lang.String f61903x58b7f1c;

    /* renamed from: bestImage */
    private java.lang.Object f61905x4b9fb1d7;

    /* renamed from: finalConfidenceThreshold */
    private int f61909x490397ab;

    /* renamed from: resultUrl */
    private java.lang.String f61913x938bb412;

    /* renamed from: secretId */
    private java.lang.String f61914x38626beb;

    /* renamed from: secretKey */
    private java.lang.String f61915xd3eb198f;

    /* renamed from: userId */
    private java.lang.String f61917xce2b2e46;

    /* renamed from: needManualTrigger */
    private boolean f61910xc244a61c = false;

    /* renamed from: simiThreshold */
    private int f61916xff8c4619 = 70;

    /* renamed from: requestOptions */
    private java.util.HashMap<java.lang.String, java.lang.String> f61912x46e3fd0f = new java.util.HashMap<>();

    /* renamed from: actReflectType */
    private int f61902xd501b3a5 = 0;

    /* renamed from: backendProtoType */
    private int f61904x3340d90e = 0;

    /* renamed from: extraConfig */
    private java.lang.String f61908x35d0b772 = "";

    /* renamed from: controlConfig */
    private java.lang.String f61907x191f9aff = "";

    /* renamed from: changePointNum */
    private int f61906xac2fba6 = 2;

    /* renamed from: actRefUXMode */
    private int f61901x538e98c7 = 0;

    /* renamed from: needVideoData */
    boolean f61911x772ba2cf = true;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$10, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass10 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        static final /* synthetic */ int[] f61919x75f35c10;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.m120783xcee59d22().length];
            f61919x75f35c10 = iArr;
            try {
                iArr[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f61919x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f61919x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f61919x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$FivePoints */
    /* loaded from: classes14.dex */
    public class FivePoints {

        /* renamed from: points */
        public java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.Pointf> f61932xc56c5ce3;

        public FivePoints() {
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$Pointf */
    /* loaded from: classes14.dex */
    public class Pointf {

        /* renamed from: x, reason: collision with root package name */
        public float f302187x;

        /* renamed from: y, reason: collision with root package name */
        public float f302188y;

        public Pointf() {
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState$Version */
    /* loaded from: classes14.dex */
    public class Version {

        /* renamed from: sdk_version */
        public java.lang.String f61938xe98ba5d3 = "";

        /* renamed from: ftrack_sdk_version */
        public java.lang.String f61937x2c317539 = "";

        /* renamed from: freflect_sdk_version */
        public java.lang.String f61936x5f4e112b = "";

        /* renamed from: faction_sdk_version */
        public java.lang.String f61935xdfe0d430 = "";

        public Version() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:11|(4:12|13|14|15)|(3:20|21|(12:23|(3:45|46|(6:48|26|27|(3:38|(1:44)(1:42)|43)(3:32|(1:34)|35)|36|37))|25|26|27|(1:30)|38|(1:40)|44|43|36|37)(9:56|27|(0)|38|(0)|44|43|36|37))|57|(1:59)(2:69|(1:71)(2:72|(1:74)(1:75)))|(2:64|65)(1:61)|62|63|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[Catch: JSONException -> 0x00d6, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00d6, blocks: (B:21:0x00be, B:23:0x00c4, B:63:0x00a7), top: B:62:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* renamed from: handleResponseEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m120869x65aaf191(java.util.HashMap<java.lang.String, java.lang.String> r19, java.lang.Exception r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.m120869x65aaf191(java.util.HashMap, java.lang.Exception):void");
    }

    /* renamed from: makeActionStr */
    public static java.lang.String m120870x97ed79cd(java.lang.String[] strArr) {
        java.lang.String str = "";
        for (int i17 = 0; i17 < strArr.length; i17++) {
            int parseInt = java.lang.Integer.parseInt(strArr[i17]);
            if (parseInt == 0 || parseInt == 1) {
                str = str + "blink";
            } else if (parseInt == 2) {
                str = str + "mouth";
            } else if (parseInt == 3) {
                str = str + "node";
            } else if (parseInt == 4) {
                str = str + "shake";
            } else if (parseInt == 5) {
                str = str + "silence";
            }
            if (i17 != strArr.length - 1) {
                str = str + ",";
            }
        }
        return str;
    }

    /* renamed from: onActReflectRequest */
    private void m120871xd385be25() {
        java.lang.String str;
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE));
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE));
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca c27890x2eae4aca = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca) m120706x4137e3d2.m120725x63c3c5c("best_frame");
            this.f61905x4b9fb1d7 = c27890x2eae4aca;
            this.f61739x83a477db.put("best_frame", c27890x2eae4aca);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d3 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECT_STATE));
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27936xa7cd6797 c27936xa7cd6797 = (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27936xa7cd6797) m120706x4137e3d3.m120725x63c3c5c("reflect_request_object");
            java.lang.String m120870x97ed79cd = m120870x97ed79cd((java.lang.String[]) m120706x4137e3d2.m120725x63c3c5c("action_seq"));
            if (m120706x4137e3d2.m120725x63c3c5c("frames") instanceof java.lang.String) {
                str = m120706x4137e3d2.m120725x63c3c5c("frames").toString();
            } else {
                byte[] bArr = (byte[]) m120706x4137e3d2.m120725x63c3c5c("frames");
                if (bArr == null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.w(TAG, "action data is null");
                    str = null;
                } else {
                    str = new java.lang.String(android.util.Base64.encode(bArr, 2));
                }
            }
            java.lang.String str2 = (java.lang.String) m120706x4137e3d.m120725x63c3c5c("control_config");
            if (str2 != null) {
                this.f61907x191f9aff = str2;
            }
            java.lang.String str3 = (java.lang.String) m120706x4137e3d.m120725x63c3c5c("extra_config");
            if (str3 != null) {
                this.f61908x35d0b772 = str3;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "extraconfig:" + this.f61908x35d0b772);
            }
            java.lang.String str4 = (java.lang.String) m120706x4137e3d3.m120725x63c3c5c("refcontrol_begin");
            if (str4 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str5 = this.f61908x35d0b772;
                if (str5 == null) {
                    str5 = "";
                }
                sb6.append(str5);
                sb6.append(" refcontrol_begin ");
                sb6.append(str4);
                this.f61908x35d0b772 = sb6.toString();
            }
            java.lang.String str6 = (java.lang.String) m120706x4137e3d.m120725x63c3c5c("cp_num");
            if (str6 != null) {
                this.f61906xac2fba6 = java.lang.Integer.parseInt(str6);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "cpnum:" + this.f61906xac2fba6);
            }
            m120876xc5f4eb0c();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ActionReflectLiveReqData actionReflectLiveReqData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ActionReflectLiveReqData();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData();
            actionReflectLiveReqData.f62122x995f0f1f = netBaseInfoData;
            netBaseInfoData.f62193x243a3e51 = java.util.UUID.randomUUID().toString();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData2 = actionReflectLiveReqData.f62122x995f0f1f;
            netBaseInfoData2.f62187x58b7f1c = this.f61903x58b7f1c;
            netBaseInfoData2.f62188x6573d8fb = "";
            actionReflectLiveReqData.f62123x760b29ad = c27936xa7cd6797.f62445x4cd79f06;
            if (this.f61911x772ba2cf) {
                actionReflectLiveReqData.f62121x5de217e5 = str != null ? str : "";
            } else {
                actionReflectLiveReqData.f62121x5de217e5 = "";
            }
            actionReflectLiveReqData.f62120xbd1941b = m120870x97ed79cd;
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce c27946x2eb0bfce = c27936xa7cd6797.f62448x1f5a6dcd;
            actionReflectLiveReqData.f62126xad39e5aa = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(c27946x2eb0bfce.f62512x5faa95b, c27946x2eb0bfce.f62511x3f7cd710, c27946x2eb0bfce.f62510x5b9b5c43);
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce c27946x2eb0bfce2 = c27936xa7cd6797.f62451x4c2657e3;
            actionReflectLiveReqData.f62129x74dd60d4 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(c27946x2eb0bfce2.f62512x5faa95b, c27946x2eb0bfce2.f62511x3f7cd710, c27946x2eb0bfce2.f62510x5b9b5c43);
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27946x2eb0bfce c27946x2eb0bfce3 = c27936xa7cd6797.f62449x47c45c48;
            actionReflectLiveReqData.f62127x3aeabbcf = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(c27946x2eb0bfce3.f62512x5faa95b, c27946x2eb0bfce3.f62511x3f7cd710, c27946x2eb0bfce3.f62510x5b9b5c43);
            actionReflectLiveReqData.f62131x235c9407 = c27936xa7cd6797.f62453x49b37fec;
            actionReflectLiveReqData.f62122x995f0f1f.lux = c27936xa7cd6797.f62455xcd0310d.f62521xc4dd1f7a.lux;
            actionReflectLiveReqData.f62130xbd95845f = this.f61908x35d0b772;
            actionReflectLiveReqData.f62125x191f9aff = this.f61907x191f9aff;
            actionReflectLiveReqData.f62124xda84a523 = this.f61906xac2fba6;
            java.lang.String m120929x12a82579 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.m120929x12a82579(actionReflectLiveReqData, str != null);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "uploadString: " + m120929x12a82579);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120714xc6f9ce29(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61596xd22205cc, this.f61913x938bb412, m120929x12a82579, null, new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.8
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser
                /* renamed from: onNetworkResponseEvent */
                public void mo120776xd218dbca(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.TAG, "handle actreflect response");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120869x65aaf191(hashMap, exc);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120873x89e8e30();
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "actrefl request failed" + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("actrefl request failed: " + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(e17) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.9

                /* renamed from: val$e */
                final /* synthetic */ java.lang.Exception f61931x6ac87a2;

                {
                    this.f61931x6ac87a2 = e17;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61513xf74540ee));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61513xf74540ee, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61591x5cd5b948, e17.getLocalizedMessage()));
                }
            });
        }
    }

    /* renamed from: onActionRequest */
    private void m120872xc71ca7da() {
        java.lang.String str;
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.ACTION_STATE));
            if (m120706x4137e3d == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("action request action state is null");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "action request action state is null");
                return;
            }
            this.f61905x4b9fb1d7 = (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca) m120706x4137e3d.m120725x63c3c5c("best_frame");
            if (m120706x4137e3d.m120725x63c3c5c("frames") instanceof java.lang.String) {
                str = (java.lang.String) m120706x4137e3d.m120725x63c3c5c("frames");
            } else {
                byte[] bArr = (byte[]) m120706x4137e3d.m120725x63c3c5c("frames");
                str = bArr == null ? "" : new java.lang.String(android.util.Base64.encode(bArr, 2));
            }
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "action data is null");
            }
            java.lang.String m120870x97ed79cd = m120870x97ed79cd((java.lang.String[]) m120706x4137e3d.m120725x63c3c5c("action_seq"));
            m120876xc5f4eb0c();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ActionLiveReqData actionLiveReqData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ActionLiveReqData();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData();
            actionLiveReqData.f62093x995f0f1f = netBaseInfoData;
            netBaseInfoData.f62187x58b7f1c = this.f61903x58b7f1c;
            netBaseInfoData.f62193x243a3e51 = java.util.UUID.randomUUID().toString();
            actionLiveReqData.f62094x4b9fb1d7 = new java.lang.String(android.util.Base64.encode(((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27890x2eae4aca) this.f61905x4b9fb1d7).f61647x723a620d, 2));
            actionLiveReqData.f62091xbd1941b = m120870x97ed79cd;
            if (this.f61911x772ba2cf) {
                actionLiveReqData.f62092x5de217e5 = str;
            } else {
                actionLiveReqData.f62092x5de217e5 = "";
            }
            actionLiveReqData.f62098x18d2543e = true;
            actionLiveReqData.f62100x552663d4 = true;
            actionLiveReqData.f62101xbd95845f = this.f61908x35d0b772;
            actionLiveReqData.f62097x191f9aff = this.f61907x191f9aff;
            actionLiveReqData.f62095xda84a523 = this.f61906xac2fba6;
            actionLiveReqData.f62096xaf3f8342 = (java.lang.String) m120706x4137e3d.m120725x63c3c5c("config");
            actionLiveReqData.f62102xfab1ced2 = "";
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120714xc6f9ce29(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61596xd22205cc, this.f61913x938bb412, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.m120928x92865ae(actionLiveReqData), null, new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.4
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser
                /* renamed from: onNetworkResponseEvent */
                public void mo120776xd218dbca(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.TAG, "Handle action response");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120869x65aaf191(hashMap, exc);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120873x89e8e30();
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "action request failed" + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("action request failed: " + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(e17) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.5

                /* renamed from: val$e */
                final /* synthetic */ java.lang.Exception f61925x6ac87a2;

                {
                    this.f61925x6ac87a2 = e17;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9, e17.getLocalizedMessage()));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCheckResponseManual */
    public void m120873x89e8e30() {
        if (this.f61910xc244a61c) {
            try {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805 m120703x9cf0d20b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName stateClassName = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE;
                m120703x9cf0d20b.m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(stateClassName)).mo120729x475c0edf("reset_manual_trigger", null);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(stateClassName));
            } catch (java.lang.Exception e17) {
                java.lang.String str = "on Check response manual failed " + e17.getLocalizedMessage();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, str);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402(str);
            }
        }
    }

    /* renamed from: onReflectRequest */
    private void m120874x2c86bcd1() {
        java.lang.String m120936x89afd423;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120562xef0abd8c("reflect_request_s1");
        try {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE));
            this.f61905x4b9fb1d7 = (android.graphics.YuvImage) m120706x4137e3d.m120725x63c3c5c("best_image");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            ((android.graphics.YuvImage) this.f61905x4b9fb1d7).compressToJpeg(new android.graphics.Rect(0, 0, ((android.graphics.YuvImage) this.f61905x4b9fb1d7).getWidth(), ((android.graphics.YuvImage) this.f61905x4b9fb1d7).getHeight()), 95, byteArrayOutputStream);
            byte[] encode = android.util.Base64.encode(byteArrayOutputStream.toByteArray(), 2);
            this.f61739x83a477db.put("best_frame", this.f61905x4b9fb1d7);
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d2 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.REFLECT_STATE));
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb m120706x4137e3d3 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.NET_FETCH_STATE));
            com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27945x8bacc6b5 c27945x8bacc6b5 = (com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.jni.p3233x633fb29.C27945x8bacc6b5) m120706x4137e3d2.m120725x63c3c5c("reflect_request_object");
            java.lang.String str = (java.lang.String) m120706x4137e3d3.m120725x63c3c5c("extra_config");
            if (str != null) {
                this.f61908x35d0b772 = str;
            }
            java.lang.String str2 = (java.lang.String) m120706x4137e3d2.m120725x63c3c5c("refcontrol_begin");
            if (str2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str3 = this.f61908x35d0b772;
                if (str3 == null) {
                    str3 = "";
                }
                sb6.append(str3);
                sb6.append(" refcontrol_begin ");
                sb6.append(str2);
                this.f61908x35d0b772 = sb6.toString();
            }
            java.lang.String str4 = (java.lang.String) m120706x4137e3d3.m120725x63c3c5c("cp_num");
            if (str4 != null) {
                this.f61906xac2fba6 = java.lang.Integer.parseInt(str4);
            }
            c27945x8bacc6b5.f62509x630ddf64 = java.util.UUID.randomUUID().toString();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ReflectLiveReqData reflectLiveReqData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ReflectLiveReqData();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData();
            reflectLiveReqData.f62233x995f0f1f = netBaseInfoData;
            netBaseInfoData.f62187x58b7f1c = this.f61903x58b7f1c;
            netBaseInfoData.f62193x243a3e51 = java.util.UUID.randomUUID().toString();
            reflectLiveReqData.f62233x995f0f1f.f62188x6573d8fb = this.f61912x46e3fd0f.containsKey("business_id") ? this.f61912x46e3fd0f.get("business_id") : null;
            reflectLiveReqData.f62233x995f0f1f.f62190x1a6a2350 = this.f61912x46e3fd0f.containsKey("person_id") ? this.f61912x46e3fd0f.get("person_id") : null;
            reflectLiveReqData.f62233x995f0f1f.f62191x2873ec2f = this.f61912x46e3fd0f.containsKey("person_type") ? this.f61912x46e3fd0f.get("person_type") : null;
            reflectLiveReqData.f62233x995f0f1f.f62192x41403cf8 = this.f61912x46e3fd0f.containsKey("req_type") ? this.f61912x46e3fd0f.get("req_type") : null;
            reflectLiveReqData.f62233x995f0f1f.f62189x54805e46 = this.f61912x46e3fd0f.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54530xa4e1ea94) ? java.lang.Integer.parseInt(this.f61912x46e3fd0f.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54530xa4e1ea94)) : 0;
            reflectLiveReqData.f62236x760b29ad = c27945x8bacc6b5.f62501x4cd79f06;
            reflectLiveReqData.f62239x3aeabbcf = new java.lang.String(encode);
            reflectLiveReqData.f62241x235c9407 = c27945x8bacc6b5.f62506x49b37fec;
            reflectLiveReqData.f62238xaf3f8342 = this.f61908x35d0b772;
            reflectLiveReqData.f62237xda84a523 = this.f61906xac2fba6;
            if (this.f61904x3340d90e == 2) {
                android.graphics.YuvImage yuvImage = (android.graphics.YuvImage) m120706x4137e3d.m120725x63c3c5c("best_image");
                float[] fArr = (float[]) m120706x4137e3d.m120725x63c3c5c("best_shape");
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, ((android.graphics.YuvImage) this.f61905x4b9fb1d7).getWidth(), ((android.graphics.YuvImage) this.f61905x4b9fb1d7).getHeight()), 95, byteArrayOutputStream2);
                reflectLiveReqData.f62234x4b9fb1d7 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(byteArrayOutputStream2.toByteArray(), fArr, (java.lang.String) null);
                android.graphics.YuvImage yuvImage2 = (android.graphics.YuvImage) m120706x4137e3d.m120725x63c3c5c("openmouth_image");
                float[] fArr2 = (float[]) m120706x4137e3d.m120725x63c3c5c("openmouth_shape");
                java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
                yuvImage2.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage2.getWidth(), yuvImage2.getHeight()), 95, byteArrayOutputStream3);
                reflectLiveReqData.f62240x37878ebe = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(byteArrayOutputStream3.toByteArray(), fArr2, (java.lang.String) null);
                android.graphics.YuvImage yuvImage3 = (android.graphics.YuvImage) m120706x4137e3d.m120725x63c3c5c("closeeye_image");
                float[] fArr3 = (float[]) m120706x4137e3d.m120725x63c3c5c("closeeye_shape");
                java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                yuvImage3.compressToJpeg(new android.graphics.Rect(0, 0, yuvImage3.getWidth(), yuvImage3.getHeight()), 95, byteArrayOutputStream4);
                reflectLiveReqData.f62235xf7d8afc2 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(byteArrayOutputStream4.toByteArray(), fArr3, (java.lang.String) null);
                m120936x89afd423 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.m120934x734e17af(reflectLiveReqData);
            } else {
                m120936x89afd423 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.m120936x89afd423(reflectLiveReqData);
            }
            java.lang.String str5 = m120936x89afd423;
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "begin request...uploadsize " + str5.length());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120563xc6f9aa7e("reflect_request_s1");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120562xef0abd8c("reflect_request_s2");
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120714xc6f9ce29(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61596xd22205cc, this.f61913x938bb412, str5, null, new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.6
                @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser
                /* renamed from: onNetworkResponseEvent */
                public void mo120776xd218dbca(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120563xc6f9aa7e("reflect_request_s2");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120562xef0abd8c("reflect_request_s3");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.TAG, "handle reflection response");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120869x65aaf191(hashMap, exc);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120563xc6f9aa7e("reflect_request_s3");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120873x89e8e30();
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "reflection request failed" + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("reflection request failed: " + e17.getLocalizedMessage());
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(e17) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.7

                /* renamed from: val$e */
                final /* synthetic */ java.lang.Exception f61928x6ac87a2;

                {
                    this.f61928x6ac87a2 = e17;
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd));
                    put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9, e17.getLocalizedMessage()));
                }
            });
        }
    }

    /* renamed from: onSilentRequest */
    private void m120875x1d3440db() {
        android.graphics.YuvImage yuvImage = (android.graphics.YuvImage) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120706x4137e3d(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE)).m120725x63c3c5c("best_image");
        this.f61905x4b9fb1d7 = yuvImage;
        int width = yuvImage.getWidth();
        int height = ((android.graphics.YuvImage) this.f61905x4b9fb1d7).getHeight();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ((android.graphics.YuvImage) this.f61905x4b9fb1d7).compressToJpeg(new android.graphics.Rect(0, 0, width, height), 95, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.PictureLiveReqData pictureLiveReqData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.PictureLiveReqData();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData();
        pictureLiveReqData.f62220x995f0f1f = netBaseInfoData;
        netBaseInfoData.f62193x243a3e51 = java.util.UUID.randomUUID().toString();
        pictureLiveReqData.f62220x995f0f1f.f62187x58b7f1c = this.f61903x58b7f1c;
        pictureLiveReqData.f62221xcba35ca9 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.ImageInfo(byteArray, (float[]) null, (java.lang.String) null);
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120714xc6f9ce29(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61596xd22205cc, this.f61913x938bb412, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.m120935xee78f2c2(pictureLiveReqData), null, new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.2
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser
            /* renamed from: onNetworkResponseEvent */
            public void mo120776xd218dbca(java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.Exception exc) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.TAG, "Parse silent response");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120869x65aaf191(hashMap, exc);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.this.m120873x89e8e30();
            }
        });
    }

    /* renamed from: parseControlConfig */
    private void m120876xc5f4eb0c() {
        if (android.text.TextUtils.isEmpty(this.f61907x191f9aff)) {
            return;
        }
        java.lang.String[] split = this.f61907x191f9aff.split("&");
        if (split.length > 0) {
            for (java.lang.String str : split) {
                java.lang.String[] split2 = str.split("=");
                if (split2.length > 1) {
                    if (split2[0].equals("need_action_video") && split2[1].equals("false")) {
                        this.f61911x772ba2cf = false;
                    }
                    if (split2[0].equals("actref_ux_mode")) {
                        this.f61901x538e98c7 = java.lang.Integer.parseInt(split2[1]);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetLivenessReqResultState.1
            {
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61527x98b092bc);
            }
        });
        int i17 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27907x6bbe48f6.AnonymousClass10.f61919x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca().ordinal()];
        if (i17 == 1 || i17 == 2) {
            m120872xc71ca7da();
        } else if (i17 == 3) {
            m120874x2c86bcd1();
        } else {
            if (i17 != 4) {
                return;
            }
            m120871xd385be25();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            this.f61903x58b7f1c = jSONObject.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
            java.lang.String string = jSONObject.getString("result_api_url");
            this.f61913x938bb412 = string;
            if (string == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd, "yt_param_error");
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "parse url failed");
                return;
            }
            if (jSONObject.has("secret_key")) {
                this.f61915xd3eb198f = jSONObject.getString("secret_key");
            }
            if (jSONObject.has("secret_id")) {
                this.f61914x38626beb = jSONObject.getString("secret_id");
            }
            if (jSONObject.has("user_id")) {
                this.f61917xce2b2e46 = jSONObject.getString("user_id");
            }
            if (jSONObject.has("similarity_threshold")) {
                this.f61916xff8c4619 = jSONObject.getInt("similarity_threshold");
            }
            if (jSONObject.has("final_liveness_confidence_threshold")) {
                this.f61909x490397ab = jSONObject.getInt("final_liveness_confidence_threshold");
            } else {
                this.f61909x490397ab = 85;
            }
            if (jSONObject.has("extra_config")) {
                this.f61908x35d0b772 = jSONObject.getString("extra_config");
            } else {
                this.f61908x35d0b772 = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.f61907x191f9aff = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f61906xac2fba6 = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("manual_trigger")) {
                this.f61910xc244a61c = jSONObject.getBoolean("manual_trigger");
            }
            if (jSONObject.has("request_options")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("request_options");
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    this.f61912x46e3fd0f.put(next, jSONObject2.getString(next));
                }
            }
            if (jSONObject.has("backend_proto_type")) {
                this.f61904x3340d90e = jSONObject.getInt("backend_proto_type");
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: unload */
    public void mo120734xcde7deff() {
        super.mo120734xcde7deff();
    }
}
