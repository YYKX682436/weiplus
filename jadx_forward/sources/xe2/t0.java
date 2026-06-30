package xe2;

/* loaded from: classes3.dex */
public final class t0 extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        int i17;
        java.util.Iterator it;
        java.util.LinkedList linkedList;
        int i18;
        km2.b0 b0Var;
        int i19;
        java.lang.String str;
        int i27;
        java.lang.String str2;
        int i28;
        java.lang.String str3;
        int i29;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Class cls;
        java.util.List list;
        boolean z17;
        boolean z18;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa6;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa8;
        r45.xn1 xn1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        mm2.o4 o4Var = (mm2.o4) this.f526800a.a(mm2.o4.class);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = msgList.iterator();
        while (true) {
            i17 = 1;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kz5.z.F(o4Var.G1, ((r45.ch1) next).m75939xb282bd08(1))) {
                arrayList.add(next);
            }
        }
        linkedList2.addAll(arrayList);
        java.util.Iterator it7 = linkedList2.iterator();
        while (it7.hasNext()) {
            r45.ch1 ch1Var = (r45.ch1) it7.next();
            r45.lh1 lh1Var = new r45.lh1();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ch1Var.m75934xbce7f2f(4);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    lh1Var.mo11468x92b714fd(g17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            boolean booleanValue = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) o4Var.H).mo144003x754a37bb()).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "receive apply mic msg: [sessionId:" + ch1Var.m75945x2fec8307(7) + ", applyUserSdkId:" + lh1Var.m75945x2fec8307(10) + " seatPosition: " + lh1Var.m75939xb282bd08(i17) + "  confirm_expired_time: " + lh1Var.m75942xfb822ef2(12) + " autoLink: " + lh1Var.m75933x41a8a7f2(2) + " isPayMic: " + booleanValue + ']');
            java.lang.String m75945x2fec8307 = ch1Var.m75945x2fec8307(7);
            if (m75945x2fec8307 != null) {
                java.util.HashMap hashMap = o4Var.K;
                if (hashMap.get(m75945x2fec8307) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "has received mic apply, skip msg. sessionId:".concat(m75945x2fec8307));
                } else {
                    long m75942xfb822ef2 = lh1Var.m75942xfb822ef2(12) * 1000;
                    if (m75942xfb822ef2 <= 0 || c01.id.c() <= m75942xfb822ef2) {
                        hashMap.put(m75945x2fec8307, 0);
                        java.util.List list2 = o4Var.f410851o;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
                        kz5.h0.B(list2, new mm2.b4(lh1Var));
                        if (lh1Var.m75933x41a8a7f2(4)) {
                            int m75939xb282bd08 = lh1Var.m75939xb282bd08(7);
                            java.lang.String m75945x2fec83072 = lh1Var.m75945x2fec8307(5);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            b0Var = new km2.b0(m75939xb282bd08, m75945x2fec83072);
                        } else {
                            b0Var = null;
                        }
                        r45.xn1 xn1Var2 = (r45.xn1) ch1Var.m75936x14adae67(13);
                        if ((xn1Var2 != null ? (r45.vy1) xn1Var2.m75936x14adae67(18) : null) != null || (xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13)) == null) {
                            it = it7;
                        } else {
                            it = it7;
                            xn1Var.set(18, (r45.vy1) lh1Var.m75936x14adae67(8));
                        }
                        java.lang.String m75945x2fec83073 = lh1Var.m75945x2fec8307(10);
                        r45.xn1 xn1Var3 = (r45.xn1) ch1Var.m75936x14adae67(13);
                        if (xn1Var3 == null || (c19782x23db1cfa8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) {
                            i19 = 13;
                            str = null;
                        } else {
                            str = c19782x23db1cfa8.m76175x6d346f39();
                            i19 = 13;
                        }
                        r45.xn1 xn1Var4 = (r45.xn1) ch1Var.m75936x14adae67(i19);
                        if (xn1Var4 == null || (c19782x23db1cfa7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var4.m75936x14adae67(0)) == null) {
                            i27 = 13;
                            str2 = null;
                        } else {
                            str2 = c19782x23db1cfa7.m76197x6c03c64c();
                            i27 = 13;
                        }
                        r45.xn1 xn1Var5 = (r45.xn1) ch1Var.m75936x14adae67(i27);
                        km2.q qVar = new km2.q(m75945x2fec83073, str, str2, (xn1Var5 == null || (c19782x23db1cfa6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var5.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa6.m76184x8010e5e4(), lh1Var.m75939xb282bd08(0), ch1Var.m75945x2fec8307(7), null, false, ((mm2.c1) o4Var.m147920xbba4bfc0(mm2.c1.class)).l8(), null, null, 0, 0, false, null, false, lh1Var.m75939xb282bd08(11), (r45.xn1) ch1Var.m75936x14adae67(13), false, null, null, 0, lh1Var.m75939xb282bd08(1), 0L, null, null, m75942xfb822ef2, null, 0, 0L, null, null, null, -71500096, 1, null);
                        qVar.v(b0Var);
                        list2.add(qVar);
                        java.util.List list3 = o4Var.f410855q;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
                        kz5.h0.B(list3, new mm2.c4(lh1Var));
                        java.lang.String m75945x2fec83074 = lh1Var.m75945x2fec8307(10);
                        r45.xn1 xn1Var6 = (r45.xn1) ch1Var.m75936x14adae67(13);
                        if (xn1Var6 == null || (c19782x23db1cfa5 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var6.m75936x14adae67(0)) == null) {
                            i28 = 13;
                            str3 = null;
                        } else {
                            str3 = c19782x23db1cfa5.m76175x6d346f39();
                            i28 = 13;
                        }
                        r45.xn1 xn1Var7 = (r45.xn1) ch1Var.m75936x14adae67(i28);
                        if (xn1Var7 == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var7.m75936x14adae67(0)) == null) {
                            i29 = 13;
                            str4 = null;
                        } else {
                            str4 = c19782x23db1cfa4.m76197x6c03c64c();
                            i29 = 13;
                        }
                        r45.xn1 xn1Var8 = (r45.xn1) ch1Var.m75936x14adae67(i29);
                        km2.q qVar2 = new km2.q(m75945x2fec83074, str3, str4, (xn1Var8 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var8.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76184x8010e5e4(), lh1Var.m75939xb282bd08(0), ch1Var.m75945x2fec8307(7), null, false, ((mm2.c1) o4Var.m147920xbba4bfc0(mm2.c1.class)).l8(), null, null, 0, 0, false, null, false, lh1Var.m75939xb282bd08(11), (r45.xn1) ch1Var.m75936x14adae67(13), false, null, null, 0, lh1Var.m75939xb282bd08(1), 0L, null, null, m75942xfb822ef2, null, 0, 0L, null, null, null, -71500096, 1, null);
                        qVar2.v(b0Var);
                        list3.add(qVar2);
                        mm2.y2 y2Var = (mm2.y2) o4Var.m147920xbba4bfc0(mm2.y2.class);
                        r45.xn1 xn1Var9 = (r45.xn1) ch1Var.m75936x14adae67(13);
                        if (xn1Var9 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var9.m75936x14adae67(0)) == null || (str5 = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
                            str5 = "";
                        }
                        java.util.Map map = y2Var.A;
                        if (map.containsKey(str5)) {
                            dk2.b8 b8Var = (dk2.b8) map.get(str5);
                            long j17 = b8Var != null ? b8Var.f314775a : 0L;
                            java.lang.Integer valueOf = b8Var != null ? java.lang.Integer.valueOf(b8Var.f314776b) : null;
                            cls = mm2.y2.class;
                            long c17 = c01.id.c() - j17;
                            if (j17 <= 0 || c01.id.c() <= j17) {
                                list = list3;
                                z17 = false;
                            } else {
                                list = list3;
                                z17 = true;
                            }
                            linkedList = linkedList2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "isCanAutoAccept userName: " + str5 + " pos: " + valueOf + " curExpiredTime: " + j17 + " offestTime: " + c17 + " size: " + map.size());
                            z18 = z17 ^ true;
                        } else {
                            list = list3;
                            cls = mm2.y2.class;
                            linkedList = linkedList2;
                            z18 = false;
                        }
                        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                        if (dk2.ef.f314917g) {
                            r45.il4 il4Var = o4Var.U;
                            if ((pm0.v.z((int) (il4Var != null ? il4Var.f458662d : 0L), 16) || lh1Var.m75933x41a8a7f2(2) || z18) && !booleanValue) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "autoAccept, sessionId:" + m75945x2fec8307 + " mic_sdk_user_id: " + lh1Var.m75945x2fec8307(10) + " isPayMic: " + booleanValue);
                                java.lang.Class cls2 = cls;
                                if (((mm2.y2) o4Var.m147920xbba4bfc0(cls2)).O6(false)) {
                                    java.util.Iterator it8 = list2.iterator();
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        java.lang.Object next2 = it8.next();
                                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) next2).f390703a, lh1Var.m75945x2fec8307(10))) {
                                            obj = next2;
                                            break;
                                        }
                                    }
                                    km2.q qVar3 = (km2.q) obj;
                                    if (qVar3 != null) {
                                        if (z18) {
                                            mm2.y2 y2Var2 = (mm2.y2) o4Var.m147920xbba4bfc0(cls2);
                                            r45.xn1 xn1Var10 = (r45.xn1) ch1Var.m75936x14adae67(13);
                                            dk2.b8 b8Var2 = (dk2.b8) y2Var2.A.get((xn1Var10 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var10.m75936x14adae67(0)) == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c);
                                            if (b8Var2 != null) {
                                                qVar3.f390725w = b8Var2.f314776b;
                                            }
                                        }
                                        qVar3.z();
                                        o4Var.O7(qVar3);
                                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) o4Var.L).k(m75945x2fec8307);
                                    }
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "autoAccept fail, over size");
                                }
                            }
                        }
                        if (!booleanValue) {
                            mm2.g4 g4Var = mm2.g4.f410621d;
                            r45.il4 il4Var2 = o4Var.U;
                            if (pm0.v.z((int) (il4Var2 != null ? il4Var2.f458662d : 0L), 2)) {
                                kz5.h0.B(list2, new mm2.d4(g4Var));
                                kz5.h0.B(list, new mm2.e4(g4Var));
                            } else {
                                java.util.List list4 = list;
                                r45.il4 il4Var3 = o4Var.U;
                                i18 = 1;
                                if (pm0.v.z((int) (il4Var3 != null ? il4Var3.f458662d : 0L), 1)) {
                                    kz5.h0.B(list2, new mm2.f4(g4Var));
                                    kz5.h0.B(list4, new mm2.y3(g4Var));
                                } else {
                                    r45.il4 il4Var4 = o4Var.U;
                                    if (pm0.v.z((int) (il4Var4 != null ? il4Var4.f458662d : 0L), 4)) {
                                        kz5.h0.B(list2, new mm2.z3(g4Var));
                                        kz5.h0.B(list4, new mm2.a4(g4Var));
                                    }
                                }
                                i17 = i18;
                                linkedList2 = linkedList;
                                it7 = it;
                            }
                        }
                        i18 = 1;
                        i17 = i18;
                        linkedList2 = linkedList;
                        it7 = it;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "handleLinkMicMsg current apply has expired, applyExpiredTime: " + m75942xfb822ef2);
                    }
                }
            }
            it = it7;
            linkedList = linkedList2;
            i18 = i17;
            i17 = i18;
            linkedList2 = linkedList;
            it7 = it;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "handleLinkMicMsg applyMicMsgList:" + linkedList2);
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20003};
    }
}
