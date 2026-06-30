package n81;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n81.o f417160d = new n81.o();

    public o() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.String str;
        java.lang.Iterable s17;
        java.lang.Iterable s18;
        java.lang.Iterable s19;
        java.lang.String Ai;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s27;
        n81.e it = (n81.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        n81.p pVar = n81.p.f417161a;
        long j17 = it.f417148b;
        gm0.m b17 = gm0.j1.b();
        java.lang.String j18 = b17 != null ? b17.j() : null;
        if (j18 == null) {
            j18 = "";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str2 = it.f417147a;
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.f(str2).f157809e;
        if (str3 != null && (s27 = com.p314xaae8f345.mm.vfs.w6.s(str3, false)) != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s27) {
                java.lang.String name = x1Var.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                boolean z18 = (r26.i0.n(name, ".data", false) || r26.i0.y(name, "store_", false) || r26.i0.n(name, ".nomedia", false)) ? false : true;
                java.lang.String str4 = x1Var.f294765b;
                if (z18) {
                    n81.p.c(linkedHashMap, "fsTmp", pVar.e(str3) + str4);
                } else {
                    n81.p.c(linkedHashMap, "fsStore", pVar.e(str3) + str4);
                }
            }
        }
        java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.i(j18, str2).f157758d;
        if (str5 != null && com.p314xaae8f345.mm.vfs.w6.j(str5)) {
            n81.p.c(linkedHashMap, "fsUsr", str5);
        }
        java.lang.String str6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.j(j18, str2).f157758d;
        if (str6 != null && com.p314xaae8f345.mm.vfs.w6.j(str6)) {
            n81.p.c(linkedHashMap, "fsOther", str6);
        }
        java.lang.String str7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.k(j18, str2).f157758d;
        if (str7 != null && com.p314xaae8f345.mm.vfs.w6.j(str7)) {
            n81.p.c(linkedHashMap, "fsOther", str7);
        }
        java.lang.String str8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.c(j18, str2).f157758d;
        if (str8 != null && com.p314xaae8f345.mm.vfs.w6.j(str8)) {
            n81.p.c(linkedHashMap, "fsOther", str8);
        }
        java.lang.String str9 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.l(j18, str2).f157758d;
        if (str9 != null && com.p314xaae8f345.mm.vfs.w6.j(str9)) {
            n81.p.c(linkedHashMap, "fsOther", str9);
        }
        java.lang.String mo46934x5b018e86 = com.p314xaae8f345.mm.p874xaefb6cc9.j1.f150617a.mo46934x5b018e86(str2);
        if (mo46934x5b018e86 != null && com.p314xaae8f345.mm.vfs.w6.j(mo46934x5b018e86)) {
            n81.p.c(linkedHashMap, "vaGame", mo46934x5b018e86);
        }
        j81.k kVar = (j81.k) i95.n0.c(j81.k.class);
        if (kVar != null && (Ai = ((k81.a) kVar).Ai(str2)) != null && pVar.j(Ai)) {
            n81.p.c(linkedHashMap, "xnetModel", Ai);
        }
        java.lang.String str10 = new te.a(j18, str2).f499297d;
        if (str10 != null && pVar.j(str10)) {
            n81.p.c(linkedHashMap, "wxAudio", str10);
        }
        java.lang.String a17 = ri1.q.a(str2);
        if (a17 != null && pVar.j(a17)) {
            n81.p.c(linkedHashMap, "renderCache", a17);
        }
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a();
        if (!(a18 == null || a18.length() == 0) && (s19 = com.p314xaae8f345.mm.vfs.w6.s(a18, false)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : s19) {
                java.lang.String name2 = ((com.p314xaae8f345.mm.vfs.x1) obj2).f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "name");
                if (r26.n0.B(name2, str2, false)) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                n81.p.c(linkedHashMap, "codeCache", pVar.e(a18) + ((com.p314xaae8f345.mm.vfs.x1) it6.next()).f294765b);
            }
        }
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.c();
        if (!(c17 == null || c17.length() == 0) && (s18 = com.p314xaae8f345.mm.vfs.w6.s(c17, false)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : s18) {
                java.lang.String name3 = ((com.p314xaae8f345.mm.vfs.x1) obj3).f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "name");
                if (r26.n0.B(name3, str2, false)) {
                    arrayList2.add(obj3);
                }
            }
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                n81.p.c(linkedHashMap, "codeCache", pVar.e(c17) + ((com.p314xaae8f345.mm.vfs.x1) it7.next()).f294765b);
            }
        }
        java.lang.String c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sb.f168623c.c();
        if (!(c18 == null || c18.length() == 0) && (s17 = com.p314xaae8f345.mm.vfs.w6.s(c18, false)) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : s17) {
                java.lang.String name4 = ((com.p314xaae8f345.mm.vfs.x1) obj4).f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name4, "name");
                if (r26.n0.B(name4, str2, false)) {
                    arrayList3.add(obj4);
                }
            }
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                n81.p.c(linkedHashMap, "pagesScript", pVar.e(c18) + ((com.p314xaae8f345.mm.vfs.x1) it8.next()).f294765b);
            }
        }
        java.lang.String a19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a();
        if (!(a19 == null || a19.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a19);
            sb6.append(pVar.e(a19));
            sb6.append(str2);
            java.lang.String sb7 = sb6.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                n81.p.c(linkedHashMap, "wasmCache", sb7);
            }
        }
        java.lang.String a27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a();
        if (!(a27 == null || a27.length() == 0)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a27);
            sb8.append(pVar.e(a27));
            sb8.append(str2);
            java.lang.String sb9 = sb8.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb9)) {
                n81.p.c(linkedHashMap, "shaderCache", sb9);
            }
        }
        java.lang.String g17 = pVar.g();
        java.lang.Iterable s28 = com.p314xaae8f345.mm.vfs.w6.s(g17, false);
        if (s28 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj5 : s28) {
                java.lang.String name5 = ((com.p314xaae8f345.mm.vfs.x1) obj5).f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name5, "name");
                if (r26.n0.B(name5, str2, false)) {
                    arrayList4.add(obj5);
                }
            }
            java.util.Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                n81.p.c(linkedHashMap, "pagesIdx", pVar.e(g17) + ((com.p314xaae8f345.mm.vfs.x1) it9.next()).f294765b);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        if (Di != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var : Di.n(str2)) {
                java.lang.String str11 = n9Var != null ? n9Var.f67183x55b471cc : null;
                if (str11 != null && com.p314xaae8f345.mm.vfs.w6.j(str11) && r26.n0.B(str11, "appbrand/pkg/general/", false)) {
                    if (!((n9Var == null || (str = n9Var.f67177x28d45f97) == null) ? false : r26.i0.n(str, "$__PLUGINCODE__", false))) {
                        if ((n9Var != null ? n9Var.f67177x28d45f97 : null) != null) {
                            java.util.LinkedHashSet<java.lang.String> linkedHashSet = new java.util.LinkedHashSet();
                            linkedHashSet.addAll(k91.e3.f387104b);
                            i95.m c19 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c19, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
                            java.util.List wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.f1) c19).wi();
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(wi6, 10));
                            java.util.Iterator it10 = wi6.iterator();
                            while (it10.hasNext()) {
                                arrayList5.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4.c1) it10.next()).f157313d);
                            }
                            linkedHashSet.addAll(arrayList5);
                            for (java.lang.String str12 : linkedHashSet) {
                                java.lang.String field_appId = n9Var.f67177x28d45f97;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
                                if (r26.n0.B(field_appId, str12, false)) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        z17 = false;
                        if (!z17) {
                            n81.p.c(linkedHashMap, "releasePkg", str11);
                        }
                    }
                }
            }
        }
        java.util.List r17 = kz5.d0.r(linkedHashMap.values());
        if (((java.util.ArrayList) r17).isEmpty()) {
            return null;
        }
        n81.h hVar = new n81.h(str2, r17);
        int i17 = it.f417149c;
        return new n81.d(str2, i17 != 4 ? i17 != 7 ? 2 : 8 : 4, j17, r17, linkedHashMap, new n81.f(r17), new n81.g(linkedHashMap), hVar);
    }
}
