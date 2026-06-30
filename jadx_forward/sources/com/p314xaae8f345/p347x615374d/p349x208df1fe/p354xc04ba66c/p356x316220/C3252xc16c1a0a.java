package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert */
/* loaded from: classes9.dex */
public class C3252xc16c1a0a extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    private final java.lang.String TAG = "kinda.NetSceneKindaGenDigitalCert";

    /* renamed from: certEncryptType */
    com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i f12446x79d9a7b;

    /* renamed from: com.tencent.kinda.framework.module.impl.NetSceneKindaGenDigitalCert$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$mm$wallet_core$model$CertUtilWxNew$DigitalCertEncryptType */
        static final /* synthetic */ int[] f12447x403d044a;

        static {
            int[] iArr = new int[com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22().length];
            f12447x403d044a = iArr;
            try {
                iArr[2] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f12447x403d044a[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f12447x403d044a[0] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public C3252xc16c1a0a(com.p314xaae8f345.p347x615374d.gen.C3462xa42a71ac c3462xa42a71ac) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeRSA;
        this.f12446x79d9a7b = iVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        int m27989xebff6c45 = c3462xa42a71ac.m27989xebff6c45();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kinda.NetSceneKindaGenDigitalCert", "encrypt type: %d", java.lang.Integer.valueOf(m27989xebff6c45));
        if (m27989xebff6c45 < 0 || m27989xebff6c45 > 2) {
            this.f12446x79d9a7b = iVar;
        } else {
            this.f12446x79d9a7b = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[m27989xebff6c45];
        }
        hashMap.put("cert_encrypt_type", fp.s0.a(this.f12446x79d9a7b.ordinal() + ""));
        m25940xca7c995a(hashMap);
        int i17 = c3462xa42a71ac.f13612x6280547;
        if (i17 == 1) {
            hashMap.put("type", fp.s0.a("1"));
            hashMap.put("id_no", fp.s0.a(c3462xa42a71ac.m27991xfb80a4b2()));
            hashMap.put("id_type", fp.s0.a(c3462xa42a71ac.m27992x1ded2deb() + ""));
        } else if (i17 == 2) {
            hashMap.put("type", fp.s0.a("2"));
            hashMap.put("crt_sms", fp.s0.a(c3462xa42a71ac.m27996xb0a67dfc()));
            hashMap.put("reqkey", fp.s0.a(c3462xa42a71ac.m27993x2d6363d7()));
        } else if (i17 == 3) {
            hashMap.put("type", fp.s0.a("3"));
            hashMap.put("crt_token", fp.s0.a(c3462xa42a71ac.m27994x75346043()));
        } else if (i17 == 4) {
            hashMap.put("type", fp.s0.a("4"));
            hashMap.put("id_type", fp.s0.a(c3462xa42a71ac.m27992x1ded2deb() + ""));
            hashMap.put("cre_tail", fp.s0.a(c3462xa42a71ac.m27990x7b158b10()));
            hashMap.put("reqkey", fp.s0.a(c3462xa42a71ac.m27993x2d6363d7()));
        } else if (i17 == 5) {
            hashMap.put("type", fp.s0.a("5"));
            hashMap.put("reqkey", fp.s0.a(c3462xa42a71ac.m27993x2d6363d7()));
        } else if (i17 == 6) {
            hashMap.put("type", fp.s0.a("6"));
            hashMap.put("reqkey", fp.s0.a(c3462xa42a71ac.m27993x2d6363d7()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("kinda.NetSceneKindaGenDigitalCert", "KGenDigitalCrtReq.mType is illeagl.");
        }
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    /* renamed from: baseRequset */
    private void m25940xca7c995a(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String g17;
        gm0.j1.i();
        java.lang.String a17 = kk.v.a(gm0.j1.b().h());
        java.lang.String g18 = wo.w0.g(false);
        byte[] bArr = new byte[16];
        byte[] bytes = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.a().getBytes();
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
        java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(a17 + g18);
        java.lang.String a19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(a17 + g18 + bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SN=");
        sb6.append(a19);
        java.lang.String sb7 = sb6.toString();
        int ordinal = this.f12446x79d9a7b.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            g17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().g("WeChatPay", sb7, this.f12446x79d9a7b, 0);
        } else {
            java.lang.String a27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(a17 + a18 + new java.lang.String(bArr));
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", java.lang.Boolean.TRUE);
            g17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().g("WeChatPay", a27, this.f12446x79d9a7b, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kinda.NetSceneKindaGenDigitalCert", "salt ".concat(new java.lang.String(bArr)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kinda.NetSceneKindaGenDigitalCert", "crt_csr: %s", g17);
        try {
            map.put("sn_salt", fp.s0.a(str));
            map.put("crt_csr", fp.s0.a(g17));
            map.put("crt_device_id", a18);
            int i19 = o45.wf.f424556a;
            map.put("device_os", wo.q.f529313a);
            map.put("device_name", o45.wf.f424560e);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return fe1.o.f69744x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return fe1.o.f69744x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return fe1.o.f69744x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kinda.NetSceneKindaGenDigitalCert", "errCode %d errMsg %s", java.lang.Integer.valueOf(oVar.f295486b), oVar.f295487c);
        try {
            java.lang.String optString = jSONObject.optString("crt_crt");
            java.lang.String optString2 = jSONObject.optString("crt_no");
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[jSONObject.optInt("cert_encrypt_type")];
            if (oVar.f295486b != 0) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b();
                synchronized (b17) {
                    b17.f295452a = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("kinda.NetSceneKindaGenDigitalCert", " importCert crt_crt was not executed because of cgi resp error");
            } else if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().d(optString2, optString, iVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kinda.NetSceneKindaGenDigitalCert", "importCert crt_crt success");
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.e(optString2, iVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("kinda.NetSceneKindaGenDigitalCert", "importCert crt_crt fail");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("kinda.NetSceneKindaGenDigitalCert", "_crt_crt %s _crt_no %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString), optString2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("kinda.NetSceneKindaGenDigitalCert", e17, "", new java.lang.Object[0]);
        }
    }
}
