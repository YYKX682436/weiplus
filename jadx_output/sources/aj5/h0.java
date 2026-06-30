package aj5;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(aj5.r0 r0Var) {
        super(1);
        this.f5438d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 n0Var;
        aj5.r0 r0Var;
        java.lang.Object obj2;
        aj5.r0 r0Var2;
        int i17;
        wi5.n0 n0Var2;
        java.util.HashSet hashSet;
        java.util.Iterator it;
        r13.b bVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        aj5.r0 r0Var3 = this.f5438d;
        if (yVar != null) {
            ((java.util.ArrayList) r0Var3.f5508i).clear();
            if (!r26.n0.N(yVar.f446363c)) {
                j75.e eVar = yVar.f298067a;
                if (eVar == null || !(eVar instanceof wi5.z)) {
                    n0Var = state;
                    r0Var = r0Var3;
                } else {
                    wi5.z zVar = (wi5.z) eVar;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f446367b;
                    sb6.append(str);
                    sb6.append(", multiSearch:");
                    boolean z17 = zVar.f446369d;
                    sb6.append(z17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = r0Var3.f5505f;
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it6.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    r13.b bVar2 = r13.b.f368602d;
                    java.util.HashSet hashSet2 = state.f446320p;
                    jz5.g gVar = r0Var3.f5504e;
                    if (z17) {
                        r0Var3.f5509m = str;
                        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
                        kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "searchChatroomInMultiSearch, query:" + str);
                        p13.u uVar = new p13.u();
                        uVar.f351141c = str;
                        uVar.f351140b = 99;
                        uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue();
                        java.util.HashSet hashSet3 = hashSet2;
                        r13.b bVar3 = bVar2;
                        uVar.f351151m = new aj5.c0(r0Var3, zVar, b18, 0, true);
                        arrayList.add(((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar));
                        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = r0Var3.O6();
                        if (O6 != null) {
                            r0Var2 = r0Var3;
                            v65.i.b(O6, null, new aj5.j0(b18, hashMap, r0Var3, synchronizedList, b17, null), 1, null);
                        } else {
                            r0Var2 = r0Var3;
                        }
                        java.util.Iterator it7 = zVar.f446368c.iterator();
                        int i18 = 0;
                        while (it7.hasNext()) {
                            java.lang.Object next = it7.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            java.lang.String str2 = (java.lang.String) next;
                            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "startSearch multi " + i19 + ", sub query:" + str2);
                            if (!r26.n0.N(str2)) {
                                kotlinx.coroutines.flow.i2 b19 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                                p13.u uVar2 = new p13.u();
                                uVar2.f351141c = str2;
                                uVar2.f351140b = 16;
                                r13.b bVar4 = bVar3;
                                uVar2.f351150l = bVar4;
                                uVar2.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue();
                                uVar2.f351145g = new int[]{131072};
                                it = it7;
                                bVar = bVar4;
                                uVar2.f351151m = new aj5.c0(r0Var2, zVar, b19, i19, true);
                                uVar2.f351154p = true;
                                java.util.HashSet hashSet4 = hashSet3;
                                uVar2.f351148j.addAll(hashSet4);
                                p13.c sj6 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar2);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "startSearch multi " + sj6.hashCode());
                                arrayList.add(sj6);
                                com.tencent.mm.sdk.coroutines.LifecycleScope O62 = r0Var2.O6();
                                if (O62 != null) {
                                    n0Var2 = state;
                                    hashSet = hashSet4;
                                    i17 = i19;
                                    v65.i.b(O62, null, new aj5.l0(b19, hashMap, i19, r0Var2, zVar, synchronizedList, b17, null), 1, null);
                                } else {
                                    n0Var2 = state;
                                    hashSet = hashSet4;
                                    i17 = i19;
                                }
                            } else {
                                i17 = i19;
                                java.util.HashSet hashSet5 = hashSet3;
                                n0Var2 = state;
                                hashSet = hashSet5;
                                r13.b bVar5 = bVar3;
                                it = it7;
                                bVar = bVar5;
                            }
                            i18 = i17;
                            wi5.n0 n0Var3 = n0Var2;
                            hashSet3 = hashSet;
                            state = n0Var3;
                            java.util.Iterator it8 = it;
                            bVar3 = bVar;
                            it7 = it8;
                        }
                        n0Var = state;
                        com.tencent.mm.sdk.coroutines.LifecycleScope O63 = r0Var2.O6();
                        if (O63 != null) {
                            v65.i.b(O63, null, new aj5.n0(b17, r0Var2, zVar, hashMap, null), 1, null);
                        }
                        r0Var = r0Var2;
                    } else {
                        n0Var = state;
                        kotlinx.coroutines.flow.i2 b27 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
                        p13.u uVar3 = new p13.u();
                        uVar3.f351141c = str;
                        uVar3.f351140b = 16;
                        uVar3.f351150l = bVar2;
                        uVar3.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue();
                        r0Var = r0Var3;
                        if (((java.lang.Boolean) ((jz5.n) r0Var.f5503d).getValue()).booleanValue()) {
                            uVar3.f351145g = new int[]{131072};
                        } else {
                            uVar3.f351145g = new int[]{131072, 131081};
                        }
                        uVar3.f351151m = new aj5.c0(r0Var, zVar, b27, 0, false);
                        uVar3.f351154p = true;
                        uVar3.f351148j.addAll(hashSet2);
                        p13.c sj7 = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "startSearch " + sj7.hashCode());
                        arrayList.add(sj7);
                        com.tencent.mm.sdk.coroutines.LifecycleScope O64 = r0Var.O6();
                        if (O64 != null) {
                            v65.i.b(O64, null, new aj5.p0(b27, hashMap, r0Var, zVar, null), 1, null);
                        }
                    }
                }
                aj5.r0.U6(r0Var).k().setVisibility(8);
                aj5.r0.U6(r0Var).h().setVisibility(0);
            } else {
                n0Var = state;
                r0Var = r0Var3;
                aj5.r0.U6(r0Var).k().setVisibility(0);
                aj5.r0.U6(r0Var).h().setVisibility(8);
                r0Var.V6();
                yVar.f446364d.invoke();
            }
        } else {
            n0Var = state;
            r0Var = r0Var3;
        }
        wi5.n0 n0Var4 = n0Var;
        wi5.w wVar = (wi5.w) n0Var4.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f446355c)) {
                aj5.r0.U6(r0Var).k().setVisibility(8);
                aj5.r0.U6(r0Var).h().setVisibility(0);
            } else {
                aj5.r0.U6(r0Var).k().setVisibility(0);
                aj5.r0.U6(r0Var).h().setVisibility(8);
                r0Var.V6();
                wVar.f446356d.invoke();
            }
        }
        j75.d dVar = n0Var4.f298066d;
        if (dVar != null && (dVar instanceof wi5.x)) {
            wi5.x xVar = (wi5.x) dVar;
            si5.c cVar = xVar.f446359b.f396113h;
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension");
            ti5.d dVar2 = (ti5.d) cVar;
            java.util.HashMap hashMap2 = n0Var4.f446327w;
            if (hashMap2 != null && (obj2 = hashMap2.get(java.lang.Integer.valueOf(dVar2.f419666c))) != null) {
                p13.v vVar = obj2 instanceof p13.v ? (p13.v) obj2 : null;
                if (vVar != null) {
                    ri5.j jVar = xVar.f446359b;
                    boolean z18 = jVar.f396128y;
                    com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = xVar.f446360c;
                    if (z18) {
                        java.util.List list = vVar.f351160e;
                        java.util.List subList = list.subList(3, list.size());
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i27 = 0;
                        for (java.lang.Object obj3 : subList) {
                            int i28 = i27 + 1;
                            if (i27 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            p13.y yVar2 = (p13.y) obj3;
                            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar2.f351187e, true);
                            ti5.d dVar3 = new ti5.d(yVar2, vVar.f351159d, dVar2.f419666c, i27 + 3, 0, 0, null, true, 112, null);
                            ri5.h hVar = ri5.j.I;
                            int i29 = ri5.j.W;
                            java.lang.String d17 = n17.d1();
                            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                            arrayList2.add(ti5.d.f419663i.b(r0Var.getActivity(), hVar.a(d17, i29, dVar3.f419666c), n17, i29, dVar3));
                            i27 = i28;
                        }
                        if (mvvmList != null) {
                            com.tencent.mm.plugin.mvvmlist.MvvmList.p(mvvmList, arrayList2, false, 2, null);
                        }
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.List list2 = vVar.f351160e;
                        for (p13.y yVar3 : list2.subList(3, list2.size())) {
                            ri5.h hVar2 = ri5.j.I;
                            java.lang.String auxIndex = yVar3.f351187e;
                            kotlin.jvm.internal.o.f(auxIndex, "auxIndex");
                            arrayList3.add(hVar2.a(auxIndex, ri5.j.W, dVar2.f419666c));
                        }
                        if (mvvmList != null) {
                            mvvmList.t(arrayList3);
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
        j75.d dVar4 = n0Var4.f298066d;
        if (dVar4 != null && (dVar4 instanceof wi5.g)) {
            if (aj5.r0.U6(r0Var).h().getVisibility() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select More Button by search, relatedChatroomList: ");
                sb7.append(((java.util.ArrayList) r0Var.f5508i).size());
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", sb7.toString());
                if (!r1.isEmpty()) {
                    android.content.Intent intent = new android.content.Intent(r0Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
                    intent.putExtra("titile", r0Var.getActivity().getString(com.tencent.mm.R.string.me7));
                    pf5.j0.a(intent, cj5.b.class);
                    intent.putExtra("detail_query", r0Var.f5509m);
                    pf5.j0.a(intent, cj5.x4.class);
                    pf5.j0.a(intent, cj5.w2.class);
                    pf5.j0.a(intent, cj5.l2.class);
                    pf5.j0.a(intent, aj5.i1.class);
                    pf5.j0.a(intent, aj5.e.class);
                    androidx.appcompat.app.AppCompatActivity activity = r0Var.getActivity();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(activity, arrayList4.toArray(), "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookSearchStrictDupUIC", "showMoreRelatedChatroom", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(activity, "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookSearchStrictDupUIC", "showMoreRelatedChatroom", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
