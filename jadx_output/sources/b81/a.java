package b81;

@j95.b
/* loaded from: classes8.dex */
public class a extends i95.w implements y71.e {
    public boolean Ai() {
        am.g20 g20Var = (am.g20) z71.f.Bi().f470521f.get(2);
        return g20Var == null || g20Var.f6732b || g20Var.f6733c > 0;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AiService", "AiService onAccountInitialized [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AiService", "AiService onAccountRelease [%d]", java.lang.Integer.valueOf(hashCode()));
    }

    public java.lang.String wi() {
        java.lang.String str;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        z71.b a17 = z71.b.a();
        a17.getClass();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            long j17 = 0;
            jSONObject.put("8", gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_ENTER_FINDER_TL_LONG_SYNC, 0L));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            jSONObject.put("9", gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L));
            int i17 = 1;
            jSONObject.put(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, a17.c() ? 1 : 0);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            jSONObject.put("20", gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, 0L));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            jSONObject.put("21", gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, 0L));
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
            jSONObject.put("28", com.tencent.mars.comm.NetStatusUtil.getIOSOldNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
            jSONObject.put("29", z71.m.wi().f470534e ? 1 : 0);
            c81.b wi7 = c81.b.wi();
            wi7.requireAccountInitialized();
            com.tencent.mm.autogen.mmdata.rpt.CalendarStatisticsStruct b17 = wi7.f39656d.b("calendar_statistics_discover");
            jSONObject.put("37", b17.f55496e);
            jSONObject.put("38", b17.f55498g);
            if (z71.a.c() < 3) {
                i17 = 0;
            }
            jSONObject.put("58", i17);
            com.tencent.mm.pointers.PFloat pFloat = new com.tencent.mm.pointers.PFloat();
            z71.a.a(pFloat);
            jSONObject.put("59", (int) (pFloat.value * 100.0f));
            z71.b0 b0Var = ((z71.i) i95.n0.c(z71.i.class)).f470527e;
            jSONObject.put("62", b0Var != null ? com.tencent.mm.sdk.platformtools.t8.P(b0Var.f470511a, -1) : -1);
            c81.b wi8 = c81.b.wi();
            wi8.requireAccountInitialized();
            com.tencent.mm.sdk.platformtools.o4 a18 = wi8.f39656d.a();
            jSONObject.put("65", a18 == null ? 0L : a18.getLong("calendar_first_enter_app_time", 0L));
            c81.b wi9 = c81.b.wi();
            wi9.requireAccountInitialized();
            com.tencent.mm.sdk.platformtools.o4 a19 = wi9.f39656d.a();
            jSONObject.put("70", a19 == null ? 0L : a19.getLong("last_enter_finder_time", 0L));
            c81.b wi10 = c81.b.wi();
            wi10.requireAccountInitialized();
            com.tencent.mm.sdk.platformtools.o4 a27 = wi10.f39656d.a();
            if (a27 != null) {
                j17 = a27.getLong("last_exit_finder_time", 0L);
            }
            jSONObject.put("71", j17);
            jSONObject.put("9999", android.os.SystemClock.elapsedRealtime() - elapsedRealtime2);
            str = jSONObject.toString();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiService", "checkToReturnAiFinderInfo cost[%d] json[%d]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(str.length()));
        return str;
    }
}
