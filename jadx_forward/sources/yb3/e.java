package yb3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 {
    public e(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i27) {
        this.f226951h = i17;
        this.f226952i = i18;
        this.f226953m = str;
        this.f226954n = str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgType", i17 + "");
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, i18 + "");
        hashMap.put("sendId", str);
        hashMap.put("inWay", i19 + "");
        hashMap.put("ver", str3);
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, 0L)).longValue();
        if (longValue > 0) {
            if (java.lang.System.currentTimeMillis() < longValue) {
                hashMap.put("agreeDuty", "0");
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_DISCLAIMER_NEED_AGERR_INT_SYNC, 1));
                sb6.append("");
                hashMap.put("agreeDuty", sb6.toString());
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("nativeUrl", java.net.URLEncoder.encode(str2));
        }
        hashMap.put("group_name", str4);
        hashMap.put("liveid", str5);
        hashMap.put("liveattach", str6);
        if (i27 > 0) {
            hashMap.put("channellive_sender_flag", java.lang.String.valueOf(i27));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneLiveReceiveLuckyMoney", "NetSceneReceiveLuckyMoney request");
        m66103xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/ftfhb/channellivereceivewxhb";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4717;
    }
}
