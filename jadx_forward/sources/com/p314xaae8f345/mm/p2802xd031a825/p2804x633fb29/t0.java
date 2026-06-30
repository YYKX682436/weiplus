package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class t0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f295521d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i f295522e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f295523f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 f295524g;

    public t0(java.lang.String str, int i17, java.lang.String str2, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar) {
        this.f295521d = 0;
        this.f295522e = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeRSA;
        this.f295523f = true;
        this.f295524g = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f295521d = 1;
        this.f295522e = iVar;
        m82999xca7c995a(hashMap);
        hashMap.put("type", fp.s0.a("1"));
        hashMap.put("id_no", fp.s0.a(str));
        hashMap.put("id_type", fp.s0.a(i17 + ""));
        hashMap.put("cert_encrypt_type", fp.s0.a(iVar.ordinal() + ""));
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    /* renamed from: baseRequset */
    public final void m82999xca7c995a(java.util.Map map) {
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
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = this.f295522e;
        int ordinal = iVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            g17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().g("WeChatPay", sb7, iVar, 0);
        } else {
            java.lang.String a27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(a17 + a18 + new java.lang.String(bArr));
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TenPaySdkAbTest", "isCertOpen2048 %s", java.lang.Boolean.TRUE);
            g17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().g("WeChatPay", a27, iVar, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGendigitalcert", "salt ".concat(new java.lang.String(bArr)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGendigitalcert", "crt_csr: %s", g17);
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

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/gendigitalcert";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: isBlock */
    public boolean mo8970x7a807183() {
        return this.f295523f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGendigitalcert", "errCode %d errMsg %s", java.lang.Integer.valueOf(i17), str);
        try {
            java.lang.String optString = jSONObject.optString("crt_crt");
            java.lang.String optString2 = jSONObject.optString("crt_no");
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.m82996xcee59d22()[jSONObject.optInt("cert_encrypt_type")];
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(414L, 0L, 1L, true);
            if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b().d(optString2, optString, iVar)) {
                g0Var.mo68477x336bdfd8(414L, 1L, 1L, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt success");
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.e(optString2, iVar);
            } else {
                g0Var.mo68477x336bdfd8(414L, 2L, 1L, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGendigitalcert", "importCert crt_crt fail");
            }
            int i18 = this.f295521d;
            if (i18 == 1) {
                g0Var.d(13731, 3);
            } else if (i18 == 2) {
                g0Var.d(13731, 7);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGendigitalcert", "_crt_crt %s _crt_no %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString), optString2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGendigitalcert", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.j.b();
        synchronized (b17) {
            b17.f295452a = false;
        }
        if (oVar.f295486b != 0) {
            int i17 = this.f295521d;
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 4);
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 8);
            }
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 s0Var = this.f295524g;
        if (s0Var != null) {
            if (!this.f295523f) {
                s0Var.a(this, true);
            } else if (oVar.f295486b == 0) {
                s0Var.a(this, true);
            }
        }
    }

    public t0(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 s0Var, boolean z17, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i iVar) {
        this.f295521d = 0;
        this.f295522e = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeRSA;
        this.f295523f = true;
        this.f295524g = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f295523f = z17;
        this.f295521d = 2;
        this.f295522e = iVar;
        m82999xca7c995a(hashMap);
        hashMap.put("type", fp.s0.a("2"));
        hashMap.put("crt_sms", fp.s0.a(str));
        hashMap.put("reqkey", fp.s0.a(str2));
        hashMap.put("cert_encrypt_type", fp.s0.a(iVar.ordinal() + ""));
        this.f295524g = s0Var;
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    public t0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 s0Var, boolean z17) {
        this.f295521d = 0;
        this.f295522e = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i.DigitalCertEncryptTypeRSA;
        this.f295523f = true;
        this.f295524g = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f295521d = 4;
        this.f295524g = s0Var;
        this.f295523f = z17;
        m82999xca7c995a(hashMap);
        hashMap.put("type", fp.s0.a("4"));
        hashMap.put("id_type", fp.s0.a(str));
        hashMap.put("cre_tail", fp.s0.a(str2));
        hashMap.put("reqkey", fp.s0.a(str3));
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }
}
