package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class z4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final int f190040d;

    /* renamed from: e, reason: collision with root package name */
    public final int f190041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c f190042f;

    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c, int i17, int i18) {
        this.f190042f = c13877xf5f46f3c;
        this.f190040d = i17;
        this.f190041e = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a5 a5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a5(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f190042f;
        java.util.ArrayList arrayList = null;
        if (c13877xf5f46f3c.f189058d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = c13877xf5f46f3c.m56353x743e55cc();
            a5Var.m56420x2a5f836b(m56353x743e55cc != null ? m56353x743e55cc.f189833a : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc2 = c13877xf5f46f3c.m56353x743e55cc();
            a5Var.m56421x73095078(m56353x743e55cc2 != null ? m56353x743e55cc2.f189834b : null);
        } else {
            a5Var.m56420x2a5f836b(bu2.d0.i(bu2.e0.f106031a, c13877xf5f46f3c.mo55586xaf11af30(), null, 2, null));
        }
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMixAllFeedLoader_");
        sb6.append(this.f190040d);
        sb6.append('_');
        sb6.append(this.f190041e);
        sb6.append(" fetchInit incrementList size=");
        java.util.List m56409x97891cf7 = a5Var.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        sb6.append(' ');
        java.util.List<so2.j5> m56409x97891cf72 = a5Var.m56409x97891cf7();
        if (m56409x97891cf72 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m56409x97891cf72, 10));
            for (so2.j5 j5Var : m56409x97891cf72) {
                arrayList.add("type=" + j5Var.h() + ",id=" + j5Var.mo2128x1ed62e84());
            }
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        return a5Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        int i19;
        int i27;
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.List list2;
        if (!(iVar instanceof bq.b0) || !(fVar instanceof r45.x61)) {
            return null;
        }
        int i28 = this.f190040d;
        int i29 = this.f190041e;
        int i37 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f190042f;
        int i38 = 1;
        if (i17 == 0 && i18 == 0) {
            int i39 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c.f189057m;
            int i47 = i28 != 1 ? i28 != 2 ? i28 != 4 ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd : i29 == 2 ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb : 8388608 : 256 : 4;
            if (i29 > 0) {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                r45.x61 x61Var = (r45.x61) fVar;
                java.util.LinkedList<r45.cc1> m75941xfb821914 = x61Var.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItem(...)");
                for (r45.cc1 cc1Var : m75941xfb821914) {
                    if (cc1Var.m75939xb282bd08(i37) == 0) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) cc1Var.m75936x14adae67(i38);
                        if (c19792x256d2725 != null && hc2.o0.C(c19792x256d2725)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, i47);
                            r45.qt2 m56354xfe9224be = c13877xf5f46f3c.m56354xfe9224be();
                            a17.m59358xc5f6eaef(m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(5) : 0);
                            linkedList3.addLast(cu2.u.f303974a.p(a17));
                        }
                    } else if (cc1Var.m75939xb282bd08(i37) == 1) {
                        linkedList3.addLast(new so2.a0(cc1Var));
                    }
                    i37 = 0;
                    i38 = 1;
                }
                bq.b0 b0Var = (bq.b0) iVar;
                b0Var.f105010p = linkedList3;
                java.lang.String m56464xb5886c64 = m56464xb5886c64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd tabFlag:");
                sb6.append(i28);
                sb6.append(" itemFlag:");
                sb6.append(i29);
                sb6.append(" sourceType:");
                sb6.append(i47);
                sb6.append(" interactionList:");
                java.util.LinkedList linkedList4 = b0Var.f105010p;
                sb6.append(linkedList4 != null ? java.lang.Integer.valueOf(linkedList4.size()) : null);
                sb6.append(", continueFlag:");
                sb6.append(x61Var.m75939xb282bd08(2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
                if (c13877xf5f46f3c.m56357x44e5026c() == null) {
                    java.util.LinkedList linkedList5 = new java.util.LinkedList();
                    java.util.LinkedList<so2.j5> linkedList6 = b0Var.f105010p;
                    if (linkedList6 != null) {
                        for (so2.j5 j5Var : linkedList6) {
                            if (j5Var instanceof so2.a0) {
                                linkedList5.add(new bu2.j0(i47, (so2.a0) j5Var));
                            } else if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                                long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                                linkedList5.add(new bu2.k0(0, mo2128x1ed62e84, abstractC14490x69736cb5.getFeedObject().getFeedObject(), i47, abstractC14490x69736cb5.getIsUnReadCacheFeed()));
                            }
                        }
                    }
                    java.lang.String f17 = xy2.c.f(c13877xf5f46f3c.m56354xfe9224be());
                    int a18 = hc2.d0.a(i47);
                    if ((f17.length() > 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, g92.b.f351302e.T0()) && a18 == 1) {
                        a18 = 3;
                    }
                    bu2.e0.f106031a.a(a18, f17, linkedList5);
                }
            } else {
                r45.x61 x61Var2 = (r45.x61) fVar;
                java.util.LinkedList m75941xfb8219142 = x61Var2.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
                if (m75941xfb8219142.size() > 0) {
                    java.lang.Object obj = m75941xfb8219142.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "onGYNetEnd list:" + m75941xfb8219142.size() + " firstItem:" + pm0.b0.g((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj));
                }
                java.lang.String m56464xb5886c642 = m56464xb5886c64();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onGYNetEnd list:");
                sb7.append(m75941xfb8219142.size());
                sb7.append(", continueFlag:");
                sb7.append(x61Var2.m75939xb282bd08(2));
                sb7.append(", maxId:");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.k0(m75941xfb8219142);
                sb7.append(c19792x256d27252 != null ? java.lang.Long.valueOf(c19792x256d27252.m76765xe2f6ac7()) : null);
                sb7.append(' ');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c642, sb7.toString());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb8219142) {
                    if (hc2.o0.C((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                bq.b0 b0Var2 = (bq.b0) iVar;
                cu2.t tVar = cu2.u.f303974a;
                b0Var2.f105009o = tVar.j(arrayList2, i47, c13877xf5f46f3c.m56354xfe9224be());
                if (c13877xf5f46f3c.m56357x44e5026c() == null && (list2 = b0Var2.f105009o) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
                    }
                    tVar.m(arrayList3, i47, "", true);
                }
            }
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.x61) fVar).m75939xb282bd08(2) != 1) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a5 a5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.a5(i17, i18, str);
        bq.b0 b0Var3 = (bq.b0) iVar;
        if (i29 > 0) {
            b0Var3.getClass();
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            i19 = 1;
            if (pm0.v.z(i29, 1) && pm0.v.z(i29, 2)) {
                java.util.LinkedList linkedList8 = b0Var3.f105010p;
                if (linkedList8 != null) {
                    linkedList7.addAll(linkedList8);
                }
                i27 = 2;
            } else {
                if (pm0.v.z(i29, 1) && (linkedList2 = b0Var3.f105010p) != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : linkedList2) {
                        if (obj3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            arrayList4.add(obj3);
                        }
                    }
                    linkedList7.addAll(arrayList4);
                }
                i27 = 2;
                if (pm0.v.z(i29, 2) && (linkedList = b0Var3.f105010p) != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : linkedList) {
                        if (obj4 instanceof so2.a0) {
                            arrayList5.add(obj4);
                        }
                    }
                    linkedList7.addAll(arrayList5);
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("getAllItemInfo itemFlag=");
            sb8.append(i29);
            sb8.append(" videoList:");
            java.util.List list3 = b0Var3.f105009o;
            sb8.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
            sb8.append(", interactionList:");
            java.util.LinkedList linkedList9 = b0Var3.f105010p;
            sb8.append(linkedList9 != null ? java.lang.Integer.valueOf(linkedList9.size()) : null);
            sb8.append(" resultList:");
            sb8.append(linkedList7.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetAllListCgi", sb8.toString());
            list = linkedList7;
        } else {
            i19 = 1;
            i27 = 2;
            java.util.List list4 = b0Var3.f105009o;
            if (list4 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list4, 10));
                java.util.Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()));
                }
                list = kz5.n0.V0(arrayList6);
            } else {
                list = null;
            }
        }
        if (c13877xf5f46f3c.f189058d && list != null) {
            pm0.v.c0(list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y4.f190010d);
        }
        a5Var.m56420x2a5f836b(list);
        a5Var.m56423xd4b4a5a1(c13877xf5f46f3c.m56357x44e5026c() == null ? i19 : i27);
        a5Var.m56421x73095078(((r45.x61) fVar).m75934xbce7f2f(3));
        a5Var.m56419xdac5ee4d(z17);
        java.lang.String m56464xb5886c643 = m56464xb5886c64();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("FinderMixAllFeedLoader_");
        sb9.append(i28);
        sb9.append('_');
        sb9.append(i29);
        sb9.append(" dealOnSceneEnd pullType=");
        sb9.append(a5Var.getPullType());
        sb9.append(" dataList(");
        sb9.append(c13877xf5f46f3c.m56387xe6796cde().hashCode());
        sb9.append(") size=");
        sb9.append(c13877xf5f46f3c.m56387xe6796cde().size());
        sb9.append(" incrementList size=");
        java.util.List m56409x97891cf7 = a5Var.m56409x97891cf7();
        sb9.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        sb9.append("(incrementListFromCgi size=");
        sb9.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb9.append(") ");
        java.util.List<so2.j5> m56409x97891cf72 = a5Var.m56409x97891cf7();
        if (m56409x97891cf72 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(m56409x97891cf72, 10));
            for (so2.j5 j5Var2 : m56409x97891cf72) {
                arrayList.add("type=" + j5Var2.h() + ",id=" + j5Var2.mo2128x1ed62e84());
            }
        } else {
            arrayList = null;
        }
        sb9.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c643, sb9.toString());
        return a5Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f190042f;
        return new bq.b0(this.f190040d, c13877xf5f46f3c.m56357x44e5026c(), c13877xf5f46f3c.m56354xfe9224be(), this.f190041e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13877xf5f46f3c c13877xf5f46f3c = this.f190042f;
        return new bq.b0(this.f190040d, c13877xf5f46f3c.m56357x44e5026c(), c13877xf5f46f3c.m56354xfe9224be(), this.f190041e);
    }
}
