package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 f189738d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a1) {
        this.f189738d = c13852x2d33c3a1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: callInit */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo982xf5b0f48e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o(0, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56353x743e55cc = this.f189738d.m56353x743e55cc();
        if (m56353x743e55cc != null) {
            oVar.m56420x2a5f836b(m56353x743e55cc.f189833a);
            oVar.m56421x73095078(m56353x743e55cc.f189834b);
        }
        return oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        boolean z17;
        r45.vx0 vx0Var;
        if (!(iVar instanceof db2.o0) || !(fVar instanceof r45.d51)) {
            return null;
        }
        boolean z18 = (i17 == 0 && i18 == 0 && ((r45.d51) fVar).m75939xb282bd08(3) == 0) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.o(i17, i18, str);
        oVar.m56419xdac5ee4d(z18);
        db2.o0 o0Var = (db2.o0) iVar;
        oVar.m56423xd4b4a5a1(o0Var.f309637t);
        if (i17 == 0 && i18 == 0) {
            r45.d51 d51Var = (r45.d51) fVar;
            oVar.m56421x73095078(d51Var.m75934xbce7f2f(4));
            if (o0Var.f309637t == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.vx0> m75941xfb821914 = d51Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCollection_info(...)");
                for (r45.vx0 vx0Var2 : m75941xfb821914) {
                    java.util.AbstractCollection<so2.j5> m56387xe6796cde = this.f189738d.m56387xe6796cde();
                    if (!(m56387xe6796cde instanceof java.util.Collection) || !m56387xe6796cde.isEmpty()) {
                        for (so2.j5 j5Var : m56387xe6796cde) {
                            ms2.b bVar = j5Var instanceof ms2.b ? (ms2.b) j5Var : null;
                            if ((bVar == null || (vx0Var = bVar.f412501d) == null || vx0Var.m75942xfb822ef2(0) != vx0Var2.m75942xfb822ef2(0)) ? false : true) {
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (!z17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vx0Var2);
                        arrayList.add(new ms2.b(vx0Var2));
                    }
                }
                oVar.m56420x2a5f836b(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64(), "enter, audio collection incrementList size=" + arrayList.size() + ", cgiDataSize=" + d51Var.m75941xfb821914(1).size() + ", hasMore=" + z18);
            } else {
                java.util.LinkedList<r45.vx0> m75941xfb8219142 = d51Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getCollection_info(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                for (r45.vx0 vx0Var3 : m75941xfb8219142) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vx0Var3);
                    arrayList2.add(new ms2.b(vx0Var3));
                }
                oVar.m56420x2a5f836b(arrayList2);
                java.lang.String m56464xb5886c64 = m56464xb5886c64();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bottom, audio collection incrementList size=");
                java.util.List m56409x97891cf7 = oVar.m56409x97891cf7();
                sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
                sb6.append(", hasMore=");
                sb6.append(z18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56464xb5886c64, sb6.toString());
            }
        }
        return oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a1 = this.f189738d;
        db2.o0 o0Var = new db2.o0(c13852x2d33c3a1.f188926d, c13852x2d33c3a1.m56357x44e5026c(), c13852x2d33c3a1.m56354xfe9224be(), 1, 0, 16, null);
        o0Var.f309637t = 2;
        return o0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a1 = this.f189738d;
        db2.o0 o0Var = new db2.o0(c13852x2d33c3a1.f188926d, null, c13852x2d33c3a1.m56354xfe9224be(), 1, 0, 16, null);
        o0Var.f309637t = 0;
        return o0Var;
    }
}
