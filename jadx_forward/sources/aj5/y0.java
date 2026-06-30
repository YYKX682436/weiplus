package aj5;

/* loaded from: classes.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f87061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(aj5.g1 g1Var) {
        super(1);
        this.f87061d = g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 n0Var;
        aj5.g1 g1Var;
        java.lang.Object obj2;
        wi5.n0 n0Var2;
        u26.u uVar;
        java.util.HashSet hashSet;
        r13.b bVar;
        java.util.ArrayList arrayList;
        aj5.g1 g1Var2;
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        boolean z17 = true;
        int i17 = 0;
        u26.u uVar2 = null;
        aj5.g1 g1Var3 = this.f87061d;
        if (yVar == null) {
            n0Var = state;
            g1Var = g1Var3;
        } else if (!r26.n0.N(yVar.f527896c)) {
            j75.e eVar = yVar.f379600a;
            if (eVar == null || !(eVar instanceof wi5.z)) {
                n0Var = state;
                g1Var = g1Var3;
            } else {
                wi5.z zVar = (wi5.z) eVar;
                g1Var3.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                java.lang.String str2 = zVar.f527900b;
                sb6.append(str2);
                sb6.append(", multiSearch:");
                boolean z18 = zVar.f527902d;
                sb6.append(z18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", sb6.toString());
                java.util.ArrayList arrayList2 = g1Var3.f86966f;
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                }
                arrayList2.clear();
                java.util.HashMap hashMap = new java.util.HashMap();
                r13.b bVar2 = r13.b.f450135d;
                java.util.HashSet hashSet2 = state.f527853p;
                java.lang.String str3 = "MicroMsg.SelectContactAddressBookSearchUIC";
                int i18 = 7;
                jz5.g gVar = g1Var3.f86965e;
                if (z18) {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int i19 = 0;
                    for (java.lang.Object obj3 : zVar.f527901c) {
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            ?? r96 = uVar2;
                            kz5.c0.p();
                            throw r96;
                        }
                        java.lang.String str4 = (java.lang.String) obj3;
                        if (r26.n0.N(str4) ^ z17) {
                            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(i17, i17, uVar2, i18, uVar2);
                            p13.u uVar3 = new p13.u();
                            uVar3.f432674c = str4;
                            uVar3.f432673b = 16;
                            uVar3.f432683l = bVar2;
                            uVar3.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb();
                            uVar3.f432678g = new int[]{131072};
                            hashSet = hashSet2;
                            bVar = bVar2;
                            arrayList = arrayList2;
                            n0Var2 = state;
                            str = str3;
                            uVar3.f432684m = new aj5.t0(g1Var3, zVar, b18, i19, true);
                            uVar3.f432687p = true;
                            uVar3.f432681j.addAll(hashSet);
                            p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar3);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startSearch multi " + sj6.hashCode());
                            arrayList.add(sj6);
                            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = g1Var3.O6();
                            if (O6 != null) {
                                g1Var2 = g1Var3;
                                uVar = null;
                                v65.i.b(O6, null, new aj5.a1(b18, hashMap, i19, g1Var3, zVar, arrayList3, b17, null), 1, null);
                            } else {
                                g1Var2 = g1Var3;
                                uVar = null;
                            }
                        } else {
                            n0Var2 = state;
                            uVar = uVar2;
                            hashSet = hashSet2;
                            bVar = bVar2;
                            arrayList = arrayList2;
                            g1Var2 = g1Var3;
                            str = str3;
                        }
                        str3 = str;
                        hashSet2 = hashSet;
                        arrayList2 = arrayList;
                        uVar2 = uVar;
                        state = n0Var2;
                        i19 = i27;
                        g1Var3 = g1Var2;
                        bVar2 = bVar;
                        z17 = true;
                        i17 = 0;
                        i18 = 7;
                    }
                    n0Var = state;
                    aj5.g1 g1Var4 = g1Var3;
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = g1Var4.O6();
                    if (O62 != null) {
                        v65.i.b(O62, null, new aj5.c1(b17, g1Var4, zVar, hashMap, null), 1, null);
                    }
                    g1Var = g1Var4;
                } else {
                    n0Var = state;
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b19 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                    p13.u uVar4 = new p13.u();
                    uVar4.f432674c = str2;
                    uVar4.f432673b = 16;
                    uVar4.f432683l = bVar2;
                    uVar4.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb();
                    g1Var = g1Var3;
                    if (((java.lang.Boolean) ((jz5.n) g1Var.f86964d).mo141623x754a37bb()).booleanValue()) {
                        uVar4.f432678g = new int[]{131072};
                    } else {
                        uVar4.f432678g = new int[]{131072, 131081};
                    }
                    uVar4.f432684m = new aj5.t0(g1Var, zVar, b19, 0, false);
                    uVar4.f432687p = true;
                    uVar4.f432681j.addAll(hashSet2);
                    p13.c sj7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "startSearch " + sj7.hashCode());
                    arrayList2.add(sj7);
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O63 = g1Var.O6();
                    if (O63 != null) {
                        v65.i.b(O63, null, new aj5.e1(b19, hashMap, g1Var, zVar, null), 1, null);
                    }
                }
            }
            aj5.g1.U6(g1Var).k().setVisibility(8);
            aj5.g1.U6(g1Var).h().setVisibility(0);
        } else {
            n0Var = state;
            g1Var = g1Var3;
            aj5.g1.U6(g1Var).k().setVisibility(0);
            aj5.g1.U6(g1Var).h().setVisibility(8);
            g1Var.V6();
            yVar.f527897d.mo152xb9724478();
        }
        wi5.n0 n0Var3 = n0Var;
        wi5.w wVar = (wi5.w) n0Var3.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f527888c)) {
                aj5.g1.U6(g1Var).k().setVisibility(8);
                aj5.g1.U6(g1Var).h().setVisibility(0);
            } else {
                aj5.g1.U6(g1Var).k().setVisibility(0);
                aj5.g1.U6(g1Var).h().setVisibility(8);
                g1Var.V6();
                wVar.f527889d.mo152xb9724478();
            }
        }
        j75.d dVar = n0Var3.f379599d;
        if (dVar != null && (dVar instanceof wi5.x)) {
            wi5.x xVar = (wi5.x) dVar;
            si5.c cVar = xVar.f527892b.f477646h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension");
            ti5.d dVar2 = (ti5.d) cVar;
            java.util.HashMap hashMap2 = n0Var3.f527860w;
            if (hashMap2 != null && (obj2 = hashMap2.get(java.lang.Integer.valueOf(dVar2.f501199c))) != null) {
                p13.v vVar = obj2 instanceof p13.v ? (p13.v) obj2 : null;
                if (vVar != null) {
                    ri5.j jVar = xVar.f527892b;
                    boolean z19 = jVar.f477661y;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = xVar.f527893c;
                    if (z19) {
                        java.util.List list = vVar.f432693e;
                        java.util.List subList = list.subList(3, list.size());
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        int i28 = 0;
                        for (java.lang.Object obj4 : subList) {
                            int i29 = i28 + 1;
                            if (i28 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            p13.y yVar2 = (p13.y) obj4;
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar2.f432720e, true);
                            ti5.d dVar3 = new ti5.d(yVar2, vVar.f432692d, dVar2.f501199c, i28 + 3, 0, 0, null, true, 112, null);
                            ri5.h hVar = ri5.j.I;
                            int i37 = ri5.j.W;
                            java.lang.String d17 = n17.d1();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                            arrayList4.add(ti5.d.f501196i.b(g1Var.m158354x19263085(), hVar.a(d17, i37, dVar3.f501199c), n17, i37, dVar3));
                            i28 = i29;
                        }
                        if (c16718x7059cefe != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.p(c16718x7059cefe, arrayList4, false, 2, null);
                        }
                    } else {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.util.List list2 = vVar.f432693e;
                        for (p13.y yVar3 : list2.subList(3, list2.size())) {
                            ri5.h hVar2 = ri5.j.I;
                            java.lang.String auxIndex = yVar3.f432720e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(auxIndex, "auxIndex");
                            arrayList5.add(hVar2.a(auxIndex, ri5.j.W, dVar2.f501199c));
                        }
                        if (c16718x7059cefe != null) {
                            c16718x7059cefe.t(arrayList5);
                        }
                    }
                    ri5.j jVar2 = (ri5.j) jVar.y0();
                    jVar2.f477661y = !jVar2.f477661y;
                    if (c16718x7059cefe != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, jVar2, false, 2, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
