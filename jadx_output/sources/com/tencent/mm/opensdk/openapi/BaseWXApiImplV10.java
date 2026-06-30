package com.tencent.mm.opensdk.openapi;

/* loaded from: classes9.dex */
class BaseWXApiImplV10 implements com.tencent.mm.opensdk.openapi.IWXAPI {
    protected static final java.lang.String TAG = "MicroMsg.SDK.WXApiImplV10";
    private static java.lang.String wxappPayEntryClassname;
    private byte _hellAccFlag_;
    protected java.lang.String appId;
    protected boolean checkSignature;
    protected android.content.Context context;
    protected boolean detached = false;
    private int launchMode;
    private com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper securityHelper;
    private int wxSdkVersion;

    public BaseWXApiImplV10(android.content.Context context, java.lang.String str, boolean z17, int i17) {
        this.checkSignature = false;
        this.launchMode = 2;
        com.tencent.mm.opensdk.utils.Log.d(TAG, "<init>, appId = " + str + ", checkSignature = " + z17 + ", launchMode = " + i17);
        this.context = context;
        this.appId = str;
        this.checkSignature = z17;
        this.launchMode = i17;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        com.tencent.mm.opensdk.utils.d.D = context;
        this.securityHelper = new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackReq(com.tencent.mm.opensdk.openapi.SendReqCallback sendReqCallback, boolean z17) {
        if (sendReqCallback != null) {
            sendReqCallback.onSendFinish(z17);
        }
    }

    private boolean checkSumConsistent(byte[] bArr, byte[] bArr2) {
        java.lang.String str;
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            str = "checkSumConsistent fail, invalid arguments";
        } else {
            if (bArr.length == bArr2.length) {
                for (int i17 = 0; i17 < bArr.length; i17++) {
                    if (bArr[i17] != bArr2[i17]) {
                        return false;
                    }
                }
                return true;
            }
            str = "checkSumConsistent fail, length is different";
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
    }

    private boolean createChatroom(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new java.lang.String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean doLaunchApp(android.os.Bundle bundle) {
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.bundle = bundle;
        args.content = "weixin://sendreq?appid=" + this.appId;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        args.launchMode = this.launchMode;
        try {
            java.lang.String tokenFromWX = getTokenFromWX(this.context);
            if (tokenFromWX != null) {
                args.token = tokenFromWX;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getTokenFromWX fail, exception = ".concat(java.lang.String.valueOf(e17)));
        }
        return com.tencent.mm.opensdk.channel.MMessageActV2.send(this.context, args);
    }

    private java.lang.String finderShareVideoJumpInfoToString(com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo iWXChannelJumpInfo) {
        java.lang.String str;
        java.lang.String str2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("jumpType", iWXChannelJumpInfo.type());
            if (iWXChannelJumpInfo instanceof com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo) {
                jSONObject.put("wording", ((com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo) iWXChannelJumpInfo).wording);
                jSONObject.put("extra", ((com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo) iWXChannelJumpInfo).extra);
                if (iWXChannelJumpInfo instanceof com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo) {
                    jSONObject.put(dm.i4.COL_USERNAME, ((com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo) iWXChannelJumpInfo).username);
                    str = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
                    str2 = ((com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo) iWXChannelJumpInfo).path;
                } else if (iWXChannelJumpInfo instanceof com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo) {
                    str = "url";
                    str2 = ((com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo) iWXChannelJumpInfo).url;
                }
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private java.lang.String getTokenFromWX(android.content.Context context) {
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, new java.lang.String[]{this.appId, "638067712"}, null);
        if (query == null || !query.moveToFirst()) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include 'com.tencent.mm' in a set of <package> elements inside the <queries> element");
            return null;
        }
        java.lang.String string = query.getString(0);
        com.tencent.mm.opensdk.utils.Log.i(TAG, "getTokenFromWX token is ".concat(java.lang.String.valueOf(string)));
        query.close();
        return string;
    }

    private boolean handleWxInternalRespType(java.lang.String str, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler iWXAPIEventHandler) {
        android.net.Uri parse;
        java.lang.String queryParameter;
        com.tencent.mm.opensdk.utils.Log.i(TAG, "handleWxInternalRespType, extInfo = ".concat(java.lang.String.valueOf(str)));
        try {
            parse = android.net.Uri.parse(str);
            queryParameter = parse.getQueryParameter("wx_internal_resptype");
            com.tencent.mm.opensdk.utils.Log.i(TAG, "handleWxInternalRespType, respType = ".concat(java.lang.String.valueOf(queryParameter)));
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "handleWxInternalRespType fail, ex = " + e17.getMessage());
        }
        if (com.tencent.mm.opensdk.utils.d.b(queryParameter)) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "handleWxInternalRespType fail, respType is null");
            return false;
        }
        if (queryParameter.equals("subscribemessage")) {
            com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Resp resp = new com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Resp();
            java.lang.String queryParameter2 = parse.getQueryParameter("ret");
            if (queryParameter2 != null && queryParameter2.length() > 0) {
                resp.errCode = com.tencent.mm.opensdk.utils.d.c(queryParameter2);
            }
            resp.openId = parse.getQueryParameter(com.google.android.gms.common.Scopes.OPEN_ID);
            resp.templateID = parse.getQueryParameter("template_id");
            resp.scene = com.tencent.mm.opensdk.utils.d.c(parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            resp.action = parse.getQueryParameter("action");
            resp.reserved = parse.getQueryParameter("reserved");
            iWXAPIEventHandler.onResp(resp);
            return true;
        }
        if (queryParameter.contains("invoice_auth_insert")) {
            com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Resp resp2 = new com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Resp();
            java.lang.String queryParameter3 = parse.getQueryParameter("ret");
            if (queryParameter3 != null && queryParameter3.length() > 0) {
                resp2.errCode = com.tencent.mm.opensdk.utils.d.c(queryParameter3);
            }
            resp2.wxOrderId = parse.getQueryParameter("wx_order_id");
            iWXAPIEventHandler.onResp(resp2);
            return true;
        }
        if (queryParameter.contains("payinsurance")) {
            com.tencent.mm.opensdk.modelbiz.WXPayInsurance.Resp resp3 = new com.tencent.mm.opensdk.modelbiz.WXPayInsurance.Resp();
            java.lang.String queryParameter4 = parse.getQueryParameter("ret");
            if (queryParameter4 != null && queryParameter4.length() > 0) {
                resp3.errCode = com.tencent.mm.opensdk.utils.d.c(queryParameter4);
            }
            resp3.wxOrderId = parse.getQueryParameter("wx_order_id");
            iWXAPIEventHandler.onResp(resp3);
            return true;
        }
        if (queryParameter.contains("nontaxpay")) {
            com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Resp resp4 = new com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Resp();
            java.lang.String queryParameter5 = parse.getQueryParameter("ret");
            if (queryParameter5 != null && queryParameter5.length() > 0) {
                resp4.errCode = com.tencent.mm.opensdk.utils.d.c(queryParameter5);
            }
            resp4.wxOrderId = parse.getQueryParameter("wx_order_id");
            iWXAPIEventHandler.onResp(resp4);
            return true;
        }
        if (!"subscribeminiprogrammsg".equals(queryParameter) && !"5".equals(queryParameter)) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "this open sdk version not support the request type");
            return false;
        }
        com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Resp resp5 = new com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Resp();
        java.lang.String queryParameter6 = parse.getQueryParameter("ret");
        if (queryParameter6 != null && queryParameter6.length() > 0) {
            resp5.errCode = com.tencent.mm.opensdk.utils.d.c(queryParameter6);
        }
        resp5.openId = parse.getQueryParameter(com.google.android.gms.common.Scopes.OPEN_ID);
        resp5.unionId = parse.getQueryParameter("unionid");
        resp5.nickname = parse.getQueryParameter("nickname");
        resp5.errStr = parse.getQueryParameter("errmsg");
        iWXAPIEventHandler.onResp(resp5);
        return true;
    }

    private boolean joinChatroom(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new java.lang.String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private void launchWXIfNeed() {
        if (android.os.Build.VERSION.SDK_INT < 29 || this.launchMode != 2) {
            openWXApp();
        } else {
            launchWXUsingPendingIntent();
        }
    }

    private void launchWXUsingPendingIntent() {
        android.app.PendingIntent activity;
        if (this.detached) {
            throw new java.lang.IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (!isWXAppInstalled()) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "openWXApp failed, not installed or signature check failed");
            return;
        }
        try {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "launchWXUsingPendingIntent");
            android.content.Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
            if (android.os.Build.VERSION.SDK_INT < 35) {
                activity = android.app.PendingIntent.getActivity(this.context, 1, launchIntentForPackage, 201326592);
            } else {
                if (launchIntentForPackage == null) {
                    throw new java.lang.NullPointerException("getLaunchIntentForPackage is null");
                }
                android.app.ActivityOptions makeBasic = android.app.ActivityOptions.makeBasic();
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
                activity = android.app.PendingIntent.getActivity(this.context, 1, launchIntentForPackage, 201326592, makeBasic.toBundle());
            }
            activity.send(this.context, 2, null, new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.3
                @Override // android.app.PendingIntent.OnFinished
                public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
                    com.tencent.mm.opensdk.utils.Log.d(com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.TAG, "onSendFinished resultCode: " + i17 + ", resultData: " + str);
                }
            }, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "launchWXUsingPendingIntent pendingIntent send failed: " + e17.getMessage());
            openWXApp();
        }
    }

    private boolean sendAddCardToWX(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new java.lang.String[]{this.appId, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendBizPublishWithImageReq(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        java.lang.String json = ((com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.Req) baseReq).toJson();
        if (json == null) {
            return false;
        }
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/bizPublishWithImage"), null, null, new java.lang.String[]{this.appId, json}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendChooseCardFromWX(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new java.lang.String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderBind(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderBind");
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderBind"), null, null, new java.lang.String[]{this.appId, baseReq.openId}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderOpenEvent(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderOpenEvent");
        com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Req req = (com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenEvent"), null, null, new java.lang.String[]{this.appId, req.username, req.eventId, req.extInfo}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderOpenFeed(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderOpenFeed");
        com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed.Req req = (com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenFeed"), null, null, new java.lang.String[]{this.appId, req.feedID, req.nonceID, java.lang.String.valueOf(req.notGetReleatedList)}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderOpenLive(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderOpenLive");
        com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive.Req req = (com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenLive"), null, null, new java.lang.String[]{this.appId, req.feedID, req.nonceID}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderOpenProfile(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderOpenProfile");
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenProfile"), null, null, new java.lang.String[]{this.appId, ((com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile.Req) baseReq).userName}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderShareVideo(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderShareVideo");
        com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Req req = (com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderShareVideo"), null, null, new java.lang.String[]{this.appId, req.videoPath, "", "", req.extData, finderShareVideoJumpInfoToString(req.jumpInfo)}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendFinderStartLive(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendFinderStartLive");
        com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Req req = (com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderStartLive"), null, null, new java.lang.String[]{this.appId, req.liveJsonInfo, req.openId}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendGetA8KeyReq(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/getA8Key"), null, null, new java.lang.String[]{this.appId, ((com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Req) baseReq).url}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendHandleScanResult(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new java.lang.String[]{this.appId, bundle.getString("_wxapi_scan_qrcode_result")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendInvoiceAuthInsert(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.appId, "2", java.net.URLEncoder.encode(java.lang.String.format("url=%s", java.net.URLEncoder.encode(((com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Req) baseReq).url)))}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendJumpToOfflinePayReq(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"), null, null, new java.lang.String[]{this.appId}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendLaunchWXMiniprogram(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Req req = (com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Req) baseReq;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        java.lang.String str = this.appId;
        java.lang.String str2 = req.userName;
        java.lang.String str3 = req.path;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(req.miniprogramType);
        android.database.Cursor query = contentResolver.query(parse, null, null, new java.lang.String[]{str, str2, str3, sb6.toString(), req.extData}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendLaunchWXMiniprogramWithToken(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken"), null, null, new java.lang.String[]{this.appId, ((com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken.Req) baseReq).token}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendNonTaxPay(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.appId, "3", java.net.URLEncoder.encode(java.lang.String.format("url=%s", java.net.URLEncoder.encode(((com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Req) baseReq).url)))}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenBusiLuckyMoney(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new java.lang.String[]{this.appId, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenBusinessView(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Req req = (com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessView"), null, null, new java.lang.String[]{this.appId, req.businessType, req.query, req.extInfo, req.transaction, req.openId}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenBusinessWebview(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Req req = (com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Req) baseReq;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = req.queryInfo;
        java.lang.String jSONObject = (hashMap == null || hashMap.size() <= 0) ? "" : new org.json.JSONObject(req.queryInfo).toString();
        java.lang.String str = this.appId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(req.businessType);
        android.database.Cursor query = contentResolver.query(parse, null, null, new java.lang.String[]{str, sb6.toString(), jSONObject}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenCustomerServiceChat(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat.Req req = (com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat"), null, null, new java.lang.String[]{this.appId, req.corpId, req.url}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenRankListReq(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new java.lang.String[0], null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendOpenWebview(android.content.Context context, android.os.Bundle bundle) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new java.lang.String[]{this.appId, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendPayInSurance(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.appId, "4", java.net.URLEncoder.encode(java.lang.String.format("url=%s", java.net.URLEncoder.encode(((com.tencent.mm.opensdk.modelbiz.WXPayInsurance.Req) baseReq).url)))}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendPayReq(android.content.Context context, android.os.Bundle bundle) {
        if (wxappPayEntryClassname == null) {
            wxappPayEntryClassname = new com.tencent.mm.opensdk.openapi.MMSharedPreferences(context).getString("_wxapp_pay_entry_classname_", null);
            com.tencent.mm.opensdk.utils.Log.d(TAG, "pay, set wxappPayEntryClassname = " + wxappPayEntryClassname);
            if (wxappPayEntryClassname == null) {
                try {
                    wxappPayEntryClassname = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.opensdk.utils.Log.e(TAG, "get from metaData failed : " + e17.getMessage());
                }
            }
            if (wxappPayEntryClassname == null) {
                com.tencent.mm.opensdk.utils.Log.e(TAG, "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.bundle = bundle;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = wxappPayEntryClassname;
        args.launchMode = this.launchMode;
        try {
            java.lang.String tokenFromWX = getTokenFromWX(context);
            if (tokenFromWX != null) {
                args.token = tokenFromWX;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getTokenFromWX fail, exception = ".concat(java.lang.String.valueOf(e18)));
        }
        return com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args);
    }

    private boolean sendPreloadWXMiniProgramEnvironment(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment"), null, null, new java.lang.String[]{this.appId, ((com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment.Req) baseReq).extData}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendPreloadWXMiniprogram(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram.Req req = (com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram.Req) baseReq;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram");
        java.lang.String str = this.appId;
        java.lang.String str2 = req.userName;
        java.lang.String str3 = req.path;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(req.miniprogramType);
        android.database.Cursor query = contentResolver.query(parse, null, null, new java.lang.String[]{str, str2, str3, sb6.toString(), req.extData}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendQRCodePayReq(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.modelbiz.WXQRCodePay.Req req = (com.tencent.mm.opensdk.modelbiz.WXQRCodePay.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/QRCodePay"), null, null, new java.lang.String[]{this.appId, req.codeContent, req.extraMsg}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendSubscribeMessage(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Req req = (com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Req) baseReq;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.appId, "1", java.lang.String.valueOf(req.scene), req.templateID, req.reserved}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendSubscribeMiniProgramMsg(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.appId, "5", ((com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Req) baseReq).miniProgramAppId}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    private boolean sendToWxaRedirectingPage(android.content.Context context, com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        launchWXIfNeed();
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(0, this.appId);
        arrayList.addAll(java.util.Arrays.asList(((com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req) baseReq).toArray()));
        android.database.Cursor query = contentResolver.query(parse, null, null, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void detach() {
        com.tencent.mm.opensdk.utils.Log.d(TAG, "detach");
        this.detached = true;
        this.context = null;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public int getWXAppSupportAPI() {
        if (this.detached) {
            throw new java.lang.IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        }
        if (!isWXAppInstalled()) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "open wx app failed, not installed or signature check failed");
            return 0;
        }
        this.wxSdkVersion = 0;
        try {
            this.wxSdkVersion = this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
            com.tencent.mm.opensdk.utils.Log.d(TAG, "OPEN_SDK_VERSION = " + this.wxSdkVersion);
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "get from metaData failed : " + e17.getMessage());
        }
        if (this.wxSdkVersion == 0) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.tencent.mm.opensdk.utils.d.b().submit(new java.lang.Runnable() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.tencent.mm.opensdk.openapi.MMSharedPreferences mMSharedPreferences = new com.tencent.mm.opensdk.openapi.MMSharedPreferences(com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.this.context);
                        com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.this.wxSdkVersion = mMSharedPreferences.getInt("_build_info_sdk_int_", 0);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.opensdk.utils.Log.w(com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.TAG, e18.getMessage());
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e18) {
                com.tencent.mm.opensdk.utils.Log.w(TAG, e18.getMessage());
            }
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "wxSdkVersion = " + this.wxSdkVersion);
        return this.wxSdkVersion;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x005d. Please report as an issue. */
    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean handleIntent(android.content.Intent intent, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler iWXAPIEventHandler) {
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "handleIntent fail, ex = " + e17.getMessage());
        }
        if (!com.tencent.mm.opensdk.openapi.WXApiImplComm.isIntentFromWx(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_VALUE_MSG)) {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "handleIntent fail, intent not from weixin msg");
            return false;
        }
        if (this.detached) {
            throw new java.lang.IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
        }
        java.lang.String stringExtra = intent.getStringExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT);
        int intExtra = intent.getIntExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, 0);
        java.lang.String stringExtra2 = intent.getStringExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            if (!checkSumConsistent(intent.getByteArrayExtra(com.tencent.mm.opensdk.constants.ConstantsAPI.CHECK_SUM), com.tencent.mm.opensdk.channel.a.b.a(stringExtra, intExtra, stringExtra2))) {
                com.tencent.mm.opensdk.utils.Log.e(TAG, "checksum fail");
                return false;
            }
            int intExtra2 = intent.getIntExtra("_wxapi_command_type", 0);
            com.tencent.mm.opensdk.utils.Log.i(TAG, "handleIntent, cmd = ".concat(java.lang.String.valueOf(intExtra2)));
            switch (intExtra2) {
                case 1:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp(intent.getExtras()));
                    return true;
                case 2:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp(intent.getExtras()));
                    return true;
                case 3:
                    iWXAPIEventHandler.onReq(new com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req(intent.getExtras()));
                    return true;
                case 4:
                    com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req req = new com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req(intent.getExtras());
                    java.lang.String str = req.message.messageExt;
                    if (str != null && str.contains("wx_internal_resptype")) {
                        boolean handleWxInternalRespType = handleWxInternalRespType(str, iWXAPIEventHandler);
                        com.tencent.mm.opensdk.utils.Log.i(TAG, "handleIntent, extInfo contains wx_internal_resptype, ret = ".concat(java.lang.String.valueOf(handleWxInternalRespType)));
                        return handleWxInternalRespType;
                    }
                    if (str != null && str.contains("openbusinesswebview")) {
                        try {
                            android.net.Uri parse = android.net.Uri.parse(str);
                            if (parse != null && "openbusinesswebview".equals(parse.getHost())) {
                                com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Resp();
                                java.lang.String queryParameter = parse.getQueryParameter("ret");
                                if (queryParameter != null && queryParameter.length() > 0) {
                                    resp.errCode = com.tencent.mm.opensdk.utils.d.c(queryParameter);
                                }
                                resp.resultInfo = parse.getQueryParameter("resultInfo");
                                resp.errStr = parse.getQueryParameter("errmsg");
                                java.lang.String queryParameter2 = parse.getQueryParameter("type");
                                if (queryParameter2 != null && queryParameter2.length() > 0) {
                                    resp.businessType = com.tencent.mm.opensdk.utils.d.c(queryParameter2);
                                }
                                iWXAPIEventHandler.onResp(resp);
                                return true;
                            }
                            com.tencent.mm.opensdk.utils.Log.d(TAG, "not openbusinesswebview %".concat(str));
                        } catch (java.lang.Exception e18) {
                            com.tencent.mm.opensdk.utils.Log.e(TAG, "parse fail, ex = " + e18.getMessage());
                        }
                    }
                    iWXAPIEventHandler.onReq(req);
                    return true;
                case 5:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelpay.PayResp(intent.getExtras()));
                    return true;
                case 6:
                    iWXAPIEventHandler.onReq(new com.tencent.mm.opensdk.modelmsg.LaunchFromWX.Req(intent.getExtras()));
                    return true;
                case 7:
                case 8:
                case 10:
                case 11:
                case 13:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 40:
                default:
                    com.tencent.mm.opensdk.utils.Log.e(TAG, "unknown cmd = ".concat(java.lang.String.valueOf(intExtra2)));
                    return false;
                case 9:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp(intent.getExtras()));
                    return true;
                case 12:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.OpenWebview.Resp(intent.getExtras()));
                    return true;
                case 14:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.CreateChatroom.Resp(intent.getExtras()));
                    return true;
                case 15:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.JoinChatroom.Resp(intent.getExtras()));
                    return true;
                case 16:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage.Resp(intent.getExtras()));
                    return true;
                case 17:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.HandleScanResult.Resp(intent.getExtras()));
                    return true;
                case 19:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp(intent.getExtras()));
                    return true;
                case 24:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Resp(intent.getExtras()));
                    return true;
                case 25:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Resp(intent.getExtras()));
                    return true;
                case 26:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp(intent.getExtras()));
                    return true;
                case 27:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelpay.WXJointPay.JointPayResp(intent.getExtras()));
                    return true;
                case 28:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram.Resp(intent.getExtras()));
                    return true;
                case 29:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken.Resp(intent.getExtras()));
                    return true;
                case 30:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Resp(intent.getExtras()));
                    return true;
                case 31:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelmsg.SendTdiAuth.Resp(intent.getExtras()));
                    return true;
                case 32:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment.Resp(intent.getExtras()));
                    return true;
                case 33:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Resp(intent.getExtras()));
                    return true;
                case 34:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile.Resp(intent.getExtras()));
                    return true;
                case 35:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive.Resp(intent.getExtras()));
                    return true;
                case 36:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed.Resp(intent.getExtras()));
                    return true;
                case 37:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat.Resp(intent.getExtras()));
                    return true;
                case 38:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXQRCodePay.Resp(intent.getExtras()));
                    return true;
                case 39:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelStartLive.Resp(intent.getExtras()));
                    return true;
                case 41:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent.Resp(intent.getExtras()));
                    return true;
                case 42:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXChannelBind.Resp(intent.getExtras()));
                    return true;
                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXGetA8Key.Resp(intent.getExtras()));
                    return true;
                case 44:
                    iWXAPIEventHandler.onResp(new com.tencent.mm.opensdk.modelbiz.WXBizPublishWithImage.Resp(intent.getExtras()));
                    return true;
            }
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, "invalid argument");
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean isWXAppInstalled() {
        if (this.detached) {
            throw new java.lang.IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
        try {
            android.content.pm.PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo != null) {
                return com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignature(this.context, packageInfo.signatures, this.checkSignature);
            }
            com.tencent.mm.opensdk.utils.Log.w(TAG, "isWXAppInstalled packageInfo is null");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.w(TAG, "isWXAppInstalled ex:" + e17.getMessage());
            return false;
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean openWXApp() {
        java.lang.String str;
        if (this.detached) {
            throw new java.lang.IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (isWXAppInstalled()) {
            try {
                android.content.Context context = this.context;
                android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(launchIntentForPackage);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/opensdk/openapi/BaseWXApiImplV10", "openWXApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/opensdk/openapi/BaseWXApiImplV10", "openWXApp", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } catch (java.lang.Exception e17) {
                str = "startActivity fail, exception = " + e17.getMessage();
            }
        } else {
            str = "open wx app failed, not installed or signature check failed";
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean registerApp(java.lang.String str) {
        return registerApp(str, 0L);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendReq(com.tencent.mm.opensdk.modelbase.BaseReq baseReq) {
        return sendReq(baseReq, null);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendResp(com.tencent.mm.opensdk.modelbase.BaseResp baseResp) {
        java.lang.String str;
        if (this.detached) {
            throw new java.lang.IllegalStateException("sendResp fail, WXMsgImpl has been detached");
        }
        if (!com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            str = "sendResp failed for wechat app signature check failed";
        } else {
            if (baseResp.checkArgs()) {
                android.os.Bundle bundle = new android.os.Bundle();
                baseResp.toBundle(bundle);
                com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
                args.bundle = bundle;
                args.content = "weixin://sendresp?appid=" + this.appId;
                args.targetPkgName = "com.tencent.mm";
                args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                try {
                    java.lang.String tokenFromWX = getTokenFromWX(this.context);
                    if (tokenFromWX != null) {
                        args.token = tokenFromWX;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.opensdk.utils.Log.e(TAG, "getTokenFromWX fail, exception = ".concat(java.lang.String.valueOf(e17)));
                }
                return com.tencent.mm.opensdk.channel.MMessageActV2.send(this.context, args);
            }
            str = "sendResp checkArgs fail";
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, str);
        return false;
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void setLogImpl(com.tencent.mm.opensdk.utils.ILog iLog) {
        com.tencent.mm.opensdk.utils.Log.setLogImpl(iLog);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void unregisterApp() {
        if (this.detached) {
            throw new java.lang.IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
        }
        if (!com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "unregister app failed for wechat app signature check failed");
            return;
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "unregisterApp, appId = " + this.appId);
        java.lang.String str = this.appId;
        if (str == null || str.length() == 0) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "unregisterApp fail, appId is empty");
            return;
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "unregister app " + this.context.getPackageName());
        com.tencent.mm.opensdk.channel.a.a.C0047a c0047a = new com.tencent.mm.opensdk.channel.a.a.C0047a();
        c0047a.f72327a = "com.tencent.mm";
        c0047a.action = com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER;
        c0047a.content = "weixin://unregisterapp?appid=" + this.appId;
        com.tencent.mm.opensdk.channel.a.a.a(this.context, c0047a);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean registerApp(java.lang.String str, long j17) {
        if (this.detached) {
            throw new java.lang.IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        }
        if (!com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "register app failed for wechat app signature check failed");
            return false;
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "registerApp, appId = ".concat(java.lang.String.valueOf(str)));
        if (str != null) {
            this.appId = str;
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "registerApp, appId = ".concat(java.lang.String.valueOf(str)));
        if (str != null) {
            this.appId = str;
        }
        com.tencent.mm.opensdk.utils.Log.d(TAG, "register app " + this.context.getPackageName());
        com.tencent.mm.opensdk.channel.a.a.C0047a c0047a = new com.tencent.mm.opensdk.channel.a.a.C0047a();
        c0047a.f72327a = "com.tencent.mm";
        c0047a.action = com.tencent.mm.opensdk.constants.ConstantsAPI.ACTION_HANDLE_APP_REGISTER;
        c0047a.content = "weixin://registerapp?appid=" + this.appId;
        c0047a.f72328b = j17;
        return com.tencent.mm.opensdk.channel.a.a.a(this.context, c0047a);
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendReq(com.tencent.mm.opensdk.modelbase.BaseReq baseReq, final com.tencent.mm.opensdk.openapi.SendReqCallback sendReqCallback) {
        java.lang.StringBuilder sb6;
        java.lang.String str;
        java.lang.String str2;
        if (this.detached) {
            throw new java.lang.IllegalStateException("sendReq fail, WXMsgImpl has been detached");
        }
        if (!com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "sendReq failed for wechat app signature check failed");
            return false;
        }
        if (baseReq.getType() == 2) {
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = (com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req) baseReq;
            if (req.scene == 4) {
                com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject iWXSceneDataObject = req.sceneDataObject;
                if (iWXSceneDataObject instanceof com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject) {
                    com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject wXStateSceneDataObject = (com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject) iWXSceneDataObject;
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = req.message;
                    if (wXMediaMessage.mediaObject == null) {
                        wXMediaMessage.mediaObject = new com.tencent.mm.opensdk.modelmsg.WXTextObject();
                    }
                    if (req.message.getType() == 1 && ((str2 = wXStateSceneDataObject.stateTitle) == null || str2.length() <= 0)) {
                        wXStateSceneDataObject.stateTitle = ((com.tencent.mm.opensdk.modelmsg.WXTextObject) req.message.mediaObject).text;
                    }
                }
            }
        }
        if (!baseReq.checkArgs()) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "sendReq checkArgs fail");
            return false;
        }
        com.tencent.mm.opensdk.utils.Log.i(TAG, "sendReq, req type = " + baseReq.getType());
        final android.os.Bundle bundle = new android.os.Bundle();
        baseReq.toBundle(bundle);
        if (baseReq.getType() == 5 || baseReq.getType() == 27) {
            return sendPayReq(this.context, bundle);
        }
        if (baseReq.getType() == 9) {
            return sendAddCardToWX(this.context, bundle);
        }
        if (baseReq.getType() == 16) {
            return sendChooseCardFromWX(this.context, bundle);
        }
        if (baseReq.getType() == 11) {
            return sendOpenRankListReq(this.context, bundle);
        }
        if (baseReq.getType() == 12) {
            return sendOpenWebview(this.context, bundle);
        }
        if (baseReq.getType() == 25) {
            return sendOpenBusinessWebview(this.context, baseReq);
        }
        if (baseReq.getType() == 13) {
            return sendOpenBusiLuckyMoney(this.context, bundle);
        }
        if (baseReq.getType() == 14) {
            return createChatroom(this.context, bundle);
        }
        if (baseReq.getType() == 15) {
            return joinChatroom(this.context, bundle);
        }
        if (baseReq.getType() == 17) {
            return sendHandleScanResult(this.context, bundle);
        }
        if (baseReq.getType() == 18) {
            return sendSubscribeMessage(this.context, baseReq);
        }
        if (baseReq.getType() == 28) {
            return sendPreloadWXMiniprogram(this.context, baseReq);
        }
        if (baseReq.getType() == 29) {
            return sendLaunchWXMiniprogramWithToken(this.context, baseReq);
        }
        if (baseReq.getType() == 23) {
            return sendSubscribeMiniProgramMsg(this.context, baseReq);
        }
        if (baseReq.getType() == 19) {
            return sendLaunchWXMiniprogram(this.context, baseReq);
        }
        if (baseReq.getType() == 32) {
            return sendPreloadWXMiniProgramEnvironment(this.context, baseReq);
        }
        if (baseReq.getType() == 30) {
            return sendToWxaRedirectingPage(this.context, baseReq);
        }
        if (baseReq.getType() == 26) {
            return sendOpenBusinessView(this.context, baseReq);
        }
        if (baseReq.getType() == 33) {
            return sendFinderShareVideo(this.context, baseReq);
        }
        if (baseReq.getType() == 39) {
            return sendFinderStartLive(this.context, baseReq);
        }
        if (baseReq.getType() == 34) {
            return sendFinderOpenProfile(this.context, baseReq);
        }
        if (baseReq.getType() == 35) {
            return sendFinderOpenLive(this.context, baseReq);
        }
        if (baseReq.getType() == 36) {
            return sendFinderOpenFeed(this.context, baseReq);
        }
        if (baseReq.getType() == 41) {
            return sendFinderOpenEvent(this.context, baseReq);
        }
        if (baseReq.getType() == 42) {
            return sendFinderBind(this.context, baseReq);
        }
        if (baseReq.getType() == 37) {
            return sendOpenCustomerServiceChat(this.context, baseReq);
        }
        if (baseReq.getType() == 38) {
            return sendQRCodePayReq(this.context, baseReq);
        }
        if (baseReq.getType() == 20) {
            return sendInvoiceAuthInsert(this.context, baseReq);
        }
        if (baseReq.getType() == 21) {
            return sendNonTaxPay(this.context, baseReq);
        }
        if (baseReq.getType() == 22) {
            return sendPayInSurance(this.context, baseReq);
        }
        if (baseReq.getType() == 24) {
            return sendJumpToOfflinePayReq(this.context, bundle);
        }
        if (baseReq.getType() == 43) {
            return sendGetA8KeyReq(this.context, baseReq);
        }
        if (baseReq.getType() == 44) {
            return sendBizPublishWithImageReq(this.context, baseReq);
        }
        if (baseReq.getType() == 2) {
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req2 = (com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req) baseReq;
            if (com.tencent.mm.opensdk.utils.d.a(req2.message.getType())) {
                com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) req2.message.mediaObject;
                wXMiniProgramObject.userName += "@app";
                java.lang.String str3 = wXMiniProgramObject.path;
                if (!com.tencent.mm.opensdk.utils.d.b(str3)) {
                    java.lang.String[] split = str3.split("\\?");
                    if (split.length > 1) {
                        sb6 = new java.lang.StringBuilder();
                        sb6.append(split[0]);
                        sb6.append(".html?");
                        str = split[1];
                    } else {
                        sb6 = new java.lang.StringBuilder();
                        sb6.append(split[0]);
                        str = ".html";
                    }
                    sb6.append(str);
                    wXMiniProgramObject.path = sb6.toString();
                }
                int i17 = req2.scene;
                if (i17 != 3 && i17 != 1) {
                    req2.scene = 0;
                }
                baseReq.toBundle(bundle);
            }
        }
        java.lang.String extractMayNeedDoSecurityCheckUrl = this.securityHelper.extractMayNeedDoSecurityCheckUrl(this.appId, baseReq);
        if (com.tencent.mm.opensdk.utils.d.b(extractMayNeedDoSecurityCheckUrl)) {
            boolean doLaunchApp = doLaunchApp(bundle);
            callbackReq(sendReqCallback, doLaunchApp);
            return doLaunchApp;
        }
        int doExtraSecurityCheck = this.securityHelper.doExtraSecurityCheck(this.appId, "638067712", extractMayNeedDoSecurityCheckUrl, new com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecurityCheck() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.2
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecurityCheck
            public void onCheckFinish(boolean z17) {
                if (!z17) {
                    com.tencent.mm.opensdk.utils.Log.i(com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.TAG, "WXAPiSecurityHelper, extra check do next step: check fail, stop process!");
                    com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.this.callbackReq(sendReqCallback, false);
                } else {
                    com.tencent.mm.opensdk.utils.Log.i(com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.TAG, "WXAPiSecurityHelper, extra check do next step: check pass, doLaunchApp");
                    com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.this.callbackReq(sendReqCallback, com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.this.doLaunchApp(bundle));
                }
            }
        });
        if (doExtraSecurityCheck == 0) {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "WXAPiSecurityHelper, extra check pass, doLaunchApp");
            boolean doLaunchApp2 = doLaunchApp(bundle);
            callbackReq(sendReqCallback, doLaunchApp2);
            return doLaunchApp2;
        }
        if (doExtraSecurityCheck != 1) {
            com.tencent.mm.opensdk.utils.Log.i(TAG, "WXAPiSecurityHelper, hold on request, extra check need to do next step");
            return true;
        }
        com.tencent.mm.opensdk.utils.Log.i(TAG, "WXAPiSecurityHelper, extra check fail, return");
        callbackReq(sendReqCallback, false);
        return false;
    }
}
