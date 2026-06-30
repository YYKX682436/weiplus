package dk2;

/* loaded from: classes3.dex */
public final class u7 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f315715b;

    /* renamed from: j, reason: collision with root package name */
    public static int f315723j;

    /* renamed from: n, reason: collision with root package name */
    public static r45.aw1 f315727n;

    /* renamed from: o, reason: collision with root package name */
    public static r45.zo0 f315728o;

    /* renamed from: p, reason: collision with root package name */
    public static r45.wi6 f315729p;

    /* renamed from: s, reason: collision with root package name */
    public static yz5.p f315732s;

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.u7 f315714a = new dk2.u7();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.Map f315716c = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f315717d = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f315718e = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f315719f = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f315720g = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f315721h = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f315722i = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f315724k = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f315725l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f315726m = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f315730q = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Set f315731r = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f315733t = jz5.h.b(dk2.d7.f314855d);

    public final void a(ce2.i gift) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gift, "gift");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "addIfNotExistGift " + gift);
        java.lang.String str = gift.f67814x2c488eb6;
        boolean z17 = str == null || str.length() == 0;
        java.util.Map map = f315718e;
        if (!z17 && !map.containsKey(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(str, gift);
            l(gift, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "addIfNotExistGift id:" + str + ", giftCache.containsKey:" + map.containsKey(str));
        }
    }

    public final java.lang.String b(java.lang.String giftId, r45.yv1 randomItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(randomItem, "randomItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(giftId);
        sb6.append('_');
        java.lang.String m75945x2fec8307 = randomItem.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        return sb6.toString();
    }

    public final void c(java.lang.String source, ce2.i giftInfo, r45.na0 customGiftInfo) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customGiftInfo, "customGiftInfo");
        rs5.f fVar = (rs5.f) i95.n0.c(rs5.f.class);
        java.lang.String m75945x2fec83073 = customGiftInfo.m75945x2fec8307(7);
        java.lang.String str = m75945x2fec83073 == null ? "" : m75945x2fec83073;
        r45.gs5 gs5Var = (r45.gs5) customGiftInfo.m75936x14adae67(8);
        java.lang.String str2 = (gs5Var == null || (m75945x2fec83072 = gs5Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec83072;
        r45.gs5 gs5Var2 = (r45.gs5) customGiftInfo.m75936x14adae67(8);
        java.lang.String str3 = (gs5Var2 == null || (m75945x2fec8307 = gs5Var2.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307;
        dk2.b7 b7Var = new dk2.b7(giftInfo, source, customGiftInfo);
        it2.x xVar = (it2.x) fVar;
        xVar.getClass();
        nf.e.f(new it2.v(xVar, b7Var, str, str2, str3, false));
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        yg2.b bVar;
        if (str == null || str.length() == 0) {
            return;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f354008i) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.b(bVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new dk2.c7(str, z17, z18, str2, null), 2, null);
    }

    public final ce2.i e(java.lang.String str) {
        ce2.i iVar = (ce2.i) f315718e.get(str);
        return iVar == null ? (ce2.i) f315722i.get(str) : iVar;
    }

    public final java.util.Map f() {
        java.util.Map map;
        je2.t tVar = (je2.t) dk2.ef.f314905a.i(je2.t.class);
        java.util.Map giftPkgGiftBatchCache = f315721h;
        if (tVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(giftPkgGiftBatchCache, "giftPkgGiftBatchCache");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeFreeGiftsToPkg, before merge: ");
            java.util.List list = tVar.f380808u;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(je2.u.a((r45.oq1) it.next()));
            }
            sb6.append(arrayList);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = tVar.f380796f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (kz5.n0.O(tVar.f380810w, ((r45.oq1) next).f463974d)) {
                    arrayList3.add(next);
                }
            }
            java.util.Iterator it7 = arrayList3.iterator();
            while (true) {
                boolean hasNext = it7.hasNext();
                map = f315722i;
                if (!hasNext) {
                    break;
                }
                r45.oq1 oq1Var = (r45.oq1) it7.next();
                java.lang.String str2 = oq1Var.f463975e;
                java.util.LinkedList linkedList = (java.util.LinkedList) giftPkgGiftBatchCache.get(str2);
                if (linkedList != null) {
                    linkedList.removeIf(new je2.o(oq1Var));
                    if (linkedList.isEmpty()) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(giftPkgGiftBatchCache).remove(str2);
                        map.remove(str2);
                    }
                }
            }
            java.util.Iterator it8 = ((java.util.ArrayList) tVar.P6()).iterator();
            while (it8.hasNext()) {
                r45.oq1 oq1Var2 = (r45.oq1) it8.next();
                java.lang.String str3 = oq1Var2.f463975e;
                if (!(str3 == null || str3.length() == 0)) {
                    if (giftPkgGiftBatchCache.containsKey(str3)) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) giftPkgGiftBatchCache.get(str3);
                        java.lang.Object obj = null;
                        if (linkedList2 != null) {
                            java.util.Iterator it9 = linkedList2.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    break;
                                }
                                java.lang.Object next2 = it9.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.ad5) next2).m75945x2fec8307(5), oq1Var2.f463974d)) {
                                    obj = next2;
                                    break;
                                }
                            }
                            obj = (r45.ad5) obj;
                        }
                        if (obj == null && linkedList2 != null) {
                            linkedList2.add(0, tVar.S6(oq1Var2));
                        }
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-pkgGiftCache>(...)");
                        map.put(str3, f315718e.get(str3));
                        java.util.LinkedList linkedList3 = new java.util.LinkedList();
                        linkedList3.add(0, tVar.S6(oq1Var2));
                        giftPkgGiftBatchCache.put(str3, linkedList3);
                    }
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mergeFreeGiftsToPkg, after merge: ");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                arrayList4.add(je2.u.a((r45.oq1) it10.next()));
            }
            sb8.append(arrayList4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
        }
        return giftPkgGiftBatchCache;
    }

    public final boolean g(ce2.i iVar) {
        java.lang.Boolean valueOf = iVar != null ? java.lang.Boolean.valueOf(iVar.Z0()) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreciousGift id:");
        sb6.append(iVar != null ? iVar.f67814x2c488eb6 : null);
        sb6.append(" name:");
        sb6.append(iVar != null ? iVar.f67809x225f1eb0 : null);
        sb6.append(" animationPagUrl:");
        sb6.append(iVar != null ? iVar.f67790xc2fee458 : null);
        sb6.append(", isRandomGift:");
        sb6.append(valueOf);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar != null ? iVar.f67790xc2fee458 : null) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE);
    }

    public final boolean h(java.lang.String str, boolean z17) {
        ce2.i iVar = (ce2.i) f315718e.get(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isValidGift isPreview:");
        sb6.append(z17);
        sb6.append(" id:");
        sb6.append(iVar != null ? iVar.f67814x2c488eb6 : null);
        sb6.append(" name:");
        sb6.append(iVar != null ? iVar.f67809x225f1eb0 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
        return true;
    }

    public final void i() {
        f315715b = false;
        f315718e.clear();
        java.util.List<ce2.i> z07 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().z0();
        if (z07.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveGiftLoader", "prepareLocalGift giftList from db is nullOrNil");
        }
        for (ce2.i iVar : z07) {
            java.util.Map map = f315718e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(iVar.f67814x2c488eb6, iVar);
        }
        f315716c.clear();
        java.util.LinkedHashMap D0 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().D0();
        if (D0 != null) {
            f315716c = java.util.Collections.synchronizedMap(D0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "prepareLocalGift cur gift cache:" + f315718e + ", giftTabInfoList:" + f315716c);
    }

    public final void j(java.lang.String productId) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        java.util.LinkedList linkedList = (java.util.LinkedList) f().get(productId);
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            j17 = 0;
            while (it.hasNext()) {
                j17 += ((r45.ad5) it.next()).m75942xfb822ef2(1);
            }
        } else {
            j17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "[removePkgGiftIfBatchEmpty] productId:" + productId + " , left_cnt_sum = " + j17);
        if (j17 <= 0) {
            f().remove(productId);
            f315722i.remove(productId);
        }
    }

    public final java.lang.Object k(r45.kv1 kv1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(0);
        boolean z17 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "syncGiftResource id is empty");
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.l.f(null, new dk2.o7(ce2.i.U1.b(kv1Var), m75945x2fec8307, null), 1, null);
        return f0Var;
    }

    public final void l(ce2.i iVar, java.lang.String str) {
        yg2.b bVar;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList<r45.yq4> m75941xfb8219142;
        yg2.b bVar2;
        new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(iVar.f67819x7194d06c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f)).d();
        java.lang.String str2 = iVar.f67812x88c5dc5c;
        java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
        java.lang.String field_name = iVar.f67809x225f1eb0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
        d(str2, field_rewardProductId, field_name, true, false);
        java.lang.String str3 = iVar.f67790xc2fee458;
        java.lang.String field_rewardProductId2 = iVar.f67814x2c488eb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId2, "field_rewardProductId");
        java.lang.String field_name2 = iVar.f67809x225f1eb0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name2, "field_name");
        d(str3, field_rewardProductId2, field_name2, false, false);
        java.lang.String str4 = iVar.f67807xb353364f;
        java.lang.String field_rewardProductId3 = iVar.f67814x2c488eb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId3, "field_rewardProductId");
        java.lang.String field_name3 = iVar.f67809x225f1eb0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name3, "field_name");
        d(str4, field_rewardProductId3, field_name3, false, true);
        if (iVar.Y0()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().J0(iVar);
            r45.zq4 zq4Var = iVar.f67808xc50d3cee;
            if (zq4Var != null && (m75941xfb8219142 = zq4Var.m75941xfb821914(0)) != null) {
                for (r45.yq4 yq4Var : m75941xfb8219142) {
                    gk2.e eVar = dk2.ef.I;
                    if (eVar != null && (bVar2 = eVar.f354008i) != null) {
                        p3325xe03a0797.p3326xc267989b.l.d(bVar2, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new dk2.z6(yq4Var, null), 2, null);
                    }
                }
            }
        } else if (iVar.Z0()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().J0(iVar);
            java.lang.String str5 = iVar.f67814x2c488eb6;
            if (str5 == null) {
                str5 = "";
            }
            r45.zq4 zq4Var2 = iVar.f67808xc50d3cee;
            java.util.LinkedList m75941xfb8219143 = zq4Var2 != null ? zq4Var2.m75941xfb821914(0) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAndDownloadMultiAnimation reset, multiAnimationList:");
            sb6.append(m75941xfb8219143 != null ? java.lang.Integer.valueOf(m75941xfb8219143.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
            if (m75941xfb8219143 == null || m75941xfb8219143.size() <= 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkAndDownloadMultiAnimation id:");
                sb7.append(str5);
                sb7.append(" name:");
                sb7.append(iVar.f67809x225f1eb0);
                sb7.append(" multiAnimationList is empty:");
                sb7.append(m75941xfb8219143 != null ? java.lang.Integer.valueOf(m75941xfb8219143.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveGiftLoader", sb7.toString());
            } else {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new dk2.a7(m75941xfb8219143, str5, iVar, null), 3, null);
            }
        }
        if (iVar.a1()) {
            r45.xi6 xi6Var = iVar.f67816xdcd1d904;
            if ((xi6Var == null || (m75941xfb821914 = xi6Var.m75941xfb821914(0)) == null || !(m75941xfb821914.isEmpty() ^ true)) ? false : true) {
                java.util.LinkedList<r45.yi6> m75941xfb8219144 = iVar.f67816xdcd1d904.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getSwitch_skin_info_list(...)");
                for (r45.yi6 yi6Var : m75941xfb8219144) {
                    dk2.u7 u7Var = f315714a;
                    r45.gs5 gs5Var = (r45.gs5) yi6Var.m75936x14adae67(1);
                    java.lang.String m75945x2fec8307 = gs5Var != null ? gs5Var.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId4 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId4, "field_rewardProductId");
                    java.lang.String field_name4 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name4, "field_name");
                    u7Var.d(m75945x2fec8307, field_rewardProductId4, field_name4, false, false);
                    r45.gs5 gs5Var2 = (r45.gs5) yi6Var.m75936x14adae67(2);
                    java.lang.String m75945x2fec83072 = gs5Var2 != null ? gs5Var2.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId5 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId5, "field_rewardProductId");
                    java.lang.String field_name5 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name5, "field_name");
                    u7Var.d(m75945x2fec83072, field_rewardProductId5, field_name5, false, true);
                    r45.gs5 gs5Var3 = (r45.gs5) yi6Var.m75936x14adae67(4);
                    java.lang.String m75945x2fec83073 = gs5Var3 != null ? gs5Var3.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId6 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId6, "field_rewardProductId");
                    java.lang.String field_name6 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name6, "field_name");
                    u7Var.d(m75945x2fec83073, field_rewardProductId6, field_name6, true, false);
                    r45.gs5 gs5Var4 = (r45.gs5) yi6Var.m75936x14adae67(16);
                    java.lang.String m75945x2fec83074 = gs5Var4 != null ? gs5Var4.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId7 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId7, "field_rewardProductId");
                    java.lang.String field_name7 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name7, "field_name");
                    u7Var.d(m75945x2fec83074, field_rewardProductId7, field_name7, false, false);
                    r45.gs5 gs5Var5 = (r45.gs5) yi6Var.m75936x14adae67(17);
                    java.lang.String m75945x2fec83075 = gs5Var5 != null ? gs5Var5.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId8 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId8, "field_rewardProductId");
                    java.lang.String field_name8 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name8, "field_name");
                    u7Var.d(m75945x2fec83075, field_rewardProductId8, field_name8, false, true);
                    r45.gs5 gs5Var6 = (r45.gs5) yi6Var.m75936x14adae67(14);
                    java.lang.String m75945x2fec83076 = gs5Var6 != null ? gs5Var6.m75945x2fec8307(0) : null;
                    java.lang.String field_rewardProductId9 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId9, "field_rewardProductId");
                    java.lang.String field_name9 = iVar.f67809x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name9, "field_name");
                    u7Var.d(m75945x2fec83076, field_rewardProductId9, field_name9, true, false);
                }
            }
        }
        gk2.e eVar2 = dk2.ef.I;
        if (eVar2 != null && (bVar = eVar2.f354008i) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(bVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new dk2.t7(iVar, null), 2, null);
        }
        r45.l43 l43Var = iVar.f67800x8dbb6276;
        if (l43Var != null) {
            java.util.Map map = f315724k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(iVar.f67814x2c488eb6, l43Var);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("id:");
        sb8.append(iVar.f67814x2c488eb6);
        sb8.append(" name:");
        sb8.append(iVar.f67809x225f1eb0);
        sb8.append(" isFullPag:");
        sb8.append(iVar.f67803x50635e2f == 2);
        sb8.append("  isLandscapeGift:");
        sb8.append(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f67807xb353364f));
        sb8.append(" isSwitchSkin:");
        sb8.append(iVar.a1());
        sb8.append(",isCustomGift:");
        sb8.append(iVar.U0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", sb8.toString());
    }

    public final void m() {
        f315718e.clear();
        java.util.List<ce2.i> z07 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().z0();
        if (z07.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveGiftLoader", "skip fetch gift, giftList from db is nullOrNil");
        }
        java.util.Map map = f315719f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        synchronized (map) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    java.util.Map map2 = f315718e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map2);
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        for (ce2.i iVar : z07) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "[trySyncGift] giftFromDb: " + iVar);
            java.util.Map map3 = f315718e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map3);
            map3.put(iVar.f67814x2c488eb6, iVar);
        }
        f315716c.clear();
        java.util.LinkedHashMap D0 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().D0();
        if (D0 != null) {
            f315716c = java.util.Collections.synchronizedMap(D0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cur gift cache:");
        java.util.Map map4 = f315718e;
        sb6.append(map4);
        sb6.append(", giftTabInfoList:");
        sb6.append(f315716c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map4);
        synchronized (map4) {
            for (java.util.Map.Entry entry2 : map4.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                ce2.i iVar2 = (ce2.i) entry2.getValue();
                dk2.u7 u7Var = f315714a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
                u7Var.l(iVar2, str);
                if (str != null) {
                    f315731r.add(str);
                }
            }
        }
    }
}
