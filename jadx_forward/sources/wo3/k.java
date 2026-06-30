package wo3;

/* loaded from: classes9.dex */
public class k extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f529701t = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f529702d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f529703e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529704f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f529705g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f529706h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f529707i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f529708m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f529709n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f529710o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f529711p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f529712q = "";

    /* renamed from: r, reason: collision with root package name */
    public final int f529713r;

    /* renamed from: s, reason: collision with root package name */
    public final int f529714s;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c, java.lang.String str, int i17) {
        this.f529714s = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059;
        java.lang.String k17 = wo.w0.k();
        java.lang.String str2 = (java.lang.String) wo.p.a().f529305a.get(256);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.equals(k17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 48);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "old id: %s, new id: %s", str2, k17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, k17);
        hashMap.put("weixin_ver", "0x" + java.lang.Integer.toHexString(o45.wf.f424562g));
        hashMap.put("bind_serialno", c19091x9511676c.f69225xed6d60f6);
        hashMap.put("bank_type", c19091x9511676c.f69223x58802fcb);
        hashMap.put("card_tail", c19091x9511676c.f69222x587fd4e1);
        hashMap.put("open_limitfee", "" + i17);
        this.f529714s = i17;
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D()) + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(wo.w0.k().getBytes()));
        hashMap.put("user_id", a17);
        java.lang.String b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().b(a17, com.p314xaae8f345.mm.p2802xd031a825.b.a().f() ? 1 : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr %s %s", b17, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p2802xd031a825.b.a().f()));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTenpayWxOfflineCreate", "crt_csr is null!!! errorcode: %s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d()));
        }
        hashMap.put("crt_csr", b17);
        hashMap.put("type", "3");
        hashMap.put("version_number", "3");
        yo3.m.l();
        this.f529713r = 1;
        hashMap.put("is_new_authcodes", "1");
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 565;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 46;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/offlinecreate";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f529703e = jSONObject.optString("crt_crt");
            this.f529702d = jSONObject.optString("cn");
            this.f529704f = jSONObject.optString("token");
            this.f529705g = jSONObject.optString("valid_end");
            this.f529706h = jSONObject.optString("encrypt_str");
            this.f529707i = jSONObject.optString("deviceid");
            if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().e(this.f529702d, this.f529703e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt success");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "importCert crt_crt fail");
            }
            this.f529708m = jSONObject.optString("token_v2");
            this.f529709n = jSONObject.optInt("algorithm_type");
            this.f529710o = jSONObject.optString("card_list");
            this.f529711p = jSONObject.optString("key_list");
            this.f529712q = jSONObject.optString("token_pin");
            java.lang.String optString = jSONObject.optString("notice_url");
            java.lang.String optString2 = jSONObject.optString("auth_codes");
            int optInt = jSONObject.optInt("update_interval");
            java.lang.String optString3 = jSONObject.optString("code_ver");
            int optInt2 = jSONObject.optInt("cipher_type", 0);
            to3.c0.Ai().Vi(196617, this.f529702d);
            to3.c0.Ai().Vi(196626, this.f529705g);
            to3.c0.Ai().Vi(196627, this.f529706h);
            to3.c0.Ai().Vi(196628, this.f529707i);
            to3.c0.Ai().Vi(196630, "1");
            to3.c0.Ai().Vi(196632, "" + (java.lang.System.currentTimeMillis() / 1000));
            yo3.m.t(this.f529704f, this.f529708m, this.f529710o, this.f529711p, this.f529713r == 1 ? 2 : 1);
            int i18 = this.f529709n;
            to3.c0.Ai().Vi(196644, "" + i18);
            to3.c0.Ai().Vi(196647, this.f529712q);
            to3.c0.Ai().Vi(196616, optString);
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().a(to3.c0.Ai().Ni(196617));
            boolean h17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().h(this.f529702d, optString2, optInt2 == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "offlinecreate isOk %s cn: %s", java.lang.Boolean.valueOf(h17), this.f529702d);
            if (!h17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens failed!");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayWxOfflineCreate", "WalletOfflineEntranceUI CertUtil.getInstance().getLastError():" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().d());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineCreate", "CertUtil.getInstance().setTokens success!");
            }
            to3.c0.Ai().Vi(196649, "" + optInt);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "" + wo.w0.g(true));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, optString3);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, 1);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g c17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c();
        synchronized (c17) {
            c17.f295431a = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        if (i18 != 0 || i19 != 0) {
            to3.c0.Ai().Vi(196630, "0");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(135);
        c4582x424c344.m40332x57b2b64f(1L);
        c4582x424c344.m40331x936762bd(11);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(135);
        c4582x424c3442.m40332x57b2b64f(1L);
        if (i19 == 0 && i19 == 0) {
            c4582x424c3442.m40331x936762bd(9);
        } else {
            c4582x424c3442.m40331x936762bd(10);
        }
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
    }
}
