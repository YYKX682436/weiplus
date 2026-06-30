package cc1;

/* loaded from: classes7.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f40439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cc1.p f40440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f40441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f40442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f40443h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cc1.p pVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40440e = pVar;
        this.f40441f = lVar;
        this.f40442g = jSONObject;
        this.f40443h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cc1.o(this.f40440e, this.f40441f, this.f40442g, this.f40443h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cc1.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object C;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f40439d;
        int i18 = this.f40443h;
        cc1.p pVar = this.f40440e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f40441f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                org.json.JSONObject jSONObject = this.f40442g;
                this.f40439d = 1;
                C = pVar.C(lVar, jSONObject, this);
                if (C == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                C = obj;
            }
            lVar.a(i18, (java.lang.String) C);
        } catch (cc1.n e17) {
            lVar.a(i18, pVar.r(null, e17.f40438d, null));
        } catch (java.lang.IllegalArgumentException unused) {
            pVar.getClass();
            str3 = android.text.TextUtils.isEmpty("fail:invalid argument") ? "fail:jsapi invalid request data" : "fail:invalid argument";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i18, pVar.u(str3, jSONObject2));
        } catch (java.security.InvalidKeyException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoBase", e19, "invalid key", new java.lang.Object[0]);
            pVar.getClass();
            str3 = android.text.TextUtils.isEmpty("fail:invalid key") ? "fail:jsapi invalid request data" : "fail:invalid key";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            lVar.a(i18, pVar.u(str3, jSONObject3));
        } catch (java.security.KeyStoreException e28) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoBase", e28, "KeyStore.getInstance fail", new java.lang.Object[0]);
            pVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
            }
            lVar.a(i18, pVar.u(str2, jSONObject4));
        } catch (java.security.NoSuchAlgorithmException e37) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoBase", e37, "no algorithm", new java.lang.Object[0]);
            pVar.getClass();
            str3 = android.text.TextUtils.isEmpty("fail:no such algorithm") ? "fail:jsapi invalid request data" : "fail:no such algorithm";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e38) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
            }
            lVar.a(i18, pVar.u(str3, jSONObject5));
        } catch (java.security.cert.CertificateException e39) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoBase", e39, "CertificateFactory.getInstance fail", new java.lang.Object[0]);
            pVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 4);
            } catch (java.lang.Exception e47) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
            }
            lVar.a(i18, pVar.u(str2, jSONObject6));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiCryptoBase", th6, "jsapicrypto fail", new java.lang.Object[0]);
            pVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            try {
                jSONObject7.put("errno", 4);
            } catch (java.lang.Exception e48) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e48);
            }
            lVar.a(i18, pVar.u(str2, jSONObject7));
        }
        return jz5.f0.f302826a;
    }
}
