package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.b2 f294340a = new com.p314xaae8f345.mm.vfs.b2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f294341b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f294342c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f294343d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f294344e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f294345f;

    static {
        int length = com.p314xaae8f345.mm.vfs.l2.f294577c.length;
        int length2 = com.p314xaae8f345.mm.vfs.l2.f294578d.length;
        int length3 = com.p314xaae8f345.mm.vfs.l2.f294581g.length;
        int length4 = com.p314xaae8f345.mm.vfs.l2.f294582h.length;
        int length5 = com.p314xaae8f345.mm.vfs.l2.f294584j.length;
        int length6 = com.p314xaae8f345.mm.vfs.l2.f294585k.length;
        f294341b = new java.util.LinkedHashMap();
        f294342c = new java.util.LinkedHashMap();
        f294343d = new java.util.ArrayList();
        f294344e = new java.util.ArrayList();
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger.f39808x6514ab7 = 3;
        jz5.l lVar = new jz5.l("/", tagger);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger2 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger2.f39811x35e57f = true;
        jz5.l lVar2 = new jz5.l("${data}/lib", tagger2);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger3.f39811x35e57f = true;
        jz5.l lVar3 = new jz5.l("${data}/code_cache", tagger3);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger4 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger4.f39808x6514ab7 = 0;
        tagger4.f39807x5b0cac3 = 1;
        jz5.l lVar4 = new jz5.l("${data}/MicroMsg", tagger4);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger5 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger5.f39808x6514ab7 = 0;
        tagger5.f39807x5b0cac3 = 1;
        jz5.l lVar5 = new jz5.l("${data}/files", tagger5);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger6 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger6.f39808x6514ab7 = 0;
        tagger6.f39807x5b0cac3 = 1;
        jz5.l lVar6 = new jz5.l("${extData}", tagger6);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger7 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger7.f39808x6514ab7 = 0;
        tagger7.f39807x5b0cac3 = 1;
        jz5.l lVar7 = new jz5.l("${extData}/MicroMsg", tagger7);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger8 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger8.f39808x6514ab7 = 3;
        tagger8.f39807x5b0cac3 = 1;
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
        taggerPattern.f39814xd0d8eb90 = "account.bin";
        taggerPattern.f39813x6514ab7 = 0;
        tagger8.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern};
        jz5.l lVar8 = new jz5.l("${data}", tagger8);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger9 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger9.f39808x6514ab7 = 0;
        tagger9.f39807x5b0cac3 = 1;
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern2 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
        taggerPattern2.f39814xd0d8eb90 = "PreDownloadCheck.db*";
        taggerPattern2.f39813x6514ab7 = 3;
        tagger9.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern2};
        jz5.l lVar9 = new jz5.l("${data}/MicroMsg/${account}", tagger9);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger10 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger10.f39808x6514ab7 = 1;
        jz5.l lVar10 = new jz5.l("${data}/MicroMsg/${accountAllOther}", tagger10);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger11 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger11.f39808x6514ab7 = 1;
        jz5.l lVar11 = new jz5.l("${extData}/MicroMsg/${accountAllOther}", tagger11);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger12 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger12.f39808x6514ab7 = 2;
        jz5.l lVar12 = new jz5.l("${data}/MicroMsg/CheckResUpdate", tagger12);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger13 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger13.f39808x6514ab7 = 2;
        jz5.l lVar13 = new jz5.l("${sdTo}/MicroMsg/CheckResUpdate", tagger13);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger14 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger14.f39808x6514ab7 = 2;
        jz5.l lVar14 = new jz5.l("${data}/files/public/maas-sdk", tagger14);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger15 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger15.f39808x6514ab7 = 2;
        jz5.l lVar15 = new jz5.l("${data}/files/public/live", tagger15);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger16 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger16.f39808x6514ab7 = 2;
        jz5.l lVar16 = new jz5.l("${data}/files/XNetLib", tagger16);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger17 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger17.f39808x6514ab7 = 24;
        jz5.l lVar17 = new jz5.l("${data}/tinker", tagger17);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger18 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger18.f39808x6514ab7 = 25;
        jz5.l lVar18 = new jz5.l("${sdTo}/MicroMsg/${account}/MassSendImg", tagger18);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger19 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger19.f39808x6514ab7 = 3;
        jz5.l lVar19 = new jz5.l("${dataCache}", tagger19);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger20 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger20.f39808x6514ab7 = 3;
        jz5.l lVar20 = new jz5.l("${extCache}", tagger20);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger21 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger21.f39808x6514ab7 = 0;
        jz5.l lVar21 = new jz5.l("${data}/.vfs", tagger21);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger22 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger22.f39808x6514ab7 = 0;
        jz5.l lVar22 = new jz5.l("${data}/.auth_cache", tagger22);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger23 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger23.f39808x6514ab7 = 0;
        jz5.l lVar23 = new jz5.l("${data}/MicroMsg/last_avatar_dir", tagger23);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger24 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger24.f39808x6514ab7 = 0;
        jz5.l lVar24 = new jz5.l("${data}/app_lib", tagger24);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger25 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger25.f39808x6514ab7 = 0;
        jz5.l lVar25 = new jz5.l("${data}/app_dex", tagger25);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger26 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger26.f39808x6514ab7 = 0;
        jz5.l lVar26 = new jz5.l("${data}/app_recover_lib", tagger26);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger27 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger27.f39808x6514ab7 = 0;
        f294345f = kz5.c0.i(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22, lVar23, lVar24, lVar25, lVar26, new jz5.l("${data}/MicroMsg/recovery", tagger27));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.vfs.y1 c(java.util.List r24, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.b2.c(java.util.List, com.tencent.wcdb.support.CancellationSignal, boolean):com.tencent.mm.vfs.y1");
    }

    public static final void e(int i17, java.util.Map map, yz5.r rVar, java.util.ArrayList arrayList, java.util.Map map2, q26.n nVar, java.util.Map map3) {
        com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb;
        java.util.Iterator mo144672x467c086e = nVar.mo144672x467c086e();
        while (mo144672x467c086e.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) mo144672x467c086e.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            if ((intValue & 4095) == i17 && (interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) map.get(str)) != null) {
                com.p314xaae8f345.mm.vfs.b2 b2Var = f294340a;
                java.lang.Object b17 = interfaceC22750xe27c22eb.b(map3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "configure(...)");
                java.util.List b18 = b2Var.b((com.p314xaae8f345.mm.vfs.q2) b17);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : b18) {
                    if (rVar == null || ((java.lang.Boolean) rVar.C(str, java.lang.Integer.valueOf(intValue), map3, (java.lang.String) obj)).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jz5.l((java.lang.String) it.next(), map2.get(str)));
                }
            }
        }
    }

    public static final java.lang.Iterable g(boolean z17, com.p314xaae8f345.mm.vfs.l6 l6Var) {
        java.lang.Object[] objArr;
        char c17;
        java.util.List b17 = com.p314xaae8f345.mm.vfs.q7.b(true);
        java.util.Map h17 = f294340a.h(b17);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i17 = 0;
        java.util.TreeMap treeMap = new java.util.TreeMap();
        kz5.c1.p(treeMap, new jz5.l[0]);
        java.lang.Object obj = ((java.util.HashMap) h17).get("account");
        int i18 = 2;
        java.util.List list = f294343d;
        java.util.Iterator it = java.util.Arrays.asList(f294344e, list).iterator();
        pm5.h hVar = pm5.i.f438436e;
        pm5.c cVar = new pm5.c(it, hVar);
        while (cVar.hasNext()) {
            jz5.l lVar = (jz5.l) cVar.next();
            java.lang.String[] b18 = new com.p314xaae8f345.mm.vfs.f1((java.lang.String) lVar.f384366d).b(h17);
            if (b18 != null) {
                int length = b18.length;
                int i19 = i17;
                while (i19 < length) {
                    treeMap.put(b18[i19], lVar.f384367e);
                    i19++;
                    i17 = 0;
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) f294341b;
        pm5.c cVar2 = new pm5.c(java.util.Arrays.asList(((java.util.LinkedHashMap) f294342c).entrySet(), linkedHashMap2.entrySet()).iterator(), hVar);
        while (cVar2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) cVar2.next();
            com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) com.p314xaae8f345.mm.vfs.a3.f294314a.e().get(entry.getKey());
            if (interfaceC22750xe27c22eb != null) {
                java.lang.Integer num = (java.lang.Integer) com.p314xaae8f345.mm.vfs.l2.f294575a.get(entry.getKey());
                if (num == null) {
                    num = (java.lang.Integer) entry.getValue();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                int intValue = num.intValue();
                java.lang.Object key = entry.getKey();
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object b19 = interfaceC22750xe27c22eb.b(h17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b19, "configure(...)");
                linkedHashMap.put(key, new com.p314xaae8f345.mm.vfs.m6(intValue, str, (com.p314xaae8f345.mm.vfs.q2) b19));
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap(h17);
        java.util.Iterator it6 = ((java.util.ArrayList) b17).iterator();
        while (it6.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it6.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pair.first, obj)) {
                hashMap.put("account", pair.first);
                hashMap.put("accountSalt", pair.second);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pair.first, pair.second)) {
                    objArr = new java.lang.String[]{pair.first};
                } else {
                    objArr = new java.lang.String[i18];
                    objArr[0] = pair.first;
                    objArr[1] = pair.second;
                }
                hashMap.put("accountSd", objArr);
                java.util.Iterator it7 = ((java.util.ArrayList) list).iterator();
                while (true) {
                    c17 = '-';
                    if (!it7.hasNext()) {
                        break;
                    }
                    jz5.l lVar2 = (jz5.l) it7.next();
                    java.lang.String str2 = ((java.lang.String) lVar2.f384367e) + '-' + ((java.lang.String) pair.first);
                    java.lang.String[] b27 = new com.p314xaae8f345.mm.vfs.f1((java.lang.String) lVar2.f384366d).b(hashMap);
                    if (b27 != null) {
                        int length2 = b27.length;
                        int i27 = 0;
                        while (i27 < length2) {
                            treeMap.put(b27[i27], str2);
                            i27++;
                            it6 = it6;
                        }
                    }
                    it6 = it6;
                }
                java.util.Iterator it8 = it6;
                for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    java.lang.String str3 = ((java.lang.String) entry2.getKey()) + c17 + ((java.lang.String) pair.first);
                    com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb interfaceC22750xe27c22eb2 = (com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) com.p314xaae8f345.mm.vfs.a3.f294314a.e().get(entry2.getKey());
                    if (interfaceC22750xe27c22eb2 != null) {
                        int intValue2 = ((java.lang.Number) entry2.getValue()).intValue();
                        java.lang.String str4 = (java.lang.String) entry2.getKey();
                        java.lang.Object b28 = interfaceC22750xe27c22eb2.b(hashMap);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b28, "configure(...)");
                        linkedHashMap.put(str3, new com.p314xaae8f345.mm.vfs.m6(intValue2, str4, (com.p314xaae8f345.mm.vfs.q2) b28));
                        c17 = '-';
                    }
                }
                it6 = it8;
                i18 = 2;
            }
        }
        int i28 = 0;
        java.util.TreeMap treeMap2 = new java.util.TreeMap();
        kz5.c1.p(treeMap2, new jz5.l[0]);
        java.util.TreeMap treeMap3 = new java.util.TreeMap();
        kz5.c1.p(treeMap3, new jz5.l[0]);
        java.lang.String[] strArr = com.p314xaae8f345.mm.vfs.l2.f294577c;
        int length3 = strArr.length;
        int i29 = 0;
        int i37 = 0;
        while (i29 < length3) {
            java.lang.String str5 = strArr[i29];
            int i38 = i37 + 1;
            int i39 = com.p314xaae8f345.mm.vfs.l2.f294578d[i37];
            java.lang.String[] b29 = new com.p314xaae8f345.mm.vfs.f1(str5).b(h17);
            if (b29 != null) {
                for (java.lang.String str6 : b29) {
                    treeMap2.put(str6, java.lang.Integer.valueOf(i39));
                }
            }
            i29++;
            i37 = i38;
        }
        java.lang.String[] strArr2 = com.p314xaae8f345.mm.vfs.l2.f294581g;
        int length4 = strArr2.length;
        int i47 = 0;
        int i48 = 0;
        while (i47 < length4) {
            java.lang.String str7 = strArr2[i47];
            int i49 = i48 + 1;
            yz5.p pVar = com.p314xaae8f345.mm.vfs.l2.f294582h[i48];
            java.lang.String[] b37 = new com.p314xaae8f345.mm.vfs.f1(str7).b(h17);
            if (b37 != null) {
                for (java.lang.String str8 : b37) {
                    treeMap3.put(str8, pVar);
                }
            }
            i47++;
            i48 = i49;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String[] strArr3 = com.p314xaae8f345.mm.vfs.l2.f294584j;
        int length5 = strArr3.length;
        int i57 = 0;
        while (i28 < length5) {
            hashMap2.put(strArr3[i28], com.p314xaae8f345.mm.vfs.l2.f294585k[i57]);
            i28++;
            i57++;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j62.e.g().a("clicfg_clean_enable_donotclean", "1", true, true), "1")) {
            for (java.util.Map.Entry entry3 : com.p314xaae8f345.mm.vfs.e7.f294447d.entrySet()) {
                java.lang.String str9 = (java.lang.String) entry3.getKey();
                java.util.List list2 = (java.util.List) entry3.getValue();
                hashMap2.get(str9);
                hashMap2.put(str9, new com.p314xaae8f345.mm.vfs.u5(list2));
            }
        }
        return new pm5.b(com.p314xaae8f345.mm.vfs.l2.f294576b, new com.p314xaae8f345.mm.vfs.a2(h17, treeMap2, treeMap3, new com.p314xaae8f345.mm.vfs.g6(linkedHashMap, treeMap, treeMap2, treeMap3, hashMap2, z17, l6Var)));
    }

    public static final java.lang.String i(long j17) {
        java.lang.String str;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.US).format(new java.util.Date(j17));
        com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("xlogPrivate");
        if (b17 == null || (str = b17.D("", false)) == null) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getPath() + "/xlog";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
        tagger.f39809x346425 = str;
        tagger.f39806xabc2ea43 = -1;
        tagger.f39808x6514ab7 = 0;
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern taggerPattern = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern();
        taggerPattern.f39814xd0d8eb90 = "*_" + format + ".xlog";
        taggerPattern.f39813x6514ab7 = 0;
        tagger.f39810x4a4486e3 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]{taggerPattern};
        com.p314xaae8f345.mm.vfs.l2.f294594t = kz5.b0.c(tagger);
        com.p314xaae8f345.mm.vfs.l2.f294593s = format;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        return format;
    }

    public final java.lang.String a(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalPath);
            return canonicalPath;
        } catch (java.io.IOException unused) {
            java.lang.String absolutePath = file.getAbsolutePath();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(absolutePath);
            return absolutePath;
        }
    }

    public final java.util.List b(com.p314xaae8f345.mm.vfs.q2 q2Var) {
        if (q2Var instanceof com.p314xaae8f345.mm.vfs.h4) {
            java.util.List singletonList = java.util.Collections.singletonList(((com.p314xaae8f345.mm.vfs.h4) q2Var).f294508e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singletonList, "singletonList(...)");
            return singletonList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.vfs.q2 q2Var2 : com.p314xaae8f345.mm.vfs.e8.c(q2Var, null)) {
            if (q2Var2 instanceof com.p314xaae8f345.mm.vfs.h4) {
                arrayList.add(((com.p314xaae8f345.mm.vfs.h4) q2Var2).f294508e);
            }
        }
        return arrayList;
    }

    public final java.util.List d(java.util.List list, java.util.List list2, java.util.Map map) {
        com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[] taggerPatternArr;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            java.lang.String[] b17 = new com.p314xaae8f345.mm.vfs.f1((java.lang.String) lVar.f384366d).b(map);
            if (b17 != null) {
                for (java.lang.String str : b17) {
                    com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger = (com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger) lVar.f384367e;
                    com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger tagger2 = new com.p314xaae8f345.mm.vfs.C22748x3d92d33a.Tagger();
                    com.p314xaae8f345.mm.vfs.b2 b2Var = f294340a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    tagger2.f39809x346425 = b2Var.a(str);
                    tagger2.f39811x35e57f = tagger.f39811x35e57f;
                    tagger2.f39806xabc2ea43 = tagger.f39806xabc2ea43;
                    tagger2.f39808x6514ab7 = tagger.f39808x6514ab7;
                    tagger2.f39807x5b0cac3 = tagger.f39807x5b0cac3;
                    com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[] taggerPatternArr2 = tagger.f39810x4a4486e3;
                    if (taggerPatternArr2 != null) {
                        java.lang.Object[] copyOf = java.util.Arrays.copyOf(taggerPatternArr2, taggerPatternArr2.length);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
                        taggerPatternArr = (com.p314xaae8f345.mm.vfs.C22748x3d92d33a.TaggerPattern[]) copyOf;
                    } else {
                        taggerPatternArr = null;
                    }
                    tagger2.f39810x4a4486e3 = taggerPatternArr;
                    list.add(tagger2);
                }
            }
        }
        return list;
    }

    public final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList(com.p314xaae8f345.mm.vfs.l2.f294587m);
        java.util.List list = com.p314xaae8f345.mm.vfs.l2.f294589o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new jz5.l("XWebEngine", (java.lang.String) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (!com.p314xaae8f345.mm.vfs.l2.f294597w) {
            arrayList.add(new jz5.l("PublicResource", "maas-sdk"));
        }
        return arrayList;
    }

    public final java.util.Map h(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap(com.p314xaae8f345.mm.vfs.a3.f294314a.c());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.Object first = pair.first;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
            linkedHashSet.add(first);
            java.lang.Object second = pair.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
            linkedHashSet.add(second);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(linkedHashSet).remove(com.p314xaae8f345.mm.vfs.e8.e(hashMap, "account"));
        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(linkedHashSet).remove(com.p314xaae8f345.mm.vfs.e8.e(hashMap, "accountSalt"));
        linkedHashSet.remove("ee1da3ae2100e09165c2e52382cfe79f");
        hashMap.put("accountAllOther", linkedHashSet.toArray(new java.lang.String[0]));
        hashMap.put("xwebKeepOld", com.p314xaae8f345.mm.vfs.l2.f294588n.toArray(new java.lang.String[0]));
        return hashMap;
    }

    public final int j(int i17, boolean z17) {
        int i18;
        if (z17) {
            if ((i17 & 65536) != 0 || (i18 = i17 & 4095) == 1 || i18 == 12 || i18 == 13) {
                return 1;
            }
            return i18 + 3;
        }
        int i19 = i17 & 4095;
        if (i19 == 1) {
            return 27;
        }
        if (i19 == 12) {
            return 28;
        }
        if (i19 == 13) {
            return 29;
        }
        if ((i17 & 65536) != 0) {
            return 0;
        }
        return i19 + 3;
    }
}
