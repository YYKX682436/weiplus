package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class nt extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt f190131a;

    public nt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar) {
        this.f190131a = ytVar;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTimelineLbsMixPresenter", "onExposeTimeRecorded: size = " + recordsSet.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yt ytVar = this.f190131a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = ytVar.f192730d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
        if (a76 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p5) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : recordsSet) {
                if (((in5.j) obj).f374603a instanceof so2.k) {
                    arrayList.add(obj);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p5 p5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p5) a76;
            long j17 = ytVar.f192736m;
            p5Var.getClass();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                in5.j jVar = (in5.j) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 o90Var = ((so2.k) jVar.f374603a).f491984d.f208526b;
                if (o90Var != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6509xf1fe73b4 c6509xf1fe73b4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6509xf1fe73b4();
                    p5Var.T0(c6509xf1fe73b4);
                    p5Var.S0(c6509xf1fe73b4, o90Var);
                    c6509xf1fe73b4.f138538g = c6509xf1fe73b4.b("refreshTime", pm0.v.u(j17), true);
                    c6509xf1fe73b4.f138539h = 1L;
                    c6509xf1fe73b4.f138541j = jVar.f374607e;
                    long j18 = jVar.f374606d;
                    c6509xf1fe73b4.f138545n = j18;
                    long j19 = jVar.f374604b;
                    c6509xf1fe73b4.f138546o = j19;
                    long j27 = jVar.f374605c;
                    c6509xf1fe73b4.f138547p = j27;
                    c6509xf1fe73b4.f138550s = j18;
                    c6509xf1fe73b4.f138551t = j19;
                    c6509xf1fe73b4.f138552u = j27;
                    int i17 = 0;
                    for (java.lang.Object obj2 : o90Var.f208832b) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2;
                        if (i17 < 3) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6509xf1fe73b4 c6509xf1fe73b42 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6509xf1fe73b4(c6509xf1fe73b4.m());
                            p5Var.U0(c6509xf1fe73b42, abstractC14490x69736cb5);
                            c6509xf1fe73b42.f138549r = i17;
                            c6509xf1fe73b42.k();
                        }
                        i17 = i18;
                    }
                }
            }
        }
    }
}
