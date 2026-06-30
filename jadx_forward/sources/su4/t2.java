package su4;

/* loaded from: classes.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static r45.hq4 f494635a;

    public static void a(java.lang.String str) {
        r45.gq4 gq4Var = null;
        if (!u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null)) && c01.e2.G(str)) {
            if (f494635a == null) {
                c();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 0;
            while (i17 < f494635a.f457919d.size()) {
                r45.gq4 gq4Var2 = (r45.gq4) f494635a.f457919d.get(i17);
                long j17 = (currentTimeMillis - gq4Var2.f457018f) / 86400000;
                int i18 = i17;
                gq4Var2.f457017e *= java.lang.Math.pow(0.98d, j17);
                gq4Var2.f457018f += j17 * 86400000;
                if (gq4Var2.f457016d.equals(str)) {
                    gq4Var = gq4Var2;
                }
                i17 = i18 + 1;
            }
            if (gq4Var == null) {
                r45.gq4 gq4Var3 = new r45.gq4();
                gq4Var3.f457017e = 1.0d;
                gq4Var3.f457018f = currentTimeMillis;
                gq4Var3.f457016d = str;
                f494635a.f457919d.add(gq4Var3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "add new use %s", str);
            } else {
                double d17 = gq4Var.f457017e + 1.0d;
                gq4Var.f457017e = d17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "update use %s %.2f", str, java.lang.Double.valueOf(d17));
            }
            java.util.Collections.sort(f494635a.f457919d, new su4.s2());
            for (int size = f494635a.f457919d.size() - 1; size < f494635a.f457919d.size() && f494635a.f457919d.size() > 8; size++) {
                if (((r45.gq4) f494635a.f457919d.get(size)).f457017e < 0.5d) {
                    f494635a.f457919d.remove(size);
                }
            }
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("fts_recent_biz_sp", 0);
            try {
                java.lang.String b17 = b();
                java.lang.String encodeToString = android.util.Base64.encodeToString(f494635a.mo14344x5f01b1f6(), 0);
                sharedPreferences.edit().putString(b17, encodeToString).commit();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "useBiz pbListString %s", encodeToString);
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static java.lang.String b() {
        return "key_pb_most_search_biz_list" + c01.z1.r();
    }

    public static r45.hq4 c() {
        if (f494635a == null) {
            java.lang.String b17 = b();
            f494635a = new r45.hq4();
            try {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("fts_recent_biz_sp", 0).getString(b17, "");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    f494635a.mo11468x92b714fd(android.util.Base64.decode(string.getBytes(), 0));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            f494635a.f457919d.clear();
        }
        return f494635a;
    }
}
