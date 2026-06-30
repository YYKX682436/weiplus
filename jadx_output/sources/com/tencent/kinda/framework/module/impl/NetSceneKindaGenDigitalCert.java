package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class NetSceneKindaGenDigitalCert extends com.tencent.mm.wallet_core.tenpay.model.o {
    private final java.lang.String TAG = "kinda.NetSceneKindaGenDigitalCert";
    com.tencent.mm.wallet_core.model.i certEncryptType;

    /* renamed from: com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$mm$wallet_core$model$CertUtilWxNew$DigitalCertEncryptType;

        static {
            int[] iArr = new int[com.tencent.mm.wallet_core.model.i.values().length];
            $SwitchMap$com$tencent$mm$wallet_core$model$CertUtilWxNew$DigitalCertEncryptType = iArr;
            try {
                iArr[2] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$mm$wallet_core$model$CertUtilWxNew$DigitalCertEncryptType[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$mm$wallet_core$model$CertUtilWxNew$DigitalCertEncryptType[0] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public NetSceneKindaGenDigitalCert(com.tencent.kinda.gen.KGenDigitalCrtReq kGenDigitalCrtReq) {
        com.tencent.mm.wallet_core.model.i iVar = com.tencent.mm.wallet_core.model.i.DigitalCertEncryptTypeRSA;
        this.certEncryptType = iVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        int certEncryptType = kGenDigitalCrtReq.getCertEncryptType();
        com.tencent.mars.xlog.Log.i("kinda.NetSceneKindaGenDigitalCert", "encrypt type: %d", java.lang.Integer.valueOf(certEncryptType));
        if (certEncryptType < 0 || certEncryptType > 2) {
            this.certEncryptType = iVar;
        } else {
            this.certEncryptType = com.tencent.mm.wallet_core.model.i.values()[certEncryptType];
        }
        hashMap.put("cert_encrypt_type", fp.s0.a(this.certEncryptType.ordinal() + ""));
        baseRequset(hashMap);
        int i17 = kGenDigitalCrtReq.mType;
        if (i17 == 1) {
            hashMap.put("type", fp.s0.a("1"));
            hashMap.put("id_no", fp.s0.a(kGenDigitalCrtReq.getIdNo()));
            hashMap.put("id_type", fp.s0.a(kGenDigitalCrtReq.getIdType() + ""));
        } else if (i17 == 2) {
            hashMap.put("type", fp.s0.a("2"));
            hashMap.put("crt_sms", fp.s0.a(kGenDigitalCrtReq.getVerifyCode()));
            hashMap.put("reqkey", fp.s0.a(kGenDigitalCrtReq.getReqKey()));
        } else if (i17 == 3) {
            hashMap.put("type", fp.s0.a("3"));
            hashMap.put("crt_token", fp.s0.a(kGenDigitalCrtReq.getToken()));
        } else if (i17 == 4) {
            hashMap.put("type", fp.s0.a("4"));
            hashMap.put("id_type", fp.s0.a(kGenDigitalCrtReq.getIdType() + ""));
            hashMap.put("cre_tail", fp.s0.a(kGenDigitalCrtReq.getCreTail()));
            hashMap.put("reqkey", fp.s0.a(kGenDigitalCrtReq.getReqKey()));
        } else if (i17 == 5) {
            hashMap.put("type", fp.s0.a("5"));
            hashMap.put("reqkey", fp.s0.a(kGenDigitalCrtReq.getReqKey()));
        } else if (i17 == 6) {
            hashMap.put("type", fp.s0.a("6"));
            hashMap.put("reqkey", fp.s0.a(kGenDigitalCrtReq.getReqKey()));
        } else {
            com.tencent.mars.xlog.Log.e("kinda.NetSceneKindaGenDigitalCert", "KGenDigitalCrtReq.mType is illeagl.");
        }
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    private void baseRequset(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String g17;
        gm0.j1.i();
        java.lang.String a17 = kk.v.a(gm0.j1.b().h());
        java.lang.String g18 = wo.w0.g(false);
        byte[] bArr = new byte[16];
        byte[] bytes = com.tencent.mm.wallet_core.model.f1.a().getBytes();
        if (bytes == null || bytes.length <= 0) {
            bytes = ("" + java.lang.System.currentTimeMillis()).getBytes();
        }
        int i17 = 0;
        int i18 = 0;
        do {
            bArr[i18] = bytes[i17];
            i18++;
            i17++;
            if (i17 >= bytes.length) {
                i17 = 0;
            }
        } while (i18 < 16);
        java.lang.String str = new java.lang.String(bArr);
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(a17 + g18);
        java.lang.String a19 = com.tencent.mm.sdk.platformtools.w2.a(a17 + g18 + bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SN=");
        sb6.append(a19);
        java.lang.String sb7 = sb6.toString();
        int ordinal = this.certEncryptType.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            g17 = com.tencent.mm.wallet_core.model.j.b().g("WeChatPay", sb7, this.certEncryptType, 0);
        } else {
            java.lang.String a27 = com.tencent.mm.sdk.platformtools.w2.a(a17 + a18 + new java.lang.String(bArr));
            com.tencent.mm.wallet_core.b.a().getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", java.lang.Boolean.TRUE);
            g17 = com.tencent.mm.wallet_core.model.j.b().g("WeChatPay", a27, this.certEncryptType, 1);
        }
        com.tencent.mars.xlog.Log.i("kinda.NetSceneKindaGenDigitalCert", "salt ".concat(new java.lang.String(bArr)));
        com.tencent.mars.xlog.Log.i("kinda.NetSceneKindaGenDigitalCert", "crt_csr: %s", g17);
        try {
            map.put("sn_salt", fp.s0.a(str));
            map.put("crt_csr", fp.s0.a(g17));
            map.put("crt_device_id", a18);
            int i19 = o45.wf.f343023a;
            map.put("device_os", wo.q.f447780a);
            map.put("device_name", o45.wf.f343027e);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return fe1.o.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return fe1.o.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o, com.tencent.mm.modelbase.m1
    public int getType() {
        return fe1.o.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd2(com.tencent.mm.wallet_core.model.o oVar, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("kinda.NetSceneKindaGenDigitalCert", "errCode %d errMsg %s", java.lang.Integer.valueOf(oVar.f213953b), oVar.f213954c);
        try {
            java.lang.String optString = jSONObject.optString("crt_crt");
            java.lang.String optString2 = jSONObject.optString("crt_no");
            com.tencent.mm.wallet_core.model.i iVar = com.tencent.mm.wallet_core.model.i.values()[jSONObject.optInt("cert_encrypt_type")];
            if (oVar.f213953b != 0) {
                com.tencent.mm.wallet_core.model.j b17 = com.tencent.mm.wallet_core.model.j.b();
                synchronized (b17) {
                    b17.f213919a = false;
                }
                com.tencent.mars.xlog.Log.e("kinda.NetSceneKindaGenDigitalCert", " importCert crt_crt was not executed because of cgi resp error");
            } else if (com.tencent.mm.wallet_core.model.j.b().d(optString2, optString, iVar)) {
                com.tencent.mars.xlog.Log.i("kinda.NetSceneKindaGenDigitalCert", "importCert crt_crt success");
                com.tencent.mm.wallet_core.model.p1.e(optString2, iVar);
            } else {
                com.tencent.mars.xlog.Log.e("kinda.NetSceneKindaGenDigitalCert", "importCert crt_crt fail");
            }
            com.tencent.mars.xlog.Log.i("kinda.NetSceneKindaGenDigitalCert", "_crt_crt %s _crt_no %s", com.tencent.mm.sdk.platformtools.w2.a(optString), optString2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("kinda.NetSceneKindaGenDigitalCert", e17, "", new java.lang.Object[0]);
        }
    }
}
