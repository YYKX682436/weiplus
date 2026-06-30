package ni3;

/* loaded from: classes12.dex */
public class w1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f419285e;

    public w1(ni3.g2 g2Var) {
        this.f419285e = g2Var;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "reportHeavyUser";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUserRunnable run");
        if (!gm0.j1.a() || this.f419285e.f419132x == 0) {
            return;
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue > 86400000 || longValue > currentTimeMillis) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(509L, 17L, 1L, true);
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
            gm0.j1.i();
            long longValue2 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_FLAG_LONG, 0L)).longValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93 c17192x850a6c93 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17192x850a6c93();
            c17192x850a6c93.f37894x69b5865 = 4;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6 c17185xe6ded8a6 = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17185xe6ded8a6();
            c17192x850a6c93.f37890x2737f859 = c17185xe6ded8a6;
            c17185xe6ded8a6.f37813x5cfee73 = longValue2;
            gm0.j1.i();
            long longValue3 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_SIZE_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37816x77bbe511 = longValue3;
            java.lang.String str = ("" + longValue2) + ";" + longValue3;
            gm0.j1.i();
            long longValue4 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_SD_FILE_RATIO_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37815x7d987f81 = longValue4;
            java.lang.String str2 = str + ";" + longValue4;
            gm0.j1.i();
            long longValue5 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_SIZE_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37811x55ed42a0 = longValue5;
            java.lang.String str3 = str2 + ";" + longValue5;
            gm0.j1.i();
            long longValue6 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_MESSAGE_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37814xe4750138 = longValue6;
            java.lang.String str4 = str3 + ";" + longValue6;
            gm0.j1.i();
            long longValue7 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONVERSATION_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37810x579db43c = longValue7;
            java.lang.String str5 = str4 + ";" + longValue7;
            gm0.j1.i();
            long longValue8 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CONTACT_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37809xde2d603f = longValue8;
            java.lang.String str6 = str5 + ";" + longValue8;
            gm0.j1.i();
            long longValue9 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_DB_CHATROOM_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37808x619a5e8c = longValue9;
            java.lang.String str7 = str6 + ";" + longValue9;
            gm0.j1.i();
            long longValue10 = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HEAVY_USER_REPORT_TYPE_FAV_DB_SIZE_LONG, 0L)).longValue();
            c17185xe6ded8a6.f37812x1e21ab05 = longValue10;
            java.lang.String str8 = str7 + ";" + longValue10;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("heavyDetailInfo", 0).edit().putLong("sdFileSize", c17185xe6ded8a6.f37816x77bbe511).putLong("sdFileRatio", c17185xe6ded8a6.f37815x7d987f81).putLong("dbSize", c17185xe6ded8a6.f37811x55ed42a0).putLong(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, c17185xe6ded8a6.f37814xe4750138).putLong("conversation", c17185xe6ded8a6.f37810x579db43c).putLong("contact", c17185xe6ded8a6.f37809xde2d603f).putLong("chatroom", c17185xe6ded8a6.f37808x619a5e8c).putLong("favDbSize", c17185xe6ded8a6.f37812x1e21ab05).putLong("flag", c17185xe6ded8a6.f37813x5cfee73).apply();
            try {
                com.p314xaae8f345.mm.vfs.w6.R(gm0.j1.u().h() + "heavyDetailInfo", new org.json.JSONObject().put("sdFileSize", c17185xe6ded8a6.f37816x77bbe511).put("sdFileRatio", c17185xe6ded8a6.f37815x7d987f81).put("dbSize", c17185xe6ded8a6.f37811x55ed42a0).put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, c17185xe6ded8a6.f37814xe4750138).put("conversation", c17185xe6ded8a6.f37810x579db43c).put("contact", c17185xe6ded8a6.f37809xde2d603f).put("chatroom", c17185xe6ded8a6.f37808x619a5e8c).put("favDbSize", c17185xe6ded8a6.f37812x1e21ab05).put("flag", c17185xe6ded8a6.f37813x5cfee73).toString().getBytes());
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreBaseMonitor", "Failed to write heavyDetailInfo");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.g(13778, false, false, true, 4, 1, str8);
            g0Var.I(14375, c17192x850a6c93, false, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUser report heavy result[%s]", str8);
        }
    }
}
