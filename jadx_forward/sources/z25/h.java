package z25;

/* loaded from: classes12.dex */
public class h implements g35.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z25.i f551345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z25.i f551346b;

    public h(z25.i iVar, z25.i iVar2) {
        this.f551346b = iVar;
        this.f551345a = iVar2;
    }

    public void a(boolean z17, int i17, r45.y45 y45Var) {
        z25.e eVar;
        z25.i iVar = this.f551346b;
        iVar.f551352f = false;
        z25.i iVar2 = this.f551345a;
        if (!z17) {
            if (-1 != i17) {
                ((z25.a) iVar.f551355i).a(iVar2, false, i17);
                return;
            } else {
                ((z25.a) iVar.f551355i).a(iVar2, iVar.f551348b < iVar.f551353g, -1);
                return;
            }
        }
        z25.a aVar = (z25.a) iVar.f551355i;
        aVar.f551289y++;
        int i18 = y45Var != null ? y45Var.f472319i : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIFileUploader", "upload section success, index = %s, successCount:%s, partIDLimit:%s", java.lang.Integer.valueOf(iVar2.f551351e.f551341b), java.lang.Integer.valueOf(aVar.f551289y), java.lang.Integer.valueOf(i18));
        java.util.List list = aVar.f551286v;
        list.remove(iVar2);
        int i19 = aVar.f551290z;
        if (i18 <= i19) {
            i18 = i19;
        }
        aVar.f551290z = i18;
        int i27 = aVar.f551288x;
        z25.k kVar = aVar.f551283s;
        if (i27 > 0) {
            float f17 = (aVar.f551289y * 1.0f) / i27;
            z25.g gVar = iVar2.f551351e;
            long j17 = gVar.f551342c + gVar.f551343d;
            z25.d dVar = (z25.d) kVar;
            dVar.getClass();
            int i28 = aVar.f551294d;
            z25.f fVar = dVar.f551310b;
            if (i28 == fVar.f551323a && (eVar = fVar.f551325c) != null) {
                eVar.b(f17, j17);
            }
        }
        int i29 = iVar2.f551351e.f551341b;
        java.util.List list2 = aVar.f551287w;
        if (i29 == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y45Var.f472314d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIFileUploader", "no upload id return!");
                aVar.c();
                if (kVar != null) {
                    ((z25.d) kVar).c(aVar, aVar.f551285u, -30002);
                    return;
                }
                return;
            }
            aVar.f551285u = y45Var.f472314d;
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((z25.i) it.next()).f551349c = y45Var.f472314d;
            }
        }
        if (aVar.d(aVar.f551289y)) {
            if (list2.size() == 1 && list.size() == 0) {
                aVar.e();
            }
            if (list2.size() == 0 && list.size() == 0) {
                z25.j jVar = new z25.j();
                jVar.f551356a = y45Var.f472315e;
                jVar.f551357b = y45Var.f472316f;
                jVar.f551359d = aVar.f551292b;
                aVar.c();
                if (kVar != null) {
                    z25.d dVar2 = (z25.d) kVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIParallelUploadMgr", "upload file success, type = %s, path = %s, aeskey = %s, fileId = %s", java.lang.Integer.valueOf(aVar.f551294d), aVar.f551291a, jVar.f551357b, jVar.f551356a);
                    z25.f fVar2 = dVar2.f551310b;
                    fVar2.f551336n += jVar.f551359d;
                    int i37 = fVar2.f551323a;
                    int i38 = aVar.f551294d;
                    if (i37 == i38) {
                        jVar.f551358c = aVar.f551302l;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        fVar2.f551334l = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(dVar2.f551310b.f551324b);
                        java.lang.Long valueOf2 = java.lang.Long.valueOf(dVar2.f551310b.f551335m);
                        z25.f fVar3 = dVar2.f551310b;
                        g0Var.g(20470, true, true, true, valueOf, valueOf2, java.lang.Long.valueOf(fVar3.f551334l - fVar3.f551333k), 0, java.lang.Long.valueOf(dVar2.f551310b.f551336n));
                        g0Var.A(1431, 1);
                        int i39 = dVar2.f551310b.f551324b;
                        if (i39 == 1) {
                            g0Var.A(1431, 4);
                        } else if (i39 == 2) {
                            g0Var.A(1431, 7);
                        } else if (i39 == 3) {
                            g0Var.A(1431, 10);
                            if (dVar2.f551310b.f551335m > 26214400) {
                                g0Var.A(1431, 13);
                            }
                        }
                        z25.e eVar2 = dVar2.f551310b.f551325c;
                        if (eVar2 != null) {
                            eVar2.c(jVar);
                            return;
                        }
                        return;
                    }
                    if (i38 == 1) {
                        dVar2.f551318j = jVar.f551357b;
                        dVar2.f551317i = jVar.f551356a;
                        dVar2.e(24);
                        return;
                    }
                    if (i38 == 2) {
                        dVar2.f551314f = jVar.f551356a;
                        dVar2.f551315g = jVar.f551357b;
                        if (i37 == 25) {
                            dVar2.e(1);
                            return;
                        } else {
                            dVar2.e(i37);
                            return;
                        }
                    }
                    if (i38 != 3) {
                        if (i38 != 24) {
                            dVar2.e(i37);
                            return;
                        }
                        dVar2.f551319k = jVar.f551356a;
                        dVar2.f551320l = jVar.f551357b;
                        dVar2.e(25);
                        return;
                    }
                    dVar2.f551312d = jVar.f551356a;
                    dVar2.f551313e = jVar.f551357b;
                    if (i37 == 1 || i37 == 24 || i37 == 25) {
                        dVar2.e(2);
                    } else {
                        dVar2.e(i37);
                    }
                }
            }
        }
    }
}
