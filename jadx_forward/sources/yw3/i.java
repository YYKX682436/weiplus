package yw3;

/* loaded from: classes4.dex */
public final class i extends ym3.a {
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(yw3.d.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(yw3.d.class);
        }
        yw3.k kVar = (yw3.k) ((yw3.d) a17).P6(yw3.k.class);
        int i17 = request.f544677b;
        int i18 = request.f544678c;
        p75.i0 i19 = dm.k7.f319578p.i();
        i19.f434189c = "MicroMsg.DemoStorage";
        i19.c(i18, i17);
        java.util.List k17 = i19.a().k(kVar.f274680g.Q4(), yw3.p.class);
        if (!(!k17.isEmpty())) {
            k17 = null;
        }
        if (k17 != null) {
            java.util.ArrayList arrayList = dVar.f544682c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(k17, 10));
            java.util.Iterator it = k17.iterator();
            while (it.hasNext()) {
                arrayList2.add(new yw3.j((yw3.p) it.next()));
            }
            dVar.f544681b = arrayList2.size() > request.f544678c;
            arrayList.addAll(arrayList2);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b17, dVar, null), 1, null);
        return b17;
    }
}
