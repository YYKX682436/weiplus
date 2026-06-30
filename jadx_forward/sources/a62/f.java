package a62;

/* loaded from: classes15.dex */
public abstract class f {
    public static org.json.JSONObject a(r45.lw3 lw3Var) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tbe", lw3Var.f461409d);
            long j17 = lw3Var.f461410e - lw3Var.f461409d;
            if (j17 <= 0) {
                j17 = 0;
            }
            jSONObject.put("in", j17);
            jSONObject.put("vv", "2.0");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellSessionReport", e17, "createJSONObjectHead, crash: %s", e17.getMessage());
            return null;
        }
    }

    public static void b(java.util.Map map) {
        java.util.List arrayList;
        r45.f16 a17 = x52.i.a("mmkv_key_hellSPMatchSuche_");
        if (a17 != null) {
            java.util.LinkedList linkedList = a17.f455463d;
            if (linkedList.isEmpty()) {
                return;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.e16 e16Var = (r45.e16) it.next();
                if (map.containsKey(java.lang.Long.valueOf(e16Var.f454445g))) {
                    arrayList = (java.util.List) map.get(java.lang.Long.valueOf(e16Var.f454445g));
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                } else {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(e16Var);
                map.put(java.lang.Long.valueOf(e16Var.f454445g), arrayList);
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
        java.lang.String g17 = b52.b.g(jw3Var.f459692d);
        if (g17 == null) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.g16 g16Var = (r45.g16) it.next();
            boolean z17 = true;
            r45.c16 c16Var = (r45.c16) g16Var.f456357f.get(g16Var.f456361m + 1);
            boolean equals = g17.equals(b52.b.g(c16Var.f452753d));
            java.util.LinkedList linkedList = g16Var.f456357f;
            boolean z18 = false;
            if (equals) {
                int i17 = g16Var.f456361m + 1;
                g16Var.f456361m = i17;
                if (i17 == linkedList.size() - 1) {
                    g16Var.f456361m = -1;
                } else {
                    z17 = false;
                }
                f(jw3Var, c16Var, g16Var.f456356e);
                java.util.Iterator it6 = jw3Var.f459696h.iterator();
                while (it6.hasNext()) {
                    r45.kw3 kw3Var = (r45.kw3) it6.next();
                    if (kw3Var != null) {
                        hashSet.add(kw3Var.f460533f);
                    }
                }
                z18 = z17;
            } else {
                r45.c16 c16Var2 = (r45.c16) linkedList.get(0);
                if (g17.equals(b52.b.g(c16Var2.f452753d))) {
                    g16Var.f456361m = 0;
                    f(jw3Var, c16Var2, g16Var.f456356e);
                } else {
                    g16Var.f456361m = -1;
                }
            }
            r45.e16 e16Var = new r45.e16();
            e16Var.f454442d = g16Var.f456361m;
            e16Var.f454443e = z18;
            long j17 = g16Var.f456356e;
            e16Var.f454445g = j17;
            e16Var.f454444f = jw3Var.f459695g;
            e16Var.f454448m = g16Var.f456359h;
            e16Var.f454446h = g16Var.f456358g;
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
                    hbVar.f457528d.addAll(d17);
                    x52.a.c(hbVar);
                }
            } else if (!hashSet.isEmpty()) {
                r45.hb hbVar2 = new r45.hb();
                hbVar2.f457528d.addAll(hashSet);
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
        java.util.Iterator it = jw3Var.f459699n.iterator();
        while (it.hasNext()) {
            r45.a07 a07Var = (r45.a07) it.next();
            if (a07Var != null) {
                r45.k44 k44Var = new r45.k44();
                k44Var.f459896d = j17;
                java.util.Iterator it6 = c16Var.f452755f.iterator();
                while (true) {
                    boolean hasNext = it6.hasNext();
                    linkedList = k44Var.f459897e;
                    if (!hasNext) {
                        break;
                    }
                    r45.b07 b07Var = (r45.b07) it6.next();
                    if (b07Var != null && (b07Var.f451950d.equals(a07Var.f451134d) || b07Var.f451955i.equals(a07Var.f451135e))) {
                        if (k52.q.f385859a.d(a07Var.f451138h, b07Var.f451956m)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellSessionReport", "recordRealDataPath: id=%s, res=%s", a07Var.f451134d, a07Var.f451135e);
                            a07Var.f451147t = false;
                            java.util.Iterator it7 = b07Var.f451954h.iterator();
                            while (it7.hasNext()) {
                                r45.b45 b45Var = (r45.b45) it7.next();
                                if (b45Var != null) {
                                    linkedList.add(b45Var.f452053e);
                                }
                            }
                        }
                    }
                }
                if (!linkedList.isEmpty()) {
                    a07Var.f451146s.add(k44Var);
                }
            }
        }
    }
}
