package bj2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final int f102674h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 192);

    /* renamed from: a, reason: collision with root package name */
    public final zh2.c f102675a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 f102676b;

    /* renamed from: c, reason: collision with root package name */
    public final bj2.c f102677c;

    /* renamed from: d, reason: collision with root package name */
    public int f102678d;

    /* renamed from: e, reason: collision with root package name */
    public int f102679e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f102680f;

    /* renamed from: g, reason: collision with root package name */
    public final dj2.k f102681g;

    public b(android.content.Context context, zh2.c pluginAbility, com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 ratioLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratioLayout, "ratioLayout");
        this.f102675a = pluginAbility;
        this.f102676b = ratioLayout;
        bj2.c cVar = new bj2.c(context, pluginAbility, pluginAbility.j());
        this.f102677c = cVar;
        this.f102678d = 1;
        this.f102679e = 1;
        dj2.k kVar = new dj2.k();
        this.f102681g = kVar;
        ratioLayout.m82883x6cab2c8d(cVar);
        ratioLayout.m82886x22dac925(kVar);
        ratioLayout.m82887x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.a());
    }

    public final void a(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        xh2.i iVar;
        xh2.i iVar2;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((xh2.a) obj).f536054b.f536086e == 1) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        xh2.a aVar = (xh2.a) obj;
        java.util.Iterator it6 = linkedList.iterator();
        while (true) {
            if (it6.hasNext()) {
                obj2 = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj2).b(), str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        xh2.a aVar2 = (xh2.a) obj2;
        km2.q qVar = aVar != null ? aVar.f536053a : null;
        if (aVar != null) {
            aVar.f536053a = aVar2 != null ? aVar2.f536053a : null;
        }
        if (aVar2 != null) {
            aVar2.f536053a = qVar;
        }
        int i17 = (aVar == null || (iVar2 = aVar.f536054b) == null) ? 0 : iVar2.f536090i;
        xh2.i iVar3 = aVar != null ? aVar.f536054b : null;
        if (iVar3 != null) {
            iVar3.f536090i = (aVar2 == null || (iVar = aVar2.f536054b) == null) ? 0 : iVar.f536090i;
        }
        xh2.i iVar4 = aVar2 != null ? aVar2.f536054b : null;
        if (iVar4 != null) {
            iVar4.f536090i = i17;
        }
        int size = linkedList.size();
        for (int i18 = 0; i18 < size; i18++) {
            xh2.a aVar3 = (xh2.a) kz5.n0.a0(linkedList2, ((xh2.a) linkedList.get(i18)).f536054b.f536086e - 1);
            if (aVar3 != null) {
                aVar3.f536053a = ((xh2.a) linkedList.get(i18)).f536053a;
                xh2.i iVar5 = aVar3.f536054b;
                iVar5.f536089h = false;
                iVar5.f536090i = ((xh2.a) linkedList.get(i18)).f536054b.f536090i;
            }
        }
    }

    public final java.util.LinkedList b(int i17, java.util.LinkedList list, java.lang.String curFocusId) {
        java.util.LinkedList linkedList;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.Object obj2;
        xh2.i iVar;
        xh2.i iVar2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        int i18;
        boolean z17;
        float f17;
        int i19;
        float f18;
        float f19;
        java.lang.Object obj5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curFocusId, "curFocusId");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(list);
        int i27 = this.f102678d;
        zh2.c cVar = this.f102675a;
        int i28 = 2;
        if (i27 != i17 || i17 == 2) {
            java.util.LinkedList<xh2.a> linkedList3 = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj6 : linkedList2) {
                if (!((xh2.a) obj6).f536054b.f536089h) {
                    arrayList.add(obj6);
                }
            }
            linkedList3.addAll(kz5.n0.F0(arrayList, new bj2.a()));
            if (linkedList3.size() > 1) {
                kz5.g0.t(linkedList3, new fj2.m());
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (xh2.a aVar : linkedList3) {
                int i29 = aVar.f536054b.f536086e;
                if (i29 <= 0 || i29 > 9) {
                    arrayList2.add(aVar);
                } else if (hashMap.containsKey(java.lang.Integer.valueOf(i29))) {
                    arrayList2.add(aVar);
                } else {
                    hashMap.put(java.lang.Integer.valueOf(aVar.f536054b.f536086e), aVar);
                }
            }
            int i37 = 0;
            for (int i38 = 1; i38 < 10; i38++) {
                if (!hashMap.containsKey(java.lang.Integer.valueOf(i38))) {
                    int i39 = i37 + 1;
                    xh2.a aVar2 = (xh2.a) kz5.n0.a0(arrayList2, i37);
                    xh2.i iVar3 = aVar2 != null ? aVar2.f536054b : null;
                    if (iVar3 != null) {
                        iVar3.f536086e = i38;
                    }
                    i37 = i39;
                }
            }
            if (linkedList3.size() > 1) {
                kz5.g0.t(linkedList3, new fj2.n());
            }
            this.f102679e = 1;
            if (i17 == 1) {
                int size = linkedList3.size();
                linkedList = new java.util.LinkedList();
                if (size == 1) {
                    linkedList.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 1.0f, 1.0f, 1, 0, 0, false, 0, 0, 0L, 2016, null)));
                } else if (size == 2) {
                    int i47 = 0;
                    while (i47 < size) {
                        float f27 = 0.5f * (i47 % 2);
                        i47++;
                        linkedList.add(new xh2.a(null, new xh2.i(f27, 0.0f, 0.5f, 1.0f, i47, 0, 0, false, 0, 0, 0L, 2016, null)));
                    }
                } else if (size == 3) {
                    int i48 = 0;
                    while (i48 < size) {
                        float f28 = i48 == 0 ? 0.0f : 0.5f;
                        float f29 = i48 != 0 ? (i48 - 1) * 0.5f : 0.0f;
                        float f37 = i48 == 0 ? 1.0f : 0.5f;
                        i48++;
                        linkedList.add(new xh2.a(null, new xh2.i(f28, f29, 0.5f, f37, i48, 0, 0, false, 0, 0, 0L, 2016, null)));
                    }
                } else if (size == 4) {
                    int i49 = 0;
                    while (i49 < size) {
                        float f38 = 0.5f * (i49 % 2);
                        float f39 = 0.5f * (i49 / 2);
                        i49++;
                        linkedList.add(new xh2.a(null, new xh2.i(f38, f39, 0.5f, 0.5f, i49, 0, 0, false, 0, 0, 0L, 2016, null)));
                    }
                } else if (5 <= size && size < 10) {
                    int i57 = 0;
                    while (i57 < size) {
                        float f47 = (i57 % 3) * 0.33333334f;
                        float f48 = (i57 / 3) * 0.33333334f;
                        i57++;
                        linkedList.add(new xh2.a(null, new xh2.i(f47, f48, 0.33333334f, 0.33333334f, i57, 0, 0, false, 0, 0, 0L, 2016, null)));
                    }
                }
                java.lang.String str2 = ((mm2.e1) cVar.g().a(mm2.e1.class)).f410520q.f461834n;
                str = str2 != null ? str2 : "";
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj7 : linkedList3) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj7).b(), str)) {
                        arrayList3.add(obj7);
                    }
                }
                xh2.a aVar3 = (xh2.a) kz5.n0.a0(arrayList3, 0);
                if (aVar3 != null) {
                    linkedList3.remove(aVar3);
                    xh2.a aVar4 = (xh2.a) linkedList.get(0);
                    aVar4.f536053a = aVar3.f536053a;
                    xh2.i iVar4 = aVar4.f536054b;
                    iVar4.f536089h = false;
                    iVar4.f536086e = 1;
                    int size2 = linkedList3.size();
                    int i58 = 0;
                    while (i58 < size2) {
                        int i59 = i58 + 1;
                        xh2.a aVar5 = (xh2.a) kz5.n0.a0(linkedList, i59);
                        if (aVar5 != null) {
                            aVar5.f536053a = ((xh2.a) linkedList3.get(i58)).f536053a;
                            xh2.i iVar5 = aVar5.f536054b;
                            iVar5.f536089h = false;
                            iVar5.f536086e = i58 + 2;
                            iVar5.f536090i = ((xh2.a) linkedList3.get(i58)).f536054b.f536090i;
                        }
                        i58 = i59;
                    }
                }
            } else if (i17 == 2) {
                java.util.Iterator it = linkedList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((xh2.a) obj).f536054b.f536086e == 1) {
                        break;
                    }
                }
                xh2.a aVar6 = (xh2.a) obj;
                java.util.Iterator it6 = linkedList3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj2).b(), curFocusId)) {
                        break;
                    }
                }
                xh2.a aVar7 = (xh2.a) obj2;
                km2.q qVar = aVar6 != null ? aVar6.f536053a : null;
                if (aVar6 != null) {
                    aVar6.f536053a = aVar7 != null ? aVar7.f536053a : null;
                }
                if (aVar7 != null) {
                    aVar7.f536053a = qVar;
                }
                int i66 = (aVar6 == null || (iVar2 = aVar6.f536054b) == null) ? 0 : iVar2.f536090i;
                xh2.i iVar6 = aVar6 != null ? aVar6.f536054b : null;
                if (iVar6 != null) {
                    iVar6.f536090i = (aVar7 == null || (iVar = aVar7.f536054b) == null) ? 0 : iVar.f536090i;
                }
                xh2.i iVar7 = aVar7 != null ? aVar7.f536054b : null;
                if (iVar7 != null) {
                    iVar7.f536090i = i66;
                }
                int size3 = linkedList3.size();
                linkedList2 = new java.util.LinkedList();
                float f49 = (1.0f - (3 * 0.30481285f)) / 3.0f;
                float f57 = 0.6507937f - f49;
                linkedList2.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 1.0f, 1.0f, 1, 0, 1, false, 0, 0, 0L, 1824, null)));
                int i67 = size3 - 1;
                int i68 = 0;
                while (i68 < i67) {
                    linkedList2.add(new xh2.a(null, new xh2.i(f57, (i28 * f49) + (i68 * 0.30481285f), 0.34920636f, 0.30481285f, i68 + 2, 0, 2, false, 0, 0, 0L, 1824, null)));
                    i68++;
                    i28 = 2;
                }
                int i69 = 0;
                for (java.lang.Object obj8 : linkedList3) {
                    int i76 = i69 + 1;
                    if (i69 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ((xh2.a) linkedList2.get(i69)).f536053a = ((xh2.a) linkedList3.get(i69)).f536053a;
                    ((xh2.a) linkedList2.get(i69)).f536054b.f536090i = ((xh2.a) linkedList3.get(i69)).f536054b.f536090i;
                    i69 = i76;
                }
            } else if (i17 == 3) {
                if (this.f102678d == 4) {
                    java.util.Iterator it7 = linkedList3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it7.next();
                        if (((xh2.a) obj3).f536054b.f536086e == 1) {
                            break;
                        }
                    }
                    xh2.a aVar8 = (xh2.a) obj3;
                    if (aVar8 != null) {
                        java.lang.String str3 = ((mm2.e1) cVar.g().a(mm2.e1.class)).f410520q.f461834n;
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar8.b(), str3)) {
                            java.util.Iterator it8 = linkedList3.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it8.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj4).b(), str3)) {
                                    break;
                                }
                            }
                            xh2.a aVar9 = (xh2.a) obj4;
                            if (aVar9 != null) {
                                km2.q qVar2 = aVar8.f536053a;
                                aVar8.f536053a = aVar9.f536053a;
                                aVar9.f536053a = qVar2;
                                xh2.i iVar8 = aVar8.f536054b;
                                int i77 = iVar8 != null ? iVar8.f536090i : 0;
                                if (iVar8 != null) {
                                    xh2.i iVar9 = aVar9.f536054b;
                                    iVar8.f536090i = iVar9 != null ? iVar9.f536090i : 0;
                                }
                                xh2.i iVar10 = aVar9.f536054b;
                                if (iVar10 != null) {
                                    iVar10.f536090i = i77;
                                }
                            }
                        }
                    }
                }
                linkedList = new java.util.LinkedList();
                int i78 = 0;
                while (i78 < 9) {
                    float f58 = (i78 % 3) * 0.333333f;
                    float f59 = (i78 / 3) * 0.333333f;
                    i78++;
                    linkedList.add(new xh2.a(null, new xh2.i(f58, f59, 0.333333f, 0.333333f, i78, 0, 0, true, 0, 0, 0L, 1888, null)));
                }
                java.lang.String str4 = ((mm2.e1) cVar.g().a(mm2.e1.class)).f410520q.f461834n;
                a(linkedList3, linkedList, str4 != null ? str4 : "");
            } else if (i17 != 4) {
                linkedList2 = linkedList3;
            } else {
                linkedList = new java.util.LinkedList();
                linkedList.add(new xh2.a(null, new xh2.i(0.0f, 0.0f, 0.5f, 1.0f, 1, 0, 1, true, 0, 0, 0L, 1824, null)));
                for (int i79 = 0; i79 < 8; i79++) {
                    linkedList.add(new xh2.a(null, new xh2.i(((i79 % 2) * 0.25f) + 0.5f, (i79 / 2) * 0.25f, 0.25f, 0.25f, i79 + 2, 0, 2, true, 0, 0, 0L, 1824, null)));
                }
                a(linkedList3, linkedList, curFocusId);
            }
            linkedList2 = linkedList;
        } else if (i17 == 4 || i17 == 2) {
            java.lang.Object obj9 = linkedList2.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj9, "get(...)");
            xh2.a aVar10 = (xh2.a) obj9;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar10.b(), curFocusId)) {
                java.util.Iterator it9 = linkedList2.iterator();
                int i86 = 0;
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it9.next();
                    int i87 = i86 + 1;
                    if (i86 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    xh2.a aVar11 = (xh2.a) next;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar11.b(), curFocusId)) {
                        km2.q qVar3 = aVar10.f536053a;
                        aVar10.f536053a = aVar11.f536053a;
                        aVar11.f536053a = qVar3;
                        xh2.i iVar11 = aVar10.f536054b;
                        int i88 = iVar11 != null ? iVar11.f536090i : 0;
                        if (iVar11 != null) {
                            xh2.i iVar12 = aVar11.f536054b;
                            iVar11.f536090i = iVar12 != null ? iVar12.f536090i : 0;
                        }
                        xh2.i iVar13 = aVar11.f536054b;
                        if (iVar13 != null) {
                            iVar13.f536090i = i88;
                        }
                    } else {
                        i86 = i87;
                    }
                }
                java.lang.String str5 = ((mm2.e1) cVar.g().a(mm2.e1.class)).f410520q.f461834n;
                str = str5 != null ? str5 : "";
                java.util.ListIterator listIterator = linkedList2.listIterator(linkedList2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = listIterator.previous();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj5).b(), str)) {
                        break;
                    }
                }
                xh2.a aVar12 = (xh2.a) obj5;
                if (aVar12 != null) {
                    this.f102679e = aVar12.f536054b.f536086e;
                }
            }
        }
        boolean c17 = cVar.c();
        bj2.c cVar2 = this.f102677c;
        cVar2.f102688h = c17;
        this.f102678d = i17;
        fj2.r rVar = fj2.r.f344715a;
        dj2.k kVar = this.f102681g;
        if (i17 == 3) {
            i18 = 2;
            z17 = false;
            java.util.LinkedList k17 = rVar.k(list);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicNewPreviewLayoutManager", "pointList size = " + k17.size() + " list = " + k17);
            dj2.k.b(kVar, k17, 0, 2, null);
        } else if (i17 != 4) {
            i18 = 2;
            z17 = false;
            dj2.k.b(kVar, new java.util.LinkedList(), 0, 2, null);
        } else {
            i18 = 2;
            z17 = false;
            java.util.LinkedList j17 = rVar.j(list);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicNewPreviewLayoutManager", "pointList size = " + j17.size() + " list = " + j17);
            dj2.k.b(kVar, j17, 0, 2, null);
        }
        int i89 = f102674h;
        if (i17 != i18) {
            if (i17 != 3) {
                if (i17 != 4) {
                    int size4 = linkedList2.size();
                    if (size4 != 1) {
                        if ((5 > size4 || size4 >= 7) ? z17 : true) {
                            i19 = i89 * 1;
                        }
                    }
                    f19 = i89;
                    f18 = 0.5625f;
                    i19 = (int) (f19 * f18);
                } else {
                    f17 = 1.1195652f;
                    i19 = (int) (i89 * f17);
                }
            }
            f19 = i89;
            f18 = 1.0f;
            i19 = (int) (f19 * f18);
        } else {
            if (linkedList2.size() > 1) {
                f17 = 0.6737968f;
                i19 = (int) (i89 * f17);
            }
            f19 = i89;
            f18 = 0.5625f;
            i19 = (int) (f19 * f18);
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f102676b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i19;
            layoutParams.height = i89;
        }
        cVar2.h(i17, linkedList2);
        cVar2.f();
        this.f102680f = linkedList2;
        return linkedList2;
    }
}
