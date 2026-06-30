package j23;

/* loaded from: classes12.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a {
    @Override // t13.k
    /* renamed from: getType */
    public int mo9548xfb85f7b0() {
        return 16;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.e l(int i17, long j17, t13.i iVar) {
        if (i17 >= iVar.f496103f.size() || i17 < 0) {
            return null;
        }
        p13.y yVar = (p13.y) iVar.f496103f.get(i17);
        p13.e eVar = new p13.e();
        eVar.f432608c = 2;
        eVar.f432612g = java.lang.String.valueOf(yVar.hashCode());
        int i18 = yVar.f432717b;
        if (i18 == 131075) {
            eVar.f432613h = 4;
        } else if (i18 == 131072) {
            eVar.f432613h = 3;
        } else if (i18 == 262144) {
            eVar.f432613h = 10;
        } else if (i18 == 131076) {
            eVar.f432613h = 5;
            eVar.f432615j = yVar.f432720e;
        } else if (i18 == 2097171) {
            eVar.f432613h = 34;
            eVar.f432615j = yVar.f432720e;
        } else if (i18 == 2097173) {
            eVar.f432613h = 38;
            eVar.f432615j = yVar.f432720e;
        } else if (i18 == 393216) {
            eVar.f432613h = 19;
            x50.i iVar2 = (x50.i) i95.n0.c(x50.i.class);
            java.lang.String str = yVar.f432720e;
            ((w50.k) iVar2).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(str);
            java.lang.String str2 = wi6 != null ? wi6.f157888w : "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                eVar.f432615j = str2;
            }
        } else if (i18 == 589824) {
            eVar.f432613h = 31;
            eVar.f432615j = yVar.f432720e;
        } else if (i18 == 131090) {
            eVar.f432613h = 33;
            eVar.f432615j = yVar.f432720e;
        } else if (i18 == 131089) {
            eVar.f432613h = 33;
            eVar.f432615j = yVar.f432720e;
        } else if (i18 == 655360) {
            eVar.f432613h = 36;
            eVar.f432615j = yVar.f432720e;
        } else {
            if (i18 != 786432) {
                return null;
            }
            eVar.f432613h = 39;
            eVar.f432615j = yVar.f432720e;
        }
        return eVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public u13.g o(int i17, t13.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a aVar;
        int i18 = (i17 - iVar.f496098a) - 1;
        u13.g gVar = null;
        if (i18 < iVar.f496103f.size() && i18 >= 0) {
            p13.y yVar = (p13.y) iVar.f496103f.get(i18);
            int i19 = yVar.f432717b;
            int i27 = this.f496093f;
            t13.j jVar = this.f496091d;
            android.content.Context context = this.f496092e;
            if (i19 == 131075) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(48, context, jVar, i27);
            } else if (i19 == 131072) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(32, context, jVar, i27);
            } else if (i19 == 262144) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(64, context, jVar, i27);
            } else if (i19 == 131076) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(96, context, jVar, i27);
            } else if (i19 == 2097171) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(97, context, jVar, i27);
            } else if (i19 == 2097173) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(98, context, jVar, i27);
            } else if (i19 == 393216) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(144, context, jVar, i27);
            } else if (i19 == 589824) {
                aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(133, context, jVar, i27);
                yVar.f432737v = true;
            } else {
                aVar = (i19 == 131089 || i19 == 131090) ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(51, context, jVar, i27) : i19 == 655360 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(272, context, jVar, i27) : i19 == 786432 ? (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ui(129, context, jVar, i27) : null;
            }
            if (aVar != null) {
                gVar = aVar.p(yVar.f432717b, i17, yVar, iVar);
            }
        }
        if (gVar != null) {
            gVar.f505300j = i18 + 1;
            if (i18 == iVar.f496103f.size() - 1) {
                gVar.f505294d = false;
            }
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public p13.c q(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var, java.util.HashSet hashSet) {
        p13.u uVar = new p13.u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(131072);
        arrayList.add(131075);
        arrayList.add(262144);
        arrayList.add(131076);
        arrayList.add(2097171);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
            arrayList.add(2097173);
        }
        arrayList.add(393216);
        arrayList.add(131090);
        arrayList.add(131089);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            arrayList.add(589824);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f524488d) {
            arrayList.add(655360);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f524489e) {
            arrayList.add(786432);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        uVar.f432678g = iArr;
        uVar.f432680i = 3;
        uVar.f432684m = this;
        uVar.f432685n = n3Var;
        uVar.f432686o = 0;
        uVar.f432681j = hashSet;
        if (this.f219540i.startsWith("@@")) {
            uVar.f432674c = this.f219540i.substring(2);
            return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(10000, uVar);
        }
        uVar.f432674c = this.f219540i;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(1, uVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a
    public void s(p13.v vVar, java.util.HashSet hashSet) {
        boolean z17;
        java.util.Iterator it = vVar.f432693e.iterator();
        while (it.hasNext()) {
            hashSet.add(((p13.y) it.next()).f432720e);
        }
        if (k(vVar.f432693e)) {
            if (vVar.f432692d.f432663b.getBytes(java.nio.charset.StandardCharsets.UTF_8).length >= 4) {
                java.util.Iterator it6 = vVar.f432693e.iterator();
                z17 = false;
                while (it6.hasNext()) {
                    if (java.lang.String.valueOf(39).equals(((p13.y) it6.next()).f432720e)) {
                        z17 = true;
                    }
                }
            } else {
                z17 = false;
            }
            java.util.List list = this.f219542n;
            if (z17) {
                t13.i iVar = new t13.i();
                iVar.f496102e = -6;
                iVar.f496104g = vVar.f432692d;
                java.util.List list2 = vVar.f432693e;
                iVar.f496103f = list2;
                if (list2.size() > 1) {
                    iVar.f496101d = true;
                    iVar.f496103f = new java.util.ArrayList(iVar.f496103f.subList(0, 1));
                }
                list.add(iVar);
            } else {
                t13.i iVar2 = new t13.i();
                iVar2.f496102e = -8;
                java.util.List list3 = vVar.f432693e;
                if (k(list3) && list3.size() > 3) {
                    list3 = list3.subList(0, 3);
                }
                iVar2.f496103f = list3;
                iVar2.f496101d = false;
                iVar2.f496104g = vVar.f432692d;
                list.add(iVar2);
            }
        }
        java.util.List<p13.y> list4 = vVar.f432693e;
        java.util.HashMap hashMap = o13.n.f423774a;
        hashMap.clear();
        for (p13.y yVar : list4) {
            java.lang.Object obj = yVar.f432730o;
            if (obj instanceof java.lang.String) {
                hashMap.put(yVar.f432720e, (java.lang.String) obj);
            } else {
                hashMap.put(yVar.f432720e, "");
            }
        }
    }
}
