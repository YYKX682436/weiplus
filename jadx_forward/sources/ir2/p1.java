package ir2;

/* loaded from: classes2.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.a1 f375739a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f375740b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f375741c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f375742d;

    /* renamed from: e, reason: collision with root package name */
    public final ir2.q1 f375743e;

    public p1(ir2.a1 loader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        this.f375739a = loader;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        this.f375740b = b17;
        this.f375741c = b17;
        this.f375742d = new java.util.ArrayList();
        this.f375743e = new ir2.q1();
        p3325xe03a0797.p3326xc267989b.l.d(loader.mo144225x95f74600(), null, null, new ir2.h1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void a(ir2.p1 p1Var, ir2.x xVar) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        int i19;
        so2.j5 j5Var;
        p1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "merge event:" + xVar);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!((java.util.ArrayList) p1Var.f375742d).isEmpty()) {
            java.util.ListIterator listIterator = ((java.util.ArrayList) p1Var.f375742d).listIterator();
            while (listIterator.hasNext()) {
                int nextIndex = listIterator.nextIndex();
                ir2.i1 i1Var = (ir2.i1) listIterator.next();
                long mo2128x1ed62e84 = i1Var.mo2128x1ed62e84();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "filterSnapShot index: " + nextIndex + " id:" + mo2128x1ed62e84 + " lastItem:" + i1Var);
                if (i1Var.f375688e == 1) {
                    hashSet.add(java.lang.Long.valueOf(mo2128x1ed62e84));
                    listIterator.remove();
                }
            }
        }
        ir2.a1 a1Var = p1Var.f375739a;
        java.util.List list = a1Var.f375624d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "filterOriginLoaderData");
        if (!hashSet.isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                if (hashSet.contains(java.lang.Long.valueOf(((so2.j5) it.next()).mo2128x1ed62e84()))) {
                    it.remove();
                }
            }
        }
        if (xVar instanceof ir2.r) {
            ir2.r rVar = (ir2.r) xVar;
            p1Var.e(new ir2.s1(rVar.f375745a), list, rVar.f375745a);
            return;
        }
        if (xVar instanceof ir2.v) {
            ir2.v vVar = (ir2.v) xVar;
            p1Var.e(new ir2.u1(vVar.f375761a), list, vVar.f375761a);
            return;
        }
        if (xVar instanceof ir2.t) {
            ir2.t tVar = (ir2.t) xVar;
            p1Var.e(new ir2.t1(tVar.f375751a), list, tVar.f375751a);
            return;
        }
        boolean z17 = xVar instanceof ir2.w;
        java.util.List dataList = a1Var.f375624d;
        java.lang.String str = null;
        str = null;
        if (z17) {
            ir2.w wVar = (ir2.w) xVar;
            long j17 = wVar.f375764a;
            ir2.a2 a2Var = wVar instanceof ir2.a2 ? (ir2.a2) wVar : null;
            java.lang.Object obj = a2Var != null ? a2Var.f375637e : null;
            ir2.a2 a2Var2 = (ir2.a2) wVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
            long j18 = a2Var2.f375764a;
            if (j18 != -1) {
                java.util.Iterator it6 = ((java.util.ArrayList) dataList).iterator();
                int i27 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    if ((((so2.j5) it6.next()).mo2128x1ed62e84() == j18) == true) {
                        i19 = i27;
                        break;
                    }
                    i27++;
                }
            } else {
                i19 = a2Var2.f375635c;
            }
            if (i19 >= 0) {
                java.util.ArrayList arrayList = (java.util.ArrayList) dataList;
                if (i19 < arrayList.size() && (j5Var = a2Var2.f375636d) != null) {
                    arrayList.set(i19, j5Var);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "update index：" + i19 + " updateId:" + j17 + " updatePayload:" + obj);
            if (wVar.f375765b) {
                pm0.v.X(new ir2.n1(p1Var));
            } else {
                java.util.List list2 = p1Var.f375742d;
                android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                arrayMap.put(java.lang.Integer.valueOf(i19), obj);
                p1Var.b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new ir2.l1(list2, dataList, p1Var, arrayMap), true), 1);
            }
            if (i19 >= 0) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) dataList;
                if (i19 < arrayList2.size()) {
                    d(p1Var, true, false, false, i19, (so2.j5) arrayList2.get(i19), 0, 38, null);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "update index " + i19 + ", but datalist size is " + ((java.util.ArrayList) dataList).size());
            return;
        }
        if (!(xVar instanceof ir2.s)) {
            if (!(xVar instanceof ir2.q)) {
                if (xVar instanceof ir2.u) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "query");
                    ((ir2.u) xVar).a(dataList);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "delete");
            ir2.e eVar = (ir2.e) ((ir2.q) xVar);
            eVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
            long j19 = eVar.f375658b;
            if (j19 != -1) {
                java.util.Iterator it7 = ((java.util.ArrayList) dataList).iterator();
                i17 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i17 = -1;
                        break;
                    } else if ((((so2.j5) it7.next()).mo2128x1ed62e84() == j19) == true) {
                        break;
                    } else {
                        i17++;
                    }
                }
            } else {
                i17 = eVar.f375657a;
            }
            long j27 = eVar.f375659c;
            if (j27 != -1) {
                java.util.Iterator it8 = ((java.util.ArrayList) dataList).iterator();
                i17 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var2 = (so2.j5) it8.next();
                    if (((j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().m59260x51f8f5b0() == j27) == true) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (i17 > -1) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) dataList;
                if (i17 < arrayList3.size()) {
                    arrayList3.remove(i17);
                    p1Var.b(c(p1Var, p1Var.f375742d, dataList, null, 4, null), 1);
                    d(p1Var, false, true, false, i17, null, 0, 53, null);
                    return;
                }
            }
            i17 = -1;
            p1Var.b(c(p1Var, p1Var.f375742d, dataList, null, 4, null), 1);
            d(p1Var, false, true, false, i17, null, 0, 53, null);
            return;
        }
        ir2.s sVar = (ir2.s) xVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insert size:");
        sb6.append(((java.util.ArrayList) p1Var.f375742d).size());
        sb6.append(' ');
        java.lang.Object Z = kz5.n0.Z(dataList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = Z instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Z : null;
        sb6.append((abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject2.m59226x730bcac6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", sb6.toString());
        ir2.b0 b0Var = (ir2.b0) sVar;
        b0Var.getClass();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        long j28 = b0Var.f375644d;
        if (j28 != -1) {
            java.util.Iterator it9 = ((java.util.ArrayList) dataList).iterator();
            i18 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i18 = -1;
                    break;
                } else if ((((so2.j5) it9.next()).mo2128x1ed62e84() == j28) == true) {
                    break;
                } else {
                    i18++;
                }
            }
        } else {
            i18 = b0Var.f375643c;
        }
        if (i18 == -1) {
            i18 = ((java.util.ArrayList) dataList).size();
        }
        java.util.ArrayList arrayList4 = (java.util.ArrayList) dataList;
        java.util.List list3 = b0Var.f375747a;
        arrayList4.addAll(i18, list3);
        for (int i28 = 0; i28 < list3.size(); i28++) {
            hashSet2.add(java.lang.Integer.valueOf(i18));
            i18++;
        }
        if (sVar.f375748b) {
            pm0.v.X(new ir2.n1(p1Var));
        } else {
            p1Var.b(c(p1Var, p1Var.f375742d, dataList, null, 4, null), 1);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("insert size after:");
        sb7.append(arrayList4.size());
        sb7.append("  ");
        java.lang.Object Z2 = kz5.n0.Z(dataList);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = Z2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Z2 : null;
        if (abstractC14490x69736cb52 != null && (feedObject = abstractC14490x69736cb52.getFeedObject()) != null) {
            str = feedObject.m59226x730bcac6();
        }
        sb7.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", sb7.toString());
        java.util.Iterator it10 = hashSet2.iterator();
        while (it10.hasNext()) {
            int intValue = ((java.lang.Number) it10.next()).intValue();
            if (intValue < 0 || intValue >= arrayList4.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "insert index " + intValue + ", but datalist size is " + arrayList4.size());
            } else {
                d(p1Var, false, false, true, intValue, (so2.j5) arrayList4.get(intValue), 0, 35, null);
            }
        }
    }

    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c(ir2.p1 p1Var, java.util.List list, java.util.List list2, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiffResult");
        }
        if ((i17 & 4) != 0) {
            map = null;
        }
        p1Var.getClass();
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new ir2.l1(list, list2, p1Var, map), true);
    }

    public static void d(ir2.p1 p1Var, boolean z17, boolean z18, boolean z19, int i17, so2.j5 j5Var, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSnapShot");
        }
        if ((i19 & 1) != 0) {
            z17 = false;
        }
        if ((i19 & 2) != 0) {
            z18 = false;
        }
        if ((i19 & 4) != 0) {
            z19 = false;
        }
        if ((i19 & 8) != 0) {
            i17 = -1;
        }
        if ((i19 & 16) != 0) {
            j5Var = null;
        }
        if ((i19 & 32) != 0) {
            i18 = 2;
        }
        p1Var.getClass();
        if (z17 && i17 != -1 && j5Var != null) {
            p1Var.f375742d.set(i17, new ir2.i1(p1Var, j5Var, i18));
        }
        if (z18 && i17 != -1) {
            p1Var.f375742d.remove(i17);
        }
        if (!z19 || i17 == -1 || j5Var == null) {
            return;
        }
        p1Var.f375742d.add(i17, new ir2.i1(p1Var, j5Var, i18));
    }

    public final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 c0Var, int i17) {
        this.f375742d.size();
        pf5.e.m158344xbe96bc24(this.f375739a, null, null, new ir2.k1(c0Var, this, i17, null), 3, null);
    }

    public final void e(ir2.v1 v1Var, java.util.List list, ir2.e1 e1Var) {
        boolean isEmpty = list.isEmpty();
        java.util.List list2 = e1Var.f375662a;
        e1Var.b(list);
        if (!list2.isEmpty()) {
            if (isEmpty || e1Var.f375663b) {
                pf5.e.m158344xbe96bc24(this.f375739a, null, null, new ir2.m1(this, null), 3, null);
            } else {
                b(c(this, this.f375742d, list, null, 4, null), e1Var.f375662a.size());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "handleState: " + this.f375742d.size() + " size:" + list.size());
            int c17 = e1Var.c();
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ir2.i1(this, (so2.j5) it.next(), c17));
            }
            this.f375742d = arrayList;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DataMerger", "sendState: " + v1Var);
        p3325xe03a0797.p3326xc267989b.l.d(this.f375739a.mo144225x95f74600(), null, null, new ir2.o1(this, v1Var, null), 3, null);
    }
}
