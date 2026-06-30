package sp2;

/* loaded from: classes2.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.z3 f492833a = new sp2.z3();

    /* renamed from: b, reason: collision with root package name */
    public static r45.xs2 f492834b;

    public final java.util.ArrayList a(r45.fa2 container, boolean z17, r45.qt2 contextObj) {
        r45.wz2 wz2Var;
        java.lang.String str;
        r45.yk2 yk2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.ea2> card_list = container.f455662h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_list, "card_list");
        for (r45.ea2 ea2Var : card_list) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ea2Var.m75936x14adae67(2);
            so2.j5 j5Var = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = c19792x256d2725 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.Z(cu2.u.f303974a.j(kz5.b0.c(c19792x256d2725), hc2.d0.d(0), contextObj)) : null;
            int m75939xb282bd08 = ea2Var.m75939xb282bd08(1);
            if (m75939xb282bd08 != 4) {
                if (m75939xb282bd08 != 6) {
                    if (m75939xb282bd08 == 11) {
                        r45.le1 le1Var = (r45.le1) ea2Var.m75936x14adae67(12);
                        if (le1Var != null && (wz2Var = le1Var.A) != null) {
                            xq2.b bVar = (xq2.b) pf5.u.f435469a.e(c61.l7.class).a(xq2.b.class);
                            r45.le1 le1Var2 = (r45.le1) ea2Var.m75936x14adae67(12);
                            if (le1Var2 == null || (str = le1Var2.f460888o) == null) {
                                str = "";
                            }
                            bVar.getClass();
                            bVar.f537574i.put(str, wz2Var);
                        }
                        r45.le1 le1Var3 = (r45.le1) ea2Var.m75936x14adae67(12);
                        if (le1Var3 != null) {
                            j5Var = new vp2.w(le1Var3, container);
                        }
                    } else if (m75939xb282bd08 != 15) {
                        if (m75939xb282bd08 == 16 && (yk2Var = (r45.yk2) ea2Var.m75936x14adae67(17)) != null) {
                            j5Var = new vp2.y(yk2Var, container);
                        }
                    } else if (c14994x9b99c079 != null) {
                        j5Var = new vp2.a0(c14994x9b99c079, ea2Var, container, ea2Var.m75945x2fec8307(8), z17);
                    }
                } else if (c14994x9b99c079 != null) {
                    java.util.LinkedList m75941xfb821914 = ea2Var.m75941xfb821914(5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRelate_living(...)");
                    j5Var = new vp2.z(c14994x9b99c079, ea2Var, container, m75941xfb821914, (r45.c72) ea2Var.m75936x14adae67(9), ea2Var.m75945x2fec8307(8), z17);
                }
            } else if (c14994x9b99c079 != null) {
                j5Var = new vp2.x(c14994x9b99c079, ea2Var, container, ea2Var.m75945x2fec8307(8), z17);
            }
            if (j5Var != null) {
                arrayList.add(j5Var);
            }
        }
        return arrayList;
    }

    public final boolean b(java.util.List targetList, r45.ea2 card, yp2.a item, r45.qt2 qt2Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792;
        r45.pw1 pw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetList, "targetList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(card, "card");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int m75939xb282bd08 = card.m75939xb282bd08(1);
        if (m75939xb282bd08 == 4) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) card.m75936x14adae67(2);
            if (c19792x256d2725 != null && (c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.Z(cu2.u.f303974a.j(kz5.b0.c(c19792x256d2725), hc2.d0.d(0), qt2Var))) != null) {
                targetList.add(new vp2.d0(c14994x9b99c079, card, item.e(), card.m75945x2fec8307(8), z17));
                return true;
            }
        } else if (m75939xb282bd08 == 5) {
            r45.oa2 oa2Var = (r45.oa2) card.m75936x14adae67(4);
            if (oa2Var != null) {
                targetList.add(new vp2.e0(oa2Var, item.e()));
                return true;
            }
        } else if (m75939xb282bd08 == 6) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) card.m75936x14adae67(2);
            if (c19792x256d27252 != null && (c14994x9b99c0792 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) kz5.n0.Z(cu2.u.f303974a.j(kz5.b0.c(c19792x256d27252), hc2.d0.d(0), qt2Var))) != null) {
                r45.fa2 e17 = item.e();
                java.util.LinkedList m75941xfb821914 = card.m75941xfb821914(5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRelate_living(...)");
                targetList.add(new vp2.j0(c14994x9b99c0792, card, e17, m75941xfb821914, (r45.c72) card.m75936x14adae67(9), card.m75945x2fec8307(8), z17));
                return true;
            }
        } else if (m75939xb282bd08 == 7) {
            r45.na2 na2Var = (r45.na2) card.m75936x14adae67(6);
            if (na2Var != null) {
                targetList.add(new vp2.r(na2Var, item.e()));
                return true;
            }
        } else if (m75939xb282bd08 == 17 && (pw1Var = (r45.pw1) card.m75936x14adae67(18)) != null) {
            targetList.add(new vp2.s(pw1Var, item.e()));
            return true;
        }
        return false;
    }

    public final void c(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof vp2.x) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2.f203576n.a((wp2.b) j5Var, true);
            } else if (j5Var instanceof vp2.z) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x4.f203563n.a((vp2.j0) j5Var, true);
            } else if (j5Var instanceof vp2.a0) {
                wp2.b item = (wp2.b) j5Var;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
                java.lang.String str = item.f529919r;
                java.lang.String str2 = str == null ? "" : str;
                r45.mb4 mb4Var = item.getFeedObject().m59311x25315bf4() ? (r45.mb4) kz5.n0.X(item.getFeedObject().m59259x7dea7760()) : (r45.mb4) kz5.n0.X(item.getFeedObject().m59264x7efe73ec());
                if (str2.length() == 0) {
                    str2 = zl2.q4.f555466a.y(mb4Var, 1);
                    if (!(str2.length() > 0)) {
                        if (str == null) {
                            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            str = m75945x2fec8307.concat(m75945x2fec83072);
                        }
                        str2 = str;
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(mb4Var.m75945x2fec8307(1));
                    java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
                    sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
                    str2 = sb6.toString();
                }
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.e().b(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411501v)).a();
            }
        }
    }
}
