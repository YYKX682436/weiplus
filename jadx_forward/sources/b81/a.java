package b81;

@j95.b
/* loaded from: classes8.dex */
public class a extends i95.w implements y71.e {
    public boolean Ai() {
        am.g20 g20Var = (am.g20) z71.f.Bi().f552054f.get(2);
        return g20Var == null || g20Var.f88265b || g20Var.f88266c > 0;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiService", "AiService onAccountInitialized [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiService", "AiService onAccountRelease [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    public java.lang.String wi() {
        java.lang.String str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        z71.b a17 = z71.b.a();
        a17.getClass();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            long j17 = 0;
            jSONObject.put("8", gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENTER_FINDER_TL_LONG_SYNC, 0L));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            jSONObject.put("9", gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L));
            int i17 = 1;
            jSONObject.put(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, a17.c() ? 1 : 0);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            jSONObject.put("20", gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, 0L));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            jSONObject.put("21", gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, 0L));
            jSONObject.put("22", a17.d() ? 1 : 0);
            int[] wi6 = z71.f.Bi().wi();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            while (true) {
                sb6.append(wi6[i18]);
                if (i18 == 13) {
                    break;
                }
                sb6.append("#");
                i18++;
            }
            jSONObject.put("27", sb6.toString());
            jSONObject.put("28", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40064x8b9dd687(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            jSONObject.put("29", z71.m.wi().f552067e ? 1 : 0);
            c81.b wi7 = c81.b.wi();
            wi7.m134976x2690a4ac();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6354xa0c7aa56 b17 = wi7.f121189d.b("calendar_statistics_discover");
            jSONObject.put("37", b17.f137029e);
            jSONObject.put("38", b17.f137031g);
            if (z71.a.c() < 3) {
                i17 = 0;
            }
            jSONObject.put("58", i17);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19766x8c90e3ec c19766x8c90e3ec = new com.p314xaae8f345.mm.p2493x1bc889d6.C19766x8c90e3ec();
            z71.a.a(c19766x8c90e3ec);
            jSONObject.put("59", (int) (c19766x8c90e3ec.f38863x6ac9171 * 100.0f));
            z71.b0 b0Var = ((z71.i) i95.n0.c(z71.i.class)).f552060e;
            jSONObject.put("62", b0Var != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(b0Var.f552044a, -1) : -1);
            c81.b wi8 = c81.b.wi();
            wi8.m134976x2690a4ac();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = wi8.f121189d.a();
            jSONObject.put("65", a18 == null ? 0L : a18.getLong("calendar_first_enter_app_time", 0L));
            c81.b wi9 = c81.b.wi();
            wi9.m134976x2690a4ac();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = wi9.f121189d.a();
            jSONObject.put("70", a19 == null ? 0L : a19.getLong("last_enter_finder_time", 0L));
            c81.b wi10 = c81.b.wi();
            wi10.m134976x2690a4ac();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = wi10.f121189d.a();
            if (a27 != null) {
                j17 = a27.getLong("last_exit_finder_time", 0L);
            }
            jSONObject.put("71", j17);
            jSONObject.put("9999", android.os.SystemClock.elapsedRealtime() - elapsedRealtime2);
            str = jSONObject.toString();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiService", "checkToReturnAiFinderInfo cost[%d] json[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(str.length()));
        return str;
    }
}
