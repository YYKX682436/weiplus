package p02;

/* loaded from: classes8.dex */
public class k implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04 f431935e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04 activityC13238xdcc40f04, java.lang.String str) {
        this.f431935e = activityC13238xdcc40f04;
        this.f431934d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c02.k kVar;
        d02.c cVar;
        d02.c cVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchUI", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.ActivityC13238xdcc40f04 activityC13238xdcc40f04 = this.f431935e;
        if (!activityC13238xdcc40f04.f178883i && !activityC13238xdcc40f04.isFinishing()) {
            activityC13238xdcc40f04.f178879e.setVisibility(8);
            if (i17 == 0 && i18 == 0) {
                c02.s sVar = (c02.s) oVar.f152244b.f152233a;
                java.lang.String str2 = this.f431934d;
                if (sVar == null || (kVar = sVar.f119158e) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(kVar.f119137d)) {
                    activityC13238xdcc40f04.f178878d.setVisibility(8);
                    activityC13238xdcc40f04.f178880f.setVisibility(0);
                    activityC13238xdcc40f04.f178880f.setText(activityC13238xdcc40f04.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsl, str2));
                    o02.a.b(13, 1304, 0, 1, "", "", "");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = sVar.f119158e.f119137d.iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        c02.j jVar = (c02.j) it.next();
                        p02.l lVar = null;
                        if (jVar != null) {
                            p02.l lVar2 = new p02.l();
                            lVar2.f431936a = 3;
                            c02.e eVar = jVar.f119135d;
                            if (eVar != null) {
                                d02.k kVar2 = eVar.f119125d;
                                c02.d dVar = eVar.f119127f;
                                if (dVar != null) {
                                    lVar2.f431944i = dVar.f119124d;
                                }
                                if (kVar2 != null) {
                                    d02.d dVar2 = kVar2.f306861d;
                                    d02.e eVar2 = kVar2.f306862e;
                                    d02.g gVar = kVar2.f306863f;
                                    if (dVar2 != null && dVar2.f306834i == 0) {
                                        lVar2.f431939d = dVar2.f306829d;
                                        lVar2.f431940e = jVar.f119136e;
                                        lVar2.f431941f = dVar2.f306831f;
                                        lVar2.f431952q = dVar2.f306833h;
                                        if (eVar2 != null) {
                                            java.util.LinkedList linkedList = eVar2.f306838e;
                                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                                                lVar2.f431942g = linkedList;
                                            }
                                        }
                                        if (gVar != null && (cVar2 = gVar.f306846d) != null) {
                                            lVar2.f431953r = cVar2.f306810e;
                                            lVar2.f431943h = cVar2.f306811f;
                                        }
                                        lVar2.f431937b = str2;
                                        lVar2.f431938c = 1;
                                        if (gVar != null && (cVar = gVar.f306846d) != null) {
                                            android.content.pm.PackageInfo a17 = ik1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, cVar.f306810e);
                                            h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(lVar2.f431939d);
                                            if (a17 == null) {
                                                if (d17 != null && d17.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966)) {
                                                    lVar2.f431938c = 4;
                                                }
                                            } else if (a17.versionCode < gVar.f306846d.f306814i) {
                                                lVar2.f431938c = 3;
                                            } else {
                                                lVar2.f431938c = 2;
                                            }
                                            d02.c cVar3 = gVar.f306846d;
                                            lVar2.f431946k = cVar3.f306824v;
                                            lVar2.f431947l = cVar3.f306827y;
                                            lVar2.f431948m = cVar3.f306821s;
                                            lVar2.f431949n = cVar3.f306825w;
                                            lVar2.f431950o = cVar3.f306826x;
                                            lVar2.f431951p = cVar3.A;
                                        }
                                        lVar = lVar2;
                                    }
                                }
                            }
                        }
                        if (lVar != null) {
                            i19++;
                            lVar.f431945j = i19;
                            arrayList.add(lVar);
                        }
                    }
                    activityC13238xdcc40f04.f178880f.setVisibility(8);
                    activityC13238xdcc40f04.f178878d.q1(arrayList);
                    o02.a.b(13, 1303, 0, 1, "", "", "");
                }
            }
        }
        return 0;
    }
}
