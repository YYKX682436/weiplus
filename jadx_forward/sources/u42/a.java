package u42;

/* loaded from: classes12.dex */
public class a implements u42.c {

    /* renamed from: a, reason: collision with root package name */
    public final u42.b f506171a = new u42.b();

    /* renamed from: b, reason: collision with root package name */
    public long f506172b;

    /* renamed from: c, reason: collision with root package name */
    public long f506173c;

    public a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = g42.i.e();
        if (e17 != null) {
            this.f506172b = e17.getLong("mmkv_key_realtime_report_period", 0L);
            this.f506173c = e17.getLong("mmkv_key_realtime_report_lasttime", 0L);
        }
    }

    public static void d(int i17, java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.e3 e3Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.uj5();
        lVar.f152198b = new r45.vj5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/rtkvreport";
        lVar.f152200d = 716;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        final r45.uj5 uj5Var = (r45.uj5) a17.f152243a.f152217a;
        uj5Var.f468948d = o45.wf.f424558c;
        uj5Var.f468949e = o45.wf.f424557b;
        uj5Var.f468950f = o45.wf.f424560e;
        uj5Var.f468951g = wo.q.f529318f;
        uj5Var.f468952h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        uj5Var.f468953i = i17;
        if (i17 < 32337) {
            uj5Var.f468954m = "ClientIPV6," + str;
        } else {
            uj5Var.f468954m = "ClientIPV6,RegCountry," + str;
        }
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p944x882e457a.e3(currentTimeMillis, uj5Var, e3Var) { // from class: u42.a$$c

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r45.uj5 f506178d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.e3 f506179e;

            {
                this.f506178d = uj5Var;
                this.f506179e = e3Var;
            }

            @Override // com.p314xaae8f345.mm.p944x882e457a.e3
            /* renamed from: callback */
            public final int mo1034xf5bc2045(int i18, int i19, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.System.currentTimeMillis();
                java.lang.String str3 = this.f506178d.f468954m;
                com.p314xaae8f345.mm.p944x882e457a.e3 e3Var2 = this.f506179e;
                if (e3Var2 != null) {
                    return e3Var2.mo1034xf5bc2045(i18, i19, str2, oVar, m1Var);
                }
                return 0;
            }
        }, false);
    }

    public static java.lang.String f(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < list.size(); i17++) {
            if (i17 < list.size() - 1) {
                sb6.append((java.lang.String) list.get(i17));
                sb6.append(",");
            } else {
                sb6.append((java.lang.String) list.get(i17));
            }
        }
        return sb6.toString();
    }

    public void a() {
        java.util.ArrayList<r45.uh0> arrayList;
        java.lang.String[] b17;
        this.f506171a.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17 = g42.i.f();
        boolean z17 = false;
        if (f17 == null || (b17 = f17.b()) == null || b17.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                byte[] j17 = f17.j(str);
                if (j17 != null && j17.length > 0) {
                    r45.uh0 uh0Var = new r45.uh0();
                    try {
                        uh0Var.mo11468x92b714fd(j17);
                        arrayList.add(uh0Var);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingRtReportCache", "[EdgeComputingRtReportCache] read parse realtimeReportItem throw Exception : " + e17.getMessage());
                    }
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f506173c < this.f506172b * 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingReporter", "report realtimeReport reportPeriod : " + this.f506172b + ", distance : " + (currentTimeMillis - this.f506173c));
            return;
        }
        if (arrayList.size() > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            z17 = gm0.j1.d().h(new k42.a(arrayList, this), 0);
        }
        if (!z17) {
            if (arrayList.size() > 0) {
                for (r45.uh0 uh0Var2 : arrayList) {
                    java.util.LinkedList linkedList = uh0Var2.f468910f;
                    if (linkedList != null && linkedList.size() > 0) {
                        java.util.Iterator it = uh0Var2.f468910f.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(uh0Var2.f468909e, (java.lang.String) it.next());
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingReporter", "report realtimeReport fail!");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e18 = g42.i.e();
        if (e18 != null) {
            e18.putLong("mmkv_key_realtime_report_lasttime", currentTimeMillis);
        }
        this.f506173c = currentTimeMillis;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f18 = g42.i.f();
        if (f18 != null) {
            f18.d();
            if (f18.Y() >= 3145728) {
                f18.a0();
            }
        }
        t42.a.d(1);
    }

    public void b(java.lang.String str, int i17, java.util.List list) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        if (u46.l.e(str) || i17 <= 0 || list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            r42.b bVar = (r42.b) it.next();
            if (bVar == null) {
                return;
            }
            while (true) {
                i18 = bVar.f451045a;
                str2 = "";
                if (i18 <= i19) {
                    break;
                }
                arrayList.add("");
                i19++;
            }
            if (i18 >= i19) {
                int i27 = bVar.f451046b;
                if (i27 == 2) {
                    str2 = java.lang.String.valueOf(bVar.f451049e);
                } else if (i27 == 1) {
                    str2 = java.lang.String.valueOf(bVar.f451048d);
                } else if (i27 == 0 && (str3 = bVar.f451050f) != null) {
                    str2 = str3;
                }
                if (str2.contains(",")) {
                    str2 = str2.replace(",", "\\$");
                }
                arrayList.add(str2);
                i19++;
            }
        }
        this.f506171a.a(str, i17, f(arrayList));
    }

    public void c(int i17, java.util.List list) {
        int i18;
        java.lang.String str;
        java.lang.String str2;
        if (list == null || list.size() <= 0 || i17 <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingReporter", "[EdgeComputingReporter] kvReportFieldData logID : " + i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            r42.b bVar = (r42.b) it.next();
            if (bVar == null) {
                return;
            }
            while (true) {
                i18 = bVar.f451045a;
                str = "";
                if (i18 <= i19) {
                    break;
                }
                arrayList.add("");
                i19++;
            }
            if (i18 >= i19) {
                int i27 = bVar.f451046b;
                if (i27 == 2) {
                    str = java.lang.String.valueOf(bVar.f451049e);
                } else if (i27 == 1) {
                    str = java.lang.String.valueOf(bVar.f451048d);
                } else if (i27 == 0 && (str2 = bVar.f451050f) != null) {
                    str = str2;
                }
                if (str.contains(",")) {
                    str = str.replace(",", "\\$");
                }
                arrayList.add(str);
                i19++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(i17, f(arrayList), false, false, true);
    }

    public void e(final int i17, java.util.List list) {
        int i18;
        java.lang.String str;
        java.lang.String str2;
        if (list == null || list.size() <= 0 || i17 <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingReporter", "[EdgeComputingReporter] rtKVReportFieldData logID : " + i17);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            r42.b bVar = (r42.b) it.next();
            if (bVar == null) {
                return;
            }
            while (true) {
                i18 = bVar.f451045a;
                str = "";
                if (i18 <= i19) {
                    break;
                }
                arrayList.add("");
                i19++;
            }
            if (i18 >= i19) {
                int i27 = bVar.f451046b;
                if (i27 == 2) {
                    str = java.lang.String.valueOf(bVar.f451049e);
                } else if (i27 == 1) {
                    str = java.lang.String.valueOf(bVar.f451048d);
                } else if (i27 == 0 && (str2 = bVar.f451050f) != null) {
                    str = str2;
                }
                if (str.contains(",")) {
                    str = str.replace(",", "\\$");
                }
                arrayList.add(str);
                i19++;
            }
        }
        d(i17, f(arrayList), new com.p314xaae8f345.mm.p944x882e457a.e3() { // from class: u42.a$$b
            @Override // com.p314xaae8f345.mm.p944x882e457a.e3
            /* renamed from: callback */
            public final int mo1034xf5bc2045(int i28, int i29, java.lang.String str3, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                int i37 = i17;
                if (i28 == 0 && i29 == 0) {
                    return 0;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.p(i37, u42.a.f(arrayList), false, false, true);
                return 0;
            }
        });
    }
}
