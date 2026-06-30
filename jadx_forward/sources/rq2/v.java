package rq2;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.v f480424a = new rq2.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f480425b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f480426c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f480427d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f480428e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f480429f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.LinkedList f480430g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.LinkedList f480431h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.LinkedList f480432i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.LinkedList f480433j = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.LinkedList f480434k = new java.util.LinkedList();

    public final java.util.List a(int i17) {
        if (i17 == 15) {
            return f480429f;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                return f480432i;
            }
            if (i17 != 94) {
                return new java.util.LinkedList();
            }
        }
        return f480426c;
    }

    public final java.util.List b(int i17) {
        if (i17 == 15) {
            return f480428e;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                return f480431h;
            }
            if (i17 != 94) {
                return new java.util.LinkedList();
            }
        }
        return f480425b;
    }

    public java.util.List c(int i17) {
        java.util.List d17 = d(i17);
        for (r45.ni4 ni4Var : a(i17)) {
            for (so2.j5 j5Var : f480424a.b(i17)) {
                if (ni4Var.m75942xfb822ef2(0) == j5Var.mo2128x1ed62e84()) {
                    java.util.Iterator it = d17.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        }
                        if (((r45.ni4) it.next()).m75942xfb822ef2(0) == ni4Var.m75942xfb822ef2(0)) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 < 0) {
                        ni4Var.set(5, java.lang.Integer.valueOf((int) (c01.id.c() - ni4Var.m75939xb282bd08(5))));
                        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).g0());
                        }
                        ni4Var.m75942xfb822ef2(0);
                        ni4Var.m75939xb282bd08(5);
                        ni4Var.m75945x2fec8307(4);
                        ((java.util.LinkedList) d17).add(ni4Var);
                    }
                }
            }
        }
        return d17;
    }

    public final java.util.List d(int i17) {
        if (i17 == 15) {
            return f480430g;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                return f480433j;
            }
            if (i17 != 94) {
                return new java.util.LinkedList();
            }
        }
        return f480427d;
    }

    public java.util.List e(int i17, int i18) {
        java.util.LinkedList linkedList = f480434k;
        linkedList.clear();
        for (so2.j5 j5Var : b(i17)) {
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                java.util.Iterator it = f480424a.d(i17).iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    if (((r45.ni4) it.next()).m75942xfb822ef2(0) == j5Var.mo2128x1ed62e84()) {
                        break;
                    }
                    i19++;
                }
                if (i19 < 0) {
                    r45.e13 e13Var = new r45.e13();
                    e13Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()));
                    e13Var.set(1, abstractC14490x69736cb5.getFeedObject().getFeedObject().m76803x6c285d75());
                    e13Var.set(2, java.lang.Integer.valueOf(i18));
                    e13Var.set(3, abstractC14490x69736cb5.getFeedObject().getFeedObject().m76829x97edf6c0());
                    e13Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11()));
                    e13Var.set(1, abstractC14490x69736cb5.getFeedObject().m59276x6c285d75());
                    linkedList.add(e13Var);
                }
            }
        }
        ((java.util.LinkedList) b(i17)).size();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        ((java.util.LinkedList) d(i17)).size();
        linkedList.size();
        return linkedList;
    }

    public boolean f(int i17) {
        return i17 == 15 || i17 == 76 || i17 == 80 || i17 == 94;
    }

    public final void g(int i17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        for (so2.j5 j5Var : b(i17)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.ni4 ni4Var = (r45.ni4) it.next();
                if (j5Var.mo2128x1ed62e84() == ni4Var.m75942xfb822ef2(0)) {
                    rq2.v vVar = f480424a;
                    java.util.Iterator it6 = vVar.d(i17).iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            i18 = -1;
                            break;
                        } else if (((r45.ni4) it6.next()).m75942xfb822ef2(0) == j5Var.mo2128x1ed62e84()) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i18 < 0) {
                        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).g0());
                        }
                        ((java.util.LinkedList) vVar.d(i17)).add(ni4Var);
                    }
                }
            }
        }
    }

    public final void h(int i17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        list.size();
        if (i17 == 15) {
            f480430g.clear();
            f480429f.clear();
            java.util.LinkedList linkedList = f480428e;
            linkedList.clear();
            linkedList.addAll(list);
            return;
        }
        if (i17 != 76) {
            if (i17 == 80) {
                f480433j.clear();
                f480432i.clear();
                java.util.LinkedList linkedList2 = f480431h;
                linkedList2.clear();
                linkedList2.addAll(list);
                return;
            }
            if (i17 != 94) {
                return;
            }
        }
        f480427d.clear();
        f480426c.clear();
        java.util.LinkedList linkedList3 = f480425b;
        linkedList3.clear();
        linkedList3.addAll(list);
    }
}
