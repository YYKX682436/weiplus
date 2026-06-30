package oy1;

/* loaded from: classes13.dex */
public final class y implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy1.c0 f431466d;

    public y(oy1.c0 c0Var) {
        this.f431466d = c0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        java.lang.String[] b17;
        int i17;
        java.lang.String[] strArr;
        int i18;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i19 = it.what;
        int i27 = 0;
        oy1.c0 c0Var = this.f431466d;
        switch (i19) {
            case 1000:
                try {
                    java.lang.Object obj = it.obj;
                    nm5.b bVar = obj instanceof nm5.b ? (nm5.b) obj : null;
                    if (bVar != null) {
                        java.lang.Object a17 = bVar.a(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$1(...)");
                        java.lang.Object a18 = bVar.a(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$2(...)");
                        oy1.c0.b(c0Var, (java.lang.String) a17, (r45.uc4) a18);
                    }
                } catch (java.lang.Exception e17) {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c0Var.f431380b, " ADD MSG throw Exception " + e17.getMessage());
                }
                return true;
            case 1001:
                try {
                    java.lang.Object obj2 = it.obj;
                    java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    if (str2 != null) {
                        java.util.Map map = c0Var.f431383e;
                        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) map).get(str2);
                        if (num != null) {
                            int intValue = num.intValue();
                            oy1.m mVar = oy1.m.f431418a;
                            java.util.Set set = c0Var.f431384f;
                            if (intValue > 10) {
                                if (!set.contains(str2)) {
                                    set.add(str2);
                                }
                            } else if (set.contains(str2)) {
                                set.remove(str2);
                            }
                        }
                    }
                } catch (java.lang.Exception e18) {
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c0Var.f431380b, "CHECK_BLACK_LIST throw Exception " + e18.getMessage());
                }
                return true;
            case 1002:
                try {
                    java.lang.Object obj3 = it.obj;
                    nm5.d dVar = obj3 instanceof nm5.d ? (nm5.d) obj3 : null;
                    if (dVar != null) {
                        java.lang.Object a19 = dVar.a(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "$1(...)");
                        java.lang.Object a27 = dVar.a(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "$2(...)");
                        boolean booleanValue = ((java.lang.Boolean) a27).booleanValue();
                        java.lang.Object a28 = dVar.a(2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a28, "$3(...)");
                        boolean booleanValue2 = ((java.lang.Boolean) a28).booleanValue();
                        java.lang.Object a29 = dVar.a(3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a29, "$4(...)");
                        oy1.c0.d(c0Var, (ny1.k) a19, booleanValue, booleanValue2, ((java.lang.Boolean) a29).booleanValue());
                    }
                } catch (java.lang.Exception e19) {
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c0Var.f431380b, "NET_SCENE_END throw Exception " + e19.getMessage());
                }
                return true;
            case 1003:
                py1.b bVar2 = c0Var.f431386h;
                if (!c0Var.f431389k) {
                    c0Var.f431389k = true;
                    java.lang.String str5 = c0Var.f431380b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "start doHistory msg");
                    qy1.b0 b0Var = c0Var.f431387i;
                    b0Var.getClass();
                    qy1.c cVar = qy1.c.f449250a;
                    if (qy1.c.f449253d == null) {
                        cVar.c();
                    }
                    qy1.d dVar2 = qy1.c.f449253d;
                    if (dVar2 != null) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        try {
                            dVar2.f449256d.A("CgiReportLocalItemDataCache", "delete from CgiReportLocalItemDataCache where businessId = " + b0Var.f449235a + " AND reportTime <= " + (java.lang.System.currentTimeMillis() - 777600000));
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiLocalDataStorage", "delete HistoryDbItem err " + e27);
                        }
                    }
                    oy1.m mVar2 = oy1.m.f431418a;
                    java.lang.Integer num2 = oy1.m.f431419b;
                    boolean z18 = (num2 != null ? num2.intValue() : 1) == 1;
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = qy1.g.f449258a.g("SDKCgiWaitToReqMap", null);
                        if (g17 != null && (b17 = g17.b()) != null) {
                            int length = b17.length;
                            oy1.c0 c0Var2 = c0Var;
                            while (i27 < length) {
                                try {
                                    java.lang.String str6 = b17[i27];
                                    byte[] j17 = g17.j(str6);
                                    if (j17 != null) {
                                        r45.tc4 tc4Var = new r45.tc4();
                                        tc4Var.mo11468x92b714fd(j17);
                                        java.util.LinkedList<r45.sc4> linkedList2 = tc4Var.f467842d;
                                        if (linkedList2 != null) {
                                            for (r45.sc4 sc4Var : linkedList2) {
                                                int i28 = sc4Var.f467157d;
                                                int i29 = c0Var2.f431379a;
                                                if (i28 == i29) {
                                                    strArr = b17;
                                                    int i37 = length;
                                                    long j18 = sc4Var.f467160g;
                                                    boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                                    if (java.lang.System.currentTimeMillis() - j18 > 0) {
                                                        if (java.lang.System.currentTimeMillis() - sc4Var.f467160g < 259200000 && (linkedList = sc4Var.f467159f) != null) {
                                                            java.util.Iterator it6 = linkedList.iterator();
                                                            while (it6.hasNext()) {
                                                                r45.pq5 pq5Var = (r45.pq5) it6.next();
                                                                qy1.g gVar = qy1.g.f449258a;
                                                                int i38 = i27;
                                                                int i39 = i37;
                                                                long j19 = gVar.j();
                                                                r45.uc4 uc4Var = new r45.uc4();
                                                                uc4Var.f468751e = pq5Var;
                                                                java.util.Iterator it7 = it6;
                                                                uc4Var.f468753g = java.lang.System.currentTimeMillis();
                                                                uc4Var.f468752f = "history";
                                                                uc4Var.f468754h = j19;
                                                                r45.pq5 pq5Var2 = uc4Var.f468751e;
                                                                java.lang.String d17 = gVar.d(i29, uc4Var);
                                                                if (d17 == null) {
                                                                    d17 = "";
                                                                }
                                                                pq5Var2.f464850h = gVar.f(d17, j19);
                                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "checkAndDoHistoryMsg " + sc4Var.f467158e + ' ' + uc4Var.f468751e.f464850h + " add!");
                                                                if (z18) {
                                                                    c0Var.e(uc4Var);
                                                                    bVar2.b(null, py1.c.f440593w, null);
                                                                } else {
                                                                    b0Var.f("SDKCgiReportHistoryMap", uc4Var);
                                                                }
                                                                g17.remove(str6);
                                                                i27 = i38;
                                                                i37 = i39;
                                                                it6 = it7;
                                                            }
                                                        }
                                                    }
                                                    i17 = i27;
                                                    i18 = i37;
                                                    c0Var2 = c0Var;
                                                } else {
                                                    i17 = i27;
                                                    strArr = b17;
                                                    i18 = length;
                                                }
                                                b17 = strArr;
                                                i27 = i17;
                                                length = i18;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    i27++;
                                    b17 = b17;
                                    length = length;
                                } catch (java.lang.Exception unused) {
                                }
                            }
                            c0Var = c0Var2;
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                    c0Var.g("SDKCgiWaitReportMap", z18);
                    c0Var.g("SDKCgiAbnormalReportMap", z18);
                    if (z18) {
                        bVar2.b(null, py1.c.f440592v, null);
                    }
                }
                return true;
            case 1004:
                c0Var.o("Time_out");
                c0Var.f431386h.b(null, py1.c.f440585o, null);
                return true;
            case 1005:
                java.lang.Object obj4 = it.obj;
                java.lang.Long l17 = obj4 instanceof java.lang.Long ? (java.lang.Long) obj4 : null;
                if (l17 != null) {
                    long longValue = l17.longValue();
                    c0Var.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f431380b, "delayed appOut event [" + currentTimeMillis + "] end");
                    if (currentTimeMillis >= 15000) {
                        c0Var.f431386h.b(null, py1.c.f440591u, java.lang.Long.valueOf(currentTimeMillis));
                    }
                }
                return true;
            case 1006:
                c0Var.h();
                return true;
            case 1007:
                c0Var.h();
                return true;
            case 1008:
                try {
                    java.lang.Object obj5 = it.obj;
                    java.util.List list = p3321xbce91901.jvm.p3324x21ffc6bd.m0.g(obj5) ? (java.util.List) obj5 : null;
                    if (list != null) {
                        oy1.c0.c(c0Var, list);
                    }
                } catch (java.lang.Exception e28) {
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c0Var.f431380b, " CUSTOM ADD MSG throw Exception " + e28.getMessage());
                }
                return true;
            default:
                java.lang.Object obj6 = it.obj;
                java.lang.String str8 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                if (str8 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f431380b, "mHandler call back " + it.what + " key = " + str8);
                    qy1.b0 b0Var2 = c0Var.f431387i;
                    ny1.k c17 = b0Var2.c(str8);
                    if (c17 != null) {
                        c0Var.m(c17, "Time_out");
                        c0Var.f431386h.b(null, py1.c.f440582i, null);
                    }
                    b0Var2.d().remove(str8);
                }
                return true;
        }
    }
}
