package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class a2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public int f189229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 f189230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8) {
        super(c13861xc72e20d8, false, 1, null);
        this.f189230b = c13861xc72e20d8;
        this.f189229a = 1000;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeDataAndNotify */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo1053x5ee561e(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 u0Var;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f189230b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13861xc72e20d8.getF204960d(), "mergeDataAndNotify originPullType:" + this.f189229a);
        int i19 = this.f189229a;
        int i27 = 0;
        if (i19 == 0) {
            this.f189229a = 1000;
            java.util.List arrayList = list == null ? new java.util.ArrayList() : list;
            m56455x94e0b8eb("newList", i17, arrayList);
            so2.j5 j5Var = (so2.j5) kz5.n0.Z(c13861xc72e20d8.m56387xe6796cde());
            if (j5Var != null) {
                java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> it = arrayList.iterator();
                int i28 = 0;
                while (true) {
                    i18 = -1;
                    if (!it.hasNext()) {
                        i28 = -1;
                        break;
                    }
                    if (((so2.j5) it.next()).mo2128x1ed62e84() == j5Var.mo2128x1ed62e84()) {
                        break;
                    }
                    i28++;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                int i29 = 0;
                for (java.lang.Object obj2 : arrayList) {
                    int i37 = i29 + 1;
                    if (i29 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var2 = (so2.j5) obj2;
                    if (i29 < i28) {
                        linkedList.add(j5Var2);
                    }
                    i29 = i37;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13861xc72e20d8.getF204960d(), "headSize %d ", java.lang.Integer.valueOf(linkedList.size()));
                if (linkedList.size() > 0) {
                    c13861xc72e20d8.m56387xe6796cde().addAll(0, linkedList);
                    c13861xc72e20d8.getDispatcher().d(0, linkedList.size());
                }
                so2.j5 j5Var3 = c13861xc72e20d8.B;
                if (j5Var3 != null) {
                    j5Var = j5Var3;
                }
                java.util.Iterator it6 = c13861xc72e20d8.m56387xe6796cde().iterator();
                int i38 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i38 = -1;
                        break;
                    }
                    if (((so2.j5) it6.next()).mo2128x1ed62e84() == j5Var.mo2128x1ed62e84()) {
                        break;
                    }
                    i38++;
                }
                if (i38 == -1) {
                    i38 = 0;
                }
                int size = c13861xc72e20d8.m56387xe6796cde().size();
                java.lang.String f204960d = c13861xc72e20d8.getF204960d();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(i38);
                objArr[1] = java.lang.Integer.valueOf(size);
                objArr[2] = java.lang.Boolean.valueOf(c13861xc72e20d8.B != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, "centerIndex %d oldSize %d useLast %b", objArr);
                int i39 = i38 + 1;
                if (i39 < size) {
                    c13861xc72e20d8.m56387xe6796cde().subList(i39, c13861xc72e20d8.m56387xe6796cde().size()).clear();
                }
                java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> it7 = arrayList.iterator();
                int i47 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    if (((so2.j5) it7.next()).mo2128x1ed62e84() == j5Var.mo2128x1ed62e84()) {
                        i18 = i47;
                        break;
                    }
                    i47++;
                }
                if (i18 >= i28) {
                    i28 = i18;
                }
                for (java.lang.Object obj3 : arrayList) {
                    int i48 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var4 = (so2.j5) obj3;
                    if (i27 > i28) {
                        linkedList2.add(j5Var4);
                    }
                    i27 = i48;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13861xc72e20d8.getF204960d(), "tailSize %d dataSize %d", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(c13861xc72e20d8.m56387xe6796cde().size()));
                c13861xc72e20d8.m56387xe6796cde().addAll(linkedList2);
                if (c13861xc72e20d8.m56387xe6796cde().size() > size) {
                    c13861xc72e20d8.getDispatcher().d(size, c13861xc72e20d8.m56387xe6796cde().size() - size);
                } else if (c13861xc72e20d8.m56387xe6796cde().size() < size) {
                    c13861xc72e20d8.getDispatcher().e(c13861xc72e20d8.m56387xe6796cde().size(), size - c13861xc72e20d8.m56387xe6796cde().size());
                }
                if (i39 < size) {
                    c13861xc72e20d8.getDispatcher().b(i39, linkedList2.size());
                }
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            linkedList3.addAll(arrayList);
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            linkedList4.add(0);
            u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, 0, linkedList4, false, false, 24, null);
            c13861xc72e20d8.m56387xe6796cde().addAll(linkedList3);
            c13861xc72e20d8.getDispatcher().a();
            m56455x94e0b8eb("dataList", i17, c13861xc72e20d8.m56387xe6796cde());
        } else {
            if (i19 != 19 || !c13861xc72e20d8.f188976q) {
                return super.mo1053x5ee561e(i17, list, z17, obj);
            }
            java.util.List arrayList2 = list == null ? new java.util.ArrayList() : list;
            u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(0, arrayList2.size(), new java.util.LinkedList(), false, false, 24, null);
            c13861xc72e20d8.m56387xe6796cde().addAll(0, arrayList2);
            c13861xc72e20d8.getDispatcher().d(0, arrayList2.size());
        }
        return u0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeLoadMore */
    public void mo1055x1f1ce1b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8 c13861xc72e20d8 = this.f189230b;
        if (c13861xc72e20d8.f188975p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 y1Var = response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1) response : null;
            this.f189229a = y1Var != null ? y1Var.f190005b : 1000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13861xc72e20d8.getF204960d(), "originPullType:" + this.f189229a);
        super.mo1055x1f1ce1b3(response, lVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (this.f189230b.f188976q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 y1Var = response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y1) response : null;
            this.f189229a = y1Var != null ? y1Var.f190005b : 1000;
        }
        super.mo1056x14dcd783(response, lVar);
    }
}
