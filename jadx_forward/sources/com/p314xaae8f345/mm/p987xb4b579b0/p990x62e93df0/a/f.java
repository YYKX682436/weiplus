package com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a;

/* loaded from: classes15.dex */
final class f extends android.os.AsyncTask<java.lang.Void, java.lang.Void, com.tencent.mm.opensdk.diffdev.a.f.a> {

    /* renamed from: k, reason: collision with root package name */
    private com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b f153879k;

    /* renamed from: n, reason: collision with root package name */
    private java.lang.String f153880n;

    /* renamed from: t, reason: collision with root package name */
    private int f153881t;
    private java.lang.String url;

    /* loaded from: classes15.dex */
    public static class a {

        /* renamed from: m, reason: collision with root package name */
        public com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b f153882m;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f153883u;

        /* renamed from: v, reason: collision with root package name */
        public int f153884v;

        public static com.tencent.mm.opensdk.diffdev.a.f.a b(byte[] bArr) {
            com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b;
            java.lang.String format;
            com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b2;
            com.tencent.mm.opensdk.diffdev.a.f.a aVar = new com.tencent.mm.opensdk.diffdev.a.f.a();
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.NoopingResult", "star parse NoopingResult");
            if (bArr == null || bArr.length == 0) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                enumC11227x40edae5b = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                        int i17 = jSONObject.getInt("wx_errcode");
                        aVar.f153884v = i17;
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.NoopingResult", java.lang.String.format("nooping uuidStatusCode = %d", java.lang.Integer.valueOf(i17)));
                        int i18 = aVar.f153884v;
                        if (i18 == 408) {
                            enumC11227x40edae5b2 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_OK;
                        } else {
                            if (i18 != 500) {
                                switch (i18) {
                                    case 402:
                                        enumC11227x40edae5b2 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_Timeout;
                                        break;
                                    case 403:
                                        enumC11227x40edae5b2 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_Cancel;
                                        break;
                                    case 404:
                                        enumC11227x40edae5b2 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_OK;
                                        break;
                                    case 405:
                                        aVar.f153882m = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_OK;
                                        aVar.f153883u = jSONObject.getString("wx_code");
                                        break;
                                    default:
                                        enumC11227x40edae5b2 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
                                        break;
                                }
                                return aVar;
                            }
                            enumC11227x40edae5b2 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
                        }
                        aVar.f153882m = enumC11227x40edae5b2;
                        return aVar;
                    } catch (java.lang.Exception e17) {
                        format = java.lang.String.format("parse json fail, ex = %s", e17.getMessage());
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.NoopingResult", format);
                        enumC11227x40edae5b = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
                        aVar.f153882m = enumC11227x40edae5b;
                        return aVar;
                    }
                } catch (java.lang.Exception e18) {
                    format = java.lang.String.format("parse fail, build String fail, ex = %s", e18.getMessage());
                }
            }
            aVar.f153882m = enumC11227x40edae5b;
            return aVar;
        }
    }

    public f(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b interfaceC11228xdc3b346b) {
        this.f153880n = str;
        this.f153879k = interfaceC11228xdc3b346b;
        this.url = java.lang.String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", str);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.f.a doInBackground(java.lang.Void[] voidArr) {
        com.tencent.mm.opensdk.diffdev.a.f.a aVar;
        com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b;
        java.lang.String str;
        java.lang.Thread.currentThread().setName("OpenSdkNoopingTask");
        java.lang.String str2 = this.f153880n;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new com.tencent.mm.opensdk.diffdev.a.f.a();
            enumC11227x40edae5b = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
        } else {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start " + isCancelled());
            while (!isCancelled()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(this.url);
                if (this.f153881t == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.f153881t;
                }
                sb6.append(str);
                java.lang.String sb7 = sb6.toString();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                byte[] a17 = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.e.a(sb7);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.tencent.mm.opensdk.diffdev.a.f.a b17 = com.tencent.mm.opensdk.diffdev.a.f.a.b(a17);
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.NoopingTask", java.lang.String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", sb7, b17.f153882m.toString(), java.lang.Integer.valueOf(b17.f153884v), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis)));
                com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b2 = b17.f153882m;
                if (enumC11227x40edae5b2 != com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_OK) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.NoopingTask", java.lang.String.format("nooping fail, errCode = %s, uuidStatusCode = %d", enumC11227x40edae5b2.toString(), java.lang.Integer.valueOf(b17.f153884v)));
                    return b17;
                }
                int i17 = b17.f153884v;
                this.f153881t = i17;
                if (i17 == com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.g.UUID_SCANED.m48423xfb7e1663()) {
                    this.f153879k.mo48419x23fb32e3();
                } else if (b17.f153884v != com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.g.UUID_KEEP_CONNECT.m48423xfb7e1663() && b17.f153884v == com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.g.UUID_CONFIRM.m48423xfb7e1663()) {
                    java.lang.String str3 = b17.f153883u;
                    if (str3 == null || str3.length() == 0) {
                        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                        b17.f153882m = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_NormalErr;
                    }
                    return b17;
                }
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new com.tencent.mm.opensdk.diffdev.a.f.a();
            enumC11227x40edae5b = com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b.WechatAuth_Err_Auth_Stopped;
        }
        aVar.f153882m = enumC11227x40edae5b;
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(com.tencent.mm.opensdk.diffdev.a.f.a aVar) {
        com.tencent.mm.opensdk.diffdev.a.f.a aVar2 = aVar;
        this.f153879k.mo48417x2736d79a(aVar2.f153882m, aVar2.f153883u);
    }
}
