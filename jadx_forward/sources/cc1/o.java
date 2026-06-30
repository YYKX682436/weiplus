package cc1;

/* loaded from: classes7.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f121972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc1.p f121973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f121974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f121975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f121976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cc1.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f121973e = pVar;
        this.f121974f = lVar;
        this.f121975g = jSONObject;
        this.f121976h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cc1.o(this.f121973e, this.f121974f, this.f121975g, this.f121976h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cc1.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object C;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f121972d;
        int i18 = this.f121976h;
        cc1.p pVar = this.f121973e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f121974f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                org.json.JSONObject jSONObject = this.f121975g;
                this.f121972d = 1;
                C = pVar.C(lVar, jSONObject, this);
                if (C == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                C = obj;
            }
            lVar.a(i18, (java.lang.String) C);
        } catch (cc1.n e17) {
            lVar.a(i18, pVar.r(null, e17.f121971d, null));
        } catch (java.lang.IllegalArgumentException unused) {
            pVar.getClass();
            str3 = android.text.TextUtils.isEmpty("fail:invalid argument") ? "fail:jsapi invalid request data" : "fail:invalid argument";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i18, pVar.u(str3, jSONObject2));
        } catch (java.security.InvalidKeyException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCryptoBase", e19, "invalid key", new java.lang.Object[0]);
            pVar.getClass();
            str3 = android.text.TextUtils.isEmpty("fail:invalid key") ? "fail:jsapi invalid request data" : "fail:invalid key";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i18, pVar.u(str3, jSONObject3));
        } catch (java.security.KeyStoreException e28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCryptoBase", e28, "KeyStore.getInstance fail", new java.lang.Object[0]);
            pVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e29) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
            }
            lVar.a(i18, pVar.u(str2, jSONObject4));
        } catch (java.security.NoSuchAlgorithmException e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCryptoBase", e37, "no algorithm", new java.lang.Object[0]);
            pVar.getClass();
            str3 = android.text.TextUtils.isEmpty("fail:no such algorithm") ? "fail:jsapi invalid request data" : "fail:no such algorithm";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e38) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
            }
            lVar.a(i18, pVar.u(str3, jSONObject5));
        } catch (java.security.cert.CertificateException e39) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCryptoBase", e39, "CertificateFactory.getInstance fail", new java.lang.Object[0]);
            pVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 4);
            } catch (java.lang.Exception e47) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
            }
            lVar.a(i18, pVar.u(str2, jSONObject6));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiCryptoBase", th6, "jsapicrypto fail", new java.lang.Object[0]);
            pVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            try {
                jSONObject7.put("errno", 4);
            } catch (java.lang.Exception e48) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e48);
            }
            lVar.a(i18, pVar.u(str2, jSONObject7));
        }
        return jz5.f0.f384359a;
    }
}
