package zc4;

/* loaded from: classes4.dex */
public final class e extends ym3.a {
    @Override // ym3.a, ym3.f
    public /* bridge */ /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i iVar, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = a(iVar, (ym3.c) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        return a17;
    }

    @Override // ym3.a
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        java.util.List<xc4.p> c76 = gVar.c7(request);
        if (!(!c76.isEmpty())) {
            c76 = null;
        }
        if (c76 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", "=====request db data start key:" + request.f544679d + "=====");
            for (xc4.p pVar : c76) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", java.lang.String.valueOf(pVar));
                java.util.Iterator it = dVar.f544682c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((zc4.b) obj2).n().y0() == pVar.y0() && pVar.y0() != 0) {
                        break;
                    }
                }
                if (obj2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.DataFlow", "sth. error,delete " + pVar);
                    gVar.R6(pVar, false, true);
                } else {
                    dVar.f544682c.add(new zc4.b(pVar, false, 2, null));
                }
            }
            dVar.f544681b = true;
            java.util.ArrayList arrayList = dVar.f544682c;
            java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (!((zc4.b) obj).n().mo133058x3172ed()) {
                    break;
                }
            }
            zc4.b bVar = (zc4.b) obj;
            if (bVar == null) {
                bVar = (zc4.b) kz5.n0.i0(dVar.f544682c);
            }
            dVar.f544683d = bVar.n().m125481xf4250fd8();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataFlow", "=====request db data finish key:" + dVar.f544683d + "=====");
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b17, dVar, null), 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getData", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveListDataSource");
        return b17;
    }
}
