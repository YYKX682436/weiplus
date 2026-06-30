package aj5;

/* loaded from: classes.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f86971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(aj5.r0 r0Var) {
        super(1);
        this.f86971d = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.y yVar = (wi5.y) state.a(wi5.y.class);
        aj5.r0 r0Var3 = this.f86971d;
        if (yVar != null) {
            ((java.util.ArrayList) r0Var3.f87041i).clear();
            if (!r26.n0.N(yVar.f527896c)) {
                j75.e eVar = yVar.f379600a;
                if (eVar == null || !(eVar instanceof wi5.z)) {
                    n0Var = state;
                    r0Var = r0Var3;
                } else {
                    wi5.z zVar = (wi5.z) eVar;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startSearch ");
                    java.lang.String str = zVar.f527900b;
                    sb6.append(str);
                    sb6.append(", multiSearch:");
                    boolean z17 = zVar.f527902d;
                    sb6.append(z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", sb6.toString());
                    java.util.ArrayList arrayList = r0Var3.f87038f;
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it6.next());
                    }
                    arrayList.clear();
                    java.util.HashMap hashMap = new java.util.HashMap();
                    r13.b bVar2 = r13.b.f450135d;
                    java.util.HashSet hashSet2 = state.f527853p;
                    jz5.g gVar = r0Var3.f87037e;
                    if (z17) {
                        r0Var3.f87042m = str;
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "searchChatroomInMultiSearch, query:" + str);
                        p13.u uVar = new p13.u();
                        uVar.f432674c = str;
                        uVar.f432673b = 99;
                        uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb();
                        java.util.HashSet hashSet3 = hashSet2;
                        r13.b bVar3 = bVar2;
                        uVar.f432684m = new aj5.c0(r0Var3, zVar, b18, 0, true);
                        arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar));
                        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = r0Var3.O6();
                        if (O6 != null) {
                            r0Var2 = r0Var3;
                            v65.i.b(O6, null, new aj5.j0(b18, hashMap, r0Var3, synchronizedList, b17, null), 1, null);
                        } else {
                            r0Var2 = r0Var3;
                        }
                        java.util.Iterator it7 = zVar.f527901c.iterator();
                        int i18 = 0;
                        while (it7.hasNext()) {
                            java.lang.Object next = it7.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            java.lang.String str2 = (java.lang.String) next;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "startSearch multi " + i19 + ", sub query:" + str2);
                            if (!r26.n0.N(str2)) {
                                p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b19 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                                p13.u uVar2 = new p13.u();
                                uVar2.f432674c = str2;
                                uVar2.f432673b = 16;
                                r13.b bVar4 = bVar3;
                                uVar2.f432683l = bVar4;
                                uVar2.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb();
                                uVar2.f432678g = new int[]{131072};
                                it = it7;
                                bVar = bVar4;
                                uVar2.f432684m = new aj5.c0(r0Var2, zVar, b19, i19, true);
                                uVar2.f432687p = true;
                                java.util.HashSet hashSet4 = hashSet3;
                                uVar2.f432681j.addAll(hashSet4);
                                p13.c sj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "startSearch multi " + sj6.hashCode());
                                arrayList.add(sj6);
                                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = r0Var2.O6();
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
                        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O63 = r0Var2.O6();
                        if (O63 != null) {
                            v65.i.b(O63, null, new aj5.n0(b17, r0Var2, zVar, hashMap, null), 1, null);
                        }
                        r0Var = r0Var2;
                    } else {
                        n0Var = state;
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b27 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
                        p13.u uVar3 = new p13.u();
                        uVar3.f432674c = str;
                        uVar3.f432673b = 16;
                        uVar3.f432683l = bVar2;
                        uVar3.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar).mo141623x754a37bb();
                        r0Var = r0Var3;
                        if (((java.lang.Boolean) ((jz5.n) r0Var.f87036d).mo141623x754a37bb()).booleanValue()) {
                            uVar3.f432678g = new int[]{131072};
                        } else {
                            uVar3.f432678g = new int[]{131072, 131081};
                        }
                        uVar3.f432684m = new aj5.c0(r0Var, zVar, b27, 0, false);
                        uVar3.f432687p = true;
                        uVar3.f432681j.addAll(hashSet2);
                        p13.c sj7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", "startSearch " + sj7.hashCode());
                        arrayList.add(sj7);
                        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O64 = r0Var.O6();
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
                yVar.f527897d.mo152xb9724478();
            }
        } else {
            n0Var = state;
            r0Var = r0Var3;
        }
        wi5.n0 n0Var4 = n0Var;
        wi5.w wVar = (wi5.w) n0Var4.a(wi5.w.class);
        if (wVar != null) {
            if (!r26.n0.N(wVar.f527888c)) {
                aj5.r0.U6(r0Var).k().setVisibility(8);
                aj5.r0.U6(r0Var).h().setVisibility(0);
            } else {
                aj5.r0.U6(r0Var).k().setVisibility(0);
                aj5.r0.U6(r0Var).h().setVisibility(8);
                r0Var.V6();
                wVar.f527889d.mo152xb9724478();
            }
        }
        j75.d dVar = n0Var4.f379599d;
        if (dVar != null && (dVar instanceof wi5.x)) {
            wi5.x xVar = (wi5.x) dVar;
            si5.c cVar = xVar.f527892b.f477646h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension");
            ti5.d dVar2 = (ti5.d) cVar;
            java.util.HashMap hashMap2 = n0Var4.f527860w;
            if (hashMap2 != null && (obj2 = hashMap2.get(java.lang.Integer.valueOf(dVar2.f501199c))) != null) {
                p13.v vVar = obj2 instanceof p13.v ? (p13.v) obj2 : null;
                if (vVar != null) {
                    ri5.j jVar = xVar.f527892b;
                    boolean z18 = jVar.f477661y;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = xVar.f527893c;
                    if (z18) {
                        java.util.List list = vVar.f432693e;
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
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar2.f432720e, true);
                            ti5.d dVar3 = new ti5.d(yVar2, vVar.f432692d, dVar2.f501199c, i27 + 3, 0, 0, null, true, 112, null);
                            ri5.h hVar = ri5.j.I;
                            int i29 = ri5.j.W;
                            java.lang.String d17 = n17.d1();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                            arrayList2.add(ti5.d.f501196i.b(r0Var.m158354x19263085(), hVar.a(d17, i29, dVar3.f501199c), n17, i29, dVar3));
                            i27 = i28;
                        }
                        if (c16718x7059cefe != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.p(c16718x7059cefe, arrayList2, false, 2, null);
                        }
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.List list2 = vVar.f432693e;
                        for (p13.y yVar3 : list2.subList(3, list2.size())) {
                            ri5.h hVar2 = ri5.j.I;
                            java.lang.String auxIndex = yVar3.f432720e;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(auxIndex, "auxIndex");
                            arrayList3.add(hVar2.a(auxIndex, ri5.j.W, dVar2.f501199c));
                        }
                        if (c16718x7059cefe != null) {
                            c16718x7059cefe.t(arrayList3);
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
        j75.d dVar4 = n0Var4.f379599d;
        if (dVar4 != null && (dVar4 instanceof wi5.g)) {
            if (aj5.r0.U6(r0Var).h().getVisibility() == 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select More Button by search, relatedChatroomList: ");
                sb7.append(((java.util.ArrayList) r0Var.f87041i).size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookSearchUIC", sb7.toString());
                if (!r1.isEmpty()) {
                    android.content.Intent intent = new android.content.Intent(r0Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
                    intent.putExtra("titile", r0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.me7));
                    pf5.j0.a(intent, cj5.b.class);
                    intent.putExtra("detail_query", r0Var.f87042m);
                    pf5.j0.a(intent, cj5.x4.class);
                    pf5.j0.a(intent, cj5.w2.class);
                    pf5.j0.a(intent, cj5.l2.class);
                    pf5.j0.a(intent, aj5.i1.class);
                    pf5.j0.a(intent, aj5.e.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = r0Var.m158354x19263085();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(m158354x19263085, arrayList4.toArray(), "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookSearchStrictDupUIC", "showMoreRelatedChatroom", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    m158354x19263085.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(m158354x19263085, "com/tencent/mm/ui/mvvm/uic/addressbook/SelectContactAddressBookSearchStrictDupUIC", "showMoreRelatedChatroom", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
