package db2;

/* loaded from: classes2.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public static final db2.t4 f309704a = new db2.t4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f309705b = kz5.c0.i(3688, 3901, 8432, 9935, 3763, 11842, 8083);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f309706c = jz5.h.b(db2.s4.f309686d);

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f309707d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f309708e = "";

    /* renamed from: f, reason: collision with root package name */
    public static long f309709f;

    /* renamed from: g, reason: collision with root package name */
    public static long f309710g;

    public static void i(db2.t4 t4Var, r45.kv0 kv0Var, java.util.List list, r45.qt2 qt2Var, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            qt2Var = null;
        }
        t4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            f309704a.d(kv0Var, new jz5.o(lVar.f384366d, lVar.f384367e, null), qt2Var, "");
        }
    }

    public static java.lang.String m(db2.t4 t4Var, java.lang.String udfKv, java.lang.String kvJsonStr, boolean z17, int i17, java.lang.Object obj) {
        java.lang.String str;
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        t4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kvJsonStr, "kvJsonStr");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kvJsonStr)) {
            if (!r26.i0.y(udfKv, "{", false)) {
                return udfKv;
            }
            byte[] bytes = udfKv.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
            return encodeToString;
        }
        if (r26.i0.y(udfKv, "{", false)) {
            str = t4Var.l(new org.json.JSONObject(udfKv), kvJsonStr, z17);
        } else {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(udfKv)) {
                    byte[] decode = android.util.Base64.decode(udfKv, 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                    str = t4Var.l(new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a)), kvJsonStr, z17);
                } else if (z17) {
                    byte[] bytes2 = kvJsonStr.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                    str = android.util.Base64.encodeToString(bytes2, 2);
                } else {
                    str = new org.json.JSONObject(kvJsonStr).toString();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.BaseRequestFactory", e17, "fillClientReportInfo", new java.lang.Object[0]);
                str = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        return str;
    }

    public final r45.kv0 a(int i17) {
        r45.kv0 kv0Var = new r45.kv0();
        hc2.p.a(kv0Var);
        e(kv0Var);
        kv0Var.set(0, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0)));
        kv0Var.set(6, java.lang.Integer.valueOf(s()));
        kv0Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        kv0Var.set(9, new r45.it0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209483ta).mo141623x754a37bb()).r()).booleanValue()) {
            c(kv0Var, i17);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209173cb).mo141623x754a37bb()).r()).intValue() == 1) {
            kv0Var.set(11, java.lang.Long.valueOf(kv0Var.m75942xfb822ef2(11) | 2));
        }
        kv0Var.set(10, r(i17));
        java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).f206746i;
        if (linkedList != null && (!linkedList.isEmpty())) {
            r45.bo2 bo2Var = new r45.bo2();
            bo2Var.set(1, linkedList);
            kv0Var.set(12, bo2Var);
        }
        return kv0Var;
    }

    public final r45.kv0 b(int i17, r45.qt2 qt2Var) {
        r45.kv0 kv0Var = new r45.kv0();
        hc2.p.a(kv0Var);
        e(kv0Var);
        kv0Var.set(0, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0)));
        kv0Var.set(6, java.lang.Integer.valueOf(s()));
        kv0Var.set(4, new r45.g40());
        kv0Var.set(10, r(i17));
        if (qt2Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)));
            r45.g40 g40Var = (r45.g40) kv0Var.m75936x14adae67(4);
            if (g40Var != null) {
                g40Var.set(0, qt2Var.m75945x2fec8307(1));
            }
            r45.g40 g40Var2 = (r45.g40) kv0Var.m75936x14adae67(4);
            if (g40Var2 != null) {
                g40Var2.set(1, qt2Var.m75945x2fec8307(2));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, qt2Var.m75945x2fec8307(0));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qt2Var.m75945x2fec8307(11))) {
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, qt2Var.m75945x2fec8307(11));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qt2Var.m75945x2fec8307(12))) {
                    jSONObject.put("enterSourceInfo", qt2Var.m75945x2fec8307(12));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qt2Var.m75945x2fec8307(16))) {
                    jSONObject.put("jumpId", qt2Var.m75945x2fec8307(16));
                }
            } catch (java.lang.Exception unused) {
            }
            r45.g40 g40Var3 = (r45.g40) kv0Var.m75936x14adae67(4);
            if (g40Var3 != null) {
                g40Var3.set(2, jSONObject.toString());
            }
        }
        kv0Var.set(5, java.lang.Long.valueOf(c01.id.c()));
        kv0Var.set(9, new r45.it0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209483ta).mo141623x754a37bb()).r()).booleanValue()) {
            c(kv0Var, i17);
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209173cb).mo141623x754a37bb()).r()).intValue() == 1) {
            kv0Var.set(11, java.lang.Long.valueOf(kv0Var.m75942xfb822ef2(11) | 2));
        }
        java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).f206746i;
        if (linkedList != null && (!linkedList.isEmpty())) {
            r45.bo2 bo2Var = new r45.bo2();
            bo2Var.set(1, linkedList);
            kv0Var.set(12, bo2Var);
        }
        return kv0Var;
    }

    public final void c(r45.kv0 kv0Var, int i17) {
        boolean contains = f309705b.contains(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "[needAdDeviceInfo] cmdId:" + i17 + " res:" + contains);
        if (!contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "[fillAdBaseRequest] cmdId:" + i17 + ", no need return");
            return;
        }
        if (((r45.it0) kv0Var.m75936x14adae67(9)) == null) {
            kv0Var.set(9, new r45.it0());
        }
        try {
            r45.it0 it0Var = (r45.it0) kv0Var.m75936x14adae67(9);
            if (it0Var != null) {
                db2.t4 t4Var = f309704a;
                int i18 = 0;
                it0Var.set(0, t4Var.p());
                it0Var.set(1, t4Var.t());
                it0Var.set(2, java.lang.Integer.valueOf(t4Var.o()));
                int m40065x82653f5d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m40065x82653f5d != 0) {
                    int i19 = m40065x82653f5d / 100;
                    int i27 = m40065x82653f5d % 100;
                    if (i19 == 460) {
                        if (i27 != 0) {
                            if (i27 != 1) {
                                if (i27 != 2) {
                                    if (i27 != 3 && i27 != 5) {
                                        if (i27 != 6) {
                                            if (i27 != 7) {
                                                if (i27 != 9) {
                                                    if (i27 != 11) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i18 = 3;
                                }
                            }
                            i18 = 2;
                        }
                        i18 = 1;
                    }
                }
                it0Var.set(3, java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "it is going to get vangogh version");
                ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                java.lang.String e17 = m54.j.e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVangoghVersion", "com.tencent.mm.plugin.sns.ad.SnsAdService");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getVangoghVersion(...)");
                it0Var.set(5, e17);
                it0Var.set(4, 1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                    it0Var.set(4, java.lang.Integer.valueOf(it0Var.m75939xb282bd08(4) | 2));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.BaseRequestFactory", "fillAdBaseRequest failed, " + th6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r45.kv0 r18, jz5.o r19, r45.qt2 r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t4.d(r45.kv0, jz5.o, r45.qt2, java.lang.String):void");
    }

    public final void e(r45.kv0 kv0Var) {
        if (kv0Var != null) {
            kv0Var.set(8, java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(8) | 1));
            if (((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).f120759d) {
                kv0Var.set(8, java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(8) | 2));
            }
        }
    }

    public final java.lang.String f(java.lang.String udfKv, java.lang.String commonReportInfo, boolean z17) {
        java.lang.String jSONObject;
        java.lang.String str;
        java.lang.String jSONObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udfKv, "udfKv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonReportInfo, "commonReportInfo");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commonReportInfo)) {
            if (!r26.i0.y(udfKv, "{", false)) {
                return udfKv;
            }
            byte[] bytes = udfKv.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(encodeToString);
            return encodeToString;
        }
        if (r26.i0.y(udfKv, "{", false)) {
            return g(new org.json.JSONObject(udfKv), commonReportInfo, z17);
        }
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.BaseRequestFactory", e17, "fillClientReportInfo", new java.lang.Object[0]);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(udfKv)) {
            byte[] decode = android.util.Base64.decode(udfKv, 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            return g(new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a)), commonReportInfo, z17);
        }
        if (z17) {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(commonReportInfo).optJSONObject("clientReportInfo");
            if (optJSONObject == null || (jSONObject2 = optJSONObject.toString()) == null) {
                str = null;
            } else {
                byte[] bytes2 = jSONObject2.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                str = android.util.Base64.encodeToString(bytes2, 2);
            }
            if (str != null) {
                return str;
            }
        } else {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(commonReportInfo).optJSONObject("clientReportInfo");
            if (optJSONObject2 != null && (jSONObject = optJSONObject2.toString()) != null) {
                return jSONObject;
            }
        }
        return "";
    }

    public final java.lang.String g(org.json.JSONObject jSONObject, java.lang.String str, boolean z17) {
        java.lang.String jSONObject2;
        java.util.Iterator<java.lang.String> keys;
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(str).optJSONObject("clientReportInfo");
            if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, optJSONObject.get(next));
                }
            }
            if (z17) {
                java.lang.String jSONObject3 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                byte[] bytes = jSONObject3.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                jSONObject2 = android.util.Base64.encodeToString(bytes, 2);
            } else {
                jSONObject2 = jSONObject.toString();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.BaseRequestFactory", e17, "fillClientReportJson", new java.lang.Object[0]);
            return "";
        }
    }

    public final void h(r45.kv0 kv0Var, r45.qt2 qt2Var, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f309704a.d(kv0Var, (jz5.o) it.next(), qt2Var, "");
        }
    }

    public final void j(r45.kv0 kv0Var, long j17, java.lang.String sessionBuffer) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        if (kv0Var == null || (m75941xfb821914 = kv0Var.m75941xfb821914(7)) == null) {
            return;
        }
        r45.fl2 fl2Var = new r45.fl2();
        fl2Var.set(1, sessionBuffer);
        fl2Var.set(0, java.lang.Long.valueOf(j17));
        m75941xfb821914.add(fl2Var);
    }

    public final void k(r45.kv0 kv0Var, r45.a34 a34Var) {
        if (a34Var == null || kv0Var == null) {
            return;
        }
        kv0Var.set(13, a34Var);
    }

    public final java.lang.String l(org.json.JSONObject jSONObject, java.lang.String str, boolean z17) {
        java.lang.String jSONObject2;
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject.put(next, jSONObject3.get(next));
            }
            if (z17) {
                java.lang.String jSONObject4 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                byte[] bytes = jSONObject4.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                jSONObject2 = android.util.Base64.encodeToString(bytes, 2);
            } else {
                jSONObject2 = jSONObject.toString();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.BaseRequestFactory", e17, "fillClientReportJson", new java.lang.Object[0]);
            return "";
        }
    }

    public final r45.dx0 n() {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        return cw2.p4.f305444a.d();
    }

    public final int o() {
        int i17;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474794h) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
        } else if (r75.d.f474791e == -100) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
            r75.d.f474791e = i17;
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
            i17 = r75.d.f474791e;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        if (i17 == 3) {
            return 3;
        }
        if (i17 != 4) {
            return i17 != 5 ? 0 : 7;
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r2 > ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ha).mo141623x754a37bb()).r()).intValue()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p() {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = db2.t4.f309709f
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L37
            java.lang.String r2 = db2.t4.f309707d
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L37
            long r2 = db2.t4.f309709f
            long r2 = r0 - r2
            long r2 = java.lang.Math.abs(r2)
            com.tencent.mm.plugin.finder.storage.t70 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ha
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.mo141623x754a37bb()
            lb2.j r4 = (lb2.j) r4
            java.lang.Object r4 = r4.r()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L49
        L37:
            db2.t4.f309709f = r0
            java.lang.Class<fe0.m3> r0 = fe0.m3.class
            i95.m r0 = i95.n0.c(r0)
            fe0.m3 r0 = (fe0.m3) r0
            ee0.g r0 = (ee0.g) r0
            java.lang.String r0 = r0.wi()
            db2.t4.f309707d = r0
        L49:
            java.lang.String r0 = db2.t4.f309707d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.t4.p():java.lang.String");
    }

    public final boolean q() {
        return ((java.lang.Boolean) ((jz5.n) f309706c).mo141623x754a37bb()).booleanValue();
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g r(int i17) {
        java.util.LinkedList m75941xfb821914 = g92.b.f351302e.k2().d().m75941xfb821914(25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getExpt_buffers(...)");
        int i18 = 0;
        for (java.lang.Object obj : m75941xfb821914) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj;
            if (gVar != null && gVar.f273689a.length > 0) {
                try {
                    r45.l21 l21Var = new r45.l21();
                    l21Var.m75932x347fbd55(gVar.g());
                    if (l21Var.m75939xb282bd08(1) == i17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("[getExptBuffer] index:");
                        sb6.append(i18);
                        sb6.append(" cmdId=");
                        sb6.append(i17);
                        sb6.append(" found ");
                        java.util.LinkedList<r45.k21> m75941xfb8219142 = l21Var.m75941xfb821914(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getContainer(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                        for (r45.k21 k21Var : m75941xfb8219142) {
                            arrayList.add(k21Var.m75945x2fec8307(1) + " => " + k21Var.m75945x2fec8307(0));
                        }
                        sb6.append(arrayList);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", sb6.toString());
                        return gVar;
                    }
                    continue;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "[getExptBuffer] index:" + i18 + "  cmdId=" + i17 + " buf:" + android.util.Base64.encodeToString(gVar.g(), 0) + " err:" + th6.getMessage());
                }
            }
            i18 = i19;
        }
        return null;
    }

    public final int s() {
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VISITOR_ASSISTANT_INT_SYNC, 0);
        int r18 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VISITOR_HARDCODE_ROLE_INT_SYNC, 0);
        if (r18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "cgi, get svrHardCodeRole, " + r18);
            return r18;
        }
        if (r17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "cgi, get isAssistant, 1");
            return r17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BaseRequestFactory", "cgi, get isAssistant, " + r17);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        return g92.b.f351302e.k2().m75939xb282bd08(4);
    }

    public final java.lang.String t() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (f309710g == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f309708e) || java.lang.Math.abs(currentTimeMillis - f309710g) > ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ia).mo141623x754a37bb()).r()).intValue()) {
            f309710g = currentTimeMillis;
            ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSysUserAgent", "com.tencent.mm.feature.sns.AdDeviceInfoService");
            java.lang.String e17 = v34.b.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSysUserAgent", "com.tencent.mm.feature.sns.AdDeviceInfoService");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getSysUserAgent(...)");
            f309708e = e17;
        }
        return f309708e;
    }
}
