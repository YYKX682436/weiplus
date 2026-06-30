package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class v5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c6 {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 f227198h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f227199i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f227200m;

    /* renamed from: n, reason: collision with root package name */
    public int f227201n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 f227202o;

    public v5() {
        this.f227198h = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/qrydetailwxhb";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if ((r1 == 1) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            r4 = this;
            gm0.j1.i()
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.m(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r3 = e42.d0.clicfg_hongbao_emoji_all_switch
            h62.d r1 = (h62.d) r1
            int r1 = r1.Ni(r3, r2)
            r3 = 1
            if (r0 != r3) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 != 0) goto L39
            if (r1 != r3) goto L37
            r2 = r3
        L37:
            if (r2 == 0) goto L4e
        L39:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f227202o
            if (r0 != 0) goto L44
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = new com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch
            r0.<init>()
            r4.f227202o = r0
        L44:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f227202o
            r0.f226686d = r3
            r0.f226687e = r3
            r0.f226688f = r3
            r0.f226689g = r3
        L4e:
            com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch r0 = r4.f227202o
            java.lang.String r0 = r0.m66071x9616526c()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "MicroMsg.NetSceneLuckyMoneyDetail"
            java.lang.String r2 = "localSwitch() luckyMoneyEmojiSwitch:%s "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5.K():void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6.f34900x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    /* renamed from: onGYNetEnd */
    public void mo66076x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        try {
            this.f227198h = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.d(jSONObject);
            this.f227199i = jSONObject.optString("processContent");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522.a(jSONObject);
            this.f227202o = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "luckyMoneyEmojiSwitch:%s", a17.m66071x9616526c());
            this.f227200m = jSONObject.optString("expression_md5");
            int optInt = jSONObject.optInt("expression_type");
            this.f227201n = optInt;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "expressionmd5:%s expressiontype:%s", this.f227200m, java.lang.Integer.valueOf(optInt));
            K();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneLuckyMoneyDetail", "parse luckyMoneyDetail fail: " + e17.getLocalizedMessage());
        }
    }

    public v5(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this(str, i17, i18, str2, str3, "", "");
    }

    public v5(java.lang.String str, int i17, int i18, java.lang.String str2, long j17, java.lang.String str3, java.lang.String str4) {
        this.f227198h = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("befortTimestamp", j17 + "");
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        m66103xb4c13117(hashMap);
    }

    public v5(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f227198h = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sendId", str);
        hashMap.put("limit", i17 + "");
        hashMap.put("offset", i18 + "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            hashMap.put("receiveId", str5);
        }
        hashMap.put("ver", str3);
        hashMap.put("processContent", str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLuckyMoneyDetail", "sendId: %s, limit: %s，offet: %s, nativeUrl: %s，processContent: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2, str4);
        m66103xb4c13117(hashMap);
    }
}
