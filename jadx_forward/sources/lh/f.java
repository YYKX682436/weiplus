package lh;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f400129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh.b f400130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb f400131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gi.w0 f400132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f400133h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rh.o2 o2Var, qh.b bVar, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb, gi.w0 w0Var, wh.n1 n1Var) {
        super(0);
        this.f400129d = o2Var;
        this.f400130e = bVar;
        this.f400131f = c4627xadd9bddb;
        this.f400132g = w0Var;
        this.f400133h = n1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map m40827x8f8c4694;
        java.util.Map m40827x8f8c46942;
        java.util.Map m40827x8f8c46943;
        java.util.Map m40827x8f8c46944;
        java.util.Map m40827x8f8c46945;
        java.util.Map m40827x8f8c46946;
        java.util.List m40826x8f8c4694;
        java.util.List m40826x8f8c46942;
        java.util.Map m40827x8f8c46947;
        java.util.Map m40827x8f8c46948;
        java.util.Map m40827x8f8c46949;
        java.util.Map m40827x8f8c469410;
        java.util.List m40826x8f8c46943;
        rh.o2 o2Var = this.f400129d;
        uh.f fVar = ((uh.g) o2Var.f477017a).f509210d;
        boolean z17 = true;
        qh.b bVar = this.f400130e;
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4627xadd9bddb c4627xadd9bddb = this.f400131f;
        if (fVar != null) {
            long j17 = fVar.f509203a;
            double p17 = uh.i.p((((float) j17) * 1.0f) / ((float) bVar.f444854n), 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PowerAccMonitor", "checkUseful: " + j17 + '/' + bVar.f444854n + '=' + p17);
            if (mm.o.d(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, 50000)) {
                ap.a.a(1, "accPowerUseful", null, null, c4627xadd9bddb.getAccName(), java.lang.String.valueOf(p17), java.lang.String.valueOf(j17), java.lang.String.valueOf(bVar.f444854n));
            }
        }
        boolean j18 = mm.k.j(mm.k.f410035m, null, 1, null);
        gi.w0 w0Var = this.f400132g;
        if (!j18 || w0Var.O()) {
            c4627xadd9bddb.m40802xf4c1af90(c4627xadd9bddb.getAccCount() + 1);
            c4627xadd9bddb.m40804x374dc9a6(c4627xadd9bddb.getAccDuringMs() + bVar.f444854n);
            c4627xadd9bddb.m40798x62a1d0cd(c4627xadd9bddb.getAccAppBgMs() + (((float) bVar.f444854n) * (bVar.f444842b / 100.0f)));
            c4627xadd9bddb.m40803x20ae0c70(c4627xadd9bddb.getAccDevChargeMs() + (((float) bVar.f444854n) * (bVar.f444845e / 100.0f)));
            rh.o2 t17 = w0Var.t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class);
            if (t17 != null) {
                long accPidJiffies = c4627xadd9bddb.getAccPidJiffies();
                java.lang.Number number = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) t17.f477019c).f134094g.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number, "get(...)");
                c4627xadd9bddb.m40808xfc81624c(accPidJiffies + number.longValue());
            }
            rh.o2 t18 = w0Var.t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class);
            if (t18 != null) {
                long accUidJiffies = c4627xadd9bddb.getAccUidJiffies();
                java.lang.Number number2 = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) t18.f477019c).f134115d.f477085a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(number2, "get(...)");
                c4627xadd9bddb.m40814xc1f097e7(accUidJiffies + number2.longValue());
            }
            int i17 = 20;
            r9 = r9.intValue() > 0 ? 20 : null;
            if (r9 != null) {
                int intValue = r9.intValue();
                java.util.List o17 = w0Var.o();
                if (o17 != null && (!o17.isEmpty())) {
                    int size = o17.size();
                    int i18 = 0;
                    while (i18 < size) {
                        rh.o2 o2Var2 = (rh.o2) o17.get(i18);
                        java.util.List list = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134095h.f477093a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getList(...)");
                        if (list.isEmpty() ^ z17) {
                            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c;
                            java.lang.String g17 = ri.i.g(c4635xec0343cc.f134093f);
                            m40827x8f8c46947 = c4627xadd9bddb.m40827x8f8c4694(c4627xadd9bddb.m40786x632b3650());
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                            java.lang.Object obj = m40827x8f8c46947.get(g17);
                            if (obj == null) {
                                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                m40827x8f8c46947.put(g17, linkedHashMap);
                                obj = linkedHashMap;
                            }
                            java.util.Map map = (java.util.Map) obj;
                            m40827x8f8c46948 = c4627xadd9bddb.m40827x8f8c4694(c4627xadd9bddb.m40794x8b1927bb());
                            java.lang.Object obj2 = m40827x8f8c46948.get(g17);
                            if (obj2 == null) {
                                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                m40827x8f8c46948.put(g17, linkedHashMap2);
                                obj2 = linkedHashMap2;
                            }
                            java.util.Map map2 = (java.util.Map) obj2;
                            java.util.List list2 = c4635xec0343cc.f134095h.f477093a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "getList(...)");
                            for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot : kz5.n0.K0(list2, intValue)) {
                                java.lang.String name = threadJiffiesSnapshot.f134099c;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                                java.lang.Long l17 = (java.lang.Long) threadJiffiesSnapshot.f477085a;
                                m40827x8f8c46949 = c4627xadd9bddb.m40827x8f8c4694(map);
                                java.lang.Object obj3 = map.get(name);
                                if (obj3 == null) {
                                    obj3 = 0L;
                                }
                                long longValue = ((java.lang.Number) obj3).longValue();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                                m40827x8f8c46949.put(name, java.lang.Long.valueOf(longValue + l17.longValue()));
                                int i19 = threadJiffiesSnapshot.f134098b;
                                m40827x8f8c469410 = c4627xadd9bddb.m40827x8f8c4694(map2);
                                java.lang.Object obj4 = m40827x8f8c469410.get(name);
                                if (obj4 == null) {
                                    obj4 = new java.util.ArrayList();
                                    m40827x8f8c469410.put(name, obj4);
                                }
                                m40826x8f8c46943 = c4627xadd9bddb.m40826x8f8c4694((java.util.List) obj4);
                                m40826x8f8c46943.add(java.lang.Integer.valueOf(i19));
                            }
                        }
                        i18++;
                        z17 = true;
                    }
                }
                i17 = 20;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                w0Var.r(new lh.e(c4627xadd9bddb, valueOf.intValue()));
            }
            if (!bVar.g() && w0Var.B(rh.r1.class) != null && w0Var.B(rh.t1.class) != null) {
                rh.b3 B = w0Var.B(rh.r1.class);
                if (B != null) {
                    m40826x8f8c46942 = c4627xadd9bddb.m40826x8f8c4694(c4627xadd9bddb.m40780xb31abc3c());
                    m40826x8f8c46942.add(java.lang.Double.valueOf(B.f476849h));
                }
                rh.b3 B2 = w0Var.B(rh.t1.class);
                if (B2 != null) {
                    m40826x8f8c4694 = c4627xadd9bddb.m40826x8f8c4694(c4627xadd9bddb.m40781xb32239de());
                    m40826x8f8c4694.add(java.lang.Double.valueOf(B2.f476849h));
                }
            }
            r2 = r2.intValue() > 0 ? 10 : null;
            rh.d3 d3Var = o2Var.f477019c;
            if (r2 != null) {
                int intValue2 = r2.intValue();
                uh.g gVar = (uh.g) d3Var;
                java.util.Map map3 = gVar.f509253y0;
                java.util.Map<java.lang.String, java.lang.Long> m40797x97bd5c18 = c4627xadd9bddb.m40797x97bd5c18();
                for (java.util.Map.Entry entry : kz5.n0.K0(map3.entrySet(), intValue2)) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.lang.Long l18 = (java.lang.Long) ((rh.x2) entry.getValue()).f477085a;
                    m40827x8f8c46946 = c4627xadd9bddb.m40827x8f8c4694(m40797x97bd5c18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.lang.Long l19 = m40797x97bd5c18.get(str);
                    if (l19 == null) {
                        l19 = 0L;
                    }
                    long longValue2 = l19.longValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
                    m40827x8f8c46946.put(str, java.lang.Long.valueOf(longValue2 + l18.longValue()));
                }
                java.util.Map map4 = gVar.f509255z0;
                java.util.Map<java.lang.String, java.lang.Long> m40796x7385cd16 = c4627xadd9bddb.m40796x7385cd16();
                for (java.util.Map.Entry entry2 : kz5.n0.K0(map4.entrySet(), intValue2)) {
                    java.lang.String str2 = (java.lang.String) entry2.getKey();
                    java.lang.Long l27 = (java.lang.Long) ((rh.x2) entry2.getValue()).f477085a;
                    m40827x8f8c46945 = c4627xadd9bddb.m40827x8f8c4694(m40796x7385cd16);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    java.lang.Long l28 = m40796x7385cd16.get(str2);
                    if (l28 == null) {
                        l28 = 0L;
                    }
                    long longValue3 = l28.longValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l27);
                    m40827x8f8c46945.put(str2, java.lang.Long.valueOf(longValue3 + l27.longValue()));
                }
            }
            if (((uh.g) o2Var.f477017a).f509210d != null || w0Var.O()) {
                java.util.Map b17 = gi.u0.b(this.f400133h, (uh.g) d3Var, w0Var, null);
                if (!b17.isEmpty()) {
                    for (java.util.Map.Entry entry3 : b17.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry3.getKey();
                        java.lang.Object value = entry3.getValue();
                        if (r26.i0.A(str3, "power-", false, 2, null) && (value instanceof java.util.Map)) {
                            m40827x8f8c4694 = c4627xadd9bddb.m40827x8f8c4694(c4627xadd9bddb.m40791x3b9a4a45());
                            java.lang.Object obj5 = m40827x8f8c4694.get(str3);
                            if (obj5 == null) {
                                obj5 = new java.util.LinkedHashMap();
                                m40827x8f8c4694.put(str3, obj5);
                            }
                            m40827x8f8c46942 = c4627xadd9bddb.m40827x8f8c4694((java.util.Map) obj5);
                            for (java.util.Map.Entry entry4 : ((java.util.Map) value).entrySet()) {
                                if ((entry4.getKey() instanceof java.lang.String) && (entry4.getValue() instanceof java.lang.Number)) {
                                    java.lang.Object key = entry4.getKey();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key, "null cannot be cast to non-null type kotlin.String");
                                    java.lang.String str4 = (java.lang.String) key;
                                    java.lang.Object value2 = entry4.getValue();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(value2, "null cannot be cast to non-null type kotlin.Number");
                                    java.lang.Number number3 = (java.lang.Number) value2;
                                    java.lang.Object obj6 = m40827x8f8c46942.get(str4);
                                    if (obj6 == null) {
                                        obj6 = java.lang.Double.valueOf(0.0d);
                                    }
                                    m40827x8f8c46942.put(str4, java.lang.Double.valueOf(((java.lang.Number) obj6).doubleValue() + number3.doubleValue()));
                                } else {
                                    m40827x8f8c46943 = c4627xadd9bddb.m40827x8f8c4694(c4627xadd9bddb.m40790x3ad719b6());
                                    java.lang.Object obj7 = m40827x8f8c46943.get(str3);
                                    if (obj7 == null) {
                                        obj7 = new java.util.LinkedHashMap();
                                        m40827x8f8c46943.put(str3, obj7);
                                    }
                                    m40827x8f8c46944 = c4627xadd9bddb.m40827x8f8c4694((java.util.Map) obj7);
                                    java.lang.Object key2 = entry4.getKey();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(key2, "null cannot be cast to non-null type kotlin.String");
                                    java.lang.String str5 = (java.lang.String) key2;
                                    java.lang.Object value3 = entry4.getValue();
                                    if (value3 == null) {
                                        value3 = "";
                                    }
                                    m40827x8f8c46944.put(str5, value3);
                                }
                            }
                        }
                    }
                }
            }
            lh.c cVar = new lh.c(c4627xadd9bddb);
            uh.g gVar2 = (uh.g) d3Var;
            java.util.Map procStatsCpuUsrTimeMs = gVar2.f509245u0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(procStatsCpuUsrTimeMs, "procStatsCpuUsrTimeMs");
            if (!procStatsCpuUsrTimeMs.isEmpty()) {
                for (java.util.Map.Entry entry5 : gVar2.f509245u0.entrySet()) {
                    java.lang.String str6 = (java.lang.String) entry5.getKey();
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "getApplicationId(...)");
                    if (r26.i0.A(str6, str7, false, 2, null)) {
                        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71 c4628xe6192e71 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71) cVar.mo1850x58b836e(str6);
                        long j19 = c4628xe6192e71.f134083d;
                        java.lang.Number number4 = ((rh.x2) entry5.getValue()).f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(number4);
                        c4628xe6192e71.f134083d = j19 + number4.longValue();
                    }
                }
            }
            java.util.Map procStatsCpuSysTimeMs = gVar2.f509247v0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(procStatsCpuSysTimeMs, "procStatsCpuSysTimeMs");
            if (!procStatsCpuSysTimeMs.isEmpty()) {
                for (java.util.Map.Entry entry6 : gVar2.f509247v0.entrySet()) {
                    java.lang.String str8 = (java.lang.String) entry6.getKey();
                    java.lang.String str9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str9, "getApplicationId(...)");
                    if (r26.i0.A(str8, str9, false, 2, null)) {
                        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71 c4628xe6192e712 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71) cVar.mo1850x58b836e(str8);
                        long j27 = c4628xe6192e712.f134084e;
                        java.lang.Number number5 = ((rh.x2) entry6.getValue()).f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(number5);
                        c4628xe6192e712.f134084e = j27 + number5.longValue();
                    }
                }
            }
            java.util.Map procStatsStartCount = gVar2.f509251x0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(procStatsStartCount, "procStatsStartCount");
            if (!procStatsStartCount.isEmpty()) {
                for (java.util.Map.Entry entry7 : gVar2.f509251x0.entrySet()) {
                    java.lang.String str10 = (java.lang.String) entry7.getKey();
                    java.lang.String str11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str11, "getApplicationId(...)");
                    if (r26.i0.A(str10, str11, false, 2, null)) {
                        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71 c4628xe6192e713 = (com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.C4628xe6192e71) cVar.mo1850x58b836e(str10);
                        long j28 = c4628xe6192e713.f134085f;
                        java.lang.Number number6 = ((rh.x2) entry7.getValue()).f477085a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(number6);
                        c4628xe6192e713.f134085f = j28 + number6.longValue();
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
