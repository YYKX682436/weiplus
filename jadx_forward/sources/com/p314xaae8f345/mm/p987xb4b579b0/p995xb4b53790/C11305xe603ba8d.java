package com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790;

/* renamed from: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10 */
/* loaded from: classes9.dex */
class C11305xe603ba8d implements com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0 {
    protected static final java.lang.String TAG = "MicroMsg.SDK.WXApiImplV10";

    /* renamed from: wxappPayEntryClassname */
    private static java.lang.String f33267x69a756b9;

    /* renamed from: _hellAccFlag_ */
    private byte f33268x7f11beae;

    /* renamed from: appId */
    protected java.lang.String f33269x58b7f1c;

    /* renamed from: checkSignature */
    protected boolean f33270xada8fc90;

    /* renamed from: context */
    protected android.content.Context f33271x38b735af;

    /* renamed from: detached */
    protected boolean f33272x3e428b72 = false;

    /* renamed from: launchMode */
    private int f33273x208ebff6;

    /* renamed from: securityHelper */
    private com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07 f33274xc2cb030e;

    /* renamed from: wxSdkVersion */
    private int f33275x609e28ff;

    public C11305xe603ba8d(android.content.Context context, java.lang.String str, boolean z17, int i17) {
        this.f33270xada8fc90 = false;
        this.f33273x208ebff6 = 2;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "<init>, appId = " + str + ", checkSignature = " + z17 + ", launchMode = " + i17);
        this.f33271x38b735af = context;
        this.f33269x58b7f1c = str;
        this.f33270xada8fc90 = z17;
        this.f33273x208ebff6 = i17;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.D = context;
        this.f33274xc2cb030e = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: callbackReq */
    public void m48488x6f707e19(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11309x3a5bca3b interfaceC11309x3a5bca3b, boolean z17) {
        if (interfaceC11309x3a5bca3b != null) {
            interfaceC11309x3a5bca3b.m48545xcd39e17a(z17);
        }
    }

