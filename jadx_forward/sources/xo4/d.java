package xo4;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final xo4.d f537303a = new xo4.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f537304b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Integer[] f537305c = {1, 2};

    public final uo4.f a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 it) {
        uo4.f fVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.f257150b;
        rm5.j jVar = it.f257160l;
        if (i17 == 2) {
            uo4.g gVar = new uo4.g();
            gVar.f511222f = jVar.f479039h;
            e(gVar, it.f257149a);
            fVar = gVar;
        } else if (i17 == 1) {
            uo4.f eVar = new uo4.e();
            java.util.ArrayList arrayList3 = eVar.f511218b;
            arrayList3.add(java.lang.Integer.valueOf(it.f257154f));
            arrayList3.add(java.lang.Integer.valueOf(it.f257155g));
            fVar = eVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.f511217a = i17;
        }
        if (fVar != null && (arrayList2 = fVar.f511219c) != null) {
            arrayList2.add(java.lang.Long.valueOf(jVar.f479035d));
        }
        if (fVar != null && (arrayList = fVar.f511219c) != null) {
            arrayList.add(java.lang.Long.valueOf(jVar.f479036e));
        }
        return fVar;
    }

    public final void b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = f537304b;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596 c6996x71e99596 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596) hashMap.get(key);
        if (c6996x71e99596 != null) {
            c6996x71e99596.k();
        }
        hashMap.remove(key);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionPerformance", "do report key:".concat(key));
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596 c(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.HashMap hashMap = f537304b;
        if (!hashMap.containsKey(key)) {
            hashMap.put(key, new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596());
            java.lang.Object obj = hashMap.get(key);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596 c6996x71e99596 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596) obj;
            c6996x71e99596.f143102k = c6996x71e99596.b("EditId", key, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCompositionPerformance", "getReportStruct: create ".concat(key));
            java.lang.Object obj2 = hashMap.get(key);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        }
        java.lang.Object obj3 = hashMap.get(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
        return (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596) obj3;
    }

    public final void d(java.lang.String key, java.lang.String str) {
        qc0.d1 c17;
        java.lang.String m69267x9616526c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596 c18 = c(key);
        if (str == null || !com.p314xaae8f345.mm.vfs.w6.j(str) || (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.c(str, false)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = c17.f442907l;
        c18.f143101j = c18.b("OutputMediaInfo", (bVar == null || (m69267x9616526c = bVar.m69267x9616526c()) == null) ? null : r26.i0.t(m69267x9616526c, ",", ";", false), true);
        c18.f143099h = c17.f442898c;
        c18.f143105n = c17.f442899d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c17.f442896a / 100);
        sb6.append('x');
        sb6.append(c17.f442897b / 100);
        c18.f143100i = c18.b("OutputVideoResolution", sb6.toString(), true);
    }

    public final void e(uo4.g gVar, java.lang.String str) {
        qc0.d1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.c(str, true);
        if (c17 != null) {
            gVar.f511221e = c17.f442900e;
            gVar.f511220d = c17.f442898c;
            gVar.f511223g = c17.f442905j;
            gVar.f511224h = c17.f442903h;
            gVar.f511233q = c17.f442899d;
            java.util.ArrayList arrayList = gVar.f511218b;
            arrayList.add(java.lang.Integer.valueOf(c17.f442896a));
            arrayList.add(java.lang.Integer.valueOf(c17.f442897b));
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = c17.f442907l;
            java.lang.String str2 = bVar != null ? bVar.f243931q : null;
            if (str2 == null) {
                str2 = "";
            }
            gVar.f511228l = str2;
            java.lang.String str3 = bVar != null ? bVar.f243932r : null;
            if (str3 == null) {
                str3 = "";
            }
            gVar.f511227k = str3;
            java.lang.String str4 = bVar != null ? bVar.f243934t : null;
            if (str4 == null) {
                str4 = "";
            }
            gVar.f511229m = str4;
            java.lang.String str5 = bVar != null ? bVar.f243933s : null;
            if (str5 == null) {
                str5 = "";
            }
            gVar.f511230n = str5;
            gVar.f511237u = bVar != null && bVar.f243938x;
            gVar.f511236t = bVar != null && bVar.f243937w;
            java.lang.String str6 = bVar != null ? bVar.f243936v : null;
            if (str6 == null) {
                str6 = "";
            }
            gVar.f511231o = str6;
            java.lang.String str7 = bVar != null ? bVar.f243935u : null;
            if (str7 == null) {
                str7 = "";
            }
            gVar.f511232p = str7;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b Ai = ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Ai(str);
            if (Ai == null) {
                return;
            }
            gVar.f511221e = Ai.f243916b;
            gVar.f511220d = Ai.f243919e;
            gVar.f511223g = Ai.f243922h;
            gVar.f511224h = Ai.f243921g;
            gVar.f511233q = Ai.f243915a;
            java.util.ArrayList arrayList2 = gVar.f511218b;
            arrayList2.add(java.lang.Integer.valueOf(Ai.f243917c));
            arrayList2.add(java.lang.Integer.valueOf(Ai.f243918d));
            java.lang.String str8 = Ai.f243931q;
            if (str8 == null) {
                str8 = "";
            }
            gVar.f511228l = str8;
            java.lang.String str9 = Ai.f243932r;
            if (str9 == null) {
                str9 = "";
            }
            gVar.f511227k = str9;
            java.lang.String str10 = Ai.f243934t;
            if (str10 == null) {
                str10 = "";
            }
            gVar.f511229m = str10;
            java.lang.String str11 = Ai.f243933s;
            if (str11 == null) {
                str11 = "";
            }
            gVar.f511230n = str11;
            gVar.f511237u = Ai.f243938x;
            gVar.f511236t = Ai.f243937w;
            java.lang.String str12 = Ai.f243936v;
            if (str12 == null) {
                str12 = "";
            }
            gVar.f511231o = str12;
            java.lang.String str13 = Ai.f243935u;
            if (str13 == null) {
                str13 = "";
            }
            gVar.f511232p = str13;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            hs0.a aVar = new hs0.a(str);
            java.lang.String b17 = aVar.b();
            if (b17 == null) {
                b17 = "";
            }
            gVar.getClass();
            gVar.f511225i = b17;
            android.media.MediaFormat mediaFormat = aVar.f366085f;
            java.lang.String string = mediaFormat != null ? mediaFormat.getString("mime") : null;
            gVar.f511226j = string != null ? string : "";
            aVar.d();
        }
    }
}
