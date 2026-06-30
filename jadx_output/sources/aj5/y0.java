package aj5;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(aj5.g1 g1Var) {
        super(1);
        this.f5528d = g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
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
        kotlin.jvm.internal.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        boolean z17 = true;
        int i17 = 0;
        u26.u uVar2 = null;
        aj5.g1 g1Var3 = this.f5528d;
        if (yVar == null) {
            n0Var = state;
            g1Var = g1Var3;
        } else if (!r26.n0.N(yVar.f446363c)) {
            j75.e eVar = yVar.f298067a;
            if (eVar == null || !(eVar instanceof wi5.z)) {
                n0Var = state;
                g1Var = g1Var3;
            } else {
                wi5.z zVar = (wi5.z) eVar;
                g1Var3.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                java.lang.String str2 = zVar.f446367b;
                sb6.append(str2);
                sb6.append(", multiSearch:");
                boolean z18 = zVar.f446369d;
                sb6.append(z18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", sb6.toString());
                java.util.ArrayList arrayList2 = g1Var3.f5433f;
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
                }
                arrayList2.clear();
                java.util.HashMap hashMap = new java.util.HashMap();
                r13.b bVar2 = r13.b.f368602d;
                java.util.HashSet hashSet2 = state.f446320p;
                java.lang.String str3 = "MicroMsg.SelectContactAddressBookSearchUIC";
                int i18 = 7;
                jz5.g gVar = g1Var3.f5432e;
                if (z18) {
                    kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int i19 = 0;
                    for (java.lang.Object obj3 : zVar.f446368c) {
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            ?? r96 = uVar2;
                            kz5.c0.p();
                            throw r96;
                        }
                        java.lang.String str4 = (java.lang.String) obj3;
                        if (r26.n0.N(str4) ^ z17) {
                            kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(i17, i17, uVar2, i18, uVar2);
                            p13.u uVar3 = new p13.u();
                            uVar3.f351141c = str4;
                            uVar3.f351140b = 16;
                            uVar3.f351150l = bVar2;
                            uVar3.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue();
                            uVar3.f351145g = new int[]{131072};
                            hashSet = hashSet2;
                            bVar = bVar2;
                            arrayList = arrayList2;
                            n0Var2 = state;
                            str = str3;
                            uVar3.f351151m = new aj5.t0(g1Var3, zVar, b18, i19, true);
                            uVar3.f351154p = true;
                            uVar3.f351148j.addAll(hashSet);
                            p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar3);
                            com.tencent.mars.xlog.Log.i(str, "startSearch multi " + sj6.hashCode());
                            arrayList.add(sj6);
                            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = g1Var3.O6();
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
                    com.tencent.mm.sdk.coroutines.LifecycleScope O62 = g1Var4.O6();
                    if (O62 != null) {
                        v65.i.b(O62, null, new aj5.c1(b17, g1Var4, zVar, hashMap, null), 1, null);
                    }
                    g1Var = g1Var4;
                } else {
                    n0Var = state;
                    kotlinx.coroutines.flow.i2 b19 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                    p13.u uVar4 = new p13.u();
                    uVar4.f351141c = str2;
                    uVar4.f351140b = 16;
                    uVar4.f351150l = bVar2;
                    uVar4.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue();
                    g1Var = g1Var3;
                    if (((java.lang.Boolean) ((jz5.n) g1Var.f5431d).getValue()).booleanValue()) {
                        uVar4.f351145g = new int[]{131072};
                    } else {
                        uVar4.f351145g = new int[]{131072, 131081};
                    }
                    uVar4.f351151m = new aj5.t0(g1Var, zVar, b19, 0, false);
                    uVar4.f351154p = true;
                    uVar4.f351148j.addAll(hashSet2);
                    p13.c sj7 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar4);
                    com.tencent.mars.xlog.Log.i(str3, "startSearch " + sj7.hashCode());
                    arrayList2.add(sj7);
                    com.tencent.mm.sdk.coroutines.LifecycleScope O63 = g1Var.O6();
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
            yVar.f446364d.invoke();
        }
        wi5.n0 n0Var3 = n0Var;
        wi5.w wVar = (wi5.w) n0Var3.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f446355c)) {
                aj5.g1.U6(g1Var).k().setVisibility(8);
                aj5.g1.U6(g1Var).h().setVisibility(0);
            } else {
                aj5.g1.U6(g1Var).k().setVisibility(0);
                aj5.g1.U6(g1Var).h().setVisibility(8);
                g1Var.V6();
                wVar.f446356d.invoke();
            }
        }
        j75.d dVar = n0Var3.f298066d;
        if (dVar != null && (dVar instanceof wi5.x)) {
            wi5.x xVar = (wi5.x) dVar;
            si5.c cVar = xVar.f446359b.f396113h;
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension");
            ti5.d dVar2 = (ti5.d) cVar;
            java.util.HashMap hashMap2 = n0Var3.f446327w;
            if (hashMap2 != null && (obj2 = hashMap2.get(java.lang.Integer.valueOf(dVar2.f419666c))) != null) {
                p13.v vVar = obj2 instanceof p13.v ? (p13.v) obj2 : null;
                if (vVar != null) {
                    ri5.j jVar = xVar.f446359b;
                    boolean z19 = jVar.f396128y;
                    com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = xVar.f446360c;
                    if (z19) {
                        java.util.List list = vVar.f351160e;
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
                            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar2.f351187e, true);
                            ti5.d dVar3 = new ti5.d(yVar2, vVar.f351159d, dVar2.f419666c, i28 + 3, 0, 0, null, true, 112, null);
                            ri5.h hVar = ri5.j.I;
                            int i37 = ri5.j.W;
                            java.lang.String d17 = n17.d1();
                            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                            arrayList4.add(ti5.d.f419663i.b(g1Var.getActivity(), hVar.a(d17, i37, dVar3.f419666c), n17, i37, dVar3));
                            i28 = i29;
                        }
                        if (mvvmList != null) {
                            com.tencent.mm.plugin.mvvmlist.MvvmList.p(mvvmList, arrayList4, false, 2, null);
                        }
                    } else {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.util.List list2 = vVar.f351160e;
                        for (p13.y yVar3 : list2.subList(3, list2.size())) {
                            ri5.h hVar2 = ri5.j.I;
                            java.lang.String auxIndex = yVar3.f351187e;
                            kotlin.jvm.internal.o.f(auxIndex, "auxIndex");
                            arrayList5.add(hVar2.a(auxIndex, ri5.j.W, dVar2.f419666c));
                        }
                        if (mvvmList != null) {
                            mvvmList.t(arrayList5);
                        }
                    }
                    ri5.j jVar2 = (ri5.j) jVar.y0();
                    jVar2.f396128y = !jVar2.f396128y;
                    if (mvvmList != null) {
                        com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, jVar2, false, 2, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
