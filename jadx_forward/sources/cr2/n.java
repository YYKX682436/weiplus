package cr2;

/* loaded from: classes2.dex */
public final class n extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303402a;

    public n(cr2.x xVar) {
        this.f303402a = xVar;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        cr2.x xVar = this.f303402a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f303434g, "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = xVar.f303428a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            if (((rq2.w) zVar.a(activity).a(rq2.w.class)) != null) {
                in5.c cVar = jVar.f374603a;
                if (cVar instanceof wp2.b) {
                    org.json.JSONObject g17 = cq2.r.f302977a.g(cVar, xVar.f303431d, jVar.f374607e);
                    wp2.b bVar = cVar instanceof wp2.b ? (wp2.b) cVar : null;
                    if (bVar != null) {
                        ml2.d dVar = xVar.f303448u;
                        int i17 = jVar.f374607e;
                        ml2.x1 x1Var = ml2.x1.f409735f;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 fragment = xVar.f303430c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                            str = "";
                        }
                        java.lang.String jSONObject = g17.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                        dVar.h(bVar, i17, x1Var, str, "", jSONObject);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(xVar.f303434g, "handleExposeReport unknown feed:" + cVar);
                }
            }
        }
        sp2.j.f492587a.c(xVar.f303428a, recordsSet, java.lang.Integer.valueOf(xVar.b()));
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        cq2.r rVar = cq2.r.f302977a;
        cr2.x xVar = this.f303402a;
        er2.a aVar = xVar.f303431d;
        int i17 = item.f374607e;
        in5.c cVar = item.f374603a;
        org.json.JSONObject g17 = rVar.g(cVar, aVar, i17);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f491911e = g17;
        }
        sp2.j.f492587a.d(xVar.f303428a, item, g17, java.lang.Integer.valueOf(xVar.b()));
    }
}
