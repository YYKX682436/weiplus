package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class i6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6 {
    public i6(int i17, long j17, long j18, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i19, java.lang.String str7, java.lang.String str8, int i27, int i28, java.lang.String str9, java.lang.String str10, int i29) {
        this.f226859n = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("totalNum", i17 + "");
        hashMap.put("totalAmount", j17 + "");
        hashMap.put("perValue", j18 + "");
        hashMap.put("hbType", i18 + "");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put("wishing", java.net.URLEncoder.encode(str == null ? "" : str));
        hashMap.put("sendUserName", str5);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
            hashMap.put("unique_id", str8);
        }
        hashMap.put("user_confirm_jump", java.lang.String.valueOf(i27));
        hashMap.put("unpay_type", java.lang.String.valueOf(i28));
        hashMap.put("cancel_sendid", str9);
        hashMap.put("expression_md5", str10);
        hashMap.put("expression_type", "" + i29);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap.put(dm.i4.f66875xa013b0d5, str3);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str3)) {
                hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str3) + "");
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("headImg", java.net.URLEncoder.encode(str2));
            hashMap.put("nickName", java.net.URLEncoder.encode(str6 == null ? "" : str6));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                hashMap.put("receiveNickName", java.net.URLEncoder.encode(str4));
            }
        }
        hashMap.put("inWay", i19 + "");
        if (i19 == 0 || i19 == 1 || i19 == 7) {
            hashMap.put("needSendToMySelf", "0");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            hashMap.put("showSourceMac", java.net.URLEncoder.encode(str7));
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "20");
        hashMap.put("union_source", "0");
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str8;
        objArr[1] = java.lang.Integer.valueOf(i27);
        objArr[2] = java.lang.Integer.valueOf(i28);
        objArr[3] = str9 != null ? str9 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePrepareLuckyMoneyUnion", "NetScenePrepareLuckyMoneyUnion request :uniqueId:%s, userConfiremJump:%s, unpayType:%s, cancelSendId:%s", objArr);
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/unionhb/requestunionhb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4915;
    }
}
