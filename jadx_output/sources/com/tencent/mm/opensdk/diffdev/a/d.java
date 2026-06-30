package com.tencent.mm.opensdk.diffdev.a;

/* loaded from: classes15.dex */
public final class d extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.tencent.mm.opensdk.diffdev.a.d.a> {

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f72334h = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";
    private java.lang.String appId;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f72335i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f72336j;

    /* renamed from: k, reason: collision with root package name */
    private com.tencent.mm.opensdk.diffdev.OAuthListener f72337k;

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.mm.opensdk.diffdev.a.f f72338l;
    private java.lang.String scope;
    private java.lang.String signature;

    /* loaded from: classes15.dex */
    public static class a {

        /* renamed from: m, reason: collision with root package name */
        public com.tencent.mm.opensdk.diffdev.OAuthErrCode f72339m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f72340n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f72341o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f72342p;

        /* renamed from: q, reason: collision with root package name */
        public int f72343q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f72344r;

        /* renamed from: s, reason: collision with root package name */
        public byte[] f72345s;

        private a() {
        }

        public static com.tencent.mm.opensdk.diffdev.a.d.a a(byte[] bArr) {
            com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode;
            java.lang.String format;
            com.tencent.mm.opensdk.diffdev.a.d.a aVar = new com.tencent.mm.opensdk.diffdev.a.d.a();
            if (bArr == null || bArr.length == 0) {
                com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                        int i17 = jSONObject.getInt("errcode");
                        if (i17 != 0) {
                            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.GetQRCodeResult", java.lang.String.format("resp errcode = %d", java.lang.Integer.valueOf(i17)));
                            aVar.f72339m = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
                            aVar.f72343q = i17;
                            aVar.f72344r = jSONObject.optString("errmsg");
                            return aVar;
                        }
                        java.lang.String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null && string.length() != 0) {
                            byte[] decode = android.util.Base64.decode(string, 0);
                            if (decode != null && decode.length != 0) {
                                aVar.f72339m = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK;
                                aVar.f72345s = decode;
                                aVar.f72340n = jSONObject.getString("uuid");
                                java.lang.String string2 = jSONObject.getString("appname");
                                aVar.f72341o = string2;
                                com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.GetQRCodeResult", java.lang.String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f72340n, string2, java.lang.Integer.valueOf(aVar.f72345s.length)));
                                return aVar;
                            }
                            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                            aVar.f72339m = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                            return aVar;
                        }
                        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.f72339m = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (java.lang.Exception e17) {
                        format = java.lang.String.format("parse json fail, ex = %s", e17.getMessage());
                        com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.GetQRCodeResult", format);
                        oAuthErrCode = com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f72339m = oAuthErrCode;
                        return aVar;
                    }
                } catch (java.lang.Exception e18) {
                    format = java.lang.String.format("parse fail, build String fail, ex = %s", e18.getMessage());
                }
            }
            aVar.f72339m = oAuthErrCode;
            return aVar;
        }
    }

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.opensdk.diffdev.OAuthListener oAuthListener) {
        this.appId = str;
        this.scope = str2;
        this.f72335i = str3;
        this.f72336j = str4;
        this.signature = str5;
        this.f72337k = oAuthListener;
    }

    public final boolean a() {
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        com.tencent.mm.opensdk.diffdev.a.f fVar = this.f72338l;
        return fVar == null ? cancel(true) : fVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.d.a doInBackground(java.lang.Void[] voidArr) {
        java.lang.Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        java.lang.String format = java.lang.String.format(f72334h, this.appId, this.f72335i, this.f72336j, this.scope, this.signature);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] a17 = com.tencent.mm.opensdk.diffdev.a.e.a(format);
        com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.GetQRCodeTask", java.lang.String.format("doInBackground, url = %s, time consumed = %d(ms)", format, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis)));
        return com.tencent.mm.opensdk.diffdev.a.d.a.a(a17);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(com.tencent.mm.opensdk.diffdev.a.d.a aVar) {
        com.tencent.mm.opensdk.diffdev.a.d.a aVar2 = aVar;
        com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode = aVar2.f72339m;
        if (oAuthErrCode != com.tencent.mm.opensdk.diffdev.OAuthErrCode.WechatAuth_Err_OK) {
            com.tencent.mm.opensdk.utils.Log.e("MicroMsg.SDK.GetQRCodeTask", java.lang.String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", oAuthErrCode));
            this.f72337k.onAuthFinish(aVar2.f72339m, null);
            return;
        }
        com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f72345s.length);
        this.f72337k.onAuthGotQrcode(aVar2.f72342p, aVar2.f72345s);
        com.tencent.mm.opensdk.diffdev.a.f fVar = new com.tencent.mm.opensdk.diffdev.a.f(aVar2.f72340n, this.f72337k);
        this.f72338l = fVar;
        fVar.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
    }
}
