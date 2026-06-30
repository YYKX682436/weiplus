package cs4;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303649e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f303651g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f303652h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f303653i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f303654m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f303655n;

    /* renamed from: p, reason: collision with root package name */
    public final int f303657p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f303658q;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f303648d = null;

    /* renamed from: f, reason: collision with root package name */
    public int f303650f = 0;

    /* renamed from: o, reason: collision with root package name */
    public zr4.d f303656o = null;

    public f(com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, int i17) {
        this.f303649e = null;
        this.f303657p = 0;
        if (c19760x34448d56 == null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "error payinfo is null %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            this.f303649e = "";
        } else {
            this.f303649e = c19760x34448d56.f273647m;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        hashMap.put("support_cardtag3", "1");
        hashMap.put("req_key", this.f303649e);
        hashMap.put("bind_query_scene", "" + i17);
        hashMap.put("is_merge", "1");
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null || !aVar.mo148657xb9a85d2c()) {
            hashMap.put("is_root", "0");
        } else {
            hashMap.put("is_root", "1");
        }
        if (aVar == null || !(aVar.yh() || aVar.a1())) {
            hashMap.put("is_device_open_touch", "0");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is false");
        } else {
            hashMap.put("is_device_open_touch", "1");
            java.util.Map C = aVar.C();
            if (C != null) {
                hashMap.putAll(C);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "is_device_open_touch is true");
        }
        if (c19760x34448d56 != null) {
            this.f303657p = c19760x34448d56.f273642e;
        }
        m83030x824a7eb4(c19760x34448d56, hashMap, hashMap2);
        m83032xb4c13117(hashMap);
        m83033x7c1e2016(hashMap2);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.h.f34336x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 112;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/qrcodeusebindquery";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            this.f303658q = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.a(jSONObject);
            this.f303648d = a17;
            if (a17 != null) {
                a17.f261208e = this.f303649e;
            }
            long optLong = jSONObject.optJSONObject("bindqueryresp").optLong("time_stamp");
            if (optLong > 0) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f1.b("" + optLong);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "no time_stamp in qrcodeusebindquery.");
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("query_order_info");
            if (optJSONObject != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "get query_order_info");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95542r = optJSONObject.optInt("query_order_time", 5) * 1000;
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95543s = optJSONObject.optInt("query_order_count", 0);
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95544t = optJSONObject.optString("default_query_order_wording", "");
            }
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f95545u = jSONObject.optString("pay_remind_wording");
            at4.r1.k(jSONObject.optJSONObject("bindqueryresp"), this.f303657p, false, false);
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is not null");
                aVar.af();
                int G = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G();
                if (G == 0) {
                    if (aVar.Ic()) {
                        ((mz2.a) aVar).e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                        ((mz2.a) aVar).d(false);
                    } else if (aVar.Rb()) {
                        ((mz2.a) aVar).d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                        ((mz2.a) aVar).e(false);
                    }
                } else if (G == 1 && aVar.Ic()) {
                    ((mz2.a) aVar).e(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    ((mz2.a) aVar).d(false);
                } else if (G == 2 && aVar.Rb()) {
                    ((mz2.a) aVar).d(((pg0.a3) i95.n0.c(pg0.a3.class)).fj().v());
                    ((mz2.a) aVar).e(false);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "IFingerPrintMgr is null");
            }
            if (jSONObject.has("real_name_info")) {
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("real_name_info");
                this.f303651g = optJSONObject2.optString("guide_flag");
                this.f303652h = optJSONObject2.optString("guide_wording");
                this.f303653i = optJSONObject2.optString("left_button_wording");
                this.f303654m = optJSONObject2.optString("right_button_wording");
                this.f303655n = optJSONObject2.optString("upload_credit_url");
                this.f303650f = optJSONObject2.optInt("guide_type", 0);
            }
            if (jSONObject.has("user_notify_info")) {
                this.f303656o = zr4.d.a(jSONObject.optJSONObject("user_notify_info"));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayQueryOrderInfoByQRCode", "hy: " + e17.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd2 */
    public void mo8968x93feb1a3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o oVar, org.json.JSONObject jSONObject) {
        int i17;
        int i18 = oVar.f295485a;
        java.lang.String str = this.f303649e;
        int i19 = this.f303657p;
        if (i18 == 0 && (i17 = oVar.f295486b) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15000, java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(i17));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15000, java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(oVar.f295486b));
        }
    }
}
