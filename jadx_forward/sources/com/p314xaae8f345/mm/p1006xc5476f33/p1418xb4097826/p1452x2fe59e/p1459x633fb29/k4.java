package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class k4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 f189647d;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 c13874xe0639df1) {
        this.f189647d = c13874xe0639df1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i4 i4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i4(0, 0, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 c13874xe0639df1 = this.f189647d;
        java.util.List m56483x2ace505d = m56483x2ace505d(arrayList, c13874xe0639df1.f189040e, 0, Integer.MAX_VALUE);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (c13874xe0639df1.f189043h == 0) {
            java.util.Iterator it = m56483x2ace505d.iterator();
            while (it.hasNext()) {
                arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
            }
        }
        i4Var.m56420x2a5f836b(arrayList2);
        return i4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.List j17;
        java.lang.Object obj;
        if (!(iVar instanceof bq.w) || !(fVar instanceof r45.pr0)) {
            return null;
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.pr0) fVar).f464857f == 0) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i4 i4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i4(i17, i18, str);
        r45.pr0 pr0Var = (r45.pr0) fVar;
        java.util.LinkedList linkedList = pr0Var.f464855d;
        boolean z18 = linkedList == null || linkedList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 c13874xe0639df1 = this.f189647d;
        if (z18) {
            j17 = kz5.p0.f395529d;
        } else {
            cu2.t tVar = cu2.u.f303974a;
            java.util.LinkedList object = pr0Var.f464855d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object, "object");
            j17 = tVar.j(object, 73728, c13874xe0639df1.m56354xfe9224be());
        }
        bq.w wVar = (bq.w) iVar;
        if (wVar.f105070p == 0) {
            j17 = m56483x2ace505d(j17, wVar.f105069o, 0, Integer.MAX_VALUE);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next());
            int i19 = c13874xe0639df1.f189043h;
            if (i19 == 0) {
                p17.getUdfKv().put("tab_seat", "视频");
            } else if (i19 == 1) {
                p17.getUdfKv().put("tab_seat", "直播回放");
            }
            arrayList.add(p17);
        }
        i4Var.m56420x2a5f836b(arrayList);
        if (wVar.f105070p != 2) {
            java.util.List m56409x97891cf7 = i4Var.m56409x97891cf7();
            if (!(m56409x97891cf7 instanceof java.util.List)) {
                m56409x97891cf7 = null;
            }
            if (m56409x97891cf7 != null) {
                cu2.u.f303974a.m(m56409x97891cf7, 73728, "", true);
            }
        }
        java.util.LinkedList<java.lang.Long> preload_object_list = pr0Var.f464858g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(preload_object_list, "preload_object_list");
        for (java.lang.Long l17 : preload_object_list) {
            java.util.LinkedList object2 = pr0Var.f464855d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object2, "object");
            java.util.Iterator it6 = object2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (l17 != null && ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj).m76784x5db1b11() == l17.longValue()) {
                    break;
                }
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
            if (c19792x256d2725 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).Bi(c19792x256d2725, 204, 1);
            }
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        java.lang.String str2 = c13874xe0639df1.f189040e;
        java.lang.String f17 = xy2.c.f(c13874xe0639df1.m56354xfe9224be());
        java.util.LinkedList object3 = pr0Var.f464855d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(object3, "object");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(object3, 10));
        java.util.Iterator it7 = object3.iterator();
        while (it7.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it7.next()).m76784x5db1b11()));
        }
        ((c61.p2) ybVar).Rj(str2, f17, arrayList2);
        java.lang.String m56464xb5886c64 = m56464xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
        java.util.List m56409x97891cf72 = i4Var.m56409x97891cf7();
        sb6.append(m56409x97891cf72 != null ? java.lang.Integer.valueOf(m56409x97891cf72.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
        i4Var.m56423xd4b4a5a1(wVar.f105070p);
        i4Var.m56421x73095078(pr0Var.f464856e);
        i4Var.m56419xdac5ee4d(z17);
        return i4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 c13874xe0639df1 = this.f189647d;
        return new bq.w(c13874xe0639df1.m56354xfe9224be(), c13874xe0639df1.f189040e, c13874xe0639df1.f189041f, c13874xe0639df1.m56357x44e5026c(), c13874xe0639df1.f189043h, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 c13874xe0639df1 = this.f189647d;
        return new bq.w(c13874xe0639df1.m56354xfe9224be(), c13874xe0639df1.f189040e, c13874xe0639df1.f189041f, null, c13874xe0639df1.f189043h, 0);
    }

    /* renamed from: mergeLocalData */
    public final java.util.List m56483x2ace505d(java.util.List list, java.lang.String str, int i17, int i18) {
        boolean z17;
        boolean z18;
        if (!(str.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13874xe0639df1 c13874xe0639df1 = this.f189647d;
            r45.qt2 m56354xfe9224be = c13874xe0639df1.m56354xfe9224be();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m56354xfe9224be != null ? m56354xfe9224be.m75945x2fec8307(18) : null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.f35742x233c02ec.getClass();
                z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.f35743x3de9e33;
                if (z17) {
                    hc2.j0.a(list, "nowList");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "mergeLocalData start " + i17 + " end " + i18);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList h17 = cu2.u.f303974a.h(str, i17, i18);
                java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : h17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
                    if (c14994x9b99c079.m59240x7c94657b().m76805x2dd7a70f() != 2 && c14994x9b99c079.m59315x31740422() && (c13874xe0639df1.mo56129x53879461() & c14994x9b99c079.m59261x994d4fc7()) > 0 && !c14994x9b99c079.m59324x23bb7e16()) {
                        arrayList.add(obj);
                    }
                }
                linkedList.addAll(list);
                pm0.v.b0(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.j4(list));
                linkedList.addAll(0, arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.f35742x233c02ec.getClass();
                z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.p0.f35743x3de9e33;
                if (z18) {
                    hc2.j0.a(linkedList, "newList");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "dblist size:" + arrayList.size());
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 : arrayList) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "dblist item, localId:" + c14994x9b99c0792.m59260x51f8f5b0() + ", id:" + c14994x9b99c0792.m59251x5db1b11());
                }
                return linkedList;
            }
        }
        return list;
    }
}
