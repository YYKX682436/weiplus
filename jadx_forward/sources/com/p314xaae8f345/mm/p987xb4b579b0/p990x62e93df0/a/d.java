package com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a;

/* loaded from: classes15.dex */
public final class d extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.tencent.mm.opensdk.diffdev.a.d.a> {

    /* renamed from: h, reason: collision with root package name */
    private static java.lang.String f153867h = "https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s";

    /* renamed from: appId */
    private java.lang.String f32861x58b7f1c;

    /* renamed from: i, reason: collision with root package name */
    private java.lang.String f153868i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f153869j;

    /* renamed from: k, reason: collision with root package name */
    private com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b f153870k;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.f f153871l;

    /* renamed from: scope */
    private java.lang.String f32862x6833e54;

    /* renamed from: signature */
    private java.lang.String f32863x3ffd98b8;

    /* loaded from: classes15.dex */
    public static class a {

        /* renamed from: m, reason: collision with root package name */
        public com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b f153872m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f153873n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f153874o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f153875p;

        /* renamed from: q, reason: collision with root package name */
        public int f153876q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f153877r;

        /* renamed from: s, reason: collision with root package name */
        public byte[] f153878s;

        private a() {
        }

        public static com.tencent.mm.opensdk.diffdev.a.d.a a(byte[] bArr) {
            com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b;
            java.lang.String format;
            com.tencent.mm.opensdk.diffdev.a.d.a aVar = new com.tencent.mm.opensdk.diffdev.a.d.a();
            if (bArr == null || bArr.length == 0) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                enumC11227x40edae5b = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                        int i17 = jSONObject.getInt("errcode");
                        if (i17 != 0) {
                            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.GetQRCodeResult", java.lang.String.format("resp errcode = %d", java.lang.Integer.valueOf(i17)));
                            aVar.f153872m = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
                            aVar.f153876q = i17;
                            aVar.f153877r = jSONObject.optString("errmsg");
                            return aVar;
                        }
                        java.lang.String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null && string.length() != 0) {
                            byte[] decode = android.util.Base64.decode(string, 0);
                            if (decode != null && decode.length != 0) {
                                aVar.f153872m = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_OK;
                                aVar.f153878s = decode;
                                aVar.f153873n = jSONObject.getString("uuid");
                                java.lang.String string2 = jSONObject.getString("appname");
                                aVar.f153874o = string2;
                                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.GetQRCodeResult", java.lang.String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", aVar.f153873n, string2, java.lang.Integer.valueOf(aVar.f153878s.length)));
                                return aVar;
                            }
                            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                            aVar.f153872m = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_JsonDecodeErr;
                            return aVar;
                        }
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.f153872m = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (java.lang.Exception e17) {
                        format = java.lang.String.format("parse json fail, ex = %s", e17.getMessage());
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.GetQRCodeResult", format);
                        enumC11227x40edae5b = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
                        aVar.f153872m = enumC11227x40edae5b;
                        return aVar;
                    }
                } catch (java.lang.Exception e18) {
                    format = java.lang.String.format("parse fail, build String fail, ex = %s", e18.getMessage());
                }
            }
            aVar.f153872m = enumC11227x40edae5b;
            return aVar;
        }
    }

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b interfaceC11228xdc3b346b) {
        this.f32861x58b7f1c = str;
        this.f32862x6833e54 = str2;
        this.f153868i = str3;
        this.f153869j = str4;
        this.f32863x3ffd98b8 = str5;
        this.f153870k = interfaceC11228xdc3b346b;
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.f fVar = this.f153871l;
        return fVar == null ? cancel(true) : fVar.cancel(true);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.d.a doInBackground(java.lang.Void[] voidArr) {
        java.lang.Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        java.lang.String format = java.lang.String.format(f153867h, this.f32861x58b7f1c, this.f153868i, this.f153869j, this.f32862x6833e54, this.f32863x3ffd98b8);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] a17 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.e.a(format);
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.GetQRCodeTask", java.lang.String.format("doInBackground, url = %s, time consumed = %d(ms)", format, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis)));
        return com.tencent.mm.opensdk.diffdev.a.d.a.a(a17);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(com.tencent.mm.opensdk.diffdev.a.d.a aVar) {
        com.tencent.mm.opensdk.diffdev.a.d.a aVar2 = aVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b = aVar2.f153872m;
        if (enumC11227x40edae5b != com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_OK) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.GetQRCodeTask", java.lang.String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", enumC11227x40edae5b));
            this.f153870k.mo48417x2736d79a(aVar2.f153872m, null);
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar2.f153878s.length);
        this.f153870k.mo48418x7ef9aad3(aVar2.f153875p, aVar2.f153878s);
        com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.f fVar = new com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.f(aVar2.f153873n, this.f153870k);
        this.f153871l = fVar;
        fVar.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
    }
}
