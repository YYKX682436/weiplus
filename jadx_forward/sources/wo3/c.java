package wo3;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public c(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, "");
        hashMap.put("ack_key", m17 != null ? (java.lang.String) m17 : null);
        java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_REQ_KEY_STRING, "");
        hashMap.put("req_key", m18 != null ? (java.lang.String) m18 : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.Object m19 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_PAYMSG_TYPE_INT, null);
        int i17 = 0;
        int intValue = m19 != null ? ((java.lang.Integer) m19).intValue() : 0;
        sb6.append(intValue < 0 ? 0 : intValue);
        hashMap.put("paymsg_type", sb6.toString());
        java.lang.Object m27 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_TRANS_ID_STRING, "");
        hashMap.put("transactionid", m27 != null ? (java.lang.String) m27 : null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            i17 = -1;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            i17 = 1;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            i17 = 2;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            i17 = 3;
        } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            i17 = 4;
        }
        sb7.append(i17);
        hashMap.put("network", sb7.toString());
        hashMap.put("processed", to3.c0.f502484i ? "1" : "0");
        hashMap.put("is_pos_enabled", "1");
        hashMap.put("channel", z17 ? "pull" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63);
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "" + (java.lang.System.currentTimeMillis() / 1000));
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 1230;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/offlineackmsg";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 69L, 1L, true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(135L, 68L, 1L, true);
        int optInt = jSONObject.optInt("poll_time") * 1000;
        if (optInt > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_INTERVAL_INT, java.lang.Integer.valueOf(optInt));
        }
    }
}
