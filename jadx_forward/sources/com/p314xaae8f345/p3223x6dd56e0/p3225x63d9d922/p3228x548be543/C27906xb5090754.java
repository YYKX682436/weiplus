package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState */
/* loaded from: classes14.dex */
public class C27906xb5090754 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "NetFetchState";

    /* renamed from: appId */
    private java.lang.String f61876x58b7f1c;

    /* renamed from: configUrl */
    private java.lang.String f61879xd00ceacd;

    /* renamed from: sdkConfigData */
    private org.json.JSONObject f61884xa318de6;

    /* renamed from: localColorData */
    private java.lang.String f61882x15349282 = "";

    /* renamed from: actionSeqData */
    private java.lang.String f61875xc8dda993 = "";

    /* renamed from: needLocalConfig */
    private boolean f61883x7029d817 = false;

    /* renamed from: extraConfig */
    private java.lang.String f61881x35d0b772 = "";

    /* renamed from: controlConfig */
    private java.lang.String f61880x191f9aff = "";

    /* renamed from: changePointNum */
    private int f61878xac2fba6 = 2;

    /* renamed from: selectData */
    private org.json.JSONObject f61885x9d44bac6 = null;

    /* renamed from: backendProtoType */
    private int f61877x3340d90e = 0;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$4, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: $SwitchMap$com$tencent$youtu$sdkkitframework$framework$YtSDKKitFramework$YtSDKKitFrameworkWorkMode */
        static final /* synthetic */ int[] f61900x75f35c10;

        static {
            int[] iArr = new int[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.m120783xcee59d22().length];
            f61900x75f35c10 = iArr;
            try {
                iArr[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_OCR_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f61900x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_SILENT_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f61900x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f61900x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f61900x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.NetFetchState$NetworkCallback */
    /* loaded from: classes6.dex */
    public interface NetworkCallback {
        /* renamed from: onFailed */
        void m120864x428b6afc(int i17, java.lang.String str);

        /* renamed from: onSucceed */
        void m120865xe05b3f63(java.lang.String str);
    }

    /* renamed from: onReflectRequest */
    private void m120860x2c86bcd1() {
        com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.m121054x161b9920(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120705x76847179().f61787xb485b2a7, new com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.3
            @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult
            /* renamed from: onFailed */
            public void mo120861x428b6afc(int i17, java.lang.String str, java.lang.String str2) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, "network failed " + str + " fix " + str2);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(i17, str);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(i17, str, str2) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.3.2

                    /* renamed from: val$code1 */
                    final /* synthetic */ int f61897x4813b0a1;

                    /* renamed from: val$howToFix1 */
                    final /* synthetic */ java.lang.String f61898x788dc284;

                    /* renamed from: val$tips1 */
                    final /* synthetic */ java.lang.String f61899x4900b4b6;

                    {
                        this.f61897x4813b0a1 = i17;
                        this.f61899x4900b4b6 = str;
                        this.f61898x788dc284 = str2;
                        put("ui_error", java.lang.Integer.valueOf(i17));
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61595x18228504);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61513xf74540ee));
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61513xf74540ee, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61591x5cd5b948, "msg_net_error " + str + " " + str2));
                    }
                });
            }

            @Override // com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.C27922x714f0939.GetLiveStyleResult
            /* renamed from: onSuccess */
            public void mo120862xe05b4124(com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.InterfaceC27948xa14a9cf7.YTLiveStyleReq yTLiveStyleReq, com.p314xaae8f345.p3223x6dd56e0.p3230xaba1f400.p3235x295c977c.C27949xad84f366 c27949xad84f366) {
                ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this).f61739x83a477db.put("select_data", yTLiveStyleReq.f62528xcd0310d);
                if ((!android.text.TextUtils.isEmpty(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61882x15349282) && com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61883x7029d817) || com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61879xd00ceacd == null) {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, "Use local data");
                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this).f61739x83a477db.put("color_data", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61882x15349282);
                    ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this).f61739x83a477db.put("action_data", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61875xc8dda993);
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, "select data:" + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6);
                    if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6 != null) {
                        try {
                            if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6.has("config")) {
                                ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this).f61739x83a477db.put("control_config", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6.getString("config"));
                            }
                            if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6.has("reflect_param")) {
                                ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this).f61739x83a477db.put("extra_config", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6.getString("reflect_param"));
                            }
                            if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6.has("change_point_num")) {
                                ((com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb) com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this).f61739x83a477db.put("cp_num", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61885x9d44bac6.getString("change_point_num"));
                            }
                        } catch (org.json.JSONException e17) {
                            java.lang.String str = "Select data parse failed " + e17.getLocalizedMessage();
                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, str);
                            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402(str);
                        }
                    } else {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, "select data is null");
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402("select data is null");
                    }
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.mo120731xb14ae492();
                    return;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.GetLiveTypeReqData getLiveTypeReqData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.GetLiveTypeReqData();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData();
                getLiveTypeReqData.f62151x995f0f1f = netBaseInfoData;
                netBaseInfoData.f62187x58b7f1c = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61876x58b7f1c;
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.NetBaseInfoData netBaseInfoData2 = getLiveTypeReqData.f62151x995f0f1f;
                netBaseInfoData2.f62188x6573d8fb = "wx_default";
                netBaseInfoData2.lux = yTLiveStyleReq.f62528xcd0310d.f62521xc4dd1f7a.lux;
                getLiveTypeReqData.f62154xbd95845f = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61881x35d0b772;
                if (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61884xa318de6.has("control_config")) {
                    try {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754 c27906xb5090754 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this;
                        c27906xb5090754.f61880x191f9aff = c27906xb5090754.f61884xa318de6.getString("control_config");
                    } catch (org.json.JSONException e18) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, "Failed to parse json:" + e18.getLocalizedMessage());
                    }
                }
                getLiveTypeReqData.f62153x191f9aff = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61880x191f9aff;
                getLiveTypeReqData.f62152xda84a523 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61878xac2fba6;
                java.lang.String m120932x227c14d0 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27914xbe280b17.m120932x227c14d0(getLiveTypeReqData);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.TAG, "Use online data ---> on get config info: " + m120932x227c14d0);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120714xc6f9ce29(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61594x12ef6a31, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.this.f61879xd00ceacd, m120932x227c14d0, null, new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.3.1
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0239  */
                    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
                    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser
                    /* renamed from: onNetworkResponseEvent */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public void mo120776xd218dbca(java.util.HashMap<java.lang.String, java.lang.String> r22, java.lang.Exception r23) {
                        /*
                            Method dump skipped, instructions count: 618
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.AnonymousClass3.AnonymousClass1.mo120776xd218dbca(java.util.HashMap, java.lang.Exception):void");
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enter */
    public void mo120689x5c306d8() {
        super.mo120689x5c306d8();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>() { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.1
            {
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61594x12ef6a31);
            }
        });
        int i17 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.AnonymousClass4.f61900x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca().ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
            m120860x2c86bcd1();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: exit */
    public void mo120724x2fb91e() {
        super.mo120724x2fb91e();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f61884xa318de6 = jSONObject;
        super.mo120730xc7c4b6b1(str, jSONObject);
        try {
            java.lang.String string = jSONObject.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
            this.f61876x58b7f1c = string;
            if (string == null) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd, "yt_param_error");
            }
            if (jSONObject.has("config_api_url")) {
                this.f61879xd00ceacd = jSONObject.getString("config_api_url");
            }
            if (jSONObject.has("color_data")) {
                this.f61882x15349282 = jSONObject.getString("color_data");
            }
            if (jSONObject.has("local_config_flag")) {
                this.f61883x7029d817 = jSONObject.getBoolean("local_config_flag");
            }
            if (jSONObject.has("action_default_seq")) {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("action_default_seq");
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    this.f61875xc8dda993 += jSONArray.getString(i17);
                    if (i17 < jSONArray.length() - 1) {
                        this.f61875xc8dda993 += ",";
                    }
                }
            } else {
                this.f61875xc8dda993 = "0";
            }
            if (jSONObject.has("extra_config")) {
                this.f61881x35d0b772 = jSONObject.getString("extra_config");
            } else {
                this.f61881x35d0b772 = " version 2";
            }
            if (jSONObject.has("control_config")) {
                this.f61880x191f9aff = jSONObject.getString("control_config");
            }
            if (jSONObject.has("change_point_num")) {
                this.f61878xac2fba6 = jSONObject.getInt("change_point_num");
            }
            if (jSONObject.has("select_data")) {
                this.f61885x9d44bac6 = jSONObject.getJSONObject("select_data");
            }
            if (jSONObject.has("backend_proto_type")) {
                this.f61877x3340d90e = jSONObject.getInt("backend_proto_type");
            }
            if (jSONObject.has("net_request_timeout_ms")) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120771x2952f084(jSONObject.getInt("net_request_timeout_ms"));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "Failed to parse json:" + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        super.mo120731xb14ae492();
        try {
            int i17 = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.C27906xb5090754.AnonymousClass4.f61900x75f35c10[com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca().ordinal()];
            if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120719x424c1dc8(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.m120744x630af357(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27899xb2b52422.StateNameHelper.StateClassName.SILENT_STATE));
            } else {
                java.lang.String str = "Unknown work mode " + com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120707x7deac1ca();
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120662xefdead34(4194304, str);
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(str) { // from class: com.tencent.youtu.sdkkitframework.liveness.NetFetchState.2

                    /* renamed from: val$message */
                    final /* synthetic */ java.lang.String f61888x92b26584;

                    {
                        this.f61888x92b26584 = str;
                        put("ui_error", 4194304);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, 4194304);
                        put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(4194304, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61592x3eaf17b8, str));
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(TAG, "move to next stat failed " + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        super.mo120664x6761d4f();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: unload */
    public void mo120734xcde7deff() {
        super.mo120734xcde7deff();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27918x88ccc882.m121008x9cf0d20b().m121022xcde7deff();
    }
}
