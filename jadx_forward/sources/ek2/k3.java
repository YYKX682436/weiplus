package ek2;

/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ek2.k3 f335025a = new ek2.k3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f335026b = ((ku5.t0) ku5.t0.f394148d).p("Finder.LiveGiftListResultProcessor");

    /* JADX WARN: Removed duplicated region for block: B:165:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ek2.k3 r17, r45.d81 r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ek2.k3.a(ek2.k3, r45.d81, int, int, int):void");
    }

    public final java.lang.String b(dm.o4 gift) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gift, "gift");
        return "localGift : [id:" + gift.f67814x2c488eb6 + ", businessType:" + gift.f67793xe412923f + ", thumbnailFileUrl:" + gift.f67819x7194d06c + ", previewUrl:" + gift.f67812x88c5dc5c + ", animationUrl:" + gift.f67790xc2fee458 + ", thumbnailMd5:" + gift.f67820xf6e7d417 + ", previewMd5:" + gift.f67811x88c5bc6b + ", animationMd5:" + gift.f67789xc2fec467 + ", type:" + gift.f67803x50635e2f + ", name:" + gift.f67809x225f1eb0 + ", price:" + gift.f67813x29a891c4 + "，flag:" + gift.f67799x225ba391 + ", state:" + gift.f67815x29d3a50c + ", landscapeUrl" + gift.f67807xb353364f + ", landscapeMd5" + gift.f67806xb353165e + ']';
    }

    public final java.lang.String c(r45.kv1 gift) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gift, "gift");
        return "remoteGift : [id:" + gift.m75945x2fec8307(0) + ", businessType:" + gift.m75939xb282bd08(1) + ", thumbnailFileUrl:" + gift.m75945x2fec8307(2) + ", previewUrl:" + gift.m75945x2fec8307(3) + ", animationUrl:" + gift.m75945x2fec8307(4) + ", thumbnailMd5:" + gift.m75945x2fec8307(5) + ", previewMd5:" + gift.m75945x2fec8307(6) + ", animationMd5:" + gift.m75945x2fec8307(7) + ", type:" + gift.m75939xb282bd08(10) + ", name:" + gift.m75945x2fec8307(8) + ", price:" + gift.m75938x746dc8a6(9) + "，flag:" + gift.m75939xb282bd08(12) + ", landscapeUrl" + gift.m75945x2fec8307(13) + ", landscapeMd5" + gift.m75945x2fec8307(14) + ']';
    }

    public final void d(be2.f fVar) {
        java.util.List<java.lang.String> list;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        dk2.u7 u7Var = dk2.u7.f315714a;
        java.util.Map map = dk2.u7.f315716c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-gitTabCache>(...)");
        synchronized (map) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                if (str != null && (list = (java.util.List) entry.getValue()) != null) {
                    r45.sv1 sv1Var = new r45.sv1();
                    sv1Var.set(0, str);
                    sv1Var.set(1, new java.util.LinkedList());
                    for (java.lang.String str2 : list) {
                        r45.kv1 kv1Var = new r45.kv1();
                        kv1Var.set(0, str2);
                        sv1Var.m75941xfb821914(1).add(kv1Var);
                    }
                    linkedList.add(sv1Var);
                }
            }
        }
        fVar.y0(linkedList);
    }

    public final void e(java.util.LinkedList linkedList, boolean z17) {
        if (linkedList != null) {
            if (!z17) {
                dk2.u7 u7Var = dk2.u7.f315714a;
                dk2.u7.f315717d.clear();
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.sv1 sv1Var = (r45.sv1) it.next();
                java.lang.String m75945x2fec8307 = sv1Var.m75945x2fec8307(0);
                int m75939xb282bd08 = sv1Var.m75939xb282bd08(2);
                int m75939xb282bd082 = sv1Var.m75939xb282bd08(3);
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = sv1Var.m75934xbce7f2f(4);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && m75939xb282bd08 > 0) {
                    dk2.u7 u7Var2 = dk2.u7.f315714a;
                    java.util.Map map = dk2.u7.f315717d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-giftTabGroupIdCache>(...)");
                    map.put(m75945x2fec8307, java.lang.Integer.valueOf(m75939xb282bd08));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateGroupPagingInfo] ");
                    sb6.append(z17 ? "incremental" : "full");
                    sb6.append(": groupName:");
                    sb6.append(m75945x2fec8307);
                    sb6.append(", groupId:");
                    sb6.append(m75939xb282bd08);
                    sb6.append(", hasMore:");
                    sb6.append(m75939xb282bd082);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", sb6.toString());
                }
                if (m75939xb282bd08 > 0) {
                    dk2.vc vcVar = new dk2.vc(false, null, 3, null);
                    vcVar.f315779a = m75939xb282bd082 > 0;
                    vcVar.f315780b = m75934xbce7f2f;
                    dk2.ef efVar = dk2.ef.f314905a;
                    java.util.Map map2 = dk2.ef.O;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map2, "<get-groupGiftPagingInfo>(...)");
                    map2.put(java.lang.Integer.valueOf(m75939xb282bd08), vcVar);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[updateGroupPagingInfo] groupId:");
                    sb7.append(m75939xb282bd08);
                    sb7.append(", hasMore:");
                    sb7.append(vcVar.f315779a);
                    sb7.append(", lastBuffer size:");
                    sb7.append(m75934xbce7f2f != null ? java.lang.Integer.valueOf(m75934xbce7f2f.f273689a.length) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", sb7.toString());
                }
            }
        }
    }

    public final void f(java.util.List list, r45.r35 r35Var, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a1 a1Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj3;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj4;
        int i17 = 0;
        if (z17) {
            rl2.h Oj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj();
            java.util.LinkedList<r45.kv1> linkedList = new java.util.LinkedList(list);
            if (r35Var != null && (m75941xfb8219142 = r35Var.m75941xfb821914(0)) != null) {
                java.util.Iterator it = m75941xfb8219142.iterator();
                while (it.hasNext()) {
                    r45.kv1 kv1Var = (r45.kv1) ((r45.yr5) it.next()).m75936x14adae67(0);
                    if (kv1Var != null) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it6.next();
                            java.lang.String m75945x2fec8307 = ((r45.kv1) obj4).m75945x2fec8307(0);
                            java.lang.String m75945x2fec83072 = kv1Var.m75945x2fec8307(0);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, m75945x2fec83072)) {
                                break;
                            }
                        }
                        if (obj4 == null) {
                            linkedList.add(kv1Var);
                        }
                    }
                }
            }
            for (r45.kv1 kv1Var2 : linkedList) {
                java.lang.String m75945x2fec83073 = kv1Var2.m75945x2fec8307(0);
                if (!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0)) {
                    ce2.i b17 = ce2.i.U1.b(kv1Var2);
                    dk2.u7 u7Var = dk2.u7.f315714a;
                    java.util.Map map = dk2.u7.f315730q;
                    java.lang.Integer num = (java.lang.Integer) kz5.n0.m0(map.values());
                    java.lang.Integer num2 = (java.lang.Integer) map.get(m75945x2fec83073);
                    b17.f67802xbb68387d = num2 != null ? num2.intValue() : num != null ? num.intValue() + 1 : 0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-giftSortMap>(...)");
                    map.put(m75945x2fec83073, java.lang.Integer.valueOf(b17.f67802xbb68387d));
                    Oj.J0(b17);
                }
            }
            return;
        }
        rl2.h Oj2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj();
        java.util.List<ce2.i> z07 = Oj2.z0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateLocalGift] remoteGift = ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList.add(((r45.kv1) it7.next()).m75945x2fec8307(8));
        }
        sb6.append(arrayList);
        sb6.append(", full replace");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", sb6.toString());
        java.util.LinkedList linkedList2 = new java.util.LinkedList(list);
        if (r35Var != null && (m75941xfb821914 = r35Var.m75941xfb821914(0)) != null) {
            java.util.Iterator it8 = m75941xfb821914.iterator();
            while (it8.hasNext()) {
                r45.kv1 kv1Var3 = (r45.kv1) ((r45.yr5) it8.next()).m75936x14adae67(0);
                if (kv1Var3 != null) {
                    java.util.Iterator it9 = linkedList2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        java.lang.String m75945x2fec83074 = ((r45.kv1) obj3).m75945x2fec8307(0);
                        java.lang.String m75945x2fec83075 = kv1Var3.m75945x2fec8307(0);
                        if (m75945x2fec83075 == null) {
                            m75945x2fec83075 = "";
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec83074, m75945x2fec83075)) {
                            break;
                        }
                    }
                    if (obj3 == null) {
                        linkedList2.add(kv1Var3);
                    }
                }
            }
        }
        dk2.u7 u7Var2 = dk2.u7.f315714a;
        dk2.u7.f315730q.clear();
        if (z07.isEmpty()) {
            for (java.lang.Object obj5 : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.kv1 kv1Var4 = (r45.kv1) obj5;
                ce2.i b18 = ce2.i.U1.b(kv1Var4);
                b18.f67802xbb68387d = i17;
                dk2.u7 u7Var3 = dk2.u7.f315714a;
                java.util.Map map2 = dk2.u7.f315730q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map2, "<get-giftSortMap>(...)");
                map2.put(b18.f67814x2c488eb6, java.lang.Integer.valueOf(i17));
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().J0(b18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", f335025a.c(kv1Var4));
                i17 = i18;
            }
        } else {
            java.util.ArrayList<ce2.i> arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (ce2.i iVar : z07) {
                java.util.Iterator it10 = linkedList2.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj = it10.next();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((r45.kv1) obj).m75945x2fec8307(0), iVar.f67814x2c488eb6)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                boolean z18 = obj == null;
                java.util.Iterator it11 = linkedList2.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it11.next();
                    r45.kv1 kv1Var5 = (r45.kv1) obj2;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kv1Var5.m75945x2fec8307(0), iVar.f67814x2c488eb6) && !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kv1Var5.m75945x2fec8307(2), iVar.f67819x7194d06c) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kv1Var5.m75945x2fec8307(3), iVar.f67812x88c5dc5c) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kv1Var5.m75945x2fec8307(4), iVar.f67790xc2fee458) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(kv1Var5.m75945x2fec8307(13), iVar.f67807xb353364f))) {
                        break;
                    }
                }
                boolean z19 = obj2 != null;
                java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
                hashMap.put(field_rewardProductId, java.lang.Integer.valueOf(iVar.f67815x29d3a50c));
                if (z18 || z19) {
                    arrayList2.add(iVar);
                    java.lang.String field_rewardProductId2 = iVar.f67814x2c488eb6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId2, "field_rewardProductId");
                    hashMap.put(field_rewardProductId2, 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", "localGiftDeprecated:" + z18 + ", localGiftUrlDeprecated:" + z19 + ' ' + f335025a.b(iVar));
            }
            for (ce2.i iVar2 : arrayList2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", "remove " + Oj2.f478730e.mo70514xb06685ab("FinderLiveGiftInfo", "rewardProductId=?", new java.lang.String[]{"" + iVar2.f67814x2c488eb6}) + ' ' + f335025a.b(iVar2));
            }
            int i19 = 0;
            for (java.lang.Object obj6 : linkedList2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.kv1 kv1Var6 = (r45.kv1) obj6;
                ce2.i b19 = ce2.i.U1.b(kv1Var6);
                java.lang.Integer num3 = (java.lang.Integer) hashMap.get(kv1Var6.m75945x2fec8307(0));
                b19.f67815x29d3a50c = num3 != null ? num3.intValue() : 0;
                b19.f67802xbb68387d = i19;
                dk2.u7 u7Var4 = dk2.u7.f315714a;
                java.util.Map map3 = dk2.u7.f315730q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map3, "<get-giftSortMap>(...)");
                map3.put(b19.f67814x2c488eb6, java.lang.Integer.valueOf(i19));
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().J0(b19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveGiftListResultProcessor", f335025a.c(kv1Var6));
                i19 = i27;
            }
        }
        dk2.u7.f315714a.m();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.Map map4 = dk2.u7.f315718e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map4, "<get-giftCache>(...)");
        synchronized (map4) {
            java.util.Iterator it12 = map4.entrySet().iterator();
            while (it12.hasNext()) {
                linkedList3.add(((java.util.Map.Entry) it12.next()).getValue());
            }
        }
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a1) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a1.class)) == null) {
            return;
        }
        a1Var.u1(linkedList3);
    }
}
