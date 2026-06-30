package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.NetSceneTenpay */
/* loaded from: classes9.dex */
public class C3253xbc01215a extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r {
    private static final java.lang.String TAG = "WXP";

    /* renamed from: mCallback */
    com.p314xaae8f345.p347x615374d.gen.AbstractC3605xf145375f f12448x1ab9c7d2;

    /* renamed from: mCgiId */
    int f12449xbde0c813;

    /* renamed from: mUrl */
    private final java.lang.String f12450x32d9c2;

    /* renamed from: com.tencent.kinda.framework.module.impl.NetSceneTenpay$EndCallback */
    /* loaded from: classes6.dex */
    public interface EndCallback {
        /* renamed from: onEnd */
        void m25942x64f427c(int i17);
    }

    public C3253xbc01215a(int i17, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.util.HashMap<java.lang.String, java.lang.String> hashMap2, com.p314xaae8f345.p347x615374d.gen.AbstractC3605xf145375f abstractC3605xf145375f) {
        this.f12449xbde0c813 = i17;
        this.f12450x32d9c2 = str;
        this.f12448x1ab9c7d2 = abstractC3605xf145375f;
        m83033x7c1e2016(hashMap2);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return this.f12449xbde0c813;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return this.f12449xbde0c813;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f12450x32d9c2)) {
            return this.f12450x32d9c2;
        }
        int mo1062x19c9adf5 = mo1062x19c9adf5();
        return mo1062x19c9adf5 != 1544 ? mo1062x19c9adf5 != 1679 ? mo1062x19c9adf5 != 1992 ? "/cgi-bin/micromsg-bin/tenpay" : "/cgi-bin/mmpay-bin/gettransferwording" : "/cgi-bin/mmpay-bin/tenpay/getbannerinfo" : "/cgi-bin/mmpay-bin/transferplaceorder";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo1065x5f9cdc6f(i17, str, jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "errCode:%d,errMsg:%s,json:%s", java.lang.Integer.valueOf(i17), str, jSONObject);
        java.lang.String.format("errCode:%d,errMsg:%s,json:%s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (i17 == 0) {
            this.f12448x1ab9c7d2.mo28376xe05b4124(jSONObject.toString());
        } else {
            this.f12448x1ab9c7d2.mo28375xaf8aa769(i17, str);
        }
    }
}
