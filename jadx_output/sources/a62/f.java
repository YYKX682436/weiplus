package a62;

/* loaded from: classes15.dex */
public abstract class f {
    public static org.json.JSONObject a(r45.lw3 lw3Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tbe", lw3Var.f379876d);
            long j17 = lw3Var.f379877e - lw3Var.f379876d;
            if (j17 <= 0) {
                j17 = 0;
            }
            jSONObject.put("in", j17);
            jSONObject.put("vv", "2.0");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionReport", e17, "createJSONObjectHead, crash: %s", e17.getMessage());
            return null;
        }
    }

    public static void b(java.util.Map map) {
        java.util.List arrayList;
        r45.f16 a17 = x52.i.a("mmkv_key_hellSPMatchSuche_");
        if (a17 != null) {
            java.util.LinkedList linkedList = a17.f373930d;
            if (linkedList.isEmpty()) {
                return;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.e16 e16Var = (r45.e16) it.next();
                if (map.containsKey(java.lang.Long.valueOf(e16Var.f372912g))) {
                    arrayList = (java.util.List) map.get(java.lang.Long.valueOf(e16Var.f372912g));
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                } else {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(e16Var);
                map.put(java.lang.Long.valueOf(e16Var.f372912g), arrayList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map c(java.util.Map r17, r45.c45 r18) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a62.f.c(java.util.Map, r45.c45):java.util.Map");
    }

    public static java.util.Map d(r45.jw3 jw3Var, java.util.List list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String g17 = b52.b.g(jw3Var.f378159d);
        if (g17 == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.g16 g16Var = (r45.g16) it.next();
            boolean z17 = true;
            r45.c16 c16Var = (r45.c16) g16Var.f374824f.get(g16Var.f374828m + 1);
            boolean equals = g17.equals(b52.b.g(c16Var.f371220d));
            java.util.LinkedList linkedList = g16Var.f374824f;
            boolean z18 = false;
            if (equals) {
                int i17 = g16Var.f374828m + 1;
                g16Var.f374828m = i17;
                if (i17 == linkedList.size() - 1) {
                    g16Var.f374828m = -1;
                } else {
                    z17 = false;
                }
                f(jw3Var, c16Var, g16Var.f374823e);
                java.util.Iterator it6 = jw3Var.f378163h.iterator();
                while (it6.hasNext()) {
                    r45.kw3 kw3Var = (r45.kw3) it6.next();
                    if (kw3Var != null) {
                        hashSet.add(kw3Var.f379000f);
                    }
                }
                z18 = z17;
            } else {
                r45.c16 c16Var2 = (r45.c16) linkedList.get(0);
                if (g17.equals(b52.b.g(c16Var2.f371220d))) {
                    g16Var.f374828m = 0;
                    f(jw3Var, c16Var2, g16Var.f374823e);
                } else {
                    g16Var.f374828m = -1;
                }
            }
            r45.e16 e16Var = new r45.e16();
            e16Var.f372909d = g16Var.f374828m;
            e16Var.f372910e = z18;
            long j17 = g16Var.f374823e;
            e16Var.f372912g = j17;
            e16Var.f372911f = jw3Var.f378162g;
            e16Var.f372915m = g16Var.f374826h;
            e16Var.f372913h = g16Var.f374825g;
            hashMap.put(java.lang.Long.valueOf(j17), e16Var);
        }
        if (!hashSet.isEmpty()) {
            java.util.List d17 = x52.a.d();
            if (d17 != null && !d17.isEmpty()) {
                java.util.Iterator it7 = hashSet.iterator();
                while (it7.hasNext()) {
                    java.lang.String str = (java.lang.String) it7.next();
                    if (str != null && !d17.contains(str)) {
                        d17.add(str);
                    }
                }
                if (!d17.isEmpty()) {
                    r45.hb hbVar = new r45.hb();
                    hbVar.f375995d.addAll(d17);
                    x52.a.c(hbVar);
                }
            } else if (!hashSet.isEmpty()) {
                r45.hb hbVar2 = new r45.hb();
                hbVar2.f375995d.addAll(hashSet);
                x52.a.c(hbVar2);
            }
        }
        return hashMap;
    }

    public static boolean e(java.lang.String str, long j17) {
        int length;
        if (str == null) {
            return false;
        }
        try {
            length = str.getBytes().length;
        } catch (java.lang.Exception unused) {
            length = str.length();
        }
        return length >= 20480 || java.lang.System.currentTimeMillis() - j17 >= 3600000;
    }

    public static void f(r45.jw3 jw3Var, r45.c16 c16Var, long j17) {
        java.util.LinkedList linkedList;
        java.util.Iterator it = jw3Var.f378166n.iterator();
        while (it.hasNext()) {
            r45.a07 a07Var = (r45.a07) it.next();
            if (a07Var != null) {
                r45.k44 k44Var = new r45.k44();
                k44Var.f378363d = j17;
                java.util.Iterator it6 = c16Var.f371222f.iterator();
                while (true) {
                    boolean hasNext = it6.hasNext();
                    linkedList = k44Var.f378364e;
                    if (!hasNext) {
                        break;
                    }
                    r45.b07 b07Var = (r45.b07) it6.next();
                    if (b07Var != null && (b07Var.f370417d.equals(a07Var.f369601d) || b07Var.f370422i.equals(a07Var.f369602e))) {
                        if (k52.q.f304326a.d(a07Var.f369605h, b07Var.f370423m)) {
                            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellSessionReport", "recordRealDataPath: id=%s, res=%s", a07Var.f369601d, a07Var.f369602e);
                            a07Var.f369614t = false;
                            java.util.Iterator it7 = b07Var.f370421h.iterator();
                            while (it7.hasNext()) {
                                r45.b45 b45Var = (r45.b45) it7.next();
                                if (b45Var != null) {
                                    linkedList.add(b45Var.f370520e);
                                }
                            }
                        }
                    }
                }
                if (!linkedList.isEmpty()) {
                    a07Var.f369613s.add(k44Var);
                }
            }
        }
    }
}
