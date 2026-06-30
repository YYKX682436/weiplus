package so2;

/* loaded from: classes2.dex */
public final class g3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.g3 f491894d = new so2.g3();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        int i17;
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        so2.x5 x5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i18 = it.what;
        int i19 = 3;
        int i27 = 1;
        if (i18 == 0) {
            java.lang.Object obj = it.obj;
            if (obj instanceof java.util.LinkedList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.MarkReadStat>");
                int i28 = 0;
                for (r45.ni4 ni4Var : (java.util.LinkedList) obj) {
                    so2.h3 h3Var = so2.h3.f491925d;
                    int m75939xb282bd08 = ni4Var.m75939xb282bd08(i27);
                    long m75942xfb822ef2 = ni4Var.m75942xfb822ef2(0);
                    int m75939xb282bd082 = ni4Var.m75939xb282bd08(11);
                    long m75942xfb822ef22 = ni4Var.m75942xfb822ef2(14);
                    java.util.Iterator it6 = so2.h3.f491928g.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = 0;
                            break;
                        }
                        r45.ni4 ni4Var2 = (r45.ni4) it6.next();
                        if (ni4Var2.m75939xb282bd08(i27) == m75939xb282bd08 && ni4Var2.m75942xfb822ef2(0) == m75942xfb822ef2 && ni4Var2.m75939xb282bd08(11) == m75939xb282bd082 && ni4Var2.m75942xfb822ef2(14) == m75942xfb822ef22) {
                            i17 = i27;
                            break;
                        }
                    }
                    jz5.f0 f0Var3 = jz5.f0.f384359a;
                    if (i17 == 0) {
                        i28++;
                        so2.h3.f491928g.add(ni4Var);
                        java.util.HashMap hashMap = (java.util.HashMap) so2.h3.f491932n.get(java.lang.Integer.valueOf((ni4Var.m75939xb282bd08(i19) == 156 || ni4Var.m75939xb282bd08(i19) == 155 || ni4Var.m75939xb282bd08(i19) == 171) ? 17 : ni4Var.m75939xb282bd08(i19)));
                        if (hashMap != null && (x5Var = (so2.x5) hashMap.get(java.lang.Long.valueOf(ni4Var.m75942xfb822ef2(0)))) != null) {
                            x5Var.f492233e = true;
                            x5Var.f492235g = ni4Var;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(ni4Var.m75942xfb822ef2(0));
                        if (h17 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "mark read scene:" + ni4Var.m75939xb282bd08(1) + ", subScene:" + ni4Var.m75939xb282bd08(2) + ", commScene:" + ni4Var.m75939xb282bd08(3) + ", " + pm0.v.u(ni4Var.m75942xfb822ef2(0)) + ", nickname:" + h17.m59273x80025a04() + ", desc:" + hc2.o0.l(h17.getFeedObject()) + ", expose:" + ni4Var.m75939xb282bd08(5) + ", actionType=" + ni4Var.m75939xb282bd08(11) + ", area_id=" + ni4Var.m75942xfb822ef2(14));
                            f0Var2 = f0Var3;
                        } else {
                            f0Var2 = null;
                        }
                        if (f0Var2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "mark read ".concat(pm0.v.u(ni4Var.m75942xfb822ef2(0))));
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h18 = bu2.j.f106067a.h(ni4Var.m75942xfb822ef2(0));
                        if (h18 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "contains read scene:" + ni4Var.m75939xb282bd08(1) + ", subScene:" + ni4Var.m75939xb282bd08(2) + ", commScene:" + ni4Var.m75939xb282bd08(3) + ", " + pm0.v.u(ni4Var.m75942xfb822ef2(0)) + ", nickname:" + h18.m59273x80025a04() + ", desc:" + hc2.o0.l(h18.getFeedObject()) + "}, expose:" + ni4Var.m75939xb282bd08(5) + ", actionType=" + ni4Var.m75939xb282bd08(11) + ", area_id=" + ni4Var.m75942xfb822ef2(14));
                            f0Var = f0Var3;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            so2.h3 h3Var2 = so2.h3.f491925d;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "contains read ".concat(pm0.v.u(ni4Var.m75942xfb822ef2(0))));
                        }
                    }
                    i19 = 3;
                    i27 = 1;
                }
                int size = so2.h3.f491928g.size();
                int i29 = 1000;
                if (size > 1000 && 1000 <= size) {
                    while (true) {
                        so2.h3.f491928g.removeFirst();
                        if (i29 == size) {
                            break;
                        }
                        i29++;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("final add ");
                sb6.append(i28);
                sb6.append(' ');
                sb6.append(size);
                sb6.append(' ');
                so2.h3 h3Var3 = so2.h3.f491925d;
                sb6.append(so2.h3.f491928g.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", sb6.toString());
                so2.h3.a(h3Var3);
                if (i28 > 0) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkSend: size = ");
                    sb7.append(so2.h3.f491928g.size());
                    sb7.append(" feedCountThreshold：");
                    jz5.g gVar = so2.h3.f491929h;
                    sb7.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", sb7.toString());
                    if (so2.h3.f491928g.size() >= ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue()) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = so2.h3.f491930i;
                        n3Var.mo50303x856b99f0(1);
                        n3Var.mo50305x3d8a09a2(1);
                    }
                }
            }
        } else if (i18 == 1) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("SEND markReadItemList size: ");
            so2.h3 h3Var4 = so2.h3.f491925d;
            sb8.append(so2.h3.f491928g.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", sb8.toString());
            if (so2.h3.f491928g.size() > 0) {
                so2.h3.b(h3Var4);
                h3Var4.i();
            }
        } else if (i18 == 2) {
            java.lang.Object obj2 = it.obj;
            if (obj2 instanceof java.util.LinkedList) {
                so2.h3 h3Var5 = so2.h3.f491925d;
                java.util.LinkedList linkedList = so2.h3.f491928g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.MarkReadStat>");
                linkedList.removeAll((java.util.LinkedList) obj2);
                so2.h3.a(h3Var5);
            }
        } else if (i18 == 3) {
            so2.h3 h3Var6 = so2.h3.f491925d;
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183678n + "markread.info";
            if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
                r45.qf2 qf2Var = new r45.qf2();
                try {
                    qf2Var.mo11468x92b714fd(N);
                    java.util.LinkedList m75941xfb821914 = qf2Var.m75941xfb821914(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getReadStats(...)");
                    so2.h3.f491928g = m75941xfb821914;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderMarkReadLogic", e17, "read", new java.lang.Object[0]);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadLogic", "readFromFile " + str);
            }
        } else if (i18 == 4) {
            so2.h3.a(so2.h3.f491925d);
        } else if (i18 == 5) {
            so2.h3.b(so2.h3.f491925d);
            so2.h3.f491932n = new java.util.HashMap();
        }
        return false;
    }
}