    /* renamed from: checkSumConsistent */
    private boolean m48489x865ca315(byte[] bArr, byte[] bArr2) {
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
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    /* renamed from: createChatroom */
    private boolean m48490x8cb7f14f(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new java.lang.String[]{this.f33269x58b7f1c, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doLaunchApp */
    public boolean m48491x64625d23(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32701xaddf3082 = bundle;
        args.f32702x38b73479 = "weixin://sendreq?appid=" + this.f33269x58b7f1c;
        args.f32706x6a744ba6 = "com.tencent.mm";
        args.f32705x81a4fd92 = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        args.f32704x208ebff6 = this.f33273x208ebff6;
        try {
            java.lang.String m48493x6a9bae2e = m48493x6a9bae2e(this.f33271x38b735af);
            if (m48493x6a9bae2e != null) {
                args.f32707x696b9f9 = m48493x6a9bae2e;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "getTokenFromWX fail, exception = ".concat(java.lang.String.valueOf(e17)));
        }
        return com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(this.f33271x38b735af, args);
    }

    /* renamed from: finderShareVideoJumpInfoToString */
    private java.lang.String m48492xfcb8854a(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5 interfaceC11235xd2b41dd5) {
        java.lang.String str;
        java.lang.String str2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("jumpType", interfaceC11235xd2b41dd5.mo48434x368f3a());
            if (interfaceC11235xd2b41dd5 instanceof com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef) {
                jSONObject.put("wording", ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef) interfaceC11235xd2b41dd5).f32933x5ae4fc98);
                jSONObject.put("extra", ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.AbstractC11243x2a15bef) interfaceC11235xd2b41dd5).f32932x5c79410);
                if (interfaceC11235xd2b41dd5 instanceof com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11245xd735fc2b) {
                    jSONObject.put(dm.i4.f66875xa013b0d5, ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11245xd735fc2b) interfaceC11235xd2b41dd5).f32940xf02988d6);
                    str = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714;
                    str2 = ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11245xd735fc2b) interfaceC11235xd2b41dd5).f32939x346425;
                } else if (interfaceC11235xd2b41dd5 instanceof com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11246xb8a0ae6d) {
                    str = "url";
                    str2 = ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11246xb8a0ae6d) interfaceC11235xd2b41dd5).url;
                }
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: getTokenFromWX */
    private java.lang.String m48493x6a9bae2e(android.content.Context context) {
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, new java.lang.String[]{this.f33269x58b7f1c, "638067712"}, null);
        if (query == null || !query.moveToFirst()) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include 'com.tencent.mm' in a set of <package> elements inside the <queries> element");
            return null;
        }
        java.lang.String string = query.getString(0);
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "getTokenFromWX token is ".concat(java.lang.String.valueOf(string)));
        query.close();
        return string;
    }

    /* renamed from: handleWxInternalRespType */
    private boolean m48494x84ff7650(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11307xd4139840 interfaceC11307xd4139840) {
        android.net.Uri parse;
        java.lang.String queryParameter;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "handleWxInternalRespType, extInfo = ".concat(java.lang.String.valueOf(str)));
        try {
            parse = android.net.Uri.parse(str);
            queryParameter = parse.getQueryParameter("wx_internal_resptype");
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "handleWxInternalRespType, respType = ".concat(java.lang.String.valueOf(queryParameter)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "handleWxInternalRespType fail, ex = " + e17.getMessage());
        }
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(queryParameter)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "handleWxInternalRespType fail, respType is null");
            return false;
        }
        if (queryParameter.equals("subscribemessage")) {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11240xa32c577d.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11240xa32c577d.Resp();
            java.lang.String queryParameter2 = parse.getQueryParameter("ret");
            if (queryParameter2 != null && queryParameter2.length() > 0) {
                resp.f32867xa7c470f2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter2);
            }
            resp.f32869xc3c3c505 = parse.getQueryParameter(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330);
            resp.f32923x4db99f15 = parse.getQueryParameter("template_id");
            resp.f32922x683188c = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
            resp.f32920xab2f7e36 = parse.getQueryParameter("action");
            resp.f32921xeb1d8b28 = parse.getQueryParameter("reserved");
            interfaceC11307xd4139840.m48543xc39ed64f(resp);
            return true;
        }
        if (queryParameter.contains("invoice_auth_insert")) {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11254x2675acad.Resp resp2 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11254x2675acad.Resp();
            java.lang.String queryParameter3 = parse.getQueryParameter("ret");
            if (queryParameter3 != null && queryParameter3.length() > 0) {
                resp2.f32867xa7c470f2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter3);
            }
            resp2.f32973xb8a22ee8 = parse.getQueryParameter("wx_order_id");
            interfaceC11307xd4139840.m48543xc39ed64f(resp2);
            return true;
        }
        if (queryParameter.contains("payinsurance")) {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11262x84186893.Resp resp3 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11262x84186893.Resp();
            java.lang.String queryParameter4 = parse.getQueryParameter("ret");
            if (queryParameter4 != null && queryParameter4.length() > 0) {
                resp3.f32867xa7c470f2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter4);
            }
            resp3.f33006xb8a22ee8 = parse.getQueryParameter("wx_order_id");
            interfaceC11307xd4139840.m48543xc39ed64f(resp3);
            return true;
        }
        if (queryParameter.contains("nontaxpay")) {
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11258x50e23429.Resp resp4 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11258x50e23429.Resp();
            java.lang.String queryParameter5 = parse.getQueryParameter("ret");
            if (queryParameter5 != null && queryParameter5.length() > 0) {
                resp4.f32867xa7c470f2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter5);
            }
            resp4.f32994xb8a22ee8 = parse.getQueryParameter("wx_order_id");
            interfaceC11307xd4139840.m48543xc39ed64f(resp4);
            return true;
        }
        if (!"subscribeminiprogrammsg".equals(queryParameter) && !"5".equals(queryParameter)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "this open sdk version not support the request type");
            return false;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11241xfabb89de.Resp resp5 = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11241xfabb89de.Resp();
        java.lang.String queryParameter6 = parse.getQueryParameter("ret");
        if (queryParameter6 != null && queryParameter6.length() > 0) {
            resp5.f32867xa7c470f2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter6);
        }
        resp5.f32869xc3c3c505 = parse.getQueryParameter(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330);
        resp5.f32927xeee9e84a = parse.getQueryParameter("unionid");
        resp5.f32926x436a86e = parse.getQueryParameter("nickname");
        resp5.f32868xb2d5068c = parse.getQueryParameter("errmsg");
        interfaceC11307xd4139840.m48543xc39ed64f(resp5);
        return true;
    }

    /* renamed from: joinChatroom */
    private boolean m48495xffd41f7d(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new java.lang.String[]{this.f33269x58b7f1c, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: launchWXIfNeed */
    private void m48496xdade7e47() {
        if (android.os.Build.VERSION.SDK_INT < 29 || this.f33273x208ebff6 != 2) {
            mo48533x5bad3776();
        } else {
            m48497x33cd65e3();
        }
    }

    /* renamed from: launchWXUsingPendingIntent */
    private void m48497x33cd65e3() {
        android.app.PendingIntent activity;
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (!mo48532x13468384()) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "openWXApp failed, not installed or signature check failed");
            return;
        }
        try {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "launchWXUsingPendingIntent");
            android.content.Intent launchIntentForPackage = this.f33271x38b735af.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
            if (android.os.Build.VERSION.SDK_INT < 35) {
                activity = android.app.PendingIntent.getActivity(this.f33271x38b735af, 1, launchIntentForPackage, 201326592);
            } else {
                if (launchIntentForPackage == null) {
                    throw new java.lang.NullPointerException("getLaunchIntentForPackage is null");
                }
                android.app.ActivityOptions makeBasic = android.app.ActivityOptions.makeBasic();
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
                activity = android.app.PendingIntent.getActivity(this.f33271x38b735af, 1, launchIntentForPackage, 201326592, makeBasic.toBundle());
            }
            activity.send(this.f33271x38b735af, 2, null, new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.3
                @Override // android.app.PendingIntent.OnFinished
                public void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent, int i17, java.lang.String str, android.os.Bundle bundle) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.TAG, "onSendFinished resultCode: " + i17 + ", resultData: " + str);
                }
            }, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "launchWXUsingPendingIntent pendingIntent send failed: " + e17.getMessage());
            mo48533x5bad3776();
        }
    }

    /* renamed from: sendAddCardToWX */
    private boolean m48498x209c4ce5(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new java.lang.String[]{this.f33269x58b7f1c, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendBizPublishWithImageReq */
    private boolean m48499x4645d06d(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        java.lang.String m48436xcc31ba03 = ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.Req) abstractC11229x4f6513ed).m48436xcc31ba03();
        if (m48436xcc31ba03 == null) {
            return false;
        }
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/bizPublishWithImage"), null, null, new java.lang.String[]{this.f33269x58b7f1c, m48436xcc31ba03}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendChooseCardFromWX */
    private boolean m48500xc991a05a(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new java.lang.String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderBind */
    private boolean m48501xa3946f2b(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderBind");
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderBind"), null, null, new java.lang.String[]{this.f33269x58b7f1c, abstractC11229x4f6513ed.f32865xc3c3c505}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderOpenEvent */
    private boolean m48502xc3d71442(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderOpenEvent");
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenEvent"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f32948xf02988d6, req.f32946xadf43d55, req.f32947xb2206a6f}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderOpenFeed */
    private boolean m48503x82306ef6(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderOpenFeed");
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11248xb63ce80a.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11248xb63ce80a.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenFeed"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f32952xb3ccff39, req.f32953x7e94014a, java.lang.String.valueOf(req.f32954x8be991df)}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderOpenLive */
    private boolean m48504x82333a44(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderOpenLive");
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11249xb63fb358.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11249xb63fb358.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenLive"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f32957xb3ccff39, req.f32958x7e94014a}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderOpenProfile */
    private boolean m48505x69fd6151(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderOpenProfile");
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenProfile"), null, null, new java.lang.String[]{this.f33269x58b7f1c, ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11250x617b5fbd.Req) abstractC11229x4f6513ed).f32961xf01afcf6}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderShareVideo */
    private boolean m48506x4efbc84a(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderShareVideo");
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11251xb1ce4c5e.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11251xb1ce4c5e.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderShareVideo"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f32967x4f713740, "", "", req.f32965xb21df56b, m48492xfcb8854a(req.f32966xf0c305fc)}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendFinderStartLive */
    private boolean m48507xea2b4240(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendFinderStartLive");
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderStartLive"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f32969xf7b77ac2, req.f32865xc3c3c505}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendGetA8KeyReq */
    private boolean m48508x4b788564(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/getA8Key"), null, null, new java.lang.String[]{this.f33269x58b7f1c, ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11253x74652733.Req) abstractC11229x4f6513ed).url}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendHandleScanResult */
    private boolean m48509x10ffa4ea(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new java.lang.String[]{this.f33269x58b7f1c, bundle.getString("_wxapi_scan_qrcode_result")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendInvoiceAuthInsert */
    private boolean m48510xe32aeae6(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.f33269x58b7f1c, "2", java.net.URLEncoder.encode(java.lang.String.format("url=%s", java.net.URLEncoder.encode(((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11254x2675acad.Req) abstractC11229x4f6513ed).url)))}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendJumpToOfflinePayReq */
    private boolean m48511xf6431128(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"), null, null, new java.lang.String[]{this.f33269x58b7f1c}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendLaunchWXMiniprogram */
    private boolean m48512xeeea331(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11255xf99ecb99.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11255xf99ecb99.Req) abstractC11229x4f6513ed;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        java.lang.String str = this.f33269x58b7f1c;
        java.lang.String str2 = req.f32980xf01afcf6;
        java.lang.String str3 = req.f32979x346425;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(req.f32978xc6c9cf27);
        android.database.Cursor query = contentResolver.query(parse, null, null, new java.lang.String[]{str, str2, str3, sb6.toString(), req.f32977xb21df56b}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendLaunchWXMiniprogramWithToken */
    private boolean m48513xf2328a2(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken"), null, null, new java.lang.String[]{this.f33269x58b7f1c, ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11256xe1f5f53a.Req) abstractC11229x4f6513ed).f32982x696b9f9}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendNonTaxPay */
    private boolean m48514x1c36a782(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.f33269x58b7f1c, "3", java.net.URLEncoder.encode(java.lang.String.format("url=%s", java.net.URLEncoder.encode(((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11258x50e23429.Req) abstractC11229x4f6513ed).url)))}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendOpenBusiLuckyMoney */
    private boolean m48515xfaa7a813(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new java.lang.String[]{this.f33269x58b7f1c, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendOpenBusinessView */
    private boolean m48516x9177ed97(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessView"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f32995xd7e6e31a, req.f32997x66f18c8, req.f32996xb2206a6f, req.f32866x7fa0d2de, req.f32865xc3c3c505}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendOpenBusinessWebview */
    private boolean m48517x81134bc7(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11260x1cb4b7ce.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11260x1cb4b7ce.Req) abstractC11229x4f6513ed;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = req.f33001x94484d96;
        java.lang.String jSONObject = (hashMap == null || hashMap.size() <= 0) ? "" : new org.json.JSONObject(req.f33001x94484d96).toString();
        java.lang.String str = this.f33269x58b7f1c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(req.f33000xd7e6e31a);
        android.database.Cursor query = contentResolver.query(parse, null, null, new java.lang.String[]{str, sb6.toString(), jSONObject}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendOpenCustomerServiceChat */
    private boolean m48518xacb3859d(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11261x82219624.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11261x82219624.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f33004xaf417665, req.url}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendOpenRankListReq */
    private boolean m48519x7a805c02(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new java.lang.String[0], null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendOpenWebview */
    private boolean m48520x986c39a7(android.content.Context context, android.os.Bundle bundle) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new java.lang.String[]{this.f33269x58b7f1c, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendPayInSurance */
    private boolean m48521x287a029a(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.f33269x58b7f1c, "4", java.net.URLEncoder.encode(java.lang.String.format("url=%s", java.net.URLEncoder.encode(((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11262x84186893.Req) abstractC11229x4f6513ed).url)))}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendPayReq */
    private boolean m48522x16c0e47e(android.content.Context context, android.os.Bundle bundle) {
        if (f33267x69a756b9 == null) {
            f33267x69a756b9 = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.SharedPreferencesC11308x5c774393(context).getString("_wxapp_pay_entry_classname_", null);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "pay, set wxappPayEntryClassname = " + f33267x69a756b9);
            if (f33267x69a756b9 == null) {
                try {
                    f33267x69a756b9 = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "get from metaData failed : " + e17.getMessage());
                }
            }
            if (f33267x69a756b9 == null) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32701xaddf3082 = bundle;
        args.f32706x6a744ba6 = "com.tencent.mm";
        args.f32705x81a4fd92 = f33267x69a756b9;
        args.f32704x208ebff6 = this.f33273x208ebff6;
        try {
            java.lang.String m48493x6a9bae2e = m48493x6a9bae2e(context);
            if (m48493x6a9bae2e != null) {
                args.f32707x696b9f9 = m48493x6a9bae2e;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "getTokenFromWX fail, exception = ".concat(java.lang.String.valueOf(e18)));
        }
        return com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(context, args);
    }

    /* renamed from: sendPreloadWXMiniProgramEnvironment */
    private boolean m48523x12369c48(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment"), null, null, new java.lang.String[]{this.f33269x58b7f1c, ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11264x1592d3ae.Req) abstractC11229x4f6513ed).f33012xb21df56b}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendPreloadWXMiniprogram */
    private boolean m48524xc2fdc8eb(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11263x9792cd25.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11263x9792cd25.Req) abstractC11229x4f6513ed;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram");
        java.lang.String str = this.f33269x58b7f1c;
        java.lang.String str2 = req.f33010xf01afcf6;
        java.lang.String str3 = req.f33009x346425;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(req.f33008xc6c9cf27);
        android.database.Cursor query = contentResolver.query(parse, null, null, new java.lang.String[]{str, str2, str3, sb6.toString(), req.f33007xb21df56b}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendQRCodePayReq */
    private boolean m48525x5acbd7ac(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11265x5e1ae059.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11265x5e1ae059.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/QRCodePay"), null, null, new java.lang.String[]{this.f33269x58b7f1c, req.f33013x2cb09cc, req.f33014x94286151}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendSubscribeMessage */
    private boolean m48526xce221705(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11240xa32c577d.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11240xa32c577d.Req) abstractC11229x4f6513ed;
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.f33269x58b7f1c, "1", java.lang.String.valueOf(req.f32918x683188c), req.f32919x4db99f15, req.f32917xeb1d8b28}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendSubscribeMiniProgramMsg */
    private boolean m48527xb240c156(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.database.Cursor query = context.getContentResolver().query(android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new java.lang.String[]{this.f33269x58b7f1c, "5", ((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11241xfabb89de.Req) abstractC11229x4f6513ed).f32925x1b2b90ef}, null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    /* renamed from: sendToWxaRedirectingPage */
    private boolean m48528x3a078df8(android.content.Context context, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        m48496xdade7e47();
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri parse = android.net.Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(0, this.f33269x58b7f1c);
        arrayList.addAll(java.util.Arrays.asList(((com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Req) abstractC11229x4f6513ed).m48438xb986489e()));
        android.database.Cursor query = contentResolver.query(parse, null, null, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null);
        if (query == null) {
            return true;
        }
        query.close();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: detach */
    public void mo48529xb06a1793() {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "detach");
        this.f33272x3e428b72 = true;
        this.f33271x38b735af = null;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: getWXAppSupportAPI */
    public int mo48530xb0e2cd55() {
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        }
        if (!mo48532x13468384()) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "open wx app failed, not installed or signature check failed");
            return 0;
        }
        this.f33275x609e28ff = 0;
        try {
            this.f33275x609e28ff = this.f33271x38b735af.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "OPEN_SDK_VERSION = " + this.f33275x609e28ff);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "get from metaData failed : " + e17.getMessage());
        }
        if (this.f33275x609e28ff == 0) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b().submit(new java.lang.Runnable() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.SharedPreferencesC11308x5c774393 sharedPreferencesC11308x5c774393 = new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.SharedPreferencesC11308x5c774393(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.this.f33271x38b735af);
                        com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.this.f33275x609e28ff = sharedPreferencesC11308x5c774393.getInt("_build_info_sdk_int_", 0);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.TAG, e18.getMessage());
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e18) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(TAG, e18.getMessage());
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "wxSdkVersion = " + this.f33275x609e28ff);
        return this.f33275x609e28ff;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x005d. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: handleIntent */
    public boolean mo48531xa1c752e4(android.content.Intent intent, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11307xd4139840 interfaceC11307xd4139840) {
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "handleIntent fail, ex = " + e17.getMessage());
        }
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11312x1c4a4fe5.m48576x3e099031(intent, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.Token.f32838xdd45632f)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "handleIntent fail, intent not from weixin msg");
            return false;
        }
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
        }
        java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059);
        int intExtra = intent.getIntExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, 0);
        java.lang.String stringExtra2 = intent.getStringExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            if (!m48489x865ca315(intent.getByteArrayExtra(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32762xbdedaa54), com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.b.a(stringExtra, intExtra, stringExtra2))) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checksum fail");
                return false;
            }
            int intExtra2 = intent.getIntExtra("_wxapi_command_type", 0);
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "handleIntent, cmd = ".concat(java.lang.String.valueOf(intExtra2)));
            switch (intExtra2) {
                case 1:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp(intent.getExtras()));
                    return true;
                case 2:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Resp(intent.getExtras()));
                    return true;
                case 3:
                    interfaceC11307xd4139840.m48542x64f723f(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11266x18086b5c.Req(intent.getExtras()));
                    return true;
                case 4:
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Req(intent.getExtras());
                    java.lang.String str = req.f33057x38eb0007.f33125x9b39409a;
                    if (str != null && str.contains("wx_internal_resptype")) {
                        boolean m48494x84ff7650 = m48494x84ff7650(str, interfaceC11307xd4139840);
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "handleIntent, extInfo contains wx_internal_resptype, ret = ".concat(java.lang.String.valueOf(m48494x84ff7650)));
                        return m48494x84ff7650;
                    }
                    if (str != null && str.contains("openbusinesswebview")) {
                        try {
                            android.net.Uri parse = android.net.Uri.parse(str);
                            if (parse != null && "openbusinesswebview".equals(parse.getHost())) {
                                com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11260x1cb4b7ce.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11260x1cb4b7ce.Resp();
                                java.lang.String queryParameter = parse.getQueryParameter("ret");
                                if (queryParameter != null && queryParameter.length() > 0) {
                                    resp.f32867xa7c470f2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter);
                                }
                                resp.f33003xdde54a6b = parse.getQueryParameter("resultInfo");
                                resp.f32868xb2d5068c = parse.getQueryParameter("errmsg");
                                java.lang.String queryParameter2 = parse.getQueryParameter("type");
                                if (queryParameter2 != null && queryParameter2.length() > 0) {
                                    resp.f33002xd7e6e31a = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.c(queryParameter2);
                                }
                                interfaceC11307xd4139840.m48543xc39ed64f(resp);
                                return true;
                            }
                            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "not openbusinesswebview %".concat(str));
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "parse fail, ex = " + e18.getMessage());
                        }
                    }
                    interfaceC11307xd4139840.m48542x64f723f(req);
                    return true;
                case 5:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478(intent.getExtras()));
                    return true;
                case 6:
                    interfaceC11307xd4139840.m48542x64f723f(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11267x35e771be.Req(intent.getExtras()));
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
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "unknown cmd = ".concat(java.lang.String.valueOf(intExtra2)));
                    return false;
                case 9:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11231x5a668f69.Resp(intent.getExtras()));
                    return true;
                case 12:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11239xa0a98e2f.Resp(intent.getExtras()));
                    return true;
                case 14:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11233x50febd6f.Resp(intent.getExtras()));
                    return true;
                case 15:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11236x99f739d.Resp(intent.getExtras()));
                    return true;
                case 16:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11232xd82d2ee4.Resp(intent.getExtras()));
                    return true;
                case 17:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11234xe609e562.Resp(intent.getExtras()));
                    return true;
                case 19:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11255xf99ecb99.Resp(intent.getExtras()));
                    return true;
                case 24:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11301xc3d8400e.Resp(intent.getExtras()));
                    return true;
                case 25:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11260x1cb4b7ce.Resp(intent.getExtras()));
                    return true;
                case 26:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11259xee7a56f0.Resp(intent.getExtras()));
                    return true;
                case 27:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11304xacd729bf.JointPayResp(intent.getExtras()));
                    return true;
                case 28:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11263x9792cd25.Resp(intent.getExtras()));
                    return true;
                case 29:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11256xe1f5f53a.Resp(intent.getExtras()));
                    return true;
                case 30:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.Resp(intent.getExtras()));
                    return true;
                case 31:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11270xfc93d479.Resp(intent.getExtras()));
                    return true;
                case 32:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11264x1592d3ae.Resp(intent.getExtras()));
                    return true;
                case 33:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11251xb1ce4c5e.Resp(intent.getExtras()));
                    return true;
                case 34:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11250x617b5fbd.Resp(intent.getExtras()));
                    return true;
                case 35:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11249xb63fb358.Resp(intent.getExtras()));
                    return true;
                case 36:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11248xb63ce80a.Resp(intent.getExtras()));
                    return true;
                case 37:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11261x82219624.Resp(intent.getExtras()));
                    return true;
                case 38:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11265x5e1ae059.Resp(intent.getExtras()));
                    return true;
                case 39:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11252x37adebac.Resp(intent.getExtras()));
                    return true;
                case 41:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11247x1159bdae.Resp(intent.getExtras()));
                    return true;
                case 42:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11244x2750923f.Resp(intent.getExtras()));
                    return true;
                case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11253x74652733.Resp(intent.getExtras()));
                    return true;
                case 44:
                    interfaceC11307xd4139840.m48543xc39ed64f(new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11242x986d7a78.Resp(intent.getExtras()));
                    return true;
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "invalid argument");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: isWXAppInstalled */
    public boolean mo48532x13468384() {
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
        try {
            android.content.pm.PackageInfo packageInfo = this.f33271x38b735af.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo != null) {
                return com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11312x1c4a4fe5.m48577x688fcd(this.f33271x38b735af, packageInfo.signatures, this.f33270xada8fc90);
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(TAG, "isWXAppInstalled packageInfo is null");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w(TAG, "isWXAppInstalled ex:" + e17.getMessage());
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: openWXApp */
    public boolean mo48533x5bad3776() {
        java.lang.String str;
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (mo48532x13468384()) {
            try {
                android.content.Context context = this.f33271x38b735af;
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
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: registerApp */
    public boolean mo48534x80d82c7e(java.lang.String str) {
        return mo48535x80d82c7e(str, 0L);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: sendReq */
    public boolean mo48536x7602e3f6(com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed) {
        return mo48537x7602e3f6(abstractC11229x4f6513ed, null);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: sendResp */
    public boolean mo48538x4a599b78(com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 abstractC11230x9d3d6a61) {
        java.lang.String str;
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("sendResp fail, WXMsgImpl has been detached");
        }
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11312x1c4a4fe5.m48578x2489caea(this.f33271x38b735af, "com.tencent.mm", this.f33270xada8fc90)) {
            str = "sendResp failed for wechat app signature check failed";
        } else {
            if (abstractC11230x9d3d6a61.mo48428x17b96605()) {
                android.os.Bundle bundle = new android.os.Bundle();
                abstractC11230x9d3d6a61.mo48431x792022dd(bundle);
                com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
                args.f32701xaddf3082 = bundle;
                args.f32702x38b73479 = "weixin://sendresp?appid=" + this.f33269x58b7f1c;
                args.f32706x6a744ba6 = "com.tencent.mm";
                args.f32705x81a4fd92 = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                try {
                    java.lang.String m48493x6a9bae2e = m48493x6a9bae2e(this.f33271x38b735af);
                    if (m48493x6a9bae2e != null) {
                        args.f32707x696b9f9 = m48493x6a9bae2e;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "getTokenFromWX fail, exception = ".concat(java.lang.String.valueOf(e17)));
                }
                return com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(this.f33271x38b735af, args);
            }
            str = "sendResp checkArgs fail";
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: setLogImpl */
    public void mo48539xc597c0c2(com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.InterfaceC11314x225a3b interfaceC11314x225a3b) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.m48579xc597c0c2(interfaceC11314x225a3b);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: unregisterApp */
    public void mo48540xd10f3445() {
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
        }
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11312x1c4a4fe5.m48578x2489caea(this.f33271x38b735af, "com.tencent.mm", this.f33270xada8fc90)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "unregister app failed for wechat app signature check failed");
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "unregisterApp, appId = " + this.f33269x58b7f1c);
        java.lang.String str = this.f33269x58b7f1c;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "unregisterApp fail, appId is empty");
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "unregister app " + this.f33271x38b735af.getPackageName());
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.C30917a c30917a = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.C30917a();
        c30917a.f153860a = "com.tencent.mm";
        c30917a.f32708xab2f7e36 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32758xe9ebbae8;
        c30917a.f32710x38b73479 = "weixin://unregisterapp?appid=" + this.f33269x58b7f1c;
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.a(this.f33271x38b735af, c30917a);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: registerApp */
    public boolean mo48535x80d82c7e(java.lang.String str, long j17) {
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        }
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11312x1c4a4fe5.m48578x2489caea(this.f33271x38b735af, "com.tencent.mm", this.f33270xada8fc90)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "register app failed for wechat app signature check failed");
            return false;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "registerApp, appId = ".concat(java.lang.String.valueOf(str)));
        if (str != null) {
            this.f33269x58b7f1c = str;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "registerApp, appId = ".concat(java.lang.String.valueOf(str)));
        if (str != null) {
            this.f33269x58b7f1c = str;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d(TAG, "register app " + this.f33271x38b735af.getPackageName());
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.C30917a c30917a = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.C30917a();
        c30917a.f153860a = "com.tencent.mm";
        c30917a.f32708xab2f7e36 = com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32757x65d6144f;
        c30917a.f32710x38b73479 = "weixin://registerapp?appid=" + this.f33269x58b7f1c;
        c30917a.f153861b = j17;
        return com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.a.a.a(this.f33271x38b735af, c30917a);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11306x8184c0d0
    /* renamed from: sendReq */
    public boolean mo48537x7602e3f6(com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed abstractC11229x4f6513ed, final com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.InterfaceC11309x3a5bca3b interfaceC11309x3a5bca3b) {
        java.lang.StringBuilder sb6;
        java.lang.String str;
        java.lang.String str2;
        if (this.f33272x3e428b72) {
            throw new java.lang.IllegalStateException("sendReq fail, WXMsgImpl has been detached");
        }
        if (!com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11312x1c4a4fe5.m48578x2489caea(this.f33271x38b735af, "com.tencent.mm", this.f33270xada8fc90)) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "sendReq failed for wechat app signature check failed");
            return false;
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 2) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req) abstractC11229x4f6513ed;
            if (req.f33050x683188c == 4) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject iWXSceneDataObject = req.f33051x97b14d35;
                if (iWXSceneDataObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5) iWXSceneDataObject;
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = req.f33049x38eb0007;
                    if (c11286x34a5504.f33122xe4128443 == null) {
                        c11286x34a5504.f33122xe4128443 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d();
                    }
                    if (req.f33049x38eb0007.m48467xfb85f7b0() == 1 && ((str2 = c11295xb9c370e5.f33222xf1cfa047) == null || str2.length() <= 0)) {
                        c11295xb9c370e5.f33222xf1cfa047 = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d) req.f33049x38eb0007.f33122xe4128443).f33229x36452d;
                    }
                }
            }
        }
        if (!abstractC11229x4f6513ed.mo48424x17b96605()) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "sendReq checkArgs fail");
            return false;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "sendReq, req type = " + abstractC11229x4f6513ed.mo48426xfb85f7b0());
        final android.os.Bundle bundle = new android.os.Bundle();
        abstractC11229x4f6513ed.mo48427x792022dd(bundle);
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 5 || abstractC11229x4f6513ed.mo48426xfb85f7b0() == 27) {
            return m48522x16c0e47e(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 9) {
            return m48498x209c4ce5(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 16) {
            return m48500xc991a05a(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 11) {
            return m48519x7a805c02(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 12) {
            return m48520x986c39a7(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 25) {
            return m48517x81134bc7(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 13) {
            return m48515xfaa7a813(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 14) {
            return m48490x8cb7f14f(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 15) {
            return m48495xffd41f7d(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 17) {
            return m48509x10ffa4ea(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 18) {
            return m48526xce221705(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 28) {
            return m48524xc2fdc8eb(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 29) {
            return m48513xf2328a2(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 23) {
            return m48527xb240c156(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 19) {
            return m48512xeeea331(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 32) {
            return m48523x12369c48(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 30) {
            return m48528x3a078df8(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 26) {
            return m48516x9177ed97(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 33) {
            return m48506x4efbc84a(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 39) {
            return m48507xea2b4240(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 34) {
            return m48505x69fd6151(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 35) {
            return m48504x82333a44(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 36) {
            return m48503x82306ef6(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 41) {
            return m48502xc3d71442(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 42) {
            return m48501xa3946f2b(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 37) {
            return m48518xacb3859d(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 38) {
            return m48525x5acbd7ac(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 20) {
            return m48510xe32aeae6(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 21) {
            return m48514x1c36a782(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 22) {
            return m48521x287a029a(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 24) {
            return m48511xf6431128(this.f33271x38b735af, bundle);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 43) {
            return m48508x4b788564(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 44) {
            return m48499x4645d06d(this.f33271x38b735af, abstractC11229x4f6513ed);
        }
        if (abstractC11229x4f6513ed.mo48426xfb85f7b0() == 2) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req2 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req) abstractC11229x4f6513ed;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.a(req2.f33049x38eb0007.m48467xfb85f7b0())) {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb c11287xc333feeb = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11287xc333feeb) req2.f33049x38eb0007.f33122xe4128443;
                c11287xc333feeb.f33177xf01afcf6 += "@app";
                java.lang.String str3 = c11287xc333feeb.f33176x346425;
                if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(str3)) {
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
                    c11287xc333feeb.f33176x346425 = sb6.toString();
                }
                int i17 = req2.f33050x683188c;
                if (i17 != 3 && i17 != 1) {
                    req2.f33050x683188c = 0;
                }
                abstractC11229x4f6513ed.mo48427x792022dd(bundle);
            }
        }
        java.lang.String m48567x3ff6dacc = this.f33274xc2cb030e.m48567x3ff6dacc(this.f33269x58b7f1c, abstractC11229x4f6513ed);
        if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(m48567x3ff6dacc)) {
            boolean m48491x64625d23 = m48491x64625d23(bundle);
            m48488x6f707e19(interfaceC11309x3a5bca3b, m48491x64625d23);
            return m48491x64625d23;
        }
        int m48566x45f79763 = this.f33274xc2cb030e.m48566x45f79763(this.f33269x58b7f1c, "638067712", m48567x3ff6dacc, new com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecurityCheck() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.2
            @Override // com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11311xd1d40b07.ISecurityCheck
            /* renamed from: onCheckFinish */
            public void mo48541x3393005c(boolean z17) {
                if (!z17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.TAG, "WXAPiSecurityHelper, extra check do next step: check fail, stop process!");
                    com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.this.m48488x6f707e19(interfaceC11309x3a5bca3b, false);
                } else {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.TAG, "WXAPiSecurityHelper, extra check do next step: check pass, doLaunchApp");
                    com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.this.m48488x6f707e19(interfaceC11309x3a5bca3b, com.p314xaae8f345.mm.p987xb4b579b0.p995xb4b53790.C11305xe603ba8d.this.m48491x64625d23(bundle));
                }
            }
        });
        if (m48566x45f79763 == 0) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "WXAPiSecurityHelper, extra check pass, doLaunchApp");
            boolean m48491x64625d232 = m48491x64625d23(bundle);
            m48488x6f707e19(interfaceC11309x3a5bca3b, m48491x64625d232);
            return m48491x64625d232;
        }
        if (m48566x45f79763 != 1) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "WXAPiSecurityHelper, hold on request, extra check need to do next step");
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "WXAPiSecurityHelper, extra check fail, return");
        m48488x6f707e19(interfaceC11309x3a5bca3b, false);
        return false;
    }
}
