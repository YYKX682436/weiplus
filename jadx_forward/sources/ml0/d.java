package ml0;

/* loaded from: classes13.dex */
public class d extends ml0.b {

    /* renamed from: b, reason: collision with root package name */
    public static final ml0.d f408720b = new ml0.d();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ml0.b
    public boolean a() {
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_plugin_kara_prophet_collect_open", "1", false, true), 1) != 0) != true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.FullLinkDataCollector", "no working");
            return false;
        }
        nl0.d a17 = nl0.c.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - 86400000;
        a17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = a17.f419696d.B("select * from KeyNodeInfo where is_full_links_data_collector_finished=false and happen_time<=?", new java.lang.String[]{java.lang.String.valueOf(currentTimeMillis)});
        while (B.moveToNext()) {
            try {
                dm.u6 u6Var = new dm.u6();
                u6Var.mo9015xbf5d97fd(B);
                arrayList.add(u6Var);
            } catch (java.lang.Throwable th6) {
                if (B != null) {
                    B.close();
                }
                throw th6;
            }
        }
        B.close();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dm.u6 u6Var2 = (dm.u6) it.next();
            if (u6Var2.f68588x2262335f.equals("MomentVideo")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.FullLinkDataCollector", "begin: %s %s", u6Var2.f68588x2262335f, u6Var2.f68574xc8a07680);
                u6Var2.f68575x713bde13 = true;
                a17.z0(u6Var2);
            }
            if (u6Var2.f68573x68eb8605 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.FullLinkDataCollector", "no happened");
            } else if (u6Var2.f68580xdf382598 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.FullLinkDataCollector", "no predict");
            } else {
                em0.c cVar = new em0.c();
                cVar.f336525a = u6Var2.f68588x2262335f;
                cVar.f336526b = !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() ? 1 : 0;
                double doubleValue = java.lang.Double.valueOf(u6Var2.f68573x68eb8605).doubleValue() / 1000.0d;
                cVar.f336527c = doubleValue == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue));
                double doubleValue2 = java.lang.Double.valueOf(u6Var2.f68580xdf382598).doubleValue() / 1000.0d;
                cVar.f336528d = doubleValue2 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue2));
                double doubleValue3 = java.lang.Double.valueOf(u6Var2.f68583x9348ba2a).doubleValue() / 1000.0d;
                cVar.f336529e = doubleValue3 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue3));
                double doubleValue4 = java.lang.Double.valueOf(u6Var2.f68572x34f486f0).doubleValue() / 1000.0d;
                cVar.f336530f = doubleValue4 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue4));
                double doubleValue5 = java.lang.Double.valueOf(u6Var2.f68584xdc36ef76).doubleValue() / 1000.0d;
                cVar.f336531g = doubleValue5 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue5));
                float f17 = u6Var2.f68582xfe5e3cf4;
                cVar.f336532h = ((double) f17) == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Float.valueOf(f17));
                cVar.f336533i = java.lang.String.valueOf(u6Var2.f68579x4a55a39e);
                java.lang.String str = u6Var2.f68569x225aa2b6;
                if (str == null) {
                    str = "";
                }
                cVar.f336534j = str;
                double doubleValue6 = java.lang.Double.valueOf(u6Var2.f68587x9d850de6).doubleValue() / 1000.0d;
                cVar.f336535k = doubleValue6 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue6));
                java.lang.String str2 = u6Var2.f68571x6d651db5;
                if (str2 == null) {
                    str2 = "";
                }
                cVar.f336536l = str2;
                double doubleValue7 = java.lang.Double.valueOf(u6Var2.f68585x62b7358e).doubleValue() / 1000.0d;
                cVar.f336537m = doubleValue7 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue7));
                double doubleValue8 = java.lang.Double.valueOf(u6Var2.f68586xa8de1927).doubleValue() / 1000.0d;
                cVar.f336540p = doubleValue8 == 0.0d ? "" : java.lang.String.format("%.4f", java.lang.Double.valueOf(doubleValue8));
                java.lang.String str3 = u6Var2.f68577x83c1d32;
                if (str3 == null) {
                    str3 = "";
                }
                cVar.f336538n = str3;
                java.lang.String str4 = u6Var2.f68578xca46169a;
                if (str4 == null) {
                    str4 = "";
                }
                cVar.f336539o = str4;
                java.lang.String str5 = u6Var2.f68570x3211ea76;
                if (str5 == null) {
                    str5 = "";
                }
                cVar.f336541q = str5;
                java.lang.String str6 = u6Var2.f68567x7c3ca06a;
                if (str6 == null) {
                    str6 = "";
                }
                cVar.f336542r = str6;
                java.lang.String str7 = u6Var2.f68568xfdb8f5d2;
                if (str7 == null) {
                    str7 = "";
                }
                cVar.f336543s = str7;
                cVar.f336544t = java.lang.String.valueOf(u6Var2.f68589x8987ca93);
                if (cVar.f336525a.equals("MomentVideo") && doubleValue2 > 0.0d) {
                    boolean z17 = u6Var2.f68584xdc36ef76 > 0;
                    boolean z18 = u6Var2.f68579x4a55a39e == 1;
                    boolean z19 = u6Var2.f68581xdf386205 == 1;
                    if (z17 && z18) {
                        em0.e.a(z19 ? 248L : 255L);
                    }
                    if (z17 && !z18) {
                        em0.e.a(z19 ? 245L : 252L);
                    }
                    if (!z17 && z18) {
                        em0.e.a(z19 ? 247L : 254L);
                    }
                    if (!z17 && !z18) {
                        em0.e.a(z19 ? 246L : 253L);
                    }
                    if (z18) {
                        em0.e.a(z19 ? 244L : 251L);
                    } else {
                        em0.e.a(z19 ? 243L : 250L);
                    }
                    em0.d.a(cVar.f336525a, cVar);
                }
                if (cVar.f336525a.equals("LiveHomeRedDot") && doubleValue2 > 0.0d && u6Var2.f68576x5c5523e2) {
                    u6Var2.f68575x713bde13 = true;
                    a17.z0(u6Var2);
                    boolean z27 = u6Var2.f68584xdc36ef76 > 0;
                    boolean z28 = u6Var2.f68579x4a55a39e == 1;
                    if (z27 && z28) {
                        em0.e.a(241L);
                    }
                    if (z27 && !z28) {
                        em0.e.a(238L);
                    }
                    if (!z27 && z28) {
                        em0.e.a(240L);
                    }
                    if (!z27 && !z28) {
                        em0.e.a(239L);
                    }
                    if (z28) {
                        em0.e.a(237L);
                    } else {
                        em0.e.a(236L);
                    }
                    em0.d.a(cVar.f336525a, cVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.FullLinkDataCollector", "finish: %s %s", u6Var2.f68588x2262335f, u6Var2.f68574xc8a07680);
            }
        }
        return true;
    }

    @Override // ml0.b
    public long b() {
        return 1800000L;
    }

    @Override // ml0.b
    public java.lang.String c() {
        return "ProphetCollector";
    }
}
