package oz2;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public d(int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        re4.v a17 = re4.u.a();
        hashMap.put("cpu_id", a17.f476086a);
        hashMap.put("uid", a17.f476087b);
        if (i17 == 0) {
            mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
            i17 = aVar.b() ? 2 : aVar.a() ? 1 : -1;
        }
        hashMap.put("soter_type", "" + i17);
        m83032xb4c13117(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayCloseTouchPay", "soter_type: %s", java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1597;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 116;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/closetouchpay";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 == 0) {
            ((nz2.o) gm0.j1.s(nz2.o.class)).D1(java.lang.Integer.valueOf(jSONObject != null ? jSONObject.optInt("clear_rsa_key_level", 0) : 0));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayCloseTouchPay", "do close fingerprint cgi failed!");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
        if (aVar.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13686, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        } else if (aVar.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16994, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        if (i18 == 0 && i19 == 0) {
            aVar.e(false);
            aVar.d(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi success!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayCloseTouchPay", "hy: do close fingerprint cgi failed!");
    }
}
