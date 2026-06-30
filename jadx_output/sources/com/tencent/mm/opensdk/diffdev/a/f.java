package com.tencent.mm.opensdk.diffdev.a;

/* loaded from: classes15.dex */
final class f extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.tencent.mm.opensdk.diffdev.a.f.a> {

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.mm.opensdk.diffdev.OAuthListener f72346k;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f72347n;

    /* renamed from: t, reason: collision with root package name */
    private int f72348t;
    private java.lang.String url;

    /* loaded from: classes15.dex */
    public static class a {

        /* renamed from: m, reason: collision with root package name */
        public com.tencent.mm.opensdk.diffdev.OAuthErrCode f72349m;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f72350u;

        /* renamed from: v, reason: collision with root package name */
        public int f72351v;

        public static com.tencent.mm.opensdk.diffdev.a.f.a b(byte[] bArr) {
            com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode;
            java.lang.String format;
            com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode2;
            com.tencent.mm.opensdk.diffdev.a.f.a aVar = new com.tencent.mm.opensdk.diffdev.a.f.a();
            com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArr == null || bArr.length == 0) {
                com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                oAuthErrCode = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                        int i17 = jSONObject.getInt("wx_errcode");
                        aVar.f72351v = i17;
                        com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.NoopingResult", java.lang.String.format("nooping uuidStatusCode = %d", java.lang.Integer.valueOf(i17)));
                        int i18 = aVar.f72351v;
                        if (i18 == 408) {
                            oAuthErrCode2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK;
                        } else {
                            if (i18 != 500) {
                                switch (i18) {
                                    case 402:
                                        oAuthErrCode2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Timeout;
                                        break;
                                    case 403:
                                        oAuthErrCode2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Cancel;
                                        break;
                                    case 404:
                                        oAuthErrCode2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK;
                                        break;
                                    case 405:
                                        aVar.f72349m = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK;
                                        aVar.f72350u = jSONObject.getString("wx_code");
                                        break;
                                    default:
                                        oAuthErrCode2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
                                        break;
                                }
                                return aVar;
                            }
                            oAuthErrCode2 = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
                        }
                        aVar.f72349m = oAuthErrCode2;
                        return aVar;
                    } catch (java.lang.Exception e17) {
                        format = java.lang.String.format("parse json fail, ex = %s", e17.getMessage());
                        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.NoopingResult", format);
                        oAuthErrCode = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f72349m = oAuthErrCode;
                        return aVar;
                    }
                } catch (java.lang.Exception e18) {
                    format = java.lang.String.format("parse fail, build String fail, ex = %s", e18.getMessage());
                }
            }
            aVar.f72349m = oAuthErrCode;
            return aVar;
        }
    }

    public f(java.lang.String str, com.tencent.mm.opensdk.diffdev.OAuthListener oAuthListener) {
        this.f72347n = str;
        this.f72346k = oAuthListener;
        this.url = java.lang.String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.f.a doInBackground(java.lang.Void[] voidArr) {
        com.tencent.mm.opensdk.diffdev.a.f.a aVar;
        com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode;
        java.lang.String str;
        java.lang.Thread.currentThread().setName("OpenSdkNoopingTask");
        java.lang.String str2 = this.f72347n;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new com.tencent.mm.opensdk.diffdev.a.f.a();
            oAuthErrCode = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (!isCancelled()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.url);
                if (this.f72348t == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.f72348t;
                }
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                byte[] a17 = com.tencent.mm.opensdk.diffdev.a.e.a(sb7);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.tencent.mm.opensdk.diffdev.a.f.a b17 = com.tencent.mm.opensdk.diffdev.a.f.a.b(a17);
                com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.NoopingTask", java.lang.String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", sb7, b17.f72349m.toString(), java.lang.Integer.valueOf(b17.f72351v), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis)));
                com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode2 = b17.f72349m;
                if (oAuthErrCode2 != com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK) {
                    com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.NoopingTask", java.lang.String.format("nooping fail, errCode = %s, uuidStatusCode = %d", oAuthErrCode2.toString(), java.lang.Integer.valueOf(b17.f72351v)));
                    return b17;
                }
                int i17 = b17.f72351v;
                this.f72348t = i17;
                if (i17 == com.tencent.mm.opensdk.diffdev.a.g.UUID_SCANED.getCode()) {
                    this.f72346k.onQrcodeScanned();
                } else if (b17.f72351v != com.tencent.mm.opensdk.diffdev.a.g.UUID_KEEP_CONNECT.getCode() && b17.f72351v == com.tencent.mm.opensdk.diffdev.a.g.UUID_CONFIRM.getCode()) {
                    java.lang.String str3 = b17.f72350u;
                    if (str3 == null || str3.length() == 0) {
                        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                        b17.f72349m = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
                    }
                    return b17;
                }
            }
            com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new com.tencent.mm.opensdk.diffdev.a.f.a();
            oAuthErrCode = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.f72349m = oAuthErrCode;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(com.tencent.mm.opensdk.diffdev.a.f.a aVar) {
        com.tencent.mm.opensdk.diffdev.a.f.a aVar2 = aVar;
        this.f72346k.onAuthFinish(aVar2.f72349m, aVar2.f72350u);
    }
}
