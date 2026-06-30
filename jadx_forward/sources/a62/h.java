package a62;

/* loaded from: classes15.dex */
public abstract class h {
    public static void a(r45.lw3 lw3Var, r45.jw3 jw3Var) {
        r45.c45 c45Var;
        r45.w35 w35Var;
        boolean z17;
        r45.w35 w35Var2;
        r45.c45 c45Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", "adjustSession");
        java.util.Iterator it = lw3Var.f461411f.iterator();
        r45.w35 w35Var3 = null;
        r45.c45 c45Var3 = null;
        loop0: while (true) {
            c45Var = c45Var3;
            while (it.hasNext()) {
                c45Var2 = (r45.c45) it.next();
                if (c45Var2 != null) {
                    if (c45Var3 == null) {
                        break;
                    }
                    if (c45Var2.f452808i < c45Var3.f452808i) {
                        c45Var3 = c45Var2;
                    }
                    if (c45Var2.f452809m > c45Var.f452809m) {
                        c45Var = c45Var2;
                    }
                }
            }
            c45Var3 = c45Var2;
        }
        java.util.Iterator it6 = lw3Var.f461413h.iterator();
        loop2: while (true) {
            w35Var = w35Var3;
            while (it6.hasNext()) {
                w35Var2 = (r45.w35) it6.next();
                if (w35Var2 != null) {
                    if (w35Var3 == null) {
                        break;
                    }
                    if (w35Var2.f470378g < w35Var3.f470378g) {
                        w35Var3 = w35Var2;
                    }
                    if (w35Var2.f470379h > w35Var.f470379h) {
                        w35Var = w35Var2;
                    }
                }
            }
            w35Var3 = w35Var2;
        }
        if (c45Var3 == null) {
            if (w35Var3 == null) {
                return;
            }
            z17 = w35Var3.f470381m.equals(jw3Var.f459692d) && w35Var3.f470378g == jw3Var.f459693e;
            w35Var3.f470378g = lw3Var.f461409d;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page TRUE !!!");
                jw3Var.f459693e = w35Var3.f470378g;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page FALSE !!!");
            }
        } else if (w35Var3 == null) {
            c45Var3.f452808i = lw3Var.f461409d;
        } else if (w35Var3.f470378g < c45Var3.f452808i) {
            z17 = w35Var3.f470381m.equals(jw3Var.f459692d) && w35Var3.f470378g == jw3Var.f459693e;
            w35Var3.f470378g = lw3Var.f461409d;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page TRUE !!!");
                jw3Var.f459693e = w35Var3.f470378g;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellSessionReportUtil", " adjustSession same page FALSE !!!");
            }
        } else {
            c45Var3.f452808i = lw3Var.f461409d;
        }
        if (c45Var == null) {
            if (w35Var != null) {
                w35Var.f470379h = lw3Var.f461410e;
            }
        } else if (w35Var == null) {
            c45Var.f452809m = lw3Var.f461410e;
        } else if (w35Var.f470379h > c45Var.f452809m) {
            w35Var.f470379h = lw3Var.f461410e;
        } else {
            c45Var.f452809m = lw3Var.f461410e;
        }
    }

    public static void b(org.json.JSONObject jSONObject, r45.jw3 jw3Var, boolean z17, long j17) {
        java.lang.String str;
        java.util.LinkedList<r45.kw3> linkedList = z17 ? jw3Var.f459698m : jw3Var.f459696h;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (linkedList.isEmpty()) {
            jSONObject.put("businessParam", jSONArray);
            e(jw3Var.f459692d, z17, j17);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.kw3 kw3Var : linkedList) {
            if (kw3Var != null && !android.text.TextUtils.isEmpty(kw3Var.f460533f)) {
                arrayList.add(kw3Var.f460533f);
            }
        }
        int i17 = 0;
        for (r45.kw3 kw3Var2 : linkedList) {
            if (kw3Var2 != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.String str2 = kw3Var2.f460532e;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject2.put("dataPath", str2);
                java.lang.String str3 = kw3Var2.f460531d;
                jSONObject2.put("value", str3 != null ? str3 : "");
                if (!android.text.TextUtils.isEmpty(kw3Var2.f460533f)) {
                    str = kw3Var2.f460533f;
                    jSONObject2.put("businessId", str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                    jSONArray.put(jSONObject2);
                }
                do {
                    i17++;
                    str = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.d(jw3Var.f459693e, i17);
                } while (arrayList.contains(str));
                arrayList.add(str);
                jSONObject2.put("businessId", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReportUtil", "handleSessionPageDetailParams, bizId, %s", str);
                jSONArray.put(jSONObject2);
            }
        }
        if (!z17) {
            jSONArray.length();
        }
        jSONObject.put("businessParam", jSONArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [org.json.JSONObject, java.lang.Object] */
    public static void c(org.json.JSONObject jSONObject, r45.jw3 jw3Var, long j17) {
        java.lang.Object obj;
        java.util.Iterator it;
        java.lang.String str;
        if (jw3Var.f459699n.isEmpty()) {
            g(jw3Var.f459692d, j17);
            return;
        }
        ?? jSONArray = new org.json.JSONArray();
        java.util.Iterator it6 = jw3Var.f459699n.iterator();
        while (it6.hasNext()) {
            r45.a07 a07Var = (r45.a07) it6.next();
            if (a07Var != null && !a07Var.f451147t) {
                ?? jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("viewId", a07Var.f451135e);
                jSONObject2.put("type", a07Var.f451148u);
                jSONObject2.put("action", a07Var.f451139i);
                jSONObject2.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, a07Var.f451142o);
                java.util.LinkedList linkedList = a07Var.f451145r;
                if (linkedList.isEmpty()) {
                    obj = jSONArray;
                    it = it6;
                    f(a07Var.f451135e, jw3Var.f459692d, j17);
                } else {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        r45.ql qlVar = (r45.ql) it7.next();
                        if (qlVar != null && qlVar.f465613d == j17) {
                            java.util.Iterator it8 = qlVar.f465614e.iterator();
                            while (it8.hasNext()) {
                                r45.kw3 kw3Var = (r45.kw3) it8.next();
                                if (kw3Var != null && (str = kw3Var.f460532e) != null) {
                                    java.util.Iterator it9 = a07Var.f451146s.iterator();
                                    boolean z17 = false;
                                    java.lang.Object obj2 = jSONArray;
                                    while (it9.hasNext()) {
                                        r45.k44 k44Var = (r45.k44) it9.next();
                                        java.lang.Object obj3 = obj2;
                                        java.util.Iterator it10 = it6;
                                        if (k44Var != null && k44Var.f459896d == j17) {
                                            java.util.Iterator it11 = k44Var.f459897e.iterator();
                                            while (true) {
                                                if (it11.hasNext()) {
                                                    java.lang.String str2 = (java.lang.String) it11.next();
                                                    if (!android.text.TextUtils.isEmpty(str2) && str2.equals(str)) {
                                                        z17 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = obj3;
                                        it6 = it10;
                                    }
                                    java.lang.Object obj4 = obj2;
                                    java.util.Iterator it12 = it6;
                                    if (z17) {
                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                        jSONObject3.put("dataPath", kw3Var.f460532e);
                                        jSONObject3.put("value", kw3Var.f460531d);
                                        jSONArray2.put(jSONObject3);
                                    }
                                    jSONArray = obj4;
                                    it6 = it12;
                                }
                            }
                        }
                    }
                    obj = jSONArray;
                    it = it6;
                    if (jSONArray2.length() > 0) {
                        jSONObject2.put("businessParam", jSONArray2);
                    }
                }
                jSONArray = obj;
                jSONArray.put(jSONObject2);
                it6 = it;
            }
        }
        jSONArray.length();
        jSONObject.put("viewOp", jSONArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x065a A[Catch: Exception -> 0x0723, TryCatch #10 {Exception -> 0x0723, blocks: (B:118:0x05db, B:121:0x05e8, B:271:0x0614, B:273:0x0626, B:281:0x0644, B:282:0x0654, B:284:0x065a, B:287:0x0669, B:289:0x066f, B:305:0x0677, B:308:0x067d, B:292:0x0681, B:295:0x0689, B:298:0x069d, B:312:0x06ae, B:314:0x06b5, B:319:0x06ba, B:320:0x06c7, B:322:0x06cd, B:324:0x06db, B:328:0x06e6, B:330:0x06ee, B:333:0x0706), top: B:117:0x05db }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06cd A[Catch: Exception -> 0x0723, LOOP:5: B:320:0x06c7->B:322:0x06cd, LOOP_END, TryCatch #10 {Exception -> 0x0723, blocks: (B:118:0x05db, B:121:0x05e8, B:271:0x0614, B:273:0x0626, B:281:0x0644, B:282:0x0654, B:284:0x065a, B:287:0x0669, B:289:0x066f, B:305:0x0677, B:308:0x067d, B:292:0x0681, B:295:0x0689, B:298:0x069d, B:312:0x06ae, B:314:0x06b5, B:319:0x06ba, B:320:0x06c7, B:322:0x06cd, B:324:0x06db, B:328:0x06e6, B:330:0x06ee, B:333:0x0706), top: B:117:0x05db }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06e6 A[Catch: Exception -> 0x0723, TryCatch #10 {Exception -> 0x0723, blocks: (B:118:0x05db, B:121:0x05e8, B:271:0x0614, B:273:0x0626, B:281:0x0644, B:282:0x0654, B:284:0x065a, B:287:0x0669, B:289:0x066f, B:305:0x0677, B:308:0x067d, B:292:0x0681, B:295:0x0689, B:298:0x069d, B:312:0x06ae, B:314:0x06b5, B:319:0x06ba, B:320:0x06c7, B:322:0x06cd, B:324:0x06db, B:328:0x06e6, B:330:0x06ee, B:333:0x0706), top: B:117:0x05db }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x058d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(r45.lw3 r27, r45.iw3 r28, r45.c45 r29) {
        /*
            Method dump skipped, instructions count: 2518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a62.h.d(r45.lw3, r45.iw3, r45.c45):void");
    }

    public static void e(java.lang.String str, boolean z17, long j17) {
        r45.g16 b17;
        if (z17 || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e.a().b(j17)) == null) {
            return;
        }
        java.util.Iterator it = b17.f456357f.iterator();
        while (it.hasNext()) {
            r45.c16 c16Var = (r45.c16) it.next();
            if (c16Var != null && str.equals(b52.b.g(c16Var.f452753d)) && !(!c16Var.f452754e.isEmpty())) {
                return;
            }
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, long j17) {
        boolean z17;
        r45.g16 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e.a().b(j17);
        if (b17 != null) {
            java.util.Iterator it = b17.f456357f.iterator();
            while (it.hasNext()) {
                r45.c16 c16Var = (r45.c16) it.next();
                if (c16Var != null && str2.equals(b52.b.g(c16Var.f452753d))) {
                    java.util.Iterator it6 = c16Var.f452755f.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = false;
                            break;
                        }
                        r45.b07 b07Var = (r45.b07) it6.next();
                        if (b07Var != null && str.equals(b07Var.f451955i)) {
                            b07Var.f451954h.isEmpty();
                            z17 = true;
                            break;
                        }
                    }
                    if (z17) {
                        return;
                    }
                }
            }
        }
    }

    public static void g(java.lang.String str, long j17) {
        r45.g16 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.e.a().b(j17);
        if (b17 != null) {
            java.util.Iterator it = b17.f456357f.iterator();
            while (it.hasNext()) {
                r45.c16 c16Var = (r45.c16) it.next();
                if (c16Var != null && str.equals(b52.b.g(c16Var.f452753d)) && !(!c16Var.f452755f.isEmpty())) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0765 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e4 A[LOOP:3: B:91:0x02de->B:93:0x02e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(r45.lw3 r24, r45.iw3 r25, r45.c45 r26) {
        /*
            Method dump skipped, instructions count: 1945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a62.h.h(r45.lw3, r45.iw3, r45.c45):void");
    }

    public static void i(r45.iw3 iw3Var, r45.lw3 lw3Var, boolean z17) {
        int i17;
        r45.jw3 jw3Var;
        r45.jw3 jw3Var2;
        java.util.Collections.sort(iw3Var.f458887d, new a62.g());
        java.util.Map j17 = j(iw3Var);
        java.util.Iterator it = lw3Var.f461411f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.c45 c45Var = (r45.c45) it.next();
            java.util.List list = (java.util.List) ((java.util.HashMap) j17).get(c45Var.f452803d);
            if (list != null && !list.isEmpty()) {
                ((r45.jw3) list.get(0)).f459693e = c45Var.f452808i;
            }
        }
        java.util.Iterator it6 = lw3Var.f461413h.iterator();
        while (it6.hasNext()) {
            r45.w35 w35Var = (r45.w35) it6.next();
            java.util.List list2 = (java.util.List) ((java.util.HashMap) j17).get(w35Var.f470381m + "_" + w35Var.f470378g);
            if (list2 != null && !list2.isEmpty()) {
                ((r45.jw3) list2.get(0)).f459693e = w35Var.f470378g;
            }
        }
        java.util.LinkedList linkedList = iw3Var.f458887d;
        int size = linkedList.size();
        if (size > 0 && (jw3Var2 = (r45.jw3) linkedList.getFirst()) != null) {
            jw3Var2.f459693e = lw3Var.f461409d;
        }
        int i18 = 0;
        while (true) {
            if (i18 >= size) {
                break;
            }
            r45.jw3 jw3Var3 = (r45.jw3) linkedList.get(i18);
            if (jw3Var3 != null) {
                int i19 = i18 + 1;
                if (i19 >= size) {
                    break;
                }
                r45.jw3 jw3Var4 = (r45.jw3) linkedList.get(i19);
                if (jw3Var4 != null && jw3Var3.f459694f == 0) {
                    long j18 = jw3Var4.f459693e - jw3Var3.f459693e;
                    jw3Var3.f459694f = j18 > 0 ? j18 : 0L;
                }
            }
            i18++;
        }
        if (!z17) {
            if (size <= 0 || (jw3Var = (r45.jw3) linkedList.getLast()) == null) {
                return;
            }
            long j19 = lw3Var.f461410e - jw3Var.f459693e;
            jw3Var.f459694f = j19 > 0 ? j19 : 0L;
            return;
        }
        long j27 = 0;
        for (i17 = 0; i17 < size; i17++) {
            r45.jw3 jw3Var5 = (r45.jw3) linkedList.get(i17);
            if (jw3Var5 != null) {
                long j28 = jw3Var5.f459694f;
                if (j28 > 0) {
                    j27 += j28;
                }
            }
        }
        lw3Var.f461410e = lw3Var.f461409d + j27;
    }

    public static java.util.Map j(r45.iw3 iw3Var) {
        java.util.List arrayList;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = iw3Var.f458887d.iterator();
        while (it.hasNext()) {
            r45.jw3 jw3Var = (r45.jw3) it.next();
            if (jw3Var != null) {
                java.lang.String str = jw3Var.f459695g;
                if (str == null || str.isEmpty()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(jw3Var);
                    hashMap.put(jw3Var.f459692d + "_" + jw3Var.f459693e, arrayList2);
                } else {
                    if (hashMap.containsKey(jw3Var.f459695g)) {
                        arrayList = (java.util.List) hashMap.get(jw3Var.f459695g);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                    } else {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(jw3Var);
                    hashMap.put(jw3Var.f459695g, arrayList);
                }
            }
        }
        return hashMap;
    }

    public static java.util.Map k(r45.iw3 iw3Var) {
        java.util.List arrayList;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = iw3Var.f458887d.iterator();
        while (it.hasNext()) {
            r45.jw3 jw3Var = (r45.jw3) it.next();
            if (jw3Var != null) {
                java.lang.String str = jw3Var.f459695g;
                if (str != null && !str.isEmpty()) {
                    if (hashMap.containsKey(jw3Var.f459695g)) {
                        arrayList = (java.util.List) hashMap.get(jw3Var.f459695g);
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                    } else {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(jw3Var);
                    hashMap.put(jw3Var.f459695g, arrayList);
                } else if (!hashMap.containsKey(jw3Var.f459692d)) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(jw3Var);
                    hashMap.put(jw3Var.f459692d, arrayList2);
                }
            }
        }
        return hashMap;
    }
}
