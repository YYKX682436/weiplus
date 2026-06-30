package ql0;

@j95.b
/* loaded from: classes13.dex */
public final class l extends i95.w implements at.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f446026d = "MicroMsg.KaraLiveHomeRedDotApiImpl";

    public final void wi(java.lang.String str, boolean z17) {
        dm.n7 n7Var;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.lang.String str2 = this.f446026d;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "trainDataReport reddotId null");
            return;
        }
        ul0.c cVar = tl0.b.f501729c;
        if (cVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "trainDataReport db null?");
            return;
        }
        android.database.Cursor B = cVar.f510092d.B("SELECT * FROM (select * from LiveHomeRedDotEvent where reddotId = '" + str + "' and action = 1)", new java.lang.String[0]);
        try {
            if (B.moveToFirst()) {
                n7Var = new dm.n7();
                n7Var.mo9015xbf5d97fd(B);
            } else {
                n7Var = null;
            }
            B.close();
            if (n7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str + " bean null");
                return;
            }
            com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p808xbba4bfc0.C10778x2218720e c10778x2218720e = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p808xbba4bfc0.C10778x2218720e(n7Var.f67681xef3863f8, n7Var.f67682x53c79e95, n7Var.f67680xa04cfe71 > 0, n7Var.f67684x29dd02d3, n7Var.f67676xe3dffc55);
            dm.u6 y07 = nl0.c.a().y0("LiveHomeRedDot", str);
            if (y07 == null) {
                y07 = new dm.u6();
                y07.f68588x2262335f = "LiveHomeRedDot";
                y07.f68574xc8a07680 = str;
                y07.f68589x8987ca93 = java.lang.Integer.parseInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g.replace("0x", ""), 16);
            }
            hl0.e eVar = new hl0.e(y07.f68588x2262335f, y07.f68574xc8a07680);
            eVar.f363592g = y07.f68572x34f486f0;
            eVar.f363589d = y07.f68573x68eb8605;
            eVar.f363590e = y07.f68580xdf382598;
            eVar.f363593h = y07.f68584xdc36ef76;
            eVar.f363591f = y07.f68583x9348ba2a;
            eVar.f363605t = y07.f68569x225aa2b6;
            eVar.f363599n = y07.f68570x3211ea76;
            eVar.f363604s = y07.f68571x6d651db5;
            eVar.f363600o = y07.f68567x7c3ca06a;
            eVar.f363602q = y07.f68577x83c1d32;
            eVar.f363608w = y07.f68581xdf386205;
            eVar.f363606u = y07.f68576x5c5523e2;
            eVar.f363601p = y07.f68568xfdb8f5d2;
            eVar.f363603r = y07.f68578xca46169a;
            eVar.f363595j = y07.f68579x4a55a39e;
            eVar.f363594i = y07.f68582xfe5e3cf4;
            eVar.f363598m = y07.f68586xa8de1927;
            eVar.f363597l = y07.f68585x62b7358e;
            eVar.f363607v = y07.f68575x713bde13;
            eVar.f363596k = y07.f68587x9d850de6;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c10778x2218720e.mo46315x59bc66e();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "build time:" + currentTimeMillis2);
            eVar.f363598m = currentTimeMillis2;
            double d17 = (double) 1000.0f;
            java.lang.String format = java.lang.String.format("%.4f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(eVar.f363589d / d17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            java.lang.String format2 = java.lang.String.format("%.4f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(eVar.f363593h / d17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            em0.f.a(c10778x2218720e, "LiveHomeRedDot", z17 ? 1 : 0, format, format2);
            eVar.f363606u = true;
            eVar.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "report " + str + ' ' + z17);
            if (nl0.c.f419693b == null) {
                nl0.c.b();
            }
            nl0.c.f419693b.z0("LiveHomeRedDot", str, c10778x2218720e.h(), z17 ? 1 : 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString("kara_live_home_last_reddot", str);
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }
}
