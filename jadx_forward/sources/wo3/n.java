package wo3;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public n(int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("residue_num", "" + i17);
        hashMap.put("entry_scene", i18 + "");
        hashMap.put("is_snapshot", i19 + "");
        hashMap.put("user_view_digit", i27 + "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        gm0.j1.i();
        sb6.append(gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, ""));
        hashMap.put("code_ver", sb6.toString());
        hashMap.put("card_id", yo3.m.f545697k);
        hashMap.put("user_card_id", yo3.m.f545698l);
        hashMap.put("card_code", yo3.m.f545699m);
        hashMap.put("ext_business_attach", str);
        hashMap.put("is_new_authcodes", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c a17 = yo3.f.f545678a.a(false);
        if (a17 != null) {
            hashMap.put("prefer_bind_serial", a17.f69225xed6d60f6);
            hashMap.put("prefer_bank_type", a17.f69223x58802fcb);
        }
        m83032xb4c13117(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "hy: residue_num == %d, entryscene = %d,is_snapshot = %d, user_view_digit: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1645;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 102;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineshowcode";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayWxOfflineShowCode", "onGynetEnd %s %s", java.lang.Integer.valueOf(i17), str);
    }
}
