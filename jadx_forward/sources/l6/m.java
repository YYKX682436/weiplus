package l6;

/* loaded from: classes16.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static int f398272a;

    /* renamed from: b, reason: collision with root package name */
    public static int f398273b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f398274c;

    public static java.lang.String a(java.lang.String str) {
        n6.a aVar;
        java.util.ArrayList arrayList;
        try {
            aVar = e(str);
        } catch (java.lang.Exception unused) {
            aVar = null;
        }
        if (aVar == null || (arrayList = aVar.f416702b) == null || arrayList.size() == 0) {
            return "";
        }
        o6.a aVar2 = new o6.a();
        aVar2.f424706a = new o6.b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        aVar2.f424707b = arrayList2;
        o6.c cVar = new o6.c();
        cVar.f424709b = aVar.f416702b;
        cVar.f424708a = 0;
        arrayList2.add(cVar);
        return b(aVar2);
    }

    public static java.lang.String b(o6.a aVar) {
        try {
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            jSONStringer.object();
            org.json.JSONStringer key = jSONStringer.key("Metadata").object().key("Created");
            aVar.f424706a.getClass();
            org.json.JSONStringer key2 = key.value("2021-01-01").key("Description");
            aVar.f424706a.getClass();
            org.json.JSONStringer key3 = key2.value("game haptic").key("Version");
            aVar.f424706a.getClass();
            key3.value(2).endObject();
            jSONStringer.key("PatternList").array();
            java.util.Iterator it = aVar.f424707b.iterator();
            while (it.hasNext()) {
                o6.c cVar = (o6.c) it.next();
                jSONStringer.object().key("AbsoluteTime").value(cVar.f424708a).key("Pattern").array();
                java.util.Iterator it6 = cVar.f424709b.iterator();
                while (it6.hasNext()) {
                    m6.e eVar = (m6.e) it6.next();
                    jSONStringer.object();
                    jSONStringer.key("Event").object().key("Index").value(eVar.f405882a.f405877d).key("RelativeTime").value(eVar.f405882a.f405875b).key("Type").value(eVar.f405882a.f405874a);
                    if ("continuous".equals(eVar.f405882a.f405874a)) {
                        jSONStringer.key("Duration").value(eVar.f405882a.f405876c);
                    }
                    jSONStringer.key("Parameters").object().key("Frequency").value(eVar.f405882a.f405878e.f405880b).key("Intensity").value(eVar.f405882a.f405878e.f405879a);
                    if ("continuous".equals(eVar.f405882a.f405874a)) {
                        jSONStringer.key("Curve").array();
                        java.util.Iterator it7 = eVar.f405882a.f405878e.f405881c.iterator();
                        while (it7.hasNext()) {
                            jSONStringer.object().key("Frequency").value(r6.f405873c).key("Intensity").value(((m6.a) it7.next()).f405872b).key("Time").value(r6.f405871a).endObject();
                        }
                        jSONStringer.endArray();
                    }
                    jSONStringer.endObject().endObject().endObject();
                }
                jSONStringer.endArray().endObject();
            }
            jSONStringer.endArray().endObject();
            return jSONStringer.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String c(java.lang.String str, int i17) {
        n6.a aVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i18;
        int i19 = i(str);
        int i27 = -1;
        o6.a aVar2 = null;
        java.lang.String str2 = null;
        if (i19 != 1) {
            if (i19 != 2) {
                return "";
            }
            try {
                aVar2 = f(str);
            } catch (java.lang.Exception unused) {
            }
            if (aVar2 == null || (arrayList2 = aVar2.f424707b) == null || arrayList2.size() == 0) {
                return "";
            }
            java.util.Iterator it = aVar2.f424707b.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                o6.c cVar = (o6.c) it.next();
                java.util.ArrayList arrayList3 = cVar.f424709b;
                if (arrayList3 != null) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        m6.e eVar = (m6.e) it6.next();
                        m6.b bVar = eVar.f405882a;
                        if (bVar != null && bVar.f405875b + cVar.f424708a >= i17) {
                            int indexOf = cVar.f424709b.indexOf(eVar);
                            i27 = aVar2.f424707b.indexOf(cVar);
                            i18 = indexOf;
                            break loop0;
                        }
                    }
                }
            }
            if (i27 < 0 || i18 < 0) {
                return "";
            }
            aVar2.f424707b.subList(0, i27).clear();
            ((o6.c) aVar2.f424707b.get(0)).f424709b.subList(0, i18).clear();
            java.util.Iterator it7 = aVar2.f424707b.iterator();
            while (it7.hasNext()) {
                o6.c cVar2 = (o6.c) it7.next();
                java.util.ArrayList arrayList4 = cVar2.f424709b;
                if (arrayList4 != null) {
                    int i28 = cVar2.f424708a;
                    if (i28 < i17) {
                        java.util.Iterator it8 = arrayList4.iterator();
                        while (it8.hasNext()) {
                            m6.b bVar2 = ((m6.e) it8.next()).f405882a;
                            if (bVar2 != null) {
                                bVar2.f405875b = (bVar2.f405875b + cVar2.f424708a) - i17;
                            }
                        }
                        cVar2.f424708a = 0;
                    } else {
                        cVar2.f424708a = i28 - i17;
                    }
                }
            }
            return b(aVar2);
        }
        try {
            aVar = e(str);
        } catch (java.lang.Exception unused2) {
            aVar = null;
        }
        if (aVar == null || (arrayList = aVar.f416702b) == null || arrayList.size() == 0) {
            return "";
        }
        java.util.Iterator it9 = aVar.f416702b.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            m6.e eVar2 = (m6.e) it9.next();
            m6.b bVar3 = eVar2.f405882a;
            if (bVar3 != null && bVar3.f405875b >= i17) {
                i27 = aVar.f416702b.indexOf(eVar2);
                break;
            }
        }
        if (i27 < 0) {
            return "";
        }
        aVar.f416702b.subList(0, i27).clear();
        java.util.Iterator it10 = aVar.f416702b.iterator();
        while (it10.hasNext()) {
            m6.b bVar4 = ((m6.e) it10.next()).f405882a;
            if (bVar4 != null) {
                bVar4.f405875b -= i17;
            }
        }
        try {
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            jSONStringer.object();
            org.json.JSONStringer key = jSONStringer.key("Metadata").object().key("Created");
            aVar.f416701a.getClass();
            org.json.JSONStringer key2 = key.value("2021-01-01").key("Description");
            aVar.f416701a.getClass();
            org.json.JSONStringer key3 = key2.value("game haptic").key("Version");
            aVar.f416701a.getClass();
            key3.value(1).endObject();
            jSONStringer.key("Pattern").array();
            java.util.Iterator it11 = aVar.f416702b.iterator();
            while (it11.hasNext()) {
                m6.e eVar3 = (m6.e) it11.next();
                jSONStringer.object();
                jSONStringer.key("Event").object().key("Type").value(eVar3.f405882a.f405874a).key("RelativeTime").value(eVar3.f405882a.f405875b);
                if ("continuous".equals(eVar3.f405882a.f405874a)) {
                    jSONStringer.key("Duration").value(eVar3.f405882a.f405876c);
                }
                jSONStringer.key("Parameters").object().key("Frequency").value(eVar3.f405882a.f405878e.f405880b).key("Intensity").value(eVar3.f405882a.f405878e.f405879a);
                if ("continuous".equals(eVar3.f405882a.f405874a)) {
                    jSONStringer.key("Curve").array();
                    java.util.Iterator it12 = eVar3.f405882a.f405878e.f405881c.iterator();
                    while (it12.hasNext()) {
                        jSONStringer.object().key("Frequency").value(r5.f405873c).key("Intensity").value(((m6.a) it12.next()).f405872b).key("Time").value(r5.f405871a).endObject();
                    }
                    jSONStringer.endArray();
                }
                jSONStringer.endObject().endObject().endObject();
            }
            jSONStringer.endArray().endObject();
            str2 = jSONStringer.toString();
        } catch (java.lang.Exception unused3) {
        }
        return str2;
    }

    public static int d(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        m6.c g17 = g(str);
        if (p6.a.a(g17)) {
            return g17.mo146856x51e8b0a();
        }
        return 0;
    }

    public static n6.a e(java.lang.String str) {
        if (1 != i(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            n6.a aVar = new n6.a();
            aVar.f416701a = new n6.b();
            aVar.f416702b = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Pattern");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i17);
                m6.e eVar = new m6.e();
                eVar.f405882a = new m6.b();
                org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject("Event");
                eVar.f405882a.f405874a = jSONObject3.getString("Type");
                if ("continuous".equals(eVar.f405882a.f405874a)) {
                    eVar.f405882a.f405876c = jSONObject3.getInt("Duration");
                }
                eVar.f405882a.f405875b = jSONObject3.getInt("RelativeTime");
                org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("Parameters");
                m6.b bVar = eVar.f405882a;
                m6.d dVar = new m6.d();
                bVar.f405878e = dVar;
                dVar.f405880b = jSONObject4.getInt("Frequency");
                eVar.f405882a.f405878e.f405879a = jSONObject4.getInt("Intensity");
                eVar.f405882a.f405878e.f405881c = new java.util.ArrayList();
                if ("continuous".equals(eVar.f405882a.f405874a)) {
                    org.json.JSONArray jSONArray2 = jSONObject4.getJSONArray("Curve");
                    for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                        org.json.JSONObject jSONObject5 = (org.json.JSONObject) jSONArray2.get(i18);
                        m6.a aVar2 = new m6.a();
                        aVar2.f405873c = jSONObject5.getInt("Frequency");
                        aVar2.f405872b = jSONObject5.getDouble("Intensity");
                        aVar2.f405871a = jSONObject5.getInt("Time");
                        eVar.f405882a.f405878e.f405881c.add(aVar2);
                    }
                }
                aVar.f416702b.add(eVar);
            }
            return aVar;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static o6.a f(java.lang.String str) {
        o6.a aVar = null;
        if (2 != i(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            o6.a aVar2 = new o6.a();
            aVar2.f424706a = new o6.b();
            aVar2.f424707b = new java.util.ArrayList();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("PatternList");
            int i17 = 0;
            while (i17 < jSONArray.length()) {
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) jSONArray.get(i17);
                o6.c cVar = new o6.c();
                cVar.f424708a = jSONObject2.getInt("AbsoluteTime");
                cVar.f424709b = new java.util.ArrayList();
                org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("Pattern");
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    org.json.JSONObject jSONObject3 = (org.json.JSONObject) jSONArray2.get(i18);
                    m6.e eVar = new m6.e();
                    eVar.f405882a = new m6.b();
                    org.json.JSONObject jSONObject4 = jSONObject3.getJSONObject("Event");
                    eVar.f405882a.f405874a = jSONObject4.getString("Type");
                    if ("continuous".equals(eVar.f405882a.f405874a)) {
                        eVar.f405882a.f405876c = jSONObject4.getInt("Duration");
                    }
                    eVar.f405882a.f405875b = jSONObject4.getInt("RelativeTime");
                    eVar.f405882a.f405877d = jSONObject4.getInt("Index");
                    org.json.JSONObject jSONObject5 = jSONObject4.getJSONObject("Parameters");
                    m6.b bVar = eVar.f405882a;
                    m6.d dVar = new m6.d();
                    bVar.f405878e = dVar;
                    dVar.f405880b = jSONObject5.getInt("Frequency");
                    eVar.f405882a.f405878e.f405879a = jSONObject5.getInt("Intensity");
                    eVar.f405882a.f405878e.f405881c = new java.util.ArrayList();
                    if ("continuous".equals(eVar.f405882a.f405874a)) {
                        org.json.JSONArray jSONArray3 = jSONObject5.getJSONArray("Curve");
                        for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                            org.json.JSONObject jSONObject6 = (org.json.JSONObject) jSONArray3.get(i19);
                            m6.a aVar3 = new m6.a();
                            aVar3.f405873c = jSONObject6.getInt("Frequency");
                            try {
                                aVar3.f405872b = jSONObject6.getDouble("Intensity");
                                aVar3.f405871a = jSONObject6.getInt("Time");
                                eVar.f405882a.f405878e.f405881c.add(aVar3);
                            } catch (java.lang.Exception unused) {
                                return null;
                            }
                        }
                    }
                    cVar.f424709b.add(eVar);
                }
                aVar2.f424707b.add(cVar);
                i17++;
                aVar = null;
            }
            return aVar2;
        } catch (java.lang.Exception unused2) {
            return aVar;
        }
    }

    public static m6.c g(java.lang.String str) {
        int i17 = i(str);
        if (i17 == 1) {
            try {
                return e(str);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        if (i17 != 2) {
            return null;
        }
        try {
            return f(str);
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public static java.lang.String h(java.io.File file) {
        if (file == null || !file.exists()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb6.append(readLine);
                    } catch (java.lang.Exception unused) {
                        bufferedReader = bufferedReader2;
                        bufferedReader.close();
                        return sb6.toString();
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        try {
                            bufferedReader.close();
                        } catch (java.lang.Exception unused2) {
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (java.lang.Exception unused3) {
            }
        } catch (java.lang.Exception unused4) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        return sb6.toString();
    }

    public static int i(java.lang.String str) {
        try {
            return new org.json.JSONObject(str).getJSONObject("Metadata").getInt("Version");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static java.lang.String j(java.lang.String str) {
        o6.a aVar;
        o6.a aVar2;
        try {
            aVar = f(str);
        } catch (java.lang.Exception unused) {
            aVar = null;
        }
        if (!p6.a.a(aVar)) {
            return "";
        }
        java.util.Iterator it = aVar.f424707b.iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((o6.c) it.next()).f424709b.iterator();
            while (it6.hasNext()) {
                m6.e eVar = (m6.e) it6.next();
                m6.d dVar = eVar.f405882a.f405878e;
                java.util.ArrayList arrayList = dVar.f405881c;
                if (arrayList == null || arrayList.size() == 0) {
                    aVar2 = aVar;
                    arrayList = null;
                } else {
                    int size = arrayList.size();
                    if (size <= 0 || size > 4) {
                        m6.a aVar3 = new m6.a();
                        int i17 = size - 2;
                        int i18 = i17 / 2;
                        int i19 = 1;
                        while (i19 <= i18) {
                            aVar3.f405871a += ((m6.a) arrayList.get(i19)).f405871a;
                            aVar3.f405872b += ((m6.a) arrayList.get(i19)).f405872b;
                            aVar3.f405873c += ((m6.a) arrayList.get(i19)).f405873c;
                            i19++;
                            aVar = aVar;
                        }
                        aVar2 = aVar;
                        aVar3.f405871a /= i18;
                        aVar3.f405872b = aVar3.f405872b / i18;
                        aVar3.f405872b = java.lang.Math.round(r0 * 10.0d) / 10.0d;
                        aVar3.f405873c /= i18;
                        m6.a aVar4 = new m6.a();
                        for (int i27 = i18 + 1; i27 <= i17; i27++) {
                            aVar4.f405871a += ((m6.a) arrayList.get(i27)).f405871a;
                            aVar4.f405872b += ((m6.a) arrayList.get(i27)).f405872b;
                            aVar4.f405873c += ((m6.a) arrayList.get(i27)).f405873c;
                        }
                        int i28 = i17 - i18;
                        aVar4.f405871a /= i28;
                        aVar4.f405872b = aVar4.f405872b / i28;
                        aVar4.f405872b = java.lang.Math.round(r10 * 10.0d) / 10.0d;
                        aVar4.f405873c /= i28;
                        arrayList.subList(1, size - 1).clear();
                        arrayList.add(1, aVar3);
                        arrayList.add(2, aVar4);
                    } else {
                        aVar2 = aVar;
                    }
                }
                dVar.f405881c = arrayList;
                if (eVar.f405882a.f405874a.equals("transient")) {
                    m6.d dVar2 = eVar.f405882a.f405878e;
                    int i29 = dVar2.f405880b;
                    if (i29 < 0) {
                        dVar2.f405880b = 0;
                    } else if (i29 > 100) {
                        dVar2.f405880b = 100;
                    }
                }
                aVar = aVar2;
            }
        }
        return b(aVar);
    }

    public static java.lang.String k(java.lang.String str) {
        int i17;
        if (2 != i(str)) {
            return null;
        }
        o6.a f17 = f(str);
        if (!p6.a.a(f17)) {
            return null;
        }
        for (int i18 = 0; i18 <= 2; i18++) {
            java.util.Iterator it = f17.f424707b.iterator();
            while (it.hasNext()) {
                o6.c cVar = (o6.c) it.next();
                if (cVar.f424709b.size() > 1) {
                    int i19 = 0;
                    for (int i27 = 0; i27 < cVar.f424709b.size(); i27++) {
                        m6.b bVar = ((m6.e) cVar.f424709b.get(i27)).f405882a;
                        if (bVar != null && bVar.f405877d == i18) {
                            int i28 = bVar.f405875b;
                            int i29 = bVar.f405874a.equals("continuous") ? bVar.f405876c + i28 : i28 + 22;
                            if (i28 < i19) {
                                ((m6.e) cVar.f424709b.get(i27)).f405882a.f405875b = -1;
                            } else {
                                i19 = i29;
                            }
                        }
                    }
                    java.util.Iterator it6 = cVar.f424709b.iterator();
                    while (it6.hasNext()) {
                        if (((m6.e) it6.next()).f405882a.f405875b < 0) {
                            it6.remove();
                        }
                    }
                }
            }
        }
        for (int i37 = 1; i37 <= 2; i37++) {
            java.util.Iterator it7 = f17.f424707b.iterator();
            while (it7.hasNext()) {
                o6.c cVar2 = (o6.c) it7.next();
                if (cVar2.f424709b.size() > 1) {
                    int i38 = 0;
                    for (int i39 = 0; i39 < cVar2.f424709b.size(); i39++) {
                        m6.b bVar2 = ((m6.e) cVar2.f424709b.get(i39)).f405882a;
                        if (bVar2 != null && ((i17 = bVar2.f405877d) == i37 || i17 == 0)) {
                            int i47 = bVar2.f405875b;
                            int i48 = bVar2.f405874a.equals("continuous") ? bVar2.f405876c + i47 : i47 + 22;
                            if (i47 < i38) {
                                ((m6.e) cVar2.f424709b.get(i39)).f405882a.f405875b = -1;
                            } else {
                                i38 = i48;
                            }
                        }
                    }
                    java.util.Iterator it8 = cVar2.f424709b.iterator();
                    while (it8.hasNext()) {
                        if (((m6.e) it8.next()).f405882a.f405875b < 0) {
                            it8.remove();
                        }
                    }
                }
            }
        }
        return b(f17);
    }
}
