package k91;

/* loaded from: classes7.dex */
public final class v5 extends dm.vc {
    public static final l75.e0 E1 = dm.vc.m125643x3593deb(dm.vc.class);
    public k91.o5 A1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 B1;
    public java.util.List C1 = null;
    public k91.l5 D1;

    /* renamed from: z1, reason: collision with root package name */
    public k91.j5 f387332z1;

    public static org.json.JSONObject t0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.WxaAttributes", e17, "createJsonObjectOrNull", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // dm.vc, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        super.mo9015xbf5d97fd(cursor);
        this.f387332z1 = null;
        this.A1 = null;
        this.B1 = null;
        this.C1 = null;
        this.D1 = null;
    }

    @Override // dm.vc, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return E1;
    }

    /* renamed from: toString */
    public java.lang.String m142229x9616526c() {
        return "WxaAttributes{field_username='" + this.f68924xdec927b + "', field_appId='" + this.f68904x28d45f97 + "', field_nickname='" + this.f68913x21f9b213 + "', field_signature='" + this.f68919xda9bc3b3 + "', field_registerSource='" + this.f68915x930b3683 + "', field_appInfo='" + this.f68905x453b082a + "', field_versionInfo='" + this.f68926x94cd21e1 + "', field_bindWxaInfo='" + this.f68908xb345d3ac + "', field_dynamicInfo='" + this.f68911x5c4f59c8 + "', field_bizMenu='" + this.f68909x6ebdf2cd + "'}";
    }

    public k91.j5 u0() {
        if (this.f387332z1 == null) {
            this.f387332z1 = k91.j5.a(this.f68905x453b082a);
        }
        return this.f387332z1;
    }

    public k91.o5 v0() {
        org.json.JSONObject jSONObject;
        if (this.A1 == null) {
            java.lang.String str = null;
            try {
                jSONObject = new org.json.JSONObject(this.f68911x5c4f59c8);
            } catch (java.lang.Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            this.A1 = new k91.o5();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("NewSetting");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            this.A1.f387239a.f158942d = optJSONObject.optInt("Uint32MaxLocalstorageSizeInMB", 5);
            this.A1.f387239a.f158943e = optJSONObject.optInt("Uint32OpendataMaxLocalstorageSizeInMB", 5);
            this.A1.f387239a.f158944f = optJSONObject.optInt("MaxCodeSize", 5);
            this.A1.f387239a.f158945g = optJSONObject.optInt("ExpendedMaxWebviewDepth", 5);
            this.A1.f387239a.f158946h = optJSONObject.optInt("MaxBackgroundLifespan", 600);
            this.A1.f387239a.f158947i = optJSONObject.optInt("MaxRequestConcurrent", 10);
            this.A1.f387239a.f158948m = optJSONObject.optInt("MaxUploadConcurrent", 10);
            this.A1.f387239a.f158949n = optJSONObject.optInt("MaxDownloadConcurrent", 10);
            this.A1.f387239a.f158950o = optJSONObject.optInt("MaxWebsocketConnect", 5);
            this.A1.f387239a.f158951p = optJSONObject.optInt("MaxWorkerConcurrent", 1);
            this.A1.f387239a.f158952q = optJSONObject.optInt("WebsocketSkipPortCheck", 0) != 0;
            this.A1.f387239a.f158953r = optJSONObject.optInt("TLSSkipHostnameCheck", 0) != 0;
            this.A1.f387239a.f158954s = optJSONObject.optInt("Uint32MaxFileStorageSizeInMB", 10);
            this.A1.f387239a.f158955t = optJSONObject.optInt("Uint32MaxTempFileStorageSizeInMB", 300);
            this.A1.f387239a.f158956u = optJSONObject.optInt("Uint32MinTempFileStorageSizeInMB", 100);
            this.A1.f387239a.f158957v = optJSONObject.optInt("CanKeepAliveByAudioPlay", 0) > 0;
            this.A1.f387239a.f158958w = optJSONObject.optInt("LifeSpanBeforeSuspend", 5);
            this.A1.f387239a.f158959x = optJSONObject.optInt("LifeSpanAfterSuspend", 300);
            this.A1.f387239a.f158960y = optJSONObject.optInt("ScanCodeEnableZZM", 0) != 0;
            this.A1.f387239a.f158961z = optJSONObject.optInt("CanPreFetchData", 0) > 0;
            this.A1.f387239a.A = optJSONObject.optInt("PreFetchDataWithLocation", 0) > 0;
            this.A1.f387239a.B = optJSONObject.optInt("CanPeriodFetchData", 0) > 0;
            this.A1.f387239a.C = optJSONObject.optInt("PeriodFetchData", 0);
            this.A1.f387239a.D = optJSONObject.optInt("PeriodFetchDataDay", 7);
            this.A1.f387239a.E = optJSONObject.optInt("GuaranteeFlag", 0);
            this.A1.f387239a.F = optJSONObject.optInt("CanShowLoadingAdvert", 0) > 0;
            this.A1.f387239a.G = optJSONObject.optInt("CanShowGameLoadingAdvert", 0) > 0;
            this.A1.f387239a.H = optJSONObject.optInt("BrandOfficialLabel", 0);
            this.A1.f387239a.I = optJSONObject.optLong("OpenWxaWaitUpdateMaxMicSec", 13000L);
            this.A1.f387239a.f158941J = optJSONObject.optLong("OpenWxaWaitUpdateMaxMicSecForWeakNet", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            this.A1.f387239a.K = optJSONObject.optLong("OpenWxaWaitUpdateMinMicSec", 0L);
            this.A1.f387239a.L = optJSONObject.optLong("NextTryOpenWxaDisMicSec", com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            this.A1.f387239a.M = optJSONObject.optString("PreCgiCallByteBeforeLaunch", "").getBytes(java.nio.charset.StandardCharsets.UTF_8);
            this.A1.f387239a.N = optJSONObject.optLong("Uint32WxaLibPrivateMaxFileStorageSizeInMB", 200L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6 = this.A1.f387239a;
            java.lang.String optString = optJSONObject.optString("GameABTestControlBytes");
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                    byte[] decode = android.util.Base64.decode(optString, 0);
                    r45.zb7 zb7Var = new r45.zb7();
                    zb7Var.mo11468x92b714fd(decode);
                    byte[] bArr = zb7Var.f473431d.f273689a;
                    java.lang.String trim = new java.lang.String(android.util.Base64.encode(bArr, 0)).trim();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
                    if (bArr != null) {
                        for (int i17 = 0; i17 < bArr.length; i17++) {
                            byte b17 = bArr[i17];
                            if (i17 != 0) {
                                sb6.append(",");
                            }
                            sb6.append((int) b17);
                        }
                    }
                    sb6.append("]");
                    k91.j5 u07 = u0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributes", "dl: GameABTestControlBytes[%s]: \"%s\" -> %s -> \"%s\"", u07 != null ? u07.f387161c : null, optString, sb6, trim);
                    str = trim;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.WxaAttributes", e17, "dl: GameABTestControlBytes, error, \"%s\"", optString);
            }
            c11825xb74ac8c6.P = str;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("NewCategories");
            if (optJSONArray != null) {
                this.A1.f387240b = new java.util.LinkedList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                    if (optJSONObject2 != null) {
                        this.A1.f387240b.add(new android.util.Pair(optJSONObject2.optString("first"), optJSONObject2.optString("second")));
                    }
                }
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("parallel_download_info");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributes", "[ParallelDownload] getDynamicInfo: raw parallel_download_info json=%s", optJSONObject3);
            if (optJSONObject3 != null) {
                org.json.JSONArray optJSONArray2 = optJSONObject3.optJSONArray("package_list");
                if (optJSONArray2 != null) {
                    this.A1.f387241c = new java.util.LinkedList();
                    for (int i19 = 0; i19 < optJSONArray2.length(); i19++) {
                        org.json.JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i19);
                        if (optJSONObject4 != null) {
                            this.A1.f387241c.add(new android.util.Pair(optJSONObject4.optString("module_name"), optJSONObject4.optString("package_type")));
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributes", "[ParallelDownload] getDynamicInfo: package_list is NULL inside parallel_download_info");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttributes", "[ParallelDownload] getDynamicInfo: parallel_download_info is NULL in dynamicInfo json");
            }
        }
        return this.A1;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w0() {
        if (this.B1 != null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68926x94cd21e1)) {
            return this.B1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553.a(this.f68926x94cd21e1);
        this.B1 = a17;
        return a17;
    }

    public final java.util.List y0(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                k91.k5 k5Var = new k91.k5();
                jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
                jSONObject.optInt("type");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("value", ""));
                k5Var.f387197a = jSONObject2.optString("userName", "");
                k5Var.f387198b = jSONObject2.optString("pagePath", "");
                k5Var.f387199c = jSONObject2.optInt("version");
                y0(jSONObject.optJSONArray("sub_button_list"));
                arrayList.add(k5Var);
            }
            return arrayList;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public java.lang.String z0() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("NickName", this.f68913x21f9b213);
        hashMap.put("BrandIconURL", this.f68910xea1bd3d4);
        hashMap.put("BigHeadImgUrl", this.f68907x6b8edeb4);
        hashMap.put("SmallHeadImgUrl", this.f68920x68aa7b8d);
        hashMap.put("Signature", this.f68919xda9bc3b3);
        hashMap.put("WxAppOpt", java.lang.Integer.valueOf(this.f68906xf1b7abb7));
        hashMap.put("RegisterSource", t0(this.f68915x930b3683));
        hashMap.put("WxaAppInfo", t0(this.f68905x453b082a));
        hashMap.put("WxaAppVersionInfo", t0(this.f68926x94cd21e1));
        hashMap.put("BindWxaInfo", t0(this.f68908xb345d3ac));
        hashMap.put("WxaAppDynamic", t0(this.f68911x5c4f59c8));
        hashMap.put("MMBizMenu", t0(this.f68909x6ebdf2cd));
        return new org.json.JSONObject(hashMap).toString();
    }
}
