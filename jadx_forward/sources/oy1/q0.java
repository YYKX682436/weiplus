package oy1;

/* loaded from: classes13.dex */
public final class q0 implements ez1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oy1.q0 f431452d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f431453e;

    /* renamed from: f, reason: collision with root package name */
    public static android.net.ConnectivityManager.NetworkCallback f431454f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f431455g;

    static {
        int i17;
        oy1.q0 q0Var = new oy1.q0();
        f431452d = q0Var;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.datareport.cgi.newreport.NewCgiReportService$exptIListener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                oy1.m.f431418a.c("expt_change");
                return false;
            }
        };
        f431455g = new java.util.LinkedHashMap();
        abstractC20980x9b9ad01d.mo48813x58998cd();
        try {
            java.lang.reflect.Field[] declaredFields = iy1.b.class.getDeclaredFields();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
            for (java.lang.reflect.Field field : declaredFields) {
                java.lang.Object obj = field.get(iy1.b.class);
                java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                ey1.a aVar = (ey1.a) field.getAnnotation(ey1.a.class);
                if (aVar != null) {
                    if (num != null) {
                        java.util.List x07 = kz5.z.x0(aVar.m128310xf497ae74());
                        if (x07.isEmpty()) {
                            f431453e = true;
                        } else {
                            java.util.Map map = f431455g;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = x07.iterator();
                            while (it.hasNext()) {
                                int intValue = ((java.lang.Number) it.next()).intValue();
                                if (intValue > 0) {
                                    arrayList.add(java.lang.Integer.valueOf(intValue));
                                }
                            }
                            map.put(num, arrayList);
                        }
                        int m128311x5a623f5 = aVar.m128311x5a623f5();
                        java.lang.String cgiPath = aVar.m128309x2ab98e4a();
                        int m128312xed8c05a1 = aVar.m128312xed8c05a1();
                        if (m128311x5a623f5 <= 0 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cgiPath, "")) {
                            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            f431453e = true;
                        } else {
                            oy1.m mVar = oy1.m.f431418a;
                            int intValue2 = num.intValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiPath, "cgiPath");
                            if (intValue2 > 0) {
                                oy1.m.f431426i.put(java.lang.Integer.valueOf(intValue2), new ny1.a(intValue2, m128311x5a623f5, cgiPath, m128312xed8c05a1));
                            }
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("init report route bizId = ");
                        sb6.append(num);
                        sb6.append(", cmdId = ");
                        sb6.append(m128311x5a623f5);
                        sb6.append(" cgiPath = ");
                        sb6.append(cgiPath);
                        sb6.append(" retryCnt = ");
                        sb6.append(m128312xed8c05a1);
                        sb6.append(" clientLogId = ");
                        java.lang.String arrays = java.util.Arrays.toString(aVar.m128310xf497ae74());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                        sb6.append(arrays);
                        sb6.append(" serverLogId = ");
                        java.lang.String arrays2 = java.util.Arrays.toString(aVar.m128313xd1baddfc());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
                        sb6.append(arrays2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", sb6.toString());
                    } else {
                        f431453e = true;
                    }
                }
            }
            i17 = 105;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiReportService", "get kv log config err");
            q0Var.c();
            i17 = 105;
            jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 105);
        }
        if (f431453e) {
            jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, i17);
            q0Var.c();
        }
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            oy1.u.f431461a.c(true);
            a(null);
            b();
            ((ku5.t0) ku5.t0.f394148d).h(oy1.p0.f431450d, "MicroMsg.CgiReportService");
        }
    }

    public final void a(android.content.Context context) {
        if (f431454f == null) {
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            java.lang.Object systemService = context != null ? context.getSystemService("connectivity") : null;
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    oy1.m0 m0Var = new oy1.m0(connectivityManager);
                    f431454f = m0Var;
                    connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().build(), m0Var);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMKvUtils", "check on line err " + e17);
                    try {
                        android.net.ConnectivityManager.NetworkCallback networkCallback = f431454f;
                        if (networkCallback != null) {
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    f431454f = null;
                }
            }
        }
    }

    public final void b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((ku5.t0) ku5.t0.f394148d).l(oy1.n0.f431442d, 1000L, "MicroMsg.CgiReportService");
        }
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            oy1.u.f431461a.c(false);
        }
    }

    public final void c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(29309);
        java.util.Map map = f431455g;
        map.put(1, arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(29309);
        map.put(2, arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(29205);
        map.put(3, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(29572);
        map.put(4, arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(29771);
        map.put(5, arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(29771);
        map.put(9, arrayList6);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(30149);
        map.put(6, arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(30481);
        map.put(7, arrayList8);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(30482);
        map.put(8, arrayList9);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(31502);
        map.put(10, arrayList10);
    }

    public final void d(int i17, r45.pq5 pq5Var) {
        java.util.Map map = f431455g;
        if (!map.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiReportService", "cur businessId = " + i17);
            return;
        }
        oy1.p pVar = oy1.p.f431444a;
        java.lang.String event_id = pq5Var.f464847e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(event_id, "event_id");
        if (oy1.p.f431449f.contains(event_id)) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6844xcf317f18 c6844xcf317f18 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6844xcf317f18();
        c6844xcf317f18.f141651d = i17;
        c6844xcf317f18.f141652e = c6844xcf317f18.b("Version", "3.1.1", true);
        c6844xcf317f18.f141653f = sz1.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        c6844xcf317f18.f141654g = sz1.a.d();
        r45.nq5 nq5Var = pq5Var.f464846d;
        c6844xcf317f18.f141655h = nq5Var.f463135d;
        c6844xcf317f18.f141656i = c6844xcf317f18.b("ReportSDKItemID", nq5Var.f463136e, true);
        c6844xcf317f18.f141657j = c6844xcf317f18.b("SDKSessionID", pq5Var.f464846d.f463140i, true);
        java.lang.String curr_page_json = pq5Var.f464846d.f463137f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(curr_page_json, "curr_page_json");
        c6844xcf317f18.f141658k = c6844xcf317f18.b("CurPageJson", r26.i0.u(curr_page_json, ',', ';', false, 4, null), true);
        java.lang.String ref_page_json = pq5Var.f464846d.f463139h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ref_page_json, "ref_page_json");
        c6844xcf317f18.f141659l = c6844xcf317f18.b("RefPageJson", r26.i0.u(ref_page_json, ',', ';', false, 4, null), true);
        java.lang.String source_page_json = pq5Var.f464846d.f463138g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(source_page_json, "source_page_json");
        c6844xcf317f18.f141660m = c6844xcf317f18.b("SourcePageJson", r26.i0.u(source_page_json, ',', ';', false, 4, null), true);
        c6844xcf317f18.f141661n = c6844xcf317f18.b("EventID", pq5Var.f464847e, true);
        r45.uq5 uq5Var = pq5Var.f464848f;
        c6844xcf317f18.f141663p = uq5Var.f469110d;
        c6844xcf317f18.f141662o = uq5Var.f469111e;
        java.lang.String data_json = pq5Var.f464849g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data_json, "data_json");
        c6844xcf317f18.f141664q = c6844xcf317f18.b("EventDataJson", r26.i0.u(data_json, ',', ';', false, 4, null), true);
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                c6844xcf317f18.n();
                jx3.f.INSTANCE.p(intValue, c6844xcf317f18.m(), false, false, true);
            }
        }
    }

    public final void e(int i17, java.util.List reportInfoList, boolean z17) {
        java.util.Iterator it;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoList, "reportInfoList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = reportInfoList.iterator();
        while (it6.hasNext()) {
            oy1.n nVar = (oy1.n) it6.next();
            int i18 = nVar.f431431d;
            if (ny1.b.f422932b == null) {
                ny1.b.f422932b = new ny1.b();
            }
            if (ny1.b.f422932b.a(i18, nVar.f431434g, nVar.f431439o)) {
                r45.uc4 uc4Var = new r45.uc4();
                uc4Var.f468750d = nVar.f431432e;
                oy1.q0 q0Var = f431452d;
                int i19 = nVar.f431433f;
                java.lang.String str = nVar.f431434g;
                java.lang.String str2 = nVar.f431435h;
                java.lang.String str3 = nVar.f431436i;
                java.lang.String str4 = nVar.f431437m;
                java.lang.String str5 = nVar.f431438n;
                java.lang.String str6 = nVar.f431439o;
                long j17 = nVar.f431440p;
                java.lang.String str7 = nVar.f431441q;
                r45.pq5 pq5Var = new r45.pq5();
                it = it6;
                r45.nq5 nq5Var = new r45.nq5();
                pq5Var.f464846d = nq5Var;
                nq5Var.f463135d = i19;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str8 = "";
                if (str == null) {
                    str = "";
                }
                nq5Var.f463136e = str;
                if (str2 == null) {
                    str2 = "";
                }
                nq5Var.f463137f = str2;
                if (str3 == null) {
                    str3 = "";
                }
                nq5Var.f463138g = str3;
                if (str4 == null) {
                    str4 = "";
                }
                nq5Var.f463139h = str4;
                if (str5 == null) {
                    str5 = "";
                }
                nq5Var.f463140i = str5;
                r45.uq5 uq5Var = new r45.uq5();
                pq5Var.f464848f = uq5Var;
                uq5Var.f469110d = j17;
                uq5Var.f469111e = c01.id.c();
                pq5Var.f464847e = str6;
                if (str7 == null) {
                    str7 = "";
                }
                pq5Var.f464849g = str7;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pq5Var.f464846d.f463138g)) {
                    r45.nq5 nq5Var2 = pq5Var.f464846d;
                    nq5Var2.f463138g = nq5Var2.f463139h;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    q0Var.d(i18, pq5Var);
                }
                try {
                    java.lang.String optString = new org.json.JSONObject(pq5Var.f464849g).optString("feedid", "null");
                    r45.nq5 nq5Var3 = pq5Var.f464846d;
                    java.lang.String format = java.lang.String.format("%s_[%s]_[%s]_[%s]", java.util.Arrays.copyOf(new java.lang.Object[]{nq5Var3.f463136e, pq5Var.f464847e, optString, nq5Var3.f463140i}, 4));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    str8 = format;
                } catch (java.lang.NullPointerException | org.json.JSONException | java.lang.Exception unused) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "createItemData : ".concat(str8));
                uc4Var.f468751e = pq5Var;
                uc4Var.f468752f = "default";
                uc4Var.f468753g = java.lang.System.currentTimeMillis();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("other_process_add_msg_id", i18);
                    bundle.putByteArray("other_process_add_msg", uc4Var.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str9, bundle, oy1.k0.class, null);
                } else if (z17) {
                    arrayList.add(uc4Var);
                } else {
                    oy1.c0 a17 = oy1.u.f431461a.a(i18);
                    if (a17 != null) {
                        a17.e(uc4Var);
                    }
                }
            } else {
                it = it6;
            }
            it6 = it;
        }
        if (z17) {
            oy1.u.f431461a.b(i17, arrayList);
        }
    }
}
