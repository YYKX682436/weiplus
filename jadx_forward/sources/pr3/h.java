package pr3;

/* loaded from: classes8.dex */
public final class h extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f439509d = new java.util.ArrayList();

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f439509d;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17++;
            pr3.e eVar = (pr3.e) it.next();
            if (!(eVar instanceof pr3.d)) {
                arrayList.add(eVar);
            } else if (i17 < ((java.util.ArrayList) list).size()) {
                java.util.ListIterator listIterator = ((java.util.ArrayList) list).listIterator(i17);
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    pr3.e eVar2 = (pr3.e) listIterator.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoDataSource", "label child at " + eVar2.i() + ": " + eVar2);
                    if ((eVar2 instanceof pr3.c) && ((pr3.c) eVar2).j()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoDataSource", "has child: " + eVar);
                        arrayList.add(eVar);
                        break;
                    }
                    if (eVar2 instanceof pr3.d) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("meet the next label, no children: ");
                        pr3.d dVar = (pr3.d) eVar;
                        sb6.append(pr3.d.j(dVar, 0, 0, 0, false, 7, null));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoDataSource", sb6.toString());
                        arrayList.add(pr3.d.j(dVar, 0, 0, 0, false, 7, null));
                        break;
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("no visible children: ");
                pr3.d dVar2 = (pr3.d) eVar;
                sb7.append(pr3.d.j(dVar2, 0, 0, 0, false, 7, null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoDataSource", sb7.toString());
                arrayList.add(pr3.d.j(dVar2, 0, 0, 0, false, 7, null));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoDataSource", "no more elements, no children: " + pr3.d.j((pr3.d) eVar, 0, 0, 0, false, 7, null));
            }
        }
        xm3.r0 r0Var = xm3.s0.f536911a;
        return r0Var.a(scope, r0Var.b(arrayList.size(), request, new pr3.g(arrayList)));
    }
}
