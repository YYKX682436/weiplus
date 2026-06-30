package op4;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ op4.e f428801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f428802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(op4.e eVar, long j17) {
        super(0);
        this.f428801d = eVar;
        this.f428802e = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [uo4.g] */
    /* JADX WARN: Type inference failed for: r8v6, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, uo4.b] */
    /* JADX WARN: Type inference failed for: r8v8, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [uo4.b] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ?? cVar;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        rm5.v vVar;
        uo4.e eVar;
        long j17;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        long j18 = 1;
        long j19 = this.f428801d.f428805g ? 1L : 4L;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7();
        new java.util.ArrayList();
        new java.util.ArrayList();
        gp4.j jVar = (gp4.j) this.f428801d.f428803e.j(gp4.j.class);
        java.util.ArrayList<zu3.a> E = jVar != null ? jVar.E() : null;
        lp4.u uVar = (lp4.u) this.f428801d.f428803e.j(lp4.u.class);
        if (uVar != null && (vVar = uVar.f401962h) != null) {
            op4.e eVar2 = this.f428801d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 a17 = np4.a.a(vVar);
            eVar2.f428804f.f511238a.clear();
            java.util.Iterator it = a17.f257130c.iterator();
            long j27 = 0;
            long j28 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
                java.util.Iterator it6 = it;
                int i17 = i1Var.f257150b;
                if (i17 == 2) {
                    j28 += j18;
                    ?? gVar = new uo4.g();
                    gVar.f511222f = i1Var.f257160l.f479039h;
                    qc0.d1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.b(i1Var.f257149a);
                    if (b17 != null) {
                        gVar.f511221e = b17.f442900e;
                        gVar.f511220d = b17.f442898c;
                        gVar.f511223g = b17.f442905j;
                        gVar.f511224h = b17.f442903h;
                    }
                    eVar = gVar;
                } else if (i17 == 1) {
                    j27++;
                    eVar = new uo4.e();
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.f511217a = i1Var.f257150b;
                }
                if (eVar != null && (arrayList4 = eVar.f511218b) != null) {
                    arrayList4.add(java.lang.Integer.valueOf(i1Var.f257154f));
                }
                if (eVar != null && (arrayList3 = eVar.f511218b) != null) {
                    arrayList3.add(java.lang.Integer.valueOf(i1Var.f257155g));
                }
                if (eVar == null || (arrayList2 = eVar.f511219c) == null) {
                    j17 = j27;
                } else {
                    j17 = j27;
                    arrayList2.add(java.lang.Long.valueOf(i1Var.f257160l.f479035d));
                }
                if (eVar != null && (arrayList = eVar.f511219c) != null) {
                    arrayList.add(java.lang.Long.valueOf(i1Var.f257160l.f479036e));
                }
                if (eVar != null) {
                    eVar2.f428804f.f511238a.add(eVar);
                }
                it = it6;
                j27 = j17;
                j18 = 1;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e72 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) eVar2.f428824d;
            if (c6759x7a5829e72 != null) {
                c6759x7a5829e72.f140870r = 1;
            }
            if (c6759x7a5829e72 != null) {
                c6759x7a5829e72.f140858f = j28;
            }
            if (c6759x7a5829e72 != null) {
                c6759x7a5829e72.f140859g = j27;
            }
            if (c6759x7a5829e72 != null) {
                c6759x7a5829e72.f140865m = a17.f257136i ? 1L : 0L;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it7 = vVar.f479117l.iterator();
            while (it7.hasNext()) {
                rm5.j jVar2 = (rm5.j) it7.next();
                if (jVar2.f479033b == 2) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(dq4.c.f323902a.b(jVar2.f479032a));
                    sb7.append('#');
                    sb6.append(sb7.toString());
                }
            }
            c6759x7a5829e7.f140869q = c6759x7a5829e7.b("VideoGOPStr", sb6.toString(), true);
        }
        yo4.p pVar = (yo4.p) this.f428801d.f428803e.j(yo4.p.class);
        if (pVar != null && (c16997xb0aa383a = pVar.f545820r) != null) {
            op4.e eVar3 = this.f428801d;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e73 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) eVar3.f428824d;
            if (c6759x7a5829e73 != null) {
                c6759x7a5829e73.f140873u = c16997xb0aa383a.f237252p;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c16997xb0aa383a.f237261y;
            if (c19792x256d2725 != null) {
                java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(c19792x256d2725.m76784x5db1b11());
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e74 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) eVar3.f428824d;
                if (c6759x7a5829e74 != null) {
                    c6759x7a5829e74.f140872t = c6759x7a5829e74.b("MusicFeedid", r07, true);
                }
            } else if (c6759x7a5829e73 != null) {
                c6759x7a5829e73.f140871s = c16997xb0aa383a.f237244e;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e75 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) this.f428801d.f428824d;
        if (c6759x7a5829e75 != null) {
            c6759x7a5829e75.f140866n = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        op4.e eVar4 = this.f428801d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e76 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) eVar4.f428824d;
        if (c6759x7a5829e76 != null) {
            c6759x7a5829e76.f140863k = j19;
        }
        if (E != null) {
            eVar4.f428804f.f511239b.clear();
            for (zu3.a aVar : E) {
                int ordinal = aVar.f557291a.ordinal();
                java.lang.String str3 = "";
                if (ordinal == 0) {
                    cVar = new uo4.c();
                    zu3.a0 a0Var = aVar instanceof zu3.a0 ? (zu3.a0) aVar : null;
                    if (a0Var != null && (str = a0Var.f557301k) != null) {
                        str3 = str;
                    }
                    com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                    java.lang.String str4 = a18.f294812f;
                    if (str4 != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                        if (!str4.equals(l17)) {
                            a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                        }
                    }
                    java.lang.String str5 = a18.f294812f;
                    int lastIndexOf = str5.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str5 = str5.substring(lastIndexOf + 1);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "getName(...)");
                    cVar.f511213c = str5;
                } else if (ordinal != 5) {
                    cVar = new uo4.b();
                } else {
                    cVar = new uo4.c();
                    zu3.d dVar = aVar instanceof zu3.d ? (zu3.d) aVar : null;
                    if (dVar != null && (str2 = dVar.f557328j) != null) {
                        str3 = str2;
                    }
                    com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                    java.lang.String str6 = a19.f294812f;
                    if (str6 != null) {
                        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                        if (!str6.equals(l18)) {
                            a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l18, a19.f294813g, a19.f294814h);
                        }
                    }
                    java.lang.String str7 = a19.f294812f;
                    int lastIndexOf2 = str7.lastIndexOf("/");
                    if (lastIndexOf2 >= 0) {
                        str7 = str7.substring(lastIndexOf2 + 1);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "getName(...)");
                    cVar.f511213c = str7;
                }
                cVar.f511211a = aVar.f557291a.f557338d;
                java.util.ArrayList arrayList5 = cVar.f511212b;
                bv3.d dVar2 = aVar.f557293c;
                arrayList5.add(java.lang.Long.valueOf(dVar2.c()));
                arrayList5.add(java.lang.Long.valueOf(dVar2.b()));
                eVar4.f428804f.f511239b.add(cVar);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e77 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) eVar4.f428824d;
            if (c6759x7a5829e77 != null) {
                c6759x7a5829e77.f140860h = E.size();
            }
        } else if (c6759x7a5829e76 != null) {
            c6759x7a5829e76.f140860h = 0L;
        }
        yo4.p pVar2 = (yo4.p) this.f428801d.f428803e.j(yo4.p.class);
        long j29 = (pVar2 != null ? pVar2.f545820r : null) != null ? 1L : 0L;
        op4.e eVar5 = this.f428801d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7 c6759x7a5829e78 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7) eVar5.f428824d;
        if (c6759x7a5829e78 != null) {
            c6759x7a5829e78.f140861i = j29;
        }
        if (c6759x7a5829e78 != null) {
            c6759x7a5829e78.f140862j = this.f428802e;
        }
        eVar5.h();
        op4.e eVar6 = this.f428801d;
        eVar6.f428824d = null;
        eVar6.f428824d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6759x7a5829e7();
        eVar6.f428804f = new uo4.h();
        return jz5.f0.f384359a;
    }
}
