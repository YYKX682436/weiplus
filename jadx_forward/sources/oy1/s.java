package oy1;

/* loaded from: classes13.dex */
public final class s extends oy1.l {

    /* renamed from: e, reason: collision with root package name */
    public boolean f431457e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f431458f = new java.util.LinkedHashMap();

    public s() {
        int i17;
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
                            this.f431457e = true;
                        } else {
                            java.util.Map map = this.f431458f;
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
                            this.f431457e = true;
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReporter", sb6.toString());
                    } else {
                        this.f431457e = true;
                    }
                }
            }
            i17 = 105;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiReporter", "get kv log config err");
            g();
            i17 = 105;
            jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 105);
        }
        if (this.f431457e) {
            jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, i17);
            g();
        }
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                a(null);
                b();
            }
            oy1.u.f431461a.c(true);
            ((ku5.t0) ku5.t0.f394148d).h(new oy1.r(this), "MicroMsg.CgiReporter");
        }
    }

    @Override // oy1.l, ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            oy1.u.f431461a.c(false);
        }
    }

    @Override // oy1.l
    public void c(int i17, java.util.List reportInfoList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoList, "reportInfoList");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = reportInfoList.iterator();
            while (it.hasNext()) {
                oy1.n nVar = (oy1.n) it.next();
                int i18 = nVar.f431431d;
                if (ny1.b.f422932b == null) {
                    ny1.b.f422932b = new ny1.b();
                }
                if (ny1.b.f422932b.a(i18, nVar.f431434g, nVar.f431439o)) {
                    r45.uc4 uc4Var = new r45.uc4();
                    uc4Var.f468750d = nVar.f431432e;
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
                        java.util.Map map = this.f431458f;
                        if (map.containsKey(java.lang.Integer.valueOf(i18))) {
                            oy1.p pVar = oy1.p.f431444a;
                            java.lang.String event_id = pq5Var.f464847e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(event_id, "event_id");
                            if (!oy1.p.f431449f.contains(event_id)) {
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6844xcf317f18 c6844xcf317f18 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6844xcf317f18();
                                c6844xcf317f18.f141651d = i18;
                                c6844xcf317f18.f141652e = c6844xcf317f18.b("Version", "3.1.1", true);
                                c6844xcf317f18.f141653f = sz1.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                c6844xcf317f18.f141654g = sz1.a.d();
                                r45.nq5 nq5Var3 = pq5Var.f464846d;
                                c6844xcf317f18.f141655h = nq5Var3.f463135d;
                                c6844xcf317f18.f141656i = c6844xcf317f18.b("ReportSDKItemID", nq5Var3.f463136e, true);
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
                                r45.uq5 uq5Var2 = pq5Var.f464848f;
                                c6844xcf317f18.f141663p = uq5Var2.f469110d;
                                c6844xcf317f18.f141662o = uq5Var2.f469111e;
                                java.lang.String data_json = pq5Var.f464849g;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data_json, "data_json");
                                c6844xcf317f18.f141664q = c6844xcf317f18.b("EventDataJson", r26.i0.u(data_json, ',', ';', false, 4, null), true);
                                java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i18));
                                if (list != null) {
                                    java.util.Iterator it6 = list.iterator();
                                    while (it6.hasNext()) {
                                        int intValue = ((java.lang.Number) it6.next()).intValue();
                                        c6844xcf317f18.n();
                                        jx3.f.INSTANCE.p(intValue, c6844xcf317f18.m(), false, false, true);
                                    }
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiReporter", "cur businessId = " + i18);
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createItemData : ");
                    try {
                        java.lang.String optString = new org.json.JSONObject(pq5Var.f464849g).optString("feedid", "null");
                        r45.nq5 nq5Var4 = pq5Var.f464846d;
                        java.lang.String format = java.lang.String.format("%s_[%s]_[%s]_[%s]", java.util.Arrays.copyOf(new java.lang.Object[]{nq5Var4.f463136e, pq5Var.f464847e, optString, nq5Var4.f463140i}, 4));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                        str8 = format;
                    } catch (java.lang.NullPointerException | org.json.JSONException | java.lang.Exception unused) {
                    }
                    sb6.append(str8);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReporter", sb6.toString());
                    uc4Var.f468751e = pq5Var;
                    uc4Var.f468752f = "default";
                    uc4Var.f468753g = java.lang.System.currentTimeMillis();
                    if (z17) {
                        arrayList.add(uc4Var);
                    } else {
                        oy1.c0 a17 = oy1.u.f431461a.a(i18);
                        if (a17 != null) {
                            a17.e(uc4Var);
                        }
                    }
                    if (z17) {
                        oy1.u.f431461a.b(i17, arrayList);
                    }
                }
            }
        }
    }

    @Override // oy1.l
    public void d(java.lang.String str) {
        oy1.m.f431418a.c("expt_change");
    }

    @Override // oy1.l
    public void e(boolean z17) {
        if (z17) {
            qy1.g gVar = qy1.g.f449258a;
            if (!qy1.g.f449259b.get()) {
                oy1.u.f431461a.e();
            }
        }
        qy1.g gVar2 = qy1.g.f449258a;
        qy1.g.f449259b.set(z17);
    }

    @Override // oy1.l
    public void f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            super.f(context);
            oy1.u.f431461a.d();
            qy1.c.f449250a.a();
        }
    }

    public final void g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(29309);
        java.util.Map map = this.f431458f;
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

    public void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                a(context);
                b();
                ez1.g.f339373i.P(this);
            }
            qy1.c cVar = qy1.c.f449250a;
            if (qy1.c.f449251b != null) {
                cVar.a();
            }
            qy1.c.f449252c.put(428459010, qy1.b.f449234a);
            cVar.c();
            oy1.m.f431418a.d();
            java.util.List V0 = kz5.n0.V0(((java.util.LinkedHashMap) this.f431458f).keySet());
            if (oy1.m.f431422e == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(V0);
                oy1.m.f431422e = arrayList;
            }
            java.lang.Integer num = oy1.m.f431419b;
            if ((num != null ? num.intValue() : 1) == 1) {
                ((ku5.t0) ku5.t0.f394148d).l(new oy1.q(this), 60000L, "MicroMsg.CgiReporter");
            }
        }
    }
}
