package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f238443d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n f238444e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n f238445f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238446g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238447h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.m0 f238448i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f238449m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f238450n;

    public n0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, int i19, java.lang.String str6, java.util.Map map, long j17, java.lang.String str7, java.lang.String str8) {
        this(str, str2, i17, str3, str4, i18, "", str5, i19, str6, map, j17, str7, str8);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1691;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/transferoperation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        r9.u1(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104 A[Catch: Exception -> 0x00fc, TRY_ENTER, TryCatch #0 {Exception -> 0x00fc, blocks: (B:65:0x00f3, B:47:0x0104, B:48:0x0123, B:50:0x0149, B:55:0x0153, B:56:0x015a, B:62:0x0157, B:63:0x0114), top: B:64:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:65:0x00f3, B:47:0x0104, B:48:0x0123, B:50:0x0149, B:55:0x0153, B:56:0x015a, B:62:0x0157, B:63:0x0114), top: B:64:0x00f3 }] */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1065x5f9cdc6f(int r8, java.lang.String r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.n0.mo1065x5f9cdc6f(int, java.lang.String, org.json.JSONObject):void");
    }

    public n0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7, java.util.Map map, long j17, java.lang.String str8, java.lang.String str9) {
        this.f238443d = null;
        this.f238446g = "";
        this.f238447h = "";
        this.f238449m = "";
        this.f238450n = "";
        this.f238443d = str3;
        this.f238449m = str8;
        this.f238450n = str6;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str2);
        hashMap.put(ya.b.f77506xba41a63c, str);
        hashMap.put("op", str3);
        hashMap.put(dm.i4.f66875xa013b0d5, str4);
        hashMap.put("invalid_time", i18 + "");
        hashMap.put("total_fee", java.lang.String.valueOf(i17));
        hashMap.put("left_button_continue", str5);
        hashMap.put("group_username", str6);
        hashMap.put("sub_recv_channel_id", java.lang.String.valueOf(j17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
            hashMap.put("transfer_attach", java.net.URLEncoder.encode(str9));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            if (c01.e2.E(str6)) {
                hashMap.put("group_type", "2");
            } else {
                hashMap.put("group_type", "1");
            }
        }
        hashMap.put("recv_account_type", i19 + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            hashMap.put("bind_serial", str7);
        } else if (i19 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "9", "5", "REMITTANCE_1002", str2 != null ? str2 : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUtil", "xjg remittance bind_serial error trans_id: " + str2);
        } else if (str7 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "9", "5", "REMITTANCE_1001", str2 != null ? str2 : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUtil", "normal remittance bind_serial error account_type: " + i19 + " trans_id: " + str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUtil", "normal remittance bind_serial is empty account_type: " + i19 + ", trans_id: " + str2);
        }
        if (map != null && map.size() > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str10 = (java.lang.String) entry.getKey();
                java.lang.String str11 = (java.lang.String) entry.getValue();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceConfirm", "account click info , key is %s, value is %s", str10, str11);
                    try {
                        jSONObject.put(str10, str11);
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
            hashMap.put("sub_title_clicked", jSONObject.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceConfirm", "trans_id：%s, transaction_id:%s， total_fee：%s ，recv_channel_type：%s, transferAttach：%s", str2, str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), str9);
        m83032xb4c13117(hashMap);
    }
}
