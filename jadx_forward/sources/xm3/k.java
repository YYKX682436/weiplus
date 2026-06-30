package xm3;

/* loaded from: classes4.dex */
public final class k implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f536868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.i f536869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xm3.n0 f536870f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe, xm3.i iVar, xm3.n0 n0Var) {
        this.f536868d = c16718x7059cefe;
        this.f536869e = iVar;
        this.f536870f = n0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object j17;
        ym3.d dVar = (ym3.d) obj;
        int i17 = dVar.f544680a.f544676a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f536868d;
        int i18 = c16718x7059cefe.f233606w.get();
        jz5.f0 f0Var = jz5.f0.f384359a;
        ym3.c cVar = dVar.f544680a;
        if (i17 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16718x7059cefe.c(), "create getData not same loadId current:" + c16718x7059cefe.f233606w.get() + " resp:" + cVar.f544676a);
            return f0Var;
        }
        java.lang.String c17 = c16718x7059cefe.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getData continueFlag:");
        sb6.append(dVar.f544681b);
        sb6.append(" size:");
        java.util.ArrayList arrayList = dVar.f544682c;
        sb6.append(arrayList.size());
        sb6.append(" offset:");
        java.util.ArrayList arrayList2 = c16718x7059cefe.f233599p;
        sb6.append(arrayList2.size());
        sb6.append(" loadId:");
        sb6.append(cVar.f544676a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17, sb6.toString());
        c16718x7059cefe.f233595i = dVar.f544681b;
        if (dVar.f544684e) {
            arrayList2.addAll(arrayList);
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xm3.d dVar2 = (xm3.d) it.next();
                if (!arrayList2.contains(dVar2)) {
                    arrayList2.add(dVar2);
                }
            }
        }
        c16718x7059cefe.k(false);
        c16718x7059cefe.l(this.f536869e, false);
        c16718x7059cefe.h(new ym3.o(ym3.p.f544712d, dVar), 0);
        return (c16718x7059cefe.f233595i && this.f536870f.a() && (j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.j(this.f536868d, cVar.f544676a, dVar.f544683d, 0, null, interfaceC29045xdcb5ca57, 12, null)) == pz5.a.f440719d) ? j17 : f0Var;
    }
}
