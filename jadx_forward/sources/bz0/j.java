package bz0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f118285c;

    /* renamed from: l, reason: collision with root package name */
    public static bz0.h f118294l;

    /* renamed from: a, reason: collision with root package name */
    public static final bz0.j f118283a = new bz0.j();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6711x3736c3bf f118284b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6711x3736c3bf();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f118286d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.TreeMap f118287e = new java.util.TreeMap();

    /* renamed from: f, reason: collision with root package name */
    public static java.util.List f118288f = kz5.p0.f395529d;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f118289g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f118290h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f118291i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f118292j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f118293k = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.List f118295m = new java.util.ArrayList();

    public static final void e(org.json.JSONObject jSONObject, java.lang.String str, java.util.Collection collection) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        jSONObject.put(str, jSONArray);
    }

    public final void a(java.lang.String templateId, java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        java.util.List list = f118291i;
        bz0.i iVar = (bz0.i) kz5.n0.k0(list);
        if (iVar != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f118281a, templateId)) {
                iVar = null;
            }
            if (iVar != null) {
                java.util.List list2 = iVar.f118282b;
                if (list2.contains(musicId)) {
                    return;
                }
                list2.add(musicId);
                return;
            }
        }
        ((java.util.ArrayList) list).add(new bz0.i(templateId, kz5.c0.k(musicId)));
    }

    public final void b(java.lang.String templateId, java.lang.String str) {
        bz0.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        if (str == null) {
            return;
        }
        java.util.List list = f118292j;
        java.util.List list2 = (java.util.List) kz5.n0.k0(list);
        if (list2 != null && (gVar = (bz0.g) kz5.n0.k0(list2)) != null) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f118272a, templateId)) {
                gVar = null;
            }
            if (gVar != null) {
                java.util.List list3 = (java.util.List) kz5.n0.k0(list);
                if ((list3 != null ? java.lang.Boolean.valueOf(list3.add(new bz0.g(templateId, str, null, null, null, 28, null))) : null) != null) {
                    return;
                }
            }
        }
        ((java.util.ArrayList) list).add(kz5.c0.k(new bz0.g(templateId, str, null, null, null, 28, null)));
    }

    public final void c(int i17) {
        if (!f118285c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasReport25621", "has not started");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasReport25621", "report");
        f118285c = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6711x3736c3bf c6711x3736c3bf = f118284b;
        c6711x3736c3bf.f140523n = c6711x3736c3bf.b("editres", i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "exit" : "editmore" : "save", true);
        java.util.ArrayList arrayList = (java.util.ArrayList) f118289g;
        boolean z17 = !arrayList.isEmpty();
        java.util.List list = f118290h;
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tid", str);
                jSONObject.put("src", 4);
                arrayList2.add(jSONObject);
            }
            arrayList.addAll(arrayList2);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                jSONArray.put((org.json.JSONObject) it6.next());
            }
            java.lang.String jSONArray2 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
            c6711x3736c3bf.f140518i = c6711x3736c3bf.b("recids", r26.i0.t(jSONArray2, ",", ";", false), true);
        }
        bz0.j jVar = f118283a;
        java.util.List list2 = f118286d;
        c6711x3736c3bf.f140519j = c6711x3736c3bf.b("exposeids", jVar.f(list2), true);
        java.util.TreeMap treeMap = f118287e;
        java.util.Collection values = treeMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        c6711x3736c3bf.B = c6711x3736c3bf.b("double_exposeids", jVar.f(values), true);
        c6711x3736c3bf.A = c6711x3736c3bf.b("maasSessionKey", bz0.a.f118255a, true);
        c6711x3736c3bf.k();
        f118288f = kz5.p0.f395529d;
        ((java.util.ArrayList) list2).clear();
        treeMap.clear();
        ((java.util.ArrayList) f118291i).clear();
        arrayList.clear();
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) f118295m).clear();
        ((java.util.ArrayList) f118292j).clear();
        ((java.util.LinkedHashMap) f118293k).clear();
    }

    public final java.lang.String d(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ig.w wVar = (ig.w) obj;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("tid", wVar.mo136250x77f4cc67());
            java.lang.Object obj2 = (java.lang.String) ((java.util.LinkedHashMap) f118293k).get(wVar.mo136250x77f4cc67());
            if (obj2 == null) {
                obj2 = "";
            }
            jSONObject.put("mrid", obj2);
            bz0.i iVar = (bz0.i) kz5.n0.a0(f118291i, i17);
            if (iVar != null) {
                bz0.i iVar2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f118281a, wVar.mo136250x77f4cc67()) ? iVar : null;
                if (iVar2 != null) {
                    e(jSONObject, "esids", iVar2.f118282b);
                }
            }
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.List list2 = (java.util.List) kz5.n0.a0(f118292j, i17);
            if (list2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list2) {
                    bz0.g gVar = (bz0.g) obj3;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f118272a, wVar.mo136250x77f4cc67()) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f118273b)) {
                        arrayList.add(obj3);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bz0.g gVar2 = (bz0.g) it.next();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("query", gVar2.f118273b);
                    java.util.List list3 = gVar2.f118276e;
                    java.lang.String str = (java.lang.String) kz5.n0.k0(list3);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject2.put("chsid", str);
                    e(jSONObject2, "sesids", gVar2.f118274c);
                    e(jSONObject2, "sesnames", gVar2.f118275d);
                    e(jSONObject2, "clksids", list3);
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("sacts", jSONArray2);
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            java.util.List<ig.s> mo136246xcb24ef4c = wVar.mo136246xcb24ef4c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136246xcb24ef4c, "getMusicActionsList(...)");
            for (ig.s sVar : mo136246xcb24ef4c) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54540x542b1a21, sVar.mo136017x52b1322e());
                jSONObject3.put("videolen", sVar.mo136022xa3e6b771());
                jSONObject3.put("staytime", sVar.mo136016x73a26f8c());
                ig.p mo136021xb4914808 = sVar.mo136021xb4914808();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136021xb4914808, "getPreviewMusicSourceType(...)");
                int ordinal = mo136021xb4914808.ordinal();
                jSONObject3.put("song_source", ordinal != 0 ? (ordinal == 1 || ordinal != 3) ? 2 : 1 : 0);
                jSONObject3.put("song_name", sVar.mo136019x59181c13());
                jSONArray3.put(jSONObject3);
            }
            jSONObject.put("musicseq", jSONArray3);
            jSONArray.put(jSONObject);
            i17 = i18;
        }
        java.lang.String jSONArray4 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray4, "toString(...)");
        return r26.i0.t(jSONArray4, ",", ";", false);
    }

    public final java.lang.String f(java.util.Collection collection) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        return r26.i0.t(jSONArray2, ",", ";", false);
    }
}
